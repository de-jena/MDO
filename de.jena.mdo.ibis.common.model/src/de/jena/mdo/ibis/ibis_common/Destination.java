/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Structure for describing destination information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.Destination#getDestinationRef <em>Destination Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.Destination#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.Destination#getDestinationShortName <em>Destination Short Name</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDestination()
 * @model extendedMetaData="name='DestinationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Destination extends EObject {
	/**
	 * Returns the value of the '<em><b>Destination Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the destination-information in the schedule-data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Ref</em>' containment reference.
	 * @see #setDestinationRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDestination_DestinationRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DestinationRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getDestinationRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.Destination#getDestinationRef <em>Destination Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Ref</em>' containment reference.
	 * @see #getDestinationRef()
	 * @generated
	 */
	void setDestinationRef(IBISIPNMTOKEN value);

	/**
	 * Returns the value of the '<em><b>Destination Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text of the destination
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDestination_DestinationName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DestinationName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getDestinationName();

	/**
	 * Returns the value of the '<em><b>Destination Short Name</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.InternationalTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shorttext of the destination if there is limited space
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination Short Name</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDestination_DestinationShortName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DestinationShortName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternationalTextType> getDestinationShortName();

} // Destination
