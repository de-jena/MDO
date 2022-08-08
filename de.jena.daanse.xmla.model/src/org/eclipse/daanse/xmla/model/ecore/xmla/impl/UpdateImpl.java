/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.Update;
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
 * An implementation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.UpdateImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.UpdateImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.UpdateImpl#isMoveWithDescendants <em>Move With Descendants</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.UpdateImpl#isMoveToRoot <em>Move To Root</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.UpdateImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateImpl extends MinimalEObjectImpl.Container implements Update {
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
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected AttributesType3 attributes;

	/**
	 * The default value of the '{@link #isMoveWithDescendants() <em>Move With Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveWithDescendants()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MOVE_WITH_DESCENDANTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMoveWithDescendants() <em>Move With Descendants</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveWithDescendants()
	 * @generated
	 * @ordered
	 */
	protected boolean moveWithDescendants = MOVE_WITH_DESCENDANTS_EDEFAULT;

	/**
	 * This is true if the Move With Descendants attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moveWithDescendantsESet;

	/**
	 * The default value of the '{@link #isMoveToRoot() <em>Move To Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveToRoot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MOVE_TO_ROOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMoveToRoot() <em>Move To Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMoveToRoot()
	 * @generated
	 * @ordered
	 */
	protected boolean moveToRoot = MOVE_TO_ROOT_EDEFAULT;

	/**
	 * This is true if the Move To Root attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean moveToRootESet;

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
	protected UpdateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.UPDATE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.UPDATE__OBJECT, oldObject, newObject);
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
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UPDATE__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UPDATE__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.UPDATE__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType3 getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(AttributesType3 newAttributes, NotificationChain msgs) {
		AttributesType3 oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.UPDATE__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(AttributesType3 newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UPDATE__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UPDATE__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.UPDATE__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoveWithDescendants() {
		return moveWithDescendants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveWithDescendants(boolean newMoveWithDescendants) {
		boolean oldMoveWithDescendants = moveWithDescendants;
		moveWithDescendants = newMoveWithDescendants;
		boolean oldMoveWithDescendantsESet = moveWithDescendantsESet;
		moveWithDescendantsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.UPDATE__MOVE_WITH_DESCENDANTS, oldMoveWithDescendants, moveWithDescendants, !oldMoveWithDescendantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoveWithDescendants() {
		boolean oldMoveWithDescendants = moveWithDescendants;
		boolean oldMoveWithDescendantsESet = moveWithDescendantsESet;
		moveWithDescendants = MOVE_WITH_DESCENDANTS_EDEFAULT;
		moveWithDescendantsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.UPDATE__MOVE_WITH_DESCENDANTS, oldMoveWithDescendants, MOVE_WITH_DESCENDANTS_EDEFAULT, oldMoveWithDescendantsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoveWithDescendants() {
		return moveWithDescendantsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoveToRoot() {
		return moveToRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveToRoot(boolean newMoveToRoot) {
		boolean oldMoveToRoot = moveToRoot;
		moveToRoot = newMoveToRoot;
		boolean oldMoveToRootESet = moveToRootESet;
		moveToRootESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.UPDATE__MOVE_TO_ROOT, oldMoveToRoot, moveToRoot, !oldMoveToRootESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMoveToRoot() {
		boolean oldMoveToRoot = moveToRoot;
		boolean oldMoveToRootESet = moveToRootESet;
		moveToRoot = MOVE_TO_ROOT_EDEFAULT;
		moveToRootESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.UPDATE__MOVE_TO_ROOT, oldMoveToRoot, MOVE_TO_ROOT_EDEFAULT, oldMoveToRootESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMoveToRoot() {
		return moveToRootESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.UPDATE__WHERE, oldWhere, newWhere);
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
				msgs = ((InternalEObject)where).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UPDATE__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject)newWhere).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.UPDATE__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.UPDATE__WHERE, newWhere, newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.UPDATE__OBJECT:
				return basicSetObject(null, msgs);
			case XmlaPackage.UPDATE__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case XmlaPackage.UPDATE__WHERE:
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
			case XmlaPackage.UPDATE__OBJECT:
				return getObject();
			case XmlaPackage.UPDATE__ATTRIBUTES:
				return getAttributes();
			case XmlaPackage.UPDATE__MOVE_WITH_DESCENDANTS:
				return isMoveWithDescendants();
			case XmlaPackage.UPDATE__MOVE_TO_ROOT:
				return isMoveToRoot();
			case XmlaPackage.UPDATE__WHERE:
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
			case XmlaPackage.UPDATE__OBJECT:
				setObject((org.eclipse.daanse.xmla.model.ecore.xmla.Object)newValue);
				return;
			case XmlaPackage.UPDATE__ATTRIBUTES:
				setAttributes((AttributesType3)newValue);
				return;
			case XmlaPackage.UPDATE__MOVE_WITH_DESCENDANTS:
				setMoveWithDescendants((Boolean)newValue);
				return;
			case XmlaPackage.UPDATE__MOVE_TO_ROOT:
				setMoveToRoot((Boolean)newValue);
				return;
			case XmlaPackage.UPDATE__WHERE:
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
			case XmlaPackage.UPDATE__OBJECT:
				setObject((org.eclipse.daanse.xmla.model.ecore.xmla.Object)null);
				return;
			case XmlaPackage.UPDATE__ATTRIBUTES:
				setAttributes((AttributesType3)null);
				return;
			case XmlaPackage.UPDATE__MOVE_WITH_DESCENDANTS:
				unsetMoveWithDescendants();
				return;
			case XmlaPackage.UPDATE__MOVE_TO_ROOT:
				unsetMoveToRoot();
				return;
			case XmlaPackage.UPDATE__WHERE:
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
			case XmlaPackage.UPDATE__OBJECT:
				return object != null;
			case XmlaPackage.UPDATE__ATTRIBUTES:
				return attributes != null;
			case XmlaPackage.UPDATE__MOVE_WITH_DESCENDANTS:
				return isSetMoveWithDescendants();
			case XmlaPackage.UPDATE__MOVE_TO_ROOT:
				return isSetMoveToRoot();
			case XmlaPackage.UPDATE__WHERE:
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
		result.append(" (moveWithDescendants: ");
		if (moveWithDescendantsESet) result.append(moveWithDescendants); else result.append("<unset>");
		result.append(", moveToRoot: ");
		if (moveToRootESet) result.append(moveToRoot); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UpdateImpl
