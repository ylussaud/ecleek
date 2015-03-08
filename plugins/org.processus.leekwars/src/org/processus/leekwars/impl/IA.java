package org.processus.leekwars.impl;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.client.util.StringContentProvider;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpMethod;
import org.eclipse.jetty.util.UrlEncoded;
import org.processus.leekwars.IIA;

public class IA implements IIA {

	private static final String EDITOR_UPDATE_URL = "http://leekwars.com/editor_update";

	private final static String EDITOR_UPDATE_PAGE = "editor_update";

	private final Editor editor;

	private final int id;

	private String name;

	public IA(Editor editor, int id, String name) {
		this.editor = editor;
		this.id = id;
		this.name = name;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!this.name.equals(name)) {
			// TODO Auto-generated method stub
			this.name = name;
		}
	}

	public String getContent() {
		Request request = editor.getHttpClient().newRequest(EDITOR_UPDATE_URL);
		request.method(HttpMethod.POST);
		request.getHeaders()
				.add(HttpHeader.ACCEPT,
						"text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		request.getHeaders().add(HttpHeader.ACCEPT_ENCODING, "gzip, deflate");
		request.getHeaders().add(HttpHeader.REFERER, Editor.EDITOR_URL);
		request.getHeaders().add(HttpHeader.CONTENT_TYPE,
				"application/x-www-form-urlencoded");
		request.getHeaders().add(HttpHeader.CONTENT_LENGTH, "45");
		request.content(new StringContentProvider("export_ai=true&id=" + id
				+ "&token=" + editor.getToken()));
		ContentResponse response;
		try {
			response = request.send();
			return response.getContentAsString();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void setContents(String content) {
		Request request = editor.getHttpClient().newRequest(
				Account.INDEX_URL + "?" + Account.PAGE_PARAMETER + "="
						+ EDITOR_UPDATE_PAGE);
		request.method(HttpMethod.POST);
		request.getHeaders().add(HttpHeader.ACCEPT, "*/*");
		request.getHeaders().add(HttpHeader.ACCEPT_LANGUAGE,
				"fr,fr-FR;q=0.8,en-US;q=0.5,en;q=0.3");
		request.getHeaders().add(HttpHeader.ACCEPT_ENCODING,
				"gzip, deflate");
		request.getHeaders().add(HttpHeader.CONTENT_TYPE,
				"application/x-www-form-urlencoded; charset=UTF-8");
		request.getHeaders().add("X-Requested-With", "XMLHttpRequest");
		request.getHeaders().add(HttpHeader.REFERER, Editor.EDITOR_URL);
		request.getHeaders().add(HttpHeader.CONNECTION, "keep-alive");
		request.getHeaders().add(HttpHeader.PRAGMA, "no-cache");
		request.getHeaders().add(HttpHeader.CACHE_CONTROL, "no-cache");
		request.content(new StringContentProvider("id=" + id
				+ "compile=true&code=" + UrlEncoded.encodeString(content)
				+ "&token=" + editor.getToken()));
		try {
			ContentResponse response = request.send();
			System.out.println(response.getContentAsString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof IA && id == ((IA) obj).id;
	}

	@Override
	public String toString() {
		return "IA(" + id + "): " + name;
	}

}
