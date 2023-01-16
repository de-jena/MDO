/*
 */
package de.jena.mdo.ibis.gnsslocationservice;

import de.jena.mdo.ibis.common.GNSSCoordinateStructure;
import de.jena.mdo.ibis.common.IBISIPDate;
import de.jena.mdo.ibis.common.IBISIPDateTime;
import de.jena.mdo.ibis.common.IBISIPDouble;
import de.jena.mdo.ibis.common.IBISIPInt;

import de.jena.mdo.ibis.enumerations.GNSSCoordinateSystemEnumeration;
import de.jena.mdo.ibis.enumerations.GNSSQualityEnumeration;
import de.jena.mdo.ibis.enumerations.GNSSTypeEnumeration;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GNSS Location Service Data Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getAltitude <em>Altitude</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getTime <em>Time</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getDate <em>Date</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getSpeedOverGround <em>Speed Over Ground</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getSignalQuality <em>Signal Quality</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getNumberOfSatellites <em>Number Of Satellites</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getHoriziontalDilutionOfPrecision <em>Horiziontal Dilution Of Precision</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getVerticalDilutionOfPrecision <em>Vertical Dilution Of Precision</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getTrackDegreeTrue <em>Track Degree True</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getTrackDegreeMagnetic <em>Track Degree Magnetic</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getGNSSType <em>GNSS Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getGNSSCoordinateSystem <em>GNSS Coordinate System</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure()
 * @model extendedMetaData="name='GNSSLocationService.DataStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GNSSLocationServiceDataStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Latitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latitude</em>' containment reference.
	 * @see #setLatitude(GNSSCoordinateStructure)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_Latitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='latitude' namespace='##targetNamespace'"
	 * @generated
	 */
	GNSSCoordinateStructure getLatitude();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getLatitude <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latitude</em>' containment reference.
	 * @see #getLatitude()
	 * @generated
	 */
	void setLatitude(GNSSCoordinateStructure value);

	/**
	 * Returns the value of the '<em><b>Longitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longitude</em>' containment reference.
	 * @see #setLongitude(GNSSCoordinateStructure)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_Longitude()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='longitude' namespace='##targetNamespace'"
	 * @generated
	 */
	GNSSCoordinateStructure getLongitude();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getLongitude <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longitude</em>' containment reference.
	 * @see #getLongitude()
	 * @generated
	 */
	void setLongitude(GNSSCoordinateStructure value);

	/**
	 * Returns the value of the '<em><b>Altitude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Altitude</em>' containment reference.
	 * @see #setAltitude(IBISIPDouble)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_Altitude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='altitude' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDouble getAltitude();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getAltitude <em>Altitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Altitude</em>' containment reference.
	 * @see #getAltitude()
	 * @generated
	 */
	void setAltitude(IBISIPDouble value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_Time()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getTime();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(IBISIPDate)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDate getDate();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(IBISIPDate value);

	/**
	 * Returns the value of the '<em><b>Speed Over Ground</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed Over Ground</em>' containment reference.
	 * @see #setSpeedOverGround(IBISIPDouble)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_SpeedOverGround()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SpeedOverGround' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDouble getSpeedOverGround();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getSpeedOverGround <em>Speed Over Ground</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Over Ground</em>' containment reference.
	 * @see #getSpeedOverGround()
	 * @generated
	 */
	void setSpeedOverGround(IBISIPDouble value);

	/**
	 * Returns the value of the '<em><b>Signal Quality</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.GNSSQualityEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Quality</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.GNSSQualityEnumeration
	 * @see #isSetSignalQuality()
	 * @see #unsetSignalQuality()
	 * @see #setSignalQuality(GNSSQualityEnumeration)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_SignalQuality()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SignalQuality' namespace='##targetNamespace'"
	 * @generated
	 */
	GNSSQualityEnumeration getSignalQuality();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getSignalQuality <em>Signal Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Quality</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.GNSSQualityEnumeration
	 * @see #isSetSignalQuality()
	 * @see #unsetSignalQuality()
	 * @see #getSignalQuality()
	 * @generated
	 */
	void setSignalQuality(GNSSQualityEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getSignalQuality <em>Signal Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignalQuality()
	 * @see #getSignalQuality()
	 * @see #setSignalQuality(GNSSQualityEnumeration)
	 * @generated
	 */
	void unsetSignalQuality();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getSignalQuality <em>Signal Quality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Signal Quality</em>' attribute is set.
	 * @see #unsetSignalQuality()
	 * @see #getSignalQuality()
	 * @see #setSignalQuality(GNSSQualityEnumeration)
	 * @generated
	 */
	boolean isSetSignalQuality();

	/**
	 * Returns the value of the '<em><b>Number Of Satellites</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Satellites</em>' containment reference.
	 * @see #setNumberOfSatellites(IBISIPInt)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_NumberOfSatellites()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NumberOfSatellites' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getNumberOfSatellites();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getNumberOfSatellites <em>Number Of Satellites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Satellites</em>' containment reference.
	 * @see #getNumberOfSatellites()
	 * @generated
	 */
	void setNumberOfSatellites(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Horiziontal Dilution Of Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horiziontal Dilution Of Precision</em>' containment reference.
	 * @see #setHoriziontalDilutionOfPrecision(IBISIPDouble)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_HoriziontalDilutionOfPrecision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HoriziontalDilutionOfPrecision' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDouble getHoriziontalDilutionOfPrecision();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getHoriziontalDilutionOfPrecision <em>Horiziontal Dilution Of Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horiziontal Dilution Of Precision</em>' containment reference.
	 * @see #getHoriziontalDilutionOfPrecision()
	 * @generated
	 */
	void setHoriziontalDilutionOfPrecision(IBISIPDouble value);

	/**
	 * Returns the value of the '<em><b>Vertical Dilution Of Precision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Dilution Of Precision</em>' containment reference.
	 * @see #setVerticalDilutionOfPrecision(IBISIPDouble)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_VerticalDilutionOfPrecision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VerticalDilutionOfPrecision' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDouble getVerticalDilutionOfPrecision();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getVerticalDilutionOfPrecision <em>Vertical Dilution Of Precision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Dilution Of Precision</em>' containment reference.
	 * @see #getVerticalDilutionOfPrecision()
	 * @generated
	 */
	void setVerticalDilutionOfPrecision(IBISIPDouble value);

	/**
	 * Returns the value of the '<em><b>Track Degree True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Degree True</em>' containment reference.
	 * @see #setTrackDegreeTrue(IBISIPDouble)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_TrackDegreeTrue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TrackDegreeTrue' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDouble getTrackDegreeTrue();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getTrackDegreeTrue <em>Track Degree True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Degree True</em>' containment reference.
	 * @see #getTrackDegreeTrue()
	 * @generated
	 */
	void setTrackDegreeTrue(IBISIPDouble value);

	/**
	 * Returns the value of the '<em><b>Track Degree Magnetic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Degree Magnetic</em>' containment reference.
	 * @see #setTrackDegreeMagnetic(IBISIPDouble)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_TrackDegreeMagnetic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TrackDegreeMagnetic' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDouble getTrackDegreeMagnetic();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getTrackDegreeMagnetic <em>Track Degree Magnetic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Degree Magnetic</em>' containment reference.
	 * @see #getTrackDegreeMagnetic()
	 * @generated
	 */
	void setTrackDegreeMagnetic(IBISIPDouble value);

	/**
	 * Returns the value of the '<em><b>GNSS Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.GNSSTypeEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GNSS Type</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.GNSSTypeEnumeration
	 * @see #isSetGNSSType()
	 * @see #unsetGNSSType()
	 * @see #setGNSSType(GNSSTypeEnumeration)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_GNSSType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='GNSSType' namespace='##targetNamespace'"
	 * @generated
	 */
	GNSSTypeEnumeration getGNSSType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getGNSSType <em>GNSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GNSS Type</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.GNSSTypeEnumeration
	 * @see #isSetGNSSType()
	 * @see #unsetGNSSType()
	 * @see #getGNSSType()
	 * @generated
	 */
	void setGNSSType(GNSSTypeEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getGNSSType <em>GNSS Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGNSSType()
	 * @see #getGNSSType()
	 * @see #setGNSSType(GNSSTypeEnumeration)
	 * @generated
	 */
	void unsetGNSSType();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getGNSSType <em>GNSS Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>GNSS Type</em>' attribute is set.
	 * @see #unsetGNSSType()
	 * @see #getGNSSType()
	 * @see #setGNSSType(GNSSTypeEnumeration)
	 * @generated
	 */
	boolean isSetGNSSType();

	/**
	 * Returns the value of the '<em><b>GNSS Coordinate System</b></em>' attribute.
	 * The literals are from the enumeration {@link de.jena.mdo.ibis.enumerations.GNSSCoordinateSystemEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information on the CoordinateSystem of the GNSS
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GNSS Coordinate System</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.GNSSCoordinateSystemEnumeration
	 * @see #isSetGNSSCoordinateSystem()
	 * @see #unsetGNSSCoordinateSystem()
	 * @see #setGNSSCoordinateSystem(GNSSCoordinateSystemEnumeration)
	 * @see de.jena.mdo.ibis.gnsslocationservice.IbisGNSSLocationServicePackage#getGNSSLocationServiceDataStructure_GNSSCoordinateSystem()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='GNSSCoordinateSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	GNSSCoordinateSystemEnumeration getGNSSCoordinateSystem();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getGNSSCoordinateSystem <em>GNSS Coordinate System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GNSS Coordinate System</em>' attribute.
	 * @see de.jena.mdo.ibis.enumerations.GNSSCoordinateSystemEnumeration
	 * @see #isSetGNSSCoordinateSystem()
	 * @see #unsetGNSSCoordinateSystem()
	 * @see #getGNSSCoordinateSystem()
	 * @generated
	 */
	void setGNSSCoordinateSystem(GNSSCoordinateSystemEnumeration value);

	/**
	 * Unsets the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getGNSSCoordinateSystem <em>GNSS Coordinate System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGNSSCoordinateSystem()
	 * @see #getGNSSCoordinateSystem()
	 * @see #setGNSSCoordinateSystem(GNSSCoordinateSystemEnumeration)
	 * @generated
	 */
	void unsetGNSSCoordinateSystem();

	/**
	 * Returns whether the value of the '{@link de.jena.mdo.ibis.gnsslocationservice.GNSSLocationServiceDataStructure#getGNSSCoordinateSystem <em>GNSS Coordinate System</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>GNSS Coordinate System</em>' attribute is set.
	 * @see #unsetGNSSCoordinateSystem()
	 * @see #getGNSSCoordinateSystem()
	 * @see #setGNSSCoordinateSystem(GNSSCoordinateSystemEnumeration)
	 * @generated
	 */
	boolean isSetGNSSCoordinateSystem();

} // GNSSLocationServiceDataStructure
