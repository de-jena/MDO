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
 *     Stefan Bishof - API and implementation
 *     Tim Ward - implementation
 */
package de.jena.mdo.github.webhook.rest;

import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.rest.annotations.RequireEMFMessageBodyReaderWriter;
import org.gecko.emf.rest.annotations.json.RootElement;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.annotations.RequireJakartarsWhiteboard;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;
import org.osgi.service.typedevent.TypedEventBus;

import de.jena.mdo.github.webhook.model.githubWebhook.GithubPackage;
import de.jena.mdo.github.webhook.model.githubWebhook.Payload;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * 
 * This is a Demo Resource for a Jakartars Whiteboard 
 * You should see an log output like this, that mentions port and uri: 
 * Started Jakartars whiteboard server for port: <port> and context: /rest/
 * 
 * So the application can be reached under:
 * http://localhost:<port>/rest/hello-no-config
 * 
 * @since 1.0
 */
@RequireJakartarsWhiteboard
@RequireEMFJson
@RequireEMFMessageBodyReaderWriter
@JakartarsResource
@JakartarsName("GithubWebhook")
@Component(service = GithubWebhookResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
@Path("/github")
public class GithubWebhookResource {

	@Reference
	TypedEventBus eventBus;
	
	@GET
	@Path("/hello")
	public String hello() {
		return "Hello World";
	}
	
//	@POST
//	@PUT
//	@Path("/webhook")
//	@Consumes(MediaType.WILDCARD)
//	public Response webhook(String body) {
//		System.err.println(body);
//		return Response.ok().build();
//	}

	@GET
	@Path("/webhook")
	@Consumes(MediaType.WILDCARD)
	public Response webhookGet() {
		return Response.ok("Hello").build();
	}

	
	@POST
	@Path("/webhook")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response webhook(@RootElement(rootClassUri = GithubPackage.eNS_URI + "#//Payload") Payload payload) {
		System.out.println(payload);
		//git://github.com/juergen-albert/test.git
		String topic = payload.getRepository().getGit_url().substring("git://".length()).replace('.', '/');
		topic += "/" + payload.getRef();
		eventBus.deliver(topic, payload);
		
		return Response.ok().build();
	}

}
