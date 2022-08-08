/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType15;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeRelationship;
import org.eclipse.daanse.xmla.model.ecore.xmla.CardinalityType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.OptionalityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.OverrideBehaviorType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RelationshipTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType16;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeRelationshipImpl#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeRelationshipImpl#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeRelationshipImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeRelationshipImpl#getOptionality <em>Optionality</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeRelationshipImpl#getOverrideBehavior <em>Override Behavior</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeRelationshipImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeRelationshipImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributeRelationshipImpl#getTranslations <em>Translations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeRelationshipImpl extends MinimalEObjectImpl.Container implements AttributeRelationship {
	/**
	 * The default value of the '{@link #getAttributeID() <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeID()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeID() <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeID()
	 * @generated
	 * @ordered
	 */
	protected String attributeID = ATTRIBUTE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected static final RelationshipTypeType RELATIONSHIP_TYPE_EDEFAULT = RelationshipTypeType.RIGID;

	/**
	 * The cached value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected RelationshipTypeType relationshipType = RELATIONSHIP_TYPE_EDEFAULT;

	/**
	 * This is true if the Relationship Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean relationshipTypeESet;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final CardinalityType1 CARDINALITY_EDEFAULT = CardinalityType1.MANY;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected CardinalityType1 cardinality = CARDINALITY_EDEFAULT;

	/**
	 * This is true if the Cardinality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cardinalityESet;

	/**
	 * The default value of the '{@link #getOptionality() <em>Optionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionality()
	 * @generated
	 * @ordered
	 */
	protected static final OptionalityType OPTIONALITY_EDEFAULT = OptionalityType.MANDATORY;

	/**
	 * The cached value of the '{@link #getOptionality() <em>Optionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionality()
	 * @generated
	 * @ordered
	 */
	protected OptionalityType optionality = OPTIONALITY_EDEFAULT;

	/**
	 * This is true if the Optionality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optionalityESet;

	/**
	 * The default value of the '{@link #getOverrideBehavior() <em>Override Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final OverrideBehaviorType OVERRIDE_BEHAVIOR_EDEFAULT = OverrideBehaviorType.NONE;

	/**
	 * The cached value of the '{@link #getOverrideBehavior() <em>Override Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideBehavior()
	 * @generated
	 * @ordered
	 */
	protected OverrideBehaviorType overrideBehavior = OVERRIDE_BEHAVIOR_EDEFAULT;

	/**
	 * This is true if the Override Behavior attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean overrideBehaviorESet;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType15 annotations;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * This is true if the Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleESet;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType16 translations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.ATTRIBUTE_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeID() {
		return attributeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeID(String newAttributeID) {
		String oldAttributeID = attributeID;
		attributeID = newAttributeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__ATTRIBUTE_ID, oldAttributeID, attributeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTypeType getRelationshipType() {
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipType(RelationshipTypeType newRelationshipType) {
		RelationshipTypeType oldRelationshipType = relationshipType;
		relationshipType = newRelationshipType == null ? RELATIONSHIP_TYPE_EDEFAULT : newRelationshipType;
		boolean oldRelationshipTypeESet = relationshipTypeESet;
		relationshipTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__RELATIONSHIP_TYPE, oldRelationshipType, relationshipType, !oldRelationshipTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelationshipType() {
		RelationshipTypeType oldRelationshipType = relationshipType;
		boolean oldRelationshipTypeESet = relationshipTypeESet;
		relationshipType = RELATIONSHIP_TYPE_EDEFAULT;
		relationshipTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__RELATIONSHIP_TYPE, oldRelationshipType, RELATIONSHIP_TYPE_EDEFAULT, oldRelationshipTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationshipType() {
		return relationshipTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityType1 getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(CardinalityType1 newCardinality) {
		CardinalityType1 oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		boolean oldCardinalityESet = cardinalityESet;
		cardinalityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__CARDINALITY, oldCardinality, cardinality, !oldCardinalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCardinality() {
		CardinalityType1 oldCardinality = cardinality;
		boolean oldCardinalityESet = cardinalityESet;
		cardinality = CARDINALITY_EDEFAULT;
		cardinalityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__CARDINALITY, oldCardinality, CARDINALITY_EDEFAULT, oldCardinalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCardinality() {
		return cardinalityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalityType getOptionality() {
		return optionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionality(OptionalityType newOptionality) {
		OptionalityType oldOptionality = optionality;
		optionality = newOptionality == null ? OPTIONALITY_EDEFAULT : newOptionality;
		boolean oldOptionalityESet = optionalityESet;
		optionalityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__OPTIONALITY, oldOptionality, optionality, !oldOptionalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptionality() {
		OptionalityType oldOptionality = optionality;
		boolean oldOptionalityESet = optionalityESet;
		optionality = OPTIONALITY_EDEFAULT;
		optionalityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__OPTIONALITY, oldOptionality, OPTIONALITY_EDEFAULT, oldOptionalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOptionality() {
		return optionalityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverrideBehaviorType getOverrideBehavior() {
		return overrideBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverrideBehavior(OverrideBehaviorType newOverrideBehavior) {
		OverrideBehaviorType oldOverrideBehavior = overrideBehavior;
		overrideBehavior = newOverrideBehavior == null ? OVERRIDE_BEHAVIOR_EDEFAULT : newOverrideBehavior;
		boolean oldOverrideBehaviorESet = overrideBehaviorESet;
		overrideBehaviorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__OVERRIDE_BEHAVIOR, oldOverrideBehavior, overrideBehavior, !oldOverrideBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOverrideBehavior() {
		OverrideBehaviorType oldOverrideBehavior = overrideBehavior;
		boolean oldOverrideBehaviorESet = overrideBehaviorESet;
		overrideBehavior = OVERRIDE_BEHAVIOR_EDEFAULT;
		overrideBehaviorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__OVERRIDE_BEHAVIOR, oldOverrideBehavior, OVERRIDE_BEHAVIOR_EDEFAULT, oldOverrideBehaviorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOverrideBehavior() {
		return overrideBehaviorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType15 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType15 newAnnotations, NotificationChain msgs) {
		AnnotationsType15 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType15 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ATTRIBUTE_RELATIONSHIP__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ATTRIBUTE_RELATIONSHIP__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		boolean oldVisibleESet = visibleESet;
		visibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__VISIBLE, oldVisible, visible, !oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisible() {
		boolean oldVisible = visible;
		boolean oldVisibleESet = visibleESet;
		visible = VISIBLE_EDEFAULT;
		visibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisible() {
		return visibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType16 getTranslations() {
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslations(TranslationsType16 newTranslations, NotificationChain msgs) {
		TranslationsType16 oldTranslations = translations;
		translations = newTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__TRANSLATIONS, oldTranslations, newTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslations(TranslationsType16 newTranslations) {
		if (newTranslations != translations) {
			NotificationChain msgs = null;
			if (translations != null)
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ATTRIBUTE_RELATIONSHIP__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ATTRIBUTE_RELATIONSHIP__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_RELATIONSHIP__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
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
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__ATTRIBUTE_ID:
				return getAttributeID();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__RELATIONSHIP_TYPE:
				return getRelationshipType();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__CARDINALITY:
				return getCardinality();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__OPTIONALITY:
				return getOptionality();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__OVERRIDE_BEHAVIOR:
				return getOverrideBehavior();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__NAME:
				return getName();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__VISIBLE:
				return isVisible();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__TRANSLATIONS:
				return getTranslations();
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
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__ATTRIBUTE_ID:
				setAttributeID((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__RELATIONSHIP_TYPE:
				setRelationshipType((RelationshipTypeType)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__CARDINALITY:
				setCardinality((CardinalityType1)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__OPTIONALITY:
				setOptionality((OptionalityType)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__OVERRIDE_BEHAVIOR:
				setOverrideBehavior((OverrideBehaviorType)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__ANNOTATIONS:
				setAnnotations((AnnotationsType15)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__TRANSLATIONS:
				setTranslations((TranslationsType16)newValue);
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
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__ATTRIBUTE_ID:
				setAttributeID(ATTRIBUTE_ID_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__RELATIONSHIP_TYPE:
				unsetRelationshipType();
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__CARDINALITY:
				unsetCardinality();
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__OPTIONALITY:
				unsetOptionality();
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__OVERRIDE_BEHAVIOR:
				unsetOverrideBehavior();
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__ANNOTATIONS:
				setAnnotations((AnnotationsType15)null);
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__VISIBLE:
				unsetVisible();
				return;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__TRANSLATIONS:
				setTranslations((TranslationsType16)null);
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
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__ATTRIBUTE_ID:
				return ATTRIBUTE_ID_EDEFAULT == null ? attributeID != null : !ATTRIBUTE_ID_EDEFAULT.equals(attributeID);
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__RELATIONSHIP_TYPE:
				return isSetRelationshipType();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__CARDINALITY:
				return isSetCardinality();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__OPTIONALITY:
				return isSetOptionality();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__OVERRIDE_BEHAVIOR:
				return isSetOverrideBehavior();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__VISIBLE:
				return isSetVisible();
			case XmlaPackage.ATTRIBUTE_RELATIONSHIP__TRANSLATIONS:
				return translations != null;
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
		result.append(" (attributeID: ");
		result.append(attributeID);
		result.append(", relationshipType: ");
		if (relationshipTypeESet) result.append(relationshipType); else result.append("<unset>");
		result.append(", cardinality: ");
		if (cardinalityESet) result.append(cardinality); else result.append("<unset>");
		result.append(", optionality: ");
		if (optionalityESet) result.append(optionality); else result.append("<unset>");
		result.append(", overrideBehavior: ");
		if (overrideBehaviorESet) result.append(overrideBehavior); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AttributeRelationshipImpl
