/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fiscal Year Name Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getFiscalYearNameType()
 * @model extendedMetaData="name='FiscalYearName_._type'"
 * @generated
 */
public enum FiscalYearNameType implements Enumerator {
	/**
	 * The '<em><b>Calendar Year Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALENDAR_YEAR_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	CALENDAR_YEAR_NAME(0, "CalendarYearName", "CalendarYearName"),

	/**
	 * The '<em><b>Next Calendar Year Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT_CALENDAR_YEAR_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	NEXT_CALENDAR_YEAR_NAME(1, "NextCalendarYearName", "NextCalendarYearName");

	/**
	 * The '<em><b>Calendar Year Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALENDAR_YEAR_NAME
	 * @model name="CalendarYearName"
	 * @generated
	 * @ordered
	 */
	public static final int CALENDAR_YEAR_NAME_VALUE = 0;

	/**
	 * The '<em><b>Next Calendar Year Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEXT_CALENDAR_YEAR_NAME
	 * @model name="NextCalendarYearName"
	 * @generated
	 * @ordered
	 */
	public static final int NEXT_CALENDAR_YEAR_NAME_VALUE = 1;

	/**
	 * An array of all the '<em><b>Fiscal Year Name Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FiscalYearNameType[] VALUES_ARRAY =
		new FiscalYearNameType[] {
			CALENDAR_YEAR_NAME,
			NEXT_CALENDAR_YEAR_NAME,
		};

	/**
	 * A public read-only list of all the '<em><b>Fiscal Year Name Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FiscalYearNameType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fiscal Year Name Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FiscalYearNameType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FiscalYearNameType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fiscal Year Name Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FiscalYearNameType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FiscalYearNameType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fiscal Year Name Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FiscalYearNameType get(int value) {
		switch (value) {
			case CALENDAR_YEAR_NAME_VALUE: return CALENDAR_YEAR_NAME;
			case NEXT_CALENDAR_YEAR_NAME_VALUE: return NEXT_CALENDAR_YEAR_NAME;
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
	private FiscalYearNameType(int value, String name, String literal) {
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
	
} //FiscalYearNameType
