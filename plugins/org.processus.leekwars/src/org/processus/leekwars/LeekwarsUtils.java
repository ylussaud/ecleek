package org.processus.leekwars;

import org.processus.leekwars.impl.Account;

public final class LeekwarsUtils {

	
	private LeekwarsUtils() {
		
	}
	
	public static IAccount getAccount(String login, String password) {
		return new Account(login, password);
	}
	

}
