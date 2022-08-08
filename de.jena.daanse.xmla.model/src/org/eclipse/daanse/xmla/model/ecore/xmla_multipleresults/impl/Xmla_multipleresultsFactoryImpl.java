/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla_multipleresults.*;

import org.eclipse.emf.ecore.EClass;
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
public class Xmla_multipleresultsFactoryImpl extends EFactoryImpl implements Xmla_multipleresultsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Xmla_multipleresultsFactory init() {
		try {
			Xmla_multipleresultsFactory theXmla_multipleresultsFactory = (Xmla_multipleresultsFactory)EPackage.Registry.INSTANCE.getEFactory(Xmla_multipleresultsPackage.eNS_URI);
			if (theXmla_multipleresultsFactory != null) {
				return theXmla_multipleresultsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Xmla_multipleresultsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmla_multipleresultsFactoryImpl() {
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
			case Xmla_multipleresultsPackage.RESULTS_TYPE: return createResultsType();
			case Xmla_multipleresultsPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsType createResultsType() {
		ResultsTypeImpl resultsType = new ResultsTypeImpl();
		return resultsType;
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
	public Xmla_multipleresultsPackage getXmla_multipleresultsPackage() {
		return (Xmla_multipleresultsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Xmla_multipleresultsPackage getPackage() {
		return Xmla_multipleresultsPackage.eINSTANCE;
	}

} //Xmla_multipleresultsFactoryImpl
