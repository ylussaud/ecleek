/**
 */
package org.processus.ecleek.leek.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.processus.ecleek.leek.Expression;
import org.processus.ecleek.leek.ForInitializer;
import org.processus.ecleek.leek.LeekPackage;
import org.processus.ecleek.leek.Postfix;
import org.processus.ecleek.leek.VariableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.impl.VariableReferenceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.VariableReferenceImpl#isByAdress <em>By Adress</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.VariableReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.VariableReferenceImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.VariableReferenceImpl#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableReferenceImpl extends ForInVariableReferenceImpl implements VariableReference
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Expression value;

  /**
   * The default value of the '{@link #isByAdress() <em>By Adress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isByAdress()
   * @generated
   * @ordered
   */
  protected static final boolean BY_ADRESS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isByAdress() <em>By Adress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isByAdress()
   * @generated
   * @ordered
   */
  protected boolean byAdress = BY_ADRESS_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected VariableReference variable;

  /**
   * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimensions()
   * @generated
   * @ordered
   */
  protected EList<Expression> dimensions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableReferenceImpl()
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
    return LeekPackage.Literals.VARIABLE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs)
  {
    Expression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LeekPackage.VARIABLE_REFERENCE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Expression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LeekPackage.VARIABLE_REFERENCE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LeekPackage.VARIABLE_REFERENCE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.VARIABLE_REFERENCE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isByAdress()
  {
    return byAdress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setByAdress(boolean newByAdress)
  {
    boolean oldByAdress = byAdress;
    byAdress = newByAdress;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.VARIABLE_REFERENCE__BY_ADRESS, oldByAdress, byAdress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.VARIABLE_REFERENCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (VariableReference)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LeekPackage.VARIABLE_REFERENCE__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(VariableReference newVariable)
  {
    VariableReference oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.VARIABLE_REFERENCE__VARIABLE, oldVariable, variable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getDimensions()
  {
    if (dimensions == null)
    {
      dimensions = new EObjectContainmentEList<Expression>(Expression.class, this, LeekPackage.VARIABLE_REFERENCE__DIMENSIONS);
    }
    return dimensions;
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
      case LeekPackage.VARIABLE_REFERENCE__VALUE:
        return basicSetValue(null, msgs);
      case LeekPackage.VARIABLE_REFERENCE__DIMENSIONS:
        return ((InternalEList<?>)getDimensions()).basicRemove(otherEnd, msgs);
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
      case LeekPackage.VARIABLE_REFERENCE__VALUE:
        return getValue();
      case LeekPackage.VARIABLE_REFERENCE__BY_ADRESS:
        return isByAdress();
      case LeekPackage.VARIABLE_REFERENCE__NAME:
        return getName();
      case LeekPackage.VARIABLE_REFERENCE__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
      case LeekPackage.VARIABLE_REFERENCE__DIMENSIONS:
        return getDimensions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LeekPackage.VARIABLE_REFERENCE__VALUE:
        setValue((Expression)newValue);
        return;
      case LeekPackage.VARIABLE_REFERENCE__BY_ADRESS:
        setByAdress((Boolean)newValue);
        return;
      case LeekPackage.VARIABLE_REFERENCE__NAME:
        setName((String)newValue);
        return;
      case LeekPackage.VARIABLE_REFERENCE__VARIABLE:
        setVariable((VariableReference)newValue);
        return;
      case LeekPackage.VARIABLE_REFERENCE__DIMENSIONS:
        getDimensions().clear();
        getDimensions().addAll((Collection<? extends Expression>)newValue);
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
      case LeekPackage.VARIABLE_REFERENCE__VALUE:
        setValue((Expression)null);
        return;
      case LeekPackage.VARIABLE_REFERENCE__BY_ADRESS:
        setByAdress(BY_ADRESS_EDEFAULT);
        return;
      case LeekPackage.VARIABLE_REFERENCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LeekPackage.VARIABLE_REFERENCE__VARIABLE:
        setVariable((VariableReference)null);
        return;
      case LeekPackage.VARIABLE_REFERENCE__DIMENSIONS:
        getDimensions().clear();
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
      case LeekPackage.VARIABLE_REFERENCE__VALUE:
        return value != null;
      case LeekPackage.VARIABLE_REFERENCE__BY_ADRESS:
        return byAdress != BY_ADRESS_EDEFAULT;
      case LeekPackage.VARIABLE_REFERENCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LeekPackage.VARIABLE_REFERENCE__VARIABLE:
        return variable != null;
      case LeekPackage.VARIABLE_REFERENCE__DIMENSIONS:
        return dimensions != null && !dimensions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == ForInitializer.class)
    {
      switch (derivedFeatureID)
      {
        case LeekPackage.VARIABLE_REFERENCE__VALUE: return LeekPackage.FOR_INITIALIZER__VALUE;
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Postfix.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == ForInitializer.class)
    {
      switch (baseFeatureID)
      {
        case LeekPackage.FOR_INITIALIZER__VALUE: return LeekPackage.VARIABLE_REFERENCE__VALUE;
        default: return -1;
      }
    }
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Postfix.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (byAdress: ");
    result.append(byAdress);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VariableReferenceImpl
