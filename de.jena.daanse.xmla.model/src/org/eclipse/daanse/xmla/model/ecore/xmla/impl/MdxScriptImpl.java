/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CalculationPropertiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CommandsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MdxScript;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mdx Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MdxScriptImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MdxScriptImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MdxScriptImpl#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MdxScriptImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MdxScriptImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MdxScriptImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MdxScriptImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MdxScriptImpl#isDefaultScript <em>Default Script</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.MdxScriptImpl#getCalculationProperties <em>Calculation Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MdxScriptImpl extends MinimalEObjectImpl.Container implements MdxScript {
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
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected CommandsType commands;

	/**
	 * The default value of the '{@link #isDefaultScript() <em>Default Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultScript()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_SCRIPT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDefaultScript() <em>Default Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefaultScript()
	 * @generated
	 * @ordered
	 */
	protected boolean defaultScript = DEFAULT_SCRIPT_EDEFAULT;

	/**
	 * This is true if the Default Script attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultScriptESet;

	/**
	 * The cached value of the '{@link #getCalculationProperties() <em>Calculation Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationProperties()
	 * @generated
	 * @ordered
	 */
	protected CalculationPropertiesType calculationProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MdxScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MDX_SCRIPT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MDX_SCRIPT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MDX_SCRIPT__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MDX_SCRIPT__CREATED_TIMESTAMP, oldCreatedTimestamp, createdTimestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MDX_SCRIPT__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MDX_SCRIPT__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MDX_SCRIPT__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MDX_SCRIPT__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MDX_SCRIPT__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MDX_SCRIPT__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandsType getCommands() {
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommands(CommandsType newCommands, NotificationChain msgs) {
		CommandsType oldCommands = commands;
		commands = newCommands;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MDX_SCRIPT__COMMANDS, oldCommands, newCommands);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommands(CommandsType newCommands) {
		if (newCommands != commands) {
			NotificationChain msgs = null;
			if (commands != null)
				msgs = ((InternalEObject)commands).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MDX_SCRIPT__COMMANDS, null, msgs);
			if (newCommands != null)
				msgs = ((InternalEObject)newCommands).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MDX_SCRIPT__COMMANDS, null, msgs);
			msgs = basicSetCommands(newCommands, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MDX_SCRIPT__COMMANDS, newCommands, newCommands));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefaultScript() {
		return defaultScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultScript(boolean newDefaultScript) {
		boolean oldDefaultScript = defaultScript;
		defaultScript = newDefaultScript;
		boolean oldDefaultScriptESet = defaultScriptESet;
		defaultScriptESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MDX_SCRIPT__DEFAULT_SCRIPT, oldDefaultScript, defaultScript, !oldDefaultScriptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultScript() {
		boolean oldDefaultScript = defaultScript;
		boolean oldDefaultScriptESet = defaultScriptESet;
		defaultScript = DEFAULT_SCRIPT_EDEFAULT;
		defaultScriptESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.MDX_SCRIPT__DEFAULT_SCRIPT, oldDefaultScript, DEFAULT_SCRIPT_EDEFAULT, oldDefaultScriptESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultScript() {
		return defaultScriptESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationPropertiesType getCalculationProperties() {
		return calculationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculationProperties(CalculationPropertiesType newCalculationProperties, NotificationChain msgs) {
		CalculationPropertiesType oldCalculationProperties = calculationProperties;
		calculationProperties = newCalculationProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MDX_SCRIPT__CALCULATION_PROPERTIES, oldCalculationProperties, newCalculationProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationProperties(CalculationPropertiesType newCalculationProperties) {
		if (newCalculationProperties != calculationProperties) {
			NotificationChain msgs = null;
			if (calculationProperties != null)
				msgs = ((InternalEObject)calculationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MDX_SCRIPT__CALCULATION_PROPERTIES, null, msgs);
			if (newCalculationProperties != null)
				msgs = ((InternalEObject)newCalculationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MDX_SCRIPT__CALCULATION_PROPERTIES, null, msgs);
			msgs = basicSetCalculationProperties(newCalculationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MDX_SCRIPT__CALCULATION_PROPERTIES, newCalculationProperties, newCalculationProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.MDX_SCRIPT__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.MDX_SCRIPT__COMMANDS:
				return basicSetCommands(null, msgs);
			case XmlaPackage.MDX_SCRIPT__CALCULATION_PROPERTIES:
				return basicSetCalculationProperties(null, msgs);
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
			case XmlaPackage.MDX_SCRIPT__NAME:
				return getName();
			case XmlaPackage.MDX_SCRIPT__ID:
				return getID();
			case XmlaPackage.MDX_SCRIPT__CREATED_TIMESTAMP:
				return getCreatedTimestamp();
			case XmlaPackage.MDX_SCRIPT__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
			case XmlaPackage.MDX_SCRIPT__DESCRIPTION:
				return getDescription();
			case XmlaPackage.MDX_SCRIPT__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.MDX_SCRIPT__COMMANDS:
				return getCommands();
			case XmlaPackage.MDX_SCRIPT__DEFAULT_SCRIPT:
				return isDefaultScript();
			case XmlaPackage.MDX_SCRIPT__CALCULATION_PROPERTIES:
				return getCalculationProperties();
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
			case XmlaPackage.MDX_SCRIPT__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.MDX_SCRIPT__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.MDX_SCRIPT__CREATED_TIMESTAMP:
				setCreatedTimestamp((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.MDX_SCRIPT__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.MDX_SCRIPT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.MDX_SCRIPT__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case XmlaPackage.MDX_SCRIPT__COMMANDS:
				setCommands((CommandsType)newValue);
				return;
			case XmlaPackage.MDX_SCRIPT__DEFAULT_SCRIPT:
				setDefaultScript((Boolean)newValue);
				return;
			case XmlaPackage.MDX_SCRIPT__CALCULATION_PROPERTIES:
				setCalculationProperties((CalculationPropertiesType)newValue);
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
			case XmlaPackage.MDX_SCRIPT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.MDX_SCRIPT__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.MDX_SCRIPT__CREATED_TIMESTAMP:
				setCreatedTimestamp(CREATED_TIMESTAMP_EDEFAULT);
				return;
			case XmlaPackage.MDX_SCRIPT__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.MDX_SCRIPT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.MDX_SCRIPT__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case XmlaPackage.MDX_SCRIPT__COMMANDS:
				setCommands((CommandsType)null);
				return;
			case XmlaPackage.MDX_SCRIPT__DEFAULT_SCRIPT:
				unsetDefaultScript();
				return;
			case XmlaPackage.MDX_SCRIPT__CALCULATION_PROPERTIES:
				setCalculationProperties((CalculationPropertiesType)null);
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
			case XmlaPackage.MDX_SCRIPT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.MDX_SCRIPT__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.MDX_SCRIPT__CREATED_TIMESTAMP:
				return CREATED_TIMESTAMP_EDEFAULT == null ? createdTimestamp != null : !CREATED_TIMESTAMP_EDEFAULT.equals(createdTimestamp);
			case XmlaPackage.MDX_SCRIPT__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
			case XmlaPackage.MDX_SCRIPT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.MDX_SCRIPT__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.MDX_SCRIPT__COMMANDS:
				return commands != null;
			case XmlaPackage.MDX_SCRIPT__DEFAULT_SCRIPT:
				return isSetDefaultScript();
			case XmlaPackage.MDX_SCRIPT__CALCULATION_PROPERTIES:
				return calculationProperties != null;
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
		result.append(", defaultScript: ");
		if (defaultScriptESet) result.append(defaultScript); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MdxScriptImpl
