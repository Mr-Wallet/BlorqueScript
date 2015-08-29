/**
 */
package org.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSSwitchStatement#isStringSwitch <em>String Switch</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSSwitchStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSSwitchStatement#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSwitchStatement()
 * @model
 * @generated
 */
public interface BSSwitchStatement extends BSStatement
{
  /**
   * Returns the value of the '<em><b>String Switch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Switch</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Switch</em>' attribute.
   * @see #setStringSwitch(boolean)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSwitchStatement_StringSwitch()
   * @model
   * @generated
   */
  boolean isStringSwitch();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSSwitchStatement#isStringSwitch <em>String Switch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Switch</em>' attribute.
   * @see #isStringSwitch()
   * @generated
   */
  void setStringSwitch(boolean value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(BSExpression)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSwitchStatement_Expression()
   * @model containment="true"
   * @generated
   */
  BSExpression getExpression();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSSwitchStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(BSExpression value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(BSSwitchBlock)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSwitchStatement_Block()
   * @model containment="true"
   * @generated
   */
  BSSwitchBlock getBlock();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSSwitchStatement#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(BSSwitchBlock value);

} // BSSwitchStatement
