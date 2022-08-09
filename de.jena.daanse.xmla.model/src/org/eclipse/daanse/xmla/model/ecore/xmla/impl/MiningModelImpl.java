/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmParametersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType1;
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
 * An implementation of the model object '<em><b>Mining Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getAlgorithmParameters <em>Algorithm Parameters</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#isAllowDrillThrough <em>Allow Drill Through</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getFoldingParameters <em>Folding Parameters</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getMiningModelPermissions <em>Mining Model Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelImpl#getCollation <em>Collation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiningModelImpl extends MinimalEObjectImpl.Container implements MiningModel {
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
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final AlgorithmType ALGORITHM_EDEFAULT = AlgorithmType.MICROSOFT_NAIVE_BAYES;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected AlgorithmType algorithm = ALGORITHM_EDEFAULT;

	/**
	 * This is true if the Algorithm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean algorithmESet;

	/**
	 * The default value of the '{@link #getLastProcessed() <em>Last Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastProcessed()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_PROCESSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastProcessed() <em>Last Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastProcessed()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastProcessed = LAST_PROCESSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlgorithmParameters() <em>Algorithm Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithmParameters()
	 * @generated
	 * @ordered
	 */
	protected AlgorithmParametersType algorithmParameters;

	/**
	 * The default value of the '{@link #isAllowDrillThrough() <em>Allow Drill Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDrillThrough()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_DRILL_THROUGH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowDrillThrough() <em>Allow Drill Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDrillThrough()
	 * @generated
	 * @ordered
	 */
	protected boolean allowDrillThrough = ALLOW_DRILL_THROUGH_EDEFAULT;

	/**
	 * This is true if the Allow Drill Through attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowDrillThroughESet;

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
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected ColumnsType2 columns;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final StateType1 STATE_EDEFAULT = StateType1.PROCESSED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected StateType1 state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * The cached value of the '{@link #getFoldingParameters() <em>Folding Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoldingParameters()
	 * @generated
	 * @ordered
	 */
	protected FoldingParameters foldingParameters;

	/**
	 * The default value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected String filter = FILTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMiningModelPermissions() <em>Mining Model Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModelPermissions()
	 * @generated
	 * @ordered
	 */
	protected MiningModelPermissionsType miningModelPermissions;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollation() <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollation()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollation() <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollation()
	 * @generated
	 * @ordered
	 */
	protected String collation = COLLATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MINING_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__CREATED_TIMESTAMP, oldCreatedTimestamp, createdTimestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmType getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(AlgorithmType newAlgorithm) {
		AlgorithmType oldAlgorithm = algorithm;
		algorithm = newAlgorithm == null ? ALGORITHM_EDEFAULT : newAlgorithm;
		boolean oldAlgorithmESet = algorithmESet;
		algorithmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__ALGORITHM, oldAlgorithm, algorithm, !oldAlgorithmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlgorithm() {
		AlgorithmType oldAlgorithm = algorithm;
		boolean oldAlgorithmESet = algorithmESet;
		algorithm = ALGORITHM_EDEFAULT;
		algorithmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_MODEL__ALGORITHM, oldAlgorithm, ALGORITHM_EDEFAULT, oldAlgorithmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlgorithm() {
		return algorithmESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastProcessed() {
		return lastProcessed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastProcessed(XMLGregorianCalendar newLastProcessed) {
		XMLGregorianCalendar oldLastProcessed = lastProcessed;
		lastProcessed = newLastProcessed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__LAST_PROCESSED, oldLastProcessed, lastProcessed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmParametersType getAlgorithmParameters() {
		return algorithmParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithmParameters(AlgorithmParametersType newAlgorithmParameters, NotificationChain msgs) {
		AlgorithmParametersType oldAlgorithmParameters = algorithmParameters;
		algorithmParameters = newAlgorithmParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__ALGORITHM_PARAMETERS, oldAlgorithmParameters, newAlgorithmParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithmParameters(AlgorithmParametersType newAlgorithmParameters) {
		if (newAlgorithmParameters != algorithmParameters) {
			NotificationChain msgs = null;
			if (algorithmParameters != null)
				msgs = ((InternalEObject)algorithmParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL__ALGORITHM_PARAMETERS, null, msgs);
			if (newAlgorithmParameters != null)
				msgs = ((InternalEObject)newAlgorithmParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL__ALGORITHM_PARAMETERS, null, msgs);
			msgs = basicSetAlgorithmParameters(newAlgorithmParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__ALGORITHM_PARAMETERS, newAlgorithmParameters, newAlgorithmParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowDrillThrough() {
		return allowDrillThrough;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowDrillThrough(boolean newAllowDrillThrough) {
		boolean oldAllowDrillThrough = allowDrillThrough;
		allowDrillThrough = newAllowDrillThrough;
		boolean oldAllowDrillThroughESet = allowDrillThroughESet;
		allowDrillThroughESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__ALLOW_DRILL_THROUGH, oldAllowDrillThrough, allowDrillThrough, !oldAllowDrillThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowDrillThrough() {
		boolean oldAllowDrillThrough = allowDrillThrough;
		boolean oldAllowDrillThroughESet = allowDrillThroughESet;
		allowDrillThrough = ALLOW_DRILL_THROUGH_EDEFAULT;
		allowDrillThroughESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_MODEL__ALLOW_DRILL_THROUGH, oldAllowDrillThrough, ALLOW_DRILL_THROUGH_EDEFAULT, oldAllowDrillThroughESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowDrillThrough() {
		return allowDrillThroughESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__TRANSLATIONS, oldTranslations, newTranslations);
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
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsType2 getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumns(ColumnsType2 newColumns, NotificationChain msgs) {
		ColumnsType2 oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__COLUMNS, oldColumns, newColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(ColumnsType2 newColumns) {
		if (newColumns != columns) {
			NotificationChain msgs = null;
			if (columns != null)
				msgs = ((InternalEObject)columns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL__COLUMNS, null, msgs);
			if (newColumns != null)
				msgs = ((InternalEObject)newColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL__COLUMNS, null, msgs);
			msgs = basicSetColumns(newColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__COLUMNS, newColumns, newColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType1 getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(StateType1 newState) {
		StateType1 oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetState() {
		StateType1 oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_MODEL__STATE, oldState, STATE_EDEFAULT, oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetState() {
		return stateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FoldingParameters getFoldingParameters() {
		return foldingParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFoldingParameters(FoldingParameters newFoldingParameters, NotificationChain msgs) {
		FoldingParameters oldFoldingParameters = foldingParameters;
		foldingParameters = newFoldingParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__FOLDING_PARAMETERS, oldFoldingParameters, newFoldingParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoldingParameters(FoldingParameters newFoldingParameters) {
		if (newFoldingParameters != foldingParameters) {
			NotificationChain msgs = null;
			if (foldingParameters != null)
				msgs = ((InternalEObject)foldingParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL__FOLDING_PARAMETERS, null, msgs);
			if (newFoldingParameters != null)
				msgs = ((InternalEObject)newFoldingParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL__FOLDING_PARAMETERS, null, msgs);
			msgs = basicSetFoldingParameters(newFoldingParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__FOLDING_PARAMETERS, newFoldingParameters, newFoldingParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(String newFilter) {
		String oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__FILTER, oldFilter, filter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModelPermissionsType getMiningModelPermissions() {
		return miningModelPermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiningModelPermissions(MiningModelPermissionsType newMiningModelPermissions, NotificationChain msgs) {
		MiningModelPermissionsType oldMiningModelPermissions = miningModelPermissions;
		miningModelPermissions = newMiningModelPermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__MINING_MODEL_PERMISSIONS, oldMiningModelPermissions, newMiningModelPermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningModelPermissions(MiningModelPermissionsType newMiningModelPermissions) {
		if (newMiningModelPermissions != miningModelPermissions) {
			NotificationChain msgs = null;
			if (miningModelPermissions != null)
				msgs = ((InternalEObject)miningModelPermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL__MINING_MODEL_PERMISSIONS, null, msgs);
			if (newMiningModelPermissions != null)
				msgs = ((InternalEObject)newMiningModelPermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL__MINING_MODEL_PERMISSIONS, null, msgs);
			msgs = basicSetMiningModelPermissions(newMiningModelPermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__MINING_MODEL_PERMISSIONS, newMiningModelPermissions, newMiningModelPermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollation() {
		return collation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollation(String newCollation) {
		String oldCollation = collation;
		collation = newCollation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL__COLLATION, oldCollation, collation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.MINING_MODEL__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.MINING_MODEL__ALGORITHM_PARAMETERS:
				return basicSetAlgorithmParameters(null, msgs);
			case XmlaPackage.MINING_MODEL__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.MINING_MODEL__COLUMNS:
				return basicSetColumns(null, msgs);
			case XmlaPackage.MINING_MODEL__FOLDING_PARAMETERS:
				return basicSetFoldingParameters(null, msgs);
			case XmlaPackage.MINING_MODEL__MINING_MODEL_PERMISSIONS:
				return basicSetMiningModelPermissions(null, msgs);
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
			case XmlaPackage.MINING_MODEL__NAME:
				return getName();
			case XmlaPackage.MINING_MODEL__ID:
				return getID();
			case XmlaPackage.MINING_MODEL__CREATED_TIMESTAMP:
				return getCreatedTimestamp();
			case XmlaPackage.MINING_MODEL__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
			case XmlaPackage.MINING_MODEL__DESCRIPTION:
				return getDescription();
			case XmlaPackage.MINING_MODEL__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.MINING_MODEL__ALGORITHM:
				return getAlgorithm();
			case XmlaPackage.MINING_MODEL__LAST_PROCESSED:
				return getLastProcessed();
			case XmlaPackage.MINING_MODEL__ALGORITHM_PARAMETERS:
				return getAlgorithmParameters();
			case XmlaPackage.MINING_MODEL__ALLOW_DRILL_THROUGH:
				return isAllowDrillThrough();
			case XmlaPackage.MINING_MODEL__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.MINING_MODEL__COLUMNS:
				return getColumns();
			case XmlaPackage.MINING_MODEL__STATE:
				return getState();
			case XmlaPackage.MINING_MODEL__FOLDING_PARAMETERS:
				return getFoldingParameters();
			case XmlaPackage.MINING_MODEL__FILTER:
				return getFilter();
			case XmlaPackage.MINING_MODEL__MINING_MODEL_PERMISSIONS:
				return getMiningModelPermissions();
			case XmlaPackage.MINING_MODEL__LANGUAGE:
				return getLanguage();
			case XmlaPackage.MINING_MODEL__COLLATION:
				return getCollation();
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
			case XmlaPackage.MINING_MODEL__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.MINING_MODEL__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.MINING_MODEL__CREATED_TIMESTAMP:
				setCreatedTimestamp((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.MINING_MODEL__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.MINING_MODEL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.MINING_MODEL__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case XmlaPackage.MINING_MODEL__ALGORITHM:
				setAlgorithm((AlgorithmType)newValue);
				return;
			case XmlaPackage.MINING_MODEL__LAST_PROCESSED:
				setLastProcessed((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.MINING_MODEL__ALGORITHM_PARAMETERS:
				setAlgorithmParameters((AlgorithmParametersType)newValue);
				return;
			case XmlaPackage.MINING_MODEL__ALLOW_DRILL_THROUGH:
				setAllowDrillThrough((Boolean)newValue);
				return;
			case XmlaPackage.MINING_MODEL__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case XmlaPackage.MINING_MODEL__COLUMNS:
				setColumns((ColumnsType2)newValue);
				return;
			case XmlaPackage.MINING_MODEL__STATE:
				setState((StateType1)newValue);
				return;
			case XmlaPackage.MINING_MODEL__FOLDING_PARAMETERS:
				setFoldingParameters((FoldingParameters)newValue);
				return;
			case XmlaPackage.MINING_MODEL__FILTER:
				setFilter((String)newValue);
				return;
			case XmlaPackage.MINING_MODEL__MINING_MODEL_PERMISSIONS:
				setMiningModelPermissions((MiningModelPermissionsType)newValue);
				return;
			case XmlaPackage.MINING_MODEL__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case XmlaPackage.MINING_MODEL__COLLATION:
				setCollation((String)newValue);
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
			case XmlaPackage.MINING_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL__CREATED_TIMESTAMP:
				setCreatedTimestamp(CREATED_TIMESTAMP_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case XmlaPackage.MINING_MODEL__ALGORITHM:
				unsetAlgorithm();
				return;
			case XmlaPackage.MINING_MODEL__LAST_PROCESSED:
				setLastProcessed(LAST_PROCESSED_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL__ALGORITHM_PARAMETERS:
				setAlgorithmParameters((AlgorithmParametersType)null);
				return;
			case XmlaPackage.MINING_MODEL__ALLOW_DRILL_THROUGH:
				unsetAllowDrillThrough();
				return;
			case XmlaPackage.MINING_MODEL__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case XmlaPackage.MINING_MODEL__COLUMNS:
				setColumns((ColumnsType2)null);
				return;
			case XmlaPackage.MINING_MODEL__STATE:
				unsetState();
				return;
			case XmlaPackage.MINING_MODEL__FOLDING_PARAMETERS:
				setFoldingParameters((FoldingParameters)null);
				return;
			case XmlaPackage.MINING_MODEL__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL__MINING_MODEL_PERMISSIONS:
				setMiningModelPermissions((MiningModelPermissionsType)null);
				return;
			case XmlaPackage.MINING_MODEL__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL__COLLATION:
				setCollation(COLLATION_EDEFAULT);
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
			case XmlaPackage.MINING_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.MINING_MODEL__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.MINING_MODEL__CREATED_TIMESTAMP:
				return CREATED_TIMESTAMP_EDEFAULT == null ? createdTimestamp != null : !CREATED_TIMESTAMP_EDEFAULT.equals(createdTimestamp);
			case XmlaPackage.MINING_MODEL__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
			case XmlaPackage.MINING_MODEL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.MINING_MODEL__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.MINING_MODEL__ALGORITHM:
				return isSetAlgorithm();
			case XmlaPackage.MINING_MODEL__LAST_PROCESSED:
				return LAST_PROCESSED_EDEFAULT == null ? lastProcessed != null : !LAST_PROCESSED_EDEFAULT.equals(lastProcessed);
			case XmlaPackage.MINING_MODEL__ALGORITHM_PARAMETERS:
				return algorithmParameters != null;
			case XmlaPackage.MINING_MODEL__ALLOW_DRILL_THROUGH:
				return isSetAllowDrillThrough();
			case XmlaPackage.MINING_MODEL__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.MINING_MODEL__COLUMNS:
				return columns != null;
			case XmlaPackage.MINING_MODEL__STATE:
				return isSetState();
			case XmlaPackage.MINING_MODEL__FOLDING_PARAMETERS:
				return foldingParameters != null;
			case XmlaPackage.MINING_MODEL__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case XmlaPackage.MINING_MODEL__MINING_MODEL_PERMISSIONS:
				return miningModelPermissions != null;
			case XmlaPackage.MINING_MODEL__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case XmlaPackage.MINING_MODEL__COLLATION:
				return COLLATION_EDEFAULT == null ? collation != null : !COLLATION_EDEFAULT.equals(collation);
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
		result.append(", algorithm: ");
		if (algorithmESet) result.append(algorithm); else result.append("<unset>");
		result.append(", lastProcessed: ");
		result.append(lastProcessed);
		result.append(", allowDrillThrough: ");
		if (allowDrillThroughESet) result.append(allowDrillThrough); else result.append("<unset>");
		result.append(", state: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(", filter: ");
		result.append(filter);
		result.append(", language: ");
		result.append(language);
		result.append(", collation: ");
		result.append(collation);
		result.append(')');
		return result.toString();
	}

} //MiningModelImpl
