/**
 */
package org.xtext.example.blorquescript.blorqueScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS New</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.BSNew#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.BSNew#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSNew()
 * @model
 * @generated
 */
public interface BSNew extends BSExpression
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(BSClass)
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSNew_Type()
   * @model
   * @generated
   */
  BSClass getType();

  /**
   * Sets the value of the '{@link org.xtext.example.blorquescript.blorqueScript.BSNew#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(BSClass value);

  /**
   * Returns the value of the '<em><b>Args</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.blorquescript.blorqueScript.BSExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Args</em>' containment reference list.
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSNew_Args()
   * @model containment="true"
   * @generated
   */
  EList<BSExpression> getArgs();

} // BSNew
