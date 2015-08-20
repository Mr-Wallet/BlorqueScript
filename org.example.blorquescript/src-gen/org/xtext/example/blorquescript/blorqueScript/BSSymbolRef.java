/**
 */
package org.xtext.example.blorquescript.blorqueScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Symbol Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.BSSymbolRef#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.BSSymbolRef#isMethodinvocation <em>Methodinvocation</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.BSSymbolRef#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSymbolRef()
 * @model
 * @generated
 */
public interface BSSymbolRef extends BSExpression
{
  /**
   * Returns the value of the '<em><b>Symbol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbol</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' reference.
   * @see #setSymbol(BSSymbol)
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSymbolRef_Symbol()
   * @model
   * @generated
   */
  BSSymbol getSymbol();

  /**
   * Sets the value of the '{@link org.xtext.example.blorquescript.blorqueScript.BSSymbolRef#getSymbol <em>Symbol</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' reference.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(BSSymbol value);

  /**
   * Returns the value of the '<em><b>Methodinvocation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodinvocation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodinvocation</em>' attribute.
   * @see #setMethodinvocation(boolean)
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSymbolRef_Methodinvocation()
   * @model
   * @generated
   */
  boolean isMethodinvocation();

  /**
   * Sets the value of the '{@link org.xtext.example.blorquescript.blorqueScript.BSSymbolRef#isMethodinvocation <em>Methodinvocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Methodinvocation</em>' attribute.
   * @see #isMethodinvocation()
   * @generated
   */
  void setMethodinvocation(boolean value);

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
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSymbolRef_Args()
   * @model containment="true"
   * @generated
   */
  EList<BSExpression> getArgs();

} // BSSymbolRef
