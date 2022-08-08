/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AggregationUsageType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType3;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributeHierarchyOptimizedStateType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubeAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cube Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeAttributeImpl#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeAttributeImpl#getAggregationUsage <em>Aggregation Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeAttributeImpl#getAttributeHierarchyOptimizedState <em>Attribute Hierarchy Optimized State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeAttributeImpl#isAttributeHierarchyEnabled <em>Attribute Hierarchy Enabled</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeAttributeImpl#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeAttributeImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubeAttributeImpl extends MinimalEObjectImpl.Container implements CubeAttribute {
	/**
	 * The default value of the '{@link #getAttributeID() <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeID()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeID() <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeID()
	 * @generated
	 * @ordered
	 */
	protected String attributeID = ATTRIBUTE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregationUsage() <em>Aggregation Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationUsage()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationUsageType AGGREGATION_USAGE_EDEFAULT = AggregationUsageType.FULL;

	/**
	 * The cached value of the '{@link #getAggregationUsage() <em>Aggregation Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationUsage()
	 * @generated
	 * @ordered
	 */
	protected AggregationUsageType aggregationUsage = AGGREGATION_USAGE_EDEFAULT;

	/**
	 * This is true if the Aggregation Usage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aggregationUsageESet;

	/**
	 * The default value of the '{@link #getAttributeHierarchyOptimizedState() <em>Attribute Hierarchy Optimized State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeHierarchyOptimizedState()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeHierarchyOptimizedStateType1 ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_EDEFAULT = AttributeHierarchyOptimizedStateType1.FULLY_OPTIMIZED;

	/**
	 * The cached value of the '{@link #getAttributeHierarchyOptimizedState() <em>Attribute Hierarchy Optimized State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeHierarchyOptimizedState()
	 * @generated
	 * @ordered
	 */
	protected AttributeHierarchyOptimizedStateType1 attributeHierarchyOptimizedState = ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_EDEFAULT;

	/**
	 * This is true if the Attribute Hierarchy Optimized State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyOptimizedStateESet;

	/**
	 * The default value of the '{@link #isAttributeHierarchyEnabled() <em>Attribute Hierarchy Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeHierarchyEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTRIBUTE_HIERARCHY_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAttributeHierarchyEnabled() <em>Attribute Hierarchy Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeHierarchyEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyEnabled = ATTRIBUTE_HIERARCHY_ENABLED_EDEFAULT;

	/**
	 * This is true if the Attribute Hierarchy Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyEnabledESet;

	/**
	 * The default value of the '{@link #isAttributeHierarchyVisible() <em>Attribute Hierarchy Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeHierarchyVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTRIBUTE_HIERARCHY_VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAttributeHierarchyVisible() <em>Attribute Hierarchy Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttributeHierarchyVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyVisible = ATTRIBUTE_HIERARCHY_VISIBLE_EDEFAULT;

	/**
	 * This is true if the Attribute Hierarchy Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attributeHierarchyVisibleESet;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType3 annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CUBE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeID() {
		return attributeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeID(String newAttributeID) {
		String oldAttributeID = attributeID;
		attributeID = newAttributeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_ID, oldAttributeID, attributeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationUsageType getAggregationUsage() {
		return aggregationUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationUsage(AggregationUsageType newAggregationUsage) {
		AggregationUsageType oldAggregationUsage = aggregationUsage;
		aggregationUsage = newAggregationUsage == null ? AGGREGATION_USAGE_EDEFAULT : newAggregationUsage;
		boolean oldAggregationUsageESet = aggregationUsageESet;
		aggregationUsageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_ATTRIBUTE__AGGREGATION_USAGE, oldAggregationUsage, aggregationUsage, !oldAggregationUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAggregationUsage() {
		AggregationUsageType oldAggregationUsage = aggregationUsage;
		boolean oldAggregationUsageESet = aggregationUsageESet;
		aggregationUsage = AGGREGATION_USAGE_EDEFAULT;
		aggregationUsageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_ATTRIBUTE__AGGREGATION_USAGE, oldAggregationUsage, AGGREGATION_USAGE_EDEFAULT, oldAggregationUsageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAggregationUsage() {
		return aggregationUsageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeHierarchyOptimizedStateType1 getAttributeHierarchyOptimizedState() {
		return attributeHierarchyOptimizedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeHierarchyOptimizedState(AttributeHierarchyOptimizedStateType1 newAttributeHierarchyOptimizedState) {
		AttributeHierarchyOptimizedStateType1 oldAttributeHierarchyOptimizedState = attributeHierarchyOptimizedState;
		attributeHierarchyOptimizedState = newAttributeHierarchyOptimizedState == null ? ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_EDEFAULT : newAttributeHierarchyOptimizedState;
		boolean oldAttributeHierarchyOptimizedStateESet = attributeHierarchyOptimizedStateESet;
		attributeHierarchyOptimizedStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE, oldAttributeHierarchyOptimizedState, attributeHierarchyOptimizedState, !oldAttributeHierarchyOptimizedStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeHierarchyOptimizedState() {
		AttributeHierarchyOptimizedStateType1 oldAttributeHierarchyOptimizedState = attributeHierarchyOptimizedState;
		boolean oldAttributeHierarchyOptimizedStateESet = attributeHierarchyOptimizedStateESet;
		attributeHierarchyOptimizedState = ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_EDEFAULT;
		attributeHierarchyOptimizedStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE, oldAttributeHierarchyOptimizedState, ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE_EDEFAULT, oldAttributeHierarchyOptimizedStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeHierarchyOptimizedState() {
		return attributeHierarchyOptimizedStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttributeHierarchyEnabled() {
		return attributeHierarchyEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeHierarchyEnabled(boolean newAttributeHierarchyEnabled) {
		boolean oldAttributeHierarchyEnabled = attributeHierarchyEnabled;
		attributeHierarchyEnabled = newAttributeHierarchyEnabled;
		boolean oldAttributeHierarchyEnabledESet = attributeHierarchyEnabledESet;
		attributeHierarchyEnabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ENABLED, oldAttributeHierarchyEnabled, attributeHierarchyEnabled, !oldAttributeHierarchyEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeHierarchyEnabled() {
		boolean oldAttributeHierarchyEnabled = attributeHierarchyEnabled;
		boolean oldAttributeHierarchyEnabledESet = attributeHierarchyEnabledESet;
		attributeHierarchyEnabled = ATTRIBUTE_HIERARCHY_ENABLED_EDEFAULT;
		attributeHierarchyEnabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ENABLED, oldAttributeHierarchyEnabled, ATTRIBUTE_HIERARCHY_ENABLED_EDEFAULT, oldAttributeHierarchyEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeHierarchyEnabled() {
		return attributeHierarchyEnabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttributeHierarchyVisible() {
		return attributeHierarchyVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeHierarchyVisible(boolean newAttributeHierarchyVisible) {
		boolean oldAttributeHierarchyVisible = attributeHierarchyVisible;
		attributeHierarchyVisible = newAttributeHierarchyVisible;
		boolean oldAttributeHierarchyVisibleESet = attributeHierarchyVisibleESet;
		attributeHierarchyVisibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE, oldAttributeHierarchyVisible, attributeHierarchyVisible, !oldAttributeHierarchyVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttributeHierarchyVisible() {
		boolean oldAttributeHierarchyVisible = attributeHierarchyVisible;
		boolean oldAttributeHierarchyVisibleESet = attributeHierarchyVisibleESet;
		attributeHierarchyVisible = ATTRIBUTE_HIERARCHY_VISIBLE_EDEFAULT;
		attributeHierarchyVisibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE, oldAttributeHierarchyVisible, ATTRIBUTE_HIERARCHY_VISIBLE_EDEFAULT, oldAttributeHierarchyVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttributeHierarchyVisible() {
		return attributeHierarchyVisibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType3 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType3 newAnnotations, NotificationChain msgs) {
		AnnotationsType3 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_ATTRIBUTE__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType3 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_ATTRIBUTE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_ATTRIBUTE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_ATTRIBUTE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.CUBE_ATTRIBUTE__ANNOTATIONS:
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
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_ID:
				return getAttributeID();
			case XmlaPackage.CUBE_ATTRIBUTE__AGGREGATION_USAGE:
				return getAggregationUsage();
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE:
				return getAttributeHierarchyOptimizedState();
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ENABLED:
				return isAttributeHierarchyEnabled();
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE:
				return isAttributeHierarchyVisible();
			case XmlaPackage.CUBE_ATTRIBUTE__ANNOTATIONS:
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
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_ID:
				setAttributeID((String)newValue);
				return;
			case XmlaPackage.CUBE_ATTRIBUTE__AGGREGATION_USAGE:
				setAggregationUsage((AggregationUsageType)newValue);
				return;
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE:
				setAttributeHierarchyOptimizedState((AttributeHierarchyOptimizedStateType1)newValue);
				return;
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ENABLED:
				setAttributeHierarchyEnabled((Boolean)newValue);
				return;
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE:
				setAttributeHierarchyVisible((Boolean)newValue);
				return;
			case XmlaPackage.CUBE_ATTRIBUTE__ANNOTATIONS:
				setAnnotations((AnnotationsType3)newValue);
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
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_ID:
				setAttributeID(ATTRIBUTE_ID_EDEFAULT);
				return;
			case XmlaPackage.CUBE_ATTRIBUTE__AGGREGATION_USAGE:
				unsetAggregationUsage();
				return;
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE:
				unsetAttributeHierarchyOptimizedState();
				return;
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ENABLED:
				unsetAttributeHierarchyEnabled();
				return;
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE:
				unsetAttributeHierarchyVisible();
				return;
			case XmlaPackage.CUBE_ATTRIBUTE__ANNOTATIONS:
				setAnnotations((AnnotationsType3)null);
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
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_ID:
				return ATTRIBUTE_ID_EDEFAULT == null ? attributeID != null : !ATTRIBUTE_ID_EDEFAULT.equals(attributeID);
			case XmlaPackage.CUBE_ATTRIBUTE__AGGREGATION_USAGE:
				return isSetAggregationUsage();
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_OPTIMIZED_STATE:
				return isSetAttributeHierarchyOptimizedState();
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_ENABLED:
				return isSetAttributeHierarchyEnabled();
			case XmlaPackage.CUBE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE:
				return isSetAttributeHierarchyVisible();
			case XmlaPackage.CUBE_ATTRIBUTE__ANNOTATIONS:
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
		result.append(" (attributeID: ");
		result.append(attributeID);
		result.append(", aggregationUsage: ");
		if (aggregationUsageESet) result.append(aggregationUsage); else result.append("<unset>");
		result.append(", attributeHierarchyOptimizedState: ");
		if (attributeHierarchyOptimizedStateESet) result.append(attributeHierarchyOptimizedState); else result.append("<unset>");
		result.append(", attributeHierarchyEnabled: ");
		if (attributeHierarchyEnabledESet) result.append(attributeHierarchyEnabled); else result.append("<unset>");
		result.append(", attributeHierarchyVisible: ");
		if (attributeHierarchyVisibleESet) result.append(attributeHierarchyVisible); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CubeAttributeImpl
