/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ColumnTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ColumnTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ColumnTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ColumnTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ColumnTypeImpl#isFilterable <em>Filterable</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ColumnTypeImpl#isRepeatable <em>Repeatable</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ColumnTypeImpl#isRepeatedBase <em>Repeated Base</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnTypeImpl extends MinimalEObjectImpl.Container implements ColumnType {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BigInteger type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isFilterable() <em>Filterable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTERABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFilterable() <em>Filterable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterable()
	 * @generated
	 * @ordered
	 */
	protected boolean filterable = FILTERABLE_EDEFAULT;

	/**
	 * This is true if the Filterable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean filterableESet;

	/**
	 * The default value of the '{@link #isRepeatable() <em>Repeatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeatable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPEATABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepeatable() <em>Repeatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeatable()
	 * @generated
	 * @ordered
	 */
	protected boolean repeatable = REPEATABLE_EDEFAULT;

	/**
	 * This is true if the Repeatable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repeatableESet;

	/**
	 * The default value of the '{@link #isRepeatedBase() <em>Repeated Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeatedBase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPEATED_BASE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRepeatedBase() <em>Repeated Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRepeatedBase()
	 * @generated
	 * @ordered
	 */
	protected boolean repeatedBase = REPEATED_BASE_EDEFAULT;

	/**
	 * This is true if the Repeated Base attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean repeatedBaseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.COLUMN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(BigInteger newID) {
		BigInteger oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COLUMN_TYPE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BigInteger newType) {
		BigInteger oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COLUMN_TYPE__TYPE, oldType, type));
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COLUMN_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COLUMN_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFilterable() {
		return filterable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterable(boolean newFilterable) {
		boolean oldFilterable = filterable;
		filterable = newFilterable;
		boolean oldFilterableESet = filterableESet;
		filterableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COLUMN_TYPE__FILTERABLE, oldFilterable, filterable, !oldFilterableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilterable() {
		boolean oldFilterable = filterable;
		boolean oldFilterableESet = filterableESet;
		filterable = FILTERABLE_EDEFAULT;
		filterableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.COLUMN_TYPE__FILTERABLE, oldFilterable, FILTERABLE_EDEFAULT, oldFilterableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilterable() {
		return filterableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepeatable() {
		return repeatable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatable(boolean newRepeatable) {
		boolean oldRepeatable = repeatable;
		repeatable = newRepeatable;
		boolean oldRepeatableESet = repeatableESet;
		repeatableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COLUMN_TYPE__REPEATABLE, oldRepeatable, repeatable, !oldRepeatableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepeatable() {
		boolean oldRepeatable = repeatable;
		boolean oldRepeatableESet = repeatableESet;
		repeatable = REPEATABLE_EDEFAULT;
		repeatableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.COLUMN_TYPE__REPEATABLE, oldRepeatable, REPEATABLE_EDEFAULT, oldRepeatableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepeatable() {
		return repeatableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRepeatedBase() {
		return repeatedBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatedBase(boolean newRepeatedBase) {
		boolean oldRepeatedBase = repeatedBase;
		repeatedBase = newRepeatedBase;
		boolean oldRepeatedBaseESet = repeatedBaseESet;
		repeatedBaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.COLUMN_TYPE__REPEATED_BASE, oldRepeatedBase, repeatedBase, !oldRepeatedBaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRepeatedBase() {
		boolean oldRepeatedBase = repeatedBase;
		boolean oldRepeatedBaseESet = repeatedBaseESet;
		repeatedBase = REPEATED_BASE_EDEFAULT;
		repeatedBaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.COLUMN_TYPE__REPEATED_BASE, oldRepeatedBase, REPEATED_BASE_EDEFAULT, oldRepeatedBaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepeatedBase() {
		return repeatedBaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.COLUMN_TYPE__ID:
				return getID();
			case XmlaPackage.COLUMN_TYPE__TYPE:
				return getType();
			case XmlaPackage.COLUMN_TYPE__NAME:
				return getName();
			case XmlaPackage.COLUMN_TYPE__DESCRIPTION:
				return getDescription();
			case XmlaPackage.COLUMN_TYPE__FILTERABLE:
				return isFilterable();
			case XmlaPackage.COLUMN_TYPE__REPEATABLE:
				return isRepeatable();
			case XmlaPackage.COLUMN_TYPE__REPEATED_BASE:
				return isRepeatedBase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.COLUMN_TYPE__ID:
				setID((BigInteger)newValue);
				return;
			case XmlaPackage.COLUMN_TYPE__TYPE:
				setType((BigInteger)newValue);
				return;
			case XmlaPackage.COLUMN_TYPE__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.COLUMN_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.COLUMN_TYPE__FILTERABLE:
				setFilterable((Boolean)newValue);
				return;
			case XmlaPackage.COLUMN_TYPE__REPEATABLE:
				setRepeatable((Boolean)newValue);
				return;
			case XmlaPackage.COLUMN_TYPE__REPEATED_BASE:
				setRepeatedBase((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmlaPackage.COLUMN_TYPE__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.COLUMN_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XmlaPackage.COLUMN_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.COLUMN_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.COLUMN_TYPE__FILTERABLE:
				unsetFilterable();
				return;
			case XmlaPackage.COLUMN_TYPE__REPEATABLE:
				unsetRepeatable();
				return;
			case XmlaPackage.COLUMN_TYPE__REPEATED_BASE:
				unsetRepeatedBase();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmlaPackage.COLUMN_TYPE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.COLUMN_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XmlaPackage.COLUMN_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.COLUMN_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.COLUMN_TYPE__FILTERABLE:
				return isSetFilterable();
			case XmlaPackage.COLUMN_TYPE__REPEATABLE:
				return isSetRepeatable();
			case XmlaPackage.COLUMN_TYPE__REPEATED_BASE:
				return isSetRepeatedBase();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (iD: ");
		result.append(iD);
		result.append(", type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", filterable: ");
		if (filterableESet) result.append(filterable); else result.append("<unset>");
		result.append(", repeatable: ");
		if (repeatableESet) result.append(repeatable); else result.append("<unset>");
		result.append(", repeatedBase: ");
		if (repeatedBaseESet) result.append(repeatedBase); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ColumnTypeImpl
