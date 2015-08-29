/**
 */
package org.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Ordered Relation Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSOrderedRelationExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSOrderedRelationExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSOrderedRelationExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSOrderedRelationExpression()
 * @model
 * @generated
 */
public interface BSOrderedRelationExpression extends BSExpression
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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSOrderedRelationExpression_Left()
   * @model containment="true"
   * @generated
   */
  BSExpression getLeft();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSOrderedRelationExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BSExpression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSOrderedRelationExpression_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSOrderedRelationExpression#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSOrderedRelationExpression_Right()
   * @model containment="true"
   * @generated
   */
  BSExpression getRight();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSOrderedRelationExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BSExpression value);

} // BSOrderedRelationExpression
