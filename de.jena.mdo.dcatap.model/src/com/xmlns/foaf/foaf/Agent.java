/**
 */
package com.xmlns.foaf.foaf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.xmlns.foaf.foaf.Agent#getAgent <em>Agent</em>}</li>
 * </ul>
 *
 * @see com.xmlns.foaf.foaf.FoafPackage#getAgent()
 * @model extendedMetaData="name='Agent' kind='elementOnly'"
 * @generated
 */
public interface Agent extends EObject {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' containment reference.
	 * @see #setAgent(AgentType)
	 * @see com.xmlns.foaf.foaf.FoafPackage#getAgent_Agent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Agent' namespace='##targetNamespace'"
	 * @generated
	 */
	AgentType getAgent();

	/**
	 * Sets the value of the '{@link com.xmlns.foaf.foaf.Agent#getAgent <em>Agent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' containment reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(AgentType value);

} // Agent
