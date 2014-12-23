/**
 */
package org.processus.ecleek.leek;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.processus.ecleek.leek.LeekPackage
 * @generated
 */
public interface LeekFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LeekFactory eINSTANCE = org.processus.ecleek.leek.impl.LeekFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script</em>'.
   * @generated
   */
  Script createScript();

  /**
   * Returns a new object of class '<em>Toplevel Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Toplevel Statement</em>'.
   * @generated
   */
  ToplevelStatement createToplevelStatement();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Iteration Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iteration Statement</em>'.
   * @generated
   */
  IterationStatement createIterationStatement();

  /**
   * Returns a new object of class '<em>Function Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Statement</em>'.
   * @generated
   */
  FunctionStatement createFunctionStatement();

  /**
   * Returns a new object of class '<em>Function Statement Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Statement Block</em>'.
   * @generated
   */
  FunctionStatementBlock createFunctionStatementBlock();

  /**
   * Returns a new object of class '<em>Break Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Break Statement</em>'.
   * @generated
   */
  BreakStatement createBreakStatement();

  /**
   * Returns a new object of class '<em>Continue Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Continue Statement</em>'.
   * @generated
   */
  ContinueStatement createContinueStatement();

  /**
   * Returns a new object of class '<em>Statement Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement Block</em>'.
   * @generated
   */
  StatementBlock createStatementBlock();

  /**
   * Returns a new object of class '<em>Affectation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Affectation</em>'.
   * @generated
   */
  Affectation createAffectation();

  /**
   * Returns a new object of class '<em>If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If</em>'.
   * @generated
   */
  If createIf();

  /**
   * Returns a new object of class '<em>Iteration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Iteration</em>'.
   * @generated
   */
  Iteration createIteration();

  /**
   * Returns a new object of class '<em>While</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While</em>'.
   * @generated
   */
  While createWhile();

  /**
   * Returns a new object of class '<em>For</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For</em>'.
   * @generated
   */
  For createFor();

  /**
   * Returns a new object of class '<em>For In</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For In</em>'.
   * @generated
   */
  ForIn createForIn();

  /**
   * Returns a new object of class '<em>Variable Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Reference</em>'.
   * @generated
   */
  VariableReference createVariableReference();

  /**
   * Returns a new object of class '<em>For Initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Initializer</em>'.
   * @generated
   */
  ForInitializer createForInitializer();

  /**
   * Returns a new object of class '<em>Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Declaration</em>'.
   * @generated
   */
  FunctionDeclaration createFunctionDeclaration();

  /**
   * Returns a new object of class '<em>Variable Referenceable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Referenceable</em>'.
   * @generated
   */
  VariableReferenceable createVariableReferenceable();

  /**
   * Returns a new object of class '<em>Local Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Declaration</em>'.
   * @generated
   */
  LocalDeclaration createLocalDeclaration();

  /**
   * Returns a new object of class '<em>Global Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Global Declaration</em>'.
   * @generated
   */
  GlobalDeclaration createGlobalDeclaration();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Array Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Literal</em>'.
   * @generated
   */
  ArrayLiteral createArrayLiteral();

  /**
   * Returns a new object of class '<em>Function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call</em>'.
   * @generated
   */
  FunctionCall createFunctionCall();

  /**
   * Returns a new object of class '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Statement</em>'.
   * @generated
   */
  ReturnStatement createReturnStatement();

  /**
   * Returns a new object of class '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include</em>'.
   * @generated
   */
  Include createInclude();

  /**
   * Returns a new object of class '<em>Empty Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Empty Statement</em>'.
   * @generated
   */
  EmptyStatement createEmptyStatement();

  /**
   * Returns a new object of class '<em>Typed Equals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Equals</em>'.
   * @generated
   */
  TypedEquals createTypedEquals();

  /**
   * Returns a new object of class '<em>Equals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equals</em>'.
   * @generated
   */
  Equals createEquals();

  /**
   * Returns a new object of class '<em>Typed Different</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Different</em>'.
   * @generated
   */
  TypedDifferent createTypedDifferent();

  /**
   * Returns a new object of class '<em>Different</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Different</em>'.
   * @generated
   */
  Different createDifferent();

  /**
   * Returns a new object of class '<em>Less Or Equals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Less Or Equals</em>'.
   * @generated
   */
  LessOrEquals createLessOrEquals();

  /**
   * Returns a new object of class '<em>Less</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Less</em>'.
   * @generated
   */
  Less createLess();

  /**
   * Returns a new object of class '<em>More Or Equals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>More Or Equals</em>'.
   * @generated
   */
  MoreOrEquals createMoreOrEquals();

  /**
   * Returns a new object of class '<em>More</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>More</em>'.
   * @generated
   */
  More createMore();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns a new object of class '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi</em>'.
   * @generated
   */
  Multi createMulti();

  /**
   * Returns a new object of class '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Div</em>'.
   * @generated
   */
  Div createDiv();

  /**
   * Returns a new object of class '<em>Real Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Real Literal</em>'.
   * @generated
   */
  RealLiteral createRealLiteral();

  /**
   * Returns a new object of class '<em>Int Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Literal</em>'.
   * @generated
   */
  IntLiteral createIntLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal</em>'.
   * @generated
   */
  NullLiteral createNullLiteral();

  /**
   * Returns a new object of class '<em>False Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>False Literal</em>'.
   * @generated
   */
  FalseLiteral createFalseLiteral();

  /**
   * Returns a new object of class '<em>True Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>True Literal</em>'.
   * @generated
   */
  TrueLiteral createTrueLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LeekPackage getLeekPackage();

} //LeekFactory
