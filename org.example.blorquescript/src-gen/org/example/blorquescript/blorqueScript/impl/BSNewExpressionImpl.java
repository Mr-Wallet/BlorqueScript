/**
 */
package org.example.blorquescript.blorqueScript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.blorquescript.blorqueScript.BSClass;
import org.example.blorquescript.blorqueScript.BSExpression;
import org.example.blorquescript.blorqueScript.BSNewExpression;
import org.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS New Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSNewExpressionImpl#getRType <em>RType</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSNewExpressionImpl#isIsArray <em>Is Array</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSNewExpressionImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSNewExpressionImpl extends BSExpressionImpl implements BSNewExpression
{
  /**
   * The cached value of the '{@link #getRType() <em>RType</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRType()
   * @generated
   * @ordered
   */
  protected BSClass rType;

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
  protected BSNewExpressionImpl()
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
    return BlorqueScriptPackage.Literals.BS_NEW_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSClass getRType()
  {
    if (rType != null && rType.eIsProxy())
    {
      InternalEObject oldRType = (InternalEObject)rType;
      rType = (BSClass)eResolveProxy(oldRType);
      if (rType != oldRType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlorqueScriptPackage.BS_NEW_EXPRESSION__RTYPE, oldRType, rType));
      }
    }
    return rType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSClass basicGetRType()
  {
    return rType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRType(BSClass newRType)
  {
    BSClass oldRType = rType;
    rType = newRType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_NEW_EXPRESSION__RTYPE, oldRType, rType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_NEW_EXPRESSION__IS_ARRAY, oldIsArray, isArray));
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
      args = new EObjectContainmentEList<BSExpression>(BSExpression.class, this, BlorqueScriptPackage.BS_NEW_EXPRESSION__ARGS);
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
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__ARGS:
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
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__RTYPE:
        if (resolve) return getRType();
        return basicGetRType();
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__IS_ARRAY:
        return isIsArray();
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__ARGS:
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
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__RTYPE:
        setRType((BSClass)newValue);
        return;
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__IS_ARRAY:
        setIsArray((Boolean)newValue);
        return;
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__ARGS:
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
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__RTYPE:
        setRType((BSClass)null);
        return;
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__IS_ARRAY:
        setIsArray(IS_ARRAY_EDEFAULT);
        return;
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__ARGS:
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
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__RTYPE:
        return rType != null;
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__IS_ARRAY:
        return isArray != IS_ARRAY_EDEFAULT;
      case BlorqueScriptPackage.BS_NEW_EXPRESSION__ARGS:
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
    result.append(" (isArray: ");
    result.append(isArray);
    result.append(')');
    return result.toString();
  }

} //BSNewExpressionImpl
