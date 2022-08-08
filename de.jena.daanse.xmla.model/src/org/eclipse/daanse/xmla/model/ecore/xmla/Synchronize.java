/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronize</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#getSynchronizeSecurity <em>Synchronize Security</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#isApplyCompression <em>Apply Compression</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#getDbStorageLocation <em>Db Storage Location</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getSynchronize()
 * @model extendedMetaData="name='Synchronize' kind='elementOnly'"
 * @generated
 */
public interface Synchronize extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Source)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getSynchronize_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Synchronize Security</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.SynchronizeSecurityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronize Security</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SynchronizeSecurityType
	 * @see #isSetSynchronizeSecurity()
	 * @see #unsetSynchronizeSecurity()
	 * @see #setSynchronizeSecurity(SynchronizeSecurityType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getSynchronize_SynchronizeSecurity()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='SynchronizeSecurity'"
	 * @generated
	 */
	SynchronizeSecurityType getSynchronizeSecurity();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#getSynchronizeSecurity <em>Synchronize Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronize Security</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.SynchronizeSecurityType
	 * @see #isSetSynchronizeSecurity()
	 * @see #unsetSynchronizeSecurity()
	 * @see #getSynchronizeSecurity()
	 * @generated
	 */
	void setSynchronizeSecurity(SynchronizeSecurityType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#getSynchronizeSecurity <em>Synchronize Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSynchronizeSecurity()
	 * @see #getSynchronizeSecurity()
	 * @see #setSynchronizeSecurity(SynchronizeSecurityType)
	 * @generated
	 */
	void unsetSynchronizeSecurity();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#getSynchronizeSecurity <em>Synchronize Security</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Synchronize Security</em>' attribute is set.
	 * @see #unsetSynchronizeSecurity()
	 * @see #getSynchronizeSecurity()
	 * @see #setSynchronizeSecurity(SynchronizeSecurityType)
	 * @generated
	 */
	boolean isSetSynchronizeSecurity();

	/**
	 * Returns the value of the '<em><b>Apply Compression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apply Compression</em>' attribute.
	 * @see #isSetApplyCompression()
	 * @see #unsetApplyCompression()
	 * @see #setApplyCompression(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getSynchronize_ApplyCompression()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ApplyCompression'"
	 * @generated
	 */
	boolean isApplyCompression();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#isApplyCompression <em>Apply Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apply Compression</em>' attribute.
	 * @see #isSetApplyCompression()
	 * @see #unsetApplyCompression()
	 * @see #isApplyCompression()
	 * @generated
	 */
	void setApplyCompression(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#isApplyCompression <em>Apply Compression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetApplyCompression()
	 * @see #isApplyCompression()
	 * @see #setApplyCompression(boolean)
	 * @generated
	 */
	void unsetApplyCompression();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#isApplyCompression <em>Apply Compression</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Apply Compression</em>' attribute is set.
	 * @see #unsetApplyCompression()
	 * @see #isApplyCompression()
	 * @see #setApplyCompression(boolean)
	 * @generated
	 */
	boolean isSetApplyCompression();

	/**
	 * Returns the value of the '<em><b>Db Storage Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db Storage Location</em>' attribute.
	 * @see #setDbStorageLocation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getSynchronize_DbStorageLocation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DbStorageLocation' namespace='http://schemas.microsoft.com/analysisservices/2008/engine/100/100'"
	 * @generated
	 */
	String getDbStorageLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#getDbStorageLocation <em>Db Storage Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db Storage Location</em>' attribute.
	 * @see #getDbStorageLocation()
	 * @generated
	 */
	void setDbStorageLocation(String value);

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference.
	 * @see #setLocations(LocationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getSynchronize_Locations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Locations'"
	 * @generated
	 */
	LocationsType getLocations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Synchronize#getLocations <em>Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locations</em>' containment reference.
	 * @see #getLocations()
	 * @generated
	 */
	void setLocations(LocationsType value);

} // Synchronize
