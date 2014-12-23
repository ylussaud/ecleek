/**
 */
package org.processus.ecleek.leek.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.processus.ecleek.leek.Expression;
import org.processus.ecleek.leek.LeekPackage;
import org.processus.ecleek.leek.VariableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.impl.VariableReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.VariableReferenceImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.VariableReferenceImpl#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableReferenceImpl extends ForInitializerImpl implements VariableReference
{
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
  protected EObject variable;

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
  public EObject getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = eResolveProxy(oldVariable);
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
  public EObject basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(EObject newVariable)
  {
    EObject oldVariable = variable;
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
      case LeekPackage.VARIABLE_REFERENCE__NAME:
        setName((String)newValue);
        return;
      case LeekPackage.VARIABLE_REFERENCE__VARIABLE:
        setVariable((EObject)newValue);
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
      case LeekPackage.VARIABLE_REFERENCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LeekPackage.VARIABLE_REFERENCE__VARIABLE:
        setVariable((EObject)null);
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //VariableReferenceImpl
