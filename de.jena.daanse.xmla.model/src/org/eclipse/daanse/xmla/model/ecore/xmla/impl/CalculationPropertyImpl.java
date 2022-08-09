/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties;

import org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty;
import org.eclipse.daanse.xmla.model.ecore.xmla.CalculationTypeType;
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
 * An implementation of the model object '<em><b>Calculation Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getCalculationReference <em>Calculation Reference</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getCalculationType <em>Calculation Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getSolveOrder <em>Solve Order</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getFormatString <em>Format String</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getForeColor <em>Fore Color</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getBackColor <em>Back Color</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getFontFlags <em>Font Flags</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getNonEmptyBehavior <em>Non Empty Behavior</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getAssociatedMeasureGroupID <em>Associated Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getDisplayFolder <em>Display Folder</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CalculationPropertyImpl#getVisualizationProperties <em>Visualization Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculationPropertyImpl extends MinimalEObjectImpl.Container implements CalculationProperty {
	/**
	 * The default value of the '{@link #getCalculationReference() <em>Calculation Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CALCULATION_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalculationReference() <em>Calculation Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationReference()
	 * @generated
	 * @ordered
	 */
	protected String calculationReference = CALCULATION_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalculationType() <em>Calculation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationType()
	 * @generated
	 * @ordered
	 */
	protected static final CalculationTypeType CALCULATION_TYPE_EDEFAULT = CalculationTypeType.MEMBER;

	/**
	 * The cached value of the '{@link #getCalculationType() <em>Calculation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationType()
	 * @generated
	 * @ordered
	 */
	protected CalculationTypeType calculationType = CALCULATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Calculation Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean calculationTypeESet;

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
	 * The default value of the '{@link #getSolveOrder() <em>Solve Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolveOrder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SOLVE_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolveOrder() <em>Solve Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolveOrder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger solveOrder = SOLVE_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatString()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatString()
	 * @generated
	 * @ordered
	 */
	protected String formatString = FORMAT_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getForeColor() <em>Fore Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeColor()
	 * @generated
	 * @ordered
	 */
	protected static final String FORE_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeColor() <em>Fore Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeColor()
	 * @generated
	 * @ordered
	 */
	protected String foreColor = FORE_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackColor() <em>Back Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACK_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackColor() <em>Back Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackColor()
	 * @generated
	 * @ordered
	 */
	protected String backColor = BACK_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontName() <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontName()
	 * @generated
	 * @ordered
	 */
	protected String fontName = FONT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected String fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontFlags() <em>Font Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFontFlags() <em>Font Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFlags()
	 * @generated
	 * @ordered
	 */
	protected String fontFlags = FONT_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonEmptyBehavior() <em>Non Empty Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonEmptyBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String NON_EMPTY_BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonEmptyBehavior() <em>Non Empty Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonEmptyBehavior()
	 * @generated
	 * @ordered
	 */
	protected String nonEmptyBehavior = NON_EMPTY_BEHAVIOR_EDEFAULT;

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
	 * The cached value of the '{@link #getVisualizationProperties() <em>Visualization Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizationProperties()
	 * @generated
	 * @ordered
	 */
	protected CalculationPropertiesVisualizationProperties visualizationProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculationPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CALCULATION_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalculationReference() {
		return calculationReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationReference(String newCalculationReference) {
		String oldCalculationReference = calculationReference;
		calculationReference = newCalculationReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__CALCULATION_REFERENCE, oldCalculationReference, calculationReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationTypeType getCalculationType() {
		return calculationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationType(CalculationTypeType newCalculationType) {
		CalculationTypeType oldCalculationType = calculationType;
		calculationType = newCalculationType == null ? CALCULATION_TYPE_EDEFAULT : newCalculationType;
		boolean oldCalculationTypeESet = calculationTypeESet;
		calculationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__CALCULATION_TYPE, oldCalculationType, calculationType, !oldCalculationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCalculationType() {
		CalculationTypeType oldCalculationType = calculationType;
		boolean oldCalculationTypeESet = calculationTypeESet;
		calculationType = CALCULATION_TYPE_EDEFAULT;
		calculationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CALCULATION_PROPERTY__CALCULATION_TYPE, oldCalculationType, CALCULATION_TYPE_EDEFAULT, oldCalculationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCalculationType() {
		return calculationTypeESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__TRANSLATIONS, oldTranslations, newTranslations);
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
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CALCULATION_PROPERTY__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CALCULATION_PROPERTY__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__TRANSLATIONS, newTranslations, newTranslations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__VISIBLE, oldVisible, visible, !oldVisibleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CALCULATION_PROPERTY__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
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
	public BigInteger getSolveOrder() {
		return solveOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolveOrder(BigInteger newSolveOrder) {
		BigInteger oldSolveOrder = solveOrder;
		solveOrder = newSolveOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__SOLVE_ORDER, oldSolveOrder, solveOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatString() {
		return formatString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatString(String newFormatString) {
		String oldFormatString = formatString;
		formatString = newFormatString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__FORMAT_STRING, oldFormatString, formatString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeColor() {
		return foreColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeColor(String newForeColor) {
		String oldForeColor = foreColor;
		foreColor = newForeColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__FORE_COLOR, oldForeColor, foreColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackColor() {
		return backColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackColor(String newBackColor) {
		String oldBackColor = backColor;
		backColor = newBackColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__BACK_COLOR, oldBackColor, backColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontName() {
		return fontName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontName(String newFontName) {
		String oldFontName = fontName;
		fontName = newFontName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__FONT_NAME, oldFontName, fontName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(String newFontSize) {
		String oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFontFlags() {
		return fontFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontFlags(String newFontFlags) {
		String oldFontFlags = fontFlags;
		fontFlags = newFontFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__FONT_FLAGS, oldFontFlags, fontFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNonEmptyBehavior() {
		return nonEmptyBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonEmptyBehavior(String newNonEmptyBehavior) {
		String oldNonEmptyBehavior = nonEmptyBehavior;
		nonEmptyBehavior = newNonEmptyBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__NON_EMPTY_BEHAVIOR, oldNonEmptyBehavior, nonEmptyBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__ASSOCIATED_MEASURE_GROUP_ID, oldAssociatedMeasureGroupID, associatedMeasureGroupID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__DISPLAY_FOLDER, oldDisplayFolder, displayFolder));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationPropertiesVisualizationProperties getVisualizationProperties() {
		return visualizationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisualizationProperties(CalculationPropertiesVisualizationProperties newVisualizationProperties, NotificationChain msgs) {
		CalculationPropertiesVisualizationProperties oldVisualizationProperties = visualizationProperties;
		visualizationProperties = newVisualizationProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__VISUALIZATION_PROPERTIES, oldVisualizationProperties, newVisualizationProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualizationProperties(CalculationPropertiesVisualizationProperties newVisualizationProperties) {
		if (newVisualizationProperties != visualizationProperties) {
			NotificationChain msgs = null;
			if (visualizationProperties != null)
				msgs = ((InternalEObject)visualizationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CALCULATION_PROPERTY__VISUALIZATION_PROPERTIES, null, msgs);
			if (newVisualizationProperties != null)
				msgs = ((InternalEObject)newVisualizationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CALCULATION_PROPERTY__VISUALIZATION_PROPERTIES, null, msgs);
			msgs = basicSetVisualizationProperties(newVisualizationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CALCULATION_PROPERTY__VISUALIZATION_PROPERTIES, newVisualizationProperties, newVisualizationProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.CALCULATION_PROPERTY__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.CALCULATION_PROPERTY__VISUALIZATION_PROPERTIES:
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
			case XmlaPackage.CALCULATION_PROPERTY__CALCULATION_REFERENCE:
				return getCalculationReference();
			case XmlaPackage.CALCULATION_PROPERTY__CALCULATION_TYPE:
				return getCalculationType();
			case XmlaPackage.CALCULATION_PROPERTY__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.CALCULATION_PROPERTY__DESCRIPTION:
				return getDescription();
			case XmlaPackage.CALCULATION_PROPERTY__VISIBLE:
				return isVisible();
			case XmlaPackage.CALCULATION_PROPERTY__SOLVE_ORDER:
				return getSolveOrder();
			case XmlaPackage.CALCULATION_PROPERTY__FORMAT_STRING:
				return getFormatString();
			case XmlaPackage.CALCULATION_PROPERTY__FORE_COLOR:
				return getForeColor();
			case XmlaPackage.CALCULATION_PROPERTY__BACK_COLOR:
				return getBackColor();
			case XmlaPackage.CALCULATION_PROPERTY__FONT_NAME:
				return getFontName();
			case XmlaPackage.CALCULATION_PROPERTY__FONT_SIZE:
				return getFontSize();
			case XmlaPackage.CALCULATION_PROPERTY__FONT_FLAGS:
				return getFontFlags();
			case XmlaPackage.CALCULATION_PROPERTY__NON_EMPTY_BEHAVIOR:
				return getNonEmptyBehavior();
			case XmlaPackage.CALCULATION_PROPERTY__ASSOCIATED_MEASURE_GROUP_ID:
				return getAssociatedMeasureGroupID();
			case XmlaPackage.CALCULATION_PROPERTY__DISPLAY_FOLDER:
				return getDisplayFolder();
			case XmlaPackage.CALCULATION_PROPERTY__LANGUAGE:
				return getLanguage();
			case XmlaPackage.CALCULATION_PROPERTY__VISUALIZATION_PROPERTIES:
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
			case XmlaPackage.CALCULATION_PROPERTY__CALCULATION_REFERENCE:
				setCalculationReference((String)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__CALCULATION_TYPE:
				setCalculationType((CalculationTypeType)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__SOLVE_ORDER:
				setSolveOrder((BigInteger)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__FORMAT_STRING:
				setFormatString((String)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__FORE_COLOR:
				setForeColor((String)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__BACK_COLOR:
				setBackColor((String)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__FONT_NAME:
				setFontName((String)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__FONT_SIZE:
				setFontSize((String)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__FONT_FLAGS:
				setFontFlags((String)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__NON_EMPTY_BEHAVIOR:
				setNonEmptyBehavior((String)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__ASSOCIATED_MEASURE_GROUP_ID:
				setAssociatedMeasureGroupID((String)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__DISPLAY_FOLDER:
				setDisplayFolder((String)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__LANGUAGE:
				setLanguage((BigInteger)newValue);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__VISUALIZATION_PROPERTIES:
				setVisualizationProperties((CalculationPropertiesVisualizationProperties)newValue);
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
			case XmlaPackage.CALCULATION_PROPERTY__CALCULATION_REFERENCE:
				setCalculationReference(CALCULATION_REFERENCE_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__CALCULATION_TYPE:
				unsetCalculationType();
				return;
			case XmlaPackage.CALCULATION_PROPERTY__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__VISIBLE:
				unsetVisible();
				return;
			case XmlaPackage.CALCULATION_PROPERTY__SOLVE_ORDER:
				setSolveOrder(SOLVE_ORDER_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__FORMAT_STRING:
				setFormatString(FORMAT_STRING_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__FORE_COLOR:
				setForeColor(FORE_COLOR_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__BACK_COLOR:
				setBackColor(BACK_COLOR_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__FONT_NAME:
				setFontName(FONT_NAME_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__FONT_FLAGS:
				setFontFlags(FONT_FLAGS_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__NON_EMPTY_BEHAVIOR:
				setNonEmptyBehavior(NON_EMPTY_BEHAVIOR_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__ASSOCIATED_MEASURE_GROUP_ID:
				setAssociatedMeasureGroupID(ASSOCIATED_MEASURE_GROUP_ID_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__DISPLAY_FOLDER:
				setDisplayFolder(DISPLAY_FOLDER_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case XmlaPackage.CALCULATION_PROPERTY__VISUALIZATION_PROPERTIES:
				setVisualizationProperties((CalculationPropertiesVisualizationProperties)null);
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
			case XmlaPackage.CALCULATION_PROPERTY__CALCULATION_REFERENCE:
				return CALCULATION_REFERENCE_EDEFAULT == null ? calculationReference != null : !CALCULATION_REFERENCE_EDEFAULT.equals(calculationReference);
			case XmlaPackage.CALCULATION_PROPERTY__CALCULATION_TYPE:
				return isSetCalculationType();
			case XmlaPackage.CALCULATION_PROPERTY__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.CALCULATION_PROPERTY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.CALCULATION_PROPERTY__VISIBLE:
				return isSetVisible();
			case XmlaPackage.CALCULATION_PROPERTY__SOLVE_ORDER:
				return SOLVE_ORDER_EDEFAULT == null ? solveOrder != null : !SOLVE_ORDER_EDEFAULT.equals(solveOrder);
			case XmlaPackage.CALCULATION_PROPERTY__FORMAT_STRING:
				return FORMAT_STRING_EDEFAULT == null ? formatString != null : !FORMAT_STRING_EDEFAULT.equals(formatString);
			case XmlaPackage.CALCULATION_PROPERTY__FORE_COLOR:
				return FORE_COLOR_EDEFAULT == null ? foreColor != null : !FORE_COLOR_EDEFAULT.equals(foreColor);
			case XmlaPackage.CALCULATION_PROPERTY__BACK_COLOR:
				return BACK_COLOR_EDEFAULT == null ? backColor != null : !BACK_COLOR_EDEFAULT.equals(backColor);
			case XmlaPackage.CALCULATION_PROPERTY__FONT_NAME:
				return FONT_NAME_EDEFAULT == null ? fontName != null : !FONT_NAME_EDEFAULT.equals(fontName);
			case XmlaPackage.CALCULATION_PROPERTY__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
			case XmlaPackage.CALCULATION_PROPERTY__FONT_FLAGS:
				return FONT_FLAGS_EDEFAULT == null ? fontFlags != null : !FONT_FLAGS_EDEFAULT.equals(fontFlags);
			case XmlaPackage.CALCULATION_PROPERTY__NON_EMPTY_BEHAVIOR:
				return NON_EMPTY_BEHAVIOR_EDEFAULT == null ? nonEmptyBehavior != null : !NON_EMPTY_BEHAVIOR_EDEFAULT.equals(nonEmptyBehavior);
			case XmlaPackage.CALCULATION_PROPERTY__ASSOCIATED_MEASURE_GROUP_ID:
				return ASSOCIATED_MEASURE_GROUP_ID_EDEFAULT == null ? associatedMeasureGroupID != null : !ASSOCIATED_MEASURE_GROUP_ID_EDEFAULT.equals(associatedMeasureGroupID);
			case XmlaPackage.CALCULATION_PROPERTY__DISPLAY_FOLDER:
				return DISPLAY_FOLDER_EDEFAULT == null ? displayFolder != null : !DISPLAY_FOLDER_EDEFAULT.equals(displayFolder);
			case XmlaPackage.CALCULATION_PROPERTY__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case XmlaPackage.CALCULATION_PROPERTY__VISUALIZATION_PROPERTIES:
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
		result.append(" (calculationReference: ");
		result.append(calculationReference);
		result.append(", calculationType: ");
		if (calculationTypeESet) result.append(calculationType); else result.append("<unset>");
		result.append(", description: ");
		result.append(description);
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(", solveOrder: ");
		result.append(solveOrder);
		result.append(", formatString: ");
		result.append(formatString);
		result.append(", foreColor: ");
		result.append(foreColor);
		result.append(", backColor: ");
		result.append(backColor);
		result.append(", fontName: ");
		result.append(fontName);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", fontFlags: ");
		result.append(fontFlags);
		result.append(", nonEmptyBehavior: ");
		result.append(nonEmptyBehavior);
		result.append(", associatedMeasureGroupID: ");
		result.append(associatedMeasureGroupID);
		result.append(", displayFolder: ");
		result.append(displayFolder);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //CalculationPropertyImpl
