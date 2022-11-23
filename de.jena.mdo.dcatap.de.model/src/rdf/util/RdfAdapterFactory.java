/**
 */
package rdf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rdf.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rdf.RdfPackage
 * @generated
 */
public class RdfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RdfPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdfSwitch<Adapter> modelSwitch =
		new RdfSwitch<Adapter>() {
			@Override
			public Adapter caseDateLiteral(DateLiteral object) {
				return createDateLiteralAdapter();
			}
			@Override
			public Adapter caseDateOrDateTimeLiteral(DateOrDateTimeLiteral object) {
				return createDateOrDateTimeLiteralAdapter();
			}
			@Override
			public Adapter caseDateTimeLiteral(DateTimeLiteral object) {
				return createDateTimeLiteralAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter casePlainLiteral(PlainLiteral object) {
				return createPlainLiteralAdapter();
			}
			@Override
			public Adapter casePredicateType(PredicateType object) {
				return createPredicateTypeAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseStatement(Statement object) {
				return createStatementAdapter();
			}
			@Override
			public Adapter caseStatementType(StatementType object) {
				return createStatementTypeAdapter();
			}
			@Override
			public Adapter caseSubjectType(SubjectType object) {
				return createSubjectTypeAdapter();
			}
			@Override
			public Adapter caseTypedLiteral(TypedLiteral object) {
				return createTypedLiteralAdapter();
			}
			@Override
			public Adapter caseRDFRoot(RDFRoot object) {
				return createRDFRootAdapter();
			}
			@Override
			public Adapter caseDescription(Description object) {
				return createDescriptionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link rdf.DateLiteral <em>Date Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.DateLiteral
	 * @generated
	 */
	public Adapter createDateLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdf.DateOrDateTimeLiteral <em>Date Or Date Time Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.DateOrDateTimeLiteral
	 * @generated
	 */
	public Adapter createDateOrDateTimeLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdf.DateTimeLiteral <em>Date Time Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.DateTimeLiteral
	 * @generated
	 */
	public Adapter createDateTimeLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdf.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdf.PlainLiteral <em>Plain Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.PlainLiteral
	 * @generated
	 */
	public Adapter createPlainLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdf.PredicateType <em>Predicate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.PredicateType
	 * @generated
	 */
	public Adapter createPredicateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdf.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdf.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.Statement
	 * @generated
	 */
	public Adapter createStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdf.StatementType <em>Statement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.StatementType
	 * @generated
	 */
	public Adapter createStatementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdf.SubjectType <em>Subject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.SubjectType
	 * @generated
	 */
	public Adapter createSubjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdf.TypedLiteral <em>Typed Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.TypedLiteral
	 * @generated
	 */
	public Adapter createTypedLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdf.RDFRoot <em>RDF Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.RDFRoot
	 * @generated
	 */
	public Adapter createRDFRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdf.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdf.Description
	 * @generated
	 */
	public Adapter createDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RdfAdapterFactory
