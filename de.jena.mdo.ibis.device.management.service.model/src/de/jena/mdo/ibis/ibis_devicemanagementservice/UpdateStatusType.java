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
 * A representation of the literals of the enumeration '<em><b>Update Status Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Information about the current status of update
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getUpdateStatusType()
 * @model extendedMetaData="name='UpdateStatusEnumeration'"
 * @generated
 */
@ProviderType
public enum UpdateStatusType implements Enumerator {
	/**
	 * The '<em><b>Update Running</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update in progress
	 * <!-- end-model-doc -->
	 * @see #UPDATE_RUNNING_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_RUNNING(0, "UpdateRunning", "UpdateRunning"),

	/**
	 * The '<em><b>Device Restart Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device has to be restarted by operation RestartDevice
	 * <!-- end-model-doc -->
	 * @see #DEVICE_RESTART_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_RESTART_REQUIRED(1, "DeviceRestartRequired", "DeviceRestartRequired"),

	/**
	 * The '<em><b>Download Update File Failed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified update file could not be downloaded from URL
	 * <!-- end-model-doc -->
	 * @see #DOWNLOAD_UPDATE_FILE_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	DOWNLOAD_UPDATE_FILE_FAILED(2, "DownloadUpdateFileFailed", "DownloadUpdateFileFailed"),

	/**
	 * The '<em><b>Update File Corrupted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified update file is not usable
	 * <!-- end-model-doc -->
	 * @see #UPDATE_FILE_CORRUPTED_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_FILE_CORRUPTED(3, "UpdateFileCorrupted", "UpdateFileCorrupted"),

	/**
	 * The '<em><b>Update Not Necessary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * State of device firmware already as required
	 * <!-- end-model-doc -->
	 * @see #UPDATE_NOT_NECESSARY_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE_NOT_NECESSARY(4, "UpdateNotNecessary", "UpdateNotNecessary"),

	/**
	 * The '<em><b>Installation Failed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update failed e.g. due to memory write error
	 * <!-- end-model-doc -->
	 * @see #INSTALLATION_FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLATION_FAILED(5, "InstallationFailed", "InstallationFailed"),

	/**
	 * The '<em><b>Installation Successful</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update successfully completed
	 * <!-- end-model-doc -->
	 * @see #INSTALLATION_SUCCESSFUL_VALUE
	 * @generated
	 * @ordered
	 */
	INSTALLATION_SUCCESSFUL(6, "InstallationSuccessful", "InstallationSuccessful");

	/**
	 * The '<em><b>Update Running</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update in progress
	 * <!-- end-model-doc -->
	 * @see #UPDATE_RUNNING
	 * @model name="UpdateRunning"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_RUNNING_VALUE = 0;

	/**
	 * The '<em><b>Device Restart Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device has to be restarted by operation RestartDevice
	 * <!-- end-model-doc -->
	 * @see #DEVICE_RESTART_REQUIRED
	 * @model name="DeviceRestartRequired"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_RESTART_REQUIRED_VALUE = 1;

	/**
	 * The '<em><b>Download Update File Failed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified update file could not be downloaded from URL
	 * <!-- end-model-doc -->
	 * @see #DOWNLOAD_UPDATE_FILE_FAILED
	 * @model name="DownloadUpdateFileFailed"
	 * @generated
	 * @ordered
	 */
	public static final int DOWNLOAD_UPDATE_FILE_FAILED_VALUE = 2;

	/**
	 * The '<em><b>Update File Corrupted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified update file is not usable
	 * <!-- end-model-doc -->
	 * @see #UPDATE_FILE_CORRUPTED
	 * @model name="UpdateFileCorrupted"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_FILE_CORRUPTED_VALUE = 3;

	/**
	 * The '<em><b>Update Not Necessary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * State of device firmware already as required
	 * <!-- end-model-doc -->
	 * @see #UPDATE_NOT_NECESSARY
	 * @model name="UpdateNotNecessary"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_NOT_NECESSARY_VALUE = 4;

	/**
	 * The '<em><b>Installation Failed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update failed e.g. due to memory write error
	 * <!-- end-model-doc -->
	 * @see #INSTALLATION_FAILED
	 * @model name="InstallationFailed"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLATION_FAILED_VALUE = 5;

	/**
	 * The '<em><b>Installation Successful</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update successfully completed
	 * <!-- end-model-doc -->
	 * @see #INSTALLATION_SUCCESSFUL
	 * @model name="InstallationSuccessful"
	 * @generated
	 * @ordered
	 */
	public static final int INSTALLATION_SUCCESSFUL_VALUE = 6;

	/**
	 * An array of all the '<em><b>Update Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UpdateStatusType[] VALUES_ARRAY =
		new UpdateStatusType[] {
			UPDATE_RUNNING,
			DEVICE_RESTART_REQUIRED,
			DOWNLOAD_UPDATE_FILE_FAILED,
			UPDATE_FILE_CORRUPTED,
			UPDATE_NOT_NECESSARY,
			INSTALLATION_FAILED,
			INSTALLATION_SUCCESSFUL,
		};

	/**
	 * A public read-only list of all the '<em><b>Update Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UpdateStatusType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Update Status Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UpdateStatusType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UpdateStatusType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Update Status Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UpdateStatusType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UpdateStatusType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Update Status Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UpdateStatusType get(int value) {
		switch (value) {
			case UPDATE_RUNNING_VALUE: return UPDATE_RUNNING;
			case DEVICE_RESTART_REQUIRED_VALUE: return DEVICE_RESTART_REQUIRED;
			case DOWNLOAD_UPDATE_FILE_FAILED_VALUE: return DOWNLOAD_UPDATE_FILE_FAILED;
			case UPDATE_FILE_CORRUPTED_VALUE: return UPDATE_FILE_CORRUPTED;
			case UPDATE_NOT_NECESSARY_VALUE: return UPDATE_NOT_NECESSARY;
			case INSTALLATION_FAILED_VALUE: return INSTALLATION_FAILED;
			case INSTALLATION_SUCCESSFUL_VALUE: return INSTALLATION_SUCCESSFUL;
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
	private UpdateStatusType(int value, String name, String literal) {
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
	
} //UpdateStatusType
