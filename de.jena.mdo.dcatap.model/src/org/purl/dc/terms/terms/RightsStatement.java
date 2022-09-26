/**
 */
package org.purl.dc.terms.terms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rights Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.purl.dc.terms.terms.RightsStatement#getRightsStatement <em>Rights Statement</em>}</li>
 * </ul>
 *
 * @see org.purl.dc.terms.terms.TermsPackage#getRightsStatement()
 * @model extendedMetaData="name='RightsStatement' kind='elementOnly'"
 * @generated
 */
public interface RightsStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Rights Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights Statement</em>' containment reference.
	 * @see #setRightsStatement(RightsStatementType)
	 * @see org.purl.dc.terms.terms.TermsPackage#getRightsStatement_RightsStatement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RightsStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	RightsStatementType getRightsStatement();

	/**
	 * Sets the value of the '{@link org.purl.dc.terms.terms.RightsStatement#getRightsStatement <em>Rights Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rights Statement</em>' containment reference.
	 * @see #getRightsStatement()
	 * @generated
	 */
	void setRightsStatement(RightsStatementType value);

} // RightsStatement
