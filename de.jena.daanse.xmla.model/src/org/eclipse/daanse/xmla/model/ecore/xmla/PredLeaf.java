/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pred Leaf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PredLeaf#getComparator <em>Comparator</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PredLeaf#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PredLeaf#getGlobal <em>Global</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.PredLeaf#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPredLeaf()
 * @model extendedMetaData="name='pred_leaf' kind='elementOnly'"
 * @generated
 */
public interface PredLeaf extends EObject {
	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' containment reference.
	 * @see #setComparator(ComparatorType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPredLeaf_Comparator()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='comparator'"
	 * @generated
	 */
	ComparatorType getComparator();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PredLeaf#getComparator <em>Comparator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' containment reference.
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(ComparatorType value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(EventType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPredLeaf_Event()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event'"
	 * @generated
	 */
	EventType getEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PredLeaf#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventType value);

	/**
	 * Returns the value of the '<em><b>Global</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global</em>' containment reference.
	 * @see #setGlobal(GlobalType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPredLeaf_Global()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='global'"
	 * @generated
	 */
	GlobalType getGlobal();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PredLeaf#getGlobal <em>Global</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global</em>' containment reference.
	 * @see #getGlobal()
	 * @generated
	 */
	void setGlobal(GlobalType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(EObject)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getPredLeaf_Value()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='value'"
	 * @generated
	 */
	EObject getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.PredLeaf#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EObject value);

} // PredLeaf
