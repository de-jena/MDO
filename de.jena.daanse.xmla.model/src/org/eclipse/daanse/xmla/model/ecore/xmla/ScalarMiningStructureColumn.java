/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalar Mining Structure Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#isIsKey <em>Is Key</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getModelingFlags <em>Modeling Flags</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getContent <em>Content</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getClassifiedColumns <em>Classified Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getDiscretizationMethod <em>Discretization Method</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getDiscretizationBucketCount <em>Discretization Bucket Count</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getNameColumn <em>Name Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getTranslations <em>Translations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn()
 * @model extendedMetaData="name='ScalarMiningStructureColumn' kind='elementOnly'"
 * @generated
 */
public interface ScalarMiningStructureColumn extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType8}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType8
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType8)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeType8 getType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType8
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType8 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType8)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType8)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Is Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Key</em>' attribute.
	 * @see #isSetIsKey()
	 * @see #unsetIsKey()
	 * @see #setIsKey(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_IsKey()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsKey'"
	 * @generated
	 */
	boolean isIsKey();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#isIsKey <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Key</em>' attribute.
	 * @see #isSetIsKey()
	 * @see #unsetIsKey()
	 * @see #isIsKey()
	 * @generated
	 */
	void setIsKey(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#isIsKey <em>Is Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsKey()
	 * @see #isIsKey()
	 * @see #setIsKey(boolean)
	 * @generated
	 */
	void unsetIsKey();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#isIsKey <em>Is Key</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Key</em>' attribute is set.
	 * @see #unsetIsKey()
	 * @see #isIsKey()
	 * @see #setIsKey(boolean)
	 * @generated
	 */
	boolean isSetIsKey();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Binding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	Binding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Binding value);

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' attribute.
	 * @see #setDistribution(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_Distribution()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Distribution'"
	 * @generated
	 */
	String getDistribution();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getDistribution <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' attribute.
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(String value);

	/**
	 * Returns the value of the '<em><b>Modeling Flags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Flags</em>' containment reference.
	 * @see #setModelingFlags(ModelingFlagsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_ModelingFlags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModelingFlags'"
	 * @generated
	 */
	ModelingFlagsType getModelingFlags();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getModelingFlags <em>Modeling Flags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Flags</em>' containment reference.
	 * @see #getModelingFlags()
	 * @generated
	 */
	void setModelingFlags(ModelingFlagsType value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ContentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ContentType
	 * @see #isSetContent()
	 * @see #unsetContent()
	 * @see #setContent(ContentType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_Content()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Content'"
	 * @generated
	 */
	ContentType getContent();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ContentType
	 * @see #isSetContent()
	 * @see #unsetContent()
	 * @see #getContent()
	 * @generated
	 */
	void setContent(ContentType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContent()
	 * @see #getContent()
	 * @see #setContent(ContentType)
	 * @generated
	 */
	void unsetContent();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getContent <em>Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Content</em>' attribute is set.
	 * @see #unsetContent()
	 * @see #getContent()
	 * @see #setContent(ContentType)
	 * @generated
	 */
	boolean isSetContent();

	/**
	 * Returns the value of the '<em><b>Classified Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified Columns</em>' containment reference.
	 * @see #setClassifiedColumns(ClassifiedColumnsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_ClassifiedColumns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ClassifiedColumns'"
	 * @generated
	 */
	ClassifiedColumnsType getClassifiedColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getClassifiedColumns <em>Classified Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classified Columns</em>' containment reference.
	 * @see #getClassifiedColumns()
	 * @generated
	 */
	void setClassifiedColumns(ClassifiedColumnsType value);

	/**
	 * Returns the value of the '<em><b>Discretization Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discretization Method</em>' attribute.
	 * @see #setDiscretizationMethod(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_DiscretizationMethod()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DiscretizationMethod'"
	 * @generated
	 */
	String getDiscretizationMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getDiscretizationMethod <em>Discretization Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discretization Method</em>' attribute.
	 * @see #getDiscretizationMethod()
	 * @generated
	 */
	void setDiscretizationMethod(String value);

	/**
	 * Returns the value of the '<em><b>Discretization Bucket Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discretization Bucket Count</em>' attribute.
	 * @see #setDiscretizationBucketCount(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_DiscretizationBucketCount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='DiscretizationBucketCount'"
	 * @generated
	 */
	BigInteger getDiscretizationBucketCount();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getDiscretizationBucketCount <em>Discretization Bucket Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discretization Bucket Count</em>' attribute.
	 * @see #getDiscretizationBucketCount()
	 * @generated
	 */
	void setDiscretizationBucketCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Key Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Columns</em>' containment reference.
	 * @see #setKeyColumns(KeyColumnsType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_KeyColumns()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KeyColumns'"
	 * @generated
	 */
	KeyColumnsType1 getKeyColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getKeyColumns <em>Key Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Columns</em>' containment reference.
	 * @see #getKeyColumns()
	 * @generated
	 */
	void setKeyColumns(KeyColumnsType1 value);

	/**
	 * Returns the value of the '<em><b>Name Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Column</em>' containment reference.
	 * @see #setNameColumn(DataItem)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_NameColumn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NameColumn'"
	 * @generated
	 */
	DataItem getNameColumn();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getNameColumn <em>Name Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Column</em>' containment reference.
	 * @see #getNameColumn()
	 * @generated
	 */
	void setNameColumn(DataItem value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getScalarMiningStructureColumn_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ScalarMiningStructureColumn#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType value);

} // ScalarMiningStructureColumn
