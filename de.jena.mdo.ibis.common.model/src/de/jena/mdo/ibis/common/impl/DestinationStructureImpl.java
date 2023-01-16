/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.DestinationStructure;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.InternationalTextType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destination Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DestinationStructureImpl#getDestinationRef <em>Destination Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DestinationStructureImpl#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DestinationStructureImpl#getDestinationShortName <em>Destination Short Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DestinationStructureImpl extends MinimalEObjectImpl.Container implements DestinationStructure {
	/**
	 * The cached value of the '{@link #getDestinationRef() <em>Destination Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN destinationRef;

	/**
	 * The cached value of the '{@link #getDestinationName() <em>Destination Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> destinationName;

	/**
	 * The cached value of the '{@link #getDestinationShortName() <em>Destination Short Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationShortName()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> destinationShortName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getDestinationStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getDestinationRef() {
		return destinationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestinationRef(IBISIPNMTOKEN newDestinationRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldDestinationRef = destinationRef;
		destinationRef = newDestinationRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_REF, oldDestinationRef, newDestinationRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestinationRef(IBISIPNMTOKEN newDestinationRef) {
		if (newDestinationRef != destinationRef) {
			NotificationChain msgs = null;
			if (destinationRef != null)
				msgs = ((InternalEObject)destinationRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_REF, null, msgs);
			if (newDestinationRef != null)
				msgs = ((InternalEObject)newDestinationRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_REF, null, msgs);
			msgs = basicSetDestinationRef(newDestinationRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_REF, newDestinationRef, newDestinationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getDestinationName() {
		if (destinationName == null) {
			destinationName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_NAME);
		}
		return destinationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getDestinationShortName() {
		if (destinationShortName == null) {
			destinationShortName = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_SHORT_NAME);
		}
		return destinationShortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_REF:
				return basicSetDestinationRef(null, msgs);
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_NAME:
				return ((InternalEList<?>)getDestinationName()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_SHORT_NAME:
				return ((InternalEList<?>)getDestinationShortName()).basicRemove(otherEnd, msgs);
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
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_REF:
				return getDestinationRef();
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_NAME:
				return getDestinationName();
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_SHORT_NAME:
				return getDestinationShortName();
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
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_REF:
				setDestinationRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_NAME:
				getDestinationName().clear();
				getDestinationName().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_SHORT_NAME:
				getDestinationShortName().clear();
				getDestinationShortName().addAll((Collection<? extends InternationalTextType>)newValue);
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
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_REF:
				setDestinationRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_NAME:
				getDestinationName().clear();
				return;
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_SHORT_NAME:
				getDestinationShortName().clear();
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
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_REF:
				return destinationRef != null;
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_NAME:
				return destinationName != null && !destinationName.isEmpty();
			case IbisCommonPackage.DESTINATION_STRUCTURE__DESTINATION_SHORT_NAME:
				return destinationShortName != null && !destinationShortName.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DestinationStructureImpl
