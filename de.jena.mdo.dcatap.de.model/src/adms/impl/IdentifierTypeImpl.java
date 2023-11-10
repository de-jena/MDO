/*
 */
package adms.impl;

import adms.AdmsPackage;
import adms.IdentifierType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rdf.TypedLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link adms.impl.IdentifierTypeImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link adms.impl.IdentifierTypeImpl#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifierTypeImpl extends MinimalEObjectImpl.Container implements IdentifierType {
	/**
	 * The cached value of the '{@link #getNotation() <em>Notation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotation()
	 * @generated
	 * @ordered
	 */
	protected TypedLiteral notation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdmsPackage.Literals.IDENTIFIER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedLiteral getNotation() {
		return notation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotation(TypedLiteral newNotation, NotificationChain msgs) {
		TypedLiteral oldNotation = notation;
		notation = newNotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdmsPackage.IDENTIFIER_TYPE__NOTATION, oldNotation, newNotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotation(TypedLiteral newNotation) {
		if (newNotation != notation) {
			NotificationChain msgs = null;
			if (notation != null)
				msgs = ((InternalEObject)notation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdmsPackage.IDENTIFIER_TYPE__NOTATION, null, msgs);
			if (newNotation != null)
				msgs = ((InternalEObject)newNotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdmsPackage.IDENTIFIER_TYPE__NOTATION, null, msgs);
			msgs = basicSetNotation(newNotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdmsPackage.IDENTIFIER_TYPE__NOTATION, newNotation, newNotation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdmsPackage.IDENTIFIER_TYPE__ABOUT, oldAbout, about));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdmsPackage.IDENTIFIER_TYPE__NOTATION:
				return basicSetNotation(null, msgs);
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
			case AdmsPackage.IDENTIFIER_TYPE__NOTATION:
				return getNotation();
			case AdmsPackage.IDENTIFIER_TYPE__ABOUT:
				return getAbout();
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
			case AdmsPackage.IDENTIFIER_TYPE__NOTATION:
				setNotation((TypedLiteral)newValue);
				return;
			case AdmsPackage.IDENTIFIER_TYPE__ABOUT:
				setAbout((String)newValue);
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
			case AdmsPackage.IDENTIFIER_TYPE__NOTATION:
				setNotation((TypedLiteral)null);
				return;
			case AdmsPackage.IDENTIFIER_TYPE__ABOUT:
				setAbout(ABOUT_EDEFAULT);
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
			case AdmsPackage.IDENTIFIER_TYPE__NOTATION:
				return notation != null;
			case AdmsPackage.IDENTIFIER_TYPE__ABOUT:
				return ABOUT_EDEFAULT == null ? about != null : !ABOUT_EDEFAULT.equals(about);
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
		result.append(')');
		return result.toString();
	}

} //IdentifierTypeImpl
