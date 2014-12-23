/**
 */
package org.processus.ecleek.leek;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.ForIn#getKey <em>Key</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.ForIn#getValue <em>Value</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.ForIn#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getForIn()
 * @model
 * @generated
 */
public interface ForIn extends Iteration
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' containment reference.
   * @see #setKey(VariableReference)
   * @see org.processus.ecleek.leek.LeekPackage#getForIn_Key()
   * @model containment="true"
   * @generated
   */
  VariableReference getKey();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.ForIn#getKey <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' containment reference.
   * @see #getKey()
   * @generated
   */
  void setKey(VariableReference value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(VariableReference)
   * @see org.processus.ecleek.leek.LeekPackage#getForIn_Value()
   * @model containment="true"
   * @generated
   */
  VariableReference getValue();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.ForIn#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(VariableReference value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' containment reference.
   * @see #setArray(Expression)
   * @see org.processus.ecleek.leek.LeekPackage#getForIn_Array()
   * @model containment="true"
   * @generated
   */
  Expression getArray();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.ForIn#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(Expression value);

} // ForIn
