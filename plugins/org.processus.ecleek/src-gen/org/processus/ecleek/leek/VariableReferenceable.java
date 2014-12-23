/**
 */
package org.processus.ecleek.leek;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Referenceable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.VariableReferenceable#isByAdress <em>By Adress</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.VariableReferenceable#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getVariableReferenceable()
 * @model
 * @generated
 */
public interface VariableReferenceable extends EObject
{
  /**
   * Returns the value of the '<em><b>By Adress</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>By Adress</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>By Adress</em>' attribute.
   * @see #setByAdress(boolean)
   * @see org.processus.ecleek.leek.LeekPackage#getVariableReferenceable_ByAdress()
   * @model
   * @generated
   */
  boolean isByAdress();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.VariableReferenceable#isByAdress <em>By Adress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>By Adress</em>' attribute.
   * @see #isByAdress()
   * @generated
   */
  void setByAdress(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.processus.ecleek.leek.LeekPackage#getVariableReferenceable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.VariableReferenceable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // VariableReferenceable
