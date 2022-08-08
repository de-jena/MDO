/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Valuens Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getValuensType1()
 * @model extendedMetaData="name='valuens_._1_._type'"
 * @generated
 */
public enum ValuensType1 implements Enumerator {
	/**
	 * The '<em><b>Http Schemas Microsoft Com Analysisservices2010 Engine200200</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_SCHEMAS_MICROSOFT_COM_ANALYSISSERVICES2010_ENGINE200200_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_SCHEMAS_MICROSOFT_COM_ANALYSISSERVICES2010_ENGINE200200(0, "httpSchemasMicrosoftComAnalysisservices2010Engine200200", "http://schemas.microsoft.com/analysisservices/2010/engine/200/200");

	/**
	 * The '<em><b>Http Schemas Microsoft Com Analysisservices2010 Engine200200</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_SCHEMAS_MICROSOFT_COM_ANALYSISSERVICES2010_ENGINE200200
	 * @model name="httpSchemasMicrosoftComAnalysisservices2010Engine200200" literal="http://schemas.microsoft.com/analysisservices/2010/engine/200/200"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_SCHEMAS_MICROSOFT_COM_ANALYSISSERVICES2010_ENGINE200200_VALUE = 0;

	/**
	 * An array of all the '<em><b>Valuens Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ValuensType1[] VALUES_ARRAY =
		new ValuensType1[] {
			HTTP_SCHEMAS_MICROSOFT_COM_ANALYSISSERVICES2010_ENGINE200200,
		};

	/**
	 * A public read-only list of all the '<em><b>Valuens Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ValuensType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Valuens Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValuensType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValuensType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Valuens Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValuensType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ValuensType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Valuens Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ValuensType1 get(int value) {
		switch (value) {
			case HTTP_SCHEMAS_MICROSOFT_COM_ANALYSISSERVICES2010_ENGINE200200_VALUE: return HTTP_SCHEMAS_MICROSOFT_COM_ANALYSISSERVICES2010_ENGINE200200;
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
	private ValuensType1(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ValuensType1
