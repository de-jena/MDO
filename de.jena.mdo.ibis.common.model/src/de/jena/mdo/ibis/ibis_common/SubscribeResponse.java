/*
 */
package de.jena.mdo.ibis.ibis_common;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscribe Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * For compatibility reasons, this structure is now a sequence of members, all of which are optional - of course, at least one member should be included in meaningful data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.SubscribeResponse#getActive <em>Active</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.ibis_common.SubscribeResponse#getHeartbeat <em>Heartbeat</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getSubscribeResponse()
 * @model extendedMetaData="name='SubscribeResponseStructure' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubscribeResponse extends GeneralResponse {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' containment reference.
	 * @see #setActive(IBISIPBoolean)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getSubscribeResponse_Active()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Active' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPBoolean getActive();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.SubscribeResponse#getActive <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' containment reference.
	 * @see #getActive()
	 * @generated
	 */
	void setActive(IBISIPBoolean value);

	/**
	 * Returns the value of the '<em><b>Heartbeat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the service returns a heartbeat value and it is not 0, the subscriber can expect that the service will send data at least every heartbeat seconds.	This heartbeat can be used to monitor the connection quality by the client. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Heartbeat</em>' containment reference.
	 * @see #setHeartbeat(IBISIPDuration)
	 * @see de.jena.mdo.ibis.ibis_common.IbisCommonPackage#getSubscribeResponse_Heartbeat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Heartbeat' namespace='##targetNamespace'"
	 * @generated
	 */
	IBISIPDuration getHeartbeat();

	/**
	 * Sets the value of the '{@link de.jena.mdo.ibis.ibis_common.SubscribeResponse#getHeartbeat <em>Heartbeat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heartbeat</em>' containment reference.
	 * @see #getHeartbeat()
	 * @generated
	 */
	void setHeartbeat(IBISIPDuration value);

} // SubscribeResponse
