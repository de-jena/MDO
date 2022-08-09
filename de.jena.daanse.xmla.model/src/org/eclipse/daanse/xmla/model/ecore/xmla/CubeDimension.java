/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getDimensionID <em>Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getAllMemberAggregationUsage <em>All Member Aggregation Usage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getHierarchyUniqueNameStyle <em>Hierarchy Unique Name Style</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getMemberUniqueNameStyle <em>Member Unique Name Style</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getHierarchies <em>Hierarchies</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension()
 * @model extendedMetaData="name='CubeDimension' kind='elementOnly'"
 * @generated
 */
public interface CubeDimension extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getDescription <em>Description</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType value);

	/**
	 * Returns the value of the '<em><b>Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension ID</em>' attribute.
	 * @see #setDimensionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension_DimensionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DimensionID'"
	 * @generated
	 */
	String getDimensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getDimensionID <em>Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension ID</em>' attribute.
	 * @see #getDimensionID()
	 * @generated
	 */
	void setDimensionID(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #isSetVisible()
	 * @see #unsetVisible()
	 * @see #setVisible(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension_Visible()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Visible'"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#isVisible <em>Visible</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVisible()
	 * @see #isVisible()
	 * @see #setVisible(boolean)
	 * @generated
	 */
	void unsetVisible();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#isVisible <em>Visible</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>All Member Aggregation Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.AllMemberAggregationUsageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Member Aggregation Usage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AllMemberAggregationUsageType
	 * @see #isSetAllMemberAggregationUsage()
	 * @see #unsetAllMemberAggregationUsage()
	 * @see #setAllMemberAggregationUsage(AllMemberAggregationUsageType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension_AllMemberAggregationUsage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AllMemberAggregationUsage'"
	 * @generated
	 */
	AllMemberAggregationUsageType getAllMemberAggregationUsage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getAllMemberAggregationUsage <em>All Member Aggregation Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Member Aggregation Usage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AllMemberAggregationUsageType
	 * @see #isSetAllMemberAggregationUsage()
	 * @see #unsetAllMemberAggregationUsage()
	 * @see #getAllMemberAggregationUsage()
	 * @generated
	 */
	void setAllMemberAggregationUsage(AllMemberAggregationUsageType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getAllMemberAggregationUsage <em>All Member Aggregation Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllMemberAggregationUsage()
	 * @see #getAllMemberAggregationUsage()
	 * @see #setAllMemberAggregationUsage(AllMemberAggregationUsageType)
	 * @generated
	 */
	void unsetAllMemberAggregationUsage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getAllMemberAggregationUsage <em>All Member Aggregation Usage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>All Member Aggregation Usage</em>' attribute is set.
	 * @see #unsetAllMemberAggregationUsage()
	 * @see #getAllMemberAggregationUsage()
	 * @see #setAllMemberAggregationUsage(AllMemberAggregationUsageType)
	 * @generated
	 */
	boolean isSetAllMemberAggregationUsage();

	/**
	 * Returns the value of the '<em><b>Hierarchy Unique Name Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.HierarchyUniqueNameStyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Unique Name Style</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.HierarchyUniqueNameStyleType
	 * @see #isSetHierarchyUniqueNameStyle()
	 * @see #unsetHierarchyUniqueNameStyle()
	 * @see #setHierarchyUniqueNameStyle(HierarchyUniqueNameStyleType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension_HierarchyUniqueNameStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='HierarchyUniqueNameStyle'"
	 * @generated
	 */
	HierarchyUniqueNameStyleType getHierarchyUniqueNameStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getHierarchyUniqueNameStyle <em>Hierarchy Unique Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy Unique Name Style</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.HierarchyUniqueNameStyleType
	 * @see #isSetHierarchyUniqueNameStyle()
	 * @see #unsetHierarchyUniqueNameStyle()
	 * @see #getHierarchyUniqueNameStyle()
	 * @generated
	 */
	void setHierarchyUniqueNameStyle(HierarchyUniqueNameStyleType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getHierarchyUniqueNameStyle <em>Hierarchy Unique Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHierarchyUniqueNameStyle()
	 * @see #getHierarchyUniqueNameStyle()
	 * @see #setHierarchyUniqueNameStyle(HierarchyUniqueNameStyleType)
	 * @generated
	 */
	void unsetHierarchyUniqueNameStyle();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getHierarchyUniqueNameStyle <em>Hierarchy Unique Name Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hierarchy Unique Name Style</em>' attribute is set.
	 * @see #unsetHierarchyUniqueNameStyle()
	 * @see #getHierarchyUniqueNameStyle()
	 * @see #setHierarchyUniqueNameStyle(HierarchyUniqueNameStyleType)
	 * @generated
	 */
	boolean isSetHierarchyUniqueNameStyle();

	/**
	 * Returns the value of the '<em><b>Member Unique Name Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.MemberUniqueNameStyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Unique Name Style</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MemberUniqueNameStyleType
	 * @see #isSetMemberUniqueNameStyle()
	 * @see #unsetMemberUniqueNameStyle()
	 * @see #setMemberUniqueNameStyle(MemberUniqueNameStyleType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension_MemberUniqueNameStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MemberUniqueNameStyle'"
	 * @generated
	 */
	MemberUniqueNameStyleType getMemberUniqueNameStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getMemberUniqueNameStyle <em>Member Unique Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Unique Name Style</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.MemberUniqueNameStyleType
	 * @see #isSetMemberUniqueNameStyle()
	 * @see #unsetMemberUniqueNameStyle()
	 * @see #getMemberUniqueNameStyle()
	 * @generated
	 */
	void setMemberUniqueNameStyle(MemberUniqueNameStyleType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getMemberUniqueNameStyle <em>Member Unique Name Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMemberUniqueNameStyle()
	 * @see #getMemberUniqueNameStyle()
	 * @see #setMemberUniqueNameStyle(MemberUniqueNameStyleType)
	 * @generated
	 */
	void unsetMemberUniqueNameStyle();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getMemberUniqueNameStyle <em>Member Unique Name Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Member Unique Name Style</em>' attribute is set.
	 * @see #unsetMemberUniqueNameStyle()
	 * @see #getMemberUniqueNameStyle()
	 * @see #setMemberUniqueNameStyle(MemberUniqueNameStyleType)
	 * @generated
	 */
	boolean isSetMemberUniqueNameStyle();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(AttributesType5)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension_Attributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attributes'"
	 * @generated
	 */
	AttributesType5 getAttributes();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(AttributesType5 value);

	/**
	 * Returns the value of the '<em><b>Hierarchies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchies</em>' containment reference.
	 * @see #setHierarchies(HierarchiesType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension_Hierarchies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hierarchies'"
	 * @generated
	 */
	HierarchiesType2 getHierarchies();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getHierarchies <em>Hierarchies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchies</em>' containment reference.
	 * @see #getHierarchies()
	 * @generated
	 */
	void setHierarchies(HierarchiesType2 value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimension_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimension#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

} // CubeDimension
