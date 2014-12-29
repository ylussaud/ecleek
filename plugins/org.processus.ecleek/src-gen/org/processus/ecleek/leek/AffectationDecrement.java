/**
 */
package org.processus.ecleek.leek;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affectation Decrement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.AffectationDecrement#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.AffectationDecrement#getDecrement <em>Decrement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getAffectationDecrement()
 * @model
 * @generated
 */
public interface AffectationDecrement extends AffectationStatement
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableReference)
   * @see org.processus.ecleek.leek.LeekPackage#getAffectationDecrement_Variable()
   * @model containment="true"
   * @generated
   */
  VariableReference getVariable();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.AffectationDecrement#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableReference value);

  /**
   * Returns the value of the '<em><b>Decrement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decrement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decrement</em>' containment reference.
   * @see #setDecrement(Expression)
   * @see org.processus.ecleek.leek.LeekPackage#getAffectationDecrement_Decrement()
   * @model containment="true"
   * @generated
   */
  Expression getDecrement();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.AffectationDecrement#getDecrement <em>Decrement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decrement</em>' containment reference.
   * @see #getDecrement()
   * @generated
   */
  void setDecrement(Expression value);

} // AffectationDecrement
