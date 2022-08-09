/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getID <em>ID</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#isCaptionIsMdx <em>Caption Is Mdx</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getTranslations <em>Translations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getApplication <em>Application</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getReportServer <em>Report Server</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getReportParameters <em>Report Parameters</em>}</li>
 *   <li>{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getReportFormatParameters <em>Report Format Parameters</em>}</li>
 * </ul>
 *
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction()
 * @model extendedMetaData="name='ReportAction' kind='elementOnly'"
 * @generated
 */
public interface ReportAction extends Action {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getName <em>Name</em>}' attribute.
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
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='ID'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' attribute.
	 * @see #setCaption(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_Caption()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Caption'"
	 * @generated
	 */
	String getCaption();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getCaption <em>Caption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' attribute.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(String value);

	/**
	 * Returns the value of the '<em><b>Caption Is Mdx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption Is Mdx</em>' attribute.
	 * @see #isSetCaptionIsMdx()
	 * @see #unsetCaptionIsMdx()
	 * @see #setCaptionIsMdx(boolean)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_CaptionIsMdx()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='CaptionIsMdx'"
	 * @generated
	 */
	boolean isCaptionIsMdx();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#isCaptionIsMdx <em>Caption Is Mdx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption Is Mdx</em>' attribute.
	 * @see #isSetCaptionIsMdx()
	 * @see #unsetCaptionIsMdx()
	 * @see #isCaptionIsMdx()
	 * @generated
	 */
	void setCaptionIsMdx(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#isCaptionIsMdx <em>Caption Is Mdx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCaptionIsMdx()
	 * @see #isCaptionIsMdx()
	 * @see #setCaptionIsMdx(boolean)
	 * @generated
	 */
	void unsetCaptionIsMdx();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#isCaptionIsMdx <em>Caption Is Mdx</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Caption Is Mdx</em>' attribute is set.
	 * @see #unsetCaptionIsMdx()
	 * @see #isCaptionIsMdx()
	 * @see #setCaptionIsMdx(boolean)
	 * @generated
	 */
	boolean isSetCaptionIsMdx();

	/**
	 * Returns the value of the '<em><b>Translations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translations</em>' containment reference.
	 * @see #setTranslations(TranslationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_Translations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Translations'"
	 * @generated
	 */
	TranslationsType getTranslations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getTranslations <em>Translations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translations</em>' containment reference.
	 * @see #getTranslations()
	 * @generated
	 */
	void setTranslations(TranslationsType value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.TargetTypeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TargetTypeType1
	 * @see #isSetTargetType()
	 * @see #unsetTargetType()
	 * @see #setTargetType(TargetTypeType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_TargetType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TargetType'"
	 * @generated
	 */
	TargetTypeType1 getTargetType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getTargetType <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TargetTypeType1
	 * @see #isSetTargetType()
	 * @see #unsetTargetType()
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(TargetTypeType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getTargetType <em>Target Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTargetType()
	 * @see #getTargetType()
	 * @see #setTargetType(TargetTypeType1)
	 * @generated
	 */
	void unsetTargetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getTargetType <em>Target Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target Type</em>' attribute is set.
	 * @see #unsetTargetType()
	 * @see #getTargetType()
	 * @see #setTargetType(TargetTypeType1)
	 * @generated
	 */
	boolean isSetTargetType();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_Target()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Target'"
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_Condition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Condition'"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.TypeType10}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType10
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TypeType10)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_Type()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='Type'"
	 * @generated
	 */
	TypeType10 getType();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.TypeType10
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeType10 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TypeType10)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TypeType10)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Invocation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.daanse.xmla.model.ecore.xmla.InvocationType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.InvocationType1
	 * @see #isSetInvocation()
	 * @see #unsetInvocation()
	 * @see #setInvocation(InvocationType1)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_Invocation()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Invocation'"
	 * @generated
	 */
	InvocationType1 getInvocation();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getInvocation <em>Invocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocation</em>' attribute.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.InvocationType1
	 * @see #isSetInvocation()
	 * @see #unsetInvocation()
	 * @see #getInvocation()
	 * @generated
	 */
	void setInvocation(InvocationType1 value);

	/**
	 * Unsets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getInvocation <em>Invocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInvocation()
	 * @see #getInvocation()
	 * @see #setInvocation(InvocationType1)
	 * @generated
	 */
	void unsetInvocation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getInvocation <em>Invocation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Invocation</em>' attribute is set.
	 * @see #unsetInvocation()
	 * @see #getInvocation()
	 * @see #setInvocation(InvocationType1)
	 * @generated
	 */
	boolean isSetInvocation();

	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_Application()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Application'"
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Description'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getDescription <em>Description</em>}' attribute.
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
	 * @see #setAnnotations(AnnotationsType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_Annotations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annotations'"
	 * @generated
	 */
	AnnotationsType getAnnotations();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getAnnotations <em>Annotations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' containment reference.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(AnnotationsType value);

	/**
	 * Returns the value of the '<em><b>Report Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Server</em>' attribute.
	 * @see #setReportServer(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_ReportServer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='ReportServer'"
	 * @generated
	 */
	String getReportServer();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getReportServer <em>Report Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Server</em>' attribute.
	 * @see #getReportServer()
	 * @generated
	 */
	void setReportServer(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Report Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Parameters</em>' containment reference.
	 * @see #setReportParameters(ReportParametersType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_ReportParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReportParameters'"
	 * @generated
	 */
	ReportParametersType getReportParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getReportParameters <em>Report Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Parameters</em>' containment reference.
	 * @see #getReportParameters()
	 * @generated
	 */
	void setReportParameters(ReportParametersType value);

	/**
	 * Returns the value of the '<em><b>Report Format Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Format Parameters</em>' containment reference.
	 * @see #setReportFormatParameters(ReportFormatParametersType)
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage#getReportAction_ReportFormatParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReportFormatParameters'"
	 * @generated
	 */
	ReportFormatParametersType getReportFormatParameters();

	/**
	 * Sets the value of the '{@link org.eclipse.daanse.xmla.model.ecore.xmla.ReportAction#getReportFormatParameters <em>Report Format Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Format Parameters</em>' containment reference.
	 * @see #getReportFormatParameters()
	 * @generated
	 */
	void setReportFormatParameters(ReportFormatParametersType value);

} // ReportAction
