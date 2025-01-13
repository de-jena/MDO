/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.eclipse.fennec.persistence.rest;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.jpa.JpaHelper;
import org.eclipse.persistence.sessions.server.Server;
import org.gecko.emf.osgi.constants.EMFNamespaces;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.whiteboard.annotations.RequireJakartarsWhiteboard;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsResource;
import org.osgi.service.servlet.whiteboard.annotations.RequireHttpWhiteboard;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * This is a Demo Resource for a Jakartars Whiteboard 
 * 
 * @since 1.0
 */
@RequireHttpWhiteboard
@RequireJakartarsWhiteboard
@JakartarsResource
@JakartarsName("CitizenResource")
@Component(service = DemoResource.class, enabled = true, scope = ServiceScope.PROTOTYPE)
@Path("/backup")
public class DemoResource {
	
	// JPA EntityManagerFacotry for persistence unit citizen
	@Reference(target = "(osgi.unit.name=citizen)")
	private EntityManagerFactory emf;
	// ResourceSet that has EMF model citizen
	@Reference(target = "(" + EMFNamespaces.EMF_MODEL_NAME + "=citizen)")
	private ResourceSet rs;
	@Reference(target = "(" + EMFNamespaces.EMF_MODEL_NAME + "=citizen)")
	private EPackage citizenPackage;

	/**
	 * Please check http://localhost:8082/jparest/hello-http-whiteboard
	 * @return
	 */
	@GET
	@Path("/hello-http-whiteboard")
	public String hello() {
		return "Hello World (via HTTP Whiteboard)!";
	}
	
	/**
	 * Please check http://localhost:8082/jparest/hello-http-whiteboard
	 * @return
	 */
	@GET
	@Path("/citizens")
	@Produces(MediaType.APPLICATION_JSON)
	public Response citizens(@QueryParam("limit") Integer limit, @QueryParam("index") Integer index) {
		if (isNull(limit) || limit < 1) {
			limit = 100;
		}
		if (nonNull(index) && index < 0) {
			index = 0;
		}
		Server server = JpaHelper.getServerSession(emf);
		EClass citizenEClass = (EClass) citizenPackage.getEClassifier("einwohner");
		requireNonNull(citizenEClass);
		ClassDescriptor citizenDescriptor = server.getDescriptorForAlias(citizenEClass.getName());
		requireNonNull(citizenDescriptor);
		
		Resource citizenResource = rs.createResource(URI.createURI("citizen"));
		requireNonNull(citizenResource);
		try (EntityManager em = emf.createEntityManager()) {
			Class<?> einwohnerClass = citizenDescriptor.getJavaClass();
			TypedQuery<?> query = em.createQuery("SELECT e FROM einwohner e", einwohnerClass);
			query.setMaxResults(limit);
			List<?> citizens = query.getResultList();
			if (isNull(citizens) || citizens.isEmpty()) {
				return Response.noContent().build();
			}
			if (nonNull(index)) {
				query.setFirstResult(index);
			}
			citizens.stream().filter(EObject.class::isInstance).map(EObject.class::cast).forEach(citizenResource.getContents()::add);
			return Response.ok(citizenResource).build();
		} catch (Exception e) {
			return Response.serverError().entity("Failed search for citizens").build();
		}
	}
	
	

}
