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
 * A representation of the literals of the enumeration '<em><b>Error Code Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getErrorCodeEnumeration()
 * @model extendedMetaData="name='ErrorCodeEnumeration'"
 * @generated
 */
@ProviderType
public enum ErrorCodeEnumeration implements Enumerator {
	/**
	 * The '<em><b>Data Estimated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ESTIMATED_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_ESTIMATED(0, "DataEstimated", "DataEstimated"),

	/**
	 * The '<em><b>Fault Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAULT_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	FAULT_DATA(1, "FaultData", "FaultData"),

	/**
	 * The '<em><b>No Schedule Data Available</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SCHEDULE_DATA_AVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SCHEDULE_DATA_AVAILABLE(2, "NoScheduleDataAvailable", "NoScheduleDataAvailable"),

	/**
	 * The '<em><b>Device Missing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_MISSING_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_MISSING(3, "DeviceMissing", "DeviceMissing"),

	/**
	 * The '<em><b>No Service Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SERVICE_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SERVICE_RESPONSE(4, "NoServiceResponse", "NoServiceResponse"),

	/**
	 * The '<em><b>Important Data Not Available</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPORTANT_DATA_NOT_AVAILABLE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPORTANT_DATA_NOT_AVAILABLE(5, "ImportantDataNotAvailable", "ImportantDataNotAvailable"),

	/**
	 * The '<em><b>Data Not Valid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_NOT_VALID_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_NOT_VALID(6, "DataNotValid", "DataNotValid"),

	/**
	 * The '<em><b>Operation Not Supported</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_NOT_SUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_NOT_SUPPORTED(7, "OperationNotSupported", "OperationNotSupported");

	/**
	 * The '<em><b>Data Estimated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_ESTIMATED
	 * @model name="DataEstimated"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_ESTIMATED_VALUE = 0;

	/**
	 * The '<em><b>Fault Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAULT_DATA
	 * @model name="FaultData"
	 * @generated
	 * @ordered
	 */
	public static final int FAULT_DATA_VALUE = 1;

	/**
	 * The '<em><b>No Schedule Data Available</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SCHEDULE_DATA_AVAILABLE
	 * @model name="NoScheduleDataAvailable"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SCHEDULE_DATA_AVAILABLE_VALUE = 2;

	/**
	 * The '<em><b>Device Missing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_MISSING
	 * @model name="DeviceMissing"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_MISSING_VALUE = 3;

	/**
	 * The '<em><b>No Service Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SERVICE_RESPONSE
	 * @model name="NoServiceResponse"
	 * @generated
	 * @ordered
	 */
	public static final int NO_SERVICE_RESPONSE_VALUE = 4;

	/**
	 * The '<em><b>Important Data Not Available</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPORTANT_DATA_NOT_AVAILABLE
	 * @model name="ImportantDataNotAvailable"
	 * @generated
	 * @ordered
	 */
	public static final int IMPORTANT_DATA_NOT_AVAILABLE_VALUE = 5;

	/**
	 * The '<em><b>Data Not Valid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_NOT_VALID
	 * @model name="DataNotValid"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_NOT_VALID_VALUE = 6;

	/**
	 * The '<em><b>Operation Not Supported</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_NOT_SUPPORTED
	 * @model name="OperationNotSupported"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_NOT_SUPPORTED_VALUE = 7;

	/**
	 * An array of all the '<em><b>Error Code Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ErrorCodeEnumeration[] VALUES_ARRAY =
		new ErrorCodeEnumeration[] {
			DATA_ESTIMATED,
			FAULT_DATA,
			NO_SCHEDULE_DATA_AVAILABLE,
			DEVICE_MISSING,
			NO_SERVICE_RESPONSE,
			IMPORTANT_DATA_NOT_AVAILABLE,
			DATA_NOT_VALID,
			OPERATION_NOT_SUPPORTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Error Code Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ErrorCodeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Error Code Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ErrorCodeEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ErrorCodeEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Error Code Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ErrorCodeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ErrorCodeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Error Code Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ErrorCodeEnumeration get(int value) {
		switch (value) {
			case DATA_ESTIMATED_VALUE: return DATA_ESTIMATED;
			case FAULT_DATA_VALUE: return FAULT_DATA;
			case NO_SCHEDULE_DATA_AVAILABLE_VALUE: return NO_SCHEDULE_DATA_AVAILABLE;
			case DEVICE_MISSING_VALUE: return DEVICE_MISSING;
			case NO_SERVICE_RESPONSE_VALUE: return NO_SERVICE_RESPONSE;
			case IMPORTANT_DATA_NOT_AVAILABLE_VALUE: return IMPORTANT_DATA_NOT_AVAILABLE;
			case DATA_NOT_VALID_VALUE: return DATA_NOT_VALID;
			case OPERATION_NOT_SUPPORTED_VALUE: return OPERATION_NOT_SUPPORTED;
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
	private ErrorCodeEnumeration(int value, String name, String literal) {
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
	
} //ErrorCodeEnumeration
