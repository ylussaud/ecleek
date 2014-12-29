/**
 */
package org.processus.ecleek.leek.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.processus.ecleek.leek.AffectationDecrement;
import org.processus.ecleek.leek.Expression;
import org.processus.ecleek.leek.LeekPackage;
import org.processus.ecleek.leek.VariableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Affectation Decrement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.impl.AffectationDecrementImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.AffectationDecrementImpl#getDecrement <em>Decrement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AffectationDecrementImpl extends AffectationStatementImpl implements AffectationDecrement
{
  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected VariableReference variable;

  /**
   * The cached value of the '{@link #getDecrement() <em>Decrement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecrement()
   * @generated
   * @ordered
   */
  protected Expression decrement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AffectationDecrementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LeekPackage.Literals.AFFECTATION_DECREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(VariableReference newVariable, NotificationChain msgs)
  {
    VariableReference oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeekPackage.AFFECTATION_DECREMENT__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(VariableReference newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeekPackage.AFFECTATION_DECREMENT__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeekPackage.AFFECTATION_DECREMENT__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.AFFECTATION_DECREMENT__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDecrement()
  {
    return decrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDecrement(Expression newDecrement, NotificationChain msgs)
  {
    Expression oldDecrement = decrement;
    decrement = newDecrement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeekPackage.AFFECTATION_DECREMENT__DECREMENT, oldDecrement, newDecrement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecrement(Expression newDecrement)
  {
    if (newDecrement != decrement)
    {
      NotificationChain msgs = null;
      if (decrement != null)
        msgs = ((InternalEObject)decrement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeekPackage.AFFECTATION_DECREMENT__DECREMENT, null, msgs);
      if (newDecrement != null)
        msgs = ((InternalEObject)newDecrement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeekPackage.AFFECTATION_DECREMENT__DECREMENT, null, msgs);
      msgs = basicSetDecrement(newDecrement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.AFFECTATION_DECREMENT__DECREMENT, newDecrement, newDecrement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LeekPackage.AFFECTATION_DECREMENT__VARIABLE:
        return basicSetVariable(null, msgs);
      case LeekPackage.AFFECTATION_DECREMENT__DECREMENT:
        return basicSetDecrement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LeekPackage.AFFECTATION_DECREMENT__VARIABLE:
        return getVariable();
      case LeekPackage.AFFECTATION_DECREMENT__DECREMENT:
        return getDecrement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LeekPackage.AFFECTATION_DECREMENT__VARIABLE:
        setVariable((VariableReference)newValue);
        return;
      case LeekPackage.AFFECTATION_DECREMENT__DECREMENT:
        setDecrement((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LeekPackage.AFFECTATION_DECREMENT__VARIABLE:
        setVariable((VariableReference)null);
        return;
      case LeekPackage.AFFECTATION_DECREMENT__DECREMENT:
        setDecrement((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LeekPackage.AFFECTATION_DECREMENT__VARIABLE:
        return variable != null;
      case LeekPackage.AFFECTATION_DECREMENT__DECREMENT:
        return decrement != null;
    }
    return super.eIsSet(featureID);
  }

} //AffectationDecrementImpl
