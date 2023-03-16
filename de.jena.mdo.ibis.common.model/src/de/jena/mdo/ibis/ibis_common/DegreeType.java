/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degree Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DegreeType#getDegree <em>Degree</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DegreeType#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDegreeType()
 * @model extendedMetaData="name='DegreeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DegreeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Degree</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' containment reference.
	 * @see #setDegree(IBISIPDouble)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDegreeType_Degree()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Degree' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDouble getDegree();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DegreeType#getDegree <em>Degree</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' containment reference.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(IBISIPDouble value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' containment reference.
	 * @see #setOrientation(IBISIPString)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDegreeType_Orientation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Orientation' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getOrientation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DegreeType#getOrientation <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' containment reference.
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(IBISIPString value);

} // DegreeType
