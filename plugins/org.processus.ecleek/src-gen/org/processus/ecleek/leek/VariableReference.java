/**
 */
package org.processus.ecleek.leek;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.VariableReference#isByAdress <em>By Adress</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.VariableReference#getName <em>Name</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.VariableReference#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.VariableReference#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getVariableReference()
 * @model
 * @generated
 */
public interface VariableReference extends ForInVariableReference, ForInitializer, Postfix
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
   * @see org.processus.ecleek.leek.LeekPackage#getVariableReference_ByAdress()
   * @model
   * @generated
   */
  boolean isByAdress();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.VariableReference#isByAdress <em>By Adress</em>}' attribute.
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
   * @see org.processus.ecleek.leek.LeekPackage#getVariableReference_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.VariableReference#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(VariableReference)
   * @see org.processus.ecleek.leek.LeekPackage#getVariableReference_Variable()
   * @model
   * @generated
   */
  VariableReference getVariable();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.VariableReference#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableReference value);

  /**
   * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
   * The list contents are of type {@link org.processus.ecleek.leek.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimensions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimensions</em>' containment reference list.
   * @see org.processus.ecleek.leek.LeekPackage#getVariableReference_Dimensions()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getDimensions();

} // VariableReference
