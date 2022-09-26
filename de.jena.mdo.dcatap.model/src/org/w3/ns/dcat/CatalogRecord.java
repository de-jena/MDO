/**
 */
package org.w3.ns.dcat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.CatalogRecord#getCatalogRecord <em>Catalog Record</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.dcat.DcatPackage#getCatalogRecord()
 * @model extendedMetaData="name='catalogRecord' kind='elementOnly'"
 * @generated
 */
public interface CatalogRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Catalog Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog Record</em>' containment reference.
	 * @see #setCatalogRecord(CatalogRecordType)
	 * @see org.w3.ns.dcat.DcatPackage#getCatalogRecord_CatalogRecord()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CatalogRecord' namespace='##targetNamespace'"
	 * @generated
	 */
	CatalogRecordType getCatalogRecord();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.CatalogRecord#getCatalogRecord <em>Catalog Record</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog Record</em>' containment reference.
	 * @see #getCatalogRecord()
	 * @generated
	 */
	void setCatalogRecord(CatalogRecordType value);

} // CatalogRecord
