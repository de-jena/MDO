/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.daanse.xmla.model.ecore.xmla.FiscalYearNameType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportingFirstWeekOfMonthType;
import org.eclipse.daanse.xmla.model.ecore.xmla.ReportingWeekToMonthPatternType;
import org.eclipse.daanse.xmla.model.ecore.xmla.TimeBinding;
import org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getCalendarStartDate <em>Calendar Start Date</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getCalendarEndDate <em>Calendar End Date</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getFirstDayOfWeek <em>First Day Of Week</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getCalendarLanguage <em>Calendar Language</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getFiscalFirstMonth <em>Fiscal First Month</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getFiscalFirstDayOfMonth <em>Fiscal First Day Of Month</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getFiscalYearName <em>Fiscal Year Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getReportingFirstMonth <em>Reporting First Month</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getReportingFirstWeekOfMonth <em>Reporting First Week Of Month</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getReportingWeekToMonthPattern <em>Reporting Week To Month Pattern</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getManufacturingFirstMonth <em>Manufacturing First Month</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getManufacturingFirstWeekOfMonth <em>Manufacturing First Week Of Month</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.impl.TimeBindingImpl#getManufacturingExtraMonthQuarter <em>Manufacturing Extra Month Quarter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeBindingImpl extends BindingImpl implements TimeBinding {
	/**
	 * The default value of the '{@link #getCalendarStartDate() <em>Calendar Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CALENDAR_START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalendarStartDate() <em>Calendar Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarStartDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar calendarStartDate = CALENDAR_START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalendarEndDate() <em>Calendar End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CALENDAR_END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalendarEndDate() <em>Calendar End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarEndDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar calendarEndDate = CALENDAR_END_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstDayOfWeek() <em>First Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FIRST_DAY_OF_WEEK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstDayOfWeek() <em>First Day Of Week</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstDayOfWeek()
	 * @generated
	 * @ordered
	 */
	protected BigInteger firstDayOfWeek = FIRST_DAY_OF_WEEK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCalendarLanguage() <em>Calendar Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger CALENDAR_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalendarLanguage() <em>Calendar Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalendarLanguage()
	 * @generated
	 * @ordered
	 */
	protected BigInteger calendarLanguage = CALENDAR_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiscalFirstMonth() <em>Fiscal First Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalFirstMonth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FISCAL_FIRST_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiscalFirstMonth() <em>Fiscal First Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalFirstMonth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger fiscalFirstMonth = FISCAL_FIRST_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiscalFirstDayOfMonth() <em>Fiscal First Day Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalFirstDayOfMonth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger FISCAL_FIRST_DAY_OF_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiscalFirstDayOfMonth() <em>Fiscal First Day Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalFirstDayOfMonth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger fiscalFirstDayOfMonth = FISCAL_FIRST_DAY_OF_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiscalYearName() <em>Fiscal Year Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalYearName()
	 * @generated
	 * @ordered
	 */
	protected static final FiscalYearNameType FISCAL_YEAR_NAME_EDEFAULT = FiscalYearNameType.CALENDAR_YEAR_NAME;

	/**
	 * The cached value of the '{@link #getFiscalYearName() <em>Fiscal Year Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiscalYearName()
	 * @generated
	 * @ordered
	 */
	protected FiscalYearNameType fiscalYearName = FISCAL_YEAR_NAME_EDEFAULT;

	/**
	 * This is true if the Fiscal Year Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fiscalYearNameESet;

	/**
	 * The default value of the '{@link #getReportingFirstMonth() <em>Reporting First Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingFirstMonth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger REPORTING_FIRST_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReportingFirstMonth() <em>Reporting First Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingFirstMonth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger reportingFirstMonth = REPORTING_FIRST_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getReportingFirstWeekOfMonth() <em>Reporting First Week Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingFirstWeekOfMonth()
	 * @generated
	 * @ordered
	 */
	protected static final ReportingFirstWeekOfMonthType REPORTING_FIRST_WEEK_OF_MONTH_EDEFAULT = ReportingFirstWeekOfMonthType._1;

	/**
	 * The cached value of the '{@link #getReportingFirstWeekOfMonth() <em>Reporting First Week Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingFirstWeekOfMonth()
	 * @generated
	 * @ordered
	 */
	protected ReportingFirstWeekOfMonthType reportingFirstWeekOfMonth = REPORTING_FIRST_WEEK_OF_MONTH_EDEFAULT;

	/**
	 * This is true if the Reporting First Week Of Month attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reportingFirstWeekOfMonthESet;

	/**
	 * The default value of the '{@link #getReportingWeekToMonthPattern() <em>Reporting Week To Month Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingWeekToMonthPattern()
	 * @generated
	 * @ordered
	 */
	protected static final ReportingWeekToMonthPatternType REPORTING_WEEK_TO_MONTH_PATTERN_EDEFAULT = ReportingWeekToMonthPatternType.WEEKS445;

	/**
	 * The cached value of the '{@link #getReportingWeekToMonthPattern() <em>Reporting Week To Month Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportingWeekToMonthPattern()
	 * @generated
	 * @ordered
	 */
	protected ReportingWeekToMonthPatternType reportingWeekToMonthPattern = REPORTING_WEEK_TO_MONTH_PATTERN_EDEFAULT;

	/**
	 * This is true if the Reporting Week To Month Pattern attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reportingWeekToMonthPatternESet;

	/**
	 * The default value of the '{@link #getManufacturingFirstMonth() <em>Manufacturing First Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturingFirstMonth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MANUFACTURING_FIRST_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturingFirstMonth() <em>Manufacturing First Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturingFirstMonth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger manufacturingFirstMonth = MANUFACTURING_FIRST_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturingFirstWeekOfMonth() <em>Manufacturing First Week Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturingFirstWeekOfMonth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MANUFACTURING_FIRST_WEEK_OF_MONTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturingFirstWeekOfMonth() <em>Manufacturing First Week Of Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturingFirstWeekOfMonth()
	 * @generated
	 * @ordered
	 */
	protected BigInteger manufacturingFirstWeekOfMonth = MANUFACTURING_FIRST_WEEK_OF_MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getManufacturingExtraMonthQuarter() <em>Manufacturing Extra Month Quarter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturingExtraMonthQuarter()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MANUFACTURING_EXTRA_MONTH_QUARTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getManufacturingExtraMonthQuarter() <em>Manufacturing Extra Month Quarter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturingExtraMonthQuarter()
	 * @generated
	 * @ordered
	 */
	protected BigInteger manufacturingExtraMonthQuarter = MANUFACTURING_EXTRA_MONTH_QUARTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmlaPackage.Literals.TIME_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCalendarStartDate() {
		return calendarStartDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendarStartDate(XMLGregorianCalendar newCalendarStartDate) {
		XMLGregorianCalendar oldCalendarStartDate = calendarStartDate;
		calendarStartDate = newCalendarStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__CALENDAR_START_DATE, oldCalendarStartDate, calendarStartDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCalendarEndDate() {
		return calendarEndDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendarEndDate(XMLGregorianCalendar newCalendarEndDate) {
		XMLGregorianCalendar oldCalendarEndDate = calendarEndDate;
		calendarEndDate = newCalendarEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__CALENDAR_END_DATE, oldCalendarEndDate, calendarEndDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFirstDayOfWeek() {
		return firstDayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstDayOfWeek(BigInteger newFirstDayOfWeek) {
		BigInteger oldFirstDayOfWeek = firstDayOfWeek;
		firstDayOfWeek = newFirstDayOfWeek;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__FIRST_DAY_OF_WEEK, oldFirstDayOfWeek, firstDayOfWeek));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCalendarLanguage() {
		return calendarLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalendarLanguage(BigInteger newCalendarLanguage) {
		BigInteger oldCalendarLanguage = calendarLanguage;
		calendarLanguage = newCalendarLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__CALENDAR_LANGUAGE, oldCalendarLanguage, calendarLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFiscalFirstMonth() {
		return fiscalFirstMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiscalFirstMonth(BigInteger newFiscalFirstMonth) {
		BigInteger oldFiscalFirstMonth = fiscalFirstMonth;
		fiscalFirstMonth = newFiscalFirstMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__FISCAL_FIRST_MONTH, oldFiscalFirstMonth, fiscalFirstMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getFiscalFirstDayOfMonth() {
		return fiscalFirstDayOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiscalFirstDayOfMonth(BigInteger newFiscalFirstDayOfMonth) {
		BigInteger oldFiscalFirstDayOfMonth = fiscalFirstDayOfMonth;
		fiscalFirstDayOfMonth = newFiscalFirstDayOfMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__FISCAL_FIRST_DAY_OF_MONTH, oldFiscalFirstDayOfMonth, fiscalFirstDayOfMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FiscalYearNameType getFiscalYearName() {
		return fiscalYearName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFiscalYearName(FiscalYearNameType newFiscalYearName) {
		FiscalYearNameType oldFiscalYearName = fiscalYearName;
		fiscalYearName = newFiscalYearName == null ? FISCAL_YEAR_NAME_EDEFAULT : newFiscalYearName;
		boolean oldFiscalYearNameESet = fiscalYearNameESet;
		fiscalYearNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__FISCAL_YEAR_NAME, oldFiscalYearName, fiscalYearName, !oldFiscalYearNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFiscalYearName() {
		FiscalYearNameType oldFiscalYearName = fiscalYearName;
		boolean oldFiscalYearNameESet = fiscalYearNameESet;
		fiscalYearName = FISCAL_YEAR_NAME_EDEFAULT;
		fiscalYearNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.TIME_BINDING__FISCAL_YEAR_NAME, oldFiscalYearName, FISCAL_YEAR_NAME_EDEFAULT, oldFiscalYearNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFiscalYearName() {
		return fiscalYearNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getReportingFirstMonth() {
		return reportingFirstMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportingFirstMonth(BigInteger newReportingFirstMonth) {
		BigInteger oldReportingFirstMonth = reportingFirstMonth;
		reportingFirstMonth = newReportingFirstMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__REPORTING_FIRST_MONTH, oldReportingFirstMonth, reportingFirstMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingFirstWeekOfMonthType getReportingFirstWeekOfMonth() {
		return reportingFirstWeekOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportingFirstWeekOfMonth(ReportingFirstWeekOfMonthType newReportingFirstWeekOfMonth) {
		ReportingFirstWeekOfMonthType oldReportingFirstWeekOfMonth = reportingFirstWeekOfMonth;
		reportingFirstWeekOfMonth = newReportingFirstWeekOfMonth == null ? REPORTING_FIRST_WEEK_OF_MONTH_EDEFAULT : newReportingFirstWeekOfMonth;
		boolean oldReportingFirstWeekOfMonthESet = reportingFirstWeekOfMonthESet;
		reportingFirstWeekOfMonthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__REPORTING_FIRST_WEEK_OF_MONTH, oldReportingFirstWeekOfMonth, reportingFirstWeekOfMonth, !oldReportingFirstWeekOfMonthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReportingFirstWeekOfMonth() {
		ReportingFirstWeekOfMonthType oldReportingFirstWeekOfMonth = reportingFirstWeekOfMonth;
		boolean oldReportingFirstWeekOfMonthESet = reportingFirstWeekOfMonthESet;
		reportingFirstWeekOfMonth = REPORTING_FIRST_WEEK_OF_MONTH_EDEFAULT;
		reportingFirstWeekOfMonthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.TIME_BINDING__REPORTING_FIRST_WEEK_OF_MONTH, oldReportingFirstWeekOfMonth, REPORTING_FIRST_WEEK_OF_MONTH_EDEFAULT, oldReportingFirstWeekOfMonthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReportingFirstWeekOfMonth() {
		return reportingFirstWeekOfMonthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportingWeekToMonthPatternType getReportingWeekToMonthPattern() {
		return reportingWeekToMonthPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportingWeekToMonthPattern(ReportingWeekToMonthPatternType newReportingWeekToMonthPattern) {
		ReportingWeekToMonthPatternType oldReportingWeekToMonthPattern = reportingWeekToMonthPattern;
		reportingWeekToMonthPattern = newReportingWeekToMonthPattern == null ? REPORTING_WEEK_TO_MONTH_PATTERN_EDEFAULT : newReportingWeekToMonthPattern;
		boolean oldReportingWeekToMonthPatternESet = reportingWeekToMonthPatternESet;
		reportingWeekToMonthPatternESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__REPORTING_WEEK_TO_MONTH_PATTERN, oldReportingWeekToMonthPattern, reportingWeekToMonthPattern, !oldReportingWeekToMonthPatternESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReportingWeekToMonthPattern() {
		ReportingWeekToMonthPatternType oldReportingWeekToMonthPattern = reportingWeekToMonthPattern;
		boolean oldReportingWeekToMonthPatternESet = reportingWeekToMonthPatternESet;
		reportingWeekToMonthPattern = REPORTING_WEEK_TO_MONTH_PATTERN_EDEFAULT;
		reportingWeekToMonthPatternESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XmlaPackage.TIME_BINDING__REPORTING_WEEK_TO_MONTH_PATTERN, oldReportingWeekToMonthPattern, REPORTING_WEEK_TO_MONTH_PATTERN_EDEFAULT, oldReportingWeekToMonthPatternESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReportingWeekToMonthPattern() {
		return reportingWeekToMonthPatternESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getManufacturingFirstMonth() {
		return manufacturingFirstMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturingFirstMonth(BigInteger newManufacturingFirstMonth) {
		BigInteger oldManufacturingFirstMonth = manufacturingFirstMonth;
		manufacturingFirstMonth = newManufacturingFirstMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__MANUFACTURING_FIRST_MONTH, oldManufacturingFirstMonth, manufacturingFirstMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getManufacturingFirstWeekOfMonth() {
		return manufacturingFirstWeekOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturingFirstWeekOfMonth(BigInteger newManufacturingFirstWeekOfMonth) {
		BigInteger oldManufacturingFirstWeekOfMonth = manufacturingFirstWeekOfMonth;
		manufacturingFirstWeekOfMonth = newManufacturingFirstWeekOfMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__MANUFACTURING_FIRST_WEEK_OF_MONTH, oldManufacturingFirstWeekOfMonth, manufacturingFirstWeekOfMonth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getManufacturingExtraMonthQuarter() {
		return manufacturingExtraMonthQuarter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturingExtraMonthQuarter(BigInteger newManufacturingExtraMonthQuarter) {
		BigInteger oldManufacturingExtraMonthQuarter = manufacturingExtraMonthQuarter;
		manufacturingExtraMonthQuarter = newManufacturingExtraMonthQuarter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmlaPackage.TIME_BINDING__MANUFACTURING_EXTRA_MONTH_QUARTER, oldManufacturingExtraMonthQuarter, manufacturingExtraMonthQuarter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmlaPackage.TIME_BINDING__CALENDAR_START_DATE:
				return getCalendarStartDate();
			case XmlaPackage.TIME_BINDING__CALENDAR_END_DATE:
				return getCalendarEndDate();
			case XmlaPackage.TIME_BINDING__FIRST_DAY_OF_WEEK:
				return getFirstDayOfWeek();
			case XmlaPackage.TIME_BINDING__CALENDAR_LANGUAGE:
				return getCalendarLanguage();
			case XmlaPackage.TIME_BINDING__FISCAL_FIRST_MONTH:
				return getFiscalFirstMonth();
			case XmlaPackage.TIME_BINDING__FISCAL_FIRST_DAY_OF_MONTH:
				return getFiscalFirstDayOfMonth();
			case XmlaPackage.TIME_BINDING__FISCAL_YEAR_NAME:
				return getFiscalYearName();
			case XmlaPackage.TIME_BINDING__REPORTING_FIRST_MONTH:
				return getReportingFirstMonth();
			case XmlaPackage.TIME_BINDING__REPORTING_FIRST_WEEK_OF_MONTH:
				return getReportingFirstWeekOfMonth();
			case XmlaPackage.TIME_BINDING__REPORTING_WEEK_TO_MONTH_PATTERN:
				return getReportingWeekToMonthPattern();
			case XmlaPackage.TIME_BINDING__MANUFACTURING_FIRST_MONTH:
				return getManufacturingFirstMonth();
			case XmlaPackage.TIME_BINDING__MANUFACTURING_FIRST_WEEK_OF_MONTH:
				return getManufacturingFirstWeekOfMonth();
			case XmlaPackage.TIME_BINDING__MANUFACTURING_EXTRA_MONTH_QUARTER:
				return getManufacturingExtraMonthQuarter();
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
			case XmlaPackage.TIME_BINDING__CALENDAR_START_DATE:
				setCalendarStartDate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.TIME_BINDING__CALENDAR_END_DATE:
				setCalendarEndDate((XMLGregorianCalendar)newValue);
				return;
			case XmlaPackage.TIME_BINDING__FIRST_DAY_OF_WEEK:
				setFirstDayOfWeek((BigInteger)newValue);
				return;
			case XmlaPackage.TIME_BINDING__CALENDAR_LANGUAGE:
				setCalendarLanguage((BigInteger)newValue);
				return;
			case XmlaPackage.TIME_BINDING__FISCAL_FIRST_MONTH:
				setFiscalFirstMonth((BigInteger)newValue);
				return;
			case XmlaPackage.TIME_BINDING__FISCAL_FIRST_DAY_OF_MONTH:
				setFiscalFirstDayOfMonth((BigInteger)newValue);
				return;
			case XmlaPackage.TIME_BINDING__FISCAL_YEAR_NAME:
				setFiscalYearName((FiscalYearNameType)newValue);
				return;
			case XmlaPackage.TIME_BINDING__REPORTING_FIRST_MONTH:
				setReportingFirstMonth((BigInteger)newValue);
				return;
			case XmlaPackage.TIME_BINDING__REPORTING_FIRST_WEEK_OF_MONTH:
				setReportingFirstWeekOfMonth((ReportingFirstWeekOfMonthType)newValue);
				return;
			case XmlaPackage.TIME_BINDING__REPORTING_WEEK_TO_MONTH_PATTERN:
				setReportingWeekToMonthPattern((ReportingWeekToMonthPatternType)newValue);
				return;
			case XmlaPackage.TIME_BINDING__MANUFACTURING_FIRST_MONTH:
				setManufacturingFirstMonth((BigInteger)newValue);
				return;
			case XmlaPackage.TIME_BINDING__MANUFACTURING_FIRST_WEEK_OF_MONTH:
				setManufacturingFirstWeekOfMonth((BigInteger)newValue);
				return;
			case XmlaPackage.TIME_BINDING__MANUFACTURING_EXTRA_MONTH_QUARTER:
				setManufacturingExtraMonthQuarter((BigInteger)newValue);
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
			case XmlaPackage.TIME_BINDING__CALENDAR_START_DATE:
				setCalendarStartDate(CALENDAR_START_DATE_EDEFAULT);
				return;
			case XmlaPackage.TIME_BINDING__CALENDAR_END_DATE:
				setCalendarEndDate(CALENDAR_END_DATE_EDEFAULT);
				return;
			case XmlaPackage.TIME_BINDING__FIRST_DAY_OF_WEEK:
				setFirstDayOfWeek(FIRST_DAY_OF_WEEK_EDEFAULT);
				return;
			case XmlaPackage.TIME_BINDING__CALENDAR_LANGUAGE:
				setCalendarLanguage(CALENDAR_LANGUAGE_EDEFAULT);
				return;
			case XmlaPackage.TIME_BINDING__FISCAL_FIRST_MONTH:
				setFiscalFirstMonth(FISCAL_FIRST_MONTH_EDEFAULT);
				return;
			case XmlaPackage.TIME_BINDING__FISCAL_FIRST_DAY_OF_MONTH:
				setFiscalFirstDayOfMonth(FISCAL_FIRST_DAY_OF_MONTH_EDEFAULT);
				return;
			case XmlaPackage.TIME_BINDING__FISCAL_YEAR_NAME:
				unsetFiscalYearName();
				return;
			case XmlaPackage.TIME_BINDING__REPORTING_FIRST_MONTH:
				setReportingFirstMonth(REPORTING_FIRST_MONTH_EDEFAULT);
				return;
			case XmlaPackage.TIME_BINDING__REPORTING_FIRST_WEEK_OF_MONTH:
				unsetReportingFirstWeekOfMonth();
				return;
			case XmlaPackage.TIME_BINDING__REPORTING_WEEK_TO_MONTH_PATTERN:
				unsetReportingWeekToMonthPattern();
				return;
			case XmlaPackage.TIME_BINDING__MANUFACTURING_FIRST_MONTH:
				setManufacturingFirstMonth(MANUFACTURING_FIRST_MONTH_EDEFAULT);
				return;
			case XmlaPackage.TIME_BINDING__MANUFACTURING_FIRST_WEEK_OF_MONTH:
				setManufacturingFirstWeekOfMonth(MANUFACTURING_FIRST_WEEK_OF_MONTH_EDEFAULT);
				return;
			case XmlaPackage.TIME_BINDING__MANUFACTURING_EXTRA_MONTH_QUARTER:
				setManufacturingExtraMonthQuarter(MANUFACTURING_EXTRA_MONTH_QUARTER_EDEFAULT);
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
			case XmlaPackage.TIME_BINDING__CALENDAR_START_DATE:
				return CALENDAR_START_DATE_EDEFAULT == null ? calendarStartDate != null : !CALENDAR_START_DATE_EDEFAULT.equals(calendarStartDate);
			case XmlaPackage.TIME_BINDING__CALENDAR_END_DATE:
				return CALENDAR_END_DATE_EDEFAULT == null ? calendarEndDate != null : !CALENDAR_END_DATE_EDEFAULT.equals(calendarEndDate);
			case XmlaPackage.TIME_BINDING__FIRST_DAY_OF_WEEK:
				return FIRST_DAY_OF_WEEK_EDEFAULT == null ? firstDayOfWeek != null : !FIRST_DAY_OF_WEEK_EDEFAULT.equals(firstDayOfWeek);
			case XmlaPackage.TIME_BINDING__CALENDAR_LANGUAGE:
				return CALENDAR_LANGUAGE_EDEFAULT == null ? calendarLanguage != null : !CALENDAR_LANGUAGE_EDEFAULT.equals(calendarLanguage);
			case XmlaPackage.TIME_BINDING__FISCAL_FIRST_MONTH:
				return FISCAL_FIRST_MONTH_EDEFAULT == null ? fiscalFirstMonth != null : !FISCAL_FIRST_MONTH_EDEFAULT.equals(fiscalFirstMonth);
			case XmlaPackage.TIME_BINDING__FISCAL_FIRST_DAY_OF_MONTH:
				return FISCAL_FIRST_DAY_OF_MONTH_EDEFAULT == null ? fiscalFirstDayOfMonth != null : !FISCAL_FIRST_DAY_OF_MONTH_EDEFAULT.equals(fiscalFirstDayOfMonth);
			case XmlaPackage.TIME_BINDING__FISCAL_YEAR_NAME:
				return isSetFiscalYearName();
			case XmlaPackage.TIME_BINDING__REPORTING_FIRST_MONTH:
				return REPORTING_FIRST_MONTH_EDEFAULT == null ? reportingFirstMonth != null : !REPORTING_FIRST_MONTH_EDEFAULT.equals(reportingFirstMonth);
			case XmlaPackage.TIME_BINDING__REPORTING_FIRST_WEEK_OF_MONTH:
				return isSetReportingFirstWeekOfMonth();
			case XmlaPackage.TIME_BINDING__REPORTING_WEEK_TO_MONTH_PATTERN:
				return isSetReportingWeekToMonthPattern();
			case XmlaPackage.TIME_BINDING__MANUFACTURING_FIRST_MONTH:
				return MANUFACTURING_FIRST_MONTH_EDEFAULT == null ? manufacturingFirstMonth != null : !MANUFACTURING_FIRST_MONTH_EDEFAULT.equals(manufacturingFirstMonth);
			case XmlaPackage.TIME_BINDING__MANUFACTURING_FIRST_WEEK_OF_MONTH:
				return MANUFACTURING_FIRST_WEEK_OF_MONTH_EDEFAULT == null ? manufacturingFirstWeekOfMonth != null : !MANUFACTURING_FIRST_WEEK_OF_MONTH_EDEFAULT.equals(manufacturingFirstWeekOfMonth);
			case XmlaPackage.TIME_BINDING__MANUFACTURING_EXTRA_MONTH_QUARTER:
				return MANUFACTURING_EXTRA_MONTH_QUARTER_EDEFAULT == null ? manufacturingExtraMonthQuarter != null : !MANUFACTURING_EXTRA_MONTH_QUARTER_EDEFAULT.equals(manufacturingExtraMonthQuarter);
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
		result.append(" (calendarStartDate: ");
		result.append(calendarStartDate);
		result.append(", calendarEndDate: ");
		result.append(calendarEndDate);
		result.append(", firstDayOfWeek: ");
		result.append(firstDayOfWeek);
		result.append(", calendarLanguage: ");
		result.append(calendarLanguage);
		result.append(", fiscalFirstMonth: ");
		result.append(fiscalFirstMonth);
		result.append(", fiscalFirstDayOfMonth: ");
		result.append(fiscalFirstDayOfMonth);
		result.append(", fiscalYearName: ");
		if (fiscalYearNameESet) result.append(fiscalYearName); else result.append("<unset>");
		result.append(", reportingFirstMonth: ");
		result.append(reportingFirstMonth);
		result.append(", reportingFirstWeekOfMonth: ");
		if (reportingFirstWeekOfMonthESet) result.append(reportingFirstWeekOfMonth); else result.append("<unset>");
		result.append(", reportingWeekToMonthPattern: ");
		if (reportingWeekToMonthPatternESet) result.append(reportingWeekToMonthPattern); else result.append("<unset>");
		result.append(", manufacturingFirstMonth: ");
		result.append(manufacturingFirstMonth);
		result.append(", manufacturingFirstWeekOfMonth: ");
		result.append(manufacturingFirstWeekOfMonth);
		result.append(", manufacturingExtraMonthQuarter: ");
		result.append(manufacturingExtraMonthQuarter);
		result.append(')');
		return result.toString();
	}

} //TimeBindingImpl
