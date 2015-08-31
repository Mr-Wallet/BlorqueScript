/**
 */
package org.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.blorquescript.blorqueScript.BSCastExpression;
import org.example.blorquescript.blorqueScript.BSExpression;
import org.example.blorquescript.blorqueScript.BSPrimitiveType;
import org.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSCastExpressionImpl#getPType <em>PType</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSCastExpressionImpl#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSCastExpressionImpl#getCastExpr <em>Cast Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSCastExpressionImpl extends BSExpressionImpl implements BSCastExpression
{
  /**
   * The default value of the '{@link #getPType() <em>PType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPType()
   * @generated
   * @ordered
   */
  protected static final BSPrimitiveType PTYPE_EDEFAULT = BSPrimitiveType.NONE;

  /**
   * The cached value of the '{@link #getPType() <em>PType</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPType()
   * @generated
   * @ordered
   */
  protected BSPrimitiveType pType = PTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsArray() <em>Is Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsArray()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ARRAY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsArray() <em>Is Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsArray()
   * @generated
   * @ordered
   */
  protected boolean isArray = IS_ARRAY_EDEFAULT;

  /**
   * The cached value of the '{@link #getCastExpr() <em>Cast Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastExpr()
   * @generated
   * @ordered
   */
  protected BSExpression castExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSCastExpressionImpl()
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
    return BlorqueScriptPackage.Literals.BS_CAST_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSPrimitiveType getPType()
  {
    return pType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPType(BSPrimitiveType newPType)
  {
    BSPrimitiveType oldPType = pType;
    pType = newPType == null ? PTYPE_EDEFAULT : newPType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_CAST_EXPRESSION__PTYPE, oldPType, pType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsArray()
  {
    return isArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsArray(boolean newIsArray)
  {
    boolean oldIsArray = isArray;
    isArray = newIsArray;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_CAST_EXPRESSION__IS_ARRAY, oldIsArray, isArray));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSExpression getCastExpr()
  {
    return castExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCastExpr(BSExpression newCastExpr, NotificationChain msgs)
  {
    BSExpression oldCastExpr = castExpr;
    castExpr = newCastExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_CAST_EXPRESSION__CAST_EXPR, oldCastExpr, newCastExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCastExpr(BSExpression newCastExpr)
  {
    if (newCastExpr != castExpr)
    {
      NotificationChain msgs = null;
      if (castExpr != null)
        msgs = ((InternalEObject)castExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_CAST_EXPRESSION__CAST_EXPR, null, msgs);
      if (newCastExpr != null)
        msgs = ((InternalEObject)newCastExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_CAST_EXPRESSION__CAST_EXPR, null, msgs);
      msgs = basicSetCastExpr(newCastExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_CAST_EXPRESSION__CAST_EXPR, newCastExpr, newCastExpr));
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
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__CAST_EXPR:
        return basicSetCastExpr(null, msgs);
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
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__PTYPE:
        return getPType();
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__IS_ARRAY:
        return isIsArray();
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__CAST_EXPR:
        return getCastExpr();
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
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__PTYPE:
        setPType((BSPrimitiveType)newValue);
        return;
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__IS_ARRAY:
        setIsArray((Boolean)newValue);
        return;
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__CAST_EXPR:
        setCastExpr((BSExpression)newValue);
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
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__PTYPE:
        setPType(PTYPE_EDEFAULT);
        return;
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__IS_ARRAY:
        setIsArray(IS_ARRAY_EDEFAULT);
        return;
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__CAST_EXPR:
        setCastExpr((BSExpression)null);
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
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__PTYPE:
        return pType != PTYPE_EDEFAULT;
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__IS_ARRAY:
        return isArray != IS_ARRAY_EDEFAULT;
      case BlorqueScriptPackage.BS_CAST_EXPRESSION__CAST_EXPR:
        return castExpr != null;
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
    result.append(" (pType: ");
    result.append(pType);
    result.append(", isArray: ");
    result.append(isArray);
    result.append(')');
    return result.toString();
  }

} //BSCastExpressionImpl
