/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getEdition <em>Edition</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getEditionID <em>Edition ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getServerMode <em>Server Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getProductLevel <em>Product Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getDefaultCompatibilityLevel <em>Default Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getSupportedCompatibilityLevels <em>Supported Compatibility Levels</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getDatabases <em>Databases</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getAssemblies <em>Assemblies</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getTraces <em>Traces</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getServerProperties <em>Server Properties</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer()
 * @model extendedMetaData="name='Server' kind='elementOnly'"
 * @generated
 */
public interface Server extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Created Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Timestamp</em>' attribute.
	 * @see #setCreatedTimestamp(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_CreatedTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreatedTimestamp'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getCreatedTimestamp <em>Created Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Timestamp</em>' attribute.
	 * @see #getCreatedTimestamp()
	 * @generated
	 */
	void setCreatedTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Schema Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Schema Update</em>' attribute.
	 * @see #setLastSchemaUpdate(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_LastSchemaUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastSchemaUpdate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastSchemaUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getLastSchemaUpdate <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Schema Update</em>' attribute.
	 * @see #getLastSchemaUpdate()
	 * @generated
	 */
	void setLastSchemaUpdate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType20)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType20 getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType20 value);

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_ProductName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ProductName'"
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.EditionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EditionType
	 * @see #isSetEdition()
	 * @see #unsetEdition()
	 * @see #setEdition(EditionType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_Edition()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Edition'"
	 * @generated
	 */
	EditionType getEdition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getEdition <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.EditionType
	 * @see #isSetEdition()
	 * @see #unsetEdition()
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(EditionType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getEdition <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEdition()
	 * @see #getEdition()
	 * @see #setEdition(EditionType)
	 * @generated
	 */
	void unsetEdition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getEdition <em>Edition</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edition</em>' attribute is set.
	 * @see #unsetEdition()
	 * @see #getEdition()
	 * @see #setEdition(EditionType)
	 * @generated
	 */
	boolean isSetEdition();

	/**
	 * Returns the value of the '<em><b>Edition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition ID</em>' attribute.
	 * @see #isSetEditionID()
	 * @see #unsetEditionID()
	 * @see #setEditionID(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_EditionID()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='EditionID'"
	 * @generated
	 */
	long getEditionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getEditionID <em>Edition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition ID</em>' attribute.
	 * @see #isSetEditionID()
	 * @see #unsetEditionID()
	 * @see #getEditionID()
	 * @generated
	 */
	void setEditionID(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getEditionID <em>Edition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEditionID()
	 * @see #getEditionID()
	 * @see #setEditionID(long)
	 * @generated
	 */
	void unsetEditionID();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getEditionID <em>Edition ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Edition ID</em>' attribute is set.
	 * @see #unsetEditionID()
	 * @see #getEditionID()
	 * @see #setEditionID(long)
	 * @generated
	 */
	boolean isSetEditionID();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Server Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType
	 * @see #isSetServerMode()
	 * @see #unsetServerMode()
	 * @see #setServerMode(ServerModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_ServerMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ServerMode' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300'"
	 * @generated
	 */
	ServerModeType getServerMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getServerMode <em>Server Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ServerModeType
	 * @see #isSetServerMode()
	 * @see #unsetServerMode()
	 * @see #getServerMode()
	 * @generated
	 */
	void setServerMode(ServerModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getServerMode <em>Server Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetServerMode()
	 * @see #getServerMode()
	 * @see #setServerMode(ServerModeType)
	 * @generated
	 */
	void unsetServerMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getServerMode <em>Server Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Server Mode</em>' attribute is set.
	 * @see #unsetServerMode()
	 * @see #getServerMode()
	 * @see #setServerMode(ServerModeType)
	 * @generated
	 */
	boolean isSetServerMode();

	/**
	 * Returns the value of the '<em><b>Product Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Level</em>' attribute.
	 * @see #setProductLevel(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_ProductLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ProductLevel'"
	 * @generated
	 */
	String getProductLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getProductLevel <em>Product Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Level</em>' attribute.
	 * @see #getProductLevel()
	 * @generated
	 */
	void setProductLevel(String value);

	/**
	 * Returns the value of the '<em><b>Default Compatibility Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Compatibility Level</em>' attribute.
	 * @see #isSetDefaultCompatibilityLevel()
	 * @see #unsetDefaultCompatibilityLevel()
	 * @see #setDefaultCompatibilityLevel(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_DefaultCompatibilityLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='DefaultCompatibilityLevel' namespace='http://schemas.microsoft.com/analysisservices/2012/engine/400'"
	 * @generated
	 */
	long getDefaultCompatibilityLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getDefaultCompatibilityLevel <em>Default Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Compatibility Level</em>' attribute.
	 * @see #isSetDefaultCompatibilityLevel()
	 * @see #unsetDefaultCompatibilityLevel()
	 * @see #getDefaultCompatibilityLevel()
	 * @generated
	 */
	void setDefaultCompatibilityLevel(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getDefaultCompatibilityLevel <em>Default Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultCompatibilityLevel()
	 * @see #getDefaultCompatibilityLevel()
	 * @see #setDefaultCompatibilityLevel(long)
	 * @generated
	 */
	void unsetDefaultCompatibilityLevel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getDefaultCompatibilityLevel <em>Default Compatibility Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Compatibility Level</em>' attribute is set.
	 * @see #unsetDefaultCompatibilityLevel()
	 * @see #getDefaultCompatibilityLevel()
	 * @see #setDefaultCompatibilityLevel(long)
	 * @generated
	 */
	boolean isSetDefaultCompatibilityLevel();

	/**
	 * Returns the value of the '<em><b>Supported Compatibility Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Compatibility Levels</em>' attribute.
	 * @see #setSupportedCompatibilityLevels(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_SupportedCompatibilityLevels()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='SupportedCompatibilityLevels' namespace='http://schemas.microsoft.com/analysisservices/2013/engine/600'"
	 * @generated
	 */
	String getSupportedCompatibilityLevels();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getSupportedCompatibilityLevels <em>Supported Compatibility Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Compatibility Levels</em>' attribute.
	 * @see #getSupportedCompatibilityLevels()
	 * @generated
	 */
	void setSupportedCompatibilityLevels(String value);

	/**
	 * Returns the value of the '<em><b>Databases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Databases</em>' containment reference.
	 * @see #setDatabases(DatabasesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_Databases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Databases'"
	 * @generated
	 */
	DatabasesType getDatabases();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getDatabases <em>Databases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Databases</em>' containment reference.
	 * @see #getDatabases()
	 * @generated
	 */
	void setDatabases(DatabasesType value);

	/**
	 * Returns the value of the '<em><b>Assemblies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblies</em>' containment reference.
	 * @see #setAssemblies(AssembliesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_Assemblies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Assemblies'"
	 * @generated
	 */
	AssembliesType getAssemblies();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getAssemblies <em>Assemblies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assemblies</em>' containment reference.
	 * @see #getAssemblies()
	 * @generated
	 */
	void setAssemblies(AssembliesType value);

	/**
	 * Returns the value of the '<em><b>Traces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traces</em>' containment reference.
	 * @see #setTraces(TracesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_Traces()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Traces'"
	 * @generated
	 */
	TracesType getTraces();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getTraces <em>Traces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traces</em>' containment reference.
	 * @see #getTraces()
	 * @generated
	 */
	void setTraces(TracesType value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference.
	 * @see #setRoles(RolesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_Roles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Roles'"
	 * @generated
	 */
	RolesType getRoles();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getRoles <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' containment reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(RolesType value);

	/**
	 * Returns the value of the '<em><b>Server Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Properties</em>' containment reference.
	 * @see #setServerProperties(ServerPropertiesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServer_ServerProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServerProperties'"
	 * @generated
	 */
	ServerPropertiesType getServerProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Server#getServerProperties <em>Server Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Properties</em>' containment reference.
	 * @see #getServerProperties()
	 * @generated
	 */
	void setServerProperties(ServerPropertiesType value);

} // Server
