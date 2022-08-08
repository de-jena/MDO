/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellData;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellSetType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellType;
import org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetPackage;

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
 * An implementation of the model object '<em><b>Cell Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellDataImpl#getCell <em>Cell</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellDataImpl#getCellSet <em>Cell Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellDataImpl extends MinimalEObjectImpl.Container implements CellData {
	/**
	 * The cached value of the '{@link #getCell() <em>Cell</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCell()
	 * @generated
	 * @ordered
	 */
	protected EList<CellType> cell;

	/**
	 * The cached value of the '{@link #getCellSet() <em>Cell Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellSet()
	 * @generated
	 * @ordered
	 */
	protected CellSetType cellSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_mddatasetPackage.Literals.CELL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CellType> getCell() {
		if (cell == null) {
			cell = new EObjectContainmentEList<CellType>(CellType.class, this, Xmla_mddatasetPackage.CELL_DATA__CELL);
		}
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CellSetType getCellSet() {
		return cellSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCellSet(CellSetType newCellSet, NotificationChain msgs) {
		CellSetType oldCellSet = cellSet;
		cellSet = newCellSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.CELL_DATA__CELL_SET, oldCellSet, newCellSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCellSet(CellSetType newCellSet) {
		if (newCellSet != cellSet) {
			NotificationChain msgs = null;
			if (cellSet != null)
				msgs = ((InternalEObject)cellSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.CELL_DATA__CELL_SET, null, msgs);
			if (newCellSet != null)
				msgs = ((InternalEObject)newCellSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_mddatasetPackage.CELL_DATA__CELL_SET, null, msgs);
			msgs = basicSetCellSet(newCellSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_mddatasetPackage.CELL_DATA__CELL_SET, newCellSet, newCellSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_mddatasetPackage.CELL_DATA__CELL:
				return ((InternalEList<?>)getCell()).basicRemove(otherEnd, msgs);
			case Xmla_mddatasetPackage.CELL_DATA__CELL_SET:
				return basicSetCellSet(null, msgs);
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
			case Xmla_mddatasetPackage.CELL_DATA__CELL:
				return getCell();
			case Xmla_mddatasetPackage.CELL_DATA__CELL_SET:
				return getCellSet();
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
			case Xmla_mddatasetPackage.CELL_DATA__CELL:
				getCell().clear();
				getCell().addAll((Collection<? extends CellType>)newValue);
				return;
			case Xmla_mddatasetPackage.CELL_DATA__CELL_SET:
				setCellSet((CellSetType)newValue);
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
			case Xmla_mddatasetPackage.CELL_DATA__CELL:
				getCell().clear();
				return;
			case Xmla_mddatasetPackage.CELL_DATA__CELL_SET:
				setCellSet((CellSetType)null);
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
			case Xmla_mddatasetPackage.CELL_DATA__CELL:
				return cell != null && !cell.isEmpty();
			case Xmla_mddatasetPackage.CELL_DATA__CELL_SET:
				return cellSet != null;
		}
		return super.eIsSet(featureID);
	}

} //CellDataImpl
