/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType;
import org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package;
import org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship End Visualization Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.RelationshipEndVisualizationPropertiesImpl#getFolderPosition <em>Folder Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.RelationshipEndVisualizationPropertiesImpl#getContextualNameRule <em>Contextual Name Rule</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.RelationshipEndVisualizationPropertiesImpl#getDefaultDetailsPosition <em>Default Details Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.RelationshipEndVisualizationPropertiesImpl#getDisplayKeyPosition <em>Display Key Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.RelationshipEndVisualizationPropertiesImpl#getCommonIdentifierPosition <em>Common Identifier Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.RelationshipEndVisualizationPropertiesImpl#isIsDefaultMeasure <em>Is Default Measure</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.RelationshipEndVisualizationPropertiesImpl#isIsDefaultImage <em>Is Default Image</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.impl.RelationshipEndVisualizationPropertiesImpl#getSortPropertiesPosition <em>Sort Properties Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipEndVisualizationPropertiesImpl extends MinimalEObjectImpl.Container implements RelationshipEndVisualizationProperties {
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
	protected static final ContextualNameRuleType CONTEXTUAL_NAME_RULE_EDEFAULT = ContextualNameRuleType.NONE;

	/**
	 * The cached value of the '{@link #getContextualNameRule() <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualNameRule()
	 * @generated
	 * @ordered
	 */
	protected ContextualNameRuleType contextualNameRule = CONTEXTUAL_NAME_RULE_EDEFAULT;

	/**
	 * This is true if the Contextual Name Rule attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean contextualNameRuleESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipEndVisualizationPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Engine300Package.Literals.RELATIONSHIP_END_VISUALIZATION_PROPERTIES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__FOLDER_POSITION, oldFolderPosition, folderPosition, !oldFolderPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__FOLDER_POSITION, oldFolderPosition, FOLDER_POSITION_EDEFAULT, oldFolderPositionESet));
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
	public ContextualNameRuleType getContextualNameRule() {
		return contextualNameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextualNameRule(ContextualNameRuleType newContextualNameRule) {
		ContextualNameRuleType oldContextualNameRule = contextualNameRule;
		contextualNameRule = newContextualNameRule == null ? CONTEXTUAL_NAME_RULE_EDEFAULT : newContextualNameRule;
		boolean oldContextualNameRuleESet = contextualNameRuleESet;
		contextualNameRuleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE, oldContextualNameRule, contextualNameRule, !oldContextualNameRuleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetContextualNameRule() {
		ContextualNameRuleType oldContextualNameRule = contextualNameRule;
		boolean oldContextualNameRuleESet = contextualNameRuleESet;
		contextualNameRule = CONTEXTUAL_NAME_RULE_EDEFAULT;
		contextualNameRuleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE, oldContextualNameRule, CONTEXTUAL_NAME_RULE_EDEFAULT, oldContextualNameRuleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION, oldDefaultDetailsPosition, defaultDetailsPosition, !oldDefaultDetailsPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION, oldDefaultDetailsPosition, DEFAULT_DETAILS_POSITION_EDEFAULT, oldDefaultDetailsPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION, oldDisplayKeyPosition, displayKeyPosition, !oldDisplayKeyPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION, oldDisplayKeyPosition, DISPLAY_KEY_POSITION_EDEFAULT, oldDisplayKeyPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION, oldCommonIdentifierPosition, commonIdentifierPosition, !oldCommonIdentifierPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION, oldCommonIdentifierPosition, COMMON_IDENTIFIER_POSITION_EDEFAULT, oldCommonIdentifierPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE, oldIsDefaultMeasure, isDefaultMeasure, !oldIsDefaultMeasureESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE, oldIsDefaultMeasure, IS_DEFAULT_MEASURE_EDEFAULT, oldIsDefaultMeasureESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE, oldIsDefaultImage, isDefaultImage, !oldIsDefaultImageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE, oldIsDefaultImage, IS_DEFAULT_IMAGE_EDEFAULT, oldIsDefaultImageESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION, oldSortPropertiesPosition, sortPropertiesPosition, !oldSortPropertiesPositionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION, oldSortPropertiesPosition, SORT_PROPERTIES_POSITION_EDEFAULT, oldSortPropertiesPositionESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				return getFolderPosition();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				return getContextualNameRule();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION:
				return getDefaultDetailsPosition();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION:
				return getDisplayKeyPosition();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION:
				return getCommonIdentifierPosition();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE:
				return isIsDefaultMeasure();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE:
				return isIsDefaultImage();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION:
				return getSortPropertiesPosition();
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
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				setFolderPosition((BigInteger)newValue);
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				setContextualNameRule((ContextualNameRuleType)newValue);
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION:
				setDefaultDetailsPosition((BigInteger)newValue);
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION:
				setDisplayKeyPosition((BigInteger)newValue);
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION:
				setCommonIdentifierPosition((BigInteger)newValue);
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE:
				setIsDefaultMeasure((Boolean)newValue);
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE:
				setIsDefaultImage((Boolean)newValue);
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION:
				setSortPropertiesPosition((BigInteger)newValue);
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
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				unsetFolderPosition();
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				unsetContextualNameRule();
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION:
				unsetDefaultDetailsPosition();
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION:
				unsetDisplayKeyPosition();
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION:
				unsetCommonIdentifierPosition();
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE:
				unsetIsDefaultMeasure();
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE:
				unsetIsDefaultImage();
				return;
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION:
				unsetSortPropertiesPosition();
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
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__FOLDER_POSITION:
				return isSetFolderPosition();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__CONTEXTUAL_NAME_RULE:
				return isSetContextualNameRule();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DEFAULT_DETAILS_POSITION:
				return isSetDefaultDetailsPosition();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__DISPLAY_KEY_POSITION:
				return isSetDisplayKeyPosition();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__COMMON_IDENTIFIER_POSITION:
				return isSetCommonIdentifierPosition();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_MEASURE:
				return isSetIsDefaultMeasure();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__IS_DEFAULT_IMAGE:
				return isSetIsDefaultImage();
			case Engine300Package.RELATIONSHIP_END_VISUALIZATION_PROPERTIES__SORT_PROPERTIES_POSITION:
				return isSetSortPropertiesPosition();
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
		result.append(", defaultDetailsPosition: ");
		if (defaultDetailsPositionESet) result.append(defaultDetailsPosition); else result.append("<unset>");
		result.append(", displayKeyPosition: ");
		if (displayKeyPositionESet) result.append(displayKeyPosition); else result.append("<unset>");
		result.append(", commonIdentifierPosition: ");
		if (commonIdentifierPositionESet) result.append(commonIdentifierPosition); else result.append("<unset>");
		result.append(", isDefaultMeasure: ");
		if (isDefaultMeasureESet) result.append(isDefaultMeasure); else result.append("<unset>");
		result.append(", isDefaultImage: ");
		if (isDefaultImageESet) result.append(isDefaultImage); else result.append("<unset>");
		result.append(", sortPropertiesPosition: ");
		if (sortPropertiesPositionESet) result.append(sortPropertiesPosition); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RelationshipEndVisualizationPropertiesImpl
