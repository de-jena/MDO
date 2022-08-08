/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import javax.xml.datatype.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Group Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getDataSourceID <em>Data Source ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getCubeID <em>Cube ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getMeasureGroupID <em>Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getPersistence <em>Persistence</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getRefreshPolicy <em>Refresh Policy</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getRefreshInterval <em>Refresh Interval</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroupBinding()
 * @model extendedMetaData="name='MeasureGroupBinding' kind='elementOnly'"
 * @generated
 */
public interface MeasureGroupBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Data Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source ID</em>' attribute.
	 * @see #setDataSourceID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroupBinding_DataSourceID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='DataSourceID'"
	 * @generated
	 */
	String getDataSourceID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getDataSourceID <em>Data Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source ID</em>' attribute.
	 * @see #getDataSourceID()
	 * @generated
	 */
	void setDataSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Cube ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube ID</em>' attribute.
	 * @see #setCubeID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroupBinding_CubeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='CubeID'"
	 * @generated
	 */
	String getCubeID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getCubeID <em>Cube ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube ID</em>' attribute.
	 * @see #getCubeID()
	 * @generated
	 */
	void setCubeID(String value);

	/**
	 * Returns the value of the '<em><b>Measure Group ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Group ID</em>' attribute.
	 * @see #setMeasureGroupID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroupBinding_MeasureGroupID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='MeasureGroupID'"
	 * @generated
	 */
	String getMeasureGroupID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getMeasureGroupID <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure Group ID</em>' attribute.
	 * @see #getMeasureGroupID()
	 * @generated
	 */
	void setMeasureGroupID(String value);

	/**
	 * Returns the value of the '<em><b>Persistence</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.PersistenceType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PersistenceType1
	 * @see #isSetPersistence()
	 * @see #unsetPersistence()
	 * @see #setPersistence(PersistenceType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroupBinding_Persistence()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Persistence'"
	 * @generated
	 */
	PersistenceType1 getPersistence();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getPersistence <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistence</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PersistenceType1
	 * @see #isSetPersistence()
	 * @see #unsetPersistence()
	 * @see #getPersistence()
	 * @generated
	 */
	void setPersistence(PersistenceType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getPersistence <em>Persistence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPersistence()
	 * @see #getPersistence()
	 * @see #setPersistence(PersistenceType1)
	 * @generated
	 */
	void unsetPersistence();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getPersistence <em>Persistence</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Persistence</em>' attribute is set.
	 * @see #unsetPersistence()
	 * @see #getPersistence()
	 * @see #setPersistence(PersistenceType1)
	 * @generated
	 */
	boolean isSetPersistence();

	/**
	 * Returns the value of the '<em><b>Refresh Policy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.RefreshPolicyType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Policy</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RefreshPolicyType1
	 * @see #isSetRefreshPolicy()
	 * @see #unsetRefreshPolicy()
	 * @see #setRefreshPolicy(RefreshPolicyType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroupBinding_RefreshPolicy()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='RefreshPolicy'"
	 * @generated
	 */
	RefreshPolicyType1 getRefreshPolicy();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getRefreshPolicy <em>Refresh Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Policy</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RefreshPolicyType1
	 * @see #isSetRefreshPolicy()
	 * @see #unsetRefreshPolicy()
	 * @see #getRefreshPolicy()
	 * @generated
	 */
	void setRefreshPolicy(RefreshPolicyType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getRefreshPolicy <em>Refresh Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRefreshPolicy()
	 * @see #getRefreshPolicy()
	 * @see #setRefreshPolicy(RefreshPolicyType1)
	 * @generated
	 */
	void unsetRefreshPolicy();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getRefreshPolicy <em>Refresh Policy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Refresh Policy</em>' attribute is set.
	 * @see #unsetRefreshPolicy()
	 * @see #getRefreshPolicy()
	 * @see #setRefreshPolicy(RefreshPolicyType1)
	 * @generated
	 */
	boolean isSetRefreshPolicy();

	/**
	 * Returns the value of the '<em><b>Refresh Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refresh Interval</em>' attribute.
	 * @see #setRefreshInterval(Duration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroupBinding_RefreshInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='RefreshInterval'"
	 * @generated
	 */
	Duration getRefreshInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getRefreshInterval <em>Refresh Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refresh Interval</em>' attribute.
	 * @see #getRefreshInterval()
	 * @generated
	 */
	void setRefreshInterval(Duration value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' attribute.
	 * @see #setFilter(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMeasureGroupBinding_Filter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Filter'"
	 * @generated
	 */
	String getFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding#getFilter <em>Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' attribute.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(String value);

} // MeasureGroupBinding
