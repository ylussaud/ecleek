/**
 */
package org.processus.ecleek.leek.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.processus.ecleek.leek.Affectation;
import org.processus.ecleek.leek.Expression;
import org.processus.ecleek.leek.ForIterator;
import org.processus.ecleek.leek.LeekPackage;
import org.processus.ecleek.leek.LocalDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.impl.ForIteratorImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.ForIteratorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.ForIteratorImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.ForIteratorImpl#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.ForIteratorImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.ForIteratorImpl#getIncrement <em>Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForIteratorImpl extends MinimalEObjectImpl.Container implements ForIterator
{
  /**
   * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey()
   * @generated
   * @ordered
   */
  protected LocalDeclaration key;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected LocalDeclaration value;

  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected Expression array;

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
  protected ForIteratorImpl()
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
    return LeekPackage.Literals.FOR_ITERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalDeclaration getKey()
  {
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKey(LocalDeclaration newKey, NotificationChain msgs)
  {
    LocalDeclaration oldKey = key;
    key = newKey;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeekPackage.FOR_ITERATOR__KEY, oldKey, newKey);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey(LocalDeclaration newKey)
  {
    if (newKey != key)
    {
      NotificationChain msgs = null;
      if (key != null)
        msgs = ((InternalEObject)key).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeekPackage.FOR_ITERATOR__KEY, null, msgs);
      if (newKey != null)
        msgs = ((InternalEObject)newKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeekPackage.FOR_ITERATOR__KEY, null, msgs);
      msgs = basicSetKey(newKey, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.FOR_ITERATOR__KEY, newKey, newKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalDeclaration getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(LocalDeclaration newValue, NotificationChain msgs)
  {
    LocalDeclaration oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeekPackage.FOR_ITERATOR__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(LocalDeclaration newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeekPackage.FOR_ITERATOR__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeekPackage.FOR_ITERATOR__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.FOR_ITERATOR__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getArray()
  {
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArray(Expression newArray, NotificationChain msgs)
  {
    Expression oldArray = array;
    array = newArray;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeekPackage.FOR_ITERATOR__ARRAY, oldArray, newArray);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArray(Expression newArray)
  {
    if (newArray != array)
    {
      NotificationChain msgs = null;
      if (array != null)
        msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeekPackage.FOR_ITERATOR__ARRAY, null, msgs);
      if (newArray != null)
        msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeekPackage.FOR_ITERATOR__ARRAY, null, msgs);
      msgs = basicSetArray(newArray, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.FOR_ITERATOR__ARRAY, newArray, newArray));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeekPackage.FOR_ITERATOR__INITIALIZATION, oldInitialization, newInitialization);
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
        msgs = ((InternalEObject)initialization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeekPackage.FOR_ITERATOR__INITIALIZATION, null, msgs);
      if (newInitialization != null)
        msgs = ((InternalEObject)newInitialization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeekPackage.FOR_ITERATOR__INITIALIZATION, null, msgs);
      msgs = basicSetInitialization(newInitialization, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.FOR_ITERATOR__INITIALIZATION, newInitialization, newInitialization));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeekPackage.FOR_ITERATOR__CONDITION, oldCondition, newCondition);
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
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeekPackage.FOR_ITERATOR__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeekPackage.FOR_ITERATOR__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.FOR_ITERATOR__CONDITION, newCondition, newCondition));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeekPackage.FOR_ITERATOR__INCREMENT, oldIncrement, newIncrement);
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
        msgs = ((InternalEObject)increment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeekPackage.FOR_ITERATOR__INCREMENT, null, msgs);
      if (newIncrement != null)
        msgs = ((InternalEObject)newIncrement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeekPackage.FOR_ITERATOR__INCREMENT, null, msgs);
      msgs = basicSetIncrement(newIncrement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.FOR_ITERATOR__INCREMENT, newIncrement, newIncrement));
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
      case LeekPackage.FOR_ITERATOR__KEY:
        return basicSetKey(null, msgs);
      case LeekPackage.FOR_ITERATOR__VALUE:
        return basicSetValue(null, msgs);
      case LeekPackage.FOR_ITERATOR__ARRAY:
        return basicSetArray(null, msgs);
      case LeekPackage.FOR_ITERATOR__INITIALIZATION:
        return basicSetInitialization(null, msgs);
      case LeekPackage.FOR_ITERATOR__CONDITION:
        return basicSetCondition(null, msgs);
      case LeekPackage.FOR_ITERATOR__INCREMENT:
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
      case LeekPackage.FOR_ITERATOR__KEY:
        return getKey();
      case LeekPackage.FOR_ITERATOR__VALUE:
        return getValue();
      case LeekPackage.FOR_ITERATOR__ARRAY:
        return getArray();
      case LeekPackage.FOR_ITERATOR__INITIALIZATION:
        return getInitialization();
      case LeekPackage.FOR_ITERATOR__CONDITION:
        return getCondition();
      case LeekPackage.FOR_ITERATOR__INCREMENT:
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
      case LeekPackage.FOR_ITERATOR__KEY:
        setKey((LocalDeclaration)newValue);
        return;
      case LeekPackage.FOR_ITERATOR__VALUE:
        setValue((LocalDeclaration)newValue);
        return;
      case LeekPackage.FOR_ITERATOR__ARRAY:
        setArray((Expression)newValue);
        return;
      case LeekPackage.FOR_ITERATOR__INITIALIZATION:
        setInitialization((Affectation)newValue);
        return;
      case LeekPackage.FOR_ITERATOR__CONDITION:
        setCondition((Expression)newValue);
        return;
      case LeekPackage.FOR_ITERATOR__INCREMENT:
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
      case LeekPackage.FOR_ITERATOR__KEY:
        setKey((LocalDeclaration)null);
        return;
      case LeekPackage.FOR_ITERATOR__VALUE:
        setValue((LocalDeclaration)null);
        return;
      case LeekPackage.FOR_ITERATOR__ARRAY:
        setArray((Expression)null);
        return;
      case LeekPackage.FOR_ITERATOR__INITIALIZATION:
        setInitialization((Affectation)null);
        return;
      case LeekPackage.FOR_ITERATOR__CONDITION:
        setCondition((Expression)null);
        return;
      case LeekPackage.FOR_ITERATOR__INCREMENT:
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
      case LeekPackage.FOR_ITERATOR__KEY:
        return key != null;
      case LeekPackage.FOR_ITERATOR__VALUE:
        return value != null;
      case LeekPackage.FOR_ITERATOR__ARRAY:
        return array != null;
      case LeekPackage.FOR_ITERATOR__INITIALIZATION:
        return initialization != null;
      case LeekPackage.FOR_ITERATOR__CONDITION:
        return condition != null;
      case LeekPackage.FOR_ITERATOR__INCREMENT:
        return increment != null;
    }
    return super.eIsSet(featureID);
  }

} //ForIteratorImpl
