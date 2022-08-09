/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.engine2.MemberKeysUniqueType;

import org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties;
import org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType;
import org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType;

import org.eclipse.daanse.xmla.model.ecore.xmla.AllMemberTranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy;
import org.eclipse.daanse.xmla.model.ecore.xmla.LevelsType;
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
 * An implementation of the model object '<em><b>Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getProcessingState <em>Processing State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getStructureType <em>Structure Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getDisplayFolder <em>Display Folder</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getAllMemberName <em>All Member Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getAllMemberTranslations <em>All Member Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#isMemberNamesUnique <em>Member Names Unique</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getMemberKeysUnique <em>Member Keys Unique</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#isAllowDuplicateNames <em>Allow Duplicate Names</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getLevels <em>Levels</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.HierarchyImpl#getVisualizationProperties <em>Visualization Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HierarchyImpl extends MinimalEObjectImpl.Container implements Hierarchy {
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
	 * The default value of the '{@link #getProcessingState() <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingState()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingStateType PROCESSING_STATE_EDEFAULT = ProcessingStateType.PROCESSED;

	/**
	 * The cached value of the '{@link #getProcessingState() <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingState()
	 * @generated
	 * @ordered
	 */
	protected ProcessingStateType processingState = PROCESSING_STATE_EDEFAULT;

	/**
	 * This is true if the Processing State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processingStateESet;

	/**
	 * The default value of the '{@link #getStructureType() <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureType()
	 * @generated
	 * @ordered
	 */
	protected static final StructureTypeType STRUCTURE_TYPE_EDEFAULT = StructureTypeType.NATURAL;

	/**
	 * The cached value of the '{@link #getStructureType() <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureType()
	 * @generated
	 * @ordered
	 */
	protected StructureTypeType structureType = STRUCTURE_TYPE_EDEFAULT;

	/**
	 * This is true if the Structure Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean structureTypeESet;

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
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType translations;

	/**
	 * The default value of the '{@link #getAllMemberName() <em>All Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllMemberName()
	 * @generated
	 * @ordered
	 */
	protected static final String ALL_MEMBER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllMemberName() <em>All Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllMemberName()
	 * @generated
	 * @ordered
	 */
	protected String allMemberName = ALL_MEMBER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAllMemberTranslations() <em>All Member Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllMemberTranslations()
	 * @generated
	 * @ordered
	 */
	protected AllMemberTranslationsType allMemberTranslations;

	/**
	 * The default value of the '{@link #isMemberNamesUnique() <em>Member Names Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemberNamesUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEMBER_NAMES_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMemberNamesUnique() <em>Member Names Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMemberNamesUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean memberNamesUnique = MEMBER_NAMES_UNIQUE_EDEFAULT;

	/**
	 * This is true if the Member Names Unique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean memberNamesUniqueESet;

	/**
	 * The default value of the '{@link #getMemberKeysUnique() <em>Member Keys Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberKeysUnique()
	 * @generated
	 * @ordered
	 */
	protected static final MemberKeysUniqueType MEMBER_KEYS_UNIQUE_EDEFAULT = MemberKeysUniqueType.NOT_UNIQUE;

	/**
	 * The cached value of the '{@link #getMemberKeysUnique() <em>Member Keys Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberKeysUnique()
	 * @generated
	 * @ordered
	 */
	protected MemberKeysUniqueType memberKeysUnique = MEMBER_KEYS_UNIQUE_EDEFAULT;

	/**
	 * This is true if the Member Keys Unique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean memberKeysUniqueESet;

	/**
	 * The default value of the '{@link #isAllowDuplicateNames() <em>Allow Duplicate Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDuplicateNames()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_DUPLICATE_NAMES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowDuplicateNames() <em>Allow Duplicate Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowDuplicateNames()
	 * @generated
	 * @ordered
	 */
	protected boolean allowDuplicateNames = ALLOW_DUPLICATE_NAMES_EDEFAULT;

	/**
	 * This is true if the Allow Duplicate Names attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowDuplicateNamesESet;

	/**
	 * The cached value of the '{@link #getLevels() <em>Levels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevels()
	 * @generated
	 * @ordered
	 */
	protected LevelsType levels;

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
	 * The cached value of the '{@link #getVisualizationProperties() <em>Visualization Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizationProperties()
	 * @generated
	 * @ordered
	 */
	protected HierarchyVisualizationProperties visualizationProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.HIERARCHY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingStateType getProcessingState() {
		return processingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingState(ProcessingStateType newProcessingState) {
		ProcessingStateType oldProcessingState = processingState;
		processingState = newProcessingState == null ? PROCESSING_STATE_EDEFAULT : newProcessingState;
		boolean oldProcessingStateESet = processingStateESet;
		processingStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__PROCESSING_STATE, oldProcessingState, processingState, !oldProcessingStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessingState() {
		ProcessingStateType oldProcessingState = processingState;
		boolean oldProcessingStateESet = processingStateESet;
		processingState = PROCESSING_STATE_EDEFAULT;
		processingStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.HIERARCHY__PROCESSING_STATE, oldProcessingState, PROCESSING_STATE_EDEFAULT, oldProcessingStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcessingState() {
		return processingStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureTypeType getStructureType() {
		return structureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureType(StructureTypeType newStructureType) {
		StructureTypeType oldStructureType = structureType;
		structureType = newStructureType == null ? STRUCTURE_TYPE_EDEFAULT : newStructureType;
		boolean oldStructureTypeESet = structureTypeESet;
		structureTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__STRUCTURE_TYPE, oldStructureType, structureType, !oldStructureTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStructureType() {
		StructureTypeType oldStructureType = structureType;
		boolean oldStructureTypeESet = structureTypeESet;
		structureType = STRUCTURE_TYPE_EDEFAULT;
		structureTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.HIERARCHY__STRUCTURE_TYPE, oldStructureType, STRUCTURE_TYPE_EDEFAULT, oldStructureTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStructureType() {
		return structureTypeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__DISPLAY_FOLDER, oldDisplayFolder, displayFolder));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__TRANSLATIONS, oldTranslations, newTranslations);
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
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.HIERARCHY__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.HIERARCHY__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllMemberName() {
		return allMemberName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllMemberName(String newAllMemberName) {
		String oldAllMemberName = allMemberName;
		allMemberName = newAllMemberName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__ALL_MEMBER_NAME, oldAllMemberName, allMemberName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllMemberTranslationsType getAllMemberTranslations() {
		return allMemberTranslations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllMemberTranslations(AllMemberTranslationsType newAllMemberTranslations, NotificationChain msgs) {
		AllMemberTranslationsType oldAllMemberTranslations = allMemberTranslations;
		allMemberTranslations = newAllMemberTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__ALL_MEMBER_TRANSLATIONS, oldAllMemberTranslations, newAllMemberTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllMemberTranslations(AllMemberTranslationsType newAllMemberTranslations) {
		if (newAllMemberTranslations != allMemberTranslations) {
			NotificationChain msgs = null;
			if (allMemberTranslations != null)
				msgs = ((InternalEObject)allMemberTranslations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.HIERARCHY__ALL_MEMBER_TRANSLATIONS, null, msgs);
			if (newAllMemberTranslations != null)
				msgs = ((InternalEObject)newAllMemberTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.HIERARCHY__ALL_MEMBER_TRANSLATIONS, null, msgs);
			msgs = basicSetAllMemberTranslations(newAllMemberTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__ALL_MEMBER_TRANSLATIONS, newAllMemberTranslations, newAllMemberTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMemberNamesUnique() {
		return memberNamesUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberNamesUnique(boolean newMemberNamesUnique) {
		boolean oldMemberNamesUnique = memberNamesUnique;
		memberNamesUnique = newMemberNamesUnique;
		boolean oldMemberNamesUniqueESet = memberNamesUniqueESet;
		memberNamesUniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__MEMBER_NAMES_UNIQUE, oldMemberNamesUnique, memberNamesUnique, !oldMemberNamesUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMemberNamesUnique() {
		boolean oldMemberNamesUnique = memberNamesUnique;
		boolean oldMemberNamesUniqueESet = memberNamesUniqueESet;
		memberNamesUnique = MEMBER_NAMES_UNIQUE_EDEFAULT;
		memberNamesUniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.HIERARCHY__MEMBER_NAMES_UNIQUE, oldMemberNamesUnique, MEMBER_NAMES_UNIQUE_EDEFAULT, oldMemberNamesUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberNamesUnique() {
		return memberNamesUniqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberKeysUniqueType getMemberKeysUnique() {
		return memberKeysUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberKeysUnique(MemberKeysUniqueType newMemberKeysUnique) {
		MemberKeysUniqueType oldMemberKeysUnique = memberKeysUnique;
		memberKeysUnique = newMemberKeysUnique == null ? MEMBER_KEYS_UNIQUE_EDEFAULT : newMemberKeysUnique;
		boolean oldMemberKeysUniqueESet = memberKeysUniqueESet;
		memberKeysUniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__MEMBER_KEYS_UNIQUE, oldMemberKeysUnique, memberKeysUnique, !oldMemberKeysUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMemberKeysUnique() {
		MemberKeysUniqueType oldMemberKeysUnique = memberKeysUnique;
		boolean oldMemberKeysUniqueESet = memberKeysUniqueESet;
		memberKeysUnique = MEMBER_KEYS_UNIQUE_EDEFAULT;
		memberKeysUniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.HIERARCHY__MEMBER_KEYS_UNIQUE, oldMemberKeysUnique, MEMBER_KEYS_UNIQUE_EDEFAULT, oldMemberKeysUniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberKeysUnique() {
		return memberKeysUniqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowDuplicateNames() {
		return allowDuplicateNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowDuplicateNames(boolean newAllowDuplicateNames) {
		boolean oldAllowDuplicateNames = allowDuplicateNames;
		allowDuplicateNames = newAllowDuplicateNames;
		boolean oldAllowDuplicateNamesESet = allowDuplicateNamesESet;
		allowDuplicateNamesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__ALLOW_DUPLICATE_NAMES, oldAllowDuplicateNames, allowDuplicateNames, !oldAllowDuplicateNamesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowDuplicateNames() {
		boolean oldAllowDuplicateNames = allowDuplicateNames;
		boolean oldAllowDuplicateNamesESet = allowDuplicateNamesESet;
		allowDuplicateNames = ALLOW_DUPLICATE_NAMES_EDEFAULT;
		allowDuplicateNamesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.HIERARCHY__ALLOW_DUPLICATE_NAMES, oldAllowDuplicateNames, ALLOW_DUPLICATE_NAMES_EDEFAULT, oldAllowDuplicateNamesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowDuplicateNames() {
		return allowDuplicateNamesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelsType getLevels() {
		return levels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevels(LevelsType newLevels, NotificationChain msgs) {
		LevelsType oldLevels = levels;
		levels = newLevels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__LEVELS, oldLevels, newLevels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevels(LevelsType newLevels) {
		if (newLevels != levels) {
			NotificationChain msgs = null;
			if (levels != null)
				msgs = ((InternalEObject)levels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.HIERARCHY__LEVELS, null, msgs);
			if (newLevels != null)
				msgs = ((InternalEObject)newLevels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.HIERARCHY__LEVELS, null, msgs);
			msgs = basicSetLevels(newLevels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__LEVELS, newLevels, newLevels));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.HIERARCHY__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.HIERARCHY__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchyVisualizationProperties getVisualizationProperties() {
		return visualizationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisualizationProperties(HierarchyVisualizationProperties newVisualizationProperties, NotificationChain msgs) {
		HierarchyVisualizationProperties oldVisualizationProperties = visualizationProperties;
		visualizationProperties = newVisualizationProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__VISUALIZATION_PROPERTIES, oldVisualizationProperties, newVisualizationProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualizationProperties(HierarchyVisualizationProperties newVisualizationProperties) {
		if (newVisualizationProperties != visualizationProperties) {
			NotificationChain msgs = null;
			if (visualizationProperties != null)
				msgs = ((InternalEObject)visualizationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.HIERARCHY__VISUALIZATION_PROPERTIES, null, msgs);
			if (newVisualizationProperties != null)
				msgs = ((InternalEObject)newVisualizationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.HIERARCHY__VISUALIZATION_PROPERTIES, null, msgs);
			msgs = basicSetVisualizationProperties(newVisualizationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.HIERARCHY__VISUALIZATION_PROPERTIES, newVisualizationProperties, newVisualizationProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.HIERARCHY__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.HIERARCHY__ALL_MEMBER_TRANSLATIONS:
				return basicSetAllMemberTranslations(null, msgs);
			case XmlaPackage.HIERARCHY__LEVELS:
				return basicSetLevels(null, msgs);
			case XmlaPackage.HIERARCHY__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.HIERARCHY__VISUALIZATION_PROPERTIES:
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
			case XmlaPackage.HIERARCHY__NAME:
				return getName();
			case XmlaPackage.HIERARCHY__ID:
				return getID();
			case XmlaPackage.HIERARCHY__DESCRIPTION:
				return getDescription();
			case XmlaPackage.HIERARCHY__PROCESSING_STATE:
				return getProcessingState();
			case XmlaPackage.HIERARCHY__STRUCTURE_TYPE:
				return getStructureType();
			case XmlaPackage.HIERARCHY__DISPLAY_FOLDER:
				return getDisplayFolder();
			case XmlaPackage.HIERARCHY__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.HIERARCHY__ALL_MEMBER_NAME:
				return getAllMemberName();
			case XmlaPackage.HIERARCHY__ALL_MEMBER_TRANSLATIONS:
				return getAllMemberTranslations();
			case XmlaPackage.HIERARCHY__MEMBER_NAMES_UNIQUE:
				return isMemberNamesUnique();
			case XmlaPackage.HIERARCHY__MEMBER_KEYS_UNIQUE:
				return getMemberKeysUnique();
			case XmlaPackage.HIERARCHY__ALLOW_DUPLICATE_NAMES:
				return isAllowDuplicateNames();
			case XmlaPackage.HIERARCHY__LEVELS:
				return getLevels();
			case XmlaPackage.HIERARCHY__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.HIERARCHY__VISUALIZATION_PROPERTIES:
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
			case XmlaPackage.HIERARCHY__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.HIERARCHY__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.HIERARCHY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.HIERARCHY__PROCESSING_STATE:
				setProcessingState((ProcessingStateType)newValue);
				return;
			case XmlaPackage.HIERARCHY__STRUCTURE_TYPE:
				setStructureType((StructureTypeType)newValue);
				return;
			case XmlaPackage.HIERARCHY__DISPLAY_FOLDER:
				setDisplayFolder((String)newValue);
				return;
			case XmlaPackage.HIERARCHY__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case XmlaPackage.HIERARCHY__ALL_MEMBER_NAME:
				setAllMemberName((String)newValue);
				return;
			case XmlaPackage.HIERARCHY__ALL_MEMBER_TRANSLATIONS:
				setAllMemberTranslations((AllMemberTranslationsType)newValue);
				return;
			case XmlaPackage.HIERARCHY__MEMBER_NAMES_UNIQUE:
				setMemberNamesUnique((Boolean)newValue);
				return;
			case XmlaPackage.HIERARCHY__MEMBER_KEYS_UNIQUE:
				setMemberKeysUnique((MemberKeysUniqueType)newValue);
				return;
			case XmlaPackage.HIERARCHY__ALLOW_DUPLICATE_NAMES:
				setAllowDuplicateNames((Boolean)newValue);
				return;
			case XmlaPackage.HIERARCHY__LEVELS:
				setLevels((LevelsType)newValue);
				return;
			case XmlaPackage.HIERARCHY__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case XmlaPackage.HIERARCHY__VISUALIZATION_PROPERTIES:
				setVisualizationProperties((HierarchyVisualizationProperties)newValue);
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
			case XmlaPackage.HIERARCHY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.HIERARCHY__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.HIERARCHY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.HIERARCHY__PROCESSING_STATE:
				unsetProcessingState();
				return;
			case XmlaPackage.HIERARCHY__STRUCTURE_TYPE:
				unsetStructureType();
				return;
			case XmlaPackage.HIERARCHY__DISPLAY_FOLDER:
				setDisplayFolder(DISPLAY_FOLDER_EDEFAULT);
				return;
			case XmlaPackage.HIERARCHY__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case XmlaPackage.HIERARCHY__ALL_MEMBER_NAME:
				setAllMemberName(ALL_MEMBER_NAME_EDEFAULT);
				return;
			case XmlaPackage.HIERARCHY__ALL_MEMBER_TRANSLATIONS:
				setAllMemberTranslations((AllMemberTranslationsType)null);
				return;
			case XmlaPackage.HIERARCHY__MEMBER_NAMES_UNIQUE:
				unsetMemberNamesUnique();
				return;
			case XmlaPackage.HIERARCHY__MEMBER_KEYS_UNIQUE:
				unsetMemberKeysUnique();
				return;
			case XmlaPackage.HIERARCHY__ALLOW_DUPLICATE_NAMES:
				unsetAllowDuplicateNames();
				return;
			case XmlaPackage.HIERARCHY__LEVELS:
				setLevels((LevelsType)null);
				return;
			case XmlaPackage.HIERARCHY__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case XmlaPackage.HIERARCHY__VISUALIZATION_PROPERTIES:
				setVisualizationProperties((HierarchyVisualizationProperties)null);
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
			case XmlaPackage.HIERARCHY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.HIERARCHY__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.HIERARCHY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.HIERARCHY__PROCESSING_STATE:
				return isSetProcessingState();
			case XmlaPackage.HIERARCHY__STRUCTURE_TYPE:
				return isSetStructureType();
			case XmlaPackage.HIERARCHY__DISPLAY_FOLDER:
				return DISPLAY_FOLDER_EDEFAULT == null ? displayFolder != null : !DISPLAY_FOLDER_EDEFAULT.equals(displayFolder);
			case XmlaPackage.HIERARCHY__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.HIERARCHY__ALL_MEMBER_NAME:
				return ALL_MEMBER_NAME_EDEFAULT == null ? allMemberName != null : !ALL_MEMBER_NAME_EDEFAULT.equals(allMemberName);
			case XmlaPackage.HIERARCHY__ALL_MEMBER_TRANSLATIONS:
				return allMemberTranslations != null;
			case XmlaPackage.HIERARCHY__MEMBER_NAMES_UNIQUE:
				return isSetMemberNamesUnique();
			case XmlaPackage.HIERARCHY__MEMBER_KEYS_UNIQUE:
				return isSetMemberKeysUnique();
			case XmlaPackage.HIERARCHY__ALLOW_DUPLICATE_NAMES:
				return isSetAllowDuplicateNames();
			case XmlaPackage.HIERARCHY__LEVELS:
				return levels != null;
			case XmlaPackage.HIERARCHY__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.HIERARCHY__VISUALIZATION_PROPERTIES:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", iD: ");
		result.append(iD);
		result.append(", description: ");
		result.append(description);
		result.append(", processingState: ");
		if (processingStateESet) result.append(processingState); else result.append("<unset>");
		result.append(", structureType: ");
		if (structureTypeESet) result.append(structureType); else result.append("<unset>");
		result.append(", displayFolder: ");
		result.append(displayFolder);
		result.append(", allMemberName: ");
		result.append(allMemberName);
		result.append(", memberNamesUnique: ");
		if (memberNamesUniqueESet) result.append(memberNamesUnique); else result.append("<unset>");
		result.append(", memberKeysUnique: ");
		if (memberKeysUniqueESet) result.append(memberKeysUnique); else result.append("<unset>");
		result.append(", allowDuplicateNames: ");
		if (allowDuplicateNamesESet) result.append(allowDuplicateNames); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HierarchyImpl
