/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import javax.xml.datatype.Duration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proactive Caching</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getOnlineMode <em>Online Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getAggregationStorage <em>Aggregation Storage</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getSilenceInterval <em>Silence Interval</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getLatency <em>Latency</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getSilenceOverrideInterval <em>Silence Override Interval</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getForceRebuildInterval <em>Force Rebuild Interval</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#isEnabled <em>Enabled</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCaching()
 * @model extendedMetaData="name='ProactiveCaching' kind='elementOnly'"
 * @generated
 */
public interface ProactiveCaching extends EObject {
	/**
	 * Returns the value of the '<em><b>Online Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.OnlineModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Online Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.OnlineModeType
	 * @see #isSetOnlineMode()
	 * @see #unsetOnlineMode()
	 * @see #setOnlineMode(OnlineModeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCaching_OnlineMode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='OnlineMode'"
	 * @generated
	 */
	OnlineModeType getOnlineMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getOnlineMode <em>Online Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Online Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.OnlineModeType
	 * @see #isSetOnlineMode()
	 * @see #unsetOnlineMode()
	 * @see #getOnlineMode()
	 * @generated
	 */
	void setOnlineMode(OnlineModeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getOnlineMode <em>Online Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnlineMode()
	 * @see #getOnlineMode()
	 * @see #setOnlineMode(OnlineModeType)
	 * @generated
	 */
	void unsetOnlineMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getOnlineMode <em>Online Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Online Mode</em>' attribute is set.
	 * @see #unsetOnlineMode()
	 * @see #getOnlineMode()
	 * @see #setOnlineMode(OnlineModeType)
	 * @generated
	 */
	boolean isSetOnlineMode();

	/**
	 * Returns the value of the '<em><b>Aggregation Storage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.AggregationStorageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Storage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationStorageType
	 * @see #isSetAggregationStorage()
	 * @see #unsetAggregationStorage()
	 * @see #setAggregationStorage(AggregationStorageType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCaching_AggregationStorage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='AggregationStorage'"
	 * @generated
	 */
	AggregationStorageType getAggregationStorage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getAggregationStorage <em>Aggregation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Storage</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.AggregationStorageType
	 * @see #isSetAggregationStorage()
	 * @see #unsetAggregationStorage()
	 * @see #getAggregationStorage()
	 * @generated
	 */
	void setAggregationStorage(AggregationStorageType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getAggregationStorage <em>Aggregation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationStorage()
	 * @see #getAggregationStorage()
	 * @see #setAggregationStorage(AggregationStorageType)
	 * @generated
	 */
	void unsetAggregationStorage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getAggregationStorage <em>Aggregation Storage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Storage</em>' attribute is set.
	 * @see #unsetAggregationStorage()
	 * @see #getAggregationStorage()
	 * @see #setAggregationStorage(AggregationStorageType)
	 * @generated
	 */
	boolean isSetAggregationStorage();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ProactiveCachingBinding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCaching_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	ProactiveCachingBinding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ProactiveCachingBinding value);

	/**
	 * Returns the value of the '<em><b>Silence Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silence Interval</em>' attribute.
	 * @see #setSilenceInterval(Duration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCaching_SilenceInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='SilenceInterval'"
	 * @generated
	 */
	Duration getSilenceInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getSilenceInterval <em>Silence Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silence Interval</em>' attribute.
	 * @see #getSilenceInterval()
	 * @generated
	 */
	void setSilenceInterval(Duration value);

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(Duration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCaching_Latency()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='Latency'"
	 * @generated
	 */
	Duration getLatency();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(Duration value);

	/**
	 * Returns the value of the '<em><b>Silence Override Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silence Override Interval</em>' attribute.
	 * @see #setSilenceOverrideInterval(Duration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCaching_SilenceOverrideInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='SilenceOverrideInterval'"
	 * @generated
	 */
	Duration getSilenceOverrideInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getSilenceOverrideInterval <em>Silence Override Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silence Override Interval</em>' attribute.
	 * @see #getSilenceOverrideInterval()
	 * @generated
	 */
	void setSilenceOverrideInterval(Duration value);

	/**
	 * Returns the value of the '<em><b>Force Rebuild Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Rebuild Interval</em>' attribute.
	 * @see #setForceRebuildInterval(Duration)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCaching_ForceRebuildInterval()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Duration"
	 *        extendedMetaData="kind='element' name='ForceRebuildInterval'"
	 * @generated
	 */
	Duration getForceRebuildInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#getForceRebuildInterval <em>Force Rebuild Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Rebuild Interval</em>' attribute.
	 * @see #getForceRebuildInterval()
	 * @generated
	 */
	void setForceRebuildInterval(Duration value);

	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #setEnabled(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getProactiveCaching_Enabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Enabled'"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isSetEnabled()
	 * @see #unsetEnabled()
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	void unsetEnabled();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ProactiveCaching#isEnabled <em>Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enabled</em>' attribute is set.
	 * @see #unsetEnabled()
	 * @see #isEnabled()
	 * @see #setEnabled(boolean)
	 * @generated
	 */
	boolean isSetEnabled();

} // ProactiveCaching
