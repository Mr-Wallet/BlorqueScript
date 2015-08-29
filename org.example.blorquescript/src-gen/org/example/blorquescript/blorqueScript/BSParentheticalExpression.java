/**
 */
package org.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Parenthetical Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSParentheticalExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSParentheticalExpression()
 * @model
 * @generated
 */
public interface BSParentheticalExpression extends BSExpression
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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSParentheticalExpression_Expression()
   * @model containment="true"
   * @generated
   */
  BSExpression getExpression();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSParentheticalExpression#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(BSExpression value);

} // BSParentheticalExpression
