/**
 */
package org.processus.ecleek.leek.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.processus.ecleek.leek.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeekFactoryImpl extends EFactoryImpl implements LeekFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LeekFactory init()
  {
    try
    {
      LeekFactory theLeekFactory = (LeekFactory)EPackage.Registry.INSTANCE.getEFactory(LeekPackage.eNS_URI);
      if (theLeekFactory != null)
      {
        return theLeekFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LeekFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeekFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LeekPackage.SCRIPT: return createScript();
      case LeekPackage.TOPLEVEL_STATEMENT: return createToplevelStatement();
      case LeekPackage.STATEMENT: return createStatement();
      case LeekPackage.STATEMENT_BLOCK: return createStatementBlock();
      case LeekPackage.AFFECTATION: return createAffectation();
      case LeekPackage.IF: return createIf();
      case LeekPackage.WHILE: return createWhile();
      case LeekPackage.FOR: return createFor();
      case LeekPackage.FOR_ITERATOR: return createForIterator();
      case LeekPackage.EACH_ITERATOR: return createEachIterator();
      case LeekPackage.VARIABLE_ITERATOR: return createVariableIterator();
      case LeekPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
      case LeekPackage.PARAMETER_DECLARATION: return createParameterDeclaration();
      case LeekPackage.LOCAL_DECLARATION: return createLocalDeclaration();
      case LeekPackage.GLOBAL_DECLARATION: return createGlobalDeclaration();
      case LeekPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case LeekPackage.EXPRESSION: return createExpression();
      case LeekPackage.ARRAY_LITERAL: return createArrayLiteral();
      case LeekPackage.VARIABLE_REFERENCEABLE: return createVariableReferenceable();
      case LeekPackage.VARIABLE_REFERENCE: return createVariableReference();
      case LeekPackage.FUNCTION_CALL: return createFunctionCall();
      case LeekPackage.RETURN: return createReturn();
      case LeekPackage.INCLUDE: return createInclude();
      case LeekPackage.EMPTY_STATEMENT: return createEmptyStatement();
      case LeekPackage.TYPED_EQUALS: return createTypedEquals();
      case LeekPackage.EQUALS: return createEquals();
      case LeekPackage.TYPED_DIFFERENT: return createTypedDifferent();
      case LeekPackage.DIFFERENT: return createDifferent();
      case LeekPackage.LESS_OR_EQUALS: return createLessOrEquals();
      case LeekPackage.LESS: return createLess();
      case LeekPackage.MORE_OR_EQUALS: return createMoreOrEquals();
      case LeekPackage.MORE: return createMore();
      case LeekPackage.PLUS: return createPlus();
      case LeekPackage.MINUS: return createMinus();
      case LeekPackage.MULTI: return createMulti();
      case LeekPackage.DIV: return createDiv();
      case LeekPackage.REAL_LITERAL: return createRealLiteral();
      case LeekPackage.INT_LITERAL: return createIntLiteral();
      case LeekPackage.STRING_LITERAL: return createStringLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToplevelStatement createToplevelStatement()
  {
    ToplevelStatementImpl toplevelStatement = new ToplevelStatementImpl();
    return toplevelStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatementBlock createStatementBlock()
  {
    StatementBlockImpl statementBlock = new StatementBlockImpl();
    return statementBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Affectation createAffectation()
  {
    AffectationImpl affectation = new AffectationImpl();
    return affectation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For createFor()
  {
    ForImpl for_ = new ForImpl();
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForIterator createForIterator()
  {
    ForIteratorImpl forIterator = new ForIteratorImpl();
    return forIterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EachIterator createEachIterator()
  {
    EachIteratorImpl eachIterator = new EachIteratorImpl();
    return eachIterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableIterator createVariableIterator()
  {
    VariableIteratorImpl variableIterator = new VariableIteratorImpl();
    return variableIterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration createFunctionDeclaration()
  {
    FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDeclaration createParameterDeclaration()
  {
    ParameterDeclarationImpl parameterDeclaration = new ParameterDeclarationImpl();
    return parameterDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalDeclaration createLocalDeclaration()
  {
    LocalDeclarationImpl localDeclaration = new LocalDeclarationImpl();
    return localDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalDeclaration createGlobalDeclaration()
  {
    GlobalDeclarationImpl globalDeclaration = new GlobalDeclarationImpl();
    return globalDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayLiteral createArrayLiteral()
  {
    ArrayLiteralImpl arrayLiteral = new ArrayLiteralImpl();
    return arrayLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReferenceable createVariableReferenceable()
  {
    VariableReferenceableImpl variableReferenceable = new VariableReferenceableImpl();
    return variableReferenceable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionCall createFunctionCall()
  {
    FunctionCallImpl functionCall = new FunctionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Include createInclude()
  {
    IncludeImpl include = new IncludeImpl();
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyStatement createEmptyStatement()
  {
    EmptyStatementImpl emptyStatement = new EmptyStatementImpl();
    return emptyStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedEquals createTypedEquals()
  {
    TypedEqualsImpl typedEquals = new TypedEqualsImpl();
    return typedEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equals createEquals()
  {
    EqualsImpl equals = new EqualsImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedDifferent createTypedDifferent()
  {
    TypedDifferentImpl typedDifferent = new TypedDifferentImpl();
    return typedDifferent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Different createDifferent()
  {
    DifferentImpl different = new DifferentImpl();
    return different;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LessOrEquals createLessOrEquals()
  {
    LessOrEqualsImpl lessOrEquals = new LessOrEqualsImpl();
    return lessOrEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Less createLess()
  {
    LessImpl less = new LessImpl();
    return less;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoreOrEquals createMoreOrEquals()
  {
    MoreOrEqualsImpl moreOrEquals = new MoreOrEqualsImpl();
    return moreOrEquals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public More createMore()
  {
    MoreImpl more = new MoreImpl();
    return more;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RealLiteral createRealLiteral()
  {
    RealLiteralImpl realLiteral = new RealLiteralImpl();
    return realLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral createIntLiteral()
  {
    IntLiteralImpl intLiteral = new IntLiteralImpl();
    return intLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeekPackage getLeekPackage()
  {
    return (LeekPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LeekPackage getPackage()
  {
    return LeekPackage.eINSTANCE;
  }

} //LeekFactoryImpl
