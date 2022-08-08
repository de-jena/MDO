/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_exception;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionFactory
 * @model kind="package"
 *        annotation="https://jakarta.ee/xml/ns/jaxb version='3.0'"
 * @generated
 */
public interface Xmla_exceptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmla_exception";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:schemas-microsoft-com:xml-analysis:exception";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_xmla_exception";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Xmla_exceptionPackage eINSTANCE = org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.EndTypeImpl <em>End Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.EndTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getEndType()
	 * @generated
	 */
	int END_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE__LINE = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>End Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>End Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ErrorTypeImpl <em>Error Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ErrorTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getErrorType()
	 * @generated
	 */
	int ERROR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Callstack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__CALLSTACK = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__ERROR_CODE = 3;

	/**
	 * The feature id for the '<em><b>Help File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__HELP_FILE = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE__SOURCE = 5;

	/**
	 * The number of structural features of the '<em>Error Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Error Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ExceptionImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 2;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessageLocationImpl <em>Message Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessageLocationImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getMessageLocation()
	 * @generated
	 */
	int MESSAGE_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOCATION__START = 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOCATION__END = 1;

	/**
	 * The feature id for the '<em><b>Line Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOCATION__LINE_OFFSET = 2;

	/**
	 * The feature id for the '<em><b>Text Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOCATION__TEXT_LENGTH = 3;

	/**
	 * The feature id for the '<em><b>Source Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOCATION__SOURCE_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Depends On Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOCATION__DEPENDS_ON_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOCATION__ROW_NUMBER = 6;

	/**
	 * The number of structural features of the '<em>Message Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOCATION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Message Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessagesImpl <em>Messages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessagesImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getMessages()
	 * @generated
	 */
	int MESSAGES = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES__WARNING = 1;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES__ERROR = 2;

	/**
	 * The number of structural features of the '<em>Messages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Messages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.StartTypeImpl <em>Start Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.StartTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getStartType()
	 * @generated
	 */
	int START_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__LINE = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Start Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Start Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.WarningTypeImpl <em>Warning Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.WarningTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getWarningType()
	 * @generated
	 */
	int WARNING_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_TYPE__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_TYPE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Help File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_TYPE__HELP_FILE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_TYPE__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Warning Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_TYPE__WARNING_CODE = 4;

	/**
	 * The number of structural features of the '<em>Warning Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Warning Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WARNING_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.EndType <em>End Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.EndType
	 * @generated
	 */
	EClass getEndType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.EndType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.EndType#getLine()
	 * @see #getEndType()
	 * @generated
	 */
	EAttribute getEndType_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.EndType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.EndType#getColumn()
	 * @see #getEndType()
	 * @generated
	 */
	EAttribute getEndType_Column();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType <em>Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType
	 * @generated
	 */
	EClass getErrorType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType#getLocation()
	 * @see #getErrorType()
	 * @generated
	 */
	EReference getErrorType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType#getCallstack <em>Callstack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callstack</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType#getCallstack()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_Callstack();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType#getDescription()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType#getErrorCode()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_ErrorCode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType#getHelpFile <em>Help File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help File</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType#getHelpFile()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_HelpFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.ErrorType#getSource()
	 * @see #getErrorType()
	 * @generated
	 */
	EAttribute getErrorType_Source();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation <em>Message Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation
	 * @generated
	 */
	EClass getMessageLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getStart()
	 * @see #getMessageLocation()
	 * @generated
	 */
	EReference getMessageLocation_Start();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getEnd()
	 * @see #getMessageLocation()
	 * @generated
	 */
	EReference getMessageLocation_End();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getLineOffset <em>Line Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Offset</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getLineOffset()
	 * @see #getMessageLocation()
	 * @generated
	 */
	EAttribute getMessageLocation_LineOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getTextLength <em>Text Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Length</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getTextLength()
	 * @see #getMessageLocation()
	 * @generated
	 */
	EAttribute getMessageLocation_TextLength();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getSourceObject <em>Source Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getSourceObject()
	 * @see #getMessageLocation()
	 * @generated
	 */
	EReference getMessageLocation_SourceObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getDependsOnObject <em>Depends On Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depends On Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getDependsOnObject()
	 * @see #getMessageLocation()
	 * @generated
	 */
	EReference getMessageLocation_DependsOnObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getRowNumber <em>Row Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row Number</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getRowNumber()
	 * @see #getMessageLocation()
	 * @generated
	 */
	EAttribute getMessageLocation_RowNumber();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Messages</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages
	 * @generated
	 */
	EClass getMessages();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages#getGroup()
	 * @see #getMessages()
	 * @generated
	 */
	EAttribute getMessages_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages#getWarning <em>Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Warning</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages#getWarning()
	 * @see #getMessages()
	 * @generated
	 */
	EReference getMessages_Warning();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Messages#getError()
	 * @see #getMessages()
	 * @generated
	 */
	EReference getMessages_Error();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.StartType <em>Start Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.StartType
	 * @generated
	 */
	EClass getStartType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.StartType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.StartType#getLine()
	 * @see #getStartType()
	 * @generated
	 */
	EAttribute getStartType_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.StartType#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.StartType#getColumn()
	 * @see #getStartType()
	 * @generated
	 */
	EAttribute getStartType_Column();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType <em>Warning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Warning Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType
	 * @generated
	 */
	EClass getWarningType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getLocation()
	 * @see #getWarningType()
	 * @generated
	 */
	EReference getWarningType_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getDescription()
	 * @see #getWarningType()
	 * @generated
	 */
	EAttribute getWarningType_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getHelpFile <em>Help File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Help File</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getHelpFile()
	 * @see #getWarningType()
	 * @generated
	 */
	EAttribute getWarningType_HelpFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getSource()
	 * @see #getWarningType()
	 * @generated
	 */
	EAttribute getWarningType_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getWarningCode <em>Warning Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warning Code</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getWarningCode()
	 * @see #getWarningType()
	 * @generated
	 */
	EAttribute getWarningType_WarningCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Xmla_exceptionFactory getXmla_exceptionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.EndTypeImpl <em>End Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.EndTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getEndType()
		 * @generated
		 */
		EClass END_TYPE = eINSTANCE.getEndType();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_TYPE__LINE = eINSTANCE.getEndType_Line();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_TYPE__COLUMN = eINSTANCE.getEndType_Column();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ErrorTypeImpl <em>Error Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ErrorTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getErrorType()
		 * @generated
		 */
		EClass ERROR_TYPE = eINSTANCE.getErrorType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TYPE__LOCATION = eINSTANCE.getErrorType_Location();

		/**
		 * The meta object literal for the '<em><b>Callstack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TYPE__CALLSTACK = eINSTANCE.getErrorType_Callstack();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TYPE__DESCRIPTION = eINSTANCE.getErrorType_Description();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TYPE__ERROR_CODE = eINSTANCE.getErrorType_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>Help File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TYPE__HELP_FILE = eINSTANCE.getErrorType_HelpFile();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TYPE__SOURCE = eINSTANCE.getErrorType_Source();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.ExceptionImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessageLocationImpl <em>Message Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessageLocationImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getMessageLocation()
		 * @generated
		 */
		EClass MESSAGE_LOCATION = eINSTANCE.getMessageLocation();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_LOCATION__START = eINSTANCE.getMessageLocation_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_LOCATION__END = eINSTANCE.getMessageLocation_End();

		/**
		 * The meta object literal for the '<em><b>Line Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LOCATION__LINE_OFFSET = eINSTANCE.getMessageLocation_LineOffset();

		/**
		 * The meta object literal for the '<em><b>Text Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LOCATION__TEXT_LENGTH = eINSTANCE.getMessageLocation_TextLength();

		/**
		 * The meta object literal for the '<em><b>Source Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_LOCATION__SOURCE_OBJECT = eINSTANCE.getMessageLocation_SourceObject();

		/**
		 * The meta object literal for the '<em><b>Depends On Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_LOCATION__DEPENDS_ON_OBJECT = eINSTANCE.getMessageLocation_DependsOnObject();

		/**
		 * The meta object literal for the '<em><b>Row Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_LOCATION__ROW_NUMBER = eINSTANCE.getMessageLocation_RowNumber();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessagesImpl <em>Messages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessagesImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getMessages()
		 * @generated
		 */
		EClass MESSAGES = eINSTANCE.getMessages();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGES__GROUP = eINSTANCE.getMessages_Group();

		/**
		 * The meta object literal for the '<em><b>Warning</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGES__WARNING = eINSTANCE.getMessages_Warning();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGES__ERROR = eINSTANCE.getMessages_Error();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.StartTypeImpl <em>Start Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.StartTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getStartType()
		 * @generated
		 */
		EClass START_TYPE = eINSTANCE.getStartType();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TYPE__LINE = eINSTANCE.getStartType_Line();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_TYPE__COLUMN = eINSTANCE.getStartType_Column();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.WarningTypeImpl <em>Warning Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.WarningTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.Xmla_exceptionPackageImpl#getWarningType()
		 * @generated
		 */
		EClass WARNING_TYPE = eINSTANCE.getWarningType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WARNING_TYPE__LOCATION = eINSTANCE.getWarningType_Location();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNING_TYPE__DESCRIPTION = eINSTANCE.getWarningType_Description();

		/**
		 * The meta object literal for the '<em><b>Help File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNING_TYPE__HELP_FILE = eINSTANCE.getWarningType_HelpFile();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNING_TYPE__SOURCE = eINSTANCE.getWarningType_Source();

		/**
		 * The meta object literal for the '<em><b>Warning Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WARNING_TYPE__WARNING_CODE = eINSTANCE.getWarningType_WarningCode();

	}

} //Xmla_exceptionPackage
