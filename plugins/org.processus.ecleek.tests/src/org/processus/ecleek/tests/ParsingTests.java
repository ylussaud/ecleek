package org.processus.ecleek.tests;

import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.junit.Test;
import org.processus.ecleek.LeekStandaloneSetup;
import org.processus.ecleek.leek.GlobalDeclaration;
import org.processus.ecleek.leek.IntLiteral;
import org.processus.ecleek.leek.LocalDeclaration;
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

	@Test
	public void globalDeclarationSingleValue() throws Exception {
		final Script script = getScript("global aGlobal = 1;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof IntLiteral);
		assertEquals(1,((IntLiteral)global.getVariables().get(0).getValue()).getValue());
	}

	@Test
	public void globalDeclarationNoValue() throws Exception {
		final Script script = getScript("global aGlobal, anotherGlobal;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(2, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertEquals(null, global.getVariables().get(0).getValue());
		assertEquals("anotherGlobal", global.getVariables().get(1).getName());
		assertEquals(null, global.getVariables().get(1).getValue());
	}

	@Test
	public void globalDeclarationValue() throws Exception {
		final Script script = getScript("global aGlobal = 1, anotherGlobal = 2;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(2, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof IntLiteral);
		assertEquals(1,((IntLiteral)global.getVariables().get(0).getValue()).getValue());
		assertEquals("anotherGlobal", global.getVariables().get(1).getName());
		assertTrue(global.getVariables().get(1).getValue() instanceof IntLiteral);
		assertEquals(2,((IntLiteral)global.getVariables().get(1).getValue()).getValue());
	}

	@Test
	public void localDeclarationSingleNoValue() throws Exception {
		final Script script = getScript("var aGlobal;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration global = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertEquals(null, global.getVariables().get(0).getValue());
	}

	@Test
	public void localDeclarationSingleValue() throws Exception {
		final Script script = getScript("var aGlobal = 1;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration global = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof IntLiteral);
		assertEquals(1,((IntLiteral)global.getVariables().get(0).getValue()).getValue());
	}

	@Test
	public void localDeclarationNoValue() throws Exception {
		final Script script = getScript("var aGlobal, anotherGlobal;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration global = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(2, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertEquals(null, global.getVariables().get(0).getValue());
		assertEquals("anotherGlobal", global.getVariables().get(1).getName());
		assertEquals(null, global.getVariables().get(1).getValue());
	}

	@Test
	public void localDeclarationValue() throws Exception {
		final Script script = getScript("var aGlobal = 1, anotherGlobal = 2;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration global = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(2, global.getVariables().size());
		assertEquals("aGlobal", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof IntLiteral);
		assertEquals(1,((IntLiteral)global.getVariables().get(0).getValue()).getValue());
		assertEquals("anotherGlobal", global.getVariables().get(1).getName());
		assertTrue(global.getVariables().get(1).getValue() instanceof IntLiteral);
		assertEquals(2,((IntLiteral)global.getVariables().get(1).getValue()).getValue());
	}

	protected Script getScript(String string) throws Exception {
		Script res = (Script) getModel(string);
		return res;
	}

}
