/**
 */
package org.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.blorquescript.blorqueScript.BSExpression;
import org.example.blorquescript.blorqueScript.BSSwitchBlock;
import org.example.blorquescript.blorqueScript.BSSwitchStatement;
import org.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSSwitchStatementImpl#isStringSwitch <em>String Switch</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSSwitchStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSSwitchStatementImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSSwitchStatementImpl extends BSStatementImpl implements BSSwitchStatement
{
  /**
   * The default value of the '{@link #isStringSwitch() <em>String Switch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStringSwitch()
   * @generated
   * @ordered
   */
  protected static final boolean STRING_SWITCH_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStringSwitch() <em>String Switch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStringSwitch()
   * @generated
   * @ordered
   */
  protected boolean stringSwitch = STRING_SWITCH_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected BSExpression expression;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected BSSwitchBlock block;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSSwitchStatementImpl()
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
    return BlorqueScriptPackage.Literals.BS_SWITCH_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStringSwitch()
  {
    return stringSwitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringSwitch(boolean newStringSwitch)
  {
    boolean oldStringSwitch = stringSwitch;
    stringSwitch = newStringSwitch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_SWITCH_STATEMENT__STRING_SWITCH, oldStringSwitch, stringSwitch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSExpression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(BSExpression newExpression, NotificationChain msgs)
  {
    BSExpression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_SWITCH_STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(BSExpression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_SWITCH_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_SWITCH_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_SWITCH_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSSwitchBlock getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(BSSwitchBlock newBlock, NotificationChain msgs)
  {
    BSSwitchBlock oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_SWITCH_STATEMENT__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(BSSwitchBlock newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_SWITCH_STATEMENT__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_SWITCH_STATEMENT__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_SWITCH_STATEMENT__BLOCK, newBlock, newBlock));
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
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__BLOCK:
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
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__STRING_SWITCH:
        return isStringSwitch();
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__EXPRESSION:
        return getExpression();
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__BLOCK:
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
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__STRING_SWITCH:
        setStringSwitch((Boolean)newValue);
        return;
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__EXPRESSION:
        setExpression((BSExpression)newValue);
        return;
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__BLOCK:
        setBlock((BSSwitchBlock)newValue);
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
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__STRING_SWITCH:
        setStringSwitch(STRING_SWITCH_EDEFAULT);
        return;
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__EXPRESSION:
        setExpression((BSExpression)null);
        return;
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__BLOCK:
        setBlock((BSSwitchBlock)null);
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
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__STRING_SWITCH:
        return stringSwitch != STRING_SWITCH_EDEFAULT;
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__EXPRESSION:
        return expression != null;
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT__BLOCK:
        return block != null;
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
    result.append(" (stringSwitch: ");
    result.append(stringSwitch);
    result.append(')');
    return result.toString();
  }

} //BSSwitchStatementImpl
