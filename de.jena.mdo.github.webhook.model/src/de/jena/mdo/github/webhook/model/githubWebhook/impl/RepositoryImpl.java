/*
 */
package de.jena.mdo.github.webhook.model.githubWebhook.impl;

import de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage;
import de.jena.mdo.github.webhook.model.githubWebhook.License;
import de.jena.mdo.github.webhook.model.githubWebhook.Owner;
import de.jena.mdo.github.webhook.model.githubWebhook.Repository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getNode_id <em>Node id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getFull_name <em>Full name</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isPrivate <em>Private</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getHtml_url <em>Html url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isFork <em>Fork</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getForks_url <em>Forks url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getKeys_url <em>Keys url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getCollaborators_url <em>Collaborators url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getTeams_url <em>Teams url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getHooks_url <em>Hooks url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getIssue_events_url <em>Issue events url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getEvents_url <em>Events url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getAssignees_url <em>Assignees url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getBranches_url <em>Branches url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getTags_url <em>Tags url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getBlobs_url <em>Blobs url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getGit_tags_url <em>Git tags url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getGit_refs_url <em>Git refs url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getTrees_url <em>Trees url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getStatuses_url <em>Statuses url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getLanguages_url <em>Languages url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getStargazers_url <em>Stargazers url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getContributors_url <em>Contributors url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getSubscribers_url <em>Subscribers url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getSubscription_url <em>Subscription url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getCommits_url <em>Commits url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getGit_commits_url <em>Git commits url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getComments_url <em>Comments url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getIssue_comment_url <em>Issue comment url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getContents_url <em>Contents url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getCompare_url <em>Compare url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getMerges_url <em>Merges url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getArchive_url <em>Archive url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getDownloads_url <em>Downloads url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getIssues_url <em>Issues url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getPulls_url <em>Pulls url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getMilestones_url <em>Milestones url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getNotifications_url <em>Notifications url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getLabels_url <em>Labels url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getReleases_url <em>Releases url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getDeployments_url <em>Deployments url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getCreated_at <em>Created at</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getUpdated_at <em>Updated at</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getPushed_at <em>Pushed at</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getGit_url <em>Git url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getSsh_url <em>Ssh url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getClone_url <em>Clone url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getSvn_url <em>Svn url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getHomepage <em>Homepage</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getSize <em>Size</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getStargazers_count <em>Stargazers count</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getWatchers_count <em>Watchers count</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isHas_issues <em>Has issues</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isHas_projects <em>Has projects</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isHas_downloads <em>Has downloads</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isHas_wiki <em>Has wiki</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isHas_pages <em>Has pages</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isHas_discussions <em>Has discussions</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getForks_count <em>Forks count</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getMirror_url <em>Mirror url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isArchived <em>Archived</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getOpen_issues_count <em>Open issues count</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getLicense <em>License</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isAllow_forking <em>Allow forking</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isIs_template <em>Is template</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#isWeb_commit_signoff_required <em>Web commit signoff required</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getForks <em>Forks</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getOpen_issues <em>Open issues</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getWatchers <em>Watchers</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getDefault_branch <em>Default branch</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getStargazers <em>Stargazers</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl#getMaster_branch <em>Master branch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNode_id() <em>Node id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_id()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode_id() <em>Node id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode_id()
	 * @generated
	 * @ordered
	 */
	protected String node_id = NODE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFull_name() <em>Full name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFull_name()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFull_name() <em>Full name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFull_name()
	 * @generated
	 * @ordered
	 */
	protected String full_name = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRIVATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrivate() <em>Private</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrivate()
	 * @generated
	 * @ordered
	 */
	protected boolean private_ = PRIVATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Owner owner;

	/**
	 * The default value of the '{@link #getHtml_url() <em>Html url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtml_url()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHtml_url() <em>Html url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtml_url()
	 * @generated
	 * @ordered
	 */
	protected String html_url = HTML_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isFork() <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFork()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFork() <em>Fork</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFork()
	 * @generated
	 * @ordered
	 */
	protected boolean fork = FORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getForks_url() <em>Forks url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForks_url()
	 * @generated
	 * @ordered
	 */
	protected static final String FORKS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForks_url() <em>Forks url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForks_url()
	 * @generated
	 * @ordered
	 */
	protected String forks_url = FORKS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeys_url() <em>Keys url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys_url()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeys_url() <em>Keys url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys_url()
	 * @generated
	 * @ordered
	 */
	protected String keys_url = KEYS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollaborators_url() <em>Collaborators url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborators_url()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLABORATORS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollaborators_url() <em>Collaborators url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborators_url()
	 * @generated
	 * @ordered
	 */
	protected String collaborators_url = COLLABORATORS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeams_url() <em>Teams url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams_url()
	 * @generated
	 * @ordered
	 */
	protected static final String TEAMS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeams_url() <em>Teams url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams_url()
	 * @generated
	 * @ordered
	 */
	protected String teams_url = TEAMS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHooks_url() <em>Hooks url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHooks_url()
	 * @generated
	 * @ordered
	 */
	protected static final String HOOKS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHooks_url() <em>Hooks url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHooks_url()
	 * @generated
	 * @ordered
	 */
	protected String hooks_url = HOOKS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssue_events_url() <em>Issue events url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue_events_url()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_EVENTS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssue_events_url() <em>Issue events url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue_events_url()
	 * @generated
	 * @ordered
	 */
	protected String issue_events_url = ISSUE_EVENTS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvents_url() <em>Events url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents_url()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENTS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvents_url() <em>Events url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents_url()
	 * @generated
	 * @ordered
	 */
	protected String events_url = EVENTS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssignees_url() <em>Assignees url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignees_url()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNEES_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignees_url() <em>Assignees url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignees_url()
	 * @generated
	 * @ordered
	 */
	protected String assignees_url = ASSIGNEES_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBranches_url() <em>Branches url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches_url()
	 * @generated
	 * @ordered
	 */
	protected static final String BRANCHES_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBranches_url() <em>Branches url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches_url()
	 * @generated
	 * @ordered
	 */
	protected String branches_url = BRANCHES_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTags_url() <em>Tags url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags_url()
	 * @generated
	 * @ordered
	 */
	protected static final String TAGS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTags_url() <em>Tags url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags_url()
	 * @generated
	 * @ordered
	 */
	protected String tags_url = TAGS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlobs_url() <em>Blobs url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlobs_url()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOBS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlobs_url() <em>Blobs url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlobs_url()
	 * @generated
	 * @ordered
	 */
	protected String blobs_url = BLOBS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGit_tags_url() <em>Git tags url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGit_tags_url()
	 * @generated
	 * @ordered
	 */
	protected static final String GIT_TAGS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGit_tags_url() <em>Git tags url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGit_tags_url()
	 * @generated
	 * @ordered
	 */
	protected String git_tags_url = GIT_TAGS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGit_refs_url() <em>Git refs url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGit_refs_url()
	 * @generated
	 * @ordered
	 */
	protected static final String GIT_REFS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGit_refs_url() <em>Git refs url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGit_refs_url()
	 * @generated
	 * @ordered
	 */
	protected String git_refs_url = GIT_REFS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrees_url() <em>Trees url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrees_url()
	 * @generated
	 * @ordered
	 */
	protected static final String TREES_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrees_url() <em>Trees url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrees_url()
	 * @generated
	 * @ordered
	 */
	protected String trees_url = TREES_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatuses_url() <em>Statuses url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatuses_url()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUSES_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatuses_url() <em>Statuses url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatuses_url()
	 * @generated
	 * @ordered
	 */
	protected String statuses_url = STATUSES_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguages_url() <em>Languages url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages_url()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGES_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguages_url() <em>Languages url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguages_url()
	 * @generated
	 * @ordered
	 */
	protected String languages_url = LANGUAGES_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStargazers_url() <em>Stargazers url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStargazers_url()
	 * @generated
	 * @ordered
	 */
	protected static final String STARGAZERS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStargazers_url() <em>Stargazers url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStargazers_url()
	 * @generated
	 * @ordered
	 */
	protected String stargazers_url = STARGAZERS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContributors_url() <em>Contributors url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributors_url()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIBUTORS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContributors_url() <em>Contributors url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributors_url()
	 * @generated
	 * @ordered
	 */
	protected String contributors_url = CONTRIBUTORS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscribers_url() <em>Subscribers url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers_url()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBERS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscribers_url() <em>Subscribers url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribers_url()
	 * @generated
	 * @ordered
	 */
	protected String subscribers_url = SUBSCRIBERS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscription_url() <em>Subscription url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription_url()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscription_url() <em>Subscription url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription_url()
	 * @generated
	 * @ordered
	 */
	protected String subscription_url = SUBSCRIPTION_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommits_url() <em>Commits url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommits_url()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMITS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommits_url() <em>Commits url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommits_url()
	 * @generated
	 * @ordered
	 */
	protected String commits_url = COMMITS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGit_commits_url() <em>Git commits url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGit_commits_url()
	 * @generated
	 * @ordered
	 */
	protected static final String GIT_COMMITS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGit_commits_url() <em>Git commits url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGit_commits_url()
	 * @generated
	 * @ordered
	 */
	protected String git_commits_url = GIT_COMMITS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getComments_url() <em>Comments url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments_url()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENTS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComments_url() <em>Comments url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments_url()
	 * @generated
	 * @ordered
	 */
	protected String comments_url = COMMENTS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssue_comment_url() <em>Issue comment url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue_comment_url()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_COMMENT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssue_comment_url() <em>Issue comment url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssue_comment_url()
	 * @generated
	 * @ordered
	 */
	protected String issue_comment_url = ISSUE_COMMENT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContents_url() <em>Contents url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents_url()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENTS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContents_url() <em>Contents url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents_url()
	 * @generated
	 * @ordered
	 */
	protected String contents_url = CONTENTS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompare_url() <em>Compare url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare_url()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompare_url() <em>Compare url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare_url()
	 * @generated
	 * @ordered
	 */
	protected String compare_url = COMPARE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMerges_url() <em>Merges url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerges_url()
	 * @generated
	 * @ordered
	 */
	protected static final String MERGES_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMerges_url() <em>Merges url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerges_url()
	 * @generated
	 * @ordered
	 */
	protected String merges_url = MERGES_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchive_url() <em>Archive url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchive_url()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHIVE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchive_url() <em>Archive url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchive_url()
	 * @generated
	 * @ordered
	 */
	protected String archive_url = ARCHIVE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDownloads_url() <em>Downloads url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloads_url()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNLOADS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDownloads_url() <em>Downloads url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloads_url()
	 * @generated
	 * @ordered
	 */
	protected String downloads_url = DOWNLOADS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssues_url() <em>Issues url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues_url()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUES_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssues_url() <em>Issues url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues_url()
	 * @generated
	 * @ordered
	 */
	protected String issues_url = ISSUES_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPulls_url() <em>Pulls url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulls_url()
	 * @generated
	 * @ordered
	 */
	protected static final String PULLS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPulls_url() <em>Pulls url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPulls_url()
	 * @generated
	 * @ordered
	 */
	protected String pulls_url = PULLS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMilestones_url() <em>Milestones url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestones_url()
	 * @generated
	 * @ordered
	 */
	protected static final String MILESTONES_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMilestones_url() <em>Milestones url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMilestones_url()
	 * @generated
	 * @ordered
	 */
	protected String milestones_url = MILESTONES_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotifications_url() <em>Notifications url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifications_url()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATIONS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotifications_url() <em>Notifications url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifications_url()
	 * @generated
	 * @ordered
	 */
	protected String notifications_url = NOTIFICATIONS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabels_url() <em>Labels url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels_url()
	 * @generated
	 * @ordered
	 */
	protected static final String LABELS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabels_url() <em>Labels url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels_url()
	 * @generated
	 * @ordered
	 */
	protected String labels_url = LABELS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleases_url() <em>Releases url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleases_url()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASES_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleases_url() <em>Releases url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleases_url()
	 * @generated
	 * @ordered
	 */
	protected String releases_url = RELEASES_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeployments_url() <em>Deployments url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments_url()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENTS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployments_url() <em>Deployments url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployments_url()
	 * @generated
	 * @ordered
	 */
	protected String deployments_url = DEPLOYMENTS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreated_at() <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated_at()
	 * @generated
	 * @ordered
	 */
	protected static final int CREATED_AT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCreated_at() <em>Created at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated_at()
	 * @generated
	 * @ordered
	 */
	protected int created_at = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdated_at() <em>Updated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated_at()
	 * @generated
	 * @ordered
	 */
	protected static final String UPDATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUpdated_at() <em>Updated at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdated_at()
	 * @generated
	 * @ordered
	 */
	protected String updated_at = UPDATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPushed_at() <em>Pushed at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushed_at()
	 * @generated
	 * @ordered
	 */
	protected static final int PUSHED_AT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPushed_at() <em>Pushed at</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushed_at()
	 * @generated
	 * @ordered
	 */
	protected int pushed_at = PUSHED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGit_url() <em>Git url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGit_url()
	 * @generated
	 * @ordered
	 */
	protected static final String GIT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGit_url() <em>Git url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGit_url()
	 * @generated
	 * @ordered
	 */
	protected String git_url = GIT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsh_url() <em>Ssh url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_url()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsh_url() <em>Ssh url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsh_url()
	 * @generated
	 * @ordered
	 */
	protected String ssh_url = SSH_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getClone_url() <em>Clone url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClone_url()
	 * @generated
	 * @ordered
	 */
	protected static final String CLONE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClone_url() <em>Clone url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClone_url()
	 * @generated
	 * @ordered
	 */
	protected String clone_url = CLONE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSvn_url() <em>Svn url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvn_url()
	 * @generated
	 * @ordered
	 */
	protected static final String SVN_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSvn_url() <em>Svn url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvn_url()
	 * @generated
	 * @ordered
	 */
	protected String svn_url = SVN_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHomepage() <em>Homepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomepage()
	 * @generated
	 * @ordered
	 */
	protected static final String HOMEPAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHomepage() <em>Homepage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomepage()
	 * @generated
	 * @ordered
	 */
	protected String homepage = HOMEPAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStargazers_count() <em>Stargazers count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStargazers_count()
	 * @generated
	 * @ordered
	 */
	protected static final int STARGAZERS_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStargazers_count() <em>Stargazers count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStargazers_count()
	 * @generated
	 * @ordered
	 */
	protected int stargazers_count = STARGAZERS_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWatchers_count() <em>Watchers count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatchers_count()
	 * @generated
	 * @ordered
	 */
	protected static final int WATCHERS_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWatchers_count() <em>Watchers count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatchers_count()
	 * @generated
	 * @ordered
	 */
	protected int watchers_count = WATCHERS_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHas_issues() <em>Has issues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_issues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_ISSUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHas_issues() <em>Has issues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_issues()
	 * @generated
	 * @ordered
	 */
	protected boolean has_issues = HAS_ISSUES_EDEFAULT;

	/**
	 * The default value of the '{@link #isHas_projects() <em>Has projects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_projects()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_PROJECTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHas_projects() <em>Has projects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_projects()
	 * @generated
	 * @ordered
	 */
	protected boolean has_projects = HAS_PROJECTS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHas_downloads() <em>Has downloads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_downloads()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_DOWNLOADS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHas_downloads() <em>Has downloads</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_downloads()
	 * @generated
	 * @ordered
	 */
	protected boolean has_downloads = HAS_DOWNLOADS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHas_wiki() <em>Has wiki</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_wiki()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_WIKI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHas_wiki() <em>Has wiki</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_wiki()
	 * @generated
	 * @ordered
	 */
	protected boolean has_wiki = HAS_WIKI_EDEFAULT;

	/**
	 * The default value of the '{@link #isHas_pages() <em>Has pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_pages()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_PAGES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHas_pages() <em>Has pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_pages()
	 * @generated
	 * @ordered
	 */
	protected boolean has_pages = HAS_PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #isHas_discussions() <em>Has discussions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_discussions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_DISCUSSIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHas_discussions() <em>Has discussions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_discussions()
	 * @generated
	 * @ordered
	 */
	protected boolean has_discussions = HAS_DISCUSSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getForks_count() <em>Forks count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForks_count()
	 * @generated
	 * @ordered
	 */
	protected static final int FORKS_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getForks_count() <em>Forks count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForks_count()
	 * @generated
	 * @ordered
	 */
	protected int forks_count = FORKS_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMirror_url() <em>Mirror url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirror_url()
	 * @generated
	 * @ordered
	 */
	protected static final String MIRROR_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMirror_url() <em>Mirror url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMirror_url()
	 * @generated
	 * @ordered
	 */
	protected String mirror_url = MIRROR_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #isArchived() <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARCHIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArchived() <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchived()
	 * @generated
	 * @ordered
	 */
	protected boolean archived = ARCHIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisabled() <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisabled()
	 * @generated
	 * @ordered
	 */
	protected boolean disabled = DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpen_issues_count() <em>Open issues count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen_issues_count()
	 * @generated
	 * @ordered
	 */
	protected static final int OPEN_ISSUES_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOpen_issues_count() <em>Open issues count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen_issues_count()
	 * @generated
	 * @ordered
	 */
	protected int open_issues_count = OPEN_ISSUES_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected License license;

	/**
	 * The default value of the '{@link #isAllow_forking() <em>Allow forking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllow_forking()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_FORKING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllow_forking() <em>Allow forking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllow_forking()
	 * @generated
	 * @ordered
	 */
	protected boolean allow_forking = ALLOW_FORKING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_template() <em>Is template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_template()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_TEMPLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_template() <em>Is template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_template()
	 * @generated
	 * @ordered
	 */
	protected boolean is_template = IS_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isWeb_commit_signoff_required() <em>Web commit signoff required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeb_commit_signoff_required()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WEB_COMMIT_SIGNOFF_REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWeb_commit_signoff_required() <em>Web commit signoff required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWeb_commit_signoff_required()
	 * @generated
	 * @ordered
	 */
	protected boolean web_commit_signoff_required = WEB_COMMIT_SIGNOFF_REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final String VISIBILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected String visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getForks() <em>Forks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForks()
	 * @generated
	 * @ordered
	 */
	protected static final int FORKS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getForks() <em>Forks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForks()
	 * @generated
	 * @ordered
	 */
	protected int forks = FORKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpen_issues() <em>Open issues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen_issues()
	 * @generated
	 * @ordered
	 */
	protected static final int OPEN_ISSUES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOpen_issues() <em>Open issues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpen_issues()
	 * @generated
	 * @ordered
	 */
	protected int open_issues = OPEN_ISSUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getWatchers() <em>Watchers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatchers()
	 * @generated
	 * @ordered
	 */
	protected static final int WATCHERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWatchers() <em>Watchers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWatchers()
	 * @generated
	 * @ordered
	 */
	protected int watchers = WATCHERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault_branch() <em>Default branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_branch()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_BRANCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault_branch() <em>Default branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_branch()
	 * @generated
	 * @ordered
	 */
	protected String default_branch = DEFAULT_BRANCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getStargazers() <em>Stargazers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStargazers()
	 * @generated
	 * @ordered
	 */
	protected static final int STARGAZERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStargazers() <em>Stargazers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStargazers()
	 * @generated
	 * @ordered
	 */
	protected int stargazers = STARGAZERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaster_branch() <em>Master branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaster_branch()
	 * @generated
	 * @ordered
	 */
	protected static final String MASTER_BRANCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaster_branch() <em>Master branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaster_branch()
	 * @generated
	 * @ordered
	 */
	protected String master_branch = MASTER_BRANCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNode_id() {
		return node_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNode_id(String newNode_id) {
		String oldNode_id = node_id;
		node_id = newNode_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__NODE_ID, oldNode_id, node_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFull_name() {
		return full_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFull_name(String newFull_name) {
		String oldFull_name = full_name;
		full_name = newFull_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__FULL_NAME, oldFull_name, full_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrivate() {
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrivate(boolean newPrivate) {
		boolean oldPrivate = private_;
		private_ = newPrivate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__PRIVATE, oldPrivate, private_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Owner getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Owner newOwner, NotificationChain msgs) {
		Owner oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Owner newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubPackage.REPOSITORY__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubPackage.REPOSITORY__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHtml_url() {
		return html_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHtml_url(String newHtml_url) {
		String oldHtml_url = html_url;
		html_url = newHtml_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__HTML_URL, oldHtml_url, html_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFork() {
		return fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFork(boolean newFork) {
		boolean oldFork = fork;
		fork = newFork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__FORK, oldFork, fork));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getForks_url() {
		return forks_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForks_url(String newForks_url) {
		String oldForks_url = forks_url;
		forks_url = newForks_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__FORKS_URL, oldForks_url, forks_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKeys_url() {
		return keys_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeys_url(String newKeys_url) {
		String oldKeys_url = keys_url;
		keys_url = newKeys_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__KEYS_URL, oldKeys_url, keys_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCollaborators_url() {
		return collaborators_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollaborators_url(String newCollaborators_url) {
		String oldCollaborators_url = collaborators_url;
		collaborators_url = newCollaborators_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__COLLABORATORS_URL, oldCollaborators_url, collaborators_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTeams_url() {
		return teams_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeams_url(String newTeams_url) {
		String oldTeams_url = teams_url;
		teams_url = newTeams_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__TEAMS_URL, oldTeams_url, teams_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHooks_url() {
		return hooks_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHooks_url(String newHooks_url) {
		String oldHooks_url = hooks_url;
		hooks_url = newHooks_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__HOOKS_URL, oldHooks_url, hooks_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssue_events_url() {
		return issue_events_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssue_events_url(String newIssue_events_url) {
		String oldIssue_events_url = issue_events_url;
		issue_events_url = newIssue_events_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__ISSUE_EVENTS_URL, oldIssue_events_url, issue_events_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEvents_url() {
		return events_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvents_url(String newEvents_url) {
		String oldEvents_url = events_url;
		events_url = newEvents_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__EVENTS_URL, oldEvents_url, events_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssignees_url() {
		return assignees_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignees_url(String newAssignees_url) {
		String oldAssignees_url = assignees_url;
		assignees_url = newAssignees_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__ASSIGNEES_URL, oldAssignees_url, assignees_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBranches_url() {
		return branches_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranches_url(String newBranches_url) {
		String oldBranches_url = branches_url;
		branches_url = newBranches_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__BRANCHES_URL, oldBranches_url, branches_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTags_url() {
		return tags_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTags_url(String newTags_url) {
		String oldTags_url = tags_url;
		tags_url = newTags_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__TAGS_URL, oldTags_url, tags_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlobs_url() {
		return blobs_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlobs_url(String newBlobs_url) {
		String oldBlobs_url = blobs_url;
		blobs_url = newBlobs_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__BLOBS_URL, oldBlobs_url, blobs_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGit_tags_url() {
		return git_tags_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGit_tags_url(String newGit_tags_url) {
		String oldGit_tags_url = git_tags_url;
		git_tags_url = newGit_tags_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__GIT_TAGS_URL, oldGit_tags_url, git_tags_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGit_refs_url() {
		return git_refs_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGit_refs_url(String newGit_refs_url) {
		String oldGit_refs_url = git_refs_url;
		git_refs_url = newGit_refs_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__GIT_REFS_URL, oldGit_refs_url, git_refs_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTrees_url() {
		return trees_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTrees_url(String newTrees_url) {
		String oldTrees_url = trees_url;
		trees_url = newTrees_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__TREES_URL, oldTrees_url, trees_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatuses_url() {
		return statuses_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatuses_url(String newStatuses_url) {
		String oldStatuses_url = statuses_url;
		statuses_url = newStatuses_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__STATUSES_URL, oldStatuses_url, statuses_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguages_url() {
		return languages_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguages_url(String newLanguages_url) {
		String oldLanguages_url = languages_url;
		languages_url = newLanguages_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__LANGUAGES_URL, oldLanguages_url, languages_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStargazers_url() {
		return stargazers_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStargazers_url(String newStargazers_url) {
		String oldStargazers_url = stargazers_url;
		stargazers_url = newStargazers_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__STARGAZERS_URL, oldStargazers_url, stargazers_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContributors_url() {
		return contributors_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContributors_url(String newContributors_url) {
		String oldContributors_url = contributors_url;
		contributors_url = newContributors_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__CONTRIBUTORS_URL, oldContributors_url, contributors_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscribers_url() {
		return subscribers_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscribers_url(String newSubscribers_url) {
		String oldSubscribers_url = subscribers_url;
		subscribers_url = newSubscribers_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__SUBSCRIBERS_URL, oldSubscribers_url, subscribers_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscription_url() {
		return subscription_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscription_url(String newSubscription_url) {
		String oldSubscription_url = subscription_url;
		subscription_url = newSubscription_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__SUBSCRIPTION_URL, oldSubscription_url, subscription_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommits_url() {
		return commits_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommits_url(String newCommits_url) {
		String oldCommits_url = commits_url;
		commits_url = newCommits_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__COMMITS_URL, oldCommits_url, commits_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGit_commits_url() {
		return git_commits_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGit_commits_url(String newGit_commits_url) {
		String oldGit_commits_url = git_commits_url;
		git_commits_url = newGit_commits_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__GIT_COMMITS_URL, oldGit_commits_url, git_commits_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComments_url() {
		return comments_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComments_url(String newComments_url) {
		String oldComments_url = comments_url;
		comments_url = newComments_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__COMMENTS_URL, oldComments_url, comments_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssue_comment_url() {
		return issue_comment_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssue_comment_url(String newIssue_comment_url) {
		String oldIssue_comment_url = issue_comment_url;
		issue_comment_url = newIssue_comment_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__ISSUE_COMMENT_URL, oldIssue_comment_url, issue_comment_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContents_url() {
		return contents_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContents_url(String newContents_url) {
		String oldContents_url = contents_url;
		contents_url = newContents_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__CONTENTS_URL, oldContents_url, contents_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompare_url() {
		return compare_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompare_url(String newCompare_url) {
		String oldCompare_url = compare_url;
		compare_url = newCompare_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__COMPARE_URL, oldCompare_url, compare_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerges_url() {
		return merges_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerges_url(String newMerges_url) {
		String oldMerges_url = merges_url;
		merges_url = newMerges_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__MERGES_URL, oldMerges_url, merges_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArchive_url() {
		return archive_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchive_url(String newArchive_url) {
		String oldArchive_url = archive_url;
		archive_url = newArchive_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__ARCHIVE_URL, oldArchive_url, archive_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDownloads_url() {
		return downloads_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDownloads_url(String newDownloads_url) {
		String oldDownloads_url = downloads_url;
		downloads_url = newDownloads_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__DOWNLOADS_URL, oldDownloads_url, downloads_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssues_url() {
		return issues_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssues_url(String newIssues_url) {
		String oldIssues_url = issues_url;
		issues_url = newIssues_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__ISSUES_URL, oldIssues_url, issues_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPulls_url() {
		return pulls_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPulls_url(String newPulls_url) {
		String oldPulls_url = pulls_url;
		pulls_url = newPulls_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__PULLS_URL, oldPulls_url, pulls_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMilestones_url() {
		return milestones_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMilestones_url(String newMilestones_url) {
		String oldMilestones_url = milestones_url;
		milestones_url = newMilestones_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__MILESTONES_URL, oldMilestones_url, milestones_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotifications_url() {
		return notifications_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotifications_url(String newNotifications_url) {
		String oldNotifications_url = notifications_url;
		notifications_url = newNotifications_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__NOTIFICATIONS_URL, oldNotifications_url, notifications_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabels_url() {
		return labels_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabels_url(String newLabels_url) {
		String oldLabels_url = labels_url;
		labels_url = newLabels_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__LABELS_URL, oldLabels_url, labels_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReleases_url() {
		return releases_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReleases_url(String newReleases_url) {
		String oldReleases_url = releases_url;
		releases_url = newReleases_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__RELEASES_URL, oldReleases_url, releases_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeployments_url() {
		return deployments_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployments_url(String newDeployments_url) {
		String oldDeployments_url = deployments_url;
		deployments_url = newDeployments_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__DEPLOYMENTS_URL, oldDeployments_url, deployments_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCreated_at() {
		return created_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreated_at(int newCreated_at) {
		int oldCreated_at = created_at;
		created_at = newCreated_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__CREATED_AT, oldCreated_at, created_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUpdated_at() {
		return updated_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdated_at(String newUpdated_at) {
		String oldUpdated_at = updated_at;
		updated_at = newUpdated_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__UPDATED_AT, oldUpdated_at, updated_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPushed_at() {
		return pushed_at;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPushed_at(int newPushed_at) {
		int oldPushed_at = pushed_at;
		pushed_at = newPushed_at;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__PUSHED_AT, oldPushed_at, pushed_at));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGit_url() {
		return git_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGit_url(String newGit_url) {
		String oldGit_url = git_url;
		git_url = newGit_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__GIT_URL, oldGit_url, git_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSsh_url() {
		return ssh_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSsh_url(String newSsh_url) {
		String oldSsh_url = ssh_url;
		ssh_url = newSsh_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__SSH_URL, oldSsh_url, ssh_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClone_url() {
		return clone_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClone_url(String newClone_url) {
		String oldClone_url = clone_url;
		clone_url = newClone_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__CLONE_URL, oldClone_url, clone_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSvn_url() {
		return svn_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSvn_url(String newSvn_url) {
		String oldSvn_url = svn_url;
		svn_url = newSvn_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__SVN_URL, oldSvn_url, svn_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHomepage() {
		return homepage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHomepage(String newHomepage) {
		String oldHomepage = homepage;
		homepage = newHomepage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__HOMEPAGE, oldHomepage, homepage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStargazers_count() {
		return stargazers_count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStargazers_count(int newStargazers_count) {
		int oldStargazers_count = stargazers_count;
		stargazers_count = newStargazers_count;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__STARGAZERS_COUNT, oldStargazers_count, stargazers_count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWatchers_count() {
		return watchers_count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWatchers_count(int newWatchers_count) {
		int oldWatchers_count = watchers_count;
		watchers_count = newWatchers_count;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__WATCHERS_COUNT, oldWatchers_count, watchers_count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHas_issues() {
		return has_issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHas_issues(boolean newHas_issues) {
		boolean oldHas_issues = has_issues;
		has_issues = newHas_issues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__HAS_ISSUES, oldHas_issues, has_issues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHas_projects() {
		return has_projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHas_projects(boolean newHas_projects) {
		boolean oldHas_projects = has_projects;
		has_projects = newHas_projects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__HAS_PROJECTS, oldHas_projects, has_projects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHas_downloads() {
		return has_downloads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHas_downloads(boolean newHas_downloads) {
		boolean oldHas_downloads = has_downloads;
		has_downloads = newHas_downloads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__HAS_DOWNLOADS, oldHas_downloads, has_downloads));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHas_wiki() {
		return has_wiki;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHas_wiki(boolean newHas_wiki) {
		boolean oldHas_wiki = has_wiki;
		has_wiki = newHas_wiki;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__HAS_WIKI, oldHas_wiki, has_wiki));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHas_pages() {
		return has_pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHas_pages(boolean newHas_pages) {
		boolean oldHas_pages = has_pages;
		has_pages = newHas_pages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__HAS_PAGES, oldHas_pages, has_pages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHas_discussions() {
		return has_discussions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHas_discussions(boolean newHas_discussions) {
		boolean oldHas_discussions = has_discussions;
		has_discussions = newHas_discussions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__HAS_DISCUSSIONS, oldHas_discussions, has_discussions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getForks_count() {
		return forks_count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForks_count(int newForks_count) {
		int oldForks_count = forks_count;
		forks_count = newForks_count;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__FORKS_COUNT, oldForks_count, forks_count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMirror_url() {
		return mirror_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMirror_url(String newMirror_url) {
		String oldMirror_url = mirror_url;
		mirror_url = newMirror_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__MIRROR_URL, oldMirror_url, mirror_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isArchived() {
		return archived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchived(boolean newArchived) {
		boolean oldArchived = archived;
		archived = newArchived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__ARCHIVED, oldArchived, archived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDisabled() {
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisabled(boolean newDisabled) {
		boolean oldDisabled = disabled;
		disabled = newDisabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__DISABLED, oldDisabled, disabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOpen_issues_count() {
		return open_issues_count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpen_issues_count(int newOpen_issues_count) {
		int oldOpen_issues_count = open_issues_count;
		open_issues_count = newOpen_issues_count;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__OPEN_ISSUES_COUNT, oldOpen_issues_count, open_issues_count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public License getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicense(License newLicense, NotificationChain msgs) {
		License oldLicense = license;
		license = newLicense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__LICENSE, oldLicense, newLicense);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicense(License newLicense) {
		if (newLicense != license) {
			NotificationChain msgs = null;
			if (license != null)
				msgs = ((InternalEObject)license).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubPackage.REPOSITORY__LICENSE, null, msgs);
			if (newLicense != null)
				msgs = ((InternalEObject)newLicense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubPackage.REPOSITORY__LICENSE, null, msgs);
			msgs = basicSetLicense(newLicense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__LICENSE, newLicense, newLicense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAllow_forking() {
		return allow_forking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllow_forking(boolean newAllow_forking) {
		boolean oldAllow_forking = allow_forking;
		allow_forking = newAllow_forking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__ALLOW_FORKING, oldAllow_forking, allow_forking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIs_template() {
		return is_template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIs_template(boolean newIs_template) {
		boolean oldIs_template = is_template;
		is_template = newIs_template;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__IS_TEMPLATE, oldIs_template, is_template));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWeb_commit_signoff_required() {
		return web_commit_signoff_required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeb_commit_signoff_required(boolean newWeb_commit_signoff_required) {
		boolean oldWeb_commit_signoff_required = web_commit_signoff_required;
		web_commit_signoff_required = newWeb_commit_signoff_required;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__WEB_COMMIT_SIGNOFF_REQUIRED, oldWeb_commit_signoff_required, web_commit_signoff_required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(String newVisibility) {
		String oldVisibility = visibility;
		visibility = newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getForks() {
		return forks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForks(int newForks) {
		int oldForks = forks;
		forks = newForks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__FORKS, oldForks, forks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOpen_issues() {
		return open_issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpen_issues(int newOpen_issues) {
		int oldOpen_issues = open_issues;
		open_issues = newOpen_issues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__OPEN_ISSUES, oldOpen_issues, open_issues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWatchers() {
		return watchers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWatchers(int newWatchers) {
		int oldWatchers = watchers;
		watchers = newWatchers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__WATCHERS, oldWatchers, watchers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefault_branch() {
		return default_branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault_branch(String newDefault_branch) {
		String oldDefault_branch = default_branch;
		default_branch = newDefault_branch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__DEFAULT_BRANCH, oldDefault_branch, default_branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStargazers() {
		return stargazers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStargazers(int newStargazers) {
		int oldStargazers = stargazers;
		stargazers = newStargazers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__STARGAZERS, oldStargazers, stargazers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaster_branch() {
		return master_branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaster_branch(String newMaster_branch) {
		String oldMaster_branch = master_branch;
		master_branch = newMaster_branch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.REPOSITORY__MASTER_BRANCH, oldMaster_branch, master_branch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.REPOSITORY__OWNER:
				return basicSetOwner(null, msgs);
			case GithubPackage.REPOSITORY__LICENSE:
				return basicSetLicense(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.REPOSITORY__ID:
				return getId();
			case GithubPackage.REPOSITORY__NODE_ID:
				return getNode_id();
			case GithubPackage.REPOSITORY__NAME:
				return getName();
			case GithubPackage.REPOSITORY__FULL_NAME:
				return getFull_name();
			case GithubPackage.REPOSITORY__PRIVATE:
				return isPrivate();
			case GithubPackage.REPOSITORY__OWNER:
				return getOwner();
			case GithubPackage.REPOSITORY__HTML_URL:
				return getHtml_url();
			case GithubPackage.REPOSITORY__DESCRIPTION:
				return getDescription();
			case GithubPackage.REPOSITORY__FORK:
				return isFork();
			case GithubPackage.REPOSITORY__URL:
				return getUrl();
			case GithubPackage.REPOSITORY__FORKS_URL:
				return getForks_url();
			case GithubPackage.REPOSITORY__KEYS_URL:
				return getKeys_url();
			case GithubPackage.REPOSITORY__COLLABORATORS_URL:
				return getCollaborators_url();
			case GithubPackage.REPOSITORY__TEAMS_URL:
				return getTeams_url();
			case GithubPackage.REPOSITORY__HOOKS_URL:
				return getHooks_url();
			case GithubPackage.REPOSITORY__ISSUE_EVENTS_URL:
				return getIssue_events_url();
			case GithubPackage.REPOSITORY__EVENTS_URL:
				return getEvents_url();
			case GithubPackage.REPOSITORY__ASSIGNEES_URL:
				return getAssignees_url();
			case GithubPackage.REPOSITORY__BRANCHES_URL:
				return getBranches_url();
			case GithubPackage.REPOSITORY__TAGS_URL:
				return getTags_url();
			case GithubPackage.REPOSITORY__BLOBS_URL:
				return getBlobs_url();
			case GithubPackage.REPOSITORY__GIT_TAGS_URL:
				return getGit_tags_url();
			case GithubPackage.REPOSITORY__GIT_REFS_URL:
				return getGit_refs_url();
			case GithubPackage.REPOSITORY__TREES_URL:
				return getTrees_url();
			case GithubPackage.REPOSITORY__STATUSES_URL:
				return getStatuses_url();
			case GithubPackage.REPOSITORY__LANGUAGES_URL:
				return getLanguages_url();
			case GithubPackage.REPOSITORY__STARGAZERS_URL:
				return getStargazers_url();
			case GithubPackage.REPOSITORY__CONTRIBUTORS_URL:
				return getContributors_url();
			case GithubPackage.REPOSITORY__SUBSCRIBERS_URL:
				return getSubscribers_url();
			case GithubPackage.REPOSITORY__SUBSCRIPTION_URL:
				return getSubscription_url();
			case GithubPackage.REPOSITORY__COMMITS_URL:
				return getCommits_url();
			case GithubPackage.REPOSITORY__GIT_COMMITS_URL:
				return getGit_commits_url();
			case GithubPackage.REPOSITORY__COMMENTS_URL:
				return getComments_url();
			case GithubPackage.REPOSITORY__ISSUE_COMMENT_URL:
				return getIssue_comment_url();
			case GithubPackage.REPOSITORY__CONTENTS_URL:
				return getContents_url();
			case GithubPackage.REPOSITORY__COMPARE_URL:
				return getCompare_url();
			case GithubPackage.REPOSITORY__MERGES_URL:
				return getMerges_url();
			case GithubPackage.REPOSITORY__ARCHIVE_URL:
				return getArchive_url();
			case GithubPackage.REPOSITORY__DOWNLOADS_URL:
				return getDownloads_url();
			case GithubPackage.REPOSITORY__ISSUES_URL:
				return getIssues_url();
			case GithubPackage.REPOSITORY__PULLS_URL:
				return getPulls_url();
			case GithubPackage.REPOSITORY__MILESTONES_URL:
				return getMilestones_url();
			case GithubPackage.REPOSITORY__NOTIFICATIONS_URL:
				return getNotifications_url();
			case GithubPackage.REPOSITORY__LABELS_URL:
				return getLabels_url();
			case GithubPackage.REPOSITORY__RELEASES_URL:
				return getReleases_url();
			case GithubPackage.REPOSITORY__DEPLOYMENTS_URL:
				return getDeployments_url();
			case GithubPackage.REPOSITORY__CREATED_AT:
				return getCreated_at();
			case GithubPackage.REPOSITORY__UPDATED_AT:
				return getUpdated_at();
			case GithubPackage.REPOSITORY__PUSHED_AT:
				return getPushed_at();
			case GithubPackage.REPOSITORY__GIT_URL:
				return getGit_url();
			case GithubPackage.REPOSITORY__SSH_URL:
				return getSsh_url();
			case GithubPackage.REPOSITORY__CLONE_URL:
				return getClone_url();
			case GithubPackage.REPOSITORY__SVN_URL:
				return getSvn_url();
			case GithubPackage.REPOSITORY__HOMEPAGE:
				return getHomepage();
			case GithubPackage.REPOSITORY__SIZE:
				return getSize();
			case GithubPackage.REPOSITORY__STARGAZERS_COUNT:
				return getStargazers_count();
			case GithubPackage.REPOSITORY__WATCHERS_COUNT:
				return getWatchers_count();
			case GithubPackage.REPOSITORY__LANGUAGE:
				return getLanguage();
			case GithubPackage.REPOSITORY__HAS_ISSUES:
				return isHas_issues();
			case GithubPackage.REPOSITORY__HAS_PROJECTS:
				return isHas_projects();
			case GithubPackage.REPOSITORY__HAS_DOWNLOADS:
				return isHas_downloads();
			case GithubPackage.REPOSITORY__HAS_WIKI:
				return isHas_wiki();
			case GithubPackage.REPOSITORY__HAS_PAGES:
				return isHas_pages();
			case GithubPackage.REPOSITORY__HAS_DISCUSSIONS:
				return isHas_discussions();
			case GithubPackage.REPOSITORY__FORKS_COUNT:
				return getForks_count();
			case GithubPackage.REPOSITORY__MIRROR_URL:
				return getMirror_url();
			case GithubPackage.REPOSITORY__ARCHIVED:
				return isArchived();
			case GithubPackage.REPOSITORY__DISABLED:
				return isDisabled();
			case GithubPackage.REPOSITORY__OPEN_ISSUES_COUNT:
				return getOpen_issues_count();
			case GithubPackage.REPOSITORY__LICENSE:
				return getLicense();
			case GithubPackage.REPOSITORY__ALLOW_FORKING:
				return isAllow_forking();
			case GithubPackage.REPOSITORY__IS_TEMPLATE:
				return isIs_template();
			case GithubPackage.REPOSITORY__WEB_COMMIT_SIGNOFF_REQUIRED:
				return isWeb_commit_signoff_required();
			case GithubPackage.REPOSITORY__VISIBILITY:
				return getVisibility();
			case GithubPackage.REPOSITORY__FORKS:
				return getForks();
			case GithubPackage.REPOSITORY__OPEN_ISSUES:
				return getOpen_issues();
			case GithubPackage.REPOSITORY__WATCHERS:
				return getWatchers();
			case GithubPackage.REPOSITORY__DEFAULT_BRANCH:
				return getDefault_branch();
			case GithubPackage.REPOSITORY__STARGAZERS:
				return getStargazers();
			case GithubPackage.REPOSITORY__MASTER_BRANCH:
				return getMaster_branch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubPackage.REPOSITORY__ID:
				setId((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__NODE_ID:
				setNode_id((String)newValue);
				return;
			case GithubPackage.REPOSITORY__NAME:
				setName((String)newValue);
				return;
			case GithubPackage.REPOSITORY__FULL_NAME:
				setFull_name((String)newValue);
				return;
			case GithubPackage.REPOSITORY__PRIVATE:
				setPrivate((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__OWNER:
				setOwner((Owner)newValue);
				return;
			case GithubPackage.REPOSITORY__HTML_URL:
				setHtml_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GithubPackage.REPOSITORY__FORK:
				setFork((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__URL:
				setUrl((String)newValue);
				return;
			case GithubPackage.REPOSITORY__FORKS_URL:
				setForks_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__KEYS_URL:
				setKeys_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__COLLABORATORS_URL:
				setCollaborators_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__TEAMS_URL:
				setTeams_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__HOOKS_URL:
				setHooks_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__ISSUE_EVENTS_URL:
				setIssue_events_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__EVENTS_URL:
				setEvents_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__ASSIGNEES_URL:
				setAssignees_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__BRANCHES_URL:
				setBranches_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__TAGS_URL:
				setTags_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__BLOBS_URL:
				setBlobs_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__GIT_TAGS_URL:
				setGit_tags_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__GIT_REFS_URL:
				setGit_refs_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__TREES_URL:
				setTrees_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__STATUSES_URL:
				setStatuses_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__LANGUAGES_URL:
				setLanguages_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__STARGAZERS_URL:
				setStargazers_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__CONTRIBUTORS_URL:
				setContributors_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__SUBSCRIBERS_URL:
				setSubscribers_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__SUBSCRIPTION_URL:
				setSubscription_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__COMMITS_URL:
				setCommits_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__GIT_COMMITS_URL:
				setGit_commits_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__COMMENTS_URL:
				setComments_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__ISSUE_COMMENT_URL:
				setIssue_comment_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__CONTENTS_URL:
				setContents_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__COMPARE_URL:
				setCompare_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__MERGES_URL:
				setMerges_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__ARCHIVE_URL:
				setArchive_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__DOWNLOADS_URL:
				setDownloads_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__ISSUES_URL:
				setIssues_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__PULLS_URL:
				setPulls_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__MILESTONES_URL:
				setMilestones_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__NOTIFICATIONS_URL:
				setNotifications_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__LABELS_URL:
				setLabels_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__RELEASES_URL:
				setReleases_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__DEPLOYMENTS_URL:
				setDeployments_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__CREATED_AT:
				setCreated_at((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__UPDATED_AT:
				setUpdated_at((String)newValue);
				return;
			case GithubPackage.REPOSITORY__PUSHED_AT:
				setPushed_at((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__GIT_URL:
				setGit_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__SSH_URL:
				setSsh_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__CLONE_URL:
				setClone_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__SVN_URL:
				setSvn_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__HOMEPAGE:
				setHomepage((String)newValue);
				return;
			case GithubPackage.REPOSITORY__SIZE:
				setSize((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__STARGAZERS_COUNT:
				setStargazers_count((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__WATCHERS_COUNT:
				setWatchers_count((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case GithubPackage.REPOSITORY__HAS_ISSUES:
				setHas_issues((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__HAS_PROJECTS:
				setHas_projects((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__HAS_DOWNLOADS:
				setHas_downloads((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__HAS_WIKI:
				setHas_wiki((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__HAS_PAGES:
				setHas_pages((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__HAS_DISCUSSIONS:
				setHas_discussions((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__FORKS_COUNT:
				setForks_count((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__MIRROR_URL:
				setMirror_url((String)newValue);
				return;
			case GithubPackage.REPOSITORY__ARCHIVED:
				setArchived((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__DISABLED:
				setDisabled((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__OPEN_ISSUES_COUNT:
				setOpen_issues_count((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__LICENSE:
				setLicense((License)newValue);
				return;
			case GithubPackage.REPOSITORY__ALLOW_FORKING:
				setAllow_forking((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__IS_TEMPLATE:
				setIs_template((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__WEB_COMMIT_SIGNOFF_REQUIRED:
				setWeb_commit_signoff_required((Boolean)newValue);
				return;
			case GithubPackage.REPOSITORY__VISIBILITY:
				setVisibility((String)newValue);
				return;
			case GithubPackage.REPOSITORY__FORKS:
				setForks((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__OPEN_ISSUES:
				setOpen_issues((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__WATCHERS:
				setWatchers((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__DEFAULT_BRANCH:
				setDefault_branch((String)newValue);
				return;
			case GithubPackage.REPOSITORY__STARGAZERS:
				setStargazers((Integer)newValue);
				return;
			case GithubPackage.REPOSITORY__MASTER_BRANCH:
				setMaster_branch((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GithubPackage.REPOSITORY__ID:
				setId(ID_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__NODE_ID:
				setNode_id(NODE_ID_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__FULL_NAME:
				setFull_name(FULL_NAME_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__PRIVATE:
				setPrivate(PRIVATE_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__OWNER:
				setOwner((Owner)null);
				return;
			case GithubPackage.REPOSITORY__HTML_URL:
				setHtml_url(HTML_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__FORK:
				setFork(FORK_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__FORKS_URL:
				setForks_url(FORKS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__KEYS_URL:
				setKeys_url(KEYS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__COLLABORATORS_URL:
				setCollaborators_url(COLLABORATORS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__TEAMS_URL:
				setTeams_url(TEAMS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__HOOKS_URL:
				setHooks_url(HOOKS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__ISSUE_EVENTS_URL:
				setIssue_events_url(ISSUE_EVENTS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__EVENTS_URL:
				setEvents_url(EVENTS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__ASSIGNEES_URL:
				setAssignees_url(ASSIGNEES_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__BRANCHES_URL:
				setBranches_url(BRANCHES_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__TAGS_URL:
				setTags_url(TAGS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__BLOBS_URL:
				setBlobs_url(BLOBS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__GIT_TAGS_URL:
				setGit_tags_url(GIT_TAGS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__GIT_REFS_URL:
				setGit_refs_url(GIT_REFS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__TREES_URL:
				setTrees_url(TREES_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__STATUSES_URL:
				setStatuses_url(STATUSES_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__LANGUAGES_URL:
				setLanguages_url(LANGUAGES_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__STARGAZERS_URL:
				setStargazers_url(STARGAZERS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__CONTRIBUTORS_URL:
				setContributors_url(CONTRIBUTORS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__SUBSCRIBERS_URL:
				setSubscribers_url(SUBSCRIBERS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__SUBSCRIPTION_URL:
				setSubscription_url(SUBSCRIPTION_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__COMMITS_URL:
				setCommits_url(COMMITS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__GIT_COMMITS_URL:
				setGit_commits_url(GIT_COMMITS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__COMMENTS_URL:
				setComments_url(COMMENTS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__ISSUE_COMMENT_URL:
				setIssue_comment_url(ISSUE_COMMENT_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__CONTENTS_URL:
				setContents_url(CONTENTS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__COMPARE_URL:
				setCompare_url(COMPARE_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__MERGES_URL:
				setMerges_url(MERGES_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__ARCHIVE_URL:
				setArchive_url(ARCHIVE_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__DOWNLOADS_URL:
				setDownloads_url(DOWNLOADS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__ISSUES_URL:
				setIssues_url(ISSUES_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__PULLS_URL:
				setPulls_url(PULLS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__MILESTONES_URL:
				setMilestones_url(MILESTONES_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__NOTIFICATIONS_URL:
				setNotifications_url(NOTIFICATIONS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__LABELS_URL:
				setLabels_url(LABELS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__RELEASES_URL:
				setReleases_url(RELEASES_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__DEPLOYMENTS_URL:
				setDeployments_url(DEPLOYMENTS_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__CREATED_AT:
				setCreated_at(CREATED_AT_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__UPDATED_AT:
				setUpdated_at(UPDATED_AT_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__PUSHED_AT:
				setPushed_at(PUSHED_AT_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__GIT_URL:
				setGit_url(GIT_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__SSH_URL:
				setSsh_url(SSH_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__CLONE_URL:
				setClone_url(CLONE_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__SVN_URL:
				setSvn_url(SVN_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__HOMEPAGE:
				setHomepage(HOMEPAGE_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__STARGAZERS_COUNT:
				setStargazers_count(STARGAZERS_COUNT_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__WATCHERS_COUNT:
				setWatchers_count(WATCHERS_COUNT_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__HAS_ISSUES:
				setHas_issues(HAS_ISSUES_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__HAS_PROJECTS:
				setHas_projects(HAS_PROJECTS_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__HAS_DOWNLOADS:
				setHas_downloads(HAS_DOWNLOADS_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__HAS_WIKI:
				setHas_wiki(HAS_WIKI_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__HAS_PAGES:
				setHas_pages(HAS_PAGES_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__HAS_DISCUSSIONS:
				setHas_discussions(HAS_DISCUSSIONS_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__FORKS_COUNT:
				setForks_count(FORKS_COUNT_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__MIRROR_URL:
				setMirror_url(MIRROR_URL_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__ARCHIVED:
				setArchived(ARCHIVED_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__DISABLED:
				setDisabled(DISABLED_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__OPEN_ISSUES_COUNT:
				setOpen_issues_count(OPEN_ISSUES_COUNT_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__LICENSE:
				setLicense((License)null);
				return;
			case GithubPackage.REPOSITORY__ALLOW_FORKING:
				setAllow_forking(ALLOW_FORKING_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__IS_TEMPLATE:
				setIs_template(IS_TEMPLATE_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__WEB_COMMIT_SIGNOFF_REQUIRED:
				setWeb_commit_signoff_required(WEB_COMMIT_SIGNOFF_REQUIRED_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__FORKS:
				setForks(FORKS_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__OPEN_ISSUES:
				setOpen_issues(OPEN_ISSUES_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__WATCHERS:
				setWatchers(WATCHERS_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__DEFAULT_BRANCH:
				setDefault_branch(DEFAULT_BRANCH_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__STARGAZERS:
				setStargazers(STARGAZERS_EDEFAULT);
				return;
			case GithubPackage.REPOSITORY__MASTER_BRANCH:
				setMaster_branch(MASTER_BRANCH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GithubPackage.REPOSITORY__ID:
				return id != ID_EDEFAULT;
			case GithubPackage.REPOSITORY__NODE_ID:
				return NODE_ID_EDEFAULT == null ? node_id != null : !NODE_ID_EDEFAULT.equals(node_id);
			case GithubPackage.REPOSITORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GithubPackage.REPOSITORY__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? full_name != null : !FULL_NAME_EDEFAULT.equals(full_name);
			case GithubPackage.REPOSITORY__PRIVATE:
				return private_ != PRIVATE_EDEFAULT;
			case GithubPackage.REPOSITORY__OWNER:
				return owner != null;
			case GithubPackage.REPOSITORY__HTML_URL:
				return HTML_URL_EDEFAULT == null ? html_url != null : !HTML_URL_EDEFAULT.equals(html_url);
			case GithubPackage.REPOSITORY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case GithubPackage.REPOSITORY__FORK:
				return fork != FORK_EDEFAULT;
			case GithubPackage.REPOSITORY__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case GithubPackage.REPOSITORY__FORKS_URL:
				return FORKS_URL_EDEFAULT == null ? forks_url != null : !FORKS_URL_EDEFAULT.equals(forks_url);
			case GithubPackage.REPOSITORY__KEYS_URL:
				return KEYS_URL_EDEFAULT == null ? keys_url != null : !KEYS_URL_EDEFAULT.equals(keys_url);
			case GithubPackage.REPOSITORY__COLLABORATORS_URL:
				return COLLABORATORS_URL_EDEFAULT == null ? collaborators_url != null : !COLLABORATORS_URL_EDEFAULT.equals(collaborators_url);
			case GithubPackage.REPOSITORY__TEAMS_URL:
				return TEAMS_URL_EDEFAULT == null ? teams_url != null : !TEAMS_URL_EDEFAULT.equals(teams_url);
			case GithubPackage.REPOSITORY__HOOKS_URL:
				return HOOKS_URL_EDEFAULT == null ? hooks_url != null : !HOOKS_URL_EDEFAULT.equals(hooks_url);
			case GithubPackage.REPOSITORY__ISSUE_EVENTS_URL:
				return ISSUE_EVENTS_URL_EDEFAULT == null ? issue_events_url != null : !ISSUE_EVENTS_URL_EDEFAULT.equals(issue_events_url);
			case GithubPackage.REPOSITORY__EVENTS_URL:
				return EVENTS_URL_EDEFAULT == null ? events_url != null : !EVENTS_URL_EDEFAULT.equals(events_url);
			case GithubPackage.REPOSITORY__ASSIGNEES_URL:
				return ASSIGNEES_URL_EDEFAULT == null ? assignees_url != null : !ASSIGNEES_URL_EDEFAULT.equals(assignees_url);
			case GithubPackage.REPOSITORY__BRANCHES_URL:
				return BRANCHES_URL_EDEFAULT == null ? branches_url != null : !BRANCHES_URL_EDEFAULT.equals(branches_url);
			case GithubPackage.REPOSITORY__TAGS_URL:
				return TAGS_URL_EDEFAULT == null ? tags_url != null : !TAGS_URL_EDEFAULT.equals(tags_url);
			case GithubPackage.REPOSITORY__BLOBS_URL:
				return BLOBS_URL_EDEFAULT == null ? blobs_url != null : !BLOBS_URL_EDEFAULT.equals(blobs_url);
			case GithubPackage.REPOSITORY__GIT_TAGS_URL:
				return GIT_TAGS_URL_EDEFAULT == null ? git_tags_url != null : !GIT_TAGS_URL_EDEFAULT.equals(git_tags_url);
			case GithubPackage.REPOSITORY__GIT_REFS_URL:
				return GIT_REFS_URL_EDEFAULT == null ? git_refs_url != null : !GIT_REFS_URL_EDEFAULT.equals(git_refs_url);
			case GithubPackage.REPOSITORY__TREES_URL:
				return TREES_URL_EDEFAULT == null ? trees_url != null : !TREES_URL_EDEFAULT.equals(trees_url);
			case GithubPackage.REPOSITORY__STATUSES_URL:
				return STATUSES_URL_EDEFAULT == null ? statuses_url != null : !STATUSES_URL_EDEFAULT.equals(statuses_url);
			case GithubPackage.REPOSITORY__LANGUAGES_URL:
				return LANGUAGES_URL_EDEFAULT == null ? languages_url != null : !LANGUAGES_URL_EDEFAULT.equals(languages_url);
			case GithubPackage.REPOSITORY__STARGAZERS_URL:
				return STARGAZERS_URL_EDEFAULT == null ? stargazers_url != null : !STARGAZERS_URL_EDEFAULT.equals(stargazers_url);
			case GithubPackage.REPOSITORY__CONTRIBUTORS_URL:
				return CONTRIBUTORS_URL_EDEFAULT == null ? contributors_url != null : !CONTRIBUTORS_URL_EDEFAULT.equals(contributors_url);
			case GithubPackage.REPOSITORY__SUBSCRIBERS_URL:
				return SUBSCRIBERS_URL_EDEFAULT == null ? subscribers_url != null : !SUBSCRIBERS_URL_EDEFAULT.equals(subscribers_url);
			case GithubPackage.REPOSITORY__SUBSCRIPTION_URL:
				return SUBSCRIPTION_URL_EDEFAULT == null ? subscription_url != null : !SUBSCRIPTION_URL_EDEFAULT.equals(subscription_url);
			case GithubPackage.REPOSITORY__COMMITS_URL:
				return COMMITS_URL_EDEFAULT == null ? commits_url != null : !COMMITS_URL_EDEFAULT.equals(commits_url);
			case GithubPackage.REPOSITORY__GIT_COMMITS_URL:
				return GIT_COMMITS_URL_EDEFAULT == null ? git_commits_url != null : !GIT_COMMITS_URL_EDEFAULT.equals(git_commits_url);
			case GithubPackage.REPOSITORY__COMMENTS_URL:
				return COMMENTS_URL_EDEFAULT == null ? comments_url != null : !COMMENTS_URL_EDEFAULT.equals(comments_url);
			case GithubPackage.REPOSITORY__ISSUE_COMMENT_URL:
				return ISSUE_COMMENT_URL_EDEFAULT == null ? issue_comment_url != null : !ISSUE_COMMENT_URL_EDEFAULT.equals(issue_comment_url);
			case GithubPackage.REPOSITORY__CONTENTS_URL:
				return CONTENTS_URL_EDEFAULT == null ? contents_url != null : !CONTENTS_URL_EDEFAULT.equals(contents_url);
			case GithubPackage.REPOSITORY__COMPARE_URL:
				return COMPARE_URL_EDEFAULT == null ? compare_url != null : !COMPARE_URL_EDEFAULT.equals(compare_url);
			case GithubPackage.REPOSITORY__MERGES_URL:
				return MERGES_URL_EDEFAULT == null ? merges_url != null : !MERGES_URL_EDEFAULT.equals(merges_url);
			case GithubPackage.REPOSITORY__ARCHIVE_URL:
				return ARCHIVE_URL_EDEFAULT == null ? archive_url != null : !ARCHIVE_URL_EDEFAULT.equals(archive_url);
			case GithubPackage.REPOSITORY__DOWNLOADS_URL:
				return DOWNLOADS_URL_EDEFAULT == null ? downloads_url != null : !DOWNLOADS_URL_EDEFAULT.equals(downloads_url);
			case GithubPackage.REPOSITORY__ISSUES_URL:
				return ISSUES_URL_EDEFAULT == null ? issues_url != null : !ISSUES_URL_EDEFAULT.equals(issues_url);
			case GithubPackage.REPOSITORY__PULLS_URL:
				return PULLS_URL_EDEFAULT == null ? pulls_url != null : !PULLS_URL_EDEFAULT.equals(pulls_url);
			case GithubPackage.REPOSITORY__MILESTONES_URL:
				return MILESTONES_URL_EDEFAULT == null ? milestones_url != null : !MILESTONES_URL_EDEFAULT.equals(milestones_url);
			case GithubPackage.REPOSITORY__NOTIFICATIONS_URL:
				return NOTIFICATIONS_URL_EDEFAULT == null ? notifications_url != null : !NOTIFICATIONS_URL_EDEFAULT.equals(notifications_url);
			case GithubPackage.REPOSITORY__LABELS_URL:
				return LABELS_URL_EDEFAULT == null ? labels_url != null : !LABELS_URL_EDEFAULT.equals(labels_url);
			case GithubPackage.REPOSITORY__RELEASES_URL:
				return RELEASES_URL_EDEFAULT == null ? releases_url != null : !RELEASES_URL_EDEFAULT.equals(releases_url);
			case GithubPackage.REPOSITORY__DEPLOYMENTS_URL:
				return DEPLOYMENTS_URL_EDEFAULT == null ? deployments_url != null : !DEPLOYMENTS_URL_EDEFAULT.equals(deployments_url);
			case GithubPackage.REPOSITORY__CREATED_AT:
				return created_at != CREATED_AT_EDEFAULT;
			case GithubPackage.REPOSITORY__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? updated_at != null : !UPDATED_AT_EDEFAULT.equals(updated_at);
			case GithubPackage.REPOSITORY__PUSHED_AT:
				return pushed_at != PUSHED_AT_EDEFAULT;
			case GithubPackage.REPOSITORY__GIT_URL:
				return GIT_URL_EDEFAULT == null ? git_url != null : !GIT_URL_EDEFAULT.equals(git_url);
			case GithubPackage.REPOSITORY__SSH_URL:
				return SSH_URL_EDEFAULT == null ? ssh_url != null : !SSH_URL_EDEFAULT.equals(ssh_url);
			case GithubPackage.REPOSITORY__CLONE_URL:
				return CLONE_URL_EDEFAULT == null ? clone_url != null : !CLONE_URL_EDEFAULT.equals(clone_url);
			case GithubPackage.REPOSITORY__SVN_URL:
				return SVN_URL_EDEFAULT == null ? svn_url != null : !SVN_URL_EDEFAULT.equals(svn_url);
			case GithubPackage.REPOSITORY__HOMEPAGE:
				return HOMEPAGE_EDEFAULT == null ? homepage != null : !HOMEPAGE_EDEFAULT.equals(homepage);
			case GithubPackage.REPOSITORY__SIZE:
				return size != SIZE_EDEFAULT;
			case GithubPackage.REPOSITORY__STARGAZERS_COUNT:
				return stargazers_count != STARGAZERS_COUNT_EDEFAULT;
			case GithubPackage.REPOSITORY__WATCHERS_COUNT:
				return watchers_count != WATCHERS_COUNT_EDEFAULT;
			case GithubPackage.REPOSITORY__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case GithubPackage.REPOSITORY__HAS_ISSUES:
				return has_issues != HAS_ISSUES_EDEFAULT;
			case GithubPackage.REPOSITORY__HAS_PROJECTS:
				return has_projects != HAS_PROJECTS_EDEFAULT;
			case GithubPackage.REPOSITORY__HAS_DOWNLOADS:
				return has_downloads != HAS_DOWNLOADS_EDEFAULT;
			case GithubPackage.REPOSITORY__HAS_WIKI:
				return has_wiki != HAS_WIKI_EDEFAULT;
			case GithubPackage.REPOSITORY__HAS_PAGES:
				return has_pages != HAS_PAGES_EDEFAULT;
			case GithubPackage.REPOSITORY__HAS_DISCUSSIONS:
				return has_discussions != HAS_DISCUSSIONS_EDEFAULT;
			case GithubPackage.REPOSITORY__FORKS_COUNT:
				return forks_count != FORKS_COUNT_EDEFAULT;
			case GithubPackage.REPOSITORY__MIRROR_URL:
				return MIRROR_URL_EDEFAULT == null ? mirror_url != null : !MIRROR_URL_EDEFAULT.equals(mirror_url);
			case GithubPackage.REPOSITORY__ARCHIVED:
				return archived != ARCHIVED_EDEFAULT;
			case GithubPackage.REPOSITORY__DISABLED:
				return disabled != DISABLED_EDEFAULT;
			case GithubPackage.REPOSITORY__OPEN_ISSUES_COUNT:
				return open_issues_count != OPEN_ISSUES_COUNT_EDEFAULT;
			case GithubPackage.REPOSITORY__LICENSE:
				return license != null;
			case GithubPackage.REPOSITORY__ALLOW_FORKING:
				return allow_forking != ALLOW_FORKING_EDEFAULT;
			case GithubPackage.REPOSITORY__IS_TEMPLATE:
				return is_template != IS_TEMPLATE_EDEFAULT;
			case GithubPackage.REPOSITORY__WEB_COMMIT_SIGNOFF_REQUIRED:
				return web_commit_signoff_required != WEB_COMMIT_SIGNOFF_REQUIRED_EDEFAULT;
			case GithubPackage.REPOSITORY__VISIBILITY:
				return VISIBILITY_EDEFAULT == null ? visibility != null : !VISIBILITY_EDEFAULT.equals(visibility);
			case GithubPackage.REPOSITORY__FORKS:
				return forks != FORKS_EDEFAULT;
			case GithubPackage.REPOSITORY__OPEN_ISSUES:
				return open_issues != OPEN_ISSUES_EDEFAULT;
			case GithubPackage.REPOSITORY__WATCHERS:
				return watchers != WATCHERS_EDEFAULT;
			case GithubPackage.REPOSITORY__DEFAULT_BRANCH:
				return DEFAULT_BRANCH_EDEFAULT == null ? default_branch != null : !DEFAULT_BRANCH_EDEFAULT.equals(default_branch);
			case GithubPackage.REPOSITORY__STARGAZERS:
				return stargazers != STARGAZERS_EDEFAULT;
			case GithubPackage.REPOSITORY__MASTER_BRANCH:
				return MASTER_BRANCH_EDEFAULT == null ? master_branch != null : !MASTER_BRANCH_EDEFAULT.equals(master_branch);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", node_id: ");
		result.append(node_id);
		result.append(", name: ");
		result.append(name);
		result.append(", full_name: ");
		result.append(full_name);
		result.append(", private: ");
		result.append(private_);
		result.append(", html_url: ");
		result.append(html_url);
		result.append(", description: ");
		result.append(description);
		result.append(", fork: ");
		result.append(fork);
		result.append(", url: ");
		result.append(url);
		result.append(", forks_url: ");
		result.append(forks_url);
		result.append(", keys_url: ");
		result.append(keys_url);
		result.append(", collaborators_url: ");
		result.append(collaborators_url);
		result.append(", teams_url: ");
		result.append(teams_url);
		result.append(", hooks_url: ");
		result.append(hooks_url);
		result.append(", issue_events_url: ");
		result.append(issue_events_url);
		result.append(", events_url: ");
		result.append(events_url);
		result.append(", assignees_url: ");
		result.append(assignees_url);
		result.append(", branches_url: ");
		result.append(branches_url);
		result.append(", tags_url: ");
		result.append(tags_url);
		result.append(", blobs_url: ");
		result.append(blobs_url);
		result.append(", git_tags_url: ");
		result.append(git_tags_url);
		result.append(", git_refs_url: ");
		result.append(git_refs_url);
		result.append(", trees_url: ");
		result.append(trees_url);
		result.append(", statuses_url: ");
		result.append(statuses_url);
		result.append(", languages_url: ");
		result.append(languages_url);
		result.append(", stargazers_url: ");
		result.append(stargazers_url);
		result.append(", contributors_url: ");
		result.append(contributors_url);
		result.append(", subscribers_url: ");
		result.append(subscribers_url);
		result.append(", subscription_url: ");
		result.append(subscription_url);
		result.append(", commits_url: ");
		result.append(commits_url);
		result.append(", git_commits_url: ");
		result.append(git_commits_url);
		result.append(", comments_url: ");
		result.append(comments_url);
		result.append(", issue_comment_url: ");
		result.append(issue_comment_url);
		result.append(", contents_url: ");
		result.append(contents_url);
		result.append(", compare_url: ");
		result.append(compare_url);
		result.append(", merges_url: ");
		result.append(merges_url);
		result.append(", archive_url: ");
		result.append(archive_url);
		result.append(", downloads_url: ");
		result.append(downloads_url);
		result.append(", issues_url: ");
		result.append(issues_url);
		result.append(", pulls_url: ");
		result.append(pulls_url);
		result.append(", milestones_url: ");
		result.append(milestones_url);
		result.append(", notifications_url: ");
		result.append(notifications_url);
		result.append(", labels_url: ");
		result.append(labels_url);
		result.append(", releases_url: ");
		result.append(releases_url);
		result.append(", deployments_url: ");
		result.append(deployments_url);
		result.append(", created_at: ");
		result.append(created_at);
		result.append(", updated_at: ");
		result.append(updated_at);
		result.append(", pushed_at: ");
		result.append(pushed_at);
		result.append(", git_url: ");
		result.append(git_url);
		result.append(", ssh_url: ");
		result.append(ssh_url);
		result.append(", clone_url: ");
		result.append(clone_url);
		result.append(", svn_url: ");
		result.append(svn_url);
		result.append(", homepage: ");
		result.append(homepage);
		result.append(", size: ");
		result.append(size);
		result.append(", stargazers_count: ");
		result.append(stargazers_count);
		result.append(", watchers_count: ");
		result.append(watchers_count);
		result.append(", language: ");
		result.append(language);
		result.append(", has_issues: ");
		result.append(has_issues);
		result.append(", has_projects: ");
		result.append(has_projects);
		result.append(", has_downloads: ");
		result.append(has_downloads);
		result.append(", has_wiki: ");
		result.append(has_wiki);
		result.append(", has_pages: ");
		result.append(has_pages);
		result.append(", has_discussions: ");
		result.append(has_discussions);
		result.append(", forks_count: ");
		result.append(forks_count);
		result.append(", mirror_url: ");
		result.append(mirror_url);
		result.append(", archived: ");
		result.append(archived);
		result.append(", disabled: ");
		result.append(disabled);
		result.append(", open_issues_count: ");
		result.append(open_issues_count);
		result.append(", allow_forking: ");
		result.append(allow_forking);
		result.append(", is_template: ");
		result.append(is_template);
		result.append(", web_commit_signoff_required: ");
		result.append(web_commit_signoff_required);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(", forks: ");
		result.append(forks);
		result.append(", open_issues: ");
		result.append(open_issues);
		result.append(", watchers: ");
		result.append(watchers);
		result.append(", default_branch: ");
		result.append(default_branch);
		result.append(", stargazers: ");
		result.append(stargazers);
		result.append(", master_branch: ");
		result.append(master_branch);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
