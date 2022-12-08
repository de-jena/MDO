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

import de.jena.mdo.rest.application.MDOApplication;
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

	

	private ConfigurationAdmin configAdmin;

	/**
	 * Creates a new instance.
	 */
	@Activate
	public ModelApplicationConfigurator(@Reference ConfigurationAdmin configAdmin) {
		this.configAdmin = configAdmin;
	}
	
	
	private Map<EPackage, List<Configuration>> configs = new HashMap<>();
	
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(Rest=true)", unbind = "unbindEPackage")
	protected void bindEPackage(EPackage ePackage, Map<String, Object> properties) throws IOException {
		
		System.out.println("binding ePackage " + ePackage.getNsURI());
		List<Configuration> configList = new ArrayList<Configuration>();
		configs.put(ePackage, configList);
		
		Configuration applicationConfig = configAdmin.createFactoryConfiguration(MDOApplication.COMPONENT_NAME, "?");
		configList.add(applicationConfig);
		
		Dictionary<String, Object> props = new Hashtable<String, Object>();
		props.put(JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE, ePackage.getName());
		props.put(JaxrsWhiteboardConstants.JAX_RS_NAME, ePackage.getName() + "JaxRsApplication");
		props.put("id", ePackage.getNsURI());
		applicationConfig.update(props);

		Configuration resourceConfig = configAdmin.createFactoryConfiguration(ModelResource.COMPONENT_NAME, "?");
		configList.add(resourceConfig);
		
		props = new Hashtable<String, Object>();
		props.put(JaxrsWhiteboardConstants.JAX_RS_NAME, ePackage.getName() + "JaxRsResource");
		props.put(JaxrsWhiteboardConstants.JAX_RS_APPLICATION_SELECT, "(id=" + ePackage.getNsURI() + ")");
		props.put(ModelResource.EPACKAGE_REFERENCE_NAME + ".target", "(" + EMFNamespaces.EMF_MODEL_NSURI + "=" + ePackage.getNsURI() + ")");
		props.put(ModelResource.REPO_REFERENCE_NAME + ".target", "(repo_id=mdo.mdo)");
		if (properties.containsKey("Piveau")) {
			Object piveauData = properties.get("Piveau");
			props.put("Piveau", piveauData);
		}
		resourceConfig.update(props);

		Configuration openApiConfig = configAdmin.createFactoryConfiguration(OpenApiResource.COMPONENT_NAME, "?");
		configList.add(openApiConfig);
		
		props = new Hashtable<String, Object>();
		props.put("name", ePackage.getName() + " Application");
		props.put(JaxrsWhiteboardConstants.JAX_RS_NAME, ePackage.getName() + "OpenApiResource");
		props.put(JaxrsWhiteboardConstants.JAX_RS_APPLICATION_SELECT, "(id=" + ePackage.getNsURI() + ")");
		openApiConfig.update(props);

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
	}

	
	protected void unbindEPackage(EPackage ePackage) {
		System.out.println("unbinding ePackage " + ePackage.getNsURI());
		List<Configuration> list = configs.remove(ePackage);
		if(list != null) {
			list.forEach(t -> {
				try {
					t.delete();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
	}
	
}
