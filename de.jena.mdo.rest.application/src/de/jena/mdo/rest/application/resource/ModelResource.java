/**
 * Copyright (c) 2012 - 2018 Data In Motion and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.rest.application.resource;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.gecko.emf.mongo.Options;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import de.jena.mdo.mimetypes.api.SupportedMediatype;
import de.jena.mdo.model.system.Container;
import de.jena.mdo.model.system.SystemFactory;
import de.jena.mdo.runtime.annotation.RequireRuntime;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

/**
 * <p>
 * This is a Demo Resource for a Jaxrs Whiteboard
 * </p>
 *
 * @since 1.0
 */
@RequireRuntime
@JakartarsResource
@Component(name = ModelResource.COMPONENT_NAME, service = ModelResource.class, scope = ServiceScope.PROTOTYPE, configurationPolicy = ConfigurationPolicy.REQUIRE)
@Path("/")
public class ModelResource {

	public static final String COMPONENT_NAME = "ModelResource";
	public static final String EPACKAGE_REFERENCE_NAME = "epackage.ref";
	public static final String REPO_REFERENCE_NAME = "repo.ref";

	private final List<String> supportedMediaType;

	@Reference(name = ModelResource.EPACKAGE_REFERENCE_NAME)
	private EPackage ePackage;
	private final EMFRepository repo;

	@Activate
	public ModelResource(
			@Reference(name = ModelResource.REPO_REFERENCE_NAME, scope = ReferenceScope.PROTOTYPE_REQUIRED) EMFRepository repo,
			@Reference SupportedMediatype types) {
		this.repo = repo;
		supportedMediaType = types.getSupportedMediaTypes();
	}

	@QueryParam("mediaType")
	String mediaType = null;

	@Context
	HttpHeaders headers;

	private void checkContentType() {
		if (mediaType != null) {
			if (supportedMediaType.contains(mediaType)) {
				return;
			}
		} else {
			List<MediaType> acceptableMediaTypes = headers.getAcceptableMediaTypes();
			for (MediaType acceptedMediaType : acceptableMediaTypes) {
				String accept = acceptedMediaType.getType() + "/" + acceptedMediaType.getSubtype();
				if (supportedMediaType.contains(accept)) {
					mediaType = accept;
					return;
				}
			}
		}
		throw new WebApplicationException(Status.UNSUPPORTED_MEDIA_TYPE);
	}

	@GET
	@Path("/hello")
	public String hello() {
		StringBuilder builder = new StringBuilder(
				"Configured for " + ePackage.getNsURI() + "<br>Supported MediaTypes are");
		supportedMediaType.forEach(s -> {
			builder.append(s);
			builder.append("<br>");
		});
		return builder.toString();
	}

	@GET
	@Path("/{eClass}/{id}")
	@Operation(description = "Returns a model instance")
	public Response get(@PathParam("eClass") String eClassName, @PathParam("id") String id,
			@QueryParam("user") String user) {
		checkContentType();
		EClassifier eClassifier = ePackage.getEClassifier(eClassName);
		if (eClassifier == null || !(eClassifier instanceof EClass)) {
			return Response.status(Status.BAD_REQUEST).entity("Unknown Entity " + eClassName).type(MediaType.TEXT_PLAIN)
					.build();
		}
		EClass eClass = (EClass) eClassifier;
		EObject eObject = repo.getEObject(eClass, id);
		if (eObject == null) {
			return Response.noContent().build();
		}
		return Response.ok(filter(user, eObject), mediaType).build();
	}

	private EObject filter(String user, EObject eObject) {
		if (user == null) {
			eObject.eClass().getEStructuralFeatures().stream().filter(f -> f.getEAnnotation("secret") != null)
					.forEach(eObject::eUnset);
		}
		return eObject;
	}

	@GET
	@Path("/{eClass}")
	@Operation(description = "Returns a model instance list")
	public Response get(@PathParam("eClass") String eClassName, @QueryParam("user") String user,
			@QueryParam("limit") Long limit) throws IOException {
		checkContentType();
		EClassifier eClassifier = ePackage.getEClassifier(eClassName);
		if (eClassifier == null || !(eClassifier instanceof EClass)) {
			return Response.status(Status.BAD_REQUEST).entity("Unknown Entity " + eClassName).type(MediaType.TEXT_PLAIN)
					.build();
		}
		EClass eClass = (EClass) eClassifier;
		Resource resource = repo.getResourceSet().createResource(URI.createURI("temp"), mediaType);
		Map<String, Object> props = new HashMap<>();
		props.put(Options.OPTION_READ_DETACHED, true);
		if(limit != null) {
			props.put("limit", limit);
		}
		List<EObject> list = repo.getAllEObjects(eClass, Map.of(Options.OPTION_READ_DETACHED, true));
		if (list.isEmpty()) {
			return Response.noContent().build();
		}
		Stream<EObject> filtered = list.stream().map(eo -> filter(user, eo));
		if (limit != null && limit > 0 && limit < Long.MAX_VALUE) {
			filtered = filtered.limit(limit);
		}
		list = filtered.collect(Collectors.toList());
		if (MediaType.APPLICATION_XML.equals(mediaType)) {
			((XMLResource) resource).setEncoding("UTF-8");
			Container container = SystemFactory.eINSTANCE.createContainer();
			resource.getContents().add(container);
			container.getElements().addAll(list);
//			AnyType anyType = XMLTypeFactory.eINSTANCE.createAnyType();
//			container.setRoot(anyType);
//			anyType.eSet(SystemPackage.Literals.XML_CONTAINER__ELEMENTS, ECollections.asEList(list));
		} else {
			list.forEach(resource.getContents()::add);
		}
		return Response.ok(resource, mediaType).build();
	}

	@GET
	@Path("/")
	@Operation(description = "Returns a model schema")
	public Response root(@QueryParam("user") String user) {
		checkContentType();
		EPackage ePackageCopy = EcoreUtil.copy(ePackage);
		ePackageCopy = filterEPackage(user, ePackageCopy);
		return Response.ok(ePackageCopy, mediaType).build();
	}

	private EPackage filterEPackage(String user, EPackage ePackage) {
		if (user == null) {
			ePackage.getEClassifiers().stream().map(EClass.class::cast).forEach(this::filterEClass);
		}
		return ePackage;
	}

	private void filterEClass(EClass eClass) {
		for (Iterator<EStructuralFeature> iterator = eClass.getEStructuralFeatures().iterator(); iterator.hasNext();) {
			EStructuralFeature feature = iterator.next();
			if (feature.getEAnnotation("secret") != null) {
				iterator.remove();
			}
		}
	}

}
