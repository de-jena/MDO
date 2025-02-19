/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.graphql.query;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.gecko.emf.osgi.model.info.EMFModelInfo;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.whiteboard.graphql.GraphqlSchemaTypeBuilder;
import org.gecko.whiteboard.graphql.annotation.GraphqlUnionType;
import org.gecko.whiteboard.graphql.emf.datafetcher.EStructuralFeatureDataFetcher;
import org.gecko.whiteboard.graphql.emf.resolver.EMFTypeResolver;
import org.gecko.whiteboard.graphql.emf.resolver.EMFUnionTypeResolver;
import org.gecko.whiteboard.graphql.emf.schema.GraphQLEMFFieldDefinition;
import org.gecko.whiteboard.graphql.emf.schema.GraphQLEMFInputObjectField;
import org.gecko.whiteboard.graphql.emf.schema.GraphQLEMFInputObjectType;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.osgi.service.component.annotations.ReferenceScope;

import de.jena.mdo.graphql.query.datafetcher.AllDataFetcher;
import de.jena.mdo.graphql.query.datafetcher.ByIdDataFetcher;
import graphql.schema.DataFetcher;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLEnumType;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLInputType;
import graphql.schema.GraphQLInterfaceType;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLNonNull;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLOutputType;
import graphql.schema.GraphQLType;
import graphql.schema.GraphQLTypeReference;
import graphql.schema.GraphQLUnionType;
import graphql.schema.GraphQLUnionType.Builder;
import graphql.schema.StaticDataFetcher;
import graphql.servlet.GraphQLQueryProvider;
import graphql.servlet.GraphQLTypesProvider;

/**
 * Provides a Query for the configured {@link EPackage}
 *
 * @author Juergen Albert
 * @since 22 Jun 2022
 */
