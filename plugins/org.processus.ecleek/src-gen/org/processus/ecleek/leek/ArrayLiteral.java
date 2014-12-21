/**
 */
package org.processus.ecleek.leek;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.ArrayLiteral#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getArrayLiteral()
 * @model
 * @generated
 */
public interface ArrayLiteral extends Expression
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.processus.ecleek.leek.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.processus.ecleek.leek.LeekPackage#getArrayLiteral_Values()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getValues();

} // ArrayLiteral
