/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ParallelType#getProcess <em>Process</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ParallelType#getMaxParallel <em>Max Parallel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getParallelType()
 * @model extendedMetaData="name='Parallel_._type' kind='elementOnly'"
 * @generated
 */
public interface ParallelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getParallelType_Process()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Process'"
	 * @generated
	 */
	EList<org.eclipse.daanse.xmla.model.ecore.xmla.Process> getProcess();

	/**
	 * Returns the value of the '<em><b>Max Parallel</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Parallel</em>' attribute.
	 * @see #isSetMaxParallel()
	 * @see #unsetMaxParallel()
	 * @see #setMaxParallel(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getParallelType_MaxParallel()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='MaxParallel'"
	 * @generated
	 */
	int getMaxParallel();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ParallelType#getMaxParallel <em>Max Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Parallel</em>' attribute.
	 * @see #isSetMaxParallel()
	 * @see #unsetMaxParallel()
	 * @see #getMaxParallel()
	 * @generated
	 */
	void setMaxParallel(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ParallelType#getMaxParallel <em>Max Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxParallel()
	 * @see #getMaxParallel()
	 * @see #setMaxParallel(int)
	 * @generated
	 */
	void unsetMaxParallel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ParallelType#getMaxParallel <em>Max Parallel</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Parallel</em>' attribute is set.
	 * @see #unsetMaxParallel()
	 * @see #getMaxParallel()
	 * @see #setMaxParallel(int)
	 * @generated
	 */
	boolean isSetMaxParallel();

} // ParallelType
