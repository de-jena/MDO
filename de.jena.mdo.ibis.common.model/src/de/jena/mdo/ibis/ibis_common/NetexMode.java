/*
 */
package de.jena.mdo.ibis.ibis_common;

import de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration;
import de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Netex Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * a combined Mode and SubMode information in accordance with Netex "netex_submode_version.xsd"
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getPtMainMode <em>Pt Main Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getPrivateMainMode <em>Private Main Mode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getAirSubmode <em>Air Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getBusSubmode <em>Bus Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getCoachSubmode <em>Coach Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getFunicularSubmode <em>Funicular Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getMetroSubmode <em>Metro Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTramSubmode <em>Tram Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTelecabinSubmode <em>Telecabin Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getRailSubmode <em>Rail Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getWaterSubmode <em>Water Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTaxiSubmode <em>Taxi Submode</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.NetexMode#getSelfDriveSubmode <em>Self Drive Submode</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode()
 * @model extendedMetaData="name='NetexMode' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NetexMode extends EObject {
	/**
	 * Returns the value of the '<em><b>Pt Main Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pt Main Mode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration
	 * @see #isSetPtMainMode()
	 * @see #unsetPtMainMode()
	 * @see #setPtMainMode(PtSubModesEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_PtMainMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PtMainMode' namespace='##targetNamespace'"
	 * @generated
	 */
	PtSubModesEnumeration getPtMainMode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getPtMainMode <em>Pt Main Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pt Main Mode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.PtSubModesEnumeration
	 * @see #isSetPtMainMode()
	 * @see #unsetPtMainMode()
	 * @see #getPtMainMode()
	 * @generated
	 */
	void setPtMainMode(PtSubModesEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getPtMainMode <em>Pt Main Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPtMainMode()
	 * @see #getPtMainMode()
	 * @see #setPtMainMode(PtSubModesEnumeration)
	 * @generated
	 */
	void unsetPtMainMode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getPtMainMode <em>Pt Main Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pt Main Mode</em>' attribute is set.
	 * @see #unsetPtMainMode()
	 * @see #getPtMainMode()
	 * @see #setPtMainMode(PtSubModesEnumeration)
	 * @generated
	 */
	boolean isSetPtMainMode();

	/**
	 * Returns the value of the '<em><b>Private Main Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Main Mode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration
	 * @see #isSetPrivateMainMode()
	 * @see #unsetPrivateMainMode()
	 * @see #setPrivateMainMode(PrivateSubModesEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_PrivateMainMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='PrivateMainMode' namespace='##targetNamespace'"
	 * @generated
	 */
	PrivateSubModesEnumeration getPrivateMainMode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getPrivateMainMode <em>Private Main Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Main Mode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.PrivateSubModesEnumeration
	 * @see #isSetPrivateMainMode()
	 * @see #unsetPrivateMainMode()
	 * @see #getPrivateMainMode()
	 * @generated
	 */
	void setPrivateMainMode(PrivateSubModesEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getPrivateMainMode <em>Private Main Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrivateMainMode()
	 * @see #getPrivateMainMode()
	 * @see #setPrivateMainMode(PrivateSubModesEnumeration)
	 * @generated
	 */
	void unsetPrivateMainMode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getPrivateMainMode <em>Private Main Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Private Main Mode</em>' attribute is set.
	 * @see #unsetPrivateMainMode()
	 * @see #getPrivateMainMode()
	 * @see #setPrivateMainMode(PrivateSubModesEnumeration)
	 * @generated
	 */
	boolean isSetPrivateMainMode();

	/**
	 * Returns the value of the '<em><b>Air Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti08 Air submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Air Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration
	 * @see #isSetAirSubmode()
	 * @see #unsetAirSubmode()
	 * @see #setAirSubmode(AirSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_AirSubmode()
	 * @model default="unknown" unsettable="true"
	 *        extendedMetaData="kind='element' name='AirSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	AirSubmodeEnumeration getAirSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getAirSubmode <em>Air Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Air Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.AirSubmodeEnumeration
	 * @see #isSetAirSubmode()
	 * @see #unsetAirSubmode()
	 * @see #getAirSubmode()
	 * @generated
	 */
	void setAirSubmode(AirSubmodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getAirSubmode <em>Air Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAirSubmode()
	 * @see #getAirSubmode()
	 * @see #setAirSubmode(AirSubmodeEnumeration)
	 * @generated
	 */
	void unsetAirSubmode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getAirSubmode <em>Air Submode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Air Submode</em>' attribute is set.
	 * @see #unsetAirSubmode()
	 * @see #getAirSubmode()
	 * @see #setAirSubmode(AirSubmodeEnumeration)
	 * @generated
	 */
	boolean isSetAirSubmode();

	/**
	 * Returns the value of the '<em><b>Bus Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti05 Bus submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bus Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration
	 * @see #isSetBusSubmode()
	 * @see #unsetBusSubmode()
	 * @see #setBusSubmode(BusSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_BusSubmode()
	 * @model default="unknown" unsettable="true"
	 *        extendedMetaData="kind='element' name='BusSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	BusSubmodeEnumeration getBusSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getBusSubmode <em>Bus Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.BusSubmodeEnumeration
	 * @see #isSetBusSubmode()
	 * @see #unsetBusSubmode()
	 * @see #getBusSubmode()
	 * @generated
	 */
	void setBusSubmode(BusSubmodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getBusSubmode <em>Bus Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBusSubmode()
	 * @see #getBusSubmode()
	 * @see #setBusSubmode(BusSubmodeEnumeration)
	 * @generated
	 */
	void unsetBusSubmode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getBusSubmode <em>Bus Submode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bus Submode</em>' attribute is set.
	 * @see #unsetBusSubmode()
	 * @see #getBusSubmode()
	 * @see #setBusSubmode(BusSubmodeEnumeration)
	 * @generated
	 */
	boolean isSetBusSubmode();

	/**
	 * Returns the value of the '<em><b>Coach Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti03 Coach submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coach Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration
	 * @see #isSetCoachSubmode()
	 * @see #unsetCoachSubmode()
	 * @see #setCoachSubmode(CoachSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_CoachSubmode()
	 * @model default="unknown" unsettable="true"
	 *        extendedMetaData="kind='element' name='CoachSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	CoachSubmodeEnumeration getCoachSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getCoachSubmode <em>Coach Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coach Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.CoachSubmodeEnumeration
	 * @see #isSetCoachSubmode()
	 * @see #unsetCoachSubmode()
	 * @see #getCoachSubmode()
	 * @generated
	 */
	void setCoachSubmode(CoachSubmodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getCoachSubmode <em>Coach Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoachSubmode()
	 * @see #getCoachSubmode()
	 * @see #setCoachSubmode(CoachSubmodeEnumeration)
	 * @generated
	 */
	void unsetCoachSubmode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getCoachSubmode <em>Coach Submode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Coach Submode</em>' attribute is set.
	 * @see #unsetCoachSubmode()
	 * @see #getCoachSubmode()
	 * @see #setCoachSubmode(CoachSubmodeEnumeration)
	 * @generated
	 */
	boolean isSetCoachSubmode();

	/**
	 * Returns the value of the '<em><b>Funicular Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti10 Funicular submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Funicular Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration
	 * @see #isSetFunicularSubmode()
	 * @see #unsetFunicularSubmode()
	 * @see #setFunicularSubmode(FunicularSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_FunicularSubmode()
	 * @model default="unknown" unsettable="true"
	 *        extendedMetaData="kind='element' name='FunicularSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	FunicularSubmodeEnumeration getFunicularSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getFunicularSubmode <em>Funicular Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funicular Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.FunicularSubmodeEnumeration
	 * @see #isSetFunicularSubmode()
	 * @see #unsetFunicularSubmode()
	 * @see #getFunicularSubmode()
	 * @generated
	 */
	void setFunicularSubmode(FunicularSubmodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getFunicularSubmode <em>Funicular Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFunicularSubmode()
	 * @see #getFunicularSubmode()
	 * @see #setFunicularSubmode(FunicularSubmodeEnumeration)
	 * @generated
	 */
	void unsetFunicularSubmode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getFunicularSubmode <em>Funicular Submode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Funicular Submode</em>' attribute is set.
	 * @see #unsetFunicularSubmode()
	 * @see #getFunicularSubmode()
	 * @see #setFunicularSubmode(FunicularSubmodeEnumeration)
	 * @generated
	 */
	boolean isSetFunicularSubmode();

	/**
	 * Returns the value of the '<em><b>Metro Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti04 Metro submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metro Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration
	 * @see #isSetMetroSubmode()
	 * @see #unsetMetroSubmode()
	 * @see #setMetroSubmode(MetroSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_MetroSubmode()
	 * @model default="unknown" unsettable="true"
	 *        extendedMetaData="kind='element' name='MetroSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	MetroSubmodeEnumeration getMetroSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getMetroSubmode <em>Metro Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metro Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.MetroSubmodeEnumeration
	 * @see #isSetMetroSubmode()
	 * @see #unsetMetroSubmode()
	 * @see #getMetroSubmode()
	 * @generated
	 */
	void setMetroSubmode(MetroSubmodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getMetroSubmode <em>Metro Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMetroSubmode()
	 * @see #getMetroSubmode()
	 * @see #setMetroSubmode(MetroSubmodeEnumeration)
	 * @generated
	 */
	void unsetMetroSubmode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getMetroSubmode <em>Metro Submode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Metro Submode</em>' attribute is set.
	 * @see #unsetMetroSubmode()
	 * @see #getMetroSubmode()
	 * @see #setMetroSubmode(MetroSubmodeEnumeration)
	 * @generated
	 */
	boolean isSetMetroSubmode();

	/**
	 * Returns the value of the '<em><b>Tram Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti06 Tram submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tram Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration
	 * @see #isSetTramSubmode()
	 * @see #unsetTramSubmode()
	 * @see #setTramSubmode(TramSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_TramSubmode()
	 * @model default="unknown" unsettable="true"
	 *        extendedMetaData="kind='element' name='TramSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	TramSubmodeEnumeration getTramSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTramSubmode <em>Tram Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tram Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TramSubmodeEnumeration
	 * @see #isSetTramSubmode()
	 * @see #unsetTramSubmode()
	 * @see #getTramSubmode()
	 * @generated
	 */
	void setTramSubmode(TramSubmodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTramSubmode <em>Tram Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTramSubmode()
	 * @see #getTramSubmode()
	 * @see #setTramSubmode(TramSubmodeEnumeration)
	 * @generated
	 */
	void unsetTramSubmode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTramSubmode <em>Tram Submode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tram Submode</em>' attribute is set.
	 * @see #unsetTramSubmode()
	 * @see #getTramSubmode()
	 * @see #setTramSubmode(TramSubmodeEnumeration)
	 * @generated
	 */
	boolean isSetTramSubmode();

	/**
	 * Returns the value of the '<em><b>Telecabin Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti09 Telecabin submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecabin Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration
	 * @see #isSetTelecabinSubmode()
	 * @see #unsetTelecabinSubmode()
	 * @see #setTelecabinSubmode(TelecabinSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_TelecabinSubmode()
	 * @model default="unknown" unsettable="true"
	 *        extendedMetaData="kind='element' name='TelecabinSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	TelecabinSubmodeEnumeration getTelecabinSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTelecabinSubmode <em>Telecabin Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telecabin Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TelecabinSubmodeEnumeration
	 * @see #isSetTelecabinSubmode()
	 * @see #unsetTelecabinSubmode()
	 * @see #getTelecabinSubmode()
	 * @generated
	 */
	void setTelecabinSubmode(TelecabinSubmodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTelecabinSubmode <em>Telecabin Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTelecabinSubmode()
	 * @see #getTelecabinSubmode()
	 * @see #setTelecabinSubmode(TelecabinSubmodeEnumeration)
	 * @generated
	 */
	void unsetTelecabinSubmode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTelecabinSubmode <em>Telecabin Submode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Telecabin Submode</em>' attribute is set.
	 * @see #unsetTelecabinSubmode()
	 * @see #getTelecabinSubmode()
	 * @see #setTelecabinSubmode(TelecabinSubmodeEnumeration)
	 * @generated
	 */
	boolean isSetTelecabinSubmode();

	/**
	 * Returns the value of the '<em><b>Rail Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti02 Rail submodes loc13.
	 * 			See also See ERA B.4.7009 - Name: Item description code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rail Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration
	 * @see #isSetRailSubmode()
	 * @see #unsetRailSubmode()
	 * @see #setRailSubmode(RailSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_RailSubmode()
	 * @model default="unknown" unsettable="true"
	 *        extendedMetaData="kind='element' name='RailSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	RailSubmodeEnumeration getRailSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getRailSubmode <em>Rail Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rail Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.RailSubmodeEnumeration
	 * @see #isSetRailSubmode()
	 * @see #unsetRailSubmode()
	 * @see #getRailSubmode()
	 * @generated
	 */
	void setRailSubmode(RailSubmodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getRailSubmode <em>Rail Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRailSubmode()
	 * @see #getRailSubmode()
	 * @see #setRailSubmode(RailSubmodeEnumeration)
	 * @generated
	 */
	void unsetRailSubmode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getRailSubmode <em>Rail Submode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rail Submode</em>' attribute is set.
	 * @see #unsetRailSubmode()
	 * @see #getRailSubmode()
	 * @see #setRailSubmode(RailSubmodeEnumeration)
	 * @generated
	 */
	boolean isSetRailSubmode();

	/**
	 * Returns the value of the '<em><b>Water Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti07 Water submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Water Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration
	 * @see #isSetWaterSubmode()
	 * @see #unsetWaterSubmode()
	 * @see #setWaterSubmode(WaterSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_WaterSubmode()
	 * @model default="unknown" unsettable="true"
	 *        extendedMetaData="kind='element' name='WaterSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	WaterSubmodeEnumeration getWaterSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getWaterSubmode <em>Water Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Water Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.WaterSubmodeEnumeration
	 * @see #isSetWaterSubmode()
	 * @see #unsetWaterSubmode()
	 * @see #getWaterSubmode()
	 * @generated
	 */
	void setWaterSubmode(WaterSubmodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getWaterSubmode <em>Water Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWaterSubmode()
	 * @see #getWaterSubmode()
	 * @see #setWaterSubmode(WaterSubmodeEnumeration)
	 * @generated
	 */
	void unsetWaterSubmode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getWaterSubmode <em>Water Submode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Water Submode</em>' attribute is set.
	 * @see #unsetWaterSubmode()
	 * @see #getWaterSubmode()
	 * @see #setWaterSubmode(WaterSubmodeEnumeration)
	 * @generated
	 */
	boolean isSetWaterSubmode();

	/**
	 * Returns the value of the '<em><b>Taxi Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti11 Taxi submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taxi Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration
	 * @see #isSetTaxiSubmode()
	 * @see #unsetTaxiSubmode()
	 * @see #setTaxiSubmode(TaxiSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_TaxiSubmode()
	 * @model default="unknown" unsettable="true"
	 *        extendedMetaData="kind='element' name='TaxiSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxiSubmodeEnumeration getTaxiSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTaxiSubmode <em>Taxi Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taxi Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.TaxiSubmodeEnumeration
	 * @see #isSetTaxiSubmode()
	 * @see #unsetTaxiSubmode()
	 * @see #getTaxiSubmode()
	 * @generated
	 */
	void setTaxiSubmode(TaxiSubmodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTaxiSubmode <em>Taxi Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTaxiSubmode()
	 * @see #getTaxiSubmode()
	 * @see #setTaxiSubmode(TaxiSubmodeEnumeration)
	 * @generated
	 */
	void unsetTaxiSubmode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getTaxiSubmode <em>Taxi Submode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Taxi Submode</em>' attribute is set.
	 * @see #unsetTaxiSubmode()
	 * @see #getTaxiSubmode()
	 * @see #setTaxiSubmode(TaxiSubmodeEnumeration)
	 * @generated
	 */
	boolean isSetTaxiSubmode();

	/**
	 * Returns the value of the '<em><b>Self Drive Submode</b></em>' attribute.
	 * The default value is <code>"unknown"</code>.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TPEG pti12 SelfDrive submodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Self Drive Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration
	 * @see #isSetSelfDriveSubmode()
	 * @see #unsetSelfDriveSubmode()
	 * @see #setSelfDriveSubmode(SelfDriveSubmodeEnumeration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getNetexMode_SelfDriveSubmode()
	 * @model default="unknown" unsettable="true"
	 *        extendedMetaData="kind='element' name='SelfDriveSubmode' namespace='##targetNamespace'"
	 * @generated
	 */
	SelfDriveSubmodeEnumeration getSelfDriveSubmode();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getSelfDriveSubmode <em>Self Drive Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Self Drive Submode</em>' attribute.
	 * @see de.jena.mdo.ibis.ibis_enumerations.SelfDriveSubmodeEnumeration
	 * @see #isSetSelfDriveSubmode()
	 * @see #unsetSelfDriveSubmode()
	 * @see #getSelfDriveSubmode()
	 * @generated
	 */
	void setSelfDriveSubmode(SelfDriveSubmodeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getSelfDriveSubmode <em>Self Drive Submode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelfDriveSubmode()
	 * @see #getSelfDriveSubmode()
	 * @see #setSelfDriveSubmode(SelfDriveSubmodeEnumeration)
	 * @generated
	 */
	void unsetSelfDriveSubmode();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.ibis_common.NetexMode#getSelfDriveSubmode <em>Self Drive Submode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Self Drive Submode</em>' attribute is set.
	 * @see #unsetSelfDriveSubmode()
	 * @see #getSelfDriveSubmode()
	 * @see #setSelfDriveSubmode(SelfDriveSubmodeEnumeration)
	 * @generated
	 */
	boolean isSetSelfDriveSubmode();

} // NetexMode
