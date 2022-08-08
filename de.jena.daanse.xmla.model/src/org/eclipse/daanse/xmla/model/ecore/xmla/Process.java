/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getBindings <em>Bindings</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getDataSource <em>Data Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getDataSourceView <em>Data Source View</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getErrorConfiguration <em>Error Configuration</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getWriteBackTableCreation <em>Write Back Table Creation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProcess()
 * @model extendedMetaData="name='Process' kind='elementOnly'"
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType7}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType7
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType7)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProcess_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeType7 getType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType7
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType7 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType7)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType7)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectReference)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProcess_Object()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Object'"
	 * @generated
	 */
	ObjectReference getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectReference value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference.
	 * @see #setBindings(Bindings)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProcess_Bindings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bindings'"
	 * @generated
	 */
	Bindings getBindings();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getBindings <em>Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindings</em>' containment reference.
	 * @see #getBindings()
	 * @generated
	 */
	void setBindings(Bindings value);

	/**
	 * Returns the value of the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source</em>' containment reference.
	 * @see #setDataSource(DataSource)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProcess_DataSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSource'"
	 * @generated
	 */
	DataSource getDataSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getDataSource <em>Data Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source</em>' containment reference.
	 * @see #getDataSource()
	 * @generated
	 */
	void setDataSource(DataSource value);

	/**
	 * Returns the value of the '<em><b>Data Source View</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source View</em>' containment reference.
	 * @see #setDataSourceView(DataSourceView)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProcess_DataSourceView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSourceView'"
	 * @generated
	 */
	DataSourceView getDataSourceView();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getDataSourceView <em>Data Source View</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source View</em>' containment reference.
	 * @see #getDataSourceView()
	 * @generated
	 */
	void setDataSourceView(DataSourceView value);

	/**
	 * Returns the value of the '<em><b>Error Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Configuration</em>' containment reference.
	 * @see #setErrorConfiguration(ErrorConfiguration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProcess_ErrorConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ErrorConfiguration'"
	 * @generated
	 */
	ErrorConfiguration getErrorConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getErrorConfiguration <em>Error Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Configuration</em>' containment reference.
	 * @see #getErrorConfiguration()
	 * @generated
	 */
	void setErrorConfiguration(ErrorConfiguration value);

	/**
	 * Returns the value of the '<em><b>Write Back Table Creation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.WriteBackTableCreation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Back Table Creation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteBackTableCreation
	 * @see #isSetWriteBackTableCreation()
	 * @see #unsetWriteBackTableCreation()
	 * @see #setWriteBackTableCreation(WriteBackTableCreation)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProcess_WriteBackTableCreation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='WriteBackTableCreation'"
	 * @generated
	 */
	WriteBackTableCreation getWriteBackTableCreation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getWriteBackTableCreation <em>Write Back Table Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Back Table Creation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.WriteBackTableCreation
	 * @see #isSetWriteBackTableCreation()
	 * @see #unsetWriteBackTableCreation()
	 * @see #getWriteBackTableCreation()
	 * @generated
	 */
	void setWriteBackTableCreation(WriteBackTableCreation value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getWriteBackTableCreation <em>Write Back Table Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWriteBackTableCreation()
	 * @see #getWriteBackTableCreation()
	 * @see #setWriteBackTableCreation(WriteBackTableCreation)
	 * @generated
	 */
	void unsetWriteBackTableCreation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Process#getWriteBackTableCreation <em>Write Back Table Creation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Write Back Table Creation</em>' attribute is set.
	 * @see #unsetWriteBackTableCreation()
	 * @see #getWriteBackTableCreation()
	 * @see #setWriteBackTableCreation(WriteBackTableCreation)
	 * @generated
	 */
	boolean isSetWriteBackTableCreation();

} // Process
