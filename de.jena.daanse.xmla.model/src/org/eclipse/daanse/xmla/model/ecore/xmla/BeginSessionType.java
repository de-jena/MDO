/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Begin Session Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.BeginSessionType#getMustUnderstand <em>Must Understand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBeginSessionType()
 * @model extendedMetaData="name='BeginSession_._type' kind='empty'"
 * @generated
 */
public interface BeginSessionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Understand</em>' attribute.
	 * @see #isSetMustUnderstand()
	 * @see #unsetMustUnderstand()
	 * @see #setMustUnderstand(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getBeginSessionType_MustUnderstand()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='mustUnderstand'"
	 * @generated
	 */
	int getMustUnderstand();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BeginSessionType#getMustUnderstand <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Understand</em>' attribute.
	 * @see #isSetMustUnderstand()
	 * @see #unsetMustUnderstand()
	 * @see #getMustUnderstand()
	 * @generated
	 */
	void setMustUnderstand(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BeginSessionType#getMustUnderstand <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMustUnderstand()
	 * @see #getMustUnderstand()
	 * @see #setMustUnderstand(int)
	 * @generated
	 */
	void unsetMustUnderstand();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.BeginSessionType#getMustUnderstand <em>Must Understand</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Must Understand</em>' attribute is set.
	 * @see #unsetMustUnderstand()
	 * @see #getMustUnderstand()
	 * @see #setMustUnderstand(int)
	 * @generated
	 */
	boolean isSetMustUnderstand();

} // BeginSessionType