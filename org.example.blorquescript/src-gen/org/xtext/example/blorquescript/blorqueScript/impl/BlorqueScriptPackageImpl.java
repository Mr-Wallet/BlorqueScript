/**
 */
package org.xtext.example.blorquescript.blorqueScript.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.blorquescript.blorqueScript.BSAssignment;
import org.xtext.example.blorquescript.blorqueScript.BSBlock;
import org.xtext.example.blorquescript.blorqueScript.BSBooleanConstant;
import org.xtext.example.blorquescript.blorqueScript.BSClass;
import org.xtext.example.blorquescript.blorqueScript.BSClient;
import org.xtext.example.blorquescript.blorqueScript.BSExpression;
import org.xtext.example.blorquescript.blorqueScript.BSField;
import org.xtext.example.blorquescript.blorqueScript.BSFile;
import org.xtext.example.blorquescript.blorqueScript.BSIfBlock;
import org.xtext.example.blorquescript.blorqueScript.BSIfStatement;
import org.xtext.example.blorquescript.blorqueScript.BSImport;
import org.xtext.example.blorquescript.blorqueScript.BSMember;
import org.xtext.example.blorquescript.blorqueScript.BSMemberSelection;
import org.xtext.example.blorquescript.blorqueScript.BSMethod;
import org.xtext.example.blorquescript.blorqueScript.BSMethodBody;
import org.xtext.example.blorquescript.blorqueScript.BSNew;
import org.xtext.example.blorquescript.blorqueScript.BSNull;
import org.xtext.example.blorquescript.blorqueScript.BSNumberConstant;
import org.xtext.example.blorquescript.blorqueScript.BSParameter;
import org.xtext.example.blorquescript.blorqueScript.BSReturn;
import org.xtext.example.blorquescript.blorqueScript.BSStatement;
import org.xtext.example.blorquescript.blorqueScript.BSStringConstant;
import org.xtext.example.blorquescript.blorqueScript.BSSymbol;
import org.xtext.example.blorquescript.blorqueScript.BSSymbolRef;
import org.xtext.example.blorquescript.blorqueScript.BSThis;
import org.xtext.example.blorquescript.blorqueScript.BSVariableDeclaration;
import org.xtext.example.blorquescript.blorqueScript.BlorqueScriptFactory;
import org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage;

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
  private EClass bsIfBlockEClass = null;

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
  private EClass bsAssignmentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsMemberSelectionEClass = null;

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
  private EClass bsNumberConstantEClass = null;

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
  private EClass bsNullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsThisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsClientEClass = null;

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
  private EClass bsNewEClass = null;

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
   * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage#eNS_URI
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
  public EClass getBSMethodBody()
  {
    return bsMethodBodyEClass;
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
  public EClass getBSIfBlock()
  {
    return bsIfBlockEClass;
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
  public EReference getBSBlock_Statements()
  {
    return (EReference)bsBlockEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getBSExpression_CastType()
  {
    return (EAttribute)bsExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSExpression_CastExpr()
  {
    return (EReference)bsExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSAssignment()
  {
    return bsAssignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSAssignment_Left()
  {
    return (EReference)bsAssignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSAssignment_Right()
  {
    return (EReference)bsAssignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSMemberSelection()
  {
    return bsMemberSelectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSMemberSelection_Receiver()
  {
    return (EReference)bsMemberSelectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSMemberSelection_Member()
  {
    return (EReference)bsMemberSelectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSMemberSelection_Methodinvocation()
  {
    return (EAttribute)bsMemberSelectionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSMemberSelection_Args()
  {
    return (EReference)bsMemberSelectionEClass.getEStructuralFeatures().get(3);
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
  public EClass getBSNull()
  {
    return bsNullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSThis()
  {
    return bsThisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSClient()
  {
    return bsClientEClass;
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
  public EAttribute getBSSymbolRef_Methodinvocation()
  {
    return (EAttribute)bsSymbolRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSSymbolRef_Args()
  {
    return (EReference)bsSymbolRefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSNew()
  {
    return bsNewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSNew_Type()
  {
    return (EReference)bsNewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSNew_Args()
  {
    return (EReference)bsNewEClass.getEStructuralFeatures().get(1);
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

    bsMethodEClass = createEClass(BS_METHOD);
    createEReference(bsMethodEClass, BS_METHOD__PARAMS);
    createEReference(bsMethodEClass, BS_METHOD__BODY);

    bsParameterEClass = createEClass(BS_PARAMETER);

    bsMethodBodyEClass = createEClass(BS_METHOD_BODY);

    bsStatementEClass = createEClass(BS_STATEMENT);

    bsReturnEClass = createEClass(BS_RETURN);
    createEReference(bsReturnEClass, BS_RETURN__EXPRESSION);

    bsVariableDeclarationEClass = createEClass(BS_VARIABLE_DECLARATION);
    createEReference(bsVariableDeclarationEClass, BS_VARIABLE_DECLARATION__EXPRESSION);

    bsIfStatementEClass = createEClass(BS_IF_STATEMENT);
    createEReference(bsIfStatementEClass, BS_IF_STATEMENT__EXPRESSION);
    createEReference(bsIfStatementEClass, BS_IF_STATEMENT__THEN_BLOCK);
    createEReference(bsIfStatementEClass, BS_IF_STATEMENT__ELSE_BLOCK);

    bsIfBlockEClass = createEClass(BS_IF_BLOCK);

    bsBlockEClass = createEClass(BS_BLOCK);
    createEReference(bsBlockEClass, BS_BLOCK__STATEMENTS);

    bsSymbolEClass = createEClass(BS_SYMBOL);
    createEReference(bsSymbolEClass, BS_SYMBOL__TYPE);
    createEAttribute(bsSymbolEClass, BS_SYMBOL__NAME);

    bsExpressionEClass = createEClass(BS_EXPRESSION);
    createEAttribute(bsExpressionEClass, BS_EXPRESSION__CAST_TYPE);
    createEReference(bsExpressionEClass, BS_EXPRESSION__CAST_EXPR);

    bsAssignmentEClass = createEClass(BS_ASSIGNMENT);
    createEReference(bsAssignmentEClass, BS_ASSIGNMENT__LEFT);
    createEReference(bsAssignmentEClass, BS_ASSIGNMENT__RIGHT);

    bsMemberSelectionEClass = createEClass(BS_MEMBER_SELECTION);
    createEReference(bsMemberSelectionEClass, BS_MEMBER_SELECTION__RECEIVER);
    createEReference(bsMemberSelectionEClass, BS_MEMBER_SELECTION__MEMBER);
    createEAttribute(bsMemberSelectionEClass, BS_MEMBER_SELECTION__METHODINVOCATION);
    createEReference(bsMemberSelectionEClass, BS_MEMBER_SELECTION__ARGS);

    bsStringConstantEClass = createEClass(BS_STRING_CONSTANT);
    createEAttribute(bsStringConstantEClass, BS_STRING_CONSTANT__VALUE);

    bsNumberConstantEClass = createEClass(BS_NUMBER_CONSTANT);
    createEAttribute(bsNumberConstantEClass, BS_NUMBER_CONSTANT__VALUE);

    bsBooleanConstantEClass = createEClass(BS_BOOLEAN_CONSTANT);
    createEAttribute(bsBooleanConstantEClass, BS_BOOLEAN_CONSTANT__VALUE);

    bsNullEClass = createEClass(BS_NULL);

    bsThisEClass = createEClass(BS_THIS);

    bsClientEClass = createEClass(BS_CLIENT);

    bsSymbolRefEClass = createEClass(BS_SYMBOL_REF);
    createEReference(bsSymbolRefEClass, BS_SYMBOL_REF__SYMBOL);
    createEAttribute(bsSymbolRefEClass, BS_SYMBOL_REF__METHODINVOCATION);
    createEReference(bsSymbolRefEClass, BS_SYMBOL_REF__ARGS);

    bsNewEClass = createEClass(BS_NEW);
    createEReference(bsNewEClass, BS_NEW__TYPE);
    createEReference(bsNewEClass, BS_NEW__ARGS);
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
    bsIfBlockEClass.getESuperTypes().add(this.getBSBlock());
    bsExpressionEClass.getESuperTypes().add(this.getBSStatement());
    bsAssignmentEClass.getESuperTypes().add(this.getBSExpression());
    bsMemberSelectionEClass.getESuperTypes().add(this.getBSExpression());
    bsStringConstantEClass.getESuperTypes().add(this.getBSExpression());
    bsNumberConstantEClass.getESuperTypes().add(this.getBSExpression());
    bsBooleanConstantEClass.getESuperTypes().add(this.getBSExpression());
    bsNullEClass.getESuperTypes().add(this.getBSExpression());
    bsThisEClass.getESuperTypes().add(this.getBSExpression());
    bsClientEClass.getESuperTypes().add(this.getBSExpression());
    bsSymbolRefEClass.getESuperTypes().add(this.getBSExpression());
    bsNewEClass.getESuperTypes().add(this.getBSExpression());

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

    initEClass(bsMethodEClass, BSMethod.class, "BSMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSMethod_Params(), this.getBSParameter(), null, "params", null, 0, -1, BSMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSMethod_Body(), this.getBSMethodBody(), null, "body", null, 0, 1, BSMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsParameterEClass, BSParameter.class, "BSParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsMethodBodyEClass, BSMethodBody.class, "BSMethodBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsStatementEClass, BSStatement.class, "BSStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsReturnEClass, BSReturn.class, "BSReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSReturn_Expression(), this.getBSExpression(), null, "expression", null, 0, 1, BSReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsVariableDeclarationEClass, BSVariableDeclaration.class, "BSVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSVariableDeclaration_Expression(), this.getBSExpression(), null, "expression", null, 0, 1, BSVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsIfStatementEClass, BSIfStatement.class, "BSIfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSIfStatement_Expression(), this.getBSExpression(), null, "expression", null, 0, 1, BSIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSIfStatement_ThenBlock(), this.getBSIfBlock(), null, "thenBlock", null, 0, 1, BSIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSIfStatement_ElseBlock(), this.getBSIfBlock(), null, "elseBlock", null, 0, 1, BSIfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsIfBlockEClass, BSIfBlock.class, "BSIfBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsBlockEClass, BSBlock.class, "BSBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSBlock_Statements(), this.getBSStatement(), null, "statements", null, 0, -1, BSBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsSymbolEClass, BSSymbol.class, "BSSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSSymbol_Type(), this.getBSClass(), null, "type", null, 0, 1, BSSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSSymbol_Name(), ecorePackage.getEString(), "name", null, 0, 1, BSSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsExpressionEClass, BSExpression.class, "BSExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSExpression_CastType(), ecorePackage.getEString(), "castType", null, 0, 1, BSExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSExpression_CastExpr(), this.getBSExpression(), null, "castExpr", null, 0, 1, BSExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsAssignmentEClass, BSAssignment.class, "BSAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSAssignment_Left(), this.getBSExpression(), null, "left", null, 0, 1, BSAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSAssignment_Right(), this.getBSExpression(), null, "right", null, 0, 1, BSAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsMemberSelectionEClass, BSMemberSelection.class, "BSMemberSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSMemberSelection_Receiver(), this.getBSExpression(), null, "receiver", null, 0, 1, BSMemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSMemberSelection_Member(), this.getBSMember(), null, "member", null, 0, 1, BSMemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSMemberSelection_Methodinvocation(), ecorePackage.getEBoolean(), "methodinvocation", null, 0, 1, BSMemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSMemberSelection_Args(), this.getBSExpression(), null, "args", null, 0, -1, BSMemberSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsStringConstantEClass, BSStringConstant.class, "BSStringConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSStringConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, BSStringConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsNumberConstantEClass, BSNumberConstant.class, "BSNumberConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSNumberConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, BSNumberConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsBooleanConstantEClass, BSBooleanConstant.class, "BSBooleanConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSBooleanConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, BSBooleanConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsNullEClass, BSNull.class, "BSNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsThisEClass, BSThis.class, "BSThis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsClientEClass, BSClient.class, "BSClient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bsSymbolRefEClass, BSSymbolRef.class, "BSSymbolRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSSymbolRef_Symbol(), this.getBSSymbol(), null, "symbol", null, 0, 1, BSSymbolRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSSymbolRef_Methodinvocation(), ecorePackage.getEBoolean(), "methodinvocation", null, 0, 1, BSSymbolRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSSymbolRef_Args(), this.getBSExpression(), null, "args", null, 0, -1, BSSymbolRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bsNewEClass, BSNew.class, "BSNew", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBSNew_Type(), this.getBSClass(), null, "type", null, 0, 1, BSNew.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSNew_Args(), this.getBSExpression(), null, "args", null, 0, -1, BSNew.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BlorqueScriptPackageImpl
