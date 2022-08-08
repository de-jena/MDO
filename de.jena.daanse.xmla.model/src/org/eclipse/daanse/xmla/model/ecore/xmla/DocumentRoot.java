/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getAllowedRowsExpression <em>Allowed Rows Expression</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getBeginSession <em>Begin Session</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getClearResult <em>Clear Result</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getDiscover <em>Discover</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getDiscoverResponse <em>Discover Response</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getEndSession <em>End Session</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getEventSession <em>Event Session</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getExecute <em>Execute</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getExecuteResponse <em>Execute Response</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getKeepResult <em>Keep Result</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getSession <em>Session</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getShareDimensionStorage <em>Share Dimension Storage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(ActionType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_Action()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='action' namespace='##targetNamespace'"
	 * @generated
	 */
	ActionType getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(ActionType value);

	/**
	 * Returns the value of the '<em><b>Allowed Rows Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Rows Expression</em>' attribute.
	 * @see #setAllowedRowsExpression(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_AllowedRowsExpression()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AllowedRowsExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAllowedRowsExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getAllowedRowsExpression <em>Allowed Rows Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Rows Expression</em>' attribute.
	 * @see #getAllowedRowsExpression()
	 * @generated
	 */
	void setAllowedRowsExpression(String value);

	/**
	 * Returns the value of the '<em><b>Begin Session</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin Session</em>' containment reference.
	 * @see #setBeginSession(BeginSessionType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_BeginSession()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BeginSession' namespace='##targetNamespace'"
	 * @generated
	 */
	BeginSessionType getBeginSession();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getBeginSession <em>Begin Session</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin Session</em>' containment reference.
	 * @see #getBeginSession()
	 * @generated
	 */
	void setBeginSession(BeginSessionType value);

	/**
	 * Returns the value of the '<em><b>Clear Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clear Result</em>' containment reference.
	 * @see #setClearResult(ClearResultType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_ClearResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClearResult' namespace='##targetNamespace'"
	 * @generated
	 */
	ClearResultType getClearResult();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getClearResult <em>Clear Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clear Result</em>' containment reference.
	 * @see #getClearResult()
	 * @generated
	 */
	void setClearResult(ClearResultType value);

	/**
	 * Returns the value of the '<em><b>Discover</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discover</em>' containment reference.
	 * @see #setDiscover(DiscoverType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_Discover()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Discover' namespace='##targetNamespace'"
	 * @generated
	 */
	DiscoverType getDiscover();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getDiscover <em>Discover</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discover</em>' containment reference.
	 * @see #getDiscover()
	 * @generated
	 */
	void setDiscover(DiscoverType value);

	/**
	 * Returns the value of the '<em><b>Discover Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discover Response</em>' containment reference.
	 * @see #setDiscoverResponse(DiscoverResponseType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_DiscoverResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DiscoverResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DiscoverResponseType getDiscoverResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getDiscoverResponse <em>Discover Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discover Response</em>' containment reference.
	 * @see #getDiscoverResponse()
	 * @generated
	 */
	void setDiscoverResponse(DiscoverResponseType value);

	/**
	 * Returns the value of the '<em><b>End Session</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Session</em>' containment reference.
	 * @see #setEndSession(EndSessionType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_EndSession()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EndSession' namespace='##targetNamespace'"
	 * @generated
	 */
	EndSessionType getEndSession();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getEndSession <em>End Session</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Session</em>' containment reference.
	 * @see #getEndSession()
	 * @generated
	 */
	void setEndSession(EndSessionType value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(EventType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_Event()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
	 * @generated
	 */
	EventType1 getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventType1 value);

	/**
	 * Returns the value of the '<em><b>Event Session</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Session</em>' containment reference.
	 * @see #setEventSession(EventSessionType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_EventSession()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='event_session' namespace='##targetNamespace'"
	 * @generated
	 */
	EventSessionType getEventSession();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getEventSession <em>Event Session</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Session</em>' containment reference.
	 * @see #getEventSession()
	 * @generated
	 */
	void setEventSession(EventSessionType value);

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' containment reference.
	 * @see #setEventType(EventTypeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_EventType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EventType' namespace='##targetNamespace'"
	 * @generated
	 */
	EventTypeType getEventType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getEventType <em>Event Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' containment reference.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventTypeType value);

	/**
	 * Returns the value of the '<em><b>Execute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' containment reference.
	 * @see #setExecute(ExecuteType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_Execute()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Execute' namespace='##targetNamespace'"
	 * @generated
	 */
	ExecuteType getExecute();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getExecute <em>Execute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute</em>' containment reference.
	 * @see #getExecute()
	 * @generated
	 */
	void setExecute(ExecuteType value);

	/**
	 * Returns the value of the '<em><b>Execute Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute Response</em>' containment reference.
	 * @see #setExecuteResponse(ExecuteResponseType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_ExecuteResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExecuteResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ExecuteResponseType getExecuteResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getExecuteResponse <em>Execute Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute Response</em>' containment reference.
	 * @see #getExecuteResponse()
	 * @generated
	 */
	void setExecuteResponse(ExecuteResponseType value);

	/**
	 * Returns the value of the '<em><b>Keep Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Result</em>' containment reference.
	 * @see #setKeepResult(KeepResultType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_KeepResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeepResult' namespace='##targetNamespace'"
	 * @generated
	 */
	KeepResultType getKeepResult();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getKeepResult <em>Keep Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Result</em>' containment reference.
	 * @see #getKeepResult()
	 * @generated
	 */
	void setKeepResult(KeepResultType value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(ParameterType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_Parameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterType2 getParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterType2 value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(ResultType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_Result()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Result' namespace='##targetNamespace'"
	 * @generated
	 */
	ResultType getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(ResultType value);

	/**
	 * Returns the value of the '<em><b>Session</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' containment reference.
	 * @see #setSession(SessionType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_Session()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Session' namespace='##targetNamespace'"
	 * @generated
	 */
	SessionType getSession();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getSession <em>Session</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session</em>' containment reference.
	 * @see #getSession()
	 * @generated
	 */
	void setSession(SessionType value);

	/**
	 * Returns the value of the '<em><b>Share Dimension Storage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ShareDimensionStorageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share Dimension Storage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ShareDimensionStorageType
	 * @see #setShareDimensionStorage(ShareDimensionStorageType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_ShareDimensionStorage()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ShareDimensionStorage' namespace='##targetNamespace'"
	 * @generated
	 */
	ShareDimensionStorageType getShareDimensionStorage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getShareDimensionStorage <em>Share Dimension Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share Dimension Storage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ShareDimensionStorageType
	 * @see #getShareDimensionStorage()
	 * @generated
	 */
	void setShareDimensionStorage(ShareDimensionStorageType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(TargetType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDocumentRoot_Target()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetType getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetType value);

} // DocumentRoot
