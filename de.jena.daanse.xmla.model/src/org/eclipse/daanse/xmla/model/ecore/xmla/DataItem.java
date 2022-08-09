/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getDataSize <em>Data Size</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getMimeType <em>Mime Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getNullProcessing <em>Null Processing</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getTrimming <em>Trimming</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getInvalidXmlCharacters <em>Invalid Xml Characters</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getFormat <em>Format</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataItem()
 * @model extendedMetaData="name='DataItem' kind='elementOnly'"
 * @generated
 */
public interface DataItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.DataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataTypeType
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #setDataType(DataTypeType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataItem_DataType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='DataType'"
	 * @generated
	 */
	DataTypeType getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.DataTypeType
	 * @see #isSetDataType()
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataTypeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDataType()
	 * @see #getDataType()
	 * @see #setDataType(DataTypeType)
	 * @generated
	 */
	void unsetDataType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getDataType <em>Data Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Data Type</em>' attribute is set.
	 * @see #unsetDataType()
	 * @see #getDataType()
	 * @see #setDataType(DataTypeType)
	 * @generated
	 */
	boolean isSetDataType();

	/**
	 * Returns the value of the '<em><b>Data Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Size</em>' attribute.
	 * @see #setDataSize(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataItem_DataSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='DataSize'"
	 * @generated
	 */
	BigInteger getDataSize();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getDataSize <em>Data Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Size</em>' attribute.
	 * @see #getDataSize()
	 * @generated
	 */
	void setDataSize(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataItem_MimeType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='MimeType'"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

	/**
	 * Returns the value of the '<em><b>Null Processing</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.NullProcessingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null Processing</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NullProcessingType
	 * @see #isSetNullProcessing()
	 * @see #unsetNullProcessing()
	 * @see #setNullProcessing(NullProcessingType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataItem_NullProcessing()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='NullProcessing'"
	 * @generated
	 */
	NullProcessingType getNullProcessing();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getNullProcessing <em>Null Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Processing</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.NullProcessingType
	 * @see #isSetNullProcessing()
	 * @see #unsetNullProcessing()
	 * @see #getNullProcessing()
	 * @generated
	 */
	void setNullProcessing(NullProcessingType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getNullProcessing <em>Null Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullProcessing()
	 * @see #getNullProcessing()
	 * @see #setNullProcessing(NullProcessingType)
	 * @generated
	 */
	void unsetNullProcessing();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getNullProcessing <em>Null Processing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Null Processing</em>' attribute is set.
	 * @see #unsetNullProcessing()
	 * @see #getNullProcessing()
	 * @see #setNullProcessing(NullProcessingType)
	 * @generated
	 */
	boolean isSetNullProcessing();

	/**
	 * Returns the value of the '<em><b>Trimming</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.TrimmingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trimming</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TrimmingType
	 * @see #isSetTrimming()
	 * @see #unsetTrimming()
	 * @see #setTrimming(TrimmingType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataItem_Trimming()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Trimming'"
	 * @generated
	 */
	TrimmingType getTrimming();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getTrimming <em>Trimming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trimming</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TrimmingType
	 * @see #isSetTrimming()
	 * @see #unsetTrimming()
	 * @see #getTrimming()
	 * @generated
	 */
	void setTrimming(TrimmingType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getTrimming <em>Trimming</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTrimming()
	 * @see #getTrimming()
	 * @see #setTrimming(TrimmingType)
	 * @generated
	 */
	void unsetTrimming();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getTrimming <em>Trimming</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Trimming</em>' attribute is set.
	 * @see #unsetTrimming()
	 * @see #getTrimming()
	 * @see #setTrimming(TrimmingType)
	 * @generated
	 */
	boolean isSetTrimming();

	/**
	 * Returns the value of the '<em><b>Invalid Xml Characters</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.InvalidXmlCharactersType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Xml Characters</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.InvalidXmlCharactersType
	 * @see #isSetInvalidXmlCharacters()
	 * @see #unsetInvalidXmlCharacters()
	 * @see #setInvalidXmlCharacters(InvalidXmlCharactersType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataItem_InvalidXmlCharacters()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='InvalidXmlCharacters'"
	 * @generated
	 */
	InvalidXmlCharactersType getInvalidXmlCharacters();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getInvalidXmlCharacters <em>Invalid Xml Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Xml Characters</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.InvalidXmlCharactersType
	 * @see #isSetInvalidXmlCharacters()
	 * @see #unsetInvalidXmlCharacters()
	 * @see #getInvalidXmlCharacters()
	 * @generated
	 */
	void setInvalidXmlCharacters(InvalidXmlCharactersType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getInvalidXmlCharacters <em>Invalid Xml Characters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInvalidXmlCharacters()
	 * @see #getInvalidXmlCharacters()
	 * @see #setInvalidXmlCharacters(InvalidXmlCharactersType)
	 * @generated
	 */
	void unsetInvalidXmlCharacters();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getInvalidXmlCharacters <em>Invalid Xml Characters</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Invalid Xml Characters</em>' attribute is set.
	 * @see #unsetInvalidXmlCharacters()
	 * @see #getInvalidXmlCharacters()
	 * @see #setInvalidXmlCharacters(InvalidXmlCharactersType)
	 * @generated
	 */
	boolean isSetInvalidXmlCharacters();

	/**
	 * Returns the value of the '<em><b>Collation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collation</em>' attribute.
	 * @see #setCollation(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataItem_Collation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Collation'"
	 * @generated
	 */
	String getCollation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getCollation <em>Collation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collation</em>' attribute.
	 * @see #getCollation()
	 * @generated
	 */
	void setCollation(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.FormatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.FormatType
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #setFormat(FormatType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataItem_Format()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Format'"
	 * @generated
	 */
	FormatType getFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.FormatType
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(FormatType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormat()
	 * @see #getFormat()
	 * @see #setFormat(FormatType)
	 * @generated
	 */
	void unsetFormat();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getFormat <em>Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Format</em>' attribute is set.
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @see #setFormat(FormatType)
	 * @generated
	 */
	boolean isSetFormat();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Binding)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataItem_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source'"
	 * @generated
	 */
	Binding getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Binding value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' containment reference.
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getDataItem_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.DataItem#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

} // DataItem
