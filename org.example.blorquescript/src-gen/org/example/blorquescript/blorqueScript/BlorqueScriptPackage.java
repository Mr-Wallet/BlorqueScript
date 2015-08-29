/**
 */
package org.example.blorquescript.blorqueScript;

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
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptFactory
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
  BlorqueScriptPackage eINSTANCE = org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl.init();

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSFileImpl <em>BS File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSFileImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSFile()
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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSImportImpl <em>BS Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSImportImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSImport()
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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSClassImpl <em>BS Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSClassImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSClass()
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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSSymbolImpl <em>BS Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSSymbolImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSSymbol()
   * @generated
   */
  int BS_SYMBOL = 21;

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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSMemberImpl <em>BS Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSMemberImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMember()
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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSFieldImpl <em>BS Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSFieldImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSField()
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
   * The feature id for the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FIELD__IS_ARRAY = BS_MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FIELD_FEATURE_COUNT = BS_MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSMethodImpl <em>BS Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSMethodImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMethod()
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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSParameterImpl <em>BS Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSParameterImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSParameter()
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
   * The feature id for the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_PARAMETER__IS_ARRAY = BS_SYMBOL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_PARAMETER_FEATURE_COUNT = BS_SYMBOL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSBlockImpl <em>BS Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSBlockImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBlock()
   * @generated
   */
  int BS_BLOCK = 20;

  /**
   * The number of structural features of the '<em>BS Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BLOCK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSMethodBodyImpl <em>BS Method Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSMethodBodyImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMethodBody()
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
  int BS_METHOD_BODY__STATEMENTS = BS_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Method Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_METHOD_BODY_FEATURE_COUNT = BS_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSStatementImpl <em>BS Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSStatementImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSStatement()
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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSReturnImpl <em>BS Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSReturnImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSReturn()
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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSVariableDeclarationImpl <em>BS Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSVariableDeclarationImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSVariableDeclaration()
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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSIfStatementImpl <em>BS If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSIfStatementImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSIfStatement()
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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSWhileLoopImpl <em>BS While Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSWhileLoopImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSWhileLoop()
   * @generated
   */
  int BS_WHILE_LOOP = 12;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_WHILE_LOOP__EXPRESSION = BS_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_WHILE_LOOP__BLOCK = BS_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS While Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_WHILE_LOOP_FEATURE_COUNT = BS_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSForLoopImpl <em>BS For Loop</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSForLoopImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSForLoop()
   * @generated
   */
  int BS_FOR_LOOP = 13;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FOR_LOOP__LEFT = BS_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Middle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FOR_LOOP__MIDDLE = BS_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FOR_LOOP__RIGHT = BS_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FOR_LOOP__BLOCK = BS_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>BS For Loop</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_FOR_LOOP_FEATURE_COUNT = BS_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSSwitchStatementImpl <em>BS Switch Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSSwitchStatementImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSSwitchStatement()
   * @generated
   */
  int BS_SWITCH_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>String Switch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SWITCH_STATEMENT__STRING_SWITCH = BS_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SWITCH_STATEMENT__EXPRESSION = BS_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SWITCH_STATEMENT__BLOCK = BS_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BS Switch Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SWITCH_STATEMENT_FEATURE_COUNT = BS_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSIfBlockImpl <em>BS If Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSIfBlockImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSIfBlock()
   * @generated
   */
  int BS_IF_BLOCK = 15;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_IF_BLOCK__STATEMENTS = BS_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS If Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_IF_BLOCK_FEATURE_COUNT = BS_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSLoopBlockImpl <em>BS Loop Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSLoopBlockImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSLoopBlock()
   * @generated
   */
  int BS_LOOP_BLOCK = 16;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_LOOP_BLOCK__STATEMENTS = BS_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Loop Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_LOOP_BLOCK_FEATURE_COUNT = BS_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSSwitchBlockImpl <em>BS Switch Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSSwitchBlockImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSSwitchBlock()
   * @generated
   */
  int BS_SWITCH_BLOCK = 17;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SWITCH_BLOCK__CASES = BS_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Switch Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SWITCH_BLOCK_FEATURE_COUNT = BS_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSCaseImpl <em>BS Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSCaseImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSCase()
   * @generated
   */
  int BS_CASE = 18;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CASE__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CASE__BLOCK = 1;

  /**
   * The number of structural features of the '<em>BS Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSCaseBlockImpl <em>BS Case Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSCaseBlockImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSCaseBlock()
   * @generated
   */
  int BS_CASE_BLOCK = 19;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CASE_BLOCK__STATEMENTS = BS_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Case Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CASE_BLOCK_FEATURE_COUNT = BS_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSExpressionImpl <em>BS Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSExpression()
   * @generated
   */
  int BS_EXPRESSION = 22;

  /**
   * The number of structural features of the '<em>BS Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_EXPRESSION_FEATURE_COUNT = BS_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSAssignmentExpressionImpl <em>BS Assignment Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSAssignmentExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSAssignmentExpression()
   * @generated
   */
  int BS_ASSIGNMENT_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ASSIGNMENT_EXPRESSION__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assignment Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ASSIGNMENT_EXPRESSION__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BS Assignment Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSTernaryExpressionImpl <em>BS Ternary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSTernaryExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSTernaryExpression()
   * @generated
   */
  int BS_TERNARY_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_TERNARY_EXPRESSION__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Middle</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_TERNARY_EXPRESSION__MIDDLE = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_TERNARY_EXPRESSION__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BS Ternary Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_TERNARY_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSBooleanOrExpressionImpl <em>BS Boolean Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSBooleanOrExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBooleanOrExpression()
   * @generated
   */
  int BS_BOOLEAN_OR_EXPRESSION = 25;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BOOLEAN_OR_EXPRESSION__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BOOLEAN_OR_EXPRESSION__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Boolean Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BOOLEAN_OR_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSBooleanAndExpressionImpl <em>BS Boolean And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSBooleanAndExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBooleanAndExpression()
   * @generated
   */
  int BS_BOOLEAN_AND_EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BOOLEAN_AND_EXPRESSION__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BOOLEAN_AND_EXPRESSION__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Boolean And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BOOLEAN_AND_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSBitwiseOrExpressionImpl <em>BS Bitwise Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSBitwiseOrExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBitwiseOrExpression()
   * @generated
   */
  int BS_BITWISE_OR_EXPRESSION = 27;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_OR_EXPRESSION__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_OR_EXPRESSION__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Bitwise Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_OR_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSBitwiseXorExpressionImpl <em>BS Bitwise Xor Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSBitwiseXorExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBitwiseXorExpression()
   * @generated
   */
  int BS_BITWISE_XOR_EXPRESSION = 28;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_XOR_EXPRESSION__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_XOR_EXPRESSION__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Bitwise Xor Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_XOR_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSBitwiseAndExpressionImpl <em>BS Bitwise And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSBitwiseAndExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBitwiseAndExpression()
   * @generated
   */
  int BS_BITWISE_AND_EXPRESSION = 29;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_AND_EXPRESSION__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_AND_EXPRESSION__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Bitwise And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_AND_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSEqualityExpressionImpl <em>BS Equality Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSEqualityExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSEqualityExpression()
   * @generated
   */
  int BS_EQUALITY_EXPRESSION = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_EQUALITY_EXPRESSION__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_EQUALITY_EXPRESSION__OPERATOR = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_EQUALITY_EXPRESSION__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BS Equality Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_EQUALITY_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSOrderedRelationExpressionImpl <em>BS Ordered Relation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSOrderedRelationExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSOrderedRelationExpression()
   * @generated
   */
  int BS_ORDERED_RELATION_EXPRESSION = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ORDERED_RELATION_EXPRESSION__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ORDERED_RELATION_EXPRESSION__OPERATOR = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ORDERED_RELATION_EXPRESSION__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BS Ordered Relation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ORDERED_RELATION_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSBitwiseShiftExpressionImpl <em>BS Bitwise Shift Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSBitwiseShiftExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBitwiseShiftExpression()
   * @generated
   */
  int BS_BITWISE_SHIFT_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_SHIFT_EXPRESSION__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_SHIFT_EXPRESSION__OPERATOR = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_SHIFT_EXPRESSION__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BS Bitwise Shift Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BITWISE_SHIFT_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSPlusMinusOrStringConcatExpressionImpl <em>BS Plus Minus Or String Concat Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSPlusMinusOrStringConcatExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSPlusMinusOrStringConcatExpression()
   * @generated
   */
  int BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION = 33;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION__OPERATOR = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BS Plus Minus Or String Concat Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSMulDivOrModExpressionImpl <em>BS Mul Div Or Mod Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSMulDivOrModExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMulDivOrModExpression()
   * @generated
   */
  int BS_MUL_DIV_OR_MOD_EXPRESSION = 34;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MUL_DIV_OR_MOD_EXPRESSION__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MUL_DIV_OR_MOD_EXPRESSION__OPERATOR = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MUL_DIV_OR_MOD_EXPRESSION__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BS Mul Div Or Mod Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MUL_DIV_OR_MOD_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSCastExpressionImpl <em>BS Cast Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSCastExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSCastExpression()
   * @generated
   */
  int BS_CAST_EXPRESSION = 35;

  /**
   * The feature id for the '<em><b>Cast Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CAST_EXPRESSION__CAST_TYPE = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cast Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CAST_EXPRESSION__CAST_EXPR = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Cast Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CAST_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSNewExpressionImpl <em>BS New Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSNewExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSNewExpression()
   * @generated
   */
  int BS_NEW_EXPRESSION = 36;

  /**
   * The feature id for the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NEW_EXPRESSION__IS_ARRAY = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NEW_EXPRESSION__TYPE = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NEW_EXPRESSION__ARGS = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>BS New Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NEW_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSUnaryModifierExpressionImpl <em>BS Unary Modifier Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSUnaryModifierExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSUnaryModifierExpression()
   * @generated
   */
  int BS_UNARY_MODIFIER_EXPRESSION = 37;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_UNARY_MODIFIER_EXPRESSION__OPERATOR = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_UNARY_MODIFIER_EXPRESSION__RECEIVER = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Unary Modifier Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_UNARY_MODIFIER_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSMemberSelectionExpressionImpl <em>BS Member Selection Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSMemberSelectionExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMemberSelectionExpression()
   * @generated
   */
  int BS_MEMBER_SELECTION_EXPRESSION = 38;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MEMBER_SELECTION_EXPRESSION__RECEIVER = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Member Selection Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_MEMBER_SELECTION_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSMethodInvokationExpressionImpl <em>BS Method Invokation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSMethodInvokationExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMethodInvokationExpression()
   * @generated
   */
  int BS_METHOD_INVOKATION_EXPRESSION = 39;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_METHOD_INVOKATION_EXPRESSION__RECEIVER = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_METHOD_INVOKATION_EXPRESSION__ARGS = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Method Invokation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_METHOD_INVOKATION_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSArrayAccessExpressionImpl <em>BS Array Access Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSArrayAccessExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSArrayAccessExpression()
   * @generated
   */
  int BS_ARRAY_ACCESS_EXPRESSION = 40;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ARRAY_ACCESS_EXPRESSION__RECEIVER = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ARRAY_ACCESS_EXPRESSION__ARGS = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Array Access Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_ARRAY_ACCESS_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSPostfixArithmeticExpressionImpl <em>BS Postfix Arithmetic Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSPostfixArithmeticExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSPostfixArithmeticExpression()
   * @generated
   */
  int BS_POSTFIX_ARITHMETIC_EXPRESSION = 41;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_POSTFIX_ARITHMETIC_EXPRESSION__RECEIVER = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_POSTFIX_ARITHMETIC_EXPRESSION__OPERATOR = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Postfix Arithmetic Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_POSTFIX_ARITHMETIC_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSStringConstantImpl <em>BS String Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSStringConstantImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSStringConstant()
   * @generated
   */
  int BS_STRING_CONSTANT = 42;

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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSHexadecimalConstantImpl <em>BS Hexadecimal Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSHexadecimalConstantImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSHexadecimalConstant()
   * @generated
   */
  int BS_HEXADECIMAL_CONSTANT = 43;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_HEXADECIMAL_CONSTANT__VALUE = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Hexadecimal Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_HEXADECIMAL_CONSTANT_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSNumberConstantImpl <em>BS Number Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSNumberConstantImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSNumberConstant()
   * @generated
   */
  int BS_NUMBER_CONSTANT = 44;

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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSRealConstantImpl <em>BS Real Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSRealConstantImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSRealConstant()
   * @generated
   */
  int BS_REAL_CONSTANT = 45;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_REAL_CONSTANT__LEFT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_REAL_CONSTANT__RIGHT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>BS Real Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_REAL_CONSTANT_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSBooleanConstantImpl <em>BS Boolean Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSBooleanConstantImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBooleanConstant()
   * @generated
   */
  int BS_BOOLEAN_CONSTANT = 46;

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
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSNullLiteralImpl <em>BS Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSNullLiteralImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSNullLiteral()
   * @generated
   */
  int BS_NULL_LITERAL = 47;

  /**
   * The number of structural features of the '<em>BS Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_NULL_LITERAL_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSBreakLiteralImpl <em>BS Break Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSBreakLiteralImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBreakLiteral()
   * @generated
   */
  int BS_BREAK_LITERAL = 48;

  /**
   * The number of structural features of the '<em>BS Break Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_BREAK_LITERAL_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSContinueLiteralImpl <em>BS Continue Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSContinueLiteralImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSContinueLiteral()
   * @generated
   */
  int BS_CONTINUE_LITERAL = 49;

  /**
   * The number of structural features of the '<em>BS Continue Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CONTINUE_LITERAL_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSThisLiteralImpl <em>BS This Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSThisLiteralImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSThisLiteral()
   * @generated
   */
  int BS_THIS_LITERAL = 50;

  /**
   * The number of structural features of the '<em>BS This Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_THIS_LITERAL_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSClientLiteralImpl <em>BS Client Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSClientLiteralImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSClientLiteral()
   * @generated
   */
  int BS_CLIENT_LITERAL = 51;

  /**
   * The number of structural features of the '<em>BS Client Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_CLIENT_LITERAL_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSParentLiteralImpl <em>BS Parent Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSParentLiteralImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSParentLiteral()
   * @generated
   */
  int BS_PARENT_LITERAL = 52;

  /**
   * The number of structural features of the '<em>BS Parent Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_PARENT_LITERAL_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSSymbolRefImpl <em>BS Symbol Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSSymbolRefImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSSymbolRef()
   * @generated
   */
  int BS_SYMBOL_REF = 53;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SYMBOL_REF__SYMBOL = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Symbol Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_SYMBOL_REF_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.example.blorquescript.blorqueScript.impl.BSParentheticalExpressionImpl <em>BS Parenthetical Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.example.blorquescript.blorqueScript.impl.BSParentheticalExpressionImpl
   * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSParentheticalExpression()
   * @generated
   */
  int BS_PARENTHETICAL_EXPRESSION = 54;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_PARENTHETICAL_EXPRESSION__EXPRESSION = BS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>BS Parenthetical Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BS_PARENTHETICAL_EXPRESSION_FEATURE_COUNT = BS_EXPRESSION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSFile <em>BS File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS File</em>'.
   * @see org.example.blorquescript.blorqueScript.BSFile
   * @generated
   */
  EClass getBSFile();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.blorquescript.blorqueScript.BSFile#getName()
   * @see #getBSFile()
   * @generated
   */
  EAttribute getBSFile_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.blorquescript.blorqueScript.BSFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.example.blorquescript.blorqueScript.BSFile#getImports()
   * @see #getBSFile()
   * @generated
   */
  EReference getBSFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.blorquescript.blorqueScript.BSFile#getClasses <em>Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classes</em>'.
   * @see org.example.blorquescript.blorqueScript.BSFile#getClasses()
   * @see #getBSFile()
   * @generated
   */
  EReference getBSFile_Classes();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSImport <em>BS Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Import</em>'.
   * @see org.example.blorquescript.blorqueScript.BSImport
   * @generated
   */
  EClass getBSImport();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSImport#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.example.blorquescript.blorqueScript.BSImport#getImportedNamespace()
   * @see #getBSImport()
   * @generated
   */
  EAttribute getBSImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSClass <em>BS Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Class</em>'.
   * @see org.example.blorquescript.blorqueScript.BSClass
   * @generated
   */
  EClass getBSClass();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSClass#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.blorquescript.blorqueScript.BSClass#getName()
   * @see #getBSClass()
   * @generated
   */
  EAttribute getBSClass_Name();

  /**
   * Returns the meta object for the reference '{@link org.example.blorquescript.blorqueScript.BSClass#getSuperclass <em>Superclass</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Superclass</em>'.
   * @see org.example.blorquescript.blorqueScript.BSClass#getSuperclass()
   * @see #getBSClass()
   * @generated
   */
  EReference getBSClass_Superclass();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.blorquescript.blorqueScript.BSClass#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see org.example.blorquescript.blorqueScript.BSClass#getMembers()
   * @see #getBSClass()
   * @generated
   */
  EReference getBSClass_Members();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSMember <em>BS Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Member</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMember
   * @generated
   */
  EClass getBSMember();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSField <em>BS Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Field</em>'.
   * @see org.example.blorquescript.blorqueScript.BSField
   * @generated
   */
  EClass getBSField();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSField#isIsArray <em>Is Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Array</em>'.
   * @see org.example.blorquescript.blorqueScript.BSField#isIsArray()
   * @see #getBSField()
   * @generated
   */
  EAttribute getBSField_IsArray();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSMethod <em>BS Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Method</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMethod
   * @generated
   */
  EClass getBSMethod();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.blorquescript.blorqueScript.BSMethod#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMethod#getParams()
   * @see #getBSMethod()
   * @generated
   */
  EReference getBSMethod_Params();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSMethod#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMethod#getBody()
   * @see #getBSMethod()
   * @generated
   */
  EReference getBSMethod_Body();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSParameter <em>BS Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Parameter</em>'.
   * @see org.example.blorquescript.blorqueScript.BSParameter
   * @generated
   */
  EClass getBSParameter();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSParameter#isIsArray <em>Is Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Array</em>'.
   * @see org.example.blorquescript.blorqueScript.BSParameter#isIsArray()
   * @see #getBSParameter()
   * @generated
   */
  EAttribute getBSParameter_IsArray();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSMethodBody <em>BS Method Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Method Body</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMethodBody
   * @generated
   */
  EClass getBSMethodBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.blorquescript.blorqueScript.BSMethodBody#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMethodBody#getStatements()
   * @see #getBSMethodBody()
   * @generated
   */
  EReference getBSMethodBody_Statements();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSStatement <em>BS Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Statement</em>'.
   * @see org.example.blorquescript.blorqueScript.BSStatement
   * @generated
   */
  EClass getBSStatement();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSReturn <em>BS Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Return</em>'.
   * @see org.example.blorquescript.blorqueScript.BSReturn
   * @generated
   */
  EClass getBSReturn();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSReturn#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSReturn#getExpression()
   * @see #getBSReturn()
   * @generated
   */
  EReference getBSReturn_Expression();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSVariableDeclaration <em>BS Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Variable Declaration</em>'.
   * @see org.example.blorquescript.blorqueScript.BSVariableDeclaration
   * @generated
   */
  EClass getBSVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSVariableDeclaration#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSVariableDeclaration#getExpression()
   * @see #getBSVariableDeclaration()
   * @generated
   */
  EReference getBSVariableDeclaration_Expression();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSIfStatement <em>BS If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS If Statement</em>'.
   * @see org.example.blorquescript.blorqueScript.BSIfStatement
   * @generated
   */
  EClass getBSIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSIfStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSIfStatement#getExpression()
   * @see #getBSIfStatement()
   * @generated
   */
  EReference getBSIfStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSIfStatement#getThenBlock <em>Then Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Block</em>'.
   * @see org.example.blorquescript.blorqueScript.BSIfStatement#getThenBlock()
   * @see #getBSIfStatement()
   * @generated
   */
  EReference getBSIfStatement_ThenBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSIfStatement#getElseBlock <em>Else Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Block</em>'.
   * @see org.example.blorquescript.blorqueScript.BSIfStatement#getElseBlock()
   * @see #getBSIfStatement()
   * @generated
   */
  EReference getBSIfStatement_ElseBlock();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSWhileLoop <em>BS While Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS While Loop</em>'.
   * @see org.example.blorquescript.blorqueScript.BSWhileLoop
   * @generated
   */
  EClass getBSWhileLoop();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSWhileLoop#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSWhileLoop#getExpression()
   * @see #getBSWhileLoop()
   * @generated
   */
  EReference getBSWhileLoop_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSWhileLoop#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.example.blorquescript.blorqueScript.BSWhileLoop#getBlock()
   * @see #getBSWhileLoop()
   * @generated
   */
  EReference getBSWhileLoop_Block();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSForLoop <em>BS For Loop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS For Loop</em>'.
   * @see org.example.blorquescript.blorqueScript.BSForLoop
   * @generated
   */
  EClass getBSForLoop();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSForLoop#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSForLoop#getLeft()
   * @see #getBSForLoop()
   * @generated
   */
  EReference getBSForLoop_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSForLoop#getMiddle <em>Middle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Middle</em>'.
   * @see org.example.blorquescript.blorqueScript.BSForLoop#getMiddle()
   * @see #getBSForLoop()
   * @generated
   */
  EReference getBSForLoop_Middle();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSForLoop#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSForLoop#getRight()
   * @see #getBSForLoop()
   * @generated
   */
  EReference getBSForLoop_Right();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSForLoop#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.example.blorquescript.blorqueScript.BSForLoop#getBlock()
   * @see #getBSForLoop()
   * @generated
   */
  EReference getBSForLoop_Block();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSSwitchStatement <em>BS Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Switch Statement</em>'.
   * @see org.example.blorquescript.blorqueScript.BSSwitchStatement
   * @generated
   */
  EClass getBSSwitchStatement();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSSwitchStatement#isStringSwitch <em>String Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Switch</em>'.
   * @see org.example.blorquescript.blorqueScript.BSSwitchStatement#isStringSwitch()
   * @see #getBSSwitchStatement()
   * @generated
   */
  EAttribute getBSSwitchStatement_StringSwitch();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSSwitchStatement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSSwitchStatement#getExpression()
   * @see #getBSSwitchStatement()
   * @generated
   */
  EReference getBSSwitchStatement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSSwitchStatement#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.example.blorquescript.blorqueScript.BSSwitchStatement#getBlock()
   * @see #getBSSwitchStatement()
   * @generated
   */
  EReference getBSSwitchStatement_Block();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSIfBlock <em>BS If Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS If Block</em>'.
   * @see org.example.blorquescript.blorqueScript.BSIfBlock
   * @generated
   */
  EClass getBSIfBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.blorquescript.blorqueScript.BSIfBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.example.blorquescript.blorqueScript.BSIfBlock#getStatements()
   * @see #getBSIfBlock()
   * @generated
   */
  EReference getBSIfBlock_Statements();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSLoopBlock <em>BS Loop Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Loop Block</em>'.
   * @see org.example.blorquescript.blorqueScript.BSLoopBlock
   * @generated
   */
  EClass getBSLoopBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.blorquescript.blorqueScript.BSLoopBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.example.blorquescript.blorqueScript.BSLoopBlock#getStatements()
   * @see #getBSLoopBlock()
   * @generated
   */
  EReference getBSLoopBlock_Statements();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSSwitchBlock <em>BS Switch Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Switch Block</em>'.
   * @see org.example.blorquescript.blorqueScript.BSSwitchBlock
   * @generated
   */
  EClass getBSSwitchBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.blorquescript.blorqueScript.BSSwitchBlock#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see org.example.blorquescript.blorqueScript.BSSwitchBlock#getCases()
   * @see #getBSSwitchBlock()
   * @generated
   */
  EReference getBSSwitchBlock_Cases();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSCase <em>BS Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Case</em>'.
   * @see org.example.blorquescript.blorqueScript.BSCase
   * @generated
   */
  EClass getBSCase();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSCase#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSCase#getExpression()
   * @see #getBSCase()
   * @generated
   */
  EReference getBSCase_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSCase#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see org.example.blorquescript.blorqueScript.BSCase#getBlock()
   * @see #getBSCase()
   * @generated
   */
  EReference getBSCase_Block();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSCaseBlock <em>BS Case Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Case Block</em>'.
   * @see org.example.blorquescript.blorqueScript.BSCaseBlock
   * @generated
   */
  EClass getBSCaseBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.blorquescript.blorqueScript.BSCaseBlock#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.example.blorquescript.blorqueScript.BSCaseBlock#getStatements()
   * @see #getBSCaseBlock()
   * @generated
   */
  EReference getBSCaseBlock_Statements();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSBlock <em>BS Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Block</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBlock
   * @generated
   */
  EClass getBSBlock();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSSymbol <em>BS Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Symbol</em>'.
   * @see org.example.blorquescript.blorqueScript.BSSymbol
   * @generated
   */
  EClass getBSSymbol();

  /**
   * Returns the meta object for the reference '{@link org.example.blorquescript.blorqueScript.BSSymbol#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.example.blorquescript.blorqueScript.BSSymbol#getType()
   * @see #getBSSymbol()
   * @generated
   */
  EReference getBSSymbol_Type();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSSymbol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.example.blorquescript.blorqueScript.BSSymbol#getName()
   * @see #getBSSymbol()
   * @generated
   */
  EAttribute getBSSymbol_Name();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSExpression <em>BS Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSExpression
   * @generated
   */
  EClass getBSExpression();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSAssignmentExpression <em>BS Assignment Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Assignment Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSAssignmentExpression
   * @generated
   */
  EClass getBSAssignmentExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSAssignmentExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSAssignmentExpression#getLeft()
   * @see #getBSAssignmentExpression()
   * @generated
   */
  EReference getBSAssignmentExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSAssignmentExpression#getAssignmentOperator <em>Assignment Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assignment Operator</em>'.
   * @see org.example.blorquescript.blorqueScript.BSAssignmentExpression#getAssignmentOperator()
   * @see #getBSAssignmentExpression()
   * @generated
   */
  EAttribute getBSAssignmentExpression_AssignmentOperator();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSAssignmentExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSAssignmentExpression#getRight()
   * @see #getBSAssignmentExpression()
   * @generated
   */
  EReference getBSAssignmentExpression_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSTernaryExpression <em>BS Ternary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Ternary Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSTernaryExpression
   * @generated
   */
  EClass getBSTernaryExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSTernaryExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSTernaryExpression#getLeft()
   * @see #getBSTernaryExpression()
   * @generated
   */
  EReference getBSTernaryExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSTernaryExpression#getMiddle <em>Middle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Middle</em>'.
   * @see org.example.blorquescript.blorqueScript.BSTernaryExpression#getMiddle()
   * @see #getBSTernaryExpression()
   * @generated
   */
  EReference getBSTernaryExpression_Middle();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSTernaryExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSTernaryExpression#getRight()
   * @see #getBSTernaryExpression()
   * @generated
   */
  EReference getBSTernaryExpression_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSBooleanOrExpression <em>BS Boolean Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Boolean Or Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBooleanOrExpression
   * @generated
   */
  EClass getBSBooleanOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSBooleanOrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBooleanOrExpression#getLeft()
   * @see #getBSBooleanOrExpression()
   * @generated
   */
  EReference getBSBooleanOrExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSBooleanOrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBooleanOrExpression#getRight()
   * @see #getBSBooleanOrExpression()
   * @generated
   */
  EReference getBSBooleanOrExpression_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSBooleanAndExpression <em>BS Boolean And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Boolean And Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBooleanAndExpression
   * @generated
   */
  EClass getBSBooleanAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSBooleanAndExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBooleanAndExpression#getLeft()
   * @see #getBSBooleanAndExpression()
   * @generated
   */
  EReference getBSBooleanAndExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSBooleanAndExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBooleanAndExpression#getRight()
   * @see #getBSBooleanAndExpression()
   * @generated
   */
  EReference getBSBooleanAndExpression_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSBitwiseOrExpression <em>BS Bitwise Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Bitwise Or Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseOrExpression
   * @generated
   */
  EClass getBSBitwiseOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSBitwiseOrExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseOrExpression#getLeft()
   * @see #getBSBitwiseOrExpression()
   * @generated
   */
  EReference getBSBitwiseOrExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSBitwiseOrExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseOrExpression#getRight()
   * @see #getBSBitwiseOrExpression()
   * @generated
   */
  EReference getBSBitwiseOrExpression_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSBitwiseXorExpression <em>BS Bitwise Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Bitwise Xor Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseXorExpression
   * @generated
   */
  EClass getBSBitwiseXorExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSBitwiseXorExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseXorExpression#getLeft()
   * @see #getBSBitwiseXorExpression()
   * @generated
   */
  EReference getBSBitwiseXorExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSBitwiseXorExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseXorExpression#getRight()
   * @see #getBSBitwiseXorExpression()
   * @generated
   */
  EReference getBSBitwiseXorExpression_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSBitwiseAndExpression <em>BS Bitwise And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Bitwise And Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseAndExpression
   * @generated
   */
  EClass getBSBitwiseAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSBitwiseAndExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseAndExpression#getLeft()
   * @see #getBSBitwiseAndExpression()
   * @generated
   */
  EReference getBSBitwiseAndExpression_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSBitwiseAndExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseAndExpression#getRight()
   * @see #getBSBitwiseAndExpression()
   * @generated
   */
  EReference getBSBitwiseAndExpression_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSEqualityExpression <em>BS Equality Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Equality Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSEqualityExpression
   * @generated
   */
  EClass getBSEqualityExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSEqualityExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSEqualityExpression#getLeft()
   * @see #getBSEqualityExpression()
   * @generated
   */
  EReference getBSEqualityExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSEqualityExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.example.blorquescript.blorqueScript.BSEqualityExpression#getOperator()
   * @see #getBSEqualityExpression()
   * @generated
   */
  EAttribute getBSEqualityExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSEqualityExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSEqualityExpression#getRight()
   * @see #getBSEqualityExpression()
   * @generated
   */
  EReference getBSEqualityExpression_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSOrderedRelationExpression <em>BS Ordered Relation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Ordered Relation Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSOrderedRelationExpression
   * @generated
   */
  EClass getBSOrderedRelationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSOrderedRelationExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSOrderedRelationExpression#getLeft()
   * @see #getBSOrderedRelationExpression()
   * @generated
   */
  EReference getBSOrderedRelationExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSOrderedRelationExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.example.blorquescript.blorqueScript.BSOrderedRelationExpression#getOperator()
   * @see #getBSOrderedRelationExpression()
   * @generated
   */
  EAttribute getBSOrderedRelationExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSOrderedRelationExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSOrderedRelationExpression#getRight()
   * @see #getBSOrderedRelationExpression()
   * @generated
   */
  EReference getBSOrderedRelationExpression_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSBitwiseShiftExpression <em>BS Bitwise Shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Bitwise Shift Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseShiftExpression
   * @generated
   */
  EClass getBSBitwiseShiftExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSBitwiseShiftExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseShiftExpression#getLeft()
   * @see #getBSBitwiseShiftExpression()
   * @generated
   */
  EReference getBSBitwiseShiftExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSBitwiseShiftExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseShiftExpression#getOperator()
   * @see #getBSBitwiseShiftExpression()
   * @generated
   */
  EAttribute getBSBitwiseShiftExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSBitwiseShiftExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBitwiseShiftExpression#getRight()
   * @see #getBSBitwiseShiftExpression()
   * @generated
   */
  EReference getBSBitwiseShiftExpression_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSPlusMinusOrStringConcatExpression <em>BS Plus Minus Or String Concat Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Plus Minus Or String Concat Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSPlusMinusOrStringConcatExpression
   * @generated
   */
  EClass getBSPlusMinusOrStringConcatExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSPlusMinusOrStringConcatExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSPlusMinusOrStringConcatExpression#getLeft()
   * @see #getBSPlusMinusOrStringConcatExpression()
   * @generated
   */
  EReference getBSPlusMinusOrStringConcatExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSPlusMinusOrStringConcatExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.example.blorquescript.blorqueScript.BSPlusMinusOrStringConcatExpression#getOperator()
   * @see #getBSPlusMinusOrStringConcatExpression()
   * @generated
   */
  EAttribute getBSPlusMinusOrStringConcatExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSPlusMinusOrStringConcatExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSPlusMinusOrStringConcatExpression#getRight()
   * @see #getBSPlusMinusOrStringConcatExpression()
   * @generated
   */
  EReference getBSPlusMinusOrStringConcatExpression_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSMulDivOrModExpression <em>BS Mul Div Or Mod Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Mul Div Or Mod Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMulDivOrModExpression
   * @generated
   */
  EClass getBSMulDivOrModExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSMulDivOrModExpression#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMulDivOrModExpression#getLeft()
   * @see #getBSMulDivOrModExpression()
   * @generated
   */
  EReference getBSMulDivOrModExpression_Left();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSMulDivOrModExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMulDivOrModExpression#getOperator()
   * @see #getBSMulDivOrModExpression()
   * @generated
   */
  EAttribute getBSMulDivOrModExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSMulDivOrModExpression#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMulDivOrModExpression#getRight()
   * @see #getBSMulDivOrModExpression()
   * @generated
   */
  EReference getBSMulDivOrModExpression_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSCastExpression <em>BS Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Cast Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSCastExpression
   * @generated
   */
  EClass getBSCastExpression();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSCastExpression#getCastType <em>Cast Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cast Type</em>'.
   * @see org.example.blorquescript.blorqueScript.BSCastExpression#getCastType()
   * @see #getBSCastExpression()
   * @generated
   */
  EAttribute getBSCastExpression_CastType();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSCastExpression#getCastExpr <em>Cast Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cast Expr</em>'.
   * @see org.example.blorquescript.blorqueScript.BSCastExpression#getCastExpr()
   * @see #getBSCastExpression()
   * @generated
   */
  EReference getBSCastExpression_CastExpr();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSNewExpression <em>BS New Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS New Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSNewExpression
   * @generated
   */
  EClass getBSNewExpression();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSNewExpression#isIsArray <em>Is Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Array</em>'.
   * @see org.example.blorquescript.blorqueScript.BSNewExpression#isIsArray()
   * @see #getBSNewExpression()
   * @generated
   */
  EAttribute getBSNewExpression_IsArray();

  /**
   * Returns the meta object for the reference '{@link org.example.blorquescript.blorqueScript.BSNewExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.example.blorquescript.blorqueScript.BSNewExpression#getType()
   * @see #getBSNewExpression()
   * @generated
   */
  EReference getBSNewExpression_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.blorquescript.blorqueScript.BSNewExpression#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.example.blorquescript.blorqueScript.BSNewExpression#getArgs()
   * @see #getBSNewExpression()
   * @generated
   */
  EReference getBSNewExpression_Args();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSUnaryModifierExpression <em>BS Unary Modifier Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Unary Modifier Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSUnaryModifierExpression
   * @generated
   */
  EClass getBSUnaryModifierExpression();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSUnaryModifierExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.example.blorquescript.blorqueScript.BSUnaryModifierExpression#getOperator()
   * @see #getBSUnaryModifierExpression()
   * @generated
   */
  EAttribute getBSUnaryModifierExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSUnaryModifierExpression#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receiver</em>'.
   * @see org.example.blorquescript.blorqueScript.BSUnaryModifierExpression#getReceiver()
   * @see #getBSUnaryModifierExpression()
   * @generated
   */
  EReference getBSUnaryModifierExpression_Receiver();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSMemberSelectionExpression <em>BS Member Selection Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Member Selection Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMemberSelectionExpression
   * @generated
   */
  EClass getBSMemberSelectionExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSMemberSelectionExpression#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receiver</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMemberSelectionExpression#getReceiver()
   * @see #getBSMemberSelectionExpression()
   * @generated
   */
  EReference getBSMemberSelectionExpression_Receiver();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSMethodInvokationExpression <em>BS Method Invokation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Method Invokation Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMethodInvokationExpression
   * @generated
   */
  EClass getBSMethodInvokationExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSMethodInvokationExpression#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receiver</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMethodInvokationExpression#getReceiver()
   * @see #getBSMethodInvokationExpression()
   * @generated
   */
  EReference getBSMethodInvokationExpression_Receiver();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.blorquescript.blorqueScript.BSMethodInvokationExpression#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.example.blorquescript.blorqueScript.BSMethodInvokationExpression#getArgs()
   * @see #getBSMethodInvokationExpression()
   * @generated
   */
  EReference getBSMethodInvokationExpression_Args();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSArrayAccessExpression <em>BS Array Access Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Array Access Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSArrayAccessExpression
   * @generated
   */
  EClass getBSArrayAccessExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSArrayAccessExpression#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receiver</em>'.
   * @see org.example.blorquescript.blorqueScript.BSArrayAccessExpression#getReceiver()
   * @see #getBSArrayAccessExpression()
   * @generated
   */
  EReference getBSArrayAccessExpression_Receiver();

  /**
   * Returns the meta object for the containment reference list '{@link org.example.blorquescript.blorqueScript.BSArrayAccessExpression#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see org.example.blorquescript.blorqueScript.BSArrayAccessExpression#getArgs()
   * @see #getBSArrayAccessExpression()
   * @generated
   */
  EReference getBSArrayAccessExpression_Args();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSPostfixArithmeticExpression <em>BS Postfix Arithmetic Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Postfix Arithmetic Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSPostfixArithmeticExpression
   * @generated
   */
  EClass getBSPostfixArithmeticExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSPostfixArithmeticExpression#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Receiver</em>'.
   * @see org.example.blorquescript.blorqueScript.BSPostfixArithmeticExpression#getReceiver()
   * @see #getBSPostfixArithmeticExpression()
   * @generated
   */
  EReference getBSPostfixArithmeticExpression_Receiver();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSPostfixArithmeticExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.example.blorquescript.blorqueScript.BSPostfixArithmeticExpression#getOperator()
   * @see #getBSPostfixArithmeticExpression()
   * @generated
   */
  EAttribute getBSPostfixArithmeticExpression_Operator();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSStringConstant <em>BS String Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS String Constant</em>'.
   * @see org.example.blorquescript.blorqueScript.BSStringConstant
   * @generated
   */
  EClass getBSStringConstant();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSStringConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.example.blorquescript.blorqueScript.BSStringConstant#getValue()
   * @see #getBSStringConstant()
   * @generated
   */
  EAttribute getBSStringConstant_Value();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSHexadecimalConstant <em>BS Hexadecimal Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Hexadecimal Constant</em>'.
   * @see org.example.blorquescript.blorqueScript.BSHexadecimalConstant
   * @generated
   */
  EClass getBSHexadecimalConstant();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSHexadecimalConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.example.blorquescript.blorqueScript.BSHexadecimalConstant#getValue()
   * @see #getBSHexadecimalConstant()
   * @generated
   */
  EAttribute getBSHexadecimalConstant_Value();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSNumberConstant <em>BS Number Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Number Constant</em>'.
   * @see org.example.blorquescript.blorqueScript.BSNumberConstant
   * @generated
   */
  EClass getBSNumberConstant();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSNumberConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.example.blorquescript.blorqueScript.BSNumberConstant#getValue()
   * @see #getBSNumberConstant()
   * @generated
   */
  EAttribute getBSNumberConstant_Value();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSRealConstant <em>BS Real Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Real Constant</em>'.
   * @see org.example.blorquescript.blorqueScript.BSRealConstant
   * @generated
   */
  EClass getBSRealConstant();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSRealConstant#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.example.blorquescript.blorqueScript.BSRealConstant#getLeft()
   * @see #getBSRealConstant()
   * @generated
   */
  EReference getBSRealConstant_Left();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSRealConstant#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right</em>'.
   * @see org.example.blorquescript.blorqueScript.BSRealConstant#getRight()
   * @see #getBSRealConstant()
   * @generated
   */
  EAttribute getBSRealConstant_Right();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSBooleanConstant <em>BS Boolean Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Boolean Constant</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBooleanConstant
   * @generated
   */
  EClass getBSBooleanConstant();

  /**
   * Returns the meta object for the attribute '{@link org.example.blorquescript.blorqueScript.BSBooleanConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBooleanConstant#getValue()
   * @see #getBSBooleanConstant()
   * @generated
   */
  EAttribute getBSBooleanConstant_Value();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSNullLiteral <em>BS Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Null Literal</em>'.
   * @see org.example.blorquescript.blorqueScript.BSNullLiteral
   * @generated
   */
  EClass getBSNullLiteral();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSBreakLiteral <em>BS Break Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Break Literal</em>'.
   * @see org.example.blorquescript.blorqueScript.BSBreakLiteral
   * @generated
   */
  EClass getBSBreakLiteral();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSContinueLiteral <em>BS Continue Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Continue Literal</em>'.
   * @see org.example.blorquescript.blorqueScript.BSContinueLiteral
   * @generated
   */
  EClass getBSContinueLiteral();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSThisLiteral <em>BS This Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS This Literal</em>'.
   * @see org.example.blorquescript.blorqueScript.BSThisLiteral
   * @generated
   */
  EClass getBSThisLiteral();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSClientLiteral <em>BS Client Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Client Literal</em>'.
   * @see org.example.blorquescript.blorqueScript.BSClientLiteral
   * @generated
   */
  EClass getBSClientLiteral();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSParentLiteral <em>BS Parent Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Parent Literal</em>'.
   * @see org.example.blorquescript.blorqueScript.BSParentLiteral
   * @generated
   */
  EClass getBSParentLiteral();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSSymbolRef <em>BS Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Symbol Ref</em>'.
   * @see org.example.blorquescript.blorqueScript.BSSymbolRef
   * @generated
   */
  EClass getBSSymbolRef();

  /**
   * Returns the meta object for the reference '{@link org.example.blorquescript.blorqueScript.BSSymbolRef#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbol</em>'.
   * @see org.example.blorquescript.blorqueScript.BSSymbolRef#getSymbol()
   * @see #getBSSymbolRef()
   * @generated
   */
  EReference getBSSymbolRef_Symbol();

  /**
   * Returns the meta object for class '{@link org.example.blorquescript.blorqueScript.BSParentheticalExpression <em>BS Parenthetical Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BS Parenthetical Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSParentheticalExpression
   * @generated
   */
  EClass getBSParentheticalExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.example.blorquescript.blorqueScript.BSParentheticalExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.example.blorquescript.blorqueScript.BSParentheticalExpression#getExpression()
   * @see #getBSParentheticalExpression()
   * @generated
   */
  EReference getBSParentheticalExpression_Expression();

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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSFileImpl <em>BS File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSFileImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSFile()
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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSImportImpl <em>BS Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSImportImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSImport()
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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSClassImpl <em>BS Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSClassImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSClass()
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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSMemberImpl <em>BS Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSMemberImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMember()
     * @generated
     */
    EClass BS_MEMBER = eINSTANCE.getBSMember();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSFieldImpl <em>BS Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSFieldImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSField()
     * @generated
     */
    EClass BS_FIELD = eINSTANCE.getBSField();

    /**
     * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_FIELD__IS_ARRAY = eINSTANCE.getBSField_IsArray();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSMethodImpl <em>BS Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSMethodImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMethod()
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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSParameterImpl <em>BS Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSParameterImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSParameter()
     * @generated
     */
    EClass BS_PARAMETER = eINSTANCE.getBSParameter();

    /**
     * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_PARAMETER__IS_ARRAY = eINSTANCE.getBSParameter_IsArray();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSMethodBodyImpl <em>BS Method Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSMethodBodyImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMethodBody()
     * @generated
     */
    EClass BS_METHOD_BODY = eINSTANCE.getBSMethodBody();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_METHOD_BODY__STATEMENTS = eINSTANCE.getBSMethodBody_Statements();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSStatementImpl <em>BS Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSStatementImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSStatement()
     * @generated
     */
    EClass BS_STATEMENT = eINSTANCE.getBSStatement();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSReturnImpl <em>BS Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSReturnImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSReturn()
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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSVariableDeclarationImpl <em>BS Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSVariableDeclarationImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSVariableDeclaration()
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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSIfStatementImpl <em>BS If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSIfStatementImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSIfStatement()
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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSWhileLoopImpl <em>BS While Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSWhileLoopImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSWhileLoop()
     * @generated
     */
    EClass BS_WHILE_LOOP = eINSTANCE.getBSWhileLoop();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_WHILE_LOOP__EXPRESSION = eINSTANCE.getBSWhileLoop_Expression();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_WHILE_LOOP__BLOCK = eINSTANCE.getBSWhileLoop_Block();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSForLoopImpl <em>BS For Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSForLoopImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSForLoop()
     * @generated
     */
    EClass BS_FOR_LOOP = eINSTANCE.getBSForLoop();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_FOR_LOOP__LEFT = eINSTANCE.getBSForLoop_Left();

    /**
     * The meta object literal for the '<em><b>Middle</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_FOR_LOOP__MIDDLE = eINSTANCE.getBSForLoop_Middle();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_FOR_LOOP__RIGHT = eINSTANCE.getBSForLoop_Right();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_FOR_LOOP__BLOCK = eINSTANCE.getBSForLoop_Block();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSSwitchStatementImpl <em>BS Switch Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSSwitchStatementImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSSwitchStatement()
     * @generated
     */
    EClass BS_SWITCH_STATEMENT = eINSTANCE.getBSSwitchStatement();

    /**
     * The meta object literal for the '<em><b>String Switch</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_SWITCH_STATEMENT__STRING_SWITCH = eINSTANCE.getBSSwitchStatement_StringSwitch();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_SWITCH_STATEMENT__EXPRESSION = eINSTANCE.getBSSwitchStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_SWITCH_STATEMENT__BLOCK = eINSTANCE.getBSSwitchStatement_Block();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSIfBlockImpl <em>BS If Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSIfBlockImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSIfBlock()
     * @generated
     */
    EClass BS_IF_BLOCK = eINSTANCE.getBSIfBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_IF_BLOCK__STATEMENTS = eINSTANCE.getBSIfBlock_Statements();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSLoopBlockImpl <em>BS Loop Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSLoopBlockImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSLoopBlock()
     * @generated
     */
    EClass BS_LOOP_BLOCK = eINSTANCE.getBSLoopBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_LOOP_BLOCK__STATEMENTS = eINSTANCE.getBSLoopBlock_Statements();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSSwitchBlockImpl <em>BS Switch Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSSwitchBlockImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSSwitchBlock()
     * @generated
     */
    EClass BS_SWITCH_BLOCK = eINSTANCE.getBSSwitchBlock();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_SWITCH_BLOCK__CASES = eINSTANCE.getBSSwitchBlock_Cases();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSCaseImpl <em>BS Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSCaseImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSCase()
     * @generated
     */
    EClass BS_CASE = eINSTANCE.getBSCase();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_CASE__EXPRESSION = eINSTANCE.getBSCase_Expression();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_CASE__BLOCK = eINSTANCE.getBSCase_Block();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSCaseBlockImpl <em>BS Case Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSCaseBlockImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSCaseBlock()
     * @generated
     */
    EClass BS_CASE_BLOCK = eINSTANCE.getBSCaseBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_CASE_BLOCK__STATEMENTS = eINSTANCE.getBSCaseBlock_Statements();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSBlockImpl <em>BS Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSBlockImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBlock()
     * @generated
     */
    EClass BS_BLOCK = eINSTANCE.getBSBlock();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSSymbolImpl <em>BS Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSSymbolImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSSymbol()
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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSExpressionImpl <em>BS Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSExpression()
     * @generated
     */
    EClass BS_EXPRESSION = eINSTANCE.getBSExpression();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSAssignmentExpressionImpl <em>BS Assignment Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSAssignmentExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSAssignmentExpression()
     * @generated
     */
    EClass BS_ASSIGNMENT_EXPRESSION = eINSTANCE.getBSAssignmentExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_ASSIGNMENT_EXPRESSION__LEFT = eINSTANCE.getBSAssignmentExpression_Left();

    /**
     * The meta object literal for the '<em><b>Assignment Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR = eINSTANCE.getBSAssignmentExpression_AssignmentOperator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_ASSIGNMENT_EXPRESSION__RIGHT = eINSTANCE.getBSAssignmentExpression_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSTernaryExpressionImpl <em>BS Ternary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSTernaryExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSTernaryExpression()
     * @generated
     */
    EClass BS_TERNARY_EXPRESSION = eINSTANCE.getBSTernaryExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_TERNARY_EXPRESSION__LEFT = eINSTANCE.getBSTernaryExpression_Left();

    /**
     * The meta object literal for the '<em><b>Middle</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_TERNARY_EXPRESSION__MIDDLE = eINSTANCE.getBSTernaryExpression_Middle();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_TERNARY_EXPRESSION__RIGHT = eINSTANCE.getBSTernaryExpression_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSBooleanOrExpressionImpl <em>BS Boolean Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSBooleanOrExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBooleanOrExpression()
     * @generated
     */
    EClass BS_BOOLEAN_OR_EXPRESSION = eINSTANCE.getBSBooleanOrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BOOLEAN_OR_EXPRESSION__LEFT = eINSTANCE.getBSBooleanOrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BOOLEAN_OR_EXPRESSION__RIGHT = eINSTANCE.getBSBooleanOrExpression_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSBooleanAndExpressionImpl <em>BS Boolean And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSBooleanAndExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBooleanAndExpression()
     * @generated
     */
    EClass BS_BOOLEAN_AND_EXPRESSION = eINSTANCE.getBSBooleanAndExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BOOLEAN_AND_EXPRESSION__LEFT = eINSTANCE.getBSBooleanAndExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BOOLEAN_AND_EXPRESSION__RIGHT = eINSTANCE.getBSBooleanAndExpression_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSBitwiseOrExpressionImpl <em>BS Bitwise Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSBitwiseOrExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBitwiseOrExpression()
     * @generated
     */
    EClass BS_BITWISE_OR_EXPRESSION = eINSTANCE.getBSBitwiseOrExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BITWISE_OR_EXPRESSION__LEFT = eINSTANCE.getBSBitwiseOrExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BITWISE_OR_EXPRESSION__RIGHT = eINSTANCE.getBSBitwiseOrExpression_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSBitwiseXorExpressionImpl <em>BS Bitwise Xor Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSBitwiseXorExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBitwiseXorExpression()
     * @generated
     */
    EClass BS_BITWISE_XOR_EXPRESSION = eINSTANCE.getBSBitwiseXorExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BITWISE_XOR_EXPRESSION__LEFT = eINSTANCE.getBSBitwiseXorExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BITWISE_XOR_EXPRESSION__RIGHT = eINSTANCE.getBSBitwiseXorExpression_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSBitwiseAndExpressionImpl <em>BS Bitwise And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSBitwiseAndExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBitwiseAndExpression()
     * @generated
     */
    EClass BS_BITWISE_AND_EXPRESSION = eINSTANCE.getBSBitwiseAndExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BITWISE_AND_EXPRESSION__LEFT = eINSTANCE.getBSBitwiseAndExpression_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BITWISE_AND_EXPRESSION__RIGHT = eINSTANCE.getBSBitwiseAndExpression_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSEqualityExpressionImpl <em>BS Equality Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSEqualityExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSEqualityExpression()
     * @generated
     */
    EClass BS_EQUALITY_EXPRESSION = eINSTANCE.getBSEqualityExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_EQUALITY_EXPRESSION__LEFT = eINSTANCE.getBSEqualityExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_EQUALITY_EXPRESSION__OPERATOR = eINSTANCE.getBSEqualityExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_EQUALITY_EXPRESSION__RIGHT = eINSTANCE.getBSEqualityExpression_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSOrderedRelationExpressionImpl <em>BS Ordered Relation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSOrderedRelationExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSOrderedRelationExpression()
     * @generated
     */
    EClass BS_ORDERED_RELATION_EXPRESSION = eINSTANCE.getBSOrderedRelationExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_ORDERED_RELATION_EXPRESSION__LEFT = eINSTANCE.getBSOrderedRelationExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_ORDERED_RELATION_EXPRESSION__OPERATOR = eINSTANCE.getBSOrderedRelationExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_ORDERED_RELATION_EXPRESSION__RIGHT = eINSTANCE.getBSOrderedRelationExpression_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSBitwiseShiftExpressionImpl <em>BS Bitwise Shift Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSBitwiseShiftExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBitwiseShiftExpression()
     * @generated
     */
    EClass BS_BITWISE_SHIFT_EXPRESSION = eINSTANCE.getBSBitwiseShiftExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BITWISE_SHIFT_EXPRESSION__LEFT = eINSTANCE.getBSBitwiseShiftExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_BITWISE_SHIFT_EXPRESSION__OPERATOR = eINSTANCE.getBSBitwiseShiftExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_BITWISE_SHIFT_EXPRESSION__RIGHT = eINSTANCE.getBSBitwiseShiftExpression_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSPlusMinusOrStringConcatExpressionImpl <em>BS Plus Minus Or String Concat Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSPlusMinusOrStringConcatExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSPlusMinusOrStringConcatExpression()
     * @generated
     */
    EClass BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION = eINSTANCE.getBSPlusMinusOrStringConcatExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION__LEFT = eINSTANCE.getBSPlusMinusOrStringConcatExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION__OPERATOR = eINSTANCE.getBSPlusMinusOrStringConcatExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_PLUS_MINUS_OR_STRING_CONCAT_EXPRESSION__RIGHT = eINSTANCE.getBSPlusMinusOrStringConcatExpression_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSMulDivOrModExpressionImpl <em>BS Mul Div Or Mod Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSMulDivOrModExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMulDivOrModExpression()
     * @generated
     */
    EClass BS_MUL_DIV_OR_MOD_EXPRESSION = eINSTANCE.getBSMulDivOrModExpression();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_MUL_DIV_OR_MOD_EXPRESSION__LEFT = eINSTANCE.getBSMulDivOrModExpression_Left();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_MUL_DIV_OR_MOD_EXPRESSION__OPERATOR = eINSTANCE.getBSMulDivOrModExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_MUL_DIV_OR_MOD_EXPRESSION__RIGHT = eINSTANCE.getBSMulDivOrModExpression_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSCastExpressionImpl <em>BS Cast Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSCastExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSCastExpression()
     * @generated
     */
    EClass BS_CAST_EXPRESSION = eINSTANCE.getBSCastExpression();

    /**
     * The meta object literal for the '<em><b>Cast Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_CAST_EXPRESSION__CAST_TYPE = eINSTANCE.getBSCastExpression_CastType();

    /**
     * The meta object literal for the '<em><b>Cast Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_CAST_EXPRESSION__CAST_EXPR = eINSTANCE.getBSCastExpression_CastExpr();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSNewExpressionImpl <em>BS New Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSNewExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSNewExpression()
     * @generated
     */
    EClass BS_NEW_EXPRESSION = eINSTANCE.getBSNewExpression();

    /**
     * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_NEW_EXPRESSION__IS_ARRAY = eINSTANCE.getBSNewExpression_IsArray();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_NEW_EXPRESSION__TYPE = eINSTANCE.getBSNewExpression_Type();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_NEW_EXPRESSION__ARGS = eINSTANCE.getBSNewExpression_Args();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSUnaryModifierExpressionImpl <em>BS Unary Modifier Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSUnaryModifierExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSUnaryModifierExpression()
     * @generated
     */
    EClass BS_UNARY_MODIFIER_EXPRESSION = eINSTANCE.getBSUnaryModifierExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_UNARY_MODIFIER_EXPRESSION__OPERATOR = eINSTANCE.getBSUnaryModifierExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_UNARY_MODIFIER_EXPRESSION__RECEIVER = eINSTANCE.getBSUnaryModifierExpression_Receiver();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSMemberSelectionExpressionImpl <em>BS Member Selection Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSMemberSelectionExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMemberSelectionExpression()
     * @generated
     */
    EClass BS_MEMBER_SELECTION_EXPRESSION = eINSTANCE.getBSMemberSelectionExpression();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_MEMBER_SELECTION_EXPRESSION__RECEIVER = eINSTANCE.getBSMemberSelectionExpression_Receiver();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSMethodInvokationExpressionImpl <em>BS Method Invokation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSMethodInvokationExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSMethodInvokationExpression()
     * @generated
     */
    EClass BS_METHOD_INVOKATION_EXPRESSION = eINSTANCE.getBSMethodInvokationExpression();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_METHOD_INVOKATION_EXPRESSION__RECEIVER = eINSTANCE.getBSMethodInvokationExpression_Receiver();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_METHOD_INVOKATION_EXPRESSION__ARGS = eINSTANCE.getBSMethodInvokationExpression_Args();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSArrayAccessExpressionImpl <em>BS Array Access Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSArrayAccessExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSArrayAccessExpression()
     * @generated
     */
    EClass BS_ARRAY_ACCESS_EXPRESSION = eINSTANCE.getBSArrayAccessExpression();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_ARRAY_ACCESS_EXPRESSION__RECEIVER = eINSTANCE.getBSArrayAccessExpression_Receiver();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_ARRAY_ACCESS_EXPRESSION__ARGS = eINSTANCE.getBSArrayAccessExpression_Args();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSPostfixArithmeticExpressionImpl <em>BS Postfix Arithmetic Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSPostfixArithmeticExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSPostfixArithmeticExpression()
     * @generated
     */
    EClass BS_POSTFIX_ARITHMETIC_EXPRESSION = eINSTANCE.getBSPostfixArithmeticExpression();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_POSTFIX_ARITHMETIC_EXPRESSION__RECEIVER = eINSTANCE.getBSPostfixArithmeticExpression_Receiver();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_POSTFIX_ARITHMETIC_EXPRESSION__OPERATOR = eINSTANCE.getBSPostfixArithmeticExpression_Operator();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSStringConstantImpl <em>BS String Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSStringConstantImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSStringConstant()
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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSHexadecimalConstantImpl <em>BS Hexadecimal Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSHexadecimalConstantImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSHexadecimalConstant()
     * @generated
     */
    EClass BS_HEXADECIMAL_CONSTANT = eINSTANCE.getBSHexadecimalConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_HEXADECIMAL_CONSTANT__VALUE = eINSTANCE.getBSHexadecimalConstant_Value();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSNumberConstantImpl <em>BS Number Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSNumberConstantImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSNumberConstant()
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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSRealConstantImpl <em>BS Real Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSRealConstantImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSRealConstant()
     * @generated
     */
    EClass BS_REAL_CONSTANT = eINSTANCE.getBSRealConstant();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_REAL_CONSTANT__LEFT = eINSTANCE.getBSRealConstant_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BS_REAL_CONSTANT__RIGHT = eINSTANCE.getBSRealConstant_Right();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSBooleanConstantImpl <em>BS Boolean Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSBooleanConstantImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBooleanConstant()
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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSNullLiteralImpl <em>BS Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSNullLiteralImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSNullLiteral()
     * @generated
     */
    EClass BS_NULL_LITERAL = eINSTANCE.getBSNullLiteral();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSBreakLiteralImpl <em>BS Break Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSBreakLiteralImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSBreakLiteral()
     * @generated
     */
    EClass BS_BREAK_LITERAL = eINSTANCE.getBSBreakLiteral();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSContinueLiteralImpl <em>BS Continue Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSContinueLiteralImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSContinueLiteral()
     * @generated
     */
    EClass BS_CONTINUE_LITERAL = eINSTANCE.getBSContinueLiteral();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSThisLiteralImpl <em>BS This Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSThisLiteralImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSThisLiteral()
     * @generated
     */
    EClass BS_THIS_LITERAL = eINSTANCE.getBSThisLiteral();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSClientLiteralImpl <em>BS Client Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSClientLiteralImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSClientLiteral()
     * @generated
     */
    EClass BS_CLIENT_LITERAL = eINSTANCE.getBSClientLiteral();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSParentLiteralImpl <em>BS Parent Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSParentLiteralImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSParentLiteral()
     * @generated
     */
    EClass BS_PARENT_LITERAL = eINSTANCE.getBSParentLiteral();

    /**
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSSymbolRefImpl <em>BS Symbol Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSSymbolRefImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSSymbolRef()
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
     * The meta object literal for the '{@link org.example.blorquescript.blorqueScript.impl.BSParentheticalExpressionImpl <em>BS Parenthetical Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.blorquescript.blorqueScript.impl.BSParentheticalExpressionImpl
     * @see org.example.blorquescript.blorqueScript.impl.BlorqueScriptPackageImpl#getBSParentheticalExpression()
     * @generated
     */
    EClass BS_PARENTHETICAL_EXPRESSION = eINSTANCE.getBSParentheticalExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BS_PARENTHETICAL_EXPRESSION__EXPRESSION = eINSTANCE.getBSParentheticalExpression_Expression();

  }

} //BlorqueScriptPackage
