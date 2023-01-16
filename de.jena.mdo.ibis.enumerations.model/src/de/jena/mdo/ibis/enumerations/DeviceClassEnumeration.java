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
 * A representation of the literals of the enumeration '<em><b>Device Class Enumeration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.jena.mdo.ibis.enumerations.IbisEnumerationsPackage#getDeviceClassEnumeration()
 * @model extendedMetaData="name='DeviceClassEnumeration'"
 * @generated
 */
@ProviderType
public enum DeviceClassEnumeration implements Enumerator {
	/**
	 * The '<em><b>On Board Unit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_BOARD_UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	ON_BOARD_UNIT(0, "OnBoardUnit", "OnBoardUnit"),

	/**
	 * The '<em><b>Side Display</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIDE_DISPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	SIDE_DISPLAY(1, "SideDisplay", "SideDisplay"),

	/**
	 * The '<em><b>Front Display</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRONT_DISPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	FRONT_DISPLAY(2, "FrontDisplay", "FrontDisplay"),

	/**
	 * The '<em><b>Interior Display</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERIOR_DISPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	INTERIOR_DISPLAY(3, "InteriorDisplay", "InteriorDisplay"),

	/**
	 * The '<em><b>Validator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATOR_VALUE
	 * @generated
	 * @ordered
	 */
	VALIDATOR(4, "Validator", "Validator"),

	/**
	 * The '<em><b>Ticket Vending Machine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TICKET_VENDING_MACHINE_VALUE
	 * @generated
	 * @ordered
	 */
	TICKET_VENDING_MACHINE(5, "TicketVendingMachine", "TicketVendingMachine"),

	/**
	 * The '<em><b>Announcement System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOUNCEMENT_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	ANNOUNCEMENT_SYSTEM(6, "AnnouncementSystem", "AnnouncementSystem"),

	/**
	 * The '<em><b>MMI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MMI_VALUE
	 * @generated
	 * @ordered
	 */
	MMI(7, "MMI", "MMI"),

	/**
	 * The '<em><b>Video System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	VIDEO_SYSTEM(8, "VideoSystem", "VideoSystem"),

	/**
	 * The '<em><b>APC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APC_VALUE
	 * @generated
	 * @ordered
	 */
	APC(9, "APC", "APC"),

	/**
	 * The '<em><b>Mobile Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILE_INTERFACE(10, "MobileInterface", "MobileInterface"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(11, "Other", "Other"),

	/**
	 * The '<em><b>Test Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_DEVICE(12, "TestDevice", "TestDevice"),

	/**
	 * The '<em><b>Multi Functional Display</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_FUNCTIONAL_DISPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI_FUNCTIONAL_DISPLAY(13, "MultiFunctionalDisplay", "MultiFunctionalDisplay"),

	/**
	 * The '<em><b>Combi Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBI_DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	COMBI_DEVICE(14, "CombiDevice", "CombiDevice");

	/**
	 * The '<em><b>On Board Unit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_BOARD_UNIT
	 * @model name="OnBoardUnit"
	 * @generated
	 * @ordered
	 */
	public static final int ON_BOARD_UNIT_VALUE = 0;

	/**
	 * The '<em><b>Side Display</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIDE_DISPLAY
	 * @model name="SideDisplay"
	 * @generated
	 * @ordered
	 */
	public static final int SIDE_DISPLAY_VALUE = 1;

	/**
	 * The '<em><b>Front Display</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FRONT_DISPLAY
	 * @model name="FrontDisplay"
	 * @generated
	 * @ordered
	 */
	public static final int FRONT_DISPLAY_VALUE = 2;

	/**
	 * The '<em><b>Interior Display</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERIOR_DISPLAY
	 * @model name="InteriorDisplay"
	 * @generated
	 * @ordered
	 */
	public static final int INTERIOR_DISPLAY_VALUE = 3;

	/**
	 * The '<em><b>Validator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALIDATOR
	 * @model name="Validator"
	 * @generated
	 * @ordered
	 */
	public static final int VALIDATOR_VALUE = 4;

