/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.AnnouncementStructure;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.InternationalTextType;

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
 * An implementation of the model object '<em><b>Announcement Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.AnnouncementStructureImpl#getAnnouncementRef <em>Announcement Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.AnnouncementStructureImpl#getAnnouncementText <em>Announcement Text</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.AnnouncementStructureImpl#getAnnouncementTTSText <em>Announcement TTS Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnouncementStructureImpl extends MinimalEObjectImpl.Container implements AnnouncementStructure {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnouncementStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getAnnouncementStructure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF, oldAnnouncementRef, newAnnouncementRef);
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
				msgs = ((InternalEObject)announcementRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF, null, msgs);
			if (newAnnouncementRef != null)
				msgs = ((InternalEObject)newAnnouncementRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF, null, msgs);
			msgs = basicSetAnnouncementRef(newAnnouncementRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF, newAnnouncementRef, newAnnouncementRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAnnouncementText() {
		if (announcementText == null) {
			announcementText = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TEXT);
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
			announcementTTSText = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TTS_TEXT);
		}
		return announcementTTSText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF:
				return basicSetAnnouncementRef(null, msgs);
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TEXT:
				return ((InternalEList<?>)getAnnouncementText()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TTS_TEXT:
				return ((InternalEList<?>)getAnnouncementTTSText()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF:
				return getAnnouncementRef();
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TEXT:
				return getAnnouncementText();
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TTS_TEXT:
				return getAnnouncementTTSText();
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
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF:
				setAnnouncementRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TEXT:
				getAnnouncementText().clear();
				getAnnouncementText().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TTS_TEXT:
				getAnnouncementTTSText().clear();
				getAnnouncementTTSText().addAll((Collection<? extends InternationalTextType>)newValue);
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
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF:
				setAnnouncementRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TEXT:
				getAnnouncementText().clear();
				return;
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TTS_TEXT:
				getAnnouncementTTSText().clear();
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
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_REF:
				return announcementRef != null;
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TEXT:
				return announcementText != null && !announcementText.isEmpty();
			case IbisCommonPackage.ANNOUNCEMENT_STRUCTURE__ANNOUNCEMENT_TTS_TEXT:
				return announcementTTSText != null && !announcementTTSText.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AnnouncementStructureImpl
