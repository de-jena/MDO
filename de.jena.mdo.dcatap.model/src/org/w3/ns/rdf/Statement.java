/**
 */
package org.w3.ns.rdf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.w3.ns.rdf.Statement#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.w3.ns.rdf.RdfPackage#getStatement()
 * @model extendedMetaData="name='Statement' kind='elementOnly'"
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference.
	 * @see #setStatement(StatementType)
	 * @see org.w3.ns.rdf.RdfPackage#getStatement_Statement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Statement' namespace='##targetNamespace'"
	 * @generated
	 */
	StatementType getStatement();

	/**
	 * Sets the value of the '{@link org.w3.ns.rdf.Statement#getStatement <em>Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' containment reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(StatementType value);

} // Statement
