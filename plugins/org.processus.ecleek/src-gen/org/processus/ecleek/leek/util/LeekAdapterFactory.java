/**
 */
package org.processus.ecleek.leek.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.processus.ecleek.leek.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.processus.ecleek.leek.LeekPackage
 * @generated
 */
public class LeekAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LeekPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeekAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LeekPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeekSwitch<Adapter> modelSwitch =
    new LeekSwitch<Adapter>()
    {
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseStatementBlock(StatementBlock object)
      {
        return createStatementBlockAdapter();
      }
      @Override
      public Adapter caseAffectation(Affectation object)
      {
        return createAffectationAdapter();
      }
      @Override
      public Adapter caseIf(If object)
      {
        return createIfAdapter();
      }
      @Override
      public Adapter caseWhile(While object)
      {
        return createWhileAdapter();
      }
      @Override
      public Adapter caseFor(For object)
      {
        return createForAdapter();
      }
      @Override
      public Adapter caseForIterator(ForIterator object)
      {
        return createForIteratorAdapter();
      }
      @Override
      public Adapter caseEachIterator(EachIterator object)
      {
        return createEachIteratorAdapter();
      }
      @Override
      public Adapter caseVariableIterator(VariableIterator object)
      {
        return createVariableIteratorAdapter();
      }
      @Override
      public Adapter caseFunctionDeclaration(FunctionDeclaration object)
      {
        return createFunctionDeclarationAdapter();
      }
      @Override
      public Adapter caseParameterDeclaration(ParameterDeclaration object)
      {
        return createParameterDeclarationAdapter();
      }
      @Override
      public Adapter caseLocalDeclaration(LocalDeclaration object)
      {
        return createLocalDeclarationAdapter();
      }
      @Override
      public Adapter caseGlobalDeclaration(GlobalDeclaration object)
      {
        return createGlobalDeclarationAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseArrayLiteral(ArrayLiteral object)
      {
        return createArrayLiteralAdapter();
      }
      @Override
      public Adapter caseVariableReference(VariableReference object)
      {
        return createVariableReferenceAdapter();
      }
      @Override
      public Adapter caseFunctionCall(FunctionCall object)
      {
        return createFunctionCallAdapter();
      }
      @Override
      public Adapter caseTypedEquals(TypedEquals object)
      {
        return createTypedEqualsAdapter();
      }
      @Override
      public Adapter caseEquals(Equals object)
      {
        return createEqualsAdapter();
      }
      @Override
      public Adapter caseTypedDifferent(TypedDifferent object)
      {
        return createTypedDifferentAdapter();
      }
      @Override
      public Adapter caseDifferent(Different object)
      {
        return createDifferentAdapter();
      }
      @Override
      public Adapter caseLessOrEquals(LessOrEquals object)
      {
        return createLessOrEqualsAdapter();
      }
      @Override
      public Adapter caseLess(Less object)
      {
        return createLessAdapter();
      }
      @Override
      public Adapter caseMoreOrEquals(MoreOrEquals object)
      {
        return createMoreOrEqualsAdapter();
      }
      @Override
      public Adapter caseMore(More object)
      {
        return createMoreAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMinus(Minus object)
      {
        return createMinusAdapter();
      }
      @Override
      public Adapter caseMulti(Multi object)
      {
        return createMultiAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseRealLiteral(RealLiteral object)
      {
        return createRealLiteralAdapter();
      }
      @Override
      public Adapter caseIntLiteral(IntLiteral object)
      {
        return createIntLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.StatementBlock <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.StatementBlock
   * @generated
   */
  public Adapter createStatementBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.Affectation <em>Affectation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.Affectation
   * @generated
   */
  public Adapter createAffectationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.If <em>If</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.If
   * @generated
   */
  public Adapter createIfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.While <em>While</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.While
   * @generated
   */
  public Adapter createWhileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.For <em>For</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.For
   * @generated
   */
  public Adapter createForAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.ForIterator <em>For Iterator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.ForIterator
   * @generated
   */
  public Adapter createForIteratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.EachIterator <em>Each Iterator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.EachIterator
   * @generated
   */
  public Adapter createEachIteratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.VariableIterator <em>Variable Iterator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.VariableIterator
   * @generated
   */
  public Adapter createVariableIteratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.FunctionDeclaration
   * @generated
   */
  public Adapter createFunctionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.ParameterDeclaration <em>Parameter Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.ParameterDeclaration
   * @generated
   */
  public Adapter createParameterDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.LocalDeclaration <em>Local Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.LocalDeclaration
   * @generated
   */
  public Adapter createLocalDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.GlobalDeclaration <em>Global Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.GlobalDeclaration
   * @generated
   */
  public Adapter createGlobalDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.ArrayLiteral <em>Array Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.ArrayLiteral
   * @generated
   */
  public Adapter createArrayLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.VariableReference <em>Variable Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.VariableReference
   * @generated
   */
  public Adapter createVariableReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.FunctionCall <em>Function Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.FunctionCall
   * @generated
   */
  public Adapter createFunctionCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.TypedEquals <em>Typed Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.TypedEquals
   * @generated
   */
  public Adapter createTypedEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.Equals <em>Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.Equals
   * @generated
   */
  public Adapter createEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.TypedDifferent <em>Typed Different</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.TypedDifferent
   * @generated
   */
  public Adapter createTypedDifferentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.Different <em>Different</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.Different
   * @generated
   */
  public Adapter createDifferentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.LessOrEquals <em>Less Or Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.LessOrEquals
   * @generated
   */
  public Adapter createLessOrEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.Less <em>Less</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.Less
   * @generated
   */
  public Adapter createLessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.MoreOrEquals <em>More Or Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.MoreOrEquals
   * @generated
   */
  public Adapter createMoreOrEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.More <em>More</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.More
   * @generated
   */
  public Adapter createMoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.Minus
   * @generated
   */
  public Adapter createMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.Multi
   * @generated
   */
  public Adapter createMultiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.RealLiteral <em>Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.RealLiteral
   * @generated
   */
  public Adapter createRealLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.IntLiteral <em>Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.IntLiteral
   * @generated
   */
  public Adapter createIntLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.processus.ecleek.leek.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.processus.ecleek.leek.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LeekAdapterFactory
