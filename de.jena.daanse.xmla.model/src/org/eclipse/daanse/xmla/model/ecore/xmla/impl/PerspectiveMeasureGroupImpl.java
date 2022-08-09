/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasuresType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveMeasureGroup;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective Measure Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveMeasureGroupImpl#getMeasureGroupID <em>Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveMeasureGroupImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveMeasureGroupImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerspectiveMeasureGroupImpl extends MinimalEObjectImpl.Container implements PerspectiveMeasureGroup {
	/**
	 * The default value of the '{@link #getMeasureGroupID() <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURE_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasureGroupID() <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroupID()
	 * @generated
	 * @ordered
	 */
	protected String measureGroupID = MEASURE_GROUP_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected MeasuresType2 measures;

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
	protected PerspectiveMeasureGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PERSPECTIVE_MEASURE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasureGroupID() {
		return measureGroupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureGroupID(String newMeasureGroupID) {
		String oldMeasureGroupID = measureGroupID;
		measureGroupID = newMeasureGroupID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURE_GROUP_ID, oldMeasureGroupID, measureGroupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuresType2 getMeasures() {
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasures(MeasuresType2 newMeasures, NotificationChain msgs) {
		MeasuresType2 oldMeasures = measures;
		measures = newMeasures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURES, oldMeasures, newMeasures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasures(MeasuresType2 newMeasures) {
		if (newMeasures != measures) {
			NotificationChain msgs = null;
			if (measures != null)
				msgs = ((InternalEObject)measures).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURES, null, msgs);
			if (newMeasures != null)
				msgs = ((InternalEObject)newMeasures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURES, null, msgs);
			msgs = basicSetMeasures(newMeasures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURES, newMeasures, newMeasures));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_MEASURE_GROUP__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE_MEASURE_GROUP__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE_MEASURE_GROUP__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_MEASURE_GROUP__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURES:
				return basicSetMeasures(null, msgs);
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__ANNOTATIONS:
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
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURE_GROUP_ID:
				return getMeasureGroupID();
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURES:
				return getMeasures();
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__ANNOTATIONS:
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
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURE_GROUP_ID:
				setMeasureGroupID((String)newValue);
				return;
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURES:
				setMeasures((MeasuresType2)newValue);
				return;
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__ANNOTATIONS:
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
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURE_GROUP_ID:
				setMeasureGroupID(MEASURE_GROUP_ID_EDEFAULT);
				return;
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURES:
				setMeasures((MeasuresType2)null);
				return;
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__ANNOTATIONS:
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
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURE_GROUP_ID:
				return MEASURE_GROUP_ID_EDEFAULT == null ? measureGroupID != null : !MEASURE_GROUP_ID_EDEFAULT.equals(measureGroupID);
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__MEASURES:
				return measures != null;
			case XmlaPackage.PERSPECTIVE_MEASURE_GROUP__ANNOTATIONS:
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
		result.append(" (measureGroupID: ");
		result.append(measureGroupID);
		result.append(')');
		return result.toString();
	}

} //PerspectiveMeasureGroupImpl
