/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300.impl;

import org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.AttributesType;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.TranslationsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndImpl#getDimensionID <em>Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndImpl#getVisualizationProperties <em>Visualization Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipEndImpl extends MinimalEObjectImpl.Container implements RelationshipEnd {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final MultiplicityType MULTIPLICITY_EDEFAULT = MultiplicityType.ONE;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityType multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * This is true if the Multiplicity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiplicityESet;

	/**
	 * The default value of the '{@link #getDimensionID() <em>Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimensionID() <em>Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionID()
	 * @generated
	 * @ordered
	 */
	protected String dimensionID = DIMENSION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected AttributesType attributes;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType translations;

	/**
	 * The cached value of the '{@link #getVisualizationProperties() <em>Visualization Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizationProperties()
	 * @generated
	 * @ordered
	 */
	protected RelationshipEndVisualizationProperties visualizationProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Engine300_300Package.Literals.RELATIONSHIP_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END__ROLE, oldRole, role));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityType getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(MultiplicityType newMultiplicity) {
		MultiplicityType oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END__MULTIPLICITY, oldMultiplicity, multiplicity, !oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultiplicity() {
		MultiplicityType oldMultiplicity = multiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicity = MULTIPLICITY_EDEFAULT;
		multiplicityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300_300Package.RELATIONSHIP_END__MULTIPLICITY, oldMultiplicity, MULTIPLICITY_EDEFAULT, oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultiplicity() {
		return multiplicityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimensionID() {
		return dimensionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionID(String newDimensionID) {
		String oldDimensionID = dimensionID;
		dimensionID = newDimensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END__DIMENSION_ID, oldDimensionID, dimensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(AttributesType newAttributes, NotificationChain msgs) {
		AttributesType oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(AttributesType newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.RELATIONSHIP_END__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.RELATIONSHIP_END__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType getTranslations() {
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslations(TranslationsType newTranslations, NotificationChain msgs) {
		TranslationsType oldTranslations = translations;
		translations = newTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END__TRANSLATIONS, oldTranslations, newTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslations(TranslationsType newTranslations) {
		if (newTranslations != translations) {
			NotificationChain msgs = null;
			if (translations != null)
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.RELATIONSHIP_END__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.RELATIONSHIP_END__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipEndVisualizationProperties getVisualizationProperties() {
		return visualizationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisualizationProperties(RelationshipEndVisualizationProperties newVisualizationProperties, NotificationChain msgs) {
		RelationshipEndVisualizationProperties oldVisualizationProperties = visualizationProperties;
		visualizationProperties = newVisualizationProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END__VISUALIZATION_PROPERTIES, oldVisualizationProperties, newVisualizationProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualizationProperties(RelationshipEndVisualizationProperties newVisualizationProperties) {
		if (newVisualizationProperties != visualizationProperties) {
			NotificationChain msgs = null;
			if (visualizationProperties != null)
				msgs = ((InternalEObject)visualizationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.RELATIONSHIP_END__VISUALIZATION_PROPERTIES, null, msgs);
			if (newVisualizationProperties != null)
				msgs = ((InternalEObject)newVisualizationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.RELATIONSHIP_END__VISUALIZATION_PROPERTIES, null, msgs);
			msgs = basicSetVisualizationProperties(newVisualizationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP_END__VISUALIZATION_PROPERTIES, newVisualizationProperties, newVisualizationProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Engine300_300Package.RELATIONSHIP_END__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case Engine300_300Package.RELATIONSHIP_END__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case Engine300_300Package.RELATIONSHIP_END__VISUALIZATION_PROPERTIES:
				return basicSetVisualizationProperties(null, msgs);
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
			case Engine300_300Package.RELATIONSHIP_END__ROLE:
				return getRole();
			case Engine300_300Package.RELATIONSHIP_END__MULTIPLICITY:
				return getMultiplicity();
			case Engine300_300Package.RELATIONSHIP_END__DIMENSION_ID:
				return getDimensionID();
			case Engine300_300Package.RELATIONSHIP_END__ATTRIBUTES:
				return getAttributes();
			case Engine300_300Package.RELATIONSHIP_END__TRANSLATIONS:
				return getTranslations();
			case Engine300_300Package.RELATIONSHIP_END__VISUALIZATION_PROPERTIES:
				return getVisualizationProperties();
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
			case Engine300_300Package.RELATIONSHIP_END__ROLE:
				setRole((String)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP_END__MULTIPLICITY:
				setMultiplicity((MultiplicityType)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP_END__DIMENSION_ID:
				setDimensionID((String)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP_END__ATTRIBUTES:
				setAttributes((AttributesType)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP_END__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP_END__VISUALIZATION_PROPERTIES:
				setVisualizationProperties((RelationshipEndVisualizationProperties)newValue);
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
			case Engine300_300Package.RELATIONSHIP_END__ROLE:
				setRole(ROLE_EDEFAULT);
				return;
			case Engine300_300Package.RELATIONSHIP_END__MULTIPLICITY:
				unsetMultiplicity();
				return;
			case Engine300_300Package.RELATIONSHIP_END__DIMENSION_ID:
				setDimensionID(DIMENSION_ID_EDEFAULT);
				return;
			case Engine300_300Package.RELATIONSHIP_END__ATTRIBUTES:
				setAttributes((AttributesType)null);
				return;
			case Engine300_300Package.RELATIONSHIP_END__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case Engine300_300Package.RELATIONSHIP_END__VISUALIZATION_PROPERTIES:
				setVisualizationProperties((RelationshipEndVisualizationProperties)null);
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
			case Engine300_300Package.RELATIONSHIP_END__ROLE:
				return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
			case Engine300_300Package.RELATIONSHIP_END__MULTIPLICITY:
				return isSetMultiplicity();
			case Engine300_300Package.RELATIONSHIP_END__DIMENSION_ID:
				return DIMENSION_ID_EDEFAULT == null ? dimensionID != null : !DIMENSION_ID_EDEFAULT.equals(dimensionID);
			case Engine300_300Package.RELATIONSHIP_END__ATTRIBUTES:
				return attributes != null;
			case Engine300_300Package.RELATIONSHIP_END__TRANSLATIONS:
				return translations != null;
			case Engine300_300Package.RELATIONSHIP_END__VISUALIZATION_PROPERTIES:
				return visualizationProperties != null;
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
		result.append(" (role: ");
		result.append(role);
		result.append(", multiplicity: ");
		if (multiplicityESet) result.append(multiplicity); else result.append("<unset>");
		result.append(", dimensionID: ");
		result.append(dimensionID);
		result.append(')');
		return result.toString();
	}

} //RelationshipEndImpl
