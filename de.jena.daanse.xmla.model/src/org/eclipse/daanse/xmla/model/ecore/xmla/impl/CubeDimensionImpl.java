/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AllMemberAggregationUsageType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType5;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.HierarchiesType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.HierarchyUniqueNameStyleType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MemberUniqueNameStyleType;
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
 * An implementation of the model object '<em><b>Cube Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionImpl#getDimensionID <em>Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionImpl#getAllMemberAggregationUsage <em>All Member Aggregation Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionImpl#getHierarchyUniqueNameStyle <em>Hierarchy Unique Name Style</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionImpl#getMemberUniqueNameStyle <em>Member Unique Name Style</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionImpl#getHierarchies <em>Hierarchies</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeDimensionImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubeDimensionImpl extends MinimalEObjectImpl.Container implements CubeDimension {
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
	protected TranslationsType translations;

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
	 * The default value of the '{@link #getAllMemberAggregationUsage() <em>All Member Aggregation Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllMemberAggregationUsage()
	 * @generated
	 * @ordered
	 */
	protected static final AllMemberAggregationUsageType ALL_MEMBER_AGGREGATION_USAGE_EDEFAULT = AllMemberAggregationUsageType.FULL;

	/**
	 * The cached value of the '{@link #getAllMemberAggregationUsage() <em>All Member Aggregation Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllMemberAggregationUsage()
	 * @generated
	 * @ordered
	 */
	protected AllMemberAggregationUsageType allMemberAggregationUsage = ALL_MEMBER_AGGREGATION_USAGE_EDEFAULT;

	/**
	 * This is true if the All Member Aggregation Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allMemberAggregationUsageESet;

	/**
	 * The default value of the '{@link #getHierarchyUniqueNameStyle() <em>Hierarchy Unique Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyUniqueNameStyle()
	 * @generated
	 * @ordered
	 */
	protected static final HierarchyUniqueNameStyleType HIERARCHY_UNIQUE_NAME_STYLE_EDEFAULT = HierarchyUniqueNameStyleType.INCLUDE_DIMENSION_NAME;

	/**
	 * The cached value of the '{@link #getHierarchyUniqueNameStyle() <em>Hierarchy Unique Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyUniqueNameStyle()
	 * @generated
	 * @ordered
	 */
	protected HierarchyUniqueNameStyleType hierarchyUniqueNameStyle = HIERARCHY_UNIQUE_NAME_STYLE_EDEFAULT;

	/**
	 * This is true if the Hierarchy Unique Name Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hierarchyUniqueNameStyleESet;

	/**
	 * The default value of the '{@link #getMemberUniqueNameStyle() <em>Member Unique Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberUniqueNameStyle()
	 * @generated
	 * @ordered
	 */
	protected static final MemberUniqueNameStyleType MEMBER_UNIQUE_NAME_STYLE_EDEFAULT = MemberUniqueNameStyleType.NATIVE;

	/**
	 * The cached value of the '{@link #getMemberUniqueNameStyle() <em>Member Unique Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberUniqueNameStyle()
	 * @generated
	 * @ordered
	 */
	protected MemberUniqueNameStyleType memberUniqueNameStyle = MEMBER_UNIQUE_NAME_STYLE_EDEFAULT;

	/**
	 * This is true if the Member Unique Name Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean memberUniqueNameStyleESet;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected AttributesType5 attributes;

	/**
	 * The cached value of the '{@link #getHierarchies() <em>Hierarchies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchies()
	 * @generated
	 * @ordered
	 */
	protected HierarchiesType2 hierarchies;

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
	protected CubeDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CUBE_DIMENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__TRANSLATIONS, oldTranslations, newTranslations);
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
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_DIMENSION__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_DIMENSION__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__TRANSLATIONS, newTranslations, newTranslations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__DIMENSION_ID, oldDimensionID, dimensionID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__VISIBLE, oldVisible, visible, !oldVisibleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_DIMENSION__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
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
	public AllMemberAggregationUsageType getAllMemberAggregationUsage() {
		return allMemberAggregationUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllMemberAggregationUsage(AllMemberAggregationUsageType newAllMemberAggregationUsage) {
		AllMemberAggregationUsageType oldAllMemberAggregationUsage = allMemberAggregationUsage;
		allMemberAggregationUsage = newAllMemberAggregationUsage == null ? ALL_MEMBER_AGGREGATION_USAGE_EDEFAULT : newAllMemberAggregationUsage;
		boolean oldAllMemberAggregationUsageESet = allMemberAggregationUsageESet;
		allMemberAggregationUsageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__ALL_MEMBER_AGGREGATION_USAGE, oldAllMemberAggregationUsage, allMemberAggregationUsage, !oldAllMemberAggregationUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllMemberAggregationUsage() {
		AllMemberAggregationUsageType oldAllMemberAggregationUsage = allMemberAggregationUsage;
		boolean oldAllMemberAggregationUsageESet = allMemberAggregationUsageESet;
		allMemberAggregationUsage = ALL_MEMBER_AGGREGATION_USAGE_EDEFAULT;
		allMemberAggregationUsageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_DIMENSION__ALL_MEMBER_AGGREGATION_USAGE, oldAllMemberAggregationUsage, ALL_MEMBER_AGGREGATION_USAGE_EDEFAULT, oldAllMemberAggregationUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllMemberAggregationUsage() {
		return allMemberAggregationUsageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchyUniqueNameStyleType getHierarchyUniqueNameStyle() {
		return hierarchyUniqueNameStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchyUniqueNameStyle(HierarchyUniqueNameStyleType newHierarchyUniqueNameStyle) {
		HierarchyUniqueNameStyleType oldHierarchyUniqueNameStyle = hierarchyUniqueNameStyle;
		hierarchyUniqueNameStyle = newHierarchyUniqueNameStyle == null ? HIERARCHY_UNIQUE_NAME_STYLE_EDEFAULT : newHierarchyUniqueNameStyle;
		boolean oldHierarchyUniqueNameStyleESet = hierarchyUniqueNameStyleESet;
		hierarchyUniqueNameStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__HIERARCHY_UNIQUE_NAME_STYLE, oldHierarchyUniqueNameStyle, hierarchyUniqueNameStyle, !oldHierarchyUniqueNameStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHierarchyUniqueNameStyle() {
		HierarchyUniqueNameStyleType oldHierarchyUniqueNameStyle = hierarchyUniqueNameStyle;
		boolean oldHierarchyUniqueNameStyleESet = hierarchyUniqueNameStyleESet;
		hierarchyUniqueNameStyle = HIERARCHY_UNIQUE_NAME_STYLE_EDEFAULT;
		hierarchyUniqueNameStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_DIMENSION__HIERARCHY_UNIQUE_NAME_STYLE, oldHierarchyUniqueNameStyle, HIERARCHY_UNIQUE_NAME_STYLE_EDEFAULT, oldHierarchyUniqueNameStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHierarchyUniqueNameStyle() {
		return hierarchyUniqueNameStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberUniqueNameStyleType getMemberUniqueNameStyle() {
		return memberUniqueNameStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberUniqueNameStyle(MemberUniqueNameStyleType newMemberUniqueNameStyle) {
		MemberUniqueNameStyleType oldMemberUniqueNameStyle = memberUniqueNameStyle;
		memberUniqueNameStyle = newMemberUniqueNameStyle == null ? MEMBER_UNIQUE_NAME_STYLE_EDEFAULT : newMemberUniqueNameStyle;
		boolean oldMemberUniqueNameStyleESet = memberUniqueNameStyleESet;
		memberUniqueNameStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__MEMBER_UNIQUE_NAME_STYLE, oldMemberUniqueNameStyle, memberUniqueNameStyle, !oldMemberUniqueNameStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMemberUniqueNameStyle() {
		MemberUniqueNameStyleType oldMemberUniqueNameStyle = memberUniqueNameStyle;
		boolean oldMemberUniqueNameStyleESet = memberUniqueNameStyleESet;
		memberUniqueNameStyle = MEMBER_UNIQUE_NAME_STYLE_EDEFAULT;
		memberUniqueNameStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_DIMENSION__MEMBER_UNIQUE_NAME_STYLE, oldMemberUniqueNameStyle, MEMBER_UNIQUE_NAME_STYLE_EDEFAULT, oldMemberUniqueNameStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberUniqueNameStyle() {
		return memberUniqueNameStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType5 getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(AttributesType5 newAttributes, NotificationChain msgs) {
		AttributesType5 oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(AttributesType5 newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_DIMENSION__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_DIMENSION__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HierarchiesType2 getHierarchies() {
		return hierarchies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHierarchies(HierarchiesType2 newHierarchies, NotificationChain msgs) {
		HierarchiesType2 oldHierarchies = hierarchies;
		hierarchies = newHierarchies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__HIERARCHIES, oldHierarchies, newHierarchies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchies(HierarchiesType2 newHierarchies) {
		if (newHierarchies != hierarchies) {
			NotificationChain msgs = null;
			if (hierarchies != null)
				msgs = ((InternalEObject)hierarchies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_DIMENSION__HIERARCHIES, null, msgs);
			if (newHierarchies != null)
				msgs = ((InternalEObject)newHierarchies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_DIMENSION__HIERARCHIES, null, msgs);
			msgs = basicSetHierarchies(newHierarchies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__HIERARCHIES, newHierarchies, newHierarchies));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_DIMENSION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_DIMENSION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_DIMENSION__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.CUBE_DIMENSION__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.CUBE_DIMENSION__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case XmlaPackage.CUBE_DIMENSION__HIERARCHIES:
				return basicSetHierarchies(null, msgs);
			case XmlaPackage.CUBE_DIMENSION__ANNOTATIONS:
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
			case XmlaPackage.CUBE_DIMENSION__ID:
				return getID();
			case XmlaPackage.CUBE_DIMENSION__NAME:
				return getName();
			case XmlaPackage.CUBE_DIMENSION__DESCRIPTION:
				return getDescription();
			case XmlaPackage.CUBE_DIMENSION__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.CUBE_DIMENSION__DIMENSION_ID:
				return getDimensionID();
			case XmlaPackage.CUBE_DIMENSION__VISIBLE:
				return isVisible();
			case XmlaPackage.CUBE_DIMENSION__ALL_MEMBER_AGGREGATION_USAGE:
				return getAllMemberAggregationUsage();
			case XmlaPackage.CUBE_DIMENSION__HIERARCHY_UNIQUE_NAME_STYLE:
				return getHierarchyUniqueNameStyle();
			case XmlaPackage.CUBE_DIMENSION__MEMBER_UNIQUE_NAME_STYLE:
				return getMemberUniqueNameStyle();
			case XmlaPackage.CUBE_DIMENSION__ATTRIBUTES:
				return getAttributes();
			case XmlaPackage.CUBE_DIMENSION__HIERARCHIES:
				return getHierarchies();
			case XmlaPackage.CUBE_DIMENSION__ANNOTATIONS:
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
			case XmlaPackage.CUBE_DIMENSION__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION__DIMENSION_ID:
				setDimensionID((String)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION__ALL_MEMBER_AGGREGATION_USAGE:
				setAllMemberAggregationUsage((AllMemberAggregationUsageType)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION__HIERARCHY_UNIQUE_NAME_STYLE:
				setHierarchyUniqueNameStyle((HierarchyUniqueNameStyleType)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION__MEMBER_UNIQUE_NAME_STYLE:
				setMemberUniqueNameStyle((MemberUniqueNameStyleType)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION__ATTRIBUTES:
				setAttributes((AttributesType5)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION__HIERARCHIES:
				setHierarchies((HierarchiesType2)newValue);
				return;
			case XmlaPackage.CUBE_DIMENSION__ANNOTATIONS:
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
			case XmlaPackage.CUBE_DIMENSION__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.CUBE_DIMENSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.CUBE_DIMENSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.CUBE_DIMENSION__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case XmlaPackage.CUBE_DIMENSION__DIMENSION_ID:
				setDimensionID(DIMENSION_ID_EDEFAULT);
				return;
			case XmlaPackage.CUBE_DIMENSION__VISIBLE:
				unsetVisible();
				return;
			case XmlaPackage.CUBE_DIMENSION__ALL_MEMBER_AGGREGATION_USAGE:
				unsetAllMemberAggregationUsage();
				return;
			case XmlaPackage.CUBE_DIMENSION__HIERARCHY_UNIQUE_NAME_STYLE:
				unsetHierarchyUniqueNameStyle();
				return;
			case XmlaPackage.CUBE_DIMENSION__MEMBER_UNIQUE_NAME_STYLE:
				unsetMemberUniqueNameStyle();
				return;
			case XmlaPackage.CUBE_DIMENSION__ATTRIBUTES:
				setAttributes((AttributesType5)null);
				return;
			case XmlaPackage.CUBE_DIMENSION__HIERARCHIES:
				setHierarchies((HierarchiesType2)null);
				return;
			case XmlaPackage.CUBE_DIMENSION__ANNOTATIONS:
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
			case XmlaPackage.CUBE_DIMENSION__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.CUBE_DIMENSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.CUBE_DIMENSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.CUBE_DIMENSION__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.CUBE_DIMENSION__DIMENSION_ID:
				return DIMENSION_ID_EDEFAULT == null ? dimensionID != null : !DIMENSION_ID_EDEFAULT.equals(dimensionID);
			case XmlaPackage.CUBE_DIMENSION__VISIBLE:
				return isSetVisible();
			case XmlaPackage.CUBE_DIMENSION__ALL_MEMBER_AGGREGATION_USAGE:
				return isSetAllMemberAggregationUsage();
			case XmlaPackage.CUBE_DIMENSION__HIERARCHY_UNIQUE_NAME_STYLE:
				return isSetHierarchyUniqueNameStyle();
			case XmlaPackage.CUBE_DIMENSION__MEMBER_UNIQUE_NAME_STYLE:
				return isSetMemberUniqueNameStyle();
			case XmlaPackage.CUBE_DIMENSION__ATTRIBUTES:
				return attributes != null;
			case XmlaPackage.CUBE_DIMENSION__HIERARCHIES:
				return hierarchies != null;
			case XmlaPackage.CUBE_DIMENSION__ANNOTATIONS:
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
		result.append(" (iD: ");
		result.append(iD);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", dimensionID: ");
		result.append(dimensionID);
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(", allMemberAggregationUsage: ");
		if (allMemberAggregationUsageESet) result.append(allMemberAggregationUsage); else result.append("<unset>");
		result.append(", hierarchyUniqueNameStyle: ");
		if (hierarchyUniqueNameStyleESet) result.append(hierarchyUniqueNameStyle); else result.append("<unset>");
		result.append(", memberUniqueNameStyle: ");
		if (memberUniqueNameStyleESet) result.append(memberUniqueNameStyle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CubeDimensionImpl
