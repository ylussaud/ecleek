/**
 */
package org.processus.ecleek.leek;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.FunctionCall#getFunction <em>Function</em>}</li>
 *   <li>{@link org.processus.ecleek.leek.FunctionCall#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getFunctionCall()
 * @model
 * @generated
 */
public interface FunctionCall extends Statement, Expression
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' reference.
   * @see #setFunction(FunctionDeclaration)
   * @see org.processus.ecleek.leek.LeekPackage#getFunctionCall_Function()
   * @model
   * @generated
   */
  FunctionDeclaration getFunction();

  /**
   * Sets the value of the '{@link org.processus.ecleek.leek.FunctionCall#getFunction <em>Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' reference.
   * @see #getFunction()
   * @generated
   */
  void setFunction(FunctionDeclaration value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.processus.ecleek.leek.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.processus.ecleek.leek.LeekPackage#getFunctionCall_Args()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getArgs();

} // FunctionCall
