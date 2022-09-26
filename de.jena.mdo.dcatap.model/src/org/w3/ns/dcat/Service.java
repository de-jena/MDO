/**
 */
package org.w3.ns.dcat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.Service#getDataService <em>Data Service</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.dcat.DcatPackage#getService()
 * @model extendedMetaData="name='service' kind='elementOnly'"
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Service</em>' containment reference.
	 * @see #setDataService(DataServiceType)
	 * @see org.w3.ns.dcat.DcatPackage#getService_DataService()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataService' namespace='##targetNamespace'"
	 * @generated
	 */
	DataServiceType getDataService();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.Service#getDataService <em>Data Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Service</em>' containment reference.
	 * @see #getDataService()
	 * @generated
	 */
	void setDataService(DataServiceType value);

} // Service
