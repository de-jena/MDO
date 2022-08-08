/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType;

import org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyDuplicateType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyErrorActionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyErrorLimitActionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyNotFoundType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NullKeyConvertedToUnknownType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NullKeyNotAllowedType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ErrorConfigurationImpl#getKeyErrorLimit <em>Key Error Limit</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ErrorConfigurationImpl#getKeyErrorLogFile <em>Key Error Log File</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ErrorConfigurationImpl#getKeyErrorAction <em>Key Error Action</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ErrorConfigurationImpl#getKeyErrorLimitAction <em>Key Error Limit Action</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ErrorConfigurationImpl#getKeyNotFound <em>Key Not Found</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ErrorConfigurationImpl#getKeyDuplicate <em>Key Duplicate</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ErrorConfigurationImpl#getNullKeyConvertedToUnknown <em>Null Key Converted To Unknown</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ErrorConfigurationImpl#getNullKeyNotAllowed <em>Null Key Not Allowed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ErrorConfigurationImpl#getCalculationError <em>Calculation Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorConfigurationImpl extends MinimalEObjectImpl.Container implements ErrorConfiguration {
	/**
	 * The default value of the '{@link #getKeyErrorLimit() <em>Key Error Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyErrorLimit()
	 * @generated
	 * @ordered
	 */
	protected static final long KEY_ERROR_LIMIT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getKeyErrorLimit() <em>Key Error Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyErrorLimit()
	 * @generated
	 * @ordered
	 */
	protected long keyErrorLimit = KEY_ERROR_LIMIT_EDEFAULT;

	/**
	 * This is true if the Key Error Limit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyErrorLimitESet;

	/**
	 * The default value of the '{@link #getKeyErrorLogFile() <em>Key Error Log File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyErrorLogFile()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_ERROR_LOG_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyErrorLogFile() <em>Key Error Log File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyErrorLogFile()
	 * @generated
	 * @ordered
	 */
	protected String keyErrorLogFile = KEY_ERROR_LOG_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeyErrorAction() <em>Key Error Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyErrorAction()
	 * @generated
	 * @ordered
	 */
	protected static final KeyErrorActionType KEY_ERROR_ACTION_EDEFAULT = KeyErrorActionType.CONVERT_TO_UNKNOWN;

	/**
	 * The cached value of the '{@link #getKeyErrorAction() <em>Key Error Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyErrorAction()
	 * @generated
	 * @ordered
	 */
	protected KeyErrorActionType keyErrorAction = KEY_ERROR_ACTION_EDEFAULT;

	/**
	 * This is true if the Key Error Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyErrorActionESet;

	/**
	 * The default value of the '{@link #getKeyErrorLimitAction() <em>Key Error Limit Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyErrorLimitAction()
	 * @generated
	 * @ordered
	 */
	protected static final KeyErrorLimitActionType KEY_ERROR_LIMIT_ACTION_EDEFAULT = KeyErrorLimitActionType.STOP_PROCESSING;

	/**
	 * The cached value of the '{@link #getKeyErrorLimitAction() <em>Key Error Limit Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyErrorLimitAction()
	 * @generated
	 * @ordered
	 */
	protected KeyErrorLimitActionType keyErrorLimitAction = KEY_ERROR_LIMIT_ACTION_EDEFAULT;

	/**
	 * This is true if the Key Error Limit Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyErrorLimitActionESet;

	/**
	 * The default value of the '{@link #getKeyNotFound() <em>Key Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyNotFound()
	 * @generated
	 * @ordered
	 */
	protected static final KeyNotFoundType KEY_NOT_FOUND_EDEFAULT = KeyNotFoundType.IGNORE_ERROR;

	/**
	 * The cached value of the '{@link #getKeyNotFound() <em>Key Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyNotFound()
	 * @generated
	 * @ordered
	 */
	protected KeyNotFoundType keyNotFound = KEY_NOT_FOUND_EDEFAULT;

	/**
	 * This is true if the Key Not Found attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyNotFoundESet;

	/**
	 * The default value of the '{@link #getKeyDuplicate() <em>Key Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyDuplicate()
	 * @generated
	 * @ordered
	 */
	protected static final KeyDuplicateType KEY_DUPLICATE_EDEFAULT = KeyDuplicateType.IGNORE_ERROR;

	/**
	 * The cached value of the '{@link #getKeyDuplicate() <em>Key Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyDuplicate()
	 * @generated
	 * @ordered
	 */
	protected KeyDuplicateType keyDuplicate = KEY_DUPLICATE_EDEFAULT;

	/**
	 * This is true if the Key Duplicate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean keyDuplicateESet;

	/**
	 * The default value of the '{@link #getNullKeyConvertedToUnknown() <em>Null Key Converted To Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullKeyConvertedToUnknown()
	 * @generated
	 * @ordered
	 */
	protected static final NullKeyConvertedToUnknownType NULL_KEY_CONVERTED_TO_UNKNOWN_EDEFAULT = NullKeyConvertedToUnknownType.IGNORE_ERROR;

	/**
	 * The cached value of the '{@link #getNullKeyConvertedToUnknown() <em>Null Key Converted To Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullKeyConvertedToUnknown()
	 * @generated
	 * @ordered
	 */
	protected NullKeyConvertedToUnknownType nullKeyConvertedToUnknown = NULL_KEY_CONVERTED_TO_UNKNOWN_EDEFAULT;

	/**
	 * This is true if the Null Key Converted To Unknown attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullKeyConvertedToUnknownESet;

	/**
	 * The default value of the '{@link #getNullKeyNotAllowed() <em>Null Key Not Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullKeyNotAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final NullKeyNotAllowedType NULL_KEY_NOT_ALLOWED_EDEFAULT = NullKeyNotAllowedType.IGNORE_ERROR;

	/**
	 * The cached value of the '{@link #getNullKeyNotAllowed() <em>Null Key Not Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullKeyNotAllowed()
	 * @generated
	 * @ordered
	 */
	protected NullKeyNotAllowedType nullKeyNotAllowed = NULL_KEY_NOT_ALLOWED_EDEFAULT;

	/**
	 * This is true if the Null Key Not Allowed attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullKeyNotAllowedESet;

	/**
	 * The default value of the '{@link #getCalculationError() <em>Calculation Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationError()
	 * @generated
	 * @ordered
	 */
	protected static final CalculationErrorType CALCULATION_ERROR_EDEFAULT = CalculationErrorType.IGNORE_ERROR;

	/**
	 * The cached value of the '{@link #getCalculationError() <em>Calculation Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculationError()
	 * @generated
	 * @ordered
	 */
	protected CalculationErrorType calculationError = CALCULATION_ERROR_EDEFAULT;

	/**
	 * This is true if the Calculation Error attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean calculationErrorESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.ERROR_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getKeyErrorLimit() {
		return keyErrorLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyErrorLimit(long newKeyErrorLimit) {
		long oldKeyErrorLimit = keyErrorLimit;
		keyErrorLimit = newKeyErrorLimit;
		boolean oldKeyErrorLimitESet = keyErrorLimitESet;
		keyErrorLimitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LIMIT, oldKeyErrorLimit, keyErrorLimit, !oldKeyErrorLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeyErrorLimit() {
		long oldKeyErrorLimit = keyErrorLimit;
		boolean oldKeyErrorLimitESet = keyErrorLimitESet;
		keyErrorLimit = KEY_ERROR_LIMIT_EDEFAULT;
		keyErrorLimitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LIMIT, oldKeyErrorLimit, KEY_ERROR_LIMIT_EDEFAULT, oldKeyErrorLimitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeyErrorLimit() {
		return keyErrorLimitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyErrorLogFile() {
		return keyErrorLogFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyErrorLogFile(String newKeyErrorLogFile) {
		String oldKeyErrorLogFile = keyErrorLogFile;
		keyErrorLogFile = newKeyErrorLogFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LOG_FILE, oldKeyErrorLogFile, keyErrorLogFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyErrorActionType getKeyErrorAction() {
		return keyErrorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyErrorAction(KeyErrorActionType newKeyErrorAction) {
		KeyErrorActionType oldKeyErrorAction = keyErrorAction;
		keyErrorAction = newKeyErrorAction == null ? KEY_ERROR_ACTION_EDEFAULT : newKeyErrorAction;
		boolean oldKeyErrorActionESet = keyErrorActionESet;
		keyErrorActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_ACTION, oldKeyErrorAction, keyErrorAction, !oldKeyErrorActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeyErrorAction() {
		KeyErrorActionType oldKeyErrorAction = keyErrorAction;
		boolean oldKeyErrorActionESet = keyErrorActionESet;
		keyErrorAction = KEY_ERROR_ACTION_EDEFAULT;
		keyErrorActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_ACTION, oldKeyErrorAction, KEY_ERROR_ACTION_EDEFAULT, oldKeyErrorActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeyErrorAction() {
		return keyErrorActionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyErrorLimitActionType getKeyErrorLimitAction() {
		return keyErrorLimitAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyErrorLimitAction(KeyErrorLimitActionType newKeyErrorLimitAction) {
		KeyErrorLimitActionType oldKeyErrorLimitAction = keyErrorLimitAction;
		keyErrorLimitAction = newKeyErrorLimitAction == null ? KEY_ERROR_LIMIT_ACTION_EDEFAULT : newKeyErrorLimitAction;
		boolean oldKeyErrorLimitActionESet = keyErrorLimitActionESet;
		keyErrorLimitActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LIMIT_ACTION, oldKeyErrorLimitAction, keyErrorLimitAction, !oldKeyErrorLimitActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeyErrorLimitAction() {
		KeyErrorLimitActionType oldKeyErrorLimitAction = keyErrorLimitAction;
		boolean oldKeyErrorLimitActionESet = keyErrorLimitActionESet;
		keyErrorLimitAction = KEY_ERROR_LIMIT_ACTION_EDEFAULT;
		keyErrorLimitActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LIMIT_ACTION, oldKeyErrorLimitAction, KEY_ERROR_LIMIT_ACTION_EDEFAULT, oldKeyErrorLimitActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeyErrorLimitAction() {
		return keyErrorLimitActionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyNotFoundType getKeyNotFound() {
		return keyNotFound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyNotFound(KeyNotFoundType newKeyNotFound) {
		KeyNotFoundType oldKeyNotFound = keyNotFound;
		keyNotFound = newKeyNotFound == null ? KEY_NOT_FOUND_EDEFAULT : newKeyNotFound;
		boolean oldKeyNotFoundESet = keyNotFoundESet;
		keyNotFoundESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ERROR_CONFIGURATION__KEY_NOT_FOUND, oldKeyNotFound, keyNotFound, !oldKeyNotFoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeyNotFound() {
		KeyNotFoundType oldKeyNotFound = keyNotFound;
		boolean oldKeyNotFoundESet = keyNotFoundESet;
		keyNotFound = KEY_NOT_FOUND_EDEFAULT;
		keyNotFoundESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ERROR_CONFIGURATION__KEY_NOT_FOUND, oldKeyNotFound, KEY_NOT_FOUND_EDEFAULT, oldKeyNotFoundESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeyNotFound() {
		return keyNotFoundESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyDuplicateType getKeyDuplicate() {
		return keyDuplicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyDuplicate(KeyDuplicateType newKeyDuplicate) {
		KeyDuplicateType oldKeyDuplicate = keyDuplicate;
		keyDuplicate = newKeyDuplicate == null ? KEY_DUPLICATE_EDEFAULT : newKeyDuplicate;
		boolean oldKeyDuplicateESet = keyDuplicateESet;
		keyDuplicateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ERROR_CONFIGURATION__KEY_DUPLICATE, oldKeyDuplicate, keyDuplicate, !oldKeyDuplicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetKeyDuplicate() {
		KeyDuplicateType oldKeyDuplicate = keyDuplicate;
		boolean oldKeyDuplicateESet = keyDuplicateESet;
		keyDuplicate = KEY_DUPLICATE_EDEFAULT;
		keyDuplicateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ERROR_CONFIGURATION__KEY_DUPLICATE, oldKeyDuplicate, KEY_DUPLICATE_EDEFAULT, oldKeyDuplicateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetKeyDuplicate() {
		return keyDuplicateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullKeyConvertedToUnknownType getNullKeyConvertedToUnknown() {
		return nullKeyConvertedToUnknown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullKeyConvertedToUnknown(NullKeyConvertedToUnknownType newNullKeyConvertedToUnknown) {
		NullKeyConvertedToUnknownType oldNullKeyConvertedToUnknown = nullKeyConvertedToUnknown;
		nullKeyConvertedToUnknown = newNullKeyConvertedToUnknown == null ? NULL_KEY_CONVERTED_TO_UNKNOWN_EDEFAULT : newNullKeyConvertedToUnknown;
		boolean oldNullKeyConvertedToUnknownESet = nullKeyConvertedToUnknownESet;
		nullKeyConvertedToUnknownESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ERROR_CONFIGURATION__NULL_KEY_CONVERTED_TO_UNKNOWN, oldNullKeyConvertedToUnknown, nullKeyConvertedToUnknown, !oldNullKeyConvertedToUnknownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullKeyConvertedToUnknown() {
		NullKeyConvertedToUnknownType oldNullKeyConvertedToUnknown = nullKeyConvertedToUnknown;
		boolean oldNullKeyConvertedToUnknownESet = nullKeyConvertedToUnknownESet;
		nullKeyConvertedToUnknown = NULL_KEY_CONVERTED_TO_UNKNOWN_EDEFAULT;
		nullKeyConvertedToUnknownESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ERROR_CONFIGURATION__NULL_KEY_CONVERTED_TO_UNKNOWN, oldNullKeyConvertedToUnknown, NULL_KEY_CONVERTED_TO_UNKNOWN_EDEFAULT, oldNullKeyConvertedToUnknownESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullKeyConvertedToUnknown() {
		return nullKeyConvertedToUnknownESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullKeyNotAllowedType getNullKeyNotAllowed() {
		return nullKeyNotAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullKeyNotAllowed(NullKeyNotAllowedType newNullKeyNotAllowed) {
		NullKeyNotAllowedType oldNullKeyNotAllowed = nullKeyNotAllowed;
		nullKeyNotAllowed = newNullKeyNotAllowed == null ? NULL_KEY_NOT_ALLOWED_EDEFAULT : newNullKeyNotAllowed;
		boolean oldNullKeyNotAllowedESet = nullKeyNotAllowedESet;
		nullKeyNotAllowedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ERROR_CONFIGURATION__NULL_KEY_NOT_ALLOWED, oldNullKeyNotAllowed, nullKeyNotAllowed, !oldNullKeyNotAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullKeyNotAllowed() {
		NullKeyNotAllowedType oldNullKeyNotAllowed = nullKeyNotAllowed;
		boolean oldNullKeyNotAllowedESet = nullKeyNotAllowedESet;
		nullKeyNotAllowed = NULL_KEY_NOT_ALLOWED_EDEFAULT;
		nullKeyNotAllowedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ERROR_CONFIGURATION__NULL_KEY_NOT_ALLOWED, oldNullKeyNotAllowed, NULL_KEY_NOT_ALLOWED_EDEFAULT, oldNullKeyNotAllowedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullKeyNotAllowed() {
		return nullKeyNotAllowedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculationErrorType getCalculationError() {
		return calculationError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculationError(CalculationErrorType newCalculationError) {
		CalculationErrorType oldCalculationError = calculationError;
		calculationError = newCalculationError == null ? CALCULATION_ERROR_EDEFAULT : newCalculationError;
		boolean oldCalculationErrorESet = calculationErrorESet;
		calculationErrorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ERROR_CONFIGURATION__CALCULATION_ERROR, oldCalculationError, calculationError, !oldCalculationErrorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCalculationError() {
		CalculationErrorType oldCalculationError = calculationError;
		boolean oldCalculationErrorESet = calculationErrorESet;
		calculationError = CALCULATION_ERROR_EDEFAULT;
		calculationErrorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ERROR_CONFIGURATION__CALCULATION_ERROR, oldCalculationError, CALCULATION_ERROR_EDEFAULT, oldCalculationErrorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCalculationError() {
		return calculationErrorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LIMIT:
				return getKeyErrorLimit();
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LOG_FILE:
				return getKeyErrorLogFile();
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_ACTION:
				return getKeyErrorAction();
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LIMIT_ACTION:
				return getKeyErrorLimitAction();
			case XmlaPackage.ERROR_CONFIGURATION__KEY_NOT_FOUND:
				return getKeyNotFound();
			case XmlaPackage.ERROR_CONFIGURATION__KEY_DUPLICATE:
				return getKeyDuplicate();
			case XmlaPackage.ERROR_CONFIGURATION__NULL_KEY_CONVERTED_TO_UNKNOWN:
				return getNullKeyConvertedToUnknown();
			case XmlaPackage.ERROR_CONFIGURATION__NULL_KEY_NOT_ALLOWED:
				return getNullKeyNotAllowed();
			case XmlaPackage.ERROR_CONFIGURATION__CALCULATION_ERROR:
				return getCalculationError();
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
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LIMIT:
				setKeyErrorLimit((Long)newValue);
				return;
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LOG_FILE:
				setKeyErrorLogFile((String)newValue);
				return;
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_ACTION:
				setKeyErrorAction((KeyErrorActionType)newValue);
				return;
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LIMIT_ACTION:
				setKeyErrorLimitAction((KeyErrorLimitActionType)newValue);
				return;
			case XmlaPackage.ERROR_CONFIGURATION__KEY_NOT_FOUND:
				setKeyNotFound((KeyNotFoundType)newValue);
				return;
			case XmlaPackage.ERROR_CONFIGURATION__KEY_DUPLICATE:
				setKeyDuplicate((KeyDuplicateType)newValue);
				return;
			case XmlaPackage.ERROR_CONFIGURATION__NULL_KEY_CONVERTED_TO_UNKNOWN:
				setNullKeyConvertedToUnknown((NullKeyConvertedToUnknownType)newValue);
				return;
			case XmlaPackage.ERROR_CONFIGURATION__NULL_KEY_NOT_ALLOWED:
				setNullKeyNotAllowed((NullKeyNotAllowedType)newValue);
				return;
			case XmlaPackage.ERROR_CONFIGURATION__CALCULATION_ERROR:
				setCalculationError((CalculationErrorType)newValue);
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
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LIMIT:
				unsetKeyErrorLimit();
				return;
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LOG_FILE:
				setKeyErrorLogFile(KEY_ERROR_LOG_FILE_EDEFAULT);
				return;
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_ACTION:
				unsetKeyErrorAction();
				return;
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LIMIT_ACTION:
				unsetKeyErrorLimitAction();
				return;
			case XmlaPackage.ERROR_CONFIGURATION__KEY_NOT_FOUND:
				unsetKeyNotFound();
				return;
			case XmlaPackage.ERROR_CONFIGURATION__KEY_DUPLICATE:
				unsetKeyDuplicate();
				return;
			case XmlaPackage.ERROR_CONFIGURATION__NULL_KEY_CONVERTED_TO_UNKNOWN:
				unsetNullKeyConvertedToUnknown();
				return;
			case XmlaPackage.ERROR_CONFIGURATION__NULL_KEY_NOT_ALLOWED:
				unsetNullKeyNotAllowed();
				return;
			case XmlaPackage.ERROR_CONFIGURATION__CALCULATION_ERROR:
				unsetCalculationError();
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
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LIMIT:
				return isSetKeyErrorLimit();
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LOG_FILE:
				return KEY_ERROR_LOG_FILE_EDEFAULT == null ? keyErrorLogFile != null : !KEY_ERROR_LOG_FILE_EDEFAULT.equals(keyErrorLogFile);
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_ACTION:
				return isSetKeyErrorAction();
			case XmlaPackage.ERROR_CONFIGURATION__KEY_ERROR_LIMIT_ACTION:
				return isSetKeyErrorLimitAction();
			case XmlaPackage.ERROR_CONFIGURATION__KEY_NOT_FOUND:
				return isSetKeyNotFound();
			case XmlaPackage.ERROR_CONFIGURATION__KEY_DUPLICATE:
				return isSetKeyDuplicate();
			case XmlaPackage.ERROR_CONFIGURATION__NULL_KEY_CONVERTED_TO_UNKNOWN:
				return isSetNullKeyConvertedToUnknown();
			case XmlaPackage.ERROR_CONFIGURATION__NULL_KEY_NOT_ALLOWED:
				return isSetNullKeyNotAllowed();
			case XmlaPackage.ERROR_CONFIGURATION__CALCULATION_ERROR:
				return isSetCalculationError();
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
		result.append(" (keyErrorLimit: ");
		if (keyErrorLimitESet) result.append(keyErrorLimit); else result.append("<unset>");
		result.append(", keyErrorLogFile: ");
		result.append(keyErrorLogFile);
		result.append(", keyErrorAction: ");
		if (keyErrorActionESet) result.append(keyErrorAction); else result.append("<unset>");
		result.append(", keyErrorLimitAction: ");
		if (keyErrorLimitActionESet) result.append(keyErrorLimitAction); else result.append("<unset>");
		result.append(", keyNotFound: ");
		if (keyNotFoundESet) result.append(keyNotFound); else result.append("<unset>");
		result.append(", keyDuplicate: ");
		if (keyDuplicateESet) result.append(keyDuplicate); else result.append("<unset>");
		result.append(", nullKeyConvertedToUnknown: ");
		if (nullKeyConvertedToUnknownESet) result.append(nullKeyConvertedToUnknown); else result.append("<unset>");
		result.append(", nullKeyNotAllowed: ");
		if (nullKeyNotAllowedESet) result.append(nullKeyNotAllowed); else result.append("<unset>");
		result.append(", calculationError: ");
		if (calculationErrorESet) result.append(calculationError); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ErrorConfigurationImpl
