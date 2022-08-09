/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DrillThroughAction;
import org.eclipse.daanse.xmla.model.ecore.xmla.InvocationType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.TargetTypeType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drill Through Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#isCaptionIsMdx <em>Caption Is Mdx</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#isDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DrillThroughActionImpl#getMaximumRows <em>Maximum Rows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DrillThroughActionImpl extends ActionImpl implements DrillThroughAction {
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
	 * The default value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected String caption = CAPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isCaptionIsMdx() <em>Caption Is Mdx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaptionIsMdx()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAPTION_IS_MDX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCaptionIsMdx() <em>Caption Is Mdx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaptionIsMdx()
	 * @generated
	 * @ordered
	 */
	protected boolean captionIsMdx = CAPTION_IS_MDX_EDEFAULT;

	/**
	 * This is true if the Caption Is Mdx attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean captionIsMdxESet;

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
	 * The default value of the '{@link #getTargetType() <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected static final TargetTypeType2 TARGET_TYPE_EDEFAULT = TargetTypeType2.CUBE;

	/**
	 * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected TargetTypeType2 targetType = TARGET_TYPE_EDEFAULT;

	/**
	 * This is true if the Target Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean targetTypeESet;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType4 TYPE_EDEFAULT = TypeType4.URL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType4 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getInvocation() <em>Invocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocation()
	 * @generated
	 * @ordered
	 */
	protected static final InvocationType2 INVOCATION_EDEFAULT = InvocationType2.INTERACTIVE;

	/**
	 * The cached value of the '{@link #getInvocation() <em>Invocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocation()
	 * @generated
	 * @ordered
	 */
	protected InvocationType2 invocation = INVOCATION_EDEFAULT;

	/**
	 * This is true if the Invocation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean invocationESet;

	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

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
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean default_ = DEFAULT_EDEFAULT;

	/**
	 * This is true if the Default attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultESet;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected ColumnsType columns;

	/**
	 * The default value of the '{@link #getMaximumRows() <em>Maximum Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRows()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXIMUM_ROWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumRows() <em>Maximum Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRows()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maximumRows = MAXIMUM_ROWS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DrillThroughActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DRILL_THROUGH_ACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaption(String newCaption) {
		String oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__CAPTION, oldCaption, caption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCaptionIsMdx() {
		return captionIsMdx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptionIsMdx(boolean newCaptionIsMdx) {
		boolean oldCaptionIsMdx = captionIsMdx;
		captionIsMdx = newCaptionIsMdx;
		boolean oldCaptionIsMdxESet = captionIsMdxESet;
		captionIsMdxESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__CAPTION_IS_MDX, oldCaptionIsMdx, captionIsMdx, !oldCaptionIsMdxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCaptionIsMdx() {
		boolean oldCaptionIsMdx = captionIsMdx;
		boolean oldCaptionIsMdxESet = captionIsMdxESet;
		captionIsMdx = CAPTION_IS_MDX_EDEFAULT;
		captionIsMdxESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DRILL_THROUGH_ACTION__CAPTION_IS_MDX, oldCaptionIsMdx, CAPTION_IS_MDX_EDEFAULT, oldCaptionIsMdxESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCaptionIsMdx() {
		return captionIsMdxESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__TRANSLATIONS, oldTranslations, newTranslations);
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
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DRILL_THROUGH_ACTION__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DRILL_THROUGH_ACTION__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetTypeType2 getTargetType() {
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetType(TargetTypeType2 newTargetType) {
		TargetTypeType2 oldTargetType = targetType;
		targetType = newTargetType == null ? TARGET_TYPE_EDEFAULT : newTargetType;
		boolean oldTargetTypeESet = targetTypeESet;
		targetTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__TARGET_TYPE, oldTargetType, targetType, !oldTargetTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTargetType() {
		TargetTypeType2 oldTargetType = targetType;
		boolean oldTargetTypeESet = targetTypeESet;
		targetType = TARGET_TYPE_EDEFAULT;
		targetTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DRILL_THROUGH_ACTION__TARGET_TYPE, oldTargetType, TARGET_TYPE_EDEFAULT, oldTargetTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetType() {
		return targetTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType4 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType4 newType) {
		TypeType4 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType4 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DRILL_THROUGH_ACTION__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public InvocationType2 getInvocation() {
		return invocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvocation(InvocationType2 newInvocation) {
		InvocationType2 oldInvocation = invocation;
		invocation = newInvocation == null ? INVOCATION_EDEFAULT : newInvocation;
		boolean oldInvocationESet = invocationESet;
		invocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__INVOCATION, oldInvocation, invocation, !oldInvocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInvocation() {
		InvocationType2 oldInvocation = invocation;
		boolean oldInvocationESet = invocationESet;
		invocation = INVOCATION_EDEFAULT;
		invocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DRILL_THROUGH_ACTION__INVOCATION, oldInvocation, INVOCATION_EDEFAULT, oldInvocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInvocation() {
		return invocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__APPLICATION, oldApplication, application));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DRILL_THROUGH_ACTION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DRILL_THROUGH_ACTION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		boolean oldDefault = default_;
		default_ = newDefault;
		boolean oldDefaultESet = defaultESet;
		defaultESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__DEFAULT, oldDefault, default_, !oldDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefault() {
		boolean oldDefault = default_;
		boolean oldDefaultESet = defaultESet;
		default_ = DEFAULT_EDEFAULT;
		defaultESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DRILL_THROUGH_ACTION__DEFAULT, oldDefault, DEFAULT_EDEFAULT, oldDefaultESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefault() {
		return defaultESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsType getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumns(ColumnsType newColumns, NotificationChain msgs) {
		ColumnsType oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__COLUMNS, oldColumns, newColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(ColumnsType newColumns) {
		if (newColumns != columns) {
			NotificationChain msgs = null;
			if (columns != null)
				msgs = ((InternalEObject)columns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DRILL_THROUGH_ACTION__COLUMNS, null, msgs);
			if (newColumns != null)
				msgs = ((InternalEObject)newColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DRILL_THROUGH_ACTION__COLUMNS, null, msgs);
			msgs = basicSetColumns(newColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__COLUMNS, newColumns, newColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaximumRows() {
		return maximumRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRows(BigInteger newMaximumRows) {
		BigInteger oldMaximumRows = maximumRows;
		maximumRows = newMaximumRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DRILL_THROUGH_ACTION__MAXIMUM_ROWS, oldMaximumRows, maximumRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DRILL_THROUGH_ACTION__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
			case XmlaPackage.DRILL_THROUGH_ACTION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.DRILL_THROUGH_ACTION__COLUMNS:
				return basicSetColumns(null, msgs);
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
			case XmlaPackage.DRILL_THROUGH_ACTION__NAME:
				return getName();
			case XmlaPackage.DRILL_THROUGH_ACTION__ID:
				return getID();
			case XmlaPackage.DRILL_THROUGH_ACTION__CAPTION:
				return getCaption();
			case XmlaPackage.DRILL_THROUGH_ACTION__CAPTION_IS_MDX:
				return isCaptionIsMdx();
			case XmlaPackage.DRILL_THROUGH_ACTION__TRANSLATIONS:
				return getTranslations();
			case XmlaPackage.DRILL_THROUGH_ACTION__TARGET_TYPE:
				return getTargetType();
			case XmlaPackage.DRILL_THROUGH_ACTION__TARGET:
				return getTarget();
			case XmlaPackage.DRILL_THROUGH_ACTION__CONDITION:
				return getCondition();
			case XmlaPackage.DRILL_THROUGH_ACTION__TYPE:
				return getType();
			case XmlaPackage.DRILL_THROUGH_ACTION__INVOCATION:
				return getInvocation();
			case XmlaPackage.DRILL_THROUGH_ACTION__APPLICATION:
				return getApplication();
			case XmlaPackage.DRILL_THROUGH_ACTION__DESCRIPTION:
				return getDescription();
			case XmlaPackage.DRILL_THROUGH_ACTION__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.DRILL_THROUGH_ACTION__DEFAULT:
				return isDefault();
			case XmlaPackage.DRILL_THROUGH_ACTION__COLUMNS:
				return getColumns();
			case XmlaPackage.DRILL_THROUGH_ACTION__MAXIMUM_ROWS:
				return getMaximumRows();
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
			case XmlaPackage.DRILL_THROUGH_ACTION__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__CAPTION:
				setCaption((String)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__CAPTION_IS_MDX:
				setCaptionIsMdx((Boolean)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__TARGET_TYPE:
				setTargetType((TargetTypeType2)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__TARGET:
				setTarget((String)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__CONDITION:
				setCondition((String)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__TYPE:
				setType((TypeType4)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__INVOCATION:
				setInvocation((InvocationType2)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__APPLICATION:
				setApplication((String)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__DEFAULT:
				setDefault((Boolean)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__COLUMNS:
				setColumns((ColumnsType)newValue);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__MAXIMUM_ROWS:
				setMaximumRows((BigInteger)newValue);
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
			case XmlaPackage.DRILL_THROUGH_ACTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__CAPTION:
				setCaption(CAPTION_EDEFAULT);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__CAPTION_IS_MDX:
				unsetCaptionIsMdx();
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__TRANSLATIONS:
				setTranslations((TranslationsType)null);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__TARGET_TYPE:
				unsetTargetType();
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__TYPE:
				unsetType();
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__INVOCATION:
				unsetInvocation();
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__DEFAULT:
				unsetDefault();
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__COLUMNS:
				setColumns((ColumnsType)null);
				return;
			case XmlaPackage.DRILL_THROUGH_ACTION__MAXIMUM_ROWS:
				setMaximumRows(MAXIMUM_ROWS_EDEFAULT);
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
			case XmlaPackage.DRILL_THROUGH_ACTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.DRILL_THROUGH_ACTION__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.DRILL_THROUGH_ACTION__CAPTION:
				return CAPTION_EDEFAULT == null ? caption != null : !CAPTION_EDEFAULT.equals(caption);
			case XmlaPackage.DRILL_THROUGH_ACTION__CAPTION_IS_MDX:
				return isSetCaptionIsMdx();
			case XmlaPackage.DRILL_THROUGH_ACTION__TRANSLATIONS:
				return translations != null;
			case XmlaPackage.DRILL_THROUGH_ACTION__TARGET_TYPE:
				return isSetTargetType();
			case XmlaPackage.DRILL_THROUGH_ACTION__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case XmlaPackage.DRILL_THROUGH_ACTION__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case XmlaPackage.DRILL_THROUGH_ACTION__TYPE:
				return isSetType();
			case XmlaPackage.DRILL_THROUGH_ACTION__INVOCATION:
				return isSetInvocation();
			case XmlaPackage.DRILL_THROUGH_ACTION__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case XmlaPackage.DRILL_THROUGH_ACTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.DRILL_THROUGH_ACTION__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.DRILL_THROUGH_ACTION__DEFAULT:
				return isSetDefault();
			case XmlaPackage.DRILL_THROUGH_ACTION__COLUMNS:
				return columns != null;
			case XmlaPackage.DRILL_THROUGH_ACTION__MAXIMUM_ROWS:
				return MAXIMUM_ROWS_EDEFAULT == null ? maximumRows != null : !MAXIMUM_ROWS_EDEFAULT.equals(maximumRows);
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
		result.append(", caption: ");
		result.append(caption);
		result.append(", captionIsMdx: ");
		if (captionIsMdxESet) result.append(captionIsMdx); else result.append("<unset>");
		result.append(", targetType: ");
		if (targetTypeESet) result.append(targetType); else result.append("<unset>");
		result.append(", target: ");
		result.append(target);
		result.append(", condition: ");
		result.append(condition);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", invocation: ");
		if (invocationESet) result.append(invocation); else result.append("<unset>");
		result.append(", application: ");
		result.append(application);
		result.append(", description: ");
		result.append(description);
		result.append(", default: ");
		if (defaultESet) result.append(default_); else result.append("<unset>");
		result.append(", maximumRows: ");
		result.append(maximumRows);
		result.append(')');
		return result.toString();
	}

} //DrillThroughActionImpl
