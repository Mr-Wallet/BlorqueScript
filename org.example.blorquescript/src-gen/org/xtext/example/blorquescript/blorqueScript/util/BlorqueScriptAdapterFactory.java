/**
 */
package org.xtext.example.blorquescript.blorqueScript.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.blorquescript.blorqueScript.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage
 * @generated
 */
public class BlorqueScriptAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BlorqueScriptPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlorqueScriptAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BlorqueScriptPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlorqueScriptSwitch<Adapter> modelSwitch =
    new BlorqueScriptSwitch<Adapter>()
    {
      @Override
      public Adapter caseBSFile(BSFile object)
      {
        return createBSFileAdapter();
      }
      @Override
      public Adapter caseBSImport(BSImport object)
      {
        return createBSImportAdapter();
      }
      @Override
      public Adapter caseBSClass(BSClass object)
      {
        return createBSClassAdapter();
      }
      @Override
      public Adapter caseBSMember(BSMember object)
      {
        return createBSMemberAdapter();
      }
      @Override
      public Adapter caseBSField(BSField object)
      {
        return createBSFieldAdapter();
      }
      @Override
      public Adapter caseBSMethod(BSMethod object)
      {
        return createBSMethodAdapter();
      }
      @Override
      public Adapter caseBSParameter(BSParameter object)
      {
        return createBSParameterAdapter();
      }
      @Override
      public Adapter caseBSMethodBody(BSMethodBody object)
      {
        return createBSMethodBodyAdapter();
      }
      @Override
      public Adapter caseBSStatement(BSStatement object)
      {
        return createBSStatementAdapter();
      }
      @Override
      public Adapter caseBSReturn(BSReturn object)
      {
        return createBSReturnAdapter();
      }
      @Override
      public Adapter caseBSVariableDeclaration(BSVariableDeclaration object)
      {
        return createBSVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseBSIfStatement(BSIfStatement object)
      {
        return createBSIfStatementAdapter();
      }
      @Override
      public Adapter caseBSIfBlock(BSIfBlock object)
      {
        return createBSIfBlockAdapter();
      }
      @Override
      public Adapter caseBSBlock(BSBlock object)
      {
        return createBSBlockAdapter();
      }
      @Override
      public Adapter caseBSSymbol(BSSymbol object)
      {
        return createBSSymbolAdapter();
      }
      @Override
      public Adapter caseBSExpression(BSExpression object)
      {
        return createBSExpressionAdapter();
      }
      @Override
      public Adapter caseBSAssignment(BSAssignment object)
      {
        return createBSAssignmentAdapter();
      }
      @Override
      public Adapter caseBSMemberSelection(BSMemberSelection object)
      {
        return createBSMemberSelectionAdapter();
      }
      @Override
      public Adapter caseBSStringConstant(BSStringConstant object)
      {
        return createBSStringConstantAdapter();
      }
      @Override
      public Adapter caseBSNumberConstant(BSNumberConstant object)
      {
        return createBSNumberConstantAdapter();
      }
      @Override
      public Adapter caseBSBooleanConstant(BSBooleanConstant object)
      {
        return createBSBooleanConstantAdapter();
      }
      @Override
      public Adapter caseBSNull(BSNull object)
      {
        return createBSNullAdapter();
      }
      @Override
      public Adapter caseBSThis(BSThis object)
      {
        return createBSThisAdapter();
      }
      @Override
      public Adapter caseBSClient(BSClient object)
      {
        return createBSClientAdapter();
      }
      @Override
      public Adapter caseBSSymbolRef(BSSymbolRef object)
      {
        return createBSSymbolRefAdapter();
      }
      @Override
      public Adapter caseBSNew(BSNew object)
      {
        return createBSNewAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSFile <em>BS File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSFile
   * @generated
   */
  public Adapter createBSFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSImport <em>BS Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSImport
   * @generated
   */
  public Adapter createBSImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSClass <em>BS Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSClass
   * @generated
   */
  public Adapter createBSClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSMember <em>BS Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMember
   * @generated
   */
  public Adapter createBSMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSField <em>BS Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSField
   * @generated
   */
  public Adapter createBSFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSMethod <em>BS Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMethod
   * @generated
   */
  public Adapter createBSMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSParameter <em>BS Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSParameter
   * @generated
   */
  public Adapter createBSParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSMethodBody <em>BS Method Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMethodBody
   * @generated
   */
  public Adapter createBSMethodBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSStatement <em>BS Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSStatement
   * @generated
   */
  public Adapter createBSStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSReturn <em>BS Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSReturn
   * @generated
   */
  public Adapter createBSReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSVariableDeclaration <em>BS Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSVariableDeclaration
   * @generated
   */
  public Adapter createBSVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSIfStatement <em>BS If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSIfStatement
   * @generated
   */
  public Adapter createBSIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSIfBlock <em>BS If Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSIfBlock
   * @generated
   */
  public Adapter createBSIfBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSBlock <em>BS Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSBlock
   * @generated
   */
  public Adapter createBSBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSSymbol <em>BS Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSSymbol
   * @generated
   */
  public Adapter createBSSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSExpression <em>BS Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSExpression
   * @generated
   */
  public Adapter createBSExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSAssignment <em>BS Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSAssignment
   * @generated
   */
  public Adapter createBSAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection <em>BS Member Selection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMemberSelection
   * @generated
   */
  public Adapter createBSMemberSelectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSStringConstant <em>BS String Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSStringConstant
   * @generated
   */
  public Adapter createBSStringConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSNumberConstant <em>BS Number Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSNumberConstant
   * @generated
   */
  public Adapter createBSNumberConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSBooleanConstant <em>BS Boolean Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSBooleanConstant
   * @generated
   */
  public Adapter createBSBooleanConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSNull <em>BS Null</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSNull
   * @generated
   */
  public Adapter createBSNullAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSThis <em>BS This</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSThis
   * @generated
   */
  public Adapter createBSThisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSClient <em>BS Client</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSClient
   * @generated
   */
  public Adapter createBSClientAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSSymbolRef <em>BS Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSSymbolRef
   * @generated
   */
  public Adapter createBSSymbolRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.blorquescript.blorqueScript.BSNew <em>BS New</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.blorquescript.blorqueScript.BSNew
   * @generated
   */
  public Adapter createBSNewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BlorqueScriptAdapterFactory
