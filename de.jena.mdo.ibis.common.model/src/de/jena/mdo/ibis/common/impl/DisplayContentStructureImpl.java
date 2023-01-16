/*
 */
package de.jena.mdo.ibis.common.impl;

import de.jena.mdo.ibis.common.DestinationStructure;
import de.jena.mdo.ibis.common.DisplayContentStructure;
import de.jena.mdo.ibis.common.IBISIPDuration;
import de.jena.mdo.ibis.common.IBISIPInt;
import de.jena.mdo.ibis.common.IBISIPNMTOKEN;
import de.jena.mdo.ibis.common.IBISIPNonNegativeInteger;
import de.jena.mdo.ibis.common.IbisCommonPackage;
import de.jena.mdo.ibis.common.InternationalTextType;
import de.jena.mdo.ibis.common.LineInformationStructure;
import de.jena.mdo.ibis.common.ViaPointStructure;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display Content Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getDisplayContentRef <em>Display Content Ref</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getLineInformation <em>Line Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getViaPoint <em>Via Point</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getAdditionalInformation1 <em>Additional Information1</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getAdditionalInformation2 <em>Additional Information2</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getAdditionalInformation3 <em>Additional Information3</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getAdditionalInformation4 <em>Additional Information4</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getAdditionalInformation5 <em>Additional Information5</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getAdditionalInformation6 <em>Additional Information6</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getAdditionalInformation7 <em>Additional Information7</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getAdditionalInformation8 <em>Additional Information8</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getAdditionalInformation9 <em>Additional Information9</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getRunNumber <em>Run Number</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getPeriodDuration <em>Period Duration</em>}</li>
 *   <li>{@link de.jena.mdo.ibis.common.impl.DisplayContentStructureImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisplayContentStructureImpl extends MinimalEObjectImpl.Container implements DisplayContentStructure {
	/**
	 * The cached value of the '{@link #getDisplayContentRef() <em>Display Content Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayContentRef()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNMTOKEN displayContentRef;

	/**
	 * The cached value of the '{@link #getLineInformation() <em>Line Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineInformation()
	 * @generated
	 * @ordered
	 */
	protected LineInformationStructure lineInformation;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected DestinationStructure destination;

	/**
	 * The cached value of the '{@link #getViaPoint() <em>Via Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViaPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ViaPointStructure> viaPoint;

	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> additionalInformation;

	/**
	 * The cached value of the '{@link #getAdditionalInformation1() <em>Additional Information1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation1()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> additionalInformation1;

	/**
	 * The cached value of the '{@link #getAdditionalInformation2() <em>Additional Information2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation2()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> additionalInformation2;

	/**
	 * The cached value of the '{@link #getAdditionalInformation3() <em>Additional Information3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation3()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> additionalInformation3;

	/**
	 * The cached value of the '{@link #getAdditionalInformation4() <em>Additional Information4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation4()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> additionalInformation4;

	/**
	 * The cached value of the '{@link #getAdditionalInformation5() <em>Additional Information5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation5()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> additionalInformation5;

	/**
	 * The cached value of the '{@link #getAdditionalInformation6() <em>Additional Information6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation6()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> additionalInformation6;

	/**
	 * The cached value of the '{@link #getAdditionalInformation7() <em>Additional Information7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation7()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> additionalInformation7;

	/**
	 * The cached value of the '{@link #getAdditionalInformation8() <em>Additional Information8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation8()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> additionalInformation8;

	/**
	 * The cached value of the '{@link #getAdditionalInformation9() <em>Additional Information9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation9()
	 * @generated
	 * @ordered
	 */
	protected EList<InternationalTextType> additionalInformation9;

	/**
	 * The cached value of the '{@link #getRunNumber() <em>Run Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunNumber()
	 * @generated
	 * @ordered
	 */
	protected IBISIPInt runNumber;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected IBISIPNonNegativeInteger priority;

	/**
	 * The cached value of the '{@link #getPeriodDuration() <em>Period Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodDuration()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDuration periodDuration;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected IBISIPDuration duration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayContentStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IbisCommonPackage.eINSTANCE.getDisplayContentStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNMTOKEN getDisplayContentRef() {
		return displayContentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayContentRef(IBISIPNMTOKEN newDisplayContentRef, NotificationChain msgs) {
		IBISIPNMTOKEN oldDisplayContentRef = displayContentRef;
		displayContentRef = newDisplayContentRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DISPLAY_CONTENT_REF, oldDisplayContentRef, newDisplayContentRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayContentRef(IBISIPNMTOKEN newDisplayContentRef) {
		if (newDisplayContentRef != displayContentRef) {
			NotificationChain msgs = null;
			if (displayContentRef != null)
				msgs = ((InternalEObject)displayContentRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DISPLAY_CONTENT_REF, null, msgs);
			if (newDisplayContentRef != null)
				msgs = ((InternalEObject)newDisplayContentRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DISPLAY_CONTENT_REF, null, msgs);
			msgs = basicSetDisplayContentRef(newDisplayContentRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DISPLAY_CONTENT_REF, newDisplayContentRef, newDisplayContentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineInformationStructure getLineInformation() {
		return lineInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineInformation(LineInformationStructure newLineInformation, NotificationChain msgs) {
		LineInformationStructure oldLineInformation = lineInformation;
		lineInformation = newLineInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__LINE_INFORMATION, oldLineInformation, newLineInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineInformation(LineInformationStructure newLineInformation) {
		if (newLineInformation != lineInformation) {
			NotificationChain msgs = null;
			if (lineInformation != null)
				msgs = ((InternalEObject)lineInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__LINE_INFORMATION, null, msgs);
			if (newLineInformation != null)
				msgs = ((InternalEObject)newLineInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__LINE_INFORMATION, null, msgs);
			msgs = basicSetLineInformation(newLineInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__LINE_INFORMATION, newLineInformation, newLineInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DestinationStructure getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(DestinationStructure newDestination, NotificationChain msgs) {
		DestinationStructure oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDestination(DestinationStructure newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ViaPointStructure> getViaPoint() {
		if (viaPoint == null) {
			viaPoint = new EObjectContainmentEList<ViaPointStructure>(ViaPointStructure.class, this, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__VIA_POINT);
		}
		return viaPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAdditionalInformation() {
		if (additionalInformation == null) {
			additionalInformation = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION);
		}
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAdditionalInformation1() {
		if (additionalInformation1 == null) {
			additionalInformation1 = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION1);
		}
		return additionalInformation1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAdditionalInformation2() {
		if (additionalInformation2 == null) {
			additionalInformation2 = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION2);
		}
		return additionalInformation2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAdditionalInformation3() {
		if (additionalInformation3 == null) {
			additionalInformation3 = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION3);
		}
		return additionalInformation3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAdditionalInformation4() {
		if (additionalInformation4 == null) {
			additionalInformation4 = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION4);
		}
		return additionalInformation4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAdditionalInformation5() {
		if (additionalInformation5 == null) {
			additionalInformation5 = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION5);
		}
		return additionalInformation5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAdditionalInformation6() {
		if (additionalInformation6 == null) {
			additionalInformation6 = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION6);
		}
		return additionalInformation6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAdditionalInformation7() {
		if (additionalInformation7 == null) {
			additionalInformation7 = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION7);
		}
		return additionalInformation7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAdditionalInformation8() {
		if (additionalInformation8 == null) {
			additionalInformation8 = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION8);
		}
		return additionalInformation8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InternationalTextType> getAdditionalInformation9() {
		if (additionalInformation9 == null) {
			additionalInformation9 = new EObjectContainmentEList<InternationalTextType>(InternationalTextType.class, this, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION9);
		}
		return additionalInformation9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPInt getRunNumber() {
		return runNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunNumber(IBISIPInt newRunNumber, NotificationChain msgs) {
		IBISIPInt oldRunNumber = runNumber;
		runNumber = newRunNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__RUN_NUMBER, oldRunNumber, newRunNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunNumber(IBISIPInt newRunNumber) {
		if (newRunNumber != runNumber) {
			NotificationChain msgs = null;
			if (runNumber != null)
				msgs = ((InternalEObject)runNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__RUN_NUMBER, null, msgs);
			if (newRunNumber != null)
				msgs = ((InternalEObject)newRunNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__RUN_NUMBER, null, msgs);
			msgs = basicSetRunNumber(newRunNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__RUN_NUMBER, newRunNumber, newRunNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPNonNegativeInteger getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriority(IBISIPNonNegativeInteger newPriority, NotificationChain msgs) {
		IBISIPNonNegativeInteger oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PRIORITY, oldPriority, newPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriority(IBISIPNonNegativeInteger newPriority) {
		if (newPriority != priority) {
			NotificationChain msgs = null;
			if (priority != null)
				msgs = ((InternalEObject)priority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PRIORITY, null, msgs);
			if (newPriority != null)
				msgs = ((InternalEObject)newPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PRIORITY, null, msgs);
			msgs = basicSetPriority(newPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PRIORITY, newPriority, newPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDuration getPeriodDuration() {
		return periodDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriodDuration(IBISIPDuration newPeriodDuration, NotificationChain msgs) {
		IBISIPDuration oldPeriodDuration = periodDuration;
		periodDuration = newPeriodDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PERIOD_DURATION, oldPeriodDuration, newPeriodDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriodDuration(IBISIPDuration newPeriodDuration) {
		if (newPeriodDuration != periodDuration) {
			NotificationChain msgs = null;
			if (periodDuration != null)
				msgs = ((InternalEObject)periodDuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PERIOD_DURATION, null, msgs);
			if (newPeriodDuration != null)
				msgs = ((InternalEObject)newPeriodDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PERIOD_DURATION, null, msgs);
			msgs = basicSetPeriodDuration(newPeriodDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PERIOD_DURATION, newPeriodDuration, newPeriodDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBISIPDuration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(IBISIPDuration newDuration, NotificationChain msgs) {
		IBISIPDuration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(IBISIPDuration newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DISPLAY_CONTENT_REF:
				return basicSetDisplayContentRef(null, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__LINE_INFORMATION:
				return basicSetLineInformation(null, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DESTINATION:
				return basicSetDestination(null, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__VIA_POINT:
				return ((InternalEList<?>)getViaPoint()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION:
				return ((InternalEList<?>)getAdditionalInformation()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION1:
				return ((InternalEList<?>)getAdditionalInformation1()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION2:
				return ((InternalEList<?>)getAdditionalInformation2()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION3:
				return ((InternalEList<?>)getAdditionalInformation3()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION4:
				return ((InternalEList<?>)getAdditionalInformation4()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION5:
				return ((InternalEList<?>)getAdditionalInformation5()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION6:
				return ((InternalEList<?>)getAdditionalInformation6()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION7:
				return ((InternalEList<?>)getAdditionalInformation7()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION8:
				return ((InternalEList<?>)getAdditionalInformation8()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION9:
				return ((InternalEList<?>)getAdditionalInformation9()).basicRemove(otherEnd, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__RUN_NUMBER:
				return basicSetRunNumber(null, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PRIORITY:
				return basicSetPriority(null, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PERIOD_DURATION:
				return basicSetPeriodDuration(null, msgs);
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DURATION:
				return basicSetDuration(null, msgs);
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
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DISPLAY_CONTENT_REF:
				return getDisplayContentRef();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__LINE_INFORMATION:
				return getLineInformation();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DESTINATION:
				return getDestination();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__VIA_POINT:
				return getViaPoint();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION:
				return getAdditionalInformation();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION1:
				return getAdditionalInformation1();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION2:
				return getAdditionalInformation2();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION3:
				return getAdditionalInformation3();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION4:
				return getAdditionalInformation4();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION5:
				return getAdditionalInformation5();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION6:
				return getAdditionalInformation6();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION7:
				return getAdditionalInformation7();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION8:
				return getAdditionalInformation8();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION9:
				return getAdditionalInformation9();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__RUN_NUMBER:
				return getRunNumber();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PRIORITY:
				return getPriority();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PERIOD_DURATION:
				return getPeriodDuration();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DURATION:
				return getDuration();
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
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DISPLAY_CONTENT_REF:
				setDisplayContentRef((IBISIPNMTOKEN)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__LINE_INFORMATION:
				setLineInformation((LineInformationStructure)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DESTINATION:
				setDestination((DestinationStructure)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__VIA_POINT:
				getViaPoint().clear();
				getViaPoint().addAll((Collection<? extends ViaPointStructure>)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION:
				getAdditionalInformation().clear();
				getAdditionalInformation().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION1:
				getAdditionalInformation1().clear();
				getAdditionalInformation1().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION2:
				getAdditionalInformation2().clear();
				getAdditionalInformation2().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION3:
				getAdditionalInformation3().clear();
				getAdditionalInformation3().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION4:
				getAdditionalInformation4().clear();
				getAdditionalInformation4().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION5:
				getAdditionalInformation5().clear();
				getAdditionalInformation5().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION6:
				getAdditionalInformation6().clear();
				getAdditionalInformation6().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION7:
				getAdditionalInformation7().clear();
				getAdditionalInformation7().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION8:
				getAdditionalInformation8().clear();
				getAdditionalInformation8().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION9:
				getAdditionalInformation9().clear();
				getAdditionalInformation9().addAll((Collection<? extends InternationalTextType>)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__RUN_NUMBER:
				setRunNumber((IBISIPInt)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PRIORITY:
				setPriority((IBISIPNonNegativeInteger)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PERIOD_DURATION:
				setPeriodDuration((IBISIPDuration)newValue);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DURATION:
				setDuration((IBISIPDuration)newValue);
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
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DISPLAY_CONTENT_REF:
				setDisplayContentRef((IBISIPNMTOKEN)null);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__LINE_INFORMATION:
				setLineInformation((LineInformationStructure)null);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DESTINATION:
				setDestination((DestinationStructure)null);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__VIA_POINT:
				getViaPoint().clear();
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION:
				getAdditionalInformation().clear();
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION1:
				getAdditionalInformation1().clear();
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION2:
				getAdditionalInformation2().clear();
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION3:
				getAdditionalInformation3().clear();
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION4:
				getAdditionalInformation4().clear();
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION5:
				getAdditionalInformation5().clear();
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION6:
				getAdditionalInformation6().clear();
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION7:
				getAdditionalInformation7().clear();
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION8:
				getAdditionalInformation8().clear();
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION9:
				getAdditionalInformation9().clear();
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__RUN_NUMBER:
				setRunNumber((IBISIPInt)null);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PRIORITY:
				setPriority((IBISIPNonNegativeInteger)null);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PERIOD_DURATION:
				setPeriodDuration((IBISIPDuration)null);
				return;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DURATION:
				setDuration((IBISIPDuration)null);
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
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DISPLAY_CONTENT_REF:
				return displayContentRef != null;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__LINE_INFORMATION:
				return lineInformation != null;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DESTINATION:
				return destination != null;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__VIA_POINT:
				return viaPoint != null && !viaPoint.isEmpty();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION:
				return additionalInformation != null && !additionalInformation.isEmpty();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION1:
				return additionalInformation1 != null && !additionalInformation1.isEmpty();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION2:
				return additionalInformation2 != null && !additionalInformation2.isEmpty();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION3:
				return additionalInformation3 != null && !additionalInformation3.isEmpty();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION4:
				return additionalInformation4 != null && !additionalInformation4.isEmpty();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION5:
				return additionalInformation5 != null && !additionalInformation5.isEmpty();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION6:
				return additionalInformation6 != null && !additionalInformation6.isEmpty();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION7:
				return additionalInformation7 != null && !additionalInformation7.isEmpty();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION8:
				return additionalInformation8 != null && !additionalInformation8.isEmpty();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__ADDITIONAL_INFORMATION9:
				return additionalInformation9 != null && !additionalInformation9.isEmpty();
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__RUN_NUMBER:
				return runNumber != null;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PRIORITY:
				return priority != null;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__PERIOD_DURATION:
				return periodDuration != null;
			case IbisCommonPackage.DISPLAY_CONTENT_STRUCTURE__DURATION:
				return duration != null;
		}
		return super.eIsSet(featureID);
	}

} //DisplayContentStructureImpl
