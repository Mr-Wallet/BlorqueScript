/**
 */
package org.example.blorquescript.blorqueScript.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.example.blorquescript.blorqueScript.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage
 * @generated
 */
public class BlorqueScriptSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BlorqueScriptPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlorqueScriptSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BlorqueScriptPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BlorqueScriptPackage.BS_FILE:
      {
        BSFile bsFile = (BSFile)theEObject;
        T result = caseBSFile(bsFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_IMPORT:
      {
        BSImport bsImport = (BSImport)theEObject;
        T result = caseBSImport(bsImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_CLASS:
      {
        BSClass bsClass = (BSClass)theEObject;
        T result = caseBSClass(bsClass);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_MEMBER:
      {
        BSMember bsMember = (BSMember)theEObject;
        T result = caseBSMember(bsMember);
        if (result == null) result = caseBSSymbol(bsMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_FIELD:
      {
        BSField bsField = (BSField)theEObject;
        T result = caseBSField(bsField);
        if (result == null) result = caseBSMember(bsField);
        if (result == null) result = caseBSSymbol(bsField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_METHOD:
      {
        BSMethod bsMethod = (BSMethod)theEObject;
        T result = caseBSMethod(bsMethod);
        if (result == null) result = caseBSMember(bsMethod);
        if (result == null) result = caseBSSymbol(bsMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_PARAMETER:
      {
        BSParameter bsParameter = (BSParameter)theEObject;
        T result = caseBSParameter(bsParameter);
        if (result == null) result = caseBSSymbol(bsParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_METHOD_BODY:
      {
        BSMethodBody bsMethodBody = (BSMethodBody)theEObject;
        T result = caseBSMethodBody(bsMethodBody);
        if (result == null) result = caseBSBlock(bsMethodBody);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_STATEMENT:
      {
        BSStatement bsStatement = (BSStatement)theEObject;
        T result = caseBSStatement(bsStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_RETURN:
      {
        BSReturn bsReturn = (BSReturn)theEObject;
        T result = caseBSReturn(bsReturn);
        if (result == null) result = caseBSStatement(bsReturn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION:
      {
        BSVariableDeclaration bsVariableDeclaration = (BSVariableDeclaration)theEObject;
        T result = caseBSVariableDeclaration(bsVariableDeclaration);
        if (result == null) result = caseBSStatement(bsVariableDeclaration);
        if (result == null) result = caseBSSymbol(bsVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_IF_STATEMENT:
      {
        BSIfStatement bsIfStatement = (BSIfStatement)theEObject;
        T result = caseBSIfStatement(bsIfStatement);
        if (result == null) result = caseBSStatement(bsIfStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_WHILE_LOOP:
      {
        BSWhileLoop bsWhileLoop = (BSWhileLoop)theEObject;
        T result = caseBSWhileLoop(bsWhileLoop);
        if (result == null) result = caseBSStatement(bsWhileLoop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_FOR_LOOP:
      {
        BSForLoop bsForLoop = (BSForLoop)theEObject;
        T result = caseBSForLoop(bsForLoop);
        if (result == null) result = caseBSStatement(bsForLoop);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_SWITCH_STATEMENT:
      {
        BSSwitchStatement bsSwitchStatement = (BSSwitchStatement)theEObject;
        T result = caseBSSwitchStatement(bsSwitchStatement);
        if (result == null) result = caseBSStatement(bsSwitchStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_IF_BLOCK:
      {
        BSIfBlock bsIfBlock = (BSIfBlock)theEObject;
        T result = caseBSIfBlock(bsIfBlock);
        if (result == null) result = caseBSBlock(bsIfBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_LOOP_BLOCK:
      {
        BSLoopBlock bsLoopBlock = (BSLoopBlock)theEObject;
        T result = caseBSLoopBlock(bsLoopBlock);
        if (result == null) result = caseBSBlock(bsLoopBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_SWITCH_BLOCK:
      {
        BSSwitchBlock bsSwitchBlock = (BSSwitchBlock)theEObject;
        T result = caseBSSwitchBlock(bsSwitchBlock);
        if (result == null) result = caseBSBlock(bsSwitchBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_CASE:
      {
        BSCase bsCase = (BSCase)theEObject;
        T result = caseBSCase(bsCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_CASE_BLOCK:
      {
        BSCaseBlock bsCaseBlock = (BSCaseBlock)theEObject;
        T result = caseBSCaseBlock(bsCaseBlock);
        if (result == null) result = caseBSBlock(bsCaseBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_BLOCK:
      {
        BSBlock bsBlock = (BSBlock)theEObject;
        T result = caseBSBlock(bsBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_SYMBOL:
      {
        BSSymbol bsSymbol = (BSSymbol)theEObject;
        T result = caseBSSymbol(bsSymbol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_EXPRESSION:
      {
        BSExpression bsExpression = (BSExpression)theEObject;
        T result = caseBSExpression(bsExpression);
        if (result == null) result = caseBSStatement(bsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_ASSIGNMENT_EXPRESSION:
      {
        BSAssignmentExpression bsAssignmentExpression = (BSAssignmentExpression)theEObject;
        T result = caseBSAssignmentExpression(bsAssignmentExpression);
        if (result == null) result = caseBSExpression(bsAssignmentExpression);
        if (result == null) result = caseBSStatement(bsAssignmentExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_TERNARY_EXPRESSION:
      {
        BSTernaryExpression bsTernaryExpression = (BSTernaryExpression)theEObject;
        T result = caseBSTernaryExpression(bsTernaryExpression);
        if (result == null) result = caseBSExpression(bsTernaryExpression);
        if (result == null) result = caseBSStatement(bsTernaryExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_BOOLEAN_OR_EXPRESSION:
      {
        BSBooleanOrExpression bsBooleanOrExpression = (BSBooleanOrExpression)theEObject;
        T result = caseBSBooleanOrExpression(bsBooleanOrExpression);
        if (result == null) result = caseBSExpression(bsBooleanOrExpression);
        if (result == null) result = caseBSStatement(bsBooleanOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_BOOLEAN_AND_EXPRESSION:
      {
        BSBooleanAndExpression bsBooleanAndExpression = (BSBooleanAndExpression)theEObject;
        T result = caseBSBooleanAndExpression(bsBooleanAndExpression);
        if (result == null) result = caseBSExpression(bsBooleanAndExpression);
        if (result == null) result = caseBSStatement(bsBooleanAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_BITWISE_OR_EXPRESSION:
      {
        BSBitwiseOrExpression bsBitwiseOrExpression = (BSBitwiseOrExpression)theEObject;
        T result = caseBSBitwiseOrExpression(bsBitwiseOrExpression);
        if (result == null) result = caseBSExpression(bsBitwiseOrExpression);
        if (result == null) result = caseBSStatement(bsBitwiseOrExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_BITWISE_XOR_EXPRESSION:
      {
        BSBitwiseXorExpression bsBitwiseXorExpression = (BSBitwiseXorExpression)theEObject;
        T result = caseBSBitwiseXorExpression(bsBitwiseXorExpression);
        if (result == null) result = caseBSExpression(bsBitwiseXorExpression);
        if (result == null) result = caseBSStatement(bsBitwiseXorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_BITWISE_AND_EXPRESSION:
      {
        BSBitwiseAndExpression bsBitwiseAndExpression = (BSBitwiseAndExpression)theEObject;
        T result = caseBSBitwiseAndExpression(bsBitwiseAndExpression);
        if (result == null) result = caseBSExpression(bsBitwiseAndExpression);
        if (result == null) result = caseBSStatement(bsBitwiseAndExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_EQUALITY_EXPRESSION:
      {
        BSEqualityExpression bsEqualityExpression = (BSEqualityExpression)theEObject;
        T result = caseBSEqualityExpression(bsEqualityExpression);
        if (result == null) result = caseBSExpression(bsEqualityExpression);
        if (result == null) result = caseBSStatement(bsEqualityExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_ORDERED_RELATION_EXPRESSION:
      {
        BSOrderedRelationExpression bsOrderedRelationExpression = (BSOrderedRelationExpression)theEObject;
        T result = caseBSOrderedRelationExpression(bsOrderedRelationExpression);
        if (result == null) result = caseBSExpression(bsOrderedRelationExpression);
        if (result == null) result = caseBSStatement(bsOrderedRelationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_BITWISE_SHIFT_EXPRESSION:
      {
        BSBitwiseShiftExpression bsBitwiseShiftExpression = (BSBitwiseShiftExpression)theEObject;
        T result = caseBSBitwiseShiftExpression(bsBitwiseShiftExpression);
        if (result == null) result = caseBSExpression(bsBitwiseShiftExpression);
        if (result == null) result = caseBSStatement(bsBitwiseShiftExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION:
      {
        BSPlusMinusOrStringConcatExpression bsPlusMinusOrStringConcatExpression = (BSPlusMinusOrStringConcatExpression)theEObject;
        T result = caseBSPlusMinusOrStringConcatExpression(bsPlusMinusOrStringConcatExpression);
        if (result == null) result = caseBSExpression(bsPlusMinusOrStringConcatExpression);
        if (result == null) result = caseBSStatement(bsPlusMinusOrStringConcatExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_MUL_DIV_OR_MOD_EXPRESSION:
      {
        BSMulDivOrModExpression bsMulDivOrModExpression = (BSMulDivOrModExpression)theEObject;
        T result = caseBSMulDivOrModExpression(bsMulDivOrModExpression);
        if (result == null) result = caseBSExpression(bsMulDivOrModExpression);
        if (result == null) result = caseBSStatement(bsMulDivOrModExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_CAST_EXPRESSION:
      {
        BSCastExpression bsCastExpression = (BSCastExpression)theEObject;
        T result = caseBSCastExpression(bsCastExpression);
        if (result == null) result = caseBSExpression(bsCastExpression);
        if (result == null) result = caseBSStatement(bsCastExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_NEW_EXPRESSION:
      {
        BSNewExpression bsNewExpression = (BSNewExpression)theEObject;
        T result = caseBSNewExpression(bsNewExpression);
        if (result == null) result = caseBSExpression(bsNewExpression);
        if (result == null) result = caseBSStatement(bsNewExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_UNARY_MODIFIER_EXPRESSION:
      {
        BSUnaryModifierExpression bsUnaryModifierExpression = (BSUnaryModifierExpression)theEObject;
        T result = caseBSUnaryModifierExpression(bsUnaryModifierExpression);
        if (result == null) result = caseBSExpression(bsUnaryModifierExpression);
        if (result == null) result = caseBSStatement(bsUnaryModifierExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_MEMBER_SELECTION_EXPRESSION:
      {
        BSMemberSelectionExpression bsMemberSelectionExpression = (BSMemberSelectionExpression)theEObject;
        T result = caseBSMemberSelectionExpression(bsMemberSelectionExpression);
        if (result == null) result = caseBSExpression(bsMemberSelectionExpression);
        if (result == null) result = caseBSStatement(bsMemberSelectionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_METHOD_INVOKATION_EXPRESSION:
      {
        BSMethodInvokationExpression bsMethodInvokationExpression = (BSMethodInvokationExpression)theEObject;
        T result = caseBSMethodInvokationExpression(bsMethodInvokationExpression);
        if (result == null) result = caseBSExpression(bsMethodInvokationExpression);
        if (result == null) result = caseBSStatement(bsMethodInvokationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_ARRAY_ACCESS_EXPRESSION:
      {
        BSArrayAccessExpression bsArrayAccessExpression = (BSArrayAccessExpression)theEObject;
        T result = caseBSArrayAccessExpression(bsArrayAccessExpression);
        if (result == null) result = caseBSExpression(bsArrayAccessExpression);
        if (result == null) result = caseBSStatement(bsArrayAccessExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_POSTFIX_ARITHMETIC_EXPRESSION:
      {
        BSPostfixArithmeticExpression bsPostfixArithmeticExpression = (BSPostfixArithmeticExpression)theEObject;
        T result = caseBSPostfixArithmeticExpression(bsPostfixArithmeticExpression);
        if (result == null) result = caseBSExpression(bsPostfixArithmeticExpression);
        if (result == null) result = caseBSStatement(bsPostfixArithmeticExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_STRING_CONSTANT:
      {
        BSStringConstant bsStringConstant = (BSStringConstant)theEObject;
        T result = caseBSStringConstant(bsStringConstant);
        if (result == null) result = caseBSExpression(bsStringConstant);
        if (result == null) result = caseBSStatement(bsStringConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_HEXADECIMAL_CONSTANT:
      {
        BSHexadecimalConstant bsHexadecimalConstant = (BSHexadecimalConstant)theEObject;
        T result = caseBSHexadecimalConstant(bsHexadecimalConstant);
        if (result == null) result = caseBSExpression(bsHexadecimalConstant);
        if (result == null) result = caseBSStatement(bsHexadecimalConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_NUMBER_CONSTANT:
      {
        BSNumberConstant bsNumberConstant = (BSNumberConstant)theEObject;
        T result = caseBSNumberConstant(bsNumberConstant);
        if (result == null) result = caseBSExpression(bsNumberConstant);
        if (result == null) result = caseBSStatement(bsNumberConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_REAL_CONSTANT:
      {
        BSRealConstant bsRealConstant = (BSRealConstant)theEObject;
        T result = caseBSRealConstant(bsRealConstant);
        if (result == null) result = caseBSExpression(bsRealConstant);
        if (result == null) result = caseBSStatement(bsRealConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_BOOLEAN_CONSTANT:
      {
        BSBooleanConstant bsBooleanConstant = (BSBooleanConstant)theEObject;
        T result = caseBSBooleanConstant(bsBooleanConstant);
        if (result == null) result = caseBSExpression(bsBooleanConstant);
        if (result == null) result = caseBSStatement(bsBooleanConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_NULL_LITERAL:
      {
        BSNullLiteral bsNullLiteral = (BSNullLiteral)theEObject;
        T result = caseBSNullLiteral(bsNullLiteral);
        if (result == null) result = caseBSExpression(bsNullLiteral);
        if (result == null) result = caseBSStatement(bsNullLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_BREAK_LITERAL:
      {
        BSBreakLiteral bsBreakLiteral = (BSBreakLiteral)theEObject;
        T result = caseBSBreakLiteral(bsBreakLiteral);
        if (result == null) result = caseBSExpression(bsBreakLiteral);
        if (result == null) result = caseBSStatement(bsBreakLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_CONTINUE_LITERAL:
      {
        BSContinueLiteral bsContinueLiteral = (BSContinueLiteral)theEObject;
        T result = caseBSContinueLiteral(bsContinueLiteral);
        if (result == null) result = caseBSExpression(bsContinueLiteral);
        if (result == null) result = caseBSStatement(bsContinueLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_THIS_LITERAL:
      {
        BSThisLiteral bsThisLiteral = (BSThisLiteral)theEObject;
        T result = caseBSThisLiteral(bsThisLiteral);
        if (result == null) result = caseBSExpression(bsThisLiteral);
        if (result == null) result = caseBSStatement(bsThisLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_CLIENT_LITERAL:
      {
        BSClientLiteral bsClientLiteral = (BSClientLiteral)theEObject;
        T result = caseBSClientLiteral(bsClientLiteral);
        if (result == null) result = caseBSExpression(bsClientLiteral);
        if (result == null) result = caseBSStatement(bsClientLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_PARENT_LITERAL:
      {
        BSParentLiteral bsParentLiteral = (BSParentLiteral)theEObject;
        T result = caseBSParentLiteral(bsParentLiteral);
        if (result == null) result = caseBSExpression(bsParentLiteral);
        if (result == null) result = caseBSStatement(bsParentLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_SYMBOL_REF:
      {
        BSSymbolRef bsSymbolRef = (BSSymbolRef)theEObject;
        T result = caseBSSymbolRef(bsSymbolRef);
        if (result == null) result = caseBSExpression(bsSymbolRef);
        if (result == null) result = caseBSStatement(bsSymbolRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_PARENTHETICAL_EXPRESSION:
      {
        BSParentheticalExpression bsParentheticalExpression = (BSParentheticalExpression)theEObject;
        T result = caseBSParentheticalExpression(bsParentheticalExpression);
        if (result == null) result = caseBSExpression(bsParentheticalExpression);
        if (result == null) result = caseBSStatement(bsParentheticalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSFile(BSFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSImport(BSImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSClass(BSClass object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSMember(BSMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSField(BSField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSMethod(BSMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSParameter(BSParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Method Body</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Method Body</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSMethodBody(BSMethodBody object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSStatement(BSStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSReturn(BSReturn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSVariableDeclaration(BSVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS If Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS If Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSIfStatement(BSIfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS While Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS While Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSWhileLoop(BSWhileLoop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS For Loop</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS For Loop</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSForLoop(BSForLoop object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Switch Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSSwitchStatement(BSSwitchStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS If Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS If Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSIfBlock(BSIfBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Loop Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Loop Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSLoopBlock(BSLoopBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Switch Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Switch Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSSwitchBlock(BSSwitchBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSCase(BSCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Case Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Case Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSCaseBlock(BSCaseBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSBlock(BSBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Symbol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Symbol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSSymbol(BSSymbol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSExpression(BSExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Assignment Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSAssignmentExpression(BSAssignmentExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Ternary Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Ternary Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSTernaryExpression(BSTernaryExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Boolean Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Boolean Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSBooleanOrExpression(BSBooleanOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Boolean And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Boolean And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSBooleanAndExpression(BSBooleanAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Bitwise Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Bitwise Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSBitwiseOrExpression(BSBitwiseOrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Bitwise Xor Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Bitwise Xor Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSBitwiseXorExpression(BSBitwiseXorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Bitwise And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Bitwise And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSBitwiseAndExpression(BSBitwiseAndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Equality Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Equality Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSEqualityExpression(BSEqualityExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Ordered Relation Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Ordered Relation Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSOrderedRelationExpression(BSOrderedRelationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Bitwise Shift Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Bitwise Shift Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSBitwiseShiftExpression(BSBitwiseShiftExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Plus Minus Or String Concat Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Plus Minus Or String Concat Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSPlusMinusOrStringConcatExpression(BSPlusMinusOrStringConcatExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Mul Div Or Mod Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Mul Div Or Mod Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSMulDivOrModExpression(BSMulDivOrModExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Cast Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Cast Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSCastExpression(BSCastExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS New Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS New Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSNewExpression(BSNewExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Unary Modifier Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Unary Modifier Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSUnaryModifierExpression(BSUnaryModifierExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Member Selection Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Member Selection Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSMemberSelectionExpression(BSMemberSelectionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Method Invokation Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Method Invokation Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSMethodInvokationExpression(BSMethodInvokationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Array Access Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Array Access Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSArrayAccessExpression(BSArrayAccessExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Postfix Arithmetic Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Postfix Arithmetic Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSPostfixArithmeticExpression(BSPostfixArithmeticExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS String Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS String Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSStringConstant(BSStringConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Hexadecimal Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Hexadecimal Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSHexadecimalConstant(BSHexadecimalConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Number Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Number Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSNumberConstant(BSNumberConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Real Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Real Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSRealConstant(BSRealConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Boolean Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Boolean Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSBooleanConstant(BSBooleanConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Null Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Null Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSNullLiteral(BSNullLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Break Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Break Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSBreakLiteral(BSBreakLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Continue Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Continue Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSContinueLiteral(BSContinueLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS This Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS This Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSThisLiteral(BSThisLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Client Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Client Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSClientLiteral(BSClientLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Parent Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Parent Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSParentLiteral(BSParentLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Symbol Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Symbol Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSSymbolRef(BSSymbolRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Parenthetical Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Parenthetical Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSParentheticalExpression(BSParentheticalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BlorqueScriptSwitch
