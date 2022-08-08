/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.EventColumn;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnListType;
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
 * An implementation of the model object '<em><b>Event Column List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventColumnListTypeImpl#getEventColumn <em>Event Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventColumnListTypeImpl extends MinimalEObjectImpl.Container implements EventColumnListType {
	/**
	 * The cached value of the '{@link #getEventColumn() <em>Event Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<EventColumn> eventColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventColumnListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.EVENT_COLUMN_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventColumn> getEventColumn() {
		if (eventColumn == null) {
			eventColumn = new EObjectContainmentEList<EventColumn>(EventColumn.class, this, XmlaPackage.EVENT_COLUMN_LIST_TYPE__EVENT_COLUMN);
		}
		return eventColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.EVENT_COLUMN_LIST_TYPE__EVENT_COLUMN:
				return ((InternalEList<?>)getEventColumn()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.EVENT_COLUMN_LIST_TYPE__EVENT_COLUMN:
				return getEventColumn();
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
			case XmlaPackage.EVENT_COLUMN_LIST_TYPE__EVENT_COLUMN:
				getEventColumn().clear();
				getEventColumn().addAll((Collection<? extends EventColumn>)newValue);
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
			case XmlaPackage.EVENT_COLUMN_LIST_TYPE__EVENT_COLUMN:
				getEventColumn().clear();
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
			case XmlaPackage.EVENT_COLUMN_LIST_TYPE__EVENT_COLUMN:
				return eventColumn != null && !eventColumn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventColumnListTypeImpl
