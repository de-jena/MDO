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

import java.io.OutputStream;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.gecko.emf.util.documentation.generators.apis.EcoreToDocumentationOptions;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

import de.jena.mdo.model.documentation.provider.ModelDocumentationConstants;
import de.jena.mdo.model.documentation.provider.ModelDocumentationProvider;
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
@Component(name = DocumentationResource.COMPONENT_NAME, service = DocumentationResource.class, scope = ServiceScope.PROTOTYPE, configurationPolicy = ConfigurationPolicy.REQUIRE)
@Path("/documentation")
public class DocumentationResource {

	public static final String COMPONENT_NAME = "DocumentationResource";
	public static final String EPACKAGE_REFERENCE_NAME = "epackage.ref";
	
	@Reference(name = DocumentationResource.EPACKAGE_REFERENCE_NAME)
	private EPackage ePackage;
	
	@Reference
	ModelDocumentationProvider modelDocumentationProvider;
	
	Map<String, Object> properties;
	
	
	@Activate 
	@Modified
	private void activate(Map<String, Object> properties) throws ConfigurationException {
		this.properties = Map.copyOf(properties);
	}
	
	@GET
	@Path("/hello")
	public String hello() {
		return "Configured for " + ePackage.getNsURI();
	}

	@GET
	@Path("/html/{docType}")
	@Produces({"text/html"})
	@Operation(description = "Returns the html model documentation for the whole package.")
	public Response getHtmlModelDocumentation(@PathParam("docType") String docType) {
		OutputStream os = null;
		String filePath = null;
		switch(docType) {
		case "mermaid":
			filePath = (String) properties.get(ModelDocumentationConstants.PROPERTY_HTML_MERMAID_FILE);
			break;
		case "onlyHtml": default:
			filePath = (String) properties.get(ModelDocumentationConstants.PROPERTY_HTML_FILE);
			break;
		}
		os = modelDocumentationProvider.retrieveDocumentation(filePath, true, ePackage, 
				"mermaid".equals(docType) ? EcoreToDocumentationOptions.HTML_WITH_MERMAID_CLASS_DIAGRAM 
				: EcoreToDocumentationOptions.ONLY_HTML_CLASS_OVERVIEW);
		if(os == null) {
			return Response.noContent().build();
		}
		return Response.ok(os.toString()).build();
	}
	
	@GET
	@Path("/html/{eClass}/{docType}")
	@Produces({"text/html"})
	@Operation(description = "Returns the html model documentation for the specific requested eClass.")
	public Response getHtmlModelClassDocumentation(@PathParam("eClass") String eClassName, @PathParam("docType") String docType) {
		EClassifier eClassifier = ePackage.getEClassifier(eClassName);
		if(eClassifier == null || !(eClassifier instanceof EClass)) {
			return Response.status(Status.BAD_REQUEST).entity("Unkwon Entity").type(MediaType.TEXT_PLAIN).build(); 
		}
		EClass eClass = (EClass) eClassifier;
		OutputStream os = null;
		String filePath = null;
		switch(docType) {
		case "mermaid":
			filePath = (String) properties.get(ModelDocumentationConstants.PROPERTY_HTML_MERMAID_FILE + "." + eClassName);
			break;
		case "onlyHtml": default:
			filePath = (String) properties.get(ModelDocumentationConstants.PROPERTY_HTML_FILE + "." + eClassName);
			break;
		}
		os = modelDocumentationProvider.retrieveDocumentation(filePath, true, eClass, 
				"mermaid".equals(docType) ? EcoreToDocumentationOptions.HTML_WITH_MERMAID_CLASS_DIAGRAM 
				: EcoreToDocumentationOptions.ONLY_HTML_CLASS_OVERVIEW);
		if(os == null) {
			return Response.noContent().build();
		}		
		return Response.ok(os.toString()).build();
	}
	
	@GET
	@Path("/md/{docType}")
	@Produces({"text/markdown"})
	@Operation(description = "Returns the markdown model documentation for the whole package.")
	public Response getMarkdownModelDocumentation(@PathParam("docType") String docType) {
		OutputStream os = null;
		String filePath = null;
		switch(docType) {
		case "mermaid":
			filePath = (String) properties.get(ModelDocumentationConstants.PROPERTY_MD_MERMAID_FILE);
			break;
		case "plantuml":
			filePath = (String) properties.get(ModelDocumentationConstants.PROPERTY_MD_PLANTUML_FILE);
			break;
		case "onlyMd": default:
			filePath = (String) properties.get(ModelDocumentationConstants.PROPERTY_MD_FILE);
			break;
		}
		os = modelDocumentationProvider.retrieveDocumentation(filePath, true, ePackage, 
				"mermaid".equals(docType) ? EcoreToDocumentationOptions.MARKDOWN_WITH_MERMAID_CLASS_DIAGRAM 
				: "plantuml".equals(docType) ? EcoreToDocumentationOptions.MARKDOWN_WITH_PLANTUML_CLASS_DIAGRAM 
						: EcoreToDocumentationOptions.ONLY_MARKDOWN_CLASS_OVERVIEW);
		if(os == null) {
			return Response.noContent().build();
		}		
		return Response.ok(os.toString()).build();
	}
	
	@GET
	@Path("/md/{eClass}/{docType}")
	@Produces({"text/markdown"})
	@Operation(description = "Returns the markdown model documentation for the requested class.")
	public Response getMarkdownModelClassDocumentation(@PathParam("eClass") String eClassName, @PathParam("docType") String docType) {
		EClassifier eClassifier = ePackage.getEClassifier(eClassName);
		if(eClassifier == null || !(eClassifier instanceof EClass)) {
			return Response.status(Status.BAD_REQUEST).entity("Unkwon Entity").type(MediaType.TEXT_PLAIN).build(); 
		}
		EClass eClass = (EClass) eClassifier;
		OutputStream os = null;
		String filePath = null;
		switch(docType) {
		case "mermaid":
			filePath = (String) properties.get(ModelDocumentationConstants.PROPERTY_MD_MERMAID_FILE + "." + eClassName);
			break;
		case "plantuml":
			filePath = (String) properties.get(ModelDocumentationConstants.PROPERTY_MD_PLANTUML_FILE + "." + eClassName);			
			break;
		case "onlyMd": default:
			filePath = (String) properties.get(ModelDocumentationConstants.PROPERTY_MD_FILE + "." + eClassName);
			break;
		}
		os = modelDocumentationProvider.retrieveDocumentation(filePath, true, eClass,
				"mermaid".equals(docType) ? EcoreToDocumentationOptions.MARKDOWN_WITH_MERMAID_CLASS_DIAGRAM 
				: "plantuml".equals(docType) ? EcoreToDocumentationOptions.MARKDOWN_WITH_PLANTUML_CLASS_DIAGRAM 
						: EcoreToDocumentationOptions.ONLY_MARKDOWN_CLASS_OVERVIEW);
		if(os == null) {
			return Response.noContent().build();
		}		
		return Response.ok(os.toString()).build();
	}
}
