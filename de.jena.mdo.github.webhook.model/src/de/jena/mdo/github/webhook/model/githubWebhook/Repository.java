/*
 */
package de.jena.mdo.github.webhook.model.githubWebhook;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getNode_id <em>Node id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getFull_name <em>Full name</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isPrivate <em>Private</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getHtml_url <em>Html url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isFork <em>Fork</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getUrl <em>Url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getForks_url <em>Forks url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getKeys_url <em>Keys url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCollaborators_url <em>Collaborators url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getTeams_url <em>Teams url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getHooks_url <em>Hooks url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getIssue_events_url <em>Issue events url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getEvents_url <em>Events url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getAssignees_url <em>Assignees url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getBranches_url <em>Branches url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getTags_url <em>Tags url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getBlobs_url <em>Blobs url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_tags_url <em>Git tags url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_refs_url <em>Git refs url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getTrees_url <em>Trees url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStatuses_url <em>Statuses url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLanguages_url <em>Languages url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStargazers_url <em>Stargazers url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getContributors_url <em>Contributors url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSubscribers_url <em>Subscribers url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSubscription_url <em>Subscription url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCommits_url <em>Commits url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_commits_url <em>Git commits url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getComments_url <em>Comments url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getIssue_comment_url <em>Issue comment url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getContents_url <em>Contents url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCompare_url <em>Compare url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMerges_url <em>Merges url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getArchive_url <em>Archive url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDownloads_url <em>Downloads url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getIssues_url <em>Issues url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getPulls_url <em>Pulls url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMilestones_url <em>Milestones url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getNotifications_url <em>Notifications url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLabels_url <em>Labels url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getReleases_url <em>Releases url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDeployments_url <em>Deployments url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getUpdated_at <em>Updated at</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getPushed_at <em>Pushed at</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_url <em>Git url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSsh_url <em>Ssh url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getClone_url <em>Clone url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSvn_url <em>Svn url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getHomepage <em>Homepage</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSize <em>Size</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStargazers_count <em>Stargazers count</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getWatchers_count <em>Watchers count</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_issues <em>Has issues</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_projects <em>Has projects</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_downloads <em>Has downloads</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_wiki <em>Has wiki</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_pages <em>Has pages</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_discussions <em>Has discussions</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getForks_count <em>Forks count</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMirror_url <em>Mirror url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isArchived <em>Archived</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getOpen_issues_count <em>Open issues count</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLicense <em>License</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isAllow_forking <em>Allow forking</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isIs_template <em>Is template</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isWeb_commit_signoff_required <em>Web commit signoff required</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getForks <em>Forks</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getOpen_issues <em>Open issues</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getWatchers <em>Watchers</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDefault_branch <em>Default branch</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStargazers <em>Stargazers</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMaster_branch <em>Master branch</em>}</li>
 * </ul>
 *
 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository()
 * @model
 * @generated
 */
