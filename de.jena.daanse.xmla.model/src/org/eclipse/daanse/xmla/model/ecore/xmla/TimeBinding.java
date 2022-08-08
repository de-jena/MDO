/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getCalendarStartDate <em>Calendar Start Date</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getCalendarEndDate <em>Calendar End Date</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getFirstDayOfWeek <em>First Day Of Week</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getCalendarLanguage <em>Calendar Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getFiscalFirstMonth <em>Fiscal First Month</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getFiscalFirstDayOfMonth <em>Fiscal First Day Of Month</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getFiscalYearName <em>Fiscal Year Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getReportingFirstMonth <em>Reporting First Month</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getReportingFirstWeekOfMonth <em>Reporting First Week Of Month</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getReportingWeekToMonthPattern <em>Reporting Week To Month Pattern</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getManufacturingFirstMonth <em>Manufacturing First Month</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getManufacturingFirstWeekOfMonth <em>Manufacturing First Week Of Month</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getManufacturingExtraMonthQuarter <em>Manufacturing Extra Month Quarter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding()
 * @model extendedMetaData="name='TimeBinding' kind='elementOnly'"
 * @generated
 */
public interface TimeBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Calendar Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar Start Date</em>' attribute.
	 * @see #setCalendarStartDate(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_CalendarStartDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='CalendarStartDate'"
	 * @generated
	 */
	XMLGregorianCalendar getCalendarStartDate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getCalendarStartDate <em>Calendar Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar Start Date</em>' attribute.
	 * @see #getCalendarStartDate()
	 * @generated
	 */
	void setCalendarStartDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Calendar End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar End Date</em>' attribute.
	 * @see #setCalendarEndDate(XMLGregorianCalendar)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_CalendarEndDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='CalendarEndDate'"
	 * @generated
	 */
	XMLGregorianCalendar getCalendarEndDate();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getCalendarEndDate <em>Calendar End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar End Date</em>' attribute.
	 * @see #getCalendarEndDate()
	 * @generated
	 */
	void setCalendarEndDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>First Day Of Week</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Day Of Week</em>' attribute.
	 * @see #setFirstDayOfWeek(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_FirstDayOfWeek()
	 * @model dataType="org.eclipse.daanse.xmla.model.ecore.xmla.FirstDayOfWeekType"
	 *        extendedMetaData="kind='element' name='FirstDayOfWeek'"
	 * @generated
	 */
	BigInteger getFirstDayOfWeek();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getFirstDayOfWeek <em>First Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Day Of Week</em>' attribute.
	 * @see #getFirstDayOfWeek()
	 * @generated
	 */
	void setFirstDayOfWeek(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Calendar Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calendar Language</em>' attribute.
	 * @see #setCalendarLanguage(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_CalendarLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='element' name='CalendarLanguage'"
	 * @generated
	 */
	BigInteger getCalendarLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getCalendarLanguage <em>Calendar Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calendar Language</em>' attribute.
	 * @see #getCalendarLanguage()
	 * @generated
	 */
	void setCalendarLanguage(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Fiscal First Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiscal First Month</em>' attribute.
	 * @see #setFiscalFirstMonth(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_FiscalFirstMonth()
	 * @model dataType="org.eclipse.daanse.xmla.model.ecore.xmla.FiscalFirstMonthType"
	 *        extendedMetaData="kind='element' name='FiscalFirstMonth'"
	 * @generated
	 */
	BigInteger getFiscalFirstMonth();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getFiscalFirstMonth <em>Fiscal First Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiscal First Month</em>' attribute.
	 * @see #getFiscalFirstMonth()
	 * @generated
	 */
	void setFiscalFirstMonth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Fiscal First Day Of Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiscal First Day Of Month</em>' attribute.
	 * @see #setFiscalFirstDayOfMonth(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_FiscalFirstDayOfMonth()
	 * @model dataType="org.eclipse.daanse.xmla.model.ecore.xmla.FiscalFirstDayOfMonthType"
	 *        extendedMetaData="kind='element' name='FiscalFirstDayOfMonth'"
	 * @generated
	 */
	BigInteger getFiscalFirstDayOfMonth();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getFiscalFirstDayOfMonth <em>Fiscal First Day Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiscal First Day Of Month</em>' attribute.
	 * @see #getFiscalFirstDayOfMonth()
	 * @generated
	 */
	void setFiscalFirstDayOfMonth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Fiscal Year Name</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.FiscalYearNameType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fiscal Year Name</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.FiscalYearNameType
	 * @see #isSetFiscalYearName()
	 * @see #unsetFiscalYearName()
	 * @see #setFiscalYearName(FiscalYearNameType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_FiscalYearName()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='FiscalYearName'"
	 * @generated
	 */
	FiscalYearNameType getFiscalYearName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getFiscalYearName <em>Fiscal Year Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fiscal Year Name</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.FiscalYearNameType
	 * @see #isSetFiscalYearName()
	 * @see #unsetFiscalYearName()
	 * @see #getFiscalYearName()
	 * @generated
	 */
	void setFiscalYearName(FiscalYearNameType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getFiscalYearName <em>Fiscal Year Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFiscalYearName()
	 * @see #getFiscalYearName()
	 * @see #setFiscalYearName(FiscalYearNameType)
	 * @generated
	 */
	void unsetFiscalYearName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getFiscalYearName <em>Fiscal Year Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fiscal Year Name</em>' attribute is set.
	 * @see #unsetFiscalYearName()
	 * @see #getFiscalYearName()
	 * @see #setFiscalYearName(FiscalYearNameType)
	 * @generated
	 */
	boolean isSetFiscalYearName();

	/**
	 * Returns the value of the '<em><b>Reporting First Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting First Month</em>' attribute.
	 * @see #setReportingFirstMonth(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_ReportingFirstMonth()
	 * @model dataType="org.eclipse.daanse.xmla.model.ecore.xmla.ReportingFirstMonthType"
	 *        extendedMetaData="kind='element' name='ReportingFirstMonth'"
	 * @generated
	 */
	BigInteger getReportingFirstMonth();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getReportingFirstMonth <em>Reporting First Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting First Month</em>' attribute.
	 * @see #getReportingFirstMonth()
	 * @generated
	 */
	void setReportingFirstMonth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Reporting First Week Of Month</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportingFirstWeekOfMonthType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting First Week Of Month</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReportingFirstWeekOfMonthType
	 * @see #isSetReportingFirstWeekOfMonth()
	 * @see #unsetReportingFirstWeekOfMonth()
	 * @see #setReportingFirstWeekOfMonth(ReportingFirstWeekOfMonthType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_ReportingFirstWeekOfMonth()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ReportingFirstWeekOfMonth'"
	 * @generated
	 */
	ReportingFirstWeekOfMonthType getReportingFirstWeekOfMonth();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getReportingFirstWeekOfMonth <em>Reporting First Week Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting First Week Of Month</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReportingFirstWeekOfMonthType
	 * @see #isSetReportingFirstWeekOfMonth()
	 * @see #unsetReportingFirstWeekOfMonth()
	 * @see #getReportingFirstWeekOfMonth()
	 * @generated
	 */
	void setReportingFirstWeekOfMonth(ReportingFirstWeekOfMonthType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getReportingFirstWeekOfMonth <em>Reporting First Week Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReportingFirstWeekOfMonth()
	 * @see #getReportingFirstWeekOfMonth()
	 * @see #setReportingFirstWeekOfMonth(ReportingFirstWeekOfMonthType)
	 * @generated
	 */
	void unsetReportingFirstWeekOfMonth();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getReportingFirstWeekOfMonth <em>Reporting First Week Of Month</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reporting First Week Of Month</em>' attribute is set.
	 * @see #unsetReportingFirstWeekOfMonth()
	 * @see #getReportingFirstWeekOfMonth()
	 * @see #setReportingFirstWeekOfMonth(ReportingFirstWeekOfMonthType)
	 * @generated
	 */
	boolean isSetReportingFirstWeekOfMonth();

	/**
	 * Returns the value of the '<em><b>Reporting Week To Month Pattern</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportingWeekToMonthPatternType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reporting Week To Month Pattern</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReportingWeekToMonthPatternType
	 * @see #isSetReportingWeekToMonthPattern()
	 * @see #unsetReportingWeekToMonthPattern()
	 * @see #setReportingWeekToMonthPattern(ReportingWeekToMonthPatternType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_ReportingWeekToMonthPattern()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ReportingWeekToMonthPattern'"
	 * @generated
	 */
	ReportingWeekToMonthPatternType getReportingWeekToMonthPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getReportingWeekToMonthPattern <em>Reporting Week To Month Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reporting Week To Month Pattern</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.ReportingWeekToMonthPatternType
	 * @see #isSetReportingWeekToMonthPattern()
	 * @see #unsetReportingWeekToMonthPattern()
	 * @see #getReportingWeekToMonthPattern()
	 * @generated
	 */
	void setReportingWeekToMonthPattern(ReportingWeekToMonthPatternType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getReportingWeekToMonthPattern <em>Reporting Week To Month Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReportingWeekToMonthPattern()
	 * @see #getReportingWeekToMonthPattern()
	 * @see #setReportingWeekToMonthPattern(ReportingWeekToMonthPatternType)
	 * @generated
	 */
	void unsetReportingWeekToMonthPattern();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getReportingWeekToMonthPattern <em>Reporting Week To Month Pattern</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reporting Week To Month Pattern</em>' attribute is set.
	 * @see #unsetReportingWeekToMonthPattern()
	 * @see #getReportingWeekToMonthPattern()
	 * @see #setReportingWeekToMonthPattern(ReportingWeekToMonthPatternType)
	 * @generated
	 */
	boolean isSetReportingWeekToMonthPattern();

	/**
	 * Returns the value of the '<em><b>Manufacturing First Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturing First Month</em>' attribute.
	 * @see #setManufacturingFirstMonth(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_ManufacturingFirstMonth()
	 * @model dataType="org.eclipse.daanse.xmla.model.ecore.xmla.ManufacturingFirstMonthType"
	 *        extendedMetaData="kind='element' name='ManufacturingFirstMonth'"
	 * @generated
	 */
	BigInteger getManufacturingFirstMonth();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getManufacturingFirstMonth <em>Manufacturing First Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturing First Month</em>' attribute.
	 * @see #getManufacturingFirstMonth()
	 * @generated
	 */
	void setManufacturingFirstMonth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Manufacturing First Week Of Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturing First Week Of Month</em>' attribute.
	 * @see #setManufacturingFirstWeekOfMonth(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_ManufacturingFirstWeekOfMonth()
	 * @model dataType="org.eclipse.daanse.xmla.model.ecore.xmla.ManufacturingFirstWeekOfMonthType"
	 *        extendedMetaData="kind='element' name='ManufacturingFirstWeekOfMonth'"
	 * @generated
	 */
	BigInteger getManufacturingFirstWeekOfMonth();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getManufacturingFirstWeekOfMonth <em>Manufacturing First Week Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturing First Week Of Month</em>' attribute.
	 * @see #getManufacturingFirstWeekOfMonth()
	 * @generated
	 */
	void setManufacturingFirstWeekOfMonth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Manufacturing Extra Month Quarter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturing Extra Month Quarter</em>' attribute.
	 * @see #setManufacturingExtraMonthQuarter(BigInteger)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getTimeBinding_ManufacturingExtraMonthQuarter()
	 * @model dataType="org.eclipse.daanse.xmla.model.ecore.xmla.ManufacturingExtraMonthQuarterType"
	 *        extendedMetaData="kind='element' name='ManufacturingExtraMonthQuarter'"
	 * @generated
	 */
	BigInteger getManufacturingExtraMonthQuarter();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding#getManufacturingExtraMonthQuarter <em>Manufacturing Extra Month Quarter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturing Extra Month Quarter</em>' attribute.
	 * @see #getManufacturingExtraMonthQuarter()
	 * @generated
	 */
	void setManufacturingExtraMonthQuarter(BigInteger value);

} // TimeBinding
