/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.TimingPoint#getTimingPointRef <em>Timing Point Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.TimingPoint#getScheduleTime <em>Schedule Time</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.TimingPoint#getGNSSPoint <em>GNSS Point</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getTimingPoint()
 * @model extendedMetaData="name='TimingPointStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TimingPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Timing Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Point Ref</em>' containment reference.
	 * @see #setTimingPointRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getTimingPoint_TimingPointRef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TimingPointRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getTimingPointRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.TimingPoint#getTimingPointRef <em>Timing Point Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Point Ref</em>' containment reference.
	 * @see #getTimingPointRef()
	 * @generated
	 */
	void setTimingPointRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Schedule Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Time</em>' containment reference.
	 * @see #setScheduleTime(IBISIPDateTime)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getTimingPoint_ScheduleTime()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ScheduleTime' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDateTime getScheduleTime();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.TimingPoint#getScheduleTime <em>Schedule Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Time</em>' containment reference.
	 * @see #getScheduleTime()
	 * @generated
	 */
	void setScheduleTime(IBISIPDateTime value);

	/**
	 * Returns the value of the '<em><b>GNSS Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GNSS Point</em>' containment reference.
	 * @see #setGNSSPoint(GNSSPoint)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getTimingPoint_GNSSPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GNSSPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	GNSSPoint getGNSSPoint();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.TimingPoint#getGNSSPoint <em>GNSS Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GNSS Point</em>' containment reference.
	 * @see #getGNSSPoint()
	 * @generated
	 */
	void setGNSSPoint(GNSSPoint value);

} // TimingPoint
