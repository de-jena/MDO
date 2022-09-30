/**
 */
package terms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import terms.LicenseDocument;
import terms.LicenseDocumentType;
import terms.TermsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>License Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terms.impl.LicenseDocumentImpl#getLicenseDocument <em>License Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LicenseDocumentImpl extends MinimalEObjectImpl.Container implements LicenseDocument {
	/**
	 * The cached value of the '{@link #getLicenseDocument() <em>License Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseDocument()
	 * @generated
	 * @ordered
	 */
	protected LicenseDocumentType licenseDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicenseDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.LICENSE_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseDocumentType getLicenseDocument() {
		return licenseDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicenseDocument(LicenseDocumentType newLicenseDocument, NotificationChain msgs) {
		LicenseDocumentType oldLicenseDocument = licenseDocument;
		licenseDocument = newLicenseDocument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TermsPackage.LICENSE_DOCUMENT__LICENSE_DOCUMENT, oldLicenseDocument, newLicenseDocument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicenseDocument(LicenseDocumentType newLicenseDocument) {
		if (newLicenseDocument != licenseDocument) {
			NotificationChain msgs = null;
			if (licenseDocument != null)
				msgs = ((InternalEObject)licenseDocument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TermsPackage.LICENSE_DOCUMENT__LICENSE_DOCUMENT, null, msgs);
			if (newLicenseDocument != null)
				msgs = ((InternalEObject)newLicenseDocument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TermsPackage.LICENSE_DOCUMENT__LICENSE_DOCUMENT, null, msgs);
			msgs = basicSetLicenseDocument(newLicenseDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.LICENSE_DOCUMENT__LICENSE_DOCUMENT, newLicenseDocument, newLicenseDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TermsPackage.LICENSE_DOCUMENT__LICENSE_DOCUMENT:
				return basicSetLicenseDocument(null, msgs);
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
			case TermsPackage.LICENSE_DOCUMENT__LICENSE_DOCUMENT:
				return getLicenseDocument();
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
			case TermsPackage.LICENSE_DOCUMENT__LICENSE_DOCUMENT:
				setLicenseDocument((LicenseDocumentType)newValue);
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
			case TermsPackage.LICENSE_DOCUMENT__LICENSE_DOCUMENT:
				setLicenseDocument((LicenseDocumentType)null);
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
			case TermsPackage.LICENSE_DOCUMENT__LICENSE_DOCUMENT:
				return licenseDocument != null;
		}
		return super.eIsSet(featureID);
	}

} //LicenseDocumentImpl
