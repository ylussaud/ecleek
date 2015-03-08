package org.processus.leekwars.impl;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.Request;
import org.eclipse.jetty.client.util.StringContentProvider;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.http.HttpMethod;
import org.processus.leekwars.Chip;
import org.processus.leekwars.IEditor;
import org.processus.leekwars.IIA;
import org.processus.leekwars.ILeek;
import org.processus.leekwars.Weapon;

public class Leek extends AbstractUpdatable implements ILeek {

	private static final String LEEK_URI = "http://leekwars.com/leek/";

	private final static String LEEK_UPDATE_PAGE = "leek_update";

	private static final Pattern IA_PATTERN = Pattern
			.compile("<div id='leekai-solo' class='ai  available' ai='([0-9]+)'>[^<]+</div>");

	private static final Pattern LEVEL_PATTERN = Pattern
			.compile("<h2>(Niveau|Level) ([0-9]+)</h2>");

	private static final Pattern NUMBER_OF_CORE_PATTERN = Pattern
			.compile("<span id='cores'>([0-9]+)</span>");

	private static final Pattern WEAPONS_PATTERN = Pattern
			.compile("<div id='weapon[0-9]+' weapon='[0-9]+' class='weapon'><img src='http://leekwars.com/static/image/weapon/[^']+'></img><div class='tooltip' id='tt_weapon[0-9]+'><b>[^<]+</b><br />Niveau [0-9]+<br /><span class='small'>([^<]+)</span></div></div>");

	private static final Pattern CHIPS_PATTERN = Pattern
			.compile("<div id='leekchip[^']+' chip='[^']+' class='chip available'><img title='[^']+' src='http://leekwars.com/static/image/chip/[^']+'></img><div class='tooltip' id='tt_leekchip[^']+'><b>[^<]+</b><br />Niveau [^<]+<br /><span class='small'>([^<]+)</span></div></div>");

	private static final Pattern IN_TOURNEMENT_PATTERN = Pattern
			.compile("var __TOURNAMENT_REGISTERED = (true|false);");

	private static final Pattern MONEY_PATTERN = Pattern
			.compile("var __FARMER_MONEY = ([0-9]+);");

	private static final Pattern CRYSTALS_PATTERN = Pattern
			.compile("var __FARMER_CRYSTALS = ([0-9]+);");

	private static final Pattern IN_GARDEN_PATTERN = Pattern
			.compile("var __IN_GARDEN = (0|1);");

	private final int id;

	private final String name;

	private final IEditor editor;

	private IIA ia;

	private int level;

	private int numberOfCore;

	private final Set<Weapon> weapons = new LinkedHashSet<Weapon>();

	private final Set<Chip> chips = new LinkedHashSet<Chip>();

	private String token;

	private boolean inTournement;

	private boolean inGarden;
	
	private int money;
	
	private int crystals;

