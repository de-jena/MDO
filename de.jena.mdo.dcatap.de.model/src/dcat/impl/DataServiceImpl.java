/*
 */
package dcat.impl;

import dcat.DataService;
import dcat.Dataset;
import dcat.DcatPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dcat.impl.DataServiceImpl#getEndpointDescription <em>Endpoint Description</em>}</li>
 *   <li>{@link dcat.impl.DataServiceImpl#getEndpointURL <em>Endpoint URL</em>}</li>
 *   <li>{@link dcat.impl.DataServiceImpl#getServesDataset <em>Serves Dataset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataServiceImpl extends DcatResourceImpl implements DataService {
	/**
	 * The cached value of the '{@link #getEndpointDescription() <em>Endpoint Description</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<String> endpointDescription;

	/**
	 * The cached value of the '{@link #getEndpointURL() <em>Endpoint URL</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointURL()
	 * @generated
	 * @ordered
	 */
	protected EList<String> endpointURL;

	/**
	 * The cached value of the '{@link #getServesDataset() <em>Serves Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServesDataset()
	 * @generated
	 * @ordered
	 */
	protected Dataset servesDataset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DcatPackage.Literals.DATA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEndpointDescription() {
		if (endpointDescription == null) {
			endpointDescription = new EDataTypeEList<String>(String.class, this, DcatPackage.DATA_SERVICE__ENDPOINT_DESCRIPTION);
		}
		return endpointDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEndpointURL() {
		if (endpointURL == null) {
			endpointURL = new EDataTypeEList<String>(String.class, this, DcatPackage.DATA_SERVICE__ENDPOINT_URL);
		}
		return endpointURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dataset getServesDataset() {
		return servesDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServesDataset(Dataset newServesDataset, NotificationChain msgs) {
		Dataset oldServesDataset = servesDataset;
		servesDataset = newServesDataset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DcatPackage.DATA_SERVICE__SERVES_DATASET, oldServesDataset, newServesDataset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServesDataset(Dataset newServesDataset) {
		if (newServesDataset != servesDataset) {
			NotificationChain msgs = null;
			if (servesDataset != null)
				msgs = ((InternalEObject)servesDataset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DATA_SERVICE__SERVES_DATASET, null, msgs);
			if (newServesDataset != null)
				msgs = ((InternalEObject)newServesDataset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DcatPackage.DATA_SERVICE__SERVES_DATASET, null, msgs);
			msgs = basicSetServesDataset(newServesDataset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DcatPackage.DATA_SERVICE__SERVES_DATASET, newServesDataset, newServesDataset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DcatPackage.DATA_SERVICE__SERVES_DATASET:
				return basicSetServesDataset(null, msgs);
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
			case DcatPackage.DATA_SERVICE__ENDPOINT_DESCRIPTION:
				return getEndpointDescription();
			case DcatPackage.DATA_SERVICE__ENDPOINT_URL:
				return getEndpointURL();
			case DcatPackage.DATA_SERVICE__SERVES_DATASET:
				return getServesDataset();
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
			case DcatPackage.DATA_SERVICE__ENDPOINT_DESCRIPTION:
				getEndpointDescription().clear();
				getEndpointDescription().addAll((Collection<? extends String>)newValue);
				return;
			case DcatPackage.DATA_SERVICE__ENDPOINT_URL:
				getEndpointURL().clear();
				getEndpointURL().addAll((Collection<? extends String>)newValue);
				return;
			case DcatPackage.DATA_SERVICE__SERVES_DATASET:
				setServesDataset((Dataset)newValue);
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
			case DcatPackage.DATA_SERVICE__ENDPOINT_DESCRIPTION:
				getEndpointDescription().clear();
				return;
			case DcatPackage.DATA_SERVICE__ENDPOINT_URL:
				getEndpointURL().clear();
				return;
			case DcatPackage.DATA_SERVICE__SERVES_DATASET:
				setServesDataset((Dataset)null);
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
			case DcatPackage.DATA_SERVICE__ENDPOINT_DESCRIPTION:
				return endpointDescription != null && !endpointDescription.isEmpty();
			case DcatPackage.DATA_SERVICE__ENDPOINT_URL:
				return endpointURL != null && !endpointURL.isEmpty();
			case DcatPackage.DATA_SERVICE__SERVES_DATASET:
				return servesDataset != null;
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
		result.append(" (endpointDescription: ");
		result.append(endpointDescription);
		result.append(", endpointURL: ");
		result.append(endpointURL);
		result.append(')');
		return result.toString();
	}

} //DataServiceImpl
