/**
 */
package org.xtext.example.blorquescript.blorqueScript.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.blorquescript.blorqueScript.*;

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
 * @see org.xtext.example.blorquescript.blorqueScript.BlorqueScriptPackage
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
      case BlorqueScriptPackage.BS_IF_BLOCK:
      {
        BSIfBlock bsIfBlock = (BSIfBlock)theEObject;
        T result = caseBSIfBlock(bsIfBlock);
        if (result == null) result = caseBSBlock(bsIfBlock);
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
      case BlorqueScriptPackage.BS_ASSIGNMENT:
      {
        BSAssignment bsAssignment = (BSAssignment)theEObject;
        T result = caseBSAssignment(bsAssignment);
        if (result == null) result = caseBSExpression(bsAssignment);
        if (result == null) result = caseBSStatement(bsAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_MEMBER_SELECTION:
      {
        BSMemberSelection bsMemberSelection = (BSMemberSelection)theEObject;
        T result = caseBSMemberSelection(bsMemberSelection);
        if (result == null) result = caseBSExpression(bsMemberSelection);
        if (result == null) result = caseBSStatement(bsMemberSelection);
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
      case BlorqueScriptPackage.BS_NUMBER_CONSTANT:
      {
        BSNumberConstant bsNumberConstant = (BSNumberConstant)theEObject;
        T result = caseBSNumberConstant(bsNumberConstant);
        if (result == null) result = caseBSExpression(bsNumberConstant);
        if (result == null) result = caseBSStatement(bsNumberConstant);
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
      case BlorqueScriptPackage.BS_NULL:
      {
        BSNull bsNull = (BSNull)theEObject;
        T result = caseBSNull(bsNull);
        if (result == null) result = caseBSExpression(bsNull);
        if (result == null) result = caseBSStatement(bsNull);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_THIS:
      {
        BSThis bsThis = (BSThis)theEObject;
        T result = caseBSThis(bsThis);
        if (result == null) result = caseBSExpression(bsThis);
        if (result == null) result = caseBSStatement(bsThis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BlorqueScriptPackage.BS_CLIENT:
      {
        BSClient bsClient = (BSClient)theEObject;
        T result = caseBSClient(bsClient);
        if (result == null) result = caseBSExpression(bsClient);
        if (result == null) result = caseBSStatement(bsClient);
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
      case BlorqueScriptPackage.BS_NEW:
      {
        BSNew bsNew = (BSNew)theEObject;
        T result = caseBSNew(bsNew);
        if (result == null) result = caseBSExpression(bsNew);
        if (result == null) result = caseBSStatement(bsNew);
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
   * Returns the result of interpreting the object as an instance of '<em>BS Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSAssignment(BSAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Member Selection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Member Selection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSMemberSelection(BSMemberSelection object)
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
   * Returns the result of interpreting the object as an instance of '<em>BS Null</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Null</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSNull(BSNull object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS This</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS This</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSThis(BSThis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS Client</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS Client</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSClient(BSClient object)
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
   * Returns the result of interpreting the object as an instance of '<em>BS New</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS New</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBSNew(BSNew object)
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
