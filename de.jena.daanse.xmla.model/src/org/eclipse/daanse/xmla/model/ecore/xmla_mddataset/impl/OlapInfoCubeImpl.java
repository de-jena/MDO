/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Olap Info Cube</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoCubeImpl#getCubeName <em>Cube Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoCubeImpl#getLastDataUpdate <em>Last Data Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoCubeImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OlapInfoCubeImpl extends MinimalEObjectImpl.Container implements OlapInfoCube {
	/**
	 * The default value of the '{@link #getCubeName() <em>Cube Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeName()
	 * @generated
	 * @ordered
	 */
	protected static final String CUBE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCubeName() <em>Cube Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeName()
	 * @generated
	 * @ordered
	 */
	protected String cubeName = CUBE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastDataUpdate() <em>Last Data Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDataUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_DATA_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastDataUpdate() <em>Last Data Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastDataUpdate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastDataUpdate = LAST_DATA_UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastSchemaUpdate() <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSchemaUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_SCHEMA_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastSchemaUpdate() <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSchemaUpdate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastSchemaUpdate = LAST_SCHEMA_UPDATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OlapInfoCubeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_mddatasetPackage.Literals.OLAP_INFO_CUBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCubeName() {
		return cubeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubeName(String newCubeName) {
		String oldCubeName = cubeName;
		cubeName = newCubeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.OLAP_INFO_CUBE__CUBE_NAME, oldCubeName, cubeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastDataUpdate() {
		return lastDataUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastDataUpdate(XMLGregorianCalendar newLastDataUpdate) {
		XMLGregorianCalendar oldLastDataUpdate = lastDataUpdate;
		lastDataUpdate = newLastDataUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.OLAP_INFO_CUBE__LAST_DATA_UPDATE, oldLastDataUpdate, lastDataUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastSchemaUpdate() {
		return lastSchemaUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSchemaUpdate(XMLGregorianCalendar newLastSchemaUpdate) {
		XMLGregorianCalendar oldLastSchemaUpdate = lastSchemaUpdate;
		lastSchemaUpdate = newLastSchemaUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.OLAP_INFO_CUBE__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE__CUBE_NAME:
				return getCubeName();
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE__LAST_DATA_UPDATE:
				return getLastDataUpdate();
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
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
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE__CUBE_NAME:
				setCubeName((String)newValue);
				return;
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE__LAST_DATA_UPDATE:
				setLastDataUpdate((XMLGregorianCalendar)newValue);
				return;
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
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
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE__CUBE_NAME:
				setCubeName(CUBE_NAME_EDEFAULT);
				return;
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE__LAST_DATA_UPDATE:
				setLastDataUpdate(LAST_DATA_UPDATE_EDEFAULT);
				return;
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
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
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE__CUBE_NAME:
				return CUBE_NAME_EDEFAULT == null ? cubeName != null : !CUBE_NAME_EDEFAULT.equals(cubeName);
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE__LAST_DATA_UPDATE:
				return LAST_DATA_UPDATE_EDEFAULT == null ? lastDataUpdate != null : !LAST_DATA_UPDATE_EDEFAULT.equals(lastDataUpdate);
			case Xmla_mddatasetPackage.OLAP_INFO_CUBE__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
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
		result.append(" (cubeName: ");
		result.append(cubeName);
		result.append(", lastDataUpdate: ");
		result.append(lastDataUpdate);
		result.append(", lastSchemaUpdate: ");
		result.append(lastSchemaUpdate);
		result.append(')');
		return result.toString();
	}

} //OlapInfoCubeImpl
