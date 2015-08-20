/**
 */
package org.xtext.example.blorquescript.blorqueScript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.blorquescript.blorqueScript.BSExpression;
import org.xtext.example.blorquescript.blorqueScript.BSMember;
import org.xtext.example.blorquescript.blorqueScript.BSMemberSelection;
import org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS Member Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.impl.BSMemberSelectionImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.impl.BSMemberSelectionImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.impl.BSMemberSelectionImpl#isMethodinvocation <em>Methodinvocation</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.impl.BSMemberSelectionImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSMemberSelectionImpl extends BSExpressionImpl implements BSMemberSelection
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
   * The cached value of the '{@link #getMember() <em>Member</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMember()
   * @generated
   * @ordered
   */
  protected BSMember member;

  /**
   * The default value of the '{@link #isMethodinvocation() <em>Methodinvocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMethodinvocation()
   * @generated
   * @ordered
   */
  protected static final boolean METHODINVOCATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMethodinvocation() <em>Methodinvocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMethodinvocation()
   * @generated
   * @ordered
   */
  protected boolean methodinvocation = METHODINVOCATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgs()
   * @generated
   * @ordered
   */
  protected EList<BSExpression> args;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSMemberSelectionImpl()
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
    return BlorqueScriptPackage.Literals.BS_MEMBER_SELECTION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_MEMBER_SELECTION__RECEIVER, oldReceiver, newReceiver);
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
        msgs = ((InternalEObject)receiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_MEMBER_SELECTION__RECEIVER, null, msgs);
      if (newReceiver != null)
        msgs = ((InternalEObject)newReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_MEMBER_SELECTION__RECEIVER, null, msgs);
      msgs = basicSetReceiver(newReceiver, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_MEMBER_SELECTION__RECEIVER, newReceiver, newReceiver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSMember getMember()
  {
    if (member != null && member.eIsProxy())
    {
      InternalEObject oldMember = (InternalEObject)member;
      member = (BSMember)eResolveProxy(oldMember);
      if (member != oldMember)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlorqueScriptPackage.BS_MEMBER_SELECTION__MEMBER, oldMember, member));
      }
    }
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSMember basicGetMember()
  {
    return member;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMember(BSMember newMember)
  {
    BSMember oldMember = member;
    member = newMember;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_MEMBER_SELECTION__MEMBER, oldMember, member));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMethodinvocation()
  {
    return methodinvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodinvocation(boolean newMethodinvocation)
  {
    boolean oldMethodinvocation = methodinvocation;
    methodinvocation = newMethodinvocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_MEMBER_SELECTION__METHODINVOCATION, oldMethodinvocation, methodinvocation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BSExpression> getArgs()
  {
    if (args == null)
    {
      args = new EObjectContainmentEList<BSExpression>(BSExpression.class, this, BlorqueScriptPackage.BS_MEMBER_SELECTION__ARGS);
    }
    return args;
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
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__RECEIVER:
        return basicSetReceiver(null, msgs);
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__ARGS:
        return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
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
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__RECEIVER:
        return getReceiver();
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__MEMBER:
        if (resolve) return getMember();
        return basicGetMember();
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__METHODINVOCATION:
        return isMethodinvocation();
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__ARGS:
        return getArgs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__RECEIVER:
        setReceiver((BSExpression)newValue);
        return;
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__MEMBER:
        setMember((BSMember)newValue);
        return;
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__METHODINVOCATION:
        setMethodinvocation((Boolean)newValue);
        return;
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__ARGS:
        getArgs().clear();
        getArgs().addAll((Collection<? extends BSExpression>)newValue);
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
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__RECEIVER:
        setReceiver((BSExpression)null);
        return;
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__MEMBER:
        setMember((BSMember)null);
        return;
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__METHODINVOCATION:
        setMethodinvocation(METHODINVOCATION_EDEFAULT);
        return;
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__ARGS:
        getArgs().clear();
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
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__RECEIVER:
        return receiver != null;
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__MEMBER:
        return member != null;
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__METHODINVOCATION:
        return methodinvocation != METHODINVOCATION_EDEFAULT;
      case BlorqueScriptPackage.BS_MEMBER_SELECTION__ARGS:
        return args != null && !args.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (methodinvocation: ");
    result.append(methodinvocation);
    result.append(')');
    return result.toString();
  }

} //BSMemberSelectionImpl
