/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Binding;
import org.eclipse.daanse.xmla.model.ecore.xmla.CacheModeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructure;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.StateType5;
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
 * An implementation of the model object '<em><b>Mining Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getCacheMode <em>Cache Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getHoldoutMaxPercent <em>Holdout Max Percent</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getHoldoutMaxCases <em>Holdout Max Cases</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getHoldoutSeed <em>Holdout Seed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getHoldoutActualSize <em>Holdout Actual Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getMiningStructurePermissions <em>Mining Structure Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningStructureImpl#getMiningModels <em>Mining Models</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiningStructureImpl extends MinimalEObjectImpl.Container implements MiningStructure {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Binding source;

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
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType translations;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected BigInteger language = LANGUAGE_EDEFAULT;

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
	 * The cached value of the '{@link #getErrorConfiguration() <em>Error Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ErrorConfiguration errorConfiguration;

	/**
	 * The default value of the '{@link #getCacheMode() <em>Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheMode()
	 * @generated
	 * @ordered
	 */
	protected static final CacheModeType CACHE_MODE_EDEFAULT = CacheModeType.KEEP_TRAINING_CASES;

	/**
	 * The cached value of the '{@link #getCacheMode() <em>Cache Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheMode()
	 * @generated
	 * @ordered
	 */
	protected CacheModeType cacheMode = CACHE_MODE_EDEFAULT;

	/**
	 * This is true if the Cache Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cacheModeESet;

	/**
	 * The default value of the '{@link #getHoldoutMaxPercent() <em>Holdout Max Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldoutMaxPercent()
	 * @generated
	 * @ordered
	 */
	protected static final int HOLDOUT_MAX_PERCENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHoldoutMaxPercent() <em>Holdout Max Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldoutMaxPercent()
	 * @generated
	 * @ordered
	 */
	protected int holdoutMaxPercent = HOLDOUT_MAX_PERCENT_EDEFAULT;

	/**
	 * This is true if the Holdout Max Percent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean holdoutMaxPercentESet;

	/**
	 * The default value of the '{@link #getHoldoutMaxCases() <em>Holdout Max Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldoutMaxCases()
	 * @generated
	 * @ordered
	 */
	protected static final int HOLDOUT_MAX_CASES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHoldoutMaxCases() <em>Holdout Max Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldoutMaxCases()
	 * @generated
	 * @ordered
	 */
	protected int holdoutMaxCases = HOLDOUT_MAX_CASES_EDEFAULT;

	/**
	 * This is true if the Holdout Max Cases attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean holdoutMaxCasesESet;

	/**
	 * The default value of the '{@link #getHoldoutSeed() <em>Holdout Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldoutSeed()
	 * @generated
	 * @ordered
	 */
	protected static final int HOLDOUT_SEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHoldoutSeed() <em>Holdout Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldoutSeed()
	 * @generated
	 * @ordered
	 */
	protected int holdoutSeed = HOLDOUT_SEED_EDEFAULT;

	/**
	 * This is true if the Holdout Seed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean holdoutSeedESet;

	/**
	 * The default value of the '{@link #getHoldoutActualSize() <em>Holdout Actual Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldoutActualSize()
	 * @generated
	 * @ordered
	 */
	protected static final int HOLDOUT_ACTUAL_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHoldoutActualSize() <em>Holdout Actual Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldoutActualSize()
	 * @generated
	 * @ordered
	 */
	protected int holdoutActualSize = HOLDOUT_ACTUAL_SIZE_EDEFAULT;

	/**
	 * This is true if the Holdout Actual Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean holdoutActualSizeESet;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected ColumnsType4 columns;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final StateType5 STATE_EDEFAULT = StateType5.PROCESSED;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected StateType5 state = STATE_EDEFAULT;

	/**
	 * This is true if the State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean stateESet;

	/**
	 * The cached value of the '{@link #getMiningStructurePermissions() <em>Mining Structure Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningStructurePermissions()
	 * @generated
	 * @ordered
	 */
	protected MiningStructurePermissionsType miningStructurePermissions;

	/**
	 * The cached value of the '{@link #getMiningModels() <em>Mining Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModels()
	 * @generated
	 * @ordered
	 */
	protected MiningModelsType miningModels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MINING_STRUCTURE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__CREATED_TIMESTAMP, oldCreatedTimestamp, createdTimestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Binding newSource, NotificationChain msgs) {
		Binding oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Binding newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__SOURCE, newSource, newSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__LAST_PROCESSED, oldLastProcessed, lastProcessed));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__TRANSLATIONS, oldTranslations, newTranslations);
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
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(BigInteger newLanguage) {
		BigInteger oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__LANGUAGE, oldLanguage, language));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__COLLATION, oldCollation, collation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorConfiguration getErrorConfiguration() {
		return errorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorConfiguration(ErrorConfiguration newErrorConfiguration, NotificationChain msgs) {
		ErrorConfiguration oldErrorConfiguration = errorConfiguration;
		errorConfiguration = newErrorConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__ERROR_CONFIGURATION, oldErrorConfiguration, newErrorConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorConfiguration(ErrorConfiguration newErrorConfiguration) {
		if (newErrorConfiguration != errorConfiguration) {
			NotificationChain msgs = null;
			if (errorConfiguration != null)
				msgs = ((InternalEObject)errorConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__ERROR_CONFIGURATION, null, msgs);
			if (newErrorConfiguration != null)
				msgs = ((InternalEObject)newErrorConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__ERROR_CONFIGURATION, null, msgs);
			msgs = basicSetErrorConfiguration(newErrorConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__ERROR_CONFIGURATION, newErrorConfiguration, newErrorConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheModeType getCacheMode() {
		return cacheMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheMode(CacheModeType newCacheMode) {
		CacheModeType oldCacheMode = cacheMode;
		cacheMode = newCacheMode == null ? CACHE_MODE_EDEFAULT : newCacheMode;
		boolean oldCacheModeESet = cacheModeESet;
		cacheModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__CACHE_MODE, oldCacheMode, cacheMode, !oldCacheModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCacheMode() {
		CacheModeType oldCacheMode = cacheMode;
		boolean oldCacheModeESet = cacheModeESet;
		cacheMode = CACHE_MODE_EDEFAULT;
		cacheModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_STRUCTURE__CACHE_MODE, oldCacheMode, CACHE_MODE_EDEFAULT, oldCacheModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCacheMode() {
		return cacheModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoldoutMaxPercent() {
		return holdoutMaxPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldoutMaxPercent(int newHoldoutMaxPercent) {
		int oldHoldoutMaxPercent = holdoutMaxPercent;
		holdoutMaxPercent = newHoldoutMaxPercent;
		boolean oldHoldoutMaxPercentESet = holdoutMaxPercentESet;
		holdoutMaxPercentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__HOLDOUT_MAX_PERCENT, oldHoldoutMaxPercent, holdoutMaxPercent, !oldHoldoutMaxPercentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHoldoutMaxPercent() {
		int oldHoldoutMaxPercent = holdoutMaxPercent;
		boolean oldHoldoutMaxPercentESet = holdoutMaxPercentESet;
		holdoutMaxPercent = HOLDOUT_MAX_PERCENT_EDEFAULT;
		holdoutMaxPercentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_STRUCTURE__HOLDOUT_MAX_PERCENT, oldHoldoutMaxPercent, HOLDOUT_MAX_PERCENT_EDEFAULT, oldHoldoutMaxPercentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHoldoutMaxPercent() {
		return holdoutMaxPercentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoldoutMaxCases() {
		return holdoutMaxCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldoutMaxCases(int newHoldoutMaxCases) {
		int oldHoldoutMaxCases = holdoutMaxCases;
		holdoutMaxCases = newHoldoutMaxCases;
		boolean oldHoldoutMaxCasesESet = holdoutMaxCasesESet;
		holdoutMaxCasesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__HOLDOUT_MAX_CASES, oldHoldoutMaxCases, holdoutMaxCases, !oldHoldoutMaxCasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHoldoutMaxCases() {
		int oldHoldoutMaxCases = holdoutMaxCases;
		boolean oldHoldoutMaxCasesESet = holdoutMaxCasesESet;
		holdoutMaxCases = HOLDOUT_MAX_CASES_EDEFAULT;
		holdoutMaxCasesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_STRUCTURE__HOLDOUT_MAX_CASES, oldHoldoutMaxCases, HOLDOUT_MAX_CASES_EDEFAULT, oldHoldoutMaxCasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHoldoutMaxCases() {
		return holdoutMaxCasesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoldoutSeed() {
		return holdoutSeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldoutSeed(int newHoldoutSeed) {
		int oldHoldoutSeed = holdoutSeed;
		holdoutSeed = newHoldoutSeed;
		boolean oldHoldoutSeedESet = holdoutSeedESet;
		holdoutSeedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__HOLDOUT_SEED, oldHoldoutSeed, holdoutSeed, !oldHoldoutSeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHoldoutSeed() {
		int oldHoldoutSeed = holdoutSeed;
		boolean oldHoldoutSeedESet = holdoutSeedESet;
		holdoutSeed = HOLDOUT_SEED_EDEFAULT;
		holdoutSeedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_STRUCTURE__HOLDOUT_SEED, oldHoldoutSeed, HOLDOUT_SEED_EDEFAULT, oldHoldoutSeedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHoldoutSeed() {
		return holdoutSeedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHoldoutActualSize() {
		return holdoutActualSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldoutActualSize(int newHoldoutActualSize) {
		int oldHoldoutActualSize = holdoutActualSize;
		holdoutActualSize = newHoldoutActualSize;
		boolean oldHoldoutActualSizeESet = holdoutActualSizeESet;
		holdoutActualSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__HOLDOUT_ACTUAL_SIZE, oldHoldoutActualSize, holdoutActualSize, !oldHoldoutActualSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHoldoutActualSize() {
		int oldHoldoutActualSize = holdoutActualSize;
		boolean oldHoldoutActualSizeESet = holdoutActualSizeESet;
		holdoutActualSize = HOLDOUT_ACTUAL_SIZE_EDEFAULT;
		holdoutActualSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_STRUCTURE__HOLDOUT_ACTUAL_SIZE, oldHoldoutActualSize, HOLDOUT_ACTUAL_SIZE_EDEFAULT, oldHoldoutActualSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHoldoutActualSize() {
		return holdoutActualSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsType4 getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumns(ColumnsType4 newColumns, NotificationChain msgs) {
		ColumnsType4 oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__COLUMNS, oldColumns, newColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(ColumnsType4 newColumns) {
		if (newColumns != columns) {
			NotificationChain msgs = null;
			if (columns != null)
				msgs = ((InternalEObject)columns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__COLUMNS, null, msgs);
			if (newColumns != null)
				msgs = ((InternalEObject)newColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__COLUMNS, null, msgs);
			msgs = basicSetColumns(newColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__COLUMNS, newColumns, newColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType5 getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(StateType5 newState) {
		StateType5 oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		boolean oldStateESet = stateESet;
		stateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__STATE, oldState, state, !oldStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetState() {
		StateType5 oldState = state;
		boolean oldStateESet = stateESet;
		state = STATE_EDEFAULT;
		stateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_STRUCTURE__STATE, oldState, STATE_EDEFAULT, oldStateESet));
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
	public MiningStructurePermissionsType getMiningStructurePermissions() {
		return miningStructurePermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiningStructurePermissions(MiningStructurePermissionsType newMiningStructurePermissions, NotificationChain msgs) {
		MiningStructurePermissionsType oldMiningStructurePermissions = miningStructurePermissions;
		miningStructurePermissions = newMiningStructurePermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__MINING_STRUCTURE_PERMISSIONS, oldMiningStructurePermissions, newMiningStructurePermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningStructurePermissions(MiningStructurePermissionsType newMiningStructurePermissions) {
		if (newMiningStructurePermissions != miningStructurePermissions) {
			NotificationChain msgs = null;
			if (miningStructurePermissions != null)
				msgs = ((InternalEObject)miningStructurePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__MINING_STRUCTURE_PERMISSIONS, null, msgs);
			if (newMiningStructurePermissions != null)
				msgs = ((InternalEObject)newMiningStructurePermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__MINING_STRUCTURE_PERMISSIONS, null, msgs);
			msgs = basicSetMiningStructurePermissions(newMiningStructurePermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__MINING_STRUCTURE_PERMISSIONS, newMiningStructurePermissions, newMiningStructurePermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MiningModelsType getMiningModels() {
		return miningModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMiningModels(MiningModelsType newMiningModels, NotificationChain msgs) {
		MiningModelsType oldMiningModels = miningModels;
		miningModels = newMiningModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__MINING_MODELS, oldMiningModels, newMiningModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningModels(MiningModelsType newMiningModels) {
		if (newMiningModels != miningModels) {
			NotificationChain msgs = null;
			if (miningModels != null)
				msgs = ((InternalEObject)miningModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__MINING_MODELS, null, msgs);
			if (newMiningModels != null)
				msgs = ((InternalEObject)newMiningModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_STRUCTURE__MINING_MODELS, null, msgs);
			msgs = basicSetMiningModels(newMiningModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_STRUCTURE__MINING_MODELS, newMiningModels, newMiningModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.MINING_STRUCTURE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.MINING_STRUCTURE__SOURCE:
				return basicSetSource(null, msgs);
			case XmlaPackage.MINING_STRUCTURE__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.MINING_STRUCTURE__ERROR_CONFIGURATION:
				return basicSetErrorConfiguration(null, msgs);
			case XmlaPackage.MINING_STRUCTURE__COLUMNS:
				return basicSetColumns(null, msgs);
			case XmlaPackage.MINING_STRUCTURE__MINING_STRUCTURE_PERMISSIONS:
				return basicSetMiningStructurePermissions(null, msgs);
			case XmlaPackage.MINING_STRUCTURE__MINING_MODELS:
				return basicSetMiningModels(null, msgs);
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
			case XmlaPackage.MINING_STRUCTURE__NAME:
				return getName();
			case XmlaPackage.MINING_STRUCTURE__ID:
				return getID();
			case XmlaPackage.MINING_STRUCTURE__CREATED_TIMESTAMP:
				return getCreatedTimestamp();
			case XmlaPackage.MINING_STRUCTURE__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
			case XmlaPackage.MINING_STRUCTURE__DESCRIPTION:
				return getDescription();
			case XmlaPackage.MINING_STRUCTURE__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.MINING_STRUCTURE__SOURCE:
				return getSource();
			case XmlaPackage.MINING_STRUCTURE__LAST_PROCESSED:
				return getLastProcessed();
			case XmlaPackage.MINING_STRUCTURE__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.MINING_STRUCTURE__LANGUAGE:
				return getLanguage();
			case XmlaPackage.MINING_STRUCTURE__COLLATION:
				return getCollation();
			case XmlaPackage.MINING_STRUCTURE__ERROR_CONFIGURATION:
				return getErrorConfiguration();
			case XmlaPackage.MINING_STRUCTURE__CACHE_MODE:
				return getCacheMode();
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_MAX_PERCENT:
				return getHoldoutMaxPercent();
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_MAX_CASES:
				return getHoldoutMaxCases();
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_SEED:
				return getHoldoutSeed();
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_ACTUAL_SIZE:
				return getHoldoutActualSize();
			case XmlaPackage.MINING_STRUCTURE__COLUMNS:
				return getColumns();
			case XmlaPackage.MINING_STRUCTURE__STATE:
				return getState();
			case XmlaPackage.MINING_STRUCTURE__MINING_STRUCTURE_PERMISSIONS:
				return getMiningStructurePermissions();
			case XmlaPackage.MINING_STRUCTURE__MINING_MODELS:
				return getMiningModels();
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
			case XmlaPackage.MINING_STRUCTURE__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__CREATED_TIMESTAMP:
				setCreatedTimestamp((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__SOURCE:
				setSource((Binding)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__LAST_PROCESSED:
				setLastProcessed((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__LANGUAGE:
				setLanguage((BigInteger)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__COLLATION:
				setCollation((String)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__CACHE_MODE:
				setCacheMode((CacheModeType)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_MAX_PERCENT:
				setHoldoutMaxPercent((Integer)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_MAX_CASES:
				setHoldoutMaxCases((Integer)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_SEED:
				setHoldoutSeed((Integer)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_ACTUAL_SIZE:
				setHoldoutActualSize((Integer)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__COLUMNS:
				setColumns((ColumnsType4)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__STATE:
				setState((StateType5)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__MINING_STRUCTURE_PERMISSIONS:
				setMiningStructurePermissions((MiningStructurePermissionsType)newValue);
				return;
			case XmlaPackage.MINING_STRUCTURE__MINING_MODELS:
				setMiningModels((MiningModelsType)newValue);
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
			case XmlaPackage.MINING_STRUCTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.MINING_STRUCTURE__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.MINING_STRUCTURE__CREATED_TIMESTAMP:
				setCreatedTimestamp(CREATED_TIMESTAMP_EDEFAULT);
				return;
			case XmlaPackage.MINING_STRUCTURE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.MINING_STRUCTURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.MINING_STRUCTURE__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case XmlaPackage.MINING_STRUCTURE__SOURCE:
				setSource((Binding)null);
				return;
			case XmlaPackage.MINING_STRUCTURE__LAST_PROCESSED:
				setLastProcessed(LAST_PROCESSED_EDEFAULT);
				return;
			case XmlaPackage.MINING_STRUCTURE__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case XmlaPackage.MINING_STRUCTURE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case XmlaPackage.MINING_STRUCTURE__COLLATION:
				setCollation(COLLATION_EDEFAULT);
				return;
			case XmlaPackage.MINING_STRUCTURE__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)null);
				return;
			case XmlaPackage.MINING_STRUCTURE__CACHE_MODE:
				unsetCacheMode();
				return;
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_MAX_PERCENT:
				unsetHoldoutMaxPercent();
				return;
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_MAX_CASES:
				unsetHoldoutMaxCases();
				return;
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_SEED:
				unsetHoldoutSeed();
				return;
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_ACTUAL_SIZE:
				unsetHoldoutActualSize();
				return;
			case XmlaPackage.MINING_STRUCTURE__COLUMNS:
				setColumns((ColumnsType4)null);
				return;
			case XmlaPackage.MINING_STRUCTURE__STATE:
				unsetState();
				return;
			case XmlaPackage.MINING_STRUCTURE__MINING_STRUCTURE_PERMISSIONS:
				setMiningStructurePermissions((MiningStructurePermissionsType)null);
				return;
			case XmlaPackage.MINING_STRUCTURE__MINING_MODELS:
				setMiningModels((MiningModelsType)null);
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
			case XmlaPackage.MINING_STRUCTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.MINING_STRUCTURE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.MINING_STRUCTURE__CREATED_TIMESTAMP:
				return CREATED_TIMESTAMP_EDEFAULT == null ? createdTimestamp != null : !CREATED_TIMESTAMP_EDEFAULT.equals(createdTimestamp);
			case XmlaPackage.MINING_STRUCTURE__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
			case XmlaPackage.MINING_STRUCTURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.MINING_STRUCTURE__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.MINING_STRUCTURE__SOURCE:
				return source != null;
			case XmlaPackage.MINING_STRUCTURE__LAST_PROCESSED:
				return LAST_PROCESSED_EDEFAULT == null ? lastProcessed != null : !LAST_PROCESSED_EDEFAULT.equals(lastProcessed);
			case XmlaPackage.MINING_STRUCTURE__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.MINING_STRUCTURE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case XmlaPackage.MINING_STRUCTURE__COLLATION:
				return COLLATION_EDEFAULT == null ? collation != null : !COLLATION_EDEFAULT.equals(collation);
			case XmlaPackage.MINING_STRUCTURE__ERROR_CONFIGURATION:
				return errorConfiguration != null;
			case XmlaPackage.MINING_STRUCTURE__CACHE_MODE:
				return isSetCacheMode();
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_MAX_PERCENT:
				return isSetHoldoutMaxPercent();
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_MAX_CASES:
				return isSetHoldoutMaxCases();
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_SEED:
				return isSetHoldoutSeed();
			case XmlaPackage.MINING_STRUCTURE__HOLDOUT_ACTUAL_SIZE:
				return isSetHoldoutActualSize();
			case XmlaPackage.MINING_STRUCTURE__COLUMNS:
				return columns != null;
			case XmlaPackage.MINING_STRUCTURE__STATE:
				return isSetState();
			case XmlaPackage.MINING_STRUCTURE__MINING_STRUCTURE_PERMISSIONS:
				return miningStructurePermissions != null;
			case XmlaPackage.MINING_STRUCTURE__MINING_MODELS:
				return miningModels != null;
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
		result.append(", lastProcessed: ");
		result.append(lastProcessed);
		result.append(", language: ");
		result.append(language);
		result.append(", collation: ");
		result.append(collation);
		result.append(", cacheMode: ");
		if (cacheModeESet) result.append(cacheMode); else result.append("<unset>");
		result.append(", holdoutMaxPercent: ");
		if (holdoutMaxPercentESet) result.append(holdoutMaxPercent); else result.append("<unset>");
		result.append(", holdoutMaxCases: ");
		if (holdoutMaxCasesESet) result.append(holdoutMaxCases); else result.append("<unset>");
		result.append(", holdoutSeed: ");
		if (holdoutSeedESet) result.append(holdoutSeed); else result.append("<unset>");
		result.append(", holdoutActualSize: ");
		if (holdoutActualSizeESet) result.append(holdoutActualSize); else result.append("<unset>");
		result.append(", state: ");
		if (stateESet) result.append(state); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MiningStructureImpl
