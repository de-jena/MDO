/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perspective Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute#getDefaultMember <em>Default Member</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectiveAttribute()
 * @model extendedMetaData="name='PerspectiveAttribute' kind='elementOnly'"
 * @generated
 */
public interface PerspectiveAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute ID</em>' attribute.
	 * @see #setAttributeID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectiveAttribute_AttributeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AttributeID'"
	 * @generated
	 */
	String getAttributeID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute#getAttributeID <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute ID</em>' attribute.
	 * @see #getAttributeID()
	 * @generated
	 */
	void setAttributeID(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Hierarchy Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Hierarchy Visible</em>' attribute.
	 * @see #isSetAttributeHierarchyVisible()
	 * @see #unsetAttributeHierarchyVisible()
	 * @see #setAttributeHierarchyVisible(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectiveAttribute_AttributeHierarchyVisible()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AttributeHierarchyVisible'"
	 * @generated
	 */
	boolean isAttributeHierarchyVisible();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Hierarchy Visible</em>' attribute.
	 * @see #isSetAttributeHierarchyVisible()
	 * @see #unsetAttributeHierarchyVisible()
	 * @see #isAttributeHierarchyVisible()
	 * @generated
	 */
	void setAttributeHierarchyVisible(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAttributeHierarchyVisible()
	 * @see #isAttributeHierarchyVisible()
	 * @see #setAttributeHierarchyVisible(boolean)
	 * @generated
	 */
	void unsetAttributeHierarchyVisible();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute#isAttributeHierarchyVisible <em>Attribute Hierarchy Visible</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Attribute Hierarchy Visible</em>' attribute is set.
	 * @see #unsetAttributeHierarchyVisible()
	 * @see #isAttributeHierarchyVisible()
	 * @see #setAttributeHierarchyVisible(boolean)
	 * @generated
	 */
	boolean isSetAttributeHierarchyVisible();

	/**
	 * Returns the value of the '<em><b>Default Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Member</em>' attribute.
	 * @see #setDefaultMember(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectiveAttribute_DefaultMember()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DefaultMember'"
	 * @generated
	 */
	String getDefaultMember();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute#getDefaultMember <em>Default Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Member</em>' attribute.
	 * @see #getDefaultMember()
	 * @generated
	 */
	void setDefaultMember(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectiveAttribute_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveAttribute#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

} // PerspectiveAttribute
