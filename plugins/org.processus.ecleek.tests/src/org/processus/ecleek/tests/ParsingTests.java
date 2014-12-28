package org.processus.ecleek.tests;

import org.eclipse.xtext.junit4.AbstractXtextTests;
import org.eclipse.xtext.parsetree.reconstr.impl.AbstractParseTreeConstructor.UnassignedTextToken;
import org.junit.Ignore;
import org.junit.Test;
import org.processus.ecleek.LeekStandaloneSetup;
import org.processus.ecleek.leek.ArrayLiteral;
import org.processus.ecleek.leek.FunctionCall;
import org.processus.ecleek.leek.FunctionDeclaration;
import org.processus.ecleek.leek.GlobalDeclaration;
import org.processus.ecleek.leek.If;
import org.processus.ecleek.leek.IntLiteral;
import org.processus.ecleek.leek.LocalDeclaration;
import org.processus.ecleek.leek.PostfixDecrement;
import org.processus.ecleek.leek.PostfixIncrement;
import org.processus.ecleek.leek.ReturnStatement;
import org.processus.ecleek.leek.Script;
import org.processus.ecleek.leek.TrueLiteral;
import org.processus.ecleek.leek.UnitaryMinus;
import org.processus.ecleek.leek.VariableReference;
import org.processus.ecleek.leek.While;

