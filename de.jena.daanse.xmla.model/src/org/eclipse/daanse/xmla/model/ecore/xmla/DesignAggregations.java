/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Aggregations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getSteps <em>Steps</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getOptimization <em>Optimization</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getStorage <em>Storage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#isMaterialize <em>Materialize</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getQueries <em>Queries</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDesignAggregations()
 * @model extendedMetaData="name='DesignAggregations' kind='elementOnly'"
 * @generated
 */
public interface DesignAggregations extends EObject {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectReference)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDesignAggregations_Object()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Object'"
	 * @generated
	 */
	ObjectReference getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectReference value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Duration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDesignAggregations_Time()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='Time'"
	 * @generated
	 */
	Duration getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Duration value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' attribute.
	 * @see #setSteps(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDesignAggregations_Steps()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='Steps'"
	 * @generated
	 */
	BigInteger getSteps();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getSteps <em>Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steps</em>' attribute.
	 * @see #getSteps()
	 * @generated
	 */
	void setSteps(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Optimization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimization</em>' attribute.
	 * @see #isSetOptimization()
	 * @see #unsetOptimization()
	 * @see #setOptimization(double)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDesignAggregations_Optimization()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='Optimization'"
	 * @generated
	 */
	double getOptimization();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getOptimization <em>Optimization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimization</em>' attribute.
	 * @see #isSetOptimization()
	 * @see #unsetOptimization()
	 * @see #getOptimization()
	 * @generated
	 */
	void setOptimization(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getOptimization <em>Optimization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptimization()
	 * @see #getOptimization()
	 * @see #setOptimization(double)
	 * @generated
	 */
	void unsetOptimization();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getOptimization <em>Optimization</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Optimization</em>' attribute is set.
	 * @see #unsetOptimization()
	 * @see #getOptimization()
	 * @see #setOptimization(double)
	 * @generated
	 */
	boolean isSetOptimization();

	/**
	 * Returns the value of the '<em><b>Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage</em>' attribute.
	 * @see #isSetStorage()
	 * @see #unsetStorage()
	 * @see #setStorage(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDesignAggregations_Storage()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='Storage'"
	 * @generated
	 */
	long getStorage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage</em>' attribute.
	 * @see #isSetStorage()
	 * @see #unsetStorage()
	 * @see #getStorage()
	 * @generated
	 */
	void setStorage(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getStorage <em>Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStorage()
	 * @see #getStorage()
	 * @see #setStorage(long)
	 * @generated
	 */
	void unsetStorage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getStorage <em>Storage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Storage</em>' attribute is set.
	 * @see #unsetStorage()
	 * @see #getStorage()
	 * @see #setStorage(long)
	 * @generated
	 */
	boolean isSetStorage();

	/**
	 * Returns the value of the '<em><b>Materialize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Materialize</em>' attribute.
	 * @see #isSetMaterialize()
	 * @see #unsetMaterialize()
	 * @see #setMaterialize(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDesignAggregations_Materialize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Materialize'"
	 * @generated
	 */
	boolean isMaterialize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#isMaterialize <em>Materialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Materialize</em>' attribute.
	 * @see #isSetMaterialize()
	 * @see #unsetMaterialize()
	 * @see #isMaterialize()
	 * @generated
	 */
	void setMaterialize(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#isMaterialize <em>Materialize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaterialize()
	 * @see #isMaterialize()
	 * @see #setMaterialize(boolean)
	 * @generated
	 */
	void unsetMaterialize();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#isMaterialize <em>Materialize</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Materialize</em>' attribute is set.
	 * @see #unsetMaterialize()
	 * @see #isMaterialize()
	 * @see #setMaterialize(boolean)
	 * @generated
	 */
	boolean isSetMaterialize();

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference.
	 * @see #setQueries(QueriesType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDesignAggregations_Queries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Queries'"
	 * @generated
	 */
	QueriesType getQueries();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DesignAggregations#getQueries <em>Queries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queries</em>' containment reference.
	 * @see #getQueries()
	 * @generated
	 */
	void setQueries(QueriesType value);

} // DesignAggregations
