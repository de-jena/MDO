/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.rest.application.configurator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EPackage;
import org.gecko.emf.osgi.EMFNamespaces;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.cm.annotations.RequireConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

import de.jena.mdo.model.documentation.provider.ModelDocumentationProvider;
import de.jena.mdo.rest.application.MDOApplication;
import de.jena.mdo.rest.application.resource.DocumentationResource;
import de.jena.mdo.rest.application.resource.ModelResource;
import de.jena.mdo.rest.application.resource.openapi.OpenApiResource;
import de.jena.mdo.swagger.application.SwaggerIndexFilter;
import de.jena.mdo.swagger.application.SwaggerResources;
import de.jena.mdo.swagger.application.SwaggerServletContextHelper;

/**
 * 
 * @author Juergen Albert
 * @since 22 Mar 2022
 */
@Component
@RequireConfigurationAdmin
public class ModelApplicationConfigurator {

	
	private static final Logger logger = Logger.getLogger(ModelApplicationConfigurator.class.getName());
	private ConfigurationAdmin configAdmin;
	private ModelDocumentationProvider modelDocumentationProvider;

	/**
	 * Creates a new instance.
	 */
	@Activate
	public ModelApplicationConfigurator(@Reference ConfigurationAdmin configAdmin, @Reference ModelDocumentationProvider modelDocumentationProvider) {
		this.configAdmin = configAdmin;
		this.modelDocumentationProvider = modelDocumentationProvider;
	}
	
	
	private Map<EPackage, List<Configuration>> configs = new HashMap<>();
	
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(Rest=true)", unbind = "unbindEPackage")
	protected void bindEPackage(EPackage ePackage, Map<String, Object> properties) throws IOException {
		try {
			logger.fine(()->"Binding ePackage " + ePackage.getNsURI());
			List<Configuration> configList = new ArrayList<Configuration>();
			configs.put(ePackage, configList);
	
			
			// Register Application
			
			Configuration applicationConfig = configAdmin.createFactoryConfiguration(MDOApplication.COMPONENT_NAME, "?");
			configList.add(applicationConfig);
			
			Dictionary<String, Object> props = new Hashtable<String, Object>();
			props.put(JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE, ePackage.getName());
			props.put(JaxrsWhiteboardConstants.JAX_RS_NAME, ePackage.getName() + "JaxRsApplication");
			props.put("id", ePackage.getNsURI());
			applicationConfig.update(props);
			logger.fine(()->"Registering JaxRs application " + ePackage.getName() + "JaxRsApplication");
	
			//register Resource
			
			Configuration resourceConfig = configAdmin.createFactoryConfiguration(ModelResource.COMPONENT_NAME, "?");
			configList.add(resourceConfig);
			
			Dictionary<String, Object> modelResourceProperties = new Hashtable<String, Object>();
			modelResourceProperties.put(JaxrsWhiteboardConstants.JAX_RS_NAME, ePackage.getName() + "ModelJaxRsResource");
			modelResourceProperties.put(JaxrsWhiteboardConstants.JAX_RS_APPLICATION_SELECT, "(id=" + ePackage.getNsURI() + ")");
			modelResourceProperties.put(ModelResource.EPACKAGE_REFERENCE_NAME + ".target", "(" + EMFNamespaces.EMF_MODEL_NSURI + "=" + ePackage.getNsURI() + ")");
			modelResourceProperties.put(ModelResource.REPO_REFERENCE_NAME + ".target", "(repo_id=mdo.mdo)");
			if (properties.containsKey("Piveau")) {
				Object piveauData = properties.get("Piveau");
				modelResourceProperties.put("Piveau", piveauData);
			}
			if (properties.containsKey("emf.model.name")) {
				Object modelName = properties.get("emf.model.name");
				modelResourceProperties.put("emf.model.name", modelName);
			}
			resourceConfig.update(modelResourceProperties);
			logger.fine(()->"Registering JaxRs resource " + ePackage.getName() + "JaxRsResource");
	
			// Regsiter Documentation if available
			
			if(modelDocumentationProvider.hasEPackageChanged(ePackage)) {
			
				Configuration decumentationConfig = configAdmin.createFactoryConfiguration(DocumentationResource.COMPONENT_NAME, "?");
				configList.add(decumentationConfig);
				
				Dictionary<String, Object> documentationResourceProperties = new Hashtable<String, Object>();
				documentationResourceProperties.put(JaxrsWhiteboardConstants.JAX_RS_NAME, ePackage.getName() + "DocumentationJaxRsResource");
				documentationResourceProperties.put(JaxrsWhiteboardConstants.JAX_RS_APPLICATION_SELECT, "(id=" + ePackage.getNsURI() + ")");
				documentationResourceProperties.put(DocumentationResource.EPACKAGE_REFERENCE_NAME + ".target", "(" + EMFNamespaces.EMF_MODEL_NSURI + "=" + ePackage.getNsURI() + ")");
				
				if (properties.containsKey("Piveau")) {
					Object piveauData = properties.get("Piveau");
					documentationResourceProperties.put("Piveau", piveauData);
				}
				
				System.out.println("Regenerating documentation...");
				Map<String, String> packageDocFileMap = modelDocumentationProvider.generateAllPackageDocumentation(ePackage);
				Map<String, String> classesDocFileMap = modelDocumentationProvider.generateAllClassesDocumentation(ePackage);
				packageDocFileMap.forEach((k,v) -> documentationResourceProperties.put(k, v));
				classesDocFileMap.forEach((k,v) -> documentationResourceProperties.put(k, v));
				
				if (properties.containsKey("emf.model.name")) {
					Object modelName = properties.get("emf.model.name");
					documentationResourceProperties.put("emf.model.name", modelName);
				}
				decumentationConfig.update(documentationResourceProperties);
				logger.fine(()->"Registering Documentation resource " + ePackage.getName() + "JaxRsResource");
			}
	
			// Configure OpenApi
			
			Configuration openApiConfig = configAdmin.createFactoryConfiguration(OpenApiResource.COMPONENT_NAME, "?");
			configList.add(openApiConfig);
			
			props = new Hashtable<String, Object>();
			props.put("name", ePackage.getName() + " Application");
			props.put(JaxrsWhiteboardConstants.JAX_RS_NAME, ePackage.getName() + "OpenApiResource");
			props.put(JaxrsWhiteboardConstants.JAX_RS_APPLICATION_SELECT, "(id=" + ePackage.getNsURI() + ")");
			openApiConfig.update(props);
			logger.fine(()->"Registering OpenAPI resource " + ePackage.getName() + "OpenApiResource");
	
			/* Swagger Config */
			
			String swaggerAppBasePath = "/swagger/" + ePackage.getName() + "/swagger-client";
			String swaggerContextNameHelper = ePackage.getName() + "_Swagger_Servlet_Contex_Helper_Resources";
	
			Configuration swaggerResourceConfig = configAdmin.createFactoryConfiguration(SwaggerResources.COMPONENT_NAME, "?");
			configList.add(swaggerResourceConfig);
			
			props = new Hashtable<String, Object>();
			props.put("name", ePackage.getName() + " Swagger Resources");
			props.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT, "(" + HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME + "="
					+ swaggerContextNameHelper + ")");
			props.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_RESOURCE_PATTERN, "/*");
			swaggerResourceConfig.update(props);
	
