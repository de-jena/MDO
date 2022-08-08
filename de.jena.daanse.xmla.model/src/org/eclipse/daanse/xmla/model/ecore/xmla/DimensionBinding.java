/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import javax.xml.datatype.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getDataSourceID <em>Data Source ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getDimensionID <em>Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getRefreshPolicy <em>Refresh Policy</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getRefreshInterval <em>Refresh Interval</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionBinding()
 * @model extendedMetaData="name='DimensionBinding' kind='elementOnly'"
 * @generated
 */
public interface DimensionBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Data Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source ID</em>' attribute.
	 * @see #setDataSourceID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionBinding_DataSourceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DataSourceID'"
	 * @generated
	 */
	String getDataSourceID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getDataSourceID <em>Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source ID</em>' attribute.
	 * @see #getDataSourceID()
	 * @generated
	 */
	void setDataSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension ID</em>' attribute.
	 * @see #setDimensionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionBinding_DimensionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DimensionID'"
	 * @generated
	 */
	String getDimensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getDimensionID <em>Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension ID</em>' attribute.
	 * @see #getDimensionID()
	 * @generated
	 */
	void setDimensionID(String value);

	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.PersistenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PersistenceType
	 * @see #isSetPersistence()
	 * @see #unsetPersistence()
	 * @see #setPersistence(PersistenceType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionBinding_Persistence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Persistence'"
	 * @generated
	 */
	PersistenceType getPersistence();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getPersistence <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PersistenceType
	 * @see #isSetPersistence()
	 * @see #unsetPersistence()
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(PersistenceType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getPersistence <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersistence()
	 * @see #getPersistence()
	 * @see #setPersistence(PersistenceType)
	 * @generated
	 */
	void unsetPersistence();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getPersistence <em>Persistence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Persistence</em>' attribute is set.
	 * @see #unsetPersistence()
	 * @see #getPersistence()
	 * @see #setPersistence(PersistenceType)
	 * @generated
	 */
	boolean isSetPersistence();

	/**
	 * Returns the value of the '<em><b>Refresh Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.RefreshPolicyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Policy</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RefreshPolicyType
	 * @see #isSetRefreshPolicy()
	 * @see #unsetRefreshPolicy()
	 * @see #setRefreshPolicy(RefreshPolicyType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionBinding_RefreshPolicy()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RefreshPolicy'"
	 * @generated
	 */
	RefreshPolicyType getRefreshPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getRefreshPolicy <em>Refresh Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Policy</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RefreshPolicyType
	 * @see #isSetRefreshPolicy()
	 * @see #unsetRefreshPolicy()
	 * @see #getRefreshPolicy()
	 * @generated
	 */
	void setRefreshPolicy(RefreshPolicyType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getRefreshPolicy <em>Refresh Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefreshPolicy()
	 * @see #getRefreshPolicy()
	 * @see #setRefreshPolicy(RefreshPolicyType)
	 * @generated
	 */
	void unsetRefreshPolicy();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getRefreshPolicy <em>Refresh Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refresh Policy</em>' attribute is set.
	 * @see #unsetRefreshPolicy()
	 * @see #getRefreshPolicy()
	 * @see #setRefreshPolicy(RefreshPolicyType)
	 * @generated
	 */
	boolean isSetRefreshPolicy();

	/**
	 * Returns the value of the '<em><b>Refresh Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Interval</em>' attribute.
	 * @see #setRefreshInterval(Duration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDimensionBinding_RefreshInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RefreshInterval'"
	 * @generated
	 */
	Duration getRefreshInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DimensionBinding#getRefreshInterval <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Interval</em>' attribute.
	 * @see #getRefreshInterval()
	 * @generated
	 */
	void setRefreshInterval(Duration value);

} // DimensionBinding
