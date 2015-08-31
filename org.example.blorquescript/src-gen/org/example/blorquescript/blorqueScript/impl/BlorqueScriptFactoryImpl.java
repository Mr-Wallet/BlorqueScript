/**
 */
package org.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.blorquescript.blorqueScript.*;

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
      case BlorqueScriptPackage.BS_FILE: return createBSFile();
      case BlorqueScriptPackage.BS_IMPORT: return createBSImport();
      case BlorqueScriptPackage.BS_CLASS: return createBSClass();
      case BlorqueScriptPackage.BS_MEMBER: return createBSMember();
      case BlorqueScriptPackage.BS_FIELD: return createBSField();
      case BlorqueScriptPackage.BS_METHOD: return createBSMethod();
      case BlorqueScriptPackage.BS_PARAMETER: return createBSParameter();
      case BlorqueScriptPackage.BS_METHOD_BODY: return createBSMethodBody();
      case BlorqueScriptPackage.BS_STATEMENT: return createBSStatement();
      case BlorqueScriptPackage.BS_RETURN: return createBSReturn();
      case BlorqueScriptPackage.BS_BREAK: return createBSBreak();
      case BlorqueScriptPackage.BS_CONTINUE: return createBSContinue();
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION: return createBSVariableDeclaration();
      case BlorqueScriptPackage.BS_IF_STATEMENT: return createBSIfStatement();
      case BlorqueScriptPackage.BS_WHILE_LOOP: return createBSWhileLoop();
      case BlorqueScriptPackage.BS_FOR_LOOP: return createBSForLoop();
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT: return createBSSwitchStatement();
      case BlorqueScriptPackage.BS_IF_BLOCK: return createBSIfBlock();
      case BlorqueScriptPackage.BS_LOOP_BLOCK: return createBSLoopBlock();
      case BlorqueScriptPackage.BS_SWITCH_BLOCK: return createBSSwitchBlock();
      case BlorqueScriptPackage.BS_CASE: return createBSCase();
      case BlorqueScriptPackage.BS_CASE_BLOCK: return createBSCaseBlock();
      case BlorqueScriptPackage.BS_BLOCK: return createBSBlock();
      case BlorqueScriptPackage.BS_SYMBOL: return createBSSymbol();
      case BlorqueScriptPackage.BS_EXPRESSION: return createBSExpression();
      case BlorqueScriptPackage.BS_ASSIGNMENT_EXPRESSION: return createBSAssignmentExpression();
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION: return createBSTernaryExpression();
      case BlorqueScriptPackage.BS_BOOLEAN_OR_EXPRESSION: return createBSBooleanOrExpression();
      case BlorqueScriptPackage.BS_BOOLEAN_AND_EXPRESSION: return createBSBooleanAndExpression();
      case BlorqueScriptPackage.BS_BITWISE_OR_EXPRESSION: return createBSBitwiseOrExpression();
      case BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION: return createBSBitwiseXorExpression();
      case BlorqueScriptPackage.BS_BITWISE_AND_EXPRESSION: return createBSBitwiseAndExpression();
      case BlorqueScriptPackage.BS_EQUALITY_EXPRESSION: return createBSEqualityExpression();
      case BlorqueScriptPackage.BS_ORDERED_RELATION_EXPRESSION: return createBSOrderedRelationExpression();
      case BlorqueScriptPackage.BS_BITWISE_SHIFT_EXPRESSION: return createBSBitwiseShiftExpression();
      case BlorqueScriptPackage.BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION: return createBSPlusMinusOrStringConcatExpression();
      case BlorqueScriptPackage.BS_MUL_DIV_OR_MOD_EXPRESSION: return createBSMulDivOrModExpression();
      case BlorqueScriptPackage.BS_CAST_EXPRESSION: return createBSCastExpression();
      case BlorqueScriptPackage.BS_NEW_EXPRESSION: return createBSNewExpression();
      case BlorqueScriptPackage.BS_UNARY_MODIFIER_EXPRESSION: return createBSUnaryModifierExpression();
      case BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION: return createBSMemberSelectionExpression();
      case BlorqueScriptPackage.BS_METHOD_INVOKATION_EXPRESSION: return createBSMethodInvokationExpression();
      case BlorqueScriptPackage.BS_ARRAY_ACCESS_EXPRESSION: return createBSArrayAccessExpression();
      case BlorqueScriptPackage.BS_POSTFIX_ARITHMETIC_EXPRESSION: return createBSPostfixArithmeticExpression();
      case BlorqueScriptPackage.BS_STRING_CONSTANT: return createBSStringConstant();
      case BlorqueScriptPackage.BS_HEXADECIMAL_CONSTANT: return createBSHexadecimalConstant();
      case BlorqueScriptPackage.BS_NUMBER_CONSTANT: return createBSNumberConstant();
      case BlorqueScriptPackage.BS_REAL_CONSTANT: return createBSRealConstant();
      case BlorqueScriptPackage.BS_BOOLEAN_CONSTANT: return createBSBooleanConstant();
      case BlorqueScriptPackage.BS_NULL_LITERAL: return createBSNullLiteral();
      case BlorqueScriptPackage.BS_THIS_LITERAL: return createBSThisLiteral();
      case BlorqueScriptPackage.BS_CLIENT_LITERAL: return createBSClientLiteral();
      case BlorqueScriptPackage.BS_PARENT_LITERAL: return createBSParentLiteral();
      case BlorqueScriptPackage.BS_SYMBOL_REF: return createBSSymbolRef();
      case BlorqueScriptPackage.BS_PARENTHETICAL_EXPRESSION: return createBSParentheticalExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BlorqueScriptPackage.BS_PRIMITIVE_TYPE:
        return createBSPrimitiveTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BlorqueScriptPackage.BS_PRIMITIVE_TYPE:
        return convertBSPrimitiveTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSFile createBSFile()
  {
    BSFileImpl bsFile = new BSFileImpl();
    return bsFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSImport createBSImport()
  {
    BSImportImpl bsImport = new BSImportImpl();
    return bsImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSClass createBSClass()
  {
    BSClassImpl bsClass = new BSClassImpl();
    return bsClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSMember createBSMember()
  {
    BSMemberImpl bsMember = new BSMemberImpl();
    return bsMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSField createBSField()
  {
    BSFieldImpl bsField = new BSFieldImpl();
    return bsField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSMethod createBSMethod()
  {
    BSMethodImpl bsMethod = new BSMethodImpl();
    return bsMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSParameter createBSParameter()
  {
    BSParameterImpl bsParameter = new BSParameterImpl();
    return bsParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSMethodBody createBSMethodBody()
  {
    BSMethodBodyImpl bsMethodBody = new BSMethodBodyImpl();
    return bsMethodBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSStatement createBSStatement()
  {
    BSStatementImpl bsStatement = new BSStatementImpl();
    return bsStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSReturn createBSReturn()
  {
    BSReturnImpl bsReturn = new BSReturnImpl();
    return bsReturn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSBreak createBSBreak()
  {
    BSBreakImpl bsBreak = new BSBreakImpl();
    return bsBreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSContinue createBSContinue()
  {
    BSContinueImpl bsContinue = new BSContinueImpl();
    return bsContinue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSVariableDeclaration createBSVariableDeclaration()
  {
    BSVariableDeclarationImpl bsVariableDeclaration = new BSVariableDeclarationImpl();
    return bsVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSIfStatement createBSIfStatement()
  {
    BSIfStatementImpl bsIfStatement = new BSIfStatementImpl();
    return bsIfStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSWhileLoop createBSWhileLoop()
  {
    BSWhileLoopImpl bsWhileLoop = new BSWhileLoopImpl();
    return bsWhileLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSForLoop createBSForLoop()
  {
    BSForLoopImpl bsForLoop = new BSForLoopImpl();
    return bsForLoop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSSwitchStatement createBSSwitchStatement()
  {
    BSSwitchStatementImpl bsSwitchStatement = new BSSwitchStatementImpl();
    return bsSwitchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSIfBlock createBSIfBlock()
  {
    BSIfBlockImpl bsIfBlock = new BSIfBlockImpl();
    return bsIfBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSLoopBlock createBSLoopBlock()
  {
    BSLoopBlockImpl bsLoopBlock = new BSLoopBlockImpl();
    return bsLoopBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSSwitchBlock createBSSwitchBlock()
  {
    BSSwitchBlockImpl bsSwitchBlock = new BSSwitchBlockImpl();
    return bsSwitchBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSCase createBSCase()
  {
    BSCaseImpl bsCase = new BSCaseImpl();
    return bsCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSCaseBlock createBSCaseBlock()
  {
    BSCaseBlockImpl bsCaseBlock = new BSCaseBlockImpl();
    return bsCaseBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSBlock createBSBlock()
  {
    BSBlockImpl bsBlock = new BSBlockImpl();
    return bsBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSSymbol createBSSymbol()
  {
    BSSymbolImpl bsSymbol = new BSSymbolImpl();
    return bsSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSExpression createBSExpression()
  {
    BSExpressionImpl bsExpression = new BSExpressionImpl();
    return bsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSAssignmentExpression createBSAssignmentExpression()
  {
    BSAssignmentExpressionImpl bsAssignmentExpression = new BSAssignmentExpressionImpl();
    return bsAssignmentExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSTernaryExpression createBSTernaryExpression()
  {
    BSTernaryExpressionImpl bsTernaryExpression = new BSTernaryExpressionImpl();
    return bsTernaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSBooleanOrExpression createBSBooleanOrExpression()
  {
    BSBooleanOrExpressionImpl bsBooleanOrExpression = new BSBooleanOrExpressionImpl();
    return bsBooleanOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSBooleanAndExpression createBSBooleanAndExpression()
  {
    BSBooleanAndExpressionImpl bsBooleanAndExpression = new BSBooleanAndExpressionImpl();
    return bsBooleanAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSBitwiseOrExpression createBSBitwiseOrExpression()
  {
    BSBitwiseOrExpressionImpl bsBitwiseOrExpression = new BSBitwiseOrExpressionImpl();
    return bsBitwiseOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSBitwiseXorExpression createBSBitwiseXorExpression()
  {
    BSBitwiseXorExpressionImpl bsBitwiseXorExpression = new BSBitwiseXorExpressionImpl();
    return bsBitwiseXorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSBitwiseAndExpression createBSBitwiseAndExpression()
  {
    BSBitwiseAndExpressionImpl bsBitwiseAndExpression = new BSBitwiseAndExpressionImpl();
    return bsBitwiseAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSEqualityExpression createBSEqualityExpression()
  {
    BSEqualityExpressionImpl bsEqualityExpression = new BSEqualityExpressionImpl();
    return bsEqualityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSOrderedRelationExpression createBSOrderedRelationExpression()
  {
    BSOrderedRelationExpressionImpl bsOrderedRelationExpression = new BSOrderedRelationExpressionImpl();
    return bsOrderedRelationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSBitwiseShiftExpression createBSBitwiseShiftExpression()
  {
    BSBitwiseShiftExpressionImpl bsBitwiseShiftExpression = new BSBitwiseShiftExpressionImpl();
    return bsBitwiseShiftExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSPlusMinusOrStringConcatExpression createBSPlusMinusOrStringConcatExpression()
  {
    BSPlusMinusOrStringConcatExpressionImpl bsPlusMinusOrStringConcatExpression = new BSPlusMinusOrStringConcatExpressionImpl();
    return bsPlusMinusOrStringConcatExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSMulDivOrModExpression createBSMulDivOrModExpression()
  {
    BSMulDivOrModExpressionImpl bsMulDivOrModExpression = new BSMulDivOrModExpressionImpl();
    return bsMulDivOrModExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSCastExpression createBSCastExpression()
  {
    BSCastExpressionImpl bsCastExpression = new BSCastExpressionImpl();
    return bsCastExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSNewExpression createBSNewExpression()
  {
    BSNewExpressionImpl bsNewExpression = new BSNewExpressionImpl();
    return bsNewExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSUnaryModifierExpression createBSUnaryModifierExpression()
  {
    BSUnaryModifierExpressionImpl bsUnaryModifierExpression = new BSUnaryModifierExpressionImpl();
    return bsUnaryModifierExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSMemberSelectionExpression createBSMemberSelectionExpression()
  {
    BSMemberSelectionExpressionImpl bsMemberSelectionExpression = new BSMemberSelectionExpressionImpl();
    return bsMemberSelectionExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSMethodInvokationExpression createBSMethodInvokationExpression()
  {
    BSMethodInvokationExpressionImpl bsMethodInvokationExpression = new BSMethodInvokationExpressionImpl();
    return bsMethodInvokationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSArrayAccessExpression createBSArrayAccessExpression()
  {
    BSArrayAccessExpressionImpl bsArrayAccessExpression = new BSArrayAccessExpressionImpl();
    return bsArrayAccessExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSPostfixArithmeticExpression createBSPostfixArithmeticExpression()
  {
    BSPostfixArithmeticExpressionImpl bsPostfixArithmeticExpression = new BSPostfixArithmeticExpressionImpl();
    return bsPostfixArithmeticExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSStringConstant createBSStringConstant()
  {
    BSStringConstantImpl bsStringConstant = new BSStringConstantImpl();
    return bsStringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSHexadecimalConstant createBSHexadecimalConstant()
  {
    BSHexadecimalConstantImpl bsHexadecimalConstant = new BSHexadecimalConstantImpl();
    return bsHexadecimalConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSNumberConstant createBSNumberConstant()
  {
    BSNumberConstantImpl bsNumberConstant = new BSNumberConstantImpl();
    return bsNumberConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSRealConstant createBSRealConstant()
  {
    BSRealConstantImpl bsRealConstant = new BSRealConstantImpl();
    return bsRealConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSBooleanConstant createBSBooleanConstant()
  {
    BSBooleanConstantImpl bsBooleanConstant = new BSBooleanConstantImpl();
    return bsBooleanConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSNullLiteral createBSNullLiteral()
  {
    BSNullLiteralImpl bsNullLiteral = new BSNullLiteralImpl();
    return bsNullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSThisLiteral createBSThisLiteral()
  {
    BSThisLiteralImpl bsThisLiteral = new BSThisLiteralImpl();
    return bsThisLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSClientLiteral createBSClientLiteral()
  {
    BSClientLiteralImpl bsClientLiteral = new BSClientLiteralImpl();
    return bsClientLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSParentLiteral createBSParentLiteral()
  {
    BSParentLiteralImpl bsParentLiteral = new BSParentLiteralImpl();
    return bsParentLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSSymbolRef createBSSymbolRef()
  {
    BSSymbolRefImpl bsSymbolRef = new BSSymbolRefImpl();
    return bsSymbolRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSParentheticalExpression createBSParentheticalExpression()
  {
    BSParentheticalExpressionImpl bsParentheticalExpression = new BSParentheticalExpressionImpl();
    return bsParentheticalExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSPrimitiveType createBSPrimitiveTypeFromString(EDataType eDataType, String initialValue)
  {
    BSPrimitiveType result = BSPrimitiveType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBSPrimitiveTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
