/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.Bindings;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSource;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceView;
import org.eclipse.daanse.xmla.model.ecore.xmla.ErrorConfiguration;
import org.eclipse.daanse.xmla.model.ecore.xmla.ObjectReference;
import org.eclipse.daanse.xmla.model.ecore.xmla.TypeType7;
import org.eclipse.daanse.xmla.model.ecore.xmla.WriteBackTableCreation;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProcessImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProcessImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProcessImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProcessImpl#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProcessImpl#getDataSourceView <em>Data Source View</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProcessImpl#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ProcessImpl#getWriteBackTableCreation <em>Write Back Table Creation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends MinimalEObjectImpl.Container implements org.eclipse.daanse.xmla.model.ecore.xmla.Process {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TypeType7 TYPE_EDEFAULT = TypeType7.PROCESS_FULL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeType7 type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

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
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected Bindings bindings;

	/**
	 * The cached value of the '{@link #getDataSource() <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSource()
	 * @generated
	 * @ordered
	 */
	protected DataSource dataSource;

	/**
	 * The cached value of the '{@link #getDataSourceView() <em>Data Source View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceView()
	 * @generated
	 * @ordered
	 */
	protected DataSourceView dataSourceView;

	/**
	 * The cached value of the '{@link #getErrorConfiguration() <em>Error Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ErrorConfiguration errorConfiguration;

	/**
	 * The default value of the '{@link #getWriteBackTableCreation() <em>Write Back Table Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBackTableCreation()
	 * @generated
	 * @ordered
	 */
	protected static final WriteBackTableCreation WRITE_BACK_TABLE_CREATION_EDEFAULT = WriteBackTableCreation.CREATE;

	/**
	 * The cached value of the '{@link #getWriteBackTableCreation() <em>Write Back Table Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteBackTableCreation()
	 * @generated
	 * @ordered
	 */
	protected WriteBackTableCreation writeBackTableCreation = WRITE_BACK_TABLE_CREATION_EDEFAULT;

	/**
	 * This is true if the Write Back Table Creation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean writeBackTableCreationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType7 getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeType7 newType) {
		TypeType7 oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROCESS__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TypeType7 oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROCESS__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PROCESS__OBJECT, oldObject, newObject);
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
				msgs = ((InternalEObject)object).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROCESS__OBJECT, null, msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROCESS__OBJECT, null, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROCESS__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bindings getBindings() {
		return bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindings(Bindings newBindings, NotificationChain msgs) {
		Bindings oldBindings = bindings;
		bindings = newBindings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PROCESS__BINDINGS, oldBindings, newBindings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindings(Bindings newBindings) {
		if (newBindings != bindings) {
			NotificationChain msgs = null;
			if (bindings != null)
				msgs = ((InternalEObject)bindings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROCESS__BINDINGS, null, msgs);
			if (newBindings != null)
				msgs = ((InternalEObject)newBindings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROCESS__BINDINGS, null, msgs);
			msgs = basicSetBindings(newBindings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROCESS__BINDINGS, newBindings, newBindings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSource(DataSource newDataSource, NotificationChain msgs) {
		DataSource oldDataSource = dataSource;
		dataSource = newDataSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PROCESS__DATA_SOURCE, oldDataSource, newDataSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSource(DataSource newDataSource) {
		if (newDataSource != dataSource) {
			NotificationChain msgs = null;
			if (dataSource != null)
				msgs = ((InternalEObject)dataSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROCESS__DATA_SOURCE, null, msgs);
			if (newDataSource != null)
				msgs = ((InternalEObject)newDataSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROCESS__DATA_SOURCE, null, msgs);
			msgs = basicSetDataSource(newDataSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROCESS__DATA_SOURCE, newDataSource, newDataSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceView getDataSourceView() {
		return dataSourceView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSourceView(DataSourceView newDataSourceView, NotificationChain msgs) {
		DataSourceView oldDataSourceView = dataSourceView;
		dataSourceView = newDataSourceView;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PROCESS__DATA_SOURCE_VIEW, oldDataSourceView, newDataSourceView);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceView(DataSourceView newDataSourceView) {
		if (newDataSourceView != dataSourceView) {
			NotificationChain msgs = null;
			if (dataSourceView != null)
				msgs = ((InternalEObject)dataSourceView).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROCESS__DATA_SOURCE_VIEW, null, msgs);
			if (newDataSourceView != null)
				msgs = ((InternalEObject)newDataSourceView).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROCESS__DATA_SOURCE_VIEW, null, msgs);
			msgs = basicSetDataSourceView(newDataSourceView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROCESS__DATA_SOURCE_VIEW, newDataSourceView, newDataSourceView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorConfiguration getErrorConfiguration() {
		return errorConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorConfiguration(ErrorConfiguration newErrorConfiguration, NotificationChain msgs) {
		ErrorConfiguration oldErrorConfiguration = errorConfiguration;
		errorConfiguration = newErrorConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.PROCESS__ERROR_CONFIGURATION, oldErrorConfiguration, newErrorConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorConfiguration(ErrorConfiguration newErrorConfiguration) {
		if (newErrorConfiguration != errorConfiguration) {
			NotificationChain msgs = null;
			if (errorConfiguration != null)
				msgs = ((InternalEObject)errorConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROCESS__ERROR_CONFIGURATION, null, msgs);
			if (newErrorConfiguration != null)
				msgs = ((InternalEObject)newErrorConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.PROCESS__ERROR_CONFIGURATION, null, msgs);
			msgs = basicSetErrorConfiguration(newErrorConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROCESS__ERROR_CONFIGURATION, newErrorConfiguration, newErrorConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteBackTableCreation getWriteBackTableCreation() {
		return writeBackTableCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteBackTableCreation(WriteBackTableCreation newWriteBackTableCreation) {
		WriteBackTableCreation oldWriteBackTableCreation = writeBackTableCreation;
		writeBackTableCreation = newWriteBackTableCreation == null ? WRITE_BACK_TABLE_CREATION_EDEFAULT : newWriteBackTableCreation;
		boolean oldWriteBackTableCreationESet = writeBackTableCreationESet;
		writeBackTableCreationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.PROCESS__WRITE_BACK_TABLE_CREATION, oldWriteBackTableCreation, writeBackTableCreation, !oldWriteBackTableCreationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWriteBackTableCreation() {
		WriteBackTableCreation oldWriteBackTableCreation = writeBackTableCreation;
		boolean oldWriteBackTableCreationESet = writeBackTableCreationESet;
		writeBackTableCreation = WRITE_BACK_TABLE_CREATION_EDEFAULT;
		writeBackTableCreationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.PROCESS__WRITE_BACK_TABLE_CREATION, oldWriteBackTableCreation, WRITE_BACK_TABLE_CREATION_EDEFAULT, oldWriteBackTableCreationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWriteBackTableCreation() {
		return writeBackTableCreationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.PROCESS__OBJECT:
				return basicSetObject(null, msgs);
			case XmlaPackage.PROCESS__BINDINGS:
				return basicSetBindings(null, msgs);
			case XmlaPackage.PROCESS__DATA_SOURCE:
				return basicSetDataSource(null, msgs);
			case XmlaPackage.PROCESS__DATA_SOURCE_VIEW:
				return basicSetDataSourceView(null, msgs);
			case XmlaPackage.PROCESS__ERROR_CONFIGURATION:
				return basicSetErrorConfiguration(null, msgs);
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
			case XmlaPackage.PROCESS__TYPE:
				return getType();
			case XmlaPackage.PROCESS__OBJECT:
				return getObject();
			case XmlaPackage.PROCESS__BINDINGS:
				return getBindings();
			case XmlaPackage.PROCESS__DATA_SOURCE:
				return getDataSource();
			case XmlaPackage.PROCESS__DATA_SOURCE_VIEW:
				return getDataSourceView();
			case XmlaPackage.PROCESS__ERROR_CONFIGURATION:
				return getErrorConfiguration();
			case XmlaPackage.PROCESS__WRITE_BACK_TABLE_CREATION:
				return getWriteBackTableCreation();
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
			case XmlaPackage.PROCESS__TYPE:
				setType((TypeType7)newValue);
				return;
			case XmlaPackage.PROCESS__OBJECT:
				setObject((ObjectReference)newValue);
				return;
			case XmlaPackage.PROCESS__BINDINGS:
				setBindings((Bindings)newValue);
				return;
			case XmlaPackage.PROCESS__DATA_SOURCE:
				setDataSource((DataSource)newValue);
				return;
			case XmlaPackage.PROCESS__DATA_SOURCE_VIEW:
				setDataSourceView((DataSourceView)newValue);
				return;
			case XmlaPackage.PROCESS__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)newValue);
				return;
			case XmlaPackage.PROCESS__WRITE_BACK_TABLE_CREATION:
				setWriteBackTableCreation((WriteBackTableCreation)newValue);
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
			case XmlaPackage.PROCESS__TYPE:
				unsetType();
				return;
			case XmlaPackage.PROCESS__OBJECT:
				setObject((ObjectReference)null);
				return;
			case XmlaPackage.PROCESS__BINDINGS:
				setBindings((Bindings)null);
				return;
			case XmlaPackage.PROCESS__DATA_SOURCE:
				setDataSource((DataSource)null);
				return;
			case XmlaPackage.PROCESS__DATA_SOURCE_VIEW:
				setDataSourceView((DataSourceView)null);
				return;
			case XmlaPackage.PROCESS__ERROR_CONFIGURATION:
				setErrorConfiguration((ErrorConfiguration)null);
				return;
			case XmlaPackage.PROCESS__WRITE_BACK_TABLE_CREATION:
				unsetWriteBackTableCreation();
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
			case XmlaPackage.PROCESS__TYPE:
				return isSetType();
			case XmlaPackage.PROCESS__OBJECT:
				return object != null;
			case XmlaPackage.PROCESS__BINDINGS:
				return bindings != null;
			case XmlaPackage.PROCESS__DATA_SOURCE:
				return dataSource != null;
			case XmlaPackage.PROCESS__DATA_SOURCE_VIEW:
				return dataSourceView != null;
			case XmlaPackage.PROCESS__ERROR_CONFIGURATION:
				return errorConfiguration != null;
			case XmlaPackage.PROCESS__WRITE_BACK_TABLE_CREATION:
				return isSetWriteBackTableCreation();
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
		result.append(" (type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", writeBackTableCreation: ");
		if (writeBackTableCreationESet) result.append(writeBackTableCreation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ProcessImpl
