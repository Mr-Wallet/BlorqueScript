package org.example.blorquescript.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.example.blorquescript.BlorqueScriptInjectorProvider;
import org.example.blorquescript.blorqueScript.BSAssignmentExpression;
import org.example.blorquescript.blorqueScript.BSClass;
import org.example.blorquescript.blorqueScript.BSField;
import org.example.blorquescript.blorqueScript.BSFile;
import org.example.blorquescript.blorqueScript.BSMember;
import org.example.blorquescript.blorqueScript.BSMethod;
import org.example.blorquescript.blorqueScript.BSMethodBody;
import org.example.blorquescript.blorqueScript.BSParameter;
import org.example.blorquescript.blorqueScript.BSPrimitiveType;
import org.example.blorquescript.blorqueScript.BSReturn;
import org.example.blorquescript.blorqueScript.BSStatement;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(BlorqueScriptInjectorProvider.class)
@SuppressWarnings("all")
public class BlorqueScriptParserTest {
  @Inject
  @Extension
  private ParseHelper<BSFile> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testEmptyClassDeclaration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {}");
      _builder.newLine();
      final BSFile file = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(file);
      Assert.assertTrue("File should be a file", (file instanceof BSFile));
      EList<BSClass> _classes = file.getClasses();
      int _size = _classes.size();
      Assert.assertEquals("File should have one member", 1, _size);
      EList<BSClass> _classes_1 = file.getClasses();
      final BSClass class_ = _classes_1.get(0);
      Assert.assertTrue("File\'s member should be a class", (class_ instanceof BSClass));
      String _name = class_.getName();
      Assert.assertEquals("Class should have a name", "A", _name);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFieldDeclaration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("string f0;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A f1[];");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BSFile file = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(file);
      EList<BSClass> _classes = file.getClasses();
      final BSClass class_ = _classes.get(0);
      EList<BSMember> _members = class_.getMembers();
      int _size = _members.size();
      Assert.assertEquals("Class should have two members", 2, _size);
      EList<BSMember> _members_1 = class_.getMembers();
      final BSMember field0 = _members_1.get(0);
      EList<BSMember> _members_2 = class_.getMembers();
      final BSMember field1 = _members_2.get(1);
      Assert.assertTrue("members should be fields", (field0 instanceof BSField));
      Assert.assertTrue("members should be fields", (field1 instanceof BSField));
      String _name = field0.getName();
      Assert.assertEquals("fields should have names", "f0", _name);
      String _name_1 = field1.getName();
      Assert.assertEquals("fields should have names", "f1", _name_1);
      BSPrimitiveType _pType = ((BSField) field0).getPType();
      Assert.assertEquals("fields should have types", BSPrimitiveType.STRING, _pType);
      BSClass _rType = ((BSField) field0).getRType();
      Assert.assertEquals("fields should have types", null, _rType);
      BSPrimitiveType _pType_1 = ((BSField) field1).getPType();
      Assert.assertEquals("fields should have types", BSPrimitiveType.NONE, _pType_1);
      BSClass _rType_1 = ((BSField) field1).getRType();
      String _name_2 = _rType_1.getName();
      Assert.assertEquals("fields should have types", "A", _name_2);
      boolean _isIsArray = ((BSField) field0).isIsArray();
      Assert.assertFalse("field0 should not be an array", _isIsArray);
      boolean _isIsArray_1 = ((BSField) field1).isIsArray();
      Assert.assertTrue("field1 should be an array", _isIsArray_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEmptyMethodDeclaration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("void m() {}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BSFile file = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(file);
      EList<BSClass> _classes = file.getClasses();
      final BSClass class_ = _classes.get(0);
      EList<BSMember> _members = class_.getMembers();
      int _size = _members.size();
      Assert.assertEquals("Class should have one member", 1, _size);
      EList<BSMember> _members_1 = class_.getMembers();
      final BSMember method = _members_1.get(0);
      Assert.assertTrue("member should be a method", (method instanceof BSMethod));
      String _name = method.getName();
      Assert.assertEquals("method should have a name", "m", _name);
      EList<BSParameter> _params = ((BSMethod) method).getParams();
      int _size_1 = _params.size();
      Assert.assertEquals("method should have no params", 0, _size_1);
      BSPrimitiveType _pType = ((BSMethod) method).getPType();
      Assert.assertEquals("method should be void", BSPrimitiveType.VOID, _pType);
      BSPrimitiveType _pType_1 = ((BSMethod) method).getPType();
      Assert.assertEquals("method should have void return type", BSPrimitiveType.VOID, _pType_1);
      BSClass _rType = ((BSMethod) method).getRType();
      Assert.assertEquals("method should have void return type", null, _rType);
      BSMethodBody _body = ((BSMethod) method).getBody();
      EList<BSStatement> _statements = _body.getStatements();
      int _size_2 = _statements.size();
      Assert.assertEquals("method body should have no statements", 0, _size_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testComplexMethodDeclaration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("class A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("void m0() { return; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A f;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("A[] m1(string p0, taggedString p1) { f = f; return null; }");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("number m2(object o) { return 0;}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("object aaf;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final BSFile file = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(file);
      EList<BSClass> _classes = file.getClasses();
      final BSClass class_ = _classes.get(0);
      EList<BSMember> _members = class_.getMembers();
      int _size = _members.size();
      Assert.assertEquals("Class should have five members", 5, _size);
      EList<BSMember> _members_1 = class_.getMembers();
      final BSMember method0 = _members_1.get(0);
      EList<BSMember> _members_2 = class_.getMembers();
      final BSMember field = _members_2.get(1);
      EList<BSMember> _members_3 = class_.getMembers();
      final BSMember method1 = _members_3.get(2);
      EList<BSMember> _members_4 = class_.getMembers();
      final BSMember method2 = _members_4.get(3);
      EList<BSMember> _members_5 = class_.getMembers();
      final BSMember alsoAField = _members_5.get(4);
      Assert.assertTrue("member should be a method", (method0 instanceof BSMethod));
      Assert.assertTrue("member should be a field", (field instanceof BSField));
      Assert.assertTrue("member should be a method", (method1 instanceof BSMethod));
      Assert.assertTrue("member should be a method", (method2 instanceof BSMethod));
      Assert.assertTrue("member should be a field", (alsoAField instanceof BSField));
      String _name = method0.getName();
      Assert.assertEquals("method should have a name", "m0", _name);
      String _name_1 = field.getName();
      Assert.assertEquals("field should have a name", "f", _name_1);
      String _name_2 = method1.getName();
      Assert.assertEquals("method should have a name", "m1", _name_2);
      String _name_3 = method2.getName();
      Assert.assertEquals("method should have a name", "m2", _name_3);
      String _name_4 = alsoAField.getName();
      Assert.assertEquals("field should have a name", "aaf", _name_4);
      BSPrimitiveType _pType = ((BSMethod) method0).getPType();
      Assert.assertEquals("method should be void", BSPrimitiveType.VOID, _pType);
      BSClass _rType = ((BSMethod) method0).getRType();
      Assert.assertEquals("method should be void", null, _rType);
      BSPrimitiveType _pType_1 = ((BSField) field).getPType();
      Assert.assertEquals("field should be A type", BSPrimitiveType.NONE, _pType_1);
      BSClass _rType_1 = ((BSField) field).getRType();
      String _name_5 = _rType_1.getName();
      Assert.assertEquals("field should be A type", "A", _name_5);
      BSPrimitiveType _pType_2 = ((BSMethod) method1).getPType();
      Assert.assertEquals("method should be A type", BSPrimitiveType.NONE, _pType_2);
      BSClass _rType_2 = ((BSMethod) method1).getRType();
      String _name_6 = _rType_2.getName();
      Assert.assertEquals("method should be A type", "A", _name_6);
      BSPrimitiveType _pType_3 = ((BSMethod) method2).getPType();
      Assert.assertEquals("method should be number type", BSPrimitiveType.NUMBER, _pType_3);
      BSClass _rType_3 = ((BSMethod) method2).getRType();
      Assert.assertEquals("method should be void", null, _rType_3);
      BSPrimitiveType _pType_4 = ((BSField) alsoAField).getPType();
      Assert.assertEquals("field should be object type", BSPrimitiveType.OBJECT, _pType_4);
      BSClass _rType_4 = ((BSField) alsoAField).getRType();
      Assert.assertEquals("field should be object type", null, _rType_4);
      boolean _isIsArray = ((BSMethod) method0).isIsArray();
      Assert.assertFalse("only method1 should be array type", _isIsArray);
      boolean _isIsArray_1 = ((BSMethod) method1).isIsArray();
      Assert.assertTrue("only method1 should be array type", _isIsArray_1);
      boolean _isIsArray_2 = ((BSMethod) method2).isIsArray();
      Assert.assertFalse("only method1 should be array type", _isIsArray_2);
      EList<BSParameter> _params = ((BSMethod) method0).getParams();
      int _size_1 = _params.size();
      Assert.assertEquals("method should have no params", 0, _size_1);
      EList<BSParameter> _params_1 = ((BSMethod) method1).getParams();
      int _size_2 = _params_1.size();
      Assert.assertEquals("method should have 2 params", 2, _size_2);
      EList<BSParameter> _params_2 = ((BSMethod) method2).getParams();
      int _size_3 = _params_2.size();
      Assert.assertEquals("method should have 1 param", 1, _size_3);
      EList<BSParameter> _params_3 = ((BSMethod) method1).getParams();
      final BSParameter param0 = _params_3.get(0);
      EList<BSParameter> _params_4 = ((BSMethod) method1).getParams();
      final BSParameter param1 = _params_4.get(1);
      EList<BSParameter> _params_5 = ((BSMethod) method2).getParams();
      final BSParameter param2 = _params_5.get(0);
      BSPrimitiveType _pType_5 = param0.getPType();
      Assert.assertEquals("method2 param0 should be a string named p0", BSPrimitiveType.STRING, _pType_5);
      String _name_7 = param0.getName();
      Assert.assertEquals("method2 param0 should be a string named p0", "p0", _name_7);
      BSPrimitiveType _pType_6 = param1.getPType();
      Assert.assertEquals("method2 param1 should be a taggedString named p1", BSPrimitiveType.TAGGED_STRING, _pType_6);
      String _name_8 = param1.getName();
      Assert.assertEquals("method2 param1 should be a taggedString named p1", "p1", _name_8);
      BSPrimitiveType _pType_7 = param2.getPType();
      Assert.assertEquals("method2 param0 should be an object named o", BSPrimitiveType.OBJECT, _pType_7);
      String _name_9 = param2.getName();
      Assert.assertEquals("method2 param0 should be an object named o", "o", _name_9);
      BSMethodBody _body = ((BSMethod) method0).getBody();
      EList<BSStatement> _statements = _body.getStatements();
      int _size_4 = _statements.size();
      Assert.assertEquals("method body should have 1 return statement", 1, _size_4);
      BSMethodBody _body_1 = ((BSMethod) method0).getBody();
      EList<BSStatement> _statements_1 = _body_1.getStatements();
      final BSStatement statement0 = _statements_1.get(0);
      Assert.assertTrue("method body should have 1 return statement", (statement0 instanceof BSReturn));
      BSMethodBody _body_2 = ((BSMethod) method1).getBody();
      EList<BSStatement> _statements_2 = _body_2.getStatements();
      int _size_5 = _statements_2.size();
      Assert.assertEquals("method body should have an assignment then a return", 2, _size_5);
      BSMethodBody _body_3 = ((BSMethod) method1).getBody();
      EList<BSStatement> _statements_3 = _body_3.getStatements();
      final BSStatement statement1 = _statements_3.get(0);
      BSMethodBody _body_4 = ((BSMethod) method1).getBody();
      EList<BSStatement> _statements_4 = _body_4.getStatements();
      final BSStatement statement2 = _statements_4.get(1);
      Assert.assertTrue("method body should have an assignment then a return", (statement1 instanceof BSAssignmentExpression));
      Assert.assertTrue("method body should have an assignment then a return", (statement2 instanceof BSReturn));
      BSMethodBody _body_5 = ((BSMethod) method2).getBody();
      EList<BSStatement> _statements_5 = _body_5.getStatements();
      int _size_6 = _statements_5.size();
      Assert.assertEquals("method body should have 1 return statement", 1, _size_6);
      BSMethodBody _body_6 = ((BSMethod) method0).getBody();
      EList<BSStatement> _statements_6 = _body_6.getStatements();
      final BSStatement statement3 = _statements_6.get(0);
      Assert.assertTrue("method body should have 1 return statement", (statement3 instanceof BSReturn));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
