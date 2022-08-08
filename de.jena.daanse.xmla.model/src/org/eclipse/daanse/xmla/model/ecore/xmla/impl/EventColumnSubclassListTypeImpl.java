/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnSubclassListType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnSubclassType;
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
 * An implementation of the model object '<em><b>Event Column Subclass List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventColumnSubclassListTypeImpl#getEventColumnSubclass <em>Event Column Subclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventColumnSubclassListTypeImpl extends MinimalEObjectImpl.Container implements EventColumnSubclassListType {
	/**
	 * The cached value of the '{@link #getEventColumnSubclass() <em>Event Column Subclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventColumnSubclass()
	 * @generated
	 * @ordered
	 */
	protected EList<EventColumnSubclassType> eventColumnSubclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventColumnSubclassListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.EVENT_COLUMN_SUBCLASS_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventColumnSubclassType> getEventColumnSubclass() {
		if (eventColumnSubclass == null) {
			eventColumnSubclass = new EObjectContainmentEList<EventColumnSubclassType>(EventColumnSubclassType.class, this, XmlaPackage.EVENT_COLUMN_SUBCLASS_LIST_TYPE__EVENT_COLUMN_SUBCLASS);
		}
		return eventColumnSubclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.EVENT_COLUMN_SUBCLASS_LIST_TYPE__EVENT_COLUMN_SUBCLASS:
				return ((InternalEList<?>)getEventColumnSubclass()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.EVENT_COLUMN_SUBCLASS_LIST_TYPE__EVENT_COLUMN_SUBCLASS:
				return getEventColumnSubclass();
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
			case XmlaPackage.EVENT_COLUMN_SUBCLASS_LIST_TYPE__EVENT_COLUMN_SUBCLASS:
				getEventColumnSubclass().clear();
				getEventColumnSubclass().addAll((Collection<? extends EventColumnSubclassType>)newValue);
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
			case XmlaPackage.EVENT_COLUMN_SUBCLASS_LIST_TYPE__EVENT_COLUMN_SUBCLASS:
				getEventColumnSubclass().clear();
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
			case XmlaPackage.EVENT_COLUMN_SUBCLASS_LIST_TYPE__EVENT_COLUMN_SUBCLASS:
				return eventColumnSubclass != null && !eventColumnSubclass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventColumnSubclassListTypeImpl
