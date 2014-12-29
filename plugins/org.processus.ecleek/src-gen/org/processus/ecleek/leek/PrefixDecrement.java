/**
 */
package org.processus.ecleek.leek;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prefix Decrement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.PrefixDecrement#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getPrefixDecrement()
 * @model
 * @generated
 */
public interface PrefixDecrement extends AffectationPrefixStatement, Prefix
{
  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(VariableReference)
   * @see org.processus.ecleek.leek.LeekPackage#getPrefixDecrement_Right()
   * @model containment="true"
   * @generated
   */
  VariableReference getRight();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.PrefixDecrement#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(VariableReference value);

} // PrefixDecrement
