/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getLogFileName <em>Log File Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isLogFileAppend <em>Log File Append</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getLogFileSize <em>Log File Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isAudit <em>Audit</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isLogFileRollover <em>Log File Rollover</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isAutoRestart <em>Auto Restart</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getStopTime <em>Stop Time</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace()
 * @model extendedMetaData="name='Trace' kind='elementOnly'"
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Created Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Timestamp</em>' attribute.
	 * @see #setCreatedTimestamp(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_CreatedTimestamp()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='CreatedTimestamp'"
	 * @generated
	 */
	XMLGregorianCalendar getCreatedTimestamp();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getCreatedTimestamp <em>Created Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Timestamp</em>' attribute.
	 * @see #getCreatedTimestamp()
	 * @generated
	 */
	void setCreatedTimestamp(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Schema Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Schema Update</em>' attribute.
	 * @see #setLastSchemaUpdate(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_LastSchemaUpdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='LastSchemaUpdate'"
	 * @generated
	 */
	XMLGregorianCalendar getLastSchemaUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getLastSchemaUpdate <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Schema Update</em>' attribute.
	 * @see #getLastSchemaUpdate()
	 * @generated
	 */
	void setLastSchemaUpdate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType21)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType21 getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType21 value);

	/**
	 * Returns the value of the '<em><b>Log File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log File Name</em>' attribute.
	 * @see #setLogFileName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_LogFileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LogFileName'"
	 * @generated
	 */
	String getLogFileName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getLogFileName <em>Log File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log File Name</em>' attribute.
	 * @see #getLogFileName()
	 * @generated
	 */
	void setLogFileName(String value);

	/**
	 * Returns the value of the '<em><b>Log File Append</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log File Append</em>' attribute.
	 * @see #isSetLogFileAppend()
	 * @see #unsetLogFileAppend()
	 * @see #setLogFileAppend(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_LogFileAppend()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='LogFileAppend'"
	 * @generated
	 */
	boolean isLogFileAppend();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isLogFileAppend <em>Log File Append</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log File Append</em>' attribute.
	 * @see #isSetLogFileAppend()
	 * @see #unsetLogFileAppend()
	 * @see #isLogFileAppend()
	 * @generated
	 */
	void setLogFileAppend(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isLogFileAppend <em>Log File Append</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLogFileAppend()
	 * @see #isLogFileAppend()
	 * @see #setLogFileAppend(boolean)
	 * @generated
	 */
	void unsetLogFileAppend();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isLogFileAppend <em>Log File Append</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Log File Append</em>' attribute is set.
	 * @see #unsetLogFileAppend()
	 * @see #isLogFileAppend()
	 * @see #setLogFileAppend(boolean)
	 * @generated
	 */
	boolean isSetLogFileAppend();

	/**
	 * Returns the value of the '<em><b>Log File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log File Size</em>' attribute.
	 * @see #isSetLogFileSize()
	 * @see #unsetLogFileSize()
	 * @see #setLogFileSize(long)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_LogFileSize()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 *        extendedMetaData="kind='element' name='LogFileSize'"
	 * @generated
	 */
	long getLogFileSize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getLogFileSize <em>Log File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log File Size</em>' attribute.
	 * @see #isSetLogFileSize()
	 * @see #unsetLogFileSize()
	 * @see #getLogFileSize()
	 * @generated
	 */
	void setLogFileSize(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getLogFileSize <em>Log File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLogFileSize()
	 * @see #getLogFileSize()
	 * @see #setLogFileSize(long)
	 * @generated
	 */
	void unsetLogFileSize();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getLogFileSize <em>Log File Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Log File Size</em>' attribute is set.
	 * @see #unsetLogFileSize()
	 * @see #getLogFileSize()
	 * @see #setLogFileSize(long)
	 * @generated
	 */
	boolean isSetLogFileSize();

	/**
	 * Returns the value of the '<em><b>Audit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audit</em>' attribute.
	 * @see #isSetAudit()
	 * @see #unsetAudit()
	 * @see #setAudit(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_Audit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='Audit'"
	 * @generated
	 */
	boolean isAudit();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isAudit <em>Audit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit</em>' attribute.
	 * @see #isSetAudit()
	 * @see #unsetAudit()
	 * @see #isAudit()
	 * @generated
	 */
	void setAudit(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isAudit <em>Audit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAudit()
	 * @see #isAudit()
	 * @see #setAudit(boolean)
	 * @generated
	 */
	void unsetAudit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isAudit <em>Audit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Audit</em>' attribute is set.
	 * @see #unsetAudit()
	 * @see #isAudit()
	 * @see #setAudit(boolean)
	 * @generated
	 */
	boolean isSetAudit();

	/**
	 * Returns the value of the '<em><b>Log File Rollover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log File Rollover</em>' attribute.
	 * @see #isSetLogFileRollover()
	 * @see #unsetLogFileRollover()
	 * @see #setLogFileRollover(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_LogFileRollover()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='LogFileRollover'"
	 * @generated
	 */
	boolean isLogFileRollover();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isLogFileRollover <em>Log File Rollover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log File Rollover</em>' attribute.
	 * @see #isSetLogFileRollover()
	 * @see #unsetLogFileRollover()
	 * @see #isLogFileRollover()
	 * @generated
	 */
	void setLogFileRollover(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isLogFileRollover <em>Log File Rollover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLogFileRollover()
	 * @see #isLogFileRollover()
	 * @see #setLogFileRollover(boolean)
	 * @generated
	 */
	void unsetLogFileRollover();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isLogFileRollover <em>Log File Rollover</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Log File Rollover</em>' attribute is set.
	 * @see #unsetLogFileRollover()
	 * @see #isLogFileRollover()
	 * @see #setLogFileRollover(boolean)
	 * @generated
	 */
	boolean isSetLogFileRollover();

	/**
	 * Returns the value of the '<em><b>Auto Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Restart</em>' attribute.
	 * @see #isSetAutoRestart()
	 * @see #unsetAutoRestart()
	 * @see #setAutoRestart(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_AutoRestart()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='AutoRestart'"
	 * @generated
	 */
	boolean isAutoRestart();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isAutoRestart <em>Auto Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Restart</em>' attribute.
	 * @see #isSetAutoRestart()
	 * @see #unsetAutoRestart()
	 * @see #isAutoRestart()
	 * @generated
	 */
	void setAutoRestart(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isAutoRestart <em>Auto Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoRestart()
	 * @see #isAutoRestart()
	 * @see #setAutoRestart(boolean)
	 * @generated
	 */
	void unsetAutoRestart();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#isAutoRestart <em>Auto Restart</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Restart</em>' attribute is set.
	 * @see #unsetAutoRestart()
	 * @see #isAutoRestart()
	 * @see #setAutoRestart(boolean)
	 * @generated
	 */
	boolean isSetAutoRestart();

	/**
	 * Returns the value of the '<em><b>Stop Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Time</em>' attribute.
	 * @see #setStopTime(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_StopTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='StopTime'"
	 * @generated
	 */
	XMLGregorianCalendar getStopTime();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getStopTime <em>Stop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Time</em>' attribute.
	 * @see #getStopTime()
	 * @generated
	 */
	void setStopTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(TraceFilter)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_Filter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Filter'"
	 * @generated
	 */
	TraceFilter getFilter();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(TraceFilter value);

	/**
	 * Returns the value of the '<em><b>Event Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Type</em>' containment reference.
	 * @see #setEventType(EventTypeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTrace_EventType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EventType' namespace='##targetNamespace'"
	 * @generated
	 */
	EventTypeType getEventType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.Trace#getEventType <em>Event Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Type</em>' containment reference.
	 * @see #getEventType()
	 * @generated
	 */
	void setEventType(EventTypeType value);

} // Trace
