/**
 */
package org.xtext.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.BSExpression#getCastType <em>Cast Type</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.BSExpression#getCastExpr <em>Cast Expr</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSExpression()
 * @model
 * @generated
 */
public interface BSExpression extends BSStatement
{
  /**
   * Returns the value of the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cast Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cast Type</em>' attribute.
   * @see #setCastType(String)
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSExpression_CastType()
   * @model
   * @generated
   */
  String getCastType();

  /**
   * Sets the value of the '{@link org.xtext.example.blorquescript.blorqueScript.BSExpression#getCastType <em>Cast Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cast Type</em>' attribute.
   * @see #getCastType()
   * @generated
   */
  void setCastType(String value);

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
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSExpression_CastExpr()
   * @model containment="true"
   * @generated
   */
  BSExpression getCastExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.blorquescript.blorqueScript.BSExpression#getCastExpr <em>Cast Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cast Expr</em>' containment reference.
   * @see #getCastExpr()
   * @generated
   */
  void setCastExpr(BSExpression value);

} // BSExpression