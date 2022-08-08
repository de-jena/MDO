/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.Create;
import org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject;
import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference;
import org.eclipse.daanse.xmla.model.ecore.xmla.Scope;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CreateImpl#getParentObject <em>Parent Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CreateImpl#getObjectDefinition <em>Object Definition</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CreateImpl#isAllowOverwrite <em>Allow Overwrite</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.CreateImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateImpl extends MinimalEObjectImpl.Container implements Create {
	/**
	 * The cached value of the '{@link #getParentObject() <em>Parent Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentObject()
	 * @generated
	 * @ordered
	 */
	protected ObjectReference parentObject;

	/**
	 * The cached value of the '{@link #getObjectDefinition() <em>Object Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectDefinition()
	 * @generated
	 * @ordered
	 */
	protected MajorObject objectDefinition;

	/**
	 * The default value of the '{@link #isAllowOverwrite() <em>Allow Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowOverwrite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_OVERWRITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowOverwrite() <em>Allow Overwrite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowOverwrite()
	 * @generated
	 * @ordered
	 */
	protected boolean allowOverwrite = ALLOW_OVERWRITE_EDEFAULT;

	/**
	 * This is true if the Allow Overwrite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowOverwriteESet;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final Scope SCOPE_EDEFAULT = Scope.SESSION;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope = SCOPE_EDEFAULT;

	/**
	 * This is true if the Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scopeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CREATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectReference getParentObject() {
		return parentObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentObject(ObjectReference newParentObject, NotificationChain msgs) {
		ObjectReference oldParentObject = parentObject;
		parentObject = newParentObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CREATE__PARENT_OBJECT, oldParentObject, newParentObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentObject(ObjectReference newParentObject) {
		if (newParentObject != parentObject) {
			NotificationChain msgs = null;
			if (parentObject != null)
				msgs = ((InternalEObject)parentObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CREATE__PARENT_OBJECT, null, msgs);
			if (newParentObject != null)
				msgs = ((InternalEObject)newParentObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CREATE__PARENT_OBJECT, null, msgs);
			msgs = basicSetParentObject(newParentObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CREATE__PARENT_OBJECT, newParentObject, newParentObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajorObject getObjectDefinition() {
		return objectDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectDefinition(MajorObject newObjectDefinition, NotificationChain msgs) {
		MajorObject oldObjectDefinition = objectDefinition;
		objectDefinition = newObjectDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.CREATE__OBJECT_DEFINITION, oldObjectDefinition, newObjectDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectDefinition(MajorObject newObjectDefinition) {
		if (newObjectDefinition != objectDefinition) {
			NotificationChain msgs = null;
			if (objectDefinition != null)
				msgs = ((InternalEObject)objectDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CREATE__OBJECT_DEFINITION, null, msgs);
			if (newObjectDefinition != null)
				msgs = ((InternalEObject)newObjectDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.CREATE__OBJECT_DEFINITION, null, msgs);
			msgs = basicSetObjectDefinition(newObjectDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CREATE__OBJECT_DEFINITION, newObjectDefinition, newObjectDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowOverwrite() {
		return allowOverwrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowOverwrite(boolean newAllowOverwrite) {
		boolean oldAllowOverwrite = allowOverwrite;
		allowOverwrite = newAllowOverwrite;
		boolean oldAllowOverwriteESet = allowOverwriteESet;
		allowOverwriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CREATE__ALLOW_OVERWRITE, oldAllowOverwrite, allowOverwrite, !oldAllowOverwriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowOverwrite() {
		boolean oldAllowOverwrite = allowOverwrite;
		boolean oldAllowOverwriteESet = allowOverwriteESet;
		allowOverwrite = ALLOW_OVERWRITE_EDEFAULT;
		allowOverwriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CREATE__ALLOW_OVERWRITE, oldAllowOverwrite, ALLOW_OVERWRITE_EDEFAULT, oldAllowOverwriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowOverwrite() {
		return allowOverwriteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		Scope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		boolean oldScopeESet = scopeESet;
		scopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.CREATE__SCOPE, oldScope, scope, !oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScope() {
		Scope oldScope = scope;
		boolean oldScopeESet = scopeESet;
		scope = SCOPE_EDEFAULT;
		scopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.CREATE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScope() {
		return scopeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.CREATE__PARENT_OBJECT:
				return basicSetParentObject(null, msgs);
			case XmlaPackage.CREATE__OBJECT_DEFINITION:
				return basicSetObjectDefinition(null, msgs);
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
			case XmlaPackage.CREATE__PARENT_OBJECT:
				return getParentObject();
			case XmlaPackage.CREATE__OBJECT_DEFINITION:
				return getObjectDefinition();
			case XmlaPackage.CREATE__ALLOW_OVERWRITE:
				return isAllowOverwrite();
			case XmlaPackage.CREATE__SCOPE:
				return getScope();
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
			case XmlaPackage.CREATE__PARENT_OBJECT:
				setParentObject((ObjectReference)newValue);
				return;
			case XmlaPackage.CREATE__OBJECT_DEFINITION:
				setObjectDefinition((MajorObject)newValue);
				return;
			case XmlaPackage.CREATE__ALLOW_OVERWRITE:
				setAllowOverwrite((Boolean)newValue);
				return;
			case XmlaPackage.CREATE__SCOPE:
				setScope((Scope)newValue);
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
			case XmlaPackage.CREATE__PARENT_OBJECT:
				setParentObject((ObjectReference)null);
				return;
			case XmlaPackage.CREATE__OBJECT_DEFINITION:
				setObjectDefinition((MajorObject)null);
				return;
			case XmlaPackage.CREATE__ALLOW_OVERWRITE:
				unsetAllowOverwrite();
				return;
			case XmlaPackage.CREATE__SCOPE:
				unsetScope();
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
			case XmlaPackage.CREATE__PARENT_OBJECT:
				return parentObject != null;
			case XmlaPackage.CREATE__OBJECT_DEFINITION:
				return objectDefinition != null;
			case XmlaPackage.CREATE__ALLOW_OVERWRITE:
				return isSetAllowOverwrite();
			case XmlaPackage.CREATE__SCOPE:
				return isSetScope();
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
		result.append(" (allowOverwrite: ");
		if (allowOverwriteESet) result.append(allowOverwrite); else result.append("<unset>");
		result.append(", scope: ");
		if (scopeESet) result.append(scope); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CreateImpl
