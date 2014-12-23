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

import org.processus.ecleek.leek.LeekPackage;
import org.processus.ecleek.leek.LocalDeclaration;
import org.processus.ecleek.leek.VariableDeclaration;
import org.processus.ecleek.leek.VariableReferenceable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.impl.LocalDeclarationImpl#isByAdress <em>By Adress</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.LocalDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.impl.LocalDeclarationImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalDeclarationImpl extends StatementImpl implements LocalDeclaration
{
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
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<VariableDeclaration> variables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalDeclarationImpl()
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
    return LeekPackage.Literals.LOCAL_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.LOCAL_DECLARATION__BY_ADRESS, oldByAdress, byAdress));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LeekPackage.LOCAL_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDeclaration> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, LeekPackage.LOCAL_DECLARATION__VARIABLES);
    }
    return variables;
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
      case LeekPackage.LOCAL_DECLARATION__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
      case LeekPackage.LOCAL_DECLARATION__BY_ADRESS:
        return isByAdress();
      case LeekPackage.LOCAL_DECLARATION__NAME:
        return getName();
      case LeekPackage.LOCAL_DECLARATION__VARIABLES:
        return getVariables();
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
      case LeekPackage.LOCAL_DECLARATION__BY_ADRESS:
        setByAdress((Boolean)newValue);
        return;
      case LeekPackage.LOCAL_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case LeekPackage.LOCAL_DECLARATION__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends VariableDeclaration>)newValue);
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
      case LeekPackage.LOCAL_DECLARATION__BY_ADRESS:
        setByAdress(BY_ADRESS_EDEFAULT);
        return;
      case LeekPackage.LOCAL_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LeekPackage.LOCAL_DECLARATION__VARIABLES:
        getVariables().clear();
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
      case LeekPackage.LOCAL_DECLARATION__BY_ADRESS:
        return byAdress != BY_ADRESS_EDEFAULT;
      case LeekPackage.LOCAL_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LeekPackage.LOCAL_DECLARATION__VARIABLES:
        return variables != null && !variables.isEmpty();
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
    if (baseClass == VariableReferenceable.class)
    {
      switch (derivedFeatureID)
      {
        case LeekPackage.LOCAL_DECLARATION__BY_ADRESS: return LeekPackage.VARIABLE_REFERENCEABLE__BY_ADRESS;
        case LeekPackage.LOCAL_DECLARATION__NAME: return LeekPackage.VARIABLE_REFERENCEABLE__NAME;
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
    if (baseClass == VariableReferenceable.class)
    {
      switch (baseFeatureID)
      {
        case LeekPackage.VARIABLE_REFERENCEABLE__BY_ADRESS: return LeekPackage.LOCAL_DECLARATION__BY_ADRESS;
        case LeekPackage.VARIABLE_REFERENCEABLE__NAME: return LeekPackage.LOCAL_DECLARATION__NAME;
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

} //LocalDeclarationImpl
