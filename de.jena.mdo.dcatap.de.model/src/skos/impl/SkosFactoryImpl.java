/**
 */
package skos.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import skos.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkosFactoryImpl extends EFactoryImpl implements SkosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SkosFactory init() {
		try {
			SkosFactory theSkosFactory = (SkosFactory)EPackage.Registry.INSTANCE.getEFactory(SkosPackage.eNS_URI);
			if (theSkosFactory != null) {
				return theSkosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SkosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkosFactoryImpl() {
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
			case SkosPackage.CONCEPT: return createConcept();
			case SkosPackage.CONCEPT_SCHEME: return createConceptScheme();
			case SkosPackage.CONCEPT_SCHEME_TYPE: return createConceptSchemeType();
			case SkosPackage.CONCEPT_TYPE: return createConceptType();
			case SkosPackage.IN_SCHEME_TYPE: return createInSchemeType();
			case SkosPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept createConcept() {
		ConceptImpl concept = new ConceptImpl();
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptScheme createConceptScheme() {
		ConceptSchemeImpl conceptScheme = new ConceptSchemeImpl();
		return conceptScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptSchemeType createConceptSchemeType() {
		ConceptSchemeTypeImpl conceptSchemeType = new ConceptSchemeTypeImpl();
		return conceptSchemeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptType createConceptType() {
		ConceptTypeImpl conceptType = new ConceptTypeImpl();
		return conceptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InSchemeType createInSchemeType() {
		InSchemeTypeImpl inSchemeType = new InSchemeTypeImpl();
		return inSchemeType;
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
	public SkosPackage getSkosPackage() {
		return (SkosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SkosPackage getPackage() {
		return SkosPackage.eINSTANCE;
	}

} //SkosFactoryImpl
