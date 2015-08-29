/**
 */
package org.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.blorquescript.blorqueScript.BSBitwiseXorExpression;
import org.example.blorquescript.blorqueScript.BSExpression;
import org.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS Bitwise Xor Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSBitwiseXorExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSBitwiseXorExpressionImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSBitwiseXorExpressionImpl extends BSExpressionImpl implements BSBitwiseXorExpression
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected BSExpression left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected BSExpression right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSBitwiseXorExpressionImpl()
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
    return BlorqueScriptPackage.Literals.BS_BITWISE_XOR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSExpression getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(BSExpression newLeft, NotificationChain msgs)
  {
    BSExpression oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(BSExpression newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSExpression getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(BSExpression newRight, NotificationChain msgs)
  {
    BSExpression oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(BSExpression newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__RIGHT, newRight, newRight));
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
      case BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__RIGHT:
        return basicSetRight(null, msgs);
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
      case BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__LEFT:
        return getLeft();
      case BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__RIGHT:
        return getRight();
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
      case BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__LEFT:
        setLeft((BSExpression)newValue);
        return;
      case BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__RIGHT:
        setRight((BSExpression)newValue);
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
      case BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__LEFT:
        setLeft((BSExpression)null);
        return;
      case BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__RIGHT:
        setRight((BSExpression)null);
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
      case BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__LEFT:
        return left != null;
      case BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

} //BSBitwiseXorExpressionImpl
