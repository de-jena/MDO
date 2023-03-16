/*
 */
package de.jena.mdo.ibis.ibis_devicemanagementservice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Update Accept Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Information about the result of InstallUpdate
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getUpdateAcceptType()
 * @model extendedMetaData="name='UpdateAcceptEnumeration'"
 * @generated
 */
@ProviderType
public enum UpdateAcceptType implements Enumerator {
	/**
	 * The '<em><b>Update Accepted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update will be performed
	 * <!-- end-model-doc -->
	 * @see #UPDATE_ACCEPTED_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_ACCEPTED(0, "UpdateAccepted", "UpdateAccepted"),

	/**
	 * The '<em><b>URL Type Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL type has been rejected, e.g. FTP may not supported by some devices
	 * <!-- end-model-doc -->
	 * @see #URL_TYPE_UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	URL_TYPE_UNKNOWN(1, "URLTypeUnknown", "URLTypeUnknown"),

	/**
	 * The '<em><b>No Updates Allowed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No updates are possible
	 * <!-- end-model-doc -->
	 * @see #NO_UPDATES_ALLOWED_VALUE
	 * @generated
	 * @ordered
	 */
	NO_UPDATES_ALLOWED(2, "NoUpdatesAllowed", "NoUpdatesAllowed"),

	/**
	 * The '<em><b>To Be Postponed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update has to be postponed
	 * <!-- end-model-doc -->
	 * @see #TO_BE_POSTPONED_VALUE
	 * @generated
	 * @ordered
	 */
	TO_BE_POSTPONED(3, "ToBePostponed", "ToBePostponed");

	/**
	 * The '<em><b>Update Accepted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update will be performed
	 * <!-- end-model-doc -->
	 * @see #UPDATE_ACCEPTED
	 * @model name="UpdateAccepted"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_ACCEPTED_VALUE = 0;

	/**
	 * The '<em><b>URL Type Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL type has been rejected, e.g. FTP may not supported by some devices
	 * <!-- end-model-doc -->
	 * @see #URL_TYPE_UNKNOWN
	 * @model name="URLTypeUnknown"
	 * @generated
	 * @ordered
	 */
	public static final int URL_TYPE_UNKNOWN_VALUE = 1;

	/**
	 * The '<em><b>No Updates Allowed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No updates are possible
	 * <!-- end-model-doc -->
	 * @see #NO_UPDATES_ALLOWED
	 * @model name="NoUpdatesAllowed"
	 * @generated
	 * @ordered
	 */
	public static final int NO_UPDATES_ALLOWED_VALUE = 2;

	/**
	 * The '<em><b>To Be Postponed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update has to be postponed
	 * <!-- end-model-doc -->
	 * @see #TO_BE_POSTPONED
	 * @model name="ToBePostponed"
	 * @generated
	 * @ordered
	 */
	public static final int TO_BE_POSTPONED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Update Accept Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UpdateAcceptType[] VALUES_ARRAY =
		new UpdateAcceptType[] {
			UPDATE_ACCEPTED,
			URL_TYPE_UNKNOWN,
			NO_UPDATES_ALLOWED,
			TO_BE_POSTPONED,
		};

	/**
	 * A public read-only list of all the '<em><b>Update Accept Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UpdateAcceptType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Update Accept Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UpdateAcceptType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UpdateAcceptType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Update Accept Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UpdateAcceptType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UpdateAcceptType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Update Accept Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UpdateAcceptType get(int value) {
		switch (value) {
			case UPDATE_ACCEPTED_VALUE: return UPDATE_ACCEPTED;
			case URL_TYPE_UNKNOWN_VALUE: return URL_TYPE_UNKNOWN;
			case NO_UPDATES_ALLOWED_VALUE: return NO_UPDATES_ALLOWED;
			case TO_BE_POSTPONED_VALUE: return TO_BE_POSTPONED;
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
	private UpdateAcceptType(int value, String name, String literal) {
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
	
} //UpdateAcceptType
