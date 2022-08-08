/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Partitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MergePartitions#getSources <em>Sources</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MergePartitions#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMergePartitions()
 * @model extendedMetaData="name='MergePartitions' kind='elementOnly'"
 * @generated
 */
public interface MergePartitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Sources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sources</em>' containment reference.
	 * @see #setSources(SourcesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMergePartitions_Sources()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Sources'"
	 * @generated
	 */
	SourcesType getSources();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MergePartitions#getSources <em>Sources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sources</em>' containment reference.
	 * @see #getSources()
	 * @generated
	 */
	void setSources(SourcesType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ObjectReference)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMergePartitions_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Target'"
	 * @generated
	 */
	ObjectReference getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MergePartitions#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ObjectReference value);

} // MergePartitions
