/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Or Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType#getNot <em>Not</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType#getOr <em>Or</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType#getAnd <em>And</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType#getEqual <em>Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType#getNotEqual <em>Not Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType#getLess <em>Less</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType#getLessOrEqual <em>Less Or Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType#getGreater <em>Greater</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType#getGreaterOrEqual <em>Greater Or Equal</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType#getLike <em>Like</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType#getNotLike <em>Not Like</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType()
 * @model extendedMetaData="name='and_or_type' kind='elementOnly'"
 * @generated
 */
public interface AndOrType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Not</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.NotType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType_Not()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Not' group='#group:0'"
	 * @generated
	 */
	EList<NotType> getNot();

	/**
	 * Returns the value of the '<em><b>Or</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType_Or()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Or' group='#group:0'"
	 * @generated
	 */
	EList<AndOrType> getOr();

	/**
	 * Returns the value of the '<em><b>And</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.AndOrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType_And()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='And' group='#group:0'"
	 * @generated
	 */
	EList<AndOrType> getAnd();

	/**
	 * Returns the value of the '<em><b>Equal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equal</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType_Equal()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Equal' group='#group:0'"
	 * @generated
	 */
	EList<BoolBinop> getEqual();

	/**
	 * Returns the value of the '<em><b>Not Equal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Equal</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType_NotEqual()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NotEqual' group='#group:0'"
	 * @generated
	 */
	EList<BoolBinop> getNotEqual();

	/**
	 * Returns the value of the '<em><b>Less</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Less</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType_Less()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Less' group='#group:0'"
	 * @generated
	 */
	EList<BoolBinop> getLess();

	/**
	 * Returns the value of the '<em><b>Less Or Equal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Less Or Equal</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType_LessOrEqual()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LessOrEqual' group='#group:0'"
	 * @generated
	 */
	EList<BoolBinop> getLessOrEqual();

	/**
	 * Returns the value of the '<em><b>Greater</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greater</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType_Greater()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Greater' group='#group:0'"
	 * @generated
	 */
	EList<BoolBinop> getGreater();

	/**
	 * Returns the value of the '<em><b>Greater Or Equal</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greater Or Equal</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType_GreaterOrEqual()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GreaterOrEqual' group='#group:0'"
	 * @generated
	 */
	EList<BoolBinop> getGreaterOrEqual();

	/**
	 * Returns the value of the '<em><b>Like</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Like</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType_Like()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Like' group='#group:0'"
	 * @generated
	 */
	EList<BoolBinop> getLike();

	/**
	 * Returns the value of the '<em><b>Not Like</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.daanse.xmla.model.ecore.xmla.BoolBinop}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Like</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getAndOrType_NotLike()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NotLike' group='#group:0'"
	 * @generated
	 */
	EList<BoolBinop> getNotLike();

} // AndOrType
