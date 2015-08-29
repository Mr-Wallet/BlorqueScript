/**
 */
package org.example.blorquescript.blorqueScript;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSClass#getName <em>Name</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSClass#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.BSClass#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSClass()
 * @model
 * @generated
 */
public interface BSClass extends EObject
{
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
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSClass_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSClass#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Superclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Superclass</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Superclass</em>' reference.
   * @see #setSuperclass(BSClass)
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSClass_Superclass()
   * @model
   * @generated
   */
  BSClass getSuperclass();

  /**
   * Sets the value of the '{@link org.example.blorquescript.blorqueScript.BSClass#getSuperclass <em>Superclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Superclass</em>' reference.
   * @see #getSuperclass()
   * @generated
   */
  void setSuperclass(BSClass value);

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link org.example.blorquescript.blorqueScript.BSMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSClass_Members()
   * @model containment="true"
   * @generated
   */
  EList<BSMember> getMembers();

} // BSClass
