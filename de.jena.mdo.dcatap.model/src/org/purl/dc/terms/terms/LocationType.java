/**
 */
package org.purl.dc.terms.terms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.w3.ns.rdf.PlainLiteral;
import org.w3.ns.rdf.TypedLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.terms.LocationType#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.LocationType#getPrefLabel <em>Pref Label</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.LocationType#getAbout <em>About</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.LocationType#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @see org.purl.dc.terms.terms.TermsPackage#getLocationType()
 * @model extendedMetaData="name='Location_._type' kind='elementOnly'"
 * @generated
 */
public interface LocationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.rdf.TypedLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference list.
	 * @see org.purl.dc.terms.terms.TermsPackage#getLocationType_Geometry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='geometry' namespace='http://www.w3.org/ns/locn#'"
	 * @generated
	 */
	EList<TypedLiteral> getGeometry();

	/**
	 * Returns the value of the '<em><b>Pref Label</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.ns.rdf.PlainLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pref Label</em>' containment reference list.
	 * @see org.purl.dc.terms.terms.TermsPackage#getLocationType_PrefLabel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prefLabel' namespace='http://www.w3.org/2004/02/skos/core#'"
	 * @generated
	 */
	EList<PlainLiteral> getPrefLabel();

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getLocationType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.LocationType#getAbout <em>About</em>}' attribute.
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
	 * @see org.purl.dc.terms.terms.TermsPackage#getLocationType_NodeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='nodeID' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.LocationType#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

} // LocationType