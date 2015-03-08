package org.processus.leekwars.impl;

import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.client.util.StringContentProvider;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpMethod;
import org.eclipse.jetty.util.HttpCookieStore;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.eclipse.jetty.websocket.client.WebSocketClient;
import org.processus.leekwars.IAccount;
import org.processus.leekwars.IAccountListener;
import org.processus.leekwars.IEditor;
import org.processus.leekwars.ILeek;

public class Account extends AbstractUpdatable implements IAccount {

	@WebSocket(maxTextMessageSize = 64 * 1024)
	public final class AccountSocket {

		@OnWebSocketMessage
		public void onMessage(String message) {
			System.out.printf("Got msg: %s%n", message);

			final List<IAccountListener> listeners;
			synchronized (Account.this.listeners) {
				listeners = new ArrayList<IAccountListener>(
						Account.this.listeners);
			}
			for (IAccountListener listener : listeners) {
				listener.message(message);
			}
		}

		@OnWebSocketError
		public void onError(Throwable e) {
			System.err.printf("Error: %s%n", e.getMessage());
		}

	}

	private final static Pattern LEEKS_PATTERN = Pattern
			.compile("<a href='/leek/([0-9]+)'>\\s*<div class='tab (selected)? leek' leek='[0-9]+'>\\s*<span class='leek-square' style='background: #C1E424'></span>\\s*<span class='name'>([^<]+)</span>");

	public final static Pattern TOKEN_PATTERN = Pattern
			.compile("var\\s+__TOKEN\\s+=\\s+'([^']+)';");

	public final static String INDEX_URL = "http://leekwars.com/index.php";

	private final static String WEB_SOCKET_URI = "ws://ws.leekwars.com:1213/";

	private final static String LOGIN_URL = "http://leekwars.com/login";

	private final static String AGENT = "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:35.0) Gecko/20100101 Firefox/35.0";

	private final static String LOGIN_PARAMETER = "login";

	private final static String PASSWORD_PARAMETER = "pass";

	private final static String TOKEN_PARAMETER = "token";

	public final static String PAGE_PARAMETER = "page";

	private final static String LOGIN_FORM_PAGE = "login_form";

	public final static String FARMER_UPDATE_PAGE = "farmer_update";

	private static final String FARMER_ID = "farmer_id";

	private final int id;

	private final String name;

	private final Editor editor;

	private final Map<String, ILeek> leeks = new LinkedHashMap<String, ILeek>();

	private final List<IAccountListener> listeners = new ArrayList<IAccountListener>();

	private final WebSocketClient webSocketclient = new WebSocketClient();

	private String token;

	public Account(String login, String password) {
		super(new HttpClient());
		final HttpCookieStore cookieStore = new HttpCookieStore();
		getHttpClient().setCookieStore(cookieStore);
		try {
			getHttpClient().start();
			Request request = getHttpClient().newRequest(
					INDEX_URL + "?" + PAGE_PARAMETER + "=" + LOGIN_FORM_PAGE);

			request.method(HttpMethod.POST);
			request.agent(AGENT);
			request.getHeaders().put(HttpHeader.ACCEPT, "*/*");
			request.getHeaders().put(HttpHeader.ACCEPT_LANGUAGE,
					"fr,fr-fr;q=0.8,en-us;q=0.5,en;q=0.3");
			request.getHeaders().put(HttpHeader.ACCEPT_ENCODING,
					"gzip, deflate");
			request.getHeaders().put(HttpHeader.CONTENT_TYPE,
					"application/x-www-form-urlencoded; charset=UTF-8");
			request.getHeaders().put("X-Requested-With", "XMLHttpRequest");
			request.getHeaders().put(HttpHeader.REFERER, LOGIN_URL);
			request.getHeaders().put(HttpHeader.CONTENT_LENGTH, "30");
			request.getHeaders().put(HttpHeader.CONNECTION, "keep-alive");
			request.getHeaders().put(HttpHeader.PRAGMA, "no-cache");
			request.getHeaders().put(HttpHeader.CACHE_CONTROL, "no-cache");
			request.content(new StringContentProvider(LOGIN_PARAMETER + "="
					+ login + "&" + PASSWORD_PARAMETER + "=" + password + "&"
					+ TOKEN_PARAMETER + "="));
			request.send();
			webSocketclient.setCookieStore(cookieStore);
			webSocketclient.start();
			webSocketclient.connect(new AccountSocket(),
					URI.create(WEB_SOCKET_URI));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		id = getFarmerID(getHttpClient());
		name = login;
		editor = new Editor(getHttpClient());
	}

	private int getFarmerID(HttpClient httpClient) {
		int res = 0;
		for (HttpCookie cookie : httpClient.getCookieStore().getCookies()) {
			if (FARMER_ID.equals(cookie.getName())) {
				res = Integer.valueOf(cookie.getValue()).intValue();
				break;
			}
		}
		return res;
	}

	public void disconnect() {
		try {
			// TODO logout ?
			getHttpClient().stop();
			webSocketclient.stop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public Set<ILeek> getLeeks() {
		updateAccount(getContent());
		return new LinkedHashSet<ILeek>(leeks.values());
	}

	public ILeek getLeek(String name) {
		updateAccount(getContent());
		return leeks.get(name);
	}

	private void updateAccount(String content) {
		final Matcher leeksMatcher = LEEKS_PATTERN.matcher(content);
		while (leeksMatcher.find()) {
			final int id = Integer.valueOf(leeksMatcher.group(1)).intValue();
			final String name = leeksMatcher.group(3);
			if (!leeks.containsKey(name)) {
				leeks.put(name, new Leek(getHttpClient(), editor, id, name));
			}
		}
		final Matcher tokenMatcher = TOKEN_PATTERN.matcher(content);
		if (tokenMatcher.find()) {
			token = tokenMatcher.group(1);
		}
	}

	public IEditor getEditor() {
		return editor;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Account && id == ((Account) obj).id;
	}

	@Override
	public String toString() {
		return "Account(" + id + "): " + name;
	}

	public boolean addAccountListener(IAccountListener listener) {
		final boolean res;

		synchronized (listeners) {
			res = listeners.add(listener);
		}

		return res;
	}

	public boolean removeAccountListener(IAccountListener listener) {
		final boolean res;

		synchronized (listeners) {
			res = listeners.remove(listener);
		}

		return res;
	}

	protected String getContent() {
		return super.getContent(INDEX_URL);
	}

}
