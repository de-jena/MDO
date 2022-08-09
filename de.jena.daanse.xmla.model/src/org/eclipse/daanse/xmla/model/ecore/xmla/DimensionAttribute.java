/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState;
import org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getEstimatedCount <em>Estimated Count</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getNameColumn <em>Name Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getValueColumn <em>Value Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAttributeRelationships <em>Attribute Relationships</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getDiscretizationMethod <em>Discretization Method</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getDiscretizationBucketCount <em>Discretization Bucket Count</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getRootMemberIf <em>Root Member If</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getDefaultMember <em>Default Member</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getOrderByAttributeID <em>Order By Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getSkippedLevelsColumn <em>Skipped Levels Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getNamingTemplate <em>Naming Template</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getMembersWithData <em>Members With Data</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getMembersWithDataCaption <em>Members With Data Caption</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getNamingTemplateTranslations <em>Naming Template Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getCustomRollupColumn <em>Custom Rollup Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getCustomRollupPropertiesColumn <em>Custom Rollup Properties Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getUnaryOperatorColumn <em>Unary Operator Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isAttributeHierarchyOrdered <em>Attribute Hierarchy Ordered</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isMemberNamesUnique <em>Member Names Unique</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isIsAggregatable <em>Is Aggregatable</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isAttributeHierarchyEnabled <em>Attribute Hierarchy Enabled</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAttributeHierarchyOptimizedState <em>Attribute Hierarchy Optimized State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAttributeHierarchyDisplayFolder <em>Attribute Hierarchy Display Folder</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isKeyUniquenessGuarantee <em>Key Uniqueness Guarantee</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getGroupingBehavior <em>Grouping Behavior</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getInstanceSelection <em>Instance Selection</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getProcessingState <em>Processing State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAttributeHierarchyProcessingState <em>Attribute Hierarchy Processing State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getVisualizationProperties <em>Visualization Properties</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getExtendedType <em>Extended Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute()
 * @model extendedMetaData="name='DimensionAttribute' kind='elementOnly'"
 * @generated
 */
