/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.daanse.xmla.model.ecore.xmla.EventSession;
import org.eclipse.daanse.xmla.model.ecore.xmla.PartitionModes;
import org.eclipse.daanse.xmla.model.ecore.xmla.RetentionModes;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionImpl#getTemplateCategory <em>Template Category</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionImpl#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionImpl#getTemplateDescription <em>Template Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionImpl#getDispatchLatency <em>Dispatch Latency</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionImpl#getEventRetentionMode <em>Event Retention Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionImpl#getMaxEventSize <em>Max Event Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionImpl#getMaxMemory <em>Max Memory</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionImpl#getMemoryPartitionMode <em>Memory Partition Mode</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.EventSessionImpl#isTrackCausality <em>Track Causality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventSessionImpl extends MinimalEObjectImpl.Container implements EventSession {
	/**
	 * The default value of the '{@link #getTemplateCategory() <em>Template Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateCategory() <em>Template Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateCategory()
	 * @generated
	 * @ordered
	 */
	protected String templateCategory = TEMPLATE_CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected String templateName = TEMPLATE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateDescription() <em>Template Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateDescription() <em>Template Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateDescription()
	 * @generated
	 * @ordered
	 */
	protected String templateDescription = TEMPLATE_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> event;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> target;

	/**
	 * The default value of the '{@link #getDispatchLatency() <em>Dispatch Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchLatency()
	 * @generated
	 * @ordered
	 */
	protected static final long DISPATCH_LATENCY_EDEFAULT = 30L;

	/**
	 * The cached value of the '{@link #getDispatchLatency() <em>Dispatch Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatchLatency()
	 * @generated
	 * @ordered
	 */
	protected long dispatchLatency = DISPATCH_LATENCY_EDEFAULT;

	/**
	 * This is true if the Dispatch Latency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dispatchLatencyESet;

	/**
	 * The default value of the '{@link #getEventRetentionMode() <em>Event Retention Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventRetentionMode()
	 * @generated
	 * @ordered
	 */
	protected static final RetentionModes EVENT_RETENTION_MODE_EDEFAULT = RetentionModes.ALLOW_SINGLE_EVENT_LOSS;

	/**
	 * The cached value of the '{@link #getEventRetentionMode() <em>Event Retention Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventRetentionMode()
	 * @generated
	 * @ordered
	 */
	protected RetentionModes eventRetentionMode = EVENT_RETENTION_MODE_EDEFAULT;

	/**
	 * This is true if the Event Retention Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eventRetentionModeESet;

	/**
	 * The default value of the '{@link #getMaxEventSize() <em>Max Event Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEventSize()
	 * @generated
	 * @ordered
	 */
	protected static final long MAX_EVENT_SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMaxEventSize() <em>Max Event Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxEventSize()
	 * @generated
	 * @ordered
	 */
	protected long maxEventSize = MAX_EVENT_SIZE_EDEFAULT;

	/**
	 * This is true if the Max Event Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxEventSizeESet;

	/**
	 * The default value of the '{@link #getMaxMemory() <em>Max Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMemory()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_MEMORY_EDEFAULT = new BigInteger("4");

	/**
	 * The cached value of the '{@link #getMaxMemory() <em>Max Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMemory()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxMemory = MAX_MEMORY_EDEFAULT;

	/**
	 * This is true if the Max Memory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxMemoryESet;

	/**
	 * The default value of the '{@link #getMemoryPartitionMode() <em>Memory Partition Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryPartitionMode()
	 * @generated
	 * @ordered
	 */
	protected static final PartitionModes MEMORY_PARTITION_MODE_EDEFAULT = PartitionModes.NONE;

	/**
	 * The cached value of the '{@link #getMemoryPartitionMode() <em>Memory Partition Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryPartitionMode()
	 * @generated
	 * @ordered
	 */
	protected PartitionModes memoryPartitionMode = MEMORY_PARTITION_MODE_EDEFAULT;

	/**
	 * This is true if the Memory Partition Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean memoryPartitionModeESet;

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
	 * The default value of the '{@link #isTrackCausality() <em>Track Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrackCausality()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRACK_CAUSALITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrackCausality() <em>Track Causality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrackCausality()
	 * @generated
	 * @ordered
	 */
	protected boolean trackCausality = TRACK_CAUSALITY_EDEFAULT;

	/**
	 * This is true if the Track Causality attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trackCausalityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.EVENT_SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateCategory() {
		return templateCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateCategory(String newTemplateCategory) {
		String oldTemplateCategory = templateCategory;
		templateCategory = newTemplateCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_SESSION__TEMPLATE_CATEGORY, oldTemplateCategory, templateCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateName(String newTemplateName) {
		String oldTemplateName = templateName;
		templateName = newTemplateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_SESSION__TEMPLATE_NAME, oldTemplateName, templateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateDescription() {
		return templateDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateDescription(String newTemplateDescription) {
		String oldTemplateDescription = templateDescription;
		templateDescription = newTemplateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_SESSION__TEMPLATE_DESCRIPTION, oldTemplateDescription, templateDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEvent() {
		if (event == null) {
			event = new EObjectContainmentEList<EObject>(EObject.class, this, XmlaPackage.EVENT_SESSION__EVENT);
		}
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<EObject>(EObject.class, this, XmlaPackage.EVENT_SESSION__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDispatchLatency() {
		return dispatchLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDispatchLatency(long newDispatchLatency) {
		long oldDispatchLatency = dispatchLatency;
		dispatchLatency = newDispatchLatency;
		boolean oldDispatchLatencyESet = dispatchLatencyESet;
		dispatchLatencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_SESSION__DISPATCH_LATENCY, oldDispatchLatency, dispatchLatency, !oldDispatchLatencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDispatchLatency() {
		long oldDispatchLatency = dispatchLatency;
		boolean oldDispatchLatencyESet = dispatchLatencyESet;
		dispatchLatency = DISPATCH_LATENCY_EDEFAULT;
		dispatchLatencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.EVENT_SESSION__DISPATCH_LATENCY, oldDispatchLatency, DISPATCH_LATENCY_EDEFAULT, oldDispatchLatencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDispatchLatency() {
		return dispatchLatencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetentionModes getEventRetentionMode() {
		return eventRetentionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventRetentionMode(RetentionModes newEventRetentionMode) {
		RetentionModes oldEventRetentionMode = eventRetentionMode;
		eventRetentionMode = newEventRetentionMode == null ? EVENT_RETENTION_MODE_EDEFAULT : newEventRetentionMode;
		boolean oldEventRetentionModeESet = eventRetentionModeESet;
		eventRetentionModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_SESSION__EVENT_RETENTION_MODE, oldEventRetentionMode, eventRetentionMode, !oldEventRetentionModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEventRetentionMode() {
		RetentionModes oldEventRetentionMode = eventRetentionMode;
		boolean oldEventRetentionModeESet = eventRetentionModeESet;
		eventRetentionMode = EVENT_RETENTION_MODE_EDEFAULT;
		eventRetentionModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.EVENT_SESSION__EVENT_RETENTION_MODE, oldEventRetentionMode, EVENT_RETENTION_MODE_EDEFAULT, oldEventRetentionModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEventRetentionMode() {
		return eventRetentionModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMaxEventSize() {
		return maxEventSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxEventSize(long newMaxEventSize) {
		long oldMaxEventSize = maxEventSize;
		maxEventSize = newMaxEventSize;
		boolean oldMaxEventSizeESet = maxEventSizeESet;
		maxEventSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_SESSION__MAX_EVENT_SIZE, oldMaxEventSize, maxEventSize, !oldMaxEventSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxEventSize() {
		long oldMaxEventSize = maxEventSize;
		boolean oldMaxEventSizeESet = maxEventSizeESet;
		maxEventSize = MAX_EVENT_SIZE_EDEFAULT;
		maxEventSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.EVENT_SESSION__MAX_EVENT_SIZE, oldMaxEventSize, MAX_EVENT_SIZE_EDEFAULT, oldMaxEventSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxEventSize() {
		return maxEventSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxMemory() {
		return maxMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMemory(BigInteger newMaxMemory) {
		BigInteger oldMaxMemory = maxMemory;
		maxMemory = newMaxMemory;
		boolean oldMaxMemoryESet = maxMemoryESet;
		maxMemoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_SESSION__MAX_MEMORY, oldMaxMemory, maxMemory, !oldMaxMemoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxMemory() {
		BigInteger oldMaxMemory = maxMemory;
		boolean oldMaxMemoryESet = maxMemoryESet;
		maxMemory = MAX_MEMORY_EDEFAULT;
		maxMemoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.EVENT_SESSION__MAX_MEMORY, oldMaxMemory, MAX_MEMORY_EDEFAULT, oldMaxMemoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxMemory() {
		return maxMemoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitionModes getMemoryPartitionMode() {
		return memoryPartitionMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryPartitionMode(PartitionModes newMemoryPartitionMode) {
		PartitionModes oldMemoryPartitionMode = memoryPartitionMode;
		memoryPartitionMode = newMemoryPartitionMode == null ? MEMORY_PARTITION_MODE_EDEFAULT : newMemoryPartitionMode;
		boolean oldMemoryPartitionModeESet = memoryPartitionModeESet;
		memoryPartitionModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_SESSION__MEMORY_PARTITION_MODE, oldMemoryPartitionMode, memoryPartitionMode, !oldMemoryPartitionModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMemoryPartitionMode() {
		PartitionModes oldMemoryPartitionMode = memoryPartitionMode;
		boolean oldMemoryPartitionModeESet = memoryPartitionModeESet;
		memoryPartitionMode = MEMORY_PARTITION_MODE_EDEFAULT;
		memoryPartitionModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.EVENT_SESSION__MEMORY_PARTITION_MODE, oldMemoryPartitionMode, MEMORY_PARTITION_MODE_EDEFAULT, oldMemoryPartitionModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMemoryPartitionMode() {
		return memoryPartitionModeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_SESSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrackCausality() {
		return trackCausality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackCausality(boolean newTrackCausality) {
		boolean oldTrackCausality = trackCausality;
		trackCausality = newTrackCausality;
		boolean oldTrackCausalityESet = trackCausalityESet;
		trackCausalityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.EVENT_SESSION__TRACK_CAUSALITY, oldTrackCausality, trackCausality, !oldTrackCausalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrackCausality() {
		boolean oldTrackCausality = trackCausality;
		boolean oldTrackCausalityESet = trackCausalityESet;
		trackCausality = TRACK_CAUSALITY_EDEFAULT;
		trackCausalityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.EVENT_SESSION__TRACK_CAUSALITY, oldTrackCausality, TRACK_CAUSALITY_EDEFAULT, oldTrackCausalityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrackCausality() {
		return trackCausalityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.EVENT_SESSION__EVENT:
				return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
			case XmlaPackage.EVENT_SESSION__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case XmlaPackage.EVENT_SESSION__TEMPLATE_CATEGORY:
				return getTemplateCategory();
			case XmlaPackage.EVENT_SESSION__TEMPLATE_NAME:
				return getTemplateName();
			case XmlaPackage.EVENT_SESSION__TEMPLATE_DESCRIPTION:
				return getTemplateDescription();
			case XmlaPackage.EVENT_SESSION__EVENT:
				return getEvent();
			case XmlaPackage.EVENT_SESSION__TARGET:
				return getTarget();
			case XmlaPackage.EVENT_SESSION__DISPATCH_LATENCY:
				return getDispatchLatency();
			case XmlaPackage.EVENT_SESSION__EVENT_RETENTION_MODE:
				return getEventRetentionMode();
			case XmlaPackage.EVENT_SESSION__MAX_EVENT_SIZE:
				return getMaxEventSize();
			case XmlaPackage.EVENT_SESSION__MAX_MEMORY:
				return getMaxMemory();
			case XmlaPackage.EVENT_SESSION__MEMORY_PARTITION_MODE:
				return getMemoryPartitionMode();
			case XmlaPackage.EVENT_SESSION__NAME:
				return getName();
			case XmlaPackage.EVENT_SESSION__TRACK_CAUSALITY:
				return isTrackCausality();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmlaPackage.EVENT_SESSION__TEMPLATE_CATEGORY:
				setTemplateCategory((String)newValue);
				return;
			case XmlaPackage.EVENT_SESSION__TEMPLATE_NAME:
				setTemplateName((String)newValue);
				return;
			case XmlaPackage.EVENT_SESSION__TEMPLATE_DESCRIPTION:
				setTemplateDescription((String)newValue);
				return;
			case XmlaPackage.EVENT_SESSION__EVENT:
				getEvent().clear();
				getEvent().addAll((Collection<? extends EObject>)newValue);
				return;
			case XmlaPackage.EVENT_SESSION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends EObject>)newValue);
				return;
			case XmlaPackage.EVENT_SESSION__DISPATCH_LATENCY:
				setDispatchLatency((Long)newValue);
				return;
			case XmlaPackage.EVENT_SESSION__EVENT_RETENTION_MODE:
				setEventRetentionMode((RetentionModes)newValue);
				return;
			case XmlaPackage.EVENT_SESSION__MAX_EVENT_SIZE:
				setMaxEventSize((Long)newValue);
				return;
			case XmlaPackage.EVENT_SESSION__MAX_MEMORY:
				setMaxMemory((BigInteger)newValue);
				return;
			case XmlaPackage.EVENT_SESSION__MEMORY_PARTITION_MODE:
				setMemoryPartitionMode((PartitionModes)newValue);
				return;
			case XmlaPackage.EVENT_SESSION__NAME:
				setName((String)newValue);
				return;
			case XmlaPackage.EVENT_SESSION__TRACK_CAUSALITY:
				setTrackCausality((Boolean)newValue);
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
			case XmlaPackage.EVENT_SESSION__TEMPLATE_CATEGORY:
				setTemplateCategory(TEMPLATE_CATEGORY_EDEFAULT);
				return;
			case XmlaPackage.EVENT_SESSION__TEMPLATE_NAME:
				setTemplateName(TEMPLATE_NAME_EDEFAULT);
				return;
			case XmlaPackage.EVENT_SESSION__TEMPLATE_DESCRIPTION:
				setTemplateDescription(TEMPLATE_DESCRIPTION_EDEFAULT);
				return;
			case XmlaPackage.EVENT_SESSION__EVENT:
				getEvent().clear();
				return;
			case XmlaPackage.EVENT_SESSION__TARGET:
				getTarget().clear();
				return;
			case XmlaPackage.EVENT_SESSION__DISPATCH_LATENCY:
				unsetDispatchLatency();
				return;
			case XmlaPackage.EVENT_SESSION__EVENT_RETENTION_MODE:
				unsetEventRetentionMode();
				return;
			case XmlaPackage.EVENT_SESSION__MAX_EVENT_SIZE:
				unsetMaxEventSize();
				return;
			case XmlaPackage.EVENT_SESSION__MAX_MEMORY:
				unsetMaxMemory();
				return;
			case XmlaPackage.EVENT_SESSION__MEMORY_PARTITION_MODE:
				unsetMemoryPartitionMode();
				return;
			case XmlaPackage.EVENT_SESSION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmlaPackage.EVENT_SESSION__TRACK_CAUSALITY:
				unsetTrackCausality();
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
			case XmlaPackage.EVENT_SESSION__TEMPLATE_CATEGORY:
				return TEMPLATE_CATEGORY_EDEFAULT == null ? templateCategory != null : !TEMPLATE_CATEGORY_EDEFAULT.equals(templateCategory);
			case XmlaPackage.EVENT_SESSION__TEMPLATE_NAME:
				return TEMPLATE_NAME_EDEFAULT == null ? templateName != null : !TEMPLATE_NAME_EDEFAULT.equals(templateName);
			case XmlaPackage.EVENT_SESSION__TEMPLATE_DESCRIPTION:
				return TEMPLATE_DESCRIPTION_EDEFAULT == null ? templateDescription != null : !TEMPLATE_DESCRIPTION_EDEFAULT.equals(templateDescription);
			case XmlaPackage.EVENT_SESSION__EVENT:
				return event != null && !event.isEmpty();
			case XmlaPackage.EVENT_SESSION__TARGET:
				return target != null && !target.isEmpty();
			case XmlaPackage.EVENT_SESSION__DISPATCH_LATENCY:
				return isSetDispatchLatency();
			case XmlaPackage.EVENT_SESSION__EVENT_RETENTION_MODE:
				return isSetEventRetentionMode();
			case XmlaPackage.EVENT_SESSION__MAX_EVENT_SIZE:
				return isSetMaxEventSize();
			case XmlaPackage.EVENT_SESSION__MAX_MEMORY:
				return isSetMaxMemory();
			case XmlaPackage.EVENT_SESSION__MEMORY_PARTITION_MODE:
				return isSetMemoryPartitionMode();
			case XmlaPackage.EVENT_SESSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmlaPackage.EVENT_SESSION__TRACK_CAUSALITY:
				return isSetTrackCausality();
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
		result.append(" (templateCategory: ");
		result.append(templateCategory);
		result.append(", templateName: ");
		result.append(templateName);
		result.append(", templateDescription: ");
		result.append(templateDescription);
		result.append(", dispatchLatency: ");
		if (dispatchLatencyESet) result.append(dispatchLatency); else result.append("<unset>");
		result.append(", eventRetentionMode: ");
		if (eventRetentionModeESet) result.append(eventRetentionMode); else result.append("<unset>");
		result.append(", maxEventSize: ");
		if (maxEventSizeESet) result.append(maxEventSize); else result.append("<unset>");
		result.append(", maxMemory: ");
		if (maxMemoryESet) result.append(maxMemory); else result.append("<unset>");
		result.append(", memoryPartitionMode: ");
		if (memoryPartitionModeESet) result.append(memoryPartitionMode); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", trackCausality: ");
		if (trackCausalityESet) result.append(trackCausality); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EventSessionImpl
