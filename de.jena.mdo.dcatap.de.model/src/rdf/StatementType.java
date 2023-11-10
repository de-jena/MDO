/*
 */
package rdf;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rdf.StatementType#getSubject <em>Subject</em>}</li>
 *   <li>{@link rdf.StatementType#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link rdf.StatementType#getObject <em>Object</em>}</li>
 *   <li>{@link rdf.StatementType#getAbout <em>About</em>}</li>
 * </ul>
 *
 * @see rdf.RdfPackage#getStatementType()
 * @model extendedMetaData="name='Statement_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StatementType extends EObject {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(SubjectType)
	 * @see rdf.RdfPackage#getStatementType_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectType getSubject();

	/**
	 * Sets the value of the '{@link rdf.StatementType#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(SubjectType value);

	/**
	 * Returns the value of the '<em><b>Predicate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate</em>' containment reference.
	 * @see #setPredicate(PredicateType)
	 * @see rdf.RdfPackage#getStatementType_Predicate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='predicate' namespace='##targetNamespace'"
	 * @generated
	 */
	PredicateType getPredicate();

	/**
	 * Sets the value of the '{@link rdf.StatementType#getPredicate <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate</em>' containment reference.
	 * @see #getPredicate()
	 * @generated
	 */
	void setPredicate(PredicateType value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectType)
	 * @see rdf.RdfPackage#getStatementType_Object()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectType getObject();

	/**
	 * Sets the value of the '{@link rdf.StatementType#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectType value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see rdf.RdfPackage#getStatementType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link rdf.StatementType#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

} // StatementType
