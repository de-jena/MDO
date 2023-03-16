/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Short Trip Stop List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ShortTripStopList#getShortTripStop <em>Short Trip Stop</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getShortTripStopList()
 * @model extendedMetaData="name='ShortTripStopListStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ShortTripStopList extends EObject {
	/**
	 * Returns the value of the '<em><b>Short Trip Stop</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.ibis.ibis_common.ShortTripStop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Trip Stop</em>' containment reference list.
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getShortTripStopList_ShortTripStop()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ShortTripStop' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ShortTripStop> getShortTripStop();

} // ShortTripStopList
