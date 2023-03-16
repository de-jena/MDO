/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unsubscribe Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.UnsubscribeResponse#getActive <em>Active</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getUnsubscribeResponse()
 * @model extendedMetaData="name='UnsubscribeResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UnsubscribeResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getUnsubscribeResponse_Active()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Active' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getActive();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.UnsubscribeResponse#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(IBISIPBoolean value);

} // UnsubscribeResponse
