/**
 */
package org.processus.ecleek.leek;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.For#getIterator <em>Iterator</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.For#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getFor()
 * @model
 * @generated
 */
public interface For extends Statement
{
  /**
   * Returns the value of the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iterator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iterator</em>' containment reference.
   * @see #setIterator(ForIterator)
   * @see org.processus.ecleek.leek.LeekPackage#getFor_Iterator()
   * @model containment="true"
   * @generated
   */
  ForIterator getIterator();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.For#getIterator <em>Iterator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iterator</em>' containment reference.
   * @see #getIterator()
   * @generated
   */
  void setIterator(ForIterator value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(Statement)
   * @see org.processus.ecleek.leek.LeekPackage#getFor_Statement()
   * @model containment="true"
   * @generated
   */
  Statement getStatement();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.For#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(Statement value);

} // For
