/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.lang.Object;

import org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerPropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerPropertyImpl#isRequiresRestart <em>Requires Restart</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerPropertyImpl#getPendingValue <em>Pending Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerPropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerPropertyImpl#isDisplayFlag <em>Display Flag</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerPropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerPropertyImpl extends MinimalEObjectImpl.Container implements ServerProperty {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequiresRestart() <em>Requires Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresRestart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRES_RESTART_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequiresRestart() <em>Requires Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequiresRestart()
	 * @generated
	 * @ordered
	 */
	protected boolean requiresRestart = REQUIRES_RESTART_EDEFAULT;

	/**
	 * This is true if the Requires Restart attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requiresRestartESet;

	/**
	 * The default value of the '{@link #getPendingValue() <em>Pending Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object PENDING_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPendingValue() <em>Pending Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPendingValue()
	 * @generated
	 * @ordered
	 */
	protected Object pendingValue = PENDING_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected Object defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisplayFlag() <em>Display Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisplayFlag() <em>Display Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean displayFlag = DISPLAY_FLAG_EDEFAULT;

	/**
	 * This is true if the Display Flag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayFlagESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.SERVER_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER_PROPERTY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequiresRestart() {
		return requiresRestart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiresRestart(boolean newRequiresRestart) {
		boolean oldRequiresRestart = requiresRestart;
		requiresRestart = newRequiresRestart;
		boolean oldRequiresRestartESet = requiresRestartESet;
		requiresRestartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER_PROPERTY__REQUIRES_RESTART, oldRequiresRestart, requiresRestart, !oldRequiresRestartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequiresRestart() {
		boolean oldRequiresRestart = requiresRestart;
		boolean oldRequiresRestartESet = requiresRestartESet;
		requiresRestart = REQUIRES_RESTART_EDEFAULT;
		requiresRestartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.SERVER_PROPERTY__REQUIRES_RESTART, oldRequiresRestart, REQUIRES_RESTART_EDEFAULT, oldRequiresRestartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequiresRestart() {
		return requiresRestartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPendingValue() {
		return pendingValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPendingValue(Object newPendingValue) {
		Object oldPendingValue = pendingValue;
		pendingValue = newPendingValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER_PROPERTY__PENDING_VALUE, oldPendingValue, pendingValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(Object newDefaultValue) {
		Object oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER_PROPERTY__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisplayFlag() {
		return displayFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayFlag(boolean newDisplayFlag) {
		boolean oldDisplayFlag = displayFlag;
		displayFlag = newDisplayFlag;
		boolean oldDisplayFlagESet = displayFlagESet;
		displayFlagESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER_PROPERTY__DISPLAY_FLAG, oldDisplayFlag, displayFlag, !oldDisplayFlagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayFlag() {
		boolean oldDisplayFlag = displayFlag;
		boolean oldDisplayFlagESet = displayFlagESet;
		displayFlag = DISPLAY_FLAG_EDEFAULT;
		displayFlagESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.SERVER_PROPERTY__DISPLAY_FLAG, oldDisplayFlag, DISPLAY_FLAG_EDEFAULT, oldDisplayFlagESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayFlag() {
		return displayFlagESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.SERVER_PROPERTY__NAME:
				return getName();
			case XmlaPackage.SERVER_PROPERTY__VALUE:
				return getValue();
			case XmlaPackage.SERVER_PROPERTY__REQUIRES_RESTART:
				return isRequiresRestart();
			case XmlaPackage.SERVER_PROPERTY__PENDING_VALUE:
				return getPendingValue();
			case XmlaPackage.SERVER_PROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case XmlaPackage.SERVER_PROPERTY__DISPLAY_FLAG:
				return isDisplayFlag();
			case XmlaPackage.SERVER_PROPERTY__TYPE:
				return getType();
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
			case XmlaPackage.SERVER_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.SERVER_PROPERTY__VALUE:
				setValue((String)newValue);
				return;
			case XmlaPackage.SERVER_PROPERTY__REQUIRES_RESTART:
				setRequiresRestart((Boolean)newValue);
				return;
			case XmlaPackage.SERVER_PROPERTY__PENDING_VALUE:
				setPendingValue(newValue);
				return;
			case XmlaPackage.SERVER_PROPERTY__DEFAULT_VALUE:
				setDefaultValue(newValue);
				return;
			case XmlaPackage.SERVER_PROPERTY__DISPLAY_FLAG:
				setDisplayFlag((Boolean)newValue);
				return;
			case XmlaPackage.SERVER_PROPERTY__TYPE:
				setType((String)newValue);
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
			case XmlaPackage.SERVER_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.SERVER_PROPERTY__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case XmlaPackage.SERVER_PROPERTY__REQUIRES_RESTART:
				unsetRequiresRestart();
				return;
			case XmlaPackage.SERVER_PROPERTY__PENDING_VALUE:
				setPendingValue(PENDING_VALUE_EDEFAULT);
				return;
			case XmlaPackage.SERVER_PROPERTY__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case XmlaPackage.SERVER_PROPERTY__DISPLAY_FLAG:
				unsetDisplayFlag();
				return;
			case XmlaPackage.SERVER_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
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
			case XmlaPackage.SERVER_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.SERVER_PROPERTY__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case XmlaPackage.SERVER_PROPERTY__REQUIRES_RESTART:
				return isSetRequiresRestart();
			case XmlaPackage.SERVER_PROPERTY__PENDING_VALUE:
				return PENDING_VALUE_EDEFAULT == null ? pendingValue != null : !PENDING_VALUE_EDEFAULT.equals(pendingValue);
			case XmlaPackage.SERVER_PROPERTY__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case XmlaPackage.SERVER_PROPERTY__DISPLAY_FLAG:
				return isSetDisplayFlag();
			case XmlaPackage.SERVER_PROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(", value: ");
		result.append(value);
		result.append(", requiresRestart: ");
		if (requiresRestartESet) result.append(requiresRestart); else result.append("<unset>");
		result.append(", pendingValue: ");
		result.append(pendingValue);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", displayFlag: ");
		if (displayFlagESet) result.append(displayFlag); else result.append("<unset>");
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ServerPropertyImpl
