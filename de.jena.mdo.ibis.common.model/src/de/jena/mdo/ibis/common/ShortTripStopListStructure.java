/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Trip Stop List Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.ShortTripStopListStructure#getShortTripStop <em>Short Trip Stop</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getShortTripStopListStructure()
 * @model extendedMetaData="name='ShortTripStopListStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ShortTripStopListStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Short Trip Stop</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.common.ShortTripStopStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Trip Stop</em>' containment reference list.
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getShortTripStopListStructure_ShortTripStop()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ShortTripStop' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ShortTripStopStructure> getShortTripStop();

} // ShortTripStopListStructure