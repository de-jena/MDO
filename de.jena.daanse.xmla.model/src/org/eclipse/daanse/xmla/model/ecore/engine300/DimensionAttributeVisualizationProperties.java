/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Attribute Visualization Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getFolderPosition <em>Folder Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsFolderDefault <em>Is Folder Default</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsRightToLeft <em>Is Right To Left</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getSortDirection <em>Sort Direction</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getUnits <em>Units</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getWidth <em>Width</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getCommonIdentifierPosition <em>Common Identifier Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDisplayKeyPosition <em>Display Key Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsDefaultImage <em>Is Default Image</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDefaultAggregateFunction <em>Default Aggregate Function</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties()
 * @model extendedMetaData="name='DimensionAttributeVisualizationProperties' kind='elementOnly'"
 * @generated
 */
public interface DimensionAttributeVisualizationProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Folder Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Position</em>' attribute.
	 * @see #isSetFolderPosition()
	 * @see #unsetFolderPosition()
	 * @see #setFolderPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_FolderPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='FolderPosition'"
	 * @generated
	 */
	BigInteger getFolderPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getFolderPosition <em>Folder Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getFolderPosition <em>Folder Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFolderPosition()
	 * @see #getFolderPosition()
	 * @see #setFolderPosition(BigInteger)
	 * @generated
	 */
	void unsetFolderPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getFolderPosition <em>Folder Position</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextual Name Rule</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1
	 * @see #isSetContextualNameRule()
	 * @see #unsetContextualNameRule()
	 * @see #setContextualNameRule(ContextualNameRuleType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_ContextualNameRule()
	 * @model default="None" unsettable="true"
	 *        extendedMetaData="kind='element' name='ContextualNameRule'"
	 * @generated
	 */
	ContextualNameRuleType1 getContextualNameRule();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextual Name Rule</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType1
	 * @see #isSetContextualNameRule()
	 * @see #unsetContextualNameRule()
	 * @see #getContextualNameRule()
	 * @generated
	 */
	void setContextualNameRule(ContextualNameRuleType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContextualNameRule()
	 * @see #getContextualNameRule()
	 * @see #setContextualNameRule(ContextualNameRuleType1)
	 * @generated
	 */
	void unsetContextualNameRule();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contextual Name Rule</em>' attribute is set.
	 * @see #unsetContextualNameRule()
	 * @see #getContextualNameRule()
	 * @see #setContextualNameRule(ContextualNameRuleType1)
	 * @generated
	 */
	boolean isSetContextualNameRule();

	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #setAlignment(AlignmentType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_Alignment()
	 * @model default="Default" unsettable="true"
	 *        extendedMetaData="kind='element' name='Alignment'"
	 * @generated
	 */
	AlignmentType getAlignment();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.AlignmentType
	 * @see #isSetAlignment()
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(AlignmentType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(AlignmentType)
	 * @generated
	 */
	void unsetAlignment();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getAlignment <em>Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alignment</em>' attribute is set.
	 * @see #unsetAlignment()
	 * @see #getAlignment()
	 * @see #setAlignment(AlignmentType)
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_IsFolderDefault()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsFolderDefault'"
	 * @generated
	 */
	boolean isIsFolderDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsFolderDefault <em>Is Folder Default</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsFolderDefault <em>Is Folder Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsFolderDefault()
	 * @see #isIsFolderDefault()
	 * @see #setIsFolderDefault(boolean)
	 * @generated
	 */
	void unsetIsFolderDefault();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsFolderDefault <em>Is Folder Default</em>}' attribute is set.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_IsRightToLeft()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsRightToLeft'"
	 * @generated
	 */
	boolean isIsRightToLeft();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsRightToLeft <em>Is Right To Left</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsRightToLeft <em>Is Right To Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsRightToLeft()
	 * @see #isIsRightToLeft()
	 * @see #setIsRightToLeft(boolean)
	 * @generated
	 */
	void unsetIsRightToLeft();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsRightToLeft <em>Is Right To Left</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Direction</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType
	 * @see #isSetSortDirection()
	 * @see #unsetSortDirection()
	 * @see #setSortDirection(SortDirectionType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_SortDirection()
	 * @model default="Default" unsettable="true"
	 *        extendedMetaData="kind='element' name='SortDirection'"
	 * @generated
	 */
	SortDirectionType getSortDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getSortDirection <em>Sort Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Direction</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.SortDirectionType
	 * @see #isSetSortDirection()
	 * @see #unsetSortDirection()
	 * @see #getSortDirection()
	 * @generated
	 */
	void setSortDirection(SortDirectionType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getSortDirection <em>Sort Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortDirection()
	 * @see #getSortDirection()
	 * @see #setSortDirection(SortDirectionType)
	 * @generated
	 */
	void unsetSortDirection();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getSortDirection <em>Sort Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Direction</em>' attribute is set.
	 * @see #unsetSortDirection()
	 * @see #getSortDirection()
	 * @see #setSortDirection(SortDirectionType)
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_Units()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Units'"
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getUnits <em>Units</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnits()
	 * @see #getUnits()
	 * @see #setUnits(String)
	 * @generated
	 */
	void unsetUnits();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getUnits <em>Units</em>}' attribute is set.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_Width()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Width'"
	 * @generated
	 */
	BigInteger getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getWidth <em>Width</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(BigInteger)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getWidth <em>Width</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Default Details Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Details Position</em>' attribute.
	 * @see #isSetDefaultDetailsPosition()
	 * @see #unsetDefaultDetailsPosition()
	 * @see #setDefaultDetailsPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_DefaultDetailsPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='DefaultDetailsPosition'"
	 * @generated
	 */
	BigInteger getDefaultDetailsPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultDetailsPosition()
	 * @see #getDefaultDetailsPosition()
	 * @see #setDefaultDetailsPosition(BigInteger)
	 * @generated
	 */
	void unsetDefaultDetailsPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Common Identifier Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Identifier Position</em>' attribute.
	 * @see #isSetCommonIdentifierPosition()
	 * @see #unsetCommonIdentifierPosition()
	 * @see #setCommonIdentifierPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_CommonIdentifierPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='CommonIdentifierPosition'"
	 * @generated
	 */
	BigInteger getCommonIdentifierPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getCommonIdentifierPosition <em>Common Identifier Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Identifier Position</em>' attribute.
	 * @see #isSetCommonIdentifierPosition()
	 * @see #unsetCommonIdentifierPosition()
	 * @see #getCommonIdentifierPosition()
	 * @generated
	 */
	void setCommonIdentifierPosition(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getCommonIdentifierPosition <em>Common Identifier Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCommonIdentifierPosition()
	 * @see #getCommonIdentifierPosition()
	 * @see #setCommonIdentifierPosition(BigInteger)
	 * @generated
	 */
	void unsetCommonIdentifierPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getCommonIdentifierPosition <em>Common Identifier Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Common Identifier Position</em>' attribute is set.
	 * @see #unsetCommonIdentifierPosition()
	 * @see #getCommonIdentifierPosition()
	 * @see #setCommonIdentifierPosition(BigInteger)
	 * @generated
	 */
	boolean isSetCommonIdentifierPosition();

	/**
	 * Returns the value of the '<em><b>Sort Properties Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Properties Position</em>' attribute.
	 * @see #isSetSortPropertiesPosition()
	 * @see #unsetSortPropertiesPosition()
	 * @see #setSortPropertiesPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_SortPropertiesPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='SortPropertiesPosition'"
	 * @generated
	 */
	BigInteger getSortPropertiesPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortPropertiesPosition()
	 * @see #getSortPropertiesPosition()
	 * @see #setSortPropertiesPosition(BigInteger)
	 * @generated
	 */
	void unsetSortPropertiesPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Display Key Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Key Position</em>' attribute.
	 * @see #isSetDisplayKeyPosition()
	 * @see #unsetDisplayKeyPosition()
	 * @see #setDisplayKeyPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_DisplayKeyPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='DisplayKeyPosition'"
	 * @generated
	 */
	BigInteger getDisplayKeyPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDisplayKeyPosition <em>Display Key Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Key Position</em>' attribute.
	 * @see #isSetDisplayKeyPosition()
	 * @see #unsetDisplayKeyPosition()
	 * @see #getDisplayKeyPosition()
	 * @generated
	 */
	void setDisplayKeyPosition(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDisplayKeyPosition <em>Display Key Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayKeyPosition()
	 * @see #getDisplayKeyPosition()
	 * @see #setDisplayKeyPosition(BigInteger)
	 * @generated
	 */
	void unsetDisplayKeyPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDisplayKeyPosition <em>Display Key Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Key Position</em>' attribute is set.
	 * @see #unsetDisplayKeyPosition()
	 * @see #getDisplayKeyPosition()
	 * @see #setDisplayKeyPosition(BigInteger)
	 * @generated
	 */
	boolean isSetDisplayKeyPosition();

	/**
	 * Returns the value of the '<em><b>Is Default Image</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default Image</em>' attribute.
	 * @see #isSetIsDefaultImage()
	 * @see #unsetIsDefaultImage()
	 * @see #setIsDefaultImage(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_IsDefaultImage()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsDefaultImage'"
	 * @generated
	 */
	boolean isIsDefaultImage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsDefaultImage <em>Is Default Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default Image</em>' attribute.
	 * @see #isSetIsDefaultImage()
	 * @see #unsetIsDefaultImage()
	 * @see #isIsDefaultImage()
	 * @generated
	 */
	void setIsDefaultImage(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsDefaultImage <em>Is Default Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDefaultImage()
	 * @see #isIsDefaultImage()
	 * @see #setIsDefaultImage(boolean)
	 * @generated
	 */
	void unsetIsDefaultImage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#isIsDefaultImage <em>Is Default Image</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Default Image</em>' attribute is set.
	 * @see #unsetIsDefaultImage()
	 * @see #isIsDefaultImage()
	 * @see #setIsDefaultImage(boolean)
	 * @generated
	 */
	boolean isSetIsDefaultImage();

	/**
	 * Returns the value of the '<em><b>Default Aggregate Function</b></em>' attribute.
	 * The default value is <code>"Default"</code>.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Aggregate Function</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType
	 * @see #isSetDefaultAggregateFunction()
	 * @see #unsetDefaultAggregateFunction()
	 * @see #setDefaultAggregateFunction(DefaultAggregateFunctionType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getDimensionAttributeVisualizationProperties_DefaultAggregateFunction()
	 * @model default="Default" unsettable="true"
	 *        extendedMetaData="kind='element' name='DefaultAggregateFunction'"
	 * @generated
	 */
	DefaultAggregateFunctionType getDefaultAggregateFunction();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDefaultAggregateFunction <em>Default Aggregate Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Aggregate Function</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DefaultAggregateFunctionType
	 * @see #isSetDefaultAggregateFunction()
	 * @see #unsetDefaultAggregateFunction()
	 * @see #getDefaultAggregateFunction()
	 * @generated
	 */
	void setDefaultAggregateFunction(DefaultAggregateFunctionType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDefaultAggregateFunction <em>Default Aggregate Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultAggregateFunction()
	 * @see #getDefaultAggregateFunction()
	 * @see #setDefaultAggregateFunction(DefaultAggregateFunctionType)
	 * @generated
	 */
	void unsetDefaultAggregateFunction();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.DimensionAttributeVisualizationProperties#getDefaultAggregateFunction <em>Default Aggregate Function</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Aggregate Function</em>' attribute is set.
	 * @see #unsetDefaultAggregateFunction()
	 * @see #getDefaultAggregateFunction()
	 * @see #setDefaultAggregateFunction(DefaultAggregateFunctionType)
	 * @generated
	 */
	boolean isSetDefaultAggregateFunction();

} // DimensionAttributeVisualizationProperties
