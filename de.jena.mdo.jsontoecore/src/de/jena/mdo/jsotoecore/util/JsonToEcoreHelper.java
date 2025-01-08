package de.jena.mdo.jsotoecore.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ValueNode;

public class JsonToEcoreHelper {

	public static EPackage createEcoreFromStream(InputStream in, String rootClassName, String packageName, String uri){
		Objects.requireNonNull(in, "couldn't create Epackage: no JSON InputStream present.");
		Objects.requireNonNull(rootClassName, "couldn't create Epackage: no rootClassName present.");
		Objects.requireNonNull(packageName, "couldn't create Epackage: no packageName present.");
		Objects.requireNonNull(uri, "couldn't create Epackage: no uri present.");

		URI theURI = URI.createURI(uri);
		
		ResourceSet rs = new ResourceSetImpl();

		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.setName(packageName);
		ePackage.setNsPrefix(packageName);
		ePackage.setNsURI(theURI.toString());
		
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(rootClassName);
		ePackage.getEClassifiers().add(eClass);
		
		updateEPackageFromStream(in, eClass, rs);
		return ePackage;
	}
	
	public static void updateEPackageFromStream(InputStream in, EClass eClass,	ResourceSet rs)  {

		Objects.requireNonNull(in, "couldn't update Epackage: no JSON InputStream present.");
		Objects.requireNonNull(eClass, "couldn't update EPacakge: no ePackage present.");
		Objects.requireNonNull(rs, "couldn't update Epackage: no resourceSet present.");
	
		EPackage ePackage = eClass.getEPackage();
		
		Objects.requireNonNull(ePackage, "couldn't update Epackage: EClass has no ePackage.");
		Objects.requireNonNull(ePackage.getNsURI(), "couldn't update Epackage: EPackage has no URI.");
		
		if(ePackage.eResource() == null && !EPackageRegistryImpl.INSTANCE.containsValue(ePackage)) {
			Resource resource = rs.createResource(URI.createURI(ePackage.getNsURI()));
			resource.getContents().add(ePackage);
		} else if(!rs.getResources().contains(ePackage.eResource()) ) {
			rs.getResources().add(ePackage.eResource());
		}
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			JsonNode json = mapper.readTree(in);

			JsonToEcoreHelper.createEclassForJsonNode((ObjectNode) json, ePackage, eClass, rs);
		} catch (JsonProcessingException e) {
			throw new IllegalStateException("Error processing the given json: " + e.getMessage(), e);
		} catch (IOException e) {
			throw new IllegalStateException("Error reading inputstream: " + e.getMessage(), e);
		}

	}
	
	public static EClass createEclassForJsonNode(ObjectNode json, EPackage ePackage,
			String rootClassName, ResourceSet rs) {
		
		EClass	eClass = EcoreFactory.eINSTANCE.createEClass();
		eClass.setName(rootClassName);
		return createEclassForJsonNode(json, ePackage, eClass, rs);
	}
	
	public static EClass createEclassForJsonNode(ObjectNode json, EPackage ePackage,
			String eClassName, EClass eClass, ResourceSet rs) {
		if(eClass == null) {
			eClass = (EClass) ePackage.getEClassifier(eClassName);
			if(eClass == null) {
				eClass = EcoreFactory.eINSTANCE.createEClass();
			}
		}
		eClass.setName(eClassName);
		ePackage.getEClassifiers().add(eClass);
		return createEclassForJsonNode(json, ePackage, eClass, rs);
	}
	public static EClass createEclassForJsonNode(ObjectNode json, EPackage ePackage,
				EClass eClass, ResourceSet rs) {
		
		if(ePackage.getEClassifiers().contains(eClass)) {
			ePackage.getEClassifiers().add(eClass);
		}
		Iterator<String> fieldNames = json.fieldNames();
		while(fieldNames.hasNext()){
			String fieldName = fieldNames.next();
			EStructuralFeature feature = eClass.getEStructuralFeature(fieldName);
			JsonNode node = json.get(fieldName);
			if(node.isObject()){
				EReference reference = null;
				if(feature == null){
					reference = EcoreFactory.eINSTANCE.createEReference();
				} else if(feature != null && feature instanceof EReference){
					reference = (EReference) feature;
				} else {
					//TODO
				}
				EClass refClass = (EClass) reference.getEType();
				refClass = createEclassForJsonNode((ObjectNode) node, ePackage, Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1), refClass, rs);
				 
				reference.setEType(refClass);
				reference.setName(fieldName);
				reference.setContainment(true);
				eClass.getEStructuralFeatures().add(reference);
			} else if (node.isArray()){
				ArrayNode arrayNode = (ArrayNode) node;
				if(arrayNode.size() != 0){
					if(arrayNode.get(0).isObject()){
						EReference reference = null;
						if(feature instanceof EReference){
							reference = (EReference) feature;
						} else {
							reference = EcoreFactory.eINSTANCE.createEReference();
						}
						EClass refClass = (EClass) reference.getEType();
						refClass = createEClassForArrayJsonNode((ArrayNode) node, ePackage, buildManyClassName(fieldName), refClass, rs);
						reference.setUpperBound(-1);
						reference.setEType(refClass);
						reference.setName(fieldName);
						reference.setContainment(true);
						eClass.getEStructuralFeatures().add(reference);
					} else if(feature == null){
						EAttribute eAttribute = buildAttributeFromValueNode(rs, fieldName, arrayNode.get(0));
						eAttribute.setUpperBound(-1);
						eClass.getEStructuralFeatures().add(eAttribute); 
					}
				}

			} else if(node.isValueNode() && eClass.getEStructuralFeature(fieldName) == null){
				eClass.getEStructuralFeatures().add(buildAttributeFromValueNode(rs, fieldName, node)); 
			}
		}
		
		return eClass;
		
	}

	private static EAttribute buildAttributeFromValueNode(ResourceSet rs,
			String fieldName, JsonNode node) {
		ValueNode valueNode = (ValueNode) node;
		EAttribute attrib = EcoreFactory.eINSTANCE.createEAttribute();
		attrib.setName(fieldName);

		if(valueNode.isBinary()){
			attrib.setEType(EcorePackage.Literals.EBYTE_ARRAY);
		} else if (valueNode.isBigDecimal()){
			attrib.setEType(EcorePackage.Literals.EBIG_DECIMAL);
		} else if (valueNode.isBigInteger()){
			attrib.setEType(EcorePackage.Literals.EBIG_INTEGER);
		} else if (valueNode.isBoolean()){
			attrib.setEType(EcorePackage.Literals.EBOOLEAN);
		} else if (valueNode.isDouble()){
			attrib.setEType(EcorePackage.Literals.EDOUBLE);
		} else if (valueNode.isLong()){
			attrib.setEType(EcorePackage.Literals.ELONG);
		} else if (valueNode.isInt()){
			attrib.setEType(EcorePackage.Literals.EINT);
		} else if (valueNode.isTextual()){
			attrib.setEType(EcorePackage.Literals.ESTRING);
		}
		
		return attrib;
	}

	private static String buildManyClassName(String fieldName) {
		StringBuilder builder = new StringBuilder();
		builder.append(Character.toUpperCase(fieldName.charAt(0)));
		if(fieldName.charAt(fieldName.length() - 1) == 's'){
			builder.append(fieldName.substring(1, fieldName.length() - 1));
		} else {
			builder.append(fieldName.substring(1));
		}
		
		return builder.toString();
	}

	private static EClass createEClassForArrayJsonNode(ArrayNode node,
			EPackage ePackage, String className, EClass eClass, ResourceSet rs) {
		for (Iterator<JsonNode> it = node.elements(); it.hasNext();) {
			JsonNode element = it.next();
				if (element.isObject()) {
					eClass = createEclassForJsonNode((ObjectNode) element, ePackage, className, eClass, rs);
				}
			}
		return eClass;
	}
}
