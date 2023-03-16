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
 * A representation of the literals of the enumeration '<em><b>Journey Mode Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Information on the kind of a trip
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.ibis_enumerations.IbisEnumerationsPackage#getJourneyModeEnumeration()
 * @model extendedMetaData="name='JourneyModeEnumeration'"
 * @generated
 */
@ProviderType
public enum JourneyModeEnumeration implements Enumerator {
	/**
	 * The '<em><b>No Trip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TRIP_VALUE
	 * @generated
	 * @ordered
	 */
	NO_TRIP(0, "NoTrip", "NoTrip"),

	/**
	 * The '<em><b>Additional Trip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL_TRIP_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITIONAL_TRIP(1, "AdditionalTrip", "AdditionalTrip"),

	/**
	 * The '<em><b>Service Trip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_TRIP_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_TRIP(2, "ServiceTrip", "ServiceTrip");

	/**
	 * The '<em><b>No Trip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TRIP
	 * @model name="NoTrip"
	 * @generated
	 * @ordered
	 */
	public static final int NO_TRIP_VALUE = 0;

	/**
	 * The '<em><b>Additional Trip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL_TRIP
	 * @model name="AdditionalTrip"
	 * @generated
	 * @ordered
	 */
	public static final int ADDITIONAL_TRIP_VALUE = 1;

	/**
	 * The '<em><b>Service Trip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_TRIP
	 * @model name="ServiceTrip"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_TRIP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Journey Mode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JourneyModeEnumeration[] VALUES_ARRAY =
		new JourneyModeEnumeration[] {
			NO_TRIP,
			ADDITIONAL_TRIP,
			SERVICE_TRIP,
		};

	/**
	 * A public read-only list of all the '<em><b>Journey Mode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JourneyModeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Journey Mode Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JourneyModeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JourneyModeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Journey Mode Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JourneyModeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JourneyModeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Journey Mode Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static JourneyModeEnumeration get(int value) {
		switch (value) {
			case NO_TRIP_VALUE: return NO_TRIP;
			case ADDITIONAL_TRIP_VALUE: return ADDITIONAL_TRIP;
			case SERVICE_TRIP_VALUE: return SERVICE_TRIP;
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
	private JourneyModeEnumeration(int value, String name, String literal) {
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
	
} //JourneyModeEnumeration
