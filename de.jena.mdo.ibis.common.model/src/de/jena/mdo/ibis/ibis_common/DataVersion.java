/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Structure for describing data-versions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DataVersion#getDataType <em>Data Type</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.DataVersion#getVersionRef <em>Version Ref</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDataVersion()
 * @model extendedMetaData="name='DataVersionStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DataVersion extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kind of data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(IBISIPString)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDataVersion_DataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DataType' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPString getDataType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DataVersion#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(IBISIPString value);

	/**
	 * Returns the value of the '<em><b>Version Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Versionreference of the data
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Ref</em>' containment reference.
	 * @see #setVersionRef(IBISIPNMTOKEN)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getDataVersion_VersionRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VersionRef' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPNMTOKEN getVersionRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.DataVersion#getVersionRef <em>Version Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Ref</em>' containment reference.
	 * @see #getVersionRef()
	 * @generated
	 */
	void setVersionRef(IBISIPNMTOKEN value);

} // DataVersion
