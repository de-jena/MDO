/*
 */
package terms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rdf.DateOrDateTimeLiteral;

import terms.PeriodOfTimeType;
import terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Period Of Time Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terms.impl.PeriodOfTimeTypeImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link terms.impl.PeriodOfTimeTypeImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link terms.impl.PeriodOfTimeTypeImpl#getAbout <em>About</em>}</li>
 *   <li>{@link terms.impl.PeriodOfTimeTypeImpl#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeriodOfTimeTypeImpl extends MinimalEObjectImpl.Container implements PeriodOfTimeType {
	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected DateOrDateTimeLiteral startDate;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected DateOrDateTimeLiteral endDate;

	/**
	 * The default value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected static final String ABOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbout() <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbout()
	 * @generated
	 * @ordered
	 */
	protected String about = ABOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeID()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeID() <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeID()
	 * @generated
	 * @ordered
	 */
	protected String nodeID = NODE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeriodOfTimeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.PERIOD_OF_TIME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOrDateTimeLiteral getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartDate(DateOrDateTimeLiteral newStartDate, NotificationChain msgs) {
		DateOrDateTimeLiteral oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermsPackage.PERIOD_OF_TIME_TYPE__START_DATE, oldStartDate, newStartDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(DateOrDateTimeLiteral newStartDate) {
		if (newStartDate != startDate) {
			NotificationChain msgs = null;
			if (startDate != null)
				msgs = ((InternalEObject)startDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermsPackage.PERIOD_OF_TIME_TYPE__START_DATE, null, msgs);
			if (newStartDate != null)
				msgs = ((InternalEObject)newStartDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermsPackage.PERIOD_OF_TIME_TYPE__START_DATE, null, msgs);
			msgs = basicSetStartDate(newStartDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.PERIOD_OF_TIME_TYPE__START_DATE, newStartDate, newStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOrDateTimeLiteral getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndDate(DateOrDateTimeLiteral newEndDate, NotificationChain msgs) {
		DateOrDateTimeLiteral oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermsPackage.PERIOD_OF_TIME_TYPE__END_DATE, oldEndDate, newEndDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(DateOrDateTimeLiteral newEndDate) {
		if (newEndDate != endDate) {
			NotificationChain msgs = null;
			if (endDate != null)
				msgs = ((InternalEObject)endDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermsPackage.PERIOD_OF_TIME_TYPE__END_DATE, null, msgs);
			if (newEndDate != null)
				msgs = ((InternalEObject)newEndDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermsPackage.PERIOD_OF_TIME_TYPE__END_DATE, null, msgs);
			msgs = basicSetEndDate(newEndDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.PERIOD_OF_TIME_TYPE__END_DATE, newEndDate, newEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbout(String newAbout) {
		String oldAbout = about;
		about = newAbout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.PERIOD_OF_TIME_TYPE__ABOUT, oldAbout, about));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeID() {
		return nodeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeID(String newNodeID) {
		String oldNodeID = nodeID;
		nodeID = newNodeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.PERIOD_OF_TIME_TYPE__NODE_ID, oldNodeID, nodeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.PERIOD_OF_TIME_TYPE__START_DATE:
				return basicSetStartDate(null, msgs);
			case TermsPackage.PERIOD_OF_TIME_TYPE__END_DATE:
				return basicSetEndDate(null, msgs);
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
			case TermsPackage.PERIOD_OF_TIME_TYPE__START_DATE:
				return getStartDate();
			case TermsPackage.PERIOD_OF_TIME_TYPE__END_DATE:
				return getEndDate();
			case TermsPackage.PERIOD_OF_TIME_TYPE__ABOUT:
				return getAbout();
			case TermsPackage.PERIOD_OF_TIME_TYPE__NODE_ID:
				return getNodeID();
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
			case TermsPackage.PERIOD_OF_TIME_TYPE__START_DATE:
				setStartDate((DateOrDateTimeLiteral)newValue);
				return;
			case TermsPackage.PERIOD_OF_TIME_TYPE__END_DATE:
				setEndDate((DateOrDateTimeLiteral)newValue);
				return;
			case TermsPackage.PERIOD_OF_TIME_TYPE__ABOUT:
				setAbout((String)newValue);
				return;
			case TermsPackage.PERIOD_OF_TIME_TYPE__NODE_ID:
				setNodeID((String)newValue);
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
			case TermsPackage.PERIOD_OF_TIME_TYPE__START_DATE:
				setStartDate((DateOrDateTimeLiteral)null);
				return;
			case TermsPackage.PERIOD_OF_TIME_TYPE__END_DATE:
				setEndDate((DateOrDateTimeLiteral)null);
				return;
			case TermsPackage.PERIOD_OF_TIME_TYPE__ABOUT:
				setAbout(ABOUT_EDEFAULT);
				return;
			case TermsPackage.PERIOD_OF_TIME_TYPE__NODE_ID:
				setNodeID(NODE_ID_EDEFAULT);
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
			case TermsPackage.PERIOD_OF_TIME_TYPE__START_DATE:
				return startDate != null;
			case TermsPackage.PERIOD_OF_TIME_TYPE__END_DATE:
				return endDate != null;
			case TermsPackage.PERIOD_OF_TIME_TYPE__ABOUT:
				return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
			case TermsPackage.PERIOD_OF_TIME_TYPE__NODE_ID:
				return NODE_ID_EDEFAULT == null ? nodeID != null : !NODE_ID_EDEFAULT.equals(nodeID);
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
		result.append(" (about: ");
		result.append(about);
		result.append(", nodeID: ");
		result.append(nodeID);
		result.append(')');
		return result.toString();
	}

} //PeriodOfTimeTypeImpl
