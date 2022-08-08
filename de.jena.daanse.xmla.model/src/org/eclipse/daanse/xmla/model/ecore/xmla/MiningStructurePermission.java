/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Structure Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission#isAllowDrillThrough <em>Allow Drill Through</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission#getWrite <em>Write</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructurePermission()
 * @model extendedMetaData="name='MiningStructurePermission' kind='elementOnly'"
 * @generated
 */
public interface MiningStructurePermission extends Permission {
	/**
	 * Returns the value of the '<em><b>Allow Drill Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Drill Through</em>' attribute.
	 * @see #isSetAllowDrillThrough()
	 * @see #unsetAllowDrillThrough()
	 * @see #setAllowDrillThrough(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructurePermission_AllowDrillThrough()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AllowDrillThrough'"
	 * @generated
	 */
	boolean isAllowDrillThrough();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission#isAllowDrillThrough <em>Allow Drill Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Drill Through</em>' attribute.
	 * @see #isSetAllowDrillThrough()
	 * @see #unsetAllowDrillThrough()
	 * @see #isAllowDrillThrough()
	 * @generated
	 */
	void setAllowDrillThrough(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission#isAllowDrillThrough <em>Allow Drill Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowDrillThrough()
	 * @see #isAllowDrillThrough()
	 * @see #setAllowDrillThrough(boolean)
	 * @generated
	 */
	void unsetAllowDrillThrough();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission#isAllowDrillThrough <em>Allow Drill Through</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Drill Through</em>' attribute is set.
	 * @see #unsetAllowDrillThrough()
	 * @see #isAllowDrillThrough()
	 * @see #setAllowDrillThrough(boolean)
	 * @generated
	 */
	boolean isSetAllowDrillThrough();

	/**
	 * Returns the value of the '<em><b>Write</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.WriteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #setWrite(WriteType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningStructurePermission_Write()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Write'"
	 * @generated
	 */
	WriteType getWrite();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @generated
	 */
	void setWrite(WriteType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType)
	 * @generated
	 */
	void unsetWrite();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningStructurePermission#getWrite <em>Write</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write</em>' attribute is set.
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType)
	 * @generated
	 */
	boolean isSetWrite();

} // MiningStructurePermission
