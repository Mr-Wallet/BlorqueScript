/**
 */
package org.example.blorquescript.blorqueScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Case Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSCaseBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSCaseBlock()
 * @model
 * @generated
 */
public interface BSCaseBlock extends BSBlock
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.example.blorquescript.blorqueScript.BSStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSCaseBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<BSStatement> getStatements();

} // BSCaseBlock
