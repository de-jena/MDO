/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clone Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CloneDatabase#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CloneDatabase#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCloneDatabase()
 * @model extendedMetaData="name='CloneDatabase' kind='elementOnly'"
 * @generated
 */
public interface CloneDatabase extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCloneDatabase_Object()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Object'"
	 * @generated
	 */
	ObjectType getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CloneDatabase#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(TargetType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCloneDatabase_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Target'"
	 * @generated
	 */
	TargetType1 getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CloneDatabase#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetType1 value);

} // CloneDatabase
