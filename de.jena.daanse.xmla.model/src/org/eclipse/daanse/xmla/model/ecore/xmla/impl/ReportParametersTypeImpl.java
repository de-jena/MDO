/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.ReportParameter;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportParametersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReportParametersTypeImpl#getReportParameter <em>Report Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportParametersTypeImpl extends MinimalEObjectImpl.Container implements ReportParametersType {
	/**
	 * The cached value of the '{@link #getReportParameter() <em>Report Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportParameter> reportParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportParametersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.REPORT_PARAMETERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportParameter> getReportParameter() {
		if (reportParameter == null) {
			reportParameter = new EObjectContainmentEList<ReportParameter>(ReportParameter.class, this, XmlaPackage.REPORT_PARAMETERS_TYPE__REPORT_PARAMETER);
		}
		return reportParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.REPORT_PARAMETERS_TYPE__REPORT_PARAMETER:
				return ((InternalEList<?>)getReportParameter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.REPORT_PARAMETERS_TYPE__REPORT_PARAMETER:
				return getReportParameter();
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
			case XmlaPackage.REPORT_PARAMETERS_TYPE__REPORT_PARAMETER:
				getReportParameter().clear();
				getReportParameter().addAll((Collection<? extends ReportParameter>)newValue);
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
			case XmlaPackage.REPORT_PARAMETERS_TYPE__REPORT_PARAMETER:
				getReportParameter().clear();
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
			case XmlaPackage.REPORT_PARAMETERS_TYPE__REPORT_PARAMETER:
				return reportParameter != null && !reportParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReportParametersTypeImpl
