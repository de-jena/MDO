/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Target Type Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTargetTypeType1()
 * @model extendedMetaData="name='TargetType_._1_._type'"
 * @generated
 */
public enum TargetTypeType1 implements Enumerator {
	/**
	 * The '<em><b>Cube</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE_VALUE
	 * @generated
	 * @ordered
	 */
	CUBE(0, "Cube", "Cube"),

	/**
	 * The '<em><b>Cells</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLS_VALUE
	 * @generated
	 * @ordered
	 */
	CELLS(1, "Cells", "Cells"),

	/**
	 * The '<em><b>Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_VALUE
	 * @generated
	 * @ordered
	 */
	SET(2, "Set", "Set"),

	/**
	 * The '<em><b>Hierarchy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIERARCHY_VALUE
	 * @generated
	 * @ordered
	 */
	HIERARCHY(3, "Hierarchy", "Hierarchy"),

	/**
	 * The '<em><b>Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL(4, "Level", "Level"),

	/**
	 * The '<em><b>Dimension Members</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIMENSION_MEMBERS_VALUE
	 * @generated
	 * @ordered
	 */
	DIMENSION_MEMBERS(5, "DimensionMembers", "DimensionMembers"),

	/**
	 * The '<em><b>Hierarchy Members</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIERARCHY_MEMBERS_VALUE
	 * @generated
	 * @ordered
	 */
	HIERARCHY_MEMBERS(6, "HierarchyMembers", "HierarchyMembers"),

	/**
	 * The '<em><b>Level Members</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_MEMBERS_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL_MEMBERS(7, "LevelMembers", "LevelMembers"),

	/**
	 * The '<em><b>Attribute Members</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_MEMBERS_VALUE
	 * @generated
	 * @ordered
	 */
	ATTRIBUTE_MEMBERS(8, "AttributeMembers", "AttributeMembers");

	/**
	 * The '<em><b>Cube</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUBE
	 * @model name="Cube"
	 * @generated
	 * @ordered
	 */
	public static final int CUBE_VALUE = 0;

	/**
	 * The '<em><b>Cells</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLS
	 * @model name="Cells"
	 * @generated
	 * @ordered
	 */
	public static final int CELLS_VALUE = 1;

	/**
	 * The '<em><b>Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET
	 * @model name="Set"
	 * @generated
	 * @ordered
	 */
	public static final int SET_VALUE = 2;

	/**
	 * The '<em><b>Hierarchy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIERARCHY
	 * @model name="Hierarchy"
	 * @generated
	 * @ordered
	 */
	public static final int HIERARCHY_VALUE = 3;

	/**
	 * The '<em><b>Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL
	 * @model name="Level"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_VALUE = 4;

	/**
	 * The '<em><b>Dimension Members</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIMENSION_MEMBERS
	 * @model name="DimensionMembers"
	 * @generated
	 * @ordered
	 */
	public static final int DIMENSION_MEMBERS_VALUE = 5;

	/**
	 * The '<em><b>Hierarchy Members</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIERARCHY_MEMBERS
	 * @model name="HierarchyMembers"
	 * @generated
	 * @ordered
	 */
	public static final int HIERARCHY_MEMBERS_VALUE = 6;

	/**
	 * The '<em><b>Level Members</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL_MEMBERS
	 * @model name="LevelMembers"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL_MEMBERS_VALUE = 7;

	/**
	 * The '<em><b>Attribute Members</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTRIBUTE_MEMBERS
	 * @model name="AttributeMembers"
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_MEMBERS_VALUE = 8;

	/**
	 * An array of all the '<em><b>Target Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TargetTypeType1[] VALUES_ARRAY =
		new TargetTypeType1[] {
			CUBE,
			CELLS,
			SET,
			HIERARCHY,
			LEVEL,
			DIMENSION_MEMBERS,
			HIERARCHY_MEMBERS,
			LEVEL_MEMBERS,
			ATTRIBUTE_MEMBERS,
		};

	/**
	 * A public read-only list of all the '<em><b>Target Type Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TargetTypeType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Target Type Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TargetTypeType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TargetTypeType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Target Type Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TargetTypeType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TargetTypeType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Target Type Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TargetTypeType1 get(int value) {
		switch (value) {
			case CUBE_VALUE: return CUBE;
			case CELLS_VALUE: return CELLS;
			case SET_VALUE: return SET;
			case HIERARCHY_VALUE: return HIERARCHY;
			case LEVEL_VALUE: return LEVEL;
			case DIMENSION_MEMBERS_VALUE: return DIMENSION_MEMBERS;
			case HIERARCHY_MEMBERS_VALUE: return HIERARCHY_MEMBERS;
			case LEVEL_MEMBERS_VALUE: return LEVEL_MEMBERS;
			case ATTRIBUTE_MEMBERS_VALUE: return ATTRIBUTE_MEMBERS;
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
	private TargetTypeType1(int value, String name, String literal) {
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
	
} //TargetTypeType1
