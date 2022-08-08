/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1;
import org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties;
import org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3;
import org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package;
import org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculation Properties Visualization Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl#getFolderPosition <em>Folder Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl#getContextualNameRule <em>Contextual Name Rule</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl#isIsFolderDefault <em>Is Folder Default</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl#isIsRightToLeft <em>Is Right To Left</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl#getSortDirection <em>Sort Direction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl#isIsDefaultMeasure <em>Is Default Measure</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl#getDefaultDetailsPosition <em>Default Details Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl#getSortPropertiesPosition <em>Sort Properties Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.CalculationPropertiesVisualizationPropertiesImpl#isIsSimpleMeasure <em>Is Simple Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculationPropertiesVisualizationPropertiesImpl extends MinimalEObjectImpl.Container implements CalculationPropertiesVisualizationProperties {
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
	protected static final ContextualNameRuleType3 CONTEXTUAL_NAME_RULE_EDEFAULT = ContextualNameRuleType3.NONE;

	/**
	 * The cached value of the '{@link #getContextualNameRule() <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualNameRule()
	 * @generated
	 * @ordered
	 */
	protected ContextualNameRuleType3 contextualNameRule = CONTEXTUAL_NAME_RULE_EDEFAULT;

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
	protected static final AlignmentType1 ALIGNMENT_EDEFAULT = AlignmentType1.DEFAULT;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected AlignmentType1 alignment = ALIGNMENT_EDEFAULT;

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
	protected static final SortDirectionType1 SORT_DIRECTION_EDEFAULT = SortDirectionType1.DEFAULT;

	/**
	 * The cached value of the '{@link #getSortDirection() <em>Sort Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortDirection()
	 * @generated
	 * @ordered
	 */
	protected SortDirectionType1 sortDirection = SORT_DIRECTION_EDEFAULT;

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
	 * The default value of the '{@link #isIsDefaultMeasure() <em>Is Default Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefaultMeasure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEFAULT_MEASURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDefaultMeasure() <em>Is Default Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefaultMeasure()
	 * @generated
	 * @ordered
	 */
	protected boolean isDefaultMeasure = IS_DEFAULT_MEASURE_EDEFAULT;

	/**
	 * This is true if the Is Default Measure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isDefaultMeasureESet;

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
	 * The default value of the '{@link #isIsSimpleMeasure() <em>Is Simple Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimpleMeasure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SIMPLE_MEASURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSimpleMeasure() <em>Is Simple Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimpleMeasure()
	 * @generated
	 * @ordered
	 */
	protected boolean isSimpleMeasure = IS_SIMPLE_MEASURE_EDEFAULT;

	/**
	 * This is true if the Is Simple Measure attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSimpleMeasureESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculationPropertiesVisualizationPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Engine300Package.Literals.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__FOLDER_POSITION, oldFolderPosition, folderPosition, !oldFolderPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__FOLDER_POSITION, oldFolderPosition, FOLDER_POSITION_EDEFAULT, oldFolderPositionESet));
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
	public ContextualNameRuleType3 getContextualNameRule() {
		return contextualNameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextualNameRule(ContextualNameRuleType3 newContextualNameRule) {
		ContextualNameRuleType3 oldContextualNameRule = contextualNameRule;
		contextualNameRule = newContextualNameRule == null ? CONTEXTUAL_NAME_RULE_EDEFAULT : newContextualNameRule;
		boolean oldContextualNameRuleESet = contextualNameRuleESet;
		contextualNameRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE, oldContextualNameRule, contextualNameRule, !oldContextualNameRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContextualNameRule() {
		ContextualNameRuleType3 oldContextualNameRule = contextualNameRule;
		boolean oldContextualNameRuleESet = contextualNameRuleESet;
		contextualNameRule = CONTEXTUAL_NAME_RULE_EDEFAULT;
		contextualNameRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE, oldContextualNameRule, CONTEXTUAL_NAME_RULE_EDEFAULT, oldContextualNameRuleESet));
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
	public AlignmentType1 getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(AlignmentType1 newAlignment) {
		AlignmentType1 oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		boolean oldAlignmentESet = alignmentESet;
		alignmentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__ALIGNMENT, oldAlignment, alignment, !oldAlignmentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlignment() {
		AlignmentType1 oldAlignment = alignment;
		boolean oldAlignmentESet = alignmentESet;
		alignment = ALIGNMENT_EDEFAULT;
		alignmentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__ALIGNMENT, oldAlignment, ALIGNMENT_EDEFAULT, oldAlignmentESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT, oldIsFolderDefault, isFolderDefault, !oldIsFolderDefaultESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT, oldIsFolderDefault, IS_FOLDER_DEFAULT_EDEFAULT, oldIsFolderDefaultESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT, oldIsRightToLeft, isRightToLeft, !oldIsRightToLeftESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT, oldIsRightToLeft, IS_RIGHT_TO_LEFT_EDEFAULT, oldIsRightToLeftESet));
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
	public SortDirectionType1 getSortDirection() {
		return sortDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortDirection(SortDirectionType1 newSortDirection) {
		SortDirectionType1 oldSortDirection = sortDirection;
		sortDirection = newSortDirection == null ? SORT_DIRECTION_EDEFAULT : newSortDirection;
		boolean oldSortDirectionESet = sortDirectionESet;
		sortDirectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_DIRECTION, oldSortDirection, sortDirection, !oldSortDirectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSortDirection() {
		SortDirectionType1 oldSortDirection = sortDirection;
		boolean oldSortDirectionESet = sortDirectionESet;
		sortDirection = SORT_DIRECTION_EDEFAULT;
		sortDirectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_DIRECTION, oldSortDirection, SORT_DIRECTION_EDEFAULT, oldSortDirectionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__UNITS, oldUnits, units, !oldUnitsESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__UNITS, oldUnits, UNITS_EDEFAULT, oldUnitsESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__WIDTH, oldWidth, width, !oldWidthESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__WIDTH, oldWidth, WIDTH_EDEFAULT, oldWidthESet));
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
	public boolean isIsDefaultMeasure() {
		return isDefaultMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefaultMeasure(boolean newIsDefaultMeasure) {
		boolean oldIsDefaultMeasure = isDefaultMeasure;
		isDefaultMeasure = newIsDefaultMeasure;
		boolean oldIsDefaultMeasureESet = isDefaultMeasureESet;
		isDefaultMeasureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE, oldIsDefaultMeasure, isDefaultMeasure, !oldIsDefaultMeasureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsDefaultMeasure() {
		boolean oldIsDefaultMeasure = isDefaultMeasure;
		boolean oldIsDefaultMeasureESet = isDefaultMeasureESet;
		isDefaultMeasure = IS_DEFAULT_MEASURE_EDEFAULT;
		isDefaultMeasureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE, oldIsDefaultMeasure, IS_DEFAULT_MEASURE_EDEFAULT, oldIsDefaultMeasureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsDefaultMeasure() {
		return isDefaultMeasureESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION, oldDefaultDetailsPosition, defaultDetailsPosition, !oldDefaultDetailsPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION, oldDefaultDetailsPosition, DEFAULT_DETAILS_POSITION_EDEFAULT, oldDefaultDetailsPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION, oldSortPropertiesPosition, sortPropertiesPosition, !oldSortPropertiesPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION, oldSortPropertiesPosition, SORT_PROPERTIES_POSITION_EDEFAULT, oldSortPropertiesPositionESet));
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
	public boolean isIsSimpleMeasure() {
		return isSimpleMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSimpleMeasure(boolean newIsSimpleMeasure) {
		boolean oldIsSimpleMeasure = isSimpleMeasure;
		isSimpleMeasure = newIsSimpleMeasure;
		boolean oldIsSimpleMeasureESet = isSimpleMeasureESet;
		isSimpleMeasureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_SIMPLE_MEASURE, oldIsSimpleMeasure, isSimpleMeasure, !oldIsSimpleMeasureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSimpleMeasure() {
		boolean oldIsSimpleMeasure = isSimpleMeasure;
		boolean oldIsSimpleMeasureESet = isSimpleMeasureESet;
		isSimpleMeasure = IS_SIMPLE_MEASURE_EDEFAULT;
		isSimpleMeasureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_SIMPLE_MEASURE, oldIsSimpleMeasure, IS_SIMPLE_MEASURE_EDEFAULT, oldIsSimpleMeasureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSimpleMeasure() {
		return isSimpleMeasureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				return getFolderPosition();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				return getContextualNameRule();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__ALIGNMENT:
				return getAlignment();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT:
				return isIsFolderDefault();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT:
				return isIsRightToLeft();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_DIRECTION:
				return getSortDirection();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__UNITS:
				return getUnits();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__WIDTH:
				return getWidth();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE:
				return isIsDefaultMeasure();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION:
				return getDefaultDetailsPosition();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION:
				return getSortPropertiesPosition();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_SIMPLE_MEASURE:
				return isIsSimpleMeasure();
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
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				setFolderPosition((BigInteger)newValue);
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				setContextualNameRule((ContextualNameRuleType3)newValue);
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__ALIGNMENT:
				setAlignment((AlignmentType1)newValue);
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT:
				setIsFolderDefault((Boolean)newValue);
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT:
				setIsRightToLeft((Boolean)newValue);
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_DIRECTION:
				setSortDirection((SortDirectionType1)newValue);
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__UNITS:
				setUnits((String)newValue);
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__WIDTH:
				setWidth((BigInteger)newValue);
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE:
				setIsDefaultMeasure((Boolean)newValue);
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION:
				setDefaultDetailsPosition((BigInteger)newValue);
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION:
				setSortPropertiesPosition((BigInteger)newValue);
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_SIMPLE_MEASURE:
				setIsSimpleMeasure((Boolean)newValue);
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
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				unsetFolderPosition();
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				unsetContextualNameRule();
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__ALIGNMENT:
				unsetAlignment();
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT:
				unsetIsFolderDefault();
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT:
				unsetIsRightToLeft();
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_DIRECTION:
				unsetSortDirection();
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__UNITS:
				unsetUnits();
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__WIDTH:
				unsetWidth();
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE:
				unsetIsDefaultMeasure();
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION:
				unsetDefaultDetailsPosition();
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION:
				unsetSortPropertiesPosition();
				return;
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_SIMPLE_MEASURE:
				unsetIsSimpleMeasure();
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
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				return isSetFolderPosition();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				return isSetContextualNameRule();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__ALIGNMENT:
				return isSetAlignment();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_FOLDER_DEFAULT:
				return isSetIsFolderDefault();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_RIGHT_TO_LEFT:
				return isSetIsRightToLeft();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_DIRECTION:
				return isSetSortDirection();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__UNITS:
				return isSetUnits();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__WIDTH:
				return isSetWidth();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE:
				return isSetIsDefaultMeasure();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION:
				return isSetDefaultDetailsPosition();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION:
				return isSetSortPropertiesPosition();
			case Engine300Package.CALCULATION_PROPERTIES_VISUALIZATION_PROPERTIES__IS_SIMPLE_MEASURE:
				return isSetIsSimpleMeasure();
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
		result.append(", isDefaultMeasure: ");
		if (isDefaultMeasureESet) result.append(isDefaultMeasure); else result.append("<unset>");
		result.append(", defaultDetailsPosition: ");
		if (defaultDetailsPositionESet) result.append(defaultDetailsPosition); else result.append("<unset>");
		result.append(", sortPropertiesPosition: ");
		if (sortPropertiesPositionESet) result.append(sortPropertiesPosition); else result.append("<unset>");
		result.append(", isSimpleMeasure: ");
		if (isSimpleMeasureESet) result.append(isSimpleMeasure); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CalculationPropertiesVisualizationPropertiesImpl
