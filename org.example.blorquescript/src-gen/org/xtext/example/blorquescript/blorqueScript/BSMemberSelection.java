/**
 */
package org.xtext.example.blorquescript.blorqueScript;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BS Member Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#getMember <em>Member</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#isMethodinvocation <em>Methodinvocation</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSMemberSelection()
 * @model
 * @generated
 */
public interface BSMemberSelection extends BSExpression
{
  /**
   * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' containment reference.
   * @see #setReceiver(BSExpression)
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSMemberSelection_Receiver()
   * @model containment="true"
   * @generated
   */
  BSExpression getReceiver();

  /**
   * Sets the value of the '{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#getReceiver <em>Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' containment reference.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(BSExpression value);

  /**
   * Returns the value of the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' reference.
   * @see #setMember(BSMember)
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSMemberSelection_Member()
   * @model
   * @generated
   */
  BSMember getMember();

  /**
   * Sets the value of the '{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#getMember <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member</em>' reference.
   * @see #getMember()
   * @generated
   */
  void setMember(BSMember value);

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
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSMemberSelection_Methodinvocation()
   * @model
   * @generated
   */
  boolean isMethodinvocation();

  /**
   * Sets the value of the '{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#isMethodinvocation <em>Methodinvocation</em>}' attribute.
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
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSMemberSelection_Args()
   * @model containment="true"
   * @generated
   */
  EList<BSExpression> getArgs();

} // BSMemberSelection
