/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributesType6;
import org.eclipse.daanse.xmla.model.ecore.xmla.CardinalityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupDimensionBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.RegularMeasureGroupDimension;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Measure Group Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RegularMeasureGroupDimensionImpl#getCubeDimensionID <em>Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RegularMeasureGroupDimensionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RegularMeasureGroupDimensionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RegularMeasureGroupDimensionImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.RegularMeasureGroupDimensionImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegularMeasureGroupDimensionImpl extends MeasureGroupDimensionImpl implements RegularMeasureGroupDimension {
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
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final CardinalityType CARDINALITY_EDEFAULT = CardinalityType.MANY;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected CardinalityType cardinality = CARDINALITY_EDEFAULT;

	/**
	 * This is true if the Cardinality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cardinalityESet;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected AttributesType6 attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularMeasureGroupDimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.REGULAR_MEASURE_GROUP_DIMENSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID, oldCubeDimensionID, cubeDimensionID));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ANNOTATIONS, newAnnotations, newAnnotations));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__SOURCE, oldSource, newSource);
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
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityType getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(CardinalityType newCardinality) {
		CardinalityType oldCardinality = cardinality;
		cardinality = newCardinality == null ? CARDINALITY_EDEFAULT : newCardinality;
		boolean oldCardinalityESet = cardinalityESet;
		cardinalityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__CARDINALITY, oldCardinality, cardinality, !oldCardinalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCardinality() {
		CardinalityType oldCardinality = cardinality;
		boolean oldCardinalityESet = cardinalityESet;
		cardinality = CARDINALITY_EDEFAULT;
		cardinalityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__CARDINALITY, oldCardinality, CARDINALITY_EDEFAULT, oldCardinalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCardinality() {
		return cardinalityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType6 getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(AttributesType6 newAttributes, NotificationChain msgs) {
		AttributesType6 oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(AttributesType6 newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__SOURCE:
				return basicSetSource(null, msgs);
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
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
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				return getCubeDimensionID();
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__SOURCE:
				return getSource();
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__CARDINALITY:
				return getCardinality();
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ATTRIBUTES:
				return getAttributes();
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
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				setCubeDimensionID((String)newValue);
				return;
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__SOURCE:
				setSource((MeasureGroupDimensionBinding)newValue);
				return;
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__CARDINALITY:
				setCardinality((CardinalityType)newValue);
				return;
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ATTRIBUTES:
				setAttributes((AttributesType6)newValue);
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
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				setCubeDimensionID(CUBE_DIMENSION_ID_EDEFAULT);
				return;
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__SOURCE:
				setSource((MeasureGroupDimensionBinding)null);
				return;
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__CARDINALITY:
				unsetCardinality();
				return;
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ATTRIBUTES:
				setAttributes((AttributesType6)null);
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
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__CUBE_DIMENSION_ID:
				return CUBE_DIMENSION_ID_EDEFAULT == null ? cubeDimensionID != null : !CUBE_DIMENSION_ID_EDEFAULT.equals(cubeDimensionID);
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__SOURCE:
				return source != null;
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__CARDINALITY:
				return isSetCardinality();
			case XmlaPackage.REGULAR_MEASURE_GROUP_DIMENSION__ATTRIBUTES:
				return attributes != null;
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
		result.append(", cardinality: ");
		if (cardinalityESet) result.append(cardinality); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RegularMeasureGroupDimensionImpl
