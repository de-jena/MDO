/*
 */
package vcard;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vcard.AddressType#getStreetAddress <em>Street Address</em>}</li>
 *   <li>{@link vcard.AddressType#getLocality <em>Locality</em>}</li>
 *   <li>{@link vcard.AddressType#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link vcard.AddressType#getCountryName <em>Country Name</em>}</li>
 *   <li>{@link vcard.AddressType#getAbout <em>About</em>}</li>
 *   <li>{@link vcard.AddressType#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @see vcard.VcardPackage#getAddressType()
 * @model extendedMetaData="name='Address_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>Street Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Street Address</em>' attribute.
	 * @see #setStreetAddress(String)
	 * @see vcard.VcardPackage#getAddressType_StreetAddress()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='street-address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStreetAddress();

	/**
	 * Sets the value of the '{@link vcard.AddressType#getStreetAddress <em>Street Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Street Address</em>' attribute.
	 * @see #getStreetAddress()
	 * @generated
	 */
	void setStreetAddress(String value);

	/**
	 * Returns the value of the '<em><b>Locality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locality</em>' attribute.
	 * @see #setLocality(String)
	 * @see vcard.VcardPackage#getAddressType_Locality()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='locality' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocality();

	/**
	 * Sets the value of the '{@link vcard.AddressType#getLocality <em>Locality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality</em>' attribute.
	 * @see #getLocality()
	 * @generated
	 */
	void setLocality(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see vcard.VcardPackage#getAddressType_PostalCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='postal-code' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link vcard.AddressType#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Country Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Name</em>' attribute.
	 * @see #setCountryName(String)
	 * @see vcard.VcardPackage#getAddressType_CountryName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='country-name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountryName();

	/**
	 * Sets the value of the '{@link vcard.AddressType#getCountryName <em>Country Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Name</em>' attribute.
	 * @see #getCountryName()
	 * @generated
	 */
	void setCountryName(String value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see vcard.VcardPackage#getAddressType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link vcard.AddressType#getAbout <em>About</em>}' attribute.
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
	 * @see vcard.VcardPackage#getAddressType_NodeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='nodeID' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link vcard.AddressType#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

} // AddressType
