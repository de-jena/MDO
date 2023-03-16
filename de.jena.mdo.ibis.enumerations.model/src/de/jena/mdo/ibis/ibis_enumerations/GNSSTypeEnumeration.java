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
 * A representation of the literals of the enumeration '<em><b>GNSS Type Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Information on the type of GNSS
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getGNSSTypeEnumeration()
 * @model extendedMetaData="name='GNSSTypeEnumeration'"
 * @generated
 */
@ProviderType
public enum GNSSTypeEnumeration implements Enumerator {
	/**
	 * The '<em><b>GPS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPS_VALUE
	 * @generated
	 * @ordered
	 */
	GPS(0, "GPS", "GPS"),

	/**
	 * The '<em><b>Glonass</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLONASS_VALUE
	 * @generated
	 * @ordered
	 */
	GLONASS(1, "Glonass", "Glonass"),

	/**
	 * The '<em><b>Galileo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GALILEO_VALUE
	 * @generated
	 * @ordered
	 */
	GALILEO(2, "Galileo", "Galileo"),

	/**
	 * The '<em><b>Beidou</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEIDOU_VALUE
	 * @generated
	 * @ordered
	 */
	BEIDOU(3, "Beidou", "Beidou"),

	/**
	 * The '<em><b>IRNSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRNSS_VALUE
	 * @generated
	 * @ordered
	 */
	IRNSS(4, "IRNSS", "IRNSS"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(5, "other", "other"),

	/**
	 * The '<em><b>Dead Reckoning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEAD_RECKONING_VALUE
	 * @generated
	 * @ordered
	 */
	DEAD_RECKONING(6, "DeadReckoning", "DeadReckoning"),

	/**
	 * The '<em><b>Mixed GNSS Types</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED_GNSS_TYPES_VALUE
	 * @generated
	 * @ordered
	 */
	MIXED_GNSS_TYPES(7, "MixedGNSSTypes", "MixedGNSSTypes");

	/**
	 * The '<em><b>GPS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GPS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GPS_VALUE = 0;

	/**
	 * The '<em><b>Glonass</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLONASS
	 * @model name="Glonass"
	 * @generated
	 * @ordered
	 */
	public static final int GLONASS_VALUE = 1;

	/**
	 * The '<em><b>Galileo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GALILEO
	 * @model name="Galileo"
	 * @generated
	 * @ordered
	 */
	public static final int GALILEO_VALUE = 2;

	/**
	 * The '<em><b>Beidou</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEIDOU
	 * @model name="Beidou"
	 * @generated
	 * @ordered
	 */
	public static final int BEIDOU_VALUE = 3;

	/**
	 * The '<em><b>IRNSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IRNSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IRNSS_VALUE = 4;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 5;

	/**
	 * The '<em><b>Dead Reckoning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEAD_RECKONING
	 * @model name="DeadReckoning"
	 * @generated
	 * @ordered
	 */
	public static final int DEAD_RECKONING_VALUE = 6;

	/**
	 * The '<em><b>Mixed GNSS Types</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIXED_GNSS_TYPES
	 * @model name="MixedGNSSTypes"
	 * @generated
	 * @ordered
	 */
	public static final int MIXED_GNSS_TYPES_VALUE = 7;

	/**
	 * An array of all the '<em><b>GNSS Type Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GNSSTypeEnumeration[] VALUES_ARRAY =
		new GNSSTypeEnumeration[] {
			GPS,
			GLONASS,
			GALILEO,
			BEIDOU,
			IRNSS,
			OTHER,
			DEAD_RECKONING,
			MIXED_GNSS_TYPES,
		};

	/**
	 * A public read-only list of all the '<em><b>GNSS Type Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GNSSTypeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GNSS Type Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GNSSTypeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GNSSTypeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GNSS Type Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GNSSTypeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GNSSTypeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GNSS Type Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GNSSTypeEnumeration get(int value) {
		switch (value) {
			case GPS_VALUE: return GPS;
			case GLONASS_VALUE: return GLONASS;
			case GALILEO_VALUE: return GALILEO;
			case BEIDOU_VALUE: return BEIDOU;
			case IRNSS_VALUE: return IRNSS;
			case OTHER_VALUE: return OTHER;
			case DEAD_RECKONING_VALUE: return DEAD_RECKONING;
			case MIXED_GNSS_TYPES_VALUE: return MIXED_GNSS_TYPES;
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
	private GNSSTypeEnumeration(int value, String name, String literal) {
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
	
} //GNSSTypeEnumeration
