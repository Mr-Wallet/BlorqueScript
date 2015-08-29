/**
 */
package org.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS While Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSWhileLoop#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSWhileLoop#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSWhileLoop()
 * @model
 * @generated
 */
public interface BSWhileLoop extends BSStatement
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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSWhileLoop_Expression()
   * @model containment="true"
   * @generated
   */
  BSExpression getExpression();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSWhileLoop#getExpression <em>Expression</em>}' containment reference.
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
   * @see #setBlock(BSLoopBlock)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSWhileLoop_Block()
   * @model containment="true"
   * @generated
   */
  BSLoopBlock getBlock();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSWhileLoop#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(BSLoopBlock value);

} // BSWhileLoop
