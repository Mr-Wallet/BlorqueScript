/**
 */
package org.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSIfStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSIfStatement#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSIfStatement#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSIfStatement()
 * @model
 * @generated
 */
public interface BSIfStatement extends BSStatement
{
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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSIfStatement_Expression()
   * @model containment="true"
   * @generated
   */
  BSExpression getExpression();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSIfStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(BSExpression value);

  /**
   * Returns the value of the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Block</em>' containment reference.
   * @see #setThenBlock(BSIfBlock)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSIfStatement_ThenBlock()
   * @model containment="true"
   * @generated
   */
  BSIfBlock getThenBlock();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSIfStatement#getThenBlock <em>Then Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Block</em>' containment reference.
   * @see #getThenBlock()
   * @generated
   */
  void setThenBlock(BSIfBlock value);

  /**
   * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Block</em>' containment reference.
   * @see #setElseBlock(BSIfBlock)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSIfStatement_ElseBlock()
   * @model containment="true"
   * @generated
   */
  BSIfBlock getElseBlock();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSIfStatement#getElseBlock <em>Else Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Block</em>' containment reference.
   * @see #getElseBlock()
   * @generated
   */
  void setElseBlock(BSIfBlock value);

} // BSIfStatement
