/*
 */
package de.jena.mdo.github.webhook.model.githubWebhook;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>License</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getKey <em>Key</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getSpdx_id <em>Spdx id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getUrl <em>Url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getNode_id <em>Node id</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getLicense()
 * @model
 * @generated
 */
@ProviderType
public interface License extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getLicense_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getLicense_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Spdx id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spdx id</em>' attribute.
	 * @see #setSpdx_id(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getLicense_Spdx_id()
	 * @model
	 * @generated
	 */
	String getSpdx_id();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getSpdx_id <em>Spdx id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spdx id</em>' attribute.
	 * @see #getSpdx_id()
	 * @generated
	 */
	void setSpdx_id(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getLicense_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Node id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node id</em>' attribute.
	 * @see #setNode_id(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getLicense_Node_id()
	 * @model
	 * @generated
	 */
	String getNode_id();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getNode_id <em>Node id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node id</em>' attribute.
	 * @see #getNode_id()
	 * @generated
	 */
	void setNode_id(String value);

} // License
