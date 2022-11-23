/**
 */
package skos.impl;

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

import rdf.PlainLiteral;
import rdf.Resource;

import skos.ConceptType;
import skos.InSchemeType;
import skos.SkosPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link skos.impl.ConceptTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link skos.impl.ConceptTypeImpl#getPrefLabel <em>Pref Label</em>}</li>
 *   <li>{@link skos.impl.ConceptTypeImpl#getInScheme <em>In Scheme</em>}</li>
 *   <li>{@link skos.impl.ConceptTypeImpl#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptTypeImpl extends MinimalEObjectImpl.Container implements ConceptType {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> type;

	/**
	 * The cached value of the '{@link #getPrefLabel() <em>Pref Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<PlainLiteral> prefLabel;

	/**
	 * The cached value of the '{@link #getInScheme() <em>In Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInScheme()
	 * @generated
	 * @ordered
	 */
	protected InSchemeType inScheme;

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
	protected ConceptTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SkosPackage.Literals.CONCEPT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<Resource>(Resource.class, this, SkosPackage.CONCEPT_TYPE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlainLiteral> getPrefLabel() {
		if (prefLabel == null) {
			prefLabel = new EObjectContainmentEList<PlainLiteral>(PlainLiteral.class, this, SkosPackage.CONCEPT_TYPE__PREF_LABEL);
		}
		return prefLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InSchemeType getInScheme() {
		return inScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInScheme(InSchemeType newInScheme, NotificationChain msgs) {
		InSchemeType oldInScheme = inScheme;
		inScheme = newInScheme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SkosPackage.CONCEPT_TYPE__IN_SCHEME, oldInScheme, newInScheme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInScheme(InSchemeType newInScheme) {
		if (newInScheme != inScheme) {
			NotificationChain msgs = null;
			if (inScheme != null)
				msgs = ((InternalEObject)inScheme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SkosPackage.CONCEPT_TYPE__IN_SCHEME, null, msgs);
			if (newInScheme != null)
				msgs = ((InternalEObject)newInScheme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SkosPackage.CONCEPT_TYPE__IN_SCHEME, null, msgs);
			msgs = basicSetInScheme(newInScheme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SkosPackage.CONCEPT_TYPE__IN_SCHEME, newInScheme, newInScheme));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SkosPackage.CONCEPT_TYPE__ABOUT, oldAbout, about));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SkosPackage.CONCEPT_TYPE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case SkosPackage.CONCEPT_TYPE__PREF_LABEL:
				return ((InternalEList<?>)getPrefLabel()).basicRemove(otherEnd, msgs);
			case SkosPackage.CONCEPT_TYPE__IN_SCHEME:
				return basicSetInScheme(null, msgs);
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
			case SkosPackage.CONCEPT_TYPE__TYPE:
				return getType();
			case SkosPackage.CONCEPT_TYPE__PREF_LABEL:
				return getPrefLabel();
			case SkosPackage.CONCEPT_TYPE__IN_SCHEME:
				return getInScheme();
			case SkosPackage.CONCEPT_TYPE__ABOUT:
				return getAbout();
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
			case SkosPackage.CONCEPT_TYPE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Resource>)newValue);
				return;
			case SkosPackage.CONCEPT_TYPE__PREF_LABEL:
				getPrefLabel().clear();
				getPrefLabel().addAll((Collection<? extends PlainLiteral>)newValue);
				return;
			case SkosPackage.CONCEPT_TYPE__IN_SCHEME:
				setInScheme((InSchemeType)newValue);
				return;
			case SkosPackage.CONCEPT_TYPE__ABOUT:
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
			case SkosPackage.CONCEPT_TYPE__TYPE:
				getType().clear();
				return;
			case SkosPackage.CONCEPT_TYPE__PREF_LABEL:
				getPrefLabel().clear();
				return;
			case SkosPackage.CONCEPT_TYPE__IN_SCHEME:
				setInScheme((InSchemeType)null);
				return;
			case SkosPackage.CONCEPT_TYPE__ABOUT:
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
			case SkosPackage.CONCEPT_TYPE__TYPE:
				return type != null && !type.isEmpty();
			case SkosPackage.CONCEPT_TYPE__PREF_LABEL:
				return prefLabel != null && !prefLabel.isEmpty();
			case SkosPackage.CONCEPT_TYPE__IN_SCHEME:
				return inScheme != null;
			case SkosPackage.CONCEPT_TYPE__ABOUT:
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

} //ConceptTypeImpl
