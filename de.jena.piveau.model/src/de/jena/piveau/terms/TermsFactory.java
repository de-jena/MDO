/*
 */
package de.jena.piveau.terms;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.jena.piveau.terms.TermsPackage
 * @generated
 */
@ProviderType
public interface TermsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TermsFactory eINSTANCE = de.jena.piveau.terms.impl.TermsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>License Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>License Document</em>'.
	 * @generated
	 */
	LicenseDocument createLicenseDocument();

	/**
	 * Returns a new object of class '<em>License Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>License Document Type</em>'.
	 * @generated
	 */
	LicenseDocumentType createLicenseDocumentType();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location Type</em>'.
	 * @generated
	 */
	LocationType createLocationType();

	/**
	 * Returns a new object of class '<em>Period Of Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Period Of Time</em>'.
	 * @generated
	 */
	PeriodOfTime createPeriodOfTime();

	/**
	 * Returns a new object of class '<em>Period Of Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Period Of Time Type</em>'.
	 * @generated
	 */
	PeriodOfTimeType createPeriodOfTimeType();

	/**
	 * Returns a new object of class '<em>Provenance Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provenance Statement</em>'.
	 * @generated
	 */
	ProvenanceStatement createProvenanceStatement();

	/**
	 * Returns a new object of class '<em>Provenance Statement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provenance Statement Type</em>'.
	 * @generated
	 */
	ProvenanceStatementType createProvenanceStatementType();

	/**
	 * Returns a new object of class '<em>Rights Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rights Statement</em>'.
	 * @generated
	 */
	RightsStatement createRightsStatement();

	/**
	 * Returns a new object of class '<em>Rights Statement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rights Statement Type</em>'.
	 * @generated
	 */
	RightsStatementType createRightsStatementType();

	/**
	 * Returns a new object of class '<em>Standard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard</em>'.
	 * @generated
	 */
	Standard createStandard();

	/**
	 * Returns a new object of class '<em>Standard Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard Type</em>'.
	 * @generated
	 */
	StandardType createStandardType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TermsPackage getTermsPackage();

} //TermsFactory
