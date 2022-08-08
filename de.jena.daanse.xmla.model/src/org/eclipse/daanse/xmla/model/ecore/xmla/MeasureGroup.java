/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getDataAggregation <em>Data Aggregation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getStorageMode <em>Storage Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getStorageLocation <em>Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#isIgnoreUnrelatedDimensions <em>Ignore Unrelated Dimensions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getProactiveCaching <em>Proactive Caching</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getEstimatedRows <em>Estimated Rows</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getEstimatedSize <em>Estimated Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getProcessingMode <em>Processing Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getAggregationPrefix <em>Aggregation Prefix</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getProcessingPriority <em>Processing Priority</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getAggregationDesigns <em>Aggregation Designs</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup()
 * @model extendedMetaData="name='MeasureGroup' kind='elementOnly'"
 * @generated
 */
public interface MeasureGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_CreatedTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreatedTimestamp'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getCreatedTimestamp <em>Created Timestamp</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_LastSchemaUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastSchemaUpdate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastSchemaUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getLastSchemaUpdate <em>Last Schema Update</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getDescription <em>Description</em>}' attribute.
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
	 * @see #setAnnotations(AnnotationsType27)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType27 getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType27 value);

	/**
	 * Returns the value of the '<em><b>Last Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Processed</em>' attribute.
	 * @see #setLastProcessed(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_LastProcessed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastProcessed'"
	 * @generated
	 */
	XMLGregorianCalendar getLastProcessed();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getLastProcessed <em>Last Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Processed</em>' attribute.
	 * @see #getLastProcessed()
	 * @generated
	 */
	void setLastProcessed(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType21)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType21 getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType21 value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType11}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType11
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType11)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeType11 getType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType11
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType11 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType11)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType11)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.StateType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType3
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(StateType3)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_State()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='State'"
	 * @generated
	 */
	StateType3 getState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType3
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType3 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(StateType3)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(StateType3)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Measures</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measures</em>' containment reference.
	 * @see #setMeasures(MeasuresType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_Measures()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Measures'"
	 * @generated
	 */
	MeasuresType1 getMeasures();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getMeasures <em>Measures</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measures</em>' containment reference.
	 * @see #getMeasures()
	 * @generated
	 */
	void setMeasures(MeasuresType1 value);

	/**
	 * Returns the value of the '<em><b>Data Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DataAggregationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Aggregation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataAggregationType
	 * @see #isSetDataAggregation()
	 * @see #unsetDataAggregation()
	 * @see #setDataAggregation(DataAggregationType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_DataAggregation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DataAggregation'"
	 * @generated
	 */
	DataAggregationType getDataAggregation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getDataAggregation <em>Data Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Aggregation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataAggregationType
	 * @see #isSetDataAggregation()
	 * @see #unsetDataAggregation()
	 * @see #getDataAggregation()
	 * @generated
	 */
	void setDataAggregation(DataAggregationType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getDataAggregation <em>Data Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataAggregation()
	 * @see #getDataAggregation()
	 * @see #setDataAggregation(DataAggregationType)
	 * @generated
	 */
	void unsetDataAggregation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getDataAggregation <em>Data Aggregation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Aggregation</em>' attribute is set.
	 * @see #unsetDataAggregation()
	 * @see #getDataAggregation()
	 * @see #setDataAggregation(DataAggregationType)
	 * @generated
	 */
	boolean isSetDataAggregation();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(MeasureGroupBinding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	MeasureGroupBinding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MeasureGroupBinding value);

	/**
	 * Returns the value of the '<em><b>Storage Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Mode</em>' containment reference.
	 * @see #setStorageMode(StorageModeType3)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_StorageMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StorageMode'"
	 * @generated
	 */
	StorageModeType3 getStorageMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getStorageMode <em>Storage Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Mode</em>' containment reference.
	 * @see #getStorageMode()
	 * @generated
	 */
	void setStorageMode(StorageModeType3 value);

	/**
	 * Returns the value of the '<em><b>Storage Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Location</em>' attribute.
	 * @see #setStorageLocation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_StorageLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='StorageLocation'"
	 * @generated
	 */
	String getStorageLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getStorageLocation <em>Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Location</em>' attribute.
	 * @see #getStorageLocation()
	 * @generated
	 */
	void setStorageLocation(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Unrelated Dimensions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Unrelated Dimensions</em>' attribute.
	 * @see #isSetIgnoreUnrelatedDimensions()
	 * @see #unsetIgnoreUnrelatedDimensions()
	 * @see #setIgnoreUnrelatedDimensions(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_IgnoreUnrelatedDimensions()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IgnoreUnrelatedDimensions'"
	 * @generated
	 */
	boolean isIgnoreUnrelatedDimensions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#isIgnoreUnrelatedDimensions <em>Ignore Unrelated Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Unrelated Dimensions</em>' attribute.
	 * @see #isSetIgnoreUnrelatedDimensions()
	 * @see #unsetIgnoreUnrelatedDimensions()
	 * @see #isIgnoreUnrelatedDimensions()
	 * @generated
	 */
	void setIgnoreUnrelatedDimensions(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#isIgnoreUnrelatedDimensions <em>Ignore Unrelated Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreUnrelatedDimensions()
	 * @see #isIgnoreUnrelatedDimensions()
	 * @see #setIgnoreUnrelatedDimensions(boolean)
	 * @generated
	 */
	void unsetIgnoreUnrelatedDimensions();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#isIgnoreUnrelatedDimensions <em>Ignore Unrelated Dimensions</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Unrelated Dimensions</em>' attribute is set.
	 * @see #unsetIgnoreUnrelatedDimensions()
	 * @see #isIgnoreUnrelatedDimensions()
	 * @see #setIgnoreUnrelatedDimensions(boolean)
	 * @generated
	 */
	boolean isSetIgnoreUnrelatedDimensions();

	/**
	 * Returns the value of the '<em><b>Proactive Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proactive Caching</em>' containment reference.
	 * @see #setProactiveCaching(ProactiveCaching)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_ProactiveCaching()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProactiveCaching'"
	 * @generated
	 */
	ProactiveCaching getProactiveCaching();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getProactiveCaching <em>Proactive Caching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proactive Caching</em>' containment reference.
	 * @see #getProactiveCaching()
	 * @generated
	 */
	void setProactiveCaching(ProactiveCaching value);

	/**
	 * Returns the value of the '<em><b>Estimated Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Rows</em>' attribute.
	 * @see #isSetEstimatedRows()
	 * @see #unsetEstimatedRows()
	 * @see #setEstimatedRows(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_EstimatedRows()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='EstimatedRows'"
	 * @generated
	 */
	long getEstimatedRows();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getEstimatedRows <em>Estimated Rows</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getEstimatedRows <em>Estimated Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedRows()
	 * @see #getEstimatedRows()
	 * @see #setEstimatedRows(long)
	 * @generated
	 */
	void unsetEstimatedRows();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getEstimatedRows <em>Estimated Rows</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Error Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Configuration</em>' containment reference.
	 * @see #setErrorConfiguration(ErrorConfiguration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_ErrorConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ErrorConfiguration'"
	 * @generated
	 */
	ErrorConfiguration getErrorConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getErrorConfiguration <em>Error Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Configuration</em>' containment reference.
	 * @see #getErrorConfiguration()
	 * @generated
	 */
	void setErrorConfiguration(ErrorConfiguration value);

	/**
	 * Returns the value of the '<em><b>Estimated Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Size</em>' attribute.
	 * @see #isSetEstimatedSize()
	 * @see #unsetEstimatedSize()
	 * @see #setEstimatedSize(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_EstimatedSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='EstimatedSize'"
	 * @generated
	 */
	long getEstimatedSize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getEstimatedSize <em>Estimated Size</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getEstimatedSize <em>Estimated Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedSize()
	 * @see #getEstimatedSize()
	 * @see #setEstimatedSize(long)
	 * @generated
	 */
	void unsetEstimatedSize();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getEstimatedSize <em>Estimated Size</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Processing Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType3
	 * @see #isSetProcessingMode()
	 * @see #unsetProcessingMode()
	 * @see #setProcessingMode(ProcessingModeType3)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_ProcessingMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProcessingMode'"
	 * @generated
	 */
	ProcessingModeType3 getProcessingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getProcessingMode <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType3
	 * @see #isSetProcessingMode()
	 * @see #unsetProcessingMode()
	 * @see #getProcessingMode()
	 * @generated
	 */
	void setProcessingMode(ProcessingModeType3 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getProcessingMode <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessingMode()
	 * @see #getProcessingMode()
	 * @see #setProcessingMode(ProcessingModeType3)
	 * @generated
	 */
	void unsetProcessingMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getProcessingMode <em>Processing Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Processing Mode</em>' attribute is set.
	 * @see #unsetProcessingMode()
	 * @see #getProcessingMode()
	 * @see #setProcessingMode(ProcessingModeType3)
	 * @generated
	 */
	boolean isSetProcessingMode();

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference.
	 * @see #setDimensions(DimensionsType5)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_Dimensions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Dimensions'"
	 * @generated
	 */
	DimensionsType5 getDimensions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getDimensions <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' containment reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(DimensionsType5 value);

	/**
	 * Returns the value of the '<em><b>Partitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitions</em>' containment reference.
	 * @see #setPartitions(PartitionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_Partitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Partitions'"
	 * @generated
	 */
	PartitionsType getPartitions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getPartitions <em>Partitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partitions</em>' containment reference.
	 * @see #getPartitions()
	 * @generated
	 */
	void setPartitions(PartitionsType value);

	/**
	 * Returns the value of the '<em><b>Aggregation Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Prefix</em>' attribute.
	 * @see #setAggregationPrefix(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_AggregationPrefix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AggregationPrefix'"
	 * @generated
	 */
	String getAggregationPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getAggregationPrefix <em>Aggregation Prefix</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_ProcessingPriority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ProcessingPriority'"
	 * @generated
	 */
	BigInteger getProcessingPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getProcessingPriority <em>Processing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Priority</em>' attribute.
	 * @see #getProcessingPriority()
	 * @generated
	 */
	void setProcessingPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Aggregation Designs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Designs</em>' containment reference.
	 * @see #setAggregationDesigns(AggregationDesignsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroup_AggregationDesigns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AggregationDesigns'"
	 * @generated
	 */
	AggregationDesignsType getAggregationDesigns();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroup#getAggregationDesigns <em>Aggregation Designs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Designs</em>' containment reference.
	 * @see #getAggregationDesigns()
	 * @generated
	 */
	void setAggregationDesigns(AggregationDesignsType value);

} // MeasureGroup
