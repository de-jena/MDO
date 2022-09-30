/**
 */
package rdf.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import rdf.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdfFactoryImpl extends EFactoryImpl implements RdfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RdfFactory init() {
		try {
			RdfFactory theRdfFactory = (RdfFactory)EPackage.Registry.INSTANCE.getEFactory(RdfPackage.eNS_URI);
			if (theRdfFactory != null) {
				return theRdfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RdfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfFactoryImpl() {
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
			case RdfPackage.DATE_LITERAL: return createDateLiteral();
			case RdfPackage.DATE_OR_DATE_TIME_LITERAL: return createDateOrDateTimeLiteral();
			case RdfPackage.DATE_TIME_LITERAL: return createDateTimeLiteral();
			case RdfPackage.OBJECT_TYPE: return createObjectType();
			case RdfPackage.PLAIN_LITERAL: return createPlainLiteral();
			case RdfPackage.PREDICATE_TYPE: return createPredicateType();
			case RdfPackage.RESOURCE: return createResource();
			case RdfPackage.STATEMENT: return createStatement();
			case RdfPackage.STATEMENT_TYPE: return createStatementType();
			case RdfPackage.SUBJECT_TYPE: return createSubjectType();
			case RdfPackage.TYPED_LITERAL: return createTypedLiteral();
			case RdfPackage.RDF_ROOT: return createRDFRoot();
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
			case RdfPackage.DATATYPE_TYPE:
				return createDatatypeTypeFromString(eDataType, initialValue);
			case RdfPackage.DATATYPE_TYPE_OBJECT:
				return createDatatypeTypeObjectFromString(eDataType, initialValue);
			case RdfPackage.DATE_OR_DATE_TIME:
				return createDateOrDateTimeFromString(eDataType, initialValue);
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
			case RdfPackage.DATATYPE_TYPE:
				return convertDatatypeTypeToString(eDataType, instanceValue);
			case RdfPackage.DATATYPE_TYPE_OBJECT:
				return convertDatatypeTypeObjectToString(eDataType, instanceValue);
			case RdfPackage.DATE_OR_DATE_TIME:
				return convertDateOrDateTimeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateLiteral createDateLiteral() {
		DateLiteralImpl dateLiteral = new DateLiteralImpl();
		return dateLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateOrDateTimeLiteral createDateOrDateTimeLiteral() {
		DateOrDateTimeLiteralImpl dateOrDateTimeLiteral = new DateOrDateTimeLiteralImpl();
		return dateOrDateTimeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeLiteral createDateTimeLiteral() {
		DateTimeLiteralImpl dateTimeLiteral = new DateTimeLiteralImpl();
		return dateTimeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType createObjectType() {
		ObjectTypeImpl objectType = new ObjectTypeImpl();
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlainLiteral createPlainLiteral() {
		PlainLiteralImpl plainLiteral = new PlainLiteralImpl();
		return plainLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateType createPredicateType() {
		PredicateTypeImpl predicateType = new PredicateTypeImpl();
		return predicateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementType createStatementType() {
		StatementTypeImpl statementType = new StatementTypeImpl();
		return statementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectType createSubjectType() {
		SubjectTypeImpl subjectType = new SubjectTypeImpl();
		return subjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedLiteral createTypedLiteral() {
		TypedLiteralImpl typedLiteral = new TypedLiteralImpl();
		return typedLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDFRoot createRDFRoot() {
		RDFRootImpl rdfRoot = new RDFRootImpl();
		return rdfRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeType createDatatypeTypeFromString(EDataType eDataType, String initialValue) {
		DatatypeType result = DatatypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeType createDatatypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDatatypeTypeFromString(RdfPackage.Literals.DATATYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDatatypeTypeToString(RdfPackage.Literals.DATATYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateOrDateTimeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateOrDateTimeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfPackage getRdfPackage() {
		return (RdfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RdfPackage getPackage() {
		return RdfPackage.eINSTANCE;
	}

} //RdfFactoryImpl
