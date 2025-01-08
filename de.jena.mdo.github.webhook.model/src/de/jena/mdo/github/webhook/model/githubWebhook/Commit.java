/*
 */
package de.jena.mdo.github.webhook.model.githubWebhook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getTree_id <em>Tree id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getMessage <em>Message</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getUrl <em>Url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getCommitter <em>Committer</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getModified <em>Modified</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getAdded <em>Added</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getCommit()
 * @model
 * @generated
 */
@ProviderType
public interface Commit extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getCommit_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Tree id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree id</em>' attribute.
	 * @see #setTree_id(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getCommit_Tree_id()
	 * @model
	 * @generated
	 */
	String getTree_id();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getTree_id <em>Tree id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree id</em>' attribute.
	 * @see #getTree_id()
	 * @generated
	 */
	void setTree_id(String value);

	/**
	 * Returns the value of the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct</em>' attribute.
	 * @see #setDistinct(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getCommit_Distinct()
	 * @model
	 * @generated
	 */
	boolean isDistinct();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#isDistinct <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct</em>' attribute.
	 * @see #isDistinct()
	 * @generated
	 */
	void setDistinct(boolean value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getCommit_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getCommit_Timestamp()
	 * @model
	 * @generated
	 */
	String getTimestamp();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getCommit_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Author)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getCommit_Author()
	 * @model containment="true"
	 * @generated
	 */
	Author getAuthor();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Author value);

	/**
	 * Returns the value of the '<em><b>Committer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Committer</em>' containment reference.
	 * @see #setCommitter(Committer)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getCommit_Committer()
	 * @model containment="true"
	 * @generated
	 */
	Committer getCommitter();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getCommitter <em>Committer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committer</em>' containment reference.
	 * @see #getCommitter()
	 * @generated
	 */
	void setCommitter(Committer value);

	/**
	 * Returns the value of the '<em><b>Modified</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified</em>' attribute list.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getCommit_Modified()
	 * @model
	 * @generated
	 */
	EList<String> getModified();

	/**
	 * Returns the value of the '<em><b>Added</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added</em>' attribute list.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getCommit_Added()
	 * @model
	 * @generated
	 */
	EList<String> getAdded();

} // Commit
