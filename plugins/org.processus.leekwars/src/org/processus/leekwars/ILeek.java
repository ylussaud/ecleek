package org.processus.leekwars;

import java.util.Set;

public interface ILeek {

	int getID();

	String getName();

	IIA getAI();

	int getLevel();

	int getNumberOfCore();

	Set<Weapon> getWeapons();

	Set<Chip> getChips();

	boolean inTournement();
	
	void setInTournement(boolean inTournement);
	
	boolean inGarden();
	
	void setInGarden(boolean inGarden);
	
	
	int getMoney();
	
	int getCrystals();
	
}
