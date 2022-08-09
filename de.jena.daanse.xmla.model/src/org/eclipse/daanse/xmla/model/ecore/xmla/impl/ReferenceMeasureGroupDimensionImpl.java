/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingStateType;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MaterializationType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupDimensionBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReferenceMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Measure Group Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReferenceMeasureGroupDimensionImpl#getCubeDimensionID <em>Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReferenceMeasureGroupDimensionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReferenceMeasureGroupDimensionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReferenceMeasureGroupDimensionImpl#getIntermediateCubeDimensionID <em>Intermediate Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReferenceMeasureGroupDimensionImpl#getIntermediateGranularityAttributeID <em>Intermediate Granularity Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReferenceMeasureGroupDimensionImpl#getMaterialization <em>Materialization</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReferenceMeasureGroupDimensionImpl#getProcessingState <em>Processing State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceMeasureGroupDimensionImpl extends MeasureGroupDimensionImpl implements ReferenceMeasureGroupDimension {
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
	protected AnnotationsType annotations;

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
	 * The default value of the '{@link #getIntermediateCubeDimensionID() <em>Intermediate Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateCubeDimensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERMEDIATE_CUBE_DIMENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntermediateCubeDimensionID() <em>Intermediate Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateCubeDimensionID()
	 * @generated
	 * @ordered
	 */
	protected String intermediateCubeDimensionID = INTERMEDIATE_CUBE_DIMENSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntermediateGranularityAttributeID() <em>Intermediate Granularity Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateGranularityAttributeID()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERMEDIATE_GRANULARITY_ATTRIBUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntermediateGranularityAttributeID() <em>Intermediate Granularity Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediateGranularityAttributeID()
	 * @generated
	 * @ordered
	 */
	protected String intermediateGranularityAttributeID = INTERMEDIATE_GRANULARITY_ATTRIBUTE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaterialization() <em>Materialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialization()
	 * @generated
	 * @ordered
	 */
	protected static final MaterializationType MATERIALIZATION_EDEFAULT = MaterializationType.REGULAR;

	/**
	 * The cached value of the '{@link #getMaterialization() <em>Materialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialization()
	 * @generated
	 * @ordered
	 */
	protected MaterializationType materialization = MATERIALIZATION_EDEFAULT;

	/**
	 * This is true if the Materialization attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean materializationESet;

	/**
	 * The default value of the '{@link #getProcessingState() <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingState()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingStateType PROCESSING_STATE_EDEFAULT = ProcessingStateType.PROCESSED;

	/**
	 * The cached value of the '{@link #getProcessingState() <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingState()
	 * @generated
	 * @ordered
	 */
	protected ProcessingStateType processingState = PROCESSING_STATE_EDEFAULT;

	/**
	 * This is true if the Processing State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean processingStateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceMeasureGroupDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.REFERENCE_MEASURE_GROUP_DIMENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID, oldCubeDimensionID, cubeDimensionID));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__ANNOTATIONS, newAnnotations, newAnnotations));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__SOURCE, oldSource, newSource);
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
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntermediateCubeDimensionID() {
		return intermediateCubeDimensionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntermediateCubeDimensionID(String newIntermediateCubeDimensionID) {
		String oldIntermediateCubeDimensionID = intermediateCubeDimensionID;
		intermediateCubeDimensionID = newIntermediateCubeDimensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__INTERMEDIATE_CUBE_DIMENSION_ID, oldIntermediateCubeDimensionID, intermediateCubeDimensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntermediateGranularityAttributeID() {
		return intermediateGranularityAttributeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntermediateGranularityAttributeID(String newIntermediateGranularityAttributeID) {
		String oldIntermediateGranularityAttributeID = intermediateGranularityAttributeID;
		intermediateGranularityAttributeID = newIntermediateGranularityAttributeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__INTERMEDIATE_GRANULARITY_ATTRIBUTE_ID, oldIntermediateGranularityAttributeID, intermediateGranularityAttributeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterializationType getMaterialization() {
		return materialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaterialization(MaterializationType newMaterialization) {
		MaterializationType oldMaterialization = materialization;
		materialization = newMaterialization == null ? MATERIALIZATION_EDEFAULT : newMaterialization;
		boolean oldMaterializationESet = materializationESet;
		materializationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__MATERIALIZATION, oldMaterialization, materialization, !oldMaterializationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaterialization() {
		MaterializationType oldMaterialization = materialization;
		boolean oldMaterializationESet = materializationESet;
		materialization = MATERIALIZATION_EDEFAULT;
		materializationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__MATERIALIZATION, oldMaterialization, MATERIALIZATION_EDEFAULT, oldMaterializationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaterialization() {
		return materializationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingStateType getProcessingState() {
		return processingState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingState(ProcessingStateType newProcessingState) {
		ProcessingStateType oldProcessingState = processingState;
		processingState = newProcessingState == null ? PROCESSING_STATE_EDEFAULT : newProcessingState;
		boolean oldProcessingStateESet = processingStateESet;
		processingStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__PROCESSING_STATE, oldProcessingState, processingState, !oldProcessingStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProcessingState() {
		ProcessingStateType oldProcessingState = processingState;
		boolean oldProcessingStateESet = processingStateESet;
		processingState = PROCESSING_STATE_EDEFAULT;
		processingStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__PROCESSING_STATE, oldProcessingState, PROCESSING_STATE_EDEFAULT, oldProcessingStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProcessingState() {
		return processingStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__SOURCE:
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
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				return getCubeDimensionID();
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__SOURCE:
				return getSource();
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__INTERMEDIATE_CUBE_DIMENSION_ID:
				return getIntermediateCubeDimensionID();
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__INTERMEDIATE_GRANULARITY_ATTRIBUTE_ID:
				return getIntermediateGranularityAttributeID();
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__MATERIALIZATION:
				return getMaterialization();
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__PROCESSING_STATE:
				return getProcessingState();
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
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				setCubeDimensionID((String)newValue);
				return;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__SOURCE:
				setSource((MeasureGroupDimensionBinding)newValue);
				return;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__INTERMEDIATE_CUBE_DIMENSION_ID:
				setIntermediateCubeDimensionID((String)newValue);
				return;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__INTERMEDIATE_GRANULARITY_ATTRIBUTE_ID:
				setIntermediateGranularityAttributeID((String)newValue);
				return;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__MATERIALIZATION:
				setMaterialization((MaterializationType)newValue);
				return;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__PROCESSING_STATE:
				setProcessingState((ProcessingStateType)newValue);
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
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				setCubeDimensionID(CUBE_DIMENSION_ID_EDEFAULT);
				return;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__SOURCE:
				setSource((MeasureGroupDimensionBinding)null);
				return;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__INTERMEDIATE_CUBE_DIMENSION_ID:
				setIntermediateCubeDimensionID(INTERMEDIATE_CUBE_DIMENSION_ID_EDEFAULT);
				return;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__INTERMEDIATE_GRANULARITY_ATTRIBUTE_ID:
				setIntermediateGranularityAttributeID(INTERMEDIATE_GRANULARITY_ATTRIBUTE_ID_EDEFAULT);
				return;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__MATERIALIZATION:
				unsetMaterialization();
				return;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__PROCESSING_STATE:
				unsetProcessingState();
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
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				return CUBE_DIMENSION_ID_EDEFAULT == null ? cubeDimensionID != null : !CUBE_DIMENSION_ID_EDEFAULT.equals(cubeDimensionID);
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__SOURCE:
				return source != null;
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__INTERMEDIATE_CUBE_DIMENSION_ID:
				return INTERMEDIATE_CUBE_DIMENSION_ID_EDEFAULT == null ? intermediateCubeDimensionID != null : !INTERMEDIATE_CUBE_DIMENSION_ID_EDEFAULT.equals(intermediateCubeDimensionID);
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__INTERMEDIATE_GRANULARITY_ATTRIBUTE_ID:
				return INTERMEDIATE_GRANULARITY_ATTRIBUTE_ID_EDEFAULT == null ? intermediateGranularityAttributeID != null : !INTERMEDIATE_GRANULARITY_ATTRIBUTE_ID_EDEFAULT.equals(intermediateGranularityAttributeID);
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__MATERIALIZATION:
				return isSetMaterialization();
			case XmlaPackage.REFERENCE_MEASURE_GROUP_DIMENSION__PROCESSING_STATE:
				return isSetProcessingState();
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
		result.append(", intermediateCubeDimensionID: ");
		result.append(intermediateCubeDimensionID);
		result.append(", intermediateGranularityAttributeID: ");
		result.append(intermediateGranularityAttributeID);
		result.append(", materialization: ");
		if (materializationESet) result.append(materialization); else result.append("<unset>");
		result.append(", processingState: ");
		if (processingStateESet) result.append(processingState); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReferenceMeasureGroupDimensionImpl
