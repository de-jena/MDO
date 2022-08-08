/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.engine300.DataEmbeddingStyleType;

import org.eclipse.daanse.xmla.model.ecore.xmla.DSVTableBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSV Table Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DSVTableBindingImpl#getDataSourceViewID <em>Data Source View ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DSVTableBindingImpl#getTableID <em>Table ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DSVTableBindingImpl#getDataEmbeddingStyle <em>Data Embedding Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSVTableBindingImpl extends TabularBindingImpl implements DSVTableBinding {
	/**
	 * The default value of the '{@link #getDataSourceViewID() <em>Data Source View ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceViewID()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_SOURCE_VIEW_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSourceViewID() <em>Data Source View ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSourceViewID()
	 * @generated
	 * @ordered
	 */
	protected String dataSourceViewID = DATA_SOURCE_VIEW_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTableID() <em>Table ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableID()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTableID() <em>Table ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableID()
	 * @generated
	 * @ordered
	 */
	protected String tableID = TABLE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataEmbeddingStyle() <em>Data Embedding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEmbeddingStyle()
	 * @generated
	 * @ordered
	 */
	protected static final DataEmbeddingStyleType DATA_EMBEDDING_STYLE_EDEFAULT = DataEmbeddingStyleType.EMBEDDED;

	/**
	 * The cached value of the '{@link #getDataEmbeddingStyle() <em>Data Embedding Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEmbeddingStyle()
	 * @generated
	 * @ordered
	 */
	protected DataEmbeddingStyleType dataEmbeddingStyle = DATA_EMBEDDING_STYLE_EDEFAULT;

	/**
	 * This is true if the Data Embedding Style attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataEmbeddingStyleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSVTableBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DSV_TABLE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataSourceViewID() {
		return dataSourceViewID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSourceViewID(String newDataSourceViewID) {
		String oldDataSourceViewID = dataSourceViewID;
		dataSourceViewID = newDataSourceViewID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DSV_TABLE_BINDING__DATA_SOURCE_VIEW_ID, oldDataSourceViewID, dataSourceViewID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableID() {
		return tableID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableID(String newTableID) {
		String oldTableID = tableID;
		tableID = newTableID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DSV_TABLE_BINDING__TABLE_ID, oldTableID, tableID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEmbeddingStyleType getDataEmbeddingStyle() {
		return dataEmbeddingStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataEmbeddingStyle(DataEmbeddingStyleType newDataEmbeddingStyle) {
		DataEmbeddingStyleType oldDataEmbeddingStyle = dataEmbeddingStyle;
		dataEmbeddingStyle = newDataEmbeddingStyle == null ? DATA_EMBEDDING_STYLE_EDEFAULT : newDataEmbeddingStyle;
		boolean oldDataEmbeddingStyleESet = dataEmbeddingStyleESet;
		dataEmbeddingStyleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DSV_TABLE_BINDING__DATA_EMBEDDING_STYLE, oldDataEmbeddingStyle, dataEmbeddingStyle, !oldDataEmbeddingStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataEmbeddingStyle() {
		DataEmbeddingStyleType oldDataEmbeddingStyle = dataEmbeddingStyle;
		boolean oldDataEmbeddingStyleESet = dataEmbeddingStyleESet;
		dataEmbeddingStyle = DATA_EMBEDDING_STYLE_EDEFAULT;
		dataEmbeddingStyleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DSV_TABLE_BINDING__DATA_EMBEDDING_STYLE, oldDataEmbeddingStyle, DATA_EMBEDDING_STYLE_EDEFAULT, oldDataEmbeddingStyleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataEmbeddingStyle() {
		return dataEmbeddingStyleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.DSV_TABLE_BINDING__DATA_SOURCE_VIEW_ID:
				return getDataSourceViewID();
			case XmlaPackage.DSV_TABLE_BINDING__TABLE_ID:
				return getTableID();
			case XmlaPackage.DSV_TABLE_BINDING__DATA_EMBEDDING_STYLE:
				return getDataEmbeddingStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.DSV_TABLE_BINDING__DATA_SOURCE_VIEW_ID:
				setDataSourceViewID((String)newValue);
				return;
			case XmlaPackage.DSV_TABLE_BINDING__TABLE_ID:
				setTableID((String)newValue);
				return;
			case XmlaPackage.DSV_TABLE_BINDING__DATA_EMBEDDING_STYLE:
				setDataEmbeddingStyle((DataEmbeddingStyleType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmlaPackage.DSV_TABLE_BINDING__DATA_SOURCE_VIEW_ID:
				setDataSourceViewID(DATA_SOURCE_VIEW_ID_EDEFAULT);
				return;
			case XmlaPackage.DSV_TABLE_BINDING__TABLE_ID:
				setTableID(TABLE_ID_EDEFAULT);
				return;
			case XmlaPackage.DSV_TABLE_BINDING__DATA_EMBEDDING_STYLE:
				unsetDataEmbeddingStyle();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmlaPackage.DSV_TABLE_BINDING__DATA_SOURCE_VIEW_ID:
				return DATA_SOURCE_VIEW_ID_EDEFAULT == null ? dataSourceViewID != null : !DATA_SOURCE_VIEW_ID_EDEFAULT.equals(dataSourceViewID);
			case XmlaPackage.DSV_TABLE_BINDING__TABLE_ID:
				return TABLE_ID_EDEFAULT == null ? tableID != null : !TABLE_ID_EDEFAULT.equals(tableID);
			case XmlaPackage.DSV_TABLE_BINDING__DATA_EMBEDDING_STYLE:
				return isSetDataEmbeddingStyle();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dataSourceViewID: ");
		result.append(dataSourceViewID);
		result.append(", tableID: ");
		result.append(tableID);
		result.append(", dataEmbeddingStyle: ");
		if (dataEmbeddingStyleESet) result.append(dataEmbeddingStyle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DSVTableBindingImpl
