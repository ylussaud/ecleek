/**
 */
package org.processus.ecleek.leek;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.processus.ecleek.leek.LeekFactory
 * @model kind="package"
 * @generated
 */
public interface LeekPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "leek";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.processus.org/ecleek/Leek";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "leek";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LeekPackage eINSTANCE = org.processus.ecleek.leek.impl.LeekPackageImpl.init();

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.ScriptImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.ToplevelStatementImpl <em>Toplevel Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.ToplevelStatementImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getToplevelStatement()
   * @generated
   */
  int TOPLEVEL_STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Toplevel Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOPLEVEL_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.StatementImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 2;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = TOPLEVEL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.IterationStatementImpl <em>Iteration Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.IterationStatementImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getIterationStatement()
   * @generated
   */
  int ITERATION_STATEMENT = 3;

  /**
   * The number of structural features of the '<em>Iteration Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.FunctionStatementImpl <em>Function Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.FunctionStatementImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getFunctionStatement()
   * @generated
   */
  int FUNCTION_STATEMENT = 4;

  /**
   * The number of structural features of the '<em>Function Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.FunctionStatementBlockImpl <em>Function Statement Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.FunctionStatementBlockImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getFunctionStatementBlock()
   * @generated
   */
  int FUNCTION_STATEMENT_BLOCK = 5;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_STATEMENT_BLOCK__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Function Statement Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_STATEMENT_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.BreakStatementImpl <em>Break Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.BreakStatementImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getBreakStatement()
   * @generated
   */
  int BREAK_STATEMENT = 6;

  /**
   * The number of structural features of the '<em>Break Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BREAK_STATEMENT_FEATURE_COUNT = ITERATION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.ContinueStatementImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getContinueStatement()
   * @generated
   */
  int CONTINUE_STATEMENT = 7;

  /**
   * The number of structural features of the '<em>Continue Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUE_STATEMENT_FEATURE_COUNT = ITERATION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.StatementBlockImpl <em>Statement Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.StatementBlockImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getStatementBlock()
   * @generated
   */
  int STATEMENT_BLOCK = 8;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Statement Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.AffectationImpl <em>Affectation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.AffectationImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getAffectation()
   * @generated
   */
  int AFFECTATION = 9;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION__VARIABLE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION__VALUE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Affectation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFFECTATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.IfImpl <em>If</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.IfImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getIf()
   * @generated
   */
  int IF = 10;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__THEN = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF__ELSE = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.IterationImpl <em>Iteration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.IterationImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getIteration()
   * @generated
   */
  int ITERATION = 11;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION__STATEMENT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Iteration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITERATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.WhileImpl <em>While</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.WhileImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getWhile()
   * @generated
   */
  int WHILE = 12;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__STATEMENT = ITERATION__STATEMENT;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE__CONDITION = ITERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>While</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_FEATURE_COUNT = ITERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.ForImpl <em>For</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.ForImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getFor()
   * @generated
   */
  int FOR = 13;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__STATEMENT = ITERATION__STATEMENT;

  /**
   * The feature id for the '<em><b>Initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__INITIALIZER = ITERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__CONDITION = ITERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Increment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR__INCREMENT = ITERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_FEATURE_COUNT = ITERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.ForInImpl <em>For In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.ForInImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getForIn()
   * @generated
   */
  int FOR_IN = 14;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_IN__STATEMENT = ITERATION__STATEMENT;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_IN__KEY = ITERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_IN__VALUE = ITERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_IN__ARRAY = ITERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>For In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_IN_FEATURE_COUNT = ITERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.ForInitializerImpl <em>For Initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.ForInitializerImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getForInitializer()
   * @generated
   */
  int FOR_INITIALIZER = 16;

  /**
   * The number of structural features of the '<em>For Initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_INITIALIZER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.VariableReferenceImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getVariableReference()
   * @generated
   */
  int VARIABLE_REFERENCE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__NAME = FOR_INITIALIZER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__VARIABLE = FOR_INITIALIZER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE__DIMENSIONS = FOR_INITIALIZER_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Variable Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCE_FEATURE_COUNT = FOR_INITIALIZER_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.FunctionDeclarationImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getFunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__NAME = TOPLEVEL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__PARAMETERS = TOPLEVEL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__BODY = TOPLEVEL_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = TOPLEVEL_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.VariableReferenceableImpl <em>Variable Referenceable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.VariableReferenceableImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getVariableReferenceable()
   * @generated
   */
  int VARIABLE_REFERENCEABLE = 18;

  /**
   * The feature id for the '<em><b>By Adress</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCEABLE__BY_ADRESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCEABLE__NAME = 1;

  /**
   * The number of structural features of the '<em>Variable Referenceable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_REFERENCEABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.LocalDeclarationImpl <em>Local Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.LocalDeclarationImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getLocalDeclaration()
   * @generated
   */
  int LOCAL_DECLARATION = 19;

  /**
   * The feature id for the '<em><b>By Adress</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECLARATION__BY_ADRESS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECLARATION__NAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECLARATION__VARIABLES = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Local Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.GlobalDeclarationImpl <em>Global Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.GlobalDeclarationImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getGlobalDeclaration()
   * @generated
   */
  int GLOBAL_DECLARATION = 20;

  /**
   * The feature id for the '<em><b>By Adress</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_DECLARATION__BY_ADRESS = TOPLEVEL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_DECLARATION__NAME = TOPLEVEL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_DECLARATION__VARIABLES = TOPLEVEL_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Global Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_DECLARATION_FEATURE_COUNT = TOPLEVEL_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.VariableDeclarationImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.ExpressionImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 22;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.ArrayLiteralImpl <em>Array Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.ArrayLiteralImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getArrayLiteral()
   * @generated
   */
  int ARRAY_LITERAL = 23;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL__VALUES = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.FunctionCallImpl <em>Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.FunctionCallImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getFunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 24;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__FUNCTION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__ARGS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.ReturnStatementImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 25;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__VALUE = FUNCTION_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = FUNCTION_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.IncludeImpl <em>Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.IncludeImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getInclude()
   * @generated
   */
  int INCLUDE = 26;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__IMPORT_URI = TOPLEVEL_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Include</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FEATURE_COUNT = TOPLEVEL_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.EmptyStatementImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getEmptyStatement()
   * @generated
   */
  int EMPTY_STATEMENT = 27;

  /**
   * The number of structural features of the '<em>Empty Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.TypedEqualsImpl <em>Typed Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.TypedEqualsImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getTypedEquals()
   * @generated
   */
  int TYPED_EQUALS = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_EQUALS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_EQUALS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Typed Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_EQUALS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.EqualsImpl <em>Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.EqualsImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getEquals()
   * @generated
   */
  int EQUALS = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.TypedDifferentImpl <em>Typed Different</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.TypedDifferentImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getTypedDifferent()
   * @generated
   */
  int TYPED_DIFFERENT = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_DIFFERENT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_DIFFERENT__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Typed Different</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_DIFFERENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.DifferentImpl <em>Different</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.DifferentImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getDifferent()
   * @generated
   */
  int DIFFERENT = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENT__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENT__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Different</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIFFERENT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.LessOrEqualsImpl <em>Less Or Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.LessOrEqualsImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getLessOrEquals()
   * @generated
   */
  int LESS_OR_EQUALS = 32;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_OR_EQUALS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_OR_EQUALS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Less Or Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_OR_EQUALS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.LessImpl <em>Less</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.LessImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getLess()
   * @generated
   */
  int LESS = 33;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Less</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.MoreOrEqualsImpl <em>More Or Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.MoreOrEqualsImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getMoreOrEquals()
   * @generated
   */
  int MORE_OR_EQUALS = 34;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_OR_EQUALS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_OR_EQUALS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>More Or Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_OR_EQUALS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.MoreImpl <em>More</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.MoreImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getMore()
   * @generated
   */
  int MORE = 35;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>More</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MORE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.PlusImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 36;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.MinusImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getMinus()
   * @generated
   */
  int MINUS = 37;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.MultiImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 38;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.DivImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getDiv()
   * @generated
   */
  int DIV = 39;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.RealLiteralImpl <em>Real Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.RealLiteralImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getRealLiteral()
   * @generated
   */
  int REAL_LITERAL = 40;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.IntLiteralImpl <em>Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.IntLiteralImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getIntLiteral()
   * @generated
   */
  int INT_LITERAL = 41;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.StringLiteralImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 42;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.NullLiteralImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 43;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.FalseLiteralImpl <em>False Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.FalseLiteralImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getFalseLiteral()
   * @generated
   */
  int FALSE_LITERAL = 44;

  /**
   * The number of structural features of the '<em>False Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FALSE_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.processus.ecleek.leek.impl.TrueLiteralImpl <em>True Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.processus.ecleek.leek.impl.TrueLiteralImpl
   * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getTrueLiteral()
   * @generated
   */
  int TRUE_LITERAL = 45;

  /**
   * The number of structural features of the '<em>True Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRUE_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see org.processus.ecleek.leek.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the containment reference list '{@link org.processus.ecleek.leek.Script#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.processus.ecleek.leek.Script#getStatements()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Statements();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.ToplevelStatement <em>Toplevel Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Toplevel Statement</em>'.
   * @see org.processus.ecleek.leek.ToplevelStatement
   * @generated
   */
  EClass getToplevelStatement();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.processus.ecleek.leek.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.IterationStatement <em>Iteration Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iteration Statement</em>'.
   * @see org.processus.ecleek.leek.IterationStatement
   * @generated
   */
  EClass getIterationStatement();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.FunctionStatement <em>Function Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Statement</em>'.
   * @see org.processus.ecleek.leek.FunctionStatement
   * @generated
   */
  EClass getFunctionStatement();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.FunctionStatementBlock <em>Function Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Statement Block</em>'.
   * @see org.processus.ecleek.leek.FunctionStatementBlock
   * @generated
   */
  EClass getFunctionStatementBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.processus.ecleek.leek.FunctionStatementBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.processus.ecleek.leek.FunctionStatementBlock#getStatements()
   * @see #getFunctionStatementBlock()
   * @generated
   */
  EReference getFunctionStatementBlock_Statements();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.BreakStatement <em>Break Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Break Statement</em>'.
   * @see org.processus.ecleek.leek.BreakStatement
   * @generated
   */
  EClass getBreakStatement();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.ContinueStatement <em>Continue Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Continue Statement</em>'.
   * @see org.processus.ecleek.leek.ContinueStatement
   * @generated
   */
  EClass getContinueStatement();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.StatementBlock <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement Block</em>'.
   * @see org.processus.ecleek.leek.StatementBlock
   * @generated
   */
  EClass getStatementBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.processus.ecleek.leek.StatementBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.processus.ecleek.leek.StatementBlock#getStatements()
   * @see #getStatementBlock()
   * @generated
   */
  EReference getStatementBlock_Statements();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Affectation <em>Affectation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Affectation</em>'.
   * @see org.processus.ecleek.leek.Affectation
   * @generated
   */
  EClass getAffectation();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Affectation#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.processus.ecleek.leek.Affectation#getVariable()
   * @see #getAffectation()
   * @generated
   */
  EReference getAffectation_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Affectation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.processus.ecleek.leek.Affectation#getValue()
   * @see #getAffectation()
   * @generated
   */
  EReference getAffectation_Value();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If</em>'.
   * @see org.processus.ecleek.leek.If
   * @generated
   */
  EClass getIf();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.If#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.processus.ecleek.leek.If#getCondition()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.If#getThen <em>Then</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then</em>'.
   * @see org.processus.ecleek.leek.If#getThen()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Then();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.If#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see org.processus.ecleek.leek.If#getElse()
   * @see #getIf()
   * @generated
   */
  EReference getIf_Else();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Iteration <em>Iteration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Iteration</em>'.
   * @see org.processus.ecleek.leek.Iteration
   * @generated
   */
  EClass getIteration();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Iteration#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.processus.ecleek.leek.Iteration#getStatement()
   * @see #getIteration()
   * @generated
   */
  EReference getIteration_Statement();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While</em>'.
   * @see org.processus.ecleek.leek.While
   * @generated
   */
  EClass getWhile();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.While#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.processus.ecleek.leek.While#getCondition()
   * @see #getWhile()
   * @generated
   */
  EReference getWhile_Condition();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For</em>'.
   * @see org.processus.ecleek.leek.For
   * @generated
   */
  EClass getFor();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.For#getInitializer <em>Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initializer</em>'.
   * @see org.processus.ecleek.leek.For#getInitializer()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Initializer();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.For#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.processus.ecleek.leek.For#getCondition()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.For#getIncrement <em>Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Increment</em>'.
   * @see org.processus.ecleek.leek.For#getIncrement()
   * @see #getFor()
   * @generated
   */
  EReference getFor_Increment();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.ForIn <em>For In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For In</em>'.
   * @see org.processus.ecleek.leek.ForIn
   * @generated
   */
  EClass getForIn();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.ForIn#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see org.processus.ecleek.leek.ForIn#getKey()
   * @see #getForIn()
   * @generated
   */
  EReference getForIn_Key();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.ForIn#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.processus.ecleek.leek.ForIn#getValue()
   * @see #getForIn()
   * @generated
   */
  EReference getForIn_Value();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.ForIn#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see org.processus.ecleek.leek.ForIn#getArray()
   * @see #getForIn()
   * @generated
   */
  EReference getForIn_Array();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Reference</em>'.
   * @see org.processus.ecleek.leek.VariableReference
   * @generated
   */
  EClass getVariableReference();

  /**
   * Returns the meta object for the attribute '{@link org.processus.ecleek.leek.VariableReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.processus.ecleek.leek.VariableReference#getName()
   * @see #getVariableReference()
   * @generated
   */
  EAttribute getVariableReference_Name();

  /**
   * Returns the meta object for the reference '{@link org.processus.ecleek.leek.VariableReference#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see org.processus.ecleek.leek.VariableReference#getVariable()
   * @see #getVariableReference()
   * @generated
   */
  EReference getVariableReference_Variable();

  /**
   * Returns the meta object for the containment reference list '{@link org.processus.ecleek.leek.VariableReference#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimensions</em>'.
   * @see org.processus.ecleek.leek.VariableReference#getDimensions()
   * @see #getVariableReference()
   * @generated
   */
  EReference getVariableReference_Dimensions();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.ForInitializer <em>For Initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Initializer</em>'.
   * @see org.processus.ecleek.leek.ForInitializer
   * @generated
   */
  EClass getForInitializer();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Declaration</em>'.
   * @see org.processus.ecleek.leek.FunctionDeclaration
   * @generated
   */
  EClass getFunctionDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.processus.ecleek.leek.FunctionDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.processus.ecleek.leek.FunctionDeclaration#getName()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EAttribute getFunctionDeclaration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.processus.ecleek.leek.FunctionDeclaration#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.processus.ecleek.leek.FunctionDeclaration#getParameters()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.FunctionDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.processus.ecleek.leek.FunctionDeclaration#getBody()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Body();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.VariableReferenceable <em>Variable Referenceable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Referenceable</em>'.
   * @see org.processus.ecleek.leek.VariableReferenceable
   * @generated
   */
  EClass getVariableReferenceable();

  /**
   * Returns the meta object for the attribute '{@link org.processus.ecleek.leek.VariableReferenceable#isByAdress <em>By Adress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>By Adress</em>'.
   * @see org.processus.ecleek.leek.VariableReferenceable#isByAdress()
   * @see #getVariableReferenceable()
   * @generated
   */
  EAttribute getVariableReferenceable_ByAdress();

  /**
   * Returns the meta object for the attribute '{@link org.processus.ecleek.leek.VariableReferenceable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.processus.ecleek.leek.VariableReferenceable#getName()
   * @see #getVariableReferenceable()
   * @generated
   */
  EAttribute getVariableReferenceable_Name();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.LocalDeclaration <em>Local Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Declaration</em>'.
   * @see org.processus.ecleek.leek.LocalDeclaration
   * @generated
   */
  EClass getLocalDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.processus.ecleek.leek.LocalDeclaration#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.processus.ecleek.leek.LocalDeclaration#getVariables()
   * @see #getLocalDeclaration()
   * @generated
   */
  EReference getLocalDeclaration_Variables();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.GlobalDeclaration <em>Global Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Declaration</em>'.
   * @see org.processus.ecleek.leek.GlobalDeclaration
   * @generated
   */
  EClass getGlobalDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.processus.ecleek.leek.GlobalDeclaration#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.processus.ecleek.leek.GlobalDeclaration#getVariables()
   * @see #getGlobalDeclaration()
   * @generated
   */
  EReference getGlobalDeclaration_Variables();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see org.processus.ecleek.leek.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link org.processus.ecleek.leek.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.processus.ecleek.leek.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.VariableDeclaration#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.processus.ecleek.leek.VariableDeclaration#getValue()
   * @see #getVariableDeclaration()
   * @generated
   */
  EReference getVariableDeclaration_Value();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.processus.ecleek.leek.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.ArrayLiteral <em>Array Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Literal</em>'.
   * @see org.processus.ecleek.leek.ArrayLiteral
   * @generated
   */
  EClass getArrayLiteral();

  /**
   * Returns the meta object for the containment reference list '{@link org.processus.ecleek.leek.ArrayLiteral#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.processus.ecleek.leek.ArrayLiteral#getValues()
   * @see #getArrayLiteral()
   * @generated
   */
  EReference getArrayLiteral_Values();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call</em>'.
   * @see org.processus.ecleek.leek.FunctionCall
   * @generated
   */
  EClass getFunctionCall();

  /**
   * Returns the meta object for the reference '{@link org.processus.ecleek.leek.FunctionCall#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see org.processus.ecleek.leek.FunctionCall#getFunction()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Function();

  /**
   * Returns the meta object for the containment reference list '{@link org.processus.ecleek.leek.FunctionCall#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.processus.ecleek.leek.FunctionCall#getArgs()
   * @see #getFunctionCall()
   * @generated
   */
  EReference getFunctionCall_Args();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see org.processus.ecleek.leek.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.ReturnStatement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.processus.ecleek.leek.ReturnStatement#getValue()
   * @see #getReturnStatement()
   * @generated
   */
  EReference getReturnStatement_Value();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include</em>'.
   * @see org.processus.ecleek.leek.Include
   * @generated
   */
  EClass getInclude();

  /**
   * Returns the meta object for the attribute '{@link org.processus.ecleek.leek.Include#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.processus.ecleek.leek.Include#getImportURI()
   * @see #getInclude()
   * @generated
   */
  EAttribute getInclude_ImportURI();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.EmptyStatement <em>Empty Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Statement</em>'.
   * @see org.processus.ecleek.leek.EmptyStatement
   * @generated
   */
  EClass getEmptyStatement();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.TypedEquals <em>Typed Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Equals</em>'.
   * @see org.processus.ecleek.leek.TypedEquals
   * @generated
   */
  EClass getTypedEquals();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.TypedEquals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.processus.ecleek.leek.TypedEquals#getLeft()
   * @see #getTypedEquals()
   * @generated
   */
  EReference getTypedEquals_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.TypedEquals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.processus.ecleek.leek.TypedEquals#getRight()
   * @see #getTypedEquals()
   * @generated
   */
  EReference getTypedEquals_Right();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Equals <em>Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals</em>'.
   * @see org.processus.ecleek.leek.Equals
   * @generated
   */
  EClass getEquals();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Equals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.processus.ecleek.leek.Equals#getLeft()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Equals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.processus.ecleek.leek.Equals#getRight()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Right();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.TypedDifferent <em>Typed Different</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Different</em>'.
   * @see org.processus.ecleek.leek.TypedDifferent
   * @generated
   */
  EClass getTypedDifferent();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.TypedDifferent#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.processus.ecleek.leek.TypedDifferent#getLeft()
   * @see #getTypedDifferent()
   * @generated
   */
  EReference getTypedDifferent_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.TypedDifferent#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.processus.ecleek.leek.TypedDifferent#getRight()
   * @see #getTypedDifferent()
   * @generated
   */
  EReference getTypedDifferent_Right();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Different <em>Different</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Different</em>'.
   * @see org.processus.ecleek.leek.Different
   * @generated
   */
  EClass getDifferent();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Different#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.processus.ecleek.leek.Different#getLeft()
   * @see #getDifferent()
   * @generated
   */
  EReference getDifferent_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Different#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.processus.ecleek.leek.Different#getRight()
   * @see #getDifferent()
   * @generated
   */
  EReference getDifferent_Right();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.LessOrEquals <em>Less Or Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less Or Equals</em>'.
   * @see org.processus.ecleek.leek.LessOrEquals
   * @generated
   */
  EClass getLessOrEquals();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.LessOrEquals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.processus.ecleek.leek.LessOrEquals#getLeft()
   * @see #getLessOrEquals()
   * @generated
   */
  EReference getLessOrEquals_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.LessOrEquals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.processus.ecleek.leek.LessOrEquals#getRight()
   * @see #getLessOrEquals()
   * @generated
   */
  EReference getLessOrEquals_Right();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Less <em>Less</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Less</em>'.
   * @see org.processus.ecleek.leek.Less
   * @generated
   */
  EClass getLess();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Less#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.processus.ecleek.leek.Less#getLeft()
   * @see #getLess()
   * @generated
   */
  EReference getLess_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Less#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.processus.ecleek.leek.Less#getRight()
   * @see #getLess()
   * @generated
   */
  EReference getLess_Right();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.MoreOrEquals <em>More Or Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>More Or Equals</em>'.
   * @see org.processus.ecleek.leek.MoreOrEquals
   * @generated
   */
  EClass getMoreOrEquals();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.MoreOrEquals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.processus.ecleek.leek.MoreOrEquals#getLeft()
   * @see #getMoreOrEquals()
   * @generated
   */
  EReference getMoreOrEquals_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.MoreOrEquals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.processus.ecleek.leek.MoreOrEquals#getRight()
   * @see #getMoreOrEquals()
   * @generated
   */
  EReference getMoreOrEquals_Right();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.More <em>More</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>More</em>'.
   * @see org.processus.ecleek.leek.More
   * @generated
   */
  EClass getMore();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.More#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.processus.ecleek.leek.More#getLeft()
   * @see #getMore()
   * @generated
   */
  EReference getMore_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.More#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.processus.ecleek.leek.More#getRight()
   * @see #getMore()
   * @generated
   */
  EReference getMore_Right();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see org.processus.ecleek.leek.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.processus.ecleek.leek.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.processus.ecleek.leek.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.processus.ecleek.leek.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.processus.ecleek.leek.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.processus.ecleek.leek.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see org.processus.ecleek.leek.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.processus.ecleek.leek.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.processus.ecleek.leek.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see org.processus.ecleek.leek.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Div#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.processus.ecleek.leek.Div#getLeft()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.processus.ecleek.leek.Div#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.processus.ecleek.leek.Div#getRight()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Right();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.RealLiteral <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Literal</em>'.
   * @see org.processus.ecleek.leek.RealLiteral
   * @generated
   */
  EClass getRealLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.processus.ecleek.leek.RealLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.processus.ecleek.leek.RealLiteral#getValue()
   * @see #getRealLiteral()
   * @generated
   */
  EAttribute getRealLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Literal</em>'.
   * @see org.processus.ecleek.leek.IntLiteral
   * @generated
   */
  EClass getIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.processus.ecleek.leek.IntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.processus.ecleek.leek.IntLiteral#getValue()
   * @see #getIntLiteral()
   * @generated
   */
  EAttribute getIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.processus.ecleek.leek.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.processus.ecleek.leek.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.processus.ecleek.leek.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see org.processus.ecleek.leek.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.FalseLiteral <em>False Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>False Literal</em>'.
   * @see org.processus.ecleek.leek.FalseLiteral
   * @generated
   */
  EClass getFalseLiteral();

  /**
   * Returns the meta object for class '{@link org.processus.ecleek.leek.TrueLiteral <em>True Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>True Literal</em>'.
   * @see org.processus.ecleek.leek.TrueLiteral
   * @generated
   */
  EClass getTrueLiteral();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LeekFactory getLeekFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.ScriptImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__STATEMENTS = eINSTANCE.getScript_Statements();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.ToplevelStatementImpl <em>Toplevel Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.ToplevelStatementImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getToplevelStatement()
     * @generated
     */
    EClass TOPLEVEL_STATEMENT = eINSTANCE.getToplevelStatement();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.StatementImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.IterationStatementImpl <em>Iteration Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.IterationStatementImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getIterationStatement()
     * @generated
     */
    EClass ITERATION_STATEMENT = eINSTANCE.getIterationStatement();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.FunctionStatementImpl <em>Function Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.FunctionStatementImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getFunctionStatement()
     * @generated
     */
    EClass FUNCTION_STATEMENT = eINSTANCE.getFunctionStatement();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.FunctionStatementBlockImpl <em>Function Statement Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.FunctionStatementBlockImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getFunctionStatementBlock()
     * @generated
     */
    EClass FUNCTION_STATEMENT_BLOCK = eINSTANCE.getFunctionStatementBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_STATEMENT_BLOCK__STATEMENTS = eINSTANCE.getFunctionStatementBlock_Statements();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.BreakStatementImpl <em>Break Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.BreakStatementImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getBreakStatement()
     * @generated
     */
    EClass BREAK_STATEMENT = eINSTANCE.getBreakStatement();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.ContinueStatementImpl <em>Continue Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.ContinueStatementImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getContinueStatement()
     * @generated
     */
    EClass CONTINUE_STATEMENT = eINSTANCE.getContinueStatement();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.StatementBlockImpl <em>Statement Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.StatementBlockImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getStatementBlock()
     * @generated
     */
    EClass STATEMENT_BLOCK = eINSTANCE.getStatementBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_BLOCK__STATEMENTS = eINSTANCE.getStatementBlock_Statements();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.AffectationImpl <em>Affectation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.AffectationImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getAffectation()
     * @generated
     */
    EClass AFFECTATION = eINSTANCE.getAffectation();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFFECTATION__VARIABLE = eINSTANCE.getAffectation_Variable();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFFECTATION__VALUE = eINSTANCE.getAffectation_Value();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.IfImpl <em>If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.IfImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getIf()
     * @generated
     */
    EClass IF = eINSTANCE.getIf();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__CONDITION = eINSTANCE.getIf_Condition();

    /**
     * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__THEN = eINSTANCE.getIf_Then();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF__ELSE = eINSTANCE.getIf_Else();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.IterationImpl <em>Iteration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.IterationImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getIteration()
     * @generated
     */
    EClass ITERATION = eINSTANCE.getIteration();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITERATION__STATEMENT = eINSTANCE.getIteration_Statement();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.WhileImpl <em>While</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.WhileImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getWhile()
     * @generated
     */
    EClass WHILE = eINSTANCE.getWhile();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE__CONDITION = eINSTANCE.getWhile_Condition();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.ForImpl <em>For</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.ForImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getFor()
     * @generated
     */
    EClass FOR = eINSTANCE.getFor();

    /**
     * The meta object literal for the '<em><b>Initializer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__INITIALIZER = eINSTANCE.getFor_Initializer();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__CONDITION = eINSTANCE.getFor_Condition();

    /**
     * The meta object literal for the '<em><b>Increment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR__INCREMENT = eINSTANCE.getFor_Increment();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.ForInImpl <em>For In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.ForInImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getForIn()
     * @generated
     */
    EClass FOR_IN = eINSTANCE.getForIn();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_IN__KEY = eINSTANCE.getForIn_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_IN__VALUE = eINSTANCE.getForIn_Value();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_IN__ARRAY = eINSTANCE.getForIn_Array();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.VariableReferenceImpl <em>Variable Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.VariableReferenceImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getVariableReference()
     * @generated
     */
    EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_REFERENCE__NAME = eINSTANCE.getVariableReference_Name();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REFERENCE__VARIABLE = eINSTANCE.getVariableReference_Variable();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_REFERENCE__DIMENSIONS = eINSTANCE.getVariableReference_Dimensions();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.ForInitializerImpl <em>For Initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.ForInitializerImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getForInitializer()
     * @generated
     */
    EClass FOR_INITIALIZER = eINSTANCE.getForInitializer();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.FunctionDeclarationImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getFunctionDeclaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__NAME = eINSTANCE.getFunctionDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__PARAMETERS = eINSTANCE.getFunctionDeclaration_Parameters();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__BODY = eINSTANCE.getFunctionDeclaration_Body();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.VariableReferenceableImpl <em>Variable Referenceable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.VariableReferenceableImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getVariableReferenceable()
     * @generated
     */
    EClass VARIABLE_REFERENCEABLE = eINSTANCE.getVariableReferenceable();

    /**
     * The meta object literal for the '<em><b>By Adress</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_REFERENCEABLE__BY_ADRESS = eINSTANCE.getVariableReferenceable_ByAdress();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_REFERENCEABLE__NAME = eINSTANCE.getVariableReferenceable_Name();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.LocalDeclarationImpl <em>Local Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.LocalDeclarationImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getLocalDeclaration()
     * @generated
     */
    EClass LOCAL_DECLARATION = eINSTANCE.getLocalDeclaration();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_DECLARATION__VARIABLES = eINSTANCE.getLocalDeclaration_Variables();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.GlobalDeclarationImpl <em>Global Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.GlobalDeclarationImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getGlobalDeclaration()
     * @generated
     */
    EClass GLOBAL_DECLARATION = eINSTANCE.getGlobalDeclaration();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_DECLARATION__VARIABLES = eINSTANCE.getGlobalDeclaration_Variables();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.VariableDeclarationImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__VALUE = eINSTANCE.getVariableDeclaration_Value();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.ExpressionImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.ArrayLiteralImpl <em>Array Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.ArrayLiteralImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getArrayLiteral()
     * @generated
     */
    EClass ARRAY_LITERAL = eINSTANCE.getArrayLiteral();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_LITERAL__VALUES = eINSTANCE.getArrayLiteral_Values();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.FunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.FunctionCallImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getFunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__FUNCTION = eINSTANCE.getFunctionCall_Function();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__ARGS = eINSTANCE.getFunctionCall_Args();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.ReturnStatementImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_STATEMENT__VALUE = eINSTANCE.getReturnStatement_Value();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.IncludeImpl <em>Include</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.IncludeImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getInclude()
     * @generated
     */
    EClass INCLUDE = eINSTANCE.getInclude();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE__IMPORT_URI = eINSTANCE.getInclude_ImportURI();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.EmptyStatementImpl <em>Empty Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.EmptyStatementImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getEmptyStatement()
     * @generated
     */
    EClass EMPTY_STATEMENT = eINSTANCE.getEmptyStatement();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.TypedEqualsImpl <em>Typed Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.TypedEqualsImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getTypedEquals()
     * @generated
     */
    EClass TYPED_EQUALS = eINSTANCE.getTypedEquals();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_EQUALS__LEFT = eINSTANCE.getTypedEquals_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_EQUALS__RIGHT = eINSTANCE.getTypedEquals_Right();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.EqualsImpl <em>Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.EqualsImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getEquals()
     * @generated
     */
    EClass EQUALS = eINSTANCE.getEquals();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__LEFT = eINSTANCE.getEquals_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__RIGHT = eINSTANCE.getEquals_Right();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.TypedDifferentImpl <em>Typed Different</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.TypedDifferentImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getTypedDifferent()
     * @generated
     */
    EClass TYPED_DIFFERENT = eINSTANCE.getTypedDifferent();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_DIFFERENT__LEFT = eINSTANCE.getTypedDifferent_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_DIFFERENT__RIGHT = eINSTANCE.getTypedDifferent_Right();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.DifferentImpl <em>Different</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.DifferentImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getDifferent()
     * @generated
     */
    EClass DIFFERENT = eINSTANCE.getDifferent();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIFFERENT__LEFT = eINSTANCE.getDifferent_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIFFERENT__RIGHT = eINSTANCE.getDifferent_Right();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.LessOrEqualsImpl <em>Less Or Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.LessOrEqualsImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getLessOrEquals()
     * @generated
     */
    EClass LESS_OR_EQUALS = eINSTANCE.getLessOrEquals();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS_OR_EQUALS__LEFT = eINSTANCE.getLessOrEquals_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS_OR_EQUALS__RIGHT = eINSTANCE.getLessOrEquals_Right();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.LessImpl <em>Less</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.LessImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getLess()
     * @generated
     */
    EClass LESS = eINSTANCE.getLess();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS__LEFT = eINSTANCE.getLess_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LESS__RIGHT = eINSTANCE.getLess_Right();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.MoreOrEqualsImpl <em>More Or Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.MoreOrEqualsImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getMoreOrEquals()
     * @generated
     */
    EClass MORE_OR_EQUALS = eINSTANCE.getMoreOrEquals();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MORE_OR_EQUALS__LEFT = eINSTANCE.getMoreOrEquals_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MORE_OR_EQUALS__RIGHT = eINSTANCE.getMoreOrEquals_Right();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.MoreImpl <em>More</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.MoreImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getMore()
     * @generated
     */
    EClass MORE = eINSTANCE.getMore();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MORE__LEFT = eINSTANCE.getMore_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MORE__RIGHT = eINSTANCE.getMore_Right();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.PlusImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.MinusImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.MultiImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__LEFT = eINSTANCE.getMulti_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__RIGHT = eINSTANCE.getMulti_Right();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.DivImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__LEFT = eINSTANCE.getDiv_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__RIGHT = eINSTANCE.getDiv_Right();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.RealLiteralImpl <em>Real Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.RealLiteralImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getRealLiteral()
     * @generated
     */
    EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_LITERAL__VALUE = eINSTANCE.getRealLiteral_Value();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.IntLiteralImpl <em>Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.IntLiteralImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getIntLiteral()
     * @generated
     */
    EClass INT_LITERAL = eINSTANCE.getIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.StringLiteralImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.NullLiteralImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.FalseLiteralImpl <em>False Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.FalseLiteralImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getFalseLiteral()
     * @generated
     */
    EClass FALSE_LITERAL = eINSTANCE.getFalseLiteral();

    /**
     * The meta object literal for the '{@link org.processus.ecleek.leek.impl.TrueLiteralImpl <em>True Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.processus.ecleek.leek.impl.TrueLiteralImpl
     * @see org.processus.ecleek.leek.impl.LeekPackageImpl#getTrueLiteral()
     * @generated
     */
    EClass TRUE_LITERAL = eINSTANCE.getTrueLiteral();

  }

} //LeekPackage
