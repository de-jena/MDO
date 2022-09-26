/**
 */
package org.w3.ns.dcat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         dcat:Distribution represents an accessible form of a dataset such as a downloadable file.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.Distribution#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.w3.ns.dcat.Distribution#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.dcat.DcatPackage#getDistribution()
 * @model extendedMetaData="name='Distribution' kind='elementOnly'"
 * @generated
 */
public interface Distribution extends EObject {
	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' containment reference.
	 * @see #setDistribution(DistributionType)
	 * @see org.w3.ns.dcat.DcatPackage#getDistribution_Distribution()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Distribution' namespace='##targetNamespace'"
	 * @generated
	 */
	DistributionType getDistribution();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.Distribution#getDistribution <em>Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' containment reference.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(DistributionType value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see org.w3.ns.dcat.DcatPackage#getDistribution_Resource()
	 * @model extendedMetaData="kind='attribute' name='resource' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.Distribution#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

} // Distribution
