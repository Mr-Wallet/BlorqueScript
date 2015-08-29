/**
 */
package org.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSAssignmentExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSAssignmentExpression#getAssignmentOperator <em>Assignment Operator</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSAssignmentExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSAssignmentExpression()
 * @model
 * @generated
 */
public interface BSAssignmentExpression extends BSExpression
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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSAssignmentExpression_Left()
   * @model containment="true"
   * @generated
   */
  BSExpression getLeft();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSAssignmentExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BSExpression value);

  /**
   * Returns the value of the '<em><b>Assignment Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment Operator</em>' attribute.
   * @see #setAssignmentOperator(String)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSAssignmentExpression_AssignmentOperator()
   * @model
   * @generated
   */
  String getAssignmentOperator();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSAssignmentExpression#getAssignmentOperator <em>Assignment Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment Operator</em>' attribute.
   * @see #getAssignmentOperator()
   * @generated
   */
  void setAssignmentOperator(String value);

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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSAssignmentExpression_Right()
   * @model containment="true"
   * @generated
   */
  BSExpression getRight();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSAssignmentExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BSExpression value);

} // BSAssignmentExpression
