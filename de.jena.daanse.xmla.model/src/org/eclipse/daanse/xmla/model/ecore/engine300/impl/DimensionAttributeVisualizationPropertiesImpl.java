/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType;
import org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1;
import org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType;
import org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties;
import org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package;
import org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Attribute Visualization Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#getFolderPosition <em>Folder Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#getContextualNameRule <em>Contextual Name Rule</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#isIsFolderDefault <em>Is Folder Default</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#isIsRightToLeft <em>Is Right To Left</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#getSortDirection <em>Sort Direction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#getDefaultDetailsPosition <em>Default Details Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#getCommonIdentifierPosition <em>Common Identifier Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#getSortPropertiesPosition <em>Sort Properties Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#getDisplayKeyPosition <em>Display Key Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#isIsDefaultImage <em>Is Default Image</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.DimensionAttributeVisualizationPropertiesImpl#getDefaultAggregateFunction <em>Default Aggregate Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionAttributeVisualizationPropertiesImpl extends MinimalEObjectImpl.Container implements DimensionAttributeVisualizationProperties {
	/**
	 * The default value of the '{@link #getFolderPosition() <em>Folder Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FOLDER_POSITION_EDEFAULT = new BigInteger("-1");

	/**
	 * The cached value of the '{@link #getFolderPosition() <em>Folder Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFolderPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger folderPosition = FOLDER_POSITION_EDEFAULT;

	/**
	 * This is true if the Folder Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean folderPositionESet;

	/**
	 * The default value of the '{@link #getContextualNameRule() <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualNameRule()
	 * @generated
	 * @ordered
	 */
	protected static final ContextualNameRuleType1 CONTEXTUAL_NAME_RULE_EDEFAULT = ContextualNameRuleType1.NONE;

	/**
	 * The cached value of the '{@link #getContextualNameRule() <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualNameRule()
	 * @generated
	 * @ordered
	 */
	protected ContextualNameRuleType1 contextualNameRule = CONTEXTUAL_NAME_RULE_EDEFAULT;

	/**
	 * This is true if the Contextual Name Rule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contextualNameRuleESet;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final AlignmentType ALIGNMENT_EDEFAULT = AlignmentType.DEFAULT;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected AlignmentType alignment = ALIGNMENT_EDEFAULT;

	/**
	 * This is true if the Alignment attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignmentESet;

	/**
	 * The default value of the '{@link #isIsFolderDefault() <em>Is Folder Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFolderDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FOLDER_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFolderDefault() <em>Is Folder Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFolderDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean isFolderDefault = IS_FOLDER_DEFAULT_EDEFAULT;

	/**
	 * This is true if the Is Folder Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isFolderDefaultESet;

	/**
	 * The default value of the '{@link #isIsRightToLeft() <em>Is Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRightToLeft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RIGHT_TO_LEFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRightToLeft() <em>Is Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRightToLeft()
	 * @generated
	 * @ordered
	 */
	protected boolean isRightToLeft = IS_RIGHT_TO_LEFT_EDEFAULT;

	/**
	 * This is true if the Is Right To Left attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isRightToLeftESet;

	/**
	 * The default value of the '{@link #getSortDirection() <em>Sort Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortDirection()
	 * @generated
	 * @ordered
	 */
	protected static final SortDirectionType SORT_DIRECTION_EDEFAULT = SortDirectionType.DEFAULT;

	/**
	 * The cached value of the '{@link #getSortDirection() <em>Sort Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortDirection()
	 * @generated
	 * @ordered
	 */
	protected SortDirectionType sortDirection = SORT_DIRECTION_EDEFAULT;

	/**
	 * This is true if the Sort Direction attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sortDirectionESet;

	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected String units = UNITS_EDEFAULT;

	/**
	 * This is true if the Units attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitsESet;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WIDTH_EDEFAULT = new BigInteger("-1");

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger width = WIDTH_EDEFAULT;

	/**
	 * This is true if the Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean widthESet;

	/**
	 * The default value of the '{@link #getDefaultDetailsPosition() <em>Default Details Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDetailsPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DEFAULT_DETAILS_POSITION_EDEFAULT = new BigInteger("-1");

	/**
	 * The cached value of the '{@link #getDefaultDetailsPosition() <em>Default Details Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultDetailsPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger defaultDetailsPosition = DEFAULT_DETAILS_POSITION_EDEFAULT;

	/**
	 * This is true if the Default Details Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultDetailsPositionESet;

	/**
	 * The default value of the '{@link #getCommonIdentifierPosition() <em>Common Identifier Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonIdentifierPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COMMON_IDENTIFIER_POSITION_EDEFAULT = new BigInteger("-1");

	/**
	 * The cached value of the '{@link #getCommonIdentifierPosition() <em>Common Identifier Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonIdentifierPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger commonIdentifierPosition = COMMON_IDENTIFIER_POSITION_EDEFAULT;

	/**
	 * This is true if the Common Identifier Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean commonIdentifierPositionESet;

	/**
	 * The default value of the '{@link #getSortPropertiesPosition() <em>Sort Properties Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortPropertiesPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SORT_PROPERTIES_POSITION_EDEFAULT = new BigInteger("-1");

	/**
	 * The cached value of the '{@link #getSortPropertiesPosition() <em>Sort Properties Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortPropertiesPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sortPropertiesPosition = SORT_PROPERTIES_POSITION_EDEFAULT;

	/**
	 * This is true if the Sort Properties Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sortPropertiesPositionESet;

	/**
	 * The default value of the '{@link #getDisplayKeyPosition() <em>Display Key Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayKeyPosition()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DISPLAY_KEY_POSITION_EDEFAULT = new BigInteger("-1");

	/**
	 * The cached value of the '{@link #getDisplayKeyPosition() <em>Display Key Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayKeyPosition()
	 * @generated
	 * @ordered
	 */
	protected BigInteger displayKeyPosition = DISPLAY_KEY_POSITION_EDEFAULT;

	/**
	 * This is true if the Display Key Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayKeyPositionESet;

	/**
	 * The default value of the '{@link #isIsDefaultImage() <em>Is Default Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefaultImage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEFAULT_IMAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDefaultImage() <em>Is Default Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefaultImage()
	 * @generated
	 * @ordered
	 */
	protected boolean isDefaultImage = IS_DEFAULT_IMAGE_EDEFAULT;

	/**
	 * This is true if the Is Default Image attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDefaultImageESet;

	/**
	 * The default value of the '{@link #getDefaultAggregateFunction() <em>Default Aggregate Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAggregateFunction()
	 * @generated
	 * @ordered
	 */
	protected static final DefaultAggregateFunctionType DEFAULT_AGGREGATE_FUNCTION_EDEFAULT = DefaultAggregateFunctionType.DEFAULT;

	/**
	 * The cached value of the '{@link #getDefaultAggregateFunction() <em>Default Aggregate Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAggregateFunction()
	 * @generated
	 * @ordered
	 */
	protected DefaultAggregateFunctionType defaultAggregateFunction = DEFAULT_AGGREGATE_FUNCTION_EDEFAULT;

	/**
	 * This is true if the Default Aggregate Function attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultAggregateFunctionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionAttributeVisualizationPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Engine300Package.Literals.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFolderPosition() {
		return folderPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFolderPosition(BigInteger newFolderPosition) {
		BigInteger oldFolderPosition = folderPosition;
		folderPosition = newFolderPosition;
		boolean oldFolderPositionESet = folderPositionESet;
		folderPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__FOLDER_POSITION, oldFolderPosition, folderPosition, !oldFolderPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFolderPosition() {
		BigInteger oldFolderPosition = folderPosition;
		boolean oldFolderPositionESet = folderPositionESet;
		folderPosition = FOLDER_POSITION_EDEFAULT;
		folderPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__FOLDER_POSITION, oldFolderPosition, FOLDER_POSITION_EDEFAULT, oldFolderPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFolderPosition() {
		return folderPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextualNameRuleType1 getContextualNameRule() {
		return contextualNameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextualNameRule(ContextualNameRuleType1 newContextualNameRule) {
		ContextualNameRuleType1 oldContextualNameRule = contextualNameRule;
		contextualNameRule = newContextualNameRule == null ? CONTEXTUAL_NAME_RULE_EDEFAULT : newContextualNameRule;
		boolean oldContextualNameRuleESet = contextualNameRuleESet;
		contextualNameRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE, oldContextualNameRule, contextualNameRule, !oldContextualNameRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContextualNameRule() {
		ContextualNameRuleType1 oldContextualNameRule = contextualNameRule;
		boolean oldContextualNameRuleESet = contextualNameRuleESet;
		contextualNameRule = CONTEXTUAL_NAME_RULE_EDEFAULT;
		contextualNameRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE, oldContextualNameRule, CONTEXTUAL_NAME_RULE_EDEFAULT, oldContextualNameRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContextualNameRule() {
		return contextualNameRuleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentType getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(AlignmentType newAlignment) {
		AlignmentType oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		boolean oldAlignmentESet = alignmentESet;
		alignmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__ALIGNMENT, oldAlignment, alignment, !oldAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlignment() {
		AlignmentType oldAlignment = alignment;
		boolean oldAlignmentESet = alignmentESet;
		alignment = ALIGNMENT_EDEFAULT;
		alignmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__ALIGNMENT, oldAlignment, ALIGNMENT_EDEFAULT, oldAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlignment() {
		return alignmentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFolderDefault() {
		return isFolderDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFolderDefault(boolean newIsFolderDefault) {
		boolean oldIsFolderDefault = isFolderDefault;
		isFolderDefault = newIsFolderDefault;
		boolean oldIsFolderDefaultESet = isFolderDefaultESet;
		isFolderDefaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT, oldIsFolderDefault, isFolderDefault, !oldIsFolderDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsFolderDefault() {
		boolean oldIsFolderDefault = isFolderDefault;
		boolean oldIsFolderDefaultESet = isFolderDefaultESet;
		isFolderDefault = IS_FOLDER_DEFAULT_EDEFAULT;
		isFolderDefaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT, oldIsFolderDefault, IS_FOLDER_DEFAULT_EDEFAULT, oldIsFolderDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsFolderDefault() {
		return isFolderDefaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRightToLeft() {
		return isRightToLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRightToLeft(boolean newIsRightToLeft) {
		boolean oldIsRightToLeft = isRightToLeft;
		isRightToLeft = newIsRightToLeft;
		boolean oldIsRightToLeftESet = isRightToLeftESet;
		isRightToLeftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT, oldIsRightToLeft, isRightToLeft, !oldIsRightToLeftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsRightToLeft() {
		boolean oldIsRightToLeft = isRightToLeft;
		boolean oldIsRightToLeftESet = isRightToLeftESet;
		isRightToLeft = IS_RIGHT_TO_LEFT_EDEFAULT;
		isRightToLeftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT, oldIsRightToLeft, IS_RIGHT_TO_LEFT_EDEFAULT, oldIsRightToLeftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsRightToLeft() {
		return isRightToLeftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortDirectionType getSortDirection() {
		return sortDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortDirection(SortDirectionType newSortDirection) {
		SortDirectionType oldSortDirection = sortDirection;
		sortDirection = newSortDirection == null ? SORT_DIRECTION_EDEFAULT : newSortDirection;
		boolean oldSortDirectionESet = sortDirectionESet;
		sortDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_DIRECTION, oldSortDirection, sortDirection, !oldSortDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSortDirection() {
		SortDirectionType oldSortDirection = sortDirection;
		boolean oldSortDirectionESet = sortDirectionESet;
		sortDirection = SORT_DIRECTION_EDEFAULT;
		sortDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_DIRECTION, oldSortDirection, SORT_DIRECTION_EDEFAULT, oldSortDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSortDirection() {
		return sortDirectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		boolean oldUnitsESet = unitsESet;
		unitsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__UNITS, oldUnits, units, !oldUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnits() {
		String oldUnits = units;
		boolean oldUnitsESet = unitsESet;
		units = UNITS_EDEFAULT;
		unitsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__UNITS, oldUnits, UNITS_EDEFAULT, oldUnitsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnits() {
		return unitsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(BigInteger newWidth) {
		BigInteger oldWidth = width;
		width = newWidth;
		boolean oldWidthESet = widthESet;
		widthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__WIDTH, oldWidth, width, !oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWidth() {
		BigInteger oldWidth = width;
		boolean oldWidthESet = widthESet;
		width = WIDTH_EDEFAULT;
		widthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__WIDTH, oldWidth, WIDTH_EDEFAULT, oldWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWidth() {
		return widthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDefaultDetailsPosition() {
		return defaultDetailsPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultDetailsPosition(BigInteger newDefaultDetailsPosition) {
		BigInteger oldDefaultDetailsPosition = defaultDetailsPosition;
		defaultDetailsPosition = newDefaultDetailsPosition;
		boolean oldDefaultDetailsPositionESet = defaultDetailsPositionESet;
		defaultDetailsPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION, oldDefaultDetailsPosition, defaultDetailsPosition, !oldDefaultDetailsPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultDetailsPosition() {
		BigInteger oldDefaultDetailsPosition = defaultDetailsPosition;
		boolean oldDefaultDetailsPositionESet = defaultDetailsPositionESet;
		defaultDetailsPosition = DEFAULT_DETAILS_POSITION_EDEFAULT;
		defaultDetailsPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION, oldDefaultDetailsPosition, DEFAULT_DETAILS_POSITION_EDEFAULT, oldDefaultDetailsPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultDetailsPosition() {
		return defaultDetailsPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCommonIdentifierPosition() {
		return commonIdentifierPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommonIdentifierPosition(BigInteger newCommonIdentifierPosition) {
		BigInteger oldCommonIdentifierPosition = commonIdentifierPosition;
		commonIdentifierPosition = newCommonIdentifierPosition;
		boolean oldCommonIdentifierPositionESet = commonIdentifierPositionESet;
		commonIdentifierPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION, oldCommonIdentifierPosition, commonIdentifierPosition, !oldCommonIdentifierPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCommonIdentifierPosition() {
		BigInteger oldCommonIdentifierPosition = commonIdentifierPosition;
		boolean oldCommonIdentifierPositionESet = commonIdentifierPositionESet;
		commonIdentifierPosition = COMMON_IDENTIFIER_POSITION_EDEFAULT;
		commonIdentifierPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION, oldCommonIdentifierPosition, COMMON_IDENTIFIER_POSITION_EDEFAULT, oldCommonIdentifierPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCommonIdentifierPosition() {
		return commonIdentifierPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getSortPropertiesPosition() {
		return sortPropertiesPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortPropertiesPosition(BigInteger newSortPropertiesPosition) {
		BigInteger oldSortPropertiesPosition = sortPropertiesPosition;
		sortPropertiesPosition = newSortPropertiesPosition;
		boolean oldSortPropertiesPositionESet = sortPropertiesPositionESet;
		sortPropertiesPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION, oldSortPropertiesPosition, sortPropertiesPosition, !oldSortPropertiesPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSortPropertiesPosition() {
		BigInteger oldSortPropertiesPosition = sortPropertiesPosition;
		boolean oldSortPropertiesPositionESet = sortPropertiesPositionESet;
		sortPropertiesPosition = SORT_PROPERTIES_POSITION_EDEFAULT;
		sortPropertiesPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION, oldSortPropertiesPosition, SORT_PROPERTIES_POSITION_EDEFAULT, oldSortPropertiesPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSortPropertiesPosition() {
		return sortPropertiesPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDisplayKeyPosition() {
		return displayKeyPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayKeyPosition(BigInteger newDisplayKeyPosition) {
		BigInteger oldDisplayKeyPosition = displayKeyPosition;
		displayKeyPosition = newDisplayKeyPosition;
		boolean oldDisplayKeyPositionESet = displayKeyPositionESet;
		displayKeyPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION, oldDisplayKeyPosition, displayKeyPosition, !oldDisplayKeyPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayKeyPosition() {
		BigInteger oldDisplayKeyPosition = displayKeyPosition;
		boolean oldDisplayKeyPositionESet = displayKeyPositionESet;
		displayKeyPosition = DISPLAY_KEY_POSITION_EDEFAULT;
		displayKeyPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION, oldDisplayKeyPosition, DISPLAY_KEY_POSITION_EDEFAULT, oldDisplayKeyPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayKeyPosition() {
		return displayKeyPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDefaultImage() {
		return isDefaultImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefaultImage(boolean newIsDefaultImage) {
		boolean oldIsDefaultImage = isDefaultImage;
		isDefaultImage = newIsDefaultImage;
		boolean oldIsDefaultImageESet = isDefaultImageESet;
		isDefaultImageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE, oldIsDefaultImage, isDefaultImage, !oldIsDefaultImageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDefaultImage() {
		boolean oldIsDefaultImage = isDefaultImage;
		boolean oldIsDefaultImageESet = isDefaultImageESet;
		isDefaultImage = IS_DEFAULT_IMAGE_EDEFAULT;
		isDefaultImageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE, oldIsDefaultImage, IS_DEFAULT_IMAGE_EDEFAULT, oldIsDefaultImageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDefaultImage() {
		return isDefaultImageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultAggregateFunctionType getDefaultAggregateFunction() {
		return defaultAggregateFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultAggregateFunction(DefaultAggregateFunctionType newDefaultAggregateFunction) {
		DefaultAggregateFunctionType oldDefaultAggregateFunction = defaultAggregateFunction;
		defaultAggregateFunction = newDefaultAggregateFunction == null ? DEFAULT_AGGREGATE_FUNCTION_EDEFAULT : newDefaultAggregateFunction;
		boolean oldDefaultAggregateFunctionESet = defaultAggregateFunctionESet;
		defaultAggregateFunctionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_AGGREGATE_FUNCTION, oldDefaultAggregateFunction, defaultAggregateFunction, !oldDefaultAggregateFunctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultAggregateFunction() {
		DefaultAggregateFunctionType oldDefaultAggregateFunction = defaultAggregateFunction;
		boolean oldDefaultAggregateFunctionESet = defaultAggregateFunctionESet;
		defaultAggregateFunction = DEFAULT_AGGREGATE_FUNCTION_EDEFAULT;
		defaultAggregateFunctionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_AGGREGATE_FUNCTION, oldDefaultAggregateFunction, DEFAULT_AGGREGATE_FUNCTION_EDEFAULT, oldDefaultAggregateFunctionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultAggregateFunction() {
		return defaultAggregateFunctionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				return getFolderPosition();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				return getContextualNameRule();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__ALIGNMENT:
				return getAlignment();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT:
				return isIsFolderDefault();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT:
				return isIsRightToLeft();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_DIRECTION:
				return getSortDirection();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__UNITS:
				return getUnits();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__WIDTH:
				return getWidth();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION:
				return getDefaultDetailsPosition();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION:
				return getCommonIdentifierPosition();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION:
				return getSortPropertiesPosition();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION:
				return getDisplayKeyPosition();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE:
				return isIsDefaultImage();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_AGGREGATE_FUNCTION:
				return getDefaultAggregateFunction();
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
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				setFolderPosition((BigInteger)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				setContextualNameRule((ContextualNameRuleType1)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__ALIGNMENT:
				setAlignment((AlignmentType)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT:
				setIsFolderDefault((Boolean)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT:
				setIsRightToLeft((Boolean)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_DIRECTION:
				setSortDirection((SortDirectionType)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__UNITS:
				setUnits((String)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__WIDTH:
				setWidth((BigInteger)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION:
				setDefaultDetailsPosition((BigInteger)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION:
				setCommonIdentifierPosition((BigInteger)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION:
				setSortPropertiesPosition((BigInteger)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION:
				setDisplayKeyPosition((BigInteger)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE:
				setIsDefaultImage((Boolean)newValue);
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_AGGREGATE_FUNCTION:
				setDefaultAggregateFunction((DefaultAggregateFunctionType)newValue);
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
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				unsetFolderPosition();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				unsetContextualNameRule();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__ALIGNMENT:
				unsetAlignment();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT:
				unsetIsFolderDefault();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT:
				unsetIsRightToLeft();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_DIRECTION:
				unsetSortDirection();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__UNITS:
				unsetUnits();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__WIDTH:
				unsetWidth();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION:
				unsetDefaultDetailsPosition();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION:
				unsetCommonIdentifierPosition();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION:
				unsetSortPropertiesPosition();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION:
				unsetDisplayKeyPosition();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE:
				unsetIsDefaultImage();
				return;
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_AGGREGATE_FUNCTION:
				unsetDefaultAggregateFunction();
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
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				return isSetFolderPosition();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				return isSetContextualNameRule();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__ALIGNMENT:
				return isSetAlignment();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT:
				return isSetIsFolderDefault();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT:
				return isSetIsRightToLeft();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_DIRECTION:
				return isSetSortDirection();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__UNITS:
				return isSetUnits();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__WIDTH:
				return isSetWidth();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION:
				return isSetDefaultDetailsPosition();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION:
				return isSetCommonIdentifierPosition();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION:
				return isSetSortPropertiesPosition();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION:
				return isSetDisplayKeyPosition();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE:
				return isSetIsDefaultImage();
			case Engine300Package.DIMENSION_ATTRIBUTE_VISUALIZATION_PROPERTIES__DEFAULT_AGGREGATE_FUNCTION:
				return isSetDefaultAggregateFunction();
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
		result.append(" (folderPosition: ");
		if (folderPositionESet) result.append(folderPosition); else result.append("<unset>");
		result.append(", contextualNameRule: ");
		if (contextualNameRuleESet) result.append(contextualNameRule); else result.append("<unset>");
		result.append(", alignment: ");
		if (alignmentESet) result.append(alignment); else result.append("<unset>");
		result.append(", isFolderDefault: ");
		if (isFolderDefaultESet) result.append(isFolderDefault); else result.append("<unset>");
		result.append(", isRightToLeft: ");
		if (isRightToLeftESet) result.append(isRightToLeft); else result.append("<unset>");
		result.append(", sortDirection: ");
		if (sortDirectionESet) result.append(sortDirection); else result.append("<unset>");
		result.append(", units: ");
		if (unitsESet) result.append(units); else result.append("<unset>");
		result.append(", width: ");
		if (widthESet) result.append(width); else result.append("<unset>");
		result.append(", defaultDetailsPosition: ");
		if (defaultDetailsPositionESet) result.append(defaultDetailsPosition); else result.append("<unset>");
		result.append(", commonIdentifierPosition: ");
		if (commonIdentifierPositionESet) result.append(commonIdentifierPosition); else result.append("<unset>");
		result.append(", sortPropertiesPosition: ");
		if (sortPropertiesPositionESet) result.append(sortPropertiesPosition); else result.append("<unset>");
		result.append(", displayKeyPosition: ");
		if (displayKeyPositionESet) result.append(displayKeyPosition); else result.append("<unset>");
		result.append(", isDefaultImage: ");
		if (isDefaultImageESet) result.append(isDefaultImage); else result.append("<unset>");
		result.append(", defaultAggregateFunction: ");
		if (defaultAggregateFunctionESet) result.append(defaultAggregateFunction); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DimensionAttributeVisualizationPropertiesImpl
