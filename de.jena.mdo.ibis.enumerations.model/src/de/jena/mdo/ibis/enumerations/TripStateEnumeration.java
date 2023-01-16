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
 * A representation of the literals of the enumeration '<em><b>Trip State Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Information about trip state,
 * 			EmptyRun: trips is selected but has not yet started ( e.g. drive from depot to first stop point )
 * 			OnTrip: on trip ,
 * 			OffTrip: trip has ended there is no next trip yet, ( e.g. drive to the depot )
 * 			TripBreak: trip has already started but there is a break now it will be continued ( e.g. driver break),
 * 			OffDuty: no trip, bus parked ( e.g. driver has logged of, OBU still running )
 * 			
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getTripStateEnumeration()
 * @model extendedMetaData="name='TripStateEnumeration'"
 * @generated
 */
@ProviderType
public enum TripStateEnumeration implements Enumerator {
	/**
	 * The '<em><b>Empty Run</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPTY_RUN_VALUE
	 * @generated
	 * @ordered
	 */
	EMPTY_RUN(0, "EmptyRun", "EmptyRun"),

	/**
	 * The '<em><b>On Trip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_TRIP_VALUE
	 * @generated
	 * @ordered
	 */
	ON_TRIP(1, "OnTrip", "OnTrip"),

	/**
	 * The '<em><b>Off Trip</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_TRIP_VALUE
	 * @generated
	 * @ordered
	 */
	OFF_TRIP(2, "OffTrip", "OffTrip"),

	/**
	 * The '<em><b>Trip Break</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIP_BREAK_VALUE
	 * @generated
	 * @ordered
	 */
	TRIP_BREAK(3, "TripBreak", "TripBreak"),

	/**
	 * The '<em><b>Off Duty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_DUTY_VALUE
	 * @generated
	 * @ordered
	 */
	OFF_DUTY(4, "OffDuty", "OffDuty"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(5, "unknown", "unknown");

	/**
	 * The '<em><b>Empty Run</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPTY_RUN
	 * @model name="EmptyRun"
	 * @generated
	 * @ordered
	 */
	public static final int EMPTY_RUN_VALUE = 0;

	/**
	 * The '<em><b>On Trip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_TRIP
	 * @model name="OnTrip"
	 * @generated
	 * @ordered
	 */
	public static final int ON_TRIP_VALUE = 1;

	/**
	 * The '<em><b>Off Trip</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_TRIP
	 * @model name="OffTrip"
	 * @generated
	 * @ordered
	 */
	public static final int OFF_TRIP_VALUE = 2;

	/**
	 * The '<em><b>Trip Break</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIP_BREAK
	 * @model name="TripBreak"
	 * @generated
	 * @ordered
	 */
	public static final int TRIP_BREAK_VALUE = 3;

	/**
	 * The '<em><b>Off Duty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_DUTY
	 * @model name="OffDuty"
	 * @generated
	 * @ordered
	 */
	public static final int OFF_DUTY_VALUE = 4;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Trip State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TripStateEnumeration[] VALUES_ARRAY =
		new TripStateEnumeration[] {
			EMPTY_RUN,
			ON_TRIP,
			OFF_TRIP,
			TRIP_BREAK,
			OFF_DUTY,
			UNKNOWN,
		};

	/**
	 * A public read-only list of all the '<em><b>Trip State Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TripStateEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trip State Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TripStateEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TripStateEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trip State Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TripStateEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TripStateEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trip State Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TripStateEnumeration get(int value) {
		switch (value) {
			case EMPTY_RUN_VALUE: return EMPTY_RUN;
			case ON_TRIP_VALUE: return ON_TRIP;
			case OFF_TRIP_VALUE: return OFF_TRIP;
			case TRIP_BREAK_VALUE: return TRIP_BREAK;
			case OFF_DUTY_VALUE: return OFF_DUTY;
			case UNKNOWN_VALUE: return UNKNOWN;
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
	private TripStateEnumeration(int value, String name, String literal) {
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
	
} //TripStateEnumeration
