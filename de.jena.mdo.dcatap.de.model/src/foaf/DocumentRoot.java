/*
 */
package foaf;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

import rdf.PlainLiteral;
import rdf.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link foaf.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link foaf.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link foaf.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link foaf.DocumentRoot#getHomepage <em>Homepage</em>}</li>
 *   <li>{@link foaf.DocumentRoot#getMbox <em>Mbox</em>}</li>
 *   <li>{@link foaf.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link foaf.DocumentRoot#getPage <em>Page</em>}</li>
 *   <li>{@link foaf.DocumentRoot#getPhone <em>Phone</em>}</li>
 *   <li>{@link foaf.DocumentRoot#getPrimaryTopic <em>Primary Topic</em>}</li>
 *   <li>{@link foaf.DocumentRoot#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link foaf.DocumentRoot#getPerson <em>Person</em>}</li>
 * </ul>
 *
 * @see foaf.FoafPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see foaf.FoafPackage#getDocumentRoot_Mixed()
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
	 * @see foaf.FoafPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see foaf.FoafPackage#getDocumentRoot_XSISchemaLocation()
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
	 * @see foaf.FoafPackage#getDocumentRoot_Homepage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='homepage' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getHomepage();

	/**
	 * Sets the value of the '{@link foaf.DocumentRoot#getHomepage <em>Homepage</em>}' containment reference.
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
	 * @see foaf.FoafPackage#getDocumentRoot_Mbox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mbox' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getMbox();

	/**
	 * Sets the value of the '{@link foaf.DocumentRoot#getMbox <em>Mbox</em>}' containment reference.
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
	 * @see foaf.FoafPackage#getDocumentRoot_Name()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	PlainLiteral getName();

	/**
	 * Sets the value of the '{@link foaf.DocumentRoot#getName <em>Name</em>}' containment reference.
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
	 * @see foaf.FoafPackage#getDocumentRoot_Page()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='page' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getPage();

	/**
	 * Sets the value of the '{@link foaf.DocumentRoot#getPage <em>Page</em>}' containment reference.
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
	 * @see foaf.FoafPackage#getDocumentRoot_Phone()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='phone' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getPhone();

	/**
	 * Sets the value of the '{@link foaf.DocumentRoot#getPhone <em>Phone</em>}' containment reference.
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
	 * @see foaf.FoafPackage#getDocumentRoot_PrimaryTopic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primaryTopic' namespace='##targetNamespace'"
	 * @generated
	 */
	Resource getPrimaryTopic();

	/**
	 * Sets the value of the '{@link foaf.DocumentRoot#getPrimaryTopic <em>Primary Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Topic</em>' containment reference.
	 * @see #getPrimaryTopic()
	 * @generated
	 */
	void setPrimaryTopic(Resource value);

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' containment reference.
	 * @see #setOrganisation(Organization)
	 * @see foaf.FoafPackage#getDocumentRoot_Organisation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Organisation' namespace='##targetNamespace'"
	 * @generated
	 */
	Organization getOrganisation();

	/**
	 * Sets the value of the '{@link foaf.DocumentRoot#getOrganisation <em>Organisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' containment reference.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(Organization value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(Person)
	 * @see foaf.FoafPackage#getDocumentRoot_Person()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link foaf.DocumentRoot#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

} // DocumentRoot
