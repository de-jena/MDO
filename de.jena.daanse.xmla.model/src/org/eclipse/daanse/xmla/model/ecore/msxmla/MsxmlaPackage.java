/**
 */
package org.eclipse.daanse.xmla.model.ecore.msxmla;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaFactory
 * @model kind="package"
 *        annotation="https://jakarta.ee/xml/ns/jaxb version='3.0'"
 * @generated
 */
public interface MsxmlaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "msxmla";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.microsoft.com/analysisservices/2003/xmla";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "msxmla";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MsxmlaPackage eINSTANCE = org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MemberRefTypeImpl <em>Member Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MemberRefTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl#getMemberRefType()
	 * @generated
	 */
	int MEMBER_REF_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Member Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF_TYPE__MEMBER_ORDINAL = 0;

	/**
	 * The feature id for the '<em><b>Member Disp Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF_TYPE__MEMBER_DISP_INFO = 1;

	/**
	 * The number of structural features of the '<em>Member Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Member Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_REF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MembersLookupTypeImpl <em>Members Lookup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MembersLookupTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl#getMembersLookupType()
	 * @generated
	 */
	int MEMBERS_LOOKUP_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERS_LOOKUP_TYPE__MEMBERS = 0;

	/**
	 * The number of structural features of the '<em>Members Lookup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERS_LOOKUP_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Members Lookup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERS_LOOKUP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTupleSetTypeImpl <em>Norm Tuple Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTupleSetTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl#getNormTupleSetType()
	 * @generated
	 */
	int NORM_TUPLE_SET_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Norm Tuples</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_TUPLE_SET_TYPE__NORM_TUPLES = 0;

	/**
	 * The feature id for the '<em><b>Members Lookup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_TUPLE_SET_TYPE__MEMBERS_LOOKUP = 1;

	/**
	 * The number of structural features of the '<em>Norm Tuple Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_TUPLE_SET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Norm Tuple Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_TUPLE_SET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTuplesTypeImpl <em>Norm Tuples Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTuplesTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl#getNormTuplesType()
	 * @generated
	 */
	int NORM_TUPLES_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Norm Tuple</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_TUPLES_TYPE__NORM_TUPLE = 0;

	/**
	 * The number of structural features of the '<em>Norm Tuples Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_TUPLES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Norm Tuples Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_TUPLES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTupleTypeImpl <em>Norm Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTupleTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl#getNormTupleType()
	 * @generated
	 */
	int NORM_TUPLE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Member Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_TUPLE_TYPE__MEMBER_REF = 0;

	/**
	 * The number of structural features of the '<em>Norm Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_TUPLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Norm Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORM_TUPLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.DocumentRootImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>Norm Tuple Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NORM_TUPLE_SET = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType <em>Member Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Ref Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType
	 * @generated
	 */
	EClass getMemberRefType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType#getMemberOrdinal <em>Member Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Ordinal</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType#getMemberOrdinal()
	 * @see #getMemberRefType()
	 * @generated
	 */
	EAttribute getMemberRefType_MemberOrdinal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType#getMemberDispInfo <em>Member Disp Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Member Disp Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType#getMemberDispInfo()
	 * @see #getMemberRefType()
	 * @generated
	 */
	EAttribute getMemberRefType_MemberDispInfo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MembersLookupType <em>Members Lookup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Members Lookup Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MembersLookupType
	 * @generated
	 */
	EClass getMembersLookupType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MembersLookupType#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MembersLookupType#getMembers()
	 * @see #getMembersLookupType()
	 * @generated
	 */
	EReference getMembersLookupType_Members();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleSetType <em>Norm Tuple Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm Tuple Set Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleSetType
	 * @generated
	 */
	EClass getNormTupleSetType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleSetType#getNormTuples <em>Norm Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Norm Tuples</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleSetType#getNormTuples()
	 * @see #getNormTupleSetType()
	 * @generated
	 */
	EReference getNormTupleSetType_NormTuples();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleSetType#getMembersLookup <em>Members Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Members Lookup</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleSetType#getMembersLookup()
	 * @see #getNormTupleSetType()
	 * @generated
	 */
	EReference getNormTupleSetType_MembersLookup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTuplesType <em>Norm Tuples Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm Tuples Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.NormTuplesType
	 * @generated
	 */
	EClass getNormTuplesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTuplesType#getNormTuple <em>Norm Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Norm Tuple</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.NormTuplesType#getNormTuple()
	 * @see #getNormTuplesType()
	 * @generated
	 */
	EReference getNormTuplesType_NormTuple();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleType <em>Norm Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Norm Tuple Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleType
	 * @generated
	 */
	EClass getNormTupleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleType#getMemberRef <em>Member Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member Ref</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.NormTupleType#getMemberRef()
	 * @see #getNormTupleType()
	 * @generated
	 */
	EReference getNormTupleType_MemberRef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.DocumentRoot#getNormTupleSet <em>Norm Tuple Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Norm Tuple Set</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.DocumentRoot#getNormTupleSet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NormTupleSet();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MsxmlaFactory getMsxmlaFactory();

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
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MemberRefTypeImpl <em>Member Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MemberRefTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl#getMemberRefType()
		 * @generated
		 */
		EClass MEMBER_REF_TYPE = eINSTANCE.getMemberRefType();

		/**
		 * The meta object literal for the '<em><b>Member Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_REF_TYPE__MEMBER_ORDINAL = eINSTANCE.getMemberRefType_MemberOrdinal();

		/**
		 * The meta object literal for the '<em><b>Member Disp Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_REF_TYPE__MEMBER_DISP_INFO = eINSTANCE.getMemberRefType_MemberDispInfo();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MembersLookupTypeImpl <em>Members Lookup Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MembersLookupTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl#getMembersLookupType()
		 * @generated
		 */
		EClass MEMBERS_LOOKUP_TYPE = eINSTANCE.getMembersLookupType();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERS_LOOKUP_TYPE__MEMBERS = eINSTANCE.getMembersLookupType_Members();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTupleSetTypeImpl <em>Norm Tuple Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTupleSetTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl#getNormTupleSetType()
		 * @generated
		 */
		EClass NORM_TUPLE_SET_TYPE = eINSTANCE.getNormTupleSetType();

		/**
		 * The meta object literal for the '<em><b>Norm Tuples</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM_TUPLE_SET_TYPE__NORM_TUPLES = eINSTANCE.getNormTupleSetType_NormTuples();

		/**
		 * The meta object literal for the '<em><b>Members Lookup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM_TUPLE_SET_TYPE__MEMBERS_LOOKUP = eINSTANCE.getNormTupleSetType_MembersLookup();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTuplesTypeImpl <em>Norm Tuples Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTuplesTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl#getNormTuplesType()
		 * @generated
		 */
		EClass NORM_TUPLES_TYPE = eINSTANCE.getNormTuplesType();

		/**
		 * The meta object literal for the '<em><b>Norm Tuple</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM_TUPLES_TYPE__NORM_TUPLE = eINSTANCE.getNormTuplesType_NormTuple();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTupleTypeImpl <em>Norm Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.NormTupleTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl#getNormTupleType()
		 * @generated
		 */
		EClass NORM_TUPLE_TYPE = eINSTANCE.getNormTupleType();

		/**
		 * The meta object literal for the '<em><b>Member Ref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORM_TUPLE_TYPE__MEMBER_REF = eINSTANCE.getNormTupleType_MemberRef();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.DocumentRootImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MsxmlaPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Norm Tuple Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NORM_TUPLE_SET = eINSTANCE.getDocumentRoot_NormTupleSet();

	}

} //MsxmlaPackage
