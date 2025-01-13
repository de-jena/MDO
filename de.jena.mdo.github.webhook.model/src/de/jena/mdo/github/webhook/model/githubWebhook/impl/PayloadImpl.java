/*
 */
package de.jena.mdo.github.webhook.model.githubWebhook.impl;

import de.jena.mdo.github.webhook.model.githubWebhook.Commit;
import de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage;
import de.jena.mdo.github.webhook.model.githubWebhook.Installation;
import de.jena.mdo.github.webhook.model.githubWebhook.Payload;
import de.jena.mdo.github.webhook.model.githubWebhook.Pusher;
import de.jena.mdo.github.webhook.model.githubWebhook.Repository;
import de.jena.mdo.github.webhook.model.githubWebhook.Sender;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payload</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#getAfter <em>After</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#getPusher <em>Pusher</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#getInstallation <em>Installation</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#isCreated <em>Created</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#isDeleted <em>Deleted</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#isForced <em>Forced</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#getBase_ref <em>Base ref</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#getCompare <em>Compare</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#getCommits <em>Commits</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.PayloadImpl#getHead_commit <em>Head commit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PayloadImpl extends MinimalEObjectImpl.Container implements Payload {
	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getBefore() <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBefore() <em>Before</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBefore()
	 * @generated
	 * @ordered
	 */
	protected String before = BEFORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAfter() <em>After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected static final String AFTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAfter() <em>After</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected String after = AFTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository()
	 * @generated
	 * @ordered
	 */
	protected Repository repository;

	/**
	 * The cached value of the '{@link #getPusher() <em>Pusher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPusher()
	 * @generated
	 * @ordered
	 */
	protected Pusher pusher;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Sender sender;

	/**
	 * The cached value of the '{@link #getInstallation() <em>Installation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstallation()
	 * @generated
	 * @ordered
	 */
	protected Installation installation;

	/**
	 * The default value of the '{@link #isCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreated() <em>Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreated()
	 * @generated
	 * @ordered
	 */
	protected boolean created = CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeleted() <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeleted() <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleted()
	 * @generated
	 * @ordered
	 */
	protected boolean deleted = DELETED_EDEFAULT;

	/**
	 * The default value of the '{@link #isForced() <em>Forced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForced()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FORCED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForced() <em>Forced</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForced()
	 * @generated
	 * @ordered
	 */
	protected boolean forced = FORCED_EDEFAULT;

	/**
	 * The default value of the '{@link #getBase_ref() <em>Base ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ref()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase_ref() <em>Base ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ref()
	 * @generated
	 * @ordered
	 */
	protected String base_ref = BASE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompare() <em>Compare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompare() <em>Compare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompare()
	 * @generated
	 * @ordered
	 */
	protected String compare = COMPARE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommits() <em>Commits</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommits()
	 * @generated
	 * @ordered
	 */
	protected EList<Commit> commits;

	/**
	 * The cached value of the '{@link #getHead_commit() <em>Head commit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead_commit()
	 * @generated
	 * @ordered
	 */
	protected Commit head_commit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.PAYLOAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBefore() {
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBefore(String newBefore) {
		String oldBefore = before;
		before = newBefore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__BEFORE, oldBefore, before));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAfter() {
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAfter(String newAfter) {
		String oldAfter = after;
		after = newAfter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__AFTER, oldAfter, after));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository getRepository() {
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
		Repository oldRepository = repository;
		repository = newRepository;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__REPOSITORY, oldRepository, newRepository);
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
	public void setRepository(Repository newRepository) {
		if (newRepository != repository) {
			NotificationChain msgs = null;
			if (repository != null)
				msgs = ((InternalEObject)repository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubPackage.PAYLOAD__REPOSITORY, null, msgs);
			if (newRepository != null)
				msgs = ((InternalEObject)newRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubPackage.PAYLOAD__REPOSITORY, null, msgs);
			msgs = basicSetRepository(newRepository, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__REPOSITORY, newRepository, newRepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pusher getPusher() {
		return pusher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPusher(Pusher newPusher, NotificationChain msgs) {
		Pusher oldPusher = pusher;
		pusher = newPusher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__PUSHER, oldPusher, newPusher);
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
	public void setPusher(Pusher newPusher) {
		if (newPusher != pusher) {
			NotificationChain msgs = null;
			if (pusher != null)
				msgs = ((InternalEObject)pusher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubPackage.PAYLOAD__PUSHER, null, msgs);
			if (newPusher != null)
				msgs = ((InternalEObject)newPusher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubPackage.PAYLOAD__PUSHER, null, msgs);
			msgs = basicSetPusher(newPusher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__PUSHER, newPusher, newPusher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sender getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(Sender newSender, NotificationChain msgs) {
		Sender oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__SENDER, oldSender, newSender);
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
	public void setSender(Sender newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubPackage.PAYLOAD__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubPackage.PAYLOAD__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Installation getInstallation() {
		return installation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstallation(Installation newInstallation, NotificationChain msgs) {
		Installation oldInstallation = installation;
		installation = newInstallation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__INSTALLATION, oldInstallation, newInstallation);
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
	public void setInstallation(Installation newInstallation) {
		if (newInstallation != installation) {
			NotificationChain msgs = null;
			if (installation != null)
				msgs = ((InternalEObject)installation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubPackage.PAYLOAD__INSTALLATION, null, msgs);
			if (newInstallation != null)
				msgs = ((InternalEObject)newInstallation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubPackage.PAYLOAD__INSTALLATION, null, msgs);
			msgs = basicSetInstallation(newInstallation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__INSTALLATION, newInstallation, newInstallation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreated(boolean newCreated) {
		boolean oldCreated = created;
		created = newCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__CREATED, oldCreated, created));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeleted() {
		return deleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeleted(boolean newDeleted) {
		boolean oldDeleted = deleted;
		deleted = newDeleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__DELETED, oldDeleted, deleted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isForced() {
		return forced;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForced(boolean newForced) {
		boolean oldForced = forced;
		forced = newForced;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__FORCED, oldForced, forced));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBase_ref() {
		return base_ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_ref(String newBase_ref) {
		String oldBase_ref = base_ref;
		base_ref = newBase_ref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__BASE_REF, oldBase_ref, base_ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompare() {
		return compare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompare(String newCompare) {
		String oldCompare = compare;
		compare = newCompare;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__COMPARE, oldCompare, compare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Commit> getCommits() {
		if (commits == null) {
			commits = new EObjectContainmentEList<Commit>(Commit.class, this, GithubPackage.PAYLOAD__COMMITS);
		}
		return commits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Commit getHead_commit() {
		return head_commit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead_commit(Commit newHead_commit, NotificationChain msgs) {
		Commit oldHead_commit = head_commit;
		head_commit = newHead_commit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__HEAD_COMMIT, oldHead_commit, newHead_commit);
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
	public void setHead_commit(Commit newHead_commit) {
		if (newHead_commit != head_commit) {
			NotificationChain msgs = null;
			if (head_commit != null)
				msgs = ((InternalEObject)head_commit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubPackage.PAYLOAD__HEAD_COMMIT, null, msgs);
			if (newHead_commit != null)
				msgs = ((InternalEObject)newHead_commit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubPackage.PAYLOAD__HEAD_COMMIT, null, msgs);
			msgs = basicSetHead_commit(newHead_commit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.PAYLOAD__HEAD_COMMIT, newHead_commit, newHead_commit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.PAYLOAD__REPOSITORY:
				return basicSetRepository(null, msgs);
			case GithubPackage.PAYLOAD__PUSHER:
				return basicSetPusher(null, msgs);
			case GithubPackage.PAYLOAD__SENDER:
				return basicSetSender(null, msgs);
			case GithubPackage.PAYLOAD__INSTALLATION:
				return basicSetInstallation(null, msgs);
			case GithubPackage.PAYLOAD__COMMITS:
				return ((InternalEList<?>)getCommits()).basicRemove(otherEnd, msgs);
			case GithubPackage.PAYLOAD__HEAD_COMMIT:
				return basicSetHead_commit(null, msgs);
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
			case GithubPackage.PAYLOAD__REF:
				return getRef();
			case GithubPackage.PAYLOAD__BEFORE:
				return getBefore();
			case GithubPackage.PAYLOAD__AFTER:
				return getAfter();
			case GithubPackage.PAYLOAD__REPOSITORY:
				return getRepository();
			case GithubPackage.PAYLOAD__PUSHER:
				return getPusher();
			case GithubPackage.PAYLOAD__SENDER:
				return getSender();
			case GithubPackage.PAYLOAD__INSTALLATION:
				return getInstallation();
			case GithubPackage.PAYLOAD__CREATED:
				return isCreated();
			case GithubPackage.PAYLOAD__DELETED:
				return isDeleted();
			case GithubPackage.PAYLOAD__FORCED:
				return isForced();
			case GithubPackage.PAYLOAD__BASE_REF:
				return getBase_ref();
			case GithubPackage.PAYLOAD__COMPARE:
				return getCompare();
			case GithubPackage.PAYLOAD__COMMITS:
				return getCommits();
			case GithubPackage.PAYLOAD__HEAD_COMMIT:
				return getHead_commit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubPackage.PAYLOAD__REF:
				setRef((String)newValue);
				return;
			case GithubPackage.PAYLOAD__BEFORE:
				setBefore((String)newValue);
				return;
			case GithubPackage.PAYLOAD__AFTER:
				setAfter((String)newValue);
				return;
			case GithubPackage.PAYLOAD__REPOSITORY:
				setRepository((Repository)newValue);
				return;
			case GithubPackage.PAYLOAD__PUSHER:
				setPusher((Pusher)newValue);
				return;
			case GithubPackage.PAYLOAD__SENDER:
				setSender((Sender)newValue);
				return;
			case GithubPackage.PAYLOAD__INSTALLATION:
				setInstallation((Installation)newValue);
				return;
			case GithubPackage.PAYLOAD__CREATED:
				setCreated((Boolean)newValue);
				return;
			case GithubPackage.PAYLOAD__DELETED:
				setDeleted((Boolean)newValue);
				return;
			case GithubPackage.PAYLOAD__FORCED:
				setForced((Boolean)newValue);
				return;
			case GithubPackage.PAYLOAD__BASE_REF:
				setBase_ref((String)newValue);
				return;
			case GithubPackage.PAYLOAD__COMPARE:
				setCompare((String)newValue);
				return;
			case GithubPackage.PAYLOAD__COMMITS:
				getCommits().clear();
				getCommits().addAll((Collection<? extends Commit>)newValue);
				return;
			case GithubPackage.PAYLOAD__HEAD_COMMIT:
				setHead_commit((Commit)newValue);
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
			case GithubPackage.PAYLOAD__REF:
				setRef(REF_EDEFAULT);
				return;
			case GithubPackage.PAYLOAD__BEFORE:
				setBefore(BEFORE_EDEFAULT);
				return;
			case GithubPackage.PAYLOAD__AFTER:
				setAfter(AFTER_EDEFAULT);
				return;
			case GithubPackage.PAYLOAD__REPOSITORY:
				setRepository((Repository)null);
				return;
			case GithubPackage.PAYLOAD__PUSHER:
				setPusher((Pusher)null);
				return;
			case GithubPackage.PAYLOAD__SENDER:
				setSender((Sender)null);
				return;
			case GithubPackage.PAYLOAD__INSTALLATION:
				setInstallation((Installation)null);
				return;
			case GithubPackage.PAYLOAD__CREATED:
				setCreated(CREATED_EDEFAULT);
				return;
			case GithubPackage.PAYLOAD__DELETED:
				setDeleted(DELETED_EDEFAULT);
				return;
			case GithubPackage.PAYLOAD__FORCED:
				setForced(FORCED_EDEFAULT);
				return;
			case GithubPackage.PAYLOAD__BASE_REF:
				setBase_ref(BASE_REF_EDEFAULT);
				return;
			case GithubPackage.PAYLOAD__COMPARE:
				setCompare(COMPARE_EDEFAULT);
				return;
			case GithubPackage.PAYLOAD__COMMITS:
				getCommits().clear();
				return;
			case GithubPackage.PAYLOAD__HEAD_COMMIT:
				setHead_commit((Commit)null);
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
			case GithubPackage.PAYLOAD__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case GithubPackage.PAYLOAD__BEFORE:
				return BEFORE_EDEFAULT == null ? before != null : !BEFORE_EDEFAULT.equals(before);
			case GithubPackage.PAYLOAD__AFTER:
				return AFTER_EDEFAULT == null ? after != null : !AFTER_EDEFAULT.equals(after);
			case GithubPackage.PAYLOAD__REPOSITORY:
				return repository != null;
			case GithubPackage.PAYLOAD__PUSHER:
				return pusher != null;
			case GithubPackage.PAYLOAD__SENDER:
				return sender != null;
			case GithubPackage.PAYLOAD__INSTALLATION:
				return installation != null;
			case GithubPackage.PAYLOAD__CREATED:
				return created != CREATED_EDEFAULT;
			case GithubPackage.PAYLOAD__DELETED:
				return deleted != DELETED_EDEFAULT;
			case GithubPackage.PAYLOAD__FORCED:
				return forced != FORCED_EDEFAULT;
			case GithubPackage.PAYLOAD__BASE_REF:
				return BASE_REF_EDEFAULT == null ? base_ref != null : !BASE_REF_EDEFAULT.equals(base_ref);
			case GithubPackage.PAYLOAD__COMPARE:
				return COMPARE_EDEFAULT == null ? compare != null : !COMPARE_EDEFAULT.equals(compare);
			case GithubPackage.PAYLOAD__COMMITS:
				return commits != null && !commits.isEmpty();
			case GithubPackage.PAYLOAD__HEAD_COMMIT:
				return head_commit != null;
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
		result.append(" (ref: ");
		result.append(ref);
		result.append(", before: ");
		result.append(before);
		result.append(", after: ");
		result.append(after);
		result.append(", created: ");
		result.append(created);
		result.append(", deleted: ");
		result.append(deleted);
		result.append(", forced: ");
		result.append(forced);
		result.append(", base_ref: ");
		result.append(base_ref);
		result.append(", compare: ");
		result.append(compare);
		result.append(')');
		return result.toString();
	}

} //PayloadImpl
