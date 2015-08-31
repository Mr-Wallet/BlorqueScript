/**
 */
package org.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSCastExpression#getPType <em>PType</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSCastExpression#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSCastExpression#getCastExpr <em>Cast Expr</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSCastExpression()
 * @model
 * @generated
 */
public interface BSCastExpression extends BSExpression
{
  /**
   * Returns the value of the '<em><b>PType</b></em>' attribute.
   * The literals are from the enumeration {@link org.example.blorquescript.blorqueScript.BSPrimitiveType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PType</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>PType</em>' attribute.
   * @see org.example.blorquescript.blorqueScript.BSPrimitiveType
   * @see #setPType(BSPrimitiveType)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSCastExpression_PType()
   * @model
   * @generated
   */
  BSPrimitiveType getPType();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSCastExpression#getPType <em>PType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PType</em>' attribute.
   * @see org.example.blorquescript.blorqueScript.BSPrimitiveType
   * @see #getPType()
   * @generated
   */
  void setPType(BSPrimitiveType value);

  /**
   * Returns the value of the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Array</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Array</em>' attribute.
   * @see #setIsArray(boolean)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSCastExpression_IsArray()
   * @model
   * @generated
   */
  boolean isIsArray();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSCastExpression#isIsArray <em>Is Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Array</em>' attribute.
   * @see #isIsArray()
   * @generated
   */
  void setIsArray(boolean value);

  /**
   * Returns the value of the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cast Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cast Expr</em>' containment reference.
   * @see #setCastExpr(BSExpression)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSCastExpression_CastExpr()
   * @model containment="true"
   * @generated
   */
  BSExpression getCastExpr();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSCastExpression#getCastExpr <em>Cast Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cast Expr</em>' containment reference.
   * @see #getCastExpr()
   * @generated
   */
  void setCastExpr(BSExpression value);

} // BSCastExpression
