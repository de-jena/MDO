/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mining Modeling Flag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelingFlag#getModelingFlag <em>Modeling Flag</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModelingFlag()
 * @model extendedMetaData="name='MiningModelingFlag' kind='elementOnly'"
 * @generated
 */
public interface MiningModelingFlag extends EObject {
	/**
	 * Returns the value of the '<em><b>Modeling Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modeling Flag</em>' attribute.
	 * @see #setModelingFlag(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getMiningModelingFlag_ModelingFlag()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ModelingFlag'"
	 * @generated
	 */
	String getModelingFlag();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.MiningModelingFlag#getModelingFlag <em>Modeling Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modeling Flag</em>' attribute.
	 * @see #getModelingFlag()
	 * @generated
	 */
	void setModelingFlag(String value);

} // MiningModelingFlag
