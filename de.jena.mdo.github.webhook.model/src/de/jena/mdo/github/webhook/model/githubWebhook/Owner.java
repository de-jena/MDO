/*
 */
package de.jena.mdo.github.webhook.model.githubWebhook;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getEmail <em>Email</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getLogin <em>Login</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getNode_id <em>Node id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getAvatar_url <em>Avatar url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getGravatar_id <em>Gravatar id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getUrl <em>Url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getHtml_url <em>Html url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getFollowers_url <em>Followers url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getFollowing_url <em>Following url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getGists_url <em>Gists url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getStarred_url <em>Starred url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getSubscriptions_url <em>Subscriptions url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getOrganizations_url <em>Organizations url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getRepos_url <em>Repos url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getEvents_url <em>Events url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getReceived_events_url <em>Received events url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#isSite_admin <em>Site admin</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getUser_view_type <em>User view type</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner()
 * @model
 * @generated
 */
@ProviderType
public interface Owner extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' attribute.
	 * @see #setLogin(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Login()
	 * @model
	 * @generated
	 */
	String getLogin();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getLogin <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' attribute.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Node id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node id</em>' attribute.
	 * @see #setNode_id(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Node_id()
	 * @model
	 * @generated
	 */
	String getNode_id();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getNode_id <em>Node id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node id</em>' attribute.
	 * @see #getNode_id()
	 * @generated
	 */
	void setNode_id(String value);

	/**
	 * Returns the value of the '<em><b>Avatar url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avatar url</em>' attribute.
	 * @see #setAvatar_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Avatar_url()
	 * @model
	 * @generated
	 */
	String getAvatar_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getAvatar_url <em>Avatar url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avatar url</em>' attribute.
	 * @see #getAvatar_url()
	 * @generated
	 */
	void setAvatar_url(String value);

	/**
	 * Returns the value of the '<em><b>Gravatar id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravatar id</em>' attribute.
	 * @see #setGravatar_id(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Gravatar_id()
	 * @model
	 * @generated
	 */
	String getGravatar_id();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getGravatar_id <em>Gravatar id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravatar id</em>' attribute.
	 * @see #getGravatar_id()
	 * @generated
	 */
	void setGravatar_id(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Html url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html url</em>' attribute.
	 * @see #setHtml_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Html_url()
	 * @model
	 * @generated
	 */
	String getHtml_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getHtml_url <em>Html url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html url</em>' attribute.
	 * @see #getHtml_url()
	 * @generated
	 */
	void setHtml_url(String value);

	/**
	 * Returns the value of the '<em><b>Followers url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followers url</em>' attribute.
	 * @see #setFollowers_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Followers_url()
	 * @model
	 * @generated
	 */
	String getFollowers_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getFollowers_url <em>Followers url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Followers url</em>' attribute.
	 * @see #getFollowers_url()
	 * @generated
	 */
	void setFollowers_url(String value);

	/**
	 * Returns the value of the '<em><b>Following url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Following url</em>' attribute.
	 * @see #setFollowing_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Following_url()
	 * @model
	 * @generated
	 */
	String getFollowing_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getFollowing_url <em>Following url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Following url</em>' attribute.
	 * @see #getFollowing_url()
	 * @generated
	 */
	void setFollowing_url(String value);

	/**
	 * Returns the value of the '<em><b>Gists url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gists url</em>' attribute.
	 * @see #setGists_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Gists_url()
	 * @model
	 * @generated
	 */
	String getGists_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getGists_url <em>Gists url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gists url</em>' attribute.
	 * @see #getGists_url()
	 * @generated
	 */
	void setGists_url(String value);

	/**
	 * Returns the value of the '<em><b>Starred url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starred url</em>' attribute.
	 * @see #setStarred_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Starred_url()
	 * @model
	 * @generated
	 */
	String getStarred_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getStarred_url <em>Starred url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starred url</em>' attribute.
	 * @see #getStarred_url()
	 * @generated
	 */
	void setStarred_url(String value);

	/**
	 * Returns the value of the '<em><b>Subscriptions url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriptions url</em>' attribute.
	 * @see #setSubscriptions_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Subscriptions_url()
	 * @model
	 * @generated
	 */
	String getSubscriptions_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getSubscriptions_url <em>Subscriptions url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriptions url</em>' attribute.
	 * @see #getSubscriptions_url()
	 * @generated
	 */
	void setSubscriptions_url(String value);

	/**
	 * Returns the value of the '<em><b>Organizations url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations url</em>' attribute.
	 * @see #setOrganizations_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Organizations_url()
	 * @model
	 * @generated
	 */
	String getOrganizations_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getOrganizations_url <em>Organizations url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organizations url</em>' attribute.
	 * @see #getOrganizations_url()
	 * @generated
	 */
	void setOrganizations_url(String value);

	/**
	 * Returns the value of the '<em><b>Repos url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repos url</em>' attribute.
	 * @see #setRepos_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Repos_url()
	 * @model
	 * @generated
	 */
	String getRepos_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getRepos_url <em>Repos url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repos url</em>' attribute.
	 * @see #getRepos_url()
	 * @generated
	 */
	void setRepos_url(String value);

	/**
	 * Returns the value of the '<em><b>Events url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events url</em>' attribute.
	 * @see #setEvents_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Events_url()
	 * @model
	 * @generated
	 */
	String getEvents_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getEvents_url <em>Events url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Events url</em>' attribute.
	 * @see #getEvents_url()
	 * @generated
	 */
	void setEvents_url(String value);

	/**
	 * Returns the value of the '<em><b>Received events url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received events url</em>' attribute.
	 * @see #setReceived_events_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Received_events_url()
	 * @model
	 * @generated
	 */
	String getReceived_events_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getReceived_events_url <em>Received events url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received events url</em>' attribute.
	 * @see #getReceived_events_url()
	 * @generated
	 */
	void setReceived_events_url(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Site admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site admin</em>' attribute.
	 * @see #setSite_admin(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_Site_admin()
	 * @model
	 * @generated
	 */
	boolean isSite_admin();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#isSite_admin <em>Site admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Site admin</em>' attribute.
	 * @see #isSite_admin()
	 * @generated
	 */
	void setSite_admin(boolean value);

	/**
	 * Returns the value of the '<em><b>User view type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User view type</em>' attribute.
	 * @see #setUser_view_type(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getOwner_User_view_type()
	 * @model
	 * @generated
	 */
	String getUser_view_type();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getUser_view_type <em>User view type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User view type</em>' attribute.
	 * @see #getUser_view_type()
	 * @generated
	 */
	void setUser_view_type(String value);

} // Owner
