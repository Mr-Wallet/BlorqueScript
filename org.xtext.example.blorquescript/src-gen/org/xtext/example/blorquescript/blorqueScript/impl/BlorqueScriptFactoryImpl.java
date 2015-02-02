/**
 */
package org.xtext.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.blorquescript.blorqueScript.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlorqueScriptFactoryImpl extends EFactoryImpl implements BlorqueScriptFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BlorqueScriptFactory init()
  {
    try
    {
      BlorqueScriptFactory theBlorqueScriptFactory = (BlorqueScriptFactory)EPackage.Registry.INSTANCE.getEFactory(BlorqueScriptPackage.eNS_URI);
      if (theBlorqueScriptFactory != null)
      {
        return theBlorqueScriptFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BlorqueScriptFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlorqueScriptFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BlorqueScriptPackage.MODEL: return createModel();
      case BlorqueScriptPackage.GREETING: return createGreeting();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Greeting createGreeting()
  {
    GreetingImpl greeting = new GreetingImpl();
    return greeting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlorqueScriptPackage getBlorqueScriptPackage()
  {
    return (BlorqueScriptPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BlorqueScriptPackage getPackage()
  {
    return BlorqueScriptPackage.eINSTANCE;
  }

} //BlorqueScriptFactoryImpl
