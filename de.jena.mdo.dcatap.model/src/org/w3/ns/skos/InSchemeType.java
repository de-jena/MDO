/**
 */
package org.w3.ns.skos;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Scheme Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.skos.InSchemeType#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.skos.SkosPackage#getInSchemeType()
 * @model extendedMetaData="name='inScheme_._type' kind='empty'"
 * @generated
 */
public interface InSchemeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' attribute.
	 * @see #setResource(String)
	 * @see org.w3.ns.skos.SkosPackage#getInSchemeType_Resource()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='resource' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getResource();

	/**
	 * Sets the value of the '{@link org.w3.ns.skos.InSchemeType#getResource <em>Resource</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' attribute.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(String value);

} // InSchemeType
