package org.processus.leekwars;

import java.util.Set;

public interface IAccount {

	String getName();

	Set<ILeek> getLeeks();

	ILeek getLeek(String name);

	IEditor getEditor();

	boolean addAccountListener(IAccountListener listener);
	
	boolean removeAccountListener(IAccountListener listener);
	
	void disconnect();
}
