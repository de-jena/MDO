/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kpi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getDisplayFolder <em>Display Folder</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getAssociatedMeasureGroupID <em>Associated Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getTrend <em>Trend</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getWeight <em>Weight</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getTrendGraphic <em>Trend Graphic</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getStatusGraphic <em>Status Graphic</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getCurrentTimeMember <em>Current Time Member</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getParentKpiID <em>Parent Kpi ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi()
 * @model extendedMetaData="name='Kpi' kind='elementOnly'"
 * @generated
 */
public interface Kpi extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType value);

	/**
	 * Returns the value of the '<em><b>Display Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Folder</em>' attribute.
	 * @see #setDisplayFolder(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_DisplayFolder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DisplayFolder'"
	 * @generated
	 */
	String getDisplayFolder();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getDisplayFolder <em>Display Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Folder</em>' attribute.
	 * @see #getDisplayFolder()
	 * @generated
	 */
	void setDisplayFolder(String value);

	/**
	 * Returns the value of the '<em><b>Associated Measure Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Measure Group ID</em>' attribute.
	 * @see #setAssociatedMeasureGroupID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_AssociatedMeasureGroupID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AssociatedMeasureGroupID'"
	 * @generated
	 */
	String getAssociatedMeasureGroupID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getAssociatedMeasureGroupID <em>Associated Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Measure Group ID</em>' attribute.
	 * @see #getAssociatedMeasureGroupID()
	 * @generated
	 */
	void setAssociatedMeasureGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' attribute.
	 * @see #setGoal(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_Goal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Goal'"
	 * @generated
	 */
	String getGoal();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getGoal <em>Goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' attribute.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_Status()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Status'"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Trend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trend</em>' attribute.
	 * @see #setTrend(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_Trend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Trend'"
	 * @generated
	 */
	String getTrend();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getTrend <em>Trend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trend</em>' attribute.
	 * @see #getTrend()
	 * @generated
	 */
	void setTrend(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_Weight()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Weight'"
	 * @generated
	 */
	String getWeight();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(String value);

	/**
	 * Returns the value of the '<em><b>Trend Graphic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trend Graphic</em>' attribute.
	 * @see #setTrendGraphic(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_TrendGraphic()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='TrendGraphic'"
	 * @generated
	 */
	String getTrendGraphic();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getTrendGraphic <em>Trend Graphic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trend Graphic</em>' attribute.
	 * @see #getTrendGraphic()
	 * @generated
	 */
	void setTrendGraphic(String value);

	/**
	 * Returns the value of the '<em><b>Status Graphic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Graphic</em>' attribute.
	 * @see #setStatusGraphic(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_StatusGraphic()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='StatusGraphic'"
	 * @generated
	 */
	String getStatusGraphic();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getStatusGraphic <em>Status Graphic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Graphic</em>' attribute.
	 * @see #getStatusGraphic()
	 * @generated
	 */
	void setStatusGraphic(String value);

	/**
	 * Returns the value of the '<em><b>Current Time Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Time Member</em>' attribute.
	 * @see #setCurrentTimeMember(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_CurrentTimeMember()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CurrentTimeMember'"
	 * @generated
	 */
	String getCurrentTimeMember();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getCurrentTimeMember <em>Current Time Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Time Member</em>' attribute.
	 * @see #getCurrentTimeMember()
	 * @generated
	 */
	void setCurrentTimeMember(String value);

	/**
	 * Returns the value of the '<em><b>Parent Kpi ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Kpi ID</em>' attribute.
	 * @see #setParentKpiID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_ParentKpiID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ParentKpiID'"
	 * @generated
	 */
	String getParentKpiID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getParentKpiID <em>Parent Kpi ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Kpi ID</em>' attribute.
	 * @see #getParentKpiID()
	 * @generated
	 */
	void setParentKpiID(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getKpi_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Kpi#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

} // Kpi
