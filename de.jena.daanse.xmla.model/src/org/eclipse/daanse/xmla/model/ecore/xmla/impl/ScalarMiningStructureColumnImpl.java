/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType46;
import org.eclipse.daanse.xmla.model.ecore.xmla.Binding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ClassifiedColumnsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ContentType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataItem;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.ModelingFlagsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType10;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType8;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scalar Mining Structure Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#isIsKey <em>Is Key</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getModelingFlags <em>Modeling Flags</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getClassifiedColumns <em>Classified Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getDiscretizationMethod <em>Discretization Method</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getDiscretizationBucketCount <em>Discretization Bucket Count</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getNameColumn <em>Name Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ScalarMiningStructureColumnImpl#getTranslations <em>Translations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScalarMiningStructureColumnImpl extends MinimalEObjectImpl.Container implements ScalarMiningStructureColumn {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType8 TYPE_EDEFAULT = TypeType8.LONG;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType8 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType46 annotations;

	/**
	 * The default value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsKey()
	 * @generated
	 * @ordered
	 */
	protected boolean isKey = IS_KEY_EDEFAULT;

	/**
	 * This is true if the Is Key attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isKeyESet;

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
	 * The default value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected String distribution = DISTRIBUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getModelingFlags() <em>Modeling Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelingFlags()
	 * @generated
	 * @ordered
	 */
	protected ModelingFlagsType modelingFlags;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final ContentType CONTENT_EDEFAULT = ContentType.DISCRETE;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected ContentType content = CONTENT_EDEFAULT;

	/**
	 * This is true if the Content attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contentESet;

	/**
	 * The cached value of the '{@link #getClassifiedColumns() <em>Classified Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedColumns()
	 * @generated
	 * @ordered
	 */
	protected ClassifiedColumnsType classifiedColumns;

	/**
	 * The default value of the '{@link #getDiscretizationMethod() <em>Discretization Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscretizationMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRETIZATION_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscretizationMethod() <em>Discretization Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscretizationMethod()
	 * @generated
	 * @ordered
	 */
	protected String discretizationMethod = DISCRETIZATION_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscretizationBucketCount() <em>Discretization Bucket Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscretizationBucketCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DISCRETIZATION_BUCKET_COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscretizationBucketCount() <em>Discretization Bucket Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscretizationBucketCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger discretizationBucketCount = DISCRETIZATION_BUCKET_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeyColumns() <em>Key Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyColumns()
	 * @generated
	 * @ordered
	 */
	protected KeyColumnsType1 keyColumns;

	/**
	 * The cached value of the '{@link #getNameColumn() <em>Name Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameColumn()
	 * @generated
	 * @ordered
	 */
	protected DataItem nameColumn;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType10 translations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalarMiningStructureColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.SCALAR_MINING_STRUCTURE_COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType8 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType8 newType) {
		TypeType8 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType8 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType46 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType46 newAnnotations, NotificationChain msgs) {
		AnnotationsType46 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType46 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsKey() {
		return isKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsKey(boolean newIsKey) {
		boolean oldIsKey = isKey;
		isKey = newIsKey;
		boolean oldIsKeyESet = isKeyESet;
		isKeyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__IS_KEY, oldIsKey, isKey, !oldIsKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsKey() {
		boolean oldIsKey = isKey;
		boolean oldIsKeyESet = isKeyESet;
		isKey = IS_KEY_EDEFAULT;
		isKeyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__IS_KEY, oldIsKey, IS_KEY_EDEFAULT, oldIsKeyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsKey() {
		return isKeyESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__SOURCE, oldSource, newSource);
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
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDistribution() {
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistribution(String newDistribution) {
		String oldDistribution = distribution;
		distribution = newDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISTRIBUTION, oldDistribution, distribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingFlagsType getModelingFlags() {
		return modelingFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelingFlags(ModelingFlagsType newModelingFlags, NotificationChain msgs) {
		ModelingFlagsType oldModelingFlags = modelingFlags;
		modelingFlags = newModelingFlags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__MODELING_FLAGS, oldModelingFlags, newModelingFlags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelingFlags(ModelingFlagsType newModelingFlags) {
		if (newModelingFlags != modelingFlags) {
			NotificationChain msgs = null;
			if (modelingFlags != null)
				msgs = ((InternalEObject)modelingFlags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__MODELING_FLAGS, null, msgs);
			if (newModelingFlags != null)
				msgs = ((InternalEObject)newModelingFlags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__MODELING_FLAGS, null, msgs);
			msgs = basicSetModelingFlags(newModelingFlags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__MODELING_FLAGS, newModelingFlags, newModelingFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentType getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(ContentType newContent) {
		ContentType oldContent = content;
		content = newContent == null ? CONTENT_EDEFAULT : newContent;
		boolean oldContentESet = contentESet;
		contentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CONTENT, oldContent, content, !oldContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContent() {
		ContentType oldContent = content;
		boolean oldContentESet = contentESet;
		content = CONTENT_EDEFAULT;
		contentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CONTENT, oldContent, CONTENT_EDEFAULT, oldContentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContent() {
		return contentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifiedColumnsType getClassifiedColumns() {
		return classifiedColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifiedColumns(ClassifiedColumnsType newClassifiedColumns, NotificationChain msgs) {
		ClassifiedColumnsType oldClassifiedColumns = classifiedColumns;
		classifiedColumns = newClassifiedColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CLASSIFIED_COLUMNS, oldClassifiedColumns, newClassifiedColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiedColumns(ClassifiedColumnsType newClassifiedColumns) {
		if (newClassifiedColumns != classifiedColumns) {
			NotificationChain msgs = null;
			if (classifiedColumns != null)
				msgs = ((InternalEObject)classifiedColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CLASSIFIED_COLUMNS, null, msgs);
			if (newClassifiedColumns != null)
				msgs = ((InternalEObject)newClassifiedColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CLASSIFIED_COLUMNS, null, msgs);
			msgs = basicSetClassifiedColumns(newClassifiedColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CLASSIFIED_COLUMNS, newClassifiedColumns, newClassifiedColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscretizationMethod() {
		return discretizationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscretizationMethod(String newDiscretizationMethod) {
		String oldDiscretizationMethod = discretizationMethod;
		discretizationMethod = newDiscretizationMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISCRETIZATION_METHOD, oldDiscretizationMethod, discretizationMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDiscretizationBucketCount() {
		return discretizationBucketCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscretizationBucketCount(BigInteger newDiscretizationBucketCount) {
		BigInteger oldDiscretizationBucketCount = discretizationBucketCount;
		discretizationBucketCount = newDiscretizationBucketCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISCRETIZATION_BUCKET_COUNT, oldDiscretizationBucketCount, discretizationBucketCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyColumnsType1 getKeyColumns() {
		return keyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyColumns(KeyColumnsType1 newKeyColumns, NotificationChain msgs) {
		KeyColumnsType1 oldKeyColumns = keyColumns;
		keyColumns = newKeyColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__KEY_COLUMNS, oldKeyColumns, newKeyColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyColumns(KeyColumnsType1 newKeyColumns) {
		if (newKeyColumns != keyColumns) {
			NotificationChain msgs = null;
			if (keyColumns != null)
				msgs = ((InternalEObject)keyColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__KEY_COLUMNS, null, msgs);
			if (newKeyColumns != null)
				msgs = ((InternalEObject)newKeyColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__KEY_COLUMNS, null, msgs);
			msgs = basicSetKeyColumns(newKeyColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__KEY_COLUMNS, newKeyColumns, newKeyColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItem getNameColumn() {
		return nameColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameColumn(DataItem newNameColumn, NotificationChain msgs) {
		DataItem oldNameColumn = nameColumn;
		nameColumn = newNameColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME_COLUMN, oldNameColumn, newNameColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameColumn(DataItem newNameColumn) {
		if (newNameColumn != nameColumn) {
			NotificationChain msgs = null;
			if (nameColumn != null)
				msgs = ((InternalEObject)nameColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME_COLUMN, null, msgs);
			if (newNameColumn != null)
				msgs = ((InternalEObject)newNameColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME_COLUMN, null, msgs);
			msgs = basicSetNameColumn(newNameColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME_COLUMN, newNameColumn, newNameColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType10 getTranslations() {
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslations(TranslationsType10 newTranslations, NotificationChain msgs) {
		TranslationsType10 oldTranslations = translations;
		translations = newTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TRANSLATIONS, oldTranslations, newTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslations(TranslationsType10 newTranslations) {
		if (newTranslations != translations) {
			NotificationChain msgs = null;
			if (translations != null)
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__SOURCE:
				return basicSetSource(null, msgs);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__MODELING_FLAGS:
				return basicSetModelingFlags(null, msgs);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CLASSIFIED_COLUMNS:
				return basicSetClassifiedColumns(null, msgs);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__KEY_COLUMNS:
				return basicSetKeyColumns(null, msgs);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME_COLUMN:
				return basicSetNameColumn(null, msgs);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TRANSLATIONS:
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
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME:
				return getName();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ID:
				return getID();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DESCRIPTION:
				return getDescription();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TYPE:
				return getType();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__IS_KEY:
				return isIsKey();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__SOURCE:
				return getSource();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISTRIBUTION:
				return getDistribution();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__MODELING_FLAGS:
				return getModelingFlags();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CONTENT:
				return getContent();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CLASSIFIED_COLUMNS:
				return getClassifiedColumns();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISCRETIZATION_METHOD:
				return getDiscretizationMethod();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISCRETIZATION_BUCKET_COUNT:
				return getDiscretizationBucketCount();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__KEY_COLUMNS:
				return getKeyColumns();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME_COLUMN:
				return getNameColumn();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TRANSLATIONS:
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
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TYPE:
				setType((TypeType8)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ANNOTATIONS:
				setAnnotations((AnnotationsType46)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__IS_KEY:
				setIsKey((Boolean)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__SOURCE:
				setSource((Binding)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISTRIBUTION:
				setDistribution((String)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__MODELING_FLAGS:
				setModelingFlags((ModelingFlagsType)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CONTENT:
				setContent((ContentType)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CLASSIFIED_COLUMNS:
				setClassifiedColumns((ClassifiedColumnsType)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISCRETIZATION_METHOD:
				setDiscretizationMethod((String)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISCRETIZATION_BUCKET_COUNT:
				setDiscretizationBucketCount((BigInteger)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__KEY_COLUMNS:
				setKeyColumns((KeyColumnsType1)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME_COLUMN:
				setNameColumn((DataItem)newValue);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TRANSLATIONS:
				setTranslations((TranslationsType10)newValue);
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
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TYPE:
				unsetType();
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ANNOTATIONS:
				setAnnotations((AnnotationsType46)null);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__IS_KEY:
				unsetIsKey();
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__SOURCE:
				setSource((Binding)null);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISTRIBUTION:
				setDistribution(DISTRIBUTION_EDEFAULT);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__MODELING_FLAGS:
				setModelingFlags((ModelingFlagsType)null);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CONTENT:
				unsetContent();
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CLASSIFIED_COLUMNS:
				setClassifiedColumns((ClassifiedColumnsType)null);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISCRETIZATION_METHOD:
				setDiscretizationMethod(DISCRETIZATION_METHOD_EDEFAULT);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISCRETIZATION_BUCKET_COUNT:
				setDiscretizationBucketCount(DISCRETIZATION_BUCKET_COUNT_EDEFAULT);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__KEY_COLUMNS:
				setKeyColumns((KeyColumnsType1)null);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME_COLUMN:
				setNameColumn((DataItem)null);
				return;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TRANSLATIONS:
				setTranslations((TranslationsType10)null);
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
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TYPE:
				return isSetType();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__IS_KEY:
				return isSetIsKey();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__SOURCE:
				return source != null;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISTRIBUTION:
				return DISTRIBUTION_EDEFAULT == null ? distribution != null : !DISTRIBUTION_EDEFAULT.equals(distribution);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__MODELING_FLAGS:
				return modelingFlags != null;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CONTENT:
				return isSetContent();
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__CLASSIFIED_COLUMNS:
				return classifiedColumns != null;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISCRETIZATION_METHOD:
				return DISCRETIZATION_METHOD_EDEFAULT == null ? discretizationMethod != null : !DISCRETIZATION_METHOD_EDEFAULT.equals(discretizationMethod);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__DISCRETIZATION_BUCKET_COUNT:
				return DISCRETIZATION_BUCKET_COUNT_EDEFAULT == null ? discretizationBucketCount != null : !DISCRETIZATION_BUCKET_COUNT_EDEFAULT.equals(discretizationBucketCount);
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__KEY_COLUMNS:
				return keyColumns != null;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__NAME_COLUMN:
				return nameColumn != null;
			case XmlaPackage.SCALAR_MINING_STRUCTURE_COLUMN__TRANSLATIONS:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", iD: ");
		result.append(iD);
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", isKey: ");
		if (isKeyESet) result.append(isKey); else result.append("<unset>");
		result.append(", distribution: ");
		result.append(distribution);
		result.append(", content: ");
		if (contentESet) result.append(content); else result.append("<unset>");
		result.append(", discretizationMethod: ");
		result.append(discretizationMethod);
		result.append(", discretizationBucketCount: ");
		result.append(discretizationBucketCount);
		result.append(')');
		return result.toString();
	}

} //ScalarMiningStructureColumnImpl
