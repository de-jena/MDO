/*
 */
package terms;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

import rdf.PlainLiteral;
import rdf.Resource;

import skos.Concept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terms.LicenseDocumentType#getType <em>Type</em>}</li>
 *   <li>{@link terms.LicenseDocumentType#getTitle <em>Title</em>}</li>
 *   <li>{@link terms.LicenseDocumentType#getDescription <em>Description</em>}</li>
 *   <li>{@link terms.LicenseDocumentType#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link terms.LicenseDocumentType#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @see terms.TermsPackage#getLicenseDocumentType()
 * @model extendedMetaData="name='LicenseDocument_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LicenseDocumentType extends Resource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link skos.Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see terms.TermsPackage#getLicenseDocumentType_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Concept> getType();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see terms.TermsPackage#getLicenseDocumentType_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlainLiteral> getTitle();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see terms.TermsPackage#getLicenseDocumentType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlainLiteral> getDescription();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see terms.TermsPackage#getLicenseDocumentType_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PlainLiteral> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID</em>' attribute.
	 * @see #setNodeID(String)
	 * @see terms.TermsPackage#getLicenseDocumentType_NodeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='nodeID' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link terms.LicenseDocumentType#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

} // LicenseDocumentType
