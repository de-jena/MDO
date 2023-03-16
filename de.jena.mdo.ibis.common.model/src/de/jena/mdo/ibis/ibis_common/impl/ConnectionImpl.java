/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.Connection;
import de.jena.mdo.ibis.ibis_common.DisplayContent;
import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;
import de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.ibis_common.IBISIPString;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.NetexMode;
import de.jena.mdo.ibis.ibis_common.Vehicle;

import de.jena.mdo.ibis.ibis_enumerations.ConnectionStateEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.ConnectionTypeEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl#getStopRef <em>Stop Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl#getConnectionRef <em>Connection Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl#getDisplayContent <em>Display Content</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl#getConnectionState <em>Connection State</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl#getTransportMode <em>Transport Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl#getConnectionMode <em>Connection Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl#getExpectedDepartureTime <em>Expected Departure Time</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.ConnectionImpl#getScheduledDepartureTime <em>Scheduled Departure Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * The cached value of the '{@link #getStopRef() <em>Stop Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN stopRef;

	/**
	 * The cached value of the '{@link #getConnectionRef() <em>Connection Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN connectionRef;

	/**
	 * The default value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionTypeEnumeration CONNECTION_TYPE_EDEFAULT = ConnectionTypeEnumeration.INTERCHANGE;

	/**
	 * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected ConnectionTypeEnumeration connectionType = CONNECTION_TYPE_EDEFAULT;

	/**
	 * This is true if the Connection Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectionTypeESet;

	/**
	 * The cached value of the '{@link #getDisplayContent() <em>Display Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayContent()
	 * @generated
	 * @ordered
	 */
	protected DisplayContent displayContent;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected IBISIPString platform;

	/**
	 * The default value of the '{@link #getConnectionState() <em>Connection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionState()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionStateEnumeration CONNECTION_STATE_EDEFAULT = ConnectionStateEnumeration.CONNECTION_BROKEN;

	/**
	 * The cached value of the '{@link #getConnectionState() <em>Connection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionState()
	 * @generated
	 * @ordered
	 */
	protected ConnectionStateEnumeration connectionState = CONNECTION_STATE_EDEFAULT;

	/**
	 * This is true if the Connection State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectionStateESet;

	/**
	 * The cached value of the '{@link #getTransportMode() <em>Transport Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportMode()
	 * @generated
	 * @ordered
	 */
	protected Vehicle transportMode;

	/**
	 * The cached value of the '{@link #getConnectionMode() <em>Connection Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionMode()
	 * @generated
	 * @ordered
	 */
	protected NetexMode connectionMode;

	/**
	 * The cached value of the '{@link #getExpectedDepartureTime() <em>Expected Departure Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime expectedDepartureTime;

	/**
	 * The cached value of the '{@link #getScheduledDepartureTime() <em>Scheduled Departure Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledDepartureTime()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime scheduledDepartureTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getStopRef() {
		return stopRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopRef(IBISIPNMTOKEN newStopRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldStopRef = stopRef;
		stopRef = newStopRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__STOP_REF, oldStopRef, newStopRef);
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
	public void setStopRef(IBISIPNMTOKEN newStopRef) {
		if (newStopRef != stopRef) {
			NotificationChain msgs = null;
			if (stopRef != null)
				msgs = ((InternalEObject)stopRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__STOP_REF, null, msgs);
			if (newStopRef != null)
				msgs = ((InternalEObject)newStopRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__STOP_REF, null, msgs);
			msgs = basicSetStopRef(newStopRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__STOP_REF, newStopRef, newStopRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getConnectionRef() {
		return connectionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionRef(IBISIPNMTOKEN newConnectionRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldConnectionRef = connectionRef;
		connectionRef = newConnectionRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__CONNECTION_REF, oldConnectionRef, newConnectionRef);
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
	public void setConnectionRef(IBISIPNMTOKEN newConnectionRef) {
		if (newConnectionRef != connectionRef) {
			NotificationChain msgs = null;
			if (connectionRef != null)
				msgs = ((InternalEObject)connectionRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__CONNECTION_REF, null, msgs);
			if (newConnectionRef != null)
				msgs = ((InternalEObject)newConnectionRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__CONNECTION_REF, null, msgs);
			msgs = basicSetConnectionRef(newConnectionRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__CONNECTION_REF, newConnectionRef, newConnectionRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionTypeEnumeration getConnectionType() {
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionType(ConnectionTypeEnumeration newConnectionType) {
		ConnectionTypeEnumeration oldConnectionType = connectionType;
		connectionType = newConnectionType == null ? CONNECTION_TYPE_EDEFAULT : newConnectionType;
		boolean oldConnectionTypeESet = connectionTypeESet;
		connectionTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__CONNECTION_TYPE, oldConnectionType, connectionType, !oldConnectionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetConnectionType() {
		ConnectionTypeEnumeration oldConnectionType = connectionType;
		boolean oldConnectionTypeESet = connectionTypeESet;
		connectionType = CONNECTION_TYPE_EDEFAULT;
		connectionTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.CONNECTION__CONNECTION_TYPE, oldConnectionType, CONNECTION_TYPE_EDEFAULT, oldConnectionTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetConnectionType() {
		return connectionTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DisplayContent getDisplayContent() {
		return displayContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayContent(DisplayContent newDisplayContent, NotificationChain msgs) {
		DisplayContent oldDisplayContent = displayContent;
		displayContent = newDisplayContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__DISPLAY_CONTENT, oldDisplayContent, newDisplayContent);
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
	public void setDisplayContent(DisplayContent newDisplayContent) {
		if (newDisplayContent != displayContent) {
			NotificationChain msgs = null;
			if (displayContent != null)
				msgs = ((InternalEObject)displayContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__DISPLAY_CONTENT, null, msgs);
			if (newDisplayContent != null)
				msgs = ((InternalEObject)newDisplayContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__DISPLAY_CONTENT, null, msgs);
			msgs = basicSetDisplayContent(newDisplayContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__DISPLAY_CONTENT, newDisplayContent, newDisplayContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPString getPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlatform(IBISIPString newPlatform, NotificationChain msgs) {
		IBISIPString oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__PLATFORM, oldPlatform, newPlatform);
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
	public void setPlatform(IBISIPString newPlatform) {
		if (newPlatform != platform) {
			NotificationChain msgs = null;
			if (platform != null)
				msgs = ((InternalEObject)platform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__PLATFORM, null, msgs);
			if (newPlatform != null)
				msgs = ((InternalEObject)newPlatform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__PLATFORM, null, msgs);
			msgs = basicSetPlatform(newPlatform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__PLATFORM, newPlatform, newPlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionStateEnumeration getConnectionState() {
		return connectionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionState(ConnectionStateEnumeration newConnectionState) {
		ConnectionStateEnumeration oldConnectionState = connectionState;
		connectionState = newConnectionState == null ? CONNECTION_STATE_EDEFAULT : newConnectionState;
		boolean oldConnectionStateESet = connectionStateESet;
		connectionStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__CONNECTION_STATE, oldConnectionState, connectionState, !oldConnectionStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetConnectionState() {
		ConnectionStateEnumeration oldConnectionState = connectionState;
		boolean oldConnectionStateESet = connectionStateESet;
		connectionState = CONNECTION_STATE_EDEFAULT;
		connectionStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.CONNECTION__CONNECTION_STATE, oldConnectionState, CONNECTION_STATE_EDEFAULT, oldConnectionStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetConnectionState() {
		return connectionStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vehicle getTransportMode() {
		return transportMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportMode(Vehicle newTransportMode, NotificationChain msgs) {
		Vehicle oldTransportMode = transportMode;
		transportMode = newTransportMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__TRANSPORT_MODE, oldTransportMode, newTransportMode);
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
	public void setTransportMode(Vehicle newTransportMode) {
		if (newTransportMode != transportMode) {
			NotificationChain msgs = null;
			if (transportMode != null)
				msgs = ((InternalEObject)transportMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__TRANSPORT_MODE, null, msgs);
			if (newTransportMode != null)
				msgs = ((InternalEObject)newTransportMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__TRANSPORT_MODE, null, msgs);
			msgs = basicSetTransportMode(newTransportMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__TRANSPORT_MODE, newTransportMode, newTransportMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetexMode getConnectionMode() {
		return connectionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionMode(NetexMode newConnectionMode, NotificationChain msgs) {
		NetexMode oldConnectionMode = connectionMode;
		connectionMode = newConnectionMode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__CONNECTION_MODE, oldConnectionMode, newConnectionMode);
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
	public void setConnectionMode(NetexMode newConnectionMode) {
		if (newConnectionMode != connectionMode) {
			NotificationChain msgs = null;
			if (connectionMode != null)
				msgs = ((InternalEObject)connectionMode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__CONNECTION_MODE, null, msgs);
			if (newConnectionMode != null)
				msgs = ((InternalEObject)newConnectionMode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__CONNECTION_MODE, null, msgs);
			msgs = basicSetConnectionMode(newConnectionMode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__CONNECTION_MODE, newConnectionMode, newConnectionMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getExpectedDepartureTime() {
		return expectedDepartureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpectedDepartureTime(IBISIPDateTime newExpectedDepartureTime, NotificationChain msgs) {
		IBISIPDateTime oldExpectedDepartureTime = expectedDepartureTime;
		expectedDepartureTime = newExpectedDepartureTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__EXPECTED_DEPARTURE_TIME, oldExpectedDepartureTime, newExpectedDepartureTime);
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
	public void setExpectedDepartureTime(IBISIPDateTime newExpectedDepartureTime) {
		if (newExpectedDepartureTime != expectedDepartureTime) {
			NotificationChain msgs = null;
			if (expectedDepartureTime != null)
				msgs = ((InternalEObject)expectedDepartureTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__EXPECTED_DEPARTURE_TIME, null, msgs);
			if (newExpectedDepartureTime != null)
				msgs = ((InternalEObject)newExpectedDepartureTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__EXPECTED_DEPARTURE_TIME, null, msgs);
			msgs = basicSetExpectedDepartureTime(newExpectedDepartureTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__EXPECTED_DEPARTURE_TIME, newExpectedDepartureTime, newExpectedDepartureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getScheduledDepartureTime() {
		return scheduledDepartureTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduledDepartureTime(IBISIPDateTime newScheduledDepartureTime, NotificationChain msgs) {
		IBISIPDateTime oldScheduledDepartureTime = scheduledDepartureTime;
		scheduledDepartureTime = newScheduledDepartureTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__SCHEDULED_DEPARTURE_TIME, oldScheduledDepartureTime, newScheduledDepartureTime);
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
	public void setScheduledDepartureTime(IBISIPDateTime newScheduledDepartureTime) {
		if (newScheduledDepartureTime != scheduledDepartureTime) {
			NotificationChain msgs = null;
			if (scheduledDepartureTime != null)
				msgs = ((InternalEObject)scheduledDepartureTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__SCHEDULED_DEPARTURE_TIME, null, msgs);
			if (newScheduledDepartureTime != null)
				msgs = ((InternalEObject)newScheduledDepartureTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.CONNECTION__SCHEDULED_DEPARTURE_TIME, null, msgs);
			msgs = basicSetScheduledDepartureTime(newScheduledDepartureTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.CONNECTION__SCHEDULED_DEPARTURE_TIME, newScheduledDepartureTime, newScheduledDepartureTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.CONNECTION__STOP_REF:
				return basicSetStopRef(null, msgs);
			case IbisCommonPackage.CONNECTION__CONNECTION_REF:
				return basicSetConnectionRef(null, msgs);
			case IbisCommonPackage.CONNECTION__DISPLAY_CONTENT:
				return basicSetDisplayContent(null, msgs);
			case IbisCommonPackage.CONNECTION__PLATFORM:
				return basicSetPlatform(null, msgs);
			case IbisCommonPackage.CONNECTION__TRANSPORT_MODE:
				return basicSetTransportMode(null, msgs);
			case IbisCommonPackage.CONNECTION__CONNECTION_MODE:
				return basicSetConnectionMode(null, msgs);
			case IbisCommonPackage.CONNECTION__EXPECTED_DEPARTURE_TIME:
				return basicSetExpectedDepartureTime(null, msgs);
			case IbisCommonPackage.CONNECTION__SCHEDULED_DEPARTURE_TIME:
				return basicSetScheduledDepartureTime(null, msgs);
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
			case IbisCommonPackage.CONNECTION__STOP_REF:
				return getStopRef();
			case IbisCommonPackage.CONNECTION__CONNECTION_REF:
				return getConnectionRef();
			case IbisCommonPackage.CONNECTION__CONNECTION_TYPE:
				return getConnectionType();
			case IbisCommonPackage.CONNECTION__DISPLAY_CONTENT:
				return getDisplayContent();
			case IbisCommonPackage.CONNECTION__PLATFORM:
				return getPlatform();
			case IbisCommonPackage.CONNECTION__CONNECTION_STATE:
				return getConnectionState();
			case IbisCommonPackage.CONNECTION__TRANSPORT_MODE:
				return getTransportMode();
			case IbisCommonPackage.CONNECTION__CONNECTION_MODE:
				return getConnectionMode();
			case IbisCommonPackage.CONNECTION__EXPECTED_DEPARTURE_TIME:
				return getExpectedDepartureTime();
			case IbisCommonPackage.CONNECTION__SCHEDULED_DEPARTURE_TIME:
				return getScheduledDepartureTime();
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
			case IbisCommonPackage.CONNECTION__STOP_REF:
				setStopRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.CONNECTION__CONNECTION_REF:
				setConnectionRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.CONNECTION__CONNECTION_TYPE:
				setConnectionType((ConnectionTypeEnumeration)newValue);
				return;
			case IbisCommonPackage.CONNECTION__DISPLAY_CONTENT:
				setDisplayContent((DisplayContent)newValue);
				return;
			case IbisCommonPackage.CONNECTION__PLATFORM:
				setPlatform((IBISIPString)newValue);
				return;
			case IbisCommonPackage.CONNECTION__CONNECTION_STATE:
				setConnectionState((ConnectionStateEnumeration)newValue);
				return;
			case IbisCommonPackage.CONNECTION__TRANSPORT_MODE:
				setTransportMode((Vehicle)newValue);
				return;
			case IbisCommonPackage.CONNECTION__CONNECTION_MODE:
				setConnectionMode((NetexMode)newValue);
				return;
			case IbisCommonPackage.CONNECTION__EXPECTED_DEPARTURE_TIME:
				setExpectedDepartureTime((IBISIPDateTime)newValue);
				return;
			case IbisCommonPackage.CONNECTION__SCHEDULED_DEPARTURE_TIME:
				setScheduledDepartureTime((IBISIPDateTime)newValue);
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
			case IbisCommonPackage.CONNECTION__STOP_REF:
				setStopRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.CONNECTION__CONNECTION_REF:
				setConnectionRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.CONNECTION__CONNECTION_TYPE:
				unsetConnectionType();
				return;
			case IbisCommonPackage.CONNECTION__DISPLAY_CONTENT:
				setDisplayContent((DisplayContent)null);
				return;
			case IbisCommonPackage.CONNECTION__PLATFORM:
				setPlatform((IBISIPString)null);
				return;
			case IbisCommonPackage.CONNECTION__CONNECTION_STATE:
				unsetConnectionState();
				return;
			case IbisCommonPackage.CONNECTION__TRANSPORT_MODE:
				setTransportMode((Vehicle)null);
				return;
			case IbisCommonPackage.CONNECTION__CONNECTION_MODE:
				setConnectionMode((NetexMode)null);
				return;
			case IbisCommonPackage.CONNECTION__EXPECTED_DEPARTURE_TIME:
				setExpectedDepartureTime((IBISIPDateTime)null);
				return;
			case IbisCommonPackage.CONNECTION__SCHEDULED_DEPARTURE_TIME:
				setScheduledDepartureTime((IBISIPDateTime)null);
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
			case IbisCommonPackage.CONNECTION__STOP_REF:
				return stopRef != null;
			case IbisCommonPackage.CONNECTION__CONNECTION_REF:
				return connectionRef != null;
			case IbisCommonPackage.CONNECTION__CONNECTION_TYPE:
				return isSetConnectionType();
			case IbisCommonPackage.CONNECTION__DISPLAY_CONTENT:
				return displayContent != null;
			case IbisCommonPackage.CONNECTION__PLATFORM:
				return platform != null;
			case IbisCommonPackage.CONNECTION__CONNECTION_STATE:
				return isSetConnectionState();
			case IbisCommonPackage.CONNECTION__TRANSPORT_MODE:
				return transportMode != null;
			case IbisCommonPackage.CONNECTION__CONNECTION_MODE:
				return connectionMode != null;
			case IbisCommonPackage.CONNECTION__EXPECTED_DEPARTURE_TIME:
				return expectedDepartureTime != null;
			case IbisCommonPackage.CONNECTION__SCHEDULED_DEPARTURE_TIME:
				return scheduledDepartureTime != null;
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
		result.append(" (connectionType: ");
		if (connectionTypeESet) result.append(connectionType); else result.append("<unset>");
		result.append(", connectionState: ");
		if (connectionStateESet) result.append(connectionState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
