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
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.mongo.Options;
import org.gecko.emf.repository.EMFRepository;

import org.gecko.emf.util.documentation.generators.apis.EcoreToDocumentationOptions;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.annotations.Activate;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

import de.jena.mdo.model.documentation.provider.ModelDocumentationProvider;
import de.jena.mdo.runtime.annotation.RequireRuntime;
import io.swagger.v3.oas.annotations.Operation;

/**
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
	
	@Reference(name = ModelResource.EPACKAGE_REFERENCE_NAME)
	private EPackage ePackage;
	
	@Reference(name = ModelResource.REPO_REFERENCE_NAME, scope = ReferenceScope.PROTOTYPE_REQUIRED) 
	EMFRepository repo;
	
	@Reference
	ModelDocumentationProvider modelDocumentationProvider;
	
	ModelResourceConfig config;
	
	@Activate 
	@Modified
	private void activate(ModelResourceConfig config) throws ConfigurationException {
		this.config = config;
	}
		
	@GET
	@Path("/hello")
	public String hello() {
		return "Configured for " + ePackage.getName();
	}

	@GET
	@Path("/{eClass}/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "application/xmi"})
	@Operation(description = "Returns a model")
	public Response get(@PathParam("eClass") String eClassName, @PathParam("id") String id, @QueryParam("user") String user) {
		EClassifier eClassifier = ePackage.getEClassifier(eClassName);
		if(eClassifier == null || !(eClassifier instanceof EClass)) {
			return Response.status(Status.BAD_REQUEST).entity("Unkwon Entity").type(MediaType.TEXT_PLAIN).build(); 
		}
		EClass eClass = (EClass) eClassifier;
		EObject eObject = repo.getEObject(eClass, id);
		return Response.ok(filter(user, eObject)).build();
	}
	
	private EObject filter(String user, EObject eObject) {
		if(user == null) {
			eObject.eClass().getEStructuralFeatures().stream().filter(f -> f.getEAnnotation("secret") != null).forEach(eObject::eUnset);
		}
		return eObject;
	}

	@GET
	@Path("/{eClass}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "application/xmi"})
	@Operation(description = "Returns a model List")
	public Response get(@PathParam("eClass") String eClassName, @QueryParam("user") String user) throws IOException {
		EClassifier eClassifier = ePackage.getEClassifier(eClassName);
		if(eClassifier == null || !(eClassifier instanceof EClass)) {
			return Response.status(Status.BAD_REQUEST).entity("Unkwon Entity").type(MediaType.TEXT_PLAIN).build(); 
		}
		EClass eClass = (EClass) eClassifier;
		Resource resource = repo.getResourceSet().createResource(URI.createURI("temp.xml"));
		List<EObject> list = repo.getAllEObjects(eClass, Collections.singletonMap(Options.OPTION_READ_DETACHED, true));
		list.stream().map(eo -> filter(user, eo)).forEach(resource.getContents()::add);
		return Response.ok(resource).build();
	}
	
	@GET
	@Path("/documentation/html/{docType}")
	@Produces({"text/html"})
	@Operation(description = "Returns the html model documentation for the whole package.")
	public Response getHtmlModelDocumentation(@PathParam("docType") String docType) {
		OutputStream os = null;
		switch(docType) {
		case "mermaid":
			os = modelDocumentationProvider.retrieveDocumentationFile(config.html_mermaid_file());
			break;
		case "onlyHtml": default:
			os = modelDocumentationProvider.retrieveDocumentationFile(config.html_file());
			break;
		}
		if(os == null) {
			System.out.println("Need to generate HTML documentation!");
			os = modelDocumentationProvider
					.generateHtmlDocumentation(ePackage, 
							"mermaid".equals(docType) ? EcoreToDocumentationOptions.HTML_WITH_MERMAID_CLASS_DIAGRAM 
									: EcoreToDocumentationOptions.ONLY_HTML_CLASS_OVERVIEW);
		}		
		return Response.ok(os.toString()).build();
	}
	
	@GET
	@Path("/documentation/html/{eClass}/{docType}")
	@Produces({"text/html"})
	@Operation(description = "Returns the html model documentation for the specific requested eClass.")
	public Response getHtmlModelClassDocumentation(@PathParam("eClass") String eClassName, @PathParam("docType") String docType) {
		EClassifier eClassifier = ePackage.getEClassifier(eClassName);
		if(eClassifier == null || !(eClassifier instanceof EClass)) {
			return Response.status(Status.BAD_REQUEST).entity("Unkwon Entity").type(MediaType.TEXT_PLAIN).build(); 
		}
		OutputStream os = null;
		switch(docType) {
		case "mermaid":
			String htmlMermaidPackageFile = config.html_mermaid_file();
			String htmlMermaidClassFile = htmlMermaidPackageFile.replace(ePackage.getName(), ePackage.getName().concat("_").concat(eClassName));
			os = modelDocumentationProvider.retrieveDocumentationFile(htmlMermaidClassFile);
			break;
		case "onlyHtml": default:
			String htmlPackageFile = config.html_file();
			String htmlClassFile = htmlPackageFile.replace(ePackage.getName(), ePackage.getName().concat("_").concat(eClassName));
			os = modelDocumentationProvider.retrieveDocumentationFile(htmlClassFile);
			break;
		}
		if(os == null) {
			System.out.println("Need to generate HTML documentation!");
			EClass eClass = (EClass) eClassifier;
			os = modelDocumentationProvider
					.generateHtmlDocumentation(eClass, 
							"mermaid".equals(docType) ? EcoreToDocumentationOptions.HTML_WITH_MERMAID_CLASS_DIAGRAM 
									: EcoreToDocumentationOptions.ONLY_HTML_CLASS_OVERVIEW);
		}		
		return Response.ok(os.toString()).build();
	}
	
	@GET
	@Path("/documentation/md/{docType}")
	@Produces({"text/markdown"})
	@Operation(description = "Returns the markdown model documentation for the whole package.")
	public Response getMarkdownModelDocumentation(@PathParam("docType") String docType) {
		OutputStream os = null;
		switch(docType) {
		case "mermaid":
			os = modelDocumentationProvider.retrieveDocumentationFile(config.md_mermaid_file());
			break;
		case "plantuml":
			os = modelDocumentationProvider.retrieveDocumentationFile(config.md_plantuml_file());
			break;
		case "onlyMd": default:
			os = modelDocumentationProvider.retrieveDocumentationFile(config.md_file());
			break;
		}
		if(os == null) {
			System.out.println("Need to generate MD documentation!");
			os = modelDocumentationProvider
					.generateMarkdownDocumentation(ePackage, 
							"mermaid".equals(docType) ? EcoreToDocumentationOptions.MARKDOWN_WITH_MERMAID_CLASS_DIAGRAM 
									: "plantuml".equals(docType) ? EcoreToDocumentationOptions.MARKDOWN_WITH_PLANTUML_CLASS_DIAGRAM 
											: EcoreToDocumentationOptions.ONLY_MARKDOWN_CLASS_OVERVIEW);
		}
		
		return Response.ok(os.toString()).build();
	}
	
	@GET
	@Path("/documentation/md/{eClass}/{docType}")
	@Produces({"text/markdown"})
	@Operation(description = "Returns the markdown model documentation for the requested class.")
	public Response getMarkdownModelClassDocumentation(@PathParam("eClass") String eClassName, @PathParam("docType") String docType) {
		EClassifier eClassifier = ePackage.getEClassifier(eClassName);
		if(eClassifier == null || !(eClassifier instanceof EClass)) {
			return Response.status(Status.BAD_REQUEST).entity("Unkwon Entity").type(MediaType.TEXT_PLAIN).build(); 
		}
		OutputStream os = null;
		switch(docType) {
		case "mermaid":
			String mdMermaidPackageFile = config.md_mermaid_file();
			String mdMermaidClassFile = mdMermaidPackageFile.replace(ePackage.getName(), ePackage.getName().concat("_").concat(eClassName));
			os = modelDocumentationProvider.retrieveDocumentationFile(mdMermaidClassFile);
			break;
		case "plantuml":
			String mdPlantumlPackageFile = config.md_plantuml_file();
			String mdPlantumlClassFile = mdPlantumlPackageFile.replace(ePackage.getName(), ePackage.getName().concat("_").concat(eClassName));
			os = modelDocumentationProvider.retrieveDocumentationFile(mdPlantumlClassFile);
			break;
		case "onlyMd": default:
			String mdPackageFile = config.md_file();
			String mdClassFile = mdPackageFile.replace(ePackage.getName(), ePackage.getName().concat("_").concat(eClassName));
			os = modelDocumentationProvider.retrieveDocumentationFile(mdClassFile);
			break;
		}
		if(os == null) {
			System.out.println("Need to generate MD documentation!");
			EClass eClass = (EClass) eClassifier;
			os = modelDocumentationProvider
					.generateMarkdownDocumentation(eClass, 
							"mermaid".equals(docType) ? EcoreToDocumentationOptions.MARKDOWN_WITH_MERMAID_CLASS_DIAGRAM 
									: "plantuml".equals(docType) ? EcoreToDocumentationOptions.MARKDOWN_WITH_PLANTUML_CLASS_DIAGRAM 
											: EcoreToDocumentationOptions.ONLY_MARKDOWN_CLASS_OVERVIEW);
		}
		
		return Response.ok(os.toString()).build();
	}

	@GET
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "application/xmi"})
	public EObject root() {
		return EcoreUtil.copy(ePackage);
	}

}
