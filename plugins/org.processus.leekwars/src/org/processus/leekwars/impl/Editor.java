package org.processus.leekwars.impl;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jetty.client.HttpClient;
import org.processus.leekwars.IEditor;
import org.processus.leekwars.IIA;

public class Editor extends AbstractUpdatable implements IEditor {

	public static final String EDITOR_URL = "http://leekwars.com/editor";

	private static final Pattern IAS_PATTERN = Pattern
			.compile("<option id='([0-9]+)'>([^<]+)</option>");

	private final Map<Integer, IIA> ias = new LinkedHashMap<Integer, IIA>();

	private String token;
	
	public Editor(HttpClient client) {
		super(client);
	}

	public Set<IIA> getAIs() {
		updateEditor(getContent(EDITOR_URL));
		return new LinkedHashSet<IIA>(ias.values());
	}

	public IIA getIA(int id) {
		updateEditor(getContent(EDITOR_URL));
		return ias.get(Integer.valueOf(id));
	}

	private void updateEditor(String content) {
		final Matcher matcher = IAS_PATTERN.matcher(content);
		ias.clear();
		while (matcher.find()) {
			final int id = Integer.valueOf(matcher.group(1)).intValue();
			final String name = matcher.group(2);
			ias.put(Integer.valueOf(id), new IA(this, id, name));
		}
		Matcher tokenMatcher = Account.TOKEN_PATTERN.matcher(content);
		if (tokenMatcher.find()) {
			token = tokenMatcher.group(1);
		}
	}

	public String getToken() {
		updateEditor(getContent(EDITOR_URL));
		return token;
	}
	
}
