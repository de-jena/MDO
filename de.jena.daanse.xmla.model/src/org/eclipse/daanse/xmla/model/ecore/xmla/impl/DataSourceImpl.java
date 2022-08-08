/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType7;
import org.eclipse.daanse.xmla.model.ecore.xmla.ConnectionStringSecurityType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSource;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataSourcePermissionsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.IsolationType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getManagedProvider <em>Managed Provider</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getConnectionString <em>Connection String</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getConnectionStringSecurity <em>Connection String Security</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getImpersonationInfo <em>Impersonation Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getIsolation <em>Isolation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getMaxActiveConnections <em>Max Active Connections</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getDataSourcePermissions <em>Data Source Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getQueryImpersonationInfo <em>Query Impersonation Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataSourceImpl#getQueryHints <em>Query Hints</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataSourceImpl extends MinimalEObjectImpl.Container implements DataSource {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedTimestamp() <em>Created Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATED_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedTimestamp() <em>Created Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar createdTimestamp = CREATED_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastSchemaUpdate() <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSchemaUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_SCHEMA_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastSchemaUpdate() <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSchemaUpdate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastSchemaUpdate = LAST_SCHEMA_UPDATE_EDEFAULT;

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
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType7 annotations;

	/**
	 * The default value of the '{@link #getManagedProvider() <em>Managed Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String MANAGED_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManagedProvider() <em>Managed Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagedProvider()
	 * @generated
	 * @ordered
	 */
	protected String managedProvider = MANAGED_PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionString() <em>Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionString()
	 * @generated
	 * @ordered
	 */
	protected static final String CONNECTION_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConnectionString() <em>Connection String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionString()
	 * @generated
	 * @ordered
	 */
	protected String connectionString = CONNECTION_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getConnectionStringSecurity() <em>Connection String Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionStringSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionStringSecurityType CONNECTION_STRING_SECURITY_EDEFAULT = ConnectionStringSecurityType.PASSWORD_REMOVED;

	/**
	 * The cached value of the '{@link #getConnectionStringSecurity() <em>Connection String Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionStringSecurity()
	 * @generated
	 * @ordered
	 */
	protected ConnectionStringSecurityType connectionStringSecurity = CONNECTION_STRING_SECURITY_EDEFAULT;

	/**
	 * This is true if the Connection String Security attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean connectionStringSecurityESet;

	/**
	 * The cached value of the '{@link #getImpersonationInfo() <em>Impersonation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpersonationInfo()
	 * @generated
	 * @ordered
	 */
	protected ImpersonationInfo impersonationInfo;

	/**
	 * The default value of the '{@link #getIsolation() <em>Isolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolation()
	 * @generated
	 * @ordered
	 */
	protected static final IsolationType ISOLATION_EDEFAULT = IsolationType.READ_COMMITTED;

	/**
	 * The cached value of the '{@link #getIsolation() <em>Isolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsolation()
	 * @generated
	 * @ordered
	 */
	protected IsolationType isolation = ISOLATION_EDEFAULT;

	/**
	 * This is true if the Isolation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isolationESet;

	/**
	 * The default value of the '{@link #getMaxActiveConnections() <em>Max Active Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActiveConnections()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_ACTIVE_CONNECTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxActiveConnections() <em>Max Active Connections</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxActiveConnections()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxActiveConnections = MAX_ACTIVE_CONNECTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final Duration TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected Duration timeout = TIMEOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDataSourcePermissions() <em>Data Source Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourcePermissions()
	 * @generated
	 * @ordered
	 */
	protected DataSourcePermissionsType dataSourcePermissions;

	/**
	 * The cached value of the '{@link #getQueryImpersonationInfo() <em>Query Impersonation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryImpersonationInfo()
	 * @generated
	 * @ordered
	 */
	protected ImpersonationInfo queryImpersonationInfo;

	/**
	 * The default value of the '{@link #getQueryHints() <em>Query Hints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryHints()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_HINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQueryHints() <em>Query Hints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryHints()
	 * @generated
	 * @ordered
	 */
	protected String queryHints = QUERY_HINTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DATA_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreatedTimestamp() {
		return createdTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedTimestamp(XMLGregorianCalendar newCreatedTimestamp) {
		XMLGregorianCalendar oldCreatedTimestamp = createdTimestamp;
		createdTimestamp = newCreatedTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__CREATED_TIMESTAMP, oldCreatedTimestamp, createdTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastSchemaUpdate() {
		return lastSchemaUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSchemaUpdate(XMLGregorianCalendar newLastSchemaUpdate) {
		XMLGregorianCalendar oldLastSchemaUpdate = lastSchemaUpdate;
		lastSchemaUpdate = newLastSchemaUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType7 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType7 newAnnotations, NotificationChain msgs) {
		AnnotationsType7 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType7 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_SOURCE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_SOURCE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManagedProvider() {
		return managedProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManagedProvider(String newManagedProvider) {
		String oldManagedProvider = managedProvider;
		managedProvider = newManagedProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__MANAGED_PROVIDER, oldManagedProvider, managedProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConnectionString() {
		return connectionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionString(String newConnectionString) {
		String oldConnectionString = connectionString;
		connectionString = newConnectionString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__CONNECTION_STRING, oldConnectionString, connectionString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionStringSecurityType getConnectionStringSecurity() {
		return connectionStringSecurity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionStringSecurity(ConnectionStringSecurityType newConnectionStringSecurity) {
		ConnectionStringSecurityType oldConnectionStringSecurity = connectionStringSecurity;
		connectionStringSecurity = newConnectionStringSecurity == null ? CONNECTION_STRING_SECURITY_EDEFAULT : newConnectionStringSecurity;
		boolean oldConnectionStringSecurityESet = connectionStringSecurityESet;
		connectionStringSecurityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__CONNECTION_STRING_SECURITY, oldConnectionStringSecurity, connectionStringSecurity, !oldConnectionStringSecurityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConnectionStringSecurity() {
		ConnectionStringSecurityType oldConnectionStringSecurity = connectionStringSecurity;
		boolean oldConnectionStringSecurityESet = connectionStringSecurityESet;
		connectionStringSecurity = CONNECTION_STRING_SECURITY_EDEFAULT;
		connectionStringSecurityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATA_SOURCE__CONNECTION_STRING_SECURITY, oldConnectionStringSecurity, CONNECTION_STRING_SECURITY_EDEFAULT, oldConnectionStringSecurityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionStringSecurity() {
		return connectionStringSecurityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpersonationInfo getImpersonationInfo() {
		return impersonationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImpersonationInfo(ImpersonationInfo newImpersonationInfo, NotificationChain msgs) {
		ImpersonationInfo oldImpersonationInfo = impersonationInfo;
		impersonationInfo = newImpersonationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__IMPERSONATION_INFO, oldImpersonationInfo, newImpersonationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpersonationInfo(ImpersonationInfo newImpersonationInfo) {
		if (newImpersonationInfo != impersonationInfo) {
			NotificationChain msgs = null;
			if (impersonationInfo != null)
				msgs = ((InternalEObject)impersonationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_SOURCE__IMPERSONATION_INFO, null, msgs);
			if (newImpersonationInfo != null)
				msgs = ((InternalEObject)newImpersonationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_SOURCE__IMPERSONATION_INFO, null, msgs);
			msgs = basicSetImpersonationInfo(newImpersonationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__IMPERSONATION_INFO, newImpersonationInfo, newImpersonationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsolationType getIsolation() {
		return isolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsolation(IsolationType newIsolation) {
		IsolationType oldIsolation = isolation;
		isolation = newIsolation == null ? ISOLATION_EDEFAULT : newIsolation;
		boolean oldIsolationESet = isolationESet;
		isolationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__ISOLATION, oldIsolation, isolation, !oldIsolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsolation() {
		IsolationType oldIsolation = isolation;
		boolean oldIsolationESet = isolationESet;
		isolation = ISOLATION_EDEFAULT;
		isolationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATA_SOURCE__ISOLATION, oldIsolation, ISOLATION_EDEFAULT, oldIsolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsolation() {
		return isolationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxActiveConnections() {
		return maxActiveConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxActiveConnections(BigInteger newMaxActiveConnections) {
		BigInteger oldMaxActiveConnections = maxActiveConnections;
		maxActiveConnections = newMaxActiveConnections;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__MAX_ACTIVE_CONNECTIONS, oldMaxActiveConnections, maxActiveConnections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(Duration newTimeout) {
		Duration oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourcePermissionsType getDataSourcePermissions() {
		return dataSourcePermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataSourcePermissions(DataSourcePermissionsType newDataSourcePermissions, NotificationChain msgs) {
		DataSourcePermissionsType oldDataSourcePermissions = dataSourcePermissions;
		dataSourcePermissions = newDataSourcePermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__DATA_SOURCE_PERMISSIONS, oldDataSourcePermissions, newDataSourcePermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourcePermissions(DataSourcePermissionsType newDataSourcePermissions) {
		if (newDataSourcePermissions != dataSourcePermissions) {
			NotificationChain msgs = null;
			if (dataSourcePermissions != null)
				msgs = ((InternalEObject)dataSourcePermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_SOURCE__DATA_SOURCE_PERMISSIONS, null, msgs);
			if (newDataSourcePermissions != null)
				msgs = ((InternalEObject)newDataSourcePermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_SOURCE__DATA_SOURCE_PERMISSIONS, null, msgs);
			msgs = basicSetDataSourcePermissions(newDataSourcePermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__DATA_SOURCE_PERMISSIONS, newDataSourcePermissions, newDataSourcePermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpersonationInfo getQueryImpersonationInfo() {
		return queryImpersonationInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryImpersonationInfo(ImpersonationInfo newQueryImpersonationInfo, NotificationChain msgs) {
		ImpersonationInfo oldQueryImpersonationInfo = queryImpersonationInfo;
		queryImpersonationInfo = newQueryImpersonationInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__QUERY_IMPERSONATION_INFO, oldQueryImpersonationInfo, newQueryImpersonationInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryImpersonationInfo(ImpersonationInfo newQueryImpersonationInfo) {
		if (newQueryImpersonationInfo != queryImpersonationInfo) {
			NotificationChain msgs = null;
			if (queryImpersonationInfo != null)
				msgs = ((InternalEObject)queryImpersonationInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_SOURCE__QUERY_IMPERSONATION_INFO, null, msgs);
			if (newQueryImpersonationInfo != null)
				msgs = ((InternalEObject)newQueryImpersonationInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_SOURCE__QUERY_IMPERSONATION_INFO, null, msgs);
			msgs = basicSetQueryImpersonationInfo(newQueryImpersonationInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__QUERY_IMPERSONATION_INFO, newQueryImpersonationInfo, newQueryImpersonationInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQueryHints() {
		return queryHints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryHints(String newQueryHints) {
		String oldQueryHints = queryHints;
		queryHints = newQueryHints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_SOURCE__QUERY_HINTS, oldQueryHints, queryHints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DATA_SOURCE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.DATA_SOURCE__IMPERSONATION_INFO:
				return basicSetImpersonationInfo(null, msgs);
			case XmlaPackage.DATA_SOURCE__DATA_SOURCE_PERMISSIONS:
				return basicSetDataSourcePermissions(null, msgs);
			case XmlaPackage.DATA_SOURCE__QUERY_IMPERSONATION_INFO:
				return basicSetQueryImpersonationInfo(null, msgs);
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
			case XmlaPackage.DATA_SOURCE__NAME:
				return getName();
			case XmlaPackage.DATA_SOURCE__ID:
				return getID();
			case XmlaPackage.DATA_SOURCE__CREATED_TIMESTAMP:
				return getCreatedTimestamp();
			case XmlaPackage.DATA_SOURCE__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
			case XmlaPackage.DATA_SOURCE__DESCRIPTION:
				return getDescription();
			case XmlaPackage.DATA_SOURCE__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.DATA_SOURCE__MANAGED_PROVIDER:
				return getManagedProvider();
			case XmlaPackage.DATA_SOURCE__CONNECTION_STRING:
				return getConnectionString();
			case XmlaPackage.DATA_SOURCE__CONNECTION_STRING_SECURITY:
				return getConnectionStringSecurity();
			case XmlaPackage.DATA_SOURCE__IMPERSONATION_INFO:
				return getImpersonationInfo();
			case XmlaPackage.DATA_SOURCE__ISOLATION:
				return getIsolation();
			case XmlaPackage.DATA_SOURCE__MAX_ACTIVE_CONNECTIONS:
				return getMaxActiveConnections();
			case XmlaPackage.DATA_SOURCE__TIMEOUT:
				return getTimeout();
			case XmlaPackage.DATA_SOURCE__DATA_SOURCE_PERMISSIONS:
				return getDataSourcePermissions();
			case XmlaPackage.DATA_SOURCE__QUERY_IMPERSONATION_INFO:
				return getQueryImpersonationInfo();
			case XmlaPackage.DATA_SOURCE__QUERY_HINTS:
				return getQueryHints();
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
			case XmlaPackage.DATA_SOURCE__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__CREATED_TIMESTAMP:
				setCreatedTimestamp((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__ANNOTATIONS:
				setAnnotations((AnnotationsType7)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__MANAGED_PROVIDER:
				setManagedProvider((String)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__CONNECTION_STRING:
				setConnectionString((String)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__CONNECTION_STRING_SECURITY:
				setConnectionStringSecurity((ConnectionStringSecurityType)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__IMPERSONATION_INFO:
				setImpersonationInfo((ImpersonationInfo)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__ISOLATION:
				setIsolation((IsolationType)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__MAX_ACTIVE_CONNECTIONS:
				setMaxActiveConnections((BigInteger)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__TIMEOUT:
				setTimeout((Duration)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__DATA_SOURCE_PERMISSIONS:
				setDataSourcePermissions((DataSourcePermissionsType)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__QUERY_IMPERSONATION_INFO:
				setQueryImpersonationInfo((ImpersonationInfo)newValue);
				return;
			case XmlaPackage.DATA_SOURCE__QUERY_HINTS:
				setQueryHints((String)newValue);
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
			case XmlaPackage.DATA_SOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.DATA_SOURCE__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.DATA_SOURCE__CREATED_TIMESTAMP:
				setCreatedTimestamp(CREATED_TIMESTAMP_EDEFAULT);
				return;
			case XmlaPackage.DATA_SOURCE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.DATA_SOURCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.DATA_SOURCE__ANNOTATIONS:
				setAnnotations((AnnotationsType7)null);
				return;
			case XmlaPackage.DATA_SOURCE__MANAGED_PROVIDER:
				setManagedProvider(MANAGED_PROVIDER_EDEFAULT);
				return;
			case XmlaPackage.DATA_SOURCE__CONNECTION_STRING:
				setConnectionString(CONNECTION_STRING_EDEFAULT);
				return;
			case XmlaPackage.DATA_SOURCE__CONNECTION_STRING_SECURITY:
				unsetConnectionStringSecurity();
				return;
			case XmlaPackage.DATA_SOURCE__IMPERSONATION_INFO:
				setImpersonationInfo((ImpersonationInfo)null);
				return;
			case XmlaPackage.DATA_SOURCE__ISOLATION:
				unsetIsolation();
				return;
			case XmlaPackage.DATA_SOURCE__MAX_ACTIVE_CONNECTIONS:
				setMaxActiveConnections(MAX_ACTIVE_CONNECTIONS_EDEFAULT);
				return;
			case XmlaPackage.DATA_SOURCE__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
				return;
			case XmlaPackage.DATA_SOURCE__DATA_SOURCE_PERMISSIONS:
				setDataSourcePermissions((DataSourcePermissionsType)null);
				return;
			case XmlaPackage.DATA_SOURCE__QUERY_IMPERSONATION_INFO:
				setQueryImpersonationInfo((ImpersonationInfo)null);
				return;
			case XmlaPackage.DATA_SOURCE__QUERY_HINTS:
				setQueryHints(QUERY_HINTS_EDEFAULT);
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
			case XmlaPackage.DATA_SOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.DATA_SOURCE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.DATA_SOURCE__CREATED_TIMESTAMP:
				return CREATED_TIMESTAMP_EDEFAULT == null ? createdTimestamp != null : !CREATED_TIMESTAMP_EDEFAULT.equals(createdTimestamp);
			case XmlaPackage.DATA_SOURCE__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
			case XmlaPackage.DATA_SOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.DATA_SOURCE__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.DATA_SOURCE__MANAGED_PROVIDER:
				return MANAGED_PROVIDER_EDEFAULT == null ? managedProvider != null : !MANAGED_PROVIDER_EDEFAULT.equals(managedProvider);
			case XmlaPackage.DATA_SOURCE__CONNECTION_STRING:
				return CONNECTION_STRING_EDEFAULT == null ? connectionString != null : !CONNECTION_STRING_EDEFAULT.equals(connectionString);
			case XmlaPackage.DATA_SOURCE__CONNECTION_STRING_SECURITY:
				return isSetConnectionStringSecurity();
			case XmlaPackage.DATA_SOURCE__IMPERSONATION_INFO:
				return impersonationInfo != null;
			case XmlaPackage.DATA_SOURCE__ISOLATION:
				return isSetIsolation();
			case XmlaPackage.DATA_SOURCE__MAX_ACTIVE_CONNECTIONS:
				return MAX_ACTIVE_CONNECTIONS_EDEFAULT == null ? maxActiveConnections != null : !MAX_ACTIVE_CONNECTIONS_EDEFAULT.equals(maxActiveConnections);
			case XmlaPackage.DATA_SOURCE__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
			case XmlaPackage.DATA_SOURCE__DATA_SOURCE_PERMISSIONS:
				return dataSourcePermissions != null;
			case XmlaPackage.DATA_SOURCE__QUERY_IMPERSONATION_INFO:
				return queryImpersonationInfo != null;
			case XmlaPackage.DATA_SOURCE__QUERY_HINTS:
				return QUERY_HINTS_EDEFAULT == null ? queryHints != null : !QUERY_HINTS_EDEFAULT.equals(queryHints);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", iD: ");
		result.append(iD);
		result.append(", createdTimestamp: ");
		result.append(createdTimestamp);
		result.append(", lastSchemaUpdate: ");
		result.append(lastSchemaUpdate);
		result.append(", description: ");
		result.append(description);
		result.append(", managedProvider: ");
		result.append(managedProvider);
		result.append(", connectionString: ");
		result.append(connectionString);
		result.append(", connectionStringSecurity: ");
		if (connectionStringSecurityESet) result.append(connectionStringSecurity); else result.append("<unset>");
		result.append(", isolation: ");
		if (isolationESet) result.append(isolation); else result.append("<unset>");
		result.append(", maxActiveConnections: ");
		result.append(maxActiveConnections);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(", queryHints: ");
		result.append(queryHints);
		result.append(')');
		return result.toString();
	}

} //DataSourceImpl
