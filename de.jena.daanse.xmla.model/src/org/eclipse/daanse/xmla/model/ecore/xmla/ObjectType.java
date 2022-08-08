/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectType#getDatabaseID <em>Database ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectType()
 * @model extendedMetaData="name='Object_._type' kind='elementOnly'"
 * @generated
 */
public interface ObjectType extends EObject {
	/**
	 * Returns the value of the '<em><b>Database ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database ID</em>' containment reference.
	 * @see #setDatabaseID(ObjectReference)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getObjectType_DatabaseID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DatabaseID'"
	 * @generated
	 */
	ObjectReference getDatabaseID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ObjectType#getDatabaseID <em>Database ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database ID</em>' containment reference.
	 * @see #getDatabaseID()
	 * @generated
	 */
	void setDatabaseID(ObjectReference value);

} // ObjectType
