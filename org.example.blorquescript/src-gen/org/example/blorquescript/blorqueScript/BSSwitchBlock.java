/**
 */
package org.example.blorquescript.blorqueScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Switch Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSSwitchBlock#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSwitchBlock()
 * @model
 * @generated
 */
public interface BSSwitchBlock extends BSBlock
{
  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link org.example.blorquescript.blorqueScript.BSCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSwitchBlock_Cases()
   * @model containment="true"
   * @generated
   */
  EList<BSCase> getCases();

} // BSSwitchBlock
