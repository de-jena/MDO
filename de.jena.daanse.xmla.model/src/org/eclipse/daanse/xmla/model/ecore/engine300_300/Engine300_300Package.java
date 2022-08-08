/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Engine300_300Factory
 * @model kind="package"
 *        annotation="https://jakarta.ee/xml/ns/jaxb version='3.0'"
 * @generated
 */
public interface Engine300_300Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "engine300_300";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.microsoft.com/analysisservices/2011/engine/300/300";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "engine300_300";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Engine300_300Package eINSTANCE = org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.AnnotationsTypeImpl <em>Annotations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.AnnotationsTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getAnnotationsType()
	 * @generated
	 */
	int ANNOTATIONS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_TYPE__ANNOTATION = 0;

	/**
	 * The number of structural features of the '<em>Annotations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.AttributesTypeImpl <em>Attributes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.AttributesTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getAttributesType()
	 * @generated
	 */
	int ATTRIBUTES_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TYPE__ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Attributes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attributes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.AttributeTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__ATTRIBUTE_ID = 0;

	/**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.DocumentRootImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Allowed Rows Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Direct Query Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIRECT_QUERY_MODE = 4;

	/**
	 * The feature id for the '<em><b>Direct Query Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIRECT_QUERY_USAGE = 5;

	/**
	 * The feature id for the '<em><b>XEvent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XEVENT = 6;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ID = 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__VISIBLE = 1;

	/**
	 * The feature id for the '<em><b>From Relationship End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__FROM_RELATIONSHIP_END = 2;

	/**
	 * The feature id for the '<em><b>To Relationship End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TO_RELATIONSHIP_END = 3;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndImpl <em>Relationship End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getRelationshipEnd()
	 * @generated
	 */
	int RELATIONSHIP_END = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END__ROLE = 0;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END__MULTIPLICITY = 1;

	/**
	 * The feature id for the '<em><b>Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END__DIMENSION_ID = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END__ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END__TRANSLATIONS = 4;

	/**
	 * The feature id for the '<em><b>Visualization Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END__VISUALIZATION_PROPERTIES = 5;

	/**
	 * The number of structural features of the '<em>Relationship End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Relationship End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndTranslationImpl <em>Relationship End Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndTranslationImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getRelationshipEndTranslation()
	 * @generated
	 */
	int RELATIONSHIP_END_TRANSLATION = 6;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_TRANSLATION__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_TRANSLATION__CAPTION = 1;

	/**
	 * The feature id for the '<em><b>Collection Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_TRANSLATION__COLLECTION_CAPTION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_TRANSLATION__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Display Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_TRANSLATION__DISPLAY_FOLDER = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_TRANSLATION__ANNOTATIONS = 5;

	/**
	 * The number of structural features of the '<em>Relationship End Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_TRANSLATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Relationship End Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_END_TRANSLATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipsImpl <em>Relationships</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipsImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getRelationships()
	 * @generated
	 */
	int RELATIONSHIPS = 7;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS__RELATIONSHIP = 0;

	/**
	 * The number of structural features of the '<em>Relationships</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relationships</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIPS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.TranslationsTypeImpl <em>Translations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.TranslationsTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getTranslationsType()
	 * @generated
	 */
	int TRANSLATIONS_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATIONS_TYPE__TRANSLATION = 0;

	/**
	 * The number of structural features of the '<em>Translations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Translations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.XEventTypeImpl <em>XEvent Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.XEventTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getXEventType()
	 * @generated
	 */
	int XEVENT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Event Session</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XEVENT_TYPE__EVENT_SESSION = 0;

	/**
	 * The number of structural features of the '<em>XEvent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XEVENT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>XEvent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XEVENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType <em>Direct Query Mode Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getDirectQueryModeType()
	 * @generated
	 */
	int DIRECT_QUERY_MODE_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType <em>Direct Query Usage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getDirectQueryUsageType()
	 * @generated
	 */
	int DIRECT_QUERY_USAGE_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType <em>Multiplicity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getMultiplicityType()
	 * @generated
	 */
	int MULTIPLICITY_TYPE = 12;

	/**
	 * The meta object id for the '<em>Direct Query Mode Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getDirectQueryModeTypeObject()
	 * @generated
	 */
	int DIRECT_QUERY_MODE_TYPE_OBJECT = 13;

	/**
	 * The meta object id for the '<em>Direct Query Usage Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getDirectQueryUsageTypeObject()
	 * @generated
	 */
	int DIRECT_QUERY_USAGE_TYPE_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Multiplicity Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getMultiplicityTypeObject()
	 * @generated
	 */
	int MULTIPLICITY_TYPE_OBJECT = 15;


	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.AnnotationsType <em>Annotations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotations Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.AnnotationsType
	 * @generated
	 */
	EClass getAnnotationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.AnnotationsType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.AnnotationsType#getAnnotation()
	 * @see #getAnnotationsType()
	 * @generated
	 */
	EReference getAnnotationsType_Annotation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.AttributesType <em>Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.AttributesType
	 * @generated
	 */
	EClass getAttributesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.AttributesType#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.AttributesType#getAttribute()
	 * @see #getAttributesType()
	 * @generated
	 */
	EReference getAttributesType_Attribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.AttributeType
	 * @generated
	 */
	EClass getAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.AttributeType#getAttributeID <em>Attribute ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute ID</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.AttributeType#getAttributeID()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_AttributeID();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getAllowedRowsExpression <em>Allowed Rows Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Rows Expression</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getAllowedRowsExpression()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AllowedRowsExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getDirectQueryMode <em>Direct Query Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direct Query Mode</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getDirectQueryMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DirectQueryMode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getDirectQueryUsage <em>Direct Query Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direct Query Usage</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getDirectQueryUsage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DirectQueryUsage();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getXEvent <em>XEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XEvent</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DocumentRoot#getXEvent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#getID()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_ID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#isVisible()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Visible();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#getFromRelationshipEnd <em>From Relationship End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Relationship End</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#getFromRelationshipEnd()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_FromRelationshipEnd();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#getToRelationshipEnd <em>To Relationship End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To Relationship End</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationship#getToRelationshipEnd()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_ToRelationshipEnd();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd <em>Relationship End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship End</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd
	 * @generated
	 */
	EClass getRelationshipEnd();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd#getRole()
	 * @see #getRelationshipEnd()
	 * @generated
	 */
	EAttribute getRelationshipEnd_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd#getMultiplicity()
	 * @see #getRelationshipEnd()
	 * @generated
	 */
	EAttribute getRelationshipEnd_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd#getDimensionID <em>Dimension ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimension ID</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd#getDimensionID()
	 * @see #getRelationshipEnd()
	 * @generated
	 */
	EAttribute getRelationshipEnd_DimensionID();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd#getAttributes()
	 * @see #getRelationshipEnd()
	 * @generated
	 */
	EReference getRelationshipEnd_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd#getTranslations <em>Translations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translations</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd#getTranslations()
	 * @see #getRelationshipEnd()
	 * @generated
	 */
	EReference getRelationshipEnd_Translations();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd#getVisualizationProperties <em>Visualization Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Visualization Properties</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEnd#getVisualizationProperties()
	 * @see #getRelationshipEnd()
	 * @generated
	 */
	EReference getRelationshipEnd_VisualizationProperties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation <em>Relationship End Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship End Translation</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation
	 * @generated
	 */
	EClass getRelationshipEndTranslation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation#getLanguage()
	 * @see #getRelationshipEndTranslation()
	 * @generated
	 */
	EAttribute getRelationshipEndTranslation_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caption</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation#getCaption()
	 * @see #getRelationshipEndTranslation()
	 * @generated
	 */
	EAttribute getRelationshipEndTranslation_Caption();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation#getCollectionCaption <em>Collection Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Caption</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation#getCollectionCaption()
	 * @see #getRelationshipEndTranslation()
	 * @generated
	 */
	EAttribute getRelationshipEndTranslation_CollectionCaption();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation#getDescription()
	 * @see #getRelationshipEndTranslation()
	 * @generated
	 */
	EAttribute getRelationshipEndTranslation_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation#getDisplayFolder <em>Display Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Folder</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation#getDisplayFolder()
	 * @see #getRelationshipEndTranslation()
	 * @generated
	 */
	EAttribute getRelationshipEndTranslation_DisplayFolder();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotations</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.RelationshipEndTranslation#getAnnotations()
	 * @see #getRelationshipEndTranslation()
	 * @generated
	 */
	EReference getRelationshipEndTranslation_Annotations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationships</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationships
	 * @generated
	 */
	EClass getRelationships();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationships#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.Relationships#getRelationship()
	 * @see #getRelationships()
	 * @generated
	 */
	EReference getRelationships_Relationship();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.TranslationsType <em>Translations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translations Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.TranslationsType
	 * @generated
	 */
	EClass getTranslationsType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.TranslationsType#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translation</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.TranslationsType#getTranslation()
	 * @see #getTranslationsType()
	 * @generated
	 */
	EReference getTranslationsType_Translation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.XEventType <em>XEvent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XEvent Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.XEventType
	 * @generated
	 */
	EClass getXEventType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.XEventType#getEventSession <em>Event Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Session</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.XEventType#getEventSession()
	 * @see #getXEventType()
	 * @generated
	 */
	EReference getXEventType_EventSession();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType <em>Direct Query Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direct Query Mode Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType
	 * @generated
	 */
	EEnum getDirectQueryModeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType <em>Direct Query Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direct Query Usage Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType
	 * @generated
	 */
	EEnum getDirectQueryUsageType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType <em>Multiplicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType
	 * @generated
	 */
	EEnum getMultiplicityType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType <em>Direct Query Mode Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Direct Query Mode Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType"
	 *        extendedMetaData="name='DirectQueryMode_._type:Object' baseType='DirectQueryMode_._type'"
	 * @generated
	 */
	EDataType getDirectQueryModeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType <em>Direct Query Usage Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Direct Query Usage Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType"
	 *        extendedMetaData="name='DirectQueryUsage_._type:Object' baseType='DirectQueryUsage_._type'"
	 * @generated
	 */
	EDataType getDirectQueryUsageTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType <em>Multiplicity Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multiplicity Type Object</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType
	 * @model instanceClass="org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType"
	 *        extendedMetaData="name='Multiplicity_._type:Object' baseType='Multiplicity_._type'"
	 * @generated
	 */
	EDataType getMultiplicityTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Engine300_300Factory getEngine300_300Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.AnnotationsTypeImpl <em>Annotations Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.AnnotationsTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getAnnotationsType()
		 * @generated
		 */
		EClass ANNOTATIONS_TYPE = eINSTANCE.getAnnotationsType();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATIONS_TYPE__ANNOTATION = eINSTANCE.getAnnotationsType_Annotation();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.AttributesTypeImpl <em>Attributes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.AttributesTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getAttributesType()
		 * @generated
		 */
		EClass ATTRIBUTES_TYPE = eINSTANCE.getAttributesType();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES_TYPE__ATTRIBUTE = eINSTANCE.getAttributesType_Attribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.AttributeTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getAttributeType()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '<em><b>Attribute ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__ATTRIBUTE_ID = eINSTANCE.getAttributeType_AttributeID();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.DocumentRootImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Allowed Rows Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ALLOWED_ROWS_EXPRESSION = eINSTANCE.getDocumentRoot_AllowedRowsExpression();

		/**
		 * The meta object literal for the '<em><b>Direct Query Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DIRECT_QUERY_MODE = eINSTANCE.getDocumentRoot_DirectQueryMode();

		/**
		 * The meta object literal for the '<em><b>Direct Query Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DIRECT_QUERY_USAGE = eINSTANCE.getDocumentRoot_DirectQueryUsage();

		/**
		 * The meta object literal for the '<em><b>XEvent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XEVENT = eINSTANCE.getDocumentRoot_XEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__ID = eINSTANCE.getRelationship_ID();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__VISIBLE = eINSTANCE.getRelationship_Visible();

		/**
		 * The meta object literal for the '<em><b>From Relationship End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__FROM_RELATIONSHIP_END = eINSTANCE.getRelationship_FromRelationshipEnd();

		/**
		 * The meta object literal for the '<em><b>To Relationship End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TO_RELATIONSHIP_END = eINSTANCE.getRelationship_ToRelationshipEnd();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndImpl <em>Relationship End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getRelationshipEnd()
		 * @generated
		 */
		EClass RELATIONSHIP_END = eINSTANCE.getRelationshipEnd();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END__ROLE = eINSTANCE.getRelationshipEnd_Role();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END__MULTIPLICITY = eINSTANCE.getRelationshipEnd_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Dimension ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END__DIMENSION_ID = eINSTANCE.getRelationshipEnd_DimensionID();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_END__ATTRIBUTES = eINSTANCE.getRelationshipEnd_Attributes();

		/**
		 * The meta object literal for the '<em><b>Translations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_END__TRANSLATIONS = eINSTANCE.getRelationshipEnd_Translations();

		/**
		 * The meta object literal for the '<em><b>Visualization Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_END__VISUALIZATION_PROPERTIES = eINSTANCE.getRelationshipEnd_VisualizationProperties();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndTranslationImpl <em>Relationship End Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipEndTranslationImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getRelationshipEndTranslation()
		 * @generated
		 */
		EClass RELATIONSHIP_END_TRANSLATION = eINSTANCE.getRelationshipEndTranslation();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_TRANSLATION__LANGUAGE = eINSTANCE.getRelationshipEndTranslation_Language();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_TRANSLATION__CAPTION = eINSTANCE.getRelationshipEndTranslation_Caption();

		/**
		 * The meta object literal for the '<em><b>Collection Caption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_TRANSLATION__COLLECTION_CAPTION = eINSTANCE.getRelationshipEndTranslation_CollectionCaption();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_TRANSLATION__DESCRIPTION = eINSTANCE.getRelationshipEndTranslation_Description();

		/**
		 * The meta object literal for the '<em><b>Display Folder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_END_TRANSLATION__DISPLAY_FOLDER = eINSTANCE.getRelationshipEndTranslation_DisplayFolder();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_END_TRANSLATION__ANNOTATIONS = eINSTANCE.getRelationshipEndTranslation_Annotations();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipsImpl <em>Relationships</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.RelationshipsImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getRelationships()
		 * @generated
		 */
		EClass RELATIONSHIPS = eINSTANCE.getRelationships();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIPS__RELATIONSHIP = eINSTANCE.getRelationships_Relationship();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.TranslationsTypeImpl <em>Translations Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.TranslationsTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getTranslationsType()
		 * @generated
		 */
		EClass TRANSLATIONS_TYPE = eINSTANCE.getTranslationsType();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSLATIONS_TYPE__TRANSLATION = eINSTANCE.getTranslationsType_Translation();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.XEventTypeImpl <em>XEvent Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.XEventTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getXEventType()
		 * @generated
		 */
		EClass XEVENT_TYPE = eINSTANCE.getXEventType();

		/**
		 * The meta object literal for the '<em><b>Event Session</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XEVENT_TYPE__EVENT_SESSION = eINSTANCE.getXEventType_EventSession();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType <em>Direct Query Mode Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getDirectQueryModeType()
		 * @generated
		 */
		EEnum DIRECT_QUERY_MODE_TYPE = eINSTANCE.getDirectQueryModeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType <em>Direct Query Usage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getDirectQueryUsageType()
		 * @generated
		 */
		EEnum DIRECT_QUERY_USAGE_TYPE = eINSTANCE.getDirectQueryUsageType();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType <em>Multiplicity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getMultiplicityType()
		 * @generated
		 */
		EEnum MULTIPLICITY_TYPE = eINSTANCE.getMultiplicityType();

		/**
		 * The meta object literal for the '<em>Direct Query Mode Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryModeType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getDirectQueryModeTypeObject()
		 * @generated
		 */
		EDataType DIRECT_QUERY_MODE_TYPE_OBJECT = eINSTANCE.getDirectQueryModeTypeObject();

		/**
		 * The meta object literal for the '<em>Direct Query Usage Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.DirectQueryUsageType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getDirectQueryUsageTypeObject()
		 * @generated
		 */
		EDataType DIRECT_QUERY_USAGE_TYPE_OBJECT = eINSTANCE.getDirectQueryUsageTypeObject();

		/**
		 * The meta object literal for the '<em>Multiplicity Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.MultiplicityType
		 * @see org.eclipse.daanse.xmla.model.ecore.engine300_300.impl.Engine300_300PackageImpl#getMultiplicityTypeObject()
		 * @generated
		 */
		EDataType MULTIPLICITY_TYPE_OBJECT = eINSTANCE.getMultiplicityTypeObject();

	}

} //Engine300_300Package
