/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculation Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getCalculationReference <em>Calculation Reference</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getCalculationType <em>Calculation Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getSolveOrder <em>Solve Order</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getFormatString <em>Format String</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getForeColor <em>Fore Color</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getBackColor <em>Back Color</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getFontName <em>Font Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getFontFlags <em>Font Flags</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getNonEmptyBehavior <em>Non Empty Behavior</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getAssociatedMeasureGroupID <em>Associated Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getDisplayFolder <em>Display Folder</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getVisualizationProperties <em>Visualization Properties</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty()
 * @model extendedMetaData="name='CalculationProperty' kind='elementOnly'"
 * @generated
 */
public interface CalculationProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Calculation Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation Reference</em>' attribute.
	 * @see #setCalculationReference(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_CalculationReference()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='CalculationReference'"
	 * @generated
	 */
	String getCalculationReference();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getCalculationReference <em>Calculation Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Reference</em>' attribute.
	 * @see #getCalculationReference()
	 * @generated
	 */
	void setCalculationReference(String value);

	/**
	 * Returns the value of the '<em><b>Calculation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculation Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CalculationTypeType
	 * @see #isSetCalculationType()
	 * @see #unsetCalculationType()
	 * @see #setCalculationType(CalculationTypeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_CalculationType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='CalculationType'"
	 * @generated
	 */
	CalculationTypeType getCalculationType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getCalculationType <em>Calculation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculation Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.CalculationTypeType
	 * @see #isSetCalculationType()
	 * @see #unsetCalculationType()
	 * @see #getCalculationType()
	 * @generated
	 */
	void setCalculationType(CalculationTypeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getCalculationType <em>Calculation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCalculationType()
	 * @see #getCalculationType()
	 * @see #setCalculationType(CalculationTypeType)
	 * @generated
	 */
	void unsetCalculationType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getCalculationType <em>Calculation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Calculation Type</em>' attribute is set.
	 * @see #unsetCalculationType()
	 * @see #getCalculationType()
	 * @see #setCalculationType(CalculationTypeType)
	 * @generated
	 */
	boolean isSetCalculationType();

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType14)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType14 getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType14 value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_Visible()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Visible'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#isVisible <em>Visible</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#isVisible <em>Visible</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Solve Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solve Order</em>' attribute.
	 * @see #setSolveOrder(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_SolveOrder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='SolveOrder'"
	 * @generated
	 */
	BigInteger getSolveOrder();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getSolveOrder <em>Solve Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solve Order</em>' attribute.
	 * @see #getSolveOrder()
	 * @generated
	 */
	void setSolveOrder(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format String</em>' attribute.
	 * @see #setFormatString(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_FormatString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FormatString'"
	 * @generated
	 */
	String getFormatString();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getFormatString <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format String</em>' attribute.
	 * @see #getFormatString()
	 * @generated
	 */
	void setFormatString(String value);

	/**
	 * Returns the value of the '<em><b>Fore Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fore Color</em>' attribute.
	 * @see #setForeColor(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_ForeColor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ForeColor'"
	 * @generated
	 */
	String getForeColor();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getForeColor <em>Fore Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fore Color</em>' attribute.
	 * @see #getForeColor()
	 * @generated
	 */
	void setForeColor(String value);

	/**
	 * Returns the value of the '<em><b>Back Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Back Color</em>' attribute.
	 * @see #setBackColor(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_BackColor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='BackColor'"
	 * @generated
	 */
	String getBackColor();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getBackColor <em>Back Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Back Color</em>' attribute.
	 * @see #getBackColor()
	 * @generated
	 */
	void setBackColor(String value);

	/**
	 * Returns the value of the '<em><b>Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Name</em>' attribute.
	 * @see #setFontName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_FontName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FontName'"
	 * @generated
	 */
	String getFontName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getFontName <em>Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Name</em>' attribute.
	 * @see #getFontName()
	 * @generated
	 */
	void setFontName(String value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_FontSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FontSize'"
	 * @generated
	 */
	String getFontSize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(String value);

	/**
	 * Returns the value of the '<em><b>Font Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Flags</em>' attribute.
	 * @see #setFontFlags(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_FontFlags()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FontFlags'"
	 * @generated
	 */
	String getFontFlags();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getFontFlags <em>Font Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Flags</em>' attribute.
	 * @see #getFontFlags()
	 * @generated
	 */
	void setFontFlags(String value);

	/**
	 * Returns the value of the '<em><b>Non Empty Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Empty Behavior</em>' attribute.
	 * @see #setNonEmptyBehavior(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_NonEmptyBehavior()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='NonEmptyBehavior'"
	 * @generated
	 */
	String getNonEmptyBehavior();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getNonEmptyBehavior <em>Non Empty Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Empty Behavior</em>' attribute.
	 * @see #getNonEmptyBehavior()
	 * @generated
	 */
	void setNonEmptyBehavior(String value);

	/**
	 * Returns the value of the '<em><b>Associated Measure Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Measure Group ID</em>' attribute.
	 * @see #setAssociatedMeasureGroupID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_AssociatedMeasureGroupID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AssociatedMeasureGroupID'"
	 * @generated
	 */
	String getAssociatedMeasureGroupID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getAssociatedMeasureGroupID <em>Associated Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Measure Group ID</em>' attribute.
	 * @see #getAssociatedMeasureGroupID()
	 * @generated
	 */
	void setAssociatedMeasureGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Display Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Folder</em>' attribute.
	 * @see #setDisplayFolder(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_DisplayFolder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DisplayFolder'"
	 * @generated
	 */
	String getDisplayFolder();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getDisplayFolder <em>Display Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Folder</em>' attribute.
	 * @see #getDisplayFolder()
	 * @generated
	 */
	void setDisplayFolder(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Language'"
	 * @generated
	 */
	BigInteger getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Visualization Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization Properties</em>' containment reference.
	 * @see #setVisualizationProperties(CalculationPropertiesVisualizationProperties)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCalculationProperty_VisualizationProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VisualizationProperties'"
	 * @generated
	 */
	CalculationPropertiesVisualizationProperties getVisualizationProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CalculationProperty#getVisualizationProperties <em>Visualization Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualization Properties</em>' containment reference.
	 * @see #getVisualizationProperties()
	 * @generated
	 */
	void setVisualizationProperties(CalculationPropertiesVisualizationProperties value);

} // CalculationProperty
