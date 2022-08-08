/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commit Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.CommitTransaction#getDurabilityGuarantee <em>Durability Guarantee</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommitTransaction()
 * @model extendedMetaData="name='CommitTransaction' kind='elementOnly'"
 * @generated
 */
public interface CommitTransaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Durability Guarantee</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DurabilityGuaranteeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durability Guarantee</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DurabilityGuaranteeType
	 * @see #isSetDurabilityGuarantee()
	 * @see #unsetDurabilityGuarantee()
	 * @see #setDurabilityGuarantee(DurabilityGuaranteeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getCommitTransaction_DurabilityGuarantee()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='DurabilityGuarantee'"
	 * @generated
	 */
	DurabilityGuaranteeType getDurabilityGuarantee();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CommitTransaction#getDurabilityGuarantee <em>Durability Guarantee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durability Guarantee</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DurabilityGuaranteeType
	 * @see #isSetDurabilityGuarantee()
	 * @see #unsetDurabilityGuarantee()
	 * @see #getDurabilityGuarantee()
	 * @generated
	 */
	void setDurabilityGuarantee(DurabilityGuaranteeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CommitTransaction#getDurabilityGuarantee <em>Durability Guarantee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDurabilityGuarantee()
	 * @see #getDurabilityGuarantee()
	 * @see #setDurabilityGuarantee(DurabilityGuaranteeType)
	 * @generated
	 */
	void unsetDurabilityGuarantee();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.CommitTransaction#getDurabilityGuarantee <em>Durability Guarantee</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Durability Guarantee</em>' attribute is set.
	 * @see #unsetDurabilityGuarantee()
	 * @see #getDurabilityGuarantee()
	 * @see #setDurabilityGuarantee(DurabilityGuaranteeType)
	 * @generated
	 */
	boolean isSetDurabilityGuarantee();

} // CommitTransaction
