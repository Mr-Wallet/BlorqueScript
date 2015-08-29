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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.blorquescript.blorqueScript.BSClass;
import org.example.blorquescript.blorqueScript.BSMember;
import org.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSClassImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSClassImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSClassImpl extends MinimalEObjectImpl.Container implements BSClass
{
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
   * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperclass()
   * @generated
   * @ordered
   */
  protected BSClass superclass;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<BSMember> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSClassImpl()
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
    return BlorqueScriptPackage.Literals.BS_CLASS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_CLASS__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSClass getSuperclass()
  {
    if (superclass != null && superclass.eIsProxy())
    {
      InternalEObject oldSuperclass = (InternalEObject)superclass;
      superclass = (BSClass)eResolveProxy(oldSuperclass);
      if (superclass != oldSuperclass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlorqueScriptPackage.BS_CLASS__SUPERCLASS, oldSuperclass, superclass));
      }
    }
    return superclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSClass basicGetSuperclass()
  {
    return superclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperclass(BSClass newSuperclass)
  {
    BSClass oldSuperclass = superclass;
    superclass = newSuperclass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_CLASS__SUPERCLASS, oldSuperclass, superclass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BSMember> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<BSMember>(BSMember.class, this, BlorqueScriptPackage.BS_CLASS__MEMBERS);
    }
    return members;
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
      case BlorqueScriptPackage.BS_CLASS__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case BlorqueScriptPackage.BS_CLASS__NAME:
        return getName();
      case BlorqueScriptPackage.BS_CLASS__SUPERCLASS:
        if (resolve) return getSuperclass();
        return basicGetSuperclass();
      case BlorqueScriptPackage.BS_CLASS__MEMBERS:
        return getMembers();
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
      case BlorqueScriptPackage.BS_CLASS__NAME:
        setName((String)newValue);
        return;
      case BlorqueScriptPackage.BS_CLASS__SUPERCLASS:
        setSuperclass((BSClass)newValue);
        return;
      case BlorqueScriptPackage.BS_CLASS__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends BSMember>)newValue);
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
      case BlorqueScriptPackage.BS_CLASS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BlorqueScriptPackage.BS_CLASS__SUPERCLASS:
        setSuperclass((BSClass)null);
        return;
      case BlorqueScriptPackage.BS_CLASS__MEMBERS:
        getMembers().clear();
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
      case BlorqueScriptPackage.BS_CLASS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BlorqueScriptPackage.BS_CLASS__SUPERCLASS:
        return superclass != null;
      case BlorqueScriptPackage.BS_CLASS__MEMBERS:
        return members != null && !members.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BSClassImpl
