/*
 */
package de.jena.mdo.ibis.common;

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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getAirSubmode <em>Air Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getBusSubmode <em>Bus Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getCoachSubmode <em>Coach Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getDataAcceptedResponse <em>Data Accepted Response</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getFunicularSubmode <em>Funicular Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getMetroSubmode <em>Metro Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getRailSubmode <em>Rail Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getSelfDriveSubmode <em>Self Drive Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getSubscribeRequest <em>Subscribe Request</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getSubscribeResponse <em>Subscribe Response</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getTaxiSubmode <em>Taxi Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getTelecabinSubmode <em>Telecabin Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getTramSubmode <em>Tram Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getUnsubscribeRequest <em>Unsubscribe Request</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getUnsubscribeResponse <em>Unsubscribe Response</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.DocumentRoot#getWaterSubmode <em>Water Submode</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_Mixed()
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
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Air Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.AirSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti08 Air submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Air Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.AirSubmodeEnumeration
	 * @see #setAirSubmode(AirSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_AirSubmode()
	 * @model default="unknown" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AirSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	AirSubmodeEnumeration getAirSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getAirSubmode <em>Air Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.AirSubmodeEnumeration
	 * @see #getAirSubmode()
	 * @generated
	 */
	void setAirSubmode(AirSubmodeEnumeration value);

	/**
	 * Returns the value of the '<em><b>Bus Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.BusSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti05 Bus submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.BusSubmodeEnumeration
	 * @see #setBusSubmode(BusSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_BusSubmode()
	 * @model default="unknown" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BusSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	BusSubmodeEnumeration getBusSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getBusSubmode <em>Bus Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.BusSubmodeEnumeration
	 * @see #getBusSubmode()
	 * @generated
	 */
	void setBusSubmode(BusSubmodeEnumeration value);

	/**
	 * Returns the value of the '<em><b>Coach Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.CoachSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti03 Coach submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coach Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.CoachSubmodeEnumeration
	 * @see #setCoachSubmode(CoachSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_CoachSubmode()
	 * @model default="unknown" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CoachSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	CoachSubmodeEnumeration getCoachSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getCoachSubmode <em>Coach Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coach Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.CoachSubmodeEnumeration
	 * @see #getCoachSubmode()
	 * @generated
	 */
	void setCoachSubmode(CoachSubmodeEnumeration value);

	/**
	 * Returns the value of the '<em><b>Data Accepted Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Accepted Response</em>' containment reference.
	 * @see #setDataAcceptedResponse(DataAcceptedResponseStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_DataAcceptedResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataAcceptedResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	DataAcceptedResponseStructure getDataAcceptedResponse();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getDataAcceptedResponse <em>Data Accepted Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Accepted Response</em>' containment reference.
	 * @see #getDataAcceptedResponse()
	 * @generated
	 */
	void setDataAcceptedResponse(DataAcceptedResponseStructure value);

	/**
	 * Returns the value of the '<em><b>Funicular Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.FunicularSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti10 Funicular submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Funicular Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.FunicularSubmodeEnumeration
	 * @see #setFunicularSubmode(FunicularSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_FunicularSubmode()
	 * @model default="unknown" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FunicularSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	FunicularSubmodeEnumeration getFunicularSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getFunicularSubmode <em>Funicular Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funicular Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.FunicularSubmodeEnumeration
	 * @see #getFunicularSubmode()
	 * @generated
	 */
	void setFunicularSubmode(FunicularSubmodeEnumeration value);

	/**
	 * Returns the value of the '<em><b>Metro Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.MetroSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti04 Metro submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metro Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.MetroSubmodeEnumeration
	 * @see #setMetroSubmode(MetroSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_MetroSubmode()
	 * @model default="unknown" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MetroSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	MetroSubmodeEnumeration getMetroSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getMetroSubmode <em>Metro Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metro Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.MetroSubmodeEnumeration
	 * @see #getMetroSubmode()
	 * @generated
	 */
	void setMetroSubmode(MetroSubmodeEnumeration value);

	/**
	 * Returns the value of the '<em><b>Rail Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.RailSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti02 Rail submodes loc13.
	 * 			See also See ERA B.4.7009 - Name: Item description code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rail Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.RailSubmodeEnumeration
	 * @see #setRailSubmode(RailSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_RailSubmode()
	 * @model default="unknown" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RailSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	RailSubmodeEnumeration getRailSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getRailSubmode <em>Rail Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rail Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.RailSubmodeEnumeration
	 * @see #getRailSubmode()
	 * @generated
	 */
	void setRailSubmode(RailSubmodeEnumeration value);

	/**
	 * Returns the value of the '<em><b>Self Drive Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.SelfDriveSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti12 SelfDrive submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Self Drive Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.SelfDriveSubmodeEnumeration
	 * @see #setSelfDriveSubmode(SelfDriveSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_SelfDriveSubmode()
	 * @model default="unknown" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SelfDriveSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	SelfDriveSubmodeEnumeration getSelfDriveSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getSelfDriveSubmode <em>Self Drive Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Drive Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.SelfDriveSubmodeEnumeration
	 * @see #getSelfDriveSubmode()
	 * @generated
	 */
	void setSelfDriveSubmode(SelfDriveSubmodeEnumeration value);

	/**
	 * Returns the value of the '<em><b>Subscribe Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe Request</em>' containment reference.
	 * @see #setSubscribeRequest(SubscribeRequestStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_SubscribeRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubscribeRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscribeRequestStructure getSubscribeRequest();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getSubscribeRequest <em>Subscribe Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe Request</em>' containment reference.
	 * @see #getSubscribeRequest()
	 * @generated
	 */
	void setSubscribeRequest(SubscribeRequestStructure value);

	/**
	 * Returns the value of the '<em><b>Subscribe Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe Response</em>' containment reference.
	 * @see #setSubscribeResponse(SubscribeResponseStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_SubscribeResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubscribeResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscribeResponseStructure getSubscribeResponse();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getSubscribeResponse <em>Subscribe Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe Response</em>' containment reference.
	 * @see #getSubscribeResponse()
	 * @generated
	 */
	void setSubscribeResponse(SubscribeResponseStructure value);

	/**
	 * Returns the value of the '<em><b>Taxi Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.TaxiSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti11 Taxi submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taxi Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.TaxiSubmodeEnumeration
	 * @see #setTaxiSubmode(TaxiSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_TaxiSubmode()
	 * @model default="unknown" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TaxiSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxiSubmodeEnumeration getTaxiSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getTaxiSubmode <em>Taxi Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxi Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.TaxiSubmodeEnumeration
	 * @see #getTaxiSubmode()
	 * @generated
	 */
	void setTaxiSubmode(TaxiSubmodeEnumeration value);

	/**
	 * Returns the value of the '<em><b>Telecabin Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.TelecabinSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti09 Telecabin submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecabin Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.TelecabinSubmodeEnumeration
	 * @see #setTelecabinSubmode(TelecabinSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_TelecabinSubmode()
	 * @model default="unknown" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TelecabinSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	TelecabinSubmodeEnumeration getTelecabinSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getTelecabinSubmode <em>Telecabin Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telecabin Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.TelecabinSubmodeEnumeration
	 * @see #getTelecabinSubmode()
	 * @generated
	 */
	void setTelecabinSubmode(TelecabinSubmodeEnumeration value);

	/**
	 * Returns the value of the '<em><b>Tram Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.TramSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti06 Tram submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tram Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.TramSubmodeEnumeration
	 * @see #setTramSubmode(TramSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_TramSubmode()
	 * @model default="unknown" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TramSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	TramSubmodeEnumeration getTramSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getTramSubmode <em>Tram Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tram Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.TramSubmodeEnumeration
	 * @see #getTramSubmode()
	 * @generated
	 */
	void setTramSubmode(TramSubmodeEnumeration value);

	/**
	 * Returns the value of the '<em><b>Unsubscribe Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsubscribe Request</em>' containment reference.
	 * @see #setUnsubscribeRequest(UnsubscribeRequestStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_UnsubscribeRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnsubscribeRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsubscribeRequestStructure getUnsubscribeRequest();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getUnsubscribeRequest <em>Unsubscribe Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsubscribe Request</em>' containment reference.
	 * @see #getUnsubscribeRequest()
	 * @generated
	 */
	void setUnsubscribeRequest(UnsubscribeRequestStructure value);

	/**
	 * Returns the value of the '<em><b>Unsubscribe Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsubscribe Response</em>' containment reference.
	 * @see #setUnsubscribeResponse(UnsubscribeResponseStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_UnsubscribeResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnsubscribeResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsubscribeResponseStructure getUnsubscribeResponse();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getUnsubscribeResponse <em>Unsubscribe Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsubscribe Response</em>' containment reference.
	 * @see #getUnsubscribeResponse()
	 * @generated
	 */
	void setUnsubscribeResponse(UnsubscribeResponseStructure value);

	/**
	 * Returns the value of the '<em><b>Water Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.WaterSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti07 Water submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Water Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.WaterSubmodeEnumeration
	 * @see #setWaterSubmode(WaterSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getDocumentRoot_WaterSubmode()
	 * @model default="unknown" unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WaterSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	WaterSubmodeEnumeration getWaterSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.DocumentRoot#getWaterSubmode <em>Water Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.WaterSubmodeEnumeration
	 * @see #getWaterSubmode()
	 * @generated
	 */
	void setWaterSubmode(WaterSubmodeEnumeration value);

} // DocumentRoot