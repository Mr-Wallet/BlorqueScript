/**
 */
package org.example.blorquescript.blorqueScript;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Symbol Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSSymbolRef#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSymbolRef()
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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSymbolRef_Symbol()
   * @model
   * @generated
   */
  BSSymbol getSymbol();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSSymbolRef#getSymbol <em>Symbol</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' reference.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(BSSymbol value);

} // BSSymbolRef
