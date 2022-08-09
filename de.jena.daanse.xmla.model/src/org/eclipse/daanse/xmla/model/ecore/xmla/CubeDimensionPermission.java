/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Dimension Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getCubeDimensionID <em>Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getRead <em>Read</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getWrite <em>Write</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getAttributePermissions <em>Attribute Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimensionPermission()
 * @model extendedMetaData="name='CubeDimensionPermission' kind='elementOnly'"
 * @generated
 */
public interface CubeDimensionPermission extends EObject {
	/**
	 * Returns the value of the '<em><b>Cube Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Dimension ID</em>' attribute.
	 * @see #setCubeDimensionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimensionPermission_CubeDimensionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='CubeDimensionID'"
	 * @generated
	 */
	String getCubeDimensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getCubeDimensionID <em>Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube Dimension ID</em>' attribute.
	 * @see #getCubeDimensionID()
	 * @generated
	 */
	void setCubeDimensionID(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimensionPermission_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Read</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ReadType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReadType
	 * @see #isSetRead()
	 * @see #unsetRead()
	 * @see #setRead(ReadType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimensionPermission_Read()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Read'"
	 * @generated
	 */
	ReadType getRead();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getRead <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReadType
	 * @see #isSetRead()
	 * @see #unsetRead()
	 * @see #getRead()
	 * @generated
	 */
	void setRead(ReadType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getRead <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRead()
	 * @see #getRead()
	 * @see #setRead(ReadType)
	 * @generated
	 */
	void unsetRead();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getRead <em>Read</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read</em>' attribute is set.
	 * @see #unsetRead()
	 * @see #getRead()
	 * @see #setRead(ReadType)
	 * @generated
	 */
	boolean isSetRead();

	/**
	 * Returns the value of the '<em><b>Write</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.WriteType6}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType6
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #setWrite(WriteType6)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimensionPermission_Write()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Write'"
	 * @generated
	 */
	WriteType6 getWrite();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType6
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @generated
	 */
	void setWrite(WriteType6 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType6)
	 * @generated
	 */
	void unsetWrite();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getWrite <em>Write</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write</em>' attribute is set.
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType6)
	 * @generated
	 */
	boolean isSetWrite();

	/**
	 * Returns the value of the '<em><b>Attribute Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Permissions</em>' containment reference.
	 * @see #setAttributePermissions(AttributePermissionsType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimensionPermission_AttributePermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AttributePermissions'"
	 * @generated
	 */
	AttributePermissionsType1 getAttributePermissions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getAttributePermissions <em>Attribute Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Permissions</em>' containment reference.
	 * @see #getAttributePermissions()
	 * @generated
	 */
	void setAttributePermissions(AttributePermissionsType1 value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubeDimensionPermission_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubeDimensionPermission#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

} // CubeDimensionPermission
