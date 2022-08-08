/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine300_300.impl;

import org.eclipse.daanse.xmla.model.ecore.engine300_300.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Engine300_300FactoryImpl extends EFactoryImpl implements Engine300_300Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Engine300_300Factory init() {
		try {
			Engine300_300Factory theEngine300_300Factory = (Engine300_300Factory)EPackage.Registry.INSTANCE.getEFactory(Engine300_300Package.eNS_URI);
			if (theEngine300_300Factory != null) {
				return theEngine300_300Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Engine300_300FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine300_300FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Engine300_300Package.ANNOTATIONS_TYPE: return createAnnotationsType();
			case Engine300_300Package.ATTRIBUTES_TYPE: return createAttributesType();
			case Engine300_300Package.ATTRIBUTE_TYPE: return createAttributeType();
			case Engine300_300Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Engine300_300Package.RELATIONSHIP: return createRelationship();
			case Engine300_300Package.RELATIONSHIP_END: return createRelationshipEnd();
			case Engine300_300Package.RELATIONSHIP_END_TRANSLATION: return createRelationshipEndTranslation();
			case Engine300_300Package.RELATIONSHIPS: return createRelationships();
			case Engine300_300Package.TRANSLATIONS_TYPE: return createTranslationsType();
			case Engine300_300Package.XEVENT_TYPE: return createXEventType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Engine300_300Package.DIRECT_QUERY_MODE_TYPE:
				return createDirectQueryModeTypeFromString(eDataType, initialValue);
			case Engine300_300Package.DIRECT_QUERY_USAGE_TYPE:
				return createDirectQueryUsageTypeFromString(eDataType, initialValue);
			case Engine300_300Package.MULTIPLICITY_TYPE:
				return createMultiplicityTypeFromString(eDataType, initialValue);
			case Engine300_300Package.DIRECT_QUERY_MODE_TYPE_OBJECT:
				return createDirectQueryModeTypeObjectFromString(eDataType, initialValue);
			case Engine300_300Package.DIRECT_QUERY_USAGE_TYPE_OBJECT:
				return createDirectQueryUsageTypeObjectFromString(eDataType, initialValue);
			case Engine300_300Package.MULTIPLICITY_TYPE_OBJECT:
				return createMultiplicityTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Engine300_300Package.DIRECT_QUERY_MODE_TYPE:
				return convertDirectQueryModeTypeToString(eDataType, instanceValue);
			case Engine300_300Package.DIRECT_QUERY_USAGE_TYPE:
				return convertDirectQueryUsageTypeToString(eDataType, instanceValue);
			case Engine300_300Package.MULTIPLICITY_TYPE:
				return convertMultiplicityTypeToString(eDataType, instanceValue);
			case Engine300_300Package.DIRECT_QUERY_MODE_TYPE_OBJECT:
				return convertDirectQueryModeTypeObjectToString(eDataType, instanceValue);
			case Engine300_300Package.DIRECT_QUERY_USAGE_TYPE_OBJECT:
				return convertDirectQueryUsageTypeObjectToString(eDataType, instanceValue);
			case Engine300_300Package.MULTIPLICITY_TYPE_OBJECT:
				return convertMultiplicityTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType createAnnotationsType() {
		AnnotationsTypeImpl annotationsType = new AnnotationsTypeImpl();
		return annotationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesType createAttributesType() {
		AttributesTypeImpl attributesType = new AttributesTypeImpl();
		return attributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipEnd createRelationshipEnd() {
		RelationshipEndImpl relationshipEnd = new RelationshipEndImpl();
		return relationshipEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipEndTranslation createRelationshipEndTranslation() {
		RelationshipEndTranslationImpl relationshipEndTranslation = new RelationshipEndTranslationImpl();
		return relationshipEndTranslation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationships createRelationships() {
		RelationshipsImpl relationships = new RelationshipsImpl();
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType createTranslationsType() {
		TranslationsTypeImpl translationsType = new TranslationsTypeImpl();
		return translationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XEventType createXEventType() {
		XEventTypeImpl xEventType = new XEventTypeImpl();
		return xEventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectQueryModeType createDirectQueryModeTypeFromString(EDataType eDataType, String initialValue) {
		DirectQueryModeType result = DirectQueryModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectQueryModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectQueryUsageType createDirectQueryUsageTypeFromString(EDataType eDataType, String initialValue) {
		DirectQueryUsageType result = DirectQueryUsageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectQueryUsageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityType createMultiplicityTypeFromString(EDataType eDataType, String initialValue) {
		MultiplicityType result = MultiplicityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectQueryModeType createDirectQueryModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectQueryModeTypeFromString(Engine300_300Package.Literals.DIRECT_QUERY_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectQueryModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectQueryModeTypeToString(Engine300_300Package.Literals.DIRECT_QUERY_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectQueryUsageType createDirectQueryUsageTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectQueryUsageTypeFromString(Engine300_300Package.Literals.DIRECT_QUERY_USAGE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectQueryUsageTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectQueryUsageTypeToString(Engine300_300Package.Literals.DIRECT_QUERY_USAGE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityType createMultiplicityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMultiplicityTypeFromString(Engine300_300Package.Literals.MULTIPLICITY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMultiplicityTypeToString(Engine300_300Package.Literals.MULTIPLICITY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Engine300_300Package getEngine300_300Package() {
		return (Engine300_300Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Engine300_300Package getPackage() {
		return Engine300_300Package.eINSTANCE;
	}

} //Engine300_300FactoryImpl
