/**
 */
package org.eclipse.daanse.xmla.model.ecore.msxmla.impl;

import org.eclipse.daanse.xmla.model.ecore.msxmla.MemberRefType;
import org.eclipse.daanse.xmla.model.ecore.msxmla.MsxmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MemberRefTypeImpl#getMemberOrdinal <em>Member Ordinal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.msxmla.impl.MemberRefTypeImpl#getMemberDispInfo <em>Member Disp Info</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberRefTypeImpl extends MinimalEObjectImpl.Container implements MemberRefType {
	/**
	 * The default value of the '{@link #getMemberOrdinal() <em>Member Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOrdinal()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMBER_ORDINAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemberOrdinal() <em>Member Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOrdinal()
	 * @generated
	 * @ordered
	 */
	protected int memberOrdinal = MEMBER_ORDINAL_EDEFAULT;

	/**
	 * This is true if the Member Ordinal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean memberOrdinalESet;

	/**
	 * The default value of the '{@link #getMemberDispInfo() <em>Member Disp Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberDispInfo()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMBER_DISP_INFO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemberDispInfo() <em>Member Disp Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberDispInfo()
	 * @generated
	 * @ordered
	 */
	protected int memberDispInfo = MEMBER_DISP_INFO_EDEFAULT;

	/**
	 * This is true if the Member Disp Info attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean memberDispInfoESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberRefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsxmlaPackage.Literals.MEMBER_REF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemberOrdinal() {
		return memberOrdinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberOrdinal(int newMemberOrdinal) {
		int oldMemberOrdinal = memberOrdinal;
		memberOrdinal = newMemberOrdinal;
		boolean oldMemberOrdinalESet = memberOrdinalESet;
		memberOrdinalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsxmlaPackage.MEMBER_REF_TYPE__MEMBER_ORDINAL, oldMemberOrdinal, memberOrdinal, !oldMemberOrdinalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMemberOrdinal() {
		int oldMemberOrdinal = memberOrdinal;
		boolean oldMemberOrdinalESet = memberOrdinalESet;
		memberOrdinal = MEMBER_ORDINAL_EDEFAULT;
		memberOrdinalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MsxmlaPackage.MEMBER_REF_TYPE__MEMBER_ORDINAL, oldMemberOrdinal, MEMBER_ORDINAL_EDEFAULT, oldMemberOrdinalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberOrdinal() {
		return memberOrdinalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemberDispInfo() {
		return memberDispInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemberDispInfo(int newMemberDispInfo) {
		int oldMemberDispInfo = memberDispInfo;
		memberDispInfo = newMemberDispInfo;
		boolean oldMemberDispInfoESet = memberDispInfoESet;
		memberDispInfoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsxmlaPackage.MEMBER_REF_TYPE__MEMBER_DISP_INFO, oldMemberDispInfo, memberDispInfo, !oldMemberDispInfoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMemberDispInfo() {
		int oldMemberDispInfo = memberDispInfo;
		boolean oldMemberDispInfoESet = memberDispInfoESet;
		memberDispInfo = MEMBER_DISP_INFO_EDEFAULT;
		memberDispInfoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MsxmlaPackage.MEMBER_REF_TYPE__MEMBER_DISP_INFO, oldMemberDispInfo, MEMBER_DISP_INFO_EDEFAULT, oldMemberDispInfoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemberDispInfo() {
		return memberDispInfoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MsxmlaPackage.MEMBER_REF_TYPE__MEMBER_ORDINAL:
				return getMemberOrdinal();
			case MsxmlaPackage.MEMBER_REF_TYPE__MEMBER_DISP_INFO:
				return getMemberDispInfo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MsxmlaPackage.MEMBER_REF_TYPE__MEMBER_ORDINAL:
				setMemberOrdinal((Integer)newValue);
				return;
			case MsxmlaPackage.MEMBER_REF_TYPE__MEMBER_DISP_INFO:
				setMemberDispInfo((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MsxmlaPackage.MEMBER_REF_TYPE__MEMBER_ORDINAL:
				unsetMemberOrdinal();
				return;
			case MsxmlaPackage.MEMBER_REF_TYPE__MEMBER_DISP_INFO:
				unsetMemberDispInfo();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MsxmlaPackage.MEMBER_REF_TYPE__MEMBER_ORDINAL:
				return isSetMemberOrdinal();
			case MsxmlaPackage.MEMBER_REF_TYPE__MEMBER_DISP_INFO:
				return isSetMemberDispInfo();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (memberOrdinal: ");
		if (memberOrdinalESet) result.append(memberOrdinal); else result.append("<unset>");
		result.append(", memberDispInfo: ");
		if (memberDispInfoESet) result.append(memberDispInfo); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MemberRefTypeImpl
