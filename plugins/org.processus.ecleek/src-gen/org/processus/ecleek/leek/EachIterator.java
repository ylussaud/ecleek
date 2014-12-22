/**
 */
package org.processus.ecleek.leek;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Each Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.EachIterator#getKey <em>Key</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.EachIterator#getValue <em>Value</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.EachIterator#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getEachIterator()
 * @model
 * @generated
 */
public interface EachIterator extends ForIterator
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
   * @see #setKey(VariableDeclaration)
   * @see org.processus.ecleek.leek.LeekPackage#getEachIterator_Key()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getKey();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.EachIterator#getKey <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' containment reference.
   * @see #getKey()
   * @generated
   */
  void setKey(VariableDeclaration value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(VariableDeclaration)
   * @see org.processus.ecleek.leek.LeekPackage#getEachIterator_Value()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getValue();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.EachIterator#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(VariableDeclaration value);

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
   * @see org.processus.ecleek.leek.LeekPackage#getEachIterator_Array()
   * @model containment="true"
   * @generated
   */
  Expression getArray();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.EachIterator#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(Expression value);

} // EachIterator
