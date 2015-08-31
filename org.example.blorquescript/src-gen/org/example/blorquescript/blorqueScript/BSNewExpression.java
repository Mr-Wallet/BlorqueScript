/**
 */
package org.example.blorquescript.blorqueScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS New Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSNewExpression#getRType <em>RType</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSNewExpression#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSNewExpression#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSNewExpression()
 * @model
 * @generated
 */
public interface BSNewExpression extends BSExpression
{
  /**
   * Returns the value of the '<em><b>RType</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>RType</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>RType</em>' reference.
   * @see #setRType(BSClass)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSNewExpression_RType()
   * @model
   * @generated
   */
  BSClass getRType();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSNewExpression#getRType <em>RType</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RType</em>' reference.
   * @see #getRType()
   * @generated
   */
  void setRType(BSClass value);

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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSNewExpression_IsArray()
   * @model
   * @generated
   */
  boolean isIsArray();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSNewExpression#isIsArray <em>Is Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Array</em>' attribute.
   * @see #isIsArray()
   * @generated
   */
  void setIsArray(boolean value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.example.blorquescript.blorqueScript.BSExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSNewExpression_Args()
   * @model containment="true"
   * @generated
   */
  EList<BSExpression> getArgs();

} // BSNewExpression
