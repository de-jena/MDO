/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType20;
import org.eclipse.daanse.xmla.model.ecore.xmla.AssembliesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.DatabasesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EditionType;
import org.eclipse.daanse.xmla.model.ecore.xmla.RolesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Server;
import org.eclipse.daanse.xmla.model.ecore.xmla.ServerPropertiesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TracesType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getEditionID <em>Edition ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getServerMode <em>Server Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getProductLevel <em>Product Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getDefaultCompatibilityLevel <em>Default Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getSupportedCompatibilityLevels <em>Supported Compatibility Levels</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getDatabases <em>Databases</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getAssemblies <em>Assemblies</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getTraces <em>Traces</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ServerImpl#getServerProperties <em>Server Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerImpl extends MinimalEObjectImpl.Container implements Server {
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
	protected AnnotationsType20 annotations;

	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected static final EditionType EDITION_EDEFAULT = EditionType.STANDARD;

	/**
	 * The cached value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected EditionType edition = EDITION_EDEFAULT;

	/**
	 * This is true if the Edition attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean editionESet;

	/**
	 * The default value of the '{@link #getEditionID() <em>Edition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionID()
	 * @generated
	 * @ordered
	 */
	protected static final long EDITION_ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getEditionID() <em>Edition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditionID()
	 * @generated
	 * @ordered
	 */
	protected long editionID = EDITION_ID_EDEFAULT;

	/**
	 * This is true if the Edition ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean editionIDESet;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getServerMode() <em>Server Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerMode()
	 * @generated
	 * @ordered
	 */
	protected static final ServerModeType SERVER_MODE_EDEFAULT = ServerModeType.MULTIDIMENSIONAL;

	/**
	 * The cached value of the '{@link #getServerMode() <em>Server Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerMode()
	 * @generated
	 * @ordered
	 */
	protected ServerModeType serverMode = SERVER_MODE_EDEFAULT;

	/**
	 * This is true if the Server Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean serverModeESet;

	/**
	 * The default value of the '{@link #getProductLevel() <em>Product Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductLevel() <em>Product Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductLevel()
	 * @generated
	 * @ordered
	 */
	protected String productLevel = PRODUCT_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCompatibilityLevel() <em>Default Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCompatibilityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final long DEFAULT_COMPATIBILITY_LEVEL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getDefaultCompatibilityLevel() <em>Default Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCompatibilityLevel()
	 * @generated
	 * @ordered
	 */
	protected long defaultCompatibilityLevel = DEFAULT_COMPATIBILITY_LEVEL_EDEFAULT;

	/**
	 * This is true if the Default Compatibility Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean defaultCompatibilityLevelESet;

	/**
	 * The default value of the '{@link #getSupportedCompatibilityLevels() <em>Supported Compatibility Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCompatibilityLevels()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORTED_COMPATIBILITY_LEVELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupportedCompatibilityLevels() <em>Supported Compatibility Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCompatibilityLevels()
	 * @generated
	 * @ordered
	 */
	protected String supportedCompatibilityLevels = SUPPORTED_COMPATIBILITY_LEVELS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatabases() <em>Databases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabases()
	 * @generated
	 * @ordered
	 */
	protected DatabasesType databases;

	/**
	 * The cached value of the '{@link #getAssemblies() <em>Assemblies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblies()
	 * @generated
	 * @ordered
	 */
	protected AssembliesType assemblies;

	/**
	 * The cached value of the '{@link #getTraces() <em>Traces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraces()
	 * @generated
	 * @ordered
	 */
	protected TracesType traces;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected RolesType roles;

	/**
	 * The cached value of the '{@link #getServerProperties() <em>Server Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServerProperties()
	 * @generated
	 * @ordered
	 */
	protected ServerPropertiesType serverProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.SERVER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__ID, oldID, iD));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__CREATED_TIMESTAMP, oldCreatedTimestamp, createdTimestamp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType20 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType20 newAnnotations, NotificationChain msgs) {
		AnnotationsType20 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType20 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SERVER__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SERVER__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__PRODUCT_NAME, oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditionType getEdition() {
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdition(EditionType newEdition) {
		EditionType oldEdition = edition;
		edition = newEdition == null ? EDITION_EDEFAULT : newEdition;
		boolean oldEditionESet = editionESet;
		editionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__EDITION, oldEdition, edition, !oldEditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEdition() {
		EditionType oldEdition = edition;
		boolean oldEditionESet = editionESet;
		edition = EDITION_EDEFAULT;
		editionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.SERVER__EDITION, oldEdition, EDITION_EDEFAULT, oldEditionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEdition() {
		return editionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getEditionID() {
		return editionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditionID(long newEditionID) {
		long oldEditionID = editionID;
		editionID = newEditionID;
		boolean oldEditionIDESet = editionIDESet;
		editionIDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__EDITION_ID, oldEditionID, editionID, !oldEditionIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEditionID() {
		long oldEditionID = editionID;
		boolean oldEditionIDESet = editionIDESet;
		editionID = EDITION_ID_EDEFAULT;
		editionIDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.SERVER__EDITION_ID, oldEditionID, EDITION_ID_EDEFAULT, oldEditionIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEditionID() {
		return editionIDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerModeType getServerMode() {
		return serverMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerMode(ServerModeType newServerMode) {
		ServerModeType oldServerMode = serverMode;
		serverMode = newServerMode == null ? SERVER_MODE_EDEFAULT : newServerMode;
		boolean oldServerModeESet = serverModeESet;
		serverModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__SERVER_MODE, oldServerMode, serverMode, !oldServerModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServerMode() {
		ServerModeType oldServerMode = serverMode;
		boolean oldServerModeESet = serverModeESet;
		serverMode = SERVER_MODE_EDEFAULT;
		serverModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.SERVER__SERVER_MODE, oldServerMode, SERVER_MODE_EDEFAULT, oldServerModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServerMode() {
		return serverModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductLevel() {
		return productLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductLevel(String newProductLevel) {
		String oldProductLevel = productLevel;
		productLevel = newProductLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__PRODUCT_LEVEL, oldProductLevel, productLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDefaultCompatibilityLevel() {
		return defaultCompatibilityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCompatibilityLevel(long newDefaultCompatibilityLevel) {
		long oldDefaultCompatibilityLevel = defaultCompatibilityLevel;
		defaultCompatibilityLevel = newDefaultCompatibilityLevel;
		boolean oldDefaultCompatibilityLevelESet = defaultCompatibilityLevelESet;
		defaultCompatibilityLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__DEFAULT_COMPATIBILITY_LEVEL, oldDefaultCompatibilityLevel, defaultCompatibilityLevel, !oldDefaultCompatibilityLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefaultCompatibilityLevel() {
		long oldDefaultCompatibilityLevel = defaultCompatibilityLevel;
		boolean oldDefaultCompatibilityLevelESet = defaultCompatibilityLevelESet;
		defaultCompatibilityLevel = DEFAULT_COMPATIBILITY_LEVEL_EDEFAULT;
		defaultCompatibilityLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.SERVER__DEFAULT_COMPATIBILITY_LEVEL, oldDefaultCompatibilityLevel, DEFAULT_COMPATIBILITY_LEVEL_EDEFAULT, oldDefaultCompatibilityLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefaultCompatibilityLevel() {
		return defaultCompatibilityLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupportedCompatibilityLevels() {
		return supportedCompatibilityLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedCompatibilityLevels(String newSupportedCompatibilityLevels) {
		String oldSupportedCompatibilityLevels = supportedCompatibilityLevels;
		supportedCompatibilityLevels = newSupportedCompatibilityLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__SUPPORTED_COMPATIBILITY_LEVELS, oldSupportedCompatibilityLevels, supportedCompatibilityLevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabasesType getDatabases() {
		return databases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabases(DatabasesType newDatabases, NotificationChain msgs) {
		DatabasesType oldDatabases = databases;
		databases = newDatabases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__DATABASES, oldDatabases, newDatabases);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabases(DatabasesType newDatabases) {
		if (newDatabases != databases) {
			NotificationChain msgs = null;
			if (databases != null)
				msgs = ((InternalEObject)databases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SERVER__DATABASES, null, msgs);
			if (newDatabases != null)
				msgs = ((InternalEObject)newDatabases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SERVER__DATABASES, null, msgs);
			msgs = basicSetDatabases(newDatabases, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__DATABASES, newDatabases, newDatabases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssembliesType getAssemblies() {
		return assemblies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssemblies(AssembliesType newAssemblies, NotificationChain msgs) {
		AssembliesType oldAssemblies = assemblies;
		assemblies = newAssemblies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__ASSEMBLIES, oldAssemblies, newAssemblies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblies(AssembliesType newAssemblies) {
		if (newAssemblies != assemblies) {
			NotificationChain msgs = null;
			if (assemblies != null)
				msgs = ((InternalEObject)assemblies).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SERVER__ASSEMBLIES, null, msgs);
			if (newAssemblies != null)
				msgs = ((InternalEObject)newAssemblies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SERVER__ASSEMBLIES, null, msgs);
			msgs = basicSetAssemblies(newAssemblies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__ASSEMBLIES, newAssemblies, newAssemblies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracesType getTraces() {
		return traces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTraces(TracesType newTraces, NotificationChain msgs) {
		TracesType oldTraces = traces;
		traces = newTraces;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__TRACES, oldTraces, newTraces);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraces(TracesType newTraces) {
		if (newTraces != traces) {
			NotificationChain msgs = null;
			if (traces != null)
				msgs = ((InternalEObject)traces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SERVER__TRACES, null, msgs);
			if (newTraces != null)
				msgs = ((InternalEObject)newTraces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SERVER__TRACES, null, msgs);
			msgs = basicSetTraces(newTraces, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__TRACES, newTraces, newTraces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolesType getRoles() {
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoles(RolesType newRoles, NotificationChain msgs) {
		RolesType oldRoles = roles;
		roles = newRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__ROLES, oldRoles, newRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoles(RolesType newRoles) {
		if (newRoles != roles) {
			NotificationChain msgs = null;
			if (roles != null)
				msgs = ((InternalEObject)roles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SERVER__ROLES, null, msgs);
			if (newRoles != null)
				msgs = ((InternalEObject)newRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SERVER__ROLES, null, msgs);
			msgs = basicSetRoles(newRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__ROLES, newRoles, newRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerPropertiesType getServerProperties() {
		return serverProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServerProperties(ServerPropertiesType newServerProperties, NotificationChain msgs) {
		ServerPropertiesType oldServerProperties = serverProperties;
		serverProperties = newServerProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__SERVER_PROPERTIES, oldServerProperties, newServerProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerProperties(ServerPropertiesType newServerProperties) {
		if (newServerProperties != serverProperties) {
			NotificationChain msgs = null;
			if (serverProperties != null)
				msgs = ((InternalEObject)serverProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SERVER__SERVER_PROPERTIES, null, msgs);
			if (newServerProperties != null)
				msgs = ((InternalEObject)newServerProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.SERVER__SERVER_PROPERTIES, null, msgs);
			msgs = basicSetServerProperties(newServerProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.SERVER__SERVER_PROPERTIES, newServerProperties, newServerProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.SERVER__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.SERVER__DATABASES:
				return basicSetDatabases(null, msgs);
			case XmlaPackage.SERVER__ASSEMBLIES:
				return basicSetAssemblies(null, msgs);
			case XmlaPackage.SERVER__TRACES:
				return basicSetTraces(null, msgs);
			case XmlaPackage.SERVER__ROLES:
				return basicSetRoles(null, msgs);
			case XmlaPackage.SERVER__SERVER_PROPERTIES:
				return basicSetServerProperties(null, msgs);
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
			case XmlaPackage.SERVER__NAME:
				return getName();
			case XmlaPackage.SERVER__ID:
				return getID();
			case XmlaPackage.SERVER__CREATED_TIMESTAMP:
				return getCreatedTimestamp();
			case XmlaPackage.SERVER__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
			case XmlaPackage.SERVER__DESCRIPTION:
				return getDescription();
			case XmlaPackage.SERVER__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.SERVER__PRODUCT_NAME:
				return getProductName();
			case XmlaPackage.SERVER__EDITION:
				return getEdition();
			case XmlaPackage.SERVER__EDITION_ID:
				return getEditionID();
			case XmlaPackage.SERVER__VERSION:
				return getVersion();
			case XmlaPackage.SERVER__SERVER_MODE:
				return getServerMode();
			case XmlaPackage.SERVER__PRODUCT_LEVEL:
				return getProductLevel();
			case XmlaPackage.SERVER__DEFAULT_COMPATIBILITY_LEVEL:
				return getDefaultCompatibilityLevel();
			case XmlaPackage.SERVER__SUPPORTED_COMPATIBILITY_LEVELS:
				return getSupportedCompatibilityLevels();
			case XmlaPackage.SERVER__DATABASES:
				return getDatabases();
			case XmlaPackage.SERVER__ASSEMBLIES:
				return getAssemblies();
			case XmlaPackage.SERVER__TRACES:
				return getTraces();
			case XmlaPackage.SERVER__ROLES:
				return getRoles();
			case XmlaPackage.SERVER__SERVER_PROPERTIES:
				return getServerProperties();
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
			case XmlaPackage.SERVER__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.SERVER__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.SERVER__CREATED_TIMESTAMP:
				setCreatedTimestamp((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.SERVER__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.SERVER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.SERVER__ANNOTATIONS:
				setAnnotations((AnnotationsType20)newValue);
				return;
			case XmlaPackage.SERVER__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case XmlaPackage.SERVER__EDITION:
				setEdition((EditionType)newValue);
				return;
			case XmlaPackage.SERVER__EDITION_ID:
				setEditionID((Long)newValue);
				return;
			case XmlaPackage.SERVER__VERSION:
				setVersion((String)newValue);
				return;
			case XmlaPackage.SERVER__SERVER_MODE:
				setServerMode((ServerModeType)newValue);
				return;
			case XmlaPackage.SERVER__PRODUCT_LEVEL:
				setProductLevel((String)newValue);
				return;
			case XmlaPackage.SERVER__DEFAULT_COMPATIBILITY_LEVEL:
				setDefaultCompatibilityLevel((Long)newValue);
				return;
			case XmlaPackage.SERVER__SUPPORTED_COMPATIBILITY_LEVELS:
				setSupportedCompatibilityLevels((String)newValue);
				return;
			case XmlaPackage.SERVER__DATABASES:
				setDatabases((DatabasesType)newValue);
				return;
			case XmlaPackage.SERVER__ASSEMBLIES:
				setAssemblies((AssembliesType)newValue);
				return;
			case XmlaPackage.SERVER__TRACES:
				setTraces((TracesType)newValue);
				return;
			case XmlaPackage.SERVER__ROLES:
				setRoles((RolesType)newValue);
				return;
			case XmlaPackage.SERVER__SERVER_PROPERTIES:
				setServerProperties((ServerPropertiesType)newValue);
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
			case XmlaPackage.SERVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.SERVER__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.SERVER__CREATED_TIMESTAMP:
				setCreatedTimestamp(CREATED_TIMESTAMP_EDEFAULT);
				return;
			case XmlaPackage.SERVER__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.SERVER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.SERVER__ANNOTATIONS:
				setAnnotations((AnnotationsType20)null);
				return;
			case XmlaPackage.SERVER__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case XmlaPackage.SERVER__EDITION:
				unsetEdition();
				return;
			case XmlaPackage.SERVER__EDITION_ID:
				unsetEditionID();
				return;
			case XmlaPackage.SERVER__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case XmlaPackage.SERVER__SERVER_MODE:
				unsetServerMode();
				return;
			case XmlaPackage.SERVER__PRODUCT_LEVEL:
				setProductLevel(PRODUCT_LEVEL_EDEFAULT);
				return;
			case XmlaPackage.SERVER__DEFAULT_COMPATIBILITY_LEVEL:
				unsetDefaultCompatibilityLevel();
				return;
			case XmlaPackage.SERVER__SUPPORTED_COMPATIBILITY_LEVELS:
				setSupportedCompatibilityLevels(SUPPORTED_COMPATIBILITY_LEVELS_EDEFAULT);
				return;
			case XmlaPackage.SERVER__DATABASES:
				setDatabases((DatabasesType)null);
				return;
			case XmlaPackage.SERVER__ASSEMBLIES:
				setAssemblies((AssembliesType)null);
				return;
			case XmlaPackage.SERVER__TRACES:
				setTraces((TracesType)null);
				return;
			case XmlaPackage.SERVER__ROLES:
				setRoles((RolesType)null);
				return;
			case XmlaPackage.SERVER__SERVER_PROPERTIES:
				setServerProperties((ServerPropertiesType)null);
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
			case XmlaPackage.SERVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.SERVER__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.SERVER__CREATED_TIMESTAMP:
				return CREATED_TIMESTAMP_EDEFAULT == null ? createdTimestamp != null : !CREATED_TIMESTAMP_EDEFAULT.equals(createdTimestamp);
			case XmlaPackage.SERVER__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
			case XmlaPackage.SERVER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.SERVER__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.SERVER__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case XmlaPackage.SERVER__EDITION:
				return isSetEdition();
			case XmlaPackage.SERVER__EDITION_ID:
				return isSetEditionID();
			case XmlaPackage.SERVER__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case XmlaPackage.SERVER__SERVER_MODE:
				return isSetServerMode();
			case XmlaPackage.SERVER__PRODUCT_LEVEL:
				return PRODUCT_LEVEL_EDEFAULT == null ? productLevel != null : !PRODUCT_LEVEL_EDEFAULT.equals(productLevel);
			case XmlaPackage.SERVER__DEFAULT_COMPATIBILITY_LEVEL:
				return isSetDefaultCompatibilityLevel();
			case XmlaPackage.SERVER__SUPPORTED_COMPATIBILITY_LEVELS:
				return SUPPORTED_COMPATIBILITY_LEVELS_EDEFAULT == null ? supportedCompatibilityLevels != null : !SUPPORTED_COMPATIBILITY_LEVELS_EDEFAULT.equals(supportedCompatibilityLevels);
			case XmlaPackage.SERVER__DATABASES:
				return databases != null;
			case XmlaPackage.SERVER__ASSEMBLIES:
				return assemblies != null;
			case XmlaPackage.SERVER__TRACES:
				return traces != null;
			case XmlaPackage.SERVER__ROLES:
				return roles != null;
			case XmlaPackage.SERVER__SERVER_PROPERTIES:
				return serverProperties != null;
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
		result.append(", productName: ");
		result.append(productName);
		result.append(", edition: ");
		if (editionESet) result.append(edition); else result.append("<unset>");
		result.append(", editionID: ");
		if (editionIDESet) result.append(editionID); else result.append("<unset>");
		result.append(", version: ");
		result.append(version);
		result.append(", serverMode: ");
		if (serverModeESet) result.append(serverMode); else result.append("<unset>");
		result.append(", productLevel: ");
		result.append(productLevel);
		result.append(", defaultCompatibilityLevel: ");
		if (defaultCompatibilityLevelESet) result.append(defaultCompatibilityLevel); else result.append("<unset>");
		result.append(", supportedCompatibilityLevels: ");
		result.append(supportedCompatibilityLevels);
		result.append(')');
		return result.toString();
	}

} //ServerImpl
