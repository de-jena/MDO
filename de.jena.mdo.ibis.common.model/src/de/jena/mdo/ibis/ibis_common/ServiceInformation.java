/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ServiceInformation#getService <em>Service</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ServiceInformation#getAutostart <em>Autostart</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceInformation()
 * @model extendedMetaData="name='ServiceInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(ServiceSpecification)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceInformation_Service()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Service' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceSpecification getService();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.ServiceInformation#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceSpecification value);

	/**
	 * Returns the value of the '<em><b>Autostart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autostart</em>' containment reference.
	 * @see #setAutostart(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceInformation_Autostart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Autostart' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getAutostart();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.ServiceInformation#getAutostart <em>Autostart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autostart</em>' containment reference.
	 * @see #getAutostart()
	 * @generated
	 */
	void setAutostart(IBISIPBoolean value);

} // ServiceInformation