public interface DimensionAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeType6)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeType6 getType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType6 value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.UsageType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UsageType1
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #setUsage(UsageType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_Usage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Usage'"
	 * @generated
	 */
	UsageType1 getUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.UsageType1
	 * @see #isSetUsage()
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(UsageType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUsage()
	 * @see #getUsage()
	 * @see #setUsage(UsageType1)
	 * @generated
	 */
	void unsetUsage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getUsage <em>Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Usage</em>' attribute is set.
	 * @see #unsetUsage()
	 * @see #getUsage()
	 * @see #setUsage(UsageType1)
	 * @generated
	 */
	boolean isSetUsage();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Binding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	Binding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Binding value);

	/**
	 * Returns the value of the '<em><b>Estimated Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Count</em>' attribute.
	 * @see #isSetEstimatedCount()
	 * @see #unsetEstimatedCount()
	 * @see #setEstimatedCount(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_EstimatedCount()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='EstimatedCount'"
	 * @generated
	 */
	long getEstimatedCount();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getEstimatedCount <em>Estimated Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimated Count</em>' attribute.
	 * @see #isSetEstimatedCount()
	 * @see #unsetEstimatedCount()
	 * @see #getEstimatedCount()
	 * @generated
	 */
	void setEstimatedCount(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getEstimatedCount <em>Estimated Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedCount()
	 * @see #getEstimatedCount()
	 * @see #setEstimatedCount(long)
	 * @generated
	 */
	void unsetEstimatedCount();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getEstimatedCount <em>Estimated Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Estimated Count</em>' attribute is set.
	 * @see #unsetEstimatedCount()
	 * @see #getEstimatedCount()
	 * @see #setEstimatedCount(long)
	 * @generated
	 */
	boolean isSetEstimatedCount();

	/**
	 * Returns the value of the '<em><b>Key Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Columns</em>' containment reference.
	 * @see #setKeyColumns(KeyColumnsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_KeyColumns()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='KeyColumns'"
	 * @generated
	 */
	KeyColumnsType getKeyColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getKeyColumns <em>Key Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Columns</em>' containment reference.
	 * @see #getKeyColumns()
	 * @generated
	 */
	void setKeyColumns(KeyColumnsType value);

	/**
	 * Returns the value of the '<em><b>Name Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Column</em>' containment reference.
	 * @see #setNameColumn(DataItem)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_NameColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NameColumn'"
	 * @generated
	 */
	DataItem getNameColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getNameColumn <em>Name Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Column</em>' containment reference.
	 * @see #getNameColumn()
	 * @generated
	 */
	void setNameColumn(DataItem value);

	/**
	 * Returns the value of the '<em><b>Value Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Column</em>' containment reference.
	 * @see #setValueColumn(DataItem)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_ValueColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueColumn'"
	 * @generated
	 */
	DataItem getValueColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getValueColumn <em>Value Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Column</em>' containment reference.
	 * @see #getValueColumn()
	 * @generated
	 */
	void setValueColumn(DataItem value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType value);

	/**
	 * Returns the value of the '<em><b>Attribute Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Relationships</em>' containment reference.
	 * @see #setAttributeRelationships(AttributeRelationshipsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_AttributeRelationships()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AttributeRelationships'"
	 * @generated
	 */
	AttributeRelationshipsType getAttributeRelationships();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAttributeRelationships <em>Attribute Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Relationships</em>' containment reference.
	 * @see #getAttributeRelationships()
	 * @generated
	 */
	void setAttributeRelationships(AttributeRelationshipsType value);

	/**
	 * Returns the value of the '<em><b>Discretization Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DiscretizationMethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discretization Method</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DiscretizationMethodType
	 * @see #isSetDiscretizationMethod()
	 * @see #unsetDiscretizationMethod()
	 * @see #setDiscretizationMethod(DiscretizationMethodType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_DiscretizationMethod()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DiscretizationMethod'"
	 * @generated
	 */
	DiscretizationMethodType getDiscretizationMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getDiscretizationMethod <em>Discretization Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discretization Method</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DiscretizationMethodType
	 * @see #isSetDiscretizationMethod()
	 * @see #unsetDiscretizationMethod()
	 * @see #getDiscretizationMethod()
	 * @generated
	 */
	void setDiscretizationMethod(DiscretizationMethodType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getDiscretizationMethod <em>Discretization Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDiscretizationMethod()
	 * @see #getDiscretizationMethod()
	 * @see #setDiscretizationMethod(DiscretizationMethodType)
	 * @generated
	 */
	void unsetDiscretizationMethod();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getDiscretizationMethod <em>Discretization Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Discretization Method</em>' attribute is set.
	 * @see #unsetDiscretizationMethod()
	 * @see #getDiscretizationMethod()
	 * @see #setDiscretizationMethod(DiscretizationMethodType)
	 * @generated
	 */
	boolean isSetDiscretizationMethod();

	/**
	 * Returns the value of the '<em><b>Discretization Bucket Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discretization Bucket Count</em>' attribute.
	 * @see #setDiscretizationBucketCount(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_DiscretizationBucketCount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='DiscretizationBucketCount'"
	 * @generated
	 */
	BigInteger getDiscretizationBucketCount();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getDiscretizationBucketCount <em>Discretization Bucket Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discretization Bucket Count</em>' attribute.
	 * @see #getDiscretizationBucketCount()
	 * @generated
	 */
	void setDiscretizationBucketCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Root Member If</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.RootMemberIfType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Member If</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RootMemberIfType
	 * @see #isSetRootMemberIf()
	 * @see #unsetRootMemberIf()
	 * @see #setRootMemberIf(RootMemberIfType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_RootMemberIf()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RootMemberIf'"
	 * @generated
	 */
	RootMemberIfType getRootMemberIf();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getRootMemberIf <em>Root Member If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Member If</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RootMemberIfType
	 * @see #isSetRootMemberIf()
	 * @see #unsetRootMemberIf()
	 * @see #getRootMemberIf()
	 * @generated
	 */
	void setRootMemberIf(RootMemberIfType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getRootMemberIf <em>Root Member If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRootMemberIf()
	 * @see #getRootMemberIf()
	 * @see #setRootMemberIf(RootMemberIfType)
	 * @generated
	 */
	void unsetRootMemberIf();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getRootMemberIf <em>Root Member If</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Root Member If</em>' attribute is set.
	 * @see #unsetRootMemberIf()
	 * @see #getRootMemberIf()
	 * @see #setRootMemberIf(RootMemberIfType)
	 * @generated
	 */
	boolean isSetRootMemberIf();

	/**
	 * Returns the value of the '<em><b>Order By</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.OrderByType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.OrderByType
	 * @see #isSetOrderBy()
	 * @see #unsetOrderBy()
	 * @see #setOrderBy(OrderByType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_OrderBy()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='OrderBy'"
	 * @generated
	 */
	OrderByType getOrderBy();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getOrderBy <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order By</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.OrderByType
	 * @see #isSetOrderBy()
	 * @see #unsetOrderBy()
	 * @see #getOrderBy()
	 * @generated
	 */
	void setOrderBy(OrderByType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getOrderBy <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrderBy()
	 * @see #getOrderBy()
	 * @see #setOrderBy(OrderByType)
	 * @generated
	 */
	void unsetOrderBy();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getOrderBy <em>Order By</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Order By</em>' attribute is set.
	 * @see #unsetOrderBy()
	 * @see #getOrderBy()
	 * @see #setOrderBy(OrderByType)
	 * @generated
	 */
	boolean isSetOrderBy();

	/**
	 * Returns the value of the '<em><b>Default Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Member</em>' attribute.
	 * @see #setDefaultMember(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_DefaultMember()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DefaultMember'"
	 * @generated
	 */
	String getDefaultMember();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getDefaultMember <em>Default Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Member</em>' attribute.
	 * @see #getDefaultMember()
	 * @generated
	 */
	void setDefaultMember(String value);

	/**
	 * Returns the value of the '<em><b>Order By Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By Attribute ID</em>' attribute.
	 * @see #setOrderByAttributeID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_OrderByAttributeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='OrderByAttributeID'"
	 * @generated
	 */
	String getOrderByAttributeID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getOrderByAttributeID <em>Order By Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order By Attribute ID</em>' attribute.
	 * @see #getOrderByAttributeID()
	 * @generated
	 */
	void setOrderByAttributeID(String value);

	/**
	 * Returns the value of the '<em><b>Skipped Levels Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skipped Levels Column</em>' containment reference.
	 * @see #setSkippedLevelsColumn(DataItem)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_SkippedLevelsColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SkippedLevelsColumn'"
	 * @generated
	 */
	DataItem getSkippedLevelsColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getSkippedLevelsColumn <em>Skipped Levels Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skipped Levels Column</em>' containment reference.
	 * @see #getSkippedLevelsColumn()
	 * @generated
	 */
	void setSkippedLevelsColumn(DataItem value);

	/**
	 * Returns the value of the '<em><b>Naming Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Naming Template</em>' attribute.
	 * @see #setNamingTemplate(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_NamingTemplate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='NamingTemplate'"
	 * @generated
	 */
	String getNamingTemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getNamingTemplate <em>Naming Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naming Template</em>' attribute.
	 * @see #getNamingTemplate()
	 * @generated
	 */
	void setNamingTemplate(String value);

	/**
	 * Returns the value of the '<em><b>Members With Data</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MembersWithDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members With Data</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MembersWithDataType
	 * @see #isSetMembersWithData()
	 * @see #unsetMembersWithData()
	 * @see #setMembersWithData(MembersWithDataType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_MembersWithData()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MembersWithData'"
	 * @generated
	 */
	MembersWithDataType getMembersWithData();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getMembersWithData <em>Members With Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Members With Data</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MembersWithDataType
	 * @see #isSetMembersWithData()
	 * @see #unsetMembersWithData()
	 * @see #getMembersWithData()
	 * @generated
	 */
	void setMembersWithData(MembersWithDataType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getMembersWithData <em>Members With Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMembersWithData()
	 * @see #getMembersWithData()
	 * @see #setMembersWithData(MembersWithDataType)
	 * @generated
	 */
	void unsetMembersWithData();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getMembersWithData <em>Members With Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Members With Data</em>' attribute is set.
	 * @see #unsetMembersWithData()
	 * @see #getMembersWithData()
	 * @see #setMembersWithData(MembersWithDataType)
	 * @generated
	 */
	boolean isSetMembersWithData();

	/**
	 * Returns the value of the '<em><b>Members With Data Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members With Data Caption</em>' attribute.
	 * @see #setMembersWithDataCaption(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_MembersWithDataCaption()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MembersWithDataCaption'"
	 * @generated
	 */
	String getMembersWithDataCaption();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getMembersWithDataCaption <em>Members With Data Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Members With Data Caption</em>' attribute.
	 * @see #getMembersWithDataCaption()
	 * @generated
	 */
	void setMembersWithDataCaption(String value);

	/**
	 * Returns the value of the '<em><b>Naming Template Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Naming Template Translations</em>' containment reference.
	 * @see #setNamingTemplateTranslations(NamingTemplateTranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_NamingTemplateTranslations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NamingTemplateTranslations'"
	 * @generated
	 */
	NamingTemplateTranslationsType getNamingTemplateTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getNamingTemplateTranslations <em>Naming Template Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naming Template Translations</em>' containment reference.
	 * @see #getNamingTemplateTranslations()
	 * @generated
	 */
	void setNamingTemplateTranslations(NamingTemplateTranslationsType value);

	/**
	 * Returns the value of the '<em><b>Custom Rollup Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Rollup Column</em>' containment reference.
	 * @see #setCustomRollupColumn(DataItem)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_CustomRollupColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomRollupColumn'"
	 * @generated
	 */
	DataItem getCustomRollupColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getCustomRollupColumn <em>Custom Rollup Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Rollup Column</em>' containment reference.
	 * @see #getCustomRollupColumn()
	 * @generated
	 */
	void setCustomRollupColumn(DataItem value);

	/**
	 * Returns the value of the '<em><b>Custom Rollup Properties Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Rollup Properties Column</em>' containment reference.
	 * @see #setCustomRollupPropertiesColumn(DataItem)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_CustomRollupPropertiesColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomRollupPropertiesColumn'"
	 * @generated
	 */
	DataItem getCustomRollupPropertiesColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getCustomRollupPropertiesColumn <em>Custom Rollup Properties Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Rollup Properties Column</em>' containment reference.
	 * @see #getCustomRollupPropertiesColumn()
	 * @generated
	 */
	void setCustomRollupPropertiesColumn(DataItem value);

	/**
	 * Returns the value of the '<em><b>Unary Operator Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Operator Column</em>' containment reference.
	 * @see #setUnaryOperatorColumn(DataItem)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_UnaryOperatorColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UnaryOperatorColumn'"
	 * @generated
	 */
	DataItem getUnaryOperatorColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getUnaryOperatorColumn <em>Unary Operator Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Operator Column</em>' containment reference.
	 * @see #getUnaryOperatorColumn()
	 * @generated
	 */
	void setUnaryOperatorColumn(DataItem value);

	/**
	 * Returns the value of the '<em><b>Attribute Hierarchy Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Hierarchy Ordered</em>' attribute.
	 * @see #isSetAttributeHierarchyOrdered()
	 * @see #unsetAttributeHierarchyOrdered()
	 * @see #setAttributeHierarchyOrdered(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_AttributeHierarchyOrdered()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AttributeHierarchyOrdered'"
	 * @generated
	 */
	boolean isAttributeHierarchyOrdered();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isAttributeHierarchyOrdered <em>Attribute Hierarchy Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Hierarchy Ordered</em>' attribute.
	 * @see #isSetAttributeHierarchyOrdered()
	 * @see #unsetAttributeHierarchyOrdered()
	 * @see #isAttributeHierarchyOrdered()
	 * @generated
	 */
	void setAttributeHierarchyOrdered(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isAttributeHierarchyOrdered <em>Attribute Hierarchy Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeHierarchyOrdered()
	 * @see #isAttributeHierarchyOrdered()
	 * @see #setAttributeHierarchyOrdered(boolean)
	 * @generated
	 */
	void unsetAttributeHierarchyOrdered();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isAttributeHierarchyOrdered <em>Attribute Hierarchy Ordered</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Hierarchy Ordered</em>' attribute is set.
	 * @see #unsetAttributeHierarchyOrdered()
	 * @see #isAttributeHierarchyOrdered()
	 * @see #setAttributeHierarchyOrdered(boolean)
	 * @generated
	 */
	boolean isSetAttributeHierarchyOrdered();

	/**
	 * Returns the value of the '<em><b>Member Names Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Names Unique</em>' attribute.
	 * @see #isSetMemberNamesUnique()
	 * @see #unsetMemberNamesUnique()
	 * @see #setMemberNamesUnique(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_MemberNamesUnique()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='MemberNamesUnique'"
	 * @generated
	 */
	boolean isMemberNamesUnique();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isMemberNamesUnique <em>Member Names Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Names Unique</em>' attribute.
	 * @see #isSetMemberNamesUnique()
	 * @see #unsetMemberNamesUnique()
	 * @see #isMemberNamesUnique()
	 * @generated
	 */
	void setMemberNamesUnique(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isMemberNamesUnique <em>Member Names Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMemberNamesUnique()
	 * @see #isMemberNamesUnique()
	 * @see #setMemberNamesUnique(boolean)
	 * @generated
	 */
	void unsetMemberNamesUnique();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isMemberNamesUnique <em>Member Names Unique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Member Names Unique</em>' attribute is set.
	 * @see #unsetMemberNamesUnique()
	 * @see #isMemberNamesUnique()
	 * @see #setMemberNamesUnique(boolean)
	 * @generated
	 */
	boolean isSetMemberNamesUnique();

	/**
	 * Returns the value of the '<em><b>Is Aggregatable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Aggregatable</em>' attribute.
	 * @see #isSetIsAggregatable()
	 * @see #unsetIsAggregatable()
	 * @see #setIsAggregatable(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_IsAggregatable()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsAggregatable'"
	 * @generated
	 */
	boolean isIsAggregatable();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isIsAggregatable <em>Is Aggregatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Aggregatable</em>' attribute.
	 * @see #isSetIsAggregatable()
	 * @see #unsetIsAggregatable()
	 * @see #isIsAggregatable()
	 * @generated
	 */
	void setIsAggregatable(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isIsAggregatable <em>Is Aggregatable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAggregatable()
	 * @see #isIsAggregatable()
	 * @see #setIsAggregatable(boolean)
	 * @generated
	 */
	void unsetIsAggregatable();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isIsAggregatable <em>Is Aggregatable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Aggregatable</em>' attribute is set.
	 * @see #unsetIsAggregatable()
	 * @see #isIsAggregatable()
	 * @see #setIsAggregatable(boolean)
	 * @generated
	 */
	boolean isSetIsAggregatable();

	/**
	 * Returns the value of the '<em><b>Attribute Hierarchy Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Hierarchy Enabled</em>' attribute.
	 * @see #isSetAttributeHierarchyEnabled()
	 * @see #unsetAttributeHierarchyEnabled()
	 * @see #setAttributeHierarchyEnabled(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_AttributeHierarchyEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AttributeHierarchyEnabled'"
	 * @generated
	 */
	boolean isAttributeHierarchyEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isAttributeHierarchyEnabled <em>Attribute Hierarchy Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Hierarchy Enabled</em>' attribute.
	 * @see #isSetAttributeHierarchyEnabled()
	 * @see #unsetAttributeHierarchyEnabled()
	 * @see #isAttributeHierarchyEnabled()
	 * @generated
	 */
	void setAttributeHierarchyEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isAttributeHierarchyEnabled <em>Attribute Hierarchy Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeHierarchyEnabled()
	 * @see #isAttributeHierarchyEnabled()
	 * @see #setAttributeHierarchyEnabled(boolean)
	 * @generated
	 */
	void unsetAttributeHierarchyEnabled();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isAttributeHierarchyEnabled <em>Attribute Hierarchy Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Hierarchy Enabled</em>' attribute is set.
	 * @see #unsetAttributeHierarchyEnabled()
	 * @see #isAttributeHierarchyEnabled()
	 * @see #setAttributeHierarchyEnabled(boolean)
	 * @generated
	 */
	boolean isSetAttributeHierarchyEnabled();

	/**
	 * Returns the value of the '<em><b>Attribute Hierarchy Optimized State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributeHierarchyOptimizedStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Hierarchy Optimized State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributeHierarchyOptimizedStateType
	 * @see #isSetAttributeHierarchyOptimizedState()
	 * @see #unsetAttributeHierarchyOptimizedState()
	 * @see #setAttributeHierarchyOptimizedState(AttributeHierarchyOptimizedStateType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_AttributeHierarchyOptimizedState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AttributeHierarchyOptimizedState'"
	 * @generated
	 */
	AttributeHierarchyOptimizedStateType getAttributeHierarchyOptimizedState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAttributeHierarchyOptimizedState <em>Attribute Hierarchy Optimized State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Hierarchy Optimized State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AttributeHierarchyOptimizedStateType
	 * @see #isSetAttributeHierarchyOptimizedState()
	 * @see #unsetAttributeHierarchyOptimizedState()
	 * @see #getAttributeHierarchyOptimizedState()
	 * @generated
	 */
	void setAttributeHierarchyOptimizedState(AttributeHierarchyOptimizedStateType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAttributeHierarchyOptimizedState <em>Attribute Hierarchy Optimized State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeHierarchyOptimizedState()
	 * @see #getAttributeHierarchyOptimizedState()
	 * @see #setAttributeHierarchyOptimizedState(AttributeHierarchyOptimizedStateType)
	 * @generated
	 */
	void unsetAttributeHierarchyOptimizedState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAttributeHierarchyOptimizedState <em>Attribute Hierarchy Optimized State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Hierarchy Optimized State</em>' attribute is set.
	 * @see #unsetAttributeHierarchyOptimizedState()
	 * @see #getAttributeHierarchyOptimizedState()
	 * @see #setAttributeHierarchyOptimizedState(AttributeHierarchyOptimizedStateType)
	 * @generated
	 */
	boolean isSetAttributeHierarchyOptimizedState();

	/**
	 * Returns the value of the '<em><b>Attribute Hierarchy Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Hierarchy Visible</em>' attribute.
	 * @see #isSetAttributeHierarchyVisible()
	 * @see #unsetAttributeHierarchyVisible()
	 * @see #setAttributeHierarchyVisible(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_AttributeHierarchyVisible()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AttributeHierarchyVisible'"
	 * @generated
	 */
	boolean isAttributeHierarchyVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Hierarchy Visible</em>' attribute.
	 * @see #isSetAttributeHierarchyVisible()
	 * @see #unsetAttributeHierarchyVisible()
	 * @see #isAttributeHierarchyVisible()
	 * @generated
	 */
	void setAttributeHierarchyVisible(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeHierarchyVisible()
	 * @see #isAttributeHierarchyVisible()
	 * @see #setAttributeHierarchyVisible(boolean)
	 * @generated
	 */
	void unsetAttributeHierarchyVisible();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Hierarchy Visible</em>' attribute is set.
	 * @see #unsetAttributeHierarchyVisible()
	 * @see #isAttributeHierarchyVisible()
	 * @see #setAttributeHierarchyVisible(boolean)
	 * @generated
	 */
	boolean isSetAttributeHierarchyVisible();

	/**
	 * Returns the value of the '<em><b>Attribute Hierarchy Display Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Hierarchy Display Folder</em>' attribute.
	 * @see #setAttributeHierarchyDisplayFolder(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_AttributeHierarchyDisplayFolder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AttributeHierarchyDisplayFolder'"
	 * @generated
	 */
	String getAttributeHierarchyDisplayFolder();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAttributeHierarchyDisplayFolder <em>Attribute Hierarchy Display Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Hierarchy Display Folder</em>' attribute.
	 * @see #getAttributeHierarchyDisplayFolder()
	 * @generated
	 */
	void setAttributeHierarchyDisplayFolder(String value);

	/**
	 * Returns the value of the '<em><b>Key Uniqueness Guarantee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Uniqueness Guarantee</em>' attribute.
	 * @see #isSetKeyUniquenessGuarantee()
	 * @see #unsetKeyUniquenessGuarantee()
	 * @see #setKeyUniquenessGuarantee(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_KeyUniquenessGuarantee()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='KeyUniquenessGuarantee'"
	 * @generated
	 */
	boolean isKeyUniquenessGuarantee();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isKeyUniquenessGuarantee <em>Key Uniqueness Guarantee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Uniqueness Guarantee</em>' attribute.
	 * @see #isSetKeyUniquenessGuarantee()
	 * @see #unsetKeyUniquenessGuarantee()
	 * @see #isKeyUniquenessGuarantee()
	 * @generated
	 */
	void setKeyUniquenessGuarantee(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isKeyUniquenessGuarantee <em>Key Uniqueness Guarantee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKeyUniquenessGuarantee()
	 * @see #isKeyUniquenessGuarantee()
	 * @see #setKeyUniquenessGuarantee(boolean)
	 * @generated
	 */
	void unsetKeyUniquenessGuarantee();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#isKeyUniquenessGuarantee <em>Key Uniqueness Guarantee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key Uniqueness Guarantee</em>' attribute is set.
	 * @see #unsetKeyUniquenessGuarantee()
	 * @see #isKeyUniquenessGuarantee()
	 * @see #setKeyUniquenessGuarantee(boolean)
	 * @generated
	 */
	boolean isSetKeyUniquenessGuarantee();

	/**
	 * Returns the value of the '<em><b>Grouping Behavior</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.GroupingBehaviorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping Behavior</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.GroupingBehaviorType
	 * @see #isSetGroupingBehavior()
	 * @see #unsetGroupingBehavior()
	 * @see #setGroupingBehavior(GroupingBehaviorType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_GroupingBehavior()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='GroupingBehavior'"
	 * @generated
	 */
	GroupingBehaviorType getGroupingBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getGroupingBehavior <em>Grouping Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping Behavior</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.GroupingBehaviorType
	 * @see #isSetGroupingBehavior()
	 * @see #unsetGroupingBehavior()
	 * @see #getGroupingBehavior()
	 * @generated
	 */
	void setGroupingBehavior(GroupingBehaviorType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getGroupingBehavior <em>Grouping Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGroupingBehavior()
	 * @see #getGroupingBehavior()
	 * @see #setGroupingBehavior(GroupingBehaviorType)
	 * @generated
	 */
	void unsetGroupingBehavior();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getGroupingBehavior <em>Grouping Behavior</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grouping Behavior</em>' attribute is set.
	 * @see #unsetGroupingBehavior()
	 * @see #getGroupingBehavior()
	 * @see #setGroupingBehavior(GroupingBehaviorType)
	 * @generated
	 */
	boolean isSetGroupingBehavior();

	/**
	 * Returns the value of the '<em><b>Instance Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.InstanceSelectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Selection</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.InstanceSelectionType
	 * @see #isSetInstanceSelection()
	 * @see #unsetInstanceSelection()
	 * @see #setInstanceSelection(InstanceSelectionType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_InstanceSelection()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='InstanceSelection'"
	 * @generated
	 */
	InstanceSelectionType getInstanceSelection();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getInstanceSelection <em>Instance Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Selection</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.InstanceSelectionType
	 * @see #isSetInstanceSelection()
	 * @see #unsetInstanceSelection()
	 * @see #getInstanceSelection()
	 * @generated
	 */
	void setInstanceSelection(InstanceSelectionType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getInstanceSelection <em>Instance Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstanceSelection()
	 * @see #getInstanceSelection()
	 * @see #setInstanceSelection(InstanceSelectionType)
	 * @generated
	 */
	void unsetInstanceSelection();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getInstanceSelection <em>Instance Selection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Instance Selection</em>' attribute is set.
	 * @see #unsetInstanceSelection()
	 * @see #getInstanceSelection()
	 * @see #setInstanceSelection(InstanceSelectionType)
	 * @generated
	 */
	boolean isSetInstanceSelection();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Processing State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingStateType
	 * @see #isSetProcessingState()
	 * @see #unsetProcessingState()
	 * @see #setProcessingState(ProcessingStateType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_ProcessingState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProcessingState'"
	 * @generated
	 */
	ProcessingStateType getProcessingState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getProcessingState <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingStateType
	 * @see #isSetProcessingState()
	 * @see #unsetProcessingState()
	 * @see #getProcessingState()
	 * @generated
	 */
	void setProcessingState(ProcessingStateType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getProcessingState <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessingState()
	 * @see #getProcessingState()
	 * @see #setProcessingState(ProcessingStateType)
	 * @generated
	 */
	void unsetProcessingState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getProcessingState <em>Processing State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Processing State</em>' attribute is set.
	 * @see #unsetProcessingState()
	 * @see #getProcessingState()
	 * @see #setProcessingState(ProcessingStateType)
	 * @generated
	 */
	boolean isSetProcessingState();

	/**
	 * Returns the value of the '<em><b>Attribute Hierarchy Processing State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Hierarchy Processing State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState
	 * @see #isSetAttributeHierarchyProcessingState()
	 * @see #unsetAttributeHierarchyProcessingState()
	 * @see #setAttributeHierarchyProcessingState(AttributeHierarchyProcessingState)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_AttributeHierarchyProcessingState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AttributeHierarchyProcessingState'"
	 * @generated
	 */
	AttributeHierarchyProcessingState getAttributeHierarchyProcessingState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAttributeHierarchyProcessingState <em>Attribute Hierarchy Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Hierarchy Processing State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AttributeHierarchyProcessingState
	 * @see #isSetAttributeHierarchyProcessingState()
	 * @see #unsetAttributeHierarchyProcessingState()
	 * @see #getAttributeHierarchyProcessingState()
	 * @generated
	 */
	void setAttributeHierarchyProcessingState(AttributeHierarchyProcessingState value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAttributeHierarchyProcessingState <em>Attribute Hierarchy Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeHierarchyProcessingState()
	 * @see #getAttributeHierarchyProcessingState()
	 * @see #setAttributeHierarchyProcessingState(AttributeHierarchyProcessingState)
	 * @generated
	 */
	void unsetAttributeHierarchyProcessingState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getAttributeHierarchyProcessingState <em>Attribute Hierarchy Processing State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Hierarchy Processing State</em>' attribute is set.
	 * @see #unsetAttributeHierarchyProcessingState()
	 * @see #getAttributeHierarchyProcessingState()
	 * @see #setAttributeHierarchyProcessingState(AttributeHierarchyProcessingState)
	 * @generated
	 */
	boolean isSetAttributeHierarchyProcessingState();

	/**
	 * Returns the value of the '<em><b>Visualization Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization Properties</em>' containment reference.
	 * @see #setVisualizationProperties(DimensionAttributeVisualizationProperties)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_VisualizationProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VisualizationProperties'"
	 * @generated
	 */
	DimensionAttributeVisualizationProperties getVisualizationProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getVisualizationProperties <em>Visualization Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualization Properties</em>' containment reference.
	 * @see #getVisualizationProperties()
	 * @generated
	 */
	void setVisualizationProperties(DimensionAttributeVisualizationProperties value);

	/**
	 * Returns the value of the '<em><b>Extended Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Type</em>' attribute.
	 * @see #setExtendedType(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionAttribute_ExtendedType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ExtendedType'"
	 * @generated
	 */
	String getExtendedType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionAttribute#getExtendedType <em>Extended Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Type</em>' attribute.
	 * @see #getExtendedType()
	 * @generated
	 */
	void setExtendedType(String value);

} // DimensionAttribute
