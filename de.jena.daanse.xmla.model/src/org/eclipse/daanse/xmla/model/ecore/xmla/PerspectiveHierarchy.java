/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Perspective Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveHierarchy#getHierarchyID <em>Hierarchy ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveHierarchy#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectiveHierarchy()
 * @model extendedMetaData="name='PerspectiveHierarchy' kind='elementOnly'"
 * @generated
 */
public interface PerspectiveHierarchy extends EObject {
	/**
	 * Returns the value of the '<em><b>Hierarchy ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy ID</em>' attribute.
	 * @see #setHierarchyID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectiveHierarchy_HierarchyID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='HierarchyID'"
	 * @generated
	 */
	String getHierarchyID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveHierarchy#getHierarchyID <em>Hierarchy ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy ID</em>' attribute.
	 * @see #getHierarchyID()
	 * @generated
	 */
	void setHierarchyID(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPerspectiveHierarchy_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PerspectiveHierarchy#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

} // PerspectiveHierarchy
