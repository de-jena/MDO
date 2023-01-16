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
 * A representation of the literals of the enumeration '<em><b>Self Drive Submode Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Values for SelfDrive MODEs of TRANSPORT: TPEG pti_table_12.
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getSelfDriveSubmodeEnumeration()
 * @model extendedMetaData="name='SelfDriveSubmodeEnumeration'"
 * @generated
 */
@ProviderType
public enum SelfDriveSubmodeEnumeration implements Enumerator {
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
	 * The '<em><b>Hire Car</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIRE_CAR_VALUE
	 * @generated
	 * @ordered
	 */
	HIRE_CAR(2, "hireCar", "hireCar"),

	/**
	 * The '<em><b>Hire Van</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIRE_VAN_VALUE
	 * @generated
	 * @ordered
	 */
	HIRE_VAN(3, "hireVan", "hireVan"),

	/**
	 * The '<em><b>Hire Motorbike</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIRE_MOTORBIKE_VALUE
	 * @generated
	 * @ordered
	 */
	HIRE_MOTORBIKE(4, "hireMotorbike", "hireMotorbike"),

	/**
	 * The '<em><b>Hire Cycle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIRE_CYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	HIRE_CYCLE(5, "hireCycle", "hireCycle"),

	/**
	 * The '<em><b>All Hire Vehicles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_HIRE_VEHICLES_VALUE
	 * @generated
	 * @ordered
	 */
	ALL_HIRE_VEHICLES(6, "allHireVehicles", "allHireVehicles");

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
	 * The '<em><b>Hire Car</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIRE_CAR
	 * @model name="hireCar"
	 * @generated
	 * @ordered
	 */
	public static final int HIRE_CAR_VALUE = 2;

	/**
	 * The '<em><b>Hire Van</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIRE_VAN
	 * @model name="hireVan"
	 * @generated
	 * @ordered
	 */
	public static final int HIRE_VAN_VALUE = 3;

	/**
	 * The '<em><b>Hire Motorbike</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIRE_MOTORBIKE
	 * @model name="hireMotorbike"
	 * @generated
	 * @ordered
	 */
	public static final int HIRE_MOTORBIKE_VALUE = 4;

	/**
	 * The '<em><b>Hire Cycle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIRE_CYCLE
	 * @model name="hireCycle"
	 * @generated
	 * @ordered
	 */
	public static final int HIRE_CYCLE_VALUE = 5;

	/**
	 * The '<em><b>All Hire Vehicles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_HIRE_VEHICLES
	 * @model name="allHireVehicles"
	 * @generated
	 * @ordered
	 */
	public static final int ALL_HIRE_VEHICLES_VALUE = 6;

	/**
	 * An array of all the '<em><b>Self Drive Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SelfDriveSubmodeEnumeration[] VALUES_ARRAY =
		new SelfDriveSubmodeEnumeration[] {
			UNKNOWN,
			UNDEFINED,
			HIRE_CAR,
			HIRE_VAN,
			HIRE_MOTORBIKE,
			HIRE_CYCLE,
			ALL_HIRE_VEHICLES,
		};

	/**
	 * A public read-only list of all the '<em><b>Self Drive Submode Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SelfDriveSubmodeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Self Drive Submode Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SelfDriveSubmodeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SelfDriveSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Self Drive Submode Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SelfDriveSubmodeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SelfDriveSubmodeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Self Drive Submode Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SelfDriveSubmodeEnumeration get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case UNDEFINED_VALUE: return UNDEFINED;
			case HIRE_CAR_VALUE: return HIRE_CAR;
			case HIRE_VAN_VALUE: return HIRE_VAN;
			case HIRE_MOTORBIKE_VALUE: return HIRE_MOTORBIKE;
			case HIRE_CYCLE_VALUE: return HIRE_CYCLE;
			case ALL_HIRE_VEHICLES_VALUE: return ALL_HIRE_VEHICLES;
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
	private SelfDriveSubmodeEnumeration(int value, String name, String literal) {
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
	
} //SelfDriveSubmodeEnumeration
