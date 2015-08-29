/**
 */
package org.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.example.blorquescript.blorqueScript.BSArrayAccessExpression;
import org.example.blorquescript.blorqueScript.BSAssignmentExpression;
import org.example.blorquescript.blorqueScript.BSBitwiseAndExpression;
import org.example.blorquescript.blorqueScript.BSBitwiseOrExpression;
import org.example.blorquescript.blorqueScript.BSBitwiseShiftExpression;
import org.example.blorquescript.blorqueScript.BSBitwiseXorExpression;
import org.example.blorquescript.blorqueScript.BSBlock;
import org.example.blorquescript.blorqueScript.BSBooleanAndExpression;
import org.example.blorquescript.blorqueScript.BSBooleanConstant;
import org.example.blorquescript.blorqueScript.BSBooleanOrExpression;
import org.example.blorquescript.blorqueScript.BSBreakLiteral;
import org.example.blorquescript.blorqueScript.BSCase;
import org.example.blorquescript.blorqueScript.BSCaseBlock;
import org.example.blorquescript.blorqueScript.BSCastExpression;
import org.example.blorquescript.blorqueScript.BSClass;
import org.example.blorquescript.blorqueScript.BSClientLiteral;
import org.example.blorquescript.blorqueScript.BSContinueLiteral;
import org.example.blorquescript.blorqueScript.BSEqualityExpression;
import org.example.blorquescript.blorqueScript.BSExpression;
import org.example.blorquescript.blorqueScript.BSField;
import org.example.blorquescript.blorqueScript.BSFile;
import org.example.blorquescript.blorqueScript.BSForLoop;
import org.example.blorquescript.blorqueScript.BSHexadecimalConstant;
import org.example.blorquescript.blorqueScript.BSIfBlock;
import org.example.blorquescript.blorqueScript.BSIfStatement;
import org.example.blorquescript.blorqueScript.BSImport;
import org.example.blorquescript.blorqueScript.BSLoopBlock;
import org.example.blorquescript.blorqueScript.BSMember;
import org.example.blorquescript.blorqueScript.BSMemberSelectionExpression;
import org.example.blorquescript.blorqueScript.BSMethod;
import org.example.blorquescript.blorqueScript.BSMethodBody;
import org.example.blorquescript.blorqueScript.BSMethodInvokationExpression;
import org.example.blorquescript.blorqueScript.BSMulDivOrModExpression;
import org.example.blorquescript.blorqueScript.BSNewExpression;
import org.example.blorquescript.blorqueScript.BSNullLiteral;
import org.example.blorquescript.blorqueScript.BSNumberConstant;
import org.example.blorquescript.blorqueScript.BSOrderedRelationExpression;
import org.example.blorquescript.blorqueScript.BSParameter;
import org.example.blorquescript.blorqueScript.BSParentLiteral;
import org.example.blorquescript.blorqueScript.BSParentheticalExpression;
import org.example.blorquescript.blorqueScript.BSPlusMinusOrStringConcatExpression;
import org.example.blorquescript.blorqueScript.BSPostfixArithmeticExpression;
import org.example.blorquescript.blorqueScript.BSRealConstant;
import org.example.blorquescript.blorqueScript.BSReturn;
import org.example.blorquescript.blorqueScript.BSStatement;
import org.example.blorquescript.blorqueScript.BSStringConstant;
import org.example.blorquescript.blorqueScript.BSSwitchBlock;
import org.example.blorquescript.blorqueScript.BSSwitchStatement;
import org.example.blorquescript.blorqueScript.BSSymbol;
import org.example.blorquescript.blorqueScript.BSSymbolRef;
import org.example.blorquescript.blorqueScript.BSTernaryExpression;
import org.example.blorquescript.blorqueScript.BSThisLiteral;
import org.example.blorquescript.blorqueScript.BSUnaryModifierExpression;
import org.example.blorquescript.blorqueScript.BSVariableDeclaration;
import org.example.blorquescript.blorqueScript.BSWhileLoop;
import org.example.blorquescript.blorqueScript.BlorqueScriptFactory;
import org.example.blorquescript.blorqueScript.BlorqueScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlorqueScriptPackageImpl extends EPackageImpl implements BlorqueScriptPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsMethodBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsReturnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsIfStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsWhileLoopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsForLoopEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsSwitchStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsIfBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsLoopBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsSwitchBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsCaseBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsSymbolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsAssignmentExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsTernaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsBooleanOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsBooleanAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsBitwiseOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsBitwiseXorExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsBitwiseAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsEqualityExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsOrderedRelationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsBitwiseShiftExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsPlusMinusOrStringConcatExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsMulDivOrModExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsCastExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsNewExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsUnaryModifierExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsMemberSelectionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsMethodInvokationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsArrayAccessExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsPostfixArithmeticExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsStringConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsHexadecimalConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsNumberConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsRealConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsBooleanConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsNullLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsBreakLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsContinueLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsThisLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsClientLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsParentLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsSymbolRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsParentheticalExpressionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BlorqueScriptPackageImpl()
  {
    super(eNS_URI, BlorqueScriptFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BlorqueScriptPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BlorqueScriptPackage init()
  {
    if (isInited) return (BlorqueScriptPackage)EPackage.Registry.INSTANCE.getEPackage(BlorqueScriptPackage.eNS_URI);

    // Obtain or create and register package
    BlorqueScriptPackageImpl theBlorqueScriptPackage = (BlorqueScriptPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BlorqueScriptPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BlorqueScriptPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBlorqueScriptPackage.createPackageContents();

    // Initialize created meta-data
    theBlorqueScriptPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBlorqueScriptPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BlorqueScriptPackage.eNS_URI, theBlorqueScriptPackage);
    return theBlorqueScriptPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSFile()
  {
    return bsFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSFile_Name()
  {
    return (EAttribute)bsFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSFile_Imports()
  {
    return (EReference)bsFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSFile_Classes()
  {
    return (EReference)bsFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSImport()
  {
    return bsImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSImport_ImportedNamespace()
  {
    return (EAttribute)bsImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSClass()
  {
    return bsClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSClass_Name()
  {
    return (EAttribute)bsClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSClass_Superclass()
  {
    return (EReference)bsClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSClass_Members()
  {
    return (EReference)bsClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSMember()
  {
    return bsMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSField()
  {
    return bsFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSField_IsArray()
  {
    return (EAttribute)bsFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSMethod()
  {
    return bsMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSMethod_Params()
  {
    return (EReference)bsMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSMethod_Body()
  {
    return (EReference)bsMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSParameter()
  {
    return bsParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSParameter_IsArray()
  {
    return (EAttribute)bsParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSMethodBody()
  {
    return bsMethodBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSMethodBody_Statements()
  {
    return (EReference)bsMethodBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSStatement()
  {
    return bsStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSReturn()
  {
    return bsReturnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSReturn_Expression()
  {
    return (EReference)bsReturnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSVariableDeclaration()
  {
    return bsVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSVariableDeclaration_Expression()
  {
    return (EReference)bsVariableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSIfStatement()
  {
    return bsIfStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSIfStatement_Expression()
  {
    return (EReference)bsIfStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSIfStatement_ThenBlock()
  {
    return (EReference)bsIfStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSIfStatement_ElseBlock()
  {
    return (EReference)bsIfStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSWhileLoop()
  {
    return bsWhileLoopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSWhileLoop_Expression()
  {
    return (EReference)bsWhileLoopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSWhileLoop_Block()
  {
    return (EReference)bsWhileLoopEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSForLoop()
  {
    return bsForLoopEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSForLoop_Left()
  {
    return (EReference)bsForLoopEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSForLoop_Middle()
  {
    return (EReference)bsForLoopEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSForLoop_Right()
  {
    return (EReference)bsForLoopEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSForLoop_Block()
  {
    return (EReference)bsForLoopEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSSwitchStatement()
  {
    return bsSwitchStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSSwitchStatement_StringSwitch()
  {
    return (EAttribute)bsSwitchStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSSwitchStatement_Expression()
  {
    return (EReference)bsSwitchStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSSwitchStatement_Block()
  {
    return (EReference)bsSwitchStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSIfBlock()
  {
    return bsIfBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSIfBlock_Statements()
  {
    return (EReference)bsIfBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSLoopBlock()
  {
    return bsLoopBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSLoopBlock_Statements()
  {
    return (EReference)bsLoopBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSSwitchBlock()
  {
    return bsSwitchBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSSwitchBlock_Cases()
  {
    return (EReference)bsSwitchBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSCase()
  {
    return bsCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSCase_Expression()
  {
    return (EReference)bsCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSCase_Block()
  {
    return (EReference)bsCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSCaseBlock()
  {
    return bsCaseBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSCaseBlock_Statements()
  {
    return (EReference)bsCaseBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSBlock()
  {
    return bsBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSSymbol()
  {
    return bsSymbolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSSymbol_Type()
  {
    return (EReference)bsSymbolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSSymbol_Name()
  {
    return (EAttribute)bsSymbolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSExpression()
  {
    return bsExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSAssignmentExpression()
  {
    return bsAssignmentExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSAssignmentExpression_Left()
  {
    return (EReference)bsAssignmentExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSAssignmentExpression_AssignmentOperator()
  {
    return (EAttribute)bsAssignmentExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSAssignmentExpression_Right()
  {
    return (EReference)bsAssignmentExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSTernaryExpression()
  {
    return bsTernaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSTernaryExpression_Left()
  {
    return (EReference)bsTernaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSTernaryExpression_Middle()
  {
    return (EReference)bsTernaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSTernaryExpression_Right()
  {
    return (EReference)bsTernaryExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSBooleanOrExpression()
  {
    return bsBooleanOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSBooleanOrExpression_Left()
  {
    return (EReference)bsBooleanOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSBooleanOrExpression_Right()
  {
    return (EReference)bsBooleanOrExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSBooleanAndExpression()
  {
    return bsBooleanAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSBooleanAndExpression_Left()
  {
    return (EReference)bsBooleanAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSBooleanAndExpression_Right()
  {
    return (EReference)bsBooleanAndExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSBitwiseOrExpression()
  {
    return bsBitwiseOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSBitwiseOrExpression_Left()
  {
    return (EReference)bsBitwiseOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSBitwiseOrExpression_Right()
  {
    return (EReference)bsBitwiseOrExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSBitwiseXorExpression()
  {
    return bsBitwiseXorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSBitwiseXorExpression_Left()
  {
    return (EReference)bsBitwiseXorExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSBitwiseXorExpression_Right()
  {
    return (EReference)bsBitwiseXorExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSBitwiseAndExpression()
  {
    return bsBitwiseAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSBitwiseAndExpression_Left()
  {
    return (EReference)bsBitwiseAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSBitwiseAndExpression_Right()
  {
    return (EReference)bsBitwiseAndExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSEqualityExpression()
  {
    return bsEqualityExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSEqualityExpression_Left()
  {
    return (EReference)bsEqualityExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSEqualityExpression_Operator()
  {
    return (EAttribute)bsEqualityExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSEqualityExpression_Right()
  {
    return (EReference)bsEqualityExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSOrderedRelationExpression()
  {
    return bsOrderedRelationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSOrderedRelationExpression_Left()
  {
    return (EReference)bsOrderedRelationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSOrderedRelationExpression_Operator()
  {
    return (EAttribute)bsOrderedRelationExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSOrderedRelationExpression_Right()
  {
    return (EReference)bsOrderedRelationExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSBitwiseShiftExpression()
  {
    return bsBitwiseShiftExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSBitwiseShiftExpression_Left()
  {
    return (EReference)bsBitwiseShiftExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSBitwiseShiftExpression_Operator()
  {
    return (EAttribute)bsBitwiseShiftExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSBitwiseShiftExpression_Right()
  {
    return (EReference)bsBitwiseShiftExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSPlusMinusOrStringConcatExpression()
  {
    return bsPlusMinusOrStringConcatExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSPlusMinusOrStringConcatExpression_Left()
  {
    return (EReference)bsPlusMinusOrStringConcatExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSPlusMinusOrStringConcatExpression_Operator()
  {
    return (EAttribute)bsPlusMinusOrStringConcatExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSPlusMinusOrStringConcatExpression_Right()
  {
    return (EReference)bsPlusMinusOrStringConcatExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSMulDivOrModExpression()
  {
    return bsMulDivOrModExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSMulDivOrModExpression_Left()
  {
    return (EReference)bsMulDivOrModExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSMulDivOrModExpression_Operator()
  {
    return (EAttribute)bsMulDivOrModExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSMulDivOrModExpression_Right()
  {
    return (EReference)bsMulDivOrModExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSCastExpression()
  {
    return bsCastExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSCastExpression_CastType()
  {
    return (EAttribute)bsCastExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSCastExpression_CastExpr()
  {
    return (EReference)bsCastExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSNewExpression()
  {
    return bsNewExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSNewExpression_IsArray()
  {
    return (EAttribute)bsNewExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSNewExpression_Type()
  {
    return (EReference)bsNewExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSNewExpression_Args()
  {
    return (EReference)bsNewExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSUnaryModifierExpression()
  {
    return bsUnaryModifierExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSUnaryModifierExpression_Operator()
  {
    return (EAttribute)bsUnaryModifierExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSUnaryModifierExpression_Receiver()
  {
    return (EReference)bsUnaryModifierExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSMemberSelectionExpression()
  {
    return bsMemberSelectionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSMemberSelectionExpression_Receiver()
  {
    return (EReference)bsMemberSelectionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSMethodInvokationExpression()
  {
    return bsMethodInvokationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSMethodInvokationExpression_Receiver()
  {
    return (EReference)bsMethodInvokationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSMethodInvokationExpression_Args()
  {
    return (EReference)bsMethodInvokationExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSArrayAccessExpression()
  {
    return bsArrayAccessExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSArrayAccessExpression_Receiver()
  {
    return (EReference)bsArrayAccessExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSArrayAccessExpression_Args()
  {
    return (EReference)bsArrayAccessExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSPostfixArithmeticExpression()
  {
    return bsPostfixArithmeticExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSPostfixArithmeticExpression_Receiver()
  {
    return (EReference)bsPostfixArithmeticExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSPostfixArithmeticExpression_Operator()
  {
    return (EAttribute)bsPostfixArithmeticExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSStringConstant()
  {
    return bsStringConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSStringConstant_Value()
  {
    return (EAttribute)bsStringConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSHexadecimalConstant()
  {
    return bsHexadecimalConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSHexadecimalConstant_Value()
  {
    return (EAttribute)bsHexadecimalConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSNumberConstant()
  {
    return bsNumberConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSNumberConstant_Value()
  {
    return (EAttribute)bsNumberConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSRealConstant()
  {
    return bsRealConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSRealConstant_Left()
  {
    return (EReference)bsRealConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSRealConstant_Right()
  {
    return (EAttribute)bsRealConstantEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSBooleanConstant()
  {
    return bsBooleanConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSBooleanConstant_Value()
  {
    return (EAttribute)bsBooleanConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSNullLiteral()
  {
    return bsNullLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSBreakLiteral()
  {
    return bsBreakLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSContinueLiteral()
  {
    return bsContinueLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSThisLiteral()
  {
    return bsThisLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSClientLiteral()
  {
    return bsClientLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSParentLiteral()
  {
    return bsParentLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSSymbolRef()
  {
    return bsSymbolRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSSymbolRef_Symbol()
  {
    return (EReference)bsSymbolRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSParentheticalExpression()
  {
    return bsParentheticalExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSParentheticalExpression_Expression()
  {
    return (EReference)bsParentheticalExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlorqueScriptFactory getBlorqueScriptFactory()
  {
    return (BlorqueScriptFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    bsFileEClass = createEClass(BS_FILE);
    createEAttribute(bsFileEClass, BS_FILE__NAME);
    createEReference(bsFileEClass, BS_FILE__IMPORTS);
    createEReference(bsFileEClass, BS_FILE__CLASSES);

    bsImportEClass = createEClass(BS_IMPORT);
    createEAttribute(bsImportEClass, BS_IMPORT__IMPORTED_NAMESPACE);

    bsClassEClass = createEClass(BS_CLASS);
    createEAttribute(bsClassEClass, BS_CLASS__NAME);
    createEReference(bsClassEClass, BS_CLASS__SUPERCLASS);
    createEReference(bsClassEClass, BS_CLASS__MEMBERS);

    bsMemberEClass = createEClass(BS_MEMBER);

    bsFieldEClass = createEClass(BS_FIELD);
    createEAttribute(bsFieldEClass, BS_FIELD__IS_ARRAY);

    bsMethodEClass = createEClass(BS_METHOD);
    createEReference(bsMethodEClass, BS_METHOD__PARAMS);
    createEReference(bsMethodEClass, BS_METHOD__BODY);

    bsParameterEClass = createEClass(BS_PARAMETER);
    createEAttribute(bsParameterEClass, BS_PARAMETER__IS_ARRAY);

    bsMethodBodyEClass = createEClass(BS_METHOD_BODY);
    createEReference(bsMethodBodyEClass, BS_METHOD_BODY__STATEMENTS);

    bsStatementEClass = createEClass(BS_STATEMENT);

    bsReturnEClass = createEClass(BS_RETURN);
    createEReference(bsReturnEClass, BS_RETURN__EXPRESSION);

    bsVariableDeclarationEClass = createEClass(BS_VARIABLE_DECLARATION);
    createEReference(bsVariableDeclarationEClass, BS_VARIABLE_DECLARATION__EXPRESSION);

    bsIfStatementEClass = createEClass(BS_IF_STATEMENT);
    createEReference(bsIfStatementEClass, BS_IF_STATEMENT__EXPRESSION);
    createEReference(bsIfStatementEClass, BS_IF_STATEMENT__THEN_BLOCK);
    createEReference(bsIfStatementEClass, BS_IF_STATEMENT__ELSE_BLOCK);

    bsWhileLoopEClass = createEClass(BS_WHILE_LOOP);
    createEReference(bsWhileLoopEClass, BS_WHILE_LOOP__EXPRESSION);
    createEReference(bsWhileLoopEClass, BS_WHILE_LOOP__BLOCK);

    bsForLoopEClass = createEClass(BS_FOR_LOOP);
    createEReference(bsForLoopEClass, BS_FOR_LOOP__LEFT);
    createEReference(bsForLoopEClass, BS_FOR_LOOP__MIDDLE);
    createEReference(bsForLoopEClass, BS_FOR_LOOP__RIGHT);
    createEReference(bsForLoopEClass, BS_FOR_LOOP__BLOCK);

    bsSwitchStatementEClass = createEClass(BS_SWITCH_STATEMENT);
    createEAttribute(bsSwitchStatementEClass, BS_SWITCH_STATEMENT__STRING_SWITCH);
    createEReference(bsSwitchStatementEClass, BS_SWITCH_STATEMENT__EXPRESSION);
    createEReference(bsSwitchStatementEClass, BS_SWITCH_STATEMENT__BLOCK);

    bsIfBlockEClass = createEClass(BS_IF_BLOCK);
    createEReference(bsIfBlockEClass, BS_IF_BLOCK__STATEMENTS);

    bsLoopBlockEClass = createEClass(BS_LOOP_BLOCK);
    createEReference(bsLoopBlockEClass, BS_LOOP_BLOCK__STATEMENTS);

    bsSwitchBlockEClass = createEClass(BS_SWITCH_BLOCK);
    createEReference(bsSwitchBlockEClass, BS_SWITCH_BLOCK__CASES);

    bsCaseEClass = createEClass(BS_CASE);
    createEReference(bsCaseEClass, BS_CASE__EXPRESSION);
    createEReference(bsCaseEClass, BS_CASE__BLOCK);

    bsCaseBlockEClass = createEClass(BS_CASE_BLOCK);
    createEReference(bsCaseBlockEClass, BS_CASE_BLOCK__STATEMENTS);

    bsBlockEClass = createEClass(BS_BLOCK);

    bsSymbolEClass = createEClass(BS_SYMBOL);
    createEReference(bsSymbolEClass, BS_SYMBOL__TYPE);
    createEAttribute(bsSymbolEClass, BS_SYMBOL__NAME);

    bsExpressionEClass = createEClass(BS_EXPRESSION);

    bsAssignmentExpressionEClass = createEClass(BS_ASSIGNMENT_EXPRESSION);
    createEReference(bsAssignmentExpressionEClass, BS_ASSIGNMENT_EXPRESSION__LEFT);
    createEAttribute(bsAssignmentExpressionEClass, BS_ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR);
    createEReference(bsAssignmentExpressionEClass, BS_ASSIGNMENT_EXPRESSION__RIGHT);

    bsTernaryExpressionEClass = createEClass(BS_TERNARY_EXPRESSION);
    createEReference(bsTernaryExpressionEClass, BS_TERNARY_EXPRESSION__LEFT);
    createEReference(bsTernaryExpressionEClass, BS_TERNARY_EXPRESSION__MIDDLE);
    createEReference(bsTernaryExpressionEClass, BS_TERNARY_EXPRESSION__RIGHT);

    bsBooleanOrExpressionEClass = createEClass(BS_BOOLEAN_OR_EXPRESSION);
    createEReference(bsBooleanOrExpressionEClass, BS_BOOLEAN_OR_EXPRESSION__LEFT);
    createEReference(bsBooleanOrExpressionEClass, BS_BOOLEAN_OR_EXPRESSION__RIGHT);

    bsBooleanAndExpressionEClass = createEClass(BS_BOOLEAN_AND_EXPRESSION);
    createEReference(bsBooleanAndExpressionEClass, BS_BOOLEAN_AND_EXPRESSION__LEFT);
    createEReference(bsBooleanAndExpressionEClass, BS_BOOLEAN_AND_EXPRESSION__RIGHT);

    bsBitwiseOrExpressionEClass = createEClass(BS_BITWISE_OR_EXPRESSION);
    createEReference(bsBitwiseOrExpressionEClass, BS_BITWISE_OR_EXPRESSION__LEFT);
    createEReference(bsBitwiseOrExpressionEClass, BS_BITWISE_OR_EXPRESSION__RIGHT);

    bsBitwiseXorExpressionEClass = createEClass(BS_BITWISE_XOR_EXPRESSION);
    createEReference(bsBitwiseXorExpressionEClass, BS_BITWISE_XOR_EXPRESSION__LEFT);
    createEReference(bsBitwiseXorExpressionEClass, BS_BITWISE_XOR_EXPRESSION__RIGHT);

    bsBitwiseAndExpressionEClass = createEClass(BS_BITWISE_AND_EXPRESSION);
    createEReference(bsBitwiseAndExpressionEClass, BS_BITWISE_AND_EXPRESSION__LEFT);
    createEReference(bsBitwiseAndExpressionEClass, BS_BITWISE_AND_EXPRESSION__RIGHT);

    bsEqualityExpressionEClass = createEClass(BS_EQUALITY_EXPRESSION);
    createEReference(bsEqualityExpressionEClass, BS_EQUALITY_EXPRESSION__LEFT);
    createEAttribute(bsEqualityExpressionEClass, BS_EQUALITY_EXPRESSION__OPERATOR);
    createEReference(bsEqualityExpressionEClass, BS_EQUALITY_EXPRESSION__RIGHT);

    bsOrderedRelationExpressionEClass = createEClass(BS_ORDERED_RELATION_EXPRESSION);
    createEReference(bsOrderedRelationExpressionEClass, BS_ORDERED_RELATION_EXPRESSION__LEFT);
    createEAttribute(bsOrderedRelationExpressionEClass, BS_ORDERED_RELATION_EXPRESSION__OPERATOR);
    createEReference(bsOrderedRelationExpressionEClass, BS_ORDERED_RELATION_EXPRESSION__RIGHT);

    bsBitwiseShiftExpressionEClass = createEClass(BS_BITWISE_SHIFT_EXPRESSION);
    createEReference(bsBitwiseShiftExpressionEClass, BS_BITWISE_SHIFT_EXPRESSION__LEFT);
    createEAttribute(bsBitwiseShiftExpressionEClass, BS_BITWISE_SHIFT_EXPRESSION__OPERATOR);
    createEReference(bsBitwiseShiftExpressionEClass, BS_BITWISE_SHIFT_EXPRESSION__RIGHT);

    bsPlusMinusOrStringConcatExpressionEClass = createEClass(BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION);
    createEReference(bsPlusMinusOrStringConcatExpressionEClass, BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION__LEFT);
    createEAttribute(bsPlusMinusOrStringConcatExpressionEClass, BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION__OPERATOR);
    createEReference(bsPlusMinusOrStringConcatExpressionEClass, BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION__RIGHT);

    bsMulDivOrModExpressionEClass = createEClass(BS_MUL_DIV_OR_MOD_EXPRESSION);
    createEReference(bsMulDivOrModExpressionEClass, BS_MUL_DIV_OR_MOD_EXPRESSION__LEFT);
    createEAttribute(bsMulDivOrModExpressionEClass, BS_MUL_DIV_OR_MOD_EXPRESSION__OPERATOR);
    createEReference(bsMulDivOrModExpressionEClass, BS_MUL_DIV_OR_MOD_EXPRESSION__RIGHT);

    bsCastExpressionEClass = createEClass(BS_CAST_EXPRESSION);
    createEAttribute(bsCastExpressionEClass, BS_CAST_EXPRESSION__CAST_TYPE);
    createEReference(bsCastExpressionEClass, BS_CAST_EXPRESSION__CAST_EXPR);

    bsNewExpressionEClass = createEClass(BS_NEW_EXPRESSION);
    createEAttribute(bsNewExpressionEClass, BS_NEW_EXPRESSION__IS_ARRAY);
    createEReference(bsNewExpressionEClass, BS_NEW_EXPRESSION__TYPE);
    createEReference(bsNewExpressionEClass, BS_NEW_EXPRESSION__ARGS);

    bsUnaryModifierExpressionEClass = createEClass(BS_UNARY_MODIFIER_EXPRESSION);
    createEAttribute(bsUnaryModifierExpressionEClass, BS_UNARY_MODIFIER_EXPRESSION__OPERATOR);
    createEReference(bsUnaryModifierExpressionEClass, BS_UNARY_MODIFIER_EXPRESSION__RECEIVER);

    bsMemberSelectionExpressionEClass = createEClass(BS_MEMBER_SELECTION_EXPRESSION);
    createEReference(bsMemberSelectionExpressionEClass, BS_MEMBER_SELECTION_EXPRESSION__RECEIVER);

    bsMethodInvokationExpressionEClass = createEClass(BS_METHOD_INVOKATION_EXPRESSION);
    createEReference(bsMethodInvokationExpressionEClass, BS_METHOD_INVOKATION_EXPRESSION__RECEIVER);
    createEReference(bsMethodInvokationExpressionEClass, BS_METHOD_INVOKATION_EXPRESSION__ARGS);

    bsArrayAccessExpressionEClass = createEClass(BS_ARRAY_ACCESS_EXPRESSION);
    createEReference(bsArrayAccessExpressionEClass, BS_ARRAY_ACCESS_EXPRESSION__RECEIVER);
    createEReference(bsArrayAccessExpressionEClass, BS_ARRAY_ACCESS_EXPRESSION__ARGS);

    bsPostfixArithmeticExpressionEClass = createEClass(BS_POSTFIX_ARITHMETIC_EXPRESSION);
    createEReference(bsPostfixArithmeticExpressionEClass, BS_POSTFIX_ARITHMETIC_EXPRESSION__RECEIVER);
    createEAttribute(bsPostfixArithmeticExpressionEClass, BS_POSTFIX_ARITHMETIC_EXPRESSION__OPERATOR);

    bsStringConstantEClass = createEClass(BS_STRING_CONSTANT);
    createEAttribute(bsStringConstantEClass, BS_STRING_CONSTANT__VALUE);

    bsHexadecimalConstantEClass = createEClass(BS_HEXADECIMAL_CONSTANT);
    createEAttribute(bsHexadecimalConstantEClass, BS_HEXADECIMAL_CONSTANT__VALUE);

    bsNumberConstantEClass = createEClass(BS_NUMBER_CONSTANT);
    createEAttribute(bsNumberConstantEClass, BS_NUMBER_CONSTANT__VALUE);

    bsRealConstantEClass = createEClass(BS_REAL_CONSTANT);
    createEReference(bsRealConstantEClass, BS_REAL_CONSTANT__LEFT);
    createEAttribute(bsRealConstantEClass, BS_REAL_CONSTANT__RIGHT);

    bsBooleanConstantEClass = createEClass(BS_BOOLEAN_CONSTANT);
    createEAttribute(bsBooleanConstantEClass, BS_BOOLEAN_CONSTANT__VALUE);

    bsNullLiteralEClass = createEClass(BS_NULL_LITERAL);

    bsBreakLiteralEClass = createEClass(BS_BREAK_LITERAL);

    bsContinueLiteralEClass = createEClass(BS_CONTINUE_LITERAL);

    bsThisLiteralEClass = createEClass(BS_THIS_LITERAL);

    bsClientLiteralEClass = createEClass(BS_CLIENT_LITERAL);

    bsParentLiteralEClass = createEClass(BS_PARENT_LITERAL);

    bsSymbolRefEClass = createEClass(BS_SYMBOL_REF);
    createEReference(bsSymbolRefEClass, BS_SYMBOL_REF__SYMBOL);

    bsParentheticalExpressionEClass = createEClass(BS_PARENTHETICAL_EXPRESSION);
    createEReference(bsParentheticalExpressionEClass, BS_PARENTHETICAL_EXPRESSION__EXPRESSION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    bsMemberEClass.getESuperTypes().add(this.getBSSymbol());
    bsFieldEClass.getESuperTypes().add(this.getBSMember());
    bsMethodEClass.getESuperTypes().add(this.getBSMember());
    bsParameterEClass.getESuperTypes().add(this.getBSSymbol());
    bsMethodBodyEClass.getESuperTypes().add(this.getBSBlock());
    bsReturnEClass.getESuperTypes().add(this.getBSStatement());
    bsVariableDeclarationEClass.getESuperTypes().add(this.getBSStatement());
    bsVariableDeclarationEClass.getESuperTypes().add(this.getBSSymbol());
    bsIfStatementEClass.getESuperTypes().add(this.getBSStatement());
    bsWhileLoopEClass.getESuperTypes().add(this.getBSStatement());
    bsForLoopEClass.getESuperTypes().add(this.getBSStatement());
    bsSwitchStatementEClass.getESuperTypes().add(this.getBSStatement());
    bsIfBlockEClass.getESuperTypes().add(this.getBSBlock());
    bsLoopBlockEClass.getESuperTypes().add(this.getBSBlock());
    bsSwitchBlockEClass.getESuperTypes().add(this.getBSBlock());
    bsCaseBlockEClass.getESuperTypes().add(this.getBSBlock());
    bsExpressionEClass.getESuperTypes().add(this.getBSStatement());
    bsAssignmentExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsTernaryExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsBooleanOrExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsBooleanAndExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsBitwiseOrExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsBitwiseXorExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsBitwiseAndExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsEqualityExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsOrderedRelationExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsBitwiseShiftExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsPlusMinusOrStringConcatExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsMulDivOrModExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsCastExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsNewExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsUnaryModifierExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsMemberSelectionExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsMethodInvokationExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsArrayAccessExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsPostfixArithmeticExpressionEClass.getESuperTypes().add(this.getBSExpression());
    bsStringConstantEClass.getESuperTypes().add(this.getBSExpression());
    bsHexadecimalConstantEClass.getESuperTypes().add(this.getBSExpression());
    bsNumberConstantEClass.getESuperTypes().add(this.getBSExpression());
    bsRealConstantEClass.getESuperTypes().add(this.getBSExpression());
    bsBooleanConstantEClass.getESuperTypes().add(this.getBSExpression());
    bsNullLiteralEClass.getESuperTypes().add(this.getBSExpression());
    bsBreakLiteralEClass.getESuperTypes().add(this.getBSExpression());
    bsContinueLiteralEClass.getESuperTypes().add(this.getBSExpression());
    bsThisLiteralEClass.getESuperTypes().add(this.getBSExpression());
    bsClientLiteralEClass.getESuperTypes().add(this.getBSExpression());
    bsParentLiteralEClass.getESuperTypes().add(this.getBSExpression());
    bsSymbolRefEClass.getESuperTypes().add(this.getBSExpression());
    bsParentheticalExpressionEClass.getESuperTypes().add(this.getBSExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(bsFileEClass, BSFile.class, "BSFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, BSFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSFile_Imports(), this.getBSImport(), null, "imports", null, 0, -1, BSFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSFile_Classes(), this.getBSClass(), null, "classes", null, 0, -1, BSFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsImportEClass, BSImport.class, "BSImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, BSImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsClassEClass, BSClass.class, "BSClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, BSClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSClass_Superclass(), this.getBSClass(), null, "superclass", null, 0, 1, BSClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSClass_Members(), this.getBSMember(), null, "members", null, 0, -1, BSClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsMemberEClass, BSMember.class, "BSMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsFieldEClass, BSField.class, "BSField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSField_IsArray(), ecorePackage.getEBoolean(), "isArray", null, 0, 1, BSField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsMethodEClass, BSMethod.class, "BSMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSMethod_Params(), this.getBSParameter(), null, "params", null, 0, -1, BSMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSMethod_Body(), this.getBSMethodBody(), null, "body", null, 0, 1, BSMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsParameterEClass, BSParameter.class, "BSParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSParameter_IsArray(), ecorePackage.getEBoolean(), "isArray", null, 0, 1, BSParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsMethodBodyEClass, BSMethodBody.class, "BSMethodBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSMethodBody_Statements(), this.getBSStatement(), null, "statements", null, 0, -1, BSMethodBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsStatementEClass, BSStatement.class, "BSStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsReturnEClass, BSReturn.class, "BSReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSReturn_Expression(), this.getBSExpression(), null, "expression", null, 0, 1, BSReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsVariableDeclarationEClass, BSVariableDeclaration.class, "BSVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSVariableDeclaration_Expression(), this.getBSExpression(), null, "expression", null, 0, 1, BSVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsIfStatementEClass, BSIfStatement.class, "BSIfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSIfStatement_Expression(), this.getBSExpression(), null, "expression", null, 0, 1, BSIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSIfStatement_ThenBlock(), this.getBSIfBlock(), null, "thenBlock", null, 0, 1, BSIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSIfStatement_ElseBlock(), this.getBSIfBlock(), null, "elseBlock", null, 0, 1, BSIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsWhileLoopEClass, BSWhileLoop.class, "BSWhileLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSWhileLoop_Expression(), this.getBSExpression(), null, "expression", null, 0, 1, BSWhileLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSWhileLoop_Block(), this.getBSLoopBlock(), null, "block", null, 0, 1, BSWhileLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsForLoopEClass, BSForLoop.class, "BSForLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSForLoop_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSForLoop_Middle(), this.getBSExpression(), null, "middle", null, 0, 1, BSForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSForLoop_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSForLoop_Block(), this.getBSLoopBlock(), null, "block", null, 0, 1, BSForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsSwitchStatementEClass, BSSwitchStatement.class, "BSSwitchStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSSwitchStatement_StringSwitch(), ecorePackage.getEBoolean(), "stringSwitch", null, 0, 1, BSSwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSSwitchStatement_Expression(), this.getBSExpression(), null, "expression", null, 0, 1, BSSwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSSwitchStatement_Block(), this.getBSSwitchBlock(), null, "block", null, 0, 1, BSSwitchStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsIfBlockEClass, BSIfBlock.class, "BSIfBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSIfBlock_Statements(), this.getBSStatement(), null, "statements", null, 0, -1, BSIfBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsLoopBlockEClass, BSLoopBlock.class, "BSLoopBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSLoopBlock_Statements(), this.getBSStatement(), null, "statements", null, 0, -1, BSLoopBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsSwitchBlockEClass, BSSwitchBlock.class, "BSSwitchBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSSwitchBlock_Cases(), this.getBSCase(), null, "cases", null, 0, -1, BSSwitchBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsCaseEClass, BSCase.class, "BSCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSCase_Expression(), this.getBSExpression(), null, "expression", null, 0, 1, BSCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSCase_Block(), this.getBSCaseBlock(), null, "block", null, 0, 1, BSCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsCaseBlockEClass, BSCaseBlock.class, "BSCaseBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSCaseBlock_Statements(), this.getBSStatement(), null, "statements", null, 0, -1, BSCaseBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsBlockEClass, BSBlock.class, "BSBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsSymbolEClass, BSSymbol.class, "BSSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSSymbol_Type(), this.getBSClass(), null, "type", null, 0, 1, BSSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSSymbol_Name(), ecorePackage.getEString(), "name", null, 0, 1, BSSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsExpressionEClass, BSExpression.class, "BSExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsAssignmentExpressionEClass, BSAssignmentExpression.class, "BSAssignmentExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSAssignmentExpression_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSAssignmentExpression_AssignmentOperator(), ecorePackage.getEString(), "assignmentOperator", null, 0, 1, BSAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSAssignmentExpression_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSAssignmentExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsTernaryExpressionEClass, BSTernaryExpression.class, "BSTernaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSTernaryExpression_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSTernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSTernaryExpression_Middle(), this.getBSExpression(), null, "middle", null, 0, 1, BSTernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSTernaryExpression_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSTernaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsBooleanOrExpressionEClass, BSBooleanOrExpression.class, "BSBooleanOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSBooleanOrExpression_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSBooleanOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSBooleanOrExpression_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSBooleanOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsBooleanAndExpressionEClass, BSBooleanAndExpression.class, "BSBooleanAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSBooleanAndExpression_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSBooleanAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSBooleanAndExpression_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSBooleanAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsBitwiseOrExpressionEClass, BSBitwiseOrExpression.class, "BSBitwiseOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSBitwiseOrExpression_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSBitwiseOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSBitwiseOrExpression_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSBitwiseOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsBitwiseXorExpressionEClass, BSBitwiseXorExpression.class, "BSBitwiseXorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSBitwiseXorExpression_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSBitwiseXorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSBitwiseXorExpression_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSBitwiseXorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsBitwiseAndExpressionEClass, BSBitwiseAndExpression.class, "BSBitwiseAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSBitwiseAndExpression_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSBitwiseAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSBitwiseAndExpression_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSBitwiseAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsEqualityExpressionEClass, BSEqualityExpression.class, "BSEqualityExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSEqualityExpression_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSEqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSEqualityExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, BSEqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSEqualityExpression_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSEqualityExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsOrderedRelationExpressionEClass, BSOrderedRelationExpression.class, "BSOrderedRelationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSOrderedRelationExpression_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSOrderedRelationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSOrderedRelationExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, BSOrderedRelationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSOrderedRelationExpression_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSOrderedRelationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsBitwiseShiftExpressionEClass, BSBitwiseShiftExpression.class, "BSBitwiseShiftExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSBitwiseShiftExpression_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSBitwiseShiftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSBitwiseShiftExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, BSBitwiseShiftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSBitwiseShiftExpression_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSBitwiseShiftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsPlusMinusOrStringConcatExpressionEClass, BSPlusMinusOrStringConcatExpression.class, "BSPlusMinusOrStringConcatExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSPlusMinusOrStringConcatExpression_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSPlusMinusOrStringConcatExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSPlusMinusOrStringConcatExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, BSPlusMinusOrStringConcatExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSPlusMinusOrStringConcatExpression_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSPlusMinusOrStringConcatExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsMulDivOrModExpressionEClass, BSMulDivOrModExpression.class, "BSMulDivOrModExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSMulDivOrModExpression_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSMulDivOrModExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSMulDivOrModExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, BSMulDivOrModExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSMulDivOrModExpression_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSMulDivOrModExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsCastExpressionEClass, BSCastExpression.class, "BSCastExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSCastExpression_CastType(), ecorePackage.getEString(), "castType", null, 0, 1, BSCastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSCastExpression_CastExpr(), this.getBSExpression(), null, "castExpr", null, 0, 1, BSCastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsNewExpressionEClass, BSNewExpression.class, "BSNewExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSNewExpression_IsArray(), ecorePackage.getEBoolean(), "isArray", null, 0, 1, BSNewExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSNewExpression_Type(), this.getBSClass(), null, "type", null, 0, 1, BSNewExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSNewExpression_Args(), this.getBSExpression(), null, "args", null, 0, -1, BSNewExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsUnaryModifierExpressionEClass, BSUnaryModifierExpression.class, "BSUnaryModifierExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSUnaryModifierExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, BSUnaryModifierExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSUnaryModifierExpression_Receiver(), this.getBSExpression(), null, "receiver", null, 0, 1, BSUnaryModifierExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsMemberSelectionExpressionEClass, BSMemberSelectionExpression.class, "BSMemberSelectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSMemberSelectionExpression_Receiver(), this.getBSExpression(), null, "receiver", null, 0, 1, BSMemberSelectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsMethodInvokationExpressionEClass, BSMethodInvokationExpression.class, "BSMethodInvokationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSMethodInvokationExpression_Receiver(), this.getBSExpression(), null, "receiver", null, 0, 1, BSMethodInvokationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSMethodInvokationExpression_Args(), this.getBSExpression(), null, "args", null, 0, -1, BSMethodInvokationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsArrayAccessExpressionEClass, BSArrayAccessExpression.class, "BSArrayAccessExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSArrayAccessExpression_Receiver(), this.getBSExpression(), null, "receiver", null, 0, 1, BSArrayAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSArrayAccessExpression_Args(), this.getBSExpression(), null, "args", null, 0, -1, BSArrayAccessExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsPostfixArithmeticExpressionEClass, BSPostfixArithmeticExpression.class, "BSPostfixArithmeticExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSPostfixArithmeticExpression_Receiver(), this.getBSExpression(), null, "receiver", null, 0, 1, BSPostfixArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSPostfixArithmeticExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, BSPostfixArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsStringConstantEClass, BSStringConstant.class, "BSStringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSStringConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, BSStringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsHexadecimalConstantEClass, BSHexadecimalConstant.class, "BSHexadecimalConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSHexadecimalConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, BSHexadecimalConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsNumberConstantEClass, BSNumberConstant.class, "BSNumberConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSNumberConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, BSNumberConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsRealConstantEClass, BSRealConstant.class, "BSRealConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSRealConstant_Left(), this.getBSNumberConstant(), null, "left", null, 0, 1, BSRealConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSRealConstant_Right(), ecorePackage.getEInt(), "right", null, 0, 1, BSRealConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsBooleanConstantEClass, BSBooleanConstant.class, "BSBooleanConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSBooleanConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, BSBooleanConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsNullLiteralEClass, BSNullLiteral.class, "BSNullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsBreakLiteralEClass, BSBreakLiteral.class, "BSBreakLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsContinueLiteralEClass, BSContinueLiteral.class, "BSContinueLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsThisLiteralEClass, BSThisLiteral.class, "BSThisLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsClientLiteralEClass, BSClientLiteral.class, "BSClientLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsParentLiteralEClass, BSParentLiteral.class, "BSParentLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsSymbolRefEClass, BSSymbolRef.class, "BSSymbolRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSSymbolRef_Symbol(), this.getBSSymbol(), null, "symbol", null, 0, 1, BSSymbolRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsParentheticalExpressionEClass, BSParentheticalExpression.class, "BSParentheticalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSParentheticalExpression_Expression(), this.getBSExpression(), null, "expression", null, 0, 1, BSParentheticalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BlorqueScriptPackageImpl
