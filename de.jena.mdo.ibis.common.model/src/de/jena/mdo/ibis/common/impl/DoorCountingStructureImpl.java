/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.DoorCountingStructure;
import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IbisCommonPackage;

import de.jena.mdo.ibis.enumerations.DoorCountingObjectClassEnumeration;
import de.jena.mdo.ibis.enumerations.DoorCountingQualityEnumeration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Door Counting Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DoorCountingStructureImpl#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DoorCountingStructureImpl#getIn <em>In</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DoorCountingStructureImpl#getOut <em>Out</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DoorCountingStructureImpl#getCountQuality <em>Count Quality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoorCountingStructureImpl extends MinimalEObjectImpl.Container implements DoorCountingStructure {
	/**
	 * The default value of the '{@link #getObjectClass() <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected static final DoorCountingObjectClassEnumeration OBJECT_CLASS_EDEFAULT = DoorCountingObjectClassEnumeration.ADULT;

	/**
	 * The cached value of the '{@link #getObjectClass() <em>Object Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClass()
	 * @generated
	 * @ordered
	 */
	protected DoorCountingObjectClassEnumeration objectClass = OBJECT_CLASS_EDEFAULT;

	/**
	 * This is true if the Object Class attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectClassESet;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt out;

	/**
	 * The default value of the '{@link #getCountQuality() <em>Count Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountQuality()
	 * @generated
	 * @ordered
	 */
	protected static final DoorCountingQualityEnumeration COUNT_QUALITY_EDEFAULT = DoorCountingQualityEnumeration.DEFECT;

	/**
	 * The cached value of the '{@link #getCountQuality() <em>Count Quality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountQuality()
	 * @generated
	 * @ordered
	 */
	protected DoorCountingQualityEnumeration countQuality = COUNT_QUALITY_EDEFAULT;

	/**
	 * This is true if the Count Quality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countQualityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoorCountingStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getDoorCountingStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorCountingObjectClassEnumeration getObjectClass() {
		return objectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectClass(DoorCountingObjectClassEnumeration newObjectClass) {
		DoorCountingObjectClassEnumeration oldObjectClass = objectClass;
		objectClass = newObjectClass == null ? OBJECT_CLASS_EDEFAULT : newObjectClass;
		boolean oldObjectClassESet = objectClassESet;
		objectClassESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OBJECT_CLASS, oldObjectClass, objectClass, !oldObjectClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetObjectClass() {
		DoorCountingObjectClassEnumeration oldObjectClass = objectClass;
		boolean oldObjectClassESet = objectClassESet;
		objectClass = OBJECT_CLASS_EDEFAULT;
		objectClassESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OBJECT_CLASS, oldObjectClass, OBJECT_CLASS_EDEFAULT, oldObjectClassESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetObjectClass() {
		return objectClassESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIn(IBISIPInt newIn, NotificationChain msgs) {
		IBISIPInt oldIn = in;
		in = newIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_COUNTING_STRUCTURE__IN, oldIn, newIn);
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
	public void setIn(IBISIPInt newIn) {
		if (newIn != in) {
			NotificationChain msgs = null;
			if (in != null)
				msgs = ((InternalEObject)in).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_COUNTING_STRUCTURE__IN, null, msgs);
			if (newIn != null)
				msgs = ((InternalEObject)newIn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_COUNTING_STRUCTURE__IN, null, msgs);
			msgs = basicSetIn(newIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_COUNTING_STRUCTURE__IN, newIn, newIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getOut() {
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOut(IBISIPInt newOut, NotificationChain msgs) {
		IBISIPInt oldOut = out;
		out = newOut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OUT, oldOut, newOut);
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
	public void setOut(IBISIPInt newOut) {
		if (newOut != out) {
			NotificationChain msgs = null;
			if (out != null)
				msgs = ((InternalEObject)out).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OUT, null, msgs);
			if (newOut != null)
				msgs = ((InternalEObject)newOut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OUT, null, msgs);
			msgs = basicSetOut(newOut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OUT, newOut, newOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoorCountingQualityEnumeration getCountQuality() {
		return countQuality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountQuality(DoorCountingQualityEnumeration newCountQuality) {
		DoorCountingQualityEnumeration oldCountQuality = countQuality;
		countQuality = newCountQuality == null ? COUNT_QUALITY_EDEFAULT : newCountQuality;
		boolean oldCountQualityESet = countQualityESet;
		countQualityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DOOR_COUNTING_STRUCTURE__COUNT_QUALITY, oldCountQuality, countQuality, !oldCountQualityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCountQuality() {
		DoorCountingQualityEnumeration oldCountQuality = countQuality;
		boolean oldCountQualityESet = countQualityESet;
		countQuality = COUNT_QUALITY_EDEFAULT;
		countQualityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IbisCommonPackage.DOOR_COUNTING_STRUCTURE__COUNT_QUALITY, oldCountQuality, COUNT_QUALITY_EDEFAULT, oldCountQualityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCountQuality() {
		return countQualityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__IN:
				return basicSetIn(null, msgs);
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OUT:
				return basicSetOut(null, msgs);
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
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OBJECT_CLASS:
				return getObjectClass();
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__IN:
				return getIn();
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OUT:
				return getOut();
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__COUNT_QUALITY:
				return getCountQuality();
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
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OBJECT_CLASS:
				setObjectClass((DoorCountingObjectClassEnumeration)newValue);
				return;
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__IN:
				setIn((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OUT:
				setOut((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__COUNT_QUALITY:
				setCountQuality((DoorCountingQualityEnumeration)newValue);
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
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OBJECT_CLASS:
				unsetObjectClass();
				return;
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__IN:
				setIn((IBISIPInt)null);
				return;
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OUT:
				setOut((IBISIPInt)null);
				return;
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__COUNT_QUALITY:
				unsetCountQuality();
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
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OBJECT_CLASS:
				return isSetObjectClass();
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__IN:
				return in != null;
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__OUT:
				return out != null;
			case IbisCommonPackage.DOOR_COUNTING_STRUCTURE__COUNT_QUALITY:
				return isSetCountQuality();
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
		result.append(" (objectClass: ");
		if (objectClassESet) result.append(objectClass); else result.append("<unset>");
		result.append(", countQuality: ");
		if (countQualityESet) result.append(countQuality); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DoorCountingStructureImpl
