/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.LocationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Source;
import org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize;
import org.eclipse.daanse.xmla.model.ecore.xmla.SynchronizeSecurityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronize</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.SynchronizeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.SynchronizeImpl#getSynchronizeSecurity <em>Synchronize Security</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.SynchronizeImpl#isApplyCompression <em>Apply Compression</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.SynchronizeImpl#getDbStorageLocation <em>Db Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.SynchronizeImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronizeImpl extends MinimalEObjectImpl.Container implements Synchronize {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source;

	/**
	 * The default value of the '{@link #getSynchronizeSecurity() <em>Synchronize Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizeSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronizeSecurityType SYNCHRONIZE_SECURITY_EDEFAULT = SynchronizeSecurityType.SKIP_MEMBERSHIP;

	/**
	 * The cached value of the '{@link #getSynchronizeSecurity() <em>Synchronize Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizeSecurity()
	 * @generated
	 * @ordered
	 */
	protected SynchronizeSecurityType synchronizeSecurity = SYNCHRONIZE_SECURITY_EDEFAULT;

	/**
	 * This is true if the Synchronize Security attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean synchronizeSecurityESet;

	/**
	 * The default value of the '{@link #isApplyCompression() <em>Apply Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyCompression()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLY_COMPRESSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isApplyCompression() <em>Apply Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplyCompression()
	 * @generated
	 * @ordered
	 */
	protected boolean applyCompression = APPLY_COMPRESSION_EDEFAULT;

	/**
	 * This is true if the Apply Compression attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean applyCompressionESet;

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
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected LocationsType locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.SYNCHRONIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		Source oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SYNCHRONIZE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SYNCHRONIZE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SYNCHRONIZE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SYNCHRONIZE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizeSecurityType getSynchronizeSecurity() {
		return synchronizeSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizeSecurity(SynchronizeSecurityType newSynchronizeSecurity) {
		SynchronizeSecurityType oldSynchronizeSecurity = synchronizeSecurity;
		synchronizeSecurity = newSynchronizeSecurity == null ? SYNCHRONIZE_SECURITY_EDEFAULT : newSynchronizeSecurity;
		boolean oldSynchronizeSecurityESet = synchronizeSecurityESet;
		synchronizeSecurityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SYNCHRONIZE__SYNCHRONIZE_SECURITY, oldSynchronizeSecurity, synchronizeSecurity, !oldSynchronizeSecurityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSynchronizeSecurity() {
		SynchronizeSecurityType oldSynchronizeSecurity = synchronizeSecurity;
		boolean oldSynchronizeSecurityESet = synchronizeSecurityESet;
		synchronizeSecurity = SYNCHRONIZE_SECURITY_EDEFAULT;
		synchronizeSecurityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.SYNCHRONIZE__SYNCHRONIZE_SECURITY, oldSynchronizeSecurity, SYNCHRONIZE_SECURITY_EDEFAULT, oldSynchronizeSecurityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSynchronizeSecurity() {
		return synchronizeSecurityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplyCompression() {
		return applyCompression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplyCompression(boolean newApplyCompression) {
		boolean oldApplyCompression = applyCompression;
		applyCompression = newApplyCompression;
		boolean oldApplyCompressionESet = applyCompressionESet;
		applyCompressionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SYNCHRONIZE__APPLY_COMPRESSION, oldApplyCompression, applyCompression, !oldApplyCompressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApplyCompression() {
		boolean oldApplyCompression = applyCompression;
		boolean oldApplyCompressionESet = applyCompressionESet;
		applyCompression = APPLY_COMPRESSION_EDEFAULT;
		applyCompressionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.SYNCHRONIZE__APPLY_COMPRESSION, oldApplyCompression, APPLY_COMPRESSION_EDEFAULT, oldApplyCompressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApplyCompression() {
		return applyCompressionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SYNCHRONIZE__DB_STORAGE_LOCATION, oldDbStorageLocation, dbStorageLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationsType getLocations() {
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocations(LocationsType newLocations, NotificationChain msgs) {
		LocationsType oldLocations = locations;
		locations = newLocations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SYNCHRONIZE__LOCATIONS, oldLocations, newLocations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocations(LocationsType newLocations) {
		if (newLocations != locations) {
			NotificationChain msgs = null;
			if (locations != null)
				msgs = ((InternalEObject)locations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SYNCHRONIZE__LOCATIONS, null, msgs);
			if (newLocations != null)
				msgs = ((InternalEObject)newLocations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SYNCHRONIZE__LOCATIONS, null, msgs);
			msgs = basicSetLocations(newLocations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SYNCHRONIZE__LOCATIONS, newLocations, newLocations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.SYNCHRONIZE__SOURCE:
				return basicSetSource(null, msgs);
			case XmlaPackage.SYNCHRONIZE__LOCATIONS:
				return basicSetLocations(null, msgs);
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
			case XmlaPackage.SYNCHRONIZE__SOURCE:
				return getSource();
			case XmlaPackage.SYNCHRONIZE__SYNCHRONIZE_SECURITY:
				return getSynchronizeSecurity();
			case XmlaPackage.SYNCHRONIZE__APPLY_COMPRESSION:
				return isApplyCompression();
			case XmlaPackage.SYNCHRONIZE__DB_STORAGE_LOCATION:
				return getDbStorageLocation();
			case XmlaPackage.SYNCHRONIZE__LOCATIONS:
				return getLocations();
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
			case XmlaPackage.SYNCHRONIZE__SOURCE:
				setSource((Source)newValue);
				return;
			case XmlaPackage.SYNCHRONIZE__SYNCHRONIZE_SECURITY:
				setSynchronizeSecurity((SynchronizeSecurityType)newValue);
				return;
			case XmlaPackage.SYNCHRONIZE__APPLY_COMPRESSION:
				setApplyCompression((Boolean)newValue);
				return;
			case XmlaPackage.SYNCHRONIZE__DB_STORAGE_LOCATION:
				setDbStorageLocation((String)newValue);
				return;
			case XmlaPackage.SYNCHRONIZE__LOCATIONS:
				setLocations((LocationsType)newValue);
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
			case XmlaPackage.SYNCHRONIZE__SOURCE:
				setSource((Source)null);
				return;
			case XmlaPackage.SYNCHRONIZE__SYNCHRONIZE_SECURITY:
				unsetSynchronizeSecurity();
				return;
			case XmlaPackage.SYNCHRONIZE__APPLY_COMPRESSION:
				unsetApplyCompression();
				return;
			case XmlaPackage.SYNCHRONIZE__DB_STORAGE_LOCATION:
				setDbStorageLocation(DB_STORAGE_LOCATION_EDEFAULT);
				return;
			case XmlaPackage.SYNCHRONIZE__LOCATIONS:
				setLocations((LocationsType)null);
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
			case XmlaPackage.SYNCHRONIZE__SOURCE:
				return source != null;
			case XmlaPackage.SYNCHRONIZE__SYNCHRONIZE_SECURITY:
				return isSetSynchronizeSecurity();
			case XmlaPackage.SYNCHRONIZE__APPLY_COMPRESSION:
				return isSetApplyCompression();
			case XmlaPackage.SYNCHRONIZE__DB_STORAGE_LOCATION:
				return DB_STORAGE_LOCATION_EDEFAULT == null ? dbStorageLocation != null : !DB_STORAGE_LOCATION_EDEFAULT.equals(dbStorageLocation);
			case XmlaPackage.SYNCHRONIZE__LOCATIONS:
				return locations != null;
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
		result.append(" (synchronizeSecurity: ");
		if (synchronizeSecurityESet) result.append(synchronizeSecurity); else result.append("<unset>");
		result.append(", applyCompression: ");
		if (applyCompressionESet) result.append(applyCompression); else result.append("<unset>");
		result.append(", dbStorageLocation: ");
		result.append(dbStorageLocation);
		result.append(')');
		return result.toString();
	}

} //SynchronizeImpl
