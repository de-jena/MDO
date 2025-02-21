/*
 */
package de.jena.mdo.github.webhook.model.githubWebhook.impl;

import de.jena.mdo.github.webhook.model.githubWebhook.Author;
import de.jena.mdo.github.webhook.model.githubWebhook.Commit;
import de.jena.mdo.github.webhook.model.githubWebhook.Committer;
import de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl#getTree_id <em>Tree id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl#isDistinct <em>Distinct</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl#getCommitter <em>Committer</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl#getAdded <em>Added</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.CommitImpl#getRemoved <em>Removed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommitImpl extends MinimalEObjectImpl.Container implements Commit {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTree_id() <em>Tree id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTree_id()
	 * @generated
	 * @ordered
	 */
	protected static final String TREE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTree_id() <em>Tree id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTree_id()
	 * @generated
	 * @ordered
	 */
	protected String tree_id = TREE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISTINCT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDistinct() <em>Distinct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinct()
	 * @generated
	 * @ordered
	 */
	protected boolean distinct = DISTINCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected String timestamp = TIMESTAMP_EDEFAULT;

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
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Author author;

	/**
	 * The cached value of the '{@link #getCommitter() <em>Committer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitter()
	 * @generated
	 * @ordered
	 */
	protected Committer committer;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected EList<String> modified;

	/**
	 * The cached value of the '{@link #getAdded() <em>Added</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdded()
	 * @generated
	 * @ordered
	 */
	protected EList<String> added;

	/**
	 * The cached value of the '{@link #getRemoved() <em>Removed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoved()
	 * @generated
	 * @ordered
	 */
	protected EList<String> removed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.COMMIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTree_id() {
		return tree_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTree_id(String newTree_id) {
		String oldTree_id = tree_id;
		tree_id = newTree_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__TREE_ID, oldTree_id, tree_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistinct(boolean newDistinct) {
		boolean oldDistinct = distinct;
		distinct = newDistinct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__DISTINCT, oldDistinct, distinct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(String newTimestamp) {
		String oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__TIMESTAMP, oldTimestamp, timestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Author getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(Author newAuthor, NotificationChain msgs) {
		Author oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__AUTHOR, oldAuthor, newAuthor);
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
	public void setAuthor(Author newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubPackage.COMMIT__AUTHOR, null, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubPackage.COMMIT__AUTHOR, null, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Committer getCommitter() {
		return committer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommitter(Committer newCommitter, NotificationChain msgs) {
		Committer oldCommitter = committer;
		committer = newCommitter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__COMMITTER, oldCommitter, newCommitter);
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
	public void setCommitter(Committer newCommitter) {
		if (newCommitter != committer) {
			NotificationChain msgs = null;
			if (committer != null)
				msgs = ((InternalEObject)committer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubPackage.COMMIT__COMMITTER, null, msgs);
			if (newCommitter != null)
				msgs = ((InternalEObject)newCommitter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubPackage.COMMIT__COMMITTER, null, msgs);
			msgs = basicSetCommitter(newCommitter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.COMMIT__COMMITTER, newCommitter, newCommitter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getModified() {
		if (modified == null) {
			modified = new EDataTypeUniqueEList<String>(String.class, this, GithubPackage.COMMIT__MODIFIED);
		}
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAdded() {
		if (added == null) {
			added = new EDataTypeUniqueEList<String>(String.class, this, GithubPackage.COMMIT__ADDED);
		}
		return added;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRemoved() {
		if (removed == null) {
			removed = new EDataTypeUniqueEList<String>(String.class, this, GithubPackage.COMMIT__REMOVED);
		}
		return removed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubPackage.COMMIT__AUTHOR:
				return basicSetAuthor(null, msgs);
			case GithubPackage.COMMIT__COMMITTER:
				return basicSetCommitter(null, msgs);
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
			case GithubPackage.COMMIT__ID:
				return getId();
			case GithubPackage.COMMIT__TREE_ID:
				return getTree_id();
			case GithubPackage.COMMIT__DISTINCT:
				return isDistinct();
			case GithubPackage.COMMIT__MESSAGE:
				return getMessage();
			case GithubPackage.COMMIT__TIMESTAMP:
				return getTimestamp();
			case GithubPackage.COMMIT__URL:
				return getUrl();
			case GithubPackage.COMMIT__AUTHOR:
				return getAuthor();
			case GithubPackage.COMMIT__COMMITTER:
				return getCommitter();
			case GithubPackage.COMMIT__MODIFIED:
				return getModified();
			case GithubPackage.COMMIT__ADDED:
				return getAdded();
			case GithubPackage.COMMIT__REMOVED:
				return getRemoved();
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
			case GithubPackage.COMMIT__ID:
				setId((String)newValue);
				return;
			case GithubPackage.COMMIT__TREE_ID:
				setTree_id((String)newValue);
				return;
			case GithubPackage.COMMIT__DISTINCT:
				setDistinct((Boolean)newValue);
				return;
			case GithubPackage.COMMIT__MESSAGE:
				setMessage((String)newValue);
				return;
			case GithubPackage.COMMIT__TIMESTAMP:
				setTimestamp((String)newValue);
				return;
			case GithubPackage.COMMIT__URL:
				setUrl((String)newValue);
				return;
			case GithubPackage.COMMIT__AUTHOR:
				setAuthor((Author)newValue);
				return;
			case GithubPackage.COMMIT__COMMITTER:
				setCommitter((Committer)newValue);
				return;
			case GithubPackage.COMMIT__MODIFIED:
				getModified().clear();
				getModified().addAll((Collection<? extends String>)newValue);
				return;
			case GithubPackage.COMMIT__ADDED:
				getAdded().clear();
				getAdded().addAll((Collection<? extends String>)newValue);
				return;
			case GithubPackage.COMMIT__REMOVED:
				getRemoved().clear();
				getRemoved().addAll((Collection<? extends String>)newValue);
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
			case GithubPackage.COMMIT__ID:
				setId(ID_EDEFAULT);
				return;
			case GithubPackage.COMMIT__TREE_ID:
				setTree_id(TREE_ID_EDEFAULT);
				return;
			case GithubPackage.COMMIT__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case GithubPackage.COMMIT__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case GithubPackage.COMMIT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case GithubPackage.COMMIT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GithubPackage.COMMIT__AUTHOR:
				setAuthor((Author)null);
				return;
			case GithubPackage.COMMIT__COMMITTER:
				setCommitter((Committer)null);
				return;
			case GithubPackage.COMMIT__MODIFIED:
				getModified().clear();
				return;
			case GithubPackage.COMMIT__ADDED:
				getAdded().clear();
				return;
			case GithubPackage.COMMIT__REMOVED:
				getRemoved().clear();
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
			case GithubPackage.COMMIT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GithubPackage.COMMIT__TREE_ID:
				return TREE_ID_EDEFAULT == null ? tree_id != null : !TREE_ID_EDEFAULT.equals(tree_id);
			case GithubPackage.COMMIT__DISTINCT:
				return distinct != DISTINCT_EDEFAULT;
			case GithubPackage.COMMIT__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case GithubPackage.COMMIT__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
			case GithubPackage.COMMIT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case GithubPackage.COMMIT__AUTHOR:
				return author != null;
			case GithubPackage.COMMIT__COMMITTER:
				return committer != null;
			case GithubPackage.COMMIT__MODIFIED:
				return modified != null && !modified.isEmpty();
			case GithubPackage.COMMIT__ADDED:
				return added != null && !added.isEmpty();
			case GithubPackage.COMMIT__REMOVED:
				return removed != null && !removed.isEmpty();
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
		result.append(", tree_id: ");
		result.append(tree_id);
		result.append(", distinct: ");
		result.append(distinct);
		result.append(", message: ");
		result.append(message);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(", url: ");
		result.append(url);
		result.append(", modified: ");
		result.append(modified);
		result.append(", added: ");
		result.append(added);
		result.append(", removed: ");
		result.append(removed);
		result.append(')');
		return result.toString();
	}

} //CommitImpl
