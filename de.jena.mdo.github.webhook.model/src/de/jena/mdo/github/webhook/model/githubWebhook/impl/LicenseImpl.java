/*
 */
package de.jena.mdo.github.webhook.model.githubWebhook.impl;

import de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage;
import de.jena.mdo.github.webhook.model.githubWebhook.License;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>License</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.LicenseImpl#getKey <em>Key</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.LicenseImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.LicenseImpl#getSpdx_id <em>Spdx id</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.LicenseImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.jena.mdo.github.webhook.model.githubWebhook.impl.LicenseImpl#getNode_id <em>Node id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LicenseImpl extends MinimalEObjectImpl.Container implements License {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

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
	 * The default value of the '{@link #getSpdx_id() <em>Spdx id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpdx_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SPDX_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpdx_id() <em>Spdx id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpdx_id()
	 * @generated
	 * @ordered
	 */
	protected String spdx_id = SPDX_ID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LicenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubPackage.Literals.LICENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.LICENSE__KEY, oldKey, key));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.LICENSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpdx_id() {
		return spdx_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpdx_id(String newSpdx_id) {
		String oldSpdx_id = spdx_id;
		spdx_id = newSpdx_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.LICENSE__SPDX_ID, oldSpdx_id, spdx_id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.LICENSE__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubPackage.LICENSE__NODE_ID, oldNode_id, node_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubPackage.LICENSE__KEY:
				return getKey();
			case GithubPackage.LICENSE__NAME:
				return getName();
			case GithubPackage.LICENSE__SPDX_ID:
				return getSpdx_id();
			case GithubPackage.LICENSE__URL:
				return getUrl();
			case GithubPackage.LICENSE__NODE_ID:
				return getNode_id();
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
			case GithubPackage.LICENSE__KEY:
				setKey((String)newValue);
				return;
			case GithubPackage.LICENSE__NAME:
				setName((String)newValue);
				return;
			case GithubPackage.LICENSE__SPDX_ID:
				setSpdx_id((String)newValue);
				return;
			case GithubPackage.LICENSE__URL:
				setUrl((String)newValue);
				return;
			case GithubPackage.LICENSE__NODE_ID:
				setNode_id((String)newValue);
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
			case GithubPackage.LICENSE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case GithubPackage.LICENSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GithubPackage.LICENSE__SPDX_ID:
				setSpdx_id(SPDX_ID_EDEFAULT);
				return;
			case GithubPackage.LICENSE__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GithubPackage.LICENSE__NODE_ID:
				setNode_id(NODE_ID_EDEFAULT);
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
			case GithubPackage.LICENSE__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case GithubPackage.LICENSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GithubPackage.LICENSE__SPDX_ID:
				return SPDX_ID_EDEFAULT == null ? spdx_id != null : !SPDX_ID_EDEFAULT.equals(spdx_id);
			case GithubPackage.LICENSE__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case GithubPackage.LICENSE__NODE_ID:
				return NODE_ID_EDEFAULT == null ? node_id != null : !NODE_ID_EDEFAULT.equals(node_id);
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
		result.append(" (key: ");
		result.append(key);
		result.append(", name: ");
		result.append(name);
		result.append(", spdx_id: ");
		result.append(spdx_id);
		result.append(", url: ");
		result.append(url);
		result.append(", node_id: ");
		result.append(node_id);
		result.append(')');
		return result.toString();
	}

} //LicenseImpl
