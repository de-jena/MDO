/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_exception;

import org.eclipse.daanse.xmla.model.ecore.engine200.WarningLocationObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getLineOffset <em>Line Offset</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getTextLength <em>Text Length</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getDependsOnObject <em>Depends On Object</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getRowNumber <em>Row Number</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getMessageLocation()
 * @model extendedMetaData="name='MessageLocation' kind='elementOnly'"
 * @generated
 */
public interface MessageLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(StartType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getMessageLocation_Start()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Start'"
	 * @generated
	 */
	StartType getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(StartType value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(EndType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getMessageLocation_End()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='End'"
	 * @generated
	 */
	EndType getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(EndType value);

	/**
	 * Returns the value of the '<em><b>Line Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Offset</em>' attribute.
	 * @see #isSetLineOffset()
	 * @see #unsetLineOffset()
	 * @see #setLineOffset(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getMessageLocation_LineOffset()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='LineOffset'"
	 * @generated
	 */
	int getLineOffset();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getLineOffset <em>Line Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Offset</em>' attribute.
	 * @see #isSetLineOffset()
	 * @see #unsetLineOffset()
	 * @see #getLineOffset()
	 * @generated
	 */
	void setLineOffset(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getLineOffset <em>Line Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLineOffset()
	 * @see #getLineOffset()
	 * @see #setLineOffset(int)
	 * @generated
	 */
	void unsetLineOffset();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getLineOffset <em>Line Offset</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Line Offset</em>' attribute is set.
	 * @see #unsetLineOffset()
	 * @see #getLineOffset()
	 * @see #setLineOffset(int)
	 * @generated
	 */
	boolean isSetLineOffset();

	/**
	 * Returns the value of the '<em><b>Text Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Length</em>' attribute.
	 * @see #isSetTextLength()
	 * @see #unsetTextLength()
	 * @see #setTextLength(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getMessageLocation_TextLength()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='TextLength'"
	 * @generated
	 */
	int getTextLength();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getTextLength <em>Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Length</em>' attribute.
	 * @see #isSetTextLength()
	 * @see #unsetTextLength()
	 * @see #getTextLength()
	 * @generated
	 */
	void setTextLength(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getTextLength <em>Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextLength()
	 * @see #getTextLength()
	 * @see #setTextLength(int)
	 * @generated
	 */
	void unsetTextLength();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getTextLength <em>Text Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Length</em>' attribute is set.
	 * @see #unsetTextLength()
	 * @see #getTextLength()
	 * @see #setTextLength(int)
	 * @generated
	 */
	boolean isSetTextLength();

	/**
	 * Returns the value of the '<em><b>Source Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Object</em>' containment reference.
	 * @see #setSourceObject(WarningLocationObject)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getMessageLocation_SourceObject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SourceObject'"
	 * @generated
	 */
	WarningLocationObject getSourceObject();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getSourceObject <em>Source Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Object</em>' containment reference.
	 * @see #getSourceObject()
	 * @generated
	 */
	void setSourceObject(WarningLocationObject value);

	/**
	 * Returns the value of the '<em><b>Depends On Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On Object</em>' containment reference.
	 * @see #setDependsOnObject(WarningLocationObject)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getMessageLocation_DependsOnObject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DependsOnObject'"
	 * @generated
	 */
	WarningLocationObject getDependsOnObject();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getDependsOnObject <em>Depends On Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On Object</em>' containment reference.
	 * @see #getDependsOnObject()
	 * @generated
	 */
	void setDependsOnObject(WarningLocationObject value);

	/**
	 * Returns the value of the '<em><b>Row Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Number</em>' attribute.
	 * @see #isSetRowNumber()
	 * @see #unsetRowNumber()
	 * @see #setRowNumber(int)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_exception.Xmla_exceptionPackage#getMessageLocation_RowNumber()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='RowNumber'"
	 * @generated
	 */
	int getRowNumber();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getRowNumber <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Number</em>' attribute.
	 * @see #isSetRowNumber()
	 * @see #unsetRowNumber()
	 * @see #getRowNumber()
	 * @generated
	 */
	void setRowNumber(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getRowNumber <em>Row Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRowNumber()
	 * @see #getRowNumber()
	 * @see #setRowNumber(int)
	 * @generated
	 */
	void unsetRowNumber();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_exception.MessageLocation#getRowNumber <em>Row Number</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Row Number</em>' attribute is set.
	 * @see #unsetRowNumber()
	 * @see #getRowNumber()
	 * @see #setRowNumber(int)
	 * @generated
	 */
	boolean isSetRowNumber();

} // MessageLocation
