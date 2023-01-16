/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Point Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.SpecificPointStructure#getPointRef <em>Point Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.SpecificPointStructure#getDistanceToPreviousPoint <em>Distance To Previous Point</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getSpecificPointStructure()
 * @model extendedMetaData="name='SpecificPointStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SpecificPointStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Point Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Ref</em>' containment reference.
	 * @see #setPointRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getSpecificPointStructure_PointRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PointRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getPointRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.SpecificPointStructure#getPointRef <em>Point Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Ref</em>' containment reference.
	 * @see #getPointRef()
	 * @generated
	 */
	void setPointRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Distance To Previous Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance To Previous Point</em>' containment reference.
	 * @see #setDistanceToPreviousPoint(IBISIPDouble)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getSpecificPointStructure_DistanceToPreviousPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DistanceToPreviousPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDouble getDistanceToPreviousPoint();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.SpecificPointStructure#getDistanceToPreviousPoint <em>Distance To Previous Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance To Previous Point</em>' containment reference.
	 * @see #getDistanceToPreviousPoint()
	 * @generated
	 */
	void setDistanceToPreviousPoint(IBISIPDouble value);

} // SpecificPointStructure
