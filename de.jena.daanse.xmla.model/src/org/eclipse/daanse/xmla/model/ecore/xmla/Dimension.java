/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType;

import org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType;
import org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationships;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getMiningModelID <em>Mining Model ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getUnknownMember <em>Unknown Member</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getMdxMissingMemberMode <em>Mdx Missing Member Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getStorageMode <em>Storage Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#isWriteEnabled <em>Write Enabled</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingPriority <em>Processing Priority</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getLastProcessed <em>Last Processed</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getDimensionPermissions <em>Dimension Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getDependsOnDimensionID <em>Depends On Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getUnknownMemberName <em>Unknown Member Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getUnknownMemberTranslations <em>Unknown Member Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProactiveCaching <em>Proactive Caching</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingMode <em>Processing Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingGroup <em>Processing Group</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getCurrentStorageMode <em>Current Storage Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getAttributeAllMemberName <em>Attribute All Member Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getAttributeAllMemberTranslations <em>Attribute All Member Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getHierarchies <em>Hierarchies</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingRecommendation <em>Processing Recommendation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension()
 * @model extendedMetaData="name='Dimension' kind='elementOnly'"
 * @generated
 */
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getID <em>ID</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_CreatedTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreatedTimestamp'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getCreatedTimestamp <em>Created Timestamp</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_LastSchemaUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastSchemaUpdate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastSchemaUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getLastSchemaUpdate <em>Last Schema Update</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getDescription <em>Description</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Binding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	Binding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Binding value);

	/**
	 * Returns the value of the '<em><b>Mining Model ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mining Model ID</em>' attribute.
	 * @see #setMiningModelID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_MiningModelID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MiningModelID'"
	 * @generated
	 */
	String getMiningModelID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getMiningModelID <em>Mining Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mining Model ID</em>' attribute.
	 * @see #getMiningModelID()
	 * @generated
	 */
	void setMiningModelID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType3
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType3)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeType3 getType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType3
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType3 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType3)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType3)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Unknown Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Member</em>' containment reference.
	 * @see #setUnknownMember(UnknownMemberType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_UnknownMember()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UnknownMember'"
	 * @generated
	 */
	UnknownMemberType getUnknownMember();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getUnknownMember <em>Unknown Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Member</em>' containment reference.
	 * @see #getUnknownMember()
	 * @generated
	 */
	void setUnknownMember(UnknownMemberType value);

	/**
	 * Returns the value of the '<em><b>Mdx Missing Member Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mdx Missing Member Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType
	 * @see #isSetMdxMissingMemberMode()
	 * @see #unsetMdxMissingMemberMode()
	 * @see #setMdxMissingMemberMode(MdxMissingMemberModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_MdxMissingMemberMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MdxMissingMemberMode'"
	 * @generated
	 */
	MdxMissingMemberModeType getMdxMissingMemberMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getMdxMissingMemberMode <em>Mdx Missing Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mdx Missing Member Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MdxMissingMemberModeType
	 * @see #isSetMdxMissingMemberMode()
	 * @see #unsetMdxMissingMemberMode()
	 * @see #getMdxMissingMemberMode()
	 * @generated
	 */
	void setMdxMissingMemberMode(MdxMissingMemberModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getMdxMissingMemberMode <em>Mdx Missing Member Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMdxMissingMemberMode()
	 * @see #getMdxMissingMemberMode()
	 * @see #setMdxMissingMemberMode(MdxMissingMemberModeType)
	 * @generated
	 */
	void unsetMdxMissingMemberMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getMdxMissingMemberMode <em>Mdx Missing Member Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Mdx Missing Member Mode</em>' attribute is set.
	 * @see #unsetMdxMissingMemberMode()
	 * @see #getMdxMissingMemberMode()
	 * @see #setMdxMissingMemberMode(MdxMissingMemberModeType)
	 * @generated
	 */
	boolean isSetMdxMissingMemberMode();

	/**
	 * Returns the value of the '<em><b>Error Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Configuration</em>' containment reference.
	 * @see #setErrorConfiguration(ErrorConfiguration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_ErrorConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ErrorConfiguration'"
	 * @generated
	 */
	ErrorConfiguration getErrorConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getErrorConfiguration <em>Error Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Configuration</em>' containment reference.
	 * @see #getErrorConfiguration()
	 * @generated
	 */
	void setErrorConfiguration(ErrorConfiguration value);

	/**
	 * Returns the value of the '<em><b>Storage Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType1
	 * @see #isSetStorageMode()
	 * @see #unsetStorageMode()
	 * @see #setStorageMode(StorageModeType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_StorageMode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='StorageMode'"
	 * @generated
	 */
	StorageModeType1 getStorageMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getStorageMode <em>Storage Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StorageModeType1
	 * @see #isSetStorageMode()
	 * @see #unsetStorageMode()
	 * @see #getStorageMode()
	 * @generated
	 */
	void setStorageMode(StorageModeType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getStorageMode <em>Storage Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStorageMode()
	 * @see #getStorageMode()
	 * @see #setStorageMode(StorageModeType1)
	 * @generated
	 */
	void unsetStorageMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getStorageMode <em>Storage Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Storage Mode</em>' attribute is set.
	 * @see #unsetStorageMode()
	 * @see #getStorageMode()
	 * @see #setStorageMode(StorageModeType1)
	 * @generated
	 */
	boolean isSetStorageMode();

	/**
	 * Returns the value of the '<em><b>Write Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Enabled</em>' attribute.
	 * @see #isSetWriteEnabled()
	 * @see #unsetWriteEnabled()
	 * @see #setWriteEnabled(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_WriteEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='WriteEnabled'"
	 * @generated
	 */
	boolean isWriteEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#isWriteEnabled <em>Write Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Enabled</em>' attribute.
	 * @see #isSetWriteEnabled()
	 * @see #unsetWriteEnabled()
	 * @see #isWriteEnabled()
	 * @generated
	 */
	void setWriteEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#isWriteEnabled <em>Write Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriteEnabled()
	 * @see #isWriteEnabled()
	 * @see #setWriteEnabled(boolean)
	 * @generated
	 */
	void unsetWriteEnabled();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#isWriteEnabled <em>Write Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write Enabled</em>' attribute is set.
	 * @see #unsetWriteEnabled()
	 * @see #isWriteEnabled()
	 * @see #setWriteEnabled(boolean)
	 * @generated
	 */
	boolean isSetWriteEnabled();

	/**
	 * Returns the value of the '<em><b>Processing Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Priority</em>' attribute.
	 * @see #setProcessingPriority(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_ProcessingPriority()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='ProcessingPriority'"
	 * @generated
	 */
	BigInteger getProcessingPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingPriority <em>Processing Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Priority</em>' attribute.
	 * @see #getProcessingPriority()
	 * @generated
	 */
	void setProcessingPriority(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Last Processed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Processed</em>' attribute.
	 * @see #setLastProcessed(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_LastProcessed()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastProcessed'"
	 * @generated
	 */
	XMLGregorianCalendar getLastProcessed();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getLastProcessed <em>Last Processed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Processed</em>' attribute.
	 * @see #getLastProcessed()
	 * @generated
	 */
	void setLastProcessed(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Dimension Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Permissions</em>' containment reference.
	 * @see #setDimensionPermissions(DimensionPermissionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_DimensionPermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DimensionPermissions'"
	 * @generated
	 */
	DimensionPermissionsType getDimensionPermissions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getDimensionPermissions <em>Dimension Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Permissions</em>' containment reference.
	 * @see #getDimensionPermissions()
	 * @generated
	 */
	void setDimensionPermissions(DimensionPermissionsType value);

	/**
	 * Returns the value of the '<em><b>Depends On Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On Dimension ID</em>' attribute.
	 * @see #setDependsOnDimensionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_DependsOnDimensionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DependsOnDimensionID'"
	 * @generated
	 */
	String getDependsOnDimensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getDependsOnDimensionID <em>Depends On Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On Dimension ID</em>' attribute.
	 * @see #getDependsOnDimensionID()
	 * @generated
	 */
	void setDependsOnDimensionID(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_Language()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Language'"
	 * @generated
	 */
	BigInteger getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getLanguage <em>Language</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_Collation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Collation'"
	 * @generated
	 */
	String getCollation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getCollation <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collation</em>' attribute.
	 * @see #getCollation()
	 * @generated
	 */
	void setCollation(String value);

	/**
	 * Returns the value of the '<em><b>Unknown Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Member Name</em>' attribute.
	 * @see #setUnknownMemberName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_UnknownMemberName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='UnknownMemberName'"
	 * @generated
	 */
	String getUnknownMemberName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getUnknownMemberName <em>Unknown Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Member Name</em>' attribute.
	 * @see #getUnknownMemberName()
	 * @generated
	 */
	void setUnknownMemberName(String value);

	/**
	 * Returns the value of the '<em><b>Unknown Member Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unknown Member Translations</em>' containment reference.
	 * @see #setUnknownMemberTranslations(UnknownMemberTranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_UnknownMemberTranslations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UnknownMemberTranslations'"
	 * @generated
	 */
	UnknownMemberTranslationsType getUnknownMemberTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getUnknownMemberTranslations <em>Unknown Member Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unknown Member Translations</em>' containment reference.
	 * @see #getUnknownMemberTranslations()
	 * @generated
	 */
	void setUnknownMemberTranslations(UnknownMemberTranslationsType value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.StateType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType2
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(StateType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_State()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='State'"
	 * @generated
	 */
	StateType2 getState();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.StateType2
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(StateType2 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(StateType2)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(StateType2)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Proactive Caching</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proactive Caching</em>' containment reference.
	 * @see #setProactiveCaching(ProactiveCaching)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_ProactiveCaching()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProactiveCaching'"
	 * @generated
	 */
	ProactiveCaching getProactiveCaching();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProactiveCaching <em>Proactive Caching</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proactive Caching</em>' containment reference.
	 * @see #getProactiveCaching()
	 * @generated
	 */
	void setProactiveCaching(ProactiveCaching value);

	/**
	 * Returns the value of the '<em><b>Processing Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType
	 * @see #isSetProcessingMode()
	 * @see #unsetProcessingMode()
	 * @see #setProcessingMode(ProcessingModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_ProcessingMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProcessingMode'"
	 * @generated
	 */
	ProcessingModeType getProcessingMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingMode <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingModeType
	 * @see #isSetProcessingMode()
	 * @see #unsetProcessingMode()
	 * @see #getProcessingMode()
	 * @generated
	 */
	void setProcessingMode(ProcessingModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingMode <em>Processing Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessingMode()
	 * @see #getProcessingMode()
	 * @see #setProcessingMode(ProcessingModeType)
	 * @generated
	 */
	void unsetProcessingMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingMode <em>Processing Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Processing Mode</em>' attribute is set.
	 * @see #unsetProcessingMode()
	 * @see #getProcessingMode()
	 * @see #setProcessingMode(ProcessingModeType)
	 * @generated
	 */
	boolean isSetProcessingMode();

	/**
	 * Returns the value of the '<em><b>Processing Group</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingGroupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Group</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingGroupType
	 * @see #isSetProcessingGroup()
	 * @see #unsetProcessingGroup()
	 * @see #setProcessingGroup(ProcessingGroupType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_ProcessingGroup()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProcessingGroup'"
	 * @generated
	 */
	ProcessingGroupType getProcessingGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingGroup <em>Processing Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Group</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ProcessingGroupType
	 * @see #isSetProcessingGroup()
	 * @see #unsetProcessingGroup()
	 * @see #getProcessingGroup()
	 * @generated
	 */
	void setProcessingGroup(ProcessingGroupType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingGroup <em>Processing Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessingGroup()
	 * @see #getProcessingGroup()
	 * @see #setProcessingGroup(ProcessingGroupType)
	 * @generated
	 */
	void unsetProcessingGroup();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingGroup <em>Processing Group</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Processing Group</em>' attribute is set.
	 * @see #unsetProcessingGroup()
	 * @see #getProcessingGroup()
	 * @see #setProcessingGroup(ProcessingGroupType)
	 * @generated
	 */
	boolean isSetProcessingGroup();

	/**
	 * Returns the value of the '<em><b>Current Storage Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Storage Mode</em>' containment reference.
	 * @see #setCurrentStorageMode(CurrentStorageModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_CurrentStorageMode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CurrentStorageMode'"
	 * @generated
	 */
	CurrentStorageModeType getCurrentStorageMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getCurrentStorageMode <em>Current Storage Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Storage Mode</em>' containment reference.
	 * @see #getCurrentStorageMode()
	 * @generated
	 */
	void setCurrentStorageMode(CurrentStorageModeType value);

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(AttributesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_Attributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attributes'"
	 * @generated
	 */
	AttributesType getAttributes();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(AttributesType value);

	/**
	 * Returns the value of the '<em><b>Attribute All Member Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute All Member Name</em>' attribute.
	 * @see #setAttributeAllMemberName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_AttributeAllMemberName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AttributeAllMemberName'"
	 * @generated
	 */
	String getAttributeAllMemberName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getAttributeAllMemberName <em>Attribute All Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute All Member Name</em>' attribute.
	 * @see #getAttributeAllMemberName()
	 * @generated
	 */
	void setAttributeAllMemberName(String value);

	/**
	 * Returns the value of the '<em><b>Attribute All Member Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute All Member Translations</em>' containment reference.
	 * @see #setAttributeAllMemberTranslations(AttributeAllMemberTranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_AttributeAllMemberTranslations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AttributeAllMemberTranslations'"
	 * @generated
	 */
	AttributeAllMemberTranslationsType getAttributeAllMemberTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getAttributeAllMemberTranslations <em>Attribute All Member Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute All Member Translations</em>' containment reference.
	 * @see #getAttributeAllMemberTranslations()
	 * @generated
	 */
	void setAttributeAllMemberTranslations(AttributeAllMemberTranslationsType value);

	/**
	 * Returns the value of the '<em><b>Hierarchies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchies</em>' containment reference.
	 * @see #setHierarchies(HierarchiesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_Hierarchies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hierarchies'"
	 * @generated
	 */
	HierarchiesType getHierarchies();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getHierarchies <em>Hierarchies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchies</em>' containment reference.
	 * @see #getHierarchies()
	 * @generated
	 */
	void setHierarchies(HierarchiesType value);

	/**
	 * Returns the value of the '<em><b>Processing Recommendation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Recommendation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType
	 * @see #isSetProcessingRecommendation()
	 * @see #unsetProcessingRecommendation()
	 * @see #setProcessingRecommendation(ProcessingRecommendationType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_ProcessingRecommendation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ProcessingRecommendation' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	ProcessingRecommendationType getProcessingRecommendation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingRecommendation <em>Processing Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing Recommendation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ProcessingRecommendationType
	 * @see #isSetProcessingRecommendation()
	 * @see #unsetProcessingRecommendation()
	 * @see #getProcessingRecommendation()
	 * @generated
	 */
	void setProcessingRecommendation(ProcessingRecommendationType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingRecommendation <em>Processing Recommendation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetProcessingRecommendation()
	 * @see #getProcessingRecommendation()
	 * @see #setProcessingRecommendation(ProcessingRecommendationType)
	 * @generated
	 */
	void unsetProcessingRecommendation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getProcessingRecommendation <em>Processing Recommendation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Processing Recommendation</em>' attribute is set.
	 * @see #unsetProcessingRecommendation()
	 * @see #getProcessingRecommendation()
	 * @see #setProcessingRecommendation(ProcessingRecommendationType)
	 * @generated
	 */
	boolean isSetProcessingRecommendation();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference.
	 * @see #setRelationships(Relationships)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_Relationships()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Relationships'"
	 * @generated
	 */
	Relationships getRelationships();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getRelationships <em>Relationships</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationships</em>' containment reference.
	 * @see #getRelationships()
	 * @generated
	 */
	void setRelationships(Relationships value);

	/**
	 * Returns the value of the '<em><b>String Stores Compatibility Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Stores Compatibility Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType
	 * @see #isSetStringStoresCompatibilityLevel()
	 * @see #unsetStringStoresCompatibilityLevel()
	 * @see #setStringStoresCompatibilityLevel(StringStoresCompatibilityLevelType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_StringStoresCompatibilityLevel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='StringStoresCompatibilityLevel' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300'"
	 * @generated
	 */
	StringStoresCompatibilityLevelType getStringStoresCompatibilityLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Stores Compatibility Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.StringStoresCompatibilityLevelType
	 * @see #isSetStringStoresCompatibilityLevel()
	 * @see #unsetStringStoresCompatibilityLevel()
	 * @see #getStringStoresCompatibilityLevel()
	 * @generated
	 */
	void setStringStoresCompatibilityLevel(StringStoresCompatibilityLevelType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStringStoresCompatibilityLevel()
	 * @see #getStringStoresCompatibilityLevel()
	 * @see #setStringStoresCompatibilityLevel(StringStoresCompatibilityLevelType)
	 * @generated
	 */
	void unsetStringStoresCompatibilityLevel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getStringStoresCompatibilityLevel <em>String Stores Compatibility Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>String Stores Compatibility Level</em>' attribute is set.
	 * @see #unsetStringStoresCompatibilityLevel()
	 * @see #getStringStoresCompatibilityLevel()
	 * @see #setStringStoresCompatibilityLevel(StringStoresCompatibilityLevelType)
	 * @generated
	 */
	boolean isSetStringStoresCompatibilityLevel();

	/**
	 * Returns the value of the '<em><b>Current String Stores Compatibility Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current String Stores Compatibility Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType
	 * @see #isSetCurrentStringStoresCompatibilityLevel()
	 * @see #unsetCurrentStringStoresCompatibilityLevel()
	 * @see #setCurrentStringStoresCompatibilityLevel(CurrentStringStoresCompatibilityLevelType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimension_CurrentStringStoresCompatibilityLevel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='CurrentStringStoresCompatibilityLevel' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300'"
	 * @generated
	 */
	CurrentStringStoresCompatibilityLevelType getCurrentStringStoresCompatibilityLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current String Stores Compatibility Level</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.CurrentStringStoresCompatibilityLevelType
	 * @see #isSetCurrentStringStoresCompatibilityLevel()
	 * @see #unsetCurrentStringStoresCompatibilityLevel()
	 * @see #getCurrentStringStoresCompatibilityLevel()
	 * @generated
	 */
	void setCurrentStringStoresCompatibilityLevel(CurrentStringStoresCompatibilityLevelType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentStringStoresCompatibilityLevel()
	 * @see #getCurrentStringStoresCompatibilityLevel()
	 * @see #setCurrentStringStoresCompatibilityLevel(CurrentStringStoresCompatibilityLevelType)
	 * @generated
	 */
	void unsetCurrentStringStoresCompatibilityLevel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Dimension#getCurrentStringStoresCompatibilityLevel <em>Current String Stores Compatibility Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current String Stores Compatibility Level</em>' attribute is set.
	 * @see #unsetCurrentStringStoresCompatibilityLevel()
	 * @see #getCurrentStringStoresCompatibilityLevel()
	 * @see #setCurrentStringStoresCompatibilityLevel(CurrentStringStoresCompatibilityLevelType)
	 * @generated
	 */
	boolean isSetCurrentStringStoresCompatibilityLevel();

} // Dimension
