/**
 */
package org.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Real Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSRealConstant#getLeft <em>Left</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSRealConstant#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSRealConstant()
 * @model
 * @generated
 */
public interface BSRealConstant extends BSExpression
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
   * @see #setLeft(BSNumberConstant)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSRealConstant_Left()
   * @model containment="true"
   * @generated
   */
  BSNumberConstant getLeft();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSRealConstant#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BSNumberConstant value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' attribute.
   * @see #setRight(int)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSRealConstant_Right()
   * @model
   * @generated
   */
  int getRight();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSRealConstant#getRight <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' attribute.
   * @see #getRight()
   * @generated
   */
  void setRight(int value);

} // BSRealConstant
