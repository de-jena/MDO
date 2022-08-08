/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Type11</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTypeType11()
 * @model extendedMetaData="name='Type_._11_._type'"
 * @generated
 */
public enum TypeType11 implements Enumerator {
	/**
	 * The '<em><b>Regular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR_VALUE
	 * @generated
	 * @ordered
	 */
	REGULAR(0, "Regular", "Regular"),

	/**
	 * The '<em><b>Exchange Rate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_RATE_VALUE
	 * @generated
	 * @ordered
	 */
	EXCHANGE_RATE(1, "ExchangeRate", "ExchangeRate"),

	/**
	 * The '<em><b>Sales</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALES_VALUE
	 * @generated
	 * @ordered
	 */
	SALES(2, "Sales", "Sales"),

	/**
	 * The '<em><b>Budget</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUDGET_VALUE
	 * @generated
	 * @ordered
	 */
	BUDGET(3, "Budget", "Budget"),

	/**
	 * The '<em><b>Financial Reporting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINANCIAL_REPORTING_VALUE
	 * @generated
	 * @ordered
	 */
	FINANCIAL_REPORTING(4, "FinancialReporting", "FinancialReporting"),

	/**
	 * The '<em><b>Marketing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKETING_VALUE
	 * @generated
	 * @ordered
	 */
	MARKETING(5, "Marketing", "Marketing"),

	/**
	 * The '<em><b>Inventory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVENTORY_VALUE
	 * @generated
	 * @ordered
	 */
	INVENTORY(6, "Inventory", "Inventory");

	/**
	 * The '<em><b>Regular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGULAR
	 * @model name="Regular"
	 * @generated
	 * @ordered
	 */
	public static final int REGULAR_VALUE = 0;

	/**
	 * The '<em><b>Exchange Rate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCHANGE_RATE
	 * @model name="ExchangeRate"
	 * @generated
	 * @ordered
	 */
	public static final int EXCHANGE_RATE_VALUE = 1;

	/**
	 * The '<em><b>Sales</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SALES
	 * @model name="Sales"
	 * @generated
	 * @ordered
	 */
	public static final int SALES_VALUE = 2;

	/**
	 * The '<em><b>Budget</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUDGET
	 * @model name="Budget"
	 * @generated
	 * @ordered
	 */
	public static final int BUDGET_VALUE = 3;

	/**
	 * The '<em><b>Financial Reporting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINANCIAL_REPORTING
	 * @model name="FinancialReporting"
	 * @generated
	 * @ordered
	 */
	public static final int FINANCIAL_REPORTING_VALUE = 4;

	/**
	 * The '<em><b>Marketing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKETING
	 * @model name="Marketing"
	 * @generated
	 * @ordered
	 */
	public static final int MARKETING_VALUE = 5;

	/**
	 * The '<em><b>Inventory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVENTORY
	 * @model name="Inventory"
	 * @generated
	 * @ordered
	 */
	public static final int INVENTORY_VALUE = 6;

	/**
	 * An array of all the '<em><b>Type Type11</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeType11[] VALUES_ARRAY =
		new TypeType11[] {
			REGULAR,
			EXCHANGE_RATE,
			SALES,
			BUDGET,
			FINANCIAL_REPORTING,
			MARKETING,
			INVENTORY,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Type11</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeType11> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Type11</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType11 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType11 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type11</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType11 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeType11 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Type11</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeType11 get(int value) {
		switch (value) {
			case REGULAR_VALUE: return REGULAR;
			case EXCHANGE_RATE_VALUE: return EXCHANGE_RATE;
			case SALES_VALUE: return SALES;
			case BUDGET_VALUE: return BUDGET;
			case FINANCIAL_REPORTING_VALUE: return FINANCIAL_REPORTING;
			case MARKETING_VALUE: return MARKETING;
			case INVENTORY_VALUE: return INVENTORY;
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
	private TypeType11(int value, String name, String literal) {
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
	
} //TypeType11
