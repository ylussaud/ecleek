/**
 */
package org.processus.ecleek.leek;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.processus.ecleek.leek.StatementBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.processus.ecleek.leek.LeekPackage#getStatementBlock()
 * @model
 * @generated
 */
public interface StatementBlock extends Statement
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.processus.ecleek.leek.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.processus.ecleek.leek.LeekPackage#getStatementBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // StatementBlock
