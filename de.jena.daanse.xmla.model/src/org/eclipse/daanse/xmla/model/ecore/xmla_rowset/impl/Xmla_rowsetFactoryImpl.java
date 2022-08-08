/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_rowset.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla_rowset.*;

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
public class Xmla_rowsetFactoryImpl extends EFactoryImpl implements Xmla_rowsetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Xmla_rowsetFactory init() {
		try {
			Xmla_rowsetFactory theXmla_rowsetFactory = (Xmla_rowsetFactory)EPackage.Registry.INSTANCE.getEFactory(Xmla_rowsetPackage.eNS_URI);
			if (theXmla_rowsetFactory != null) {
				return theXmla_rowsetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Xmla_rowsetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xmla_rowsetFactoryImpl() {
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
			case Xmla_rowsetPackage.ROW: return createRow();
			case Xmla_rowsetPackage.ROWSET: return createRowset();
			case Xmla_rowsetPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rowset createRowset() {
		RowsetImpl rowset = new RowsetImpl();
		return rowset;
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
	public Xmla_rowsetPackage getXmla_rowsetPackage() {
		return (Xmla_rowsetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Xmla_rowsetPackage getPackage() {
		return Xmla_rowsetPackage.eINSTANCE;
	}

} //Xmla_rowsetFactoryImpl