public class ParsingTests extends AbstractXtextTests {

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
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, local.getVariables().size());
		assertEquals("aGlobal", local.getVariables().get(0).getName());
		assertEquals(null, local.getVariables().get(0).getValue());
	}

	@Test
	public void localDeclarationSingleValue() throws Exception {
		final Script script = getScript("var aGlobal = 1;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, local.getVariables().size());
		assertEquals("aGlobal", local.getVariables().get(0).getName());
		assertTrue(local.getVariables().get(0).getValue() instanceof IntLiteral);
		assertEquals(1,((IntLiteral)local.getVariables().get(0).getValue()).getValue());
	}

	@Test
	public void localDeclarationNoValue() throws Exception {
		final Script script = getScript("var aGlobal, anotherGlobal;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(2, local.getVariables().size());
		assertEquals("aGlobal", local.getVariables().get(0).getName());
		assertEquals(null, local.getVariables().get(0).getValue());
		assertEquals("anotherGlobal", local.getVariables().get(1).getName());
		assertEquals(null, local.getVariables().get(1).getValue());
	}

	@Test
	public void localDeclarationValue() throws Exception {
		final Script script = getScript("var aGlobal = 1, anotherGlobal = 2;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(2, local.getVariables().size());
		assertEquals("aGlobal", local.getVariables().get(0).getName());
		assertTrue(local.getVariables().get(0).getValue() instanceof IntLiteral);
		assertEquals(1,((IntLiteral)local.getVariables().get(0).getValue()).getValue());
		assertEquals("anotherGlobal", local.getVariables().get(1).getName());
		assertTrue(local.getVariables().get(1).getValue() instanceof IntLiteral);
		assertEquals(2,((IntLiteral)local.getVariables().get(1).getValue()).getValue());
	}

	@Test
	public void variableReferenceToGlobalVariableNoDimension() throws Exception {
		final Script script = getScript("global a = a;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("a", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof VariableReference);
		final VariableReference varRef = (VariableReference) global.getVariables().get(0).getValue();
		assertEquals(global.getVariables().get(0), varRef.getVariable());
		assertEquals(0, varRef.getDimensions().size());
	}
	
	@Test
	public void variableReferenceToLocalVariableNoDimension() throws Exception {
		final Script script = getScript("var a = a;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, local.getVariables().size());
		assertEquals("a", local.getVariables().get(0).getName());
		assertTrue(local.getVariables().get(0).getValue() instanceof VariableReference);
		final VariableReference varRef = (VariableReference) local.getVariables().get(0).getValue();
		assertEquals(local.getVariables().get(0), varRef.getVariable());
		assertEquals(0, varRef.getDimensions().size());
	}
	
	@Test
	public void variableReferenceToGlobalVariableEmptyDimension() throws Exception {
		getModelAndExpect("global a = a[];", 2);
	}
	
	@Test
	public void variableReferenceToLocalVariableEmptyDimension() throws Exception {
		getModelAndExpect("var a = a[];", 2);
	}
	
	@Test
	public void variableReferenceToGlobalVariableOneDimension() throws Exception {
		final Script script = getScript("global a = a[1];");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("a", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof VariableReference);
		final VariableReference varRef = (VariableReference) global.getVariables().get(0).getValue();
		assertEquals(global.getVariables().get(0), varRef.getVariable());
		assertEquals(1, varRef.getDimensions().size());
		assertTrue(varRef.getDimensions().get(0) instanceof IntLiteral);
		final IntLiteral dim = (IntLiteral) varRef.getDimensions().get(0);
		assertEquals(1, dim.getValue());
	}
	
	@Test
	public void variableReferenceToLocalVariableOneDimension() throws Exception {
		final Script script = getScript("var a = a[1];");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, local.getVariables().size());
		assertEquals("a", local.getVariables().get(0).getName());
		assertTrue(local.getVariables().get(0).getValue() instanceof VariableReference);
		final VariableReference varRef = (VariableReference) local.getVariables().get(0).getValue();
		assertEquals(local.getVariables().get(0), varRef.getVariable());
		assertEquals(1, varRef.getDimensions().size());
		assertTrue(varRef.getDimensions().get(0) instanceof IntLiteral);
		final IntLiteral dim = (IntLiteral) varRef.getDimensions().get(0);
		assertEquals(1, dim.getValue());
	}
	
	@Test
	public void variableReferenceToGlobalVariableTwoDimensions() throws Exception {
		final Script script = getScript("global a = a[1][2];");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof GlobalDeclaration);
		final GlobalDeclaration global = (GlobalDeclaration) script.getStatements().get(0);
		assertEquals(1, global.getVariables().size());
		assertEquals("a", global.getVariables().get(0).getName());
		assertTrue(global.getVariables().get(0).getValue() instanceof VariableReference);
		final VariableReference varRef = (VariableReference) global.getVariables().get(0).getValue();
		assertEquals(global.getVariables().get(0), varRef.getVariable());
		assertEquals(2, varRef.getDimensions().size());
		assertTrue(varRef.getDimensions().get(0) instanceof IntLiteral);
		IntLiteral dim = (IntLiteral) varRef.getDimensions().get(0);
		assertEquals(1, dim.getValue());
		assertTrue(varRef.getDimensions().get(1) instanceof IntLiteral);
		dim = (IntLiteral) varRef.getDimensions().get(1);
		assertEquals(2, dim.getValue());
	}
	
	@Test
	public void variableReferenceToLocalVariableTwoDimensions() throws Exception {
		final Script script = getScript("var a = a[1][2];");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, local.getVariables().size());
		assertEquals("a", local.getVariables().get(0).getName());
		assertTrue(local.getVariables().get(0).getValue() instanceof VariableReference);
		final VariableReference varRef = (VariableReference) local.getVariables().get(0).getValue();
		assertEquals(local.getVariables().get(0), varRef.getVariable());
		assertEquals(2, varRef.getDimensions().size());
		assertTrue(varRef.getDimensions().get(0) instanceof IntLiteral);
		IntLiteral dim = (IntLiteral) varRef.getDimensions().get(0);
		assertEquals(1, dim.getValue());
		assertTrue(varRef.getDimensions().get(1) instanceof IntLiteral);
		dim = (IntLiteral) varRef.getDimensions().get(1);
		assertEquals(2, dim.getValue());
	}

	@Test
	public void arrayLiteralEmpty() throws Exception {
		final Script script = getScript("var a = [];");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, local.getVariables().size());
		assertEquals("a", local.getVariables().get(0).getName());
		assertTrue(local.getVariables().get(0).getValue() instanceof ArrayLiteral);
		final ArrayLiteral literal = (ArrayLiteral) local.getVariables().get(0).getValue();
		assertEquals(0, literal.getValues().size());
	}

	@Test
	public void arrayLiteralOneValue() throws Exception {
		final Script script = getScript("var a = [1];");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, local.getVariables().size());
		assertEquals("a", local.getVariables().get(0).getName());
		assertTrue(local.getVariables().get(0).getValue() instanceof ArrayLiteral);
		final ArrayLiteral literal = (ArrayLiteral) local.getVariables().get(0).getValue();
		assertEquals(1, literal.getValues().size());
		assertTrue(literal.getValues().get(0) instanceof IntLiteral);
		final IntLiteral value = (IntLiteral) literal.getValues().get(0);
		assertEquals(1, value.getValue());
	}

	@Test
	public void arrayLiteralTwoValue() throws Exception {
		final Script script = getScript("var a = [1, 2];");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, local.getVariables().size());
		assertEquals("a", local.getVariables().get(0).getName());
		assertTrue(local.getVariables().get(0).getValue() instanceof ArrayLiteral);
		final ArrayLiteral literal = (ArrayLiteral) local.getVariables().get(0).getValue();
		assertEquals(2, literal.getValues().size());
		assertTrue(literal.getValues().get(0) instanceof IntLiteral);
		IntLiteral value = (IntLiteral) literal.getValues().get(0);
		assertEquals(1, value.getValue());
		value = (IntLiteral) literal.getValues().get(1);
		assertEquals(2, value.getValue());
	}

	@Test
	public void functionDeclarationNoParameters() throws Exception {
		final Script script = getScript("function aFunction(){}");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof FunctionDeclaration);
		final FunctionDeclaration declaration = (FunctionDeclaration) script.getStatements().get(0);
		assertEquals("aFunction", declaration.getName());
		assertEquals(0, declaration.getParameters().size());
		assertEquals(0, declaration.getBody().getStatements().size());
	}

	@Test
	public void functionDeclarationOneParameter() throws Exception {
		final Script script = getScript("function aFunction(a){}");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof FunctionDeclaration);
		final FunctionDeclaration declaration = (FunctionDeclaration) script.getStatements().get(0);
		assertEquals("aFunction", declaration.getName());
		assertEquals(1, declaration.getParameters().size());
		assertEquals("a", declaration.getParameters().get(0).getName());
		assertEquals(false, declaration.getParameters().get(0).isByAdress());
		assertEquals(0, declaration.getBody().getStatements().size());
	}

	@Test
	public void functionDeclarationOneByAddressParameter() throws Exception {
		final Script script = getScript("function aFunction(@a){}");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof FunctionDeclaration);
		final FunctionDeclaration declaration = (FunctionDeclaration) script.getStatements().get(0);
		assertEquals("aFunction", declaration.getName());
		assertEquals(1, declaration.getParameters().size());
		assertEquals("a", declaration.getParameters().get(0).getName());
		assertEquals(true, declaration.getParameters().get(0).isByAdress());
		assertEquals(0, declaration.getBody().getStatements().size());
	}

	@Test
	public void functionDeclarationTwoParameters() throws Exception {
		final Script script = getScript("function aFunction(a, b){}");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof FunctionDeclaration);
		final FunctionDeclaration declaration = (FunctionDeclaration) script.getStatements().get(0);
		assertEquals("aFunction", declaration.getName());
		assertEquals(2, declaration.getParameters().size());
		assertEquals("a", declaration.getParameters().get(0).getName());
		assertEquals(false, declaration.getParameters().get(0).isByAdress());
		assertEquals("b", declaration.getParameters().get(1).getName());
		assertEquals(false, declaration.getParameters().get(1).isByAdress());
		assertEquals(0, declaration.getBody().getStatements().size());
	}

	@Test
	public void functionDeclarationOneParameterWithStatement() throws Exception {
		final Script script = getScript("function aFunction(a){return 1;}");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof FunctionDeclaration);
		final FunctionDeclaration declaration = (FunctionDeclaration) script.getStatements().get(0);
		assertEquals("aFunction", declaration.getName());
		assertEquals(1, declaration.getParameters().size());
		assertEquals("a", declaration.getParameters().get(0).getName());
		assertEquals(false, declaration.getParameters().get(0).isByAdress());
		assertEquals(1, declaration.getBody().getStatements().size());
		assertTrue(declaration.getBody().getStatements().get(0) instanceof ReturnStatement);
		ReturnStatement statement = (ReturnStatement) declaration.getBody().getStatements().get(0);
		assertTrue(statement.getValue() instanceof IntLiteral);
		assertEquals(1, ((IntLiteral)statement.getValue()).getValue());
	}

	@Test
	public void functionDeclarationOneParameterParameterReference() throws Exception {
		final Script script = getScript("function aFunction(a){return a;}");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof FunctionDeclaration);
		final FunctionDeclaration declaration = (FunctionDeclaration) script.getStatements().get(0);
		assertEquals("aFunction", declaration.getName());
		assertEquals(1, declaration.getParameters().size());
		assertEquals("a", declaration.getParameters().get(0).getName());
		assertEquals(false, declaration.getParameters().get(0).isByAdress());
		assertEquals(1, declaration.getBody().getStatements().size());
		assertTrue(declaration.getBody().getStatements().get(0) instanceof ReturnStatement);
		ReturnStatement statement = (ReturnStatement) declaration.getBody().getStatements().get(0);
		assertTrue(statement.getValue() instanceof VariableReference);
		assertEquals(declaration.getParameters().get(0), ((VariableReference)statement.getValue()).getVariable());
	}

	@Test
	public void ifNoElse() throws Exception {
		final Script script = getScript("if(true) var a;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof If);
		final If ifStatement = (If) script.getStatements().get(0);
		assertTrue(ifStatement.getCondition() instanceof TrueLiteral);
		assertTrue(ifStatement.getThen() instanceof LocalDeclaration);
		final LocalDeclaration thenStatement = (LocalDeclaration) ifStatement.getThen();
		assertEquals(1, thenStatement.getVariables().size());
		assertEquals("a", thenStatement.getVariables().get(0).getName());
		assertEquals(null, ifStatement.getElse());
	}

	@Test
	public void ifWithElse() throws Exception {
		final Script script = getScript("if(true) var a; else var b;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof If);
		final If ifStatement = (If) script.getStatements().get(0);
		assertTrue(ifStatement.getCondition() instanceof TrueLiteral);
		final LocalDeclaration thenStatement = (LocalDeclaration) ifStatement.getThen();
		assertEquals(1, thenStatement.getVariables().size());
		assertEquals("a", thenStatement.getVariables().get(0).getName());
		assertTrue(ifStatement.getElse()instanceof LocalDeclaration);
		final LocalDeclaration elseStatement = (LocalDeclaration) ifStatement.getElse();
		assertEquals(1, elseStatement.getVariables().size());
		assertEquals("b", elseStatement.getVariables().get(0).getName());
	}

	@Test
	public void whileTest() throws Exception {
		final Script script = getScript("while(true) var a;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof While);
		final While whileStatement = (While) script.getStatements().get(0);
		assertTrue(whileStatement.getCondition() instanceof TrueLiteral);
		assertTrue(whileStatement.getStatement() instanceof LocalDeclaration);
		final LocalDeclaration statement = (LocalDeclaration) whileStatement.getStatement();
		assertEquals(1, statement.getVariables().size());
		assertEquals("a", statement.getVariables().get(0).getName());
	}

	@Test
	public void functionCallNoArgs() throws Exception {
		final Script script = getScript("function aFunction(){} aFunction();");

		assertEquals(2, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof FunctionDeclaration);
		assertTrue(script.getStatements().get(1) instanceof FunctionCall);
		FunctionCall functionCall = (FunctionCall) script.getStatements().get(1);
		assertEquals(0, functionCall.getArgs().size());
	}

	@Test
	public void functionCallOneArg() throws Exception {
		final Script script = getScript("function aFunction(a){} aFunction(1);");

		assertEquals(2, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof FunctionDeclaration);
		assertTrue(script.getStatements().get(1) instanceof FunctionCall);
		FunctionCall functionCall = (FunctionCall) script.getStatements().get(1);
		assertEquals(1, functionCall.getArgs().size());
		assertTrue(functionCall.getArgs().get(0) instanceof IntLiteral);
		IntLiteral arg = (IntLiteral) functionCall.getArgs().get(0);
		assertEquals(1, arg.getValue());
	}

	@Test
	public void functionCallTwoArgs() throws Exception {
		final Script script = getScript("function aFunction(a, b){} aFunction(1, 2);");

		assertEquals(2, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof FunctionDeclaration);
		assertTrue(script.getStatements().get(1) instanceof FunctionCall);
		FunctionCall functionCall = (FunctionCall) script.getStatements().get(1);
		assertEquals(2, functionCall.getArgs().size());
		assertTrue(functionCall.getArgs().get(0) instanceof IntLiteral);
		IntLiteral arg = (IntLiteral) functionCall.getArgs().get(0);
		assertEquals(1, arg.getValue());
		assertTrue(functionCall.getArgs().get(1) instanceof IntLiteral);
		arg = (IntLiteral) functionCall.getArgs().get(1);
		assertEquals(2, arg.getValue());
	}

	@Test
	public void postfixDecrementExpression() throws Exception {
		final Script script = getScript("var a = a--;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, local.getVariables().size());
		assertTrue(local.getVariables().get(0).getValue() instanceof PostfixDecrement);
	}

	@Test
	public void postfixIncrementExpression() throws Exception {
		final Script script = getScript("var a = a++;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, local.getVariables().size());
		assertTrue(local.getVariables().get(0).getValue() instanceof PostfixIncrement);
	}

	@Test
	@Ignore
	public void postfixDecrementStatement() throws Exception {
		final Script script = getScript("var a; a--;");

		assertEquals(2, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		assertTrue(script.getStatements().get(1) instanceof LocalDeclaration);
	}

	@Test
	@Ignore
	public void postfixIncrementStatement() throws Exception {
		final Script script = getScript("var a; a++;");

		assertEquals(2, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		assertTrue(script.getStatements().get(1) instanceof LocalDeclaration);
	}

	@Test
	public void unitaryMinusIntLiteral() throws Exception {
		final Script script = getScript("var a = -3;");

		assertEquals(1, script.getStatements().size());
		assertTrue(script.getStatements().get(0) instanceof LocalDeclaration);
		final LocalDeclaration local = (LocalDeclaration) script.getStatements().get(0);
		assertEquals(1, local.getVariables().size());
		assertTrue(local.getVariables().get(0).getValue() instanceof UnitaryMinus);
		UnitaryMinus minus = (UnitaryMinus) local.getVariables().get(0).getValue();
		assertTrue(minus.getExpression() instanceof IntLiteral);
	}
	
}