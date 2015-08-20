/**
 */
package org.xtext.example.blorquescript.blorqueScript.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.blorquescript.blorqueScript.BSExpression;
import org.xtext.example.blorquescript.blorqueScript.BSSymbol;
import org.xtext.example.blorquescript.blorqueScript.BSSymbolRef;
import org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BS Symbol Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.impl.BSSymbolRefImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.impl.BSSymbolRefImpl#isMethodinvocation <em>Methodinvocation</em>}</li>
 *   <li>{@link org.xtext.example.blorquescript.blorqueScript.impl.BSSymbolRefImpl#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BSSymbolRefImpl extends BSExpressionImpl implements BSSymbolRef
{
  /**
   * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected BSSymbol symbol;

  /**
   * The default value of the '{@link #isMethodinvocation() <em>Methodinvocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMethodinvocation()
   * @generated
   * @ordered
   */
  protected static final boolean METHODINVOCATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMethodinvocation() <em>Methodinvocation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMethodinvocation()
   * @generated
   * @ordered
   */
  protected boolean methodinvocation = METHODINVOCATION_EDEFAULT;

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
  protected BSSymbolRefImpl()
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
    return BlorqueScriptPackage.Literals.BS_SYMBOL_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSSymbol getSymbol()
  {
    if (symbol != null && symbol.eIsProxy())
    {
      InternalEObject oldSymbol = (InternalEObject)symbol;
      symbol = (BSSymbol)eResolveProxy(oldSymbol);
      if (symbol != oldSymbol)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlorqueScriptPackage.BS_SYMBOL_REF__SYMBOL, oldSymbol, symbol));
      }
    }
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSSymbol basicGetSymbol()
  {
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbol(BSSymbol newSymbol)
  {
    BSSymbol oldSymbol = symbol;
    symbol = newSymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_SYMBOL_REF__SYMBOL, oldSymbol, symbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMethodinvocation()
  {
    return methodinvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodinvocation(boolean newMethodinvocation)
  {
    boolean oldMethodinvocation = methodinvocation;
    methodinvocation = newMethodinvocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlorqueScriptPackage.BS_SYMBOL_REF__METHODINVOCATION, oldMethodinvocation, methodinvocation));
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
      args = new EObjectContainmentEList<BSExpression>(BSExpression.class, this, BlorqueScriptPackage.BS_SYMBOL_REF__ARGS);
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
      case BlorqueScriptPackage.BS_SYMBOL_REF__ARGS:
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
      case BlorqueScriptPackage.BS_SYMBOL_REF__SYMBOL:
        if (resolve) return getSymbol();
        return basicGetSymbol();
      case BlorqueScriptPackage.BS_SYMBOL_REF__METHODINVOCATION:
        return isMethodinvocation();
      case BlorqueScriptPackage.BS_SYMBOL_REF__ARGS:
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
      case BlorqueScriptPackage.BS_SYMBOL_REF__SYMBOL:
        setSymbol((BSSymbol)newValue);
        return;
      case BlorqueScriptPackage.BS_SYMBOL_REF__METHODINVOCATION:
        setMethodinvocation((Boolean)newValue);
        return;
      case BlorqueScriptPackage.BS_SYMBOL_REF__ARGS:
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
      case BlorqueScriptPackage.BS_SYMBOL_REF__SYMBOL:
        setSymbol((BSSymbol)null);
        return;
      case BlorqueScriptPackage.BS_SYMBOL_REF__METHODINVOCATION:
        setMethodinvocation(METHODINVOCATION_EDEFAULT);
        return;
      case BlorqueScriptPackage.BS_SYMBOL_REF__ARGS:
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
      case BlorqueScriptPackage.BS_SYMBOL_REF__SYMBOL:
        return symbol != null;
      case BlorqueScriptPackage.BS_SYMBOL_REF__METHODINVOCATION:
        return methodinvocation != METHODINVOCATION_EDEFAULT;
      case BlorqueScriptPackage.BS_SYMBOL_REF__ARGS:
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
    result.append(" (methodinvocation: ");
    result.append(methodinvocation);
    result.append(')');
    return result.toString();
  }

} //BSSymbolRefImpl
