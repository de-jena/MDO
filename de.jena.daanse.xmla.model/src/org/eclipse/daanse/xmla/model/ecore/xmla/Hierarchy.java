/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.daanse.xmla.model.ecore.engine2.MemberKeysUniqueType;

import org.eclipse.daanse.xmla.model.ecore.engine300.HierarchyVisualizationProperties;
import org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType;
import org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getProcessingState <em>Processing State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getStructureType <em>Structure Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getDisplayFolder <em>Display Folder</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getAllMemberName <em>All Member Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getAllMemberTranslations <em>All Member Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#isMemberNamesUnique <em>Member Names Unique</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getMemberKeysUnique <em>Member Keys Unique</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#isAllowDuplicateNames <em>Allow Duplicate Names</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getLevels <em>Levels</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getVisualizationProperties <em>Visualization Properties</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy()
 * @model extendedMetaData="name='Hierarchy' kind='elementOnly'"
 * @generated
 */
public interface Hierarchy extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Processing State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType
	 * @see #isSetProcessingState()
	 * @see #unsetProcessingState()
	 * @see #setProcessingState(ProcessingStateType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_ProcessingState()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProcessingState' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300'"
	 * @generated
	 */
	ProcessingStateType getProcessingState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getProcessingState <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.ProcessingStateType
	 * @see #isSetProcessingState()
	 * @see #unsetProcessingState()
	 * @see #getProcessingState()
	 * @generated
	 */
	void setProcessingState(ProcessingStateType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getProcessingState <em>Processing State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessingState()
	 * @see #getProcessingState()
	 * @see #setProcessingState(ProcessingStateType)
	 * @generated
	 */
	void unsetProcessingState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getProcessingState <em>Processing State</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Structure Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structure Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType
	 * @see #isSetStructureType()
	 * @see #unsetStructureType()
	 * @see #setStructureType(StructureTypeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_StructureType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StructureType' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300'"
	 * @generated
	 */
	StructureTypeType getStructureType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getStructureType <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StructureTypeType
	 * @see #isSetStructureType()
	 * @see #unsetStructureType()
	 * @see #getStructureType()
	 * @generated
	 */
	void setStructureType(StructureTypeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getStructureType <em>Structure Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStructureType()
	 * @see #getStructureType()
	 * @see #setStructureType(StructureTypeType)
	 * @generated
	 */
	void unsetStructureType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getStructureType <em>Structure Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Structure Type</em>' attribute is set.
	 * @see #unsetStructureType()
	 * @see #getStructureType()
	 * @see #setStructureType(StructureTypeType)
	 * @generated
	 */
	boolean isSetStructureType();

	/**
	 * Returns the value of the '<em><b>Display Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Folder</em>' attribute.
	 * @see #setDisplayFolder(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_DisplayFolder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DisplayFolder'"
	 * @generated
	 */
	String getDisplayFolder();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getDisplayFolder <em>Display Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Folder</em>' attribute.
	 * @see #getDisplayFolder()
	 * @generated
	 */
	void setDisplayFolder(String value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType4)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType4 getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType4 value);

	/**
	 * Returns the value of the '<em><b>All Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Member Name</em>' attribute.
	 * @see #setAllMemberName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_AllMemberName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AllMemberName'"
	 * @generated
	 */
	String getAllMemberName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getAllMemberName <em>All Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Member Name</em>' attribute.
	 * @see #getAllMemberName()
	 * @generated
	 */
	void setAllMemberName(String value);

	/**
	 * Returns the value of the '<em><b>All Member Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Member Translations</em>' containment reference.
	 * @see #setAllMemberTranslations(AllMemberTranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_AllMemberTranslations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AllMemberTranslations'"
	 * @generated
	 */
	AllMemberTranslationsType getAllMemberTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getAllMemberTranslations <em>All Member Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Member Translations</em>' containment reference.
	 * @see #getAllMemberTranslations()
	 * @generated
	 */
	void setAllMemberTranslations(AllMemberTranslationsType value);

	/**
	 * Returns the value of the '<em><b>Member Names Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Names Unique</em>' attribute.
	 * @see #isSetMemberNamesUnique()
	 * @see #unsetMemberNamesUnique()
	 * @see #setMemberNamesUnique(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_MemberNamesUnique()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='MemberNamesUnique'"
	 * @generated
	 */
	boolean isMemberNamesUnique();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#isMemberNamesUnique <em>Member Names Unique</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#isMemberNamesUnique <em>Member Names Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMemberNamesUnique()
	 * @see #isMemberNamesUnique()
	 * @see #setMemberNamesUnique(boolean)
	 * @generated
	 */
	void unsetMemberNamesUnique();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#isMemberNamesUnique <em>Member Names Unique</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Member Keys Unique</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine2.MemberKeysUniqueType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Keys Unique</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine2.MemberKeysUniqueType
	 * @see #isSetMemberKeysUnique()
	 * @see #unsetMemberKeysUnique()
	 * @see #setMemberKeysUnique(MemberKeysUniqueType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_MemberKeysUnique()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MemberKeysUnique' namespace='http://schemas.microsoft.com/analysisservices/2003/engine/2'"
	 * @generated
	 */
	MemberKeysUniqueType getMemberKeysUnique();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getMemberKeysUnique <em>Member Keys Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Keys Unique</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine2.MemberKeysUniqueType
	 * @see #isSetMemberKeysUnique()
	 * @see #unsetMemberKeysUnique()
	 * @see #getMemberKeysUnique()
	 * @generated
	 */
	void setMemberKeysUnique(MemberKeysUniqueType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getMemberKeysUnique <em>Member Keys Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMemberKeysUnique()
	 * @see #getMemberKeysUnique()
	 * @see #setMemberKeysUnique(MemberKeysUniqueType)
	 * @generated
	 */
	void unsetMemberKeysUnique();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getMemberKeysUnique <em>Member Keys Unique</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Member Keys Unique</em>' attribute is set.
	 * @see #unsetMemberKeysUnique()
	 * @see #getMemberKeysUnique()
	 * @see #setMemberKeysUnique(MemberKeysUniqueType)
	 * @generated
	 */
	boolean isSetMemberKeysUnique();

	/**
	 * Returns the value of the '<em><b>Allow Duplicate Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Duplicate Names</em>' attribute.
	 * @see #isSetAllowDuplicateNames()
	 * @see #unsetAllowDuplicateNames()
	 * @see #setAllowDuplicateNames(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_AllowDuplicateNames()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AllowDuplicateNames'"
	 * @generated
	 */
	boolean isAllowDuplicateNames();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#isAllowDuplicateNames <em>Allow Duplicate Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Duplicate Names</em>' attribute.
	 * @see #isSetAllowDuplicateNames()
	 * @see #unsetAllowDuplicateNames()
	 * @see #isAllowDuplicateNames()
	 * @generated
	 */
	void setAllowDuplicateNames(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#isAllowDuplicateNames <em>Allow Duplicate Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowDuplicateNames()
	 * @see #isAllowDuplicateNames()
	 * @see #setAllowDuplicateNames(boolean)
	 * @generated
	 */
	void unsetAllowDuplicateNames();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#isAllowDuplicateNames <em>Allow Duplicate Names</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Duplicate Names</em>' attribute is set.
	 * @see #unsetAllowDuplicateNames()
	 * @see #isAllowDuplicateNames()
	 * @see #setAllowDuplicateNames(boolean)
	 * @generated
	 */
	boolean isSetAllowDuplicateNames();

	/**
	 * Returns the value of the '<em><b>Levels</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' containment reference.
	 * @see #setLevels(LevelsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_Levels()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Levels'"
	 * @generated
	 */
	LevelsType getLevels();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getLevels <em>Levels</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Levels</em>' containment reference.
	 * @see #getLevels()
	 * @generated
	 */
	void setLevels(LevelsType value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType23)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType23 getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType23 value);

	/**
	 * Returns the value of the '<em><b>Visualization Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualization Properties</em>' containment reference.
	 * @see #setVisualizationProperties(HierarchyVisualizationProperties)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getHierarchy_VisualizationProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VisualizationProperties'"
	 * @generated
	 */
	HierarchyVisualizationProperties getVisualizationProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Hierarchy#getVisualizationProperties <em>Visualization Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visualization Properties</em>' containment reference.
	 * @see #getVisualizationProperties()
	 * @generated
	 */
	void setVisualizationProperties(HierarchyVisualizationProperties value);

} // Hierarchy
