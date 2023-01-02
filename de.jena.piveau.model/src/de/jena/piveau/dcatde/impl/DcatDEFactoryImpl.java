/**
 */
package de.jena.piveau.dcatde.impl;

import de.jena.piveau.dcatde.*;

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
public class DcatDEFactoryImpl extends EFactoryImpl implements DcatDEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DcatDEFactory init() {
		try {
			DcatDEFactory theDcatDEFactory = (DcatDEFactory)EPackage.Registry.INSTANCE.getEFactory(DcatDEPackage.eNS_URI);
			if (theDcatDEFactory != null) {
				return theDcatDEFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DcatDEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcatDEFactoryImpl() {
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
			case DcatDEPackage.CONTRIBUTOR_ID: return createContributorID();
			case DcatDEPackage.DCATDE_ROOT: return createDCATDERoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContributorID createContributorID() {
		ContributorIDImpl contributorID = new ContributorIDImpl();
		return contributorID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DCATDERoot createDCATDERoot() {
		DCATDERootImpl dcatdeRoot = new DCATDERootImpl();
		return dcatdeRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DcatDEPackage getDcatDEPackage() {
		return (DcatDEPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DcatDEPackage getPackage() {
		return DcatDEPackage.eINSTANCE;
	}

} //DcatDEFactoryImpl
