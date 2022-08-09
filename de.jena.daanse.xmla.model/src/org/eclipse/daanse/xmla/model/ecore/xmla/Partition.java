/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType;
import org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getProcessingPriority <em>Processing Priority</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getAggregationPrefix <em>Aggregation Prefix</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getStorageMode <em>Storage Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getProcessingMode <em>Processing Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getStorageLocation <em>Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getRemoteDatasourceID <em>Remote Datasource ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getSlice <em>Slice</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getProactiveCaching <em>Proactive Caching</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getEstimatedSize <em>Estimated Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getEstimatedRows <em>Estimated Rows</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getCurrentStorageMode <em>Current Storage Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getAggregationDesignID <em>Aggregation Design ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getAggregationInstances <em>Aggregation Instances</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getAggregationInstanceSource <em>Aggregation Instance Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getDirectQueryUsage <em>Direct Query Usage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition()
 * @model extendedMetaData="name='Partition' kind='elementOnly'"
 * @generated
 */
public interface Partition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_CreatedTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreatedTimestamp'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getCreatedTimestamp <em>Created Timestamp</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_LastSchemaUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastSchemaUpdate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastSchemaUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getLastSchemaUpdate <em>Last Schema Update</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getDescription <em>Description</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(TabularBinding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	TabularBinding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TabularBinding value);

	/**
	 * Returns the value of the '<em><b>Processing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Priority</em>' attribute.
	 * @see #setProcessingPriority(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_ProcessingPriority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ProcessingPriority'"
	 * @generated
	 */
	BigInteger getProcessingPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getProcessingPriority <em>Processing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Priority</em>' attribute.
	 * @see #getProcessingPriority()
	 * @generated
	 */
	void setProcessingPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Aggregation Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Prefix</em>' attribute.
	 * @see #setAggregationPrefix(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_AggregationPrefix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AggregationPrefix'"
	 * @generated
	 */
	String getAggregationPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getAggregationPrefix <em>Aggregation Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Prefix</em>' attribute.
	 * @see #getAggregationPrefix()
	 * @generated
	 */
	void setAggregationPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Storage Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Mode</em>' containment reference.
	 * @see #setStorageMode(StorageModeType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_StorageMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StorageMode'"
	 * @generated
	 */
	StorageModeType2 getStorageMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getStorageMode <em>Storage Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Mode</em>' containment reference.
	 * @see #getStorageMode()
	 * @generated
	 */
	void setStorageMode(StorageModeType2 value);

	/**
	 * Returns the value of the '<em><b>Processing Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType2
	 * @see #isSetProcessingMode()
	 * @see #unsetProcessingMode()
	 * @see #setProcessingMode(ProcessingModeType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_ProcessingMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProcessingMode'"
	 * @generated
	 */
	ProcessingModeType2 getProcessingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getProcessingMode <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType2
	 * @see #isSetProcessingMode()
	 * @see #unsetProcessingMode()
	 * @see #getProcessingMode()
	 * @generated
	 */
	void setProcessingMode(ProcessingModeType2 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getProcessingMode <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessingMode()
	 * @see #getProcessingMode()
	 * @see #setProcessingMode(ProcessingModeType2)
	 * @generated
	 */
	void unsetProcessingMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getProcessingMode <em>Processing Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Processing Mode</em>' attribute is set.
	 * @see #unsetProcessingMode()
	 * @see #getProcessingMode()
	 * @see #setProcessingMode(ProcessingModeType2)
	 * @generated
	 */
	boolean isSetProcessingMode();

	/**
	 * Returns the value of the '<em><b>Error Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Configuration</em>' containment reference.
	 * @see #setErrorConfiguration(ErrorConfiguration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_ErrorConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ErrorConfiguration'"
	 * @generated
	 */
	ErrorConfiguration getErrorConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getErrorConfiguration <em>Error Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Configuration</em>' containment reference.
	 * @see #getErrorConfiguration()
	 * @generated
	 */
	void setErrorConfiguration(ErrorConfiguration value);

	/**
	 * Returns the value of the '<em><b>Storage Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Location</em>' attribute.
	 * @see #setStorageLocation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_StorageLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='StorageLocation'"
	 * @generated
	 */
	String getStorageLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getStorageLocation <em>Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Location</em>' attribute.
	 * @see #getStorageLocation()
	 * @generated
	 */
	void setStorageLocation(String value);

	/**
	 * Returns the value of the '<em><b>Remote Datasource ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Datasource ID</em>' attribute.
	 * @see #setRemoteDatasourceID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_RemoteDatasourceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='RemoteDatasourceID'"
	 * @generated
	 */
	String getRemoteDatasourceID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getRemoteDatasourceID <em>Remote Datasource ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Datasource ID</em>' attribute.
	 * @see #getRemoteDatasourceID()
	 * @generated
	 */
	void setRemoteDatasourceID(String value);

	/**
	 * Returns the value of the '<em><b>Slice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slice</em>' attribute.
	 * @see #setSlice(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_Slice()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Slice'"
	 * @generated
	 */
	String getSlice();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getSlice <em>Slice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slice</em>' attribute.
	 * @see #getSlice()
	 * @generated
	 */
	void setSlice(String value);

	/**
	 * Returns the value of the '<em><b>Proactive Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proactive Caching</em>' containment reference.
	 * @see #setProactiveCaching(ProactiveCaching)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_ProactiveCaching()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProactiveCaching'"
	 * @generated
	 */
	ProactiveCaching getProactiveCaching();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getProactiveCaching <em>Proactive Caching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proactive Caching</em>' containment reference.
	 * @see #getProactiveCaching()
	 * @generated
	 */
	void setProactiveCaching(ProactiveCaching value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Estimated Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Size</em>' attribute.
	 * @see #isSetEstimatedSize()
	 * @see #unsetEstimatedSize()
	 * @see #setEstimatedSize(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_EstimatedSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='EstimatedSize'"
	 * @generated
	 */
	long getEstimatedSize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getEstimatedSize <em>Estimated Size</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getEstimatedSize <em>Estimated Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedSize()
	 * @see #getEstimatedSize()
	 * @see #setEstimatedSize(long)
	 * @generated
	 */
	void unsetEstimatedSize();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getEstimatedSize <em>Estimated Size</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Estimated Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Rows</em>' attribute.
	 * @see #isSetEstimatedRows()
	 * @see #unsetEstimatedRows()
	 * @see #setEstimatedRows(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_EstimatedRows()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='EstimatedRows'"
	 * @generated
	 */
	long getEstimatedRows();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getEstimatedRows <em>Estimated Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Rows</em>' attribute.
	 * @see #isSetEstimatedRows()
	 * @see #unsetEstimatedRows()
	 * @see #getEstimatedRows()
	 * @generated
	 */
	void setEstimatedRows(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getEstimatedRows <em>Estimated Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedRows()
	 * @see #getEstimatedRows()
	 * @see #setEstimatedRows(long)
	 * @generated
	 */
	void unsetEstimatedRows();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getEstimatedRows <em>Estimated Rows</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Estimated Rows</em>' attribute is set.
	 * @see #unsetEstimatedRows()
	 * @see #getEstimatedRows()
	 * @see #setEstimatedRows(long)
	 * @generated
	 */
	boolean isSetEstimatedRows();

	/**
	 * Returns the value of the '<em><b>Current Storage Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Storage Mode</em>' containment reference.
	 * @see #setCurrentStorageMode(CurrentStorageModeType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_CurrentStorageMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentStorageMode'"
	 * @generated
	 */
	CurrentStorageModeType1 getCurrentStorageMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getCurrentStorageMode <em>Current Storage Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Storage Mode</em>' containment reference.
	 * @see #getCurrentStorageMode()
	 * @generated
	 */
	void setCurrentStorageMode(CurrentStorageModeType1 value);

	/**
	 * Returns the value of the '<em><b>Aggregation Design ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Design ID</em>' attribute.
	 * @see #setAggregationDesignID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_AggregationDesignID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AggregationDesignID'"
	 * @generated
	 */
	String getAggregationDesignID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getAggregationDesignID <em>Aggregation Design ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Design ID</em>' attribute.
	 * @see #getAggregationDesignID()
	 * @generated
	 */
	void setAggregationDesignID(String value);

	/**
	 * Returns the value of the '<em><b>Aggregation Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Instances</em>' containment reference.
	 * @see #setAggregationInstances(AggregationInstancesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_AggregationInstances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AggregationInstances'"
	 * @generated
	 */
	AggregationInstancesType getAggregationInstances();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getAggregationInstances <em>Aggregation Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Instances</em>' containment reference.
	 * @see #getAggregationInstances()
	 * @generated
	 */
	void setAggregationInstances(AggregationInstancesType value);

	/**
	 * Returns the value of the '<em><b>Aggregation Instance Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Instance Source</em>' containment reference.
	 * @see #setAggregationInstanceSource(DataSourceViewBinding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_AggregationInstanceSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AggregationInstanceSource'"
	 * @generated
	 */
	DataSourceViewBinding getAggregationInstanceSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getAggregationInstanceSource <em>Aggregation Instance Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Instance Source</em>' containment reference.
	 * @see #getAggregationInstanceSource()
	 * @generated
	 */
	void setAggregationInstanceSource(DataSourceViewBinding value);

	/**
	 * Returns the value of the '<em><b>Last Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Processed</em>' attribute.
	 * @see #setLastProcessed(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_LastProcessed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastProcessed'"
	 * @generated
	 */
	XMLGregorianCalendar getLastProcessed();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getLastProcessed <em>Last Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Processed</em>' attribute.
	 * @see #getLastProcessed()
	 * @generated
	 */
	void setLastProcessed(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.StateType4}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType4
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(StateType4)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_State()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='State'"
	 * @generated
	 */
	StateType4 getState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType4
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType4 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(StateType4)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(StateType4)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>String Stores Compatibility Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Stores Compatibility Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType
	 * @see #isSetStringStoresCompatibilityLevel()
	 * @see #unsetStringStoresCompatibilityLevel()
	 * @see #setStringStoresCompatibilityLevel(StringStoresCompatibilityLevelType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_StringStoresCompatibilityLevel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StringStoresCompatibilityLevel' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300'"
	 * @generated
	 */
	StringStoresCompatibilityLevelType getStringStoresCompatibilityLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Stores Compatibility Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType
	 * @see #isSetStringStoresCompatibilityLevel()
	 * @see #unsetStringStoresCompatibilityLevel()
	 * @see #getStringStoresCompatibilityLevel()
	 * @generated
	 */
	void setStringStoresCompatibilityLevel(StringStoresCompatibilityLevelType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStringStoresCompatibilityLevel()
	 * @see #getStringStoresCompatibilityLevel()
	 * @see #setStringStoresCompatibilityLevel(StringStoresCompatibilityLevelType)
	 * @generated
	 */
	void unsetStringStoresCompatibilityLevel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>String Stores Compatibility Level</em>' attribute is set.
	 * @see #unsetStringStoresCompatibilityLevel()
	 * @see #getStringStoresCompatibilityLevel()
	 * @see #setStringStoresCompatibilityLevel(StringStoresCompatibilityLevelType)
	 * @generated
	 */
	boolean isSetStringStoresCompatibilityLevel();

	/**
	 * Returns the value of the '<em><b>Current String Stores Compatibility Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current String Stores Compatibility Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType
	 * @see #isSetCurrentStringStoresCompatibilityLevel()
	 * @see #unsetCurrentStringStoresCompatibilityLevel()
	 * @see #setCurrentStringStoresCompatibilityLevel(CurrentStringStoresCompatibilityLevelType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_CurrentStringStoresCompatibilityLevel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CurrentStringStoresCompatibilityLevel' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300'"
	 * @generated
	 */
	CurrentStringStoresCompatibilityLevelType getCurrentStringStoresCompatibilityLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current String Stores Compatibility Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType
	 * @see #isSetCurrentStringStoresCompatibilityLevel()
	 * @see #unsetCurrentStringStoresCompatibilityLevel()
	 * @see #getCurrentStringStoresCompatibilityLevel()
	 * @generated
	 */
	void setCurrentStringStoresCompatibilityLevel(CurrentStringStoresCompatibilityLevelType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentStringStoresCompatibilityLevel()
	 * @see #getCurrentStringStoresCompatibilityLevel()
	 * @see #setCurrentStringStoresCompatibilityLevel(CurrentStringStoresCompatibilityLevelType)
	 * @generated
	 */
	void unsetCurrentStringStoresCompatibilityLevel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current String Stores Compatibility Level</em>' attribute is set.
	 * @see #unsetCurrentStringStoresCompatibilityLevel()
	 * @see #getCurrentStringStoresCompatibilityLevel()
	 * @see #setCurrentStringStoresCompatibilityLevel(CurrentStringStoresCompatibilityLevelType)
	 * @generated
	 */
	boolean isSetCurrentStringStoresCompatibilityLevel();

	/**
	 * Returns the value of the '<em><b>Direct Query Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Query Usage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType
	 * @see #isSetDirectQueryUsage()
	 * @see #unsetDirectQueryUsage()
	 * @see #setDirectQueryUsage(DirectQueryUsageType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPartition_DirectQueryUsage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DirectQueryUsage' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300/300'"
	 * @generated
	 */
	DirectQueryUsageType getDirectQueryUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getDirectQueryUsage <em>Direct Query Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Query Usage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType
	 * @see #isSetDirectQueryUsage()
	 * @see #unsetDirectQueryUsage()
	 * @see #getDirectQueryUsage()
	 * @generated
	 */
	void setDirectQueryUsage(DirectQueryUsageType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getDirectQueryUsage <em>Direct Query Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDirectQueryUsage()
	 * @see #getDirectQueryUsage()
	 * @see #setDirectQueryUsage(DirectQueryUsageType)
	 * @generated
	 */
	void unsetDirectQueryUsage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Partition#getDirectQueryUsage <em>Direct Query Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Direct Query Usage</em>' attribute is set.
	 * @see #unsetDirectQueryUsage()
	 * @see #getDirectQueryUsage()
	 * @see #setDirectQueryUsage(DirectQueryUsageType)
	 * @generated
	 */
	boolean isSetDirectQueryUsage();

} // Partition
