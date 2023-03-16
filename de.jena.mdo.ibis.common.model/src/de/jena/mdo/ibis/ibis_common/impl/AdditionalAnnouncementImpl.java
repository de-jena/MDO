/*
 */
package de.jena.mdo.ibis.ibis_common.impl;

import de.jena.mdo.ibis.ibis_common.AdditionalAnnouncement;
import de.jena.mdo.ibis.ibis_common.IBISIPBoolean;
import de.jena.mdo.ibis.ibis_common.IBISIPDuration;
import de.jena.mdo.ibis.ibis_common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.ibis_common.IbisCommonPackage;
import de.jena.mdo.ibis.ibis_common.InternationalTextType;
import de.jena.mdo.ibis.ibis_common.SpecificPoint;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Announcement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.AdditionalAnnouncementImpl#getAnnouncementRef <em>Announcement Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.AdditionalAnnouncementImpl#getAnnouncementText <em>Announcement Text</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.AdditionalAnnouncementImpl#getAnnouncementTTSText <em>Announcement TTS Text</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.AdditionalAnnouncementImpl#getImmediateInformation <em>Immediate Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.AdditionalAnnouncementImpl#getPeriodicalInformation <em>Periodical Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.impl.AdditionalAnnouncementImpl#getSpecificPoint <em>Specific Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdditionalAnnouncementImpl extends MinimalEObjectImpl.Container implements AdditionalAnnouncement {
	/**
	 * The cached value of the '{@link #getAnnouncementRef() <em>Announcement Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnouncementRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN announcementRef;

	/**
	 * The cached value of the '{@link #getAnnouncementText() <em>Announcement Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnouncementText()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> announcementText;

	/**
	 * The cached value of the '{@link #getAnnouncementTTSText() <em>Announcement TTS Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnouncementTTSText()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> announcementTTSText;

	/**
	 * The cached value of the '{@link #getImmediateInformation() <em>Immediate Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediateInformation()
	 * @generated
	 * @ordered
	 */
	protected IBISIPBoolean immediateInformation;

	/**
	 * The cached value of the '{@link #getPeriodicalInformation() <em>Periodical Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodicalInformation()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDuration periodicalInformation;

	/**
	 * The cached value of the '{@link #getSpecificPoint() <em>Specific Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecificPoint()
	 * @generated
	 * @ordered
	 */
	protected SpecificPoint specificPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalAnnouncementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.Literals.ADDITIONAL_ANNOUNCEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getAnnouncementRef() {
		return announcementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnouncementRef(IBISIPNMTOKEN newAnnouncementRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldAnnouncementRef = announcementRef;
		announcementRef = newAnnouncementRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_REF, oldAnnouncementRef, newAnnouncementRef);
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
	public void setAnnouncementRef(IBISIPNMTOKEN newAnnouncementRef) {
		if (newAnnouncementRef != announcementRef) {
			NotificationChain msgs = null;
			if (announcementRef != null)
				msgs = ((InternalEObject)announcementRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_REF, null, msgs);
			if (newAnnouncementRef != null)
				msgs = ((InternalEObject)newAnnouncementRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_REF, null, msgs);
			msgs = basicSetAnnouncementRef(newAnnouncementRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_REF, newAnnouncementRef, newAnnouncementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAnnouncementText() {
		if (announcementText == null) {
			announcementText = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TEXT);
		}
		return announcementText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAnnouncementTTSText() {
		if (announcementTTSText == null) {
			announcementTTSText = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TTS_TEXT);
		}
		return announcementTTSText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPBoolean getImmediateInformation() {
		return immediateInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmediateInformation(IBISIPBoolean newImmediateInformation, NotificationChain msgs) {
		IBISIPBoolean oldImmediateInformation = immediateInformation;
		immediateInformation = newImmediateInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__IMMEDIATE_INFORMATION, oldImmediateInformation, newImmediateInformation);
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
	public void setImmediateInformation(IBISIPBoolean newImmediateInformation) {
		if (newImmediateInformation != immediateInformation) {
			NotificationChain msgs = null;
			if (immediateInformation != null)
				msgs = ((InternalEObject)immediateInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__IMMEDIATE_INFORMATION, null, msgs);
			if (newImmediateInformation != null)
				msgs = ((InternalEObject)newImmediateInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__IMMEDIATE_INFORMATION, null, msgs);
			msgs = basicSetImmediateInformation(newImmediateInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__IMMEDIATE_INFORMATION, newImmediateInformation, newImmediateInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDuration getPeriodicalInformation() {
		return periodicalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodicalInformation(IBISIPDuration newPeriodicalInformation, NotificationChain msgs) {
		IBISIPDuration oldPeriodicalInformation = periodicalInformation;
		periodicalInformation = newPeriodicalInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__PERIODICAL_INFORMATION, oldPeriodicalInformation, newPeriodicalInformation);
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
	public void setPeriodicalInformation(IBISIPDuration newPeriodicalInformation) {
		if (newPeriodicalInformation != periodicalInformation) {
			NotificationChain msgs = null;
			if (periodicalInformation != null)
				msgs = ((InternalEObject)periodicalInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__PERIODICAL_INFORMATION, null, msgs);
			if (newPeriodicalInformation != null)
				msgs = ((InternalEObject)newPeriodicalInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__PERIODICAL_INFORMATION, null, msgs);
			msgs = basicSetPeriodicalInformation(newPeriodicalInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__PERIODICAL_INFORMATION, newPeriodicalInformation, newPeriodicalInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecificPoint getSpecificPoint() {
		return specificPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecificPoint(SpecificPoint newSpecificPoint, NotificationChain msgs) {
		SpecificPoint oldSpecificPoint = specificPoint;
		specificPoint = newSpecificPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__SPECIFIC_POINT, oldSpecificPoint, newSpecificPoint);
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
	public void setSpecificPoint(SpecificPoint newSpecificPoint) {
		if (newSpecificPoint != specificPoint) {
			NotificationChain msgs = null;
			if (specificPoint != null)
				msgs = ((InternalEObject)specificPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__SPECIFIC_POINT, null, msgs);
			if (newSpecificPoint != null)
				msgs = ((InternalEObject)newSpecificPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__SPECIFIC_POINT, null, msgs);
			msgs = basicSetSpecificPoint(newSpecificPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__SPECIFIC_POINT, newSpecificPoint, newSpecificPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_REF:
				return basicSetAnnouncementRef(null, msgs);
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TEXT:
				return ((InternalEList<?>)getAnnouncementText()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TTS_TEXT:
				return ((InternalEList<?>)getAnnouncementTTSText()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__IMMEDIATE_INFORMATION:
				return basicSetImmediateInformation(null, msgs);
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__PERIODICAL_INFORMATION:
				return basicSetPeriodicalInformation(null, msgs);
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__SPECIFIC_POINT:
				return basicSetSpecificPoint(null, msgs);
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
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_REF:
				return getAnnouncementRef();
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TEXT:
				return getAnnouncementText();
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TTS_TEXT:
				return getAnnouncementTTSText();
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__IMMEDIATE_INFORMATION:
				return getImmediateInformation();
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__PERIODICAL_INFORMATION:
				return getPeriodicalInformation();
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__SPECIFIC_POINT:
				return getSpecificPoint();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_REF:
				setAnnouncementRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TEXT:
				getAnnouncementText().clear();
				getAnnouncementText().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TTS_TEXT:
				getAnnouncementTTSText().clear();
				getAnnouncementTTSText().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__IMMEDIATE_INFORMATION:
				setImmediateInformation((IBISIPBoolean)newValue);
				return;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__PERIODICAL_INFORMATION:
				setPeriodicalInformation((IBISIPDuration)newValue);
				return;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__SPECIFIC_POINT:
				setSpecificPoint((SpecificPoint)newValue);
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
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_REF:
				setAnnouncementRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TEXT:
				getAnnouncementText().clear();
				return;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TTS_TEXT:
				getAnnouncementTTSText().clear();
				return;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__IMMEDIATE_INFORMATION:
				setImmediateInformation((IBISIPBoolean)null);
				return;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__PERIODICAL_INFORMATION:
				setPeriodicalInformation((IBISIPDuration)null);
				return;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__SPECIFIC_POINT:
				setSpecificPoint((SpecificPoint)null);
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
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_REF:
				return announcementRef != null;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TEXT:
				return announcementText != null && !announcementText.isEmpty();
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__ANNOUNCEMENT_TTS_TEXT:
				return announcementTTSText != null && !announcementTTSText.isEmpty();
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__IMMEDIATE_INFORMATION:
				return immediateInformation != null;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__PERIODICAL_INFORMATION:
				return periodicalInformation != null;
			case IbisCommonPackage.ADDITIONAL_ANNOUNCEMENT__SPECIFIC_POINT:
				return specificPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //AdditionalAnnouncementImpl
