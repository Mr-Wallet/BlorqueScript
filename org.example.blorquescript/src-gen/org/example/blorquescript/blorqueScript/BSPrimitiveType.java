/**
 */
package org.example.blorquescript.blorqueScript;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>BS Primitive Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.example.blorquescript.blorqueScript.BlorqueScriptPackage#getBSPrimitiveType()
 * @model
 * @generated
 */
public enum BSPrimitiveType implements Enumerator
{
  /**
   * The '<em><b>NONE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(0, "NONE", "NONE"),

  /**
   * The '<em><b>STRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(1, "STRING", "string"),

  /**
   * The '<em><b>TAGGED STRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TAGGED_STRING_VALUE
   * @generated
   * @ordered
   */
  TAGGED_STRING(2, "TAGGED_STRING", "taggedString"),

  /**
   * The '<em><b>NUMBER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NUMBER_VALUE
   * @generated
   * @ordered
   */
  NUMBER(3, "NUMBER", "number"),

  /**
   * The '<em><b>OBJECT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OBJECT_VALUE
   * @generated
   * @ordered
   */
  OBJECT(4, "OBJECT", "object"),

  /**
   * The '<em><b>VOID</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VOID_VALUE
   * @generated
   * @ordered
   */
  VOID(5, "VOID", "void");

  /**
   * The '<em><b>NONE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONE
   * @model
   * @generated
   * @ordered
   */
  public static final int NONE_VALUE = 0;

  /**
   * The '<em><b>STRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model literal="string"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 1;

  /**
   * The '<em><b>TAGGED STRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TAGGED STRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TAGGED_STRING
   * @model literal="taggedString"
   * @generated
   * @ordered
   */
  public static final int TAGGED_STRING_VALUE = 2;

  /**
   * The '<em><b>NUMBER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NUMBER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NUMBER
   * @model literal="number"
   * @generated
   * @ordered
   */
  public static final int NUMBER_VALUE = 3;

  /**
   * The '<em><b>OBJECT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OBJECT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OBJECT
   * @model literal="object"
   * @generated
   * @ordered
   */
  public static final int OBJECT_VALUE = 4;

  /**
   * The '<em><b>VOID</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>VOID</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #VOID
   * @model literal="void"
   * @generated
   * @ordered
   */
  public static final int VOID_VALUE = 5;

  /**
   * An array of all the '<em><b>BS Primitive Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BSPrimitiveType[] VALUES_ARRAY =
    new BSPrimitiveType[]
    {
      NONE,
      STRING,
      TAGGED_STRING,
      NUMBER,
      OBJECT,
      VOID,
    };

  /**
   * A public read-only list of all the '<em><b>BS Primitive Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BSPrimitiveType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>BS Primitive Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BSPrimitiveType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BSPrimitiveType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>BS Primitive Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BSPrimitiveType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BSPrimitiveType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>BS Primitive Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static BSPrimitiveType get(int value)
  {
    switch (value)
    {
      case NONE_VALUE: return NONE;
      case STRING_VALUE: return STRING;
      case TAGGED_STRING_VALUE: return TAGGED_STRING;
      case NUMBER_VALUE: return NUMBER;
      case OBJECT_VALUE: return OBJECT;
      case VOID_VALUE: return VOID;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private BSPrimitiveType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //BSPrimitiveType
