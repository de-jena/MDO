/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.engine800.DaxOptimizationModeType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getCubePermissions <em>Cube Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getMdxScripts <em>Mdx Scripts</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getPerspectives <em>Perspectives</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getDefaultMeasure <em>Default Measure</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getMeasureGroups <em>Measure Groups</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getAggregationPrefix <em>Aggregation Prefix</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getProcessingPriority <em>Processing Priority</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getStorageMode <em>Storage Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getProcessingMode <em>Processing Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getScriptCacheProcessingMode <em>Script Cache Processing Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getScriptErrorHandlingMode <em>Script Error Handling Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getDaxOptimizationMode <em>Dax Optimization Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getProactiveCaching <em>Proactive Caching</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getKpis <em>Kpis</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getActions <em>Actions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getStorageLocation <em>Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getEstimatedRows <em>Estimated Rows</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getLastProcessed <em>Last Processed</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube()
 * @model extendedMetaData="name='Cube' kind='elementOnly'"
 * @generated
 */
public interface Cube extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_CreatedTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreatedTimestamp'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getCreatedTimestamp <em>Created Timestamp</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_LastSchemaUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastSchemaUpdate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastSchemaUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getLastSchemaUpdate <em>Last Schema Update</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getDescription <em>Description</em>}' attribute.
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
	 * @see #setAnnotations(AnnotationsType55)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType55 getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType55 value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Language'"
	 * @generated
	 */
	BigInteger getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getLanguage <em>Language</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_Collation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Collation'"
	 * @generated
	 */
	String getCollation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getCollation <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collation</em>' attribute.
	 * @see #getCollation()
	 * @generated
	 */
	void setCollation(String value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType22)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType22 getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType22 value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference.
	 * @see #setDimensions(DimensionsType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_Dimensions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Dimensions'"
	 * @generated
	 */
	DimensionsType2 getDimensions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getDimensions <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' containment reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(DimensionsType2 value);

	/**
	 * Returns the value of the '<em><b>Cube Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Permissions</em>' containment reference.
	 * @see #setCubePermissions(CubePermissionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_CubePermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CubePermissions'"
	 * @generated
	 */
	CubePermissionsType getCubePermissions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getCubePermissions <em>Cube Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube Permissions</em>' containment reference.
	 * @see #getCubePermissions()
	 * @generated
	 */
	void setCubePermissions(CubePermissionsType value);

	/**
	 * Returns the value of the '<em><b>Mdx Scripts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdx Scripts</em>' containment reference.
	 * @see #setMdxScripts(MdxScriptsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_MdxScripts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MdxScripts'"
	 * @generated
	 */
	MdxScriptsType getMdxScripts();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getMdxScripts <em>Mdx Scripts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdx Scripts</em>' containment reference.
	 * @see #getMdxScripts()
	 * @generated
	 */
	void setMdxScripts(MdxScriptsType value);

	/**
	 * Returns the value of the '<em><b>Perspectives</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspectives</em>' containment reference.
	 * @see #setPerspectives(PerspectivesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_Perspectives()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Perspectives'"
	 * @generated
	 */
	PerspectivesType getPerspectives();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getPerspectives <em>Perspectives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perspectives</em>' containment reference.
	 * @see #getPerspectives()
	 * @generated
	 */
	void setPerspectives(PerspectivesType value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.StateType6}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType6
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(StateType6)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_State()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='State'"
	 * @generated
	 */
	StateType6 getState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType6
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType6 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(StateType6)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(StateType6)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Default Measure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Measure</em>' attribute.
	 * @see #setDefaultMeasure(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_DefaultMeasure()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DefaultMeasure'"
	 * @generated
	 */
	String getDefaultMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getDefaultMeasure <em>Default Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Measure</em>' attribute.
	 * @see #getDefaultMeasure()
	 * @generated
	 */
	void setDefaultMeasure(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_Visible()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Visible'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#isVisible <em>Visible</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#isVisible <em>Visible</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Measure Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Groups</em>' containment reference.
	 * @see #setMeasureGroups(MeasureGroupsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_MeasureGroups()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MeasureGroups'"
	 * @generated
	 */
	MeasureGroupsType getMeasureGroups();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getMeasureGroups <em>Measure Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Groups</em>' containment reference.
	 * @see #getMeasureGroups()
	 * @generated
	 */
	void setMeasureGroups(MeasureGroupsType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(DataSourceViewBinding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	DataSourceViewBinding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(DataSourceViewBinding value);

	/**
	 * Returns the value of the '<em><b>Aggregation Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Prefix</em>' attribute.
	 * @see #setAggregationPrefix(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_AggregationPrefix()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AggregationPrefix'"
	 * @generated
	 */
	String getAggregationPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getAggregationPrefix <em>Aggregation Prefix</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_ProcessingPriority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ProcessingPriority'"
	 * @generated
	 */
	BigInteger getProcessingPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getProcessingPriority <em>Processing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Priority</em>' attribute.
	 * @see #getProcessingPriority()
	 * @generated
	 */
	void setProcessingPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Storage Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Mode</em>' containment reference.
	 * @see #setStorageMode(StorageModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_StorageMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StorageMode'"
	 * @generated
	 */
	StorageModeType getStorageMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getStorageMode <em>Storage Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Mode</em>' containment reference.
	 * @see #getStorageMode()
	 * @generated
	 */
	void setStorageMode(StorageModeType value);

	/**
	 * Returns the value of the '<em><b>Processing Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType1
	 * @see #isSetProcessingMode()
	 * @see #unsetProcessingMode()
	 * @see #setProcessingMode(ProcessingModeType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_ProcessingMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProcessingMode'"
	 * @generated
	 */
	ProcessingModeType1 getProcessingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getProcessingMode <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType1
	 * @see #isSetProcessingMode()
	 * @see #unsetProcessingMode()
	 * @see #getProcessingMode()
	 * @generated
	 */
	void setProcessingMode(ProcessingModeType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getProcessingMode <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessingMode()
	 * @see #getProcessingMode()
	 * @see #setProcessingMode(ProcessingModeType1)
	 * @generated
	 */
	void unsetProcessingMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getProcessingMode <em>Processing Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Processing Mode</em>' attribute is set.
	 * @see #unsetProcessingMode()
	 * @see #getProcessingMode()
	 * @see #setProcessingMode(ProcessingModeType1)
	 * @generated
	 */
	boolean isSetProcessingMode();

	/**
	 * Returns the value of the '<em><b>Script Cache Processing Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ScriptCacheProcessingModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Cache Processing Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ScriptCacheProcessingModeType
	 * @see #isSetScriptCacheProcessingMode()
	 * @see #unsetScriptCacheProcessingMode()
	 * @see #setScriptCacheProcessingMode(ScriptCacheProcessingModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_ScriptCacheProcessingMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ScriptCacheProcessingMode'"
	 * @generated
	 */
	ScriptCacheProcessingModeType getScriptCacheProcessingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getScriptCacheProcessingMode <em>Script Cache Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Cache Processing Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ScriptCacheProcessingModeType
	 * @see #isSetScriptCacheProcessingMode()
	 * @see #unsetScriptCacheProcessingMode()
	 * @see #getScriptCacheProcessingMode()
	 * @generated
	 */
	void setScriptCacheProcessingMode(ScriptCacheProcessingModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getScriptCacheProcessingMode <em>Script Cache Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScriptCacheProcessingMode()
	 * @see #getScriptCacheProcessingMode()
	 * @see #setScriptCacheProcessingMode(ScriptCacheProcessingModeType)
	 * @generated
	 */
	void unsetScriptCacheProcessingMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getScriptCacheProcessingMode <em>Script Cache Processing Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Script Cache Processing Mode</em>' attribute is set.
	 * @see #unsetScriptCacheProcessingMode()
	 * @see #getScriptCacheProcessingMode()
	 * @see #setScriptCacheProcessingMode(ScriptCacheProcessingModeType)
	 * @generated
	 */
	boolean isSetScriptCacheProcessingMode();

	/**
	 * Returns the value of the '<em><b>Script Error Handling Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ScriptErrorHandlingModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Error Handling Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ScriptErrorHandlingModeType
	 * @see #isSetScriptErrorHandlingMode()
	 * @see #unsetScriptErrorHandlingMode()
	 * @see #setScriptErrorHandlingMode(ScriptErrorHandlingModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_ScriptErrorHandlingMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ScriptErrorHandlingMode'"
	 * @generated
	 */
	ScriptErrorHandlingModeType getScriptErrorHandlingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getScriptErrorHandlingMode <em>Script Error Handling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Error Handling Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ScriptErrorHandlingModeType
	 * @see #isSetScriptErrorHandlingMode()
	 * @see #unsetScriptErrorHandlingMode()
	 * @see #getScriptErrorHandlingMode()
	 * @generated
	 */
	void setScriptErrorHandlingMode(ScriptErrorHandlingModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getScriptErrorHandlingMode <em>Script Error Handling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScriptErrorHandlingMode()
	 * @see #getScriptErrorHandlingMode()
	 * @see #setScriptErrorHandlingMode(ScriptErrorHandlingModeType)
	 * @generated
	 */
	void unsetScriptErrorHandlingMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getScriptErrorHandlingMode <em>Script Error Handling Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Script Error Handling Mode</em>' attribute is set.
	 * @see #unsetScriptErrorHandlingMode()
	 * @see #getScriptErrorHandlingMode()
	 * @see #setScriptErrorHandlingMode(ScriptErrorHandlingModeType)
	 * @generated
	 */
	boolean isSetScriptErrorHandlingMode();

	/**
	 * Returns the value of the '<em><b>Dax Optimization Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine800.DaxOptimizationModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dax Optimization Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine800.DaxOptimizationModeType
	 * @see #isSetDaxOptimizationMode()
	 * @see #unsetDaxOptimizationMode()
	 * @see #setDaxOptimizationMode(DaxOptimizationModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_DaxOptimizationMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DaxOptimizationMode' namespace='http://schemas.microsoft.com/analysisservices/2013/engine/800'"
	 * @generated
	 */
	DaxOptimizationModeType getDaxOptimizationMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getDaxOptimizationMode <em>Dax Optimization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dax Optimization Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine800.DaxOptimizationModeType
	 * @see #isSetDaxOptimizationMode()
	 * @see #unsetDaxOptimizationMode()
	 * @see #getDaxOptimizationMode()
	 * @generated
	 */
	void setDaxOptimizationMode(DaxOptimizationModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getDaxOptimizationMode <em>Dax Optimization Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDaxOptimizationMode()
	 * @see #getDaxOptimizationMode()
	 * @see #setDaxOptimizationMode(DaxOptimizationModeType)
	 * @generated
	 */
	void unsetDaxOptimizationMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getDaxOptimizationMode <em>Dax Optimization Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dax Optimization Mode</em>' attribute is set.
	 * @see #unsetDaxOptimizationMode()
	 * @see #getDaxOptimizationMode()
	 * @see #setDaxOptimizationMode(DaxOptimizationModeType)
	 * @generated
	 */
	boolean isSetDaxOptimizationMode();

	/**
	 * Returns the value of the '<em><b>Proactive Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proactive Caching</em>' containment reference.
	 * @see #setProactiveCaching(ProactiveCaching)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_ProactiveCaching()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProactiveCaching'"
	 * @generated
	 */
	ProactiveCaching getProactiveCaching();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getProactiveCaching <em>Proactive Caching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proactive Caching</em>' containment reference.
	 * @see #getProactiveCaching()
	 * @generated
	 */
	void setProactiveCaching(ProactiveCaching value);

	/**
	 * Returns the value of the '<em><b>Kpis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kpis</em>' containment reference.
	 * @see #setKpis(KpisType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_Kpis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kpis'"
	 * @generated
	 */
	KpisType getKpis();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getKpis <em>Kpis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kpis</em>' containment reference.
	 * @see #getKpis()
	 * @generated
	 */
	void setKpis(KpisType value);

	/**
	 * Returns the value of the '<em><b>Error Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Configuration</em>' containment reference.
	 * @see #setErrorConfiguration(ErrorConfiguration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_ErrorConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ErrorConfiguration'"
	 * @generated
	 */
	ErrorConfiguration getErrorConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getErrorConfiguration <em>Error Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Configuration</em>' containment reference.
	 * @see #getErrorConfiguration()
	 * @generated
	 */
	void setErrorConfiguration(ErrorConfiguration value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference.
	 * @see #setActions(ActionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_Actions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Actions'"
	 * @generated
	 */
	ActionsType getActions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getActions <em>Actions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actions</em>' containment reference.
	 * @see #getActions()
	 * @generated
	 */
	void setActions(ActionsType value);

	/**
	 * Returns the value of the '<em><b>Storage Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Location</em>' attribute.
	 * @see #setStorageLocation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_StorageLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='StorageLocation'"
	 * @generated
	 */
	String getStorageLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getStorageLocation <em>Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Location</em>' attribute.
	 * @see #getStorageLocation()
	 * @generated
	 */
	void setStorageLocation(String value);

	/**
	 * Returns the value of the '<em><b>Estimated Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Rows</em>' attribute.
	 * @see #isSetEstimatedRows()
	 * @see #unsetEstimatedRows()
	 * @see #setEstimatedRows(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_EstimatedRows()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='EstimatedRows'"
	 * @generated
	 */
	long getEstimatedRows();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getEstimatedRows <em>Estimated Rows</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getEstimatedRows <em>Estimated Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEstimatedRows()
	 * @see #getEstimatedRows()
	 * @see #setEstimatedRows(long)
	 * @generated
	 */
	void unsetEstimatedRows();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getEstimatedRows <em>Estimated Rows</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Last Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Processed</em>' attribute.
	 * @see #setLastProcessed(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCube_LastProcessed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastProcessed'"
	 * @generated
	 */
	XMLGregorianCalendar getLastProcessed();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Cube#getLastProcessed <em>Last Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Processed</em>' attribute.
	 * @see #getLastProcessed()
	 * @generated
	 */
	void setLastProcessed(XMLGregorianCalendar value);

} // Cube
