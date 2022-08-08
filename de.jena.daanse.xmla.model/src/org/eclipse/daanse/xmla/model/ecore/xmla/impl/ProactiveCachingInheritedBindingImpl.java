/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.NotificationTechniqueType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCachingInheritedBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proactive Caching Inherited Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProactiveCachingInheritedBindingImpl#getNotificationTechnique <em>Notification Technique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProactiveCachingInheritedBindingImpl extends ProactiveCachingObjectNotificationBindingImpl implements ProactiveCachingInheritedBinding {
	/**
	 * The default value of the '{@link #getNotificationTechnique() <em>Notification Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationTechnique()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationTechniqueType1 NOTIFICATION_TECHNIQUE_EDEFAULT = NotificationTechniqueType1.CLIENT;

	/**
	 * The cached value of the '{@link #getNotificationTechnique() <em>Notification Technique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationTechnique()
	 * @generated
	 * @ordered
	 */
	protected NotificationTechniqueType1 notificationTechnique = NOTIFICATION_TECHNIQUE_EDEFAULT;

	/**
	 * This is true if the Notification Technique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean notificationTechniqueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProactiveCachingInheritedBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PROACTIVE_CACHING_INHERITED_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationTechniqueType1 getNotificationTechnique() {
		return notificationTechnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotificationTechnique(NotificationTechniqueType1 newNotificationTechnique) {
		NotificationTechniqueType1 oldNotificationTechnique = notificationTechnique;
		notificationTechnique = newNotificationTechnique == null ? NOTIFICATION_TECHNIQUE_EDEFAULT : newNotificationTechnique;
		boolean oldNotificationTechniqueESet = notificationTechniqueESet;
		notificationTechniqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROACTIVE_CACHING_INHERITED_BINDING__NOTIFICATION_TECHNIQUE, oldNotificationTechnique, notificationTechnique, !oldNotificationTechniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNotificationTechnique() {
		NotificationTechniqueType1 oldNotificationTechnique = notificationTechnique;
		boolean oldNotificationTechniqueESet = notificationTechniqueESet;
		notificationTechnique = NOTIFICATION_TECHNIQUE_EDEFAULT;
		notificationTechniqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROACTIVE_CACHING_INHERITED_BINDING__NOTIFICATION_TECHNIQUE, oldNotificationTechnique, NOTIFICATION_TECHNIQUE_EDEFAULT, oldNotificationTechniqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNotificationTechnique() {
		return notificationTechniqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.PROACTIVE_CACHING_INHERITED_BINDING__NOTIFICATION_TECHNIQUE:
				return getNotificationTechnique();
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
			case XmlaPackage.PROACTIVE_CACHING_INHERITED_BINDING__NOTIFICATION_TECHNIQUE:
				setNotificationTechnique((NotificationTechniqueType1)newValue);
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
			case XmlaPackage.PROACTIVE_CACHING_INHERITED_BINDING__NOTIFICATION_TECHNIQUE:
				unsetNotificationTechnique();
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
			case XmlaPackage.PROACTIVE_CACHING_INHERITED_BINDING__NOTIFICATION_TECHNIQUE:
				return isSetNotificationTechnique();
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
		result.append(" (notificationTechnique: ");
		if (notificationTechniqueESet) result.append(notificationTechnique); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProactiveCachingInheritedBindingImpl
