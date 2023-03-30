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
package de.jena.ibis.rest.application.resource;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;

import de.jena.ibis.apis.GeneralIbisTCPService;
import de.jena.ibis.runtime.annotation.RequireRuntime;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * 
 * @author ilenia
 * @since Mar 29, 2023
 */
@RequireRuntime
@JakartarsResource
@Component(name = IbisResource.COMPONENT_NAME, service = IbisResource.class, scope = ServiceScope.PROTOTYPE, configurationPolicy = ConfigurationPolicy.REQUIRE)
@Path("")
public class IbisResource {
	
	public static final String COMPONENT_NAME = "IbisJakartarsResource";
	public static final String IBIS_SERVICE_REFERENCE_NAME = "ibisService.ref";

	@Reference(name = IbisResource.IBIS_SERVICE_REFERENCE_NAME)
	private GeneralIbisTCPService ibisService;
	
	@GET
	@Path("/hello")
	public String hello() {
		return "Configured for " + ibisService.getServiceId();
	}
	
	@POST
	@Path("/{operationName}")
	@Consumes({MediaType.APPLICATION_XML, "application/xmi"})
	public Response post(@PathParam("operationName") String operationName) {
		System.out.println(String.format("Received request to %s - %s", ibisService.getServiceId(), operationName));
		return Response.ok().build();
	}
	
	
}
