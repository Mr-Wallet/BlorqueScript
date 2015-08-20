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
      case BlorqueScriptPackage.BS_VARIABLE_DECLARATION: return createBSVariableDeclaration();
      case BlorqueScriptPackage.BS_IF_STATEMENT: return createBSIfStatement();
      case BlorqueScriptPackage.BS_IF_BLOCK: return createBSIfBlock();
      case BlorqueScriptPackage.BS_BLOCK: return createBSBlock();
      case BlorqueScriptPackage.BS_SYMBOL: return createBSSymbol();
      case BlorqueScriptPackage.BS_EXPRESSION: return createBSExpression();
      case BlorqueScriptPackage.BS_ASSIGNMENT: return createBSAssignment();
      case BlorqueScriptPackage.BS_MEMBER_SELECTION: return createBSMemberSelection();
      case BlorqueScriptPackage.BS_STRING_CONSTANT: return createBSStringConstant();
      case BlorqueScriptPackage.BS_NUMBER_CONSTANT: return createBSNumberConstant();
      case BlorqueScriptPackage.BS_BOOLEAN_CONSTANT: return createBSBooleanConstant();
      case BlorqueScriptPackage.BS_NULL: return createBSNull();
      case BlorqueScriptPackage.BS_THIS: return createBSThis();
      case BlorqueScriptPackage.BS_CLIENT: return createBSClient();
      case BlorqueScriptPackage.BS_SYMBOL_REF: return createBSSymbolRef();
      case BlorqueScriptPackage.BS_NEW: return createBSNew();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public BSAssignment createBSAssignment()
  {
    BSAssignmentImpl bsAssignment = new BSAssignmentImpl();
    return bsAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSMemberSelection createBSMemberSelection()
  {
    BSMemberSelectionImpl bsMemberSelection = new BSMemberSelectionImpl();
    return bsMemberSelection;
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
  public BSNull createBSNull()
  {
    BSNullImpl bsNull = new BSNullImpl();
    return bsNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSThis createBSThis()
  {
    BSThisImpl bsThis = new BSThisImpl();
    return bsThis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSClient createBSClient()
  {
    BSClientImpl bsClient = new BSClientImpl();
    return bsClient;
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
  public BSNew createBSNew()
  {
    BSNewImpl bsNew = new BSNewImpl();
    return bsNew;
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
