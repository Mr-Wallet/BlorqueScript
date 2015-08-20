/**
 */
package org.xtext.example.blorquescript.blorqueScript;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage
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
  BlorqueScriptFactory eINSTANCE = org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptFactoryImpl.init();

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
   * Returns a new object of class '<em>BS If Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS If Block</em>'.
   * @generated
   */
  BSIfBlock createBSIfBlock();

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
   * Returns a new object of class '<em>BS Assignment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Assignment</em>'.
   * @generated
   */
  BSAssignment createBSAssignment();

  /**
   * Returns a new object of class '<em>BS Member Selection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Member Selection</em>'.
   * @generated
   */
  BSMemberSelection createBSMemberSelection();

  /**
   * Returns a new object of class '<em>BS String Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS String Constant</em>'.
   * @generated
   */
  BSStringConstant createBSStringConstant();

  /**
   * Returns a new object of class '<em>BS Number Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Number Constant</em>'.
   * @generated
   */
  BSNumberConstant createBSNumberConstant();

  /**
   * Returns a new object of class '<em>BS Boolean Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Boolean Constant</em>'.
   * @generated
   */
  BSBooleanConstant createBSBooleanConstant();

  /**
   * Returns a new object of class '<em>BS Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Null</em>'.
   * @generated
   */
  BSNull createBSNull();

  /**
   * Returns a new object of class '<em>BS This</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS This</em>'.
   * @generated
   */
  BSThis createBSThis();

  /**
   * Returns a new object of class '<em>BS Client</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Client</em>'.
   * @generated
   */
  BSClient createBSClient();

  /**
   * Returns a new object of class '<em>BS Symbol Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS Symbol Ref</em>'.
   * @generated
   */
  BSSymbolRef createBSSymbolRef();

  /**
   * Returns a new object of class '<em>BS New</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>BS New</em>'.
   * @generated
   */
  BSNew createBSNew();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BlorqueScriptPackage getBlorqueScriptPackage();

} //BlorqueScriptFactory
