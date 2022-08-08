/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl;

import org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject;

import org.eclipse.daanse.xmla.model.ecore.xmla_exception.EndType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.StartType;
import org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessageLocationImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessageLocationImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessageLocationImpl#getLineOffset <em>Line Offset</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessageLocationImpl#getTextLength <em>Text Length</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessageLocationImpl#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessageLocationImpl#getDependsOnObject <em>Depends On Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.impl.MessageLocationImpl#getRowNumber <em>Row Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageLocationImpl extends MinimalEObjectImpl.Container implements MessageLocation {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected StartType start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EndType end;

	/**
	 * The default value of the '{@link #getLineOffset() <em>Line Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineOffset() <em>Line Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineOffset()
	 * @generated
	 * @ordered
	 */
	protected int lineOffset = LINE_OFFSET_EDEFAULT;

	/**
	 * This is true if the Line Offset attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lineOffsetESet;

	/**
	 * The default value of the '{@link #getTextLength() <em>Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLength()
	 * @generated
	 * @ordered
	 */
	protected static final int TEXT_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTextLength() <em>Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextLength()
	 * @generated
	 * @ordered
	 */
	protected int textLength = TEXT_LENGTH_EDEFAULT;

	/**
	 * This is true if the Text Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textLengthESet;

	/**
	 * The cached value of the '{@link #getSourceObject() <em>Source Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceObject()
	 * @generated
	 * @ordered
	 */
	protected WarningLocationObject sourceObject;

	/**
	 * The cached value of the '{@link #getDependsOnObject() <em>Depends On Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOnObject()
	 * @generated
	 * @ordered
	 */
	protected WarningLocationObject dependsOnObject;

	/**
	 * The default value of the '{@link #getRowNumber() <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRowNumber() <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowNumber()
	 * @generated
	 * @ordered
	 */
	protected int rowNumber = ROW_NUMBER_EDEFAULT;

	/**
	 * This is true if the Row Number attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rowNumberESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xmla_exceptionPackage.Literals.MESSAGE_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartType getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(StartType newStart, NotificationChain msgs) {
		StartType oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.MESSAGE_LOCATION__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(StartType newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_exceptionPackage.MESSAGE_LOCATION__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_exceptionPackage.MESSAGE_LOCATION__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.MESSAGE_LOCATION__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndType getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(EndType newEnd, NotificationChain msgs) {
		EndType oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.MESSAGE_LOCATION__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(EndType newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_exceptionPackage.MESSAGE_LOCATION__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_exceptionPackage.MESSAGE_LOCATION__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.MESSAGE_LOCATION__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineOffset() {
		return lineOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineOffset(int newLineOffset) {
		int oldLineOffset = lineOffset;
		lineOffset = newLineOffset;
		boolean oldLineOffsetESet = lineOffsetESet;
		lineOffsetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.MESSAGE_LOCATION__LINE_OFFSET, oldLineOffset, lineOffset, !oldLineOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLineOffset() {
		int oldLineOffset = lineOffset;
		boolean oldLineOffsetESet = lineOffsetESet;
		lineOffset = LINE_OFFSET_EDEFAULT;
		lineOffsetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xmla_exceptionPackage.MESSAGE_LOCATION__LINE_OFFSET, oldLineOffset, LINE_OFFSET_EDEFAULT, oldLineOffsetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLineOffset() {
		return lineOffsetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTextLength() {
		return textLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextLength(int newTextLength) {
		int oldTextLength = textLength;
		textLength = newTextLength;
		boolean oldTextLengthESet = textLengthESet;
		textLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.MESSAGE_LOCATION__TEXT_LENGTH, oldTextLength, textLength, !oldTextLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTextLength() {
		int oldTextLength = textLength;
		boolean oldTextLengthESet = textLengthESet;
		textLength = TEXT_LENGTH_EDEFAULT;
		textLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xmla_exceptionPackage.MESSAGE_LOCATION__TEXT_LENGTH, oldTextLength, TEXT_LENGTH_EDEFAULT, oldTextLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTextLength() {
		return textLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarningLocationObject getSourceObject() {
		return sourceObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceObject(WarningLocationObject newSourceObject, NotificationChain msgs) {
		WarningLocationObject oldSourceObject = sourceObject;
		sourceObject = newSourceObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.MESSAGE_LOCATION__SOURCE_OBJECT, oldSourceObject, newSourceObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceObject(WarningLocationObject newSourceObject) {
		if (newSourceObject != sourceObject) {
			NotificationChain msgs = null;
			if (sourceObject != null)
				msgs = ((InternalEObject)sourceObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_exceptionPackage.MESSAGE_LOCATION__SOURCE_OBJECT, null, msgs);
			if (newSourceObject != null)
				msgs = ((InternalEObject)newSourceObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_exceptionPackage.MESSAGE_LOCATION__SOURCE_OBJECT, null, msgs);
			msgs = basicSetSourceObject(newSourceObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.MESSAGE_LOCATION__SOURCE_OBJECT, newSourceObject, newSourceObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WarningLocationObject getDependsOnObject() {
		return dependsOnObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependsOnObject(WarningLocationObject newDependsOnObject, NotificationChain msgs) {
		WarningLocationObject oldDependsOnObject = dependsOnObject;
		dependsOnObject = newDependsOnObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.MESSAGE_LOCATION__DEPENDS_ON_OBJECT, oldDependsOnObject, newDependsOnObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependsOnObject(WarningLocationObject newDependsOnObject) {
		if (newDependsOnObject != dependsOnObject) {
			NotificationChain msgs = null;
			if (dependsOnObject != null)
				msgs = ((InternalEObject)dependsOnObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xmla_exceptionPackage.MESSAGE_LOCATION__DEPENDS_ON_OBJECT, null, msgs);
			if (newDependsOnObject != null)
				msgs = ((InternalEObject)newDependsOnObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xmla_exceptionPackage.MESSAGE_LOCATION__DEPENDS_ON_OBJECT, null, msgs);
			msgs = basicSetDependsOnObject(newDependsOnObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.MESSAGE_LOCATION__DEPENDS_ON_OBJECT, newDependsOnObject, newDependsOnObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRowNumber() {
		return rowNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowNumber(int newRowNumber) {
		int oldRowNumber = rowNumber;
		rowNumber = newRowNumber;
		boolean oldRowNumberESet = rowNumberESet;
		rowNumberESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xmla_exceptionPackage.MESSAGE_LOCATION__ROW_NUMBER, oldRowNumber, rowNumber, !oldRowNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRowNumber() {
		int oldRowNumber = rowNumber;
		boolean oldRowNumberESet = rowNumberESet;
		rowNumber = ROW_NUMBER_EDEFAULT;
		rowNumberESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xmla_exceptionPackage.MESSAGE_LOCATION__ROW_NUMBER, oldRowNumber, ROW_NUMBER_EDEFAULT, oldRowNumberESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRowNumber() {
		return rowNumberESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xmla_exceptionPackage.MESSAGE_LOCATION__START:
				return basicSetStart(null, msgs);
			case Xmla_exceptionPackage.MESSAGE_LOCATION__END:
				return basicSetEnd(null, msgs);
			case Xmla_exceptionPackage.MESSAGE_LOCATION__SOURCE_OBJECT:
				return basicSetSourceObject(null, msgs);
			case Xmla_exceptionPackage.MESSAGE_LOCATION__DEPENDS_ON_OBJECT:
				return basicSetDependsOnObject(null, msgs);
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
			case Xmla_exceptionPackage.MESSAGE_LOCATION__START:
				return getStart();
			case Xmla_exceptionPackage.MESSAGE_LOCATION__END:
				return getEnd();
			case Xmla_exceptionPackage.MESSAGE_LOCATION__LINE_OFFSET:
				return getLineOffset();
			case Xmla_exceptionPackage.MESSAGE_LOCATION__TEXT_LENGTH:
				return getTextLength();
			case Xmla_exceptionPackage.MESSAGE_LOCATION__SOURCE_OBJECT:
				return getSourceObject();
			case Xmla_exceptionPackage.MESSAGE_LOCATION__DEPENDS_ON_OBJECT:
				return getDependsOnObject();
			case Xmla_exceptionPackage.MESSAGE_LOCATION__ROW_NUMBER:
				return getRowNumber();
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
			case Xmla_exceptionPackage.MESSAGE_LOCATION__START:
				setStart((StartType)newValue);
				return;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__END:
				setEnd((EndType)newValue);
				return;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__LINE_OFFSET:
				setLineOffset((Integer)newValue);
				return;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__TEXT_LENGTH:
				setTextLength((Integer)newValue);
				return;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__SOURCE_OBJECT:
				setSourceObject((WarningLocationObject)newValue);
				return;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__DEPENDS_ON_OBJECT:
				setDependsOnObject((WarningLocationObject)newValue);
				return;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__ROW_NUMBER:
				setRowNumber((Integer)newValue);
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
			case Xmla_exceptionPackage.MESSAGE_LOCATION__START:
				setStart((StartType)null);
				return;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__END:
				setEnd((EndType)null);
				return;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__LINE_OFFSET:
				unsetLineOffset();
				return;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__TEXT_LENGTH:
				unsetTextLength();
				return;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__SOURCE_OBJECT:
				setSourceObject((WarningLocationObject)null);
				return;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__DEPENDS_ON_OBJECT:
				setDependsOnObject((WarningLocationObject)null);
				return;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__ROW_NUMBER:
				unsetRowNumber();
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
			case Xmla_exceptionPackage.MESSAGE_LOCATION__START:
				return start != null;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__END:
				return end != null;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__LINE_OFFSET:
				return isSetLineOffset();
			case Xmla_exceptionPackage.MESSAGE_LOCATION__TEXT_LENGTH:
				return isSetTextLength();
			case Xmla_exceptionPackage.MESSAGE_LOCATION__SOURCE_OBJECT:
				return sourceObject != null;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__DEPENDS_ON_OBJECT:
				return dependsOnObject != null;
			case Xmla_exceptionPackage.MESSAGE_LOCATION__ROW_NUMBER:
				return isSetRowNumber();
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
		result.append(" (lineOffset: ");
		if (lineOffsetESet) result.append(lineOffset); else result.append("<unset>");
		result.append(", textLength: ");
		if (textLengthESet) result.append(textLength); else result.append("<unset>");
		result.append(", rowNumber: ");
		if (rowNumberESet) result.append(rowNumber); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MessageLocationImpl
