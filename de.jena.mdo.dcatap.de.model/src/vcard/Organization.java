/*
 */
package vcard;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link vcard.Organization#getOrganization <em>Organization</em>}</li>
 *   <li>{@link vcard.Organization#getIndividual <em>Individual</em>}</li>
 * </ul>
 *
 * @see vcard.VcardPackage#getOrganization()
 * @model extendedMetaData="name='Organization' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Organization extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(OrganizationType)
	 * @see vcard.VcardPackage#getOrganization_Organization()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationType getOrganization();

	/**
	 * Sets the value of the '{@link vcard.Organization#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(OrganizationType value);

	/**
	 * Returns the value of the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual</em>' containment reference.
	 * @see #setIndividual(OrganizationType)
	 * @see vcard.VcardPackage#getOrganization_Individual()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Individual' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationType getIndividual();

	/**
	 * Sets the value of the '{@link vcard.Organization#getIndividual <em>Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' containment reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(OrganizationType value);

} // Organization
