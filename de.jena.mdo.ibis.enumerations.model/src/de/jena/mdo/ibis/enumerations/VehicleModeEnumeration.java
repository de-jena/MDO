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
 * A representation of the literals of the enumeration '<em><b>Vehicle Mode Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getVehicleModeEnumeration()
 * @model extendedMetaData="name='VehicleModeEnumeration'"
 * @generated
 */
@ProviderType
public enum VehicleModeEnumeration implements Enumerator {
	/**
	 * The '<em><b>Air</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_VALUE
	 * @generated
	 * @ordered
	 */
	AIR(0, "air", "air"),

	/**
	 * The '<em><b>Bus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS_VALUE
	 * @generated
	 * @ordered
	 */
	BUS(1, "bus", "bus"),

	/**
	 * The '<em><b>Coach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COACH_VALUE
	 * @generated
	 * @ordered
	 */
	COACH(2, "coach", "coach"),

	/**
	 * The '<em><b>Ferry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FERRY_VALUE
	 * @generated
	 * @ordered
	 */
	FERRY(3, "ferry", "ferry"),

	/**
	 * The '<em><b>Metro</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METRO_VALUE
	 * @generated
	 * @ordered
	 */
	METRO(4, "metro", "metro"),

	/**
	 * The '<em><b>Rail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL_VALUE
	 * @generated
	 * @ordered
	 */
	RAIL(5, "rail", "rail"),

	/**
	 * The '<em><b>Tram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM_VALUE
	 * @generated
	 * @ordered
	 */
	TRAM(6, "tram", "tram"),

	/**
	 * The '<em><b>Underground</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERGROUND(7, "underground", "underground");

	/**
	 * The '<em><b>Air</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR
	 * @model name="air"
	 * @generated
	 * @ordered
	 */
	public static final int AIR_VALUE = 0;

	/**
	 * The '<em><b>Bus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUS
	 * @model name="bus"
	 * @generated
	 * @ordered
	 */
	public static final int BUS_VALUE = 1;

	/**
	 * The '<em><b>Coach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COACH
	 * @model name="coach"
	 * @generated
	 * @ordered
	 */
	public static final int COACH_VALUE = 2;

	/**
	 * The '<em><b>Ferry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FERRY
	 * @model name="ferry"
	 * @generated
	 * @ordered
	 */
	public static final int FERRY_VALUE = 3;

	/**
	 * The '<em><b>Metro</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METRO
	 * @model name="metro"
	 * @generated
	 * @ordered
	 */
	public static final int METRO_VALUE = 4;

	/**
	 * The '<em><b>Rail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIL
	 * @model name="rail"
	 * @generated
	 * @ordered
	 */
	public static final int RAIL_VALUE = 5;

	/**
	 * The '<em><b>Tram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAM
	 * @model name="tram"
	 * @generated
	 * @ordered
	 */
	public static final int TRAM_VALUE = 6;

	/**
	 * The '<em><b>Underground</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERGROUND
	 * @model name="underground"
	 * @generated
	 * @ordered
	 */
	public static final int UNDERGROUND_VALUE = 7;

	/**
	 * An array of all the '<em><b>Vehicle Mode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VehicleModeEnumeration[] VALUES_ARRAY =
		new VehicleModeEnumeration[] {
			AIR,
			BUS,
			COACH,
			FERRY,
			METRO,
			RAIL,
			TRAM,
			UNDERGROUND,
		};

	/**
	 * A public read-only list of all the '<em><b>Vehicle Mode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VehicleModeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Vehicle Mode Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleModeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VehicleModeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vehicle Mode Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleModeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VehicleModeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Vehicle Mode Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VehicleModeEnumeration get(int value) {
		switch (value) {
			case AIR_VALUE: return AIR;
			case BUS_VALUE: return BUS;
			case COACH_VALUE: return COACH;
			case FERRY_VALUE: return FERRY;
			case METRO_VALUE: return METRO;
			case RAIL_VALUE: return RAIL;
			case TRAM_VALUE: return TRAM;
			case UNDERGROUND_VALUE: return UNDERGROUND;
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
	private VehicleModeEnumeration(int value, String name, String literal) {
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
	
} //VehicleModeEnumeration
