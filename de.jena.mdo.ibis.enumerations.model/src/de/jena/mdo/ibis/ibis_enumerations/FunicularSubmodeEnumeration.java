/*
 */
package de.jena.mdo.ibis.ibis_enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Funicular Submode Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Values for Funicular MODEs of TRANSPORT: TPEG pti_table_10.
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getFunicularSubmodeEnumeration()
 * @model extendedMetaData="name='FunicularSubmodeEnumeration'"
 * @generated
 */
@ProviderType
public enum FunicularSubmodeEnumeration implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "unknown", "unknown"),

	/**
	 * The '<em><b>Funicular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNICULAR_VALUE
	 * @generated
	 * @ordered
	 */
	FUNICULAR(1, "funicular", "funicular"),

	/**
	 * The '<em><b>Street Cable Car</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREET_CABLE_CAR_VALUE
	 * @generated
	 * @ordered
	 */
	STREET_CABLE_CAR(2, "streetCableCar", "streetCableCar"),

	/**
	 * The '<em><b>All Funicular Services</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_FUNICULAR_SERVICES_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_FUNICULAR_SERVICES(3, "allFunicularServices", "allFunicularServices"),

	/**
	 * The '<em><b>Undefined Funicular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_FUNICULAR_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED_FUNICULAR(4, "undefinedFunicular", "undefinedFunicular");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Funicular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNICULAR
	 * @model name="funicular"
	 * @generated
	 * @ordered
	 */
	public static final int FUNICULAR_VALUE = 1;

	/**
	 * The '<em><b>Street Cable Car</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STREET_CABLE_CAR
	 * @model name="streetCableCar"
	 * @generated
	 * @ordered
	 */
	public static final int STREET_CABLE_CAR_VALUE = 2;

	/**
	 * The '<em><b>All Funicular Services</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_FUNICULAR_SERVICES
	 * @model name="allFunicularServices"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_FUNICULAR_SERVICES_VALUE = 3;

	/**
	 * The '<em><b>Undefined Funicular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_FUNICULAR
	 * @model name="undefinedFunicular"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_FUNICULAR_VALUE = 4;

	/**
	 * An array of all the '<em><b>Funicular Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FunicularSubmodeEnumeration[] VALUES_ARRAY =
		new FunicularSubmodeEnumeration[] {
			UNKNOWN,
			FUNICULAR,
			STREET_CABLE_CAR,
			ALL_FUNICULAR_SERVICES,
			UNDEFINED_FUNICULAR,
		};

	/**
	 * A public read-only list of all the '<em><b>Funicular Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FunicularSubmodeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Funicular Submode Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FunicularSubmodeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FunicularSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Funicular Submode Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FunicularSubmodeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FunicularSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Funicular Submode Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FunicularSubmodeEnumeration get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case FUNICULAR_VALUE: return FUNICULAR;
			case STREET_CABLE_CAR_VALUE: return STREET_CABLE_CAR;
			case ALL_FUNICULAR_SERVICES_VALUE: return ALL_FUNICULAR_SERVICES;
			case UNDEFINED_FUNICULAR_VALUE: return UNDEFINED_FUNICULAR;
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
	private FunicularSubmodeEnumeration(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //FunicularSubmodeEnumeration
