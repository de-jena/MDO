/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Model Permission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission#isAllowDrillThrough <em>Allow Drill Through</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission#isAllowBrowsing <em>Allow Browsing</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission#getWrite <em>Write</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModelPermission()
 * @model extendedMetaData="name='MiningModelPermission' kind='elementOnly'"
 * @generated
 */
public interface MiningModelPermission extends Permission {
	/**
	 * Returns the value of the '<em><b>Allow Drill Through</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Drill Through</em>' attribute.
	 * @see #isSetAllowDrillThrough()
	 * @see #unsetAllowDrillThrough()
	 * @see #setAllowDrillThrough(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModelPermission_AllowDrillThrough()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AllowDrillThrough'"
	 * @generated
	 */
	boolean isAllowDrillThrough();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission#isAllowDrillThrough <em>Allow Drill Through</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission#isAllowDrillThrough <em>Allow Drill Through</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowDrillThrough()
	 * @see #isAllowDrillThrough()
	 * @see #setAllowDrillThrough(boolean)
	 * @generated
	 */
	void unsetAllowDrillThrough();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission#isAllowDrillThrough <em>Allow Drill Through</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Allow Browsing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Browsing</em>' attribute.
	 * @see #isSetAllowBrowsing()
	 * @see #unsetAllowBrowsing()
	 * @see #setAllowBrowsing(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModelPermission_AllowBrowsing()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AllowBrowsing'"
	 * @generated
	 */
	boolean isAllowBrowsing();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission#isAllowBrowsing <em>Allow Browsing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Browsing</em>' attribute.
	 * @see #isSetAllowBrowsing()
	 * @see #unsetAllowBrowsing()
	 * @see #isAllowBrowsing()
	 * @generated
	 */
	void setAllowBrowsing(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission#isAllowBrowsing <em>Allow Browsing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowBrowsing()
	 * @see #isAllowBrowsing()
	 * @see #setAllowBrowsing(boolean)
	 * @generated
	 */
	void unsetAllowBrowsing();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission#isAllowBrowsing <em>Allow Browsing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Browsing</em>' attribute is set.
	 * @see #unsetAllowBrowsing()
	 * @see #isAllowBrowsing()
	 * @see #setAllowBrowsing(boolean)
	 * @generated
	 */
	boolean isSetAllowBrowsing();

	/**
	 * Returns the value of the '<em><b>Write</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.WriteType2}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType2
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #setWrite(WriteType2)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModelPermission_Write()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Write'"
	 * @generated
	 */
	WriteType2 getWrite();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteType2
	 * @see #isSetWrite()
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @generated
	 */
	void setWrite(WriteType2 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission#getWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType2)
	 * @generated
	 */
	void unsetWrite();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelPermission#getWrite <em>Write</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write</em>' attribute is set.
	 * @see #unsetWrite()
	 * @see #getWrite()
	 * @see #setWrite(WriteType2)
	 * @generated
	 */
	boolean isSetWrite();

} // MiningModelPermission
