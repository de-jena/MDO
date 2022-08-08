/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.ServerPropertiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty;
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
 * An implementation of the model object '<em><b>Server Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerPropertiesTypeImpl#getServerProperty <em>Server Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerPropertiesTypeImpl extends MinimalEObjectImpl.Container implements ServerPropertiesType {
	/**
	 * The cached value of the '{@link #getServerProperty() <em>Server Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ServerProperty> serverProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerPropertiesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.SERVER_PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServerProperty> getServerProperty() {
		if (serverProperty == null) {
			serverProperty = new EObjectContainmentEList<ServerProperty>(ServerProperty.class, this, XmlaPackage.SERVER_PROPERTIES_TYPE__SERVER_PROPERTY);
		}
		return serverProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.SERVER_PROPERTIES_TYPE__SERVER_PROPERTY:
				return ((InternalEList<?>)getServerProperty()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.SERVER_PROPERTIES_TYPE__SERVER_PROPERTY:
				return getServerProperty();
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
			case XmlaPackage.SERVER_PROPERTIES_TYPE__SERVER_PROPERTY:
				getServerProperty().clear();
				getServerProperty().addAll((Collection<? extends ServerProperty>)newValue);
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
			case XmlaPackage.SERVER_PROPERTIES_TYPE__SERVER_PROPERTY:
				getServerProperty().clear();
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
			case XmlaPackage.SERVER_PROPERTIES_TYPE__SERVER_PROPERTY:
				return serverProperty != null && !serverProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServerPropertiesTypeImpl
