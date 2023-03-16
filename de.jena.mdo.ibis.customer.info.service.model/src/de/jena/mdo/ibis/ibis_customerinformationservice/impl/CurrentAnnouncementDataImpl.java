/*
 */
package de.jena.mdo.ibis.ibis_customerinformationservice.impl;

import de.jena.mdo.ibis.ibis_common.Announcement;
import de.jena.mdo.ibis.ibis_common.IBISIPDateTime;

import de.jena.mdo.ibis.ibis_customerinformationservice.CurrentAnnouncementData;
import de.jena.mdo.ibis.ibis_customerinformationservice.IbisCustomerInformationServicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Announcement Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentAnnouncementDataImpl#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_customerinformationservice.impl.CurrentAnnouncementDataImpl#getCurrentAnnouncement <em>Current Announcement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentAnnouncementDataImpl extends MinimalEObjectImpl.Container implements CurrentAnnouncementData {
	/**
	 * The cached value of the '{@link #getTimeStamp() <em>Time Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStamp()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDateTime timeStamp;

	/**
	 * The cached value of the '{@link #getCurrentAnnouncement() <em>Current Announcement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentAnnouncement()
	 * @generated
	 * @ordered
	 */
	protected Announcement currentAnnouncement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentAnnouncementDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCustomerInformationServicePackage.Literals.CURRENT_ANNOUNCEMENT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDateTime getTimeStamp() {
		return timeStamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStamp(IBISIPDateTime newTimeStamp, NotificationChain msgs) {
		IBISIPDateTime oldTimeStamp = timeStamp;
		timeStamp = newTimeStamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP, oldTimeStamp, newTimeStamp);
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
	public void setTimeStamp(IBISIPDateTime newTimeStamp) {
		if (newTimeStamp != timeStamp) {
			NotificationChain msgs = null;
			if (timeStamp != null)
				msgs = ((InternalEObject)timeStamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP, null, msgs);
			if (newTimeStamp != null)
				msgs = ((InternalEObject)newTimeStamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP, null, msgs);
			msgs = basicSetTimeStamp(newTimeStamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP, newTimeStamp, newTimeStamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Announcement getCurrentAnnouncement() {
		return currentAnnouncement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentAnnouncement(Announcement newCurrentAnnouncement, NotificationChain msgs) {
		Announcement oldCurrentAnnouncement = currentAnnouncement;
		currentAnnouncement = newCurrentAnnouncement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT, oldCurrentAnnouncement, newCurrentAnnouncement);
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
	public void setCurrentAnnouncement(Announcement newCurrentAnnouncement) {
		if (newCurrentAnnouncement != currentAnnouncement) {
			NotificationChain msgs = null;
			if (currentAnnouncement != null)
				msgs = ((InternalEObject)currentAnnouncement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT, null, msgs);
			if (newCurrentAnnouncement != null)
				msgs = ((InternalEObject)newCurrentAnnouncement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT, null, msgs);
			msgs = basicSetCurrentAnnouncement(newCurrentAnnouncement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT, newCurrentAnnouncement, newCurrentAnnouncement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP:
				return basicSetTimeStamp(null, msgs);
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT:
				return basicSetCurrentAnnouncement(null, msgs);
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
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP:
				return getTimeStamp();
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT:
				return getCurrentAnnouncement();
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
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)newValue);
				return;
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT:
				setCurrentAnnouncement((Announcement)newValue);
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
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP:
				setTimeStamp((IBISIPDateTime)null);
				return;
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT:
				setCurrentAnnouncement((Announcement)null);
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
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__TIME_STAMP:
				return timeStamp != null;
			case IbisCustomerInformationServicePackage.CURRENT_ANNOUNCEMENT_DATA__CURRENT_ANNOUNCEMENT:
				return currentAnnouncement != null;
		}
		return super.eIsSet(featureID);
	}

} //CurrentAnnouncementDataImpl
