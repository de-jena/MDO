/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.DataType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventCategoryType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataType1Impl#getEventCategory <em>Event Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataType1Impl extends MinimalEObjectImpl.Container implements DataType1 {
	/**
	 * The cached value of the '{@link #getEventCategory() <em>Event Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventCategory()
	 * @generated
	 * @ordered
	 */
	protected EventCategoryType eventCategory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DATA_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventCategoryType getEventCategory() {
		return eventCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventCategory(EventCategoryType newEventCategory, NotificationChain msgs) {
		EventCategoryType oldEventCategory = eventCategory;
		eventCategory = newEventCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_TYPE1__EVENT_CATEGORY, oldEventCategory, newEventCategory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventCategory(EventCategoryType newEventCategory) {
		if (newEventCategory != eventCategory) {
			NotificationChain msgs = null;
			if (eventCategory != null)
				msgs = ((InternalEObject)eventCategory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_TYPE1__EVENT_CATEGORY, null, msgs);
			if (newEventCategory != null)
				msgs = ((InternalEObject)newEventCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_TYPE1__EVENT_CATEGORY, null, msgs);
			msgs = basicSetEventCategory(newEventCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_TYPE1__EVENT_CATEGORY, newEventCategory, newEventCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DATA_TYPE1__EVENT_CATEGORY:
				return basicSetEventCategory(null, msgs);
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
			case XmlaPackage.DATA_TYPE1__EVENT_CATEGORY:
				return getEventCategory();
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
			case XmlaPackage.DATA_TYPE1__EVENT_CATEGORY:
				setEventCategory((EventCategoryType)newValue);
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
			case XmlaPackage.DATA_TYPE1__EVENT_CATEGORY:
				setEventCategory((EventCategoryType)null);
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
			case XmlaPackage.DATA_TYPE1__EVENT_CATEGORY:
				return eventCategory != null;
		}
		return super.eIsSet(featureID);
	}

} //DataType1Impl
