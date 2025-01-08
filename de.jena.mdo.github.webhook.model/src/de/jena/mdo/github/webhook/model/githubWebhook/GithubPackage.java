/*
 */
package de.jena.mdo.github.webhook.model.githubWebhook;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = GithubPackage.eNS_URI, genModel = "/model/github.genmodel", genModelSourceLocations = {"model/github.genmodel","de.jena.mdo.github.webhook.model/model/github.genmodel"}, ecore="/model/github.ecore", ecoreSourceLocations="/model/github.ecore")
public interface GithubPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "githubWebhook";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://github.com/webhook/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "githubWebhook";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GithubPackage eINSTANCE = de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubWebhookImpl <em>Webhook</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubWebhookImpl
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getGithubWebhook()
	 * @generated
	 */
	int GITHUB_WEBHOOK = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_WEBHOOK__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_WEBHOOK__PAYLOAD = 1;

	/**
	 * The number of structural features of the '<em>Webhook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_WEBHOOK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Webhook</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_WEBHOOK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl <em>Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getPayload()
	 * @generated
	 */
	int PAYLOAD = 1;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__REF = 0;

	/**
	 * The feature id for the '<em><b>Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__BEFORE = 1;

	/**
	 * The feature id for the '<em><b>After</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__AFTER = 2;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Pusher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__PUSHER = 4;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__SENDER = 5;

	/**
	 * The feature id for the '<em><b>Installation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__INSTALLATION = 6;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__CREATED = 7;

	/**
	 * The feature id for the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__DELETED = 8;

	/**
	 * The feature id for the '<em><b>Forced</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__FORCED = 9;

	/**
	 * The feature id for the '<em><b>Base ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__BASE_REF = 10;

	/**
	 * The feature id for the '<em><b>Compare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__COMPARE = 11;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__COMMITS = 12;

	/**
	 * The feature id for the '<em><b>Head commit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD__HEAD_COMMIT = 13;

	/**
	 * The number of structural features of the '<em>Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYLOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ID = 0;

	/**
	 * The feature id for the '<em><b>Node id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NODE_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Full name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FULL_NAME = 3;

	/**
	 * The feature id for the '<em><b>Private</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PRIVATE = 4;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OWNER = 5;

	/**
	 * The feature id for the '<em><b>Html url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HTML_URL = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Fork</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FORK = 8;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__URL = 9;

	/**
	 * The feature id for the '<em><b>Forks url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FORKS_URL = 10;

	/**
	 * The feature id for the '<em><b>Keys url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__KEYS_URL = 11;

	/**
	 * The feature id for the '<em><b>Collaborators url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COLLABORATORS_URL = 12;

	/**
	 * The feature id for the '<em><b>Teams url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TEAMS_URL = 13;

	/**
	 * The feature id for the '<em><b>Hooks url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HOOKS_URL = 14;

	/**
	 * The feature id for the '<em><b>Issue events url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ISSUE_EVENTS_URL = 15;

	/**
	 * The feature id for the '<em><b>Events url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__EVENTS_URL = 16;

	/**
	 * The feature id for the '<em><b>Assignees url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ASSIGNEES_URL = 17;

	/**
	 * The feature id for the '<em><b>Branches url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__BRANCHES_URL = 18;

	/**
	 * The feature id for the '<em><b>Tags url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TAGS_URL = 19;

	/**
	 * The feature id for the '<em><b>Blobs url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__BLOBS_URL = 20;

	/**
	 * The feature id for the '<em><b>Git tags url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__GIT_TAGS_URL = 21;

	/**
	 * The feature id for the '<em><b>Git refs url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__GIT_REFS_URL = 22;

	/**
	 * The feature id for the '<em><b>Trees url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TREES_URL = 23;

	/**
	 * The feature id for the '<em><b>Statuses url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__STATUSES_URL = 24;

	/**
	 * The feature id for the '<em><b>Languages url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__LANGUAGES_URL = 25;

	/**
	 * The feature id for the '<em><b>Stargazers url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__STARGAZERS_URL = 26;

	/**
	 * The feature id for the '<em><b>Contributors url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTRIBUTORS_URL = 27;

	/**
	 * The feature id for the '<em><b>Subscribers url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SUBSCRIBERS_URL = 28;

	/**
	 * The feature id for the '<em><b>Subscription url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SUBSCRIPTION_URL = 29;

	/**
	 * The feature id for the '<em><b>Commits url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COMMITS_URL = 30;

	/**
	 * The feature id for the '<em><b>Git commits url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__GIT_COMMITS_URL = 31;

	/**
	 * The feature id for the '<em><b>Comments url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COMMENTS_URL = 32;

	/**
	 * The feature id for the '<em><b>Issue comment url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ISSUE_COMMENT_URL = 33;

	/**
	 * The feature id for the '<em><b>Contents url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTENTS_URL = 34;

	/**
	 * The feature id for the '<em><b>Compare url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__COMPARE_URL = 35;

	/**
	 * The feature id for the '<em><b>Merges url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__MERGES_URL = 36;

	/**
	 * The feature id for the '<em><b>Archive url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ARCHIVE_URL = 37;

	/**
	 * The feature id for the '<em><b>Downloads url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DOWNLOADS_URL = 38;

	/**
	 * The feature id for the '<em><b>Issues url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ISSUES_URL = 39;

	/**
	 * The feature id for the '<em><b>Pulls url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PULLS_URL = 40;

	/**
	 * The feature id for the '<em><b>Milestones url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__MILESTONES_URL = 41;

	/**
	 * The feature id for the '<em><b>Notifications url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__NOTIFICATIONS_URL = 42;

	/**
	 * The feature id for the '<em><b>Labels url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__LABELS_URL = 43;

	/**
	 * The feature id for the '<em><b>Releases url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__RELEASES_URL = 44;

	/**
	 * The feature id for the '<em><b>Deployments url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DEPLOYMENTS_URL = 45;

	/**
	 * The feature id for the '<em><b>Created at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CREATED_AT = 46;

	/**
	 * The feature id for the '<em><b>Updated at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__UPDATED_AT = 47;

	/**
	 * The feature id for the '<em><b>Pushed at</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PUSHED_AT = 48;

	/**
	 * The feature id for the '<em><b>Git url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__GIT_URL = 49;

	/**
	 * The feature id for the '<em><b>Ssh url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SSH_URL = 50;

	/**
	 * The feature id for the '<em><b>Clone url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CLONE_URL = 51;

	/**
	 * The feature id for the '<em><b>Svn url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SVN_URL = 52;

	/**
	 * The feature id for the '<em><b>Homepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HOMEPAGE = 53;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__SIZE = 54;

	/**
	 * The feature id for the '<em><b>Stargazers count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__STARGAZERS_COUNT = 55;

	/**
	 * The feature id for the '<em><b>Watchers count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__WATCHERS_COUNT = 56;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__LANGUAGE = 57;

	/**
	 * The feature id for the '<em><b>Has issues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HAS_ISSUES = 58;

	/**
	 * The feature id for the '<em><b>Has projects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HAS_PROJECTS = 59;

	/**
	 * The feature id for the '<em><b>Has downloads</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HAS_DOWNLOADS = 60;

	/**
	 * The feature id for the '<em><b>Has wiki</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HAS_WIKI = 61;

	/**
	 * The feature id for the '<em><b>Has pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HAS_PAGES = 62;

	/**
	 * The feature id for the '<em><b>Has discussions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__HAS_DISCUSSIONS = 63;

	/**
	 * The feature id for the '<em><b>Forks count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FORKS_COUNT = 64;

	/**
	 * The feature id for the '<em><b>Mirror url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__MIRROR_URL = 65;

	/**
	 * The feature id for the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ARCHIVED = 66;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DISABLED = 67;

	/**
	 * The feature id for the '<em><b>Open issues count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OPEN_ISSUES_COUNT = 68;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__LICENSE = 69;

	/**
	 * The feature id for the '<em><b>Allow forking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__ALLOW_FORKING = 70;

	/**
	 * The feature id for the '<em><b>Is template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__IS_TEMPLATE = 71;

	/**
	 * The feature id for the '<em><b>Web commit signoff required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__WEB_COMMIT_SIGNOFF_REQUIRED = 72;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__VISIBILITY = 73;

	/**
	 * The feature id for the '<em><b>Forks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__FORKS = 74;

	/**
	 * The feature id for the '<em><b>Open issues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__OPEN_ISSUES = 75;

	/**
	 * The feature id for the '<em><b>Watchers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__WATCHERS = 76;

	/**
	 * The feature id for the '<em><b>Default branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__DEFAULT_BRANCH = 77;

	/**
	 * The feature id for the '<em><b>Stargazers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__STARGAZERS = 78;

	/**
	 * The feature id for the '<em><b>Master branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__MASTER_BRANCH = 79;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 80;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl <em>Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getOwner()
	 * @generated
	 */
	int OWNER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__LOGIN = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__ID = 3;

	/**
	 * The feature id for the '<em><b>Node id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__NODE_ID = 4;

	/**
	 * The feature id for the '<em><b>Avatar url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__AVATAR_URL = 5;

	/**
	 * The feature id for the '<em><b>Gravatar id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__GRAVATAR_ID = 6;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__URL = 7;

	/**
	 * The feature id for the '<em><b>Html url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__HTML_URL = 8;

	/**
	 * The feature id for the '<em><b>Followers url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__FOLLOWERS_URL = 9;

	/**
	 * The feature id for the '<em><b>Following url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__FOLLOWING_URL = 10;

	/**
	 * The feature id for the '<em><b>Gists url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__GISTS_URL = 11;

	/**
	 * The feature id for the '<em><b>Starred url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__STARRED_URL = 12;

	/**
	 * The feature id for the '<em><b>Subscriptions url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__SUBSCRIPTIONS_URL = 13;

	/**
	 * The feature id for the '<em><b>Organizations url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__ORGANIZATIONS_URL = 14;

	/**
	 * The feature id for the '<em><b>Repos url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__REPOS_URL = 15;

	/**
	 * The feature id for the '<em><b>Events url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__EVENTS_URL = 16;

	/**
	 * The feature id for the '<em><b>Received events url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__RECEIVED_EVENTS_URL = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__TYPE = 18;

	/**
	 * The feature id for the '<em><b>Site admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__SITE_ADMIN = 19;

	/**
	 * The feature id for the '<em><b>User view type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__USER_VIEW_TYPE = 20;

	/**
	 * The number of structural features of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.LicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.LicenseImpl
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getLicense()
	 * @generated
	 */
	int LICENSE = 4;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Spdx id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__SPDX_ID = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__URL = 3;

	/**
	 * The feature id for the '<em><b>Node id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__NODE_ID = 4;

	/**
	 * The number of structural features of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PusherImpl <em>Pusher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.PusherImpl
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getPusher()
	 * @generated
	 */
	int PUSHER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER__EMAIL = 1;

	/**
	 * The number of structural features of the '<em>Pusher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pusher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.SenderImpl <em>Sender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.SenderImpl
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getSender()
	 * @generated
	 */
	int SENDER = 6;

	/**
	 * The feature id for the '<em><b>Login</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__LOGIN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__ID = 1;

	/**
	 * The feature id for the '<em><b>Node id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__NODE_ID = 2;

	/**
	 * The feature id for the '<em><b>Avatar url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__AVATAR_URL = 3;

	/**
	 * The feature id for the '<em><b>Gravatar id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__GRAVATAR_ID = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__URL = 5;

	/**
	 * The feature id for the '<em><b>Html url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__HTML_URL = 6;

	/**
	 * The feature id for the '<em><b>Followers url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__FOLLOWERS_URL = 7;

	/**
	 * The feature id for the '<em><b>Following url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__FOLLOWING_URL = 8;

	/**
	 * The feature id for the '<em><b>Gists url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__GISTS_URL = 9;

	/**
	 * The feature id for the '<em><b>Starred url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__STARRED_URL = 10;

	/**
	 * The feature id for the '<em><b>Subscriptions url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__SUBSCRIPTIONS_URL = 11;

	/**
	 * The feature id for the '<em><b>Organizations url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__ORGANIZATIONS_URL = 12;

	/**
	 * The feature id for the '<em><b>Repos url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__REPOS_URL = 13;

	/**
	 * The feature id for the '<em><b>Events url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__EVENTS_URL = 14;

	/**
	 * The feature id for the '<em><b>Received events url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__RECEIVED_EVENTS_URL = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__TYPE = 16;

	/**
	 * The feature id for the '<em><b>Site admin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__SITE_ADMIN = 17;

	/**
	 * The feature id for the '<em><b>User view type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER__USER_VIEW_TYPE = 18;

	/**
	 * The number of structural features of the '<em>Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Sender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.InstallationImpl <em>Installation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.InstallationImpl
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getInstallation()
	 * @generated
	 */
	int INSTALLATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Node id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION__NODE_ID = 1;

	/**
	 * The number of structural features of the '<em>Installation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Installation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl <em>Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getCommit()
	 * @generated
	 */
	int COMMIT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__ID = 0;

	/**
	 * The feature id for the '<em><b>Tree id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__TREE_ID = 1;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__DISTINCT = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__TIMESTAMP = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__URL = 5;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__AUTHOR = 6;

	/**
	 * The feature id for the '<em><b>Committer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__COMMITTER = 7;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__MODIFIED = 8;

	/**
	 * The feature id for the '<em><b>Added</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__ADDED = 9;

	/**
	 * The number of structural features of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.AuthorImpl
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__USERNAME = 2;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitterImpl <em>Committer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitterImpl
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getCommitter()
	 * @generated
	 */
	int COMMITTER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITTER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITTER__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITTER__USERNAME = 2;

	/**
	 * The number of structural features of the '<em>Committer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Committer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMITTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.Head_commitImpl <em>Head commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.Head_commitImpl
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getHead_commit()
	 * @generated
	 */
	int HEAD_COMMIT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_COMMIT__ID = 0;

	/**
	 * The feature id for the '<em><b>Tree id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_COMMIT__TREE_ID = 1;

	/**
	 * The feature id for the '<em><b>Distinct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_COMMIT__DISTINCT = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_COMMIT__MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_COMMIT__TIMESTAMP = 4;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_COMMIT__URL = 5;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_COMMIT__AUTHOR = 6;

	/**
	 * The feature id for the '<em><b>Committer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_COMMIT__COMMITTER = 7;

	/**
	 * The feature id for the '<em><b>Modified</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_COMMIT__MODIFIED = 8;

	/**
	 * The feature id for the '<em><b>Added</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_COMMIT__ADDED = 9;

	/**
	 * The number of structural features of the '<em>Head commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_COMMIT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Head commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_COMMIT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.jena.mdo.github.webhook.model.githubWebhook.GithubWebhook <em>Webhook</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Webhook</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubWebhook
	 * @generated
	 */
	EClass getGithubWebhook();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.GithubWebhook#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubWebhook#getEvent()
	 * @see #getGithubWebhook()
	 * @generated
	 */
	EAttribute getGithubWebhook_Event();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.github.webhook.model.githubWebhook.GithubWebhook#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Payload</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.GithubWebhook#getPayload()
	 * @see #getGithubWebhook()
	 * @generated
	 */
	EReference getGithubWebhook_Payload();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload
	 * @generated
	 */
	EClass getPayload();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#getRef()
	 * @see #getPayload()
	 * @generated
	 */
	EAttribute getPayload_Ref();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#getBefore()
	 * @see #getPayload()
	 * @generated
	 */
	EAttribute getPayload_Before();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>After</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#getAfter()
	 * @see #getPayload()
	 * @generated
	 */
	EAttribute getPayload_After();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#getRepository()
	 * @see #getPayload()
	 * @generated
	 */
	EReference getPayload_Repository();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getPusher <em>Pusher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pusher</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#getPusher()
	 * @see #getPayload()
	 * @generated
	 */
	EReference getPayload_Pusher();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sender</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#getSender()
	 * @see #getPayload()
	 * @generated
	 */
	EReference getPayload_Sender();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getInstallation <em>Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Installation</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#getInstallation()
	 * @see #getPayload()
	 * @generated
	 */
	EReference getPayload_Installation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#isCreated <em>Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#isCreated()
	 * @see #getPayload()
	 * @generated
	 */
	EAttribute getPayload_Created();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#isDeleted <em>Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#isDeleted()
	 * @see #getPayload()
	 * @generated
	 */
	EAttribute getPayload_Deleted();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#isForced <em>Forced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forced</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#isForced()
	 * @see #getPayload()
	 * @generated
	 */
	EAttribute getPayload_Forced();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getBase_ref <em>Base ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base ref</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#getBase_ref()
	 * @see #getPayload()
	 * @generated
	 */
	EAttribute getPayload_Base_ref();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getCompare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compare</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#getCompare()
	 * @see #getPayload()
	 * @generated
	 */
	EAttribute getPayload_Compare();

	/**
	 * Returns the meta object for the containment reference list '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commits</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#getCommits()
	 * @see #getPayload()
	 * @generated
	 */
	EReference getPayload_Commits();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.github.webhook.model.githubWebhook.Payload#getHead_commit <em>Head commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Head commit</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Payload#getHead_commit()
	 * @see #getPayload()
	 * @generated
	 */
	EReference getPayload_Head_commit();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getId()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getNode_id <em>Node id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getNode_id()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Node_id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getName()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getFull_name <em>Full name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full name</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getFull_name()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Full_name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isPrivate <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isPrivate()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Private();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getOwner()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Owner();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getHtml_url <em>Html url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getHtml_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Html_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDescription()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Description();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isFork <em>Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fork</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isFork()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Fork();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getUrl()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getForks_url <em>Forks url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forks url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getForks_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Forks_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getKeys_url <em>Keys url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keys url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getKeys_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Keys_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCollaborators_url <em>Collaborators url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collaborators url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCollaborators_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Collaborators_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getTeams_url <em>Teams url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teams url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getTeams_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Teams_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getHooks_url <em>Hooks url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hooks url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getHooks_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Hooks_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getIssue_events_url <em>Issue events url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue events url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getIssue_events_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Issue_events_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getEvents_url <em>Events url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Events url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getEvents_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Events_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getAssignees_url <em>Assignees url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignees url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getAssignees_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Assignees_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getBranches_url <em>Branches url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branches url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getBranches_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Branches_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getTags_url <em>Tags url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tags url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getTags_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Tags_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getBlobs_url <em>Blobs url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blobs url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getBlobs_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Blobs_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_tags_url <em>Git tags url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Git tags url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_tags_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Git_tags_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_refs_url <em>Git refs url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Git refs url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_refs_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Git_refs_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getTrees_url <em>Trees url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trees url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getTrees_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Trees_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStatuses_url <em>Statuses url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statuses url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStatuses_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Statuses_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLanguages_url <em>Languages url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Languages url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLanguages_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Languages_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStargazers_url <em>Stargazers url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stargazers url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStargazers_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Stargazers_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getContributors_url <em>Contributors url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contributors url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getContributors_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Contributors_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSubscribers_url <em>Subscribers url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscribers url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSubscribers_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Subscribers_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSubscription_url <em>Subscription url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscription url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSubscription_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Subscription_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCommits_url <em>Commits url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commits url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCommits_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Commits_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_commits_url <em>Git commits url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Git commits url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_commits_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Git_commits_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getComments_url <em>Comments url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comments url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getComments_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Comments_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getIssue_comment_url <em>Issue comment url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue comment url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getIssue_comment_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Issue_comment_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getContents_url <em>Contents url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getContents_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Contents_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCompare_url <em>Compare url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compare url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCompare_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Compare_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMerges_url <em>Merges url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merges url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMerges_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Merges_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getArchive_url <em>Archive url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getArchive_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Archive_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDownloads_url <em>Downloads url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Downloads url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDownloads_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Downloads_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getIssues_url <em>Issues url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issues url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getIssues_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Issues_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getPulls_url <em>Pulls url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pulls url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getPulls_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Pulls_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMilestones_url <em>Milestones url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Milestones url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMilestones_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Milestones_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getNotifications_url <em>Notifications url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notifications url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getNotifications_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Notifications_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLabels_url <em>Labels url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labels url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLabels_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Labels_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getReleases_url <em>Releases url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Releases url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getReleases_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Releases_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDeployments_url <em>Deployments url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployments url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDeployments_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Deployments_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCreated_at <em>Created at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created at</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getCreated_at()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Created_at();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getUpdated_at <em>Updated at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated at</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getUpdated_at()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Updated_at();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getPushed_at <em>Pushed at</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pushed at</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getPushed_at()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Pushed_at();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_url <em>Git url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Git url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getGit_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Git_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSsh_url <em>Ssh url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSsh_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Ssh_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getClone_url <em>Clone url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clone url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getClone_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Clone_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSvn_url <em>Svn url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Svn url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSvn_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Svn_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getHomepage <em>Homepage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Homepage</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getHomepage()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Homepage();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getSize()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Size();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStargazers_count <em>Stargazers count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stargazers count</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStargazers_count()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Stargazers_count();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getWatchers_count <em>Watchers count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watchers count</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getWatchers_count()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Watchers_count();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLanguage()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Language();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_issues <em>Has issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has issues</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_issues()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Has_issues();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_projects <em>Has projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has projects</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_projects()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Has_projects();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_downloads <em>Has downloads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has downloads</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_downloads()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Has_downloads();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_wiki <em>Has wiki</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has wiki</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_wiki()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Has_wiki();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_pages <em>Has pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has pages</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_pages()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Has_pages();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_discussions <em>Has discussions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has discussions</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isHas_discussions()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Has_discussions();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getForks_count <em>Forks count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forks count</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getForks_count()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Forks_count();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMirror_url <em>Mirror url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mirror url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMirror_url()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Mirror_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isArchived <em>Archived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archived</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isArchived()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Archived();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isDisabled()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Disabled();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getOpen_issues_count <em>Open issues count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open issues count</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getOpen_issues_count()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Open_issues_count();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getLicense()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_License();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isAllow_forking <em>Allow forking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow forking</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isAllow_forking()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Allow_forking();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isIs_template <em>Is template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is template</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isIs_template()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Is_template();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#isWeb_commit_signoff_required <em>Web commit signoff required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web commit signoff required</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#isWeb_commit_signoff_required()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Web_commit_signoff_required();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getVisibility()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getForks <em>Forks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forks</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getForks()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Forks();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getOpen_issues <em>Open issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open issues</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getOpen_issues()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Open_issues();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getWatchers <em>Watchers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Watchers</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getWatchers()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Watchers();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDefault_branch <em>Default branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default branch</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getDefault_branch()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Default_branch();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStargazers <em>Stargazers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stargazers</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getStargazers()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Stargazers();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMaster_branch <em>Master branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Master branch</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Repository#getMaster_branch()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Master_branch();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owner</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner
	 * @generated
	 */
	EClass getOwner();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getName()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getEmail()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Email();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getLogin()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Login();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getId()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getNode_id <em>Node id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getNode_id()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Node_id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getAvatar_url <em>Avatar url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avatar url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getAvatar_url()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Avatar_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getGravatar_id <em>Gravatar id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravatar id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getGravatar_id()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Gravatar_id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getUrl()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getHtml_url <em>Html url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getHtml_url()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Html_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getFollowers_url <em>Followers url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Followers url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getFollowers_url()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Followers_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getFollowing_url <em>Following url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Following url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getFollowing_url()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Following_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getGists_url <em>Gists url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gists url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getGists_url()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Gists_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getStarred_url <em>Starred url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starred url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getStarred_url()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Starred_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getSubscriptions_url <em>Subscriptions url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriptions url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getSubscriptions_url()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Subscriptions_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getOrganizations_url <em>Organizations url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organizations url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getOrganizations_url()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Organizations_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getRepos_url <em>Repos url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repos url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getRepos_url()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Repos_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getEvents_url <em>Events url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Events url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getEvents_url()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Events_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getReceived_events_url <em>Received events url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received events url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getReceived_events_url()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Received_events_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getType()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#isSite_admin <em>Site admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site admin</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#isSite_admin()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_Site_admin();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Owner#getUser_view_type <em>User view type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User view type</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Owner#getUser_view_type()
	 * @see #getOwner()
	 * @generated
	 */
	EAttribute getOwner_User_view_type();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.github.webhook.model.githubWebhook.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.License
	 * @generated
	 */
	EClass getLicense();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.License#getKey()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Key();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.License#getName()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getSpdx_id <em>Spdx id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spdx id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.License#getSpdx_id()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Spdx_id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.License#getUrl()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.License#getNode_id <em>Node id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.License#getNode_id()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Node_id();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Pusher <em>Pusher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pusher</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Pusher
	 * @generated
	 */
	EClass getPusher();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Pusher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Pusher#getName()
	 * @see #getPusher()
	 * @generated
	 */
	EAttribute getPusher_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Pusher#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Pusher#getEmail()
	 * @see #getPusher()
	 * @generated
	 */
	EAttribute getPusher_Email();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sender</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender
	 * @generated
	 */
	EClass getSender();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getLogin()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Login();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getId()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getNode_id <em>Node id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getNode_id()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Node_id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getAvatar_url <em>Avatar url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avatar url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getAvatar_url()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Avatar_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getGravatar_id <em>Gravatar id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gravatar id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getGravatar_id()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Gravatar_id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getUrl()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getHtml_url <em>Html url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getHtml_url()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Html_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getFollowers_url <em>Followers url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Followers url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getFollowers_url()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Followers_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getFollowing_url <em>Following url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Following url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getFollowing_url()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Following_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getGists_url <em>Gists url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gists url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getGists_url()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Gists_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getStarred_url <em>Starred url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starred url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getStarred_url()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Starred_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getSubscriptions_url <em>Subscriptions url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriptions url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getSubscriptions_url()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Subscriptions_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getOrganizations_url <em>Organizations url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organizations url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getOrganizations_url()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Organizations_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getRepos_url <em>Repos url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repos url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getRepos_url()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Repos_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getEvents_url <em>Events url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Events url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getEvents_url()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Events_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getReceived_events_url <em>Received events url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Received events url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getReceived_events_url()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Received_events_url();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getType()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#isSite_admin <em>Site admin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Site admin</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#isSite_admin()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_Site_admin();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Sender#getUser_view_type <em>User view type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User view type</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Sender#getUser_view_type()
	 * @see #getSender()
	 * @generated
	 */
	EAttribute getSender_User_view_type();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Installation <em>Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installation</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Installation
	 * @generated
	 */
	EClass getInstallation();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Installation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Installation#getId()
	 * @see #getInstallation()
	 * @generated
	 */
	EAttribute getInstallation_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Installation#getNode_id <em>Node id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Installation#getNode_id()
	 * @see #getInstallation()
	 * @generated
	 */
	EAttribute getInstallation_Node_id();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Commit
	 * @generated
	 */
	EClass getCommit();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Commit#getId()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getTree_id <em>Tree id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Commit#getTree_id()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Tree_id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Commit#isDistinct()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Distinct();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Commit#getMessage()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Message();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Commit#getTimestamp()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Commit#getUrl()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Url();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Commit#getAuthor()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Author();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getCommitter <em>Committer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Committer</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Commit#getCommitter()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Committer();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modified</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Commit#getModified()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Modified();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.github.webhook.model.githubWebhook.Commit#getAdded <em>Added</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Added</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Commit#getAdded()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Added();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Author#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Author#getName()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Author#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Author#getEmail()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Email();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Author#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Author#getUsername()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Username();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Committer <em>Committer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Committer</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Committer
	 * @generated
	 */
	EClass getCommitter();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Committer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Committer#getName()
	 * @see #getCommitter()
	 * @generated
	 */
	EAttribute getCommitter_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Committer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Committer#getEmail()
	 * @see #getCommitter()
	 * @generated
	 */
	EAttribute getCommitter_Email();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Committer#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Committer#getUsername()
	 * @see #getCommitter()
	 * @generated
	 */
	EAttribute getCommitter_Username();

	/**
	 * Returns the meta object for class '{@link de.jena.mdo.github.webhook.model.githubWebhook.Head_commit <em>Head commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head commit</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Head_commit
	 * @generated
	 */
	EClass getHead_commit();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getId()
	 * @see #getHead_commit()
	 * @generated
	 */
	EAttribute getHead_commit_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getTree_id <em>Tree id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree id</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getTree_id()
	 * @see #getHead_commit()
	 * @generated
	 */
	EAttribute getHead_commit_Tree_id();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#isDistinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distinct</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#isDistinct()
	 * @see #getHead_commit()
	 * @generated
	 */
	EAttribute getHead_commit_Distinct();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getMessage()
	 * @see #getHead_commit()
	 * @generated
	 */
	EAttribute getHead_commit_Message();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getTimestamp()
	 * @see #getHead_commit()
	 * @generated
	 */
	EAttribute getHead_commit_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getUrl()
	 * @see #getHead_commit()
	 * @generated
	 */
	EAttribute getHead_commit_Url();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getAuthor()
	 * @see #getHead_commit()
	 * @generated
	 */
	EReference getHead_commit_Author();

	/**
	 * Returns the meta object for the containment reference '{@link de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getCommitter <em>Committer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Committer</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getCommitter()
	 * @see #getHead_commit()
	 * @generated
	 */
	EReference getHead_commit_Committer();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getModified <em>Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modified</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getModified()
	 * @see #getHead_commit()
	 * @generated
	 */
	EAttribute getHead_commit_Modified();

	/**
	 * Returns the meta object for the attribute list '{@link de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getAdded <em>Added</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Added</em>'.
	 * @see de.jena.mdo.github.webhook.model.githubWebhook.Head_commit#getAdded()
	 * @see #getHead_commit()
	 * @generated
	 */
	EAttribute getHead_commit_Added();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GithubFactory getGithubFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubWebhookImpl <em>Webhook</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubWebhookImpl
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getGithubWebhook()
		 * @generated
		 */
		EClass GITHUB_WEBHOOK = eINSTANCE.getGithubWebhook();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GITHUB_WEBHOOK__EVENT = eINSTANCE.getGithubWebhook_Event();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GITHUB_WEBHOOK__PAYLOAD = eINSTANCE.getGithubWebhook_Payload();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl <em>Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getPayload()
		 * @generated
		 */
		EClass PAYLOAD = eINSTANCE.getPayload();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYLOAD__REF = eINSTANCE.getPayload_Ref();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYLOAD__BEFORE = eINSTANCE.getPayload_Before();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYLOAD__AFTER = eINSTANCE.getPayload_After();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD__REPOSITORY = eINSTANCE.getPayload_Repository();

		/**
		 * The meta object literal for the '<em><b>Pusher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD__PUSHER = eINSTANCE.getPayload_Pusher();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD__SENDER = eINSTANCE.getPayload_Sender();

		/**
		 * The meta object literal for the '<em><b>Installation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD__INSTALLATION = eINSTANCE.getPayload_Installation();

		/**
		 * The meta object literal for the '<em><b>Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYLOAD__CREATED = eINSTANCE.getPayload_Created();

		/**
		 * The meta object literal for the '<em><b>Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYLOAD__DELETED = eINSTANCE.getPayload_Deleted();

		/**
		 * The meta object literal for the '<em><b>Forced</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYLOAD__FORCED = eINSTANCE.getPayload_Forced();

		/**
		 * The meta object literal for the '<em><b>Base ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYLOAD__BASE_REF = eINSTANCE.getPayload_Base_ref();

		/**
		 * The meta object literal for the '<em><b>Compare</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYLOAD__COMPARE = eINSTANCE.getPayload_Compare();

		/**
		 * The meta object literal for the '<em><b>Commits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD__COMMITS = eINSTANCE.getPayload_Commits();

		/**
		 * The meta object literal for the '<em><b>Head commit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYLOAD__HEAD_COMMIT = eINSTANCE.getPayload_Head_commit();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.RepositoryImpl
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ID = eINSTANCE.getRepository_Id();

		/**
		 * The meta object literal for the '<em><b>Node id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NODE_ID = eINSTANCE.getRepository_Node_id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NAME = eINSTANCE.getRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Full name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__FULL_NAME = eINSTANCE.getRepository_Full_name();

		/**
		 * The meta object literal for the '<em><b>Private</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__PRIVATE = eINSTANCE.getRepository_Private();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__OWNER = eINSTANCE.getRepository_Owner();

		/**
		 * The meta object literal for the '<em><b>Html url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__HTML_URL = eINSTANCE.getRepository_Html_url();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__DESCRIPTION = eINSTANCE.getRepository_Description();

		/**
		 * The meta object literal for the '<em><b>Fork</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__FORK = eINSTANCE.getRepository_Fork();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__URL = eINSTANCE.getRepository_Url();

		/**
		 * The meta object literal for the '<em><b>Forks url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__FORKS_URL = eINSTANCE.getRepository_Forks_url();

		/**
		 * The meta object literal for the '<em><b>Keys url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__KEYS_URL = eINSTANCE.getRepository_Keys_url();

		/**
		 * The meta object literal for the '<em><b>Collaborators url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__COLLABORATORS_URL = eINSTANCE.getRepository_Collaborators_url();

		/**
		 * The meta object literal for the '<em><b>Teams url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__TEAMS_URL = eINSTANCE.getRepository_Teams_url();

		/**
		 * The meta object literal for the '<em><b>Hooks url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__HOOKS_URL = eINSTANCE.getRepository_Hooks_url();

		/**
		 * The meta object literal for the '<em><b>Issue events url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ISSUE_EVENTS_URL = eINSTANCE.getRepository_Issue_events_url();

		/**
		 * The meta object literal for the '<em><b>Events url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__EVENTS_URL = eINSTANCE.getRepository_Events_url();

		/**
		 * The meta object literal for the '<em><b>Assignees url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ASSIGNEES_URL = eINSTANCE.getRepository_Assignees_url();

		/**
		 * The meta object literal for the '<em><b>Branches url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__BRANCHES_URL = eINSTANCE.getRepository_Branches_url();

		/**
		 * The meta object literal for the '<em><b>Tags url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__TAGS_URL = eINSTANCE.getRepository_Tags_url();

		/**
		 * The meta object literal for the '<em><b>Blobs url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__BLOBS_URL = eINSTANCE.getRepository_Blobs_url();

		/**
		 * The meta object literal for the '<em><b>Git tags url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__GIT_TAGS_URL = eINSTANCE.getRepository_Git_tags_url();

		/**
		 * The meta object literal for the '<em><b>Git refs url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__GIT_REFS_URL = eINSTANCE.getRepository_Git_refs_url();

		/**
		 * The meta object literal for the '<em><b>Trees url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__TREES_URL = eINSTANCE.getRepository_Trees_url();

		/**
		 * The meta object literal for the '<em><b>Statuses url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__STATUSES_URL = eINSTANCE.getRepository_Statuses_url();

		/**
		 * The meta object literal for the '<em><b>Languages url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__LANGUAGES_URL = eINSTANCE.getRepository_Languages_url();

		/**
		 * The meta object literal for the '<em><b>Stargazers url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__STARGAZERS_URL = eINSTANCE.getRepository_Stargazers_url();

		/**
		 * The meta object literal for the '<em><b>Contributors url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__CONTRIBUTORS_URL = eINSTANCE.getRepository_Contributors_url();

		/**
		 * The meta object literal for the '<em><b>Subscribers url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__SUBSCRIBERS_URL = eINSTANCE.getRepository_Subscribers_url();

		/**
		 * The meta object literal for the '<em><b>Subscription url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__SUBSCRIPTION_URL = eINSTANCE.getRepository_Subscription_url();

		/**
		 * The meta object literal for the '<em><b>Commits url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__COMMITS_URL = eINSTANCE.getRepository_Commits_url();

		/**
		 * The meta object literal for the '<em><b>Git commits url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__GIT_COMMITS_URL = eINSTANCE.getRepository_Git_commits_url();

		/**
		 * The meta object literal for the '<em><b>Comments url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__COMMENTS_URL = eINSTANCE.getRepository_Comments_url();

		/**
		 * The meta object literal for the '<em><b>Issue comment url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ISSUE_COMMENT_URL = eINSTANCE.getRepository_Issue_comment_url();

		/**
		 * The meta object literal for the '<em><b>Contents url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__CONTENTS_URL = eINSTANCE.getRepository_Contents_url();

		/**
		 * The meta object literal for the '<em><b>Compare url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__COMPARE_URL = eINSTANCE.getRepository_Compare_url();

		/**
		 * The meta object literal for the '<em><b>Merges url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__MERGES_URL = eINSTANCE.getRepository_Merges_url();

		/**
		 * The meta object literal for the '<em><b>Archive url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ARCHIVE_URL = eINSTANCE.getRepository_Archive_url();

		/**
		 * The meta object literal for the '<em><b>Downloads url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__DOWNLOADS_URL = eINSTANCE.getRepository_Downloads_url();

		/**
		 * The meta object literal for the '<em><b>Issues url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ISSUES_URL = eINSTANCE.getRepository_Issues_url();

		/**
		 * The meta object literal for the '<em><b>Pulls url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__PULLS_URL = eINSTANCE.getRepository_Pulls_url();

		/**
		 * The meta object literal for the '<em><b>Milestones url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__MILESTONES_URL = eINSTANCE.getRepository_Milestones_url();

		/**
		 * The meta object literal for the '<em><b>Notifications url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__NOTIFICATIONS_URL = eINSTANCE.getRepository_Notifications_url();

		/**
		 * The meta object literal for the '<em><b>Labels url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__LABELS_URL = eINSTANCE.getRepository_Labels_url();

		/**
		 * The meta object literal for the '<em><b>Releases url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__RELEASES_URL = eINSTANCE.getRepository_Releases_url();

		/**
		 * The meta object literal for the '<em><b>Deployments url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__DEPLOYMENTS_URL = eINSTANCE.getRepository_Deployments_url();

		/**
		 * The meta object literal for the '<em><b>Created at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__CREATED_AT = eINSTANCE.getRepository_Created_at();

		/**
		 * The meta object literal for the '<em><b>Updated at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__UPDATED_AT = eINSTANCE.getRepository_Updated_at();

		/**
		 * The meta object literal for the '<em><b>Pushed at</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__PUSHED_AT = eINSTANCE.getRepository_Pushed_at();

		/**
		 * The meta object literal for the '<em><b>Git url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__GIT_URL = eINSTANCE.getRepository_Git_url();

		/**
		 * The meta object literal for the '<em><b>Ssh url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__SSH_URL = eINSTANCE.getRepository_Ssh_url();

		/**
		 * The meta object literal for the '<em><b>Clone url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__CLONE_URL = eINSTANCE.getRepository_Clone_url();

		/**
		 * The meta object literal for the '<em><b>Svn url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__SVN_URL = eINSTANCE.getRepository_Svn_url();

		/**
		 * The meta object literal for the '<em><b>Homepage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__HOMEPAGE = eINSTANCE.getRepository_Homepage();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__SIZE = eINSTANCE.getRepository_Size();

		/**
		 * The meta object literal for the '<em><b>Stargazers count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__STARGAZERS_COUNT = eINSTANCE.getRepository_Stargazers_count();

		/**
		 * The meta object literal for the '<em><b>Watchers count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__WATCHERS_COUNT = eINSTANCE.getRepository_Watchers_count();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__LANGUAGE = eINSTANCE.getRepository_Language();

		/**
		 * The meta object literal for the '<em><b>Has issues</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__HAS_ISSUES = eINSTANCE.getRepository_Has_issues();

		/**
		 * The meta object literal for the '<em><b>Has projects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__HAS_PROJECTS = eINSTANCE.getRepository_Has_projects();

		/**
		 * The meta object literal for the '<em><b>Has downloads</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__HAS_DOWNLOADS = eINSTANCE.getRepository_Has_downloads();

		/**
		 * The meta object literal for the '<em><b>Has wiki</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__HAS_WIKI = eINSTANCE.getRepository_Has_wiki();

		/**
		 * The meta object literal for the '<em><b>Has pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__HAS_PAGES = eINSTANCE.getRepository_Has_pages();

		/**
		 * The meta object literal for the '<em><b>Has discussions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__HAS_DISCUSSIONS = eINSTANCE.getRepository_Has_discussions();

		/**
		 * The meta object literal for the '<em><b>Forks count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__FORKS_COUNT = eINSTANCE.getRepository_Forks_count();

		/**
		 * The meta object literal for the '<em><b>Mirror url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__MIRROR_URL = eINSTANCE.getRepository_Mirror_url();

		/**
		 * The meta object literal for the '<em><b>Archived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ARCHIVED = eINSTANCE.getRepository_Archived();

		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__DISABLED = eINSTANCE.getRepository_Disabled();

		/**
		 * The meta object literal for the '<em><b>Open issues count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__OPEN_ISSUES_COUNT = eINSTANCE.getRepository_Open_issues_count();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__LICENSE = eINSTANCE.getRepository_License();

		/**
		 * The meta object literal for the '<em><b>Allow forking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__ALLOW_FORKING = eINSTANCE.getRepository_Allow_forking();

		/**
		 * The meta object literal for the '<em><b>Is template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__IS_TEMPLATE = eINSTANCE.getRepository_Is_template();

		/**
		 * The meta object literal for the '<em><b>Web commit signoff required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__WEB_COMMIT_SIGNOFF_REQUIRED = eINSTANCE.getRepository_Web_commit_signoff_required();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__VISIBILITY = eINSTANCE.getRepository_Visibility();

		/**
		 * The meta object literal for the '<em><b>Forks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__FORKS = eINSTANCE.getRepository_Forks();

		/**
		 * The meta object literal for the '<em><b>Open issues</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__OPEN_ISSUES = eINSTANCE.getRepository_Open_issues();

		/**
		 * The meta object literal for the '<em><b>Watchers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__WATCHERS = eINSTANCE.getRepository_Watchers();

		/**
		 * The meta object literal for the '<em><b>Default branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__DEFAULT_BRANCH = eINSTANCE.getRepository_Default_branch();

		/**
		 * The meta object literal for the '<em><b>Stargazers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__STARGAZERS = eINSTANCE.getRepository_Stargazers();

		/**
		 * The meta object literal for the '<em><b>Master branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__MASTER_BRANCH = eINSTANCE.getRepository_Master_branch();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl <em>Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getOwner()
		 * @generated
		 */
		EClass OWNER = eINSTANCE.getOwner();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__NAME = eINSTANCE.getOwner_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__EMAIL = eINSTANCE.getOwner_Email();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__LOGIN = eINSTANCE.getOwner_Login();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__ID = eINSTANCE.getOwner_Id();

		/**
		 * The meta object literal for the '<em><b>Node id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__NODE_ID = eINSTANCE.getOwner_Node_id();

		/**
		 * The meta object literal for the '<em><b>Avatar url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__AVATAR_URL = eINSTANCE.getOwner_Avatar_url();

		/**
		 * The meta object literal for the '<em><b>Gravatar id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__GRAVATAR_ID = eINSTANCE.getOwner_Gravatar_id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__URL = eINSTANCE.getOwner_Url();

		/**
		 * The meta object literal for the '<em><b>Html url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__HTML_URL = eINSTANCE.getOwner_Html_url();

		/**
		 * The meta object literal for the '<em><b>Followers url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__FOLLOWERS_URL = eINSTANCE.getOwner_Followers_url();

		/**
		 * The meta object literal for the '<em><b>Following url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__FOLLOWING_URL = eINSTANCE.getOwner_Following_url();

		/**
		 * The meta object literal for the '<em><b>Gists url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__GISTS_URL = eINSTANCE.getOwner_Gists_url();

		/**
		 * The meta object literal for the '<em><b>Starred url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__STARRED_URL = eINSTANCE.getOwner_Starred_url();

		/**
		 * The meta object literal for the '<em><b>Subscriptions url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__SUBSCRIPTIONS_URL = eINSTANCE.getOwner_Subscriptions_url();

		/**
		 * The meta object literal for the '<em><b>Organizations url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__ORGANIZATIONS_URL = eINSTANCE.getOwner_Organizations_url();

		/**
		 * The meta object literal for the '<em><b>Repos url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__REPOS_URL = eINSTANCE.getOwner_Repos_url();

		/**
		 * The meta object literal for the '<em><b>Events url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__EVENTS_URL = eINSTANCE.getOwner_Events_url();

		/**
		 * The meta object literal for the '<em><b>Received events url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__RECEIVED_EVENTS_URL = eINSTANCE.getOwner_Received_events_url();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__TYPE = eINSTANCE.getOwner_Type();

		/**
		 * The meta object literal for the '<em><b>Site admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__SITE_ADMIN = eINSTANCE.getOwner_Site_admin();

		/**
		 * The meta object literal for the '<em><b>User view type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNER__USER_VIEW_TYPE = eINSTANCE.getOwner_User_view_type();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.LicenseImpl <em>License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.LicenseImpl
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getLicense()
		 * @generated
		 */
		EClass LICENSE = eINSTANCE.getLicense();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__KEY = eINSTANCE.getLicense_Key();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__NAME = eINSTANCE.getLicense_Name();

		/**
		 * The meta object literal for the '<em><b>Spdx id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__SPDX_ID = eINSTANCE.getLicense_Spdx_id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__URL = eINSTANCE.getLicense_Url();

		/**
		 * The meta object literal for the '<em><b>Node id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__NODE_ID = eINSTANCE.getLicense_Node_id();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PusherImpl <em>Pusher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.PusherImpl
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getPusher()
		 * @generated
		 */
		EClass PUSHER = eINSTANCE.getPusher();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSHER__NAME = eINSTANCE.getPusher_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSHER__EMAIL = eINSTANCE.getPusher_Email();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.SenderImpl <em>Sender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.SenderImpl
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getSender()
		 * @generated
		 */
		EClass SENDER = eINSTANCE.getSender();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__LOGIN = eINSTANCE.getSender_Login();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__ID = eINSTANCE.getSender_Id();

		/**
		 * The meta object literal for the '<em><b>Node id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__NODE_ID = eINSTANCE.getSender_Node_id();

		/**
		 * The meta object literal for the '<em><b>Avatar url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__AVATAR_URL = eINSTANCE.getSender_Avatar_url();

		/**
		 * The meta object literal for the '<em><b>Gravatar id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__GRAVATAR_ID = eINSTANCE.getSender_Gravatar_id();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__URL = eINSTANCE.getSender_Url();

		/**
		 * The meta object literal for the '<em><b>Html url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__HTML_URL = eINSTANCE.getSender_Html_url();

		/**
		 * The meta object literal for the '<em><b>Followers url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__FOLLOWERS_URL = eINSTANCE.getSender_Followers_url();

		/**
		 * The meta object literal for the '<em><b>Following url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__FOLLOWING_URL = eINSTANCE.getSender_Following_url();

		/**
		 * The meta object literal for the '<em><b>Gists url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__GISTS_URL = eINSTANCE.getSender_Gists_url();

		/**
		 * The meta object literal for the '<em><b>Starred url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__STARRED_URL = eINSTANCE.getSender_Starred_url();

		/**
		 * The meta object literal for the '<em><b>Subscriptions url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__SUBSCRIPTIONS_URL = eINSTANCE.getSender_Subscriptions_url();

		/**
		 * The meta object literal for the '<em><b>Organizations url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__ORGANIZATIONS_URL = eINSTANCE.getSender_Organizations_url();

		/**
		 * The meta object literal for the '<em><b>Repos url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__REPOS_URL = eINSTANCE.getSender_Repos_url();

		/**
		 * The meta object literal for the '<em><b>Events url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__EVENTS_URL = eINSTANCE.getSender_Events_url();

		/**
		 * The meta object literal for the '<em><b>Received events url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__RECEIVED_EVENTS_URL = eINSTANCE.getSender_Received_events_url();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__TYPE = eINSTANCE.getSender_Type();

		/**
		 * The meta object literal for the '<em><b>Site admin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__SITE_ADMIN = eINSTANCE.getSender_Site_admin();

		/**
		 * The meta object literal for the '<em><b>User view type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENDER__USER_VIEW_TYPE = eINSTANCE.getSender_User_view_type();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.InstallationImpl <em>Installation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.InstallationImpl
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getInstallation()
		 * @generated
		 */
		EClass INSTALLATION = eINSTANCE.getInstallation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLATION__ID = eINSTANCE.getInstallation_Id();

		/**
		 * The meta object literal for the '<em><b>Node id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLATION__NODE_ID = eINSTANCE.getInstallation_Node_id();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl <em>Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getCommit()
		 * @generated
		 */
		EClass COMMIT = eINSTANCE.getCommit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__ID = eINSTANCE.getCommit_Id();

		/**
		 * The meta object literal for the '<em><b>Tree id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__TREE_ID = eINSTANCE.getCommit_Tree_id();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__DISTINCT = eINSTANCE.getCommit_Distinct();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__MESSAGE = eINSTANCE.getCommit_Message();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__TIMESTAMP = eINSTANCE.getCommit_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__URL = eINSTANCE.getCommit_Url();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__AUTHOR = eINSTANCE.getCommit_Author();

		/**
		 * The meta object literal for the '<em><b>Committer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__COMMITTER = eINSTANCE.getCommit_Committer();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__MODIFIED = eINSTANCE.getCommit_Modified();

		/**
		 * The meta object literal for the '<em><b>Added</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__ADDED = eINSTANCE.getCommit_Added();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.AuthorImpl
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__NAME = eINSTANCE.getAuthor_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__EMAIL = eINSTANCE.getAuthor_Email();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__USERNAME = eINSTANCE.getAuthor_Username();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitterImpl <em>Committer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitterImpl
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getCommitter()
		 * @generated
		 */
		EClass COMMITTER = eINSTANCE.getCommitter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMITTER__NAME = eINSTANCE.getCommitter_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMITTER__EMAIL = eINSTANCE.getCommitter_Email();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMITTER__USERNAME = eINSTANCE.getCommitter_Username();

		/**
		 * The meta object literal for the '{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.Head_commitImpl <em>Head commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.Head_commitImpl
		 * @see de.jena.mdo.github.webhook.model.githubWebhook.impl.GithubPackageImpl#getHead_commit()
		 * @generated
		 */
		EClass HEAD_COMMIT = eINSTANCE.getHead_commit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_COMMIT__ID = eINSTANCE.getHead_commit_Id();

		/**
		 * The meta object literal for the '<em><b>Tree id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_COMMIT__TREE_ID = eINSTANCE.getHead_commit_Tree_id();

		/**
		 * The meta object literal for the '<em><b>Distinct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_COMMIT__DISTINCT = eINSTANCE.getHead_commit_Distinct();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_COMMIT__MESSAGE = eINSTANCE.getHead_commit_Message();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_COMMIT__TIMESTAMP = eINSTANCE.getHead_commit_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_COMMIT__URL = eINSTANCE.getHead_commit_Url();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD_COMMIT__AUTHOR = eINSTANCE.getHead_commit_Author();

		/**
		 * The meta object literal for the '<em><b>Committer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEAD_COMMIT__COMMITTER = eINSTANCE.getHead_commit_Committer();

		/**
		 * The meta object literal for the '<em><b>Modified</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_COMMIT__MODIFIED = eINSTANCE.getHead_commit_Modified();

		/**
		 * The meta object literal for the '<em><b>Added</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEAD_COMMIT__ADDED = eINSTANCE.getHead_commit_Added();

	}

} //GithubPackage
