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

} // Distribution
