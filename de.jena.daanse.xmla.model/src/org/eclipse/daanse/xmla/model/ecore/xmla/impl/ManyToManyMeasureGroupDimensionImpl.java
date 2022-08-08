/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType39;
import org.eclipse.daanse.xmla.model.ecore.xmla.ManyToManyMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupDimensionBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many To Many Measure Group Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ManyToManyMeasureGroupDimensionImpl#getCubeDimensionID <em>Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ManyToManyMeasureGroupDimensionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ManyToManyMeasureGroupDimensionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ManyToManyMeasureGroupDimensionImpl#getMeasureGroupID <em>Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ManyToManyMeasureGroupDimensionImpl#getDirectSlice <em>Direct Slice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ManyToManyMeasureGroupDimensionImpl extends MeasureGroupDimensionImpl implements ManyToManyMeasureGroupDimension {
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
	protected AnnotationsType39 annotations;

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
	 * The default value of the '{@link #getDirectSlice() <em>Direct Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectSlice()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECT_SLICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectSlice() <em>Direct Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectSlice()
	 * @generated
	 * @ordered
	 */
	protected String directSlice = DIRECT_SLICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManyToManyMeasureGroupDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.MANY_TO_MANY_MEASURE_GROUP_DIMENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID, oldCubeDimensionID, cubeDimensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType39 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType39 newAnnotations, NotificationChain msgs) {
		AnnotationsType39 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType39 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__ANNOTATIONS, newAnnotations, newAnnotations));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__SOURCE, oldSource, newSource);
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
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__SOURCE, newSource, newSource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__MEASURE_GROUP_ID, oldMeasureGroupID, measureGroupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirectSlice() {
		return directSlice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectSlice(String newDirectSlice) {
		String oldDirectSlice = directSlice;
		directSlice = newDirectSlice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__DIRECT_SLICE, oldDirectSlice, directSlice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__SOURCE:
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
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				return getCubeDimensionID();
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__SOURCE:
				return getSource();
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__MEASURE_GROUP_ID:
				return getMeasureGroupID();
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__DIRECT_SLICE:
				return getDirectSlice();
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
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				setCubeDimensionID((String)newValue);
				return;
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				setAnnotations((AnnotationsType39)newValue);
				return;
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__SOURCE:
				setSource((MeasureGroupDimensionBinding)newValue);
				return;
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__MEASURE_GROUP_ID:
				setMeasureGroupID((String)newValue);
				return;
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__DIRECT_SLICE:
				setDirectSlice((String)newValue);
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
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				setCubeDimensionID(CUBE_DIMENSION_ID_EDEFAULT);
				return;
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				setAnnotations((AnnotationsType39)null);
				return;
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__SOURCE:
				setSource((MeasureGroupDimensionBinding)null);
				return;
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__MEASURE_GROUP_ID:
				setMeasureGroupID(MEASURE_GROUP_ID_EDEFAULT);
				return;
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__DIRECT_SLICE:
				setDirectSlice(DIRECT_SLICE_EDEFAULT);
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
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				return CUBE_DIMENSION_ID_EDEFAULT == null ? cubeDimensionID != null : !CUBE_DIMENSION_ID_EDEFAULT.equals(cubeDimensionID);
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__SOURCE:
				return source != null;
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__MEASURE_GROUP_ID:
				return MEASURE_GROUP_ID_EDEFAULT == null ? measureGroupID != null : !MEASURE_GROUP_ID_EDEFAULT.equals(measureGroupID);
			case XmlaPackage.MANY_TO_MANY_MEASURE_GROUP_DIMENSION__DIRECT_SLICE:
				return DIRECT_SLICE_EDEFAULT == null ? directSlice != null : !DIRECT_SLICE_EDEFAULT.equals(directSlice);
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
		result.append(", measureGroupID: ");
		result.append(measureGroupID);
		result.append(", directSlice: ");
		result.append(directSlice);
		result.append(')');
		return result.toString();
	}

} //ManyToManyMeasureGroupDimensionImpl
