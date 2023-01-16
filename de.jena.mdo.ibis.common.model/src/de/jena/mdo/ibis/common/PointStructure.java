/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.PointStructure#getPointIndex <em>Point Index</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.PointStructure#getPointType <em>Point Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.PointStructure#getDistanceToPreviousPoint <em>Distance To Previous Point</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getPointStructure()
 * @model extendedMetaData="name='PointStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PointStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Point Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Index</em>' containment reference.
	 * @see #setPointIndex(IBISIPInt)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getPointStructure_PointIndex()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PointIndex' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getPointIndex();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.PointStructure#getPointIndex <em>Point Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Index</em>' containment reference.
	 * @see #getPointIndex()
	 * @generated
	 */
	void setPointIndex(IBISIPInt value);

	/**
	 * Returns the value of the '<em><b>Point Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Type</em>' containment reference.
	 * @see #setPointType(PointTypeStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getPointStructure_PointType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PointType' namespace='##targetNamespace'"
	 * @generated
	 */
	PointTypeStructure getPointType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.PointStructure#getPointType <em>Point Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Type</em>' containment reference.
	 * @see #getPointType()
	 * @generated
	 */
	void setPointType(PointTypeStructure value);

	/**
	 * Returns the value of the '<em><b>Distance To Previous Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * aus REC-SEL bzw. REC_SEL_ZP der VDV 452
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance To Previous Point</em>' containment reference.
	 * @see #setDistanceToPreviousPoint(IBISIPInt)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getPointStructure_DistanceToPreviousPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DistanceToPreviousPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPInt getDistanceToPreviousPoint();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.PointStructure#getDistanceToPreviousPoint <em>Distance To Previous Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance To Previous Point</em>' containment reference.
	 * @see #getDistanceToPreviousPoint()
	 * @generated
	 */
	void setDistanceToPreviousPoint(IBISIPInt value);

} // PointStructure
