/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.Drop;
import org.eclipse.daanse.xmla.model.ecore.xmla.Where;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DropImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DropImpl#isDeleteWithDescendants <em>Delete With Descendants</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DropImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DropImpl extends MinimalEObjectImpl.Container implements Drop {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.daanse.xmla.model.ecore.xmla.Object object;

	/**
	 * The default value of the '{@link #isDeleteWithDescendants() <em>Delete With Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteWithDescendants()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_WITH_DESCENDANTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeleteWithDescendants() <em>Delete With Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeleteWithDescendants()
	 * @generated
	 * @ordered
	 */
	protected boolean deleteWithDescendants = DELETE_WITH_DESCENDANTS_EDEFAULT;

	/**
	 * This is true if the Delete With Descendants attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deleteWithDescendantsESet;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected Where where;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DropImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DROP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.daanse.xmla.model.ecore.xmla.Object getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(org.eclipse.daanse.xmla.model.ecore.xmla.Object newObject, NotificationChain msgs) {
		org.eclipse.daanse.xmla.model.ecore.xmla.Object oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DROP__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(org.eclipse.daanse.xmla.model.ecore.xmla.Object newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DROP__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DROP__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DROP__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeleteWithDescendants() {
		return deleteWithDescendants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteWithDescendants(boolean newDeleteWithDescendants) {
		boolean oldDeleteWithDescendants = deleteWithDescendants;
		deleteWithDescendants = newDeleteWithDescendants;
		boolean oldDeleteWithDescendantsESet = deleteWithDescendantsESet;
		deleteWithDescendantsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DROP__DELETE_WITH_DESCENDANTS, oldDeleteWithDescendants, deleteWithDescendants, !oldDeleteWithDescendantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeleteWithDescendants() {
		boolean oldDeleteWithDescendants = deleteWithDescendants;
		boolean oldDeleteWithDescendantsESet = deleteWithDescendantsESet;
		deleteWithDescendants = DELETE_WITH_DESCENDANTS_EDEFAULT;
		deleteWithDescendantsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DROP__DELETE_WITH_DESCENDANTS, oldDeleteWithDescendants, DELETE_WITH_DESCENDANTS_EDEFAULT, oldDeleteWithDescendantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeleteWithDescendants() {
		return deleteWithDescendantsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Where newWhere, NotificationChain msgs) {
		Where oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DROP__WHERE, oldWhere, newWhere);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhere(Where newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DROP__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DROP__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DROP__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DROP__OBJECT:
				return basicSetObject(null, msgs);
			case XmlaPackage.DROP__WHERE:
				return basicSetWhere(null, msgs);
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
			case XmlaPackage.DROP__OBJECT:
				return getObject();
			case XmlaPackage.DROP__DELETE_WITH_DESCENDANTS:
				return isDeleteWithDescendants();
			case XmlaPackage.DROP__WHERE:
				return getWhere();
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
			case XmlaPackage.DROP__OBJECT:
				setObject((org.eclipse.daanse.xmla.model.ecore.xmla.Object)newValue);
				return;
			case XmlaPackage.DROP__DELETE_WITH_DESCENDANTS:
				setDeleteWithDescendants((Boolean)newValue);
				return;
			case XmlaPackage.DROP__WHERE:
				setWhere((Where)newValue);
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
			case XmlaPackage.DROP__OBJECT:
				setObject((org.eclipse.daanse.xmla.model.ecore.xmla.Object)null);
				return;
			case XmlaPackage.DROP__DELETE_WITH_DESCENDANTS:
				unsetDeleteWithDescendants();
				return;
			case XmlaPackage.DROP__WHERE:
				setWhere((Where)null);
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
			case XmlaPackage.DROP__OBJECT:
				return object != null;
			case XmlaPackage.DROP__DELETE_WITH_DESCENDANTS:
				return isSetDeleteWithDescendants();
			case XmlaPackage.DROP__WHERE:
				return where != null;
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
		result.append(" (deleteWithDescendants: ");
		if (deleteWithDescendantsESet) result.append(deleteWithDescendants); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DropImpl
