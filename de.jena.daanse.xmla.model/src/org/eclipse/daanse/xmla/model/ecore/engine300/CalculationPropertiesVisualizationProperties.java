/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculation Properties Visualization Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getFolderPosition <em>Folder Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsFolderDefault <em>Is Folder Default</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsRightToLeft <em>Is Right To Left</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getSortDirection <em>Sort Direction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getUnits <em>Units</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsDefaultMeasure <em>Is Default Measure</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsSimpleMeasure <em>Is Simple Measure</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties()
 * @model extendedMetaData="name='CalculationPropertiesVisualizationProperties' kind='elementOnly'"
 * @generated
 */
public interface CalculationPropertiesVisualizationProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Folder Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Position</em>' attribute.
	 * @see #isSetFolderPosition()
	 * @see #unsetFolderPosition()
	 * @see #setFolderPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties_FolderPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='FolderPosition'"
	 * @generated
	 */
	BigInteger getFolderPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getFolderPosition <em>Folder Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder Position</em>' attribute.
	 * @see #isSetFolderPosition()
	 * @see #unsetFolderPosition()
	 * @see #getFolderPosition()
	 * @generated
	 */
	void setFolderPosition(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getFolderPosition <em>Folder Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFolderPosition()
	 * @see #getFolderPosition()
	 * @see #setFolderPosition(BigInteger)
	 * @generated
	 */
	void unsetFolderPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getFolderPosition <em>Folder Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Folder Position</em>' attribute is set.
	 * @see #unsetFolderPosition()
	 * @see #getFolderPosition()
	 * @see #setFolderPosition(BigInteger)
	 * @generated
	 */
	boolean isSetFolderPosition();

	/**
	 * Returns the value of the '<em><b>Contextual Name Rule</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextual Name Rule</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3
	 * @see #isSetContextualNameRule()
	 * @see #unsetContextualNameRule()
	 * @see #setContextualNameRule(ContextualNameRuleType3)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties_ContextualNameRule()
	 * @model default="None" unsettable="true"
	 *        extendedMetaData="kind='element' name='ContextualNameRule'"
	 * @generated
	 */
	ContextualNameRuleType3 getContextualNameRule();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextual Name Rule</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType3
	 * @see #isSetContextualNameRule()
	 * @see #unsetContextualNameRule()
	 * @see #getContextualNameRule()
	 * @generated
	 */
	void setContextualNameRule(ContextualNameRuleType3 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContextualNameRule()
	 * @see #getContextualNameRule()
	 * @see #setContextualNameRule(ContextualNameRuleType3)
	 * @generated
	 */
	void unsetContextualNameRule();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contextual Name Rule</em>' attribute is set.
	 * @see #unsetContextualNameRule()
	 * @see #getContextualNameRule()
	 * @see #setContextualNameRule(ContextualNameRuleType3)
	 * @generated
	 */
	boolean isSetContextualNameRule();

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #setAlignment(AlignmentType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties_Alignment()
	 * @model default="Default" unsettable="true"
	 *        extendedMetaData="kind='element' name='Alignment'"
	 * @generated
	 */
	AlignmentType1 getAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType1
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(AlignmentType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(AlignmentType1)
	 * @generated
	 */
	void unsetAlignment();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getAlignment <em>Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alignment</em>' attribute is set.
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(AlignmentType1)
	 * @generated
	 */
	boolean isSetAlignment();

	/**
	 * Returns the value of the '<em><b>Is Folder Default</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Folder Default</em>' attribute.
	 * @see #isSetIsFolderDefault()
	 * @see #unsetIsFolderDefault()
	 * @see #setIsFolderDefault(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties_IsFolderDefault()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsFolderDefault'"
	 * @generated
	 */
	boolean isIsFolderDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsFolderDefault <em>Is Folder Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Folder Default</em>' attribute.
	 * @see #isSetIsFolderDefault()
	 * @see #unsetIsFolderDefault()
	 * @see #isIsFolderDefault()
	 * @generated
	 */
	void setIsFolderDefault(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsFolderDefault <em>Is Folder Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsFolderDefault()
	 * @see #isIsFolderDefault()
	 * @see #setIsFolderDefault(boolean)
	 * @generated
	 */
	void unsetIsFolderDefault();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsFolderDefault <em>Is Folder Default</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Folder Default</em>' attribute is set.
	 * @see #unsetIsFolderDefault()
	 * @see #isIsFolderDefault()
	 * @see #setIsFolderDefault(boolean)
	 * @generated
	 */
	boolean isSetIsFolderDefault();

	/**
	 * Returns the value of the '<em><b>Is Right To Left</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Right To Left</em>' attribute.
	 * @see #isSetIsRightToLeft()
	 * @see #unsetIsRightToLeft()
	 * @see #setIsRightToLeft(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties_IsRightToLeft()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsRightToLeft'"
	 * @generated
	 */
	boolean isIsRightToLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsRightToLeft <em>Is Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Right To Left</em>' attribute.
	 * @see #isSetIsRightToLeft()
	 * @see #unsetIsRightToLeft()
	 * @see #isIsRightToLeft()
	 * @generated
	 */
	void setIsRightToLeft(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsRightToLeft <em>Is Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsRightToLeft()
	 * @see #isIsRightToLeft()
	 * @see #setIsRightToLeft(boolean)
	 * @generated
	 */
	void unsetIsRightToLeft();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsRightToLeft <em>Is Right To Left</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Right To Left</em>' attribute is set.
	 * @see #unsetIsRightToLeft()
	 * @see #isIsRightToLeft()
	 * @see #setIsRightToLeft(boolean)
	 * @generated
	 */
	boolean isSetIsRightToLeft();

	/**
	 * Returns the value of the '<em><b>Sort Direction</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Direction</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1
	 * @see #isSetSortDirection()
	 * @see #unsetSortDirection()
	 * @see #setSortDirection(SortDirectionType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties_SortDirection()
	 * @model default="Default" unsettable="true"
	 *        extendedMetaData="kind='element' name='SortDirection'"
	 * @generated
	 */
	SortDirectionType1 getSortDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getSortDirection <em>Sort Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Direction</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType1
	 * @see #isSetSortDirection()
	 * @see #unsetSortDirection()
	 * @see #getSortDirection()
	 * @generated
	 */
	void setSortDirection(SortDirectionType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getSortDirection <em>Sort Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortDirection()
	 * @see #getSortDirection()
	 * @see #setSortDirection(SortDirectionType1)
	 * @generated
	 */
	void unsetSortDirection();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getSortDirection <em>Sort Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Direction</em>' attribute is set.
	 * @see #unsetSortDirection()
	 * @see #getSortDirection()
	 * @see #setSortDirection(SortDirectionType1)
	 * @generated
	 */
	boolean isSetSortDirection();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #isSetUnits()
	 * @see #unsetUnits()
	 * @see #setUnits(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties_Units()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Units'"
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #isSetUnits()
	 * @see #unsetUnits()
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnits()
	 * @see #getUnits()
	 * @see #setUnits(String)
	 * @generated
	 */
	void unsetUnits();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getUnits <em>Units</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Units</em>' attribute is set.
	 * @see #unsetUnits()
	 * @see #getUnits()
	 * @see #setUnits(String)
	 * @generated
	 */
	boolean isSetUnits();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #setWidth(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties_Width()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Width'"
	 * @generated
	 */
	BigInteger getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(BigInteger)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(BigInteger)
	 * @generated
	 */
	boolean isSetWidth();

	/**
	 * Returns the value of the '<em><b>Is Default Measure</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default Measure</em>' attribute.
	 * @see #isSetIsDefaultMeasure()
	 * @see #unsetIsDefaultMeasure()
	 * @see #setIsDefaultMeasure(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties_IsDefaultMeasure()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsDefaultMeasure'"
	 * @generated
	 */
	boolean isIsDefaultMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsDefaultMeasure <em>Is Default Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default Measure</em>' attribute.
	 * @see #isSetIsDefaultMeasure()
	 * @see #unsetIsDefaultMeasure()
	 * @see #isIsDefaultMeasure()
	 * @generated
	 */
	void setIsDefaultMeasure(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsDefaultMeasure <em>Is Default Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDefaultMeasure()
	 * @see #isIsDefaultMeasure()
	 * @see #setIsDefaultMeasure(boolean)
	 * @generated
	 */
	void unsetIsDefaultMeasure();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsDefaultMeasure <em>Is Default Measure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Default Measure</em>' attribute is set.
	 * @see #unsetIsDefaultMeasure()
	 * @see #isIsDefaultMeasure()
	 * @see #setIsDefaultMeasure(boolean)
	 * @generated
	 */
	boolean isSetIsDefaultMeasure();

	/**
	 * Returns the value of the '<em><b>Default Details Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Details Position</em>' attribute.
	 * @see #isSetDefaultDetailsPosition()
	 * @see #unsetDefaultDetailsPosition()
	 * @see #setDefaultDetailsPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties_DefaultDetailsPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='DefaultDetailsPosition'"
	 * @generated
	 */
	BigInteger getDefaultDetailsPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Details Position</em>' attribute.
	 * @see #isSetDefaultDetailsPosition()
	 * @see #unsetDefaultDetailsPosition()
	 * @see #getDefaultDetailsPosition()
	 * @generated
	 */
	void setDefaultDetailsPosition(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultDetailsPosition()
	 * @see #getDefaultDetailsPosition()
	 * @see #setDefaultDetailsPosition(BigInteger)
	 * @generated
	 */
	void unsetDefaultDetailsPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Details Position</em>' attribute is set.
	 * @see #unsetDefaultDetailsPosition()
	 * @see #getDefaultDetailsPosition()
	 * @see #setDefaultDetailsPosition(BigInteger)
	 * @generated
	 */
	boolean isSetDefaultDetailsPosition();

	/**
	 * Returns the value of the '<em><b>Sort Properties Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Properties Position</em>' attribute.
	 * @see #isSetSortPropertiesPosition()
	 * @see #unsetSortPropertiesPosition()
	 * @see #setSortPropertiesPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties_SortPropertiesPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='SortPropertiesPosition'"
	 * @generated
	 */
	BigInteger getSortPropertiesPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Properties Position</em>' attribute.
	 * @see #isSetSortPropertiesPosition()
	 * @see #unsetSortPropertiesPosition()
	 * @see #getSortPropertiesPosition()
	 * @generated
	 */
	void setSortPropertiesPosition(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortPropertiesPosition()
	 * @see #getSortPropertiesPosition()
	 * @see #setSortPropertiesPosition(BigInteger)
	 * @generated
	 */
	void unsetSortPropertiesPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Properties Position</em>' attribute is set.
	 * @see #unsetSortPropertiesPosition()
	 * @see #getSortPropertiesPosition()
	 * @see #setSortPropertiesPosition(BigInteger)
	 * @generated
	 */
	boolean isSetSortPropertiesPosition();

	/**
	 * Returns the value of the '<em><b>Is Simple Measure</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Simple Measure</em>' attribute.
	 * @see #isSetIsSimpleMeasure()
	 * @see #unsetIsSimpleMeasure()
	 * @see #setIsSimpleMeasure(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getCalculationPropertiesVisualizationProperties_IsSimpleMeasure()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsSimpleMeasure'"
	 * @generated
	 */
	boolean isIsSimpleMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsSimpleMeasure <em>Is Simple Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Simple Measure</em>' attribute.
	 * @see #isSetIsSimpleMeasure()
	 * @see #unsetIsSimpleMeasure()
	 * @see #isIsSimpleMeasure()
	 * @generated
	 */
	void setIsSimpleMeasure(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsSimpleMeasure <em>Is Simple Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSimpleMeasure()
	 * @see #isIsSimpleMeasure()
	 * @see #setIsSimpleMeasure(boolean)
	 * @generated
	 */
	void unsetIsSimpleMeasure();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.CalculationPropertiesVisualizationProperties#isIsSimpleMeasure <em>Is Simple Measure</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Simple Measure</em>' attribute is set.
	 * @see #unsetIsSimpleMeasure()
	 * @see #isIsSimpleMeasure()
	 * @see #setIsSimpleMeasure(boolean)
	 * @generated
	 */
	boolean isSetIsSimpleMeasure();

} // CalculationPropertiesVisualizationProperties
