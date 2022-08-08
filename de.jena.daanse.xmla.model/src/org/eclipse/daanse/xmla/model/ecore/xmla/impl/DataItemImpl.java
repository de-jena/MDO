/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import org.eclipse.daanse.xmla.model.ecore.xmla.AnnotationsType30;
import org.eclipse.daanse.xmla.model.ecore.xmla.Binding;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataItem;
import org.eclipse.daanse.xmla.model.ecore.xmla.DataTypeType;
import org.eclipse.daanse.xmla.model.ecore.xmla.FormatType;
import org.eclipse.daanse.xmla.model.ecore.xmla.InvalidXmlCharactersType;
import org.eclipse.daanse.xmla.model.ecore.xmla.NullProcessingType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TrimmingType;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataItemImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataItemImpl#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataItemImpl#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataItemImpl#getNullProcessing <em>Null Processing</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataItemImpl#getTrimming <em>Trimming</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataItemImpl#getInvalidXmlCharacters <em>Invalid Xml Characters</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataItemImpl#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataItemImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataItemImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.DataItemImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataItemImpl extends MinimalEObjectImpl.Container implements DataItem {
	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataTypeType DATA_TYPE_EDEFAULT = DataTypeType.WCHAR;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataTypeType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * This is true if the Data Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dataTypeESet;

	/**
	 * The default value of the '{@link #getDataSize() <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DATA_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataSize() <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSize()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dataSize = DATA_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNullProcessing() <em>Null Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullProcessing()
	 * @generated
	 * @ordered
	 */
	protected static final NullProcessingType NULL_PROCESSING_EDEFAULT = NullProcessingType.PRESERVE;

	/**
	 * The cached value of the '{@link #getNullProcessing() <em>Null Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullProcessing()
	 * @generated
	 * @ordered
	 */
	protected NullProcessingType nullProcessing = NULL_PROCESSING_EDEFAULT;

	/**
	 * This is true if the Null Processing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullProcessingESet;

	/**
	 * The default value of the '{@link #getTrimming() <em>Trimming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrimming()
	 * @generated
	 * @ordered
	 */
	protected static final TrimmingType TRIMMING_EDEFAULT = TrimmingType.LEFT;

	/**
	 * The cached value of the '{@link #getTrimming() <em>Trimming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrimming()
	 * @generated
	 * @ordered
	 */
	protected TrimmingType trimming = TRIMMING_EDEFAULT;

	/**
	 * This is true if the Trimming attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean trimmingESet;

	/**
	 * The default value of the '{@link #getInvalidXmlCharacters() <em>Invalid Xml Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidXmlCharacters()
	 * @generated
	 * @ordered
	 */
	protected static final InvalidXmlCharactersType INVALID_XML_CHARACTERS_EDEFAULT = InvalidXmlCharactersType.PRESERVE;

	/**
	 * The cached value of the '{@link #getInvalidXmlCharacters() <em>Invalid Xml Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvalidXmlCharacters()
	 * @generated
	 * @ordered
	 */
	protected InvalidXmlCharactersType invalidXmlCharacters = INVALID_XML_CHARACTERS_EDEFAULT;

	/**
	 * This is true if the Invalid Xml Characters attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean invalidXmlCharactersESet;

	/**
	 * The default value of the '{@link #getCollation() <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollation()
	 * @generated
	 * @ordered
	 */
	protected static final String COLLATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCollation() <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollation()
	 * @generated
	 * @ordered
	 */
	protected String collation = COLLATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final FormatType FORMAT_EDEFAULT = FormatType.TRIM_RIGHT;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected FormatType format = FORMAT_EDEFAULT;

	/**
	 * This is true if the Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean formatESet;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Binding source;

	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected AnnotationsType30 annotations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.DATA_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataTypeType newDataType) {
		DataTypeType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		boolean oldDataTypeESet = dataTypeESet;
		dataTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_ITEM__DATA_TYPE, oldDataType, dataType, !oldDataTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDataType() {
		DataTypeType oldDataType = dataType;
		boolean oldDataTypeESet = dataTypeESet;
		dataType = DATA_TYPE_EDEFAULT;
		dataTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATA_ITEM__DATA_TYPE, oldDataType, DATA_TYPE_EDEFAULT, oldDataTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDataType() {
		return dataTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getDataSize() {
		return dataSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataSize(BigInteger newDataSize) {
		BigInteger oldDataSize = dataSize;
		dataSize = newDataSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_ITEM__DATA_SIZE, oldDataSize, dataSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_ITEM__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullProcessingType getNullProcessing() {
		return nullProcessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullProcessing(NullProcessingType newNullProcessing) {
		NullProcessingType oldNullProcessing = nullProcessing;
		nullProcessing = newNullProcessing == null ? NULL_PROCESSING_EDEFAULT : newNullProcessing;
		boolean oldNullProcessingESet = nullProcessingESet;
		nullProcessingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_ITEM__NULL_PROCESSING, oldNullProcessing, nullProcessing, !oldNullProcessingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullProcessing() {
		NullProcessingType oldNullProcessing = nullProcessing;
		boolean oldNullProcessingESet = nullProcessingESet;
		nullProcessing = NULL_PROCESSING_EDEFAULT;
		nullProcessingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATA_ITEM__NULL_PROCESSING, oldNullProcessing, NULL_PROCESSING_EDEFAULT, oldNullProcessingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullProcessing() {
		return nullProcessingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrimmingType getTrimming() {
		return trimming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrimming(TrimmingType newTrimming) {
		TrimmingType oldTrimming = trimming;
		trimming = newTrimming == null ? TRIMMING_EDEFAULT : newTrimming;
		boolean oldTrimmingESet = trimmingESet;
		trimmingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_ITEM__TRIMMING, oldTrimming, trimming, !oldTrimmingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTrimming() {
		TrimmingType oldTrimming = trimming;
		boolean oldTrimmingESet = trimmingESet;
		trimming = TRIMMING_EDEFAULT;
		trimmingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATA_ITEM__TRIMMING, oldTrimming, TRIMMING_EDEFAULT, oldTrimmingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTrimming() {
		return trimmingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidXmlCharactersType getInvalidXmlCharacters() {
		return invalidXmlCharacters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvalidXmlCharacters(InvalidXmlCharactersType newInvalidXmlCharacters) {
		InvalidXmlCharactersType oldInvalidXmlCharacters = invalidXmlCharacters;
		invalidXmlCharacters = newInvalidXmlCharacters == null ? INVALID_XML_CHARACTERS_EDEFAULT : newInvalidXmlCharacters;
		boolean oldInvalidXmlCharactersESet = invalidXmlCharactersESet;
		invalidXmlCharactersESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_ITEM__INVALID_XML_CHARACTERS, oldInvalidXmlCharacters, invalidXmlCharacters, !oldInvalidXmlCharactersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInvalidXmlCharacters() {
		InvalidXmlCharactersType oldInvalidXmlCharacters = invalidXmlCharacters;
		boolean oldInvalidXmlCharactersESet = invalidXmlCharactersESet;
		invalidXmlCharacters = INVALID_XML_CHARACTERS_EDEFAULT;
		invalidXmlCharactersESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATA_ITEM__INVALID_XML_CHARACTERS, oldInvalidXmlCharacters, INVALID_XML_CHARACTERS_EDEFAULT, oldInvalidXmlCharactersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInvalidXmlCharacters() {
		return invalidXmlCharactersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCollation() {
		return collation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollation(String newCollation) {
		String oldCollation = collation;
		collation = newCollation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_ITEM__COLLATION, oldCollation, collation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormatType getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(FormatType newFormat) {
		FormatType oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		boolean oldFormatESet = formatESet;
		formatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_ITEM__FORMAT, oldFormat, format, !oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFormat() {
		FormatType oldFormat = format;
		boolean oldFormatESet = formatESet;
		format = FORMAT_EDEFAULT;
		formatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.DATA_ITEM__FORMAT, oldFormat, FORMAT_EDEFAULT, oldFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFormat() {
		return formatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Binding newSource, NotificationChain msgs) {
		Binding oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_ITEM__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Binding newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_ITEM__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_ITEM__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_ITEM__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsType30 getAnnotations() {
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotations(AnnotationsType30 newAnnotations, NotificationChain msgs) {
		AnnotationsType30 oldAnnotations = annotations;
		annotations = newAnnotations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_ITEM__ANNOTATIONS, oldAnnotations, newAnnotations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(AnnotationsType30 newAnnotations) {
		if (newAnnotations != annotations) {
			NotificationChain msgs = null;
			if (annotations != null)
				msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_ITEM__ANNOTATIONS, null, msgs);
			if (newAnnotations != null)
				msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmlaPackage.DATA_ITEM__ANNOTATIONS, null, msgs);
			msgs = basicSetAnnotations(newAnnotations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.DATA_ITEM__ANNOTATIONS, newAnnotations, newAnnotations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmlaPackage.DATA_ITEM__SOURCE:
				return basicSetSource(null, msgs);
			case XmlaPackage.DATA_ITEM__ANNOTATIONS:
				return basicSetAnnotations(null, msgs);
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
			case XmlaPackage.DATA_ITEM__DATA_TYPE:
				return getDataType();
			case XmlaPackage.DATA_ITEM__DATA_SIZE:
				return getDataSize();
			case XmlaPackage.DATA_ITEM__MIME_TYPE:
				return getMimeType();
			case XmlaPackage.DATA_ITEM__NULL_PROCESSING:
				return getNullProcessing();
			case XmlaPackage.DATA_ITEM__TRIMMING:
				return getTrimming();
			case XmlaPackage.DATA_ITEM__INVALID_XML_CHARACTERS:
				return getInvalidXmlCharacters();
			case XmlaPackage.DATA_ITEM__COLLATION:
				return getCollation();
			case XmlaPackage.DATA_ITEM__FORMAT:
				return getFormat();
			case XmlaPackage.DATA_ITEM__SOURCE:
				return getSource();
			case XmlaPackage.DATA_ITEM__ANNOTATIONS:
				return getAnnotations();
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
			case XmlaPackage.DATA_ITEM__DATA_TYPE:
				setDataType((DataTypeType)newValue);
				return;
			case XmlaPackage.DATA_ITEM__DATA_SIZE:
				setDataSize((BigInteger)newValue);
				return;
			case XmlaPackage.DATA_ITEM__MIME_TYPE:
				setMimeType((String)newValue);
				return;
			case XmlaPackage.DATA_ITEM__NULL_PROCESSING:
				setNullProcessing((NullProcessingType)newValue);
				return;
			case XmlaPackage.DATA_ITEM__TRIMMING:
				setTrimming((TrimmingType)newValue);
				return;
			case XmlaPackage.DATA_ITEM__INVALID_XML_CHARACTERS:
				setInvalidXmlCharacters((InvalidXmlCharactersType)newValue);
				return;
			case XmlaPackage.DATA_ITEM__COLLATION:
				setCollation((String)newValue);
				return;
			case XmlaPackage.DATA_ITEM__FORMAT:
				setFormat((FormatType)newValue);
				return;
			case XmlaPackage.DATA_ITEM__SOURCE:
				setSource((Binding)newValue);
				return;
			case XmlaPackage.DATA_ITEM__ANNOTATIONS:
				setAnnotations((AnnotationsType30)newValue);
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
			case XmlaPackage.DATA_ITEM__DATA_TYPE:
				unsetDataType();
				return;
			case XmlaPackage.DATA_ITEM__DATA_SIZE:
				setDataSize(DATA_SIZE_EDEFAULT);
				return;
			case XmlaPackage.DATA_ITEM__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
				return;
			case XmlaPackage.DATA_ITEM__NULL_PROCESSING:
				unsetNullProcessing();
				return;
			case XmlaPackage.DATA_ITEM__TRIMMING:
				unsetTrimming();
				return;
			case XmlaPackage.DATA_ITEM__INVALID_XML_CHARACTERS:
				unsetInvalidXmlCharacters();
				return;
			case XmlaPackage.DATA_ITEM__COLLATION:
				setCollation(COLLATION_EDEFAULT);
				return;
			case XmlaPackage.DATA_ITEM__FORMAT:
				unsetFormat();
				return;
			case XmlaPackage.DATA_ITEM__SOURCE:
				setSource((Binding)null);
				return;
			case XmlaPackage.DATA_ITEM__ANNOTATIONS:
				setAnnotations((AnnotationsType30)null);
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
			case XmlaPackage.DATA_ITEM__DATA_TYPE:
				return isSetDataType();
			case XmlaPackage.DATA_ITEM__DATA_SIZE:
				return DATA_SIZE_EDEFAULT == null ? dataSize != null : !DATA_SIZE_EDEFAULT.equals(dataSize);
			case XmlaPackage.DATA_ITEM__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
			case XmlaPackage.DATA_ITEM__NULL_PROCESSING:
				return isSetNullProcessing();
			case XmlaPackage.DATA_ITEM__TRIMMING:
				return isSetTrimming();
			case XmlaPackage.DATA_ITEM__INVALID_XML_CHARACTERS:
				return isSetInvalidXmlCharacters();
			case XmlaPackage.DATA_ITEM__COLLATION:
				return COLLATION_EDEFAULT == null ? collation != null : !COLLATION_EDEFAULT.equals(collation);
			case XmlaPackage.DATA_ITEM__FORMAT:
				return isSetFormat();
			case XmlaPackage.DATA_ITEM__SOURCE:
				return source != null;
			case XmlaPackage.DATA_ITEM__ANNOTATIONS:
				return annotations != null;
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
		result.append(" (dataType: ");
		if (dataTypeESet) result.append(dataType); else result.append("<unset>");
		result.append(", dataSize: ");
		result.append(dataSize);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(", nullProcessing: ");
		if (nullProcessingESet) result.append(nullProcessing); else result.append("<unset>");
		result.append(", trimming: ");
		if (trimmingESet) result.append(trimming); else result.append("<unset>");
		result.append(", invalidXmlCharacters: ");
		if (invalidXmlCharactersESet) result.append(invalidXmlCharacters); else result.append("<unset>");
		result.append(", collation: ");
		result.append(collation);
		result.append(", format: ");
		if (formatESet) result.append(format); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DataItemImpl
