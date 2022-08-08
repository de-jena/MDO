/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classified Columns Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ClassifiedColumnsType#getClassifiedColumnID <em>Classified Column ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getClassifiedColumnsType()
 * @model extendedMetaData="name='ClassifiedColumns_._type' kind='elementOnly'"
 * @generated
 */
public interface ClassifiedColumnsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Classified Column ID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classified Column ID</em>' attribute list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getClassifiedColumnsType_ClassifiedColumnID()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ClassifiedColumnID'"
	 * @generated
	 */
	EList<String> getClassifiedColumnID();

} // ClassifiedColumnsType
