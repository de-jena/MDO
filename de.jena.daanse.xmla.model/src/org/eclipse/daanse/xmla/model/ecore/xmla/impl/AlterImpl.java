/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.Alter;
import org.eclipse.daanse.xmla.model.ecore.xmla.MajorObject;
import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectExpansion;
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
 * An implementation of the model object '<em><b>Alter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AlterImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AlterImpl#getObjectDefinition <em>Object Definition</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AlterImpl#isAllowCreate <em>Allow Create</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AlterImpl#getObjectExpansion <em>Object Expansion</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.AlterImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AlterImpl extends MinimalEObjectImpl.Container implements Alter {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected ObjectReference object;

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
	 * The default value of the '{@link #isAllowCreate() <em>Allow Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowCreate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_CREATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowCreate() <em>Allow Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowCreate()
	 * @generated
	 * @ordered
	 */
	protected boolean allowCreate = ALLOW_CREATE_EDEFAULT;

	/**
	 * This is true if the Allow Create attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowCreateESet;

	/**
	 * The default value of the '{@link #getObjectExpansion() <em>Object Expansion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectExpansion()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectExpansion OBJECT_EXPANSION_EDEFAULT = ObjectExpansion.OBJECT_PROPERTIES;

	/**
	 * The cached value of the '{@link #getObjectExpansion() <em>Object Expansion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectExpansion()
	 * @generated
	 * @ordered
	 */
	protected ObjectExpansion objectExpansion = OBJECT_EXPANSION_EDEFAULT;

	/**
	 * This is true if the Object Expansion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean objectExpansionESet;

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
	protected AlterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.ALTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectReference getObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(ObjectReference newObject, NotificationChain msgs) {
		ObjectReference oldObject = object;
		object = newObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.ALTER__OBJECT, oldObject, newObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(ObjectReference newObject) {
		if (newObject != object) {
			NotificationChain msgs = null;
			if (object != null)
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ALTER__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ALTER__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ALTER__OBJECT, newObject, newObject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.ALTER__OBJECT_DEFINITION, oldObjectDefinition, newObjectDefinition);
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
				msgs = ((InternalEObject)objectDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ALTER__OBJECT_DEFINITION, null, msgs);
			if (newObjectDefinition != null)
				msgs = ((InternalEObject)newObjectDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.ALTER__OBJECT_DEFINITION, null, msgs);
			msgs = basicSetObjectDefinition(newObjectDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ALTER__OBJECT_DEFINITION, newObjectDefinition, newObjectDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowCreate() {
		return allowCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowCreate(boolean newAllowCreate) {
		boolean oldAllowCreate = allowCreate;
		allowCreate = newAllowCreate;
		boolean oldAllowCreateESet = allowCreateESet;
		allowCreateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ALTER__ALLOW_CREATE, oldAllowCreate, allowCreate, !oldAllowCreateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowCreate() {
		boolean oldAllowCreate = allowCreate;
		boolean oldAllowCreateESet = allowCreateESet;
		allowCreate = ALLOW_CREATE_EDEFAULT;
		allowCreateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ALTER__ALLOW_CREATE, oldAllowCreate, ALLOW_CREATE_EDEFAULT, oldAllowCreateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowCreate() {
		return allowCreateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectExpansion getObjectExpansion() {
		return objectExpansion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectExpansion(ObjectExpansion newObjectExpansion) {
		ObjectExpansion oldObjectExpansion = objectExpansion;
		objectExpansion = newObjectExpansion == null ? OBJECT_EXPANSION_EDEFAULT : newObjectExpansion;
		boolean oldObjectExpansionESet = objectExpansionESet;
		objectExpansionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ALTER__OBJECT_EXPANSION, oldObjectExpansion, objectExpansion, !oldObjectExpansionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetObjectExpansion() {
		ObjectExpansion oldObjectExpansion = objectExpansion;
		boolean oldObjectExpansionESet = objectExpansionESet;
		objectExpansion = OBJECT_EXPANSION_EDEFAULT;
		objectExpansionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ALTER__OBJECT_EXPANSION, oldObjectExpansion, OBJECT_EXPANSION_EDEFAULT, oldObjectExpansionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetObjectExpansion() {
		return objectExpansionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.ALTER__SCOPE, oldScope, scope, !oldScopeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.ALTER__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
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
			case XmlaPackage.ALTER__OBJECT:
				return basicSetObject(null, msgs);
			case XmlaPackage.ALTER__OBJECT_DEFINITION:
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
			case XmlaPackage.ALTER__OBJECT:
				return getObject();
			case XmlaPackage.ALTER__OBJECT_DEFINITION:
				return getObjectDefinition();
			case XmlaPackage.ALTER__ALLOW_CREATE:
				return isAllowCreate();
			case XmlaPackage.ALTER__OBJECT_EXPANSION:
				return getObjectExpansion();
			case XmlaPackage.ALTER__SCOPE:
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
			case XmlaPackage.ALTER__OBJECT:
				setObject((ObjectReference)newValue);
				return;
			case XmlaPackage.ALTER__OBJECT_DEFINITION:
				setObjectDefinition((MajorObject)newValue);
				return;
			case XmlaPackage.ALTER__ALLOW_CREATE:
				setAllowCreate((Boolean)newValue);
				return;
			case XmlaPackage.ALTER__OBJECT_EXPANSION:
				setObjectExpansion((ObjectExpansion)newValue);
				return;
			case XmlaPackage.ALTER__SCOPE:
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
			case XmlaPackage.ALTER__OBJECT:
				setObject((ObjectReference)null);
				return;
			case XmlaPackage.ALTER__OBJECT_DEFINITION:
				setObjectDefinition((MajorObject)null);
				return;
			case XmlaPackage.ALTER__ALLOW_CREATE:
				unsetAllowCreate();
				return;
			case XmlaPackage.ALTER__OBJECT_EXPANSION:
				unsetObjectExpansion();
				return;
			case XmlaPackage.ALTER__SCOPE:
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
			case XmlaPackage.ALTER__OBJECT:
				return object != null;
			case XmlaPackage.ALTER__OBJECT_DEFINITION:
				return objectDefinition != null;
			case XmlaPackage.ALTER__ALLOW_CREATE:
				return isSetAllowCreate();
			case XmlaPackage.ALTER__OBJECT_EXPANSION:
				return isSetObjectExpansion();
			case XmlaPackage.ALTER__SCOPE:
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
		result.append(" (allowCreate: ");
		if (allowCreateESet) result.append(allowCreate); else result.append("<unset>");
		result.append(", objectExpansion: ");
		if (objectExpansionESet) result.append(objectExpansion); else result.append("<unset>");
		result.append(", scope: ");
		if (scopeESet) result.append(scope); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AlterImpl
