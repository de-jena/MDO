/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.PointType#getStopPoint <em>Stop Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.PointType#getBeaconPoint <em>Beacon Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.PointType#getGNSSLocationPoint <em>GNSS Location Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.PointType#getTimingPoint <em>Timing Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.PointType#getTSPPoint <em>TSP Point</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getPointType()
 * @model extendedMetaData="name='PointTypeStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PointType extends EObject {
	/**
	 * Returns the value of the '<em><b>Stop Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Analogie zu REC_ORT aus VDV 452
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stop Point</em>' containment reference.
	 * @see #setStopPoint(JourneyStopInformation)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getPointType_StopPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StopPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	JourneyStopInformation getStopPoint();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.PointType#getStopPoint <em>Stop Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Point</em>' containment reference.
	 * @see #getStopPoint()
	 * @generated
	 */
	void setStopPoint(JourneyStopInformation value);

	/**
	 * Returns the value of the '<em><b>Beacon Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beacon Point</em>' containment reference.
	 * @see #setBeaconPoint(BeaconPoint)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getPointType_BeaconPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BeaconPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	BeaconPoint getBeaconPoint();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.PointType#getBeaconPoint <em>Beacon Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beacon Point</em>' containment reference.
	 * @see #getBeaconPoint()
	 * @generated
	 */
	void setBeaconPoint(BeaconPoint value);

	/**
	 * Returns the value of the '<em><b>GNSS Location Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Point, where specific GNSS-Information is provided, "GNSS-Solution" for the Beacon-Points, analogue to REC_OM from VDV 452
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GNSS Location Point</em>' containment reference.
	 * @see #setGNSSLocationPoint(GNSSPoint)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getPointType_GNSSLocationPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GNSSLocationPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	GNSSPoint getGNSSLocationPoint();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.PointType#getGNSSLocationPoint <em>GNSS Location Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GNSS Location Point</em>' containment reference.
	 * @see #getGNSSLocationPoint()
	 * @generated
	 */
	void setGNSSLocationPoint(GNSSPoint value);

	/**
	 * Returns the value of the '<em><b>Timing Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Point</em>' containment reference.
	 * @see #setTimingPoint(TimingPoint)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getPointType_TimingPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimingPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	TimingPoint getTimingPoint();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.PointType#getTimingPoint <em>Timing Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Point</em>' containment reference.
	 * @see #getTimingPoint()
	 * @generated
	 */
	void setTimingPoint(TimingPoint value);

	/**
	 * Returns the value of the '<em><b>TSP Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Point, where Information for TrafficSignalPriorisation is provided 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TSP Point</em>' containment reference.
	 * @see #setTSPPoint(TSPPoint)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getPointType_TSPPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TSPPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	TSPPoint getTSPPoint();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.PointType#getTSPPoint <em>TSP Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TSP Point</em>' containment reference.
	 * @see #getTSPPoint()
	 * @generated
	 */
	void setTSPPoint(TSPPoint value);

} // PointType
