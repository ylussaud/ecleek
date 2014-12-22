/**
 */
package org.processus.ecleek.leek;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.VariableIterator#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.VariableIterator#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.VariableIterator#getIncrement <em>Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getVariableIterator()
 * @model
 * @generated
 */
public interface VariableIterator extends ForIterator
{
  /**
   * Returns the value of the '<em><b>Initialization</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initialization</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initialization</em>' containment reference.
   * @see #setInitialization(Affectation)
   * @see org.processus.ecleek.leek.LeekPackage#getVariableIterator_Initialization()
   * @model containment="true"
   * @generated
   */
  Affectation getInitialization();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.VariableIterator#getInitialization <em>Initialization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initialization</em>' containment reference.
   * @see #getInitialization()
   * @generated
   */
  void setInitialization(Affectation value);

  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Expression)
   * @see org.processus.ecleek.leek.LeekPackage#getVariableIterator_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.VariableIterator#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Expression value);

  /**
   * Returns the value of the '<em><b>Increment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Increment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Increment</em>' containment reference.
   * @see #setIncrement(Expression)
   * @see org.processus.ecleek.leek.LeekPackage#getVariableIterator_Increment()
   * @model containment="true"
   * @generated
   */
  Expression getIncrement();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.VariableIterator#getIncrement <em>Increment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Increment</em>' containment reference.
   * @see #getIncrement()
   * @generated
   */
  void setIncrement(Expression value);

} // VariableIterator
