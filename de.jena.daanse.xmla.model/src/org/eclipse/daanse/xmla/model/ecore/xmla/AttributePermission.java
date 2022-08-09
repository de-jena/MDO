/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getDefaultMember <em>Default Member</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getVisualTotals <em>Visual Totals</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getAllowedSet <em>Allowed Set</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getDeniedSet <em>Denied Set</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributePermission()
 * @model extendedMetaData="name='AttributePermission' kind='elementOnly'"
 * @generated
 */
public interface AttributePermission extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute ID</em>' attribute.
	 * @see #setAttributeID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributePermission_AttributeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AttributeID'"
	 * @generated
	 */
	String getAttributeID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getAttributeID <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute ID</em>' attribute.
	 * @see #getAttributeID()
	 * @generated
	 */
	void setAttributeID(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributePermission_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Default Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Member</em>' attribute.
	 * @see #setDefaultMember(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributePermission_DefaultMember()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DefaultMember'"
	 * @generated
	 */
	String getDefaultMember();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getDefaultMember <em>Default Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Member</em>' attribute.
	 * @see #getDefaultMember()
	 * @generated
	 */
	void setDefaultMember(String value);

	/**
	 * Returns the value of the '<em><b>Visual Totals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visual Totals</em>' attribute.
	 * @see #setVisualTotals(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributePermission_VisualTotals()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='VisualTotals'"
	 * @generated
	 */
	String getVisualTotals();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getVisualTotals <em>Visual Totals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visual Totals</em>' attribute.
	 * @see #getVisualTotals()
	 * @generated
	 */
	void setVisualTotals(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Set</em>' attribute.
	 * @see #setAllowedSet(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributePermission_AllowedSet()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='AllowedSet'"
	 * @generated
	 */
	String getAllowedSet();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getAllowedSet <em>Allowed Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Set</em>' attribute.
	 * @see #getAllowedSet()
	 * @generated
	 */
	void setAllowedSet(String value);

	/**
	 * Returns the value of the '<em><b>Denied Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denied Set</em>' attribute.
	 * @see #setDeniedSet(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributePermission_DeniedSet()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DeniedSet'"
	 * @generated
	 */
	String getDeniedSet();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getDeniedSet <em>Denied Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denied Set</em>' attribute.
	 * @see #getDeniedSet()
	 * @generated
	 */
	void setDeniedSet(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAttributePermission_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.AttributePermission#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

} // AttributePermission
