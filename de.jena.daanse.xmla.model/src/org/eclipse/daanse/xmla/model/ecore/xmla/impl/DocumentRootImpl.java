/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.ActionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.BeginSessionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ClearResultType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverResponseType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DiscoverType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DocumentRoot;
import org.eclipse.daanse.xmla.model.ecore.xmla.EndSessionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventSessionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteResponseType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ExecuteType;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeepResultType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ParameterType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.ResultType;
import org.eclipse.daanse.xmla.model.ecore.xmla.SessionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ShareDimensionStorageType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TargetType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getAllowedRowsExpression <em>Allowed Rows Expression</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getBeginSession <em>Begin Session</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getClearResult <em>Clear Result</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getDiscover <em>Discover</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getDiscoverResponse <em>Discover Response</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getEndSession <em>End Session</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getEventSession <em>Event Session</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getEventType <em>Event Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getExecute <em>Execute</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getExecuteResponse <em>Execute Response</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getKeepResult <em>Keep Result</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getSession <em>Session</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getShareDimensionStorage <em>Share Dimension Storage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DocumentRootImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAllowedRowsExpression() <em>Allowed Rows Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedRowsExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_ROWS_EXPRESSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getShareDimensionStorage() <em>Share Dimension Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareDimensionStorage()
	 * @generated
	 * @ordered
	 */
	protected static final ShareDimensionStorageType SHARE_DIMENSION_STORAGE_EDEFAULT = ShareDimensionStorageType.DISTINCT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XmlaPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(XmlaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP).getEType(), EStringToStringMapEntryImpl.class, this, XmlaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>((EClass) eStaticClass().getEStructuralFeature(XmlaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION).getEType(), EStringToStringMapEntryImpl.class, this, XmlaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getAction() {
		return (ActionType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(ActionType newAction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__ACTION, newAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionType newAction) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowedRowsExpression() {
		return (String)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedRowsExpression(String newAllowedRowsExpression) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION, newAllowedRowsExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeginSessionType getBeginSession() {
		return (BeginSessionType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__BEGIN_SESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeginSession(BeginSessionType newBeginSession, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__BEGIN_SESSION, newBeginSession, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeginSession(BeginSessionType newBeginSession) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__BEGIN_SESSION, newBeginSession);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClearResultType getClearResult() {
		return (ClearResultType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__CLEAR_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClearResult(ClearResultType newClearResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__CLEAR_RESULT, newClearResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClearResult(ClearResultType newClearResult) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__CLEAR_RESULT, newClearResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoverType getDiscover() {
		return (DiscoverType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__DISCOVER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscover(DiscoverType newDiscover, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__DISCOVER, newDiscover, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscover(DiscoverType newDiscover) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__DISCOVER, newDiscover);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoverResponseType getDiscoverResponse() {
		return (DiscoverResponseType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__DISCOVER_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscoverResponse(DiscoverResponseType newDiscoverResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__DISCOVER_RESPONSE, newDiscoverResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoverResponse(DiscoverResponseType newDiscoverResponse) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__DISCOVER_RESPONSE, newDiscoverResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndSessionType getEndSession() {
		return (EndSessionType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__END_SESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndSession(EndSessionType newEndSession, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__END_SESSION, newEndSession, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndSession(EndSessionType newEndSession) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__END_SESSION, newEndSession);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType1 getEvent() {
		return (EventType1)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__EVENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(EventType1 newEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__EVENT, newEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(EventType1 newEvent) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__EVENT, newEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventSessionType getEventSession() {
		return (EventSessionType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__EVENT_SESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventSession(EventSessionType newEventSession, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__EVENT_SESSION, newEventSession, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventSession(EventSessionType newEventSession) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__EVENT_SESSION, newEventSession);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTypeType getEventType() {
		return (EventTypeType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__EVENT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventType(EventTypeType newEventType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__EVENT_TYPE, newEventType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventType(EventTypeType newEventType) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__EVENT_TYPE, newEventType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteType getExecute() {
		return (ExecuteType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__EXECUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecute(ExecuteType newExecute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__EXECUTE, newExecute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecute(ExecuteType newExecute) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__EXECUTE, newExecute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteResponseType getExecuteResponse() {
		return (ExecuteResponseType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__EXECUTE_RESPONSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecuteResponse(ExecuteResponseType newExecuteResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__EXECUTE_RESPONSE, newExecuteResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecuteResponse(ExecuteResponseType newExecuteResponse) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__EXECUTE_RESPONSE, newExecuteResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeepResultType getKeepResult() {
		return (KeepResultType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__KEEP_RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeepResult(KeepResultType newKeepResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__KEEP_RESULT, newKeepResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeepResult(KeepResultType newKeepResult) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__KEEP_RESULT, newKeepResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType2 getParameter() {
		return (ParameterType2)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(ParameterType2 newParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__PARAMETER, newParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(ParameterType2 newParameter) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__PARAMETER, newParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType getResult() {
		return (ResultType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__RESULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(ResultType newResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__RESULT, newResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(ResultType newResult) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__RESULT, newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SessionType getSession() {
		return (SessionType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__SESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSession(SessionType newSession, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__SESSION, newSession, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSession(SessionType newSession) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__SESSION, newSession);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShareDimensionStorageType getShareDimensionStorage() {
		return (ShareDimensionStorageType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShareDimensionStorage(ShareDimensionStorageType newShareDimensionStorage) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE, newShareDimensionStorage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType getTarget() {
		return (TargetType)getMixed().get(XmlaPackage.Literals.DOCUMENT_ROOT__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(TargetType newTarget, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XmlaPackage.Literals.DOCUMENT_ROOT__TARGET, newTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TargetType newTarget) {
		((FeatureMap.Internal)getMixed()).set(XmlaPackage.Literals.DOCUMENT_ROOT__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XmlaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case XmlaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case XmlaPackage.DOCUMENT_ROOT__ACTION:
				return basicSetAction(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__BEGIN_SESSION:
				return basicSetBeginSession(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__CLEAR_RESULT:
				return basicSetClearResult(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__DISCOVER:
				return basicSetDiscover(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__DISCOVER_RESPONSE:
				return basicSetDiscoverResponse(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__END_SESSION:
				return basicSetEndSession(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__EVENT:
				return basicSetEvent(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__EVENT_SESSION:
				return basicSetEventSession(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__EVENT_TYPE:
				return basicSetEventType(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__EXECUTE:
				return basicSetExecute(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__EXECUTE_RESPONSE:
				return basicSetExecuteResponse(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__KEEP_RESULT:
				return basicSetKeepResult(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__PARAMETER:
				return basicSetParameter(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__RESULT:
				return basicSetResult(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__SESSION:
				return basicSetSession(null, msgs);
			case XmlaPackage.DOCUMENT_ROOT__TARGET:
				return basicSetTarget(null, msgs);
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
			case XmlaPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XmlaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case XmlaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case XmlaPackage.DOCUMENT_ROOT__ACTION:
				return getAction();
			case XmlaPackage.DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION:
				return getAllowedRowsExpression();
			case XmlaPackage.DOCUMENT_ROOT__BEGIN_SESSION:
				return getBeginSession();
			case XmlaPackage.DOCUMENT_ROOT__CLEAR_RESULT:
				return getClearResult();
			case XmlaPackage.DOCUMENT_ROOT__DISCOVER:
				return getDiscover();
			case XmlaPackage.DOCUMENT_ROOT__DISCOVER_RESPONSE:
				return getDiscoverResponse();
			case XmlaPackage.DOCUMENT_ROOT__END_SESSION:
				return getEndSession();
			case XmlaPackage.DOCUMENT_ROOT__EVENT:
				return getEvent();
			case XmlaPackage.DOCUMENT_ROOT__EVENT_SESSION:
				return getEventSession();
			case XmlaPackage.DOCUMENT_ROOT__EVENT_TYPE:
				return getEventType();
			case XmlaPackage.DOCUMENT_ROOT__EXECUTE:
				return getExecute();
			case XmlaPackage.DOCUMENT_ROOT__EXECUTE_RESPONSE:
				return getExecuteResponse();
			case XmlaPackage.DOCUMENT_ROOT__KEEP_RESULT:
				return getKeepResult();
			case XmlaPackage.DOCUMENT_ROOT__PARAMETER:
				return getParameter();
			case XmlaPackage.DOCUMENT_ROOT__RESULT:
				return getResult();
			case XmlaPackage.DOCUMENT_ROOT__SESSION:
				return getSession();
			case XmlaPackage.DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE:
				return getShareDimensionStorage();
			case XmlaPackage.DOCUMENT_ROOT__TARGET:
				return getTarget();
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
			case XmlaPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__ACTION:
				setAction((ActionType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION:
				setAllowedRowsExpression((String)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__BEGIN_SESSION:
				setBeginSession((BeginSessionType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__CLEAR_RESULT:
				setClearResult((ClearResultType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__DISCOVER:
				setDiscover((DiscoverType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__DISCOVER_RESPONSE:
				setDiscoverResponse((DiscoverResponseType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__END_SESSION:
				setEndSession((EndSessionType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__EVENT:
				setEvent((EventType1)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__EVENT_SESSION:
				setEventSession((EventSessionType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__EVENT_TYPE:
				setEventType((EventTypeType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__EXECUTE:
				setExecute((ExecuteType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__EXECUTE_RESPONSE:
				setExecuteResponse((ExecuteResponseType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__KEEP_RESULT:
				setKeepResult((KeepResultType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__PARAMETER:
				setParameter((ParameterType2)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__RESULT:
				setResult((ResultType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__SESSION:
				setSession((SessionType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE:
				setShareDimensionStorage((ShareDimensionStorageType)newValue);
				return;
			case XmlaPackage.DOCUMENT_ROOT__TARGET:
				setTarget((TargetType)newValue);
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
			case XmlaPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case XmlaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case XmlaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case XmlaPackage.DOCUMENT_ROOT__ACTION:
				setAction((ActionType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION:
				setAllowedRowsExpression(ALLOWED_ROWS_EXPRESSION_EDEFAULT);
				return;
			case XmlaPackage.DOCUMENT_ROOT__BEGIN_SESSION:
				setBeginSession((BeginSessionType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__CLEAR_RESULT:
				setClearResult((ClearResultType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__DISCOVER:
				setDiscover((DiscoverType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__DISCOVER_RESPONSE:
				setDiscoverResponse((DiscoverResponseType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__END_SESSION:
				setEndSession((EndSessionType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__EVENT:
				setEvent((EventType1)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__EVENT_SESSION:
				setEventSession((EventSessionType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__EVENT_TYPE:
				setEventType((EventTypeType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__EXECUTE:
				setExecute((ExecuteType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__EXECUTE_RESPONSE:
				setExecuteResponse((ExecuteResponseType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__KEEP_RESULT:
				setKeepResult((KeepResultType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__PARAMETER:
				setParameter((ParameterType2)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__RESULT:
				setResult((ResultType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__SESSION:
				setSession((SessionType)null);
				return;
			case XmlaPackage.DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE:
				setShareDimensionStorage(SHARE_DIMENSION_STORAGE_EDEFAULT);
				return;
			case XmlaPackage.DOCUMENT_ROOT__TARGET:
				setTarget((TargetType)null);
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
			case XmlaPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XmlaPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case XmlaPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case XmlaPackage.DOCUMENT_ROOT__ACTION:
				return getAction() != null;
			case XmlaPackage.DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION:
				return ALLOWED_ROWS_EXPRESSION_EDEFAULT == null ? getAllowedRowsExpression() != null : !ALLOWED_ROWS_EXPRESSION_EDEFAULT.equals(getAllowedRowsExpression());
			case XmlaPackage.DOCUMENT_ROOT__BEGIN_SESSION:
				return getBeginSession() != null;
			case XmlaPackage.DOCUMENT_ROOT__CLEAR_RESULT:
				return getClearResult() != null;
			case XmlaPackage.DOCUMENT_ROOT__DISCOVER:
				return getDiscover() != null;
			case XmlaPackage.DOCUMENT_ROOT__DISCOVER_RESPONSE:
				return getDiscoverResponse() != null;
			case XmlaPackage.DOCUMENT_ROOT__END_SESSION:
				return getEndSession() != null;
			case XmlaPackage.DOCUMENT_ROOT__EVENT:
				return getEvent() != null;
			case XmlaPackage.DOCUMENT_ROOT__EVENT_SESSION:
				return getEventSession() != null;
			case XmlaPackage.DOCUMENT_ROOT__EVENT_TYPE:
				return getEventType() != null;
			case XmlaPackage.DOCUMENT_ROOT__EXECUTE:
				return getExecute() != null;
			case XmlaPackage.DOCUMENT_ROOT__EXECUTE_RESPONSE:
				return getExecuteResponse() != null;
			case XmlaPackage.DOCUMENT_ROOT__KEEP_RESULT:
				return getKeepResult() != null;
			case XmlaPackage.DOCUMENT_ROOT__PARAMETER:
				return getParameter() != null;
			case XmlaPackage.DOCUMENT_ROOT__RESULT:
				return getResult() != null;
			case XmlaPackage.DOCUMENT_ROOT__SESSION:
				return getSession() != null;
			case XmlaPackage.DOCUMENT_ROOT__SHARE_DIMENSION_STORAGE:
				return getShareDimensionStorage() != SHARE_DIMENSION_STORAGE_EDEFAULT;
			case XmlaPackage.DOCUMENT_ROOT__TARGET:
				return getTarget() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
