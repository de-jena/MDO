/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folding Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters#getFoldIndex <em>Fold Index</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters#getFoldCount <em>Fold Count</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters#getFoldMaxCases <em>Fold Max Cases</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters#getFoldTargetAttribute <em>Fold Target Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getFoldingParameters()
 * @model extendedMetaData="name='FoldingParameters' kind='elementOnly'"
 * @generated
 */
public interface FoldingParameters extends EObject {
	/**
	 * Returns the value of the '<em><b>Fold Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fold Index</em>' attribute.
	 * @see #setFoldIndex(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getFoldingParameters_FoldIndex()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='FoldIndex'"
	 * @generated
	 */
	BigInteger getFoldIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters#getFoldIndex <em>Fold Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fold Index</em>' attribute.
	 * @see #getFoldIndex()
	 * @generated
	 */
	void setFoldIndex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Fold Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fold Count</em>' attribute.
	 * @see #setFoldCount(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getFoldingParameters_FoldCount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='FoldCount'"
	 * @generated
	 */
	BigInteger getFoldCount();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters#getFoldCount <em>Fold Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fold Count</em>' attribute.
	 * @see #getFoldCount()
	 * @generated
	 */
	void setFoldCount(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Fold Max Cases</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fold Max Cases</em>' attribute.
	 * @see #isSetFoldMaxCases()
	 * @see #unsetFoldMaxCases()
	 * @see #setFoldMaxCases(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getFoldingParameters_FoldMaxCases()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='FoldMaxCases'"
	 * @generated
	 */
	long getFoldMaxCases();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters#getFoldMaxCases <em>Fold Max Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fold Max Cases</em>' attribute.
	 * @see #isSetFoldMaxCases()
	 * @see #unsetFoldMaxCases()
	 * @see #getFoldMaxCases()
	 * @generated
	 */
	void setFoldMaxCases(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters#getFoldMaxCases <em>Fold Max Cases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFoldMaxCases()
	 * @see #getFoldMaxCases()
	 * @see #setFoldMaxCases(long)
	 * @generated
	 */
	void unsetFoldMaxCases();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters#getFoldMaxCases <em>Fold Max Cases</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fold Max Cases</em>' attribute is set.
	 * @see #unsetFoldMaxCases()
	 * @see #getFoldMaxCases()
	 * @see #setFoldMaxCases(long)
	 * @generated
	 */
	boolean isSetFoldMaxCases();

	/**
	 * Returns the value of the '<em><b>Fold Target Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fold Target Attribute</em>' attribute.
	 * @see #setFoldTargetAttribute(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getFoldingParameters_FoldTargetAttribute()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='FoldTargetAttribute'"
	 * @generated
	 */
	String getFoldTargetAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.FoldingParameters#getFoldTargetAttribute <em>Fold Target Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fold Target Attribute</em>' attribute.
	 * @see #getFoldTargetAttribute()
	 * @generated
	 */
	void setFoldTargetAttribute(String value);

} // FoldingParameters
