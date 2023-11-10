/*
 */
package terms;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terms.Standard#getStandard <em>Standard</em>}</li>
 * </ul>
 *
 * @see terms.TermsPackage#getStandard()
 * @model extendedMetaData="name='Standard' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Standard extends EObject {
	/**
	 * Returns the value of the '<em><b>Standard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard</em>' containment reference.
	 * @see #setStandard(StandardType)
	 * @see terms.TermsPackage#getStandard_Standard()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Standard' namespace='##targetNamespace'"
	 * @generated
	 */
	StandardType getStandard();

	/**
	 * Sets the value of the '{@link terms.Standard#getStandard <em>Standard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard</em>' containment reference.
	 * @see #getStandard()
	 * @generated
	 */
	void setStandard(StandardType value);

} // Standard
