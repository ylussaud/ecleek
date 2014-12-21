/**
 */
package org.processus.ecleek.leek;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.ForIterator#getKey <em>Key</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.ForIterator#getValue <em>Value</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.ForIterator#getArray <em>Array</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.ForIterator#getInitialization <em>Initialization</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.ForIterator#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.ForIterator#getIncrement <em>Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getForIterator()
 * @model
 * @generated
 */
public interface ForIterator extends EObject
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
   * @see #setKey(LocalDeclaration)
   * @see org.processus.ecleek.leek.LeekPackage#getForIterator_Key()
   * @model containment="true"
   * @generated
   */
  LocalDeclaration getKey();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.ForIterator#getKey <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' containment reference.
   * @see #getKey()
   * @generated
   */
  void setKey(LocalDeclaration value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(LocalDeclaration)
   * @see org.processus.ecleek.leek.LeekPackage#getForIterator_Value()
   * @model containment="true"
   * @generated
   */
  LocalDeclaration getValue();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.ForIterator#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(LocalDeclaration value);

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
   * @see org.processus.ecleek.leek.LeekPackage#getForIterator_Array()
   * @model containment="true"
   * @generated
   */
  Expression getArray();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.ForIterator#getArray <em>Array</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' containment reference.
   * @see #getArray()
   * @generated
   */
  void setArray(Expression value);

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
   * @see org.processus.ecleek.leek.LeekPackage#getForIterator_Initialization()
   * @model containment="true"
   * @generated
   */
  Affectation getInitialization();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.ForIterator#getInitialization <em>Initialization</em>}' containment reference.
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
   * @see org.processus.ecleek.leek.LeekPackage#getForIterator_Condition()
   * @model containment="true"
   * @generated
   */
  Expression getCondition();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.ForIterator#getCondition <em>Condition</em>}' containment reference.
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
   * @see org.processus.ecleek.leek.LeekPackage#getForIterator_Increment()
   * @model containment="true"
   * @generated
   */
  Expression getIncrement();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.ForIterator#getIncrement <em>Increment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Increment</em>' containment reference.
   * @see #getIncrement()
   * @generated
   */
  void setIncrement(Expression value);

} // ForIterator
