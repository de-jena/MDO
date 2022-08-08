/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.ColumnsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.MeasureGroupBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.TableMiningStructureColumn;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType13;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Mining Structure Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TableMiningStructureColumnImpl#getForeignKeyColumns <em>Foreign Key Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TableMiningStructureColumnImpl#getSourceMeasureGroup <em>Source Measure Group</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TableMiningStructureColumnImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TableMiningStructureColumnImpl#getTranslations <em>Translations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableMiningStructureColumnImpl extends MinimalEObjectImpl.Container implements TableMiningStructureColumn {
	/**
	 * The cached value of the '{@link #getForeignKeyColumns() <em>Foreign Key Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyColumns()
	 * @generated
	 * @ordered
	 */
	protected ForeignKeyColumnsType foreignKeyColumns;

	/**
	 * The cached value of the '{@link #getSourceMeasureGroup() <em>Source Measure Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMeasureGroup()
	 * @generated
	 * @ordered
	 */
	protected MeasureGroupBinding sourceMeasureGroup;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected ColumnsType1 columns;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType13 translations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableMiningStructureColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.TABLE_MINING_STRUCTURE_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyColumnsType getForeignKeyColumns() {
		return foreignKeyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeignKeyColumns(ForeignKeyColumnsType newForeignKeyColumns, NotificationChain msgs) {
		ForeignKeyColumnsType oldForeignKeyColumns = foreignKeyColumns;
		foreignKeyColumns = newForeignKeyColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__FOREIGN_KEY_COLUMNS, oldForeignKeyColumns, newForeignKeyColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeyColumns(ForeignKeyColumnsType newForeignKeyColumns) {
		if (newForeignKeyColumns != foreignKeyColumns) {
			NotificationChain msgs = null;
			if (foreignKeyColumns != null)
				msgs = ((InternalEObject)foreignKeyColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__FOREIGN_KEY_COLUMNS, null, msgs);
			if (newForeignKeyColumns != null)
				msgs = ((InternalEObject)newForeignKeyColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__FOREIGN_KEY_COLUMNS, null, msgs);
			msgs = basicSetForeignKeyColumns(newForeignKeyColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__FOREIGN_KEY_COLUMNS, newForeignKeyColumns, newForeignKeyColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureGroupBinding getSourceMeasureGroup() {
		return sourceMeasureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceMeasureGroup(MeasureGroupBinding newSourceMeasureGroup, NotificationChain msgs) {
		MeasureGroupBinding oldSourceMeasureGroup = sourceMeasureGroup;
		sourceMeasureGroup = newSourceMeasureGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__SOURCE_MEASURE_GROUP, oldSourceMeasureGroup, newSourceMeasureGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMeasureGroup(MeasureGroupBinding newSourceMeasureGroup) {
		if (newSourceMeasureGroup != sourceMeasureGroup) {
			NotificationChain msgs = null;
			if (sourceMeasureGroup != null)
				msgs = ((InternalEObject)sourceMeasureGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__SOURCE_MEASURE_GROUP, null, msgs);
			if (newSourceMeasureGroup != null)
				msgs = ((InternalEObject)newSourceMeasureGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__SOURCE_MEASURE_GROUP, null, msgs);
			msgs = basicSetSourceMeasureGroup(newSourceMeasureGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__SOURCE_MEASURE_GROUP, newSourceMeasureGroup, newSourceMeasureGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnsType1 getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumns(ColumnsType1 newColumns, NotificationChain msgs) {
		ColumnsType1 oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__COLUMNS, oldColumns, newColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(ColumnsType1 newColumns) {
		if (newColumns != columns) {
			NotificationChain msgs = null;
			if (columns != null)
				msgs = ((InternalEObject)columns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__COLUMNS, null, msgs);
			if (newColumns != null)
				msgs = ((InternalEObject)newColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__COLUMNS, null, msgs);
			msgs = basicSetColumns(newColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__COLUMNS, newColumns, newColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType13 getTranslations() {
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslations(TranslationsType13 newTranslations, NotificationChain msgs) {
		TranslationsType13 oldTranslations = translations;
		translations = newTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__TRANSLATIONS, oldTranslations, newTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslations(TranslationsType13 newTranslations) {
		if (newTranslations != translations) {
			NotificationChain msgs = null;
			if (translations != null)
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__FOREIGN_KEY_COLUMNS:
				return basicSetForeignKeyColumns(null, msgs);
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__SOURCE_MEASURE_GROUP:
				return basicSetSourceMeasureGroup(null, msgs);
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__COLUMNS:
				return basicSetColumns(null, msgs);
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__TRANSLATIONS:
				return basicSetTranslations(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__FOREIGN_KEY_COLUMNS:
				return getForeignKeyColumns();
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__SOURCE_MEASURE_GROUP:
				return getSourceMeasureGroup();
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__COLUMNS:
				return getColumns();
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__TRANSLATIONS:
				return getTranslations();
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
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__FOREIGN_KEY_COLUMNS:
				setForeignKeyColumns((ForeignKeyColumnsType)newValue);
				return;
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__SOURCE_MEASURE_GROUP:
				setSourceMeasureGroup((MeasureGroupBinding)newValue);
				return;
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__COLUMNS:
				setColumns((ColumnsType1)newValue);
				return;
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__TRANSLATIONS:
				setTranslations((TranslationsType13)newValue);
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
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__FOREIGN_KEY_COLUMNS:
				setForeignKeyColumns((ForeignKeyColumnsType)null);
				return;
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__SOURCE_MEASURE_GROUP:
				setSourceMeasureGroup((MeasureGroupBinding)null);
				return;
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__COLUMNS:
				setColumns((ColumnsType1)null);
				return;
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__TRANSLATIONS:
				setTranslations((TranslationsType13)null);
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
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__FOREIGN_KEY_COLUMNS:
				return foreignKeyColumns != null;
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__SOURCE_MEASURE_GROUP:
				return sourceMeasureGroup != null;
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__COLUMNS:
				return columns != null;
			case XmlaPackage.TABLE_MINING_STRUCTURE_COLUMN__TRANSLATIONS:
				return translations != null;
		}
		return super.eIsSet(featureID);
	}

} //TableMiningStructureColumnImpl
