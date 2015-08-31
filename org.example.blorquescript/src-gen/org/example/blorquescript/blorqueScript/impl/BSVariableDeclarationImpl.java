/**
 */
package org.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.blorquescript.blorqueScript.BSClass;
import org.example.blorquescript.blorqueScript.BSExpression;
import org.example.blorquescript.blorqueScript.BSPrimitiveType;
import org.example.blorquescript.blorqueScript.BSSymbol;
import org.example.blorquescript.blorqueScript.BSVariableDeclaration;
import org.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSVariableDeclarationImpl#getPType <em>PType</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSVariableDeclarationImpl#getRType <em>RType</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSVariableDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSVariableDeclarationImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSVariableDeclarationImpl extends BSStatementImpl implements BSVariableDeclaration
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
   * The cached value of the '{@link #getRType() <em>RType</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRType()
   * @generated
   * @ordered
   */
  protected BSClass rType;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSVariableDeclarationImpl()
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
    return BlorqueScriptPackage.Literals.BS_VARIABLE_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_VARIABLE_DECLARATION__PTYPE, oldPType, pType));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlorqueScriptPackage.BS_VARIABLE_DECLARATION__RTYPE, oldRType, rType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_VARIABLE_DECLARATION__RTYPE, oldRType, rType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_VARIABLE_DECLARATION__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_VARIABLE_DECLARATION__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_VARIABLE_DECLARATION__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlorqueScriptPackage.BS_VARIABLE_DECLARATION__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_VARIABLE_DECLARATION__EXPRESSION, newExpression, newExpression));
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
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__PTYPE:
        return getPType();
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__RTYPE:
        if (resolve) return getRType();
        return basicGetRType();
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__NAME:
        return getName();
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__EXPRESSION:
        return getExpression();
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
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__PTYPE:
        setPType((BSPrimitiveType)newValue);
        return;
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__RTYPE:
        setRType((BSClass)newValue);
        return;
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__EXPRESSION:
        setExpression((BSExpression)newValue);
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
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__PTYPE:
        setPType(PTYPE_EDEFAULT);
        return;
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__RTYPE:
        setRType((BSClass)null);
        return;
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__EXPRESSION:
        setExpression((BSExpression)null);
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
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__PTYPE:
        return pType != PTYPE_EDEFAULT;
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__RTYPE:
        return rType != null;
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == BSSymbol.class)
    {
      switch (derivedFeatureID)
      {
        case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__PTYPE: return BlorqueScriptPackage.BS_SYMBOL__PTYPE;
        case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__RTYPE: return BlorqueScriptPackage.BS_SYMBOL__RTYPE;
        case BlorqueScriptPackage.BS_VARIABLE_DECLARATION__NAME: return BlorqueScriptPackage.BS_SYMBOL__NAME;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == BSSymbol.class)
    {
      switch (baseFeatureID)
      {
        case BlorqueScriptPackage.BS_SYMBOL__PTYPE: return BlorqueScriptPackage.BS_VARIABLE_DECLARATION__PTYPE;
        case BlorqueScriptPackage.BS_SYMBOL__RTYPE: return BlorqueScriptPackage.BS_VARIABLE_DECLARATION__RTYPE;
        case BlorqueScriptPackage.BS_SYMBOL__NAME: return BlorqueScriptPackage.BS_VARIABLE_DECLARATION__NAME;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BSVariableDeclarationImpl
