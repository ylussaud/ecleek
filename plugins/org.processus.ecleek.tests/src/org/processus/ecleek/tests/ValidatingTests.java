package org.processus.ecleek.tests;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.junit.Ignore;
import org.junit.Test;
import org.processus.ecleek.LeekStandaloneSetup;
import org.processus.ecleek.leek.Script;

public class ValidatingTests extends AbstractXtextTests {

	@Override
	public void setUp() throws Exception {
		super.setUp();
		with(new LeekStandaloneSetup());
	}

	protected Script getScript(String string) throws Exception {
		Script res = (Script) getModel(string);
		return res;
	}

	@Test
	public void checkReturnStatementIsInFunctionDeclarationNotInFunction() throws Exception {
		final Script script = getScript("return 1;");

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(script);
		assertEquals(1, diagnostic.getChildren().size());
		assertDiagnostic(diagnostic.getChildren().get(0),Diagnostic.ERROR, "ReturnStatement must be in a FunctionDeclaration");
	}

	@Test
	public void checkReturnStatementIsInFunctionDeclarationInFunction() throws Exception {
		final Script script = getScript("function f() {return 1;}");

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(script);
		assertEquals(0, diagnostic.getChildren().size());
	}

	@Test
	public void checkReturnStatementIsInFunctionDeclarationInFunctionNested() throws Exception {
		final Script script = getScript("function f() {if (true) {return 1;}}");

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(script);
		assertEquals(0, diagnostic.getChildren().size());
	}

	
	@Test
	public void checkBreakStatementIsInLoopNotInLoop() throws Exception {
		final Script script = getScript("break;");

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(script);
		assertEquals(1, diagnostic.getChildren().size());
		assertDiagnostic(diagnostic.getChildren().get(0),Diagnostic.ERROR, "BreakStatement must be in a For or a While");
	}

	@Test
	public void checkBreakStatementIsInLoopInWhile() throws Exception {
		final Script script = getScript("while(true) {break;}");

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(script);
		assertEquals(0, diagnostic.getChildren().size());
	}

	@Test
	public void checkBreakStatementIsInLoopInWhileNested() throws Exception {
		final Script script = getScript("while(true) {if(true){break;}}");

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(script);
		assertEquals(0, diagnostic.getChildren().size());
	}

	@Test
	@Ignore
	public void checkBreakStatementIsInLoopInFor() throws Exception {
		fail("Not implemented yet.");
	}

	@Test
	@Ignore
	public void checkBreakStatementIsInLoopInForNested() throws Exception {
		fail("Not implemented yet.");
	}

	@Test
	public void checkContinueStatementIsInLoopNotInLoop() throws Exception {
		final Script script = getScript("continue;");

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(script);
		assertEquals(1, diagnostic.getChildren().size());
		assertDiagnostic(diagnostic.getChildren().get(0),Diagnostic.ERROR, "ContinueStatement must be in a For or a While");
	}

	@Test
	public void checkContinueStatementIsInLoopNotInWhile() throws Exception {
		final Script script = getScript("while(true){continue;}");

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(script);
		assertEquals(0, diagnostic.getChildren().size());
	}

	@Test
	public void checkContinueStatementIsInLoopNotInWhileNested() throws Exception {
		final Script script = getScript("while(true){if(true){continue;}}");

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(script);
		assertEquals(0, diagnostic.getChildren().size());
	}

	@Test
	@Ignore
	public void checkContinueStatementIsInLoopNotInFor() throws Exception {
		fail("Not implemented yet.");
	}

	@Test
	@Ignore
	public void checkContinueStatementIsInLoopNotInForNested() throws Exception {
		fail("Not implemented yet.");
	}

	@Test
	public void checkIncludeIsInScript() throws Exception {
		final Script script = getScript("function f() {include(\"a\");}");

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(script);
		assertEquals(1, diagnostic.getChildren().size());
		assertDiagnostic(diagnostic.getChildren().get(0),Diagnostic.ERROR, "Include must be at Script top level.");
	}

	@Test
	public void checkGlobalDeclarationIsInScript() throws Exception {
		final Script script = getScript("function f() {global a;}");

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(script);
		assertEquals(1, diagnostic.getChildren().size());
		assertDiagnostic(diagnostic.getChildren().get(0),Diagnostic.ERROR, "GlobalDeclaration must be at Script top level.");
	}

	@Test
	public void checkFunctionDeclarationIsInScript() throws Exception {
		final Script script = getScript("function f() {function g() {}}");

		final Diagnostic diagnostic = Diagnostician.INSTANCE.validate(script);
		assertEquals(1, diagnostic.getChildren().size());
		assertDiagnostic(diagnostic.getChildren().get(0),Diagnostic.ERROR, "FunctionDeclaration must be at Script top level.");
	}
	
	private void assertDiagnostic(Diagnostic actual, int expectedSeverity, String expectedMessage) {
		assertEquals(expectedSeverity, actual.getSeverity());
		assertEquals(expectedMessage, actual.getMessage());
	}

}
