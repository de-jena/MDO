/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType28;
import org.eclipse.daanse.xmla.model.ecore.xmla.Kpi;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kpi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getDisplayFolder <em>Display Folder</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getAssociatedMeasureGroupID <em>Associated Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getTrend <em>Trend</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getTrendGraphic <em>Trend Graphic</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getStatusGraphic <em>Status Graphic</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getCurrentTimeMember <em>Current Time Member</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getParentKpiID <em>Parent Kpi ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.KpiImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KpiImpl extends MinimalEObjectImpl.Container implements Kpi {
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
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType6 translations;

	/**
	 * The default value of the '{@link #getDisplayFolder() <em>Display Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayFolder() <em>Display Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayFolder()
	 * @generated
	 * @ordered
	 */
	protected String displayFolder = DISPLAY_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociatedMeasureGroupID() <em>Associated Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedMeasureGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATED_MEASURE_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatedMeasureGroupID() <em>Associated Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedMeasureGroupID()
	 * @generated
	 * @ordered
	 */
	protected String associatedMeasureGroupID = ASSOCIATED_MEASURE_GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected static final String GOAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected String goal = GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrend() <em>Trend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrend()
	 * @generated
	 * @ordered
	 */
	protected static final String TREND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrend() <em>Trend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrend()
	 * @generated
	 * @ordered
	 */
	protected String trend = TREND_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final String WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected String weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrendGraphic() <em>Trend Graphic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrendGraphic()
	 * @generated
	 * @ordered
	 */
	protected static final String TREND_GRAPHIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrendGraphic() <em>Trend Graphic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrendGraphic()
	 * @generated
	 * @ordered
	 */
	protected String trendGraphic = TREND_GRAPHIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatusGraphic() <em>Status Graphic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusGraphic()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_GRAPHIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatusGraphic() <em>Status Graphic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusGraphic()
	 * @generated
	 * @ordered
	 */
	protected String statusGraphic = STATUS_GRAPHIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentTimeMember() <em>Current Time Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTimeMember()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_TIME_MEMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentTimeMember() <em>Current Time Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTimeMember()
	 * @generated
	 * @ordered
	 */
	protected String currentTimeMember = CURRENT_TIME_MEMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentKpiID() <em>Parent Kpi ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentKpiID()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_KPI_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentKpiID() <em>Parent Kpi ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentKpiID()
	 * @generated
	 * @ordered
	 */
	protected String parentKpiID = PARENT_KPI_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType28 annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KpiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.KPI;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType6 getTranslations() {
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslations(TranslationsType6 newTranslations, NotificationChain msgs) {
		TranslationsType6 oldTranslations = translations;
		translations = newTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__TRANSLATIONS, oldTranslations, newTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslations(TranslationsType6 newTranslations) {
		if (newTranslations != translations) {
			NotificationChain msgs = null;
			if (translations != null)
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.KPI__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.KPI__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayFolder() {
		return displayFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayFolder(String newDisplayFolder) {
		String oldDisplayFolder = displayFolder;
		displayFolder = newDisplayFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__DISPLAY_FOLDER, oldDisplayFolder, displayFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociatedMeasureGroupID() {
		return associatedMeasureGroupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedMeasureGroupID(String newAssociatedMeasureGroupID) {
		String oldAssociatedMeasureGroupID = associatedMeasureGroupID;
		associatedMeasureGroupID = newAssociatedMeasureGroupID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__ASSOCIATED_MEASURE_GROUP_ID, oldAssociatedMeasureGroupID, associatedMeasureGroupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(String newGoal) {
		String oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__GOAL, oldGoal, goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrend() {
		return trend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrend(String newTrend) {
		String oldTrend = trend;
		trend = newTrend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__TREND, oldTrend, trend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(String newWeight) {
		String oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrendGraphic() {
		return trendGraphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrendGraphic(String newTrendGraphic) {
		String oldTrendGraphic = trendGraphic;
		trendGraphic = newTrendGraphic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__TREND_GRAPHIC, oldTrendGraphic, trendGraphic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatusGraphic() {
		return statusGraphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusGraphic(String newStatusGraphic) {
		String oldStatusGraphic = statusGraphic;
		statusGraphic = newStatusGraphic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__STATUS_GRAPHIC, oldStatusGraphic, statusGraphic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentTimeMember() {
		return currentTimeMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentTimeMember(String newCurrentTimeMember) {
		String oldCurrentTimeMember = currentTimeMember;
		currentTimeMember = newCurrentTimeMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__CURRENT_TIME_MEMBER, oldCurrentTimeMember, currentTimeMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentKpiID() {
		return parentKpiID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentKpiID(String newParentKpiID) {
		String oldParentKpiID = parentKpiID;
		parentKpiID = newParentKpiID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__PARENT_KPI_ID, oldParentKpiID, parentKpiID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType28 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType28 newAnnotations, NotificationChain msgs) {
		AnnotationsType28 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType28 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.KPI__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.KPI__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.KPI__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.KPI__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.KPI__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
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
			case XmlaPackage.KPI__NAME:
				return getName();
			case XmlaPackage.KPI__ID:
				return getID();
			case XmlaPackage.KPI__DESCRIPTION:
				return getDescription();
			case XmlaPackage.KPI__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.KPI__DISPLAY_FOLDER:
				return getDisplayFolder();
			case XmlaPackage.KPI__ASSOCIATED_MEASURE_GROUP_ID:
				return getAssociatedMeasureGroupID();
			case XmlaPackage.KPI__VALUE:
				return getValue();
			case XmlaPackage.KPI__GOAL:
				return getGoal();
			case XmlaPackage.KPI__STATUS:
				return getStatus();
			case XmlaPackage.KPI__TREND:
				return getTrend();
			case XmlaPackage.KPI__WEIGHT:
				return getWeight();
			case XmlaPackage.KPI__TREND_GRAPHIC:
				return getTrendGraphic();
			case XmlaPackage.KPI__STATUS_GRAPHIC:
				return getStatusGraphic();
			case XmlaPackage.KPI__CURRENT_TIME_MEMBER:
				return getCurrentTimeMember();
			case XmlaPackage.KPI__PARENT_KPI_ID:
				return getParentKpiID();
			case XmlaPackage.KPI__ANNOTATIONS:
				return getAnnotations();
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
			case XmlaPackage.KPI__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.KPI__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.KPI__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.KPI__TRANSLATIONS:
				setTranslations((TranslationsType6)newValue);
				return;
			case XmlaPackage.KPI__DISPLAY_FOLDER:
				setDisplayFolder((String)newValue);
				return;
			case XmlaPackage.KPI__ASSOCIATED_MEASURE_GROUP_ID:
				setAssociatedMeasureGroupID((String)newValue);
				return;
			case XmlaPackage.KPI__VALUE:
				setValue((String)newValue);
				return;
			case XmlaPackage.KPI__GOAL:
				setGoal((String)newValue);
				return;
			case XmlaPackage.KPI__STATUS:
				setStatus((String)newValue);
				return;
			case XmlaPackage.KPI__TREND:
				setTrend((String)newValue);
				return;
			case XmlaPackage.KPI__WEIGHT:
				setWeight((String)newValue);
				return;
			case XmlaPackage.KPI__TREND_GRAPHIC:
				setTrendGraphic((String)newValue);
				return;
			case XmlaPackage.KPI__STATUS_GRAPHIC:
				setStatusGraphic((String)newValue);
				return;
			case XmlaPackage.KPI__CURRENT_TIME_MEMBER:
				setCurrentTimeMember((String)newValue);
				return;
			case XmlaPackage.KPI__PARENT_KPI_ID:
				setParentKpiID((String)newValue);
				return;
			case XmlaPackage.KPI__ANNOTATIONS:
				setAnnotations((AnnotationsType28)newValue);
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
			case XmlaPackage.KPI__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.KPI__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.KPI__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.KPI__TRANSLATIONS:
				setTranslations((TranslationsType6)null);
				return;
			case XmlaPackage.KPI__DISPLAY_FOLDER:
				setDisplayFolder(DISPLAY_FOLDER_EDEFAULT);
				return;
			case XmlaPackage.KPI__ASSOCIATED_MEASURE_GROUP_ID:
				setAssociatedMeasureGroupID(ASSOCIATED_MEASURE_GROUP_ID_EDEFAULT);
				return;
			case XmlaPackage.KPI__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case XmlaPackage.KPI__GOAL:
				setGoal(GOAL_EDEFAULT);
				return;
			case XmlaPackage.KPI__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case XmlaPackage.KPI__TREND:
				setTrend(TREND_EDEFAULT);
				return;
			case XmlaPackage.KPI__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case XmlaPackage.KPI__TREND_GRAPHIC:
				setTrendGraphic(TREND_GRAPHIC_EDEFAULT);
				return;
			case XmlaPackage.KPI__STATUS_GRAPHIC:
				setStatusGraphic(STATUS_GRAPHIC_EDEFAULT);
				return;
			case XmlaPackage.KPI__CURRENT_TIME_MEMBER:
				setCurrentTimeMember(CURRENT_TIME_MEMBER_EDEFAULT);
				return;
			case XmlaPackage.KPI__PARENT_KPI_ID:
				setParentKpiID(PARENT_KPI_ID_EDEFAULT);
				return;
			case XmlaPackage.KPI__ANNOTATIONS:
				setAnnotations((AnnotationsType28)null);
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
			case XmlaPackage.KPI__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.KPI__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.KPI__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.KPI__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.KPI__DISPLAY_FOLDER:
				return DISPLAY_FOLDER_EDEFAULT == null ? displayFolder != null : !DISPLAY_FOLDER_EDEFAULT.equals(displayFolder);
			case XmlaPackage.KPI__ASSOCIATED_MEASURE_GROUP_ID:
				return ASSOCIATED_MEASURE_GROUP_ID_EDEFAULT == null ? associatedMeasureGroupID != null : !ASSOCIATED_MEASURE_GROUP_ID_EDEFAULT.equals(associatedMeasureGroupID);
			case XmlaPackage.KPI__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case XmlaPackage.KPI__GOAL:
				return GOAL_EDEFAULT == null ? goal != null : !GOAL_EDEFAULT.equals(goal);
			case XmlaPackage.KPI__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case XmlaPackage.KPI__TREND:
				return TREND_EDEFAULT == null ? trend != null : !TREND_EDEFAULT.equals(trend);
			case XmlaPackage.KPI__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case XmlaPackage.KPI__TREND_GRAPHIC:
				return TREND_GRAPHIC_EDEFAULT == null ? trendGraphic != null : !TREND_GRAPHIC_EDEFAULT.equals(trendGraphic);
			case XmlaPackage.KPI__STATUS_GRAPHIC:
				return STATUS_GRAPHIC_EDEFAULT == null ? statusGraphic != null : !STATUS_GRAPHIC_EDEFAULT.equals(statusGraphic);
			case XmlaPackage.KPI__CURRENT_TIME_MEMBER:
				return CURRENT_TIME_MEMBER_EDEFAULT == null ? currentTimeMember != null : !CURRENT_TIME_MEMBER_EDEFAULT.equals(currentTimeMember);
			case XmlaPackage.KPI__PARENT_KPI_ID:
				return PARENT_KPI_ID_EDEFAULT == null ? parentKpiID != null : !PARENT_KPI_ID_EDEFAULT.equals(parentKpiID);
			case XmlaPackage.KPI__ANNOTATIONS:
				return annotations != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(", displayFolder: ");
		result.append(displayFolder);
		result.append(", associatedMeasureGroupID: ");
		result.append(associatedMeasureGroupID);
		result.append(", value: ");
		result.append(value);
		result.append(", goal: ");
		result.append(goal);
		result.append(", status: ");
		result.append(status);
		result.append(", trend: ");
		result.append(trend);
		result.append(", weight: ");
		result.append(weight);
		result.append(", trendGraphic: ");
		result.append(trendGraphic);
		result.append(", statusGraphic: ");
		result.append(statusGraphic);
		result.append(", currentTimeMember: ");
		result.append(currentTimeMember);
		result.append(", parentKpiID: ");
		result.append(parentKpiID);
		result.append(')');
		return result.toString();
	}

} //KpiImpl
