/*
 */
package de.jena.piveau.rdf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Datatype Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.piveau.rdf.RdfPackage#getDatatypeType()
 * @model extendedMetaData="name='datatype_._type'"
 * @generated
 */
@ProviderType
public enum DatatypeType implements Enumerator {
	/**
	 * The '<em><b>Http Www W3 Org2001 XML Schema Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE(0, "httpWwwW3Org2001XMLSchemaDate", "http://www.w3.org/2001/XMLSchema#date"),

	/**
	 * The '<em><b>Http Www W3 Org2001 XML Schema Date Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE_TIME(1, "httpWwwW3Org2001XMLSchemaDateTime", "http://www.w3.org/2001/XMLSchema#dateTime");

	/**
	 * The '<em><b>Http Www W3 Org2001 XML Schema Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE
	 * @model name="httpWwwW3Org2001XMLSchemaDate" literal="http://www.w3.org/2001/XMLSchema#date"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE_VALUE = 0;

	/**
	 * The '<em><b>Http Www W3 Org2001 XML Schema Date Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE_TIME
	 * @model name="httpWwwW3Org2001XMLSchemaDateTime" literal="http://www.w3.org/2001/XMLSchema#dateTime"
	 * @generated
	 * @ordered
	 */
	public static final int HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE_TIME_VALUE = 1;

	/**
	 * An array of all the '<em><b>Datatype Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DatatypeType[] VALUES_ARRAY =
		new DatatypeType[] {
			HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE,
			HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE_TIME,
		};

	/**
	 * A public read-only list of all the '<em><b>Datatype Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DatatypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Datatype Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatatypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatatypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datatype Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatatypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DatatypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Datatype Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DatatypeType get(int value) {
		switch (value) {
			case HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE_VALUE: return HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE;
			case HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE_TIME_VALUE: return HTTP_WWW_W3_ORG2001_XML_SCHEMA_DATE_TIME;
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
	private DatatypeType(int value, String name, String literal) {
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
	
} //DatatypeType
