/**
 */
package org.processus.ecleek.leek.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.processus.ecleek.leek.Affectation;
import org.processus.ecleek.leek.Expression;
import org.processus.ecleek.leek.LeekPackage;
import org.processus.ecleek.leek.VariableIterator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.impl.VariableIteratorImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.VariableIteratorImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.VariableIteratorImpl#getIncrement <em>Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableIteratorImpl extends ForIteratorImpl implements VariableIterator
{
  /**
   * The cached value of the '{@link #getInitialization() <em>Initialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialization()
   * @generated
   * @ordered
   */
  protected Affectation initialization;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Expression condition;

  /**
   * The cached value of the '{@link #getIncrement() <em>Increment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncrement()
   * @generated
   * @ordered
   */
  protected Expression increment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableIteratorImpl()
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
    return LeekPackage.Literals.VARIABLE_ITERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Affectation getInitialization()
  {
    return initialization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialization(Affectation newInitialization, NotificationChain msgs)
  {
    Affectation oldInitialization = initialization;
    initialization = newInitialization;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeekPackage.VARIABLE_ITERATOR__INITIALIZATION, oldInitialization, newInitialization);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialization(Affectation newInitialization)
  {
    if (newInitialization != initialization)
    {
      NotificationChain msgs = null;
      if (initialization != null)
        msgs = ((InternalEObject)initialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeekPackage.VARIABLE_ITERATOR__INITIALIZATION, null, msgs);
      if (newInitialization != null)
        msgs = ((InternalEObject)newInitialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeekPackage.VARIABLE_ITERATOR__INITIALIZATION, null, msgs);
      msgs = basicSetInitialization(newInitialization, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.VARIABLE_ITERATOR__INITIALIZATION, newInitialization, newInitialization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs)
  {
    Expression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeekPackage.VARIABLE_ITERATOR__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(Expression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeekPackage.VARIABLE_ITERATOR__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeekPackage.VARIABLE_ITERATOR__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.VARIABLE_ITERATOR__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getIncrement()
  {
    return increment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIncrement(Expression newIncrement, NotificationChain msgs)
  {
    Expression oldIncrement = increment;
    increment = newIncrement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeekPackage.VARIABLE_ITERATOR__INCREMENT, oldIncrement, newIncrement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncrement(Expression newIncrement)
  {
    if (newIncrement != increment)
    {
      NotificationChain msgs = null;
      if (increment != null)
        msgs = ((InternalEObject)increment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeekPackage.VARIABLE_ITERATOR__INCREMENT, null, msgs);
      if (newIncrement != null)
        msgs = ((InternalEObject)newIncrement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeekPackage.VARIABLE_ITERATOR__INCREMENT, null, msgs);
      msgs = basicSetIncrement(newIncrement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.VARIABLE_ITERATOR__INCREMENT, newIncrement, newIncrement));
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
      case LeekPackage.VARIABLE_ITERATOR__INITIALIZATION:
        return basicSetInitialization(null, msgs);
      case LeekPackage.VARIABLE_ITERATOR__CONDITION:
        return basicSetCondition(null, msgs);
      case LeekPackage.VARIABLE_ITERATOR__INCREMENT:
        return basicSetIncrement(null, msgs);
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
      case LeekPackage.VARIABLE_ITERATOR__INITIALIZATION:
        return getInitialization();
      case LeekPackage.VARIABLE_ITERATOR__CONDITION:
        return getCondition();
      case LeekPackage.VARIABLE_ITERATOR__INCREMENT:
        return getIncrement();
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
      case LeekPackage.VARIABLE_ITERATOR__INITIALIZATION:
        setInitialization((Affectation)newValue);
        return;
      case LeekPackage.VARIABLE_ITERATOR__CONDITION:
        setCondition((Expression)newValue);
        return;
      case LeekPackage.VARIABLE_ITERATOR__INCREMENT:
        setIncrement((Expression)newValue);
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
      case LeekPackage.VARIABLE_ITERATOR__INITIALIZATION:
        setInitialization((Affectation)null);
        return;
      case LeekPackage.VARIABLE_ITERATOR__CONDITION:
        setCondition((Expression)null);
        return;
      case LeekPackage.VARIABLE_ITERATOR__INCREMENT:
        setIncrement((Expression)null);
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
      case LeekPackage.VARIABLE_ITERATOR__INITIALIZATION:
        return initialization != null;
      case LeekPackage.VARIABLE_ITERATOR__CONDITION:
        return condition != null;
      case LeekPackage.VARIABLE_ITERATOR__INCREMENT:
        return increment != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableIteratorImpl
