/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.DataAcceptedResponseStructure;
import de.jena.mdo.ibis.common.DocumentRoot;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.SubscribeRequestStructure;
import de.jena.mdo.ibis.common.SubscribeResponseStructure;
import de.jena.mdo.ibis.common.UnsubscribeRequestStructure;
import de.jena.mdo.ibis.common.UnsubscribeResponseStructure;

import de.jena.mdo.ibis.enumerations.AirSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.BusSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.CoachSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.FunicularSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.MetroSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.RailSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.SelfDriveSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.TaxiSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.TelecabinSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.TramSubmodeEnumeration;
import de.jena.mdo.ibis.enumerations.WaterSubmodeEnumeration;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
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
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getAirSubmode <em>Air Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getBusSubmode <em>Bus Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getCoachSubmode <em>Coach Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getDataAcceptedResponse <em>Data Accepted Response</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getFunicularSubmode <em>Funicular Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getMetroSubmode <em>Metro Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getRailSubmode <em>Rail Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getSelfDriveSubmode <em>Self Drive Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getSubscribeRequest <em>Subscribe Request</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getSubscribeResponse <em>Subscribe Response</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getTaxiSubmode <em>Taxi Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getTelecabinSubmode <em>Telecabin Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getTramSubmode <em>Tram Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getUnsubscribeRequest <em>Unsubscribe Request</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getUnsubscribeResponse <em>Unsubscribe Response</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DocumentRootImpl#getWaterSubmode <em>Water Submode</em>}</li>
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
	 * The default value of the '{@link #getAirSubmode() <em>Air Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final AirSubmodeEnumeration AIR_SUBMODE_EDEFAULT = AirSubmodeEnumeration.UNKNOWN;

	/**
	 * The default value of the '{@link #getBusSubmode() <em>Bus Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final BusSubmodeEnumeration BUS_SUBMODE_EDEFAULT = BusSubmodeEnumeration.UNKNOWN;

	/**
	 * The default value of the '{@link #getCoachSubmode() <em>Coach Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoachSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final CoachSubmodeEnumeration COACH_SUBMODE_EDEFAULT = CoachSubmodeEnumeration.UNKNOWN;

	/**
	 * The default value of the '{@link #getFunicularSubmode() <em>Funicular Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunicularSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final FunicularSubmodeEnumeration FUNICULAR_SUBMODE_EDEFAULT = FunicularSubmodeEnumeration.UNKNOWN;

	/**
	 * The default value of the '{@link #getMetroSubmode() <em>Metro Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetroSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final MetroSubmodeEnumeration METRO_SUBMODE_EDEFAULT = MetroSubmodeEnumeration.UNKNOWN;

	/**
	 * The default value of the '{@link #getRailSubmode() <em>Rail Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRailSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final RailSubmodeEnumeration RAIL_SUBMODE_EDEFAULT = RailSubmodeEnumeration.UNKNOWN;

	/**
	 * The default value of the '{@link #getSelfDriveSubmode() <em>Self Drive Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfDriveSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final SelfDriveSubmodeEnumeration SELF_DRIVE_SUBMODE_EDEFAULT = SelfDriveSubmodeEnumeration.UNKNOWN;

	/**
	 * The default value of the '{@link #getTaxiSubmode() <em>Taxi Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxiSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final TaxiSubmodeEnumeration TAXI_SUBMODE_EDEFAULT = TaxiSubmodeEnumeration.UNKNOWN;

	/**
	 * The default value of the '{@link #getTelecabinSubmode() <em>Telecabin Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecabinSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final TelecabinSubmodeEnumeration TELECABIN_SUBMODE_EDEFAULT = TelecabinSubmodeEnumeration.UNKNOWN;

	/**
	 * The default value of the '{@link #getTramSubmode() <em>Tram Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTramSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final TramSubmodeEnumeration TRAM_SUBMODE_EDEFAULT = TramSubmodeEnumeration.UNKNOWN;

	/**
	 * The default value of the '{@link #getWaterSubmode() <em>Water Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaterSubmode()
	 * @generated
	 * @ordered
	 */
	protected static final WaterSubmodeEnumeration WATER_SUBMODE_EDEFAULT = WaterSubmodeEnumeration.UNKNOWN;

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
		return IbisCommonPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, IbisCommonPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, IbisCommonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, IbisCommonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AirSubmodeEnumeration getAirSubmode() {
		return (AirSubmodeEnumeration)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_AirSubmode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAirSubmode(AirSubmodeEnumeration newAirSubmode) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_AirSubmode(), newAirSubmode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusSubmodeEnumeration getBusSubmode() {
		return (BusSubmodeEnumeration)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_BusSubmode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusSubmode(BusSubmodeEnumeration newBusSubmode) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_BusSubmode(), newBusSubmode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoachSubmodeEnumeration getCoachSubmode() {
		return (CoachSubmodeEnumeration)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_CoachSubmode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoachSubmode(CoachSubmodeEnumeration newCoachSubmode) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_CoachSubmode(), newCoachSubmode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataAcceptedResponseStructure getDataAcceptedResponse() {
		return (DataAcceptedResponseStructure)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_DataAcceptedResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataAcceptedResponse(DataAcceptedResponseStructure newDataAcceptedResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(IbisCommonPackage.eINSTANCE.getDocumentRoot_DataAcceptedResponse(), newDataAcceptedResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataAcceptedResponse(DataAcceptedResponseStructure newDataAcceptedResponse) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_DataAcceptedResponse(), newDataAcceptedResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunicularSubmodeEnumeration getFunicularSubmode() {
		return (FunicularSubmodeEnumeration)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_FunicularSubmode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunicularSubmode(FunicularSubmodeEnumeration newFunicularSubmode) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_FunicularSubmode(), newFunicularSubmode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetroSubmodeEnumeration getMetroSubmode() {
		return (MetroSubmodeEnumeration)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_MetroSubmode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetroSubmode(MetroSubmodeEnumeration newMetroSubmode) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_MetroSubmode(), newMetroSubmode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RailSubmodeEnumeration getRailSubmode() {
		return (RailSubmodeEnumeration)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_RailSubmode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRailSubmode(RailSubmodeEnumeration newRailSubmode) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_RailSubmode(), newRailSubmode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelfDriveSubmodeEnumeration getSelfDriveSubmode() {
		return (SelfDriveSubmodeEnumeration)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_SelfDriveSubmode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelfDriveSubmode(SelfDriveSubmodeEnumeration newSelfDriveSubmode) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_SelfDriveSubmode(), newSelfDriveSubmode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscribeRequestStructure getSubscribeRequest() {
		return (SubscribeRequestStructure)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_SubscribeRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribeRequest(SubscribeRequestStructure newSubscribeRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(IbisCommonPackage.eINSTANCE.getDocumentRoot_SubscribeRequest(), newSubscribeRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscribeRequest(SubscribeRequestStructure newSubscribeRequest) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_SubscribeRequest(), newSubscribeRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubscribeResponseStructure getSubscribeResponse() {
		return (SubscribeResponseStructure)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_SubscribeResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribeResponse(SubscribeResponseStructure newSubscribeResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(IbisCommonPackage.eINSTANCE.getDocumentRoot_SubscribeResponse(), newSubscribeResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscribeResponse(SubscribeResponseStructure newSubscribeResponse) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_SubscribeResponse(), newSubscribeResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxiSubmodeEnumeration getTaxiSubmode() {
		return (TaxiSubmodeEnumeration)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_TaxiSubmode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxiSubmode(TaxiSubmodeEnumeration newTaxiSubmode) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_TaxiSubmode(), newTaxiSubmode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TelecabinSubmodeEnumeration getTelecabinSubmode() {
		return (TelecabinSubmodeEnumeration)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_TelecabinSubmode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelecabinSubmode(TelecabinSubmodeEnumeration newTelecabinSubmode) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_TelecabinSubmode(), newTelecabinSubmode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TramSubmodeEnumeration getTramSubmode() {
		return (TramSubmodeEnumeration)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_TramSubmode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTramSubmode(TramSubmodeEnumeration newTramSubmode) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_TramSubmode(), newTramSubmode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsubscribeRequestStructure getUnsubscribeRequest() {
		return (UnsubscribeRequestStructure)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_UnsubscribeRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsubscribeRequest(UnsubscribeRequestStructure newUnsubscribeRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(IbisCommonPackage.eINSTANCE.getDocumentRoot_UnsubscribeRequest(), newUnsubscribeRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnsubscribeRequest(UnsubscribeRequestStructure newUnsubscribeRequest) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_UnsubscribeRequest(), newUnsubscribeRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnsubscribeResponseStructure getUnsubscribeResponse() {
		return (UnsubscribeResponseStructure)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_UnsubscribeResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsubscribeResponse(UnsubscribeResponseStructure newUnsubscribeResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(IbisCommonPackage.eINSTANCE.getDocumentRoot_UnsubscribeResponse(), newUnsubscribeResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnsubscribeResponse(UnsubscribeResponseStructure newUnsubscribeResponse) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_UnsubscribeResponse(), newUnsubscribeResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WaterSubmodeEnumeration getWaterSubmode() {
		return (WaterSubmodeEnumeration)getMixed().get(IbisCommonPackage.eINSTANCE.getDocumentRoot_WaterSubmode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaterSubmode(WaterSubmodeEnumeration newWaterSubmode) {
		((FeatureMap.Internal)getMixed()).set(IbisCommonPackage.eINSTANCE.getDocumentRoot_WaterSubmode(), newWaterSubmode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DOCUMENT_ROOT__DATA_ACCEPTED_RESPONSE:
				return basicSetDataAcceptedResponse(null, msgs);
			case IbisCommonPackage.DOCUMENT_ROOT__SUBSCRIBE_REQUEST:
				return basicSetSubscribeRequest(null, msgs);
			case IbisCommonPackage.DOCUMENT_ROOT__SUBSCRIBE_RESPONSE:
				return basicSetSubscribeResponse(null, msgs);
			case IbisCommonPackage.DOCUMENT_ROOT__UNSUBSCRIBE_REQUEST:
				return basicSetUnsubscribeRequest(null, msgs);
			case IbisCommonPackage.DOCUMENT_ROOT__UNSUBSCRIBE_RESPONSE:
				return basicSetUnsubscribeResponse(null, msgs);
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
			case IbisCommonPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case IbisCommonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case IbisCommonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case IbisCommonPackage.DOCUMENT_ROOT__AIR_SUBMODE:
				return getAirSubmode();
			case IbisCommonPackage.DOCUMENT_ROOT__BUS_SUBMODE:
				return getBusSubmode();
			case IbisCommonPackage.DOCUMENT_ROOT__COACH_SUBMODE:
				return getCoachSubmode();
			case IbisCommonPackage.DOCUMENT_ROOT__DATA_ACCEPTED_RESPONSE:
				return getDataAcceptedResponse();
			case IbisCommonPackage.DOCUMENT_ROOT__FUNICULAR_SUBMODE:
				return getFunicularSubmode();
			case IbisCommonPackage.DOCUMENT_ROOT__METRO_SUBMODE:
				return getMetroSubmode();
			case IbisCommonPackage.DOCUMENT_ROOT__RAIL_SUBMODE:
				return getRailSubmode();
			case IbisCommonPackage.DOCUMENT_ROOT__SELF_DRIVE_SUBMODE:
				return getSelfDriveSubmode();
			case IbisCommonPackage.DOCUMENT_ROOT__SUBSCRIBE_REQUEST:
				return getSubscribeRequest();
			case IbisCommonPackage.DOCUMENT_ROOT__SUBSCRIBE_RESPONSE:
				return getSubscribeResponse();
			case IbisCommonPackage.DOCUMENT_ROOT__TAXI_SUBMODE:
				return getTaxiSubmode();
			case IbisCommonPackage.DOCUMENT_ROOT__TELECABIN_SUBMODE:
				return getTelecabinSubmode();
			case IbisCommonPackage.DOCUMENT_ROOT__TRAM_SUBMODE:
				return getTramSubmode();
			case IbisCommonPackage.DOCUMENT_ROOT__UNSUBSCRIBE_REQUEST:
				return getUnsubscribeRequest();
			case IbisCommonPackage.DOCUMENT_ROOT__UNSUBSCRIBE_RESPONSE:
				return getUnsubscribeResponse();
			case IbisCommonPackage.DOCUMENT_ROOT__WATER_SUBMODE:
				return getWaterSubmode();
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
			case IbisCommonPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__AIR_SUBMODE:
				setAirSubmode((AirSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__BUS_SUBMODE:
				setBusSubmode((BusSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__COACH_SUBMODE:
				setCoachSubmode((CoachSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__DATA_ACCEPTED_RESPONSE:
				setDataAcceptedResponse((DataAcceptedResponseStructure)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__FUNICULAR_SUBMODE:
				setFunicularSubmode((FunicularSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__METRO_SUBMODE:
				setMetroSubmode((MetroSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__RAIL_SUBMODE:
				setRailSubmode((RailSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__SELF_DRIVE_SUBMODE:
				setSelfDriveSubmode((SelfDriveSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__SUBSCRIBE_REQUEST:
				setSubscribeRequest((SubscribeRequestStructure)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__SUBSCRIBE_RESPONSE:
				setSubscribeResponse((SubscribeResponseStructure)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__TAXI_SUBMODE:
				setTaxiSubmode((TaxiSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__TELECABIN_SUBMODE:
				setTelecabinSubmode((TelecabinSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__TRAM_SUBMODE:
				setTramSubmode((TramSubmodeEnumeration)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__UNSUBSCRIBE_REQUEST:
				setUnsubscribeRequest((UnsubscribeRequestStructure)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__UNSUBSCRIBE_RESPONSE:
				setUnsubscribeResponse((UnsubscribeResponseStructure)newValue);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__WATER_SUBMODE:
				setWaterSubmode((WaterSubmodeEnumeration)newValue);
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
			case IbisCommonPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__AIR_SUBMODE:
				setAirSubmode(AIR_SUBMODE_EDEFAULT);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__BUS_SUBMODE:
				setBusSubmode(BUS_SUBMODE_EDEFAULT);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__COACH_SUBMODE:
				setCoachSubmode(COACH_SUBMODE_EDEFAULT);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__DATA_ACCEPTED_RESPONSE:
				setDataAcceptedResponse((DataAcceptedResponseStructure)null);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__FUNICULAR_SUBMODE:
				setFunicularSubmode(FUNICULAR_SUBMODE_EDEFAULT);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__METRO_SUBMODE:
				setMetroSubmode(METRO_SUBMODE_EDEFAULT);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__RAIL_SUBMODE:
				setRailSubmode(RAIL_SUBMODE_EDEFAULT);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__SELF_DRIVE_SUBMODE:
				setSelfDriveSubmode(SELF_DRIVE_SUBMODE_EDEFAULT);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__SUBSCRIBE_REQUEST:
				setSubscribeRequest((SubscribeRequestStructure)null);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__SUBSCRIBE_RESPONSE:
				setSubscribeResponse((SubscribeResponseStructure)null);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__TAXI_SUBMODE:
				setTaxiSubmode(TAXI_SUBMODE_EDEFAULT);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__TELECABIN_SUBMODE:
				setTelecabinSubmode(TELECABIN_SUBMODE_EDEFAULT);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__TRAM_SUBMODE:
				setTramSubmode(TRAM_SUBMODE_EDEFAULT);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__UNSUBSCRIBE_REQUEST:
				setUnsubscribeRequest((UnsubscribeRequestStructure)null);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__UNSUBSCRIBE_RESPONSE:
				setUnsubscribeResponse((UnsubscribeResponseStructure)null);
				return;
			case IbisCommonPackage.DOCUMENT_ROOT__WATER_SUBMODE:
				setWaterSubmode(WATER_SUBMODE_EDEFAULT);
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
			case IbisCommonPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case IbisCommonPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case IbisCommonPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case IbisCommonPackage.DOCUMENT_ROOT__AIR_SUBMODE:
				return getAirSubmode() != AIR_SUBMODE_EDEFAULT;
			case IbisCommonPackage.DOCUMENT_ROOT__BUS_SUBMODE:
				return getBusSubmode() != BUS_SUBMODE_EDEFAULT;
			case IbisCommonPackage.DOCUMENT_ROOT__COACH_SUBMODE:
				return getCoachSubmode() != COACH_SUBMODE_EDEFAULT;
			case IbisCommonPackage.DOCUMENT_ROOT__DATA_ACCEPTED_RESPONSE:
				return getDataAcceptedResponse() != null;
			case IbisCommonPackage.DOCUMENT_ROOT__FUNICULAR_SUBMODE:
				return getFunicularSubmode() != FUNICULAR_SUBMODE_EDEFAULT;
			case IbisCommonPackage.DOCUMENT_ROOT__METRO_SUBMODE:
				return getMetroSubmode() != METRO_SUBMODE_EDEFAULT;
			case IbisCommonPackage.DOCUMENT_ROOT__RAIL_SUBMODE:
				return getRailSubmode() != RAIL_SUBMODE_EDEFAULT;
			case IbisCommonPackage.DOCUMENT_ROOT__SELF_DRIVE_SUBMODE:
				return getSelfDriveSubmode() != SELF_DRIVE_SUBMODE_EDEFAULT;
			case IbisCommonPackage.DOCUMENT_ROOT__SUBSCRIBE_REQUEST:
				return getSubscribeRequest() != null;
			case IbisCommonPackage.DOCUMENT_ROOT__SUBSCRIBE_RESPONSE:
				return getSubscribeResponse() != null;
			case IbisCommonPackage.DOCUMENT_ROOT__TAXI_SUBMODE:
				return getTaxiSubmode() != TAXI_SUBMODE_EDEFAULT;
			case IbisCommonPackage.DOCUMENT_ROOT__TELECABIN_SUBMODE:
				return getTelecabinSubmode() != TELECABIN_SUBMODE_EDEFAULT;
			case IbisCommonPackage.DOCUMENT_ROOT__TRAM_SUBMODE:
				return getTramSubmode() != TRAM_SUBMODE_EDEFAULT;
			case IbisCommonPackage.DOCUMENT_ROOT__UNSUBSCRIBE_REQUEST:
				return getUnsubscribeRequest() != null;
			case IbisCommonPackage.DOCUMENT_ROOT__UNSUBSCRIBE_RESPONSE:
				return getUnsubscribeResponse() != null;
			case IbisCommonPackage.DOCUMENT_ROOT__WATER_SUBMODE:
				return getWaterSubmode() != WATER_SUBMODE_EDEFAULT;
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
