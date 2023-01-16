/*
 */
package de.jena.mdo.ibis.gnsslocationservice.impl;

import de.jena.mdo.ibis.common.GNSSCoordinateStructure;
import de.jena.mdo.ibis.common.IBISIPDate;
import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPDouble;
import de.jena.mdo.ibis.common.IBISIPInt;

import de.jena.mdo.ibis.enumerations.GNSSCoordinateSystemEnumeration;
import de.jena.mdo.ibis.enumerations.GNSSQualityEnumeration;
import de.jena.mdo.ibis.enumerations.GNSSTypeEnumeration;

import de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure;
import de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GNSS Location Service Data Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getDate <em>Date</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getSpeedOverGround <em>Speed Over Ground</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getSignalQuality <em>Signal Quality</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getNumberOfSatellites <em>Number Of Satellites</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getHoriziontalDilutionOfPrecision <em>Horiziontal Dilution Of Precision</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getVerticalDilutionOfPrecision <em>Vertical Dilution Of Precision</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getTrackDegreeTrue <em>Track Degree True</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getTrackDegreeMagnetic <em>Track Degree Magnetic</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getGNSSType <em>GNSS Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.impl.GNSSLocationServiceDataStructureImpl#getGNSSCoordinateSystem <em>GNSS Coordinate System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GNSSLocationServiceDataStructureImpl extends MinimalEObjectImpl.Container implements GNSSLocationServiceDataStructure {
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
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected GNSSCoordinateStructure longitude;

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
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime time;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDate date;

	/**
	 * The cached value of the '{@link #getSpeedOverGround() <em>Speed Over Ground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedOverGround()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDouble speedOverGround;

	/**
	 * The default value of the '{@link #getSignalQuality() <em>Signal Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalQuality()
	 * @generated
	 * @ordered
	 */
	protected static final GNSSQualityEnumeration SIGNAL_QUALITY_EDEFAULT = GNSSQualityEnumeration.DGPS;

	/**
	 * The cached value of the '{@link #getSignalQuality() <em>Signal Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalQuality()
	 * @generated
	 * @ordered
	 */
	protected GNSSQualityEnumeration signalQuality = SIGNAL_QUALITY_EDEFAULT;

	/**
	 * This is true if the Signal Quality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signalQualityESet;

	/**
	 * The cached value of the '{@link #getNumberOfSatellites() <em>Number Of Satellites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfSatellites()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt numberOfSatellites;

	/**
	 * The cached value of the '{@link #getHoriziontalDilutionOfPrecision() <em>Horiziontal Dilution Of Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoriziontalDilutionOfPrecision()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDouble horiziontalDilutionOfPrecision;

	/**
	 * The cached value of the '{@link #getVerticalDilutionOfPrecision() <em>Vertical Dilution Of Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalDilutionOfPrecision()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDouble verticalDilutionOfPrecision;

	/**
	 * The cached value of the '{@link #getTrackDegreeTrue() <em>Track Degree True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackDegreeTrue()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDouble trackDegreeTrue;

	/**
	 * The cached value of the '{@link #getTrackDegreeMagnetic() <em>Track Degree Magnetic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrackDegreeMagnetic()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDouble trackDegreeMagnetic;

	/**
	 * The default value of the '{@link #getGNSSType() <em>GNSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNSSType()
	 * @generated
	 * @ordered
	 */
	protected static final GNSSTypeEnumeration GNSS_TYPE_EDEFAULT = GNSSTypeEnumeration.GPS;

	/**
	 * The cached value of the '{@link #getGNSSType() <em>GNSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNSSType()
	 * @generated
	 * @ordered
	 */
	protected GNSSTypeEnumeration gNSSType = GNSS_TYPE_EDEFAULT;

	/**
	 * This is true if the GNSS Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gNSSTypeESet;

	/**
	 * The default value of the '{@link #getGNSSCoordinateSystem() <em>GNSS Coordinate System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNSSCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected static final GNSSCoordinateSystemEnumeration GNSS_COORDINATE_SYSTEM_EDEFAULT = GNSSCoordinateSystemEnumeration.CH1903;

	/**
	 * The cached value of the '{@link #getGNSSCoordinateSystem() <em>GNSS Coordinate System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGNSSCoordinateSystem()
	 * @generated
	 * @ordered
	 */
	protected GNSSCoordinateSystemEnumeration gNSSCoordinateSystem = GNSS_COORDINATE_SYSTEM_EDEFAULT;

	/**
	 * This is true if the GNSS Coordinate System attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gNSSCoordinateSystemESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GNSSLocationServiceDataStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisGNSSLocationServicePackage.eINSTANCE.getGNSSLocationServiceDataStructure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LATITUDE, oldLatitude, newLatitude);
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
				msgs = ((InternalEObject)latitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LATITUDE, null, msgs);
			if (newLatitude != null)
				msgs = ((InternalEObject)newLatitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LATITUDE, null, msgs);
			msgs = basicSetLatitude(newLatitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LATITUDE, newLatitude, newLatitude));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LONGITUDE, oldLongitude, newLongitude);
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
				msgs = ((InternalEObject)longitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LONGITUDE, null, msgs);
			if (newLongitude != null)
				msgs = ((InternalEObject)newLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LONGITUDE, null, msgs);
			msgs = basicSetLongitude(newLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LONGITUDE, newLongitude, newLongitude));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__ALTITUDE, oldAltitude, newAltitude);
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
				msgs = ((InternalEObject)altitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__ALTITUDE, null, msgs);
			if (newAltitude != null)
				msgs = ((InternalEObject)newAltitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__ALTITUDE, null, msgs);
			msgs = basicSetAltitude(newAltitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__ALTITUDE, newAltitude, newAltitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(IBISIPDateTime newTime, NotificationChain msgs) {
		IBISIPDateTime oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TIME, oldTime, newTime);
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
	public void setTime(IBISIPDateTime newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDate getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(IBISIPDate newDate, NotificationChain msgs) {
		IBISIPDate oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__DATE, oldDate, newDate);
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
	public void setDate(IBISIPDate newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDouble getSpeedOverGround() {
		return speedOverGround;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpeedOverGround(IBISIPDouble newSpeedOverGround, NotificationChain msgs) {
		IBISIPDouble oldSpeedOverGround = speedOverGround;
		speedOverGround = newSpeedOverGround;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SPEED_OVER_GROUND, oldSpeedOverGround, newSpeedOverGround);
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
	public void setSpeedOverGround(IBISIPDouble newSpeedOverGround) {
		if (newSpeedOverGround != speedOverGround) {
			NotificationChain msgs = null;
			if (speedOverGround != null)
				msgs = ((InternalEObject)speedOverGround).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SPEED_OVER_GROUND, null, msgs);
			if (newSpeedOverGround != null)
				msgs = ((InternalEObject)newSpeedOverGround).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SPEED_OVER_GROUND, null, msgs);
			msgs = basicSetSpeedOverGround(newSpeedOverGround, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SPEED_OVER_GROUND, newSpeedOverGround, newSpeedOverGround));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSQualityEnumeration getSignalQuality() {
		return signalQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignalQuality(GNSSQualityEnumeration newSignalQuality) {
		GNSSQualityEnumeration oldSignalQuality = signalQuality;
		signalQuality = newSignalQuality == null ? SIGNAL_QUALITY_EDEFAULT : newSignalQuality;
		boolean oldSignalQualityESet = signalQualityESet;
		signalQualityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SIGNAL_QUALITY, oldSignalQuality, signalQuality, !oldSignalQualityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSignalQuality() {
		GNSSQualityEnumeration oldSignalQuality = signalQuality;
		boolean oldSignalQualityESet = signalQualityESet;
		signalQuality = SIGNAL_QUALITY_EDEFAULT;
		signalQualityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SIGNAL_QUALITY, oldSignalQuality, SIGNAL_QUALITY_EDEFAULT, oldSignalQualityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSignalQuality() {
		return signalQualityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getNumberOfSatellites() {
		return numberOfSatellites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfSatellites(IBISIPInt newNumberOfSatellites, NotificationChain msgs) {
		IBISIPInt oldNumberOfSatellites = numberOfSatellites;
		numberOfSatellites = newNumberOfSatellites;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__NUMBER_OF_SATELLITES, oldNumberOfSatellites, newNumberOfSatellites);
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
	public void setNumberOfSatellites(IBISIPInt newNumberOfSatellites) {
		if (newNumberOfSatellites != numberOfSatellites) {
			NotificationChain msgs = null;
			if (numberOfSatellites != null)
				msgs = ((InternalEObject)numberOfSatellites).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__NUMBER_OF_SATELLITES, null, msgs);
			if (newNumberOfSatellites != null)
				msgs = ((InternalEObject)newNumberOfSatellites).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__NUMBER_OF_SATELLITES, null, msgs);
			msgs = basicSetNumberOfSatellites(newNumberOfSatellites, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__NUMBER_OF_SATELLITES, newNumberOfSatellites, newNumberOfSatellites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDouble getHoriziontalDilutionOfPrecision() {
		return horiziontalDilutionOfPrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoriziontalDilutionOfPrecision(IBISIPDouble newHoriziontalDilutionOfPrecision, NotificationChain msgs) {
		IBISIPDouble oldHoriziontalDilutionOfPrecision = horiziontalDilutionOfPrecision;
		horiziontalDilutionOfPrecision = newHoriziontalDilutionOfPrecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__HORIZIONTAL_DILUTION_OF_PRECISION, oldHoriziontalDilutionOfPrecision, newHoriziontalDilutionOfPrecision);
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
	public void setHoriziontalDilutionOfPrecision(IBISIPDouble newHoriziontalDilutionOfPrecision) {
		if (newHoriziontalDilutionOfPrecision != horiziontalDilutionOfPrecision) {
			NotificationChain msgs = null;
			if (horiziontalDilutionOfPrecision != null)
				msgs = ((InternalEObject)horiziontalDilutionOfPrecision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__HORIZIONTAL_DILUTION_OF_PRECISION, null, msgs);
			if (newHoriziontalDilutionOfPrecision != null)
				msgs = ((InternalEObject)newHoriziontalDilutionOfPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__HORIZIONTAL_DILUTION_OF_PRECISION, null, msgs);
			msgs = basicSetHoriziontalDilutionOfPrecision(newHoriziontalDilutionOfPrecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__HORIZIONTAL_DILUTION_OF_PRECISION, newHoriziontalDilutionOfPrecision, newHoriziontalDilutionOfPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDouble getVerticalDilutionOfPrecision() {
		return verticalDilutionOfPrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerticalDilutionOfPrecision(IBISIPDouble newVerticalDilutionOfPrecision, NotificationChain msgs) {
		IBISIPDouble oldVerticalDilutionOfPrecision = verticalDilutionOfPrecision;
		verticalDilutionOfPrecision = newVerticalDilutionOfPrecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__VERTICAL_DILUTION_OF_PRECISION, oldVerticalDilutionOfPrecision, newVerticalDilutionOfPrecision);
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
	public void setVerticalDilutionOfPrecision(IBISIPDouble newVerticalDilutionOfPrecision) {
		if (newVerticalDilutionOfPrecision != verticalDilutionOfPrecision) {
			NotificationChain msgs = null;
			if (verticalDilutionOfPrecision != null)
				msgs = ((InternalEObject)verticalDilutionOfPrecision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__VERTICAL_DILUTION_OF_PRECISION, null, msgs);
			if (newVerticalDilutionOfPrecision != null)
				msgs = ((InternalEObject)newVerticalDilutionOfPrecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__VERTICAL_DILUTION_OF_PRECISION, null, msgs);
			msgs = basicSetVerticalDilutionOfPrecision(newVerticalDilutionOfPrecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__VERTICAL_DILUTION_OF_PRECISION, newVerticalDilutionOfPrecision, newVerticalDilutionOfPrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDouble getTrackDegreeTrue() {
		return trackDegreeTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackDegreeTrue(IBISIPDouble newTrackDegreeTrue, NotificationChain msgs) {
		IBISIPDouble oldTrackDegreeTrue = trackDegreeTrue;
		trackDegreeTrue = newTrackDegreeTrue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_TRUE, oldTrackDegreeTrue, newTrackDegreeTrue);
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
	public void setTrackDegreeTrue(IBISIPDouble newTrackDegreeTrue) {
		if (newTrackDegreeTrue != trackDegreeTrue) {
			NotificationChain msgs = null;
			if (trackDegreeTrue != null)
				msgs = ((InternalEObject)trackDegreeTrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_TRUE, null, msgs);
			if (newTrackDegreeTrue != null)
				msgs = ((InternalEObject)newTrackDegreeTrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_TRUE, null, msgs);
			msgs = basicSetTrackDegreeTrue(newTrackDegreeTrue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_TRUE, newTrackDegreeTrue, newTrackDegreeTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDouble getTrackDegreeMagnetic() {
		return trackDegreeMagnetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrackDegreeMagnetic(IBISIPDouble newTrackDegreeMagnetic, NotificationChain msgs) {
		IBISIPDouble oldTrackDegreeMagnetic = trackDegreeMagnetic;
		trackDegreeMagnetic = newTrackDegreeMagnetic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_MAGNETIC, oldTrackDegreeMagnetic, newTrackDegreeMagnetic);
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
	public void setTrackDegreeMagnetic(IBISIPDouble newTrackDegreeMagnetic) {
		if (newTrackDegreeMagnetic != trackDegreeMagnetic) {
			NotificationChain msgs = null;
			if (trackDegreeMagnetic != null)
				msgs = ((InternalEObject)trackDegreeMagnetic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_MAGNETIC, null, msgs);
			if (newTrackDegreeMagnetic != null)
				msgs = ((InternalEObject)newTrackDegreeMagnetic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_MAGNETIC, null, msgs);
			msgs = basicSetTrackDegreeMagnetic(newTrackDegreeMagnetic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_MAGNETIC, newTrackDegreeMagnetic, newTrackDegreeMagnetic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSTypeEnumeration getGNSSType() {
		return gNSSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGNSSType(GNSSTypeEnumeration newGNSSType) {
		GNSSTypeEnumeration oldGNSSType = gNSSType;
		gNSSType = newGNSSType == null ? GNSS_TYPE_EDEFAULT : newGNSSType;
		boolean oldGNSSTypeESet = gNSSTypeESet;
		gNSSTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_TYPE, oldGNSSType, gNSSType, !oldGNSSTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGNSSType() {
		GNSSTypeEnumeration oldGNSSType = gNSSType;
		boolean oldGNSSTypeESet = gNSSTypeESet;
		gNSSType = GNSS_TYPE_EDEFAULT;
		gNSSTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_TYPE, oldGNSSType, GNSS_TYPE_EDEFAULT, oldGNSSTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGNSSType() {
		return gNSSTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GNSSCoordinateSystemEnumeration getGNSSCoordinateSystem() {
		return gNSSCoordinateSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGNSSCoordinateSystem(GNSSCoordinateSystemEnumeration newGNSSCoordinateSystem) {
		GNSSCoordinateSystemEnumeration oldGNSSCoordinateSystem = gNSSCoordinateSystem;
		gNSSCoordinateSystem = newGNSSCoordinateSystem == null ? GNSS_COORDINATE_SYSTEM_EDEFAULT : newGNSSCoordinateSystem;
		boolean oldGNSSCoordinateSystemESet = gNSSCoordinateSystemESet;
		gNSSCoordinateSystemESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_COORDINATE_SYSTEM, oldGNSSCoordinateSystem, gNSSCoordinateSystem, !oldGNSSCoordinateSystemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGNSSCoordinateSystem() {
		GNSSCoordinateSystemEnumeration oldGNSSCoordinateSystem = gNSSCoordinateSystem;
		boolean oldGNSSCoordinateSystemESet = gNSSCoordinateSystemESet;
		gNSSCoordinateSystem = GNSS_COORDINATE_SYSTEM_EDEFAULT;
		gNSSCoordinateSystemESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_COORDINATE_SYSTEM, oldGNSSCoordinateSystem, GNSS_COORDINATE_SYSTEM_EDEFAULT, oldGNSSCoordinateSystemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGNSSCoordinateSystem() {
		return gNSSCoordinateSystemESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LATITUDE:
				return basicSetLatitude(null, msgs);
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LONGITUDE:
				return basicSetLongitude(null, msgs);
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__ALTITUDE:
				return basicSetAltitude(null, msgs);
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TIME:
				return basicSetTime(null, msgs);
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__DATE:
				return basicSetDate(null, msgs);
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SPEED_OVER_GROUND:
				return basicSetSpeedOverGround(null, msgs);
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__NUMBER_OF_SATELLITES:
				return basicSetNumberOfSatellites(null, msgs);
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__HORIZIONTAL_DILUTION_OF_PRECISION:
				return basicSetHoriziontalDilutionOfPrecision(null, msgs);
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__VERTICAL_DILUTION_OF_PRECISION:
				return basicSetVerticalDilutionOfPrecision(null, msgs);
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_TRUE:
				return basicSetTrackDegreeTrue(null, msgs);
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_MAGNETIC:
				return basicSetTrackDegreeMagnetic(null, msgs);
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
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LATITUDE:
				return getLatitude();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LONGITUDE:
				return getLongitude();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__ALTITUDE:
				return getAltitude();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TIME:
				return getTime();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__DATE:
				return getDate();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SPEED_OVER_GROUND:
				return getSpeedOverGround();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SIGNAL_QUALITY:
				return getSignalQuality();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__NUMBER_OF_SATELLITES:
				return getNumberOfSatellites();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__HORIZIONTAL_DILUTION_OF_PRECISION:
				return getHoriziontalDilutionOfPrecision();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__VERTICAL_DILUTION_OF_PRECISION:
				return getVerticalDilutionOfPrecision();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_TRUE:
				return getTrackDegreeTrue();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_MAGNETIC:
				return getTrackDegreeMagnetic();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_TYPE:
				return getGNSSType();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_COORDINATE_SYSTEM:
				return getGNSSCoordinateSystem();
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
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LATITUDE:
				setLatitude((GNSSCoordinateStructure)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LONGITUDE:
				setLongitude((GNSSCoordinateStructure)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__ALTITUDE:
				setAltitude((IBISIPDouble)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TIME:
				setTime((IBISIPDateTime)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__DATE:
				setDate((IBISIPDate)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SPEED_OVER_GROUND:
				setSpeedOverGround((IBISIPDouble)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SIGNAL_QUALITY:
				setSignalQuality((GNSSQualityEnumeration)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__NUMBER_OF_SATELLITES:
				setNumberOfSatellites((IBISIPInt)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__HORIZIONTAL_DILUTION_OF_PRECISION:
				setHoriziontalDilutionOfPrecision((IBISIPDouble)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__VERTICAL_DILUTION_OF_PRECISION:
				setVerticalDilutionOfPrecision((IBISIPDouble)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_TRUE:
				setTrackDegreeTrue((IBISIPDouble)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_MAGNETIC:
				setTrackDegreeMagnetic((IBISIPDouble)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_TYPE:
				setGNSSType((GNSSTypeEnumeration)newValue);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_COORDINATE_SYSTEM:
				setGNSSCoordinateSystem((GNSSCoordinateSystemEnumeration)newValue);
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
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LATITUDE:
				setLatitude((GNSSCoordinateStructure)null);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LONGITUDE:
				setLongitude((GNSSCoordinateStructure)null);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__ALTITUDE:
				setAltitude((IBISIPDouble)null);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TIME:
				setTime((IBISIPDateTime)null);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__DATE:
				setDate((IBISIPDate)null);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SPEED_OVER_GROUND:
				setSpeedOverGround((IBISIPDouble)null);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SIGNAL_QUALITY:
				unsetSignalQuality();
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__NUMBER_OF_SATELLITES:
				setNumberOfSatellites((IBISIPInt)null);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__HORIZIONTAL_DILUTION_OF_PRECISION:
				setHoriziontalDilutionOfPrecision((IBISIPDouble)null);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__VERTICAL_DILUTION_OF_PRECISION:
				setVerticalDilutionOfPrecision((IBISIPDouble)null);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_TRUE:
				setTrackDegreeTrue((IBISIPDouble)null);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_MAGNETIC:
				setTrackDegreeMagnetic((IBISIPDouble)null);
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_TYPE:
				unsetGNSSType();
				return;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_COORDINATE_SYSTEM:
				unsetGNSSCoordinateSystem();
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
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LATITUDE:
				return latitude != null;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__LONGITUDE:
				return longitude != null;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__ALTITUDE:
				return altitude != null;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TIME:
				return time != null;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__DATE:
				return date != null;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SPEED_OVER_GROUND:
				return speedOverGround != null;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__SIGNAL_QUALITY:
				return isSetSignalQuality();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__NUMBER_OF_SATELLITES:
				return numberOfSatellites != null;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__HORIZIONTAL_DILUTION_OF_PRECISION:
				return horiziontalDilutionOfPrecision != null;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__VERTICAL_DILUTION_OF_PRECISION:
				return verticalDilutionOfPrecision != null;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_TRUE:
				return trackDegreeTrue != null;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__TRACK_DEGREE_MAGNETIC:
				return trackDegreeMagnetic != null;
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_TYPE:
				return isSetGNSSType();
			case IbisGNSSLocationServicePackage.GNSS_LOCATION_SERVICE_DATA_STRUCTURE__GNSS_COORDINATE_SYSTEM:
				return isSetGNSSCoordinateSystem();
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
		result.append(" (signalQuality: ");
		if (signalQualityESet) result.append(signalQuality); else result.append("<unset>");
		result.append(", gNSSType: ");
		if (gNSSTypeESet) result.append(gNSSType); else result.append("<unset>");
		result.append(", gNSSCoordinateSystem: ");
		if (gNSSCoordinateSystemESet) result.append(gNSSCoordinateSystem); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GNSSLocationServiceDataStructureImpl
