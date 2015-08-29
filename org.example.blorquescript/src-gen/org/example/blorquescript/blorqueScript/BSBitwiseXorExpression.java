/**
 */
package org.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Bitwise Xor Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSBitwiseXorExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSBitwiseXorExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSBitwiseXorExpression()
 * @model
 * @generated
 */
public interface BSBitwiseXorExpression extends BSExpression
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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSBitwiseXorExpression_Left()
   * @model containment="true"
   * @generated
   */
  BSExpression getLeft();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSBitwiseXorExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BSExpression value);

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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSBitwiseXorExpression_Right()
   * @model containment="true"
   * @generated
   */
  BSExpression getRight();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSBitwiseXorExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BSExpression value);

} // BSBitwiseXorExpression
