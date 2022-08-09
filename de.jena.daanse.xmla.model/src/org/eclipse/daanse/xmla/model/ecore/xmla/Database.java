/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo;

import org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getLastUpdate <em>Last Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getReadWriteMode <em>Read Write Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDbStorageLocation <em>Db Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getAggregationPrefix <em>Aggregation Prefix</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getProcessingPriority <em>Processing Priority</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getEstimatedSize <em>Estimated Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getMasterDataSourceID <em>Master Data Source ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDataSourceImpersonationInfo <em>Data Source Impersonation Info</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDataSources <em>Data Sources</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDataSourceViews <em>Data Source Views</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getCubes <em>Cubes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getMiningStructures <em>Mining Structures</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getAssemblies <em>Assemblies</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDatabasePermissions <em>Database Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getStorageEngineUsed <em>Storage Engine Used</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getImagePath <em>Image Path</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getImageUniqueID <em>Image Unique ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getImageVersion <em>Image Version</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getToken <em>Token</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getCompatibilityLevel <em>Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDirectQueryMode <em>Direct Query Mode</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase()
 * @model extendedMetaData="name='Database' kind='elementOnly'"
 * @generated
 */
public interface Database extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_CreatedTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreatedTimestamp'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getCreatedTimestamp <em>Created Timestamp</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_LastSchemaUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastSchemaUpdate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastSchemaUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getLastSchemaUpdate <em>Last Schema Update</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDescription <em>Description</em>}' attribute.
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
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Last Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Update</em>' attribute.
	 * @see #setLastUpdate(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_LastUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastUpdate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getLastUpdate <em>Last Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update</em>' attribute.
	 * @see #getLastUpdate()
	 * @generated
	 */
	void setLastUpdate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.StateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(StateType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_State()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='State'"
	 * @generated
	 */
	StateType getState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(StateType)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(StateType)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Read Write Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Write Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType
	 * @see #isSetReadWriteMode()
	 * @see #unsetReadWriteMode()
	 * @see #setReadWriteMode(ReadWriteModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_ReadWriteMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ReadWriteMode' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100'"
	 * @generated
	 */
	ReadWriteModeType getReadWriteMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getReadWriteMode <em>Read Write Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Write Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine100.ReadWriteModeType
	 * @see #isSetReadWriteMode()
	 * @see #unsetReadWriteMode()
	 * @see #getReadWriteMode()
	 * @generated
	 */
	void setReadWriteMode(ReadWriteModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getReadWriteMode <em>Read Write Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadWriteMode()
	 * @see #getReadWriteMode()
	 * @see #setReadWriteMode(ReadWriteModeType)
	 * @generated
	 */
	void unsetReadWriteMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getReadWriteMode <em>Read Write Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Write Mode</em>' attribute is set.
	 * @see #unsetReadWriteMode()
	 * @see #getReadWriteMode()
	 * @see #setReadWriteMode(ReadWriteModeType)
	 * @generated
	 */
	boolean isSetReadWriteMode();

	/**
	 * Returns the value of the '<em><b>Db Storage Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Storage Location</em>' attribute.
	 * @see #setDbStorageLocation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_DbStorageLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DbStorageLocation' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100/100'"
	 * @generated
	 */
	String getDbStorageLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDbStorageLocation <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Storage Location</em>' attribute.
	 * @see #getDbStorageLocation()
	 * @generated
	 */
	void setDbStorageLocation(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Prefix</em>' attribute.
	 * @see #setAggregationPrefix(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_AggregationPrefix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AggregationPrefix'"
	 * @generated
	 */
	String getAggregationPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getAggregationPrefix <em>Aggregation Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Prefix</em>' attribute.
	 * @see #getAggregationPrefix()
	 * @generated
	 */
	void setAggregationPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Processing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Priority</em>' attribute.
	 * @see #setProcessingPriority(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_ProcessingPriority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ProcessingPriority'"
	 * @generated
	 */
	BigInteger getProcessingPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getProcessingPriority <em>Processing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Priority</em>' attribute.
	 * @see #getProcessingPriority()
	 * @generated
	 */
	void setProcessingPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Estimated Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Size</em>' attribute.
	 * @see #isSetEstimatedSize()
	 * @see #unsetEstimatedSize()
	 * @see #setEstimatedSize(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_EstimatedSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='EstimatedSize'"
	 * @generated
	 */
	long getEstimatedSize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getEstimatedSize <em>Estimated Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Size</em>' attribute.
	 * @see #isSetEstimatedSize()
	 * @see #unsetEstimatedSize()
	 * @see #getEstimatedSize()
	 * @generated
	 */
	void setEstimatedSize(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getEstimatedSize <em>Estimated Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedSize()
	 * @see #getEstimatedSize()
	 * @see #setEstimatedSize(long)
	 * @generated
	 */
	void unsetEstimatedSize();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getEstimatedSize <em>Estimated Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Estimated Size</em>' attribute is set.
	 * @see #unsetEstimatedSize()
	 * @see #getEstimatedSize()
	 * @see #setEstimatedSize(long)
	 * @generated
	 */
	boolean isSetEstimatedSize();

	/**
	 * Returns the value of the '<em><b>Last Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Processed</em>' attribute.
	 * @see #setLastProcessed(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_LastProcessed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastProcessed'"
	 * @generated
	 */
	XMLGregorianCalendar getLastProcessed();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getLastProcessed <em>Last Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Processed</em>' attribute.
	 * @see #getLastProcessed()
	 * @generated
	 */
	void setLastProcessed(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Language'"
	 * @generated
	 */
	BigInteger getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Collation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collation</em>' attribute.
	 * @see #setCollation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Collation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Collation'"
	 * @generated
	 */
	String getCollation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getCollation <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collation</em>' attribute.
	 * @see #getCollation()
	 * @generated
	 */
	void setCollation(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Visible()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Visible'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#isVisible <em>Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Visible</em>' attribute is set.
	 * @see #unsetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	boolean isSetVisible();

	/**
	 * Returns the value of the '<em><b>Master Data Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Data Source ID</em>' attribute.
	 * @see #setMasterDataSourceID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_MasterDataSourceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MasterDataSourceID'"
	 * @generated
	 */
	String getMasterDataSourceID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getMasterDataSourceID <em>Master Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Data Source ID</em>' attribute.
	 * @see #getMasterDataSourceID()
	 * @generated
	 */
	void setMasterDataSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Data Source Impersonation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Impersonation Info</em>' containment reference.
	 * @see #setDataSourceImpersonationInfo(ImpersonationInfo)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_DataSourceImpersonationInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSourceImpersonationInfo'"
	 * @generated
	 */
	ImpersonationInfo getDataSourceImpersonationInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDataSourceImpersonationInfo <em>Data Source Impersonation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Impersonation Info</em>' containment reference.
	 * @see #getDataSourceImpersonationInfo()
	 * @generated
	 */
	void setDataSourceImpersonationInfo(ImpersonationInfo value);

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference.
	 * @see #setAccounts(AccountsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Accounts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Accounts'"
	 * @generated
	 */
	AccountsType getAccounts();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getAccounts <em>Accounts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accounts</em>' containment reference.
	 * @see #getAccounts()
	 * @generated
	 */
	void setAccounts(AccountsType value);

	/**
	 * Returns the value of the '<em><b>Data Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sources</em>' containment reference.
	 * @see #setDataSources(DataSourcesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_DataSources()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSources'"
	 * @generated
	 */
	DataSourcesType getDataSources();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDataSources <em>Data Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Sources</em>' containment reference.
	 * @see #getDataSources()
	 * @generated
	 */
	void setDataSources(DataSourcesType value);

	/**
	 * Returns the value of the '<em><b>Data Source Views</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source Views</em>' containment reference.
	 * @see #setDataSourceViews(DataSourceViewsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_DataSourceViews()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSourceViews'"
	 * @generated
	 */
	DataSourceViewsType getDataSourceViews();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDataSourceViews <em>Data Source Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source Views</em>' containment reference.
	 * @see #getDataSourceViews()
	 * @generated
	 */
	void setDataSourceViews(DataSourceViewsType value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference.
	 * @see #setDimensions(DimensionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Dimensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Dimensions'"
	 * @generated
	 */
	DimensionsType getDimensions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDimensions <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' containment reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(DimensionsType value);

	/**
	 * Returns the value of the '<em><b>Cubes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cubes</em>' containment reference.
	 * @see #setCubes(CubesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Cubes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Cubes'"
	 * @generated
	 */
	CubesType getCubes();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getCubes <em>Cubes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cubes</em>' containment reference.
	 * @see #getCubes()
	 * @generated
	 */
	void setCubes(CubesType value);

	/**
	 * Returns the value of the '<em><b>Mining Structures</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Structures</em>' containment reference.
	 * @see #setMiningStructures(MiningStructuresType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_MiningStructures()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MiningStructures'"
	 * @generated
	 */
	MiningStructuresType getMiningStructures();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getMiningStructures <em>Mining Structures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Structures</em>' containment reference.
	 * @see #getMiningStructures()
	 * @generated
	 */
	void setMiningStructures(MiningStructuresType value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference.
	 * @see #setRoles(RolesType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Roles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Roles'"
	 * @generated
	 */
	RolesType1 getRoles();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getRoles <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' containment reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(RolesType1 value);

	/**
	 * Returns the value of the '<em><b>Assemblies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assemblies</em>' containment reference.
	 * @see #setAssemblies(AssembliesType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Assemblies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Assemblies'"
	 * @generated
	 */
	AssembliesType1 getAssemblies();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getAssemblies <em>Assemblies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assemblies</em>' containment reference.
	 * @see #getAssemblies()
	 * @generated
	 */
	void setAssemblies(AssembliesType1 value);

	/**
	 * Returns the value of the '<em><b>Database Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Permissions</em>' containment reference.
	 * @see #setDatabasePermissions(DatabasePermissionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_DatabasePermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DatabasePermissions'"
	 * @generated
	 */
	DatabasePermissionsType getDatabasePermissions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDatabasePermissions <em>Database Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Permissions</em>' containment reference.
	 * @see #getDatabasePermissions()
	 * @generated
	 */
	void setDatabasePermissions(DatabasePermissionsType value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType value);

	/**
	 * Returns the value of the '<em><b>Storage Engine Used</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Engine Used</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType
	 * @see #isSetStorageEngineUsed()
	 * @see #unsetStorageEngineUsed()
	 * @see #setStorageEngineUsed(StorageEngineUsedType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_StorageEngineUsed()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StorageEngineUsed' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	StorageEngineUsedType getStorageEngineUsed();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getStorageEngineUsed <em>Storage Engine Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Engine Used</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.StorageEngineUsedType
	 * @see #isSetStorageEngineUsed()
	 * @see #unsetStorageEngineUsed()
	 * @see #getStorageEngineUsed()
	 * @generated
	 */
	void setStorageEngineUsed(StorageEngineUsedType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getStorageEngineUsed <em>Storage Engine Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStorageEngineUsed()
	 * @see #getStorageEngineUsed()
	 * @see #setStorageEngineUsed(StorageEngineUsedType)
	 * @generated
	 */
	void unsetStorageEngineUsed();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getStorageEngineUsed <em>Storage Engine Used</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Storage Engine Used</em>' attribute is set.
	 * @see #unsetStorageEngineUsed()
	 * @see #getStorageEngineUsed()
	 * @see #setStorageEngineUsed(StorageEngineUsedType)
	 * @generated
	 */
	boolean isSetStorageEngineUsed();

	/**
	 * Returns the value of the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Path</em>' attribute.
	 * @see #setImagePath(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_ImagePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ImagePath' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	String getImagePath();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getImagePath <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

	/**
	 * Returns the value of the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Url</em>' attribute.
	 * @see #setImageUrl(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_ImageUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ImageUrl' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	String getImageUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getImageUrl <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Url</em>' attribute.
	 * @see #getImageUrl()
	 * @generated
	 */
	void setImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Image Unique ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Unique ID</em>' attribute.
	 * @see #setImageUniqueID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_ImageUniqueID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ImageUniqueID' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	String getImageUniqueID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getImageUniqueID <em>Image Unique ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Unique ID</em>' attribute.
	 * @see #getImageUniqueID()
	 * @generated
	 */
	void setImageUniqueID(String value);

	/**
	 * Returns the value of the '<em><b>Image Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Version</em>' attribute.
	 * @see #setImageVersion(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_ImageVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ImageVersion' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	String getImageVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getImageVersion <em>Image Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Version</em>' attribute.
	 * @see #getImageVersion()
	 * @generated
	 */
	void setImageVersion(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_Token()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Token' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	String getToken();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(String value);

	/**
	 * Returns the value of the '<em><b>Compatibility Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatibility Level</em>' attribute.
	 * @see #setCompatibilityLevel(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_CompatibilityLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='CompatibilityLevel' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200'"
	 * @generated
	 */
	BigInteger getCompatibilityLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getCompatibilityLevel <em>Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compatibility Level</em>' attribute.
	 * @see #getCompatibilityLevel()
	 * @generated
	 */
	void setCompatibilityLevel(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Direct Query Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Query Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType
	 * @see #isSetDirectQueryMode()
	 * @see #unsetDirectQueryMode()
	 * @see #setDirectQueryMode(DirectQueryModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDatabase_DirectQueryMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DirectQueryMode' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300/300'"
	 * @generated
	 */
	DirectQueryModeType getDirectQueryMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDirectQueryMode <em>Direct Query Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Query Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType
	 * @see #isSetDirectQueryMode()
	 * @see #unsetDirectQueryMode()
	 * @see #getDirectQueryMode()
	 * @generated
	 */
	void setDirectQueryMode(DirectQueryModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDirectQueryMode <em>Direct Query Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirectQueryMode()
	 * @see #getDirectQueryMode()
	 * @see #setDirectQueryMode(DirectQueryModeType)
	 * @generated
	 */
	void unsetDirectQueryMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Database#getDirectQueryMode <em>Direct Query Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direct Query Mode</em>' attribute is set.
	 * @see #unsetDirectQueryMode()
	 * @see #getDirectQueryMode()
	 * @see #setDirectQueryMode(DirectQueryModeType)
	 * @generated
	 */
	boolean isSetDirectQueryMode();

} // Database
