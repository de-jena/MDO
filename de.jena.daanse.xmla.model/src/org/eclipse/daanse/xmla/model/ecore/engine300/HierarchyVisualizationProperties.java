/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchy Visualization Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties#getFolderPosition <em>Folder Position</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getHierarchyVisualizationProperties()
 * @model extendedMetaData="name='HierarchyVisualizationProperties' kind='elementOnly'"
 * @generated
 */
public interface HierarchyVisualizationProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Contextual Name Rule</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextual Name Rule</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2
	 * @see #isSetContextualNameRule()
	 * @see #unsetContextualNameRule()
	 * @see #setContextualNameRule(ContextualNameRuleType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getHierarchyVisualizationProperties_ContextualNameRule()
	 * @model default="None" unsettable="true"
	 *        extendedMetaData="kind='element' name='ContextualNameRule'"
	 * @generated
	 */
	ContextualNameRuleType2 getContextualNameRule();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextual Name Rule</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ContextualNameRuleType2
	 * @see #isSetContextualNameRule()
	 * @see #unsetContextualNameRule()
	 * @see #getContextualNameRule()
	 * @generated
	 */
	void setContextualNameRule(ContextualNameRuleType2 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContextualNameRule()
	 * @see #getContextualNameRule()
	 * @see #setContextualNameRule(ContextualNameRuleType2)
	 * @generated
	 */
	void unsetContextualNameRule();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties#getContextualNameRule <em>Contextual Name Rule</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Contextual Name Rule</em>' attribute is set.
	 * @see #unsetContextualNameRule()
	 * @see #getContextualNameRule()
	 * @see #setContextualNameRule(ContextualNameRuleType2)
	 * @generated
	 */
	boolean isSetContextualNameRule();

	/**
	 * Returns the value of the '<em><b>Folder Position</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder Position</em>' attribute.
	 * @see #isSetFolderPosition()
	 * @see #unsetFolderPosition()
	 * @see #setFolderPosition(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.Engine300Package#getHierarchyVisualizationProperties_FolderPosition()
	 * @model default="-1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='FolderPosition'"
	 * @generated
	 */
	BigInteger getFolderPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties#getFolderPosition <em>Folder Position</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties#getFolderPosition <em>Folder Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFolderPosition()
	 * @see #getFolderPosition()
	 * @see #setFolderPosition(BigInteger)
	 * @generated
	 */
	void unsetFolderPosition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties#getFolderPosition <em>Folder Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Folder Position</em>' attribute is set.
	 * @see #unsetFolderPosition()
	 * @see #getFolderPosition()
	 * @see #setFolderPosition(BigInteger)
	 * @generated
	 */
	boolean isSetFolderPosition();

} // HierarchyVisualizationProperties
