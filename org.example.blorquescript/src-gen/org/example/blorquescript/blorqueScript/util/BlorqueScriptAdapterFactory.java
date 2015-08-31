/**
 */
package org.example.blorquescript.blorqueScript.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.example.blorquescript.blorqueScript.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage
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
      public Adapter caseBSBreak(BSBreak object)
      {
        return createBSBreakAdapter();
      }
      @Override
      public Adapter caseBSContinue(BSContinue object)
      {
        return createBSContinueAdapter();
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
      public Adapter caseBSWhileLoop(BSWhileLoop object)
      {
        return createBSWhileLoopAdapter();
      }
      @Override
      public Adapter caseBSForLoop(BSForLoop object)
      {
        return createBSForLoopAdapter();
      }
      @Override
      public Adapter caseBSSwitchStatement(BSSwitchStatement object)
      {
        return createBSSwitchStatementAdapter();
      }
      @Override
      public Adapter caseBSIfBlock(BSIfBlock object)
      {
        return createBSIfBlockAdapter();
      }
      @Override
      public Adapter caseBSLoopBlock(BSLoopBlock object)
      {
        return createBSLoopBlockAdapter();
      }
      @Override
      public Adapter caseBSSwitchBlock(BSSwitchBlock object)
      {
        return createBSSwitchBlockAdapter();
      }
      @Override
      public Adapter caseBSCase(BSCase object)
      {
        return createBSCaseAdapter();
      }
      @Override
      public Adapter caseBSCaseBlock(BSCaseBlock object)
      {
        return createBSCaseBlockAdapter();
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
      public Adapter caseBSAssignmentExpression(BSAssignmentExpression object)
      {
        return createBSAssignmentExpressionAdapter();
      }
      @Override
      public Adapter caseBSTernaryExpression(BSTernaryExpression object)
      {
        return createBSTernaryExpressionAdapter();
      }
      @Override
      public Adapter caseBSBooleanOrExpression(BSBooleanOrExpression object)
      {
        return createBSBooleanOrExpressionAdapter();
      }
      @Override
      public Adapter caseBSBooleanAndExpression(BSBooleanAndExpression object)
      {
        return createBSBooleanAndExpressionAdapter();
      }
      @Override
      public Adapter caseBSBitwiseOrExpression(BSBitwiseOrExpression object)
      {
        return createBSBitwiseOrExpressionAdapter();
      }
      @Override
      public Adapter caseBSBitwiseXorExpression(BSBitwiseXorExpression object)
      {
        return createBSBitwiseXorExpressionAdapter();
      }
      @Override
      public Adapter caseBSBitwiseAndExpression(BSBitwiseAndExpression object)
      {
        return createBSBitwiseAndExpressionAdapter();
      }
      @Override
      public Adapter caseBSEqualityExpression(BSEqualityExpression object)
      {
        return createBSEqualityExpressionAdapter();
      }
      @Override
      public Adapter caseBSOrderedRelationExpression(BSOrderedRelationExpression object)
      {
        return createBSOrderedRelationExpressionAdapter();
      }
      @Override
      public Adapter caseBSBitwiseShiftExpression(BSBitwiseShiftExpression object)
      {
        return createBSBitwiseShiftExpressionAdapter();
      }
      @Override
      public Adapter caseBSPlusMinusOrStringConcatExpression(BSPlusMinusOrStringConcatExpression object)
      {
        return createBSPlusMinusOrStringConcatExpressionAdapter();
      }
      @Override
      public Adapter caseBSMulDivOrModExpression(BSMulDivOrModExpression object)
      {
        return createBSMulDivOrModExpressionAdapter();
      }
      @Override
      public Adapter caseBSCastExpression(BSCastExpression object)
      {
        return createBSCastExpressionAdapter();
      }
      @Override
      public Adapter caseBSNewExpression(BSNewExpression object)
      {
        return createBSNewExpressionAdapter();
      }
      @Override
      public Adapter caseBSUnaryModifierExpression(BSUnaryModifierExpression object)
      {
        return createBSUnaryModifierExpressionAdapter();
      }
      @Override
      public Adapter caseBSMemberSelectionExpression(BSMemberSelectionExpression object)
      {
        return createBSMemberSelectionExpressionAdapter();
      }
      @Override
      public Adapter caseBSMethodInvokationExpression(BSMethodInvokationExpression object)
      {
        return createBSMethodInvokationExpressionAdapter();
      }
      @Override
      public Adapter caseBSArrayAccessExpression(BSArrayAccessExpression object)
      {
        return createBSArrayAccessExpressionAdapter();
      }
      @Override
      public Adapter caseBSPostfixArithmeticExpression(BSPostfixArithmeticExpression object)
      {
        return createBSPostfixArithmeticExpressionAdapter();
      }
      @Override
      public Adapter caseBSStringConstant(BSStringConstant object)
      {
        return createBSStringConstantAdapter();
      }
      @Override
      public Adapter caseBSHexadecimalConstant(BSHexadecimalConstant object)
      {
        return createBSHexadecimalConstantAdapter();
      }
      @Override
      public Adapter caseBSNumberConstant(BSNumberConstant object)
      {
        return createBSNumberConstantAdapter();
      }
      @Override
      public Adapter caseBSRealConstant(BSRealConstant object)
      {
        return createBSRealConstantAdapter();
      }
      @Override
      public Adapter caseBSBooleanConstant(BSBooleanConstant object)
      {
        return createBSBooleanConstantAdapter();
      }
      @Override
      public Adapter caseBSNullLiteral(BSNullLiteral object)
      {
        return createBSNullLiteralAdapter();
      }
      @Override
      public Adapter caseBSThisLiteral(BSThisLiteral object)
      {
        return createBSThisLiteralAdapter();
      }
      @Override
      public Adapter caseBSClientLiteral(BSClientLiteral object)
      {
        return createBSClientLiteralAdapter();
      }
      @Override
      public Adapter caseBSParentLiteral(BSParentLiteral object)
      {
        return createBSParentLiteralAdapter();
      }
      @Override
      public Adapter caseBSSymbolRef(BSSymbolRef object)
      {
        return createBSSymbolRefAdapter();
      }
      @Override
      public Adapter caseBSParentheticalExpression(BSParentheticalExpression object)
      {
        return createBSParentheticalExpressionAdapter();
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
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSFile <em>BS File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSFile
   * @generated
   */
  public Adapter createBSFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSImport <em>BS Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSImport
   * @generated
   */
  public Adapter createBSImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSClass <em>BS Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSClass
   * @generated
   */
  public Adapter createBSClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSMember <em>BS Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSMember
   * @generated
   */
  public Adapter createBSMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSField <em>BS Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSField
   * @generated
   */
  public Adapter createBSFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSMethod <em>BS Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSMethod
   * @generated
   */
  public Adapter createBSMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSParameter <em>BS Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSParameter
   * @generated
   */
  public Adapter createBSParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSMethodBody <em>BS Method Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSMethodBody
   * @generated
   */
  public Adapter createBSMethodBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSStatement <em>BS Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSStatement
   * @generated
   */
  public Adapter createBSStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSReturn <em>BS Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSReturn
   * @generated
   */
  public Adapter createBSReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSBreak <em>BS Break</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSBreak
   * @generated
   */
  public Adapter createBSBreakAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSContinue <em>BS Continue</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSContinue
   * @generated
   */
  public Adapter createBSContinueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSVariableDeclaration <em>BS Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSVariableDeclaration
   * @generated
   */
  public Adapter createBSVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSIfStatement <em>BS If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSIfStatement
   * @generated
   */
  public Adapter createBSIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSWhileLoop <em>BS While Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSWhileLoop
   * @generated
   */
  public Adapter createBSWhileLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSForLoop <em>BS For Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSForLoop
   * @generated
   */
  public Adapter createBSForLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSSwitchStatement <em>BS Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSSwitchStatement
   * @generated
   */
  public Adapter createBSSwitchStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSIfBlock <em>BS If Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSIfBlock
   * @generated
   */
  public Adapter createBSIfBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSLoopBlock <em>BS Loop Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSLoopBlock
   * @generated
   */
  public Adapter createBSLoopBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSSwitchBlock <em>BS Switch Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSSwitchBlock
   * @generated
   */
  public Adapter createBSSwitchBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSCase <em>BS Case</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSCase
   * @generated
   */
  public Adapter createBSCaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSCaseBlock <em>BS Case Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSCaseBlock
   * @generated
   */
  public Adapter createBSCaseBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSBlock <em>BS Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSBlock
   * @generated
   */
  public Adapter createBSBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSSymbol <em>BS Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSSymbol
   * @generated
   */
  public Adapter createBSSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSExpression <em>BS Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSExpression
   * @generated
   */
  public Adapter createBSExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSAssignmentExpression <em>BS Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSAssignmentExpression
   * @generated
   */
  public Adapter createBSAssignmentExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSTernaryExpression <em>BS Ternary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSTernaryExpression
   * @generated
   */
  public Adapter createBSTernaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSBooleanOrExpression <em>BS Boolean Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSBooleanOrExpression
   * @generated
   */
  public Adapter createBSBooleanOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSBooleanAndExpression <em>BS Boolean And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSBooleanAndExpression
   * @generated
   */
  public Adapter createBSBooleanAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSBitwiseOrExpression <em>BS Bitwise Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseOrExpression
   * @generated
   */
  public Adapter createBSBitwiseOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSBitwiseXorExpression <em>BS Bitwise Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseXorExpression
   * @generated
   */
  public Adapter createBSBitwiseXorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSBitwiseAndExpression <em>BS Bitwise And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseAndExpression
   * @generated
   */
  public Adapter createBSBitwiseAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSEqualityExpression <em>BS Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSEqualityExpression
   * @generated
   */
  public Adapter createBSEqualityExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSOrderedRelationExpression <em>BS Ordered Relation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSOrderedRelationExpression
   * @generated
   */
  public Adapter createBSOrderedRelationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSBitwiseShiftExpression <em>BS Bitwise Shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseShiftExpression
   * @generated
   */
  public Adapter createBSBitwiseShiftExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSPlusMinusOrStringConcatExpression <em>BS Plus Minus Or String Concat Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSPlusMinusOrStringConcatExpression
   * @generated
   */
  public Adapter createBSPlusMinusOrStringConcatExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSMulDivOrModExpression <em>BS Mul Div Or Mod Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSMulDivOrModExpression
   * @generated
   */
  public Adapter createBSMulDivOrModExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSCastExpression <em>BS Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSCastExpression
   * @generated
   */
  public Adapter createBSCastExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSNewExpression <em>BS New Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSNewExpression
   * @generated
   */
  public Adapter createBSNewExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSUnaryModifierExpression <em>BS Unary Modifier Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSUnaryModifierExpression
   * @generated
   */
  public Adapter createBSUnaryModifierExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSMemberSelectionExpression <em>BS Member Selection Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSMemberSelectionExpression
   * @generated
   */
  public Adapter createBSMemberSelectionExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSMethodInvokationExpression <em>BS Method Invokation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSMethodInvokationExpression
   * @generated
   */
  public Adapter createBSMethodInvokationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSArrayAccessExpression <em>BS Array Access Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSArrayAccessExpression
   * @generated
   */
  public Adapter createBSArrayAccessExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSPostfixArithmeticExpression <em>BS Postfix Arithmetic Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSPostfixArithmeticExpression
   * @generated
   */
  public Adapter createBSPostfixArithmeticExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSStringConstant <em>BS String Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSStringConstant
   * @generated
   */
  public Adapter createBSStringConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSHexadecimalConstant <em>BS Hexadecimal Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSHexadecimalConstant
   * @generated
   */
  public Adapter createBSHexadecimalConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSNumberConstant <em>BS Number Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSNumberConstant
   * @generated
   */
  public Adapter createBSNumberConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSRealConstant <em>BS Real Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSRealConstant
   * @generated
   */
  public Adapter createBSRealConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSBooleanConstant <em>BS Boolean Constant</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSBooleanConstant
   * @generated
   */
  public Adapter createBSBooleanConstantAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSNullLiteral <em>BS Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSNullLiteral
   * @generated
   */
  public Adapter createBSNullLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSThisLiteral <em>BS This Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSThisLiteral
   * @generated
   */
  public Adapter createBSThisLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSClientLiteral <em>BS Client Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSClientLiteral
   * @generated
   */
  public Adapter createBSClientLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSParentLiteral <em>BS Parent Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSParentLiteral
   * @generated
   */
  public Adapter createBSParentLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSSymbolRef <em>BS Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSSymbolRef
   * @generated
   */
  public Adapter createBSSymbolRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.example.blorquescript.blorqueScript.BSParentheticalExpression <em>BS Parenthetical Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.example.blorquescript.blorqueScript.BSParentheticalExpression
   * @generated
   */
  public Adapter createBSParentheticalExpressionAdapter()
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
