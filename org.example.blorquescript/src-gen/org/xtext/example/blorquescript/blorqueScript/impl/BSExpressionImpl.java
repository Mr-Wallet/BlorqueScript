/**
 */
package org.xtext.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.blorquescript.blorqueScript.BSExpression;
import org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.impl.BSExpressionImpl#getCastType <em>Cast Type</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.impl.BSExpressionImpl#getCastExpr <em>Cast Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSExpressionImpl extends BSStatementImpl implements BSExpression
{
  /**
   * The default value of the '{@link #getCastType() <em>Cast Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastType()
   * @generated
   * @ordered
   */
  protected static final String CAST_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCastType() <em>Cast Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastType()
   * @generated
   * @ordered
   */
  protected String castType = CAST_TYPE_EDEFAULT;

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
  protected BSExpressionImpl()
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
    return BlorqueScriptPackage.Literals.BS_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCastType()
  {
    return castType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCastType(String newCastType)
  {
    String oldCastType = castType;
    castType = newCastType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_EXPRESSION__CAST_TYPE, oldCastType, castType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_EXPRESSION__CAST_EXPR, oldCastExpr, newCastExpr);
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
        msgs = ((InternalEObject)castExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_EXPRESSION__CAST_EXPR, null, msgs);
      if (newCastExpr != null)
        msgs = ((InternalEObject)newCastExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_EXPRESSION__CAST_EXPR, null, msgs);
      msgs = basicSetCastExpr(newCastExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_EXPRESSION__CAST_EXPR, newCastExpr, newCastExpr));
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
      case BlorqueScriptPackage.BS_EXPRESSION__CAST_EXPR:
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
      case BlorqueScriptPackage.BS_EXPRESSION__CAST_TYPE:
        return getCastType();
      case BlorqueScriptPackage.BS_EXPRESSION__CAST_EXPR:
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
      case BlorqueScriptPackage.BS_EXPRESSION__CAST_TYPE:
        setCastType((String)newValue);
        return;
      case BlorqueScriptPackage.BS_EXPRESSION__CAST_EXPR:
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
      case BlorqueScriptPackage.BS_EXPRESSION__CAST_TYPE:
        setCastType(CAST_TYPE_EDEFAULT);
        return;
      case BlorqueScriptPackage.BS_EXPRESSION__CAST_EXPR:
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
      case BlorqueScriptPackage.BS_EXPRESSION__CAST_TYPE:
        return CAST_TYPE_EDEFAULT == null ? castType != null : !CAST_TYPE_EDEFAULT.equals(castType);
      case BlorqueScriptPackage.BS_EXPRESSION__CAST_EXPR:
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
    result.append(" (castType: ");
    result.append(castType);
    result.append(')');
    return result.toString();
  }

} //BSExpressionImpl
