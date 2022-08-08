/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cube Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission#getReadSourceData <em>Read Source Data</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission#getDimensionPermissions <em>Dimension Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission#getCellPermissions <em>Cell Permissions</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission#getWrite <em>Write</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubePermission()
 * @model extendedMetaData="name='CubePermission' kind='elementOnly'"
 * @generated
 */
public interface CubePermission extends Permission {
	/**
	 * Returns the value of the '<em><b>Read Source Data</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ReadSourceDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Source Data</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReadSourceDataType
	 * @see #isSetReadSourceData()
	 * @see #unsetReadSourceData()
	 * @see #setReadSourceData(ReadSourceDataType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubePermission_ReadSourceData()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ReadSourceData'"
	 * @generated
	 */
	ReadSourceDataType getReadSourceData();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission#getReadSourceData <em>Read Source Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Source Data</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReadSourceDataType
	 * @see #isSetReadSourceData()
	 * @see #unsetReadSourceData()
	 * @see #getReadSourceData()
	 * @generated
	 */
	void setReadSourceData(ReadSourceDataType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission#getReadSourceData <em>Read Source Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReadSourceData()
	 * @see #getReadSourceData()
	 * @see #setReadSourceData(ReadSourceDataType)
	 * @generated
	 */
	void unsetReadSourceData();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission#getReadSourceData <em>Read Source Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Read Source Data</em>' attribute is set.
	 * @see #unsetReadSourceData()
	 * @see #getReadSourceData()
	 * @see #setReadSourceData(ReadSourceDataType)
	 * @generated
	 */
	boolean isSetReadSourceData();

	/**
	 * Returns the value of the '<em><b>Dimension Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Permissions</em>' containment reference.
	 * @see #setDimensionPermissions(DimensionPermissionsType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubePermission_DimensionPermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DimensionPermissions'"
	 * @generated
	 */
	DimensionPermissionsType1 getDimensionPermissions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission#getDimensionPermissions <em>Dimension Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension Permissions</em>' containment reference.
	 * @see #getDimensionPermissions()
	 * @generated
	 */
	void setDimensionPermissions(DimensionPermissionsType1 value);

	/**
	 * Returns the value of the '<em><b>Cell Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Permissions</em>' containment reference.
	 * @see #setCellPermissions(CellPermissionsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubePermission_CellPermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CellPermissions'"
	 * @generated
	 */
	CellPermissionsType getCellPermissions();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission#getCellPermissions <em>Cell Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Permissions</em>' containment reference.
	 * @see #getCellPermissions()
	 * @generated
	 */
	void setCellPermissions(CellPermissionsType value);

	/**
	 * Returns the value of the '<em><b>Write</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.WriteType3}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType3
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #setWrite(WriteType3)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCubePermission_Write()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Write'"
	 * @generated
	 */
	WriteType3 getWrite();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType3
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @generated
	 */
	void setWrite(WriteType3 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType3)
	 * @generated
	 */
	void unsetWrite();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CubePermission#getWrite <em>Write</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write</em>' attribute is set.
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType3)
	 * @generated
	 */
	boolean isSetWrite();

} // CubePermission