@Component(name = MDOGraphQLQueryProvider.MDO_GRAPH_QL_QUERY_PROVIDER, immediate = true, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class MDOGraphQLQueryProvider implements GraphQLQueryProvider, GraphQLTypesProvider {

	/** E_PACKAGE */
	public static final String EPACKAGE_REFERENCE_NAME = "ePackage";

	/** MDO_GRAPH_QL_QUERY_PROVIDER */
	public static final String MDO_GRAPH_QL_QUERY_PROVIDER = "MDOGraphQLQueryProvider";

	@Reference
	GraphqlSchemaTypeBuilder typeBuilder;

	@Reference(name = EPACKAGE_REFERENCE_NAME, target = "(nope=nope)", policyOption = ReferencePolicyOption.GREEDY)
	EPackage ePackage;

	@Reference(cardinality = ReferenceCardinality.MANDATORY)
	EMFModelInfo modelInfo;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED, name = "repo.ref")
	ComponentServiceObjects<EMFRepository> repo;

	Collection<GraphQLFieldDefinition> fields;
	Collection<GraphQLType> types;

	@Activate
	public void activate() {
		System.out.println("Generating GrapQL for " + ePackage);
		Map<String, GraphQLType> cache = new HashMap<String, GraphQLType>();

		GraphqlSchemaTypeBuilder.getGraphQLScalarType(String.class);
		GraphQLFieldDefinition field = GraphQLFieldDefinition.newFieldDefinition().name(ePackage.getName())
				.description(ePackage.getNsURI()).type(buildEClassList(ePackage, cache))
				.dataFetcher(new StaticDataFetcher(new Object())).build();

		fields = Collections.singleton(field);
		types = cache.values();
	}

	@Deactivate
	public void deactivate() {
		System.out.println("Removing GrapQL for " + ePackage);
	}
	
	/*
	 * (non-Javadoc)
	 *
	 * @see graphql.servlet.GraphQLQueryProvider#getQueries()
	 */
	@Override
	public Collection<GraphQLFieldDefinition> getQueries() {
		return fields;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see graphql.servlet.GraphQLTypesProvider#getTypes()
	 */
	@Override
	public Collection<GraphQLType> getTypes() {
		return types;
	}

	/**
	 * @param ePackage2
	 * @return
	 */
	private GraphQLObjectType buildEClassList(EPackage ePackage, Map<String, GraphQLType> typeMappings) {
		graphql.schema.GraphQLObjectType.Builder resultPackage = GraphQLObjectType.newObject()
				.name(ePackage.getName() + "Package");
		ePackage.getEClassifiers().stream().filter(EClass.class::isInstance).map(EClass.class::cast)
				.filter(ec -> ec.getEIDAttribute() != null).map(ec -> toPublish(ec, typeMappings))
				.forEach(resultPackage::field);
		return resultPackage.build();
	}

	private GraphQLFieldDefinition toPublish(EClass eClass, Map<String, GraphQLType> typeMappings) {
		return GraphQLFieldDefinition.newFieldDefinition().name(eClass.getName())
				.type(GraphQLObjectType.newObject().name(eClass.getName() + "Wrapper")
						.field(createAllField(eClass, typeMappings)).field(createByIdField(eClass, typeMappings)))
				.dataFetcher(new StaticDataFetcher(new Object())).build();

	}

	/**
	 * @param eClass
	 * @param typeMappings
	 * @return
	 */
	private GraphQLFieldDefinition createAllField(EClass eClass, Map<String, GraphQLType> typeMappings) {
		return GraphQLFieldDefinition.newFieldDefinition().name("all")
				.type(GraphQLList.list(buildEClass(eClass, typeMappings, false, Collections.emptyList())))
				.dataFetcher(new AllDataFetcher(repo, eClass)).build();
	}

	/**
	 * @param eClass
	 * @param typeMappings
	 * @return
	 */
	private GraphQLFieldDefinition createByIdField(EClass eClass, Map<String, GraphQLType> typeMappings) {
		return GraphQLFieldDefinition.newFieldDefinition().name("byId")
				.argument(GraphQLArgument.newArgument().name("id")
						.type(GraphQLNonNull.nonNull(buildTypeForEClassifier(eClass.getEIDAttribute().getEType(),
								typeMappings, false, Collections.emptyList()))))
				.type((GraphQLInterfaceType) buildEClass(eClass, typeMappings, false, Collections.emptyList()))
				.dataFetcher(new ByIdDataFetcher(repo, eClass)).build();
	}

	/**
	 *
	 * @param eClassifier the {@link EClassifier} to build a {@link GraphQLType} for
	 * @param typeMapping
	 * @param inputType
	 * @param annotations
	 * @return
	 */
	private GraphQLType buildTypeForEClassifier(EClassifier eClassifier, Map<String, GraphQLType> typeMapping,
			boolean inputType, List<Annotation> annotations) {

		String name = getName(eClassifier, inputType, annotations);

		if (typeMapping.containsKey(name)) {
			return typeMapping.get(name);
		}

		if (eClassifier instanceof EEnum) {
			return buildEnum((EEnum) eClassifier, typeMapping);
		}

		if (eClassifier instanceof EDataType) {
			EDataType dataType = (EDataType) eClassifier;
			GraphQLType scalarType = GraphqlSchemaTypeBuilder.getGraphQLScalarType(dataType.getInstanceClass());
			if (scalarType == null) {
				if(dataType.getInstanceClass().isArray()) {
					scalarType = GraphqlSchemaTypeBuilder.getGraphQLScalarType(dataType.getInstanceClass().getComponentType());
				}
			}
			return scalarType;
		}

		EClass eClass = (EClass) eClassifier;

		return buildEClass(eClass, typeMapping, inputType, annotations);
	}

	/**
	 * @param eClassifier
	 * @param inputType
	 * @return
	 */
	private String getName(EClassifier eClassifier, boolean inputType, List<Annotation> annotations) {
		if (inputType && !(eClassifier instanceof EEnum)) {
			return eClassifier.getName() + "Input";
		} else if (getUnionTypeAnnotation(annotations) != null) {
			return eClassifier.getName() + "Union";
		}
		return eClassifier.getName();
	}

	/**
	 * @param eClassifier
	 * @param typeMapping
	 * @return
	 */
	private GraphQLType buildEnum(EEnum eEnum, Map<String, GraphQLType> typeMapping) {
		GraphQLEnumType.Builder typeBuilder = GraphQLEnumType.newEnum().name(eEnum.getName());
		eEnum.getELiterals().stream().forEach(literal -> {
			typeBuilder.value(literal.getName(), literal.getInstance(), getDocumentation(eEnum));
		});
		GraphQLEnumType theEnum = typeBuilder.build();
		typeMapping.put(eEnum.getName(), theEnum);
		return theEnum;
	}

	/**
	 * @param eEnum
	 * @return
	 */
	private String getDocumentation(EModelElement eClassifier) {
		EAnnotation eAnnotation = eClassifier.getEAnnotation("http://www.eclipse.org/emf/2002/GenModel");
		if (eAnnotation != null) {
			return eAnnotation.getDetails().get("documentation");
		}
		return null;
	}

	/**
	 * @param eClass
	 * @param typeMapping
	 * @param inputType
	 * @param annotations
	 * @return
	 */
	private GraphQLType buildEClass(EClass eClass, Map<String, GraphQLType> typeMapping, boolean inputType,
			List<Annotation> annotations) {
		if (!inputType) {
			List<EClass> upperTypeHierarchyForEClass = modelInfo.getUpperTypeHierarchyForEClass(eClass);
			GraphqlUnionType unionTypeAnnotation = getUnionTypeAnnotation(annotations);
			if (!upperTypeHierarchyForEClass.isEmpty() && unionTypeAnnotation != null) {
				return buildUnionTypeOutput(eClass, upperTypeHierarchyForEClass, typeMapping, annotations);
			}
			GraphQLInterfaceType interfaceType = buildInterfacesAndObject(eClass, typeMapping, annotations);
			return interfaceType;
		} else {
			GraphQLInputType inputObjectType = buildInputObject(eClass, typeMapping, annotations);
			return inputObjectType;
		}
	}

	/**
	 * @param annotations
	 * @return
	 */
	private GraphqlUnionType getUnionTypeAnnotation(List<Annotation> annotations) {
		return Optional.ofNullable(annotations).orElseGet(Collections::emptyList).stream()
				.filter(annotation -> annotation instanceof GraphqlUnionType)
				.map(annotation -> (GraphqlUnionType) annotation).findFirst().orElseGet(() -> null);
	}

	/**
	 * @param eClass
	 * @param upperTypeHierarchyForEClass
	 * @param typeMapping
	 * @param annotations
	 * @return
	 */
	private GraphQLType buildUnionTypeOutput(EClass eClass, List<EClass> upperTypeHierarchyForEClass,
			Map<String, GraphQLType> typeMapping, List<Annotation> annotations) {
		String unionName = getName(eClass, false, annotations);
		if (typeMapping.containsKey(unionName)) {
			return typeMapping.get(unionName);
		}

		GraphqlUnionType unionTypeAnnotation = getUnionTypeAnnotation(annotations);

		Builder unionType = GraphQLUnionType.newUnionType();

		unionType.name(unionName);

		Map<EClassifier, GraphQLObjectType> resolverContent = new HashMap<>();

		upperTypeHierarchyForEClass.stream().filter(eC -> isMemberOfUnionType(eC, unionTypeAnnotation)).map(eC -> {
			GraphQLInterfaceType interfaceType = buildInterfacesAndObject(eC, typeMapping, Collections.emptyList());

			resolverContent.put(eC, (GraphQLObjectType) typeMapping.get(interfaceType.getName() + "Impl"));

			return interfaceType;
		}).map(qlType -> GraphQLTypeReference.typeRef(qlType.getName() + "Impl")).forEach(unionType::possibleType);
		GraphQLInterfaceType qlInterface = buildInterfacesAndObject(eClass, typeMapping, Collections.emptyList());
		if (isMemberOfUnionType(eClass, unionTypeAnnotation)) {
			resolverContent.put(eClass, (GraphQLObjectType) typeMapping.get(qlInterface.getName() + "Impl"));
			unionType.possibleType(GraphQLTypeReference.typeRef(qlInterface.getName() + "Impl"));
		}
		unionType.typeResolver(new EMFUnionTypeResolver(resolverContent));
		GraphQLUnionType type = unionType.build();

		typeMapping.put(unionName, type);

		return type;
	}

	/**
	 * @param eC
	 * @param unionTypeAnnotation
	 * @return
	 */
	private boolean isMemberOfUnionType(EClass eC, GraphqlUnionType unionTypeAnnotation) {

		if (unionTypeAnnotation.value().length == 0) {
			return true;
		}

		for (Class<?> clazz : unionTypeAnnotation.value()) {
			if (clazz == eC.getInstanceClass()) {
				return true;
			}
		}

		return false;
	}

	/**
	 *
	 * @param eClass
	 * @param typeMapping
	 * @param inputType
	 * @return
	 */
	private GraphQLInterfaceType buildInterfacesAndObject(EClass eClass, Map<String, GraphQLType> typeMapping,
			List<Annotation> annotations) {
		if (typeMapping.containsKey(eClass.getName())) {
			return (GraphQLInterfaceType) typeMapping.get(eClass.getName());
		}
		GraphQLInterfaceType.Builder interfaceBuilder = GraphQLInterfaceType.newInterface().name(eClass.getName());
		GraphQLObjectType.Builder objectBuilder = null;
		objectBuilder = GraphQLObjectType.newObject().name(eClass.getName() + "Impl");
		GraphQLInterfaceType interfaceType = interfaceBuilder.typeResolver(new EMFTypeResolver(typeMapping)).build();
		typeMapping.put(eClass.getName(), interfaceType);
		interfaceBuilder = GraphQLInterfaceType.newInterface(interfaceType);
		List<GraphQLInterfaceType> hirachy = new LinkedList<GraphQLInterfaceType>();

		hirachy.addAll(eClass.getEAllSuperTypes().stream()
				.map(eC -> buildInterfacesAndObject(eC, typeMapping, annotations)).collect(Collectors.toList()));

		for (EAttribute eAttribute : eClass.getEAllAttributes()) {
			if (!isQueryFeature(eAttribute)) {
				continue;
			}
			EClassifier type = eAttribute.getEType();
			String fieldName = eAttribute.getName();
			String documentation = getDocumentation(eAttribute);
			GraphQLType createType = buildTypeForEClassifier(type, typeMapping, false, annotations);
			if(createType == null) {
				continue;
			}
			createType = wrapReferenceProperties(eAttribute, createType);
			DataFetcher<Object> datafetcher = getDataFetcher(eAttribute);
			interfaceBuilder.field(createField(fieldName, datafetcher, createType, documentation, eAttribute));
			objectBuilder.field(createField(fieldName, datafetcher, createType, documentation, eAttribute));
		}

		for (EReference reference : eClass.getEAllReferences()) {
			if (!isQueryFeature(reference)) {
				continue;
			}
			EClass type = (EClass) reference.getEType();
			String fieldName = reference.getName();
			String documentation = getDocumentation(reference);
			GraphQLType createType = buildInterfacesAndObject(type, typeMapping, annotations);
			List<EClass> upperTypeHierarchyForEClass = modelInfo.getUpperTypeHierarchyForEClass(type);
			upperTypeHierarchyForEClass.forEach(eC -> buildInterfacesAndObject(eC, typeMapping, annotations));
			createType = wrapReferenceProperties(reference, createType);
			DataFetcher<Object> datafetcher = getDataFetcher(reference);
			interfaceBuilder.field(createField(fieldName, datafetcher, createType, documentation, reference));
			objectBuilder.field(createField(fieldName, datafetcher, createType, documentation, reference));
		}

		interfaceType = interfaceBuilder.build();
		hirachy.add(0, interfaceType);

		objectBuilder.withInterfaces(hirachy.stream().map(iT -> GraphQLTypeReference.typeRef(iT.getName()))
				.toArray(GraphQLTypeReference[]::new));
		typeMapping.put(eClass.getName(), interfaceType);
		typeMapping.put(eClass.getName() + "Impl", objectBuilder.build());
		return interfaceType;
	}

	/**
	 * @param eAttribute
	 * @return
	 */
	private DataFetcher<Object> getDataFetcher(EStructuralFeature feature) {
		EAnnotation eAnnotation = feature.getEAnnotation("GraphQLContext");

		return new EStructuralFeatureDataFetcher(feature);
	}

	/**
	 * Creates a {@link GraphQLInputType} for the given {@link EClass}. The type
	 * will be named EClass
	 *
	 * @param eClass
	 * @param typeMapping
	 * @param upperTypeHierarchyForEClass
	 * @param inputType
	 * @return
	 */
	private GraphQLInputType buildInputObject(EClass eClass, Map<String, GraphQLType> typeMapping,
			List<Annotation> annotations) {
		String name = getName(eClass, true, annotations);
		if (typeMapping.containsKey(name)) {
			return (GraphQLInputType) typeMapping.get(name);
		}

		GraphQLEMFInputObjectType.Builder inputObjectBuilder = GraphQLEMFInputObjectType.newEMFInputObject().name(name)
				.eClass(eClass);
		GraphQLEMFInputObjectType inputObject = inputObjectBuilder.build();
		typeMapping.put(name, inputObject);
		inputObjectBuilder = GraphQLEMFInputObjectType.newEMFInputObject(inputObject);

		eClass.getEAllAttributes().stream().filter(this::isMutationFeature).map(eAttribute -> {
			EClassifier type = eAttribute.getEType();
			String fieldName = eAttribute.getName();
			String documentation = getDocumentation(eAttribute);
			GraphQLType createType = buildTypeForEClassifier(type, typeMapping, true, annotations);
			createType = wrapReferenceInputAttribute(eAttribute, createType);
			return createInputField(fieldName, createType, documentation, eAttribute);
		}).forEach(inputObjectBuilder::field);

		eClass.getEAllReferences().stream().filter(this::isMutationFeature).map(reference -> {
			EClass type = (EClass) reference.getEType();
			String fieldName = reference.getName();
			String documentation = getDocumentation(reference);
			GraphQLType createType = buildInputObject(type, typeMapping, annotations);
			createType = wrapReferenceProperties(reference, createType);
			return createInputField(fieldName, createType, documentation, reference);
		}).forEach(inputObjectBuilder::field);

		inputObject = inputObjectBuilder.build();
		typeMapping.put(name, inputObject);
		return inputObject;
	}

	public boolean isMutationFeature(EStructuralFeature feature) {
		boolean result = feature.getEAnnotation("QueryOnly") == null;
		if (result && feature instanceof EReference) {
			result = feature.getEAnnotation("MutationOnly") != null ? true : ((EReference) feature).isContainment();
		}
		return result;
	}

	public boolean isQueryFeature(EStructuralFeature feature) {
		return feature.getEAnnotation("MutationOnly") == null;
	}

	/**
	 * @param eAttribute
	 * @param createType
	 * @return
	 */
	private GraphQLType wrapReferenceProperties(EStructuralFeature eFeature, GraphQLType type) {
		GraphQLType result = eFeature instanceof EReference ? GraphQLTypeReference.typeRef(type.getName()) : type;
		result = wrap(eFeature.isRequired(), GraphQLNonNull::nonNull, result);
		result = wrap(isMany(eFeature) , GraphQLList::list, result);
		return result;
	}

	private boolean isMany(EStructuralFeature eFeature) {
		if(eFeature instanceof EAttribute attr) {
			if(attr.getEAttributeType().getInstanceClass() != null ) {
				if(attr.getEAttributeType().getInstanceClass().isArray()) {
					return true;
				}
			}
		}
		return eFeature.isMany();
	}

	/**
	 * @param eAttribute
	 * @param createType
	 * @return
	 */
	private GraphQLType wrapReferenceInputAttribute(EAttribute eAttribute, GraphQLType type) {
		GraphQLType result = eAttribute instanceof EReference ? GraphQLTypeReference.typeRef(type.getName()) : type;
		result = wrap(eAttribute.isRequired() && !eAttribute.isID(), GraphQLNonNull::nonNull, result);
		result = wrap(eAttribute.isMany(), GraphQLList::list, result);
		return result;
	}

	/**
	 * @param required
	 * @param object
	 * @param createType
	 * @return
	 */
	private GraphQLType wrap(boolean required, Function<GraphQLType, GraphQLType> function, GraphQLType type) {
		return required ? function.apply(type) : type;
	}

	/**
	 * @param documentation
	 * @param string
	 * @return
	 */
	private GraphQLEMFFieldDefinition createField(String name, DataFetcher<?> datafetcher, GraphQLType type,
			String documentation, EStructuralFeature feature) {
		GraphQLEMFFieldDefinition.Builder builder = GraphQLEMFFieldDefinition.newEMFFieldDefinition().name(name)
				.description(documentation).dataFetcher(datafetcher).type((GraphQLOutputType) type).feature(feature);
		return builder.build();
	}

	/**
	 * @param documentation
	 * @param string
	 * @return
	 */
	private GraphQLEMFInputObjectField createInputField(String name, GraphQLType type, String documentation,
			EStructuralFeature eFeature) {
		GraphQLEMFInputObjectField.Builder builder = GraphQLEMFInputObjectField.newEMFInputObjectField().name(name)
				.description(documentation).eFeature(eFeature).type((GraphQLInputType) type);
		if (!isMany(eFeature)) {
			builder = builder.defaultValue(eFeature.getDefaultValue());
		}
		return builder.build();
	}

}
