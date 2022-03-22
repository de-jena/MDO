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
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.cm.annotations.RequireConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

import de.jena.mdo.rest.application.MDOApplication;
import de.jena.mdo.rest.application.resource.ModelResource;

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
	
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, target = "(rest=true)")
	private void bindEPackage(EPackage ePackage) throws IOException {
		
		System.out.println("binding ePackage " + ePackage.getNsURI());
		List<Configuration> configList = new ArrayList<Configuration>();
		configs.put(ePackage, configList);
		
		Configuration applicationConfig = configAdmin.createFactoryConfiguration(MDOApplication.COMPONENT_NAME, "?");
		configList.add(applicationConfig);
		
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE, ePackage.getName());
		props.put(JaxrsWhiteboardConstants.JAX_RS_NAME, ePackage.getName() + "JaxRsApplication");
		props.put("id", ePackage.getNsURI());
		applicationConfig.update(props);

		Configuration resourceConfig = configAdmin.createFactoryConfiguration(ModelResource.COMPONENT_NAME, "?");
		configList.add(resourceConfig);
		
		props = new Hashtable<String, String>();
		props.put(JaxrsWhiteboardConstants.JAX_RS_NAME, ePackage.getName() + "JaxRsResource");
		props.put(JaxrsWhiteboardConstants.JAX_RS_APPLICATION_SELECT, "(id=" + ePackage.getNsURI() + ")");
		resourceConfig.update(props);
	}

	private void unbindEPackage(EPackage ePackage) {
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
