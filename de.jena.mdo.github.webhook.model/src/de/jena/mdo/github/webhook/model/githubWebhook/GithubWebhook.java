/*
 */
package de.jena.mdo.github.webhook.model.githubWebhook;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Webhook</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.GithubWebhook#getEvent <em>Event</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.GithubWebhook#getPayload <em>Payload</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getGithubWebhook()
 * @model
 * @generated
 */
@ProviderType
public interface GithubWebhook extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getGithubWebhook_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.GithubWebhook#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload</em>' containment reference.
	 * @see #setPayload(Payload)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getGithubWebhook_Payload()
	 * @model containment="true"
	 * @generated
	 */
	Payload getPayload();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.GithubWebhook#getPayload <em>Payload</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload</em>' containment reference.
	 * @see #getPayload()
	 * @generated
	 */
	void setPayload(Payload value);

} // GithubWebhook
