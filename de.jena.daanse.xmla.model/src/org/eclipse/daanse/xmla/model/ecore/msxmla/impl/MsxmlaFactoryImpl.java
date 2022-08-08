/**
 */
package org.eclipse.daanse.xmla.model.ecore.msxmla.impl;

import org.eclipse.daanse.xmla.model.ecore.msxmla.*;

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
public class MsxmlaFactoryImpl extends EFactoryImpl implements MsxmlaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MsxmlaFactory init() {
		try {
			MsxmlaFactory theMsxmlaFactory = (MsxmlaFactory)EPackage.Registry.INSTANCE.getEFactory(MsxmlaPackage.eNS_URI);
			if (theMsxmlaFactory != null) {
				return theMsxmlaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MsxmlaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsxmlaFactoryImpl() {
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
			case MsxmlaPackage.MEMBER_REF_TYPE: return createMemberRefType();
			case MsxmlaPackage.MEMBERS_LOOKUP_TYPE: return createMembersLookupType();
			case MsxmlaPackage.NORM_TUPLE_SET_TYPE: return createNormTupleSetType();
			case MsxmlaPackage.NORM_TUPLES_TYPE: return createNormTuplesType();
			case MsxmlaPackage.NORM_TUPLE_TYPE: return createNormTupleType();
			case MsxmlaPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberRefType createMemberRefType() {
		MemberRefTypeImpl memberRefType = new MemberRefTypeImpl();
		return memberRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembersLookupType createMembersLookupType() {
		MembersLookupTypeImpl membersLookupType = new MembersLookupTypeImpl();
		return membersLookupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormTupleSetType createNormTupleSetType() {
		NormTupleSetTypeImpl normTupleSetType = new NormTupleSetTypeImpl();
		return normTupleSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormTuplesType createNormTuplesType() {
		NormTuplesTypeImpl normTuplesType = new NormTuplesTypeImpl();
		return normTuplesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormTupleType createNormTupleType() {
		NormTupleTypeImpl normTupleType = new NormTupleTypeImpl();
		return normTupleType;
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
	public MsxmlaPackage getMsxmlaPackage() {
		return (MsxmlaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MsxmlaPackage getPackage() {
		return MsxmlaPackage.eINSTANCE;
	}

} //MsxmlaFactoryImpl
