/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSV Table Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding#getDataSourceViewID <em>Data Source View ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding#getTableID <em>Table ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding#getDataEmbeddingStyle <em>Data Embedding Style</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDSVTableBinding()
 * @model extendedMetaData="name='DSVTableBinding' kind='elementOnly'"
 * @generated
 */
public interface DSVTableBinding extends TabularBinding {
	/**
	 * Returns the value of the '<em><b>Data Source View ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source View ID</em>' attribute.
	 * @see #setDataSourceViewID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDSVTableBinding_DataSourceViewID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DataSourceViewID'"
	 * @generated
	 */
	String getDataSourceViewID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding#getDataSourceViewID <em>Data Source View ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Source View ID</em>' attribute.
	 * @see #getDataSourceViewID()
	 * @generated
	 */
	void setDataSourceViewID(String value);

	/**
	 * Returns the value of the '<em><b>Table ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table ID</em>' attribute.
	 * @see #setTableID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDSVTableBinding_TableID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='TableID'"
	 * @generated
	 */
	String getTableID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding#getTableID <em>Table ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table ID</em>' attribute.
	 * @see #getTableID()
	 * @generated
	 */
	void setTableID(String value);

	/**
	 * Returns the value of the '<em><b>Data Embedding Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Embedding Style</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType
	 * @see #isSetDataEmbeddingStyle()
	 * @see #unsetDataEmbeddingStyle()
	 * @see #setDataEmbeddingStyle(DataEmbeddingStyleType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDSVTableBinding_DataEmbeddingStyle()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DataEmbeddingStyle' namespace='http://schemas.microsoft.com/analysisservices/2011/engine/300'"
	 * @generated
	 */
	DataEmbeddingStyleType getDataEmbeddingStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding#getDataEmbeddingStyle <em>Data Embedding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Embedding Style</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType
	 * @see #isSetDataEmbeddingStyle()
	 * @see #unsetDataEmbeddingStyle()
	 * @see #getDataEmbeddingStyle()
	 * @generated
	 */
	void setDataEmbeddingStyle(DataEmbeddingStyleType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding#getDataEmbeddingStyle <em>Data Embedding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataEmbeddingStyle()
	 * @see #getDataEmbeddingStyle()
	 * @see #setDataEmbeddingStyle(DataEmbeddingStyleType)
	 * @generated
	 */
	void unsetDataEmbeddingStyle();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding#getDataEmbeddingStyle <em>Data Embedding Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Embedding Style</em>' attribute is set.
	 * @see #unsetDataEmbeddingStyle()
	 * @see #getDataEmbeddingStyle()
	 * @see #setDataEmbeddingStyle(DataEmbeddingStyleType)
	 * @generated
	 */
	boolean isSetDataEmbeddingStyle();

} // DSVTableBinding
