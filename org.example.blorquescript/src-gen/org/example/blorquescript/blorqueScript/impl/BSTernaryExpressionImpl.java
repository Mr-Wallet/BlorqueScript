/**
 */
package org.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.blorquescript.blorqueScript.BSExpression;
import org.example.blorquescript.blorqueScript.BSTernaryExpression;
import org.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS Ternary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSTernaryExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSTernaryExpressionImpl#getMiddle <em>Middle</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSTernaryExpressionImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSTernaryExpressionImpl extends BSExpressionImpl implements BSTernaryExpression
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
   * The cached value of the '{@link #getMiddle() <em>Middle</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiddle()
   * @generated
   * @ordered
   */
  protected BSExpression middle;

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
  protected BSTernaryExpressionImpl()
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
    return BlorqueScriptPackage.Literals.BS_TERNARY_EXPRESSION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_TERNARY_EXPRESSION__LEFT, oldLeft, newLeft);
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
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_TERNARY_EXPRESSION__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_TERNARY_EXPRESSION__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_TERNARY_EXPRESSION__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSExpression getMiddle()
  {
    return middle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMiddle(BSExpression newMiddle, NotificationChain msgs)
  {
    BSExpression oldMiddle = middle;
    middle = newMiddle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_TERNARY_EXPRESSION__MIDDLE, oldMiddle, newMiddle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMiddle(BSExpression newMiddle)
  {
    if (newMiddle != middle)
    {
      NotificationChain msgs = null;
      if (middle != null)
        msgs = ((InternalEObject)middle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_TERNARY_EXPRESSION__MIDDLE, null, msgs);
      if (newMiddle != null)
        msgs = ((InternalEObject)newMiddle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_TERNARY_EXPRESSION__MIDDLE, null, msgs);
      msgs = basicSetMiddle(newMiddle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_TERNARY_EXPRESSION__MIDDLE, newMiddle, newMiddle));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_TERNARY_EXPRESSION__RIGHT, oldRight, newRight);
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
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_TERNARY_EXPRESSION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_TERNARY_EXPRESSION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_TERNARY_EXPRESSION__RIGHT, newRight, newRight));
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
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__LEFT:
        return basicSetLeft(null, msgs);
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__MIDDLE:
        return basicSetMiddle(null, msgs);
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__RIGHT:
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
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__LEFT:
        return getLeft();
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__MIDDLE:
        return getMiddle();
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__RIGHT:
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
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__LEFT:
        setLeft((BSExpression)newValue);
        return;
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__MIDDLE:
        setMiddle((BSExpression)newValue);
        return;
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__RIGHT:
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
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__LEFT:
        setLeft((BSExpression)null);
        return;
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__MIDDLE:
        setMiddle((BSExpression)null);
        return;
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__RIGHT:
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
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__LEFT:
        return left != null;
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__MIDDLE:
        return middle != null;
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

} //BSTernaryExpressionImpl