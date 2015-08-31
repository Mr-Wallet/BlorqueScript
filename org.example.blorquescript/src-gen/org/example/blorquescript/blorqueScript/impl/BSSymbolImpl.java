/**
 */
package org.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.blorquescript.blorqueScript.BSClass;
import org.example.blorquescript.blorqueScript.BSPrimitiveType;
import org.example.blorquescript.blorqueScript.BSSymbol;
import org.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSSymbolImpl#getPType <em>PType</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSSymbolImpl#getRType <em>RType</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSSymbolImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSSymbolImpl extends MinimalEObjectImpl.Container implements BSSymbol
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSSymbolImpl()
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
    return BlorqueScriptPackage.Literals.BS_SYMBOL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_SYMBOL__PTYPE, oldPType, pType));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlorqueScriptPackage.BS_SYMBOL__RTYPE, oldRType, rType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_SYMBOL__RTYPE, oldRType, rType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_SYMBOL__NAME, oldName, name));
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
      case BlorqueScriptPackage.BS_SYMBOL__PTYPE:
        return getPType();
      case BlorqueScriptPackage.BS_SYMBOL__RTYPE:
        if (resolve) return getRType();
        return basicGetRType();
      case BlorqueScriptPackage.BS_SYMBOL__NAME:
        return getName();
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
      case BlorqueScriptPackage.BS_SYMBOL__PTYPE:
        setPType((BSPrimitiveType)newValue);
        return;
      case BlorqueScriptPackage.BS_SYMBOL__RTYPE:
        setRType((BSClass)newValue);
        return;
      case BlorqueScriptPackage.BS_SYMBOL__NAME:
        setName((String)newValue);
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
      case BlorqueScriptPackage.BS_SYMBOL__PTYPE:
        setPType(PTYPE_EDEFAULT);
        return;
      case BlorqueScriptPackage.BS_SYMBOL__RTYPE:
        setRType((BSClass)null);
        return;
      case BlorqueScriptPackage.BS_SYMBOL__NAME:
        setName(NAME_EDEFAULT);
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
      case BlorqueScriptPackage.BS_SYMBOL__PTYPE:
        return pType != PTYPE_EDEFAULT;
      case BlorqueScriptPackage.BS_SYMBOL__RTYPE:
        return rType != null;
      case BlorqueScriptPackage.BS_SYMBOL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BSSymbolImpl
