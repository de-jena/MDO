/*
 */
package de.jena.mdo.github.webhook.model.githubWebhook.impl;

import de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage;
import de.jena.mdo.github.webhook.model.githubWebhook.Owner;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getNode_id <em>Node id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getAvatar_url <em>Avatar url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getGravatar_id <em>Gravatar id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getHtml_url <em>Html url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getFollowers_url <em>Followers url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getFollowing_url <em>Following url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getGists_url <em>Gists url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getStarred_url <em>Starred url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getSubscriptions_url <em>Subscriptions url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getOrganizations_url <em>Organizations url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getRepos_url <em>Repos url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getEvents_url <em>Events url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getReceived_events_url <em>Received events url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#isSite_admin <em>Site admin</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.OwnerImpl#getUser_view_type <em>User view type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OwnerImpl extends MinimalEObjectImpl.Container implements Owner {
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
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected String login = LOGIN_EDEFAULT;

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
	 * The default value of the '{@link #getAvatar_url() <em>Avatar url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatar_url()
	 * @generated
	 * @ordered
	 */
	protected static final String AVATAR_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvatar_url() <em>Avatar url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatar_url()
	 * @generated
	 * @ordered
	 */
	protected String avatar_url = AVATAR_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGravatar_id() <em>Gravatar id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravatar_id()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAVATAR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGravatar_id() <em>Gravatar id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravatar_id()
	 * @generated
	 * @ordered
	 */
	protected String gravatar_id = GRAVATAR_ID_EDEFAULT;

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
	 * The default value of the '{@link #getFollowers_url() <em>Followers url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowers_url()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLLOWERS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFollowers_url() <em>Followers url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowers_url()
	 * @generated
	 * @ordered
	 */
	protected String followers_url = FOLLOWERS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFollowing_url() <em>Following url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowing_url()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLLOWING_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFollowing_url() <em>Following url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowing_url()
	 * @generated
	 * @ordered
	 */
	protected String following_url = FOLLOWING_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGists_url() <em>Gists url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGists_url()
	 * @generated
	 * @ordered
	 */
	protected static final String GISTS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGists_url() <em>Gists url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGists_url()
	 * @generated
	 * @ordered
	 */
	protected String gists_url = GISTS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStarred_url() <em>Starred url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarred_url()
	 * @generated
	 * @ordered
	 */
	protected static final String STARRED_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStarred_url() <em>Starred url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarred_url()
	 * @generated
	 * @ordered
	 */
	protected String starred_url = STARRED_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriptions_url() <em>Subscriptions url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptions_url()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIPTIONS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriptions_url() <em>Subscriptions url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriptions_url()
	 * @generated
	 * @ordered
	 */
	protected String subscriptions_url = SUBSCRIPTIONS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganizations_url() <em>Organizations url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizations_url()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANIZATIONS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganizations_url() <em>Organizations url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganizations_url()
	 * @generated
	 * @ordered
	 */
	protected String organizations_url = ORGANIZATIONS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepos_url() <em>Repos url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepos_url()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepos_url() <em>Repos url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepos_url()
	 * @generated
	 * @ordered
	 */
	protected String repos_url = REPOS_URL_EDEFAULT;

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
	 * The default value of the '{@link #getReceived_events_url() <em>Received events url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceived_events_url()
	 * @generated
	 * @ordered
	 */
	protected static final String RECEIVED_EVENTS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReceived_events_url() <em>Received events url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceived_events_url()
	 * @generated
	 * @ordered
	 */
	protected String received_events_url = RECEIVED_EVENTS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSite_admin() <em>Site admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSite_admin()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SITE_ADMIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSite_admin() <em>Site admin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSite_admin()
	 * @generated
	 * @ordered
	 */
	protected boolean site_admin = SITE_ADMIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser_view_type() <em>User view type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_view_type()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_VIEW_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser_view_type() <em>User view type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_view_type()
	 * @generated
	 * @ordered
	 */
	protected String user_view_type = USER_VIEW_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.OWNER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogin(String newLogin) {
		String oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__LOGIN, oldLogin, login));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__NODE_ID, oldNode_id, node_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvatar_url() {
		return avatar_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvatar_url(String newAvatar_url) {
		String oldAvatar_url = avatar_url;
		avatar_url = newAvatar_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__AVATAR_URL, oldAvatar_url, avatar_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGravatar_id() {
		return gravatar_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGravatar_id(String newGravatar_id) {
		String oldGravatar_id = gravatar_id;
		gravatar_id = newGravatar_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__GRAVATAR_ID, oldGravatar_id, gravatar_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__HTML_URL, oldHtml_url, html_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFollowers_url() {
		return followers_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFollowers_url(String newFollowers_url) {
		String oldFollowers_url = followers_url;
		followers_url = newFollowers_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__FOLLOWERS_URL, oldFollowers_url, followers_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFollowing_url() {
		return following_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFollowing_url(String newFollowing_url) {
		String oldFollowing_url = following_url;
		following_url = newFollowing_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__FOLLOWING_URL, oldFollowing_url, following_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGists_url() {
		return gists_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGists_url(String newGists_url) {
		String oldGists_url = gists_url;
		gists_url = newGists_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__GISTS_URL, oldGists_url, gists_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStarred_url() {
		return starred_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarred_url(String newStarred_url) {
		String oldStarred_url = starred_url;
		starred_url = newStarred_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__STARRED_URL, oldStarred_url, starred_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubscriptions_url() {
		return subscriptions_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscriptions_url(String newSubscriptions_url) {
		String oldSubscriptions_url = subscriptions_url;
		subscriptions_url = newSubscriptions_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__SUBSCRIPTIONS_URL, oldSubscriptions_url, subscriptions_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganizations_url() {
		return organizations_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizations_url(String newOrganizations_url) {
		String oldOrganizations_url = organizations_url;
		organizations_url = newOrganizations_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__ORGANIZATIONS_URL, oldOrganizations_url, organizations_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepos_url() {
		return repos_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepos_url(String newRepos_url) {
		String oldRepos_url = repos_url;
		repos_url = newRepos_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__REPOS_URL, oldRepos_url, repos_url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__EVENTS_URL, oldEvents_url, events_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReceived_events_url() {
		return received_events_url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReceived_events_url(String newReceived_events_url) {
		String oldReceived_events_url = received_events_url;
		received_events_url = newReceived_events_url;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__RECEIVED_EVENTS_URL, oldReceived_events_url, received_events_url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSite_admin() {
		return site_admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSite_admin(boolean newSite_admin) {
		boolean oldSite_admin = site_admin;
		site_admin = newSite_admin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__SITE_ADMIN, oldSite_admin, site_admin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUser_view_type() {
		return user_view_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser_view_type(String newUser_view_type) {
		String oldUser_view_type = user_view_type;
		user_view_type = newUser_view_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.OWNER__USER_VIEW_TYPE, oldUser_view_type, user_view_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.OWNER__NAME:
				return getName();
			case GithubPackage.OWNER__EMAIL:
				return getEmail();
			case GithubPackage.OWNER__LOGIN:
				return getLogin();
			case GithubPackage.OWNER__ID:
				return getId();
			case GithubPackage.OWNER__NODE_ID:
				return getNode_id();
			case GithubPackage.OWNER__AVATAR_URL:
				return getAvatar_url();
			case GithubPackage.OWNER__GRAVATAR_ID:
				return getGravatar_id();
			case GithubPackage.OWNER__URL:
				return getUrl();
			case GithubPackage.OWNER__HTML_URL:
				return getHtml_url();
			case GithubPackage.OWNER__FOLLOWERS_URL:
				return getFollowers_url();
			case GithubPackage.OWNER__FOLLOWING_URL:
				return getFollowing_url();
			case GithubPackage.OWNER__GISTS_URL:
				return getGists_url();
			case GithubPackage.OWNER__STARRED_URL:
				return getStarred_url();
			case GithubPackage.OWNER__SUBSCRIPTIONS_URL:
				return getSubscriptions_url();
			case GithubPackage.OWNER__ORGANIZATIONS_URL:
				return getOrganizations_url();
			case GithubPackage.OWNER__REPOS_URL:
				return getRepos_url();
			case GithubPackage.OWNER__EVENTS_URL:
				return getEvents_url();
			case GithubPackage.OWNER__RECEIVED_EVENTS_URL:
				return getReceived_events_url();
			case GithubPackage.OWNER__TYPE:
				return getType();
			case GithubPackage.OWNER__SITE_ADMIN:
				return isSite_admin();
			case GithubPackage.OWNER__USER_VIEW_TYPE:
				return getUser_view_type();
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
			case GithubPackage.OWNER__NAME:
				setName((String)newValue);
				return;
			case GithubPackage.OWNER__EMAIL:
				setEmail((String)newValue);
				return;
			case GithubPackage.OWNER__LOGIN:
				setLogin((String)newValue);
				return;
			case GithubPackage.OWNER__ID:
				setId((Integer)newValue);
				return;
			case GithubPackage.OWNER__NODE_ID:
				setNode_id((String)newValue);
				return;
			case GithubPackage.OWNER__AVATAR_URL:
				setAvatar_url((String)newValue);
				return;
			case GithubPackage.OWNER__GRAVATAR_ID:
				setGravatar_id((String)newValue);
				return;
			case GithubPackage.OWNER__URL:
				setUrl((String)newValue);
				return;
			case GithubPackage.OWNER__HTML_URL:
				setHtml_url((String)newValue);
				return;
			case GithubPackage.OWNER__FOLLOWERS_URL:
				setFollowers_url((String)newValue);
				return;
			case GithubPackage.OWNER__FOLLOWING_URL:
				setFollowing_url((String)newValue);
				return;
			case GithubPackage.OWNER__GISTS_URL:
				setGists_url((String)newValue);
				return;
			case GithubPackage.OWNER__STARRED_URL:
				setStarred_url((String)newValue);
				return;
			case GithubPackage.OWNER__SUBSCRIPTIONS_URL:
				setSubscriptions_url((String)newValue);
				return;
			case GithubPackage.OWNER__ORGANIZATIONS_URL:
				setOrganizations_url((String)newValue);
				return;
			case GithubPackage.OWNER__REPOS_URL:
				setRepos_url((String)newValue);
				return;
			case GithubPackage.OWNER__EVENTS_URL:
				setEvents_url((String)newValue);
				return;
			case GithubPackage.OWNER__RECEIVED_EVENTS_URL:
				setReceived_events_url((String)newValue);
				return;
			case GithubPackage.OWNER__TYPE:
				setType((String)newValue);
				return;
			case GithubPackage.OWNER__SITE_ADMIN:
				setSite_admin((Boolean)newValue);
				return;
			case GithubPackage.OWNER__USER_VIEW_TYPE:
				setUser_view_type((String)newValue);
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
			case GithubPackage.OWNER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GithubPackage.OWNER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case GithubPackage.OWNER__LOGIN:
				setLogin(LOGIN_EDEFAULT);
				return;
			case GithubPackage.OWNER__ID:
				setId(ID_EDEFAULT);
				return;
			case GithubPackage.OWNER__NODE_ID:
				setNode_id(NODE_ID_EDEFAULT);
				return;
			case GithubPackage.OWNER__AVATAR_URL:
				setAvatar_url(AVATAR_URL_EDEFAULT);
				return;
			case GithubPackage.OWNER__GRAVATAR_ID:
				setGravatar_id(GRAVATAR_ID_EDEFAULT);
				return;
			case GithubPackage.OWNER__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GithubPackage.OWNER__HTML_URL:
				setHtml_url(HTML_URL_EDEFAULT);
				return;
			case GithubPackage.OWNER__FOLLOWERS_URL:
				setFollowers_url(FOLLOWERS_URL_EDEFAULT);
				return;
			case GithubPackage.OWNER__FOLLOWING_URL:
				setFollowing_url(FOLLOWING_URL_EDEFAULT);
				return;
			case GithubPackage.OWNER__GISTS_URL:
				setGists_url(GISTS_URL_EDEFAULT);
				return;
			case GithubPackage.OWNER__STARRED_URL:
				setStarred_url(STARRED_URL_EDEFAULT);
				return;
			case GithubPackage.OWNER__SUBSCRIPTIONS_URL:
				setSubscriptions_url(SUBSCRIPTIONS_URL_EDEFAULT);
				return;
			case GithubPackage.OWNER__ORGANIZATIONS_URL:
				setOrganizations_url(ORGANIZATIONS_URL_EDEFAULT);
				return;
			case GithubPackage.OWNER__REPOS_URL:
				setRepos_url(REPOS_URL_EDEFAULT);
				return;
			case GithubPackage.OWNER__EVENTS_URL:
				setEvents_url(EVENTS_URL_EDEFAULT);
				return;
			case GithubPackage.OWNER__RECEIVED_EVENTS_URL:
				setReceived_events_url(RECEIVED_EVENTS_URL_EDEFAULT);
				return;
			case GithubPackage.OWNER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GithubPackage.OWNER__SITE_ADMIN:
				setSite_admin(SITE_ADMIN_EDEFAULT);
				return;
			case GithubPackage.OWNER__USER_VIEW_TYPE:
				setUser_view_type(USER_VIEW_TYPE_EDEFAULT);
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
			case GithubPackage.OWNER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GithubPackage.OWNER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case GithubPackage.OWNER__LOGIN:
				return LOGIN_EDEFAULT == null ? login != null : !LOGIN_EDEFAULT.equals(login);
			case GithubPackage.OWNER__ID:
				return id != ID_EDEFAULT;
			case GithubPackage.OWNER__NODE_ID:
				return NODE_ID_EDEFAULT == null ? node_id != null : !NODE_ID_EDEFAULT.equals(node_id);
			case GithubPackage.OWNER__AVATAR_URL:
				return AVATAR_URL_EDEFAULT == null ? avatar_url != null : !AVATAR_URL_EDEFAULT.equals(avatar_url);
			case GithubPackage.OWNER__GRAVATAR_ID:
				return GRAVATAR_ID_EDEFAULT == null ? gravatar_id != null : !GRAVATAR_ID_EDEFAULT.equals(gravatar_id);
			case GithubPackage.OWNER__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case GithubPackage.OWNER__HTML_URL:
				return HTML_URL_EDEFAULT == null ? html_url != null : !HTML_URL_EDEFAULT.equals(html_url);
			case GithubPackage.OWNER__FOLLOWERS_URL:
				return FOLLOWERS_URL_EDEFAULT == null ? followers_url != null : !FOLLOWERS_URL_EDEFAULT.equals(followers_url);
			case GithubPackage.OWNER__FOLLOWING_URL:
				return FOLLOWING_URL_EDEFAULT == null ? following_url != null : !FOLLOWING_URL_EDEFAULT.equals(following_url);
			case GithubPackage.OWNER__GISTS_URL:
				return GISTS_URL_EDEFAULT == null ? gists_url != null : !GISTS_URL_EDEFAULT.equals(gists_url);
			case GithubPackage.OWNER__STARRED_URL:
				return STARRED_URL_EDEFAULT == null ? starred_url != null : !STARRED_URL_EDEFAULT.equals(starred_url);
			case GithubPackage.OWNER__SUBSCRIPTIONS_URL:
				return SUBSCRIPTIONS_URL_EDEFAULT == null ? subscriptions_url != null : !SUBSCRIPTIONS_URL_EDEFAULT.equals(subscriptions_url);
			case GithubPackage.OWNER__ORGANIZATIONS_URL:
				return ORGANIZATIONS_URL_EDEFAULT == null ? organizations_url != null : !ORGANIZATIONS_URL_EDEFAULT.equals(organizations_url);
			case GithubPackage.OWNER__REPOS_URL:
				return REPOS_URL_EDEFAULT == null ? repos_url != null : !REPOS_URL_EDEFAULT.equals(repos_url);
			case GithubPackage.OWNER__EVENTS_URL:
				return EVENTS_URL_EDEFAULT == null ? events_url != null : !EVENTS_URL_EDEFAULT.equals(events_url);
			case GithubPackage.OWNER__RECEIVED_EVENTS_URL:
				return RECEIVED_EVENTS_URL_EDEFAULT == null ? received_events_url != null : !RECEIVED_EVENTS_URL_EDEFAULT.equals(received_events_url);
			case GithubPackage.OWNER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case GithubPackage.OWNER__SITE_ADMIN:
				return site_admin != SITE_ADMIN_EDEFAULT;
			case GithubPackage.OWNER__USER_VIEW_TYPE:
				return USER_VIEW_TYPE_EDEFAULT == null ? user_view_type != null : !USER_VIEW_TYPE_EDEFAULT.equals(user_view_type);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", email: ");
		result.append(email);
		result.append(", login: ");
		result.append(login);
		result.append(", id: ");
		result.append(id);
		result.append(", node_id: ");
		result.append(node_id);
		result.append(", avatar_url: ");
		result.append(avatar_url);
		result.append(", gravatar_id: ");
		result.append(gravatar_id);
		result.append(", url: ");
		result.append(url);
		result.append(", html_url: ");
		result.append(html_url);
		result.append(", followers_url: ");
		result.append(followers_url);
		result.append(", following_url: ");
		result.append(following_url);
		result.append(", gists_url: ");
		result.append(gists_url);
		result.append(", starred_url: ");
		result.append(starred_url);
		result.append(", subscriptions_url: ");
		result.append(subscriptions_url);
		result.append(", organizations_url: ");
		result.append(organizations_url);
		result.append(", repos_url: ");
		result.append(repos_url);
		result.append(", events_url: ");
		result.append(events_url);
		result.append(", received_events_url: ");
		result.append(received_events_url);
		result.append(", type: ");
		result.append(type);
		result.append(", site_admin: ");
		result.append(site_admin);
		result.append(", user_view_type: ");
		result.append(user_view_type);
		result.append(')');
		return result.toString();
	}

} //OwnerImpl
