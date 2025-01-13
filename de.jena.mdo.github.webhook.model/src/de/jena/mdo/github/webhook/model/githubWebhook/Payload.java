/*
 */
package de.jena.mdo.github.webhook.model.githubWebhook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getRef <em>Ref</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getBefore <em>Before</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getAfter <em>After</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getRepository <em>Repository</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getPusher <em>Pusher</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getSender <em>Sender</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getInstallation <em>Installation</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#isCreated <em>Created</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#isDeleted <em>Deleted</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#isForced <em>Forced</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getBase_ref <em>Base ref</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getCompare <em>Compare</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getCommits <em>Commits</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getHead_commit <em>Head commit</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload()
 * @model
 * @generated
 */
@ProviderType
public interface Payload extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Ref()
	 * @model
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before</em>' attribute.
	 * @see #setBefore(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Before()
	 * @model
	 * @generated
	 */
	String getBefore();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getBefore <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before</em>' attribute.
	 * @see #getBefore()
	 * @generated
	 */
	void setBefore(String value);

	/**
	 * Returns the value of the '<em><b>After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' attribute.
	 * @see #setAfter(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_After()
	 * @model
	 * @generated
	 */
	String getAfter();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getAfter <em>After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' attribute.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(Repository)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Repository()
	 * @model containment="true"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Pusher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pusher</em>' containment reference.
	 * @see #setPusher(Pusher)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Pusher()
	 * @model containment="true"
	 * @generated
	 */
	Pusher getPusher();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getPusher <em>Pusher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pusher</em>' containment reference.
	 * @see #getPusher()
	 * @generated
	 */
	void setPusher(Pusher value);

	/**
	 * Returns the value of the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sender</em>' containment reference.
	 * @see #setSender(Sender)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Sender()
	 * @model containment="true"
	 * @generated
	 */
	Sender getSender();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getSender <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sender</em>' containment reference.
	 * @see #getSender()
	 * @generated
	 */
	void setSender(Sender value);

	/**
	 * Returns the value of the '<em><b>Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installation</em>' containment reference.
	 * @see #setInstallation(Installation)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Installation()
	 * @model containment="true"
	 * @generated
	 */
	Installation getInstallation();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getInstallation <em>Installation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installation</em>' containment reference.
	 * @see #getInstallation()
	 * @generated
	 */
	void setInstallation(Installation value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created</em>' attribute.
	 * @see #setCreated(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Created()
	 * @model
	 * @generated
	 */
	boolean isCreated();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#isCreated <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' attribute.
	 * @see #isCreated()
	 * @generated
	 */
	void setCreated(boolean value);

	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted</em>' attribute.
	 * @see #setDeleted(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Deleted()
	 * @model
	 * @generated
	 */
	boolean isDeleted();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#isDeleted <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted</em>' attribute.
	 * @see #isDeleted()
	 * @generated
	 */
	void setDeleted(boolean value);

	/**
	 * Returns the value of the '<em><b>Forced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forced</em>' attribute.
	 * @see #setForced(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Forced()
	 * @model
	 * @generated
	 */
	boolean isForced();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#isForced <em>Forced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forced</em>' attribute.
	 * @see #isForced()
	 * @generated
	 */
	void setForced(boolean value);

	/**
	 * Returns the value of the '<em><b>Base ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base ref</em>' attribute.
	 * @see #setBase_ref(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Base_ref()
	 * @model
	 * @generated
	 */
	String getBase_ref();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getBase_ref <em>Base ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base ref</em>' attribute.
	 * @see #getBase_ref()
	 * @generated
	 */
	void setBase_ref(String value);

	/**
	 * Returns the value of the '<em><b>Compare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare</em>' attribute.
	 * @see #setCompare(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Compare()
	 * @model
	 * @generated
	 */
	String getCompare();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getCompare <em>Compare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare</em>' attribute.
	 * @see #getCompare()
	 * @generated
	 */
	void setCompare(String value);

	/**
	 * Returns the value of the '<em><b>Commits</b></em>' containment reference list.
	 * The list contents are of type {@link de.jena.mdo.github.webhook.model.githubWebhook.Commit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commits</em>' containment reference list.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Commits()
	 * @model containment="true"
	 * @generated
	 */
	EList<Commit> getCommits();

	/**
	 * Returns the value of the '<em><b>Head commit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head commit</em>' containment reference.
	 * @see #setHead_commit(Commit)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getPayload_Head_commit()
	 * @model containment="true"
	 * @generated
	 */
	Commit getHead_commit();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getHead_commit <em>Head commit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head commit</em>' containment reference.
	 * @see #getHead_commit()
	 * @generated
	 */
	void setHead_commit(Commit value);

} // Payload
