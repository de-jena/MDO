/**
 */
package org.w3.ns.dcat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dataset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.Dataset#getDataset <em>Dataset</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.dcat.DcatPackage#getDataset()
 * @model extendedMetaData="name='dataset' kind='elementOnly'"
 * @generated
 */
public interface Dataset extends EObject {
	/**
	 * Returns the value of the '<em><b>Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataset</em>' containment reference.
	 * @see #setDataset(DatasetType)
	 * @see org.w3.ns.dcat.DcatPackage#getDataset_Dataset()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Dataset' namespace='##targetNamespace'"
	 * @generated
	 */
	DatasetType getDataset();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.Dataset#getDataset <em>Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataset</em>' containment reference.
	 * @see #getDataset()
	 * @generated
	 */
	void setDataset(DatasetType value);

} // Dataset
