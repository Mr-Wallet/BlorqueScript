/**
 */
package org.example.blorquescript.blorqueScript;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage
 * @generated
 */
public interface BlorqueScriptFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BlorqueScriptFactory eINSTANCE = org.example.blorquescript.blorqueScript.impl.BlorqueScriptFactoryImpl.init();

  /**
   * Returns a new object of class '<em>BS File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS File</em>'.
   * @generated
   */
  BSFile createBSFile();

  /**
   * Returns a new object of class '<em>BS Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Import</em>'.
   * @generated
   */
  BSImport createBSImport();

  /**
   * Returns a new object of class '<em>BS Class</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Class</em>'.
   * @generated
   */
  BSClass createBSClass();

  /**
   * Returns a new object of class '<em>BS Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Member</em>'.
   * @generated
   */
  BSMember createBSMember();

  /**
   * Returns a new object of class '<em>BS Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Field</em>'.
   * @generated
   */
  BSField createBSField();

  /**
   * Returns a new object of class '<em>BS Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Method</em>'.
   * @generated
   */
  BSMethod createBSMethod();

  /**
   * Returns a new object of class '<em>BS Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Parameter</em>'.
   * @generated
   */
  BSParameter createBSParameter();

  /**
   * Returns a new object of class '<em>BS Method Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Method Body</em>'.
   * @generated
   */
  BSMethodBody createBSMethodBody();

  /**
   * Returns a new object of class '<em>BS Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Statement</em>'.
   * @generated
   */
  BSStatement createBSStatement();

  /**
   * Returns a new object of class '<em>BS Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Return</em>'.
   * @generated
   */
  BSReturn createBSReturn();

  /**
   * Returns a new object of class '<em>BS Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Variable Declaration</em>'.
   * @generated
   */
  BSVariableDeclaration createBSVariableDeclaration();

  /**
   * Returns a new object of class '<em>BS If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS If Statement</em>'.
   * @generated
   */
  BSIfStatement createBSIfStatement();

  /**
   * Returns a new object of class '<em>BS While Loop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS While Loop</em>'.
   * @generated
   */
  BSWhileLoop createBSWhileLoop();

  /**
   * Returns a new object of class '<em>BS For Loop</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS For Loop</em>'.
   * @generated
   */
  BSForLoop createBSForLoop();

  /**
   * Returns a new object of class '<em>BS Switch Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Switch Statement</em>'.
   * @generated
   */
  BSSwitchStatement createBSSwitchStatement();

  /**
   * Returns a new object of class '<em>BS If Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS If Block</em>'.
   * @generated
   */
  BSIfBlock createBSIfBlock();

  /**
   * Returns a new object of class '<em>BS Loop Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Loop Block</em>'.
   * @generated
   */
  BSLoopBlock createBSLoopBlock();

  /**
   * Returns a new object of class '<em>BS Switch Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Switch Block</em>'.
   * @generated
   */
  BSSwitchBlock createBSSwitchBlock();

  /**
   * Returns a new object of class '<em>BS Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Case</em>'.
   * @generated
   */
  BSCase createBSCase();

  /**
   * Returns a new object of class '<em>BS Case Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Case Block</em>'.
   * @generated
   */
  BSCaseBlock createBSCaseBlock();

  /**
   * Returns a new object of class '<em>BS Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Block</em>'.
   * @generated
   */
  BSBlock createBSBlock();

  /**
   * Returns a new object of class '<em>BS Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Symbol</em>'.
   * @generated
   */
  BSSymbol createBSSymbol();

  /**
   * Returns a new object of class '<em>BS Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Expression</em>'.
   * @generated
   */
  BSExpression createBSExpression();

  /**
   * Returns a new object of class '<em>BS Assignment Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Assignment Expression</em>'.
   * @generated
   */
  BSAssignmentExpression createBSAssignmentExpression();

  /**
   * Returns a new object of class '<em>BS Ternary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Ternary Expression</em>'.
   * @generated
   */
  BSTernaryExpression createBSTernaryExpression();

  /**
   * Returns a new object of class '<em>BS Boolean Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Boolean Or Expression</em>'.
   * @generated
   */
  BSBooleanOrExpression createBSBooleanOrExpression();

  /**
   * Returns a new object of class '<em>BS Boolean And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Boolean And Expression</em>'.
   * @generated
   */
  BSBooleanAndExpression createBSBooleanAndExpression();

  /**
   * Returns a new object of class '<em>BS Bitwise Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Bitwise Or Expression</em>'.
   * @generated
   */
  BSBitwiseOrExpression createBSBitwiseOrExpression();

  /**
   * Returns a new object of class '<em>BS Bitwise Xor Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Bitwise Xor Expression</em>'.
   * @generated
   */
  BSBitwiseXorExpression createBSBitwiseXorExpression();

  /**
   * Returns a new object of class '<em>BS Bitwise And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Bitwise And Expression</em>'.
   * @generated
   */
  BSBitwiseAndExpression createBSBitwiseAndExpression();

  /**
   * Returns a new object of class '<em>BS Equality Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Equality Expression</em>'.
   * @generated
   */
  BSEqualityExpression createBSEqualityExpression();

  /**
   * Returns a new object of class '<em>BS Ordered Relation Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Ordered Relation Expression</em>'.
   * @generated
   */
  BSOrderedRelationExpression createBSOrderedRelationExpression();

  /**
   * Returns a new object of class '<em>BS Bitwise Shift Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Bitwise Shift Expression</em>'.
   * @generated
   */
  BSBitwiseShiftExpression createBSBitwiseShiftExpression();

  /**
   * Returns a new object of class '<em>BS Plus Minus Or String Concat Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Plus Minus Or String Concat Expression</em>'.
   * @generated
   */
  BSPlusMinusOrStringConcatExpression createBSPlusMinusOrStringConcatExpression();

  /**
   * Returns a new object of class '<em>BS Mul Div Or Mod Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Mul Div Or Mod Expression</em>'.
   * @generated
   */
  BSMulDivOrModExpression createBSMulDivOrModExpression();

  /**
   * Returns a new object of class '<em>BS Cast Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Cast Expression</em>'.
   * @generated
   */
  BSCastExpression createBSCastExpression();

  /**
   * Returns a new object of class '<em>BS New Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS New Expression</em>'.
   * @generated
   */
  BSNewExpression createBSNewExpression();

  /**
   * Returns a new object of class '<em>BS Unary Modifier Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Unary Modifier Expression</em>'.
   * @generated
   */
  BSUnaryModifierExpression createBSUnaryModifierExpression();

  /**
   * Returns a new object of class '<em>BS Member Selection Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Member Selection Expression</em>'.
   * @generated
   */
  BSMemberSelectionExpression createBSMemberSelectionExpression();

  /**
   * Returns a new object of class '<em>BS Method Invokation Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Method Invokation Expression</em>'.
   * @generated
   */
  BSMethodInvokationExpression createBSMethodInvokationExpression();

  /**
   * Returns a new object of class '<em>BS Array Access Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Array Access Expression</em>'.
   * @generated
   */
  BSArrayAccessExpression createBSArrayAccessExpression();

  /**
   * Returns a new object of class '<em>BS Postfix Arithmetic Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Postfix Arithmetic Expression</em>'.
   * @generated
   */
  BSPostfixArithmeticExpression createBSPostfixArithmeticExpression();

  /**
   * Returns a new object of class '<em>BS String Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS String Constant</em>'.
   * @generated
   */
  BSStringConstant createBSStringConstant();

  /**
   * Returns a new object of class '<em>BS Hexadecimal Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Hexadecimal Constant</em>'.
   * @generated
   */
  BSHexadecimalConstant createBSHexadecimalConstant();

  /**
   * Returns a new object of class '<em>BS Number Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Number Constant</em>'.
   * @generated
   */
  BSNumberConstant createBSNumberConstant();

  /**
   * Returns a new object of class '<em>BS Real Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Real Constant</em>'.
   * @generated
   */
  BSRealConstant createBSRealConstant();

  /**
   * Returns a new object of class '<em>BS Boolean Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Boolean Constant</em>'.
   * @generated
   */
  BSBooleanConstant createBSBooleanConstant();

  /**
   * Returns a new object of class '<em>BS Null Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Null Literal</em>'.
   * @generated
   */
  BSNullLiteral createBSNullLiteral();

  /**
   * Returns a new object of class '<em>BS Break Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Break Literal</em>'.
   * @generated
   */
  BSBreakLiteral createBSBreakLiteral();

  /**
   * Returns a new object of class '<em>BS Continue Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Continue Literal</em>'.
   * @generated
   */
  BSContinueLiteral createBSContinueLiteral();

  /**
   * Returns a new object of class '<em>BS This Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS This Literal</em>'.
   * @generated
   */
  BSThisLiteral createBSThisLiteral();

  /**
   * Returns a new object of class '<em>BS Client Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Client Literal</em>'.
   * @generated
   */
  BSClientLiteral createBSClientLiteral();

  /**
   * Returns a new object of class '<em>BS Parent Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Parent Literal</em>'.
   * @generated
   */
  BSParentLiteral createBSParentLiteral();

  /**
   * Returns a new object of class '<em>BS Symbol Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Symbol Ref</em>'.
   * @generated
   */
  BSSymbolRef createBSSymbolRef();

  /**
   * Returns a new object of class '<em>BS Parenthetical Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Parenthetical Expression</em>'.
   * @generated
   */
  BSParentheticalExpression createBSParentheticalExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BlorqueScriptPackage getBlorqueScriptPackage();

} //BlorqueScriptFactory
