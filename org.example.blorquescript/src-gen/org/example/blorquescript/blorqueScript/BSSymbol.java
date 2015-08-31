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
 *   <li>{@link org.example.blorquescript.blorqueScript.BSSymbol#getPType <em>PType</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSSymbol#getRType <em>RType</em>}</li>
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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSymbol_PType()
   * @model
   * @generated
   */
  BSPrimitiveType getPType();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSSymbol#getPType <em>PType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>PType</em>' attribute.
   * @see org.example.blorquescript.blorqueScript.BSPrimitiveType
   * @see #getPType()
   * @generated
   */
  void setPType(BSPrimitiveType value);

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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSSymbol_RType()
   * @model
   * @generated
   */
  BSClass getRType();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSSymbol#getRType <em>RType</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>RType</em>' reference.
   * @see #getRType()
   * @generated
   */
  void setRType(BSClass value);

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
