/**
 */
package org.purl.dc.terms.terms;

import org.eclipse.emf.ecore.EObject;

import org.w3.ns.rdf.DateOrDateTimeLiteral;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Period Of Time Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.terms.PeriodOfTimeType#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.PeriodOfTimeType#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.PeriodOfTimeType#getAbout <em>About</em>}</li>
 *   <li>{@link org.purl.dc.terms.terms.PeriodOfTimeType#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @see org.purl.dc.terms.terms.TermsPackage#getPeriodOfTimeType()
 * @model extendedMetaData="name='PeriodOfTime_._type' kind='elementOnly'"
 * @generated
 */
public interface PeriodOfTimeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' containment reference.
	 * @see #setStartDate(DateOrDateTimeLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getPeriodOfTimeType_StartDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startDate' namespace='http://schema.org/'"
	 * @generated
	 */
	DateOrDateTimeLiteral getStartDate();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.PeriodOfTimeType#getStartDate <em>Start Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' containment reference.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' containment reference.
	 * @see #setEndDate(DateOrDateTimeLiteral)
	 * @see org.purl.dc.terms.terms.TermsPackage#getPeriodOfTimeType_EndDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endDate' namespace='http://schema.org/'"
	 * @generated
	 */
	DateOrDateTimeLiteral getEndDate();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.PeriodOfTimeType#getEndDate <em>End Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' containment reference.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(DateOrDateTimeLiteral value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see org.purl.dc.terms.terms.TermsPackage#getPeriodOfTimeType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.PeriodOfTimeType#getAbout <em>About</em>}' attribute.
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
	 * @see org.purl.dc.terms.terms.TermsPackage#getPeriodOfTimeType_NodeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='nodeID' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.PeriodOfTimeType#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

} // PeriodOfTimeType
