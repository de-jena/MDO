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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.mongo.Options;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

import de.jena.mdo.runtime.annotation.RequireRuntime;
import io.swagger.v3.oas.annotations.Operation;

/**
 * <p>
 * This is a Demo Resource for a Jaxrs Whiteboard 
 * </p>
 * 
 * @since 1.0
 */
@RequireRuntime
@JaxrsResource
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
		@Reference(name = ModelResource.REPO_REFERENCE_NAME, scope = ReferenceScope.PROTOTYPE_REQUIRED) 
		EMFRepository repo){
			this.repo = repo;
			supportedMediaType = new ArrayList<>(repo.getResourceSet().getResourceFactoryRegistry().getContentTypeToFactoryMap().keySet());
	}
	
	@QueryParam("mediaType")
	String mediaType = null;
	
	@Context 
	HttpHeaders headers;
	
	private void checkContentType() {
		if(mediaType != null) {
			if(supportedMediaType.contains(mediaType)) {
				return;
			}
		} else {
			List<MediaType> acceptableMediaTypes = headers.getAcceptableMediaTypes();
			for(MediaType acceptedMediaType : acceptableMediaTypes) {
				String accept = acceptedMediaType.getType() + "/" + acceptedMediaType.getSubtype();
				if(supportedMediaType.contains(accept)) {
					return;
				}
			}
		}
		throw new WebApplicationException(Status.UNSUPPORTED_MEDIA_TYPE);
	}
	
	@GET
	@Path("/hello")
	public String hello() {
		return "Configured for " + ePackage.getNsURI();
	}

	@GET
	@Path("/{eClass}/{id}")
	@Operation(description = "Returns a model instance")
	public Response get(@PathParam("eClass") String eClassName, @PathParam("id") String id, @QueryParam("user") String user) {
		EClassifier eClassifier = ePackage.getEClassifier(eClassName);
		if(eClassifier == null || !(eClassifier instanceof EClass)) {
			return Response.status(Status.BAD_REQUEST).entity("Unknown Entity " + eClassName).type(MediaType.TEXT_PLAIN).build(); 
		}
		EClass eClass = (EClass) eClassifier;
		EObject eObject = repo.getEObject(eClass, id);
		if(eObject == null) {
			return Response.noContent().build();
		}
		return wrap(filter(user, eObject));
	}
	
	private EObject filter(String user, EObject eObject) {
		if(user == null) {
			eObject.eClass().getEStructuralFeatures().stream().filter(f -> f.getEAnnotation("secret") != null).forEach(eObject::eUnset);
		}
		return eObject;
	}

	@GET
	@Path("/{eClass}")
	@Operation(description = "Returns a model instance list")
	public Response get(@PathParam("eClass") String eClassName, @QueryParam("user") String user) throws IOException {
		EClassifier eClassifier = ePackage.getEClassifier(eClassName);
		if(eClassifier == null || !(eClassifier instanceof EClass)) {
			return Response.status(Status.BAD_REQUEST).entity("Unknown Entity " + eClassName).type(MediaType.TEXT_PLAIN).build(); 
		}
		EClass eClass = (EClass) eClassifier;
		Resource resource = repo.getResourceSet().createResource(URI.createURI("temp.xml"));
		List<EObject> list = repo.getAllEObjects(eClass, Collections.singletonMap(Options.OPTION_READ_DETACHED, true));
		list.stream().map(eo -> filter(user, eo)).forEach(resource.getContents()::add);
		return wrap(resource);
	}

	@GET
	@Path("/")
	@Operation(description = "Returns a model schema")
	public Response root(@QueryParam("user") String user) {
		EPackage ePackageCopy = EcoreUtil.copy(ePackage); 
		ePackageCopy = filterEPackage(user, ePackageCopy);
		return wrap(ePackageCopy);
	}
	
	private EPackage filterEPackage(String user, EPackage ePackage) {
		if(user == null) {
			ePackage.getEClassifiers().stream().map(EClass.class::cast).forEach(this::filterEClass);
		}
		return ePackage;
	}
	
	private void filterEClass(EClass eClass) {
		for (Iterator<EStructuralFeature> iterator = eClass.getEStructuralFeatures().iterator(); iterator.hasNext();) {
			EStructuralFeature feature = iterator.next();
			if(feature.getEAnnotation("secret") != null) {
				iterator.remove();
			}
		}
	}
	
	private Response wrap(Object o) {
		checkContentType();
		if(mediaType != null) {
			return Response.ok(o, mediaType).build();
		}
		return Response.ok(o).build();
	}

}
