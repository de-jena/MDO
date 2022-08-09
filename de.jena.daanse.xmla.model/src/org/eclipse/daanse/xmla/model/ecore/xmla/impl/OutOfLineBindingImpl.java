/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import org.eclipse.daanse.xmla.model.ecore.xmla.Binding;
import org.eclipse.daanse.xmla.model.ecore.xmla.CustomRollupColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.CustomRollupPropertiesColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ForeignKeyColumnsType1;
import org.eclipse.daanse.xmla.model.ecore.xmla.KeyColumnsType2;
import org.eclipse.daanse.xmla.model.ecore.xmla.NameColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.OutOfLineBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.SkippedLevelsColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TranslationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.UnaryOperatorColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ValueColumnType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Of Line Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getDatabaseID <em>Database ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getDimensionID <em>Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getCubeID <em>Cube ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getMeasureGroupID <em>Measure Group ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getPartitionID <em>Partition ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getMiningModelID <em>Mining Model ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getMiningStructureID <em>Mining Structure ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getAttributeID <em>Attribute ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getCubeDimensionID <em>Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getMeasureID <em>Measure ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getParentColumnID <em>Parent Column ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getColumnID <em>Column ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getNameColumn <em>Name Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getSkippedLevelsColumn <em>Skipped Levels Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getCustomRollupColumn <em>Custom Rollup Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getCustomRollupPropertiesColumn <em>Custom Rollup Properties Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getValueColumn <em>Value Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getUnaryOperatorColumn <em>Unary Operator Column</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getKeyColumns <em>Key Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getForeignKeyColumns <em>Foreign Key Columns</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.OutOfLineBindingImpl#getTranslations <em>Translations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutOfLineBindingImpl extends MinimalEObjectImpl.Container implements OutOfLineBinding {
	/**
	 * The default value of the '{@link #getDatabaseID() <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseID()
	 * @generated
	 * @ordered
	 */
	protected static final String DATABASE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatabaseID() <em>Database ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseID()
	 * @generated
	 * @ordered
	 */
	protected String databaseID = DATABASE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDimensionID() <em>Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String DIMENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDimensionID() <em>Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionID()
	 * @generated
	 * @ordered
	 */
	protected String dimensionID = DIMENSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCubeID() <em>Cube ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUBE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCubeID() <em>Cube ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeID()
	 * @generated
	 * @ordered
	 */
	protected String cubeID = CUBE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasureGroupID() <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroupID()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURE_GROUP_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasureGroupID() <em>Measure Group ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureGroupID()
	 * @generated
	 * @ordered
	 */
	protected String measureGroupID = MEASURE_GROUP_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionID() <em>Partition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionID()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTITION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPartitionID() <em>Partition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionID()
	 * @generated
	 * @ordered
	 */
	protected String partitionID = PARTITION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiningModelID() <em>Mining Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModelID()
	 * @generated
	 * @ordered
	 */
	protected static final String MINING_MODEL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiningModelID() <em>Mining Model ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningModelID()
	 * @generated
	 * @ordered
	 */
	protected String miningModelID = MINING_MODEL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMiningStructureID() <em>Mining Structure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningStructureID()
	 * @generated
	 * @ordered
	 */
	protected static final String MINING_STRUCTURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMiningStructureID() <em>Mining Structure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiningStructureID()
	 * @generated
	 * @ordered
	 */
	protected String miningStructureID = MINING_STRUCTURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttributeID() <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeID()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttributeID() <em>Attribute ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeID()
	 * @generated
	 * @ordered
	 */
	protected String attributeID = ATTRIBUTE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCubeDimensionID() <em>Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeDimensionID()
	 * @generated
	 * @ordered
	 */
	protected static final String CUBE_DIMENSION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCubeDimensionID() <em>Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCubeDimensionID()
	 * @generated
	 * @ordered
	 */
	protected String cubeDimensionID = CUBE_DIMENSION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeasureID() <em>Measure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureID()
	 * @generated
	 * @ordered
	 */
	protected static final String MEASURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeasureID() <em>Measure ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureID()
	 * @generated
	 * @ordered
	 */
	protected String measureID = MEASURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentColumnID() <em>Parent Column ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentColumnID()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_COLUMN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentColumnID() <em>Parent Column ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentColumnID()
	 * @generated
	 * @ordered
	 */
	protected String parentColumnID = PARENT_COLUMN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnID() <em>Column ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnID()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnID() <em>Column ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnID()
	 * @generated
	 * @ordered
	 */
	protected String columnID = COLUMN_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Binding source;

	/**
	 * The cached value of the '{@link #getNameColumn() <em>Name Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameColumn()
	 * @generated
	 * @ordered
	 */
	protected NameColumnType nameColumn;

	/**
	 * The cached value of the '{@link #getSkippedLevelsColumn() <em>Skipped Levels Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkippedLevelsColumn()
	 * @generated
	 * @ordered
	 */
	protected SkippedLevelsColumnType skippedLevelsColumn;

	/**
	 * The cached value of the '{@link #getCustomRollupColumn() <em>Custom Rollup Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomRollupColumn()
	 * @generated
	 * @ordered
	 */
	protected CustomRollupColumnType customRollupColumn;

	/**
	 * The cached value of the '{@link #getCustomRollupPropertiesColumn() <em>Custom Rollup Properties Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomRollupPropertiesColumn()
	 * @generated
	 * @ordered
	 */
	protected CustomRollupPropertiesColumnType customRollupPropertiesColumn;

	/**
	 * The cached value of the '{@link #getValueColumn() <em>Value Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueColumn()
	 * @generated
	 * @ordered
	 */
	protected ValueColumnType valueColumn;

	/**
	 * The cached value of the '{@link #getUnaryOperatorColumn() <em>Unary Operator Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryOperatorColumn()
	 * @generated
	 * @ordered
	 */
	protected UnaryOperatorColumnType unaryOperatorColumn;

	/**
	 * The cached value of the '{@link #getKeyColumns() <em>Key Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyColumns()
	 * @generated
	 * @ordered
	 */
	protected KeyColumnsType2 keyColumns;

	/**
	 * The cached value of the '{@link #getForeignKeyColumns() <em>Foreign Key Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeyColumns()
	 * @generated
	 * @ordered
	 */
	protected ForeignKeyColumnsType1 foreignKeyColumns;

	/**
	 * The cached value of the '{@link #getTranslations() <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslations()
	 * @generated
	 * @ordered
	 */
	protected TranslationsType translations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutOfLineBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.OUT_OF_LINE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatabaseID() {
		return databaseID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabaseID(String newDatabaseID) {
		String oldDatabaseID = databaseID;
		databaseID = newDatabaseID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__DATABASE_ID, oldDatabaseID, databaseID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDimensionID() {
		return dimensionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionID(String newDimensionID) {
		String oldDimensionID = dimensionID;
		dimensionID = newDimensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__DIMENSION_ID, oldDimensionID, dimensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCubeID() {
		return cubeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubeID(String newCubeID) {
		String oldCubeID = cubeID;
		cubeID = newCubeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__CUBE_ID, oldCubeID, cubeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasureGroupID() {
		return measureGroupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureGroupID(String newMeasureGroupID) {
		String oldMeasureGroupID = measureGroupID;
		measureGroupID = newMeasureGroupID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__MEASURE_GROUP_ID, oldMeasureGroupID, measureGroupID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartitionID() {
		return partitionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionID(String newPartitionID) {
		String oldPartitionID = partitionID;
		partitionID = newPartitionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__PARTITION_ID, oldPartitionID, partitionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiningModelID() {
		return miningModelID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningModelID(String newMiningModelID) {
		String oldMiningModelID = miningModelID;
		miningModelID = newMiningModelID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__MINING_MODEL_ID, oldMiningModelID, miningModelID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMiningStructureID() {
		return miningStructureID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMiningStructureID(String newMiningStructureID) {
		String oldMiningStructureID = miningStructureID;
		miningStructureID = newMiningStructureID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__MINING_STRUCTURE_ID, oldMiningStructureID, miningStructureID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeID() {
		return attributeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeID(String newAttributeID) {
		String oldAttributeID = attributeID;
		attributeID = newAttributeID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__ATTRIBUTE_ID, oldAttributeID, attributeID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCubeDimensionID() {
		return cubeDimensionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCubeDimensionID(String newCubeDimensionID) {
		String oldCubeDimensionID = cubeDimensionID;
		cubeDimensionID = newCubeDimensionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__CUBE_DIMENSION_ID, oldCubeDimensionID, cubeDimensionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeasureID() {
		return measureID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureID(String newMeasureID) {
		String oldMeasureID = measureID;
		measureID = newMeasureID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__MEASURE_ID, oldMeasureID, measureID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentColumnID() {
		return parentColumnID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentColumnID(String newParentColumnID) {
		String oldParentColumnID = parentColumnID;
		parentColumnID = newParentColumnID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__PARENT_COLUMN_ID, oldParentColumnID, parentColumnID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumnID() {
		return columnID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnID(String newColumnID) {
		String oldColumnID = columnID;
		columnID = newColumnID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__COLUMN_ID, oldColumnID, columnID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Binding newSource, NotificationChain msgs) {
		Binding oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Binding newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameColumnType getNameColumn() {
		return nameColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameColumn(NameColumnType newNameColumn, NotificationChain msgs) {
		NameColumnType oldNameColumn = nameColumn;
		nameColumn = newNameColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__NAME_COLUMN, oldNameColumn, newNameColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameColumn(NameColumnType newNameColumn) {
		if (newNameColumn != nameColumn) {
			NotificationChain msgs = null;
			if (nameColumn != null)
				msgs = ((InternalEObject)nameColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__NAME_COLUMN, null, msgs);
			if (newNameColumn != null)
				msgs = ((InternalEObject)newNameColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__NAME_COLUMN, null, msgs);
			msgs = basicSetNameColumn(newNameColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__NAME_COLUMN, newNameColumn, newNameColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkippedLevelsColumnType getSkippedLevelsColumn() {
		return skippedLevelsColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSkippedLevelsColumn(SkippedLevelsColumnType newSkippedLevelsColumn, NotificationChain msgs) {
		SkippedLevelsColumnType oldSkippedLevelsColumn = skippedLevelsColumn;
		skippedLevelsColumn = newSkippedLevelsColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__SKIPPED_LEVELS_COLUMN, oldSkippedLevelsColumn, newSkippedLevelsColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkippedLevelsColumn(SkippedLevelsColumnType newSkippedLevelsColumn) {
		if (newSkippedLevelsColumn != skippedLevelsColumn) {
			NotificationChain msgs = null;
			if (skippedLevelsColumn != null)
				msgs = ((InternalEObject)skippedLevelsColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__SKIPPED_LEVELS_COLUMN, null, msgs);
			if (newSkippedLevelsColumn != null)
				msgs = ((InternalEObject)newSkippedLevelsColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__SKIPPED_LEVELS_COLUMN, null, msgs);
			msgs = basicSetSkippedLevelsColumn(newSkippedLevelsColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__SKIPPED_LEVELS_COLUMN, newSkippedLevelsColumn, newSkippedLevelsColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomRollupColumnType getCustomRollupColumn() {
		return customRollupColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomRollupColumn(CustomRollupColumnType newCustomRollupColumn, NotificationChain msgs) {
		CustomRollupColumnType oldCustomRollupColumn = customRollupColumn;
		customRollupColumn = newCustomRollupColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_COLUMN, oldCustomRollupColumn, newCustomRollupColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomRollupColumn(CustomRollupColumnType newCustomRollupColumn) {
		if (newCustomRollupColumn != customRollupColumn) {
			NotificationChain msgs = null;
			if (customRollupColumn != null)
				msgs = ((InternalEObject)customRollupColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_COLUMN, null, msgs);
			if (newCustomRollupColumn != null)
				msgs = ((InternalEObject)newCustomRollupColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_COLUMN, null, msgs);
			msgs = basicSetCustomRollupColumn(newCustomRollupColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_COLUMN, newCustomRollupColumn, newCustomRollupColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomRollupPropertiesColumnType getCustomRollupPropertiesColumn() {
		return customRollupPropertiesColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomRollupPropertiesColumn(CustomRollupPropertiesColumnType newCustomRollupPropertiesColumn, NotificationChain msgs) {
		CustomRollupPropertiesColumnType oldCustomRollupPropertiesColumn = customRollupPropertiesColumn;
		customRollupPropertiesColumn = newCustomRollupPropertiesColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_PROPERTIES_COLUMN, oldCustomRollupPropertiesColumn, newCustomRollupPropertiesColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomRollupPropertiesColumn(CustomRollupPropertiesColumnType newCustomRollupPropertiesColumn) {
		if (newCustomRollupPropertiesColumn != customRollupPropertiesColumn) {
			NotificationChain msgs = null;
			if (customRollupPropertiesColumn != null)
				msgs = ((InternalEObject)customRollupPropertiesColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_PROPERTIES_COLUMN, null, msgs);
			if (newCustomRollupPropertiesColumn != null)
				msgs = ((InternalEObject)newCustomRollupPropertiesColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_PROPERTIES_COLUMN, null, msgs);
			msgs = basicSetCustomRollupPropertiesColumn(newCustomRollupPropertiesColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_PROPERTIES_COLUMN, newCustomRollupPropertiesColumn, newCustomRollupPropertiesColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueColumnType getValueColumn() {
		return valueColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueColumn(ValueColumnType newValueColumn, NotificationChain msgs) {
		ValueColumnType oldValueColumn = valueColumn;
		valueColumn = newValueColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__VALUE_COLUMN, oldValueColumn, newValueColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueColumn(ValueColumnType newValueColumn) {
		if (newValueColumn != valueColumn) {
			NotificationChain msgs = null;
			if (valueColumn != null)
				msgs = ((InternalEObject)valueColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__VALUE_COLUMN, null, msgs);
			if (newValueColumn != null)
				msgs = ((InternalEObject)newValueColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__VALUE_COLUMN, null, msgs);
			msgs = basicSetValueColumn(newValueColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__VALUE_COLUMN, newValueColumn, newValueColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperatorColumnType getUnaryOperatorColumn() {
		return unaryOperatorColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryOperatorColumn(UnaryOperatorColumnType newUnaryOperatorColumn, NotificationChain msgs) {
		UnaryOperatorColumnType oldUnaryOperatorColumn = unaryOperatorColumn;
		unaryOperatorColumn = newUnaryOperatorColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__UNARY_OPERATOR_COLUMN, oldUnaryOperatorColumn, newUnaryOperatorColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnaryOperatorColumn(UnaryOperatorColumnType newUnaryOperatorColumn) {
		if (newUnaryOperatorColumn != unaryOperatorColumn) {
			NotificationChain msgs = null;
			if (unaryOperatorColumn != null)
				msgs = ((InternalEObject)unaryOperatorColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__UNARY_OPERATOR_COLUMN, null, msgs);
			if (newUnaryOperatorColumn != null)
				msgs = ((InternalEObject)newUnaryOperatorColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__UNARY_OPERATOR_COLUMN, null, msgs);
			msgs = basicSetUnaryOperatorColumn(newUnaryOperatorColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__UNARY_OPERATOR_COLUMN, newUnaryOperatorColumn, newUnaryOperatorColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyColumnsType2 getKeyColumns() {
		return keyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyColumns(KeyColumnsType2 newKeyColumns, NotificationChain msgs) {
		KeyColumnsType2 oldKeyColumns = keyColumns;
		keyColumns = newKeyColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__KEY_COLUMNS, oldKeyColumns, newKeyColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyColumns(KeyColumnsType2 newKeyColumns) {
		if (newKeyColumns != keyColumns) {
			NotificationChain msgs = null;
			if (keyColumns != null)
				msgs = ((InternalEObject)keyColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__KEY_COLUMNS, null, msgs);
			if (newKeyColumns != null)
				msgs = ((InternalEObject)newKeyColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__KEY_COLUMNS, null, msgs);
			msgs = basicSetKeyColumns(newKeyColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__KEY_COLUMNS, newKeyColumns, newKeyColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyColumnsType1 getForeignKeyColumns() {
		return foreignKeyColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeignKeyColumns(ForeignKeyColumnsType1 newForeignKeyColumns, NotificationChain msgs) {
		ForeignKeyColumnsType1 oldForeignKeyColumns = foreignKeyColumns;
		foreignKeyColumns = newForeignKeyColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__FOREIGN_KEY_COLUMNS, oldForeignKeyColumns, newForeignKeyColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeyColumns(ForeignKeyColumnsType1 newForeignKeyColumns) {
		if (newForeignKeyColumns != foreignKeyColumns) {
			NotificationChain msgs = null;
			if (foreignKeyColumns != null)
				msgs = ((InternalEObject)foreignKeyColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__FOREIGN_KEY_COLUMNS, null, msgs);
			if (newForeignKeyColumns != null)
				msgs = ((InternalEObject)newForeignKeyColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__FOREIGN_KEY_COLUMNS, null, msgs);
			msgs = basicSetForeignKeyColumns(newForeignKeyColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__FOREIGN_KEY_COLUMNS, newForeignKeyColumns, newForeignKeyColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslationsType getTranslations() {
		return translations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslations(TranslationsType newTranslations, NotificationChain msgs) {
		TranslationsType oldTranslations = translations;
		translations = newTranslations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__TRANSLATIONS, oldTranslations, newTranslations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslations(TranslationsType newTranslations) {
		if (newTranslations != translations) {
			NotificationChain msgs = null;
			if (translations != null)
				msgs = ((InternalEObject)translations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__TRANSLATIONS, null, msgs);
			if (newTranslations != null)
				msgs = ((InternalEObject)newTranslations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.OUT_OF_LINE_BINDING__TRANSLATIONS, null, msgs);
			msgs = basicSetTranslations(newTranslations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.OUT_OF_LINE_BINDING__TRANSLATIONS, newTranslations, newTranslations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.OUT_OF_LINE_BINDING__SOURCE:
				return basicSetSource(null, msgs);
			case XmlaPackage.OUT_OF_LINE_BINDING__NAME_COLUMN:
				return basicSetNameColumn(null, msgs);
			case XmlaPackage.OUT_OF_LINE_BINDING__SKIPPED_LEVELS_COLUMN:
				return basicSetSkippedLevelsColumn(null, msgs);
			case XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_COLUMN:
				return basicSetCustomRollupColumn(null, msgs);
			case XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_PROPERTIES_COLUMN:
				return basicSetCustomRollupPropertiesColumn(null, msgs);
			case XmlaPackage.OUT_OF_LINE_BINDING__VALUE_COLUMN:
				return basicSetValueColumn(null, msgs);
			case XmlaPackage.OUT_OF_LINE_BINDING__UNARY_OPERATOR_COLUMN:
				return basicSetUnaryOperatorColumn(null, msgs);
			case XmlaPackage.OUT_OF_LINE_BINDING__KEY_COLUMNS:
				return basicSetKeyColumns(null, msgs);
			case XmlaPackage.OUT_OF_LINE_BINDING__FOREIGN_KEY_COLUMNS:
				return basicSetForeignKeyColumns(null, msgs);
			case XmlaPackage.OUT_OF_LINE_BINDING__TRANSLATIONS:
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
			case XmlaPackage.OUT_OF_LINE_BINDING__DATABASE_ID:
				return getDatabaseID();
			case XmlaPackage.OUT_OF_LINE_BINDING__DIMENSION_ID:
				return getDimensionID();
			case XmlaPackage.OUT_OF_LINE_BINDING__CUBE_ID:
				return getCubeID();
			case XmlaPackage.OUT_OF_LINE_BINDING__MEASURE_GROUP_ID:
				return getMeasureGroupID();
			case XmlaPackage.OUT_OF_LINE_BINDING__PARTITION_ID:
				return getPartitionID();
			case XmlaPackage.OUT_OF_LINE_BINDING__MINING_MODEL_ID:
				return getMiningModelID();
			case XmlaPackage.OUT_OF_LINE_BINDING__MINING_STRUCTURE_ID:
				return getMiningStructureID();
			case XmlaPackage.OUT_OF_LINE_BINDING__ATTRIBUTE_ID:
				return getAttributeID();
			case XmlaPackage.OUT_OF_LINE_BINDING__CUBE_DIMENSION_ID:
				return getCubeDimensionID();
			case XmlaPackage.OUT_OF_LINE_BINDING__MEASURE_ID:
				return getMeasureID();
			case XmlaPackage.OUT_OF_LINE_BINDING__PARENT_COLUMN_ID:
				return getParentColumnID();
			case XmlaPackage.OUT_OF_LINE_BINDING__COLUMN_ID:
				return getColumnID();
			case XmlaPackage.OUT_OF_LINE_BINDING__SOURCE:
				return getSource();
			case XmlaPackage.OUT_OF_LINE_BINDING__NAME_COLUMN:
				return getNameColumn();
			case XmlaPackage.OUT_OF_LINE_BINDING__SKIPPED_LEVELS_COLUMN:
				return getSkippedLevelsColumn();
			case XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_COLUMN:
				return getCustomRollupColumn();
			case XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_PROPERTIES_COLUMN:
				return getCustomRollupPropertiesColumn();
			case XmlaPackage.OUT_OF_LINE_BINDING__VALUE_COLUMN:
				return getValueColumn();
			case XmlaPackage.OUT_OF_LINE_BINDING__UNARY_OPERATOR_COLUMN:
				return getUnaryOperatorColumn();
			case XmlaPackage.OUT_OF_LINE_BINDING__KEY_COLUMNS:
				return getKeyColumns();
			case XmlaPackage.OUT_OF_LINE_BINDING__FOREIGN_KEY_COLUMNS:
				return getForeignKeyColumns();
			case XmlaPackage.OUT_OF_LINE_BINDING__TRANSLATIONS:
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
			case XmlaPackage.OUT_OF_LINE_BINDING__DATABASE_ID:
				setDatabaseID((String)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__DIMENSION_ID:
				setDimensionID((String)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__CUBE_ID:
				setCubeID((String)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__MEASURE_GROUP_ID:
				setMeasureGroupID((String)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__PARTITION_ID:
				setPartitionID((String)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__MINING_MODEL_ID:
				setMiningModelID((String)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__MINING_STRUCTURE_ID:
				setMiningStructureID((String)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__ATTRIBUTE_ID:
				setAttributeID((String)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__CUBE_DIMENSION_ID:
				setCubeDimensionID((String)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__MEASURE_ID:
				setMeasureID((String)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__PARENT_COLUMN_ID:
				setParentColumnID((String)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__COLUMN_ID:
				setColumnID((String)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__SOURCE:
				setSource((Binding)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__NAME_COLUMN:
				setNameColumn((NameColumnType)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__SKIPPED_LEVELS_COLUMN:
				setSkippedLevelsColumn((SkippedLevelsColumnType)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_COLUMN:
				setCustomRollupColumn((CustomRollupColumnType)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_PROPERTIES_COLUMN:
				setCustomRollupPropertiesColumn((CustomRollupPropertiesColumnType)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__VALUE_COLUMN:
				setValueColumn((ValueColumnType)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__UNARY_OPERATOR_COLUMN:
				setUnaryOperatorColumn((UnaryOperatorColumnType)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__KEY_COLUMNS:
				setKeyColumns((KeyColumnsType2)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__FOREIGN_KEY_COLUMNS:
				setForeignKeyColumns((ForeignKeyColumnsType1)newValue);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__TRANSLATIONS:
				setTranslations((TranslationsType)newValue);
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
			case XmlaPackage.OUT_OF_LINE_BINDING__DATABASE_ID:
				setDatabaseID(DATABASE_ID_EDEFAULT);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__DIMENSION_ID:
				setDimensionID(DIMENSION_ID_EDEFAULT);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__CUBE_ID:
				setCubeID(CUBE_ID_EDEFAULT);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__MEASURE_GROUP_ID:
				setMeasureGroupID(MEASURE_GROUP_ID_EDEFAULT);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__PARTITION_ID:
				setPartitionID(PARTITION_ID_EDEFAULT);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__MINING_MODEL_ID:
				setMiningModelID(MINING_MODEL_ID_EDEFAULT);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__MINING_STRUCTURE_ID:
				setMiningStructureID(MINING_STRUCTURE_ID_EDEFAULT);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__ATTRIBUTE_ID:
				setAttributeID(ATTRIBUTE_ID_EDEFAULT);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__CUBE_DIMENSION_ID:
				setCubeDimensionID(CUBE_DIMENSION_ID_EDEFAULT);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__MEASURE_ID:
				setMeasureID(MEASURE_ID_EDEFAULT);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__PARENT_COLUMN_ID:
				setParentColumnID(PARENT_COLUMN_ID_EDEFAULT);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__COLUMN_ID:
				setColumnID(COLUMN_ID_EDEFAULT);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__SOURCE:
				setSource((Binding)null);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__NAME_COLUMN:
				setNameColumn((NameColumnType)null);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__SKIPPED_LEVELS_COLUMN:
				setSkippedLevelsColumn((SkippedLevelsColumnType)null);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_COLUMN:
				setCustomRollupColumn((CustomRollupColumnType)null);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_PROPERTIES_COLUMN:
				setCustomRollupPropertiesColumn((CustomRollupPropertiesColumnType)null);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__VALUE_COLUMN:
				setValueColumn((ValueColumnType)null);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__UNARY_OPERATOR_COLUMN:
				setUnaryOperatorColumn((UnaryOperatorColumnType)null);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__KEY_COLUMNS:
				setKeyColumns((KeyColumnsType2)null);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__FOREIGN_KEY_COLUMNS:
				setForeignKeyColumns((ForeignKeyColumnsType1)null);
				return;
			case XmlaPackage.OUT_OF_LINE_BINDING__TRANSLATIONS:
				setTranslations((TranslationsType)null);
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
			case XmlaPackage.OUT_OF_LINE_BINDING__DATABASE_ID:
				return DATABASE_ID_EDEFAULT == null ? databaseID != null : !DATABASE_ID_EDEFAULT.equals(databaseID);
			case XmlaPackage.OUT_OF_LINE_BINDING__DIMENSION_ID:
				return DIMENSION_ID_EDEFAULT == null ? dimensionID != null : !DIMENSION_ID_EDEFAULT.equals(dimensionID);
			case XmlaPackage.OUT_OF_LINE_BINDING__CUBE_ID:
				return CUBE_ID_EDEFAULT == null ? cubeID != null : !CUBE_ID_EDEFAULT.equals(cubeID);
			case XmlaPackage.OUT_OF_LINE_BINDING__MEASURE_GROUP_ID:
				return MEASURE_GROUP_ID_EDEFAULT == null ? measureGroupID != null : !MEASURE_GROUP_ID_EDEFAULT.equals(measureGroupID);
			case XmlaPackage.OUT_OF_LINE_BINDING__PARTITION_ID:
				return PARTITION_ID_EDEFAULT == null ? partitionID != null : !PARTITION_ID_EDEFAULT.equals(partitionID);
			case XmlaPackage.OUT_OF_LINE_BINDING__MINING_MODEL_ID:
				return MINING_MODEL_ID_EDEFAULT == null ? miningModelID != null : !MINING_MODEL_ID_EDEFAULT.equals(miningModelID);
			case XmlaPackage.OUT_OF_LINE_BINDING__MINING_STRUCTURE_ID:
				return MINING_STRUCTURE_ID_EDEFAULT == null ? miningStructureID != null : !MINING_STRUCTURE_ID_EDEFAULT.equals(miningStructureID);
			case XmlaPackage.OUT_OF_LINE_BINDING__ATTRIBUTE_ID:
				return ATTRIBUTE_ID_EDEFAULT == null ? attributeID != null : !ATTRIBUTE_ID_EDEFAULT.equals(attributeID);
			case XmlaPackage.OUT_OF_LINE_BINDING__CUBE_DIMENSION_ID:
				return CUBE_DIMENSION_ID_EDEFAULT == null ? cubeDimensionID != null : !CUBE_DIMENSION_ID_EDEFAULT.equals(cubeDimensionID);
			case XmlaPackage.OUT_OF_LINE_BINDING__MEASURE_ID:
				return MEASURE_ID_EDEFAULT == null ? measureID != null : !MEASURE_ID_EDEFAULT.equals(measureID);
			case XmlaPackage.OUT_OF_LINE_BINDING__PARENT_COLUMN_ID:
				return PARENT_COLUMN_ID_EDEFAULT == null ? parentColumnID != null : !PARENT_COLUMN_ID_EDEFAULT.equals(parentColumnID);
			case XmlaPackage.OUT_OF_LINE_BINDING__COLUMN_ID:
				return COLUMN_ID_EDEFAULT == null ? columnID != null : !COLUMN_ID_EDEFAULT.equals(columnID);
			case XmlaPackage.OUT_OF_LINE_BINDING__SOURCE:
				return source != null;
			case XmlaPackage.OUT_OF_LINE_BINDING__NAME_COLUMN:
				return nameColumn != null;
			case XmlaPackage.OUT_OF_LINE_BINDING__SKIPPED_LEVELS_COLUMN:
				return skippedLevelsColumn != null;
			case XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_COLUMN:
				return customRollupColumn != null;
			case XmlaPackage.OUT_OF_LINE_BINDING__CUSTOM_ROLLUP_PROPERTIES_COLUMN:
				return customRollupPropertiesColumn != null;
			case XmlaPackage.OUT_OF_LINE_BINDING__VALUE_COLUMN:
				return valueColumn != null;
			case XmlaPackage.OUT_OF_LINE_BINDING__UNARY_OPERATOR_COLUMN:
				return unaryOperatorColumn != null;
			case XmlaPackage.OUT_OF_LINE_BINDING__KEY_COLUMNS:
				return keyColumns != null;
			case XmlaPackage.OUT_OF_LINE_BINDING__FOREIGN_KEY_COLUMNS:
				return foreignKeyColumns != null;
			case XmlaPackage.OUT_OF_LINE_BINDING__TRANSLATIONS:
				return translations != null;
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
		result.append(" (databaseID: ");
		result.append(databaseID);
		result.append(", dimensionID: ");
		result.append(dimensionID);
		result.append(", cubeID: ");
		result.append(cubeID);
		result.append(", measureGroupID: ");
		result.append(measureGroupID);
		result.append(", partitionID: ");
		result.append(partitionID);
		result.append(", miningModelID: ");
		result.append(miningModelID);
		result.append(", miningStructureID: ");
		result.append(miningStructureID);
		result.append(", attributeID: ");
		result.append(attributeID);
		result.append(", cubeDimensionID: ");
		result.append(cubeDimensionID);
		result.append(", measureID: ");
		result.append(measureID);
		result.append(", parentColumnID: ");
		result.append(parentColumnID);
		result.append(", columnID: ");
		result.append(columnID);
		result.append(')');
		return result.toString();
	}

} //OutOfLineBindingImpl
