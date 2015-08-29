/**
 */
package org.example.blorquescript.blorqueScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSMethod#getParams <em>Params</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSMethod#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSMethod()
 * @model
 * @generated
 */
public interface BSMethod extends BSMember
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.example.blorquescript.blorqueScript.BSParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSMethod_Params()
   * @model containment="true"
   * @generated
   */
  EList<BSParameter> getParams();

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(BSMethodBody)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSMethod_Body()
   * @model containment="true"
   * @generated
   */
  BSMethodBody getBody();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSMethod#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(BSMethodBody value);

} // BSMethod
