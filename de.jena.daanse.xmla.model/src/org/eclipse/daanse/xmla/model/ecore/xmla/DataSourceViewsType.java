/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source Views Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceViewsType#getDataSourceView <em>Data Source View</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSourceViewsType()
 * @model extendedMetaData="name='DataSourceViews_._type' kind='elementOnly'"
 * @generated
 */
public interface DataSourceViewsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Source View</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.DataSourceView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Source View</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataSourceViewsType_DataSourceView()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataSourceView'"
	 * @generated
	 */
	EList<DataSourceView> getDataSourceView();

} // DataSourceViewsType
