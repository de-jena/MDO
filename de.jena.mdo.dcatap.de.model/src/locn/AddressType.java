/*
 */
package locn;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link locn.AddressType#getThoroughfare <em>Thoroughfare</em>}</li>
 *   <li>{@link locn.AddressType#getPostName <em>Post Name</em>}</li>
 *   <li>{@link locn.AddressType#getPostCode <em>Post Code</em>}</li>
 *   <li>{@link locn.AddressType#getAdminUnitL1 <em>Admin Unit L1</em>}</li>
 *   <li>{@link locn.AddressType#getAbout <em>About</em>}</li>
 *   <li>{@link locn.AddressType#getNodeID <em>Node ID</em>}</li>
 * </ul>
 *
 * @see locn.LocnPackage#getAddressType()
 * @model extendedMetaData="name='Address_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AddressType extends EObject {
	/**
	 * Returns the value of the '<em><b>Thoroughfare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thoroughfare</em>' attribute.
	 * @see #setThoroughfare(String)
	 * @see locn.LocnPackage#getAddressType_Thoroughfare()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='thoroughfare' namespace='##targetNamespace'"
	 * @generated
	 */
	String getThoroughfare();

	/**
	 * Sets the value of the '{@link locn.AddressType#getThoroughfare <em>Thoroughfare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thoroughfare</em>' attribute.
	 * @see #getThoroughfare()
	 * @generated
	 */
	void setThoroughfare(String value);

	/**
	 * Returns the value of the '<em><b>Post Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Name</em>' attribute.
	 * @see #setPostName(String)
	 * @see locn.LocnPackage#getAddressType_PostName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='postName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostName();

	/**
	 * Sets the value of the '{@link locn.AddressType#getPostName <em>Post Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Name</em>' attribute.
	 * @see #getPostName()
	 * @generated
	 */
	void setPostName(String value);

	/**
	 * Returns the value of the '<em><b>Post Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Code</em>' attribute.
	 * @see #setPostCode(String)
	 * @see locn.LocnPackage#getAddressType_PostCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='postCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostCode();

	/**
	 * Sets the value of the '{@link locn.AddressType#getPostCode <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Code</em>' attribute.
	 * @see #getPostCode()
	 * @generated
	 */
	void setPostCode(String value);

	/**
	 * Returns the value of the '<em><b>Admin Unit L1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Unit L1</em>' attribute.
	 * @see #setAdminUnitL1(String)
	 * @see locn.LocnPackage#getAddressType_AdminUnitL1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='adminUnitL1' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAdminUnitL1();

	/**
	 * Sets the value of the '{@link locn.AddressType#getAdminUnitL1 <em>Admin Unit L1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Unit L1</em>' attribute.
	 * @see #getAdminUnitL1()
	 * @generated
	 */
	void setAdminUnitL1(String value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see locn.LocnPackage#getAddressType_About()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='about' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link locn.AddressType#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

	/**
	 * Returns the value of the '<em><b>Node ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node ID</em>' attribute.
	 * @see #setNodeID(String)
	 * @see locn.LocnPackage#getAddressType_NodeID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='nodeID' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns#'"
	 * @generated
	 */
	String getNodeID();

	/**
	 * Sets the value of the '{@link locn.AddressType#getNodeID <em>Node ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node ID</em>' attribute.
	 * @see #getNodeID()
	 * @generated
	 */
	void setNodeID(String value);

} // AddressType
