/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationInstanceAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType4;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation Instance Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AggregationInstanceAttributeImpl#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AggregationInstanceAttributeImpl#getKeyColumns <em>Key Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationInstanceAttributeImpl extends MinimalEObjectImpl.Container implements AggregationInstanceAttribute {
	/**
	 * The default value of the '{@link #getAttributeID() <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeID()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeID() <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeID()
	 * @generated
	 * @ordered
	 */
	protected String attributeID = ATTRIBUTE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKeyColumns() <em>Key Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyColumns()
	 * @generated
	 * @ordered
	 */
	protected KeyColumnsType4 keyColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregationInstanceAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.AGGREGATION_INSTANCE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeID() {
		return attributeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeID(String newAttributeID) {
		String oldAttributeID = attributeID;
		attributeID = newAttributeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__ATTRIBUTE_ID, oldAttributeID, attributeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyColumnsType4 getKeyColumns() {
		return keyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyColumns(KeyColumnsType4 newKeyColumns, NotificationChain msgs) {
		KeyColumnsType4 oldKeyColumns = keyColumns;
		keyColumns = newKeyColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__KEY_COLUMNS, oldKeyColumns, newKeyColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyColumns(KeyColumnsType4 newKeyColumns) {
		if (newKeyColumns != keyColumns) {
			NotificationChain msgs = null;
			if (keyColumns != null)
				msgs = ((InternalEObject)keyColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__KEY_COLUMNS, null, msgs);
			if (newKeyColumns != null)
				msgs = ((InternalEObject)newKeyColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__KEY_COLUMNS, null, msgs);
			msgs = basicSetKeyColumns(newKeyColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__KEY_COLUMNS, newKeyColumns, newKeyColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__KEY_COLUMNS:
				return basicSetKeyColumns(null, msgs);
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
			case XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__ATTRIBUTE_ID:
				return getAttributeID();
			case XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__KEY_COLUMNS:
				return getKeyColumns();
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
			case XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__ATTRIBUTE_ID:
				setAttributeID((String)newValue);
				return;
			case XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__KEY_COLUMNS:
				setKeyColumns((KeyColumnsType4)newValue);
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
			case XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__ATTRIBUTE_ID:
				setAttributeID(ATTRIBUTE_ID_EDEFAULT);
				return;
			case XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__KEY_COLUMNS:
				setKeyColumns((KeyColumnsType4)null);
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
			case XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__ATTRIBUTE_ID:
				return ATTRIBUTE_ID_EDEFAULT == null ? attributeID != null : !ATTRIBUTE_ID_EDEFAULT.equals(attributeID);
			case XmlaPackage.AGGREGATION_INSTANCE_ATTRIBUTE__KEY_COLUMNS:
				return keyColumns != null;
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
		result.append(" (attributeID: ");
		result.append(attributeID);
		result.append(')');
		return result.toString();
	}

} //AggregationInstanceAttributeImpl
