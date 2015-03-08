package org.processus.leekwars.impl;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;

public abstract class AbstractUpdatable {

	private final HttpClient client;

	private final long delais;

	private String pageContent;

	private long timeStamp;

	public AbstractUpdatable(HttpClient client) {
		this(client, 500);
	}

	public AbstractUpdatable(HttpClient client, long delais) {
		this.client = client;
		this.delais = delais;
	}

	protected void update(String url) {
		if (System.currentTimeMillis() > timeStamp + delais) {
			ContentResponse response;
			try {
				response = client.GET(url);
				if (response.getStatus() == 200) {
					pageContent = response.getContentAsString();
					timeStamp = System.currentTimeMillis();
				}
			} catch (InterruptedException  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch ( ExecutionException
					 e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch ( TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	protected String getContent(String url) {
		update(url);
		return pageContent;
	}

	protected HttpClient getHttpClient() {
		return client;
	}

}
