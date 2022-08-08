/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.lang.Object;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#isRequiresRestart <em>Requires Restart</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#getPendingValue <em>Pending Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#isDisplayFlag <em>Display Flag</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServerProperty()
 * @model extendedMetaData="name='ServerProperty' kind='elementOnly'"
 * @generated
 */
public interface ServerProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServerProperty_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServerProperty_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Requires Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires Restart</em>' attribute.
	 * @see #isSetRequiresRestart()
	 * @see #unsetRequiresRestart()
	 * @see #setRequiresRestart(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServerProperty_RequiresRestart()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='RequiresRestart'"
	 * @generated
	 */
	boolean isRequiresRestart();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#isRequiresRestart <em>Requires Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires Restart</em>' attribute.
	 * @see #isSetRequiresRestart()
	 * @see #unsetRequiresRestart()
	 * @see #isRequiresRestart()
	 * @generated
	 */
	void setRequiresRestart(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#isRequiresRestart <em>Requires Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequiresRestart()
	 * @see #isRequiresRestart()
	 * @see #setRequiresRestart(boolean)
	 * @generated
	 */
	void unsetRequiresRestart();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#isRequiresRestart <em>Requires Restart</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Requires Restart</em>' attribute is set.
	 * @see #unsetRequiresRestart()
	 * @see #isRequiresRestart()
	 * @see #setRequiresRestart(boolean)
	 * @generated
	 */
	boolean isSetRequiresRestart();

	/**
	 * Returns the value of the '<em><b>Pending Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending Value</em>' attribute.
	 * @see #setPendingValue(Object)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServerProperty_PendingValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='PendingValue'"
	 * @generated
	 */
	Object getPendingValue();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#getPendingValue <em>Pending Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pending Value</em>' attribute.
	 * @see #getPendingValue()
	 * @generated
	 */
	void setPendingValue(Object value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(Object)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServerProperty_DefaultValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='element' name='DefaultValue'"
	 * @generated
	 */
	Object getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(Object value);

	/**
	 * Returns the value of the '<em><b>Display Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Flag</em>' attribute.
	 * @see #isSetDisplayFlag()
	 * @see #unsetDisplayFlag()
	 * @see #setDisplayFlag(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServerProperty_DisplayFlag()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='DisplayFlag'"
	 * @generated
	 */
	boolean isDisplayFlag();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#isDisplayFlag <em>Display Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Flag</em>' attribute.
	 * @see #isSetDisplayFlag()
	 * @see #unsetDisplayFlag()
	 * @see #isDisplayFlag()
	 * @generated
	 */
	void setDisplayFlag(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#isDisplayFlag <em>Display Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayFlag()
	 * @see #isDisplayFlag()
	 * @see #setDisplayFlag(boolean)
	 * @generated
	 */
	void unsetDisplayFlag();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#isDisplayFlag <em>Display Flag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Flag</em>' attribute is set.
	 * @see #unsetDisplayFlag()
	 * @see #isDisplayFlag()
	 * @see #setDisplayFlag(boolean)
	 * @generated
	 */
	boolean isSetDisplayFlag();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServerProperty_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // ServerProperty
