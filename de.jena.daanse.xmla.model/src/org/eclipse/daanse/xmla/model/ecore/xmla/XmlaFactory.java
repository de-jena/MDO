/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla.XmlaPackage
 * @generated
 */
public interface XmlaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XmlaFactory eINSTANCE = org.eclipse.daanse.xmla.model.ecore.xmla.impl.XmlaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Discover Response Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discover Response Type</em>'.
	 * @generated
	 */
	DiscoverResponseType createDiscoverResponseType();

	/**
	 * Returns a new object of class '<em>Discover Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discover Type</em>'.
	 * @generated
	 */
	DiscoverType createDiscoverType();

	/**
	 * Returns a new object of class '<em>Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties</em>'.
	 * @generated
	 */
	Properties createProperties();

	/**
	 * Returns a new object of class '<em>Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties Type</em>'.
	 * @generated
	 */
	PropertiesType createPropertiesType();

	/**
	 * Returns a new object of class '<em>Property List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property List</em>'.
	 * @generated
	 */
	PropertyList createPropertyList();

	/**
	 * Returns a new object of class '<em>Restriction List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restriction List Type</em>'.
	 * @generated
	 */
	RestrictionListType createRestrictionListType();

	/**
	 * Returns a new object of class '<em>Restrictions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restrictions Type</em>'.
	 * @generated
	 */
	RestrictionsType createRestrictionsType();

	/**
	 * Returns a new object of class '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return</em>'.
	 * @generated
	 */
	Return createReturn();

	/**
	 * Returns a new object of class '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Type</em>'.
	 * @generated
	 */
	ReturnType createReturnType();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Annotations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotations Type</em>'.
	 * @generated
	 */
	AnnotationsType createAnnotationsType();

	/**
	 * Returns a new object of class '<em>Event Session Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Session Type</em>'.
	 * @generated
	 */
	EventSessionType createEventSessionType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XmlaPackage getXmlaPackage();

} //XmlaFactory
