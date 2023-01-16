/*
 */
package de.jena.mdo.ibis.enumerations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GNSS Coordinate System Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Information on the GNSS-Coordinate-System
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getGNSSCoordinateSystemEnumeration()
 * @model extendedMetaData="name='GNSSCoordinateSystemEnumeration'"
 * @generated
 */
@ProviderType
public enum GNSSCoordinateSystemEnumeration implements Enumerator {
	/**
	 * The '<em><b>CH1903</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CH1903_VALUE
	 * @generated
	 * @ordered
	 */
	CH1903(0, "CH1903", "CH1903"),

	/**
	 * The '<em><b>ETSR89</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETSR89_VALUE
	 * @generated
	 * @ordered
	 */
	ETSR89(1, "ETSR89", "ETSR89"),

	/**
	 * The '<em><b>IERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IERS_VALUE
	 * @generated
	 * @ordered
	 */
	IERS(2, "IERS", "IERS"),

	/**
	 * The '<em><b>NAD27</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAD27_VALUE
	 * @generated
	 * @ordered
	 */
	NAD27(3, "NAD27", "NAD27"),

	/**
	 * The '<em><b>NAD83</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAD83_VALUE
	 * @generated
	 * @ordered
	 */
	NAD83(4, "NAD83", "NAD83"),

	/**
	 * The '<em><b>WGS84</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WGS84_VALUE
	 * @generated
	 * @ordered
	 */
	WGS84(5, "WGS84", "WGS84"),

	/**
	 * The '<em><b>WGS72</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WGS72_VALUE
	 * @generated
	 * @ordered
	 */
	WGS72(6, "WGS72", "WGS72"),

	/**
	 * The '<em><b>SGS85</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SGS85_VALUE
	 * @generated
	 * @ordered
	 */
	SGS85(7, "SGS85", "SGS85"),

	/**
	 * The '<em><b>P90</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P90_VALUE
	 * @generated
	 * @ordered
	 */
	P90(8, "P90", "P90");

	/**
	 * The '<em><b>CH1903</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CH1903
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CH1903_VALUE = 0;

	/**
	 * The '<em><b>ETSR89</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETSR89
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ETSR89_VALUE = 1;

	/**
	 * The '<em><b>IERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IERS_VALUE = 2;

	/**
	 * The '<em><b>NAD27</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAD27
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAD27_VALUE = 3;

	/**
	 * The '<em><b>NAD83</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAD83
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAD83_VALUE = 4;

	/**
	 * The '<em><b>WGS84</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WGS84
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WGS84_VALUE = 5;

	/**
	 * The '<em><b>WGS72</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WGS72
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WGS72_VALUE = 6;

	/**
	 * The '<em><b>SGS85</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SGS85
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SGS85_VALUE = 7;

	/**
	 * The '<em><b>P90</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P90
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int P90_VALUE = 8;

	/**
	 * An array of all the '<em><b>GNSS Coordinate System Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GNSSCoordinateSystemEnumeration[] VALUES_ARRAY =
		new GNSSCoordinateSystemEnumeration[] {
			CH1903,
			ETSR89,
			IERS,
			NAD27,
			NAD83,
			WGS84,
			WGS72,
			SGS85,
			P90,
		};

	/**
	 * A public read-only list of all the '<em><b>GNSS Coordinate System Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GNSSCoordinateSystemEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GNSS Coordinate System Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GNSSCoordinateSystemEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GNSSCoordinateSystemEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GNSS Coordinate System Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GNSSCoordinateSystemEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GNSSCoordinateSystemEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GNSS Coordinate System Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GNSSCoordinateSystemEnumeration get(int value) {
		switch (value) {
			case CH1903_VALUE: return CH1903;
			case ETSR89_VALUE: return ETSR89;
			case IERS_VALUE: return IERS;
			case NAD27_VALUE: return NAD27;
			case NAD83_VALUE: return NAD83;
			case WGS84_VALUE: return WGS84;
			case WGS72_VALUE: return WGS72;
			case SGS85_VALUE: return SGS85;
			case P90_VALUE: return P90;
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
	private GNSSCoordinateSystemEnumeration(int value, String name, String literal) {
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
	
} //GNSSCoordinateSystemEnumeration
