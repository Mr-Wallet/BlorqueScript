/**
 */
package org.example.blorquescript.blorqueScript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.blorquescript.blorqueScript.BSCase;
import org.example.blorquescript.blorqueScript.BSSwitchBlock;
import org.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS Switch Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.blorquescript.blorqueScript.impl.BSSwitchBlockImpl#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSSwitchBlockImpl extends BSBlockImpl implements BSSwitchBlock
{
  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<BSCase> cases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSSwitchBlockImpl()
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
    return BlorqueScriptPackage.Literals.BS_SWITCH_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BSCase> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<BSCase>(BSCase.class, this, BlorqueScriptPackage.BS_SWITCH_BLOCK__CASES);
    }
    return cases;
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
      case BlorqueScriptPackage.BS_SWITCH_BLOCK__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
      case BlorqueScriptPackage.BS_SWITCH_BLOCK__CASES:
        return getCases();
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
      case BlorqueScriptPackage.BS_SWITCH_BLOCK__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends BSCase>)newValue);
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
      case BlorqueScriptPackage.BS_SWITCH_BLOCK__CASES:
        getCases().clear();
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
      case BlorqueScriptPackage.BS_SWITCH_BLOCK__CASES:
        return cases != null && !cases.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BSSwitchBlockImpl
