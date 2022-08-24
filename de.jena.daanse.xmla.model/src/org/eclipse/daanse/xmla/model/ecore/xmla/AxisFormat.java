/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Axis Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAxisFormat()
 * @model extendedMetaData="name='AxisFormat_._type'"
 * @generated
 */
public enum AxisFormat implements Enumerator {
	/**
	 * The '<em><b>Cluster Format</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	CLUSTER_FORMAT(0, "ClusterFormat", "ClusterFormat"),

	/**
	 * The '<em><b>Custom Format</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM_FORMAT(1, "CustomFormat", "CustomFormat"),

	/**
	 * The '<em><b>Tuple Format</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUPLE_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	TUPLE_FORMAT(2, "TupleFormat", "TupleFormat");

	/**
	 * The '<em><b>Cluster Format</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLUSTER_FORMAT
	 * @model name="ClusterFormat"
	 * @generated
	 * @ordered
	 */
	public static final int CLUSTER_FORMAT_VALUE = 0;

	/**
	 * The '<em><b>Custom Format</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_FORMAT
	 * @model name="CustomFormat"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_FORMAT_VALUE = 1;

	/**
	 * The '<em><b>Tuple Format</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TUPLE_FORMAT
	 * @model name="TupleFormat"
	 * @generated
	 * @ordered
	 */
	public static final int TUPLE_FORMAT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Axis Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AxisFormat[] VALUES_ARRAY =
		new AxisFormat[] {
			CLUSTER_FORMAT,
			CUSTOM_FORMAT,
			TUPLE_FORMAT,
		};

	/**
	 * A public read-only list of all the '<em><b>Axis Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AxisFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Axis Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AxisFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AxisFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Axis Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AxisFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AxisFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Axis Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AxisFormat get(int value) {
		switch (value) {
			case CLUSTER_FORMAT_VALUE: return CLUSTER_FORMAT;
			case CUSTOM_FORMAT_VALUE: return CUSTOM_FORMAT;
			case TUPLE_FORMAT_VALUE: return TUPLE_FORMAT;
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
	private AxisFormat(int value, String name, String literal) {
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
	
} //AxisFormat