			Configuration swaggerContextConfig = configAdmin.createFactoryConfiguration(SwaggerServletContextHelper.COMPONENT_NAME, "?");
			configList.add(swaggerContextConfig);
			
			
			props = new Hashtable<String, Object>();
			props.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME, swaggerContextNameHelper);
			props.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_PATH, swaggerAppBasePath);
			swaggerContextConfig.update(props);
	
			Configuration swaggerIndexFilterConfig = configAdmin.createFactoryConfiguration(SwaggerIndexFilter.COMPONENT_NAME, "?");
			configList.add(swaggerIndexFilterConfig);
			
			props = new Hashtable<String, Object>();
			props.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_SELECT, "(" + HttpWhiteboardConstants.HTTP_WHITEBOARD_CONTEXT_NAME + "="
					+ swaggerContextNameHelper + ")");
			props.put("path", "/mdo" + swaggerAppBasePath);
			swaggerIndexFilterConfig.update(props);
			logger.fine(()->"Registering OpenAPI Swagger " + ePackage.getName() + " Swagger Resources");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error while creating configurations for model " + ePackage.getName() + " - " + ePackage.getNsURI(), e);
		}
	}

	
	protected void unbindEPackage(EPackage ePackage) {
		logger.fine(()->"Unbinding ePackage " + ePackage.getNsURI());
		List<Configuration> list = configs.remove(ePackage);
		if(list != null) {
			list.forEach(t -> {
				try {
					t.delete();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		}
	}
	
}
