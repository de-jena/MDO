/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.ClassifiedColumnsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classified Columns Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ClassifiedColumnsTypeImpl#getClassifiedColumnID <em>Classified Column ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifiedColumnsTypeImpl extends MinimalEObjectImpl.Container implements ClassifiedColumnsType {
	/**
	 * The cached value of the '{@link #getClassifiedColumnID() <em>Classified Column ID</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiedColumnID()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classifiedColumnID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifiedColumnsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.CLASSIFIED_COLUMNS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClassifiedColumnID() {
		if (classifiedColumnID == null) {
			classifiedColumnID = new EDataTypeEList<String>(String.class, this, XmlaPackage.CLASSIFIED_COLUMNS_TYPE__CLASSIFIED_COLUMN_ID);
		}
		return classifiedColumnID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.CLASSIFIED_COLUMNS_TYPE__CLASSIFIED_COLUMN_ID:
				return getClassifiedColumnID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.CLASSIFIED_COLUMNS_TYPE__CLASSIFIED_COLUMN_ID:
				getClassifiedColumnID().clear();
				getClassifiedColumnID().addAll((Collection<? extends String>)newValue);
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
			case XmlaPackage.CLASSIFIED_COLUMNS_TYPE__CLASSIFIED_COLUMN_ID:
				getClassifiedColumnID().clear();
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
			case XmlaPackage.CLASSIFIED_COLUMNS_TYPE__CLASSIFIED_COLUMN_ID:
				return classifiedColumnID != null && !classifiedColumnID.isEmpty();
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
		result.append(" (classifiedColumnID: ");
		result.append(classifiedColumnID);
		result.append(')');
		return result.toString();
	}

} //ClassifiedColumnsTypeImpl
