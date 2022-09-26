/**
 */
package org.w3.ns.vcard;

import org.eclipse.emf.ecore.EObject;

import org.w3.ns.rdf.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.vcard.OrganizationType#getFn <em>Fn</em>}</li>
 *   <li>{@link org.w3.ns.vcard.OrganizationType#getOrganizationName <em>Organization Name</em>}</li>
 *   <li>{@link org.w3.ns.vcard.OrganizationType#getHasAddress <em>Has Address</em>}</li>
 *   <li>{@link org.w3.ns.vcard.OrganizationType#getHasEmail <em>Has Email</em>}</li>
 *   <li>{@link org.w3.ns.vcard.OrganizationType#getHasURL <em>Has URL</em>}</li>
 *   <li>{@link org.w3.ns.vcard.OrganizationType#getHasTelephone <em>Has Telephone</em>}</li>
 *   <li>{@link org.w3.ns.vcard.OrganizationType#getAbout <em>About</em>}</li>
 *   <li>{@link org.w3.ns.vcard.OrganizationType#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.vcard.VcardPackage#getOrganizationType()
 * @model extendedMetaData="name='Organization_._type' kind='elementOnly'"
 * @generated
 */
public interface OrganizationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Fn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fn</em>' attribute.
	 * @see #setFn(String)
	 * @see org.w3.ns.vcard.VcardPackage#getOrganizationType_Fn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='fn' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFn();

	/**
	 * Sets the value of the '{@link org.w3.ns.vcard.OrganizationType#getFn <em>Fn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fn</em>' attribute.
	 * @see #getFn()
	 * @generated
	 */
	void setFn(String value);

	/**
	 * Returns the value of the '<em><b>Organization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Name</em>' attribute.
	 * @see #setOrganizationName(String)
	 * @see org.w3.ns.vcard.VcardPackage#getOrganizationType_OrganizationName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='organization-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationName();

	/**
	 * Sets the value of the '{@link org.w3.ns.vcard.OrganizationType#getOrganizationName <em>Organization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Name</em>' attribute.
	 * @see #getOrganizationName()
	 * @generated
	 */
	void setOrganizationName(String value);

	/**
	 * Returns the value of the '<em><b>Has Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Address</em>' containment reference.
	 * @see #setHasAddress(Address)
	 * @see org.w3.ns.vcard.VcardPackage#getOrganizationType_HasAddress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hasAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	Address getHasAddress();

	/**
	 * Sets the value of the '{@link org.w3.ns.vcard.OrganizationType#getHasAddress <em>Has Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Address</em>' containment reference.
	 * @see #getHasAddress()
	 * @generated
	 */
	void setHasAddress(Address value);

	/**
	 * Returns the value of the '<em><b>Has Email</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Email</em>' containment reference.
	 * @see #setHasEmail(Resource)
	 * @see org.w3.ns.vcard.VcardPackage#getOrganizationType_HasEmail()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hasEmail' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getHasEmail();

	/**
	 * Sets the value of the '{@link org.w3.ns.vcard.OrganizationType#getHasEmail <em>Has Email</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Email</em>' containment reference.
	 * @see #getHasEmail()
	 * @generated
	 */
	void setHasEmail(Resource value);

	/**
	 * Returns the value of the '<em><b>Has URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has URL</em>' containment reference.
	 * @see #setHasURL(Resource)
	 * @see org.w3.ns.vcard.VcardPackage#getOrganizationType_HasURL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hasURL' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getHasURL();

	/**
	 * Sets the value of the '{@link org.w3.ns.vcard.OrganizationType#getHasURL <em>Has URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has URL</em>' containment reference.
	 * @see #getHasURL()
	 * @generated
	 */
	void setHasURL(Resource value);

	/**
	 * Returns the value of the '<em><b>Has Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Telephone</em>' attribute.
	 * @see #setHasTelephone(String)
	 * @see org.w3.ns.vcard.VcardPackage#getOrganizationType_HasTelephone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='hasTelephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHasTelephone();

	/**
	 * Sets the value of the '{@link org.w3.ns.vcard.OrganizationType#getHasTelephone <em>Has Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Telephone</em>' attribute.
	 * @see #getHasTelephone()
	 * @generated
	 */
	void setHasTelephone(String value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see org.w3.ns.vcard.VcardPackage#getOrganizationType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link org.w3.ns.vcard.OrganizationType#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

	/**
	 * Returns the value of the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID</em>' attribute.
	 * @see #setNodeID(String)
	 * @see org.w3.ns.vcard.VcardPackage#getOrganizationType_NodeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='nodeID' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link org.w3.ns.vcard.OrganizationType#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

} // OrganizationType
