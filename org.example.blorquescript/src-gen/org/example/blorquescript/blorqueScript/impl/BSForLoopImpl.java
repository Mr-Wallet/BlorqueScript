/**
 */
package org.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.blorquescript.blorqueScript.BSExpression;
import org.example.blorquescript.blorqueScript.BSForLoop;
import org.example.blorquescript.blorqueScript.BSLoopBlock;
import org.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS For Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSForLoopImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSForLoopImpl#getMiddle <em>Middle</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSForLoopImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSForLoopImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSForLoopImpl extends BSStatementImpl implements BSForLoop
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
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected BSLoopBlock block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSForLoopImpl()
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
    return BlorqueScriptPackage.Literals.BS_FOR_LOOP;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_FOR_LOOP__LEFT, oldLeft, newLeft);
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
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_FOR_LOOP__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_FOR_LOOP__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_FOR_LOOP__LEFT, newLeft, newLeft));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_FOR_LOOP__MIDDLE, oldMiddle, newMiddle);
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
        msgs = ((InternalEObject)middle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_FOR_LOOP__MIDDLE, null, msgs);
      if (newMiddle != null)
        msgs = ((InternalEObject)newMiddle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_FOR_LOOP__MIDDLE, null, msgs);
      msgs = basicSetMiddle(newMiddle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_FOR_LOOP__MIDDLE, newMiddle, newMiddle));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_FOR_LOOP__RIGHT, oldRight, newRight);
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
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_FOR_LOOP__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_FOR_LOOP__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_FOR_LOOP__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSLoopBlock getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(BSLoopBlock newBlock, NotificationChain msgs)
  {
    BSLoopBlock oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_FOR_LOOP__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(BSLoopBlock newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_FOR_LOOP__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_FOR_LOOP__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_FOR_LOOP__BLOCK, newBlock, newBlock));
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
      case BlorqueScriptPackage.BS_FOR_LOOP__LEFT:
        return basicSetLeft(null, msgs);
      case BlorqueScriptPackage.BS_FOR_LOOP__MIDDLE:
        return basicSetMiddle(null, msgs);
      case BlorqueScriptPackage.BS_FOR_LOOP__RIGHT:
        return basicSetRight(null, msgs);
      case BlorqueScriptPackage.BS_FOR_LOOP__BLOCK:
        return basicSetBlock(null, msgs);
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
      case BlorqueScriptPackage.BS_FOR_LOOP__LEFT:
        return getLeft();
      case BlorqueScriptPackage.BS_FOR_LOOP__MIDDLE:
        return getMiddle();
      case BlorqueScriptPackage.BS_FOR_LOOP__RIGHT:
        return getRight();
      case BlorqueScriptPackage.BS_FOR_LOOP__BLOCK:
        return getBlock();
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
      case BlorqueScriptPackage.BS_FOR_LOOP__LEFT:
        setLeft((BSExpression)newValue);
        return;
      case BlorqueScriptPackage.BS_FOR_LOOP__MIDDLE:
        setMiddle((BSExpression)newValue);
        return;
      case BlorqueScriptPackage.BS_FOR_LOOP__RIGHT:
        setRight((BSExpression)newValue);
        return;
      case BlorqueScriptPackage.BS_FOR_LOOP__BLOCK:
        setBlock((BSLoopBlock)newValue);
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
      case BlorqueScriptPackage.BS_FOR_LOOP__LEFT:
        setLeft((BSExpression)null);
        return;
      case BlorqueScriptPackage.BS_FOR_LOOP__MIDDLE:
        setMiddle((BSExpression)null);
        return;
      case BlorqueScriptPackage.BS_FOR_LOOP__RIGHT:
        setRight((BSExpression)null);
        return;
      case BlorqueScriptPackage.BS_FOR_LOOP__BLOCK:
        setBlock((BSLoopBlock)null);
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
      case BlorqueScriptPackage.BS_FOR_LOOP__LEFT:
        return left != null;
      case BlorqueScriptPackage.BS_FOR_LOOP__MIDDLE:
        return middle != null;
      case BlorqueScriptPackage.BS_FOR_LOOP__RIGHT:
        return right != null;
      case BlorqueScriptPackage.BS_FOR_LOOP__BLOCK:
        return block != null;
    }
    return super.eIsSet(featureID);
  }

} //BSForLoopImpl
