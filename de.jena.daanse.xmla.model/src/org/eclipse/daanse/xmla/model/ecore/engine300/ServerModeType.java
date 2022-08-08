/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Server Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getServerModeType()
 * @model extendedMetaData="name='ServerMode_._type'"
 * @generated
 */
public enum ServerModeType implements Enumerator {
	/**
	 * The '<em><b>Multidimensional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIDIMENSIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIDIMENSIONAL(0, "Multidimensional", "Multidimensional"),

	/**
	 * The '<em><b>Tabular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABULAR_VALUE
	 * @generated
	 * @ordered
	 */
	TABULAR(1, "Tabular", "Tabular"),

	/**
	 * The '<em><b>Share Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARE_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	SHARE_POINT(2, "SharePoint", "SharePoint");

	/**
	 * The '<em><b>Multidimensional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIDIMENSIONAL
	 * @model name="Multidimensional"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIDIMENSIONAL_VALUE = 0;

	/**
	 * The '<em><b>Tabular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TABULAR
	 * @model name="Tabular"
	 * @generated
	 * @ordered
	 */
	public static final int TABULAR_VALUE = 1;

	/**
	 * The '<em><b>Share Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHARE_POINT
	 * @model name="SharePoint"
	 * @generated
	 * @ordered
	 */
	public static final int SHARE_POINT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Server Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ServerModeType[] VALUES_ARRAY =
		new ServerModeType[] {
			MULTIDIMENSIONAL,
			TABULAR,
			SHARE_POINT,
		};

	/**
	 * A public read-only list of all the '<em><b>Server Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ServerModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Server Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServerModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServerModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Server Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServerModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ServerModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Server Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ServerModeType get(int value) {
		switch (value) {
			case MULTIDIMENSIONAL_VALUE: return MULTIDIMENSIONAL;
			case TABULAR_VALUE: return TABULAR;
			case SHARE_POINT_VALUE: return SHARE_POINT;
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
	private ServerModeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	
} //ServerModeType
