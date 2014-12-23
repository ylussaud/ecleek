/**
 */
package org.processus.ecleek.leek;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Statement Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.FunctionStatementBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getFunctionStatementBlock()
 * @model
 * @generated
 */
public interface FunctionStatementBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.processus.ecleek.leek.FunctionStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.processus.ecleek.leek.LeekPackage#getFunctionStatementBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<FunctionStatement> getStatements();

} // FunctionStatementBlock
