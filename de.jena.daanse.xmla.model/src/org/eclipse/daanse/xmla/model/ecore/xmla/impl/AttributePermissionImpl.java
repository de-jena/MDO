/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Permission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributePermissionImpl#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributePermissionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributePermissionImpl#getDefaultMember <em>Default Member</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributePermissionImpl#getVisualTotals <em>Visual Totals</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributePermissionImpl#getAllowedSet <em>Allowed Set</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributePermissionImpl#getDeniedSet <em>Denied Set</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AttributePermissionImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributePermissionImpl extends MinimalEObjectImpl.Container implements AttributePermission {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultMember() <em>Default Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMember()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_MEMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultMember() <em>Default Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMember()
	 * @generated
	 * @ordered
	 */
	protected String defaultMember = DEFAULT_MEMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVisualTotals() <em>Visual Totals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualTotals()
	 * @generated
	 * @ordered
	 */
	protected static final String VISUAL_TOTALS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVisualTotals() <em>Visual Totals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualTotals()
	 * @generated
	 * @ordered
	 */
	protected String visualTotals = VISUAL_TOTALS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowedSet() <em>Allowed Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedSet()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedSet() <em>Allowed Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedSet()
	 * @generated
	 * @ordered
	 */
	protected String allowedSet = ALLOWED_SET_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeniedSet() <em>Denied Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeniedSet()
	 * @generated
	 * @ordered
	 */
	protected static final String DENIED_SET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeniedSet() <em>Denied Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeniedSet()
	 * @generated
	 * @ordered
	 */
	protected String deniedSet = DENIED_SET_EDEFAULT;

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
	protected AttributePermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.ATTRIBUTE_PERMISSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_PERMISSION__ATTRIBUTE_ID, oldAttributeID, attributeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_PERMISSION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultMember() {
		return defaultMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultMember(String newDefaultMember) {
		String oldDefaultMember = defaultMember;
		defaultMember = newDefaultMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_PERMISSION__DEFAULT_MEMBER, oldDefaultMember, defaultMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVisualTotals() {
		return visualTotals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisualTotals(String newVisualTotals) {
		String oldVisualTotals = visualTotals;
		visualTotals = newVisualTotals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_PERMISSION__VISUAL_TOTALS, oldVisualTotals, visualTotals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowedSet() {
		return allowedSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedSet(String newAllowedSet) {
		String oldAllowedSet = allowedSet;
		allowedSet = newAllowedSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_PERMISSION__ALLOWED_SET, oldAllowedSet, allowedSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeniedSet() {
		return deniedSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeniedSet(String newDeniedSet) {
		String oldDeniedSet = deniedSet;
		deniedSet = newDeniedSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_PERMISSION__DENIED_SET, oldDeniedSet, deniedSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_PERMISSION__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ATTRIBUTE_PERMISSION__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ATTRIBUTE_PERMISSION__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ATTRIBUTE_PERMISSION__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.ATTRIBUTE_PERMISSION__ANNOTATIONS:
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
			case XmlaPackage.ATTRIBUTE_PERMISSION__ATTRIBUTE_ID:
				return getAttributeID();
			case XmlaPackage.ATTRIBUTE_PERMISSION__DESCRIPTION:
				return getDescription();
			case XmlaPackage.ATTRIBUTE_PERMISSION__DEFAULT_MEMBER:
				return getDefaultMember();
			case XmlaPackage.ATTRIBUTE_PERMISSION__VISUAL_TOTALS:
				return getVisualTotals();
			case XmlaPackage.ATTRIBUTE_PERMISSION__ALLOWED_SET:
				return getAllowedSet();
			case XmlaPackage.ATTRIBUTE_PERMISSION__DENIED_SET:
				return getDeniedSet();
			case XmlaPackage.ATTRIBUTE_PERMISSION__ANNOTATIONS:
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
			case XmlaPackage.ATTRIBUTE_PERMISSION__ATTRIBUTE_ID:
				setAttributeID((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_PERMISSION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_PERMISSION__DEFAULT_MEMBER:
				setDefaultMember((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_PERMISSION__VISUAL_TOTALS:
				setVisualTotals((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_PERMISSION__ALLOWED_SET:
				setAllowedSet((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_PERMISSION__DENIED_SET:
				setDeniedSet((String)newValue);
				return;
			case XmlaPackage.ATTRIBUTE_PERMISSION__ANNOTATIONS:
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
			case XmlaPackage.ATTRIBUTE_PERMISSION__ATTRIBUTE_ID:
				setAttributeID(ATTRIBUTE_ID_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_PERMISSION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_PERMISSION__DEFAULT_MEMBER:
				setDefaultMember(DEFAULT_MEMBER_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_PERMISSION__VISUAL_TOTALS:
				setVisualTotals(VISUAL_TOTALS_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_PERMISSION__ALLOWED_SET:
				setAllowedSet(ALLOWED_SET_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_PERMISSION__DENIED_SET:
				setDeniedSet(DENIED_SET_EDEFAULT);
				return;
			case XmlaPackage.ATTRIBUTE_PERMISSION__ANNOTATIONS:
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
			case XmlaPackage.ATTRIBUTE_PERMISSION__ATTRIBUTE_ID:
				return ATTRIBUTE_ID_EDEFAULT == null ? attributeID != null : !ATTRIBUTE_ID_EDEFAULT.equals(attributeID);
			case XmlaPackage.ATTRIBUTE_PERMISSION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.ATTRIBUTE_PERMISSION__DEFAULT_MEMBER:
				return DEFAULT_MEMBER_EDEFAULT == null ? defaultMember != null : !DEFAULT_MEMBER_EDEFAULT.equals(defaultMember);
			case XmlaPackage.ATTRIBUTE_PERMISSION__VISUAL_TOTALS:
				return VISUAL_TOTALS_EDEFAULT == null ? visualTotals != null : !VISUAL_TOTALS_EDEFAULT.equals(visualTotals);
			case XmlaPackage.ATTRIBUTE_PERMISSION__ALLOWED_SET:
				return ALLOWED_SET_EDEFAULT == null ? allowedSet != null : !ALLOWED_SET_EDEFAULT.equals(allowedSet);
			case XmlaPackage.ATTRIBUTE_PERMISSION__DENIED_SET:
				return DENIED_SET_EDEFAULT == null ? deniedSet != null : !DENIED_SET_EDEFAULT.equals(deniedSet);
			case XmlaPackage.ATTRIBUTE_PERMISSION__ANNOTATIONS:
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
		result.append(", description: ");
		result.append(description);
		result.append(", defaultMember: ");
		result.append(defaultMember);
		result.append(", visualTotals: ");
		result.append(visualTotals);
		result.append(", allowedSet: ");
		result.append(allowedSet);
		result.append(", deniedSet: ");
		result.append(deniedSet);
		result.append(')');
		return result.toString();
	}

} //AttributePermissionImpl
