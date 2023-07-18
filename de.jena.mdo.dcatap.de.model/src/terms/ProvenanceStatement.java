/**
 */
package terms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provenance Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terms.ProvenanceStatement#getProvenanceStatement <em>Provenance Statement</em>}</li>
 * </ul>
 *
 * @see terms.TermsPackage#getProvenanceStatement()
 * @model extendedMetaData="name='ProvenanceStatement' kind='elementOnly'"
 * @generated
 */
public interface ProvenanceStatement extends EObject {
	/**
	 * Returns the value of the '<em><b>Provenance Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provenance Statement</em>' containment reference.
	 * @see #setProvenanceStatement(ProvenanceStatementType)
	 * @see terms.TermsPackage#getProvenanceStatement_ProvenanceStatement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ProvenanceStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	ProvenanceStatementType getProvenanceStatement();

	/**
	 * Sets the value of the '{@link terms.ProvenanceStatement#getProvenanceStatement <em>Provenance Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provenance Statement</em>' containment reference.
	 * @see #getProvenanceStatement()
	 * @generated
	 */
	void setProvenanceStatement(ProvenanceStatementType value);

} // ProvenanceStatement
