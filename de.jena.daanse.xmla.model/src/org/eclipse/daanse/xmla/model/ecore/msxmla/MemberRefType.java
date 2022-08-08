/**
 */
package org.eclipse.daanse.xmla.model.ecore.msxmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member Ref Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType#getMemberOrdinal <em>Member Ordinal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType#getMemberDispInfo <em>Member Disp Info</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage#getMemberRefType()
 * @model extendedMetaData="name='MemberRef_._type' kind='elementOnly'"
 * @generated
 */
public interface MemberRefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Member Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Ordinal</em>' attribute.
	 * @see #isSetMemberOrdinal()
	 * @see #unsetMemberOrdinal()
	 * @see #setMemberOrdinal(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage#getMemberRefType_MemberOrdinal()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='MemberOrdinal'"
	 * @generated
	 */
	int getMemberOrdinal();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType#getMemberOrdinal <em>Member Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Ordinal</em>' attribute.
	 * @see #isSetMemberOrdinal()
	 * @see #unsetMemberOrdinal()
	 * @see #getMemberOrdinal()
	 * @generated
	 */
	void setMemberOrdinal(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType#getMemberOrdinal <em>Member Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMemberOrdinal()
	 * @see #getMemberOrdinal()
	 * @see #setMemberOrdinal(int)
	 * @generated
	 */
	void unsetMemberOrdinal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType#getMemberOrdinal <em>Member Ordinal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Member Ordinal</em>' attribute is set.
	 * @see #unsetMemberOrdinal()
	 * @see #getMemberOrdinal()
	 * @see #setMemberOrdinal(int)
	 * @generated
	 */
	boolean isSetMemberOrdinal();

	/**
	 * Returns the value of the '<em><b>Member Disp Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Disp Info</em>' attribute.
	 * @see #isSetMemberDispInfo()
	 * @see #unsetMemberDispInfo()
	 * @see #setMemberDispInfo(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage#getMemberRefType_MemberDispInfo()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='MemberDispInfo'"
	 * @generated
	 */
	int getMemberDispInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType#getMemberDispInfo <em>Member Disp Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Disp Info</em>' attribute.
	 * @see #isSetMemberDispInfo()
	 * @see #unsetMemberDispInfo()
	 * @see #getMemberDispInfo()
	 * @generated
	 */
	void setMemberDispInfo(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType#getMemberDispInfo <em>Member Disp Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMemberDispInfo()
	 * @see #getMemberDispInfo()
	 * @see #setMemberDispInfo(int)
	 * @generated
	 */
	void unsetMemberDispInfo();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType#getMemberDispInfo <em>Member Disp Info</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Member Disp Info</em>' attribute is set.
	 * @see #unsetMemberDispInfo()
	 * @see #getMemberDispInfo()
	 * @see #setMemberDispInfo(int)
	 * @generated
	 */
	boolean isSetMemberDispInfo();

} // MemberRefType
