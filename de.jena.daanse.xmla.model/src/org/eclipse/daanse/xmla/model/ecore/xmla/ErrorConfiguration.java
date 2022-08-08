/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorLimit <em>Key Error Limit</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorLogFile <em>Key Error Log File</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorAction <em>Key Error Action</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorLimitAction <em>Key Error Limit Action</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyNotFound <em>Key Not Found</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyDuplicate <em>Key Duplicate</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getNullKeyConvertedToUnknown <em>Null Key Converted To Unknown</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getNullKeyNotAllowed <em>Null Key Not Allowed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getCalculationError <em>Calculation Error</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getErrorConfiguration()
 * @model extendedMetaData="name='ErrorConfiguration' kind='elementOnly'"
 * @generated
 */
public interface ErrorConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Key Error Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Error Limit</em>' attribute.
	 * @see #isSetKeyErrorLimit()
	 * @see #unsetKeyErrorLimit()
	 * @see #setKeyErrorLimit(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getErrorConfiguration_KeyErrorLimit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='KeyErrorLimit'"
	 * @generated
	 */
	long getKeyErrorLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorLimit <em>Key Error Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Error Limit</em>' attribute.
	 * @see #isSetKeyErrorLimit()
	 * @see #unsetKeyErrorLimit()
	 * @see #getKeyErrorLimit()
	 * @generated
	 */
	void setKeyErrorLimit(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorLimit <em>Key Error Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyErrorLimit()
	 * @see #getKeyErrorLimit()
	 * @see #setKeyErrorLimit(long)
	 * @generated
	 */
	void unsetKeyErrorLimit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorLimit <em>Key Error Limit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key Error Limit</em>' attribute is set.
	 * @see #unsetKeyErrorLimit()
	 * @see #getKeyErrorLimit()
	 * @see #setKeyErrorLimit(long)
	 * @generated
	 */
	boolean isSetKeyErrorLimit();

	/**
	 * Returns the value of the '<em><b>Key Error Log File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Error Log File</em>' attribute.
	 * @see #setKeyErrorLogFile(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getErrorConfiguration_KeyErrorLogFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='KeyErrorLogFile'"
	 * @generated
	 */
	String getKeyErrorLogFile();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorLogFile <em>Key Error Log File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Error Log File</em>' attribute.
	 * @see #getKeyErrorLogFile()
	 * @generated
	 */
	void setKeyErrorLogFile(String value);

	/**
	 * Returns the value of the '<em><b>Key Error Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyErrorActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Error Action</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyErrorActionType
	 * @see #isSetKeyErrorAction()
	 * @see #unsetKeyErrorAction()
	 * @see #setKeyErrorAction(KeyErrorActionType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getErrorConfiguration_KeyErrorAction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='KeyErrorAction'"
	 * @generated
	 */
	KeyErrorActionType getKeyErrorAction();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorAction <em>Key Error Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Error Action</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyErrorActionType
	 * @see #isSetKeyErrorAction()
	 * @see #unsetKeyErrorAction()
	 * @see #getKeyErrorAction()
	 * @generated
	 */
	void setKeyErrorAction(KeyErrorActionType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorAction <em>Key Error Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyErrorAction()
	 * @see #getKeyErrorAction()
	 * @see #setKeyErrorAction(KeyErrorActionType)
	 * @generated
	 */
	void unsetKeyErrorAction();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorAction <em>Key Error Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key Error Action</em>' attribute is set.
	 * @see #unsetKeyErrorAction()
	 * @see #getKeyErrorAction()
	 * @see #setKeyErrorAction(KeyErrorActionType)
	 * @generated
	 */
	boolean isSetKeyErrorAction();

	/**
	 * Returns the value of the '<em><b>Key Error Limit Action</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyErrorLimitActionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Error Limit Action</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyErrorLimitActionType
	 * @see #isSetKeyErrorLimitAction()
	 * @see #unsetKeyErrorLimitAction()
	 * @see #setKeyErrorLimitAction(KeyErrorLimitActionType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getErrorConfiguration_KeyErrorLimitAction()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='KeyErrorLimitAction'"
	 * @generated
	 */
	KeyErrorLimitActionType getKeyErrorLimitAction();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorLimitAction <em>Key Error Limit Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Error Limit Action</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyErrorLimitActionType
	 * @see #isSetKeyErrorLimitAction()
	 * @see #unsetKeyErrorLimitAction()
	 * @see #getKeyErrorLimitAction()
	 * @generated
	 */
	void setKeyErrorLimitAction(KeyErrorLimitActionType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorLimitAction <em>Key Error Limit Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyErrorLimitAction()
	 * @see #getKeyErrorLimitAction()
	 * @see #setKeyErrorLimitAction(KeyErrorLimitActionType)
	 * @generated
	 */
	void unsetKeyErrorLimitAction();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyErrorLimitAction <em>Key Error Limit Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key Error Limit Action</em>' attribute is set.
	 * @see #unsetKeyErrorLimitAction()
	 * @see #getKeyErrorLimitAction()
	 * @see #setKeyErrorLimitAction(KeyErrorLimitActionType)
	 * @generated
	 */
	boolean isSetKeyErrorLimitAction();

	/**
	 * Returns the value of the '<em><b>Key Not Found</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyNotFoundType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Not Found</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyNotFoundType
	 * @see #isSetKeyNotFound()
	 * @see #unsetKeyNotFound()
	 * @see #setKeyNotFound(KeyNotFoundType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getErrorConfiguration_KeyNotFound()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='KeyNotFound'"
	 * @generated
	 */
	KeyNotFoundType getKeyNotFound();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyNotFound <em>Key Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Not Found</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyNotFoundType
	 * @see #isSetKeyNotFound()
	 * @see #unsetKeyNotFound()
	 * @see #getKeyNotFound()
	 * @generated
	 */
	void setKeyNotFound(KeyNotFoundType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyNotFound <em>Key Not Found</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyNotFound()
	 * @see #getKeyNotFound()
	 * @see #setKeyNotFound(KeyNotFoundType)
	 * @generated
	 */
	void unsetKeyNotFound();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyNotFound <em>Key Not Found</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key Not Found</em>' attribute is set.
	 * @see #unsetKeyNotFound()
	 * @see #getKeyNotFound()
	 * @see #setKeyNotFound(KeyNotFoundType)
	 * @generated
	 */
	boolean isSetKeyNotFound();

	/**
	 * Returns the value of the '<em><b>Key Duplicate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.KeyDuplicateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Duplicate</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyDuplicateType
	 * @see #isSetKeyDuplicate()
	 * @see #unsetKeyDuplicate()
	 * @see #setKeyDuplicate(KeyDuplicateType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getErrorConfiguration_KeyDuplicate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='KeyDuplicate'"
	 * @generated
	 */
	KeyDuplicateType getKeyDuplicate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyDuplicate <em>Key Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Duplicate</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.KeyDuplicateType
	 * @see #isSetKeyDuplicate()
	 * @see #unsetKeyDuplicate()
	 * @see #getKeyDuplicate()
	 * @generated
	 */
	void setKeyDuplicate(KeyDuplicateType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyDuplicate <em>Key Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyDuplicate()
	 * @see #getKeyDuplicate()
	 * @see #setKeyDuplicate(KeyDuplicateType)
	 * @generated
	 */
	void unsetKeyDuplicate();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getKeyDuplicate <em>Key Duplicate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key Duplicate</em>' attribute is set.
	 * @see #unsetKeyDuplicate()
	 * @see #getKeyDuplicate()
	 * @see #setKeyDuplicate(KeyDuplicateType)
	 * @generated
	 */
	boolean isSetKeyDuplicate();

	/**
	 * Returns the value of the '<em><b>Null Key Converted To Unknown</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.NullKeyConvertedToUnknownType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Key Converted To Unknown</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NullKeyConvertedToUnknownType
	 * @see #isSetNullKeyConvertedToUnknown()
	 * @see #unsetNullKeyConvertedToUnknown()
	 * @see #setNullKeyConvertedToUnknown(NullKeyConvertedToUnknownType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getErrorConfiguration_NullKeyConvertedToUnknown()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NullKeyConvertedToUnknown'"
	 * @generated
	 */
	NullKeyConvertedToUnknownType getNullKeyConvertedToUnknown();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getNullKeyConvertedToUnknown <em>Null Key Converted To Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Key Converted To Unknown</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NullKeyConvertedToUnknownType
	 * @see #isSetNullKeyConvertedToUnknown()
	 * @see #unsetNullKeyConvertedToUnknown()
	 * @see #getNullKeyConvertedToUnknown()
	 * @generated
	 */
	void setNullKeyConvertedToUnknown(NullKeyConvertedToUnknownType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getNullKeyConvertedToUnknown <em>Null Key Converted To Unknown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullKeyConvertedToUnknown()
	 * @see #getNullKeyConvertedToUnknown()
	 * @see #setNullKeyConvertedToUnknown(NullKeyConvertedToUnknownType)
	 * @generated
	 */
	void unsetNullKeyConvertedToUnknown();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getNullKeyConvertedToUnknown <em>Null Key Converted To Unknown</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Null Key Converted To Unknown</em>' attribute is set.
	 * @see #unsetNullKeyConvertedToUnknown()
	 * @see #getNullKeyConvertedToUnknown()
	 * @see #setNullKeyConvertedToUnknown(NullKeyConvertedToUnknownType)
	 * @generated
	 */
	boolean isSetNullKeyConvertedToUnknown();

	/**
	 * Returns the value of the '<em><b>Null Key Not Allowed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.NullKeyNotAllowedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Key Not Allowed</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NullKeyNotAllowedType
	 * @see #isSetNullKeyNotAllowed()
	 * @see #unsetNullKeyNotAllowed()
	 * @see #setNullKeyNotAllowed(NullKeyNotAllowedType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getErrorConfiguration_NullKeyNotAllowed()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NullKeyNotAllowed'"
	 * @generated
	 */
	NullKeyNotAllowedType getNullKeyNotAllowed();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getNullKeyNotAllowed <em>Null Key Not Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Key Not Allowed</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NullKeyNotAllowedType
	 * @see #isSetNullKeyNotAllowed()
	 * @see #unsetNullKeyNotAllowed()
	 * @see #getNullKeyNotAllowed()
	 * @generated
	 */
	void setNullKeyNotAllowed(NullKeyNotAllowedType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getNullKeyNotAllowed <em>Null Key Not Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullKeyNotAllowed()
	 * @see #getNullKeyNotAllowed()
	 * @see #setNullKeyNotAllowed(NullKeyNotAllowedType)
	 * @generated
	 */
	void unsetNullKeyNotAllowed();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getNullKeyNotAllowed <em>Null Key Not Allowed</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Null Key Not Allowed</em>' attribute is set.
	 * @see #unsetNullKeyNotAllowed()
	 * @see #getNullKeyNotAllowed()
	 * @see #setNullKeyNotAllowed(NullKeyNotAllowedType)
	 * @generated
	 */
	boolean isSetNullKeyNotAllowed();

	/**
	 * Returns the value of the '<em><b>Calculation Error</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation Error</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType
	 * @see #isSetCalculationError()
	 * @see #unsetCalculationError()
	 * @see #setCalculationError(CalculationErrorType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getErrorConfiguration_CalculationError()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CalculationError' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200'"
	 * @generated
	 */
	CalculationErrorType getCalculationError();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getCalculationError <em>Calculation Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Error</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200.CalculationErrorType
	 * @see #isSetCalculationError()
	 * @see #unsetCalculationError()
	 * @see #getCalculationError()
	 * @generated
	 */
	void setCalculationError(CalculationErrorType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getCalculationError <em>Calculation Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCalculationError()
	 * @see #getCalculationError()
	 * @see #setCalculationError(CalculationErrorType)
	 * @generated
	 */
	void unsetCalculationError();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration#getCalculationError <em>Calculation Error</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Calculation Error</em>' attribute is set.
	 * @see #unsetCalculationError()
	 * @see #getCalculationError()
	 * @see #setCalculationError(CalculationErrorType)
	 * @generated
	 */
	boolean isSetCalculationError();

} // ErrorConfiguration
