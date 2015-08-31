/**
 */
package org.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.blorquescript.blorqueScript.BSExpression;
import org.example.blorquescript.blorqueScript.BSMemberSelectionExpression;
import org.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS Member Selection Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSMemberSelectionExpressionImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSMemberSelectionExpressionImpl#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSMemberSelectionExpressionImpl extends BSExpressionImpl implements BSMemberSelectionExpression
{
  /**
   * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiver()
   * @generated
   * @ordered
   */
  protected BSExpression receiver;

  /**
   * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMember()
   * @generated
   * @ordered
   */
  protected BSExpression member;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSMemberSelectionExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BlorqueScriptPackage.Literals.BS_MEMBER_SELECTION_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSExpression getReceiver()
  {
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReceiver(BSExpression newReceiver, NotificationChain msgs)
  {
    BSExpression oldReceiver = receiver;
    receiver = newReceiver;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__RECEIVER, oldReceiver, newReceiver);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiver(BSExpression newReceiver)
  {
    if (newReceiver != receiver)
    {
      NotificationChain msgs = null;
      if (receiver != null)
        msgs = ((InternalEObject)receiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__RECEIVER, null, msgs);
      if (newReceiver != null)
        msgs = ((InternalEObject)newReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__RECEIVER, null, msgs);
      msgs = basicSetReceiver(newReceiver, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__RECEIVER, newReceiver, newReceiver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSExpression getMember()
  {
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMember(BSExpression newMember, NotificationChain msgs)
  {
    BSExpression oldMember = member;
    member = newMember;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__MEMBER, oldMember, newMember);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMember(BSExpression newMember)
  {
    if (newMember != member)
    {
      NotificationChain msgs = null;
      if (member != null)
        msgs = ((InternalEObject)member).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__MEMBER, null, msgs);
      if (newMember != null)
        msgs = ((InternalEObject)newMember).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__MEMBER, null, msgs);
      msgs = basicSetMember(newMember, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__MEMBER, newMember, newMember));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__RECEIVER:
        return basicSetReceiver(null, msgs);
      case BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__MEMBER:
        return basicSetMember(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__RECEIVER:
        return getReceiver();
      case BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__MEMBER:
        return getMember();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__RECEIVER:
        setReceiver((BSExpression)newValue);
        return;
      case BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__MEMBER:
        setMember((BSExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__RECEIVER:
        setReceiver((BSExpression)null);
        return;
      case BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__MEMBER:
        setMember((BSExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__RECEIVER:
        return receiver != null;
      case BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION__MEMBER:
        return member != null;
    }
    return super.eIsSet(featureID);
  }

} //BSMemberSelectionExpressionImpl
