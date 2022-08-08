/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Delete#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Delete#isIgnoreFailures <em>Ignore Failures</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDelete()
 * @model extendedMetaData="name='Delete' kind='elementOnly'"
 * @generated
 */
public interface Delete extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectReference)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDelete_Object()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Object'"
	 * @generated
	 */
	ObjectReference getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Delete#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectReference value);

	/**
	 * Returns the value of the '<em><b>Ignore Failures</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Failures</em>' attribute.
	 * @see #isSetIgnoreFailures()
	 * @see #unsetIgnoreFailures()
	 * @see #setIgnoreFailures(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDelete_IgnoreFailures()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IgnoreFailures'"
	 * @generated
	 */
	boolean isIgnoreFailures();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Delete#isIgnoreFailures <em>Ignore Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Failures</em>' attribute.
	 * @see #isSetIgnoreFailures()
	 * @see #unsetIgnoreFailures()
	 * @see #isIgnoreFailures()
	 * @generated
	 */
	void setIgnoreFailures(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Delete#isIgnoreFailures <em>Ignore Failures</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreFailures()
	 * @see #isIgnoreFailures()
	 * @see #setIgnoreFailures(boolean)
	 * @generated
	 */
	void unsetIgnoreFailures();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Delete#isIgnoreFailures <em>Ignore Failures</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Failures</em>' attribute is set.
	 * @see #unsetIgnoreFailures()
	 * @see #isIgnoreFailures()
	 * @see #setIgnoreFailures(boolean)
	 * @generated
	 */
	boolean isSetIgnoreFailures();

} // Delete
