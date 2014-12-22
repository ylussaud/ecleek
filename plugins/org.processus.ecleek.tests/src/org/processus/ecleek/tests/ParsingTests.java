package org.processus.ecleek.tests;

import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.junit.Test;
import org.processus.ecleek.LeekStandaloneSetup;
import org.processus.ecleek.leek.GlobalDeclaration;
import org.processus.ecleek.leek.Script;

public class ParsingTests extends AbstractXtextTests {

	@Override
	public void setUp() throws Exception {
		super.setUp();
		with(new LeekStandaloneSetup());
	}

	@Test
	public void globalDeclarationSingleNoValue() throws Exception {
		final Script script = getScript("global aGlobal;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertEquals(null, global.getVariables().get(0).getValue());
	}

	protected Script getScript(String string) throws Exception {
		Script res = (Script) getModel(string);
		return res;
	}

}
