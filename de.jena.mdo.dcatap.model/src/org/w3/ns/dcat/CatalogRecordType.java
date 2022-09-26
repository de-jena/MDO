/**
 */
package org.w3.ns.dcat;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.purl.dc.terms.terms.Standard;

import org.w3.ns.rdf.DateOrDateTimeLiteral;
import org.w3.ns.rdf.PlainLiteral;
import org.w3.ns.rdf.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog Record Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         dcat:CatalogRecord represents a metadata item in the catalog, primarily concerning the registration information,
 *         such as who added the item and when.
 * 
 *         https://www.w3.org/TR/vocab-dcat-2/#Class:Catalog_Record
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.dcat.CatalogRecordType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3.ns.dcat.CatalogRecordType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.w3.ns.dcat.CatalogRecordType#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.w3.ns.dcat.CatalogRecordType#getModified <em>Modified</em>}</li>
 *   <li>{@link org.w3.ns.dcat.CatalogRecordType#getPrimaryTopic <em>Primary Topic</em>}</li>
 *   <li>{@link org.w3.ns.dcat.CatalogRecordType#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link org.w3.ns.dcat.CatalogRecordType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.w3.ns.dcat.CatalogRecordType#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.dcat.DcatPackage#getCatalogRecordType()
 * @model extendedMetaData="name='CatalogRecordType' kind='elementOnly'"
 * @generated
 */
public interface CatalogRecordType extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getCatalogRecordType_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<PlainLiteral> getTitle();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getCatalogRecordType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<PlainLiteral> getDescription();

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(DateOrDateTimeLiteral)
	 * @see org.w3.ns.dcat.DcatPackage#getCatalogRecordType_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	DateOrDateTimeLiteral getIssued();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.CatalogRecordType#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' containment reference.
	 * @see #setModified(DateOrDateTimeLiteral)
	 * @see org.w3.ns.dcat.DcatPackage#getCatalogRecordType_Modified()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='modified' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	DateOrDateTimeLiteral getModified();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.CatalogRecordType#getModified <em>Modified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified</em>' containment reference.
	 * @see #getModified()
	 * @generated
	 */
	void setModified(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>Primary Topic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Topic</em>' containment reference.
	 * @see #setPrimaryTopic(Resource)
	 * @see org.w3.ns.dcat.DcatPackage#getCatalogRecordType_PrimaryTopic()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='primaryTopic' namespace='http://xmlns.com/foaf/0.1/'"
	 * @generated
	 */
	Resource getPrimaryTopic();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.CatalogRecordType#getPrimaryTopic <em>Primary Topic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Topic</em>' containment reference.
	 * @see #getPrimaryTopic()
	 * @generated
	 */
	void setPrimaryTopic(Resource value);

	/**
	 * Returns the value of the '<em><b>Conforms To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conforms To</em>' containment reference.
	 * @see #setConformsTo(Standard)
	 * @see org.w3.ns.dcat.DcatPackage#getCatalogRecordType_ConformsTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='conformsTo' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	Standard getConformsTo();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.CatalogRecordType#getConformsTo <em>Conforms To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conforms To</em>' containment reference.
	 * @see #getConformsTo()
	 * @generated
	 */
	void setConformsTo(Standard value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.rdf.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see org.w3.ns.dcat.DcatPackage#getCatalogRecordType_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='http://purl.org/dc/terms/'"
	 * @generated
	 */
	EList<Resource> getLanguage();

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see org.w3.ns.dcat.DcatPackage#getCatalogRecordType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link org.w3.ns.dcat.CatalogRecordType#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

} // CatalogRecordType
