/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.GNSSCoordinateStructure;
import de.jena.mdo.ibis.common.GNSSPointStructure;
import de.jena.mdo.ibis.common.IBISIPDouble;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GNSS Point Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.GNSSPointStructureImpl#getPointRef <em>Point Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.GNSSPointStructureImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.GNSSPointStructureImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.GNSSPointStructureImpl#getAltitude <em>Altitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GNSSPointStructureImpl extends MinimalEObjectImpl.Container implements GNSSPointStructure {
	/**
	 * The cached value of the '{@link #getPointRef() <em>Point Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN pointRef;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected GNSSCoordinateStructure longitude;

	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected GNSSCoordinateStructure latitude;

	/**
	 * The cached value of the '{@link #getAltitude() <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitude()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDouble altitude;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GNSSPointStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.GNSS_POINT_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getPointRef() {
		return pointRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointRef(IBISIPNMTOKEN newPointRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldPointRef = pointRef;
		pointRef = newPointRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GNSS_POINT_STRUCTURE__POINT_REF, oldPointRef, newPointRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointRef(IBISIPNMTOKEN newPointRef) {
		if (newPointRef != pointRef) {
			NotificationChain msgs = null;
			if (pointRef != null)
				msgs = ((InternalEObject)pointRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GNSS_POINT_STRUCTURE__POINT_REF, null, msgs);
			if (newPointRef != null)
				msgs = ((InternalEObject)newPointRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GNSS_POINT_STRUCTURE__POINT_REF, null, msgs);
			msgs = basicSetPointRef(newPointRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GNSS_POINT_STRUCTURE__POINT_REF, newPointRef, newPointRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSCoordinateStructure getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongitude(GNSSCoordinateStructure newLongitude, NotificationChain msgs) {
		GNSSCoordinateStructure oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GNSS_POINT_STRUCTURE__LONGITUDE, oldLongitude, newLongitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLongitude(GNSSCoordinateStructure newLongitude) {
		if (newLongitude != longitude) {
			NotificationChain msgs = null;
			if (longitude != null)
				msgs = ((InternalEObject)longitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GNSS_POINT_STRUCTURE__LONGITUDE, null, msgs);
			if (newLongitude != null)
				msgs = ((InternalEObject)newLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GNSS_POINT_STRUCTURE__LONGITUDE, null, msgs);
			msgs = basicSetLongitude(newLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GNSS_POINT_STRUCTURE__LONGITUDE, newLongitude, newLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSCoordinateStructure getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatitude(GNSSCoordinateStructure newLatitude, NotificationChain msgs) {
		GNSSCoordinateStructure oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GNSS_POINT_STRUCTURE__LATITUDE, oldLatitude, newLatitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLatitude(GNSSCoordinateStructure newLatitude) {
		if (newLatitude != latitude) {
			NotificationChain msgs = null;
			if (latitude != null)
				msgs = ((InternalEObject)latitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GNSS_POINT_STRUCTURE__LATITUDE, null, msgs);
			if (newLatitude != null)
				msgs = ((InternalEObject)newLatitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GNSS_POINT_STRUCTURE__LATITUDE, null, msgs);
			msgs = basicSetLatitude(newLatitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GNSS_POINT_STRUCTURE__LATITUDE, newLatitude, newLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDouble getAltitude() {
		return altitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitude(IBISIPDouble newAltitude, NotificationChain msgs) {
		IBISIPDouble oldAltitude = altitude;
		altitude = newAltitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GNSS_POINT_STRUCTURE__ALTITUDE, oldAltitude, newAltitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAltitude(IBISIPDouble newAltitude) {
		if (newAltitude != altitude) {
			NotificationChain msgs = null;
			if (altitude != null)
				msgs = ((InternalEObject)altitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GNSS_POINT_STRUCTURE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject)newAltitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.GNSS_POINT_STRUCTURE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.GNSS_POINT_STRUCTURE__ALTITUDE, newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__POINT_REF:
				return basicSetPointRef(null, msgs);
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__LONGITUDE:
				return basicSetLongitude(null, msgs);
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__LATITUDE:
				return basicSetLatitude(null, msgs);
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__ALTITUDE:
				return basicSetAltitude(null, msgs);
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
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__POINT_REF:
				return getPointRef();
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__LONGITUDE:
				return getLongitude();
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__LATITUDE:
				return getLatitude();
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__ALTITUDE:
				return getAltitude();
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
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__POINT_REF:
				setPointRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__LONGITUDE:
				setLongitude((GNSSCoordinateStructure)newValue);
				return;
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__LATITUDE:
				setLatitude((GNSSCoordinateStructure)newValue);
				return;
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__ALTITUDE:
				setAltitude((IBISIPDouble)newValue);
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
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__POINT_REF:
				setPointRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__LONGITUDE:
				setLongitude((GNSSCoordinateStructure)null);
				return;
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__LATITUDE:
				setLatitude((GNSSCoordinateStructure)null);
				return;
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__ALTITUDE:
				setAltitude((IBISIPDouble)null);
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
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__POINT_REF:
				return pointRef != null;
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__LONGITUDE:
				return longitude != null;
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__LATITUDE:
				return latitude != null;
			case IbisCommonPackage.GNSS_POINT_STRUCTURE__ALTITUDE:
				return altitude != null;
		}
		return super.eIsSet(featureID);
	}

} //GNSSPointStructureImpl
