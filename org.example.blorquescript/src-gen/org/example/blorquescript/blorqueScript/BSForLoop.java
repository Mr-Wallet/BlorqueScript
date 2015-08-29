/**
 */
package org.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSForLoop#getLeft <em>Left</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSForLoop#getMiddle <em>Middle</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSForLoop#getRight <em>Right</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSForLoop#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSForLoop()
 * @model
 * @generated
 */
public interface BSForLoop extends BSStatement
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(BSExpression)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSForLoop_Left()
   * @model containment="true"
   * @generated
   */
  BSExpression getLeft();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSForLoop#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BSExpression value);

  /**
   * Returns the value of the '<em><b>Middle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Middle</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Middle</em>' containment reference.
   * @see #setMiddle(BSExpression)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSForLoop_Middle()
   * @model containment="true"
   * @generated
   */
  BSExpression getMiddle();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSForLoop#getMiddle <em>Middle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Middle</em>' containment reference.
   * @see #getMiddle()
   * @generated
   */
  void setMiddle(BSExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BSExpression)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSForLoop_Right()
   * @model containment="true"
   * @generated
   */
  BSExpression getRight();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSForLoop#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BSExpression value);

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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSForLoop_Block()
   * @model containment="true"
   * @generated
   */
  BSLoopBlock getBlock();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSForLoop#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(BSLoopBlock value);

} // BSForLoop