	public Leek(HttpClient client, IEditor editor, int id, String name) {
		super(client);
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

	private void updateLeek(String content) {
		final Matcher iaMatcher = IA_PATTERN.matcher(content);
		if (iaMatcher.find()) {
			ia = editor.getIA(Integer.valueOf(iaMatcher.group(1)).intValue());
		}
		final Matcher levelMatcher = LEVEL_PATTERN.matcher(content);
		if (levelMatcher.find()) {
			level = Integer.valueOf(levelMatcher.group(2)).intValue();
		}
		final Matcher numberOfCoreMatcher = NUMBER_OF_CORE_PATTERN
				.matcher(content);
		if (numberOfCoreMatcher.find()) {
			numberOfCore = Integer.valueOf(numberOfCoreMatcher.group(1))
					.intValue();
		}
		weapons.clear();
		final Matcher weaponsMatcher = WEAPONS_PATTERN.matcher(content);
		while (weaponsMatcher.find()) {
			weapons.add(Weapon.valueOf(weaponsMatcher.group(1)));
		}
		chips.clear();
		final Matcher chipsMatcher = CHIPS_PATTERN.matcher(content);
		while (chipsMatcher.find()) {
			chips.add(Chip.valueOf(chipsMatcher.group(1)));
		}
		final Matcher tokenMatcher = Account.TOKEN_PATTERN.matcher(content);
		if (tokenMatcher.find()) {
			token = tokenMatcher.group(1);
		}
		final Matcher inTournementMatcher = IN_TOURNEMENT_PATTERN
				.matcher(content);
		if (inTournementMatcher.find()) {
			inTournement = Boolean.valueOf(inTournementMatcher.group(1))
					.booleanValue();
		}
		final Matcher inGardenMatcher = IN_GARDEN_PATTERN
				.matcher(content);
		if (inGardenMatcher.find()) {
			inGarden = "1".equals(inGardenMatcher.group(1));
		}
		final Matcher moneyMatcher = MONEY_PATTERN
				.matcher(content);
		if (moneyMatcher.find()) {
			money = Integer.valueOf(moneyMatcher.group(1)).intValue();
		}
		final Matcher crystalsMatcher = CRYSTALS_PATTERN
				.matcher(content);
		if (crystalsMatcher.find()) {
			crystals = Integer.valueOf(crystalsMatcher.group(1)).intValue();
		}
	}

	public IIA getAI() {
		updateLeek(getContent(LEEK_URI + id));
		return ia;
	}

	public int getLevel() {
		updateLeek(getContent(LEEK_URI + id));
		return level;
	}

	public int getNumberOfCore() {
		updateLeek(getContent(LEEK_URI + id));
		return numberOfCore;
	}

	public Set<Weapon> getWeapons() {
		updateLeek(getContent(LEEK_URI + id));
		return weapons;
	}

	public Set<Chip> getChips() {
		updateLeek(getContent(LEEK_URI + id));
		return chips;
	}

	public boolean inTournement() {
		updateLeek(getContent(LEEK_URI + id));
		return inTournement;
	}

	public void setInTournement(boolean inTournement) {
		if (this.inTournement != inTournement) {
			final String command;
			if (inTournement) {
				command = "join";
			} else {
				command = "quit";
			}
			Request request = getHttpClient().newRequest(
					Account.INDEX_URL + "false?" + Account.PAGE_PARAMETER + "="
							+ LEEK_UPDATE_PAGE);
			request.method(HttpMethod.POST);
			request.getHeaders().add(HttpHeader.ACCEPT, "*/*");
			request.getHeaders().add(HttpHeader.ACCEPT_LANGUAGE,
					"fr,fr-FR;q=0.8,en-US;q=0.5,en;q=0.3");
			request.getHeaders().add(HttpHeader.ACCEPT_ENCODING,
					"gzip, deflate");
			request.getHeaders().add(HttpHeader.CONTENT_TYPE,
					"application/x-www-form-urlencoded; charset=UTF-8");
			request.getHeaders().add("X-Requested-With", "XMLHttpRequest");
			request.getHeaders()
					.add(HttpHeader.REFERER, "http://leekwars.com/");
			request.getHeaders().add(HttpHeader.CONNECTION, "keep-alive");
			request.getHeaders().add(HttpHeader.PRAGMA, "no-cache");
			request.getHeaders().add(HttpHeader.CACHE_CONTROL, "no-cache");
			request.content(new StringContentProvider("id=" + id + "&"
					+ command + "_tournament=true&token=" + token));
			try {
				request.send();
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
			this.inTournement = inTournement;
		}
	}

	public boolean inGarden() {
		updateLeek(getContent(LEEK_URI + id));
		return inGarden;
	}


	public int getMoney() {
		updateLeek(getContent(LEEK_URI + id));
		return money;
	}
	
	public int getCrystals() {
		updateLeek(getContent(LEEK_URI + id));
		return crystals;
	}
	
	public void setInGarden(boolean inGarden) {
		if (this.inGarden != inGarden) {
			Request request = getHttpClient().newRequest(
					Account.INDEX_URL + "?" + Account.PAGE_PARAMETER + "="
							+ Account.FARMER_UPDATE_PAGE);
			request.method(HttpMethod.POST);
			request.getHeaders().add(HttpHeader.ACCEPT_ENCODING,
					"gzip, deflate");
			request.getHeaders().add(HttpHeader.ACCEPT, "*/*");
			request.getHeaders().add(HttpHeader.ACCEPT_LANGUAGE,
					"fr,fr-FR;q=0.8,en-US;q=0.5,en;q=0.3");
			request.getHeaders().add(HttpHeader.CONTENT_TYPE,
					"application/x-www-form-urlencoded; charset=UTF-8");
			request.getHeaders().add("X-Requested-With", "XMLHttpRequest");
			request.getHeaders().add(HttpHeader.REFERER,
					"http://leekwars.com/leek/" + id);
			request.getHeaders().add(HttpHeader.CONNECTION, "keep-alive");
			request.getHeaders().add(HttpHeader.PRAGMA, "no-cache");
			request.getHeaders().add(HttpHeader.CACHE_CONTROL, "no-cache");
			request.content(new StringContentProvider("id=" + id + "&"
					+ "in_garden=" + inGarden + "&token=" + token));
			try {
				request.send();
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
			this.inGarden = inGarden;
		}
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		return obj instanceof Leek && id == ((Leek) obj).id;
	}

	@Override
	public String toString() {
		return "Leek(" + id + "): " + name;
	}
}
