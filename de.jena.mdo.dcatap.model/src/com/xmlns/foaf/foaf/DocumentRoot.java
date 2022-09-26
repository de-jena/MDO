/**
 */
package com.xmlns.foaf.foaf;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.w3.ns.rdf.PlainLiteral;
import org.w3.ns.rdf.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xmlns.foaf.foaf.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.xmlns.foaf.foaf.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.xmlns.foaf.foaf.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.xmlns.foaf.foaf.DocumentRoot#getHomepage <em>Homepage</em>}</li>
 *   <li>{@link com.xmlns.foaf.foaf.DocumentRoot#getMbox <em>Mbox</em>}</li>
 *   <li>{@link com.xmlns.foaf.foaf.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link com.xmlns.foaf.foaf.DocumentRoot#getPage <em>Page</em>}</li>
 *   <li>{@link com.xmlns.foaf.foaf.DocumentRoot#getPhone <em>Phone</em>}</li>
 *   <li>{@link com.xmlns.foaf.foaf.DocumentRoot#getPrimaryTopic <em>Primary Topic</em>}</li>
 * </ul>
 *
 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Homepage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homepage</em>' containment reference.
	 * @see #setHomepage(Resource)
	 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentRoot_Homepage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='homepage' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getHomepage();

	/**
	 * Sets the value of the '{@link com.xmlns.foaf.foaf.DocumentRoot#getHomepage <em>Homepage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Homepage</em>' containment reference.
	 * @see #getHomepage()
	 * @generated
	 */
	void setHomepage(Resource value);

	/**
	 * Returns the value of the '<em><b>Mbox</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mbox</em>' containment reference.
	 * @see #setMbox(Resource)
	 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentRoot_Mbox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mbox' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getMbox();

	/**
	 * Sets the value of the '{@link com.xmlns.foaf.foaf.DocumentRoot#getMbox <em>Mbox</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mbox</em>' containment reference.
	 * @see #getMbox()
	 * @generated
	 */
	void setMbox(Resource value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(PlainLiteral)
	 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentRoot_Name()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	PlainLiteral getName();

	/**
	 * Sets the value of the '{@link com.xmlns.foaf.foaf.DocumentRoot#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(PlainLiteral value);

	/**
	 * Returns the value of the '<em><b>Page</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page</em>' containment reference.
	 * @see #setPage(Resource)
	 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentRoot_Page()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getPage();

	/**
	 * Sets the value of the '{@link com.xmlns.foaf.foaf.DocumentRoot#getPage <em>Page</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page</em>' containment reference.
	 * @see #getPage()
	 * @generated
	 */
	void setPage(Resource value);

	/**
	 * Returns the value of the '<em><b>Phone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' containment reference.
	 * @see #setPhone(Resource)
	 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentRoot_Phone()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phone' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getPhone();

	/**
	 * Sets the value of the '{@link com.xmlns.foaf.foaf.DocumentRoot#getPhone <em>Phone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' containment reference.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(Resource value);

	/**
	 * Returns the value of the '<em><b>Primary Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Topic</em>' containment reference.
	 * @see #setPrimaryTopic(Resource)
	 * @see com.xmlns.foaf.foaf.FoafPackage#getDocumentRoot_PrimaryTopic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primaryTopic' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getPrimaryTopic();

	/**
	 * Sets the value of the '{@link com.xmlns.foaf.foaf.DocumentRoot#getPrimaryTopic <em>Primary Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Topic</em>' containment reference.
	 * @see #getPrimaryTopic()
	 * @generated
	 */
	void setPrimaryTopic(Resource value);

} // DocumentRoot
