/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType35;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataMiningMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupDimensionBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Mining Measure Group Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataMiningMeasureGroupDimensionImpl#getCubeDimensionID <em>Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataMiningMeasureGroupDimensionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataMiningMeasureGroupDimensionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataMiningMeasureGroupDimensionImpl#getCaseCubeDimensionID <em>Case Cube Dimension ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataMiningMeasureGroupDimensionImpl extends MeasureGroupDimensionImpl implements DataMiningMeasureGroupDimension {
	/**
	 * The default value of the '{@link #getCubeDimensionID() <em>Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeDimensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUBE_DIMENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCubeDimensionID() <em>Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeDimensionID()
	 * @generated
	 * @ordered
	 */
	protected String cubeDimensionID = CUBE_DIMENSION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType35 annotations;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MeasureGroupDimensionBinding source;

	/**
	 * The default value of the '{@link #getCaseCubeDimensionID() <em>Case Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseCubeDimensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String CASE_CUBE_DIMENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCaseCubeDimensionID() <em>Case Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseCubeDimensionID()
	 * @generated
	 * @ordered
	 */
	protected String caseCubeDimensionID = CASE_CUBE_DIMENSION_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMiningMeasureGroupDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DATA_MINING_MEASURE_GROUP_DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCubeDimensionID() {
		return cubeDimensionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubeDimensionID(String newCubeDimensionID) {
		String oldCubeDimensionID = cubeDimensionID;
		cubeDimensionID = newCubeDimensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID, oldCubeDimensionID, cubeDimensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType35 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType35 newAnnotations, NotificationChain msgs) {
		AnnotationsType35 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType35 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupDimensionBinding getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(MeasureGroupDimensionBinding newSource, NotificationChain msgs) {
		MeasureGroupDimensionBinding oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(MeasureGroupDimensionBinding newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCaseCubeDimensionID() {
		return caseCubeDimensionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseCubeDimensionID(String newCaseCubeDimensionID) {
		String oldCaseCubeDimensionID = caseCubeDimensionID;
		caseCubeDimensionID = newCaseCubeDimensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__CASE_CUBE_DIMENSION_ID, oldCaseCubeDimensionID, caseCubeDimensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__SOURCE:
				return basicSetSource(null, msgs);
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
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				return getCubeDimensionID();
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__SOURCE:
				return getSource();
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__CASE_CUBE_DIMENSION_ID:
				return getCaseCubeDimensionID();
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
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				setCubeDimensionID((String)newValue);
				return;
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				setAnnotations((AnnotationsType35)newValue);
				return;
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__SOURCE:
				setSource((MeasureGroupDimensionBinding)newValue);
				return;
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__CASE_CUBE_DIMENSION_ID:
				setCaseCubeDimensionID((String)newValue);
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
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				setCubeDimensionID(CUBE_DIMENSION_ID_EDEFAULT);
				return;
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				setAnnotations((AnnotationsType35)null);
				return;
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__SOURCE:
				setSource((MeasureGroupDimensionBinding)null);
				return;
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__CASE_CUBE_DIMENSION_ID:
				setCaseCubeDimensionID(CASE_CUBE_DIMENSION_ID_EDEFAULT);
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
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				return CUBE_DIMENSION_ID_EDEFAULT == null ? cubeDimensionID != null : !CUBE_DIMENSION_ID_EDEFAULT.equals(cubeDimensionID);
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__SOURCE:
				return source != null;
			case XmlaPackage.DATA_MINING_MEASURE_GROUP_DIMENSION__CASE_CUBE_DIMENSION_ID:
				return CASE_CUBE_DIMENSION_ID_EDEFAULT == null ? caseCubeDimensionID != null : !CASE_CUBE_DIMENSION_ID_EDEFAULT.equals(caseCubeDimensionID);
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
		result.append(" (cubeDimensionID: ");
		result.append(cubeDimensionID);
		result.append(", caseCubeDimensionID: ");
		result.append(caseCubeDimensionID);
		result.append(')');
		return result.toString();
	}

} //DataMiningMeasureGroupDimensionImpl
