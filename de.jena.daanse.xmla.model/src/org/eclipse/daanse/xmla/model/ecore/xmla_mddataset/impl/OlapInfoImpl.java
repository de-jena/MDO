/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxesInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CubeInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Olap Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoImpl#getCubeInfo <em>Cube Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoImpl#getAxesInfo <em>Axes Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoImpl#getCellInfo <em>Cell Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OlapInfoImpl extends MinimalEObjectImpl.Container implements OlapInfo {
	/**
	 * The cached value of the '{@link #getCubeInfo() <em>Cube Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeInfo()
	 * @generated
	 * @ordered
	 */
	protected CubeInfo cubeInfo;

	/**
	 * The cached value of the '{@link #getAxesInfo() <em>Axes Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxesInfo()
	 * @generated
	 * @ordered
	 */
	protected AxesInfo axesInfo;

	/**
	 * The cached value of the '{@link #getCellInfo() <em>Cell Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellInfo()
	 * @generated
	 * @ordered
	 */
	protected CellInfo cellInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OlapInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_mddatasetPackage.Literals.OLAP_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CubeInfo getCubeInfo() {
		return cubeInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCubeInfo(CubeInfo newCubeInfo, NotificationChain msgs) {
		CubeInfo oldCubeInfo = cubeInfo;
		cubeInfo = newCubeInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.OLAP_INFO__CUBE_INFO, oldCubeInfo, newCubeInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubeInfo(CubeInfo newCubeInfo) {
		if (newCubeInfo != cubeInfo) {
			NotificationChain msgs = null;
			if (cubeInfo != null)
				msgs = ((InternalEObject)cubeInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.OLAP_INFO__CUBE_INFO, null, msgs);
			if (newCubeInfo != null)
				msgs = ((InternalEObject)newCubeInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.OLAP_INFO__CUBE_INFO, null, msgs);
			msgs = basicSetCubeInfo(newCubeInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.OLAP_INFO__CUBE_INFO, newCubeInfo, newCubeInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxesInfo getAxesInfo() {
		return axesInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAxesInfo(AxesInfo newAxesInfo, NotificationChain msgs) {
		AxesInfo oldAxesInfo = axesInfo;
		axesInfo = newAxesInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.OLAP_INFO__AXES_INFO, oldAxesInfo, newAxesInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxesInfo(AxesInfo newAxesInfo) {
		if (newAxesInfo != axesInfo) {
			NotificationChain msgs = null;
			if (axesInfo != null)
				msgs = ((InternalEObject)axesInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.OLAP_INFO__AXES_INFO, null, msgs);
			if (newAxesInfo != null)
				msgs = ((InternalEObject)newAxesInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.OLAP_INFO__AXES_INFO, null, msgs);
			msgs = basicSetAxesInfo(newAxesInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.OLAP_INFO__AXES_INFO, newAxesInfo, newAxesInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellInfo getCellInfo() {
		return cellInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellInfo(CellInfo newCellInfo, NotificationChain msgs) {
		CellInfo oldCellInfo = cellInfo;
		cellInfo = newCellInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.OLAP_INFO__CELL_INFO, oldCellInfo, newCellInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellInfo(CellInfo newCellInfo) {
		if (newCellInfo != cellInfo) {
			NotificationChain msgs = null;
			if (cellInfo != null)
				msgs = ((InternalEObject)cellInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.OLAP_INFO__CELL_INFO, null, msgs);
			if (newCellInfo != null)
				msgs = ((InternalEObject)newCellInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.OLAP_INFO__CELL_INFO, null, msgs);
			msgs = basicSetCellInfo(newCellInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.OLAP_INFO__CELL_INFO, newCellInfo, newCellInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_mddatasetPackage.OLAP_INFO__CUBE_INFO:
				return basicSetCubeInfo(null, msgs);
			case Xmla_mddatasetPackage.OLAP_INFO__AXES_INFO:
				return basicSetAxesInfo(null, msgs);
			case Xmla_mddatasetPackage.OLAP_INFO__CELL_INFO:
				return basicSetCellInfo(null, msgs);
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
			case Xmla_mddatasetPackage.OLAP_INFO__CUBE_INFO:
				return getCubeInfo();
			case Xmla_mddatasetPackage.OLAP_INFO__AXES_INFO:
				return getAxesInfo();
			case Xmla_mddatasetPackage.OLAP_INFO__CELL_INFO:
				return getCellInfo();
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
			case Xmla_mddatasetPackage.OLAP_INFO__CUBE_INFO:
				setCubeInfo((CubeInfo)newValue);
				return;
			case Xmla_mddatasetPackage.OLAP_INFO__AXES_INFO:
				setAxesInfo((AxesInfo)newValue);
				return;
			case Xmla_mddatasetPackage.OLAP_INFO__CELL_INFO:
				setCellInfo((CellInfo)newValue);
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
			case Xmla_mddatasetPackage.OLAP_INFO__CUBE_INFO:
				setCubeInfo((CubeInfo)null);
				return;
			case Xmla_mddatasetPackage.OLAP_INFO__AXES_INFO:
				setAxesInfo((AxesInfo)null);
				return;
			case Xmla_mddatasetPackage.OLAP_INFO__CELL_INFO:
				setCellInfo((CellInfo)null);
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
			case Xmla_mddatasetPackage.OLAP_INFO__CUBE_INFO:
				return cubeInfo != null;
			case Xmla_mddatasetPackage.OLAP_INFO__AXES_INFO:
				return axesInfo != null;
			case Xmla_mddatasetPackage.OLAP_INFO__CELL_INFO:
				return cellInfo != null;
		}
		return super.eIsSet(featureID);
	}

} //OlapInfoImpl
