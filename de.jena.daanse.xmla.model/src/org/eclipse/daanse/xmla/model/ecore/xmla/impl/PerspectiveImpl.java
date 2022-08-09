/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.xmla.ActionsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CalculationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DimensionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KpisType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.Perspective;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getDefaultMeasure <em>Default Measure</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getMeasureGroups <em>Measure Groups</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getCalculations <em>Calculations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getKpis <em>Kpis</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveImpl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerspectiveImpl extends MinimalEObjectImpl.Container implements Perspective {
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
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedTimestamp() <em>Created Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATED_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedTimestamp() <em>Created Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar createdTimestamp = CREATED_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastSchemaUpdate() <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSchemaUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_SCHEMA_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastSchemaUpdate() <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSchemaUpdate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastSchemaUpdate = LAST_SCHEMA_UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType annotations;

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
	 * The default value of the '{@link #getDefaultMeasure() <em>Default Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMeasure()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_MEASURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultMeasure() <em>Default Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMeasure()
	 * @generated
	 * @ordered
	 */
	protected String defaultMeasure = DEFAULT_MEASURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected DimensionsType dimensions;

	/**
	 * The cached value of the '{@link #getMeasureGroups() <em>Measure Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroups()
	 * @generated
	 * @ordered
	 */
	protected MeasureGroupsType1 measureGroups;

	/**
	 * The cached value of the '{@link #getCalculations() <em>Calculations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculations()
	 * @generated
	 * @ordered
	 */
	protected CalculationsType calculations;

	/**
	 * The cached value of the '{@link #getKpis() <em>Kpis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpis()
	 * @generated
	 * @ordered
	 */
	protected KpisType1 kpis;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected ActionsType1 actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PERSPECTIVE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreatedTimestamp() {
		return createdTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedTimestamp(XMLGregorianCalendar newCreatedTimestamp) {
		XMLGregorianCalendar oldCreatedTimestamp = createdTimestamp;
		createdTimestamp = newCreatedTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__CREATED_TIMESTAMP, oldCreatedTimestamp, createdTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastSchemaUpdate() {
		return lastSchemaUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSchemaUpdate(XMLGregorianCalendar newLastSchemaUpdate) {
		XMLGregorianCalendar oldLastSchemaUpdate = lastSchemaUpdate;
		lastSchemaUpdate = newLastSchemaUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType newAnnotations, NotificationChain msgs) {
		AnnotationsType oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__ANNOTATIONS, newAnnotations, newAnnotations));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__TRANSLATIONS, oldTranslations, newTranslations);
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
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultMeasure() {
		return defaultMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultMeasure(String newDefaultMeasure) {
		String oldDefaultMeasure = defaultMeasure;
		defaultMeasure = newDefaultMeasure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__DEFAULT_MEASURE, oldDefaultMeasure, defaultMeasure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensions(DimensionsType newDimensions, NotificationChain msgs) {
		DimensionsType oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__DIMENSIONS, oldDimensions, newDimensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(DimensionsType newDimensions) {
		if (newDimensions != dimensions) {
			NotificationChain msgs = null;
			if (dimensions != null)
				msgs = ((InternalEObject)dimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__DIMENSIONS, null, msgs);
			if (newDimensions != null)
				msgs = ((InternalEObject)newDimensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__DIMENSIONS, null, msgs);
			msgs = basicSetDimensions(newDimensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__DIMENSIONS, newDimensions, newDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupsType1 getMeasureGroups() {
		return measureGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureGroups(MeasureGroupsType1 newMeasureGroups, NotificationChain msgs) {
		MeasureGroupsType1 oldMeasureGroups = measureGroups;
		measureGroups = newMeasureGroups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__MEASURE_GROUPS, oldMeasureGroups, newMeasureGroups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureGroups(MeasureGroupsType1 newMeasureGroups) {
		if (newMeasureGroups != measureGroups) {
			NotificationChain msgs = null;
			if (measureGroups != null)
				msgs = ((InternalEObject)measureGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__MEASURE_GROUPS, null, msgs);
			if (newMeasureGroups != null)
				msgs = ((InternalEObject)newMeasureGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__MEASURE_GROUPS, null, msgs);
			msgs = basicSetMeasureGroups(newMeasureGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__MEASURE_GROUPS, newMeasureGroups, newMeasureGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationsType getCalculations() {
		return calculations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculations(CalculationsType newCalculations, NotificationChain msgs) {
		CalculationsType oldCalculations = calculations;
		calculations = newCalculations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__CALCULATIONS, oldCalculations, newCalculations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculations(CalculationsType newCalculations) {
		if (newCalculations != calculations) {
			NotificationChain msgs = null;
			if (calculations != null)
				msgs = ((InternalEObject)calculations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__CALCULATIONS, null, msgs);
			if (newCalculations != null)
				msgs = ((InternalEObject)newCalculations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__CALCULATIONS, null, msgs);
			msgs = basicSetCalculations(newCalculations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__CALCULATIONS, newCalculations, newCalculations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KpisType1 getKpis() {
		return kpis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKpis(KpisType1 newKpis, NotificationChain msgs) {
		KpisType1 oldKpis = kpis;
		kpis = newKpis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__KPIS, oldKpis, newKpis);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKpis(KpisType1 newKpis) {
		if (newKpis != kpis) {
			NotificationChain msgs = null;
			if (kpis != null)
				msgs = ((InternalEObject)kpis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__KPIS, null, msgs);
			if (newKpis != null)
				msgs = ((InternalEObject)newKpis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__KPIS, null, msgs);
			msgs = basicSetKpis(newKpis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__KPIS, newKpis, newKpis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionsType1 getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActions(ActionsType1 newActions, NotificationChain msgs) {
		ActionsType1 oldActions = actions;
		actions = newActions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__ACTIONS, oldActions, newActions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActions(ActionsType1 newActions) {
		if (newActions != actions) {
			NotificationChain msgs = null;
			if (actions != null)
				msgs = ((InternalEObject)actions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__ACTIONS, null, msgs);
			if (newActions != null)
				msgs = ((InternalEObject)newActions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE__ACTIONS, null, msgs);
			msgs = basicSetActions(newActions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE__ACTIONS, newActions, newActions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.PERSPECTIVE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.PERSPECTIVE__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.PERSPECTIVE__DIMENSIONS:
				return basicSetDimensions(null, msgs);
			case XmlaPackage.PERSPECTIVE__MEASURE_GROUPS:
				return basicSetMeasureGroups(null, msgs);
			case XmlaPackage.PERSPECTIVE__CALCULATIONS:
				return basicSetCalculations(null, msgs);
			case XmlaPackage.PERSPECTIVE__KPIS:
				return basicSetKpis(null, msgs);
			case XmlaPackage.PERSPECTIVE__ACTIONS:
				return basicSetActions(null, msgs);
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
			case XmlaPackage.PERSPECTIVE__NAME:
				return getName();
			case XmlaPackage.PERSPECTIVE__ID:
				return getID();
			case XmlaPackage.PERSPECTIVE__CREATED_TIMESTAMP:
				return getCreatedTimestamp();
			case XmlaPackage.PERSPECTIVE__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
			case XmlaPackage.PERSPECTIVE__DESCRIPTION:
				return getDescription();
			case XmlaPackage.PERSPECTIVE__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.PERSPECTIVE__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.PERSPECTIVE__DEFAULT_MEASURE:
				return getDefaultMeasure();
			case XmlaPackage.PERSPECTIVE__DIMENSIONS:
				return getDimensions();
			case XmlaPackage.PERSPECTIVE__MEASURE_GROUPS:
				return getMeasureGroups();
			case XmlaPackage.PERSPECTIVE__CALCULATIONS:
				return getCalculations();
			case XmlaPackage.PERSPECTIVE__KPIS:
				return getKpis();
			case XmlaPackage.PERSPECTIVE__ACTIONS:
				return getActions();
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
			case XmlaPackage.PERSPECTIVE__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.PERSPECTIVE__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.PERSPECTIVE__CREATED_TIMESTAMP:
				setCreatedTimestamp((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.PERSPECTIVE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.PERSPECTIVE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.PERSPECTIVE__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case XmlaPackage.PERSPECTIVE__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case XmlaPackage.PERSPECTIVE__DEFAULT_MEASURE:
				setDefaultMeasure((String)newValue);
				return;
			case XmlaPackage.PERSPECTIVE__DIMENSIONS:
				setDimensions((DimensionsType)newValue);
				return;
			case XmlaPackage.PERSPECTIVE__MEASURE_GROUPS:
				setMeasureGroups((MeasureGroupsType1)newValue);
				return;
			case XmlaPackage.PERSPECTIVE__CALCULATIONS:
				setCalculations((CalculationsType)newValue);
				return;
			case XmlaPackage.PERSPECTIVE__KPIS:
				setKpis((KpisType1)newValue);
				return;
			case XmlaPackage.PERSPECTIVE__ACTIONS:
				setActions((ActionsType1)newValue);
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
			case XmlaPackage.PERSPECTIVE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.PERSPECTIVE__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.PERSPECTIVE__CREATED_TIMESTAMP:
				setCreatedTimestamp(CREATED_TIMESTAMP_EDEFAULT);
				return;
			case XmlaPackage.PERSPECTIVE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.PERSPECTIVE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.PERSPECTIVE__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case XmlaPackage.PERSPECTIVE__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case XmlaPackage.PERSPECTIVE__DEFAULT_MEASURE:
				setDefaultMeasure(DEFAULT_MEASURE_EDEFAULT);
				return;
			case XmlaPackage.PERSPECTIVE__DIMENSIONS:
				setDimensions((DimensionsType)null);
				return;
			case XmlaPackage.PERSPECTIVE__MEASURE_GROUPS:
				setMeasureGroups((MeasureGroupsType1)null);
				return;
			case XmlaPackage.PERSPECTIVE__CALCULATIONS:
				setCalculations((CalculationsType)null);
				return;
			case XmlaPackage.PERSPECTIVE__KPIS:
				setKpis((KpisType1)null);
				return;
			case XmlaPackage.PERSPECTIVE__ACTIONS:
				setActions((ActionsType1)null);
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
			case XmlaPackage.PERSPECTIVE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.PERSPECTIVE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.PERSPECTIVE__CREATED_TIMESTAMP:
				return CREATED_TIMESTAMP_EDEFAULT == null ? createdTimestamp != null : !CREATED_TIMESTAMP_EDEFAULT.equals(createdTimestamp);
			case XmlaPackage.PERSPECTIVE__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
			case XmlaPackage.PERSPECTIVE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.PERSPECTIVE__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.PERSPECTIVE__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.PERSPECTIVE__DEFAULT_MEASURE:
				return DEFAULT_MEASURE_EDEFAULT == null ? defaultMeasure != null : !DEFAULT_MEASURE_EDEFAULT.equals(defaultMeasure);
			case XmlaPackage.PERSPECTIVE__DIMENSIONS:
				return dimensions != null;
			case XmlaPackage.PERSPECTIVE__MEASURE_GROUPS:
				return measureGroups != null;
			case XmlaPackage.PERSPECTIVE__CALCULATIONS:
				return calculations != null;
			case XmlaPackage.PERSPECTIVE__KPIS:
				return kpis != null;
			case XmlaPackage.PERSPECTIVE__ACTIONS:
				return actions != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", iD: ");
		result.append(iD);
		result.append(", createdTimestamp: ");
		result.append(createdTimestamp);
		result.append(", lastSchemaUpdate: ");
		result.append(lastSchemaUpdate);
		result.append(", description: ");
		result.append(description);
		result.append(", defaultMeasure: ");
		result.append(defaultMeasure);
		result.append(')');
		return result.toString();
	}

} //PerspectiveImpl
