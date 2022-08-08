/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_empty.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla_empty.*;

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
public class Xmla_emptyFactoryImpl extends EFactoryImpl implements Xmla_emptyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Xmla_emptyFactory init() {
		try {
			Xmla_emptyFactory theXmla_emptyFactory = (Xmla_emptyFactory)EPackage.Registry.INSTANCE.getEFactory(Xmla_emptyPackage.eNS_URI);
			if (theXmla_emptyFactory != null) {
				return theXmla_emptyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Xmla_emptyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmla_emptyFactoryImpl() {
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
			case Xmla_emptyPackage.EMPTYRESULT: return createEmptyresult();
			case Xmla_emptyPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emptyresult createEmptyresult() {
		EmptyresultImpl emptyresult = new EmptyresultImpl();
		return emptyresult;
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
	public Xmla_emptyPackage getXmla_emptyPackage() {
		return (Xmla_emptyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Xmla_emptyPackage getPackage() {
		return Xmla_emptyPackage.eINSTANCE;
	}

} //Xmla_emptyFactoryImpl
