/**
 */
package org.eclipse.daanse.xmla.model.ecore.xmla_mddataset;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *     Part 1 version: Id: structures.xsd,v 1.2 2004/01/15 11:34:25 ht Exp 
 *     Part 2 version: Id: datatypes.xsd,v 1.3 2004/01/23 18:11:13 ht Exp 
 *   
 * 
 *    The schema corresponding to this document is normative,
 *    with respect to the syntactic constraints it expresses in the
 *    XML Schema language.  The documentation (within <documentation> elements)
 *    below, is not normative, but rather highlights important aspects of
 *    the W3C Recommendation of which this is a part
 * 
 *    The simpleType element and all of its members are defined
 *       towards the end of this schema document
 * 
 *    simple type for the value of the 'namespace' attr of
 *    'any' and 'anyAttribute'
 * 
 *    Value is
 *               ##any      - - any non-conflicting WFXML/attribute at all
 * 
 *               ##other    - - any non-conflicting WFXML/attribute from
 *                               namespace other than targetNS
 * 
 *               ##local    - - any unqualified non-conflicting WFXML/attribute 
 * 
 *               one or     - - any non-conflicting WFXML/attribute from
 *               more URI        the listed namespaces
 *               references
 *               (space separated)
 * 
 *     ##targetNamespace or ##local may appear in the above list, to
 *         refer to the targetNamespace of the enclosing
 *         schema or an absent targetNamespace respectively
 * 
 *    notations for use within XML Schema schemas
 * 
 *       First the built-in primitive datatypes.  These definitions are for
 *       information only, the real built-in definitions are magic.
 *     
 * 
 *       For each built-in datatype in this schema (both primitive and
 *       derived) can be uniquely addressed via a URI constructed
 *       as follows:
 *         1) the base URI is the URI of the XML Schema namespace
 *         2) the fragment identifier is the name of the datatype
 * 
 *       For example, to address the int datatype, the URI is:
 * 
 *         http://www.w3.org/2001/XMLSchema#int
 * 
 *       Additionally, each facet definition element can be uniquely
 *       addressed via a URI constructed as follows:
 *         1) the base URI is the URI of the XML Schema namespace
 *         2) the fragment identifier is the name of the facet
 * 
 *       For example, to address the maxInclusive facet, the URI is:
 * 
 *         http://www.w3.org/2001/XMLSchema#maxInclusive
 * 
 *       Additionally, each facet usage in a built-in datatype definition
 *       can be uniquely addressed via a URI constructed as follows:
 *         1) the base URI is the URI of the XML Schema namespace
 *         2) the fragment identifier is the name of the datatype, followed
 *            by a period (".") followed by the name of the facet
 * 
 *       For example, to address the usage of the maxInclusive facet in
 *       the definition of int, the URI is:
 * 
 *         http://www.w3.org/2001/XMLSchema#int.maxInclusive
 * 
 *     
 * 
 *       Now the derived primitive types
 *     
 * 
 *      
 *   <div xmlns="http://www.w3.org/1999/xhtml">
 *         
 *     <h1>About the XML namespace</h1>
 *         
 *     <div class="bodytext">
 *            
 *       <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *            
 *       <p>
 *               See 
 *         <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a>
 *          and
 *       
 *         <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a>
 *          for information 
 *       about this namespace.
 *      
 *       </p>
 *            
 *       <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *            
 *       <p>
 *            
 *       See further below in this document for more information about 
 *         <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a>
 *          and about 
 *         <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>
 *         .
 *      
 *       </p>
 *           
 *     </div>
 *        
 *   </div>
 *     
 * 
 * 
 *      
 *   <div xmlns="http://www.w3.org/1999/xhtml">
 *        
 *     
 *     <h3>Father (in any context at all)</h3>
 *      
 * 
 *     
 *     <div class="bodytext">
 *            
 *       <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *            
 *       <blockquote>
 *                
 *         <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *              
 *       </blockquote>
 *           
 *     </div>
 *        
 *   </div>
 *     
 * 
 * 
 *      
 *   <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *         
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 *         
 *     <div class="bodytext">
 *            
 *       <p>
 *               This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow 
 *         <code>xml:base</code>
 *         ,
 *       
 *         <code>xml:lang</code>
 *         , 
 *         <code>xml:space</code>
 *          or
 *       
 *         <code>xml:id</code>
 *          attributes on elements they define.
 *      
 *       </p>
 *            
 *       <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *            
 *       <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *            
 *       <p>
 *       or
 *      </p>
 *            
 *       <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *            
 *       <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *            
 *       <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *            
 *       <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *           
 *     </div>
 *        
 *   </div>
 *     
 * 
 * 
 *      
 *   <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *         
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *         
 *     <div class="bodytext">
 *            
 *       <p>
 *               In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       
 *         <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>
 *         .
 *      
 *       </p>
 *            
 *       <p>
 *               At the date of issue it can also be found at
 *       
 *         <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>
 *         .
 *      
 *       </p>
 *            
 *       <p>
 *               The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at 
 *         <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a>
 *          
 *       will change accordingly; the version at 
 *       
 *         <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a>
 *          
 *       will not change.
 *      
 *       </p>
 *            
 *       <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *            
 *       <ul>
 *               
 *         <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *               
 *         <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *               
 *         <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *               
 *         <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *              
 *       </ul>
 *           
 *     </div>
 *        
 *   </div>
 *     
 * 
 * <!-- end-model-doc -->
 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Xmla_mddatasetFactory
 * @model kind="package"
 *        annotation="https://jakarta.ee/xml/ns/jaxb version='3.0'"
 * @generated
 */
