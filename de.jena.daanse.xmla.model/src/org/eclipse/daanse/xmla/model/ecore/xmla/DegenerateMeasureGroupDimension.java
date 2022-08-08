/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Degenerate Measure Group Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension#getCubeDimensionID <em>Cube Dimension ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension#getShareDimensionStorage <em>Share Dimension Storage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDegenerateMeasureGroupDimension()
 * @model extendedMetaData="name='DegenerateMeasureGroupDimension' kind='elementOnly'"
 * @generated
 */
public interface DegenerateMeasureGroupDimension extends MeasureGroupDimension {
	/**
	 * Returns the value of the '<em><b>Cube Dimension ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cube Dimension ID</em>' attribute.
	 * @see #setCubeDimensionID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDegenerateMeasureGroupDimension_CubeDimensionID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='CubeDimensionID'"
	 * @generated
	 */
	String getCubeDimensionID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension#getCubeDimensionID <em>Cube Dimension ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cube Dimension ID</em>' attribute.
	 * @see #getCubeDimensionID()
	 * @generated
	 */
	void setCubeDimensionID(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType36)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDegenerateMeasureGroupDimension_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType36 getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType36 value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(MeasureGroupDimensionBinding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDegenerateMeasureGroupDimension_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	MeasureGroupDimensionBinding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MeasureGroupDimensionBinding value);

	/**
	 * Returns the value of the '<em><b>Share Dimension Storage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share Dimension Storage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType
	 * @see #isSetShareDimensionStorage()
	 * @see #unsetShareDimensionStorage()
	 * @see #setShareDimensionStorage(ShareDimensionStorageType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDegenerateMeasureGroupDimension_ShareDimensionStorage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ShareDimensionStorage' namespace='http://schemas.microsoft.com/analysisservices/2010/engine/200/200'"
	 * @generated
	 */
	ShareDimensionStorageType getShareDimensionStorage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension#getShareDimensionStorage <em>Share Dimension Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share Dimension Storage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.engine200_200.ShareDimensionStorageType
	 * @see #isSetShareDimensionStorage()
	 * @see #unsetShareDimensionStorage()
	 * @see #getShareDimensionStorage()
	 * @generated
	 */
	void setShareDimensionStorage(ShareDimensionStorageType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension#getShareDimensionStorage <em>Share Dimension Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShareDimensionStorage()
	 * @see #getShareDimensionStorage()
	 * @see #setShareDimensionStorage(ShareDimensionStorageType)
	 * @generated
	 */
	void unsetShareDimensionStorage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DegenerateMeasureGroupDimension#getShareDimensionStorage <em>Share Dimension Storage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Share Dimension Storage</em>' attribute is set.
	 * @see #unsetShareDimensionStorage()
	 * @see #getShareDimensionStorage()
	 * @see #setShareDimensionStorage(ShareDimensionStorageType)
	 * @generated
	 */
	boolean isSetShareDimensionStorage();

} // DegenerateMeasureGroupDimension
