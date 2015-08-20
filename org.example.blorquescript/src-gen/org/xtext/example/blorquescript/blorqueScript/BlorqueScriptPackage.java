/**
 */
package org.xtext.example.blorquescript.blorqueScript;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptFactory
 * @model kind="package"
 * @generated
 */
public interface BlorqueScriptPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "blorqueScript";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/blorquescript/BlorqueScript";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "blorqueScript";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BlorqueScriptPackage eINSTANCE = org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSFileImpl <em>BS File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSFileImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSFile()
   * @generated
   */
  int BS_FILE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FILE__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FILE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Classes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FILE__CLASSES = 2;

  /**
   * The number of structural features of the '<em>BS File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSImportImpl <em>BS Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSImportImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSImport()
   * @generated
   */
  int BS_IMPORT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_IMPORT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>BS Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSClassImpl <em>BS Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSClassImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSClass()
   * @generated
   */
  int BS_CLASS = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CLASS__NAME = 0;

  /**
   * The feature id for the '<em><b>Superclass</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CLASS__SUPERCLASS = 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CLASS__MEMBERS = 2;

  /**
   * The number of structural features of the '<em>BS Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CLASS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSSymbolImpl <em>BS Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSSymbolImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSSymbol()
   * @generated
   */
  int BS_SYMBOL = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SYMBOL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SYMBOL__NAME = 1;

  /**
   * The number of structural features of the '<em>BS Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SYMBOL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSMemberImpl <em>BS Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSMemberImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMember()
   * @generated
   */
  int BS_MEMBER = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MEMBER__TYPE = BS_SYMBOL__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MEMBER__NAME = BS_SYMBOL__NAME;

  /**
   * The number of structural features of the '<em>BS Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MEMBER_FEATURE_COUNT = BS_SYMBOL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSFieldImpl <em>BS Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSFieldImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSField()
   * @generated
   */
  int BS_FIELD = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FIELD__TYPE = BS_MEMBER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FIELD__NAME = BS_MEMBER__NAME;

  /**
   * The number of structural features of the '<em>BS Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FIELD_FEATURE_COUNT = BS_MEMBER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSMethodImpl <em>BS Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSMethodImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMethod()
   * @generated
   */
  int BS_METHOD = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_METHOD__TYPE = BS_MEMBER__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_METHOD__NAME = BS_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_METHOD__PARAMS = BS_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_METHOD__BODY = BS_MEMBER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_METHOD_FEATURE_COUNT = BS_MEMBER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSParameterImpl <em>BS Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSParameterImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSParameter()
   * @generated
   */
  int BS_PARAMETER = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_PARAMETER__TYPE = BS_SYMBOL__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_PARAMETER__NAME = BS_SYMBOL__NAME;

  /**
   * The number of structural features of the '<em>BS Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_PARAMETER_FEATURE_COUNT = BS_SYMBOL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSBlockImpl <em>BS Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSBlockImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBlock()
   * @generated
   */
  int BS_BLOCK = 13;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BLOCK__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>BS Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSMethodBodyImpl <em>BS Method Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSMethodBodyImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMethodBody()
   * @generated
   */
  int BS_METHOD_BODY = 7;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_METHOD_BODY__STATEMENTS = BS_BLOCK__STATEMENTS;

  /**
   * The number of structural features of the '<em>BS Method Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_METHOD_BODY_FEATURE_COUNT = BS_BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSStatementImpl <em>BS Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSStatementImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSStatement()
   * @generated
   */
  int BS_STATEMENT = 8;

  /**
   * The number of structural features of the '<em>BS Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSReturnImpl <em>BS Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSReturnImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSReturn()
   * @generated
   */
  int BS_RETURN = 9;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_RETURN__EXPRESSION = BS_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_RETURN_FEATURE_COUNT = BS_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSVariableDeclarationImpl <em>BS Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSVariableDeclarationImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSVariableDeclaration()
   * @generated
   */
  int BS_VARIABLE_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_VARIABLE_DECLARATION__TYPE = BS_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_VARIABLE_DECLARATION__NAME = BS_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_VARIABLE_DECLARATION__EXPRESSION = BS_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BS Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_VARIABLE_DECLARATION_FEATURE_COUNT = BS_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSIfStatementImpl <em>BS If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSIfStatementImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSIfStatement()
   * @generated
   */
  int BS_IF_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_IF_STATEMENT__EXPRESSION = BS_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_IF_STATEMENT__THEN_BLOCK = BS_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_IF_STATEMENT__ELSE_BLOCK = BS_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BS If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_IF_STATEMENT_FEATURE_COUNT = BS_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSIfBlockImpl <em>BS If Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSIfBlockImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSIfBlock()
   * @generated
   */
  int BS_IF_BLOCK = 12;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_IF_BLOCK__STATEMENTS = BS_BLOCK__STATEMENTS;

  /**
   * The number of structural features of the '<em>BS If Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_IF_BLOCK_FEATURE_COUNT = BS_BLOCK_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSExpressionImpl <em>BS Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSExpressionImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSExpression()
   * @generated
   */
  int BS_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_EXPRESSION__CAST_TYPE = BS_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_EXPRESSION__CAST_EXPR = BS_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_EXPRESSION_FEATURE_COUNT = BS_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSAssignmentImpl <em>BS Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSAssignmentImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSAssignment()
   * @generated
   */
  int BS_ASSIGNMENT = 16;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ASSIGNMENT__CAST_TYPE = BS_EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ASSIGNMENT__CAST_EXPR = BS_EXPRESSION__CAST_EXPR;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ASSIGNMENT__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ASSIGNMENT__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ASSIGNMENT_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSMemberSelectionImpl <em>BS Member Selection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSMemberSelectionImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMemberSelection()
   * @generated
   */
  int BS_MEMBER_SELECTION = 17;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MEMBER_SELECTION__CAST_TYPE = BS_EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MEMBER_SELECTION__CAST_EXPR = BS_EXPRESSION__CAST_EXPR;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MEMBER_SELECTION__RECEIVER = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MEMBER_SELECTION__MEMBER = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Methodinvocation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MEMBER_SELECTION__METHODINVOCATION = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MEMBER_SELECTION__ARGS = BS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>BS Member Selection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MEMBER_SELECTION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSStringConstantImpl <em>BS String Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSStringConstantImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSStringConstant()
   * @generated
   */
  int BS_STRING_CONSTANT = 18;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_STRING_CONSTANT__CAST_TYPE = BS_EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_STRING_CONSTANT__CAST_EXPR = BS_EXPRESSION__CAST_EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_STRING_CONSTANT__VALUE = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS String Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_STRING_CONSTANT_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSNumberConstantImpl <em>BS Number Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSNumberConstantImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSNumberConstant()
   * @generated
   */
  int BS_NUMBER_CONSTANT = 19;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NUMBER_CONSTANT__CAST_TYPE = BS_EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NUMBER_CONSTANT__CAST_EXPR = BS_EXPRESSION__CAST_EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NUMBER_CONSTANT__VALUE = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Number Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NUMBER_CONSTANT_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSBooleanConstantImpl <em>BS Boolean Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSBooleanConstantImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBooleanConstant()
   * @generated
   */
  int BS_BOOLEAN_CONSTANT = 20;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BOOLEAN_CONSTANT__CAST_TYPE = BS_EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BOOLEAN_CONSTANT__CAST_EXPR = BS_EXPRESSION__CAST_EXPR;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BOOLEAN_CONSTANT__VALUE = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Boolean Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BOOLEAN_CONSTANT_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSNullImpl <em>BS Null</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSNullImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSNull()
   * @generated
   */
  int BS_NULL = 21;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NULL__CAST_TYPE = BS_EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NULL__CAST_EXPR = BS_EXPRESSION__CAST_EXPR;

  /**
   * The number of structural features of the '<em>BS Null</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NULL_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSThisImpl <em>BS This</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSThisImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSThis()
   * @generated
   */
  int BS_THIS = 22;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_THIS__CAST_TYPE = BS_EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_THIS__CAST_EXPR = BS_EXPRESSION__CAST_EXPR;

  /**
   * The number of structural features of the '<em>BS This</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_THIS_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSClientImpl <em>BS Client</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSClientImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSClient()
   * @generated
   */
  int BS_CLIENT = 23;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CLIENT__CAST_TYPE = BS_EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CLIENT__CAST_EXPR = BS_EXPRESSION__CAST_EXPR;

  /**
   * The number of structural features of the '<em>BS Client</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CLIENT_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSSymbolRefImpl <em>BS Symbol Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSSymbolRefImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSSymbolRef()
   * @generated
   */
  int BS_SYMBOL_REF = 24;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SYMBOL_REF__CAST_TYPE = BS_EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SYMBOL_REF__CAST_EXPR = BS_EXPRESSION__CAST_EXPR;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SYMBOL_REF__SYMBOL = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Methodinvocation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SYMBOL_REF__METHODINVOCATION = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SYMBOL_REF__ARGS = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BS Symbol Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SYMBOL_REF_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSNewImpl <em>BS New</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BSNewImpl
   * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSNew()
   * @generated
   */
  int BS_NEW = 25;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NEW__CAST_TYPE = BS_EXPRESSION__CAST_TYPE;

  /**
   * The feature id for the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NEW__CAST_EXPR = BS_EXPRESSION__CAST_EXPR;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NEW__TYPE = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NEW__ARGS = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS New</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NEW_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSFile <em>BS File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS File</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSFile
   * @generated
   */
  EClass getBSFile();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.blorquescript.blorqueScript.BSFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSFile#getName()
   * @see #getBSFile()
   * @generated
   */
  EAttribute getBSFile_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.blorquescript.blorqueScript.BSFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSFile#getImports()
   * @see #getBSFile()
   * @generated
   */
  EReference getBSFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.blorquescript.blorqueScript.BSFile#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSFile#getClasses()
   * @see #getBSFile()
   * @generated
   */
  EReference getBSFile_Classes();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSImport <em>BS Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Import</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSImport
   * @generated
   */
  EClass getBSImport();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.blorquescript.blorqueScript.BSImport#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSImport#getImportedNamespace()
   * @see #getBSImport()
   * @generated
   */
  EAttribute getBSImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSClass <em>BS Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Class</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSClass
   * @generated
   */
  EClass getBSClass();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.blorquescript.blorqueScript.BSClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSClass#getName()
   * @see #getBSClass()
   * @generated
   */
  EAttribute getBSClass_Name();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.blorquescript.blorqueScript.BSClass#getSuperclass <em>Superclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Superclass</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSClass#getSuperclass()
   * @see #getBSClass()
   * @generated
   */
  EReference getBSClass_Superclass();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.blorquescript.blorqueScript.BSClass#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSClass#getMembers()
   * @see #getBSClass()
   * @generated
   */
  EReference getBSClass_Members();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSMember <em>BS Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Member</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMember
   * @generated
   */
  EClass getBSMember();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSField <em>BS Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Field</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSField
   * @generated
   */
  EClass getBSField();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSMethod <em>BS Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Method</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMethod
   * @generated
   */
  EClass getBSMethod();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.blorquescript.blorqueScript.BSMethod#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMethod#getParams()
   * @see #getBSMethod()
   * @generated
   */
  EReference getBSMethod_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.blorquescript.blorqueScript.BSMethod#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMethod#getBody()
   * @see #getBSMethod()
   * @generated
   */
  EReference getBSMethod_Body();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSParameter <em>BS Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Parameter</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSParameter
   * @generated
   */
  EClass getBSParameter();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSMethodBody <em>BS Method Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Method Body</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMethodBody
   * @generated
   */
  EClass getBSMethodBody();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSStatement <em>BS Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Statement</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSStatement
   * @generated
   */
  EClass getBSStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSReturn <em>BS Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Return</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSReturn
   * @generated
   */
  EClass getBSReturn();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.blorquescript.blorqueScript.BSReturn#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSReturn#getExpression()
   * @see #getBSReturn()
   * @generated
   */
  EReference getBSReturn_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSVariableDeclaration <em>BS Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Variable Declaration</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSVariableDeclaration
   * @generated
   */
  EClass getBSVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.blorquescript.blorqueScript.BSVariableDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSVariableDeclaration#getExpression()
   * @see #getBSVariableDeclaration()
   * @generated
   */
  EReference getBSVariableDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSIfStatement <em>BS If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS If Statement</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSIfStatement
   * @generated
   */
  EClass getBSIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.blorquescript.blorqueScript.BSIfStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSIfStatement#getExpression()
   * @see #getBSIfStatement()
   * @generated
   */
  EReference getBSIfStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.blorquescript.blorqueScript.BSIfStatement#getThenBlock <em>Then Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Block</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSIfStatement#getThenBlock()
   * @see #getBSIfStatement()
   * @generated
   */
  EReference getBSIfStatement_ThenBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.blorquescript.blorqueScript.BSIfStatement#getElseBlock <em>Else Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Block</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSIfStatement#getElseBlock()
   * @see #getBSIfStatement()
   * @generated
   */
  EReference getBSIfStatement_ElseBlock();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSIfBlock <em>BS If Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS If Block</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSIfBlock
   * @generated
   */
  EClass getBSIfBlock();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSBlock <em>BS Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Block</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSBlock
   * @generated
   */
  EClass getBSBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.blorquescript.blorqueScript.BSBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSBlock#getStatements()
   * @see #getBSBlock()
   * @generated
   */
  EReference getBSBlock_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSSymbol <em>BS Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Symbol</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSSymbol
   * @generated
   */
  EClass getBSSymbol();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.blorquescript.blorqueScript.BSSymbol#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSSymbol#getType()
   * @see #getBSSymbol()
   * @generated
   */
  EReference getBSSymbol_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.blorquescript.blorqueScript.BSSymbol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSSymbol#getName()
   * @see #getBSSymbol()
   * @generated
   */
  EAttribute getBSSymbol_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSExpression <em>BS Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Expression</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSExpression
   * @generated
   */
  EClass getBSExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.blorquescript.blorqueScript.BSExpression#getCastType <em>Cast Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cast Type</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSExpression#getCastType()
   * @see #getBSExpression()
   * @generated
   */
  EAttribute getBSExpression_CastType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.blorquescript.blorqueScript.BSExpression#getCastExpr <em>Cast Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cast Expr</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSExpression#getCastExpr()
   * @see #getBSExpression()
   * @generated
   */
  EReference getBSExpression_CastExpr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSAssignment <em>BS Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Assignment</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSAssignment
   * @generated
   */
  EClass getBSAssignment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.blorquescript.blorqueScript.BSAssignment#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSAssignment#getLeft()
   * @see #getBSAssignment()
   * @generated
   */
  EReference getBSAssignment_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.blorquescript.blorqueScript.BSAssignment#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSAssignment#getRight()
   * @see #getBSAssignment()
   * @generated
   */
  EReference getBSAssignment_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection <em>BS Member Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Member Selection</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMemberSelection
   * @generated
   */
  EClass getBSMemberSelection();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receiver</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#getReceiver()
   * @see #getBSMemberSelection()
   * @generated
   */
  EReference getBSMemberSelection_Receiver();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Member</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#getMember()
   * @see #getBSMemberSelection()
   * @generated
   */
  EReference getBSMemberSelection_Member();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#isMethodinvocation <em>Methodinvocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Methodinvocation</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#isMethodinvocation()
   * @see #getBSMemberSelection()
   * @generated
   */
  EAttribute getBSMemberSelection_Methodinvocation();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSMemberSelection#getArgs()
   * @see #getBSMemberSelection()
   * @generated
   */
  EReference getBSMemberSelection_Args();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSStringConstant <em>BS String Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS String Constant</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSStringConstant
   * @generated
   */
  EClass getBSStringConstant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.blorquescript.blorqueScript.BSStringConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSStringConstant#getValue()
   * @see #getBSStringConstant()
   * @generated
   */
  EAttribute getBSStringConstant_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSNumberConstant <em>BS Number Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Number Constant</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSNumberConstant
   * @generated
   */
  EClass getBSNumberConstant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.blorquescript.blorqueScript.BSNumberConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSNumberConstant#getValue()
   * @see #getBSNumberConstant()
   * @generated
   */
  EAttribute getBSNumberConstant_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSBooleanConstant <em>BS Boolean Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Boolean Constant</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSBooleanConstant
   * @generated
   */
  EClass getBSBooleanConstant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.blorquescript.blorqueScript.BSBooleanConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSBooleanConstant#getValue()
   * @see #getBSBooleanConstant()
   * @generated
   */
  EAttribute getBSBooleanConstant_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSNull <em>BS Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Null</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSNull
   * @generated
   */
  EClass getBSNull();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSThis <em>BS This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS This</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSThis
   * @generated
   */
  EClass getBSThis();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSClient <em>BS Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Client</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSClient
   * @generated
   */
  EClass getBSClient();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSSymbolRef <em>BS Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Symbol Ref</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSSymbolRef
   * @generated
   */
  EClass getBSSymbolRef();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.blorquescript.blorqueScript.BSSymbolRef#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbol</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSSymbolRef#getSymbol()
   * @see #getBSSymbolRef()
   * @generated
   */
  EReference getBSSymbolRef_Symbol();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.blorquescript.blorqueScript.BSSymbolRef#isMethodinvocation <em>Methodinvocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Methodinvocation</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSSymbolRef#isMethodinvocation()
   * @see #getBSSymbolRef()
   * @generated
   */
  EAttribute getBSSymbolRef_Methodinvocation();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.blorquescript.blorqueScript.BSSymbolRef#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSSymbolRef#getArgs()
   * @see #getBSSymbolRef()
   * @generated
   */
  EReference getBSSymbolRef_Args();

  /**
   * Returns the meta object for class '{@link org.xtext.example.blorquescript.blorqueScript.BSNew <em>BS New</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS New</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSNew
   * @generated
   */
  EClass getBSNew();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.blorquescript.blorqueScript.BSNew#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSNew#getType()
   * @see #getBSNew()
   * @generated
   */
  EReference getBSNew_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.blorquescript.blorqueScript.BSNew#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.xtext.example.blorquescript.blorqueScript.BSNew#getArgs()
   * @see #getBSNew()
   * @generated
   */
  EReference getBSNew_Args();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BlorqueScriptFactory getBlorqueScriptFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSFileImpl <em>BS File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSFileImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSFile()
     * @generated
     */
    EClass BS_FILE = eINSTANCE.getBSFile();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_FILE__NAME = eINSTANCE.getBSFile_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_FILE__IMPORTS = eINSTANCE.getBSFile_Imports();

    /**
     * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_FILE__CLASSES = eINSTANCE.getBSFile_Classes();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSImportImpl <em>BS Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSImportImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSImport()
     * @generated
     */
    EClass BS_IMPORT = eINSTANCE.getBSImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getBSImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSClassImpl <em>BS Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSClassImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSClass()
     * @generated
     */
    EClass BS_CLASS = eINSTANCE.getBSClass();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_CLASS__NAME = eINSTANCE.getBSClass_Name();

    /**
     * The meta object literal for the '<em><b>Superclass</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_CLASS__SUPERCLASS = eINSTANCE.getBSClass_Superclass();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_CLASS__MEMBERS = eINSTANCE.getBSClass_Members();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSMemberImpl <em>BS Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSMemberImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMember()
     * @generated
     */
    EClass BS_MEMBER = eINSTANCE.getBSMember();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSFieldImpl <em>BS Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSFieldImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSField()
     * @generated
     */
    EClass BS_FIELD = eINSTANCE.getBSField();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSMethodImpl <em>BS Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSMethodImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMethod()
     * @generated
     */
    EClass BS_METHOD = eINSTANCE.getBSMethod();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_METHOD__PARAMS = eINSTANCE.getBSMethod_Params();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_METHOD__BODY = eINSTANCE.getBSMethod_Body();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSParameterImpl <em>BS Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSParameterImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSParameter()
     * @generated
     */
    EClass BS_PARAMETER = eINSTANCE.getBSParameter();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSMethodBodyImpl <em>BS Method Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSMethodBodyImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMethodBody()
     * @generated
     */
    EClass BS_METHOD_BODY = eINSTANCE.getBSMethodBody();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSStatementImpl <em>BS Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSStatementImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSStatement()
     * @generated
     */
    EClass BS_STATEMENT = eINSTANCE.getBSStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSReturnImpl <em>BS Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSReturnImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSReturn()
     * @generated
     */
    EClass BS_RETURN = eINSTANCE.getBSReturn();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_RETURN__EXPRESSION = eINSTANCE.getBSReturn_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSVariableDeclarationImpl <em>BS Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSVariableDeclarationImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSVariableDeclaration()
     * @generated
     */
    EClass BS_VARIABLE_DECLARATION = eINSTANCE.getBSVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_VARIABLE_DECLARATION__EXPRESSION = eINSTANCE.getBSVariableDeclaration_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSIfStatementImpl <em>BS If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSIfStatementImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSIfStatement()
     * @generated
     */
    EClass BS_IF_STATEMENT = eINSTANCE.getBSIfStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_IF_STATEMENT__EXPRESSION = eINSTANCE.getBSIfStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Then Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_IF_STATEMENT__THEN_BLOCK = eINSTANCE.getBSIfStatement_ThenBlock();

    /**
     * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_IF_STATEMENT__ELSE_BLOCK = eINSTANCE.getBSIfStatement_ElseBlock();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSIfBlockImpl <em>BS If Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSIfBlockImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSIfBlock()
     * @generated
     */
    EClass BS_IF_BLOCK = eINSTANCE.getBSIfBlock();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSBlockImpl <em>BS Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSBlockImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBlock()
     * @generated
     */
    EClass BS_BLOCK = eINSTANCE.getBSBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BLOCK__STATEMENTS = eINSTANCE.getBSBlock_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSSymbolImpl <em>BS Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSSymbolImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSSymbol()
     * @generated
     */
    EClass BS_SYMBOL = eINSTANCE.getBSSymbol();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_SYMBOL__TYPE = eINSTANCE.getBSSymbol_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_SYMBOL__NAME = eINSTANCE.getBSSymbol_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSExpressionImpl <em>BS Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSExpressionImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSExpression()
     * @generated
     */
    EClass BS_EXPRESSION = eINSTANCE.getBSExpression();

    /**
     * The meta object literal for the '<em><b>Cast Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_EXPRESSION__CAST_TYPE = eINSTANCE.getBSExpression_CastType();

    /**
     * The meta object literal for the '<em><b>Cast Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_EXPRESSION__CAST_EXPR = eINSTANCE.getBSExpression_CastExpr();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSAssignmentImpl <em>BS Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSAssignmentImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSAssignment()
     * @generated
     */
    EClass BS_ASSIGNMENT = eINSTANCE.getBSAssignment();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_ASSIGNMENT__LEFT = eINSTANCE.getBSAssignment_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_ASSIGNMENT__RIGHT = eINSTANCE.getBSAssignment_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSMemberSelectionImpl <em>BS Member Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSMemberSelectionImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMemberSelection()
     * @generated
     */
    EClass BS_MEMBER_SELECTION = eINSTANCE.getBSMemberSelection();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_MEMBER_SELECTION__RECEIVER = eINSTANCE.getBSMemberSelection_Receiver();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_MEMBER_SELECTION__MEMBER = eINSTANCE.getBSMemberSelection_Member();

    /**
     * The meta object literal for the '<em><b>Methodinvocation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_MEMBER_SELECTION__METHODINVOCATION = eINSTANCE.getBSMemberSelection_Methodinvocation();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_MEMBER_SELECTION__ARGS = eINSTANCE.getBSMemberSelection_Args();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSStringConstantImpl <em>BS String Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSStringConstantImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSStringConstant()
     * @generated
     */
    EClass BS_STRING_CONSTANT = eINSTANCE.getBSStringConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_STRING_CONSTANT__VALUE = eINSTANCE.getBSStringConstant_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSNumberConstantImpl <em>BS Number Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSNumberConstantImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSNumberConstant()
     * @generated
     */
    EClass BS_NUMBER_CONSTANT = eINSTANCE.getBSNumberConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_NUMBER_CONSTANT__VALUE = eINSTANCE.getBSNumberConstant_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSBooleanConstantImpl <em>BS Boolean Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSBooleanConstantImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBooleanConstant()
     * @generated
     */
    EClass BS_BOOLEAN_CONSTANT = eINSTANCE.getBSBooleanConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_BOOLEAN_CONSTANT__VALUE = eINSTANCE.getBSBooleanConstant_Value();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSNullImpl <em>BS Null</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSNullImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSNull()
     * @generated
     */
    EClass BS_NULL = eINSTANCE.getBSNull();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSThisImpl <em>BS This</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSThisImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSThis()
     * @generated
     */
    EClass BS_THIS = eINSTANCE.getBSThis();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSClientImpl <em>BS Client</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSClientImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSClient()
     * @generated
     */
    EClass BS_CLIENT = eINSTANCE.getBSClient();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSSymbolRefImpl <em>BS Symbol Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSSymbolRefImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSSymbolRef()
     * @generated
     */
    EClass BS_SYMBOL_REF = eINSTANCE.getBSSymbolRef();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_SYMBOL_REF__SYMBOL = eINSTANCE.getBSSymbolRef_Symbol();

    /**
     * The meta object literal for the '<em><b>Methodinvocation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_SYMBOL_REF__METHODINVOCATION = eINSTANCE.getBSSymbolRef_Methodinvocation();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_SYMBOL_REF__ARGS = eINSTANCE.getBSSymbolRef_Args();

    /**
     * The meta object literal for the '{@link org.xtext.example.blorquescript.blorqueScript.impl.BSNewImpl <em>BS New</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BSNewImpl
     * @see org.xtext.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSNew()
     * @generated
     */
    EClass BS_NEW = eINSTANCE.getBSNew();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_NEW__TYPE = eINSTANCE.getBSNew_Type();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_NEW__ARGS = eINSTANCE.getBSNew_Args();

  }

} //BlorqueScriptPackage
