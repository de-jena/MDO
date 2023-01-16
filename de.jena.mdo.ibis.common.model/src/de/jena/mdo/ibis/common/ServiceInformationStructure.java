/*
 */
package de.jena.mdo.ibis.common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Information Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.ServiceInformationStructure#getService <em>Service</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.ServiceInformationStructure#getAutostart <em>Autostart</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceInformationStructure()
 * @model extendedMetaData="name='ServiceInformationStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceInformationStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(ServiceSpecificationStructure)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceInformationStructure_Service()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Service' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceSpecificationStructure getService();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ServiceInformationStructure#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceSpecificationStructure value);

	/**
	 * Returns the value of the '<em><b>Autostart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autostart</em>' containment reference.
	 * @see #setAutostart(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.common.IbisCommonPackage#getServiceInformationStructure_Autostart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Autostart' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getAutostart();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.common.ServiceInformationStructure#getAutostart <em>Autostart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autostart</em>' containment reference.
	 * @see #getAutostart()
	 * @generated
	 */
	void setAutostart(IBISIPBoolean value);

} // ServiceInformationStructure
