/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType51;
import org.eclipse.daanse.xmla.model.ecore.xmla.CubeHierarchy;
import org.eclipse.daanse.xmla.model.ecore.xmla.OptimizedStateType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cube Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeHierarchyImpl#getHierarchyID <em>Hierarchy ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeHierarchyImpl#getOptimizedState <em>Optimized State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeHierarchyImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeHierarchyImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CubeHierarchyImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CubeHierarchyImpl extends MinimalEObjectImpl.Container implements CubeHierarchy {
	/**
	 * The default value of the '{@link #getHierarchyID() <em>Hierarchy ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyID()
	 * @generated
	 * @ordered
	 */
	protected static final String HIERARCHY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHierarchyID() <em>Hierarchy ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchyID()
	 * @generated
	 * @ordered
	 */
	protected String hierarchyID = HIERARCHY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOptimizedState() <em>Optimized State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizedState()
	 * @generated
	 * @ordered
	 */
	protected static final OptimizedStateType OPTIMIZED_STATE_EDEFAULT = OptimizedStateType.FULLY_OPTIMIZED;

	/**
	 * The cached value of the '{@link #getOptimizedState() <em>Optimized State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizedState()
	 * @generated
	 * @ordered
	 */
	protected OptimizedStateType optimizedState = OPTIMIZED_STATE_EDEFAULT;

	/**
	 * This is true if the Optimized State attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optimizedStateESet;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * This is true if the Visible attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean visibleESet;

	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * This is true if the Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enabledESet;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType51 annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CubeHierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CUBE_HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHierarchyID() {
		return hierarchyID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchyID(String newHierarchyID) {
		String oldHierarchyID = hierarchyID;
		hierarchyID = newHierarchyID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_HIERARCHY__HIERARCHY_ID, oldHierarchyID, hierarchyID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizedStateType getOptimizedState() {
		return optimizedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptimizedState(OptimizedStateType newOptimizedState) {
		OptimizedStateType oldOptimizedState = optimizedState;
		optimizedState = newOptimizedState == null ? OPTIMIZED_STATE_EDEFAULT : newOptimizedState;
		boolean oldOptimizedStateESet = optimizedStateESet;
		optimizedStateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_HIERARCHY__OPTIMIZED_STATE, oldOptimizedState, optimizedState, !oldOptimizedStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptimizedState() {
		OptimizedStateType oldOptimizedState = optimizedState;
		boolean oldOptimizedStateESet = optimizedStateESet;
		optimizedState = OPTIMIZED_STATE_EDEFAULT;
		optimizedStateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_HIERARCHY__OPTIMIZED_STATE, oldOptimizedState, OPTIMIZED_STATE_EDEFAULT, oldOptimizedStateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOptimizedState() {
		return optimizedStateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		boolean oldVisibleESet = visibleESet;
		visibleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_HIERARCHY__VISIBLE, oldVisible, visible, !oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVisible() {
		boolean oldVisible = visible;
		boolean oldVisibleESet = visibleESet;
		visible = VISIBLE_EDEFAULT;
		visibleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_HIERARCHY__VISIBLE, oldVisible, VISIBLE_EDEFAULT, oldVisibleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVisible() {
		return visibleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		boolean oldEnabledESet = enabledESet;
		enabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_HIERARCHY__ENABLED, oldEnabled, enabled, !oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnabled() {
		boolean oldEnabled = enabled;
		boolean oldEnabledESet = enabledESet;
		enabled = ENABLED_EDEFAULT;
		enabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CUBE_HIERARCHY__ENABLED, oldEnabled, ENABLED_EDEFAULT, oldEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnabled() {
		return enabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType51 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType51 newAnnotations, NotificationChain msgs) {
		AnnotationsType51 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_HIERARCHY__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType51 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_HIERARCHY__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CUBE_HIERARCHY__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CUBE_HIERARCHY__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.CUBE_HIERARCHY__ANNOTATIONS:
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
			case XmlaPackage.CUBE_HIERARCHY__HIERARCHY_ID:
				return getHierarchyID();
			case XmlaPackage.CUBE_HIERARCHY__OPTIMIZED_STATE:
				return getOptimizedState();
			case XmlaPackage.CUBE_HIERARCHY__VISIBLE:
				return isVisible();
			case XmlaPackage.CUBE_HIERARCHY__ENABLED:
				return isEnabled();
			case XmlaPackage.CUBE_HIERARCHY__ANNOTATIONS:
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
			case XmlaPackage.CUBE_HIERARCHY__HIERARCHY_ID:
				setHierarchyID((String)newValue);
				return;
			case XmlaPackage.CUBE_HIERARCHY__OPTIMIZED_STATE:
				setOptimizedState((OptimizedStateType)newValue);
				return;
			case XmlaPackage.CUBE_HIERARCHY__VISIBLE:
				setVisible((Boolean)newValue);
				return;
			case XmlaPackage.CUBE_HIERARCHY__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case XmlaPackage.CUBE_HIERARCHY__ANNOTATIONS:
				setAnnotations((AnnotationsType51)newValue);
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
			case XmlaPackage.CUBE_HIERARCHY__HIERARCHY_ID:
				setHierarchyID(HIERARCHY_ID_EDEFAULT);
				return;
			case XmlaPackage.CUBE_HIERARCHY__OPTIMIZED_STATE:
				unsetOptimizedState();
				return;
			case XmlaPackage.CUBE_HIERARCHY__VISIBLE:
				unsetVisible();
				return;
			case XmlaPackage.CUBE_HIERARCHY__ENABLED:
				unsetEnabled();
				return;
			case XmlaPackage.CUBE_HIERARCHY__ANNOTATIONS:
				setAnnotations((AnnotationsType51)null);
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
			case XmlaPackage.CUBE_HIERARCHY__HIERARCHY_ID:
				return HIERARCHY_ID_EDEFAULT == null ? hierarchyID != null : !HIERARCHY_ID_EDEFAULT.equals(hierarchyID);
			case XmlaPackage.CUBE_HIERARCHY__OPTIMIZED_STATE:
				return isSetOptimizedState();
			case XmlaPackage.CUBE_HIERARCHY__VISIBLE:
				return isSetVisible();
			case XmlaPackage.CUBE_HIERARCHY__ENABLED:
				return isSetEnabled();
			case XmlaPackage.CUBE_HIERARCHY__ANNOTATIONS:
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
		result.append(" (hierarchyID: ");
		result.append(hierarchyID);
		result.append(", optimizedState: ");
		if (optimizedStateESet) result.append(optimizedState); else result.append("<unset>");
		result.append(", visible: ");
		if (visibleESet) result.append(visible); else result.append("<unset>");
		result.append(", enabled: ");
		if (enabledESet) result.append(enabled); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CubeHierarchyImpl
