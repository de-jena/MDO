/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ServiceStart#getServiceIdentification <em>Service Identification</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.ServiceStart#getAutostart <em>Autostart</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceStart()
 * @model extendedMetaData="name='ServiceStartStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ServiceStart extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Identification</em>' containment reference.
	 * @see #setServiceIdentification(ServiceIdentification)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceStart_ServiceIdentification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ServiceIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceIdentification getServiceIdentification();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.ServiceStart#getServiceIdentification <em>Service Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Identification</em>' containment reference.
	 * @see #getServiceIdentification()
	 * @generated
	 */
	void setServiceIdentification(ServiceIdentification value);

	/**
	 * Returns the value of the '<em><b>Autostart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autostart</em>' containment reference.
	 * @see #setAutostart(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getServiceStart_Autostart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Autostart' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getAutostart();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.ServiceStart#getAutostart <em>Autostart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autostart</em>' containment reference.
	 * @see #getAutostart()
	 * @generated
	 */
	void setAutostart(IBISIPBoolean value);

} // ServiceStart
