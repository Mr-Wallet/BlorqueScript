/**
 */
package org.example.blorquescript.blorqueScript;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSSymbol#getType <em>Type</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSSymbol#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSymbol()
 * @model
 * @generated
 */
public interface BSSymbol extends EObject
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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSymbol_Type()
   * @model
   * @generated
   */
  BSClass getType();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSSymbol#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(BSClass value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSymbol_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSSymbol#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // BSSymbol
