/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.EndOfDataType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PushedDataSource;
import org.eclipse.daanse.xmla.model.ecore.xmla.RootType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pushed Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PushedDataSourceImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PushedDataSourceImpl#getEndOfData <em>End Of Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PushedDataSourceImpl extends MinimalEObjectImpl.Container implements PushedDataSource {
	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected RootType root;

	/**
	 * The cached value of the '{@link #getEndOfData() <em>End Of Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOfData()
	 * @generated
	 * @ordered
	 */
	protected EndOfDataType endOfData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushedDataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PUSHED_DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootType getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(RootType newRoot, NotificationChain msgs) {
		RootType oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PUSHED_DATA_SOURCE__ROOT, oldRoot, newRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(RootType newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject)root).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PUSHED_DATA_SOURCE__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PUSHED_DATA_SOURCE__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PUSHED_DATA_SOURCE__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndOfDataType getEndOfData() {
		return endOfData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndOfData(EndOfDataType newEndOfData, NotificationChain msgs) {
		EndOfDataType oldEndOfData = endOfData;
		endOfData = newEndOfData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PUSHED_DATA_SOURCE__END_OF_DATA, oldEndOfData, newEndOfData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOfData(EndOfDataType newEndOfData) {
		if (newEndOfData != endOfData) {
			NotificationChain msgs = null;
			if (endOfData != null)
				msgs = ((InternalEObject)endOfData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PUSHED_DATA_SOURCE__END_OF_DATA, null, msgs);
			if (newEndOfData != null)
				msgs = ((InternalEObject)newEndOfData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PUSHED_DATA_SOURCE__END_OF_DATA, null, msgs);
			msgs = basicSetEndOfData(newEndOfData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PUSHED_DATA_SOURCE__END_OF_DATA, newEndOfData, newEndOfData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.PUSHED_DATA_SOURCE__ROOT:
				return basicSetRoot(null, msgs);
			case XmlaPackage.PUSHED_DATA_SOURCE__END_OF_DATA:
				return basicSetEndOfData(null, msgs);
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
			case XmlaPackage.PUSHED_DATA_SOURCE__ROOT:
				return getRoot();
			case XmlaPackage.PUSHED_DATA_SOURCE__END_OF_DATA:
				return getEndOfData();
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
			case XmlaPackage.PUSHED_DATA_SOURCE__ROOT:
				setRoot((RootType)newValue);
				return;
			case XmlaPackage.PUSHED_DATA_SOURCE__END_OF_DATA:
				setEndOfData((EndOfDataType)newValue);
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
			case XmlaPackage.PUSHED_DATA_SOURCE__ROOT:
				setRoot((RootType)null);
				return;
			case XmlaPackage.PUSHED_DATA_SOURCE__END_OF_DATA:
				setEndOfData((EndOfDataType)null);
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
			case XmlaPackage.PUSHED_DATA_SOURCE__ROOT:
				return root != null;
			case XmlaPackage.PUSHED_DATA_SOURCE__END_OF_DATA:
				return endOfData != null;
		}
		return super.eIsSet(featureID);
	}

} //PushedDataSourceImpl
