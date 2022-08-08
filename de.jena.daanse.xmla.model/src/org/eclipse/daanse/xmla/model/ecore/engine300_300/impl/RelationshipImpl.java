/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300.impl;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Package;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship;
import org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipImpl#getFromRelationshipEnd <em>From Relationship End</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipImpl#getToRelationshipEnd <em>To Relationship End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * This is true if the Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleESet;

	/**
	 * The cached value of the '{@link #getFromRelationshipEnd() <em>From Relationship End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRelationshipEnd()
	 * @generated
	 * @ordered
	 */
	protected RelationshipEnd fromRelationshipEnd;

	/**
	 * The cached value of the '{@link #getToRelationshipEnd() <em>To Relationship End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRelationshipEnd()
	 * @generated
	 * @ordered
	 */
	protected RelationshipEnd toRelationshipEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Engine300_300Package.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		boolean oldVisibleESet = visibleESet;
		visibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP__VISIBLE, oldVisible, visible, !oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisible() {
		boolean oldVisible = visible;
		boolean oldVisibleESet = visibleESet;
		visible = VISIBLE_EDEFAULT;
		visibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Engine300_300Package.RELATIONSHIP__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisible() {
		return visibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipEnd getFromRelationshipEnd() {
		return fromRelationshipEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromRelationshipEnd(RelationshipEnd newFromRelationshipEnd, NotificationChain msgs) {
		RelationshipEnd oldFromRelationshipEnd = fromRelationshipEnd;
		fromRelationshipEnd = newFromRelationshipEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP__FROM_RELATIONSHIP_END, oldFromRelationshipEnd, newFromRelationshipEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromRelationshipEnd(RelationshipEnd newFromRelationshipEnd) {
		if (newFromRelationshipEnd != fromRelationshipEnd) {
			NotificationChain msgs = null;
			if (fromRelationshipEnd != null)
				msgs = ((InternalEObject)fromRelationshipEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.RELATIONSHIP__FROM_RELATIONSHIP_END, null, msgs);
			if (newFromRelationshipEnd != null)
				msgs = ((InternalEObject)newFromRelationshipEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.RELATIONSHIP__FROM_RELATIONSHIP_END, null, msgs);
			msgs = basicSetFromRelationshipEnd(newFromRelationshipEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP__FROM_RELATIONSHIP_END, newFromRelationshipEnd, newFromRelationshipEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipEnd getToRelationshipEnd() {
		return toRelationshipEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToRelationshipEnd(RelationshipEnd newToRelationshipEnd, NotificationChain msgs) {
		RelationshipEnd oldToRelationshipEnd = toRelationshipEnd;
		toRelationshipEnd = newToRelationshipEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP__TO_RELATIONSHIP_END, oldToRelationshipEnd, newToRelationshipEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToRelationshipEnd(RelationshipEnd newToRelationshipEnd) {
		if (newToRelationshipEnd != toRelationshipEnd) {
			NotificationChain msgs = null;
			if (toRelationshipEnd != null)
				msgs = ((InternalEObject)toRelationshipEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.RELATIONSHIP__TO_RELATIONSHIP_END, null, msgs);
			if (newToRelationshipEnd != null)
				msgs = ((InternalEObject)newToRelationshipEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Engine300_300Package.RELATIONSHIP__TO_RELATIONSHIP_END, null, msgs);
			msgs = basicSetToRelationshipEnd(newToRelationshipEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Engine300_300Package.RELATIONSHIP__TO_RELATIONSHIP_END, newToRelationshipEnd, newToRelationshipEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Engine300_300Package.RELATIONSHIP__FROM_RELATIONSHIP_END:
				return basicSetFromRelationshipEnd(null, msgs);
			case Engine300_300Package.RELATIONSHIP__TO_RELATIONSHIP_END:
				return basicSetToRelationshipEnd(null, msgs);
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
			case Engine300_300Package.RELATIONSHIP__ID:
				return getID();
			case Engine300_300Package.RELATIONSHIP__VISIBLE:
				return isVisible();
			case Engine300_300Package.RELATIONSHIP__FROM_RELATIONSHIP_END:
				return getFromRelationshipEnd();
			case Engine300_300Package.RELATIONSHIP__TO_RELATIONSHIP_END:
				return getToRelationshipEnd();
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
			case Engine300_300Package.RELATIONSHIP__ID:
				setID((String)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP__FROM_RELATIONSHIP_END:
				setFromRelationshipEnd((RelationshipEnd)newValue);
				return;
			case Engine300_300Package.RELATIONSHIP__TO_RELATIONSHIP_END:
				setToRelationshipEnd((RelationshipEnd)newValue);
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
			case Engine300_300Package.RELATIONSHIP__ID:
				setID(ID_EDEFAULT);
				return;
			case Engine300_300Package.RELATIONSHIP__VISIBLE:
				unsetVisible();
				return;
			case Engine300_300Package.RELATIONSHIP__FROM_RELATIONSHIP_END:
				setFromRelationshipEnd((RelationshipEnd)null);
				return;
			case Engine300_300Package.RELATIONSHIP__TO_RELATIONSHIP_END:
				setToRelationshipEnd((RelationshipEnd)null);
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
			case Engine300_300Package.RELATIONSHIP__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case Engine300_300Package.RELATIONSHIP__VISIBLE:
				return isSetVisible();
			case Engine300_300Package.RELATIONSHIP__FROM_RELATIONSHIP_END:
				return fromRelationshipEnd != null;
			case Engine300_300Package.RELATIONSHIP__TO_RELATIONSHIP_END:
				return toRelationshipEnd != null;
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
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