@ProviderType
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getId <em>Id</em>}' attribute.
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
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Node_id()
	 * @model
	 * @generated
	 */
	String getNode_id();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getNode_id <em>Node id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node id</em>' attribute.
	 * @see #getNode_id()
	 * @generated
	 */
	void setNode_id(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Full name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full name</em>' attribute.
	 * @see #setFull_name(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Full_name()
	 * @model
	 * @generated
	 */
	String getFull_name();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getFull_name <em>Full name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full name</em>' attribute.
	 * @see #getFull_name()
	 * @generated
	 */
	void setFull_name(String value);

	/**
	 * Returns the value of the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private</em>' attribute.
	 * @see #setPrivate(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Private()
	 * @model
	 * @generated
	 */
	boolean isPrivate();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isPrivate <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private</em>' attribute.
	 * @see #isPrivate()
	 * @generated
	 */
	void setPrivate(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Owner)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Owner()
	 * @model containment="true"
	 * @generated
	 */
	Owner getOwner();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Owner value);

	/**
	 * Returns the value of the '<em><b>Html url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html url</em>' attribute.
	 * @see #setHtml_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Html_url()
	 * @model
	 * @generated
	 */
	String getHtml_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getHtml_url <em>Html url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html url</em>' attribute.
	 * @see #getHtml_url()
	 * @generated
	 */
	void setHtml_url(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Fork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork</em>' attribute.
	 * @see #setFork(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Fork()
	 * @model
	 * @generated
	 */
	boolean isFork();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isFork <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fork</em>' attribute.
	 * @see #isFork()
	 * @generated
	 */
	void setFork(boolean value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Forks url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forks url</em>' attribute.
	 * @see #setForks_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Forks_url()
	 * @model
	 * @generated
	 */
	String getForks_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getForks_url <em>Forks url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forks url</em>' attribute.
	 * @see #getForks_url()
	 * @generated
	 */
	void setForks_url(String value);

	/**
	 * Returns the value of the '<em><b>Keys url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys url</em>' attribute.
	 * @see #setKeys_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Keys_url()
	 * @model
	 * @generated
	 */
	String getKeys_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getKeys_url <em>Keys url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keys url</em>' attribute.
	 * @see #getKeys_url()
	 * @generated
	 */
	void setKeys_url(String value);

	/**
	 * Returns the value of the '<em><b>Collaborators url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaborators url</em>' attribute.
	 * @see #setCollaborators_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Collaborators_url()
	 * @model
	 * @generated
	 */
	String getCollaborators_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCollaborators_url <em>Collaborators url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaborators url</em>' attribute.
	 * @see #getCollaborators_url()
	 * @generated
	 */
	void setCollaborators_url(String value);

	/**
	 * Returns the value of the '<em><b>Teams url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams url</em>' attribute.
	 * @see #setTeams_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Teams_url()
	 * @model
	 * @generated
	 */
	String getTeams_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getTeams_url <em>Teams url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teams url</em>' attribute.
	 * @see #getTeams_url()
	 * @generated
	 */
	void setTeams_url(String value);

	/**
	 * Returns the value of the '<em><b>Hooks url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hooks url</em>' attribute.
	 * @see #setHooks_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Hooks_url()
	 * @model
	 * @generated
	 */
	String getHooks_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getHooks_url <em>Hooks url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hooks url</em>' attribute.
	 * @see #getHooks_url()
	 * @generated
	 */
	void setHooks_url(String value);

	/**
	 * Returns the value of the '<em><b>Issue events url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue events url</em>' attribute.
	 * @see #setIssue_events_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Issue_events_url()
	 * @model
	 * @generated
	 */
	String getIssue_events_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getIssue_events_url <em>Issue events url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue events url</em>' attribute.
	 * @see #getIssue_events_url()
	 * @generated
	 */
	void setIssue_events_url(String value);

	/**
	 * Returns the value of the '<em><b>Events url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events url</em>' attribute.
	 * @see #setEvents_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Events_url()
	 * @model
	 * @generated
	 */
	String getEvents_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getEvents_url <em>Events url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Events url</em>' attribute.
	 * @see #getEvents_url()
	 * @generated
	 */
	void setEvents_url(String value);

	/**
	 * Returns the value of the '<em><b>Assignees url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignees url</em>' attribute.
	 * @see #setAssignees_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Assignees_url()
	 * @model
	 * @generated
	 */
	String getAssignees_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getAssignees_url <em>Assignees url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignees url</em>' attribute.
	 * @see #getAssignees_url()
	 * @generated
	 */
	void setAssignees_url(String value);

	/**
	 * Returns the value of the '<em><b>Branches url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches url</em>' attribute.
	 * @see #setBranches_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Branches_url()
	 * @model
	 * @generated
	 */
	String getBranches_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getBranches_url <em>Branches url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branches url</em>' attribute.
	 * @see #getBranches_url()
	 * @generated
	 */
	void setBranches_url(String value);

	/**
	 * Returns the value of the '<em><b>Tags url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags url</em>' attribute.
	 * @see #setTags_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Tags_url()
	 * @model
	 * @generated
	 */
	String getTags_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getTags_url <em>Tags url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags url</em>' attribute.
	 * @see #getTags_url()
	 * @generated
	 */
	void setTags_url(String value);

	/**
	 * Returns the value of the '<em><b>Blobs url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blobs url</em>' attribute.
	 * @see #setBlobs_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Blobs_url()
	 * @model
	 * @generated
	 */
	String getBlobs_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getBlobs_url <em>Blobs url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blobs url</em>' attribute.
	 * @see #getBlobs_url()
	 * @generated
	 */
	void setBlobs_url(String value);

	/**
	 * Returns the value of the '<em><b>Git tags url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Git tags url</em>' attribute.
	 * @see #setGit_tags_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Git_tags_url()
	 * @model
	 * @generated
	 */
	String getGit_tags_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_tags_url <em>Git tags url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Git tags url</em>' attribute.
	 * @see #getGit_tags_url()
	 * @generated
	 */
	void setGit_tags_url(String value);

	/**
	 * Returns the value of the '<em><b>Git refs url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Git refs url</em>' attribute.
	 * @see #setGit_refs_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Git_refs_url()
	 * @model
	 * @generated
	 */
	String getGit_refs_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_refs_url <em>Git refs url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Git refs url</em>' attribute.
	 * @see #getGit_refs_url()
	 * @generated
	 */
	void setGit_refs_url(String value);

	/**
	 * Returns the value of the '<em><b>Trees url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trees url</em>' attribute.
	 * @see #setTrees_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Trees_url()
	 * @model
	 * @generated
	 */
	String getTrees_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getTrees_url <em>Trees url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trees url</em>' attribute.
	 * @see #getTrees_url()
	 * @generated
	 */
	void setTrees_url(String value);

	/**
	 * Returns the value of the '<em><b>Statuses url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statuses url</em>' attribute.
	 * @see #setStatuses_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Statuses_url()
	 * @model
	 * @generated
	 */
	String getStatuses_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStatuses_url <em>Statuses url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statuses url</em>' attribute.
	 * @see #getStatuses_url()
	 * @generated
	 */
	void setStatuses_url(String value);

	/**
	 * Returns the value of the '<em><b>Languages url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages url</em>' attribute.
	 * @see #setLanguages_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Languages_url()
	 * @model
	 * @generated
	 */
	String getLanguages_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLanguages_url <em>Languages url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Languages url</em>' attribute.
	 * @see #getLanguages_url()
	 * @generated
	 */
	void setLanguages_url(String value);

	/**
	 * Returns the value of the '<em><b>Stargazers url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stargazers url</em>' attribute.
	 * @see #setStargazers_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Stargazers_url()
	 * @model
	 * @generated
	 */
	String getStargazers_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStargazers_url <em>Stargazers url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stargazers url</em>' attribute.
	 * @see #getStargazers_url()
	 * @generated
	 */
	void setStargazers_url(String value);

	/**
	 * Returns the value of the '<em><b>Contributors url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributors url</em>' attribute.
	 * @see #setContributors_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Contributors_url()
	 * @model
	 * @generated
	 */
	String getContributors_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getContributors_url <em>Contributors url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributors url</em>' attribute.
	 * @see #getContributors_url()
	 * @generated
	 */
	void setContributors_url(String value);

	/**
	 * Returns the value of the '<em><b>Subscribers url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribers url</em>' attribute.
	 * @see #setSubscribers_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Subscribers_url()
	 * @model
	 * @generated
	 */
	String getSubscribers_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSubscribers_url <em>Subscribers url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribers url</em>' attribute.
	 * @see #getSubscribers_url()
	 * @generated
	 */
	void setSubscribers_url(String value);

	/**
	 * Returns the value of the '<em><b>Subscription url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscription url</em>' attribute.
	 * @see #setSubscription_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Subscription_url()
	 * @model
	 * @generated
	 */
	String getSubscription_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSubscription_url <em>Subscription url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription url</em>' attribute.
	 * @see #getSubscription_url()
	 * @generated
	 */
	void setSubscription_url(String value);

	/**
	 * Returns the value of the '<em><b>Commits url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commits url</em>' attribute.
	 * @see #setCommits_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Commits_url()
	 * @model
	 * @generated
	 */
	String getCommits_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCommits_url <em>Commits url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commits url</em>' attribute.
	 * @see #getCommits_url()
	 * @generated
	 */
	void setCommits_url(String value);

	/**
	 * Returns the value of the '<em><b>Git commits url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Git commits url</em>' attribute.
	 * @see #setGit_commits_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Git_commits_url()
	 * @model
	 * @generated
	 */
	String getGit_commits_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_commits_url <em>Git commits url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Git commits url</em>' attribute.
	 * @see #getGit_commits_url()
	 * @generated
	 */
	void setGit_commits_url(String value);

	/**
	 * Returns the value of the '<em><b>Comments url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comments url</em>' attribute.
	 * @see #setComments_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Comments_url()
	 * @model
	 * @generated
	 */
	String getComments_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getComments_url <em>Comments url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comments url</em>' attribute.
	 * @see #getComments_url()
	 * @generated
	 */
	void setComments_url(String value);

	/**
	 * Returns the value of the '<em><b>Issue comment url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue comment url</em>' attribute.
	 * @see #setIssue_comment_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Issue_comment_url()
	 * @model
	 * @generated
	 */
	String getIssue_comment_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getIssue_comment_url <em>Issue comment url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue comment url</em>' attribute.
	 * @see #getIssue_comment_url()
	 * @generated
	 */
	void setIssue_comment_url(String value);

	/**
	 * Returns the value of the '<em><b>Contents url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents url</em>' attribute.
	 * @see #setContents_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Contents_url()
	 * @model
	 * @generated
	 */
	String getContents_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getContents_url <em>Contents url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents url</em>' attribute.
	 * @see #getContents_url()
	 * @generated
	 */
	void setContents_url(String value);

	/**
	 * Returns the value of the '<em><b>Compare url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compare url</em>' attribute.
	 * @see #setCompare_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Compare_url()
	 * @model
	 * @generated
	 */
	String getCompare_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCompare_url <em>Compare url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compare url</em>' attribute.
	 * @see #getCompare_url()
	 * @generated
	 */
	void setCompare_url(String value);

	/**
	 * Returns the value of the '<em><b>Merges url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merges url</em>' attribute.
	 * @see #setMerges_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Merges_url()
	 * @model
	 * @generated
	 */
	String getMerges_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMerges_url <em>Merges url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merges url</em>' attribute.
	 * @see #getMerges_url()
	 * @generated
	 */
	void setMerges_url(String value);

	/**
	 * Returns the value of the '<em><b>Archive url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive url</em>' attribute.
	 * @see #setArchive_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Archive_url()
	 * @model
	 * @generated
	 */
	String getArchive_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getArchive_url <em>Archive url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive url</em>' attribute.
	 * @see #getArchive_url()
	 * @generated
	 */
	void setArchive_url(String value);

	/**
	 * Returns the value of the '<em><b>Downloads url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downloads url</em>' attribute.
	 * @see #setDownloads_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Downloads_url()
	 * @model
	 * @generated
	 */
	String getDownloads_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDownloads_url <em>Downloads url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downloads url</em>' attribute.
	 * @see #getDownloads_url()
	 * @generated
	 */
	void setDownloads_url(String value);

	/**
	 * Returns the value of the '<em><b>Issues url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues url</em>' attribute.
	 * @see #setIssues_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Issues_url()
	 * @model
	 * @generated
	 */
	String getIssues_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getIssues_url <em>Issues url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issues url</em>' attribute.
	 * @see #getIssues_url()
	 * @generated
	 */
	void setIssues_url(String value);

	/**
	 * Returns the value of the '<em><b>Pulls url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pulls url</em>' attribute.
	 * @see #setPulls_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Pulls_url()
	 * @model
	 * @generated
	 */
	String getPulls_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getPulls_url <em>Pulls url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pulls url</em>' attribute.
	 * @see #getPulls_url()
	 * @generated
	 */
	void setPulls_url(String value);

	/**
	 * Returns the value of the '<em><b>Milestones url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestones url</em>' attribute.
	 * @see #setMilestones_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Milestones_url()
	 * @model
	 * @generated
	 */
	String getMilestones_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMilestones_url <em>Milestones url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milestones url</em>' attribute.
	 * @see #getMilestones_url()
	 * @generated
	 */
	void setMilestones_url(String value);

	/**
	 * Returns the value of the '<em><b>Notifications url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications url</em>' attribute.
	 * @see #setNotifications_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Notifications_url()
	 * @model
	 * @generated
	 */
	String getNotifications_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getNotifications_url <em>Notifications url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notifications url</em>' attribute.
	 * @see #getNotifications_url()
	 * @generated
	 */
	void setNotifications_url(String value);

	/**
	 * Returns the value of the '<em><b>Labels url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels url</em>' attribute.
	 * @see #setLabels_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Labels_url()
	 * @model
	 * @generated
	 */
	String getLabels_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLabels_url <em>Labels url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labels url</em>' attribute.
	 * @see #getLabels_url()
	 * @generated
	 */
	void setLabels_url(String value);

	/**
	 * Returns the value of the '<em><b>Releases url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releases url</em>' attribute.
	 * @see #setReleases_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Releases_url()
	 * @model
	 * @generated
	 */
	String getReleases_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getReleases_url <em>Releases url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Releases url</em>' attribute.
	 * @see #getReleases_url()
	 * @generated
	 */
	void setReleases_url(String value);

	/**
	 * Returns the value of the '<em><b>Deployments url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployments url</em>' attribute.
	 * @see #setDeployments_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Deployments_url()
	 * @model
	 * @generated
	 */
	String getDeployments_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDeployments_url <em>Deployments url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployments url</em>' attribute.
	 * @see #getDeployments_url()
	 * @generated
	 */
	void setDeployments_url(String value);

	/**
	 * Returns the value of the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created at</em>' attribute.
	 * @see #setCreated_at(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Created_at()
	 * @model
	 * @generated
	 */
	int getCreated_at();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCreated_at <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created at</em>' attribute.
	 * @see #getCreated_at()
	 * @generated
	 */
	void setCreated_at(int value);

	/**
	 * Returns the value of the '<em><b>Updated at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated at</em>' attribute.
	 * @see #setUpdated_at(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Updated_at()
	 * @model
	 * @generated
	 */
	String getUpdated_at();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getUpdated_at <em>Updated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated at</em>' attribute.
	 * @see #getUpdated_at()
	 * @generated
	 */
	void setUpdated_at(String value);

	/**
	 * Returns the value of the '<em><b>Pushed at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pushed at</em>' attribute.
	 * @see #setPushed_at(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Pushed_at()
	 * @model
	 * @generated
	 */
	int getPushed_at();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getPushed_at <em>Pushed at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pushed at</em>' attribute.
	 * @see #getPushed_at()
	 * @generated
	 */
	void setPushed_at(int value);

	/**
	 * Returns the value of the '<em><b>Git url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Git url</em>' attribute.
	 * @see #setGit_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Git_url()
	 * @model
	 * @generated
	 */
	String getGit_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_url <em>Git url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Git url</em>' attribute.
	 * @see #getGit_url()
	 * @generated
	 */
	void setGit_url(String value);

	/**
	 * Returns the value of the '<em><b>Ssh url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh url</em>' attribute.
	 * @see #setSsh_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Ssh_url()
	 * @model
	 * @generated
	 */
	String getSsh_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSsh_url <em>Ssh url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh url</em>' attribute.
	 * @see #getSsh_url()
	 * @generated
	 */
	void setSsh_url(String value);

	/**
	 * Returns the value of the '<em><b>Clone url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clone url</em>' attribute.
	 * @see #setClone_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Clone_url()
	 * @model
	 * @generated
	 */
	String getClone_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getClone_url <em>Clone url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clone url</em>' attribute.
	 * @see #getClone_url()
	 * @generated
	 */
	void setClone_url(String value);

	/**
	 * Returns the value of the '<em><b>Svn url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svn url</em>' attribute.
	 * @see #setSvn_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Svn_url()
	 * @model
	 * @generated
	 */
	String getSvn_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSvn_url <em>Svn url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Svn url</em>' attribute.
	 * @see #getSvn_url()
	 * @generated
	 */
	void setSvn_url(String value);

	/**
	 * Returns the value of the '<em><b>Homepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Homepage</em>' attribute.
	 * @see #setHomepage(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Homepage()
	 * @model
	 * @generated
	 */
	String getHomepage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getHomepage <em>Homepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Homepage</em>' attribute.
	 * @see #getHomepage()
	 * @generated
	 */
	void setHomepage(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Stargazers count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stargazers count</em>' attribute.
	 * @see #setStargazers_count(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Stargazers_count()
	 * @model
	 * @generated
	 */
	int getStargazers_count();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStargazers_count <em>Stargazers count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stargazers count</em>' attribute.
	 * @see #getStargazers_count()
	 * @generated
	 */
	void setStargazers_count(int value);

	/**
	 * Returns the value of the '<em><b>Watchers count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watchers count</em>' attribute.
	 * @see #setWatchers_count(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Watchers_count()
	 * @model
	 * @generated
	 */
	int getWatchers_count();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getWatchers_count <em>Watchers count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watchers count</em>' attribute.
	 * @see #getWatchers_count()
	 * @generated
	 */
	void setWatchers_count(int value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Has issues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has issues</em>' attribute.
	 * @see #setHas_issues(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Has_issues()
	 * @model
	 * @generated
	 */
	boolean isHas_issues();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_issues <em>Has issues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has issues</em>' attribute.
	 * @see #isHas_issues()
	 * @generated
	 */
	void setHas_issues(boolean value);

	/**
	 * Returns the value of the '<em><b>Has projects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has projects</em>' attribute.
	 * @see #setHas_projects(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Has_projects()
	 * @model
	 * @generated
	 */
	boolean isHas_projects();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_projects <em>Has projects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has projects</em>' attribute.
	 * @see #isHas_projects()
	 * @generated
	 */
	void setHas_projects(boolean value);

	/**
	 * Returns the value of the '<em><b>Has downloads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has downloads</em>' attribute.
	 * @see #setHas_downloads(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Has_downloads()
	 * @model
	 * @generated
	 */
	boolean isHas_downloads();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_downloads <em>Has downloads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has downloads</em>' attribute.
	 * @see #isHas_downloads()
	 * @generated
	 */
	void setHas_downloads(boolean value);

	/**
	 * Returns the value of the '<em><b>Has wiki</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has wiki</em>' attribute.
	 * @see #setHas_wiki(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Has_wiki()
	 * @model
	 * @generated
	 */
	boolean isHas_wiki();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_wiki <em>Has wiki</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has wiki</em>' attribute.
	 * @see #isHas_wiki()
	 * @generated
	 */
	void setHas_wiki(boolean value);

	/**
	 * Returns the value of the '<em><b>Has pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has pages</em>' attribute.
	 * @see #setHas_pages(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Has_pages()
	 * @model
	 * @generated
	 */
	boolean isHas_pages();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_pages <em>Has pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has pages</em>' attribute.
	 * @see #isHas_pages()
	 * @generated
	 */
	void setHas_pages(boolean value);

	/**
	 * Returns the value of the '<em><b>Has discussions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has discussions</em>' attribute.
	 * @see #setHas_discussions(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Has_discussions()
	 * @model
	 * @generated
	 */
	boolean isHas_discussions();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_discussions <em>Has discussions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has discussions</em>' attribute.
	 * @see #isHas_discussions()
	 * @generated
	 */
	void setHas_discussions(boolean value);

	/**
	 * Returns the value of the '<em><b>Forks count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forks count</em>' attribute.
	 * @see #setForks_count(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Forks_count()
	 * @model
	 * @generated
	 */
	int getForks_count();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getForks_count <em>Forks count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forks count</em>' attribute.
	 * @see #getForks_count()
	 * @generated
	 */
	void setForks_count(int value);

	/**
	 * Returns the value of the '<em><b>Mirror url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mirror url</em>' attribute.
	 * @see #setMirror_url(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Mirror_url()
	 * @model
	 * @generated
	 */
	String getMirror_url();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMirror_url <em>Mirror url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mirror url</em>' attribute.
	 * @see #getMirror_url()
	 * @generated
	 */
	void setMirror_url(String value);

	/**
	 * Returns the value of the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archived</em>' attribute.
	 * @see #setArchived(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Archived()
	 * @model
	 * @generated
	 */
	boolean isArchived();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isArchived <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archived</em>' attribute.
	 * @see #isArchived()
	 * @generated
	 */
	void setArchived(boolean value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Disabled()
	 * @model
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Open issues count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open issues count</em>' attribute.
	 * @see #setOpen_issues_count(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Open_issues_count()
	 * @model
	 * @generated
	 */
	int getOpen_issues_count();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getOpen_issues_count <em>Open issues count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open issues count</em>' attribute.
	 * @see #getOpen_issues_count()
	 * @generated
	 */
	void setOpen_issues_count(int value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' containment reference.
	 * @see #setLicense(License)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_License()
	 * @model containment="true"
	 * @generated
	 */
	License getLicense();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLicense <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' containment reference.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(License value);

	/**
	 * Returns the value of the '<em><b>Allow forking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow forking</em>' attribute.
	 * @see #setAllow_forking(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Allow_forking()
	 * @model
	 * @generated
	 */
	boolean isAllow_forking();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isAllow_forking <em>Allow forking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow forking</em>' attribute.
	 * @see #isAllow_forking()
	 * @generated
	 */
	void setAllow_forking(boolean value);

	/**
	 * Returns the value of the '<em><b>Is template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is template</em>' attribute.
	 * @see #setIs_template(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Is_template()
	 * @model
	 * @generated
	 */
	boolean isIs_template();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isIs_template <em>Is template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is template</em>' attribute.
	 * @see #isIs_template()
	 * @generated
	 */
	void setIs_template(boolean value);

	/**
	 * Returns the value of the '<em><b>Web commit signoff required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web commit signoff required</em>' attribute.
	 * @see #setWeb_commit_signoff_required(boolean)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Web_commit_signoff_required()
	 * @model
	 * @generated
	 */
	boolean isWeb_commit_signoff_required();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isWeb_commit_signoff_required <em>Web commit signoff required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web commit signoff required</em>' attribute.
	 * @see #isWeb_commit_signoff_required()
	 * @generated
	 */
	void setWeb_commit_signoff_required(boolean value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see #setVisibility(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Visibility()
	 * @model
	 * @generated
	 */
	String getVisibility();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(String value);

	/**
	 * Returns the value of the '<em><b>Forks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forks</em>' attribute.
	 * @see #setForks(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Forks()
	 * @model
	 * @generated
	 */
	int getForks();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getForks <em>Forks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forks</em>' attribute.
	 * @see #getForks()
	 * @generated
	 */
	void setForks(int value);

	/**
	 * Returns the value of the '<em><b>Open issues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open issues</em>' attribute.
	 * @see #setOpen_issues(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Open_issues()
	 * @model
	 * @generated
	 */
	int getOpen_issues();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getOpen_issues <em>Open issues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open issues</em>' attribute.
	 * @see #getOpen_issues()
	 * @generated
	 */
	void setOpen_issues(int value);

	/**
	 * Returns the value of the '<em><b>Watchers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watchers</em>' attribute.
	 * @see #setWatchers(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Watchers()
	 * @model
	 * @generated
	 */
	int getWatchers();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getWatchers <em>Watchers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Watchers</em>' attribute.
	 * @see #getWatchers()
	 * @generated
	 */
	void setWatchers(int value);

	/**
	 * Returns the value of the '<em><b>Default branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default branch</em>' attribute.
	 * @see #setDefault_branch(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Default_branch()
	 * @model
	 * @generated
	 */
	String getDefault_branch();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDefault_branch <em>Default branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default branch</em>' attribute.
	 * @see #getDefault_branch()
	 * @generated
	 */
	void setDefault_branch(String value);

	/**
	 * Returns the value of the '<em><b>Stargazers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stargazers</em>' attribute.
	 * @see #setStargazers(int)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Stargazers()
	 * @model
	 * @generated
	 */
	int getStargazers();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStargazers <em>Stargazers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stargazers</em>' attribute.
	 * @see #getStargazers()
	 * @generated
	 */
	void setStargazers(int value);

	/**
	 * Returns the value of the '<em><b>Master branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master branch</em>' attribute.
	 * @see #setMaster_branch(String)
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage#getRepository_Master_branch()
	 * @model
	 * @generated
	 */
	String getMaster_branch();

	/**
	 * Sets the value of the '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMaster_branch <em>Master branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master branch</em>' attribute.
	 * @see #getMaster_branch()
	 * @generated
	 */
	void setMaster_branch(String value);

} // Repository
