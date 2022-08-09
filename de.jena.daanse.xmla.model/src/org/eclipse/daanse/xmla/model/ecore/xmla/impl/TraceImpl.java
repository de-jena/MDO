/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType;
import org.eclipse.daanse.xmla.model.ecore.xmla.EventTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.Trace;
import org.eclipse.daanse.xmla.model.ecore.xmla.TraceFilter;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#getCreatedTimestamp <em>Created Timestamp</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#getLastSchemaUpdate <em>Last Schema Update</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#getLogFileName <em>Log File Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#isLogFileAppend <em>Log File Append</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#getLogFileSize <em>Log File Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#isAudit <em>Audit</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#isLogFileRollover <em>Log File Rollover</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#isAutoRestart <em>Auto Restart</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#getStopTime <em>Stop Time</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TraceImpl#getEventType <em>Event Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraceImpl extends MinimalEObjectImpl.Container implements Trace {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String iD = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedTimestamp() <em>Created Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATED_TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedTimestamp() <em>Created Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedTimestamp()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar createdTimestamp = CREATED_TIMESTAMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastSchemaUpdate() <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSchemaUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_SCHEMA_UPDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastSchemaUpdate() <em>Last Schema Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastSchemaUpdate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastSchemaUpdate = LAST_SCHEMA_UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType annotations;

	/**
	 * The default value of the '{@link #getLogFileName() <em>Log File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String LOG_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogFileName() <em>Log File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFileName()
	 * @generated
	 * @ordered
	 */
	protected String logFileName = LOG_FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogFileAppend() <em>Log File Append</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogFileAppend()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOG_FILE_APPEND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLogFileAppend() <em>Log File Append</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogFileAppend()
	 * @generated
	 * @ordered
	 */
	protected boolean logFileAppend = LOG_FILE_APPEND_EDEFAULT;

	/**
	 * This is true if the Log File Append attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean logFileAppendESet;

	/**
	 * The default value of the '{@link #getLogFileSize() <em>Log File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final long LOG_FILE_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLogFileSize() <em>Log File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogFileSize()
	 * @generated
	 * @ordered
	 */
	protected long logFileSize = LOG_FILE_SIZE_EDEFAULT;

	/**
	 * This is true if the Log File Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean logFileSizeESet;

	/**
	 * The default value of the '{@link #isAudit() <em>Audit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAudit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUDIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAudit() <em>Audit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAudit()
	 * @generated
	 * @ordered
	 */
	protected boolean audit = AUDIT_EDEFAULT;

	/**
	 * This is true if the Audit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean auditESet;

	/**
	 * The default value of the '{@link #isLogFileRollover() <em>Log File Rollover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogFileRollover()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOG_FILE_ROLLOVER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLogFileRollover() <em>Log File Rollover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogFileRollover()
	 * @generated
	 * @ordered
	 */
	protected boolean logFileRollover = LOG_FILE_ROLLOVER_EDEFAULT;

	/**
	 * This is true if the Log File Rollover attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean logFileRolloverESet;

	/**
	 * The default value of the '{@link #isAutoRestart() <em>Auto Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoRestart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_RESTART_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoRestart() <em>Auto Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoRestart()
	 * @generated
	 * @ordered
	 */
	protected boolean autoRestart = AUTO_RESTART_EDEFAULT;

	/**
	 * This is true if the Auto Restart attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoRestartESet;

	/**
	 * The default value of the '{@link #getStopTime() <em>Stop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar STOP_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopTime() <em>Stop Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar stopTime = STOP_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected TraceFilter filter;

	/**
	 * The cached value of the '{@link #getEventType() <em>Event Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventType()
	 * @generated
	 * @ordered
	 */
	protected EventTypeType eventType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = iD;
		iD = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__ID, oldID, iD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreatedTimestamp() {
		return createdTimestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedTimestamp(XMLGregorianCalendar newCreatedTimestamp) {
		XMLGregorianCalendar oldCreatedTimestamp = createdTimestamp;
		createdTimestamp = newCreatedTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__CREATED_TIMESTAMP, oldCreatedTimestamp, createdTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastSchemaUpdate() {
		return lastSchemaUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSchemaUpdate(XMLGregorianCalendar newLastSchemaUpdate) {
		XMLGregorianCalendar oldLastSchemaUpdate = lastSchemaUpdate;
		lastSchemaUpdate = newLastSchemaUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__LAST_SCHEMA_UPDATE, oldLastSchemaUpdate, lastSchemaUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType newAnnotations, NotificationChain msgs) {
		AnnotationsType oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLogFileName() {
		return logFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogFileName(String newLogFileName) {
		String oldLogFileName = logFileName;
		logFileName = newLogFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__LOG_FILE_NAME, oldLogFileName, logFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogFileAppend() {
		return logFileAppend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogFileAppend(boolean newLogFileAppend) {
		boolean oldLogFileAppend = logFileAppend;
		logFileAppend = newLogFileAppend;
		boolean oldLogFileAppendESet = logFileAppendESet;
		logFileAppendESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__LOG_FILE_APPEND, oldLogFileAppend, logFileAppend, !oldLogFileAppendESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLogFileAppend() {
		boolean oldLogFileAppend = logFileAppend;
		boolean oldLogFileAppendESet = logFileAppendESet;
		logFileAppend = LOG_FILE_APPEND_EDEFAULT;
		logFileAppendESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.TRACE__LOG_FILE_APPEND, oldLogFileAppend, LOG_FILE_APPEND_EDEFAULT, oldLogFileAppendESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLogFileAppend() {
		return logFileAppendESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLogFileSize() {
		return logFileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogFileSize(long newLogFileSize) {
		long oldLogFileSize = logFileSize;
		logFileSize = newLogFileSize;
		boolean oldLogFileSizeESet = logFileSizeESet;
		logFileSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__LOG_FILE_SIZE, oldLogFileSize, logFileSize, !oldLogFileSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLogFileSize() {
		long oldLogFileSize = logFileSize;
		boolean oldLogFileSizeESet = logFileSizeESet;
		logFileSize = LOG_FILE_SIZE_EDEFAULT;
		logFileSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.TRACE__LOG_FILE_SIZE, oldLogFileSize, LOG_FILE_SIZE_EDEFAULT, oldLogFileSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLogFileSize() {
		return logFileSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAudit() {
		return audit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudit(boolean newAudit) {
		boolean oldAudit = audit;
		audit = newAudit;
		boolean oldAuditESet = auditESet;
		auditESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__AUDIT, oldAudit, audit, !oldAuditESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAudit() {
		boolean oldAudit = audit;
		boolean oldAuditESet = auditESet;
		audit = AUDIT_EDEFAULT;
		auditESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.TRACE__AUDIT, oldAudit, AUDIT_EDEFAULT, oldAuditESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAudit() {
		return auditESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogFileRollover() {
		return logFileRollover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogFileRollover(boolean newLogFileRollover) {
		boolean oldLogFileRollover = logFileRollover;
		logFileRollover = newLogFileRollover;
		boolean oldLogFileRolloverESet = logFileRolloverESet;
		logFileRolloverESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__LOG_FILE_ROLLOVER, oldLogFileRollover, logFileRollover, !oldLogFileRolloverESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLogFileRollover() {
		boolean oldLogFileRollover = logFileRollover;
		boolean oldLogFileRolloverESet = logFileRolloverESet;
		logFileRollover = LOG_FILE_ROLLOVER_EDEFAULT;
		logFileRolloverESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.TRACE__LOG_FILE_ROLLOVER, oldLogFileRollover, LOG_FILE_ROLLOVER_EDEFAULT, oldLogFileRolloverESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLogFileRollover() {
		return logFileRolloverESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoRestart() {
		return autoRestart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoRestart(boolean newAutoRestart) {
		boolean oldAutoRestart = autoRestart;
		autoRestart = newAutoRestart;
		boolean oldAutoRestartESet = autoRestartESet;
		autoRestartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__AUTO_RESTART, oldAutoRestart, autoRestart, !oldAutoRestartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoRestart() {
		boolean oldAutoRestart = autoRestart;
		boolean oldAutoRestartESet = autoRestartESet;
		autoRestart = AUTO_RESTART_EDEFAULT;
		autoRestartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.TRACE__AUTO_RESTART, oldAutoRestart, AUTO_RESTART_EDEFAULT, oldAutoRestartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoRestart() {
		return autoRestartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getStopTime() {
		return stopTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopTime(XMLGregorianCalendar newStopTime) {
		XMLGregorianCalendar oldStopTime = stopTime;
		stopTime = newStopTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__STOP_TIME, oldStopTime, stopTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceFilter getFilter() {
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(TraceFilter newFilter, NotificationChain msgs) {
		TraceFilter oldFilter = filter;
		filter = newFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__FILTER, oldFilter, newFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(TraceFilter newFilter) {
		if (newFilter != filter) {
			NotificationChain msgs = null;
			if (filter != null)
				msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE__FILTER, null, msgs);
			if (newFilter != null)
				msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE__FILTER, null, msgs);
			msgs = basicSetFilter(newFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__FILTER, newFilter, newFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTypeType getEventType() {
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventType(EventTypeType newEventType, NotificationChain msgs) {
		EventTypeType oldEventType = eventType;
		eventType = newEventType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__EVENT_TYPE, oldEventType, newEventType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventType(EventTypeType newEventType) {
		if (newEventType != eventType) {
			NotificationChain msgs = null;
			if (eventType != null)
				msgs = ((InternalEObject)eventType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE__EVENT_TYPE, null, msgs);
			if (newEventType != null)
				msgs = ((InternalEObject)newEventType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.TRACE__EVENT_TYPE, null, msgs);
			msgs = basicSetEventType(newEventType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TRACE__EVENT_TYPE, newEventType, newEventType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.TRACE__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
			case XmlaPackage.TRACE__FILTER:
				return basicSetFilter(null, msgs);
			case XmlaPackage.TRACE__EVENT_TYPE:
				return basicSetEventType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.TRACE__NAME:
				return getName();
			case XmlaPackage.TRACE__ID:
				return getID();
			case XmlaPackage.TRACE__CREATED_TIMESTAMP:
				return getCreatedTimestamp();
			case XmlaPackage.TRACE__LAST_SCHEMA_UPDATE:
				return getLastSchemaUpdate();
			case XmlaPackage.TRACE__DESCRIPTION:
				return getDescription();
			case XmlaPackage.TRACE__ANNOTATIONS:
				return getAnnotations();
			case XmlaPackage.TRACE__LOG_FILE_NAME:
				return getLogFileName();
			case XmlaPackage.TRACE__LOG_FILE_APPEND:
				return isLogFileAppend();
			case XmlaPackage.TRACE__LOG_FILE_SIZE:
				return getLogFileSize();
			case XmlaPackage.TRACE__AUDIT:
				return isAudit();
			case XmlaPackage.TRACE__LOG_FILE_ROLLOVER:
				return isLogFileRollover();
			case XmlaPackage.TRACE__AUTO_RESTART:
				return isAutoRestart();
			case XmlaPackage.TRACE__STOP_TIME:
				return getStopTime();
			case XmlaPackage.TRACE__FILTER:
				return getFilter();
			case XmlaPackage.TRACE__EVENT_TYPE:
				return getEventType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.TRACE__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.TRACE__ID:
				setID((String)newValue);
				return;
			case XmlaPackage.TRACE__CREATED_TIMESTAMP:
				setCreatedTimestamp((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.TRACE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.TRACE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case XmlaPackage.TRACE__ANNOTATIONS:
				setAnnotations((AnnotationsType)newValue);
				return;
			case XmlaPackage.TRACE__LOG_FILE_NAME:
				setLogFileName((String)newValue);
				return;
			case XmlaPackage.TRACE__LOG_FILE_APPEND:
				setLogFileAppend((Boolean)newValue);
				return;
			case XmlaPackage.TRACE__LOG_FILE_SIZE:
				setLogFileSize((Long)newValue);
				return;
			case XmlaPackage.TRACE__AUDIT:
				setAudit((Boolean)newValue);
				return;
			case XmlaPackage.TRACE__LOG_FILE_ROLLOVER:
				setLogFileRollover((Boolean)newValue);
				return;
			case XmlaPackage.TRACE__AUTO_RESTART:
				setAutoRestart((Boolean)newValue);
				return;
			case XmlaPackage.TRACE__STOP_TIME:
				setStopTime((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.TRACE__FILTER:
				setFilter((TraceFilter)newValue);
				return;
			case XmlaPackage.TRACE__EVENT_TYPE:
				setEventType((EventTypeType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmlaPackage.TRACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.TRACE__ID:
				setID(ID_EDEFAULT);
				return;
			case XmlaPackage.TRACE__CREATED_TIMESTAMP:
				setCreatedTimestamp(CREATED_TIMESTAMP_EDEFAULT);
				return;
			case XmlaPackage.TRACE__LAST_SCHEMA_UPDATE:
				setLastSchemaUpdate(LAST_SCHEMA_UPDATE_EDEFAULT);
				return;
			case XmlaPackage.TRACE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.TRACE__ANNOTATIONS:
				setAnnotations((AnnotationsType)null);
				return;
			case XmlaPackage.TRACE__LOG_FILE_NAME:
				setLogFileName(LOG_FILE_NAME_EDEFAULT);
				return;
			case XmlaPackage.TRACE__LOG_FILE_APPEND:
				unsetLogFileAppend();
				return;
			case XmlaPackage.TRACE__LOG_FILE_SIZE:
				unsetLogFileSize();
				return;
			case XmlaPackage.TRACE__AUDIT:
				unsetAudit();
				return;
			case XmlaPackage.TRACE__LOG_FILE_ROLLOVER:
				unsetLogFileRollover();
				return;
			case XmlaPackage.TRACE__AUTO_RESTART:
				unsetAutoRestart();
				return;
			case XmlaPackage.TRACE__STOP_TIME:
				setStopTime(STOP_TIME_EDEFAULT);
				return;
			case XmlaPackage.TRACE__FILTER:
				setFilter((TraceFilter)null);
				return;
			case XmlaPackage.TRACE__EVENT_TYPE:
				setEventType((EventTypeType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmlaPackage.TRACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.TRACE__ID:
				return ID_EDEFAULT == null ? iD != null : !ID_EDEFAULT.equals(iD);
			case XmlaPackage.TRACE__CREATED_TIMESTAMP:
				return CREATED_TIMESTAMP_EDEFAULT == null ? createdTimestamp != null : !CREATED_TIMESTAMP_EDEFAULT.equals(createdTimestamp);
			case XmlaPackage.TRACE__LAST_SCHEMA_UPDATE:
				return LAST_SCHEMA_UPDATE_EDEFAULT == null ? lastSchemaUpdate != null : !LAST_SCHEMA_UPDATE_EDEFAULT.equals(lastSchemaUpdate);
			case XmlaPackage.TRACE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case XmlaPackage.TRACE__ANNOTATIONS:
				return annotations != null;
			case XmlaPackage.TRACE__LOG_FILE_NAME:
				return LOG_FILE_NAME_EDEFAULT == null ? logFileName != null : !LOG_FILE_NAME_EDEFAULT.equals(logFileName);
			case XmlaPackage.TRACE__LOG_FILE_APPEND:
				return isSetLogFileAppend();
			case XmlaPackage.TRACE__LOG_FILE_SIZE:
				return isSetLogFileSize();
			case XmlaPackage.TRACE__AUDIT:
				return isSetAudit();
			case XmlaPackage.TRACE__LOG_FILE_ROLLOVER:
				return isSetLogFileRollover();
			case XmlaPackage.TRACE__AUTO_RESTART:
				return isSetAutoRestart();
			case XmlaPackage.TRACE__STOP_TIME:
				return STOP_TIME_EDEFAULT == null ? stopTime != null : !STOP_TIME_EDEFAULT.equals(stopTime);
			case XmlaPackage.TRACE__FILTER:
				return filter != null;
			case XmlaPackage.TRACE__EVENT_TYPE:
				return eventType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", iD: ");
		result.append(iD);
		result.append(", createdTimestamp: ");
		result.append(createdTimestamp);
		result.append(", lastSchemaUpdate: ");
		result.append(lastSchemaUpdate);
		result.append(", description: ");
		result.append(description);
		result.append(", logFileName: ");
		result.append(logFileName);
		result.append(", logFileAppend: ");
		if (logFileAppendESet) result.append(logFileAppend); else result.append("<unset>");
		result.append(", logFileSize: ");
		if (logFileSizeESet) result.append(logFileSize); else result.append("<unset>");
		result.append(", audit: ");
		if (auditESet) result.append(audit); else result.append("<unset>");
		result.append(", logFileRollover: ");
		if (logFileRolloverESet) result.append(logFileRollover); else result.append("<unset>");
		result.append(", autoRestart: ");
		if (autoRestartESet) result.append(autoRestart); else result.append("<unset>");
		result.append(", stopTime: ");
		result.append(stopTime);
		result.append(')');
		return result.toString();
	}

} //TraceImpl
