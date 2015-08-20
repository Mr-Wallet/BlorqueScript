/**
 */
package org.xtext.example.blorquescript.blorqueScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.BSBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSBlock()
 * @model
 * @generated
 */
public interface BSBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.blorquescript.blorqueScript.BSStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<BSStatement> getStatements();

} // BSBlock
