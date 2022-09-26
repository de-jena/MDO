/**
 */
package org.w3.ns.dcat;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         dcat:DataService represents a data service. A data service is a collection of operations accessible through an
 *         interface (API) that provide access to one or more datasets or data processing functions.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.DataServiceType#getEndpointDescription <em>Endpoint Description</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DataServiceType#getEndpointURL <em>Endpoint URL</em>}</li>
 *   <li>{@link org.w3.ns.dcat.DataServiceType#getServesDataset <em>Serves Dataset</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.dcat.DcatPackage#getDataServiceType()
 * @model extendedMetaData="name='DataServiceType' kind='elementOnly'"
 * @generated
 */
public interface DataServiceType extends ResourceType {
	/**
	 * Returns the value of the '<em><b>Endpoint Description</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Description</em>' attribute list.
	 * @see org.w3.ns.dcat.DcatPackage#getDataServiceType_EndpointDescription()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='endpointDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getEndpointDescription();

	/**
	 * Returns the value of the '<em><b>Endpoint URL</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint URL</em>' attribute list.
	 * @see org.w3.ns.dcat.DcatPackage#getDataServiceType_EndpointURL()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='endpointURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getEndpointURL();

	/**
	 * Returns the value of the '<em><b>Serves Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serves Dataset</em>' containment reference.
	 * @see #setServesDataset(Dataset)
	 * @see org.w3.ns.dcat.DcatPackage#getDataServiceType_ServesDataset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servesDataset' namespace='##targetNamespace'"
	 * @generated
	 */
	Dataset getServesDataset();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.DataServiceType#getServesDataset <em>Serves Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serves Dataset</em>' containment reference.
	 * @see #getServesDataset()
	 * @generated
	 */
	void setServesDataset(Dataset value);

} // DataServiceType
