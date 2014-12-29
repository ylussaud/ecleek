/**
 */
package org.processus.ecleek.leek.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.processus.ecleek.leek.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.processus.ecleek.leek.LeekPackage
 * @generated
 */
public class LeekSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LeekPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeekSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LeekPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LeekPackage.SCRIPT:
      {
        Script script = (Script)theEObject;
        T result = caseScript(script);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.BREAK_STATEMENT:
      {
        BreakStatement breakStatement = (BreakStatement)theEObject;
        T result = caseBreakStatement(breakStatement);
        if (result == null) result = caseStatement(breakStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.CONTINUE_STATEMENT:
      {
        ContinueStatement continueStatement = (ContinueStatement)theEObject;
        T result = caseContinueStatement(continueStatement);
        if (result == null) result = caseStatement(continueStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.STATEMENT_BLOCK:
      {
        StatementBlock statementBlock = (StatementBlock)theEObject;
        T result = caseStatementBlock(statementBlock);
        if (result == null) result = caseStatement(statementBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.AFFECTATION_STATEMENT:
      {
        AffectationStatement affectationStatement = (AffectationStatement)theEObject;
        T result = caseAffectationStatement(affectationStatement);
        if (result == null) result = caseStatement(affectationStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.AFFECTATION:
      {
        Affectation affectation = (Affectation)theEObject;
        T result = caseAffectation(affectation);
        if (result == null) result = caseAffectationStatement(affectation);
        if (result == null) result = caseIfCondition(affectation);
        if (result == null) result = caseForInitializer(affectation);
        if (result == null) result = caseForAffectation(affectation);
        if (result == null) result = caseStatement(affectation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.AFFECTATION_DECREMENT:
      {
        AffectationDecrement affectationDecrement = (AffectationDecrement)theEObject;
        T result = caseAffectationDecrement(affectationDecrement);
        if (result == null) result = caseAffectationStatement(affectationDecrement);
        if (result == null) result = caseStatement(affectationDecrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.AFFECTATION_INCREMENT:
      {
        AffectationIncrement affectationIncrement = (AffectationIncrement)theEObject;
        T result = caseAffectationIncrement(affectationIncrement);
        if (result == null) result = caseAffectationStatement(affectationIncrement);
        if (result == null) result = caseStatement(affectationIncrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.AFFECTATION_POSTFIX_STATEMENT:
      {
        AffectationPostfixStatement affectationPostfixStatement = (AffectationPostfixStatement)theEObject;
        T result = caseAffectationPostfixStatement(affectationPostfixStatement);
        if (result == null) result = caseAffectationStatement(affectationPostfixStatement);
        if (result == null) result = caseStatement(affectationPostfixStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.AFFECTATION_PREFIX_STATEMENT:
      {
        AffectationPrefixStatement affectationPrefixStatement = (AffectationPrefixStatement)theEObject;
        T result = caseAffectationPrefixStatement(affectationPrefixStatement);
        if (result == null) result = caseAffectationStatement(affectationPrefixStatement);
        if (result == null) result = caseStatement(affectationPrefixStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.IF:
      {
        If if_ = (If)theEObject;
        T result = caseIf(if_);
        if (result == null) result = caseStatement(if_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.IF_CONDITION:
      {
        IfCondition ifCondition = (IfCondition)theEObject;
        T result = caseIfCondition(ifCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.ITERATION:
      {
        Iteration iteration = (Iteration)theEObject;
        T result = caseIteration(iteration);
        if (result == null) result = caseStatement(iteration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.WHILE:
      {
        While while_ = (While)theEObject;
        T result = caseWhile(while_);
        if (result == null) result = caseIteration(while_);
        if (result == null) result = caseStatement(while_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.FOR:
      {
        For for_ = (For)theEObject;
        T result = caseFor(for_);
        if (result == null) result = caseIteration(for_);
        if (result == null) result = caseStatement(for_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.FOR_IN:
      {
        ForIn forIn = (ForIn)theEObject;
        T result = caseForIn(forIn);
        if (result == null) result = caseIteration(forIn);
        if (result == null) result = caseStatement(forIn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.FOR_IN_VARIABLE_REFERENCE:
      {
        ForInVariableReference forInVariableReference = (ForInVariableReference)theEObject;
        T result = caseForInVariableReference(forInVariableReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.FOR_INITIALIZER:
      {
        ForInitializer forInitializer = (ForInitializer)theEObject;
        T result = caseForInitializer(forInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.FOR_AFFECTATION:
      {
        ForAffectation forAffectation = (ForAffectation)theEObject;
        T result = caseForAffectation(forAffectation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.FUNCTION_DECLARATION:
      {
        FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
        T result = caseFunctionDeclaration(functionDeclaration);
        if (result == null) result = caseStatement(functionDeclaration);
        if (result == null) result = caseExpression(functionDeclaration);
        if (result == null) result = caseIfCondition(functionDeclaration);
        if (result == null) result = caseForAffectation(functionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseForInVariableReference(variableDeclaration);
        if (result == null) result = caseForInitializer(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.LOCAL_DECLARATION:
      {
        LocalDeclaration localDeclaration = (LocalDeclaration)theEObject;
        T result = caseLocalDeclaration(localDeclaration);
        if (result == null) result = caseStatement(localDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.GLOBAL_DECLARATION:
      {
        GlobalDeclaration globalDeclaration = (GlobalDeclaration)theEObject;
        T result = caseGlobalDeclaration(globalDeclaration);
        if (result == null) result = caseStatement(globalDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseIfCondition(expression);
        if (result == null) result = caseForAffectation(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.ARRAY_LITERAL:
      {
        ArrayLiteral arrayLiteral = (ArrayLiteral)theEObject;
        T result = caseArrayLiteral(arrayLiteral);
        if (result == null) result = caseExpression(arrayLiteral);
        if (result == null) result = caseIfCondition(arrayLiteral);
        if (result == null) result = caseForAffectation(arrayLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.POSTFIX:
      {
        Postfix postfix = (Postfix)theEObject;
        T result = casePostfix(postfix);
        if (result == null) result = caseExpression(postfix);
        if (result == null) result = caseIfCondition(postfix);
        if (result == null) result = caseForAffectation(postfix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.PREFIX:
      {
        Prefix prefix = (Prefix)theEObject;
        T result = casePrefix(prefix);
        if (result == null) result = caseExpression(prefix);
        if (result == null) result = caseIfCondition(prefix);
        if (result == null) result = caseForAffectation(prefix);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.VARIABLE_REFERENCE:
      {
        VariableReference variableReference = (VariableReference)theEObject;
        T result = caseVariableReference(variableReference);
        if (result == null) result = caseAffectationPostfixStatement(variableReference);
        if (result == null) result = caseForInVariableReference(variableReference);
        if (result == null) result = casePostfix(variableReference);
        if (result == null) result = caseAffectationStatement(variableReference);
        if (result == null) result = caseExpression(variableReference);
        if (result == null) result = caseStatement(variableReference);
        if (result == null) result = caseIfCondition(variableReference);
        if (result == null) result = caseForAffectation(variableReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.FUNCTION_CALL:
      {
        FunctionCall functionCall = (FunctionCall)theEObject;
        T result = caseFunctionCall(functionCall);
        if (result == null) result = caseStatement(functionCall);
        if (result == null) result = caseExpression(functionCall);
        if (result == null) result = caseIfCondition(functionCall);
        if (result == null) result = caseForAffectation(functionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.RETURN_STATEMENT:
      {
        ReturnStatement returnStatement = (ReturnStatement)theEObject;
        T result = caseReturnStatement(returnStatement);
        if (result == null) result = caseStatement(returnStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.INCLUDE:
      {
        Include include = (Include)theEObject;
        T result = caseInclude(include);
        if (result == null) result = caseStatement(include);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.EMPTY_STATEMENT:
      {
        EmptyStatement emptyStatement = (EmptyStatement)theEObject;
        T result = caseEmptyStatement(emptyStatement);
        if (result == null) result = caseStatement(emptyStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.POSTFIX_DECREMENT:
      {
        PostfixDecrement postfixDecrement = (PostfixDecrement)theEObject;
        T result = casePostfixDecrement(postfixDecrement);
        if (result == null) result = caseAffectationPostfixStatement(postfixDecrement);
        if (result == null) result = casePostfix(postfixDecrement);
        if (result == null) result = caseAffectationStatement(postfixDecrement);
        if (result == null) result = caseExpression(postfixDecrement);
        if (result == null) result = caseStatement(postfixDecrement);
        if (result == null) result = caseIfCondition(postfixDecrement);
        if (result == null) result = caseForAffectation(postfixDecrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.POSTFIX_INCREMENT:
      {
        PostfixIncrement postfixIncrement = (PostfixIncrement)theEObject;
        T result = casePostfixIncrement(postfixIncrement);
        if (result == null) result = caseAffectationPostfixStatement(postfixIncrement);
        if (result == null) result = casePostfix(postfixIncrement);
        if (result == null) result = caseAffectationStatement(postfixIncrement);
        if (result == null) result = caseExpression(postfixIncrement);
        if (result == null) result = caseStatement(postfixIncrement);
        if (result == null) result = caseIfCondition(postfixIncrement);
        if (result == null) result = caseForAffectation(postfixIncrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.PREFIX_DECREMENT:
      {
        PrefixDecrement prefixDecrement = (PrefixDecrement)theEObject;
        T result = casePrefixDecrement(prefixDecrement);
        if (result == null) result = caseAffectationPrefixStatement(prefixDecrement);
        if (result == null) result = casePrefix(prefixDecrement);
        if (result == null) result = caseAffectationStatement(prefixDecrement);
        if (result == null) result = caseExpression(prefixDecrement);
        if (result == null) result = caseStatement(prefixDecrement);
        if (result == null) result = caseIfCondition(prefixDecrement);
        if (result == null) result = caseForAffectation(prefixDecrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.PREFIX_INCREMENT:
      {
        PrefixIncrement prefixIncrement = (PrefixIncrement)theEObject;
        T result = casePrefixIncrement(prefixIncrement);
        if (result == null) result = caseAffectationPrefixStatement(prefixIncrement);
        if (result == null) result = casePrefix(prefixIncrement);
        if (result == null) result = caseAffectationStatement(prefixIncrement);
        if (result == null) result = caseExpression(prefixIncrement);
        if (result == null) result = caseStatement(prefixIncrement);
        if (result == null) result = caseIfCondition(prefixIncrement);
        if (result == null) result = caseForAffectation(prefixIncrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.COMPARISON:
      {
        Comparison comparison = (Comparison)theEObject;
        T result = caseComparison(comparison);
        if (result == null) result = caseExpression(comparison);
        if (result == null) result = caseIfCondition(comparison);
        if (result == null) result = caseForAffectation(comparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.EQUALS:
      {
        Equals equals = (Equals)theEObject;
        T result = caseEquals(equals);
        if (result == null) result = caseExpression(equals);
        if (result == null) result = caseIfCondition(equals);
        if (result == null) result = caseForAffectation(equals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.TYPED_DIFFERENT:
      {
        TypedDifferent typedDifferent = (TypedDifferent)theEObject;
        T result = caseTypedDifferent(typedDifferent);
        if (result == null) result = caseExpression(typedDifferent);
        if (result == null) result = caseIfCondition(typedDifferent);
        if (result == null) result = caseForAffectation(typedDifferent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.DIFFERENT:
      {
        Different different = (Different)theEObject;
        T result = caseDifferent(different);
        if (result == null) result = caseExpression(different);
        if (result == null) result = caseIfCondition(different);
        if (result == null) result = caseForAffectation(different);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.LESS_OR_EQUALS:
      {
        LessOrEquals lessOrEquals = (LessOrEquals)theEObject;
        T result = caseLessOrEquals(lessOrEquals);
        if (result == null) result = caseExpression(lessOrEquals);
        if (result == null) result = caseIfCondition(lessOrEquals);
        if (result == null) result = caseForAffectation(lessOrEquals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.LESS:
      {
        Less less = (Less)theEObject;
        T result = caseLess(less);
        if (result == null) result = caseExpression(less);
        if (result == null) result = caseIfCondition(less);
        if (result == null) result = caseForAffectation(less);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.MORE_OR_EQUALS:
      {
        MoreOrEquals moreOrEquals = (MoreOrEquals)theEObject;
        T result = caseMoreOrEquals(moreOrEquals);
        if (result == null) result = caseExpression(moreOrEquals);
        if (result == null) result = caseIfCondition(moreOrEquals);
        if (result == null) result = caseForAffectation(moreOrEquals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.MORE:
      {
        More more = (More)theEObject;
        T result = caseMore(more);
        if (result == null) result = caseExpression(more);
        if (result == null) result = caseIfCondition(more);
        if (result == null) result = caseForAffectation(more);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.OR:
      {
        Or or = (Or)theEObject;
        T result = caseOr(or);
        if (result == null) result = caseExpression(or);
        if (result == null) result = caseIfCondition(or);
        if (result == null) result = caseForAffectation(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.AND:
      {
        And and = (And)theEObject;
        T result = caseAnd(and);
        if (result == null) result = caseExpression(and);
        if (result == null) result = caseIfCondition(and);
        if (result == null) result = caseForAffectation(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = caseExpression(plus);
        if (result == null) result = caseIfCondition(plus);
        if (result == null) result = caseForAffectation(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = caseExpression(minus);
        if (result == null) result = caseIfCondition(minus);
        if (result == null) result = caseForAffectation(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.MULTI:
      {
        Multi multi = (Multi)theEObject;
        T result = caseMulti(multi);
        if (result == null) result = caseExpression(multi);
        if (result == null) result = caseIfCondition(multi);
        if (result == null) result = caseForAffectation(multi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseExpression(div);
        if (result == null) result = caseIfCondition(div);
        if (result == null) result = caseForAffectation(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.TERNARY_IF:
      {
        TernaryIf ternaryIf = (TernaryIf)theEObject;
        T result = caseTernaryIf(ternaryIf);
        if (result == null) result = caseExpression(ternaryIf);
        if (result == null) result = caseIfCondition(ternaryIf);
        if (result == null) result = caseForAffectation(ternaryIf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.UNITARY_MINUS:
      {
        UnitaryMinus unitaryMinus = (UnitaryMinus)theEObject;
        T result = caseUnitaryMinus(unitaryMinus);
        if (result == null) result = caseExpression(unitaryMinus);
        if (result == null) result = caseIfCondition(unitaryMinus);
        if (result == null) result = caseForAffectation(unitaryMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.NOT:
      {
        Not not = (Not)theEObject;
        T result = caseNot(not);
        if (result == null) result = caseExpression(not);
        if (result == null) result = caseIfCondition(not);
        if (result == null) result = caseForAffectation(not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.REAL_LITERAL:
      {
        RealLiteral realLiteral = (RealLiteral)theEObject;
        T result = caseRealLiteral(realLiteral);
        if (result == null) result = caseExpression(realLiteral);
        if (result == null) result = caseIfCondition(realLiteral);
        if (result == null) result = caseForAffectation(realLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.INT_LITERAL:
      {
        IntLiteral intLiteral = (IntLiteral)theEObject;
        T result = caseIntLiteral(intLiteral);
        if (result == null) result = caseExpression(intLiteral);
        if (result == null) result = caseIfCondition(intLiteral);
        if (result == null) result = caseForAffectation(intLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = caseIfCondition(stringLiteral);
        if (result == null) result = caseForAffectation(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.NULL_LITERAL:
      {
        NullLiteral nullLiteral = (NullLiteral)theEObject;
        T result = caseNullLiteral(nullLiteral);
        if (result == null) result = caseExpression(nullLiteral);
        if (result == null) result = caseIfCondition(nullLiteral);
        if (result == null) result = caseForAffectation(nullLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.FALSE_LITERAL:
      {
        FalseLiteral falseLiteral = (FalseLiteral)theEObject;
        T result = caseFalseLiteral(falseLiteral);
        if (result == null) result = caseExpression(falseLiteral);
        if (result == null) result = caseIfCondition(falseLiteral);
        if (result == null) result = caseForAffectation(falseLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LeekPackage.TRUE_LITERAL:
      {
        TrueLiteral trueLiteral = (TrueLiteral)theEObject;
        T result = caseTrueLiteral(trueLiteral);
        if (result == null) result = caseExpression(trueLiteral);
        if (result == null) result = caseIfCondition(trueLiteral);
        if (result == null) result = caseForAffectation(trueLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScript(Script object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Break Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Break Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreakStatement(BreakStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContinueStatement(ContinueStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatementBlock(StatementBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Affectation Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Affectation Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAffectationStatement(AffectationStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Affectation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Affectation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAffectation(Affectation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Affectation Decrement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Affectation Decrement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAffectationDecrement(AffectationDecrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Affectation Increment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Affectation Increment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAffectationIncrement(AffectationIncrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Affectation Postfix Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Affectation Postfix Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAffectationPostfixStatement(AffectationPostfixStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Affectation Prefix Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Affectation Prefix Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAffectationPrefixStatement(AffectationPrefixStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIf(If object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfCondition(IfCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Iteration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Iteration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIteration(Iteration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhile(While object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor(For object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For In</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For In</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForIn(ForIn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For In Variable Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For In Variable Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForInVariableReference(ForInVariableReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForInitializer(ForInitializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Affectation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Affectation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForAffectation(ForAffectation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDeclaration(FunctionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalDeclaration(LocalDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Global Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Global Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGlobalDeclaration(GlobalDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayLiteral(ArrayLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Postfix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Postfix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostfix(Postfix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefix(Prefix object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableReference(VariableReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCall(FunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnStatement(ReturnStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInclude(Include object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmptyStatement(EmptyStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Postfix Decrement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Postfix Decrement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostfixDecrement(PostfixDecrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Postfix Increment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Postfix Increment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostfixIncrement(PostfixIncrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix Decrement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix Decrement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixDecrement(PrefixDecrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix Increment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix Increment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixIncrement(PrefixIncrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparison(Comparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquals(Equals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Different</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Different</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedDifferent(TypedDifferent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Different</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Different</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDifferent(Different object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Less Or Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Less Or Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLessOrEquals(LessOrEquals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Less</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Less</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLess(Less object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>More Or Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>More Or Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMoreOrEquals(MoreOrEquals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>More</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>More</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMore(More object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr(Or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd(And object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinus(Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulti(Multi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ternary If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ternary If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTernaryIf(TernaryIf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unitary Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unitary Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitaryMinus(UnitaryMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNot(Not object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Real Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealLiteral(RealLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLiteral(IntLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullLiteral(NullLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>False Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>False Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFalseLiteral(FalseLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>True Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>True Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTrueLiteral(TrueLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LeekSwitch