public interface Xmla_mddatasetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xmla_mddataset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:schemas-microsoft-com:xml-analysis:mddataset";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "_xmla_mddataset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Xmla_mddatasetPackage eINSTANCE = org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxesImpl <em>Axes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxesImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getAxes()
	 * @generated
	 */
	int AXES = 0;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXES__AXIS = 0;

	/**
	 * The number of structural features of the '<em>Axes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Axes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxesInfoImpl <em>Axes Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxesInfoImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getAxesInfo()
	 * @generated
	 */
	int AXES_INFO = 1;

	/**
	 * The feature id for the '<em><b>Axis Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXES_INFO__AXIS_INFO = 0;

	/**
	 * The number of structural features of the '<em>Axes Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXES_INFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Axes Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXES_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisImpl <em>Axis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getAxis()
	 * @generated
	 */
	int AXIS = 2;

	/**
	 * The feature id for the '<em><b>Set Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__SET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__MEMBERS = 1;

	/**
	 * The feature id for the '<em><b>Tuples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__TUPLES = 2;

	/**
	 * The feature id for the '<em><b>Cross Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__CROSS_PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Norm Tuple Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__NORM_TUPLE_SET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS__NAME = 5;

	/**
	 * The number of structural features of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Axis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisInfoImpl <em>Axis Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisInfoImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getAxisInfo()
	 * @generated
	 */
	int AXIS_INFO = 3;

	/**
	 * The feature id for the '<em><b>Hierarchy Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_INFO__HIERARCHY_INFO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_INFO__NAME = 1;

	/**
	 * The number of structural features of the '<em>Axis Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_INFO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Axis Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellDataImpl <em>Cell Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellDataImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getCellData()
	 * @generated
	 */
	int CELL_DATA = 4;

	/**
	 * The feature id for the '<em><b>Cell</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_DATA__CELL = 0;

	/**
	 * The feature id for the '<em><b>Cell Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_DATA__CELL_SET = 1;

	/**
	 * The number of structural features of the '<em>Cell Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cell Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellInfoImpl <em>Cell Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellInfoImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getCellInfo()
	 * @generated
	 */
	int CELL_INFO = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INFO__ANY = 0;

	/**
	 * The number of structural features of the '<em>Cell Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cell Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellSetTypeImpl <em>Cell Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellSetTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getCellSetType()
	 * @generated
	 */
	int CELL_SET_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_SET_TYPE__DATA = 0;

	/**
	 * The number of structural features of the '<em>Cell Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_SET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cell Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_SET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellTypeImpl <em>Cell Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getCellType()
	 * @generated
	 */
	int CELL_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE__ANY = 1;

	/**
	 * The feature id for the '<em><b>Cell Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE__CELL_ORDINAL = 2;

	/**
	 * The number of structural features of the '<em>Cell Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cell Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellTypeErrorImpl <em>Cell Type Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellTypeErrorImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getCellTypeError()
	 * @generated
	 */
	int CELL_TYPE_ERROR = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE_ERROR__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE_ERROR__ERROR_CODE = 1;

	/**
	 * The number of structural features of the '<em>Cell Type Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE_ERROR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cell Type Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_TYPE_ERROR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CubeInfoImpl <em>Cube Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CubeInfoImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getCubeInfo()
	 * @generated
	 */
	int CUBE_INFO = 9;

	/**
	 * The feature id for the '<em><b>Cube</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_INFO__CUBE = 0;

	/**
	 * The number of structural features of the '<em>Cube Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_INFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cube Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUBE_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.HierarchyInfoImpl <em>Hierarchy Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.HierarchyInfoImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getHierarchyInfo()
	 * @generated
	 */
	int HIERARCHY_INFO = 10;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_INFO__ANY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_INFO__NAME = 1;

	/**
	 * The number of structural features of the '<em>Hierarchy Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_INFO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hierarchy Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIERARCHY_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MddatasetImpl <em>Mddataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MddatasetImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getMddataset()
	 * @generated
	 */
	int MDDATASET = 11;

	/**
	 * The feature id for the '<em><b>Olap Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDDATASET__OLAP_INFO = 0;

	/**
	 * The feature id for the '<em><b>Axes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDDATASET__AXES = 1;

	/**
	 * The feature id for the '<em><b>Cell Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDDATASET__CELL_DATA = 2;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDDATASET__EXCEPTION = 3;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDDATASET__MESSAGES = 4;

	/**
	 * The number of structural features of the '<em>Mddataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDDATASET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mddataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MDDATASET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MembersTypeImpl <em>Members Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MembersTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getMembersType()
	 * @generated
	 */
	int MEMBERS_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERS_TYPE__MEMBER = 0;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERS_TYPE__HIERARCHY = 1;

	/**
	 * The number of structural features of the '<em>Members Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Members Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBERS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MemberTypeImpl <em>Member Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MemberTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getMemberType()
	 * @generated
	 */
	int MEMBER_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TYPE__ANY = 0;

	/**
	 * The feature id for the '<em><b>Hierarchy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TYPE__HIERARCHY = 1;

	/**
	 * The number of structural features of the '<em>Member Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Member Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoImpl <em>Olap Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getOlapInfo()
	 * @generated
	 */
	int OLAP_INFO = 14;

	/**
	 * The feature id for the '<em><b>Cube Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_INFO__CUBE_INFO = 0;

	/**
	 * The feature id for the '<em><b>Axes Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_INFO__AXES_INFO = 1;

	/**
	 * The feature id for the '<em><b>Cell Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_INFO__CELL_INFO = 2;

	/**
	 * The number of structural features of the '<em>Olap Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_INFO_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Olap Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoCubeImpl <em>Olap Info Cube</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoCubeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getOlapInfoCube()
	 * @generated
	 */
	int OLAP_INFO_CUBE = 15;

	/**
	 * The feature id for the '<em><b>Cube Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_INFO_CUBE__CUBE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Last Data Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_INFO_CUBE__LAST_DATA_UPDATE = 1;

	/**
	 * The feature id for the '<em><b>Last Schema Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_INFO_CUBE__LAST_SCHEMA_UPDATE = 2;

	/**
	 * The number of structural features of the '<em>Olap Info Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_INFO_CUBE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Olap Info Cube</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLAP_INFO_CUBE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.SetListTypeImpl <em>Set List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.SetListTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getSetListType()
	 * @generated
	 */
	int SET_LIST_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Set Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIST_TYPE__SET_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIST_TYPE__MEMBERS = 1;

	/**
	 * The feature id for the '<em><b>Tuples</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIST_TYPE__TUPLES = 2;

	/**
	 * The feature id for the '<em><b>Cross Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIST_TYPE__CROSS_PRODUCT = 3;

	/**
	 * The feature id for the '<em><b>Norm Tuple Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIST_TYPE__NORM_TUPLE_SET = 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIST_TYPE__SIZE = 5;

	/**
	 * The number of structural features of the '<em>Set List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIST_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Set List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.TuplesTypeImpl <em>Tuples Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.TuplesTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getTuplesType()
	 * @generated
	 */
	int TUPLES_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Tuple</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLES_TYPE__TUPLE = 0;

	/**
	 * The number of structural features of the '<em>Tuples Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tuples Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.TupleTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getTupleType()
	 * @generated
	 */
	int TUPLE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE__MEMBER = 0;

	/**
	 * The number of structural features of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.ValueTypeImpl <em>Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.ValueTypeImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getValueType()
	 * @generated
	 */
	int VALUE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE__ERROR = 0;

	/**
	 * The number of structural features of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.DocumentRootImpl
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROOT = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axes <em>Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axes</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axes
	 * @generated
	 */
	EClass getAxes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axes#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axis</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axes#getAxis()
	 * @see #getAxes()
	 * @generated
	 */
	EReference getAxes_Axis();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxesInfo <em>Axes Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axes Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxesInfo
	 * @generated
	 */
	EClass getAxesInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxesInfo#getAxisInfo <em>Axis Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axis Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxesInfo#getAxisInfo()
	 * @see #getAxesInfo()
	 * @generated
	 */
	EReference getAxesInfo_AxisInfo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis
	 * @generated
	 */
	EClass getAxis();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis#getSetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Set Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis#getSetType()
	 * @see #getAxis()
	 * @generated
	 */
	EAttribute getAxis_SetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis#getMembers()
	 * @see #getAxis()
	 * @generated
	 */
	EReference getAxis_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis#getTuples <em>Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuples</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis#getTuples()
	 * @see #getAxis()
	 * @generated
	 */
	EReference getAxis_Tuples();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis#getCrossProduct <em>Cross Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cross Product</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis#getCrossProduct()
	 * @see #getAxis()
	 * @generated
	 */
	EReference getAxis_CrossProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis#getNormTupleSet <em>Norm Tuple Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Norm Tuple Set</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis#getNormTupleSet()
	 * @see #getAxis()
	 * @generated
	 */
	EReference getAxis_NormTupleSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Axis#getName()
	 * @see #getAxis()
	 * @generated
	 */
	EAttribute getAxis_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxisInfo <em>Axis Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxisInfo
	 * @generated
	 */
	EClass getAxisInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxisInfo#getHierarchyInfo <em>Hierarchy Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hierarchy Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxisInfo#getHierarchyInfo()
	 * @see #getAxisInfo()
	 * @generated
	 */
	EReference getAxisInfo_HierarchyInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxisInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.AxisInfo#getName()
	 * @see #getAxisInfo()
	 * @generated
	 */
	EAttribute getAxisInfo_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellData <em>Cell Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Data</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellData
	 * @generated
	 */
	EClass getCellData();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellData#getCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cell</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellData#getCell()
	 * @see #getCellData()
	 * @generated
	 */
	EReference getCellData_Cell();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellData#getCellSet <em>Cell Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cell Set</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellData#getCellSet()
	 * @see #getCellData()
	 * @generated
	 */
	EReference getCellData_CellSet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellInfo <em>Cell Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellInfo
	 * @generated
	 */
	EClass getCellInfo();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellInfo#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellInfo#getAny()
	 * @see #getCellInfo()
	 * @generated
	 */
	EAttribute getCellInfo_Any();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellSetType <em>Cell Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Set Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellSetType
	 * @generated
	 */
	EClass getCellSetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellSetType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellSetType#getData()
	 * @see #getCellSetType()
	 * @generated
	 */
	EAttribute getCellSetType_Data();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellType <em>Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellType
	 * @generated
	 */
	EClass getCellType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellType#getValue()
	 * @see #getCellType()
	 * @generated
	 */
	EReference getCellType_Value();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellType#getAny()
	 * @see #getCellType()
	 * @generated
	 */
	EAttribute getCellType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellType#getCellOrdinal <em>Cell Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Ordinal</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellType#getCellOrdinal()
	 * @see #getCellType()
	 * @generated
	 */
	EAttribute getCellType_CellOrdinal();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellTypeError <em>Cell Type Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell Type Error</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellTypeError
	 * @generated
	 */
	EClass getCellTypeError();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellTypeError#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellTypeError#getDescription()
	 * @see #getCellTypeError()
	 * @generated
	 */
	EAttribute getCellTypeError_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellTypeError#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CellTypeError#getErrorCode()
	 * @see #getCellTypeError()
	 * @generated
	 */
	EAttribute getCellTypeError_ErrorCode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CubeInfo <em>Cube Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cube Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CubeInfo
	 * @generated
	 */
	EClass getCubeInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CubeInfo#getCube <em>Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cube</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.CubeInfo#getCube()
	 * @see #getCubeInfo()
	 * @generated
	 */
	EReference getCubeInfo_Cube();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.HierarchyInfo <em>Hierarchy Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hierarchy Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.HierarchyInfo
	 * @generated
	 */
	EClass getHierarchyInfo();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.HierarchyInfo#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.HierarchyInfo#getAny()
	 * @see #getHierarchyInfo()
	 * @generated
	 */
	EAttribute getHierarchyInfo_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.HierarchyInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.HierarchyInfo#getName()
	 * @see #getHierarchyInfo()
	 * @generated
	 */
	EAttribute getHierarchyInfo_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset <em>Mddataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mddataset</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset
	 * @generated
	 */
	EClass getMddataset();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getOlapInfo <em>Olap Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Olap Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getOlapInfo()
	 * @see #getMddataset()
	 * @generated
	 */
	EReference getMddataset_OlapInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getAxes <em>Axes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Axes</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getAxes()
	 * @see #getMddataset()
	 * @generated
	 */
	EReference getMddataset_Axes();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getCellData <em>Cell Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cell Data</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getCellData()
	 * @see #getMddataset()
	 * @generated
	 */
	EReference getMddataset_CellData();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exception</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getException()
	 * @see #getMddataset()
	 * @generated
	 */
	EReference getMddataset_Exception();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Messages</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.Mddataset#getMessages()
	 * @see #getMddataset()
	 * @generated
	 */
	EReference getMddataset_Messages();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MembersType <em>Members Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Members Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MembersType
	 * @generated
	 */
	EClass getMembersType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MembersType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MembersType#getMember()
	 * @see #getMembersType()
	 * @generated
	 */
	EReference getMembersType_Member();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MembersType#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hierarchy</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MembersType#getHierarchy()
	 * @see #getMembersType()
	 * @generated
	 */
	EAttribute getMembersType_Hierarchy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MemberType
	 * @generated
	 */
	EClass getMemberType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MemberType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MemberType#getAny()
	 * @see #getMemberType()
	 * @generated
	 */
	EAttribute getMemberType_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MemberType#getHierarchy <em>Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hierarchy</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.MemberType#getHierarchy()
	 * @see #getMemberType()
	 * @generated
	 */
	EAttribute getMemberType_Hierarchy();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo <em>Olap Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Olap Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo
	 * @generated
	 */
	EClass getOlapInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo#getCubeInfo <em>Cube Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cube Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo#getCubeInfo()
	 * @see #getOlapInfo()
	 * @generated
	 */
	EReference getOlapInfo_CubeInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo#getAxesInfo <em>Axes Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Axes Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo#getAxesInfo()
	 * @see #getOlapInfo()
	 * @generated
	 */
	EReference getOlapInfo_AxesInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo#getCellInfo <em>Cell Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cell Info</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfo#getCellInfo()
	 * @see #getOlapInfo()
	 * @generated
	 */
	EReference getOlapInfo_CellInfo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube <em>Olap Info Cube</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Olap Info Cube</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube
	 * @generated
	 */
	EClass getOlapInfoCube();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube#getCubeName <em>Cube Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cube Name</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube#getCubeName()
	 * @see #getOlapInfoCube()
	 * @generated
	 */
	EAttribute getOlapInfoCube_CubeName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube#getLastDataUpdate <em>Last Data Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Data Update</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube#getLastDataUpdate()
	 * @see #getOlapInfoCube()
	 * @generated
	 */
	EAttribute getOlapInfoCube_LastDataUpdate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube#getLastSchemaUpdate <em>Last Schema Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Schema Update</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.OlapInfoCube#getLastSchemaUpdate()
	 * @see #getOlapInfoCube()
	 * @generated
	 */
	EAttribute getOlapInfoCube_LastSchemaUpdate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType <em>Set List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set List Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType
	 * @generated
	 */
	EClass getSetListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType#getSetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Set Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType#getSetType()
	 * @see #getSetListType()
	 * @generated
	 */
	EAttribute getSetListType_SetType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType#getMembers()
	 * @see #getSetListType()
	 * @generated
	 */
	EReference getSetListType_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType#getTuples <em>Tuples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuples</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType#getTuples()
	 * @see #getSetListType()
	 * @generated
	 */
	EReference getSetListType_Tuples();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType#getCrossProduct <em>Cross Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cross Product</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType#getCrossProduct()
	 * @see #getSetListType()
	 * @generated
	 */
	EReference getSetListType_CrossProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType#getNormTupleSet <em>Norm Tuple Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Norm Tuple Set</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType#getNormTupleSet()
	 * @see #getSetListType()
	 * @generated
	 */
	EReference getSetListType_NormTupleSet();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.SetListType#getSize()
	 * @see #getSetListType()
	 * @generated
	 */
	EAttribute getSetListType_Size();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TuplesType <em>Tuples Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuples Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TuplesType
	 * @generated
	 */
	EClass getTuplesType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TuplesType#getTuple <em>Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tuple</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TuplesType#getTuple()
	 * @see #getTuplesType()
	 * @generated
	 */
	EReference getTuplesType_Tuple();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TupleType
	 * @generated
	 */
	EClass getTupleType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TupleType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.TupleType#getMember()
	 * @see #getTupleType()
	 * @generated
	 */
	EReference getTupleType_Member();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Type</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.ValueType
	 * @generated
	 */
	EClass getValueType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.ValueType#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.ValueType#getError()
	 * @see #getValueType()
	 * @generated
	 */
	EReference getValueType_Error();

	/**
	 * Returns the meta object for class '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.DocumentRoot#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root</em>'.
	 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.DocumentRoot#getRoot()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Root();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Xmla_mddatasetFactory getXmla_mddatasetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxesImpl <em>Axes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxesImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getAxes()
		 * @generated
		 */
		EClass AXES = eINSTANCE.getAxes();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXES__AXIS = eINSTANCE.getAxes_Axis();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxesInfoImpl <em>Axes Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxesInfoImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getAxesInfo()
		 * @generated
		 */
		EClass AXES_INFO = eINSTANCE.getAxesInfo();

		/**
		 * The meta object literal for the '<em><b>Axis Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXES_INFO__AXIS_INFO = eINSTANCE.getAxesInfo_AxisInfo();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisImpl <em>Axis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getAxis()
		 * @generated
		 */
		EClass AXIS = eINSTANCE.getAxis();

		/**
		 * The meta object literal for the '<em><b>Set Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS__SET_TYPE = eINSTANCE.getAxis_SetType();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS__MEMBERS = eINSTANCE.getAxis_Members();

		/**
		 * The meta object literal for the '<em><b>Tuples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS__TUPLES = eINSTANCE.getAxis_Tuples();

		/**
		 * The meta object literal for the '<em><b>Cross Product</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS__CROSS_PRODUCT = eINSTANCE.getAxis_CrossProduct();

		/**
		 * The meta object literal for the '<em><b>Norm Tuple Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS__NORM_TUPLE_SET = eINSTANCE.getAxis_NormTupleSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS__NAME = eINSTANCE.getAxis_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisInfoImpl <em>Axis Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.AxisInfoImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getAxisInfo()
		 * @generated
		 */
		EClass AXIS_INFO = eINSTANCE.getAxisInfo();

		/**
		 * The meta object literal for the '<em><b>Hierarchy Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_INFO__HIERARCHY_INFO = eINSTANCE.getAxisInfo_HierarchyInfo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_INFO__NAME = eINSTANCE.getAxisInfo_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellDataImpl <em>Cell Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellDataImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getCellData()
		 * @generated
		 */
		EClass CELL_DATA = eINSTANCE.getCellData();

		/**
		 * The meta object literal for the '<em><b>Cell</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_DATA__CELL = eINSTANCE.getCellData_Cell();

		/**
		 * The meta object literal for the '<em><b>Cell Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_DATA__CELL_SET = eINSTANCE.getCellData_CellSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellInfoImpl <em>Cell Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellInfoImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getCellInfo()
		 * @generated
		 */
		EClass CELL_INFO = eINSTANCE.getCellInfo();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_INFO__ANY = eINSTANCE.getCellInfo_Any();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellSetTypeImpl <em>Cell Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellSetTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getCellSetType()
		 * @generated
		 */
		EClass CELL_SET_TYPE = eINSTANCE.getCellSetType();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_SET_TYPE__DATA = eINSTANCE.getCellSetType_Data();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellTypeImpl <em>Cell Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getCellType()
		 * @generated
		 */
		EClass CELL_TYPE = eINSTANCE.getCellType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL_TYPE__VALUE = eINSTANCE.getCellType_Value();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_TYPE__ANY = eINSTANCE.getCellType_Any();

		/**
		 * The meta object literal for the '<em><b>Cell Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_TYPE__CELL_ORDINAL = eINSTANCE.getCellType_CellOrdinal();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellTypeErrorImpl <em>Cell Type Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CellTypeErrorImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getCellTypeError()
		 * @generated
		 */
		EClass CELL_TYPE_ERROR = eINSTANCE.getCellTypeError();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_TYPE_ERROR__DESCRIPTION = eINSTANCE.getCellTypeError_Description();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL_TYPE_ERROR__ERROR_CODE = eINSTANCE.getCellTypeError_ErrorCode();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CubeInfoImpl <em>Cube Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.CubeInfoImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getCubeInfo()
		 * @generated
		 */
		EClass CUBE_INFO = eINSTANCE.getCubeInfo();

		/**
		 * The meta object literal for the '<em><b>Cube</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUBE_INFO__CUBE = eINSTANCE.getCubeInfo_Cube();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.HierarchyInfoImpl <em>Hierarchy Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.HierarchyInfoImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getHierarchyInfo()
		 * @generated
		 */
		EClass HIERARCHY_INFO = eINSTANCE.getHierarchyInfo();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIERARCHY_INFO__ANY = eINSTANCE.getHierarchyInfo_Any();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIERARCHY_INFO__NAME = eINSTANCE.getHierarchyInfo_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MddatasetImpl <em>Mddataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MddatasetImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getMddataset()
		 * @generated
		 */
		EClass MDDATASET = eINSTANCE.getMddataset();

		/**
		 * The meta object literal for the '<em><b>Olap Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDDATASET__OLAP_INFO = eINSTANCE.getMddataset_OlapInfo();

		/**
		 * The meta object literal for the '<em><b>Axes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDDATASET__AXES = eINSTANCE.getMddataset_Axes();

		/**
		 * The meta object literal for the '<em><b>Cell Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDDATASET__CELL_DATA = eINSTANCE.getMddataset_CellData();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDDATASET__EXCEPTION = eINSTANCE.getMddataset_Exception();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MDDATASET__MESSAGES = eINSTANCE.getMddataset_Messages();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MembersTypeImpl <em>Members Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MembersTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getMembersType()
		 * @generated
		 */
		EClass MEMBERS_TYPE = eINSTANCE.getMembersType();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBERS_TYPE__MEMBER = eINSTANCE.getMembersType_Member();

		/**
		 * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBERS_TYPE__HIERARCHY = eINSTANCE.getMembersType_Hierarchy();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MemberTypeImpl <em>Member Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.MemberTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getMemberType()
		 * @generated
		 */
		EClass MEMBER_TYPE = eINSTANCE.getMemberType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_TYPE__ANY = eINSTANCE.getMemberType_Any();

		/**
		 * The meta object literal for the '<em><b>Hierarchy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_TYPE__HIERARCHY = eINSTANCE.getMemberType_Hierarchy();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoImpl <em>Olap Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getOlapInfo()
		 * @generated
		 */
		EClass OLAP_INFO = eINSTANCE.getOlapInfo();

		/**
		 * The meta object literal for the '<em><b>Cube Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_INFO__CUBE_INFO = eINSTANCE.getOlapInfo_CubeInfo();

		/**
		 * The meta object literal for the '<em><b>Axes Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_INFO__AXES_INFO = eINSTANCE.getOlapInfo_AxesInfo();

		/**
		 * The meta object literal for the '<em><b>Cell Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLAP_INFO__CELL_INFO = eINSTANCE.getOlapInfo_CellInfo();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoCubeImpl <em>Olap Info Cube</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.OlapInfoCubeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getOlapInfoCube()
		 * @generated
		 */
		EClass OLAP_INFO_CUBE = eINSTANCE.getOlapInfoCube();

		/**
		 * The meta object literal for the '<em><b>Cube Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OLAP_INFO_CUBE__CUBE_NAME = eINSTANCE.getOlapInfoCube_CubeName();

		/**
		 * The meta object literal for the '<em><b>Last Data Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OLAP_INFO_CUBE__LAST_DATA_UPDATE = eINSTANCE.getOlapInfoCube_LastDataUpdate();

		/**
		 * The meta object literal for the '<em><b>Last Schema Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OLAP_INFO_CUBE__LAST_SCHEMA_UPDATE = eINSTANCE.getOlapInfoCube_LastSchemaUpdate();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.SetListTypeImpl <em>Set List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.SetListTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getSetListType()
		 * @generated
		 */
		EClass SET_LIST_TYPE = eINSTANCE.getSetListType();

		/**
		 * The meta object literal for the '<em><b>Set Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LIST_TYPE__SET_TYPE = eINSTANCE.getSetListType_SetType();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_LIST_TYPE__MEMBERS = eINSTANCE.getSetListType_Members();

		/**
		 * The meta object literal for the '<em><b>Tuples</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_LIST_TYPE__TUPLES = eINSTANCE.getSetListType_Tuples();

		/**
		 * The meta object literal for the '<em><b>Cross Product</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_LIST_TYPE__CROSS_PRODUCT = eINSTANCE.getSetListType_CrossProduct();

		/**
		 * The meta object literal for the '<em><b>Norm Tuple Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_LIST_TYPE__NORM_TUPLE_SET = eINSTANCE.getSetListType_NormTupleSet();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_LIST_TYPE__SIZE = eINSTANCE.getSetListType_Size();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.TuplesTypeImpl <em>Tuples Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.TuplesTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getTuplesType()
		 * @generated
		 */
		EClass TUPLES_TYPE = eINSTANCE.getTuplesType();

		/**
		 * The meta object literal for the '<em><b>Tuple</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLES_TYPE__TUPLE = eINSTANCE.getTuplesType_Tuple();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.TupleTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getTupleType()
		 * @generated
		 */
		EClass TUPLE_TYPE = eINSTANCE.getTupleType();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TUPLE_TYPE__MEMBER = eINSTANCE.getTupleType_Member();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.ValueTypeImpl <em>Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.ValueTypeImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getValueType()
		 * @generated
		 */
		EClass VALUE_TYPE = eINSTANCE.getValueType();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_TYPE__ERROR = eINSTANCE.getValueType_Error();

		/**
		 * The meta object literal for the '{@link org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.DocumentRootImpl
		 * @see org.eclipse.daanse.xmla.model.ecore.xmla_mddataset.impl.Xmla_mddatasetPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROOT = eINSTANCE.getDocumentRoot_Root();

	}

} //Xmla_mddatasetPackage
