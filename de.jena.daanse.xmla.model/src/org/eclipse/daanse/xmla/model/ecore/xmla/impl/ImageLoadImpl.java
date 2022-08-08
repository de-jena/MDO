/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType;

import org.eclipse.daanse.xmla.model.ecore.xmla.DataType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.ImageLoad;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ImageLoadImpl#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ImageLoadImpl#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ImageLoadImpl#getImageUniqueID <em>Image Unique ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ImageLoadImpl#getImageVersion <em>Image Version</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ImageLoadImpl#getReadWriteMode <em>Read Write Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ImageLoadImpl#getDbStorageLocation <em>Db Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ImageLoadImpl#getDatabaseName <em>Database Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ImageLoadImpl#getDatabaseID <em>Database ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ImageLoadImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageLoadImpl extends MinimalEObjectImpl.Container implements ImageLoad {
	/**
	 * The default value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected String imagePath = IMAGE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String imageUrl = IMAGE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageUniqueID() <em>Image Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUniqueID()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_UNIQUE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageUniqueID() <em>Image Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUniqueID()
	 * @generated
	 * @ordered
	 */
	protected String imageUniqueID = IMAGE_UNIQUE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageVersion() <em>Image Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageVersion() <em>Image Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageVersion()
	 * @generated
	 * @ordered
	 */
	protected String imageVersion = IMAGE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadWriteMode() <em>Read Write Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadWriteMode()
	 * @generated
	 * @ordered
	 */
	protected static final ReadWriteModeType READ_WRITE_MODE_EDEFAULT = ReadWriteModeType.READ_WRITE;

	/**
	 * The cached value of the '{@link #getReadWriteMode() <em>Read Write Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadWriteMode()
	 * @generated
	 * @ordered
	 */
	protected ReadWriteModeType readWriteMode = READ_WRITE_MODE_EDEFAULT;

	/**
	 * This is true if the Read Write Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean readWriteModeESet;

	/**
	 * The default value of the '{@link #getDbStorageLocation() <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbStorageLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DB_STORAGE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDbStorageLocation() <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDbStorageLocation()
	 * @generated
	 * @ordered
	 */
	protected String dbStorageLocation = DB_STORAGE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseName() <em>Database Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseName()
	 * @generated
	 * @ordered
	 */
	protected String databaseName = DATABASE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatabaseID() <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseID()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseID() <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseID()
	 * @generated
	 * @ordered
	 */
	protected String databaseID = DATABASE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected DataType3 data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageLoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.IMAGE_LOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagePath(String newImagePath) {
		String oldImagePath = imagePath;
		imagePath = newImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.IMAGE_LOAD__IMAGE_PATH, oldImagePath, imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageUrl(String newImageUrl) {
		String oldImageUrl = imageUrl;
		imageUrl = newImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.IMAGE_LOAD__IMAGE_URL, oldImageUrl, imageUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageUniqueID() {
		return imageUniqueID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageUniqueID(String newImageUniqueID) {
		String oldImageUniqueID = imageUniqueID;
		imageUniqueID = newImageUniqueID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.IMAGE_LOAD__IMAGE_UNIQUE_ID, oldImageUniqueID, imageUniqueID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageVersion() {
		return imageVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageVersion(String newImageVersion) {
		String oldImageVersion = imageVersion;
		imageVersion = newImageVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.IMAGE_LOAD__IMAGE_VERSION, oldImageVersion, imageVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadWriteModeType getReadWriteMode() {
		return readWriteMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadWriteMode(ReadWriteModeType newReadWriteMode) {
		ReadWriteModeType oldReadWriteMode = readWriteMode;
		readWriteMode = newReadWriteMode == null ? READ_WRITE_MODE_EDEFAULT : newReadWriteMode;
		boolean oldReadWriteModeESet = readWriteModeESet;
		readWriteModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.IMAGE_LOAD__READ_WRITE_MODE, oldReadWriteMode, readWriteMode, !oldReadWriteModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReadWriteMode() {
		ReadWriteModeType oldReadWriteMode = readWriteMode;
		boolean oldReadWriteModeESet = readWriteModeESet;
		readWriteMode = READ_WRITE_MODE_EDEFAULT;
		readWriteModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.IMAGE_LOAD__READ_WRITE_MODE, oldReadWriteMode, READ_WRITE_MODE_EDEFAULT, oldReadWriteModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReadWriteMode() {
		return readWriteModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDbStorageLocation() {
		return dbStorageLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDbStorageLocation(String newDbStorageLocation) {
		String oldDbStorageLocation = dbStorageLocation;
		dbStorageLocation = newDbStorageLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.IMAGE_LOAD__DB_STORAGE_LOCATION, oldDbStorageLocation, dbStorageLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseName() {
		return databaseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseName(String newDatabaseName) {
		String oldDatabaseName = databaseName;
		databaseName = newDatabaseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.IMAGE_LOAD__DATABASE_NAME, oldDatabaseName, databaseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseID() {
		return databaseID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseID(String newDatabaseID) {
		String oldDatabaseID = databaseID;
		databaseID = newDatabaseID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.IMAGE_LOAD__DATABASE_ID, oldDatabaseID, databaseID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType3 getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(DataType3 newData, NotificationChain msgs) {
		DataType3 oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.IMAGE_LOAD__DATA, oldData, newData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(DataType3 newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.IMAGE_LOAD__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.IMAGE_LOAD__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.IMAGE_LOAD__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.IMAGE_LOAD__DATA:
				return basicSetData(null, msgs);
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
			case XmlaPackage.IMAGE_LOAD__IMAGE_PATH:
				return getImagePath();
			case XmlaPackage.IMAGE_LOAD__IMAGE_URL:
				return getImageUrl();
			case XmlaPackage.IMAGE_LOAD__IMAGE_UNIQUE_ID:
				return getImageUniqueID();
			case XmlaPackage.IMAGE_LOAD__IMAGE_VERSION:
				return getImageVersion();
			case XmlaPackage.IMAGE_LOAD__READ_WRITE_MODE:
				return getReadWriteMode();
			case XmlaPackage.IMAGE_LOAD__DB_STORAGE_LOCATION:
				return getDbStorageLocation();
			case XmlaPackage.IMAGE_LOAD__DATABASE_NAME:
				return getDatabaseName();
			case XmlaPackage.IMAGE_LOAD__DATABASE_ID:
				return getDatabaseID();
			case XmlaPackage.IMAGE_LOAD__DATA:
				return getData();
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
			case XmlaPackage.IMAGE_LOAD__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
			case XmlaPackage.IMAGE_LOAD__IMAGE_URL:
				setImageUrl((String)newValue);
				return;
			case XmlaPackage.IMAGE_LOAD__IMAGE_UNIQUE_ID:
				setImageUniqueID((String)newValue);
				return;
			case XmlaPackage.IMAGE_LOAD__IMAGE_VERSION:
				setImageVersion((String)newValue);
				return;
			case XmlaPackage.IMAGE_LOAD__READ_WRITE_MODE:
				setReadWriteMode((ReadWriteModeType)newValue);
				return;
			case XmlaPackage.IMAGE_LOAD__DB_STORAGE_LOCATION:
				setDbStorageLocation((String)newValue);
				return;
			case XmlaPackage.IMAGE_LOAD__DATABASE_NAME:
				setDatabaseName((String)newValue);
				return;
			case XmlaPackage.IMAGE_LOAD__DATABASE_ID:
				setDatabaseID((String)newValue);
				return;
			case XmlaPackage.IMAGE_LOAD__DATA:
				setData((DataType3)newValue);
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
			case XmlaPackage.IMAGE_LOAD__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
			case XmlaPackage.IMAGE_LOAD__IMAGE_URL:
				setImageUrl(IMAGE_URL_EDEFAULT);
				return;
			case XmlaPackage.IMAGE_LOAD__IMAGE_UNIQUE_ID:
				setImageUniqueID(IMAGE_UNIQUE_ID_EDEFAULT);
				return;
			case XmlaPackage.IMAGE_LOAD__IMAGE_VERSION:
				setImageVersion(IMAGE_VERSION_EDEFAULT);
				return;
			case XmlaPackage.IMAGE_LOAD__READ_WRITE_MODE:
				unsetReadWriteMode();
				return;
			case XmlaPackage.IMAGE_LOAD__DB_STORAGE_LOCATION:
				setDbStorageLocation(DB_STORAGE_LOCATION_EDEFAULT);
				return;
			case XmlaPackage.IMAGE_LOAD__DATABASE_NAME:
				setDatabaseName(DATABASE_NAME_EDEFAULT);
				return;
			case XmlaPackage.IMAGE_LOAD__DATABASE_ID:
				setDatabaseID(DATABASE_ID_EDEFAULT);
				return;
			case XmlaPackage.IMAGE_LOAD__DATA:
				setData((DataType3)null);
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
			case XmlaPackage.IMAGE_LOAD__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
			case XmlaPackage.IMAGE_LOAD__IMAGE_URL:
				return IMAGE_URL_EDEFAULT == null ? imageUrl != null : !IMAGE_URL_EDEFAULT.equals(imageUrl);
			case XmlaPackage.IMAGE_LOAD__IMAGE_UNIQUE_ID:
				return IMAGE_UNIQUE_ID_EDEFAULT == null ? imageUniqueID != null : !IMAGE_UNIQUE_ID_EDEFAULT.equals(imageUniqueID);
			case XmlaPackage.IMAGE_LOAD__IMAGE_VERSION:
				return IMAGE_VERSION_EDEFAULT == null ? imageVersion != null : !IMAGE_VERSION_EDEFAULT.equals(imageVersion);
			case XmlaPackage.IMAGE_LOAD__READ_WRITE_MODE:
				return isSetReadWriteMode();
			case XmlaPackage.IMAGE_LOAD__DB_STORAGE_LOCATION:
				return DB_STORAGE_LOCATION_EDEFAULT == null ? dbStorageLocation != null : !DB_STORAGE_LOCATION_EDEFAULT.equals(dbStorageLocation);
			case XmlaPackage.IMAGE_LOAD__DATABASE_NAME:
				return DATABASE_NAME_EDEFAULT == null ? databaseName != null : !DATABASE_NAME_EDEFAULT.equals(databaseName);
			case XmlaPackage.IMAGE_LOAD__DATABASE_ID:
				return DATABASE_ID_EDEFAULT == null ? databaseID != null : !DATABASE_ID_EDEFAULT.equals(databaseID);
			case XmlaPackage.IMAGE_LOAD__DATA:
				return data != null;
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
		result.append(" (imagePath: ");
		result.append(imagePath);
		result.append(", imageUrl: ");
		result.append(imageUrl);
		result.append(", imageUniqueID: ");
		result.append(imageUniqueID);
		result.append(", imageVersion: ");
		result.append(imageVersion);
		result.append(", readWriteMode: ");
		if (readWriteModeESet) result.append(readWriteMode); else result.append("<unset>");
		result.append(", dbStorageLocation: ");
		result.append(dbStorageLocation);
		result.append(", databaseName: ");
		result.append(databaseName);
		result.append(", databaseID: ");
		result.append(databaseID);
		result.append(')');
		return result.toString();
	}

} //ImageLoadImpl
