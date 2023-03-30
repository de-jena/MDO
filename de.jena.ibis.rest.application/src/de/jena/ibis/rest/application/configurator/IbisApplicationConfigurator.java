/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.ibis.rest.application.configurator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.cm.annotations.RequireConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.osgi.service.jakartars.whiteboard.JakartarsWhiteboardConstants;

import de.jena.ibis.apis.GeneralIbisTCPService;
import de.jena.ibis.rest.application.IbisApplication;
import de.jena.ibis.rest.application.resource.IbisResource;


/**
 * This component is responsible for activating a rest resource for every GeneralIbisService that comes up, in such a way we can listen to what it is sent after the subscriptions 
 * 
 * @author ilenia
 * @since Mar 29, 2023
 */
@Component
@RequireConfigurationAdmin
public class IbisApplicationConfigurator {
	
	private static final Logger LOGGER = Logger.getLogger(IbisApplicationConfigurator.class.getName());
	private ConfigurationAdmin configAdmin;
	private Map<GeneralIbisTCPService, List<Configuration>> configs = new HashMap<>();
	
	@Activate
	public IbisApplicationConfigurator(@Reference ConfigurationAdmin configAdmin) {
		this.configAdmin = configAdmin;
	}
	
	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC, policyOption = ReferencePolicyOption.GREEDY, unbind = "unbindIbisTCPService")
	protected void bindIbisTCPService(GeneralIbisTCPService ibisService, Map<String, Object> properties) throws IOException {
		LOGGER.fine(()->"Binding IbisService " + ibisService.getServiceId());
		configs.put(ibisService, new ArrayList<Configuration>());
		
		Configuration applicationConfig = configAdmin.createFactoryConfiguration(IbisApplication.COMPONENT_NAME, "?");
		configs.get(ibisService).add(applicationConfig);
		
		Dictionary<String, Object> props = new Hashtable<String, Object>();
		props.put(JakartarsWhiteboardConstants.JAKARTA_RS_APPLICATION_BASE, ibisService.getServiceId());
		props.put(JakartarsWhiteboardConstants.JAKARTA_RS_NAME, ibisService.getServiceId() + "JaxRsApplication");
		props.put("id",  ibisService.getServiceId());
		applicationConfig.update(props);
		LOGGER.fine(()->"Registering JaxRs application " +  ibisService.getServiceId() + " JaxRsApplication");
		
		Configuration resourceConfig = configAdmin.createFactoryConfiguration(IbisResource.COMPONENT_NAME, "?");
		configs.get(ibisService).add(resourceConfig);
		
		props = new Hashtable<String, Object>();
		props.put(JakartarsWhiteboardConstants.JAKARTA_RS_NAME, ibisService.getServiceId() + "JaxRsResource");
		props.put(JakartarsWhiteboardConstants.JAKARTA_RS_APPLICATION_SELECT, "(id=" + ibisService.getServiceId() + ")");
		props.put(IbisResource.IBIS_SERVICE_REFERENCE_NAME + ".target", "(serviceId=" + ibisService.getServiceId() + ")");
		resourceConfig.update(props);
		LOGGER.fine(()->"Registering JaxRs resource " + ibisService.getServiceId() + " JaxRsResource");
	}
	
	protected void unbindIbisTCPService(GeneralIbisTCPService ibisService) {
		LOGGER.fine(()->"Unbinding IbisService " + ibisService.getServiceId());
		List<Configuration> configList = configs.remove(ibisService);
		if(configList != null) {
			configList.forEach(c -> {
				try {
					c.delete();
				} catch(IOException e) {
					LOGGER.severe(() -> String.format("Error while deleting Config %s for IbisService %s", c.getPid(), ibisService.getServiceId()));
					e.printStackTrace();
				}
			});			
		}
	}

}
