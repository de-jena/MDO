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
 * A representation of the literals of the enumeration '<em><b>Checksum Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Types of checksum
 * <!-- end-model-doc -->
 * @see de.jena.mdo.ibis.ibis_devicemanagementservice.IbisDeviceManagementServicePackage#getChecksumType()
 * @model extendedMetaData="name='ChecksumTypeEnumeration'"
 * @generated
 */
@ProviderType
public enum ChecksumType implements Enumerator {
	/**
	 * The '<em><b>CRC32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cyclic redundancy check, 32-bit
	 * <!-- end-model-doc -->
	 * @see #CRC32_VALUE
	 * @generated
	 * @ordered
	 */
	CRC32(0, "CRC32", "CRC32"),

	/**
	 * The '<em><b>MD5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Message digest algorithm 5, 128-bit
	 * <!-- end-model-doc -->
	 * @see #MD5_VALUE
	 * @generated
	 * @ordered
	 */
	MD5(1, "MD5", "MD5"),

	/**
	 * The '<em><b>SHA256</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secure hash algorithm, 256-bit
	 * <!-- end-model-doc -->
	 * @see #SHA256_VALUE
	 * @generated
	 * @ordered
	 */
	SHA256(2, "SHA256", "SHA256");

	/**
	 * The '<em><b>CRC32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cyclic redundancy check, 32-bit
	 * <!-- end-model-doc -->
	 * @see #CRC32
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRC32_VALUE = 0;

	/**
	 * The '<em><b>MD5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Message digest algorithm 5, 128-bit
	 * <!-- end-model-doc -->
	 * @see #MD5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MD5_VALUE = 1;

	/**
	 * The '<em><b>SHA256</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Secure hash algorithm, 256-bit
	 * <!-- end-model-doc -->
	 * @see #SHA256
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHA256_VALUE = 2;

	/**
	 * An array of all the '<em><b>Checksum Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChecksumType[] VALUES_ARRAY =
		new ChecksumType[] {
			CRC32,
			MD5,
			SHA256,
		};

	/**
	 * A public read-only list of all the '<em><b>Checksum Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChecksumType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Checksum Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChecksumType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChecksumType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Checksum Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChecksumType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChecksumType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Checksum Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChecksumType get(int value) {
		switch (value) {
			case CRC32_VALUE: return CRC32;
			case MD5_VALUE: return MD5;
			case SHA256_VALUE: return SHA256;
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
	private ChecksumType(int value, String name, String literal) {
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
	
} //ChecksumType
