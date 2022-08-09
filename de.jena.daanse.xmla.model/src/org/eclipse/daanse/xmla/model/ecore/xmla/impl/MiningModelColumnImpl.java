/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelColumn;
import org.eclipse.daanse.xmla.model.ecore.xmla.ModelingFlagsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.UsageType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mining Model Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelColumnImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelColumnImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelColumnImpl#getSourceColumnID <em>Source Column ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelColumnImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelColumnImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelColumnImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelColumnImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelColumnImpl#getModelingFlags <em>Modeling Flags</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MiningModelColumnImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MiningModelColumnImpl extends MinimalEObjectImpl.Container implements MiningModelColumn {
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
	 * The default value of the '{@link #getSourceColumnID() <em>Source Column ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumnID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_COLUMN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceColumnID() <em>Source Column ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceColumnID()
	 * @generated
	 * @ordered
	 */
	protected String sourceColumnID = SOURCE_COLUMN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final UsageType USAGE_EDEFAULT = UsageType.KEY;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected UsageType usage = USAGE_EDEFAULT;

	/**
	 * This is true if the Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean usageESet;

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
	protected ColumnsType3 columns;

	/**
	 * The cached value of the '{@link #getModelingFlags() <em>Modeling Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingFlags()
	 * @generated
	 * @ordered
	 */
	protected ModelingFlagsType1 modelingFlags;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MiningModelColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MINING_MODEL_COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceColumnID() {
		return sourceColumnID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceColumnID(String newSourceColumnID) {
		String oldSourceColumnID = sourceColumnID;
		sourceColumnID = newSourceColumnID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__SOURCE_COLUMN_ID, oldSourceColumnID, sourceColumnID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageType getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(UsageType newUsage) {
		UsageType oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		boolean oldUsageESet = usageESet;
		usageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__USAGE, oldUsage, usage, !oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsage() {
		UsageType oldUsage = usage;
		boolean oldUsageESet = usageESet;
		usage = USAGE_EDEFAULT;
		usageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MINING_MODEL_COLUMN__USAGE, oldUsage, USAGE_EDEFAULT, oldUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsage() {
		return usageESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__FILTER, oldFilter, filter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__TRANSLATIONS, oldTranslations, newTranslations);
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
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL_COLUMN__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL_COLUMN__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsType3 getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumns(ColumnsType3 newColumns, NotificationChain msgs) {
		ColumnsType3 oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__COLUMNS, oldColumns, newColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(ColumnsType3 newColumns) {
		if (newColumns != columns) {
			NotificationChain msgs = null;
			if (columns != null)
				msgs = ((InternalEObject)columns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL_COLUMN__COLUMNS, null, msgs);
			if (newColumns != null)
				msgs = ((InternalEObject)newColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL_COLUMN__COLUMNS, null, msgs);
			msgs = basicSetColumns(newColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__COLUMNS, newColumns, newColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingFlagsType1 getModelingFlags() {
		return modelingFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelingFlags(ModelingFlagsType1 newModelingFlags, NotificationChain msgs) {
		ModelingFlagsType1 oldModelingFlags = modelingFlags;
		modelingFlags = newModelingFlags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__MODELING_FLAGS, oldModelingFlags, newModelingFlags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelingFlags(ModelingFlagsType1 newModelingFlags) {
		if (newModelingFlags != modelingFlags) {
			NotificationChain msgs = null;
			if (modelingFlags != null)
				msgs = ((InternalEObject)modelingFlags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL_COLUMN__MODELING_FLAGS, null, msgs);
			if (newModelingFlags != null)
				msgs = ((InternalEObject)newModelingFlags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL_COLUMN__MODELING_FLAGS, null, msgs);
			msgs = basicSetModelingFlags(newModelingFlags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__MODELING_FLAGS, newModelingFlags, newModelingFlags));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL_COLUMN__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MINING_MODEL_COLUMN__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MINING_MODEL_COLUMN__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.MINING_MODEL_COLUMN__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.MINING_MODEL_COLUMN__COLUMNS:
				return basicSetColumns(null, msgs);
			case XmlaPackage.MINING_MODEL_COLUMN__MODELING_FLAGS:
				return basicSetModelingFlags(null, msgs);
			case XmlaPackage.MINING_MODEL_COLUMN__ANNOTATIONS:
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
			case XmlaPackage.MINING_MODEL_COLUMN__NAME:
				return getName();
			case XmlaPackage.MINING_MODEL_COLUMN__ID:
				return getID();
			case XmlaPackage.MINING_MODEL_COLUMN__DESCRIPTION:
				return getDescription();
			case XmlaPackage.MINING_MODEL_COLUMN__SOURCE_COLUMN_ID:
				return getSourceColumnID();
			case XmlaPackage.MINING_MODEL_COLUMN__USAGE:
				return getUsage();
			case XmlaPackage.MINING_MODEL_COLUMN__FILTER:
				return getFilter();
			case XmlaPackage.MINING_MODEL_COLUMN__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.MINING_MODEL_COLUMN__COLUMNS:
				return getColumns();
			case XmlaPackage.MINING_MODEL_COLUMN__MODELING_FLAGS:
				return getModelingFlags();
			case XmlaPackage.MINING_MODEL_COLUMN__ANNOTATIONS:
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
			case XmlaPackage.MINING_MODEL_COLUMN__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__SOURCE_COLUMN_ID:
				setSourceColumnID((String)newValue);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__USAGE:
				setUsage((UsageType)newValue);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__FILTER:
				setFilter((String)newValue);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__COLUMNS:
				setColumns((ColumnsType3)newValue);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__MODELING_FLAGS:
				setModelingFlags((ModelingFlagsType1)newValue);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
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
			case XmlaPackage.MINING_MODEL_COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__SOURCE_COLUMN_ID:
				setSourceColumnID(SOURCE_COLUMN_ID_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__USAGE:
				unsetUsage();
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__FILTER:
				setFilter(FILTER_EDEFAULT);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__COLUMNS:
				setColumns((ColumnsType3)null);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__MODELING_FLAGS:
				setModelingFlags((ModelingFlagsType1)null);
				return;
			case XmlaPackage.MINING_MODEL_COLUMN__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
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
			case XmlaPackage.MINING_MODEL_COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.MINING_MODEL_COLUMN__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.MINING_MODEL_COLUMN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.MINING_MODEL_COLUMN__SOURCE_COLUMN_ID:
				return SOURCE_COLUMN_ID_EDEFAULT == null ? sourceColumnID != null : !SOURCE_COLUMN_ID_EDEFAULT.equals(sourceColumnID);
			case XmlaPackage.MINING_MODEL_COLUMN__USAGE:
				return isSetUsage();
			case XmlaPackage.MINING_MODEL_COLUMN__FILTER:
				return FILTER_EDEFAULT == null ? filter != null : !FILTER_EDEFAULT.equals(filter);
			case XmlaPackage.MINING_MODEL_COLUMN__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.MINING_MODEL_COLUMN__COLUMNS:
				return columns != null;
			case XmlaPackage.MINING_MODEL_COLUMN__MODELING_FLAGS:
				return modelingFlags != null;
			case XmlaPackage.MINING_MODEL_COLUMN__ANNOTATIONS:
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
		result.append(", sourceColumnID: ");
		result.append(sourceColumnID);
		result.append(", usage: ");
		if (usageESet) result.append(usage); else result.append("<unset>");
		result.append(", filter: ");
		result.append(filter);
		result.append(')');
		return result.toString();
	}

} //MiningModelColumnImpl
