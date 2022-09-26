/**
 */
package org.w3.ns.dcat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.Catalog#getCatalog <em>Catalog</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.dcat.DcatPackage#getCatalog()
 * @model extendedMetaData="name='catalog' kind='elementOnly'"
 * @generated
 */
public interface Catalog extends EObject {
	/**
	 * Returns the value of the '<em><b>Catalog</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catalog</em>' containment reference.
	 * @see #setCatalog(Catalog1)
	 * @see org.w3.ns.dcat.DcatPackage#getCatalog_Catalog()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Catalog' namespace='##targetNamespace'"
	 * @generated
	 */
	Catalog1 getCatalog();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.Catalog#getCatalog <em>Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catalog</em>' containment reference.
	 * @see #getCatalog()
	 * @generated
	 */
	void setCatalog(Catalog1 value);

} // Catalog
