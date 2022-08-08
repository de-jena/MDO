/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.DataItem;
import org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Columns Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ForeignKeyColumnsTypeImpl#getForeignKeyColumn <em>Foreign Key Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyColumnsTypeImpl extends MinimalEObjectImpl.Container implements ForeignKeyColumnsType {
	/**
	 * The cached value of the '{@link #getForeignKeyColumn() <em>Foreign Key Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<DataItem> foreignKeyColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyColumnsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.FOREIGN_KEY_COLUMNS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataItem> getForeignKeyColumn() {
		if (foreignKeyColumn == null) {
			foreignKeyColumn = new EObjectContainmentEList<DataItem>(DataItem.class, this, XmlaPackage.FOREIGN_KEY_COLUMNS_TYPE__FOREIGN_KEY_COLUMN);
		}
		return foreignKeyColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.FOREIGN_KEY_COLUMNS_TYPE__FOREIGN_KEY_COLUMN:
				return ((InternalEList<?>)getForeignKeyColumn()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.FOREIGN_KEY_COLUMNS_TYPE__FOREIGN_KEY_COLUMN:
				return getForeignKeyColumn();
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
			case XmlaPackage.FOREIGN_KEY_COLUMNS_TYPE__FOREIGN_KEY_COLUMN:
				getForeignKeyColumn().clear();
				getForeignKeyColumn().addAll((Collection<? extends DataItem>)newValue);
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
			case XmlaPackage.FOREIGN_KEY_COLUMNS_TYPE__FOREIGN_KEY_COLUMN:
				getForeignKeyColumn().clear();
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
			case XmlaPackage.FOREIGN_KEY_COLUMNS_TYPE__FOREIGN_KEY_COLUMN:
				return foreignKeyColumn != null && !foreignKeyColumn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyColumnsTypeImpl
