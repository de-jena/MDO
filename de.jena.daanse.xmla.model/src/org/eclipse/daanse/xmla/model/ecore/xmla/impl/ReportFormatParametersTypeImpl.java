/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.ReportFormatParameter;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportFormatParametersType;
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
 * An implementation of the model object '<em><b>Report Format Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.ReportFormatParametersTypeImpl#getReportFormatParameter <em>Report Format Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportFormatParametersTypeImpl extends MinimalEObjectImpl.Container implements ReportFormatParametersType {
	/**
	 * The cached value of the '{@link #getReportFormatParameter() <em>Report Format Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportFormatParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportFormatParameter> reportFormatParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportFormatParametersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.REPORT_FORMAT_PARAMETERS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReportFormatParameter> getReportFormatParameter() {
		if (reportFormatParameter == null) {
			reportFormatParameter = new EObjectContainmentEList<ReportFormatParameter>(ReportFormatParameter.class, this, XmlaPackage.REPORT_FORMAT_PARAMETERS_TYPE__REPORT_FORMAT_PARAMETER);
		}
		return reportFormatParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.REPORT_FORMAT_PARAMETERS_TYPE__REPORT_FORMAT_PARAMETER:
				return ((InternalEList<?>)getReportFormatParameter()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.REPORT_FORMAT_PARAMETERS_TYPE__REPORT_FORMAT_PARAMETER:
				return getReportFormatParameter();
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
			case XmlaPackage.REPORT_FORMAT_PARAMETERS_TYPE__REPORT_FORMAT_PARAMETER:
				getReportFormatParameter().clear();
				getReportFormatParameter().addAll((Collection<? extends ReportFormatParameter>)newValue);
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
			case XmlaPackage.REPORT_FORMAT_PARAMETERS_TYPE__REPORT_FORMAT_PARAMETER:
				getReportFormatParameter().clear();
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
			case XmlaPackage.REPORT_FORMAT_PARAMETERS_TYPE__REPORT_FORMAT_PARAMETER:
				return reportFormatParameter != null && !reportFormatParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReportFormatParametersTypeImpl
