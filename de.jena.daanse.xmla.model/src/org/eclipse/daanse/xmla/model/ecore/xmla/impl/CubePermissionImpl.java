/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.CellPermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionPermissionsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReadSourceDataType;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cube Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubePermissionImpl#getReadSourceData <em>Read Source Data</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubePermissionImpl#getDimensionPermissions <em>Dimension Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubePermissionImpl#getCellPermissions <em>Cell Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubePermissionImpl#getWrite <em>Write</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubePermissionImpl extends PermissionImpl implements CubePermission {
	/**
	 * The default value of the '{@link #getReadSourceData() <em>Read Source Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadSourceData()
	 * @generated
	 * @ordered
	 */
	protected static final ReadSourceDataType READ_SOURCE_DATA_EDEFAULT = ReadSourceDataType.NONE;

	/**
	 * The cached value of the '{@link #getReadSourceData() <em>Read Source Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadSourceData()
	 * @generated
	 * @ordered
	 */
	protected ReadSourceDataType readSourceData = READ_SOURCE_DATA_EDEFAULT;

	/**
	 * This is true if the Read Source Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readSourceDataESet;

	/**
	 * The cached value of the '{@link #getDimensionPermissions() <em>Dimension Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionPermissions()
	 * @generated
	 * @ordered
	 */
	protected DimensionPermissionsType1 dimensionPermissions;

	/**
	 * The cached value of the '{@link #getCellPermissions() <em>Cell Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellPermissions()
	 * @generated
	 * @ordered
	 */
	protected CellPermissionsType cellPermissions;

	/**
	 * The default value of the '{@link #getWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected static final WriteType3 WRITE_EDEFAULT = WriteType3.NONE;

	/**
	 * The cached value of the '{@link #getWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrite()
	 * @generated
	 * @ordered
	 */
	protected WriteType3 write = WRITE_EDEFAULT;

	/**
	 * This is true if the Write attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubePermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CUBE_PERMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadSourceDataType getReadSourceData() {
		return readSourceData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadSourceData(ReadSourceDataType newReadSourceData) {
		ReadSourceDataType oldReadSourceData = readSourceData;
		readSourceData = newReadSourceData == null ? READ_SOURCE_DATA_EDEFAULT : newReadSourceData;
		boolean oldReadSourceDataESet = readSourceDataESet;
		readSourceDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_PERMISSION__READ_SOURCE_DATA, oldReadSourceData, readSourceData, !oldReadSourceDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReadSourceData() {
		ReadSourceDataType oldReadSourceData = readSourceData;
		boolean oldReadSourceDataESet = readSourceDataESet;
		readSourceData = READ_SOURCE_DATA_EDEFAULT;
		readSourceDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_PERMISSION__READ_SOURCE_DATA, oldReadSourceData, READ_SOURCE_DATA_EDEFAULT, oldReadSourceDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReadSourceData() {
		return readSourceDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionPermissionsType1 getDimensionPermissions() {
		return dimensionPermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensionPermissions(DimensionPermissionsType1 newDimensionPermissions, NotificationChain msgs) {
		DimensionPermissionsType1 oldDimensionPermissions = dimensionPermissions;
		dimensionPermissions = newDimensionPermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_PERMISSION__DIMENSION_PERMISSIONS, oldDimensionPermissions, newDimensionPermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionPermissions(DimensionPermissionsType1 newDimensionPermissions) {
		if (newDimensionPermissions != dimensionPermissions) {
			NotificationChain msgs = null;
			if (dimensionPermissions != null)
				msgs = ((InternalEObject)dimensionPermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_PERMISSION__DIMENSION_PERMISSIONS, null, msgs);
			if (newDimensionPermissions != null)
				msgs = ((InternalEObject)newDimensionPermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_PERMISSION__DIMENSION_PERMISSIONS, null, msgs);
			msgs = basicSetDimensionPermissions(newDimensionPermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_PERMISSION__DIMENSION_PERMISSIONS, newDimensionPermissions, newDimensionPermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellPermissionsType getCellPermissions() {
		return cellPermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellPermissions(CellPermissionsType newCellPermissions, NotificationChain msgs) {
		CellPermissionsType oldCellPermissions = cellPermissions;
		cellPermissions = newCellPermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_PERMISSION__CELL_PERMISSIONS, oldCellPermissions, newCellPermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellPermissions(CellPermissionsType newCellPermissions) {
		if (newCellPermissions != cellPermissions) {
			NotificationChain msgs = null;
			if (cellPermissions != null)
				msgs = ((InternalEObject)cellPermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_PERMISSION__CELL_PERMISSIONS, null, msgs);
			if (newCellPermissions != null)
				msgs = ((InternalEObject)newCellPermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_PERMISSION__CELL_PERMISSIONS, null, msgs);
			msgs = basicSetCellPermissions(newCellPermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_PERMISSION__CELL_PERMISSIONS, newCellPermissions, newCellPermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteType3 getWrite() {
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrite(WriteType3 newWrite) {
		WriteType3 oldWrite = write;
		write = newWrite == null ? WRITE_EDEFAULT : newWrite;
		boolean oldWriteESet = writeESet;
		writeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_PERMISSION__WRITE, oldWrite, write, !oldWriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWrite() {
		WriteType3 oldWrite = write;
		boolean oldWriteESet = writeESet;
		write = WRITE_EDEFAULT;
		writeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_PERMISSION__WRITE, oldWrite, WRITE_EDEFAULT, oldWriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWrite() {
		return writeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.CUBE_PERMISSION__DIMENSION_PERMISSIONS:
				return basicSetDimensionPermissions(null, msgs);
			case XmlaPackage.CUBE_PERMISSION__CELL_PERMISSIONS:
				return basicSetCellPermissions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.CUBE_PERMISSION__READ_SOURCE_DATA:
				return getReadSourceData();
			case XmlaPackage.CUBE_PERMISSION__DIMENSION_PERMISSIONS:
				return getDimensionPermissions();
			case XmlaPackage.CUBE_PERMISSION__CELL_PERMISSIONS:
				return getCellPermissions();
			case XmlaPackage.CUBE_PERMISSION__WRITE:
				return getWrite();
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
			case XmlaPackage.CUBE_PERMISSION__READ_SOURCE_DATA:
				setReadSourceData((ReadSourceDataType)newValue);
				return;
			case XmlaPackage.CUBE_PERMISSION__DIMENSION_PERMISSIONS:
				setDimensionPermissions((DimensionPermissionsType1)newValue);
				return;
			case XmlaPackage.CUBE_PERMISSION__CELL_PERMISSIONS:
				setCellPermissions((CellPermissionsType)newValue);
				return;
			case XmlaPackage.CUBE_PERMISSION__WRITE:
				setWrite((WriteType3)newValue);
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
			case XmlaPackage.CUBE_PERMISSION__READ_SOURCE_DATA:
				unsetReadSourceData();
				return;
			case XmlaPackage.CUBE_PERMISSION__DIMENSION_PERMISSIONS:
				setDimensionPermissions((DimensionPermissionsType1)null);
				return;
			case XmlaPackage.CUBE_PERMISSION__CELL_PERMISSIONS:
				setCellPermissions((CellPermissionsType)null);
				return;
			case XmlaPackage.CUBE_PERMISSION__WRITE:
				unsetWrite();
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
			case XmlaPackage.CUBE_PERMISSION__READ_SOURCE_DATA:
				return isSetReadSourceData();
			case XmlaPackage.CUBE_PERMISSION__DIMENSION_PERMISSIONS:
				return dimensionPermissions != null;
			case XmlaPackage.CUBE_PERMISSION__CELL_PERMISSIONS:
				return cellPermissions != null;
			case XmlaPackage.CUBE_PERMISSION__WRITE:
				return isSetWrite();
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
		result.append(" (readSourceData: ");
		if (readSourceDataESet) result.append(readSourceData); else result.append("<unset>");
		result.append(", write: ");
		if (writeESet) result.append(write); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CubePermissionImpl
