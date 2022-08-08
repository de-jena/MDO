/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.xmla.EventColumn;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventColumnSubclassListType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventColumnImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventColumnImpl#getEventColumnSubclassList <em>Event Column Subclass List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventColumnImpl extends MinimalEObjectImpl.Container implements EventColumn {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected BigInteger iD = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEventColumnSubclassList() <em>Event Column Subclass List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventColumnSubclassList()
	 * @generated
	 * @ordered
	 */
	protected EventColumnSubclassListType eventColumnSubclassList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.EVENT_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(BigInteger newID) {
		BigInteger oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_COLUMN__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventColumnSubclassListType getEventColumnSubclassList() {
		return eventColumnSubclassList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventColumnSubclassList(EventColumnSubclassListType newEventColumnSubclassList, NotificationChain msgs) {
		EventColumnSubclassListType oldEventColumnSubclassList = eventColumnSubclassList;
		eventColumnSubclassList = newEventColumnSubclassList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_COLUMN__EVENT_COLUMN_SUBCLASS_LIST, oldEventColumnSubclassList, newEventColumnSubclassList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventColumnSubclassList(EventColumnSubclassListType newEventColumnSubclassList) {
		if (newEventColumnSubclassList != eventColumnSubclassList) {
			NotificationChain msgs = null;
			if (eventColumnSubclassList != null)
				msgs = ((InternalEObject)eventColumnSubclassList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.EVENT_COLUMN__EVENT_COLUMN_SUBCLASS_LIST, null, msgs);
			if (newEventColumnSubclassList != null)
				msgs = ((InternalEObject)newEventColumnSubclassList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.EVENT_COLUMN__EVENT_COLUMN_SUBCLASS_LIST, null, msgs);
			msgs = basicSetEventColumnSubclassList(newEventColumnSubclassList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_COLUMN__EVENT_COLUMN_SUBCLASS_LIST, newEventColumnSubclassList, newEventColumnSubclassList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.EVENT_COLUMN__EVENT_COLUMN_SUBCLASS_LIST:
				return basicSetEventColumnSubclassList(null, msgs);
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
			case XmlaPackage.EVENT_COLUMN__ID:
				return getID();
			case XmlaPackage.EVENT_COLUMN__EVENT_COLUMN_SUBCLASS_LIST:
				return getEventColumnSubclassList();
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
			case XmlaPackage.EVENT_COLUMN__ID:
				setID((BigInteger)newValue);
				return;
			case XmlaPackage.EVENT_COLUMN__EVENT_COLUMN_SUBCLASS_LIST:
				setEventColumnSubclassList((EventColumnSubclassListType)newValue);
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
			case XmlaPackage.EVENT_COLUMN__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.EVENT_COLUMN__EVENT_COLUMN_SUBCLASS_LIST:
				setEventColumnSubclassList((EventColumnSubclassListType)null);
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
			case XmlaPackage.EVENT_COLUMN__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.EVENT_COLUMN__EVENT_COLUMN_SUBCLASS_LIST:
				return eventColumnSubclassList != null;
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
		result.append(" (iD: ");
		result.append(iD);
		result.append(')');
		return result.toString();
	}

} //EventColumnImpl