	/**
	 * The '<em><b>Ticket Vending Machine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TICKET_VENDING_MACHINE
	 * @model name="TicketVendingMachine"
	 * @generated
	 * @ordered
	 */
	public static final int TICKET_VENDING_MACHINE_VALUE = 5;

	/**
	 * The '<em><b>Announcement System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOUNCEMENT_SYSTEM
	 * @model name="AnnouncementSystem"
	 * @generated
	 * @ordered
	 */
	public static final int ANNOUNCEMENT_SYSTEM_VALUE = 6;

	/**
	 * The '<em><b>MMI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MMI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MMI_VALUE = 7;

	/**
	 * The '<em><b>Video System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIDEO_SYSTEM
	 * @model name="VideoSystem"
	 * @generated
	 * @ordered
	 */
	public static final int VIDEO_SYSTEM_VALUE = 8;

	/**
	 * The '<em><b>APC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APC_VALUE = 9;

	/**
	 * The '<em><b>Mobile Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_INTERFACE
	 * @model name="MobileInterface"
	 * @generated
	 * @ordered
	 */
	public static final int MOBILE_INTERFACE_VALUE = 10;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 11;

	/**
	 * The '<em><b>Test Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_DEVICE
	 * @model name="TestDevice"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_DEVICE_VALUE = 12;

	/**
	 * The '<em><b>Multi Functional Display</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_FUNCTIONAL_DISPLAY
	 * @model name="MultiFunctionalDisplay"
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_FUNCTIONAL_DISPLAY_VALUE = 13;

	/**
	 * The '<em><b>Combi Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMBI_DEVICE
	 * @model name="CombiDevice"
	 * @generated
	 * @ordered
	 */
	public static final int COMBI_DEVICE_VALUE = 14;

	/**
	 * An array of all the '<em><b>Device Class Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceClassEnumeration[] VALUES_ARRAY =
		new DeviceClassEnumeration[] {
			ON_BOARD_UNIT,
			SIDE_DISPLAY,
			FRONT_DISPLAY,
			INTERIOR_DISPLAY,
			VALIDATOR,
			TICKET_VENDING_MACHINE,
			ANNOUNCEMENT_SYSTEM,
			MMI,
			VIDEO_SYSTEM,
			APC,
			MOBILE_INTERFACE,
			OTHER,
			TEST_DEVICE,
			MULTI_FUNCTIONAL_DISPLAY,
			COMBI_DEVICE,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Class Enumeration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceClassEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Class Enumeration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceClassEnumeration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceClassEnumeration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Class Enumeration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceClassEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceClassEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Class Enumeration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceClassEnumeration get(int value) {
		switch (value) {
			case ON_BOARD_UNIT_VALUE: return ON_BOARD_UNIT;
			case SIDE_DISPLAY_VALUE: return SIDE_DISPLAY;
			case FRONT_DISPLAY_VALUE: return FRONT_DISPLAY;
			case INTERIOR_DISPLAY_VALUE: return INTERIOR_DISPLAY;
			case VALIDATOR_VALUE: return VALIDATOR;
			case TICKET_VENDING_MACHINE_VALUE: return TICKET_VENDING_MACHINE;
			case ANNOUNCEMENT_SYSTEM_VALUE: return ANNOUNCEMENT_SYSTEM;
			case MMI_VALUE: return MMI;
			case VIDEO_SYSTEM_VALUE: return VIDEO_SYSTEM;
			case APC_VALUE: return APC;
			case MOBILE_INTERFACE_VALUE: return MOBILE_INTERFACE;
			case OTHER_VALUE: return OTHER;
			case TEST_DEVICE_VALUE: return TEST_DEVICE;
			case MULTI_FUNCTIONAL_DISPLAY_VALUE: return MULTI_FUNCTIONAL_DISPLAY;
			case COMBI_DEVICE_VALUE: return COMBI_DEVICE;
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
	private DeviceClassEnumeration(int value, String name, String literal) {
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
	
} //DeviceClassEnumeration
