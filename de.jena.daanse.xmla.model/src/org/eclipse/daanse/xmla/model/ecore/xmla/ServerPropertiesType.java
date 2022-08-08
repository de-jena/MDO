/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Properties Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerPropertiesType#getServerProperty <em>Server Property</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServerPropertiesType()
 * @model extendedMetaData="name='ServerProperties_._type' kind='elementOnly'"
 * @generated
 */
public interface ServerPropertiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Server Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.ServerProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Property</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getServerPropertiesType_ServerProperty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ServerProperty'"
	 * @generated
	 */
	EList<ServerProperty> getServerProperty();

} // ServerPropertiesType
