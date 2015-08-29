/**
 */
package org.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Member Selection Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSMemberSelectionExpression#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSMemberSelectionExpression()
 * @model
 * @generated
 */
public interface BSMemberSelectionExpression extends BSExpression
{
  /**
   * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' containment reference.
   * @see #setReceiver(BSExpression)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSMemberSelectionExpression_Receiver()
   * @model containment="true"
   * @generated
   */
  BSExpression getReceiver();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSMemberSelectionExpression#getReceiver <em>Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' containment reference.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(BSExpression value);

} // BSMemberSelectionExpression
