/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_exception;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Warning Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getHelpFile <em>Help File</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getWarningCode <em>Warning Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getWarningType()
 * @model extendedMetaData="name='WarningType' kind='elementOnly'"
 * @generated
 */
public interface WarningType extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(MessageLocation)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getWarningType_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Location'"
	 * @generated
	 */
	MessageLocation getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(MessageLocation value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getWarningType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Help File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help File</em>' attribute.
	 * @see #setHelpFile(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getWarningType_HelpFile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='HelpFile'"
	 * @generated
	 */
	String getHelpFile();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getHelpFile <em>Help File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Help File</em>' attribute.
	 * @see #getHelpFile()
	 * @generated
	 */
	void setHelpFile(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getWarningType_Source()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Source'"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Warning Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warning Code</em>' attribute.
	 * @see #isSetWarningCode()
	 * @see #unsetWarningCode()
	 * @see #setWarningCode(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getWarningType_WarningCode()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='WarningCode'"
	 * @generated
	 */
	int getWarningCode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getWarningCode <em>Warning Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warning Code</em>' attribute.
	 * @see #isSetWarningCode()
	 * @see #unsetWarningCode()
	 * @see #getWarningCode()
	 * @generated
	 */
	void setWarningCode(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getWarningCode <em>Warning Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWarningCode()
	 * @see #getWarningCode()
	 * @see #setWarningCode(int)
	 * @generated
	 */
	void unsetWarningCode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.WarningType#getWarningCode <em>Warning Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Warning Code</em>' attribute is set.
	 * @see #unsetWarningCode()
	 * @see #getWarningCode()
	 * @see #setWarningCode(int)
	 * @generated
	 */
	boolean isSetWarningCode();

} // WarningType
