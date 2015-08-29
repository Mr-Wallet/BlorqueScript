/**
 */
package org.example.blorquescript.blorqueScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Array Access Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSArrayAccessExpression#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSArrayAccessExpression#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSArrayAccessExpression()
 * @model
 * @generated
 */
public interface BSArrayAccessExpression extends BSExpression
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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSArrayAccessExpression_Receiver()
   * @model containment="true"
   * @generated
   */
  BSExpression getReceiver();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSArrayAccessExpression#getReceiver <em>Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' containment reference.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(BSExpression value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.example.blorquescript.blorqueScript.BSExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSArrayAccessExpression_Args()
   * @model containment="true"
   * @generated
   */
  EList<BSExpression> getArgs();

} // BSArrayAccessExpression
