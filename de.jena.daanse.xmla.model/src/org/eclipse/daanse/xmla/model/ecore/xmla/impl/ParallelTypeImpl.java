/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.ParallelType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

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
 * An implementation of the model object '<em><b>Parallel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ParallelTypeImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ParallelTypeImpl#getMaxParallel <em>Max Parallel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelTypeImpl extends MinimalEObjectImpl.Container implements ParallelType {
	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.daanse.xmla.model.ecore.xmla.Process> process;

	/**
	 * The default value of the '{@link #getMaxParallel() <em>Max Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxParallel()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PARALLEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxParallel() <em>Max Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxParallel()
	 * @generated
	 * @ordered
	 */
	protected int maxParallel = MAX_PARALLEL_EDEFAULT;

	/**
	 * This is true if the Max Parallel attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxParallelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PARALLEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.daanse.xmla.model.ecore.xmla.Process> getProcess() {
		if (process == null) {
			process = new EObjectContainmentEList<org.eclipse.daanse.xmla.model.ecore.xmla.Process>(org.eclipse.daanse.xmla.model.ecore.xmla.Process.class, this, XmlaPackage.PARALLEL_TYPE__PROCESS);
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxParallel() {
		return maxParallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxParallel(int newMaxParallel) {
		int oldMaxParallel = maxParallel;
		maxParallel = newMaxParallel;
		boolean oldMaxParallelESet = maxParallelESet;
		maxParallelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PARALLEL_TYPE__MAX_PARALLEL, oldMaxParallel, maxParallel, !oldMaxParallelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxParallel() {
		int oldMaxParallel = maxParallel;
		boolean oldMaxParallelESet = maxParallelESet;
		maxParallel = MAX_PARALLEL_EDEFAULT;
		maxParallelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PARALLEL_TYPE__MAX_PARALLEL, oldMaxParallel, MAX_PARALLEL_EDEFAULT, oldMaxParallelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxParallel() {
		return maxParallelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.PARALLEL_TYPE__PROCESS:
				return ((InternalEList<?>)getProcess()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.PARALLEL_TYPE__PROCESS:
				return getProcess();
			case XmlaPackage.PARALLEL_TYPE__MAX_PARALLEL:
				return getMaxParallel();
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
			case XmlaPackage.PARALLEL_TYPE__PROCESS:
				getProcess().clear();
				getProcess().addAll((Collection<? extends org.eclipse.daanse.xmla.model.ecore.xmla.Process>)newValue);
				return;
			case XmlaPackage.PARALLEL_TYPE__MAX_PARALLEL:
				setMaxParallel((Integer)newValue);
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
			case XmlaPackage.PARALLEL_TYPE__PROCESS:
				getProcess().clear();
				return;
			case XmlaPackage.PARALLEL_TYPE__MAX_PARALLEL:
				unsetMaxParallel();
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
			case XmlaPackage.PARALLEL_TYPE__PROCESS:
				return process != null && !process.isEmpty();
			case XmlaPackage.PARALLEL_TYPE__MAX_PARALLEL:
				return isSetMaxParallel();
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
		result.append(" (maxParallel: ");
		if (maxParallelESet) result.append(maxParallel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ParallelTypeImpl
