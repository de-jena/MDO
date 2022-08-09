/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveKpi;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective Kpi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveKpiImpl#getKpiID <em>Kpi ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveKpiImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerspectiveKpiImpl extends MinimalEObjectImpl.Container implements PerspectiveKpi {
	/**
	 * The default value of the '{@link #getKpiID() <em>Kpi ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpiID()
	 * @generated
	 * @ordered
	 */
	protected static final String KPI_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKpiID() <em>Kpi ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKpiID()
	 * @generated
	 * @ordered
	 */
	protected String kpiID = KPI_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerspectiveKpiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PERSPECTIVE_KPI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKpiID() {
		return kpiID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKpiID(String newKpiID) {
		String oldKpiID = kpiID;
		kpiID = newKpiID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_KPI__KPI_ID, oldKpiID, kpiID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType newAnnotations, NotificationChain msgs) {
		AnnotationsType oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_KPI__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE_KPI__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE_KPI__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_KPI__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.PERSPECTIVE_KPI__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
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
			case XmlaPackage.PERSPECTIVE_KPI__KPI_ID:
				return getKpiID();
			case XmlaPackage.PERSPECTIVE_KPI__ANNOTATIONS:
				return getAnnotations();
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
			case XmlaPackage.PERSPECTIVE_KPI__KPI_ID:
				setKpiID((String)newValue);
				return;
			case XmlaPackage.PERSPECTIVE_KPI__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
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
			case XmlaPackage.PERSPECTIVE_KPI__KPI_ID:
				setKpiID(KPI_ID_EDEFAULT);
				return;
			case XmlaPackage.PERSPECTIVE_KPI__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
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
			case XmlaPackage.PERSPECTIVE_KPI__KPI_ID:
				return KPI_ID_EDEFAULT == null ? kpiID != null : !KPI_ID_EDEFAULT.equals(kpiID);
			case XmlaPackage.PERSPECTIVE_KPI__ANNOTATIONS:
				return annotations != null;
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
		result.append(" (kpiID: ");
		result.append(kpiID);
		result.append(')');
		return result.toString();
	}

} //PerspectiveKpiImpl
