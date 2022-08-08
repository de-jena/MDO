/**
 */
package org.eclipse.daanse.xmla.model.ecore.engine;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impersonation Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getImpersonationMode <em>Impersonation Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getAccount <em>Account</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getImpersonationInfoSecurity <em>Impersonation Info Security</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.engine.EnginePackage#getImpersonationInfo()
 * @model extendedMetaData="name='ImpersonationInfo' kind='elementOnly'"
 * @generated
 */
public interface ImpersonationInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Impersonation Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impersonation Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType
	 * @see #isSetImpersonationMode()
	 * @see #unsetImpersonationMode()
	 * @see #setImpersonationMode(ImpersonationModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.EnginePackage#getImpersonationInfo_ImpersonationMode()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ImpersonationMode'"
	 * @generated
	 */
	ImpersonationModeType getImpersonationMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getImpersonationMode <em>Impersonation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impersonation Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationModeType
	 * @see #isSetImpersonationMode()
	 * @see #unsetImpersonationMode()
	 * @see #getImpersonationMode()
	 * @generated
	 */
	void setImpersonationMode(ImpersonationModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getImpersonationMode <em>Impersonation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImpersonationMode()
	 * @see #getImpersonationMode()
	 * @see #setImpersonationMode(ImpersonationModeType)
	 * @generated
	 */
	void unsetImpersonationMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getImpersonationMode <em>Impersonation Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impersonation Mode</em>' attribute is set.
	 * @see #unsetImpersonationMode()
	 * @see #getImpersonationMode()
	 * @see #setImpersonationMode(ImpersonationModeType)
	 * @generated
	 */
	boolean isSetImpersonationMode();

	/**
	 * Returns the value of the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' attribute.
	 * @see #setAccount(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.EnginePackage#getImpersonationInfo_Account()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Account'"
	 * @generated
	 */
	String getAccount();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getAccount <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' attribute.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.EnginePackage#getImpersonationInfo_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Impersonation Info Security</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impersonation Info Security</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType
	 * @see #isSetImpersonationInfoSecurity()
	 * @see #unsetImpersonationInfoSecurity()
	 * @see #setImpersonationInfoSecurity(ImpersonationInfoSecurityType)
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.EnginePackage#getImpersonationInfo_ImpersonationInfoSecurity()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ImpersonationInfoSecurity'"
	 * @generated
	 */
	ImpersonationInfoSecurityType getImpersonationInfoSecurity();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getImpersonationInfoSecurity <em>Impersonation Info Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impersonation Info Security</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfoSecurityType
	 * @see #isSetImpersonationInfoSecurity()
	 * @see #unsetImpersonationInfoSecurity()
	 * @see #getImpersonationInfoSecurity()
	 * @generated
	 */
	void setImpersonationInfoSecurity(ImpersonationInfoSecurityType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getImpersonationInfoSecurity <em>Impersonation Info Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImpersonationInfoSecurity()
	 * @see #getImpersonationInfoSecurity()
	 * @see #setImpersonationInfoSecurity(ImpersonationInfoSecurityType)
	 * @generated
	 */
	void unsetImpersonationInfoSecurity();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.engine.ImpersonationInfo#getImpersonationInfoSecurity <em>Impersonation Info Security</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Impersonation Info Security</em>' attribute is set.
	 * @see #unsetImpersonationInfoSecurity()
	 * @see #getImpersonationInfoSecurity()
	 * @see #setImpersonationInfoSecurity(ImpersonationInfoSecurityType)
	 * @generated
	 */
	boolean isSetImpersonationInfoSecurity();

} // ImpersonationInfo
