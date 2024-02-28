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
 */
package de.jena.mdo.data.loader.command;

import java.io.IOException;

import org.apache.felix.service.command.annotations.GogoCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.repository.EMFRepository;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.jakartars.runtime.JakartarsServiceRuntime;
import org.osgi.service.jakartars.runtime.dto.ApplicationDTO;

/**
 * @author Juergen Albert
 * @since 31 May 2022
 */
@Component(service = MDOCommand.class, scope = ServiceScope.PROTOTYPE)
@GogoCommand(scope = "mdo", function = { "print", "load", "status" })
public class MDOCommand {

	@Reference
	EMFRepository repo;

	@Reference
	JakartarsServiceRuntime serviceRuntime;

	public void status() {
		System.out.println("Registered Rest Applications");
		for (ApplicationDTO applicationDTO : serviceRuntime.getRuntimeDTO().applicationDTOs) {
			System.out.println(applicationDTO.name + " - " + applicationDTO.base);
		}
	}

	public void print(String fileName) {
		ResourceSet set = repo.getResourceSet();
		try {
			Resource resource = set.createResource(URI.createURI(fileName));
			resource.load(null);
			System.out.println("Loaded: " + resource.getContents().remove(0));
			set.getResources().remove(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void load(String fileName) {
		ResourceSet set = repo.getResourceSet();
		try {
			Resource resource = set.createResource(URI.createURI(fileName));
			resource.load(null);
			EObject eObject = resource.getContents().remove(0);
			System.out.println("Loaded: " + eObject);
			repo.save(eObject);
			set.getResources().remove(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}
	}
}
