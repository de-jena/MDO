/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getAlgorithmParameters <em>Algorithm Parameters</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#isAllowDrillThrough <em>Allow Drill Through</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getFoldingParameters <em>Folding Parameters</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getMiningModelPermissions <em>Mining Model Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getCollation <em>Collation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel()
 * @model extendedMetaData="name='MiningModel' kind='elementOnly'"
 * @generated
 */
public interface MiningModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_CreatedTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreatedTimestamp'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getCreatedTimestamp <em>Created Timestamp</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_LastSchemaUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastSchemaUpdate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastSchemaUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getLastSchemaUpdate <em>Last Schema Update</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getDescription <em>Description</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmType
	 * @see #isSetAlgorithm()
	 * @see #unsetAlgorithm()
	 * @see #setAlgorithm(AlgorithmType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_Algorithm()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Algorithm'"
	 * @generated
	 */
	AlgorithmType getAlgorithm();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AlgorithmType
	 * @see #isSetAlgorithm()
	 * @see #unsetAlgorithm()
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(AlgorithmType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlgorithm()
	 * @see #getAlgorithm()
	 * @see #setAlgorithm(AlgorithmType)
	 * @generated
	 */
	void unsetAlgorithm();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getAlgorithm <em>Algorithm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Algorithm</em>' attribute is set.
	 * @see #unsetAlgorithm()
	 * @see #getAlgorithm()
	 * @see #setAlgorithm(AlgorithmType)
	 * @generated
	 */
	boolean isSetAlgorithm();

	/**
	 * Returns the value of the '<em><b>Last Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Processed</em>' attribute.
	 * @see #setLastProcessed(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_LastProcessed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastProcessed'"
	 * @generated
	 */
	XMLGregorianCalendar getLastProcessed();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getLastProcessed <em>Last Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Processed</em>' attribute.
	 * @see #getLastProcessed()
	 * @generated
	 */
	void setLastProcessed(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Algorithm Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm Parameters</em>' containment reference.
	 * @see #setAlgorithmParameters(AlgorithmParametersType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_AlgorithmParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AlgorithmParameters'"
	 * @generated
	 */
	AlgorithmParametersType getAlgorithmParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getAlgorithmParameters <em>Algorithm Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm Parameters</em>' containment reference.
	 * @see #getAlgorithmParameters()
	 * @generated
	 */
	void setAlgorithmParameters(AlgorithmParametersType value);

	/**
	 * Returns the value of the '<em><b>Allow Drill Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Drill Through</em>' attribute.
	 * @see #isSetAllowDrillThrough()
	 * @see #unsetAllowDrillThrough()
	 * @see #setAllowDrillThrough(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_AllowDrillThrough()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AllowDrillThrough'"
	 * @generated
	 */
	boolean isAllowDrillThrough();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#isAllowDrillThrough <em>Allow Drill Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Drill Through</em>' attribute.
	 * @see #isSetAllowDrillThrough()
	 * @see #unsetAllowDrillThrough()
	 * @see #isAllowDrillThrough()
	 * @generated
	 */
	void setAllowDrillThrough(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#isAllowDrillThrough <em>Allow Drill Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowDrillThrough()
	 * @see #isAllowDrillThrough()
	 * @see #setAllowDrillThrough(boolean)
	 * @generated
	 */
	void unsetAllowDrillThrough();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#isAllowDrillThrough <em>Allow Drill Through</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Drill Through</em>' attribute is set.
	 * @see #unsetAllowDrillThrough()
	 * @see #isAllowDrillThrough()
	 * @see #setAllowDrillThrough(boolean)
	 * @generated
	 */
	boolean isSetAllowDrillThrough();

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference.
	 * @see #setColumns(ColumnsType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_Columns()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Columns'"
	 * @generated
	 */
	ColumnsType2 getColumns();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getColumns <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' containment reference.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(ColumnsType2 value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.StateType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType1
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(StateType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_State()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='State'"
	 * @generated
	 */
	StateType1 getState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType1
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(StateType1)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(StateType1)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Folding Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folding Parameters</em>' containment reference.
	 * @see #setFoldingParameters(FoldingParameters)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_FoldingParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FoldingParameters'"
	 * @generated
	 */
	FoldingParameters getFoldingParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getFoldingParameters <em>Folding Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folding Parameters</em>' containment reference.
	 * @see #getFoldingParameters()
	 * @generated
	 */
	void setFoldingParameters(FoldingParameters value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_Filter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Filter'"
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

	/**
	 * Returns the value of the '<em><b>Mining Model Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Model Permissions</em>' containment reference.
	 * @see #setMiningModelPermissions(MiningModelPermissionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_MiningModelPermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MiningModelPermissions'"
	 * @generated
	 */
	MiningModelPermissionsType getMiningModelPermissions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getMiningModelPermissions <em>Mining Model Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Model Permissions</em>' containment reference.
	 * @see #getMiningModelPermissions()
	 * @generated
	 */
	void setMiningModelPermissions(MiningModelPermissionsType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Language'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Collation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collation</em>' attribute.
	 * @see #setCollation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModel_Collation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Collation'"
	 * @generated
	 */
	String getCollation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModel#getCollation <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collation</em>' attribute.
	 * @see #getCollation()
	 * @generated
	 */
	void setCollation(String value);

} // MiningModel
