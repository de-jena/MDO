/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship End Visualization Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getFolderPosition <em>Folder Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getDisplayKeyPosition <em>Display Key Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getCommonIdentifierPosition <em>Common Identifier Position</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#isIsDefaultMeasure <em>Is Default Measure</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#isIsDefaultImage <em>Is Default Image</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getRelationshipEndVisualizationProperties()
 * @model extendedMetaData="name='RelationshipEndVisualizationProperties' kind='elementOnly'"
 * @generated
 */
public interface RelationshipEndVisualizationProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Folder Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Position</em>' attribute.
	 * @see #isSetFolderPosition()
	 * @see #unsetFolderPosition()
	 * @see #setFolderPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getRelationshipEndVisualizationProperties_FolderPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='FolderPosition'"
	 * @generated
	 */
	BigInteger getFolderPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getFolderPosition <em>Folder Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getFolderPosition <em>Folder Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFolderPosition()
	 * @see #getFolderPosition()
	 * @see #setFolderPosition(BigInteger)
	 * @generated
	 */
	void unsetFolderPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getFolderPosition <em>Folder Position</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextual Name Rule</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType
	 * @see #isSetContextualNameRule()
	 * @see #unsetContextualNameRule()
	 * @see #setContextualNameRule(ContextualNameRuleType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getRelationshipEndVisualizationProperties_ContextualNameRule()
	 * @model default="None" unsettable="true"
	 *        extendedMetaData="kind='element' name='ContextualNameRule'"
	 * @generated
	 */
	ContextualNameRuleType getContextualNameRule();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextual Name Rule</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType
	 * @see #isSetContextualNameRule()
	 * @see #unsetContextualNameRule()
	 * @see #getContextualNameRule()
	 * @generated
	 */
	void setContextualNameRule(ContextualNameRuleType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContextualNameRule()
	 * @see #getContextualNameRule()
	 * @see #setContextualNameRule(ContextualNameRuleType)
	 * @generated
	 */
	void unsetContextualNameRule();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contextual Name Rule</em>' attribute is set.
	 * @see #unsetContextualNameRule()
	 * @see #getContextualNameRule()
	 * @see #setContextualNameRule(ContextualNameRuleType)
	 * @generated
	 */
	boolean isSetContextualNameRule();

	/**
	 * Returns the value of the '<em><b>Default Details Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Details Position</em>' attribute.
	 * @see #isSetDefaultDetailsPosition()
	 * @see #unsetDefaultDetailsPosition()
	 * @see #setDefaultDetailsPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getRelationshipEndVisualizationProperties_DefaultDetailsPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='DefaultDetailsPosition'"
	 * @generated
	 */
	BigInteger getDefaultDetailsPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultDetailsPosition()
	 * @see #getDefaultDetailsPosition()
	 * @see #setDefaultDetailsPosition(BigInteger)
	 * @generated
	 */
	void unsetDefaultDetailsPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getDefaultDetailsPosition <em>Default Details Position</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Display Key Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Key Position</em>' attribute.
	 * @see #isSetDisplayKeyPosition()
	 * @see #unsetDisplayKeyPosition()
	 * @see #setDisplayKeyPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getRelationshipEndVisualizationProperties_DisplayKeyPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='DisplayKeyPosition'"
	 * @generated
	 */
	BigInteger getDisplayKeyPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getDisplayKeyPosition <em>Display Key Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getDisplayKeyPosition <em>Display Key Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayKeyPosition()
	 * @see #getDisplayKeyPosition()
	 * @see #setDisplayKeyPosition(BigInteger)
	 * @generated
	 */
	void unsetDisplayKeyPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getDisplayKeyPosition <em>Display Key Position</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Common Identifier Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Identifier Position</em>' attribute.
	 * @see #isSetCommonIdentifierPosition()
	 * @see #unsetCommonIdentifierPosition()
	 * @see #setCommonIdentifierPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getRelationshipEndVisualizationProperties_CommonIdentifierPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='CommonIdentifierPosition'"
	 * @generated
	 */
	BigInteger getCommonIdentifierPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getCommonIdentifierPosition <em>Common Identifier Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getCommonIdentifierPosition <em>Common Identifier Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCommonIdentifierPosition()
	 * @see #getCommonIdentifierPosition()
	 * @see #setCommonIdentifierPosition(BigInteger)
	 * @generated
	 */
	void unsetCommonIdentifierPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getCommonIdentifierPosition <em>Common Identifier Position</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Is Default Measure</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default Measure</em>' attribute.
	 * @see #isSetIsDefaultMeasure()
	 * @see #unsetIsDefaultMeasure()
	 * @see #setIsDefaultMeasure(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getRelationshipEndVisualizationProperties_IsDefaultMeasure()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsDefaultMeasure'"
	 * @generated
	 */
	boolean isIsDefaultMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#isIsDefaultMeasure <em>Is Default Measure</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#isIsDefaultMeasure <em>Is Default Measure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDefaultMeasure()
	 * @see #isIsDefaultMeasure()
	 * @see #setIsDefaultMeasure(boolean)
	 * @generated
	 */
	void unsetIsDefaultMeasure();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#isIsDefaultMeasure <em>Is Default Measure</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Is Default Image</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default Image</em>' attribute.
	 * @see #isSetIsDefaultImage()
	 * @see #unsetIsDefaultImage()
	 * @see #setIsDefaultImage(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getRelationshipEndVisualizationProperties_IsDefaultImage()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='IsDefaultImage'"
	 * @generated
	 */
	boolean isIsDefaultImage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#isIsDefaultImage <em>Is Default Image</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#isIsDefaultImage <em>Is Default Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsDefaultImage()
	 * @see #isIsDefaultImage()
	 * @see #setIsDefaultImage(boolean)
	 * @generated
	 */
	void unsetIsDefaultImage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#isIsDefaultImage <em>Is Default Image</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Sort Properties Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Properties Position</em>' attribute.
	 * @see #isSetSortPropertiesPosition()
	 * @see #unsetSortPropertiesPosition()
	 * @see #setSortPropertiesPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getRelationshipEndVisualizationProperties_SortPropertiesPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='SortPropertiesPosition'"
	 * @generated
	 */
	BigInteger getSortPropertiesPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSortPropertiesPosition()
	 * @see #getSortPropertiesPosition()
	 * @see #setSortPropertiesPosition(BigInteger)
	 * @generated
	 */
	void unsetSortPropertiesPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.RelationshipEndVisualizationProperties#getSortPropertiesPosition <em>Sort Properties Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sort Properties Position</em>' attribute is set.
	 * @see #unsetSortPropertiesPosition()
	 * @see #getSortPropertiesPosition()
	 * @see #setSortPropertiesPosition(BigInteger)
	 * @generated
	 */
	boolean isSetSortPropertiesPosition();

} // RelationshipEndVisualizationProperties
