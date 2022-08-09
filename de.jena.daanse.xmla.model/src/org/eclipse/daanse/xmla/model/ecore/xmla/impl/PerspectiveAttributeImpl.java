/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perspective Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveAttributeImpl#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveAttributeImpl#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveAttributeImpl#getDefaultMember <em>Default Member</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.PerspectiveAttributeImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerspectiveAttributeImpl extends MinimalEObjectImpl.Container implements PerspectiveAttribute {
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
	protected PerspectiveAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PERSPECTIVE_ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_ATTRIBUTE__ATTRIBUTE_ID, oldAttributeID, attributeID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE, oldAttributeHierarchyVisible, attributeHierarchyVisible, !oldAttributeHierarchyVisibleESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PERSPECTIVE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE, oldAttributeHierarchyVisible, ATTRIBUTE_HIERARCHY_VISIBLE_EDEFAULT, oldAttributeHierarchyVisibleESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_ATTRIBUTE__DEFAULT_MEMBER, oldDefaultMember, defaultMember));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_ATTRIBUTE__ANNOTATIONS, oldAnnotations, newAnnotations);
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
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE_ATTRIBUTE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PERSPECTIVE_ATTRIBUTE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PERSPECTIVE_ATTRIBUTE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ANNOTATIONS:
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
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ATTRIBUTE_ID:
				return getAttributeID();
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE:
				return isAttributeHierarchyVisible();
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__DEFAULT_MEMBER:
				return getDefaultMember();
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ANNOTATIONS:
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
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ATTRIBUTE_ID:
				setAttributeID((String)newValue);
				return;
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE:
				setAttributeHierarchyVisible((Boolean)newValue);
				return;
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__DEFAULT_MEMBER:
				setDefaultMember((String)newValue);
				return;
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ANNOTATIONS:
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
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ATTRIBUTE_ID:
				setAttributeID(ATTRIBUTE_ID_EDEFAULT);
				return;
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE:
				unsetAttributeHierarchyVisible();
				return;
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__DEFAULT_MEMBER:
				setDefaultMember(DEFAULT_MEMBER_EDEFAULT);
				return;
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ANNOTATIONS:
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
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ATTRIBUTE_ID:
				return ATTRIBUTE_ID_EDEFAULT == null ? attributeID != null : !ATTRIBUTE_ID_EDEFAULT.equals(attributeID);
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ATTRIBUTE_HIERARCHY_VISIBLE:
				return isSetAttributeHierarchyVisible();
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__DEFAULT_MEMBER:
				return DEFAULT_MEMBER_EDEFAULT == null ? defaultMember != null : !DEFAULT_MEMBER_EDEFAULT.equals(defaultMember);
			case XmlaPackage.PERSPECTIVE_ATTRIBUTE__ANNOTATIONS:
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
		result.append(", attributeHierarchyVisible: ");
		if (attributeHierarchyVisibleESet) result.append(attributeHierarchyVisible); else result.append("<unset>");
		result.append(", defaultMember: ");
		result.append(defaultMember);
		result.append(')');
		return result.toString();
	}

} //PerspectiveAttributeImpl
