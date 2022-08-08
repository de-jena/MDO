/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ErrorTypeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ErrorTypeImpl#getCallstack <em>Callstack</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ErrorTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ErrorTypeImpl#getErrorCode <em>Error Code</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ErrorTypeImpl#getHelpFile <em>Help File</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ErrorTypeImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorTypeImpl extends MinimalEObjectImpl.Container implements ErrorType {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected MessageLocation location;

	/**
	 * The default value of the '{@link #getCallstack() <em>Callstack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallstack()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLSTACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCallstack() <em>Callstack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallstack()
	 * @generated
	 * @ordered
	 */
	protected String callstack = CALLSTACK_EDEFAULT;

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
	 * The default value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected static final long ERROR_CODE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getErrorCode() <em>Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorCode()
	 * @generated
	 * @ordered
	 */
	protected long errorCode = ERROR_CODE_EDEFAULT;

	/**
	 * This is true if the Error Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean errorCodeESet;

	/**
	 * The default value of the '{@link #getHelpFile() <em>Help File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpFile()
	 * @generated
	 * @ordered
	 */
	protected static final String HELP_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHelpFile() <em>Help File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpFile()
	 * @generated
	 * @ordered
	 */
	protected String helpFile = HELP_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_exceptionPackage.Literals.ERROR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(MessageLocation newLocation, NotificationChain msgs) {
		MessageLocation oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.ERROR_TYPE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(MessageLocation newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_exceptionPackage.ERROR_TYPE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_exceptionPackage.ERROR_TYPE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.ERROR_TYPE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCallstack() {
		return callstack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallstack(String newCallstack) {
		String oldCallstack = callstack;
		callstack = newCallstack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.ERROR_TYPE__CALLSTACK, oldCallstack, callstack));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.ERROR_TYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getErrorCode() {
		return errorCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorCode(long newErrorCode) {
		long oldErrorCode = errorCode;
		errorCode = newErrorCode;
		boolean oldErrorCodeESet = errorCodeESet;
		errorCodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.ERROR_TYPE__ERROR_CODE, oldErrorCode, errorCode, !oldErrorCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetErrorCode() {
		long oldErrorCode = errorCode;
		boolean oldErrorCodeESet = errorCodeESet;
		errorCode = ERROR_CODE_EDEFAULT;
		errorCodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xmla_exceptionPackage.ERROR_TYPE__ERROR_CODE, oldErrorCode, ERROR_CODE_EDEFAULT, oldErrorCodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetErrorCode() {
		return errorCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHelpFile() {
		return helpFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHelpFile(String newHelpFile) {
		String oldHelpFile = helpFile;
		helpFile = newHelpFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.ERROR_TYPE__HELP_FILE, oldHelpFile, helpFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.ERROR_TYPE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_exceptionPackage.ERROR_TYPE__LOCATION:
				return basicSetLocation(null, msgs);
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
			case Xmla_exceptionPackage.ERROR_TYPE__LOCATION:
				return getLocation();
			case Xmla_exceptionPackage.ERROR_TYPE__CALLSTACK:
				return getCallstack();
			case Xmla_exceptionPackage.ERROR_TYPE__DESCRIPTION:
				return getDescription();
			case Xmla_exceptionPackage.ERROR_TYPE__ERROR_CODE:
				return getErrorCode();
			case Xmla_exceptionPackage.ERROR_TYPE__HELP_FILE:
				return getHelpFile();
			case Xmla_exceptionPackage.ERROR_TYPE__SOURCE:
				return getSource();
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
			case Xmla_exceptionPackage.ERROR_TYPE__LOCATION:
				setLocation((MessageLocation)newValue);
				return;
			case Xmla_exceptionPackage.ERROR_TYPE__CALLSTACK:
				setCallstack((String)newValue);
				return;
			case Xmla_exceptionPackage.ERROR_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Xmla_exceptionPackage.ERROR_TYPE__ERROR_CODE:
				setErrorCode((Long)newValue);
				return;
			case Xmla_exceptionPackage.ERROR_TYPE__HELP_FILE:
				setHelpFile((String)newValue);
				return;
			case Xmla_exceptionPackage.ERROR_TYPE__SOURCE:
				setSource((String)newValue);
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
			case Xmla_exceptionPackage.ERROR_TYPE__LOCATION:
				setLocation((MessageLocation)null);
				return;
			case Xmla_exceptionPackage.ERROR_TYPE__CALLSTACK:
				setCallstack(CALLSTACK_EDEFAULT);
				return;
			case Xmla_exceptionPackage.ERROR_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Xmla_exceptionPackage.ERROR_TYPE__ERROR_CODE:
				unsetErrorCode();
				return;
			case Xmla_exceptionPackage.ERROR_TYPE__HELP_FILE:
				setHelpFile(HELP_FILE_EDEFAULT);
				return;
			case Xmla_exceptionPackage.ERROR_TYPE__SOURCE:
				setSource(SOURCE_EDEFAULT);
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
			case Xmla_exceptionPackage.ERROR_TYPE__LOCATION:
				return location != null;
			case Xmla_exceptionPackage.ERROR_TYPE__CALLSTACK:
				return CALLSTACK_EDEFAULT == null ? callstack != null : !CALLSTACK_EDEFAULT.equals(callstack);
			case Xmla_exceptionPackage.ERROR_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Xmla_exceptionPackage.ERROR_TYPE__ERROR_CODE:
				return isSetErrorCode();
			case Xmla_exceptionPackage.ERROR_TYPE__HELP_FILE:
				return HELP_FILE_EDEFAULT == null ? helpFile != null : !HELP_FILE_EDEFAULT.equals(helpFile);
			case Xmla_exceptionPackage.ERROR_TYPE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
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
		result.append(" (callstack: ");
		result.append(callstack);
		result.append(", description: ");
		result.append(description);
		result.append(", errorCode: ");
		if (errorCodeESet) result.append(errorCode); else result.append("<unset>");
		result.append(", helpFile: ");
		result.append(helpFile);
		result.append(", source: ");
		result.append(source);
		result.append(')');
		return result.toString();
	}

} //ErrorTypeImpl
