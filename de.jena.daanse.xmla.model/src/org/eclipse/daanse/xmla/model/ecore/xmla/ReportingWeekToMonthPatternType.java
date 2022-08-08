/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reporting Week To Month Pattern Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportingWeekToMonthPatternType()
 * @model extendedMetaData="name='ReportingWeekToMonthPattern_._type'"
 * @generated
 */
public enum ReportingWeekToMonthPatternType implements Enumerator {
	/**
	 * The '<em><b>Weeks445</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEKS445_VALUE
	 * @generated
	 * @ordered
	 */
	WEEKS445(0, "Weeks445", "Weeks445"),

	/**
	 * The '<em><b>Weeks454</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEKS454_VALUE
	 * @generated
	 * @ordered
	 */
	WEEKS454(1, "Weeks454", "Weeks454"),

	/**
	 * The '<em><b>Weeks544</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEKS544_VALUE
	 * @generated
	 * @ordered
	 */
	WEEKS544(2, "Weeks544", "Weeks544");

	/**
	 * The '<em><b>Weeks445</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEKS445
	 * @model name="Weeks445"
	 * @generated
	 * @ordered
	 */
	public static final int WEEKS445_VALUE = 0;

	/**
	 * The '<em><b>Weeks454</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEKS454
	 * @model name="Weeks454"
	 * @generated
	 * @ordered
	 */
	public static final int WEEKS454_VALUE = 1;

	/**
	 * The '<em><b>Weeks544</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEKS544
	 * @model name="Weeks544"
	 * @generated
	 * @ordered
	 */
	public static final int WEEKS544_VALUE = 2;

	/**
	 * An array of all the '<em><b>Reporting Week To Month Pattern Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReportingWeekToMonthPatternType[] VALUES_ARRAY =
		new ReportingWeekToMonthPatternType[] {
			WEEKS445,
			WEEKS454,
			WEEKS544,
		};

	/**
	 * A public read-only list of all the '<em><b>Reporting Week To Month Pattern Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReportingWeekToMonthPatternType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reporting Week To Month Pattern Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReportingWeekToMonthPatternType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReportingWeekToMonthPatternType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reporting Week To Month Pattern Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReportingWeekToMonthPatternType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReportingWeekToMonthPatternType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reporting Week To Month Pattern Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReportingWeekToMonthPatternType get(int value) {
		switch (value) {
			case WEEKS445_VALUE: return WEEKS445;
			case WEEKS454_VALUE: return WEEKS454;
			case WEEKS544_VALUE: return WEEKS544;
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
	private ReportingWeekToMonthPatternType(int value, String name, String literal) {
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
	
} //ReportingWeekToMonthPatternType
