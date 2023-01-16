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
 * A representation of the literals of the enumeration '<em><b>Coach Submode Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Values for Coach MODEs of TRANSPORT: TPEG pti_table_03.
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getCoachSubmodeEnumeration()
 * @model extendedMetaData="name='CoachSubmodeEnumeration'"
 * @generated
 */
@ProviderType
public enum CoachSubmodeEnumeration implements Enumerator {
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
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(1, "undefined", "undefined"),

	/**
	 * The '<em><b>International Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL_COACH_VALUE
	 * @generated
	 * @ordered
	 */
	INTERNATIONAL_COACH(2, "internationalCoach", "internationalCoach"),

	/**
	 * The '<em><b>National Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_COACH_VALUE
	 * @generated
	 * @ordered
	 */
	NATIONAL_COACH(3, "nationalCoach", "nationalCoach"),

	/**
	 * The '<em><b>Shuttle Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTLE_COACH_VALUE
	 * @generated
	 * @ordered
	 */
	SHUTTLE_COACH(4, "shuttleCoach", "shuttleCoach"),

	/**
	 * The '<em><b>Regional Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_COACH_VALUE
	 * @generated
	 * @ordered
	 */
	REGIONAL_COACH(5, "regionalCoach", "regionalCoach"),

	/**
	 * The '<em><b>Special Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_COACH_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIAL_COACH(6, "specialCoach", "specialCoach"),

	/**
	 * The '<em><b>School Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_COACH_VALUE
	 * @generated
	 * @ordered
	 */
	SCHOOL_COACH(7, "schoolCoach", "schoolCoach"),

	/**
	 * The '<em><b>Sightseeing Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGHTSEEING_COACH_VALUE
	 * @generated
	 * @ordered
	 */
	SIGHTSEEING_COACH(8, "sightseeingCoach", "sightseeingCoach"),

	/**
	 * The '<em><b>Tourist Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOURIST_COACH_VALUE
	 * @generated
	 * @ordered
	 */
	TOURIST_COACH(9, "touristCoach", "touristCoach"),

	/**
	 * The '<em><b>Commuter Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUTER_COACH_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUTER_COACH(10, "commuterCoach", "commuterCoach");

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
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 1;

	/**
	 * The '<em><b>International Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERNATIONAL_COACH
	 * @model name="internationalCoach"
	 * @generated
	 * @ordered
	 */
	public static final int INTERNATIONAL_COACH_VALUE = 2;

	/**
	 * The '<em><b>National Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIONAL_COACH
	 * @model name="nationalCoach"
	 * @generated
	 * @ordered
	 */
	public static final int NATIONAL_COACH_VALUE = 3;

	/**
	 * The '<em><b>Shuttle Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHUTTLE_COACH
	 * @model name="shuttleCoach"
	 * @generated
	 * @ordered
	 */
	public static final int SHUTTLE_COACH_VALUE = 4;

	/**
	 * The '<em><b>Regional Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGIONAL_COACH
	 * @model name="regionalCoach"
	 * @generated
	 * @ordered
	 */
	public static final int REGIONAL_COACH_VALUE = 5;

	/**
	 * The '<em><b>Special Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_COACH
	 * @model name="specialCoach"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_COACH_VALUE = 6;

	/**
	 * The '<em><b>School Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHOOL_COACH
	 * @model name="schoolCoach"
	 * @generated
	 * @ordered
	 */
	public static final int SCHOOL_COACH_VALUE = 7;

	/**
	 * The '<em><b>Sightseeing Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGHTSEEING_COACH
	 * @model name="sightseeingCoach"
	 * @generated
	 * @ordered
	 */
	public static final int SIGHTSEEING_COACH_VALUE = 8;

	/**
	 * The '<em><b>Tourist Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOURIST_COACH
	 * @model name="touristCoach"
	 * @generated
	 * @ordered
	 */
	public static final int TOURIST_COACH_VALUE = 9;

	/**
	 * The '<em><b>Commuter Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUTER_COACH
	 * @model name="commuterCoach"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUTER_COACH_VALUE = 10;

	/**
	 * An array of all the '<em><b>Coach Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CoachSubmodeEnumeration[] VALUES_ARRAY =
		new CoachSubmodeEnumeration[] {
			UNKNOWN,
			UNDEFINED,
			INTERNATIONAL_COACH,
			NATIONAL_COACH,
			SHUTTLE_COACH,
			REGIONAL_COACH,
			SPECIAL_COACH,
			SCHOOL_COACH,
			SIGHTSEEING_COACH,
			TOURIST_COACH,
			COMMUTER_COACH,
		};

	/**
	 * A public read-only list of all the '<em><b>Coach Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CoachSubmodeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coach Submode Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoachSubmodeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoachSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coach Submode Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoachSubmodeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoachSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coach Submode Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoachSubmodeEnumeration get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case UNDEFINED_VALUE: return UNDEFINED;
			case INTERNATIONAL_COACH_VALUE: return INTERNATIONAL_COACH;
			case NATIONAL_COACH_VALUE: return NATIONAL_COACH;
			case SHUTTLE_COACH_VALUE: return SHUTTLE_COACH;
			case REGIONAL_COACH_VALUE: return REGIONAL_COACH;
			case SPECIAL_COACH_VALUE: return SPECIAL_COACH;
			case SCHOOL_COACH_VALUE: return SCHOOL_COACH;
			case SIGHTSEEING_COACH_VALUE: return SIGHTSEEING_COACH;
			case TOURIST_COACH_VALUE: return TOURIST_COACH;
			case COMMUTER_COACH_VALUE: return COMMUTER_COACH;
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
	private CoachSubmodeEnumeration(int value, String name, String literal) {
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
	
} //CoachSubmodeEnumeration
