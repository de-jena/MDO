/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getTemplateCategory <em>Template Category</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getTemplateDescription <em>Template Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getDispatchLatency <em>Dispatch Latency</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getEventRetentionMode <em>Event Retention Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getMaxEventSize <em>Max Event Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getMaxMemory <em>Max Memory</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getMemoryPartitionMode <em>Memory Partition Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#isTrackCausality <em>Track Causality</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession()
 * @model extendedMetaData="name='event_session_._type' kind='elementOnly'"
 * @generated
 */
public interface EventSession extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Category</em>' attribute.
	 * @see #setTemplateCategory(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession_TemplateCategory()
	 * @model extendedMetaData="kind='element' name='templateCategory'"
	 * @generated
	 */
	String getTemplateCategory();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getTemplateCategory <em>Template Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Category</em>' attribute.
	 * @see #getTemplateCategory()
	 * @generated
	 */
	void setTemplateCategory(String value);

	/**
	 * Returns the value of the '<em><b>Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Name</em>' attribute.
	 * @see #setTemplateName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession_TemplateName()
	 * @model extendedMetaData="kind='element' name='templateName'"
	 * @generated
	 */
	String getTemplateName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getTemplateName <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Name</em>' attribute.
	 * @see #getTemplateName()
	 * @generated
	 */
	void setTemplateName(String value);

	/**
	 * Returns the value of the '<em><b>Template Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Description</em>' attribute.
	 * @see #setTemplateDescription(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession_TemplateDescription()
	 * @model extendedMetaData="kind='element' name='templateDescription'"
	 * @generated
	 */
	String getTemplateDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getTemplateDescription <em>Template Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Description</em>' attribute.
	 * @see #getTemplateDescription()
	 * @generated
	 */
	void setTemplateDescription(String value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession_Event()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event'"
	 * @generated
	 */
	EList<EObject> getEvent();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target'"
	 * @generated
	 */
	EList<EObject> getTarget();

	/**
	 * Returns the value of the '<em><b>Dispatch Latency</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispatch Latency</em>' attribute.
	 * @see #isSetDispatchLatency()
	 * @see #unsetDispatchLatency()
	 * @see #setDispatchLatency(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession_DispatchLatency()
	 * @model default="30" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='dispatchLatency'"
	 * @generated
	 */
	long getDispatchLatency();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getDispatchLatency <em>Dispatch Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispatch Latency</em>' attribute.
	 * @see #isSetDispatchLatency()
	 * @see #unsetDispatchLatency()
	 * @see #getDispatchLatency()
	 * @generated
	 */
	void setDispatchLatency(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getDispatchLatency <em>Dispatch Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDispatchLatency()
	 * @see #getDispatchLatency()
	 * @see #setDispatchLatency(long)
	 * @generated
	 */
	void unsetDispatchLatency();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getDispatchLatency <em>Dispatch Latency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dispatch Latency</em>' attribute is set.
	 * @see #unsetDispatchLatency()
	 * @see #getDispatchLatency()
	 * @see #setDispatchLatency(long)
	 * @generated
	 */
	boolean isSetDispatchLatency();

	/**
	 * Returns the value of the '<em><b>Event Retention Mode</b></em>' attribute.
	 * The default value is <code>"allowSingleEventLoss"</code>.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Retention Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes
	 * @see #isSetEventRetentionMode()
	 * @see #unsetEventRetentionMode()
	 * @see #setEventRetentionMode(RetentionModes)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession_EventRetentionMode()
	 * @model default="allowSingleEventLoss" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='eventRetentionMode'"
	 * @generated
	 */
	RetentionModes getEventRetentionMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getEventRetentionMode <em>Event Retention Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Retention Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes
	 * @see #isSetEventRetentionMode()
	 * @see #unsetEventRetentionMode()
	 * @see #getEventRetentionMode()
	 * @generated
	 */
	void setEventRetentionMode(RetentionModes value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getEventRetentionMode <em>Event Retention Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventRetentionMode()
	 * @see #getEventRetentionMode()
	 * @see #setEventRetentionMode(RetentionModes)
	 * @generated
	 */
	void unsetEventRetentionMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getEventRetentionMode <em>Event Retention Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Retention Mode</em>' attribute is set.
	 * @see #unsetEventRetentionMode()
	 * @see #getEventRetentionMode()
	 * @see #setEventRetentionMode(RetentionModes)
	 * @generated
	 */
	boolean isSetEventRetentionMode();

	/**
	 * Returns the value of the '<em><b>Max Event Size</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Event Size</em>' attribute.
	 * @see #isSetMaxEventSize()
	 * @see #unsetMaxEventSize()
	 * @see #setMaxEventSize(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession_MaxEventSize()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt" required="true"
	 *        extendedMetaData="kind='attribute' name='maxEventSize'"
	 * @generated
	 */
	long getMaxEventSize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getMaxEventSize <em>Max Event Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Event Size</em>' attribute.
	 * @see #isSetMaxEventSize()
	 * @see #unsetMaxEventSize()
	 * @see #getMaxEventSize()
	 * @generated
	 */
	void setMaxEventSize(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getMaxEventSize <em>Max Event Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxEventSize()
	 * @see #getMaxEventSize()
	 * @see #setMaxEventSize(long)
	 * @generated
	 */
	void unsetMaxEventSize();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getMaxEventSize <em>Max Event Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Event Size</em>' attribute is set.
	 * @see #unsetMaxEventSize()
	 * @see #getMaxEventSize()
	 * @see #setMaxEventSize(long)
	 * @generated
	 */
	boolean isSetMaxEventSize();

	/**
	 * Returns the value of the '<em><b>Max Memory</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Memory</em>' attribute.
	 * @see #isSetMaxMemory()
	 * @see #unsetMaxMemory()
	 * @see #setMaxMemory(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession_MaxMemory()
	 * @model default="4" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedLong"
	 *        extendedMetaData="kind='attribute' name='maxMemory'"
	 * @generated
	 */
	BigInteger getMaxMemory();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getMaxMemory <em>Max Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Memory</em>' attribute.
	 * @see #isSetMaxMemory()
	 * @see #unsetMaxMemory()
	 * @see #getMaxMemory()
	 * @generated
	 */
	void setMaxMemory(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getMaxMemory <em>Max Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxMemory()
	 * @see #getMaxMemory()
	 * @see #setMaxMemory(BigInteger)
	 * @generated
	 */
	void unsetMaxMemory();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getMaxMemory <em>Max Memory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Memory</em>' attribute is set.
	 * @see #unsetMaxMemory()
	 * @see #getMaxMemory()
	 * @see #setMaxMemory(BigInteger)
	 * @generated
	 */
	boolean isSetMaxMemory();

	/**
	 * Returns the value of the '<em><b>Memory Partition Mode</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Partition Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes
	 * @see #isSetMemoryPartitionMode()
	 * @see #unsetMemoryPartitionMode()
	 * @see #setMemoryPartitionMode(PartitionModes)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession_MemoryPartitionMode()
	 * @model default="none" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='memoryPartitionMode'"
	 * @generated
	 */
	PartitionModes getMemoryPartitionMode();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getMemoryPartitionMode <em>Memory Partition Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Partition Mode</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes
	 * @see #isSetMemoryPartitionMode()
	 * @see #unsetMemoryPartitionMode()
	 * @see #getMemoryPartitionMode()
	 * @generated
	 */
	void setMemoryPartitionMode(PartitionModes value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getMemoryPartitionMode <em>Memory Partition Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMemoryPartitionMode()
	 * @see #getMemoryPartitionMode()
	 * @see #setMemoryPartitionMode(PartitionModes)
	 * @generated
	 */
	void unsetMemoryPartitionMode();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getMemoryPartitionMode <em>Memory Partition Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Memory Partition Mode</em>' attribute is set.
	 * @see #unsetMemoryPartitionMode()
	 * @see #getMemoryPartitionMode()
	 * @see #setMemoryPartitionMode(PartitionModes)
	 * @generated
	 */
	boolean isSetMemoryPartitionMode();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession_Name()
	 * @model required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Track Causality</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Causality</em>' attribute.
	 * @see #isSetTrackCausality()
	 * @see #unsetTrackCausality()
	 * @see #setTrackCausality(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getEventSession_TrackCausality()
	 * @model default="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='trackCausality'"
	 * @generated
	 */
	boolean isTrackCausality();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#isTrackCausality <em>Track Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track Causality</em>' attribute.
	 * @see #isSetTrackCausality()
	 * @see #unsetTrackCausality()
	 * @see #isTrackCausality()
	 * @generated
	 */
	void setTrackCausality(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#isTrackCausality <em>Track Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrackCausality()
	 * @see #isTrackCausality()
	 * @see #setTrackCausality(boolean)
	 * @generated
	 */
	void unsetTrackCausality();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.EventSession#isTrackCausality <em>Track Causality</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Track Causality</em>' attribute is set.
	 * @see #unsetTrackCausality()
	 * @see #isTrackCausality()
	 * @see #setTrackCausality(boolean)
	 * @generated
	 */
	boolean isSetTrackCausality();

} // EventSession
