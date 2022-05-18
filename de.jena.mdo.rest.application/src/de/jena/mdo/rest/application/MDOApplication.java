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
package de.jena.mdo.rest.application;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.jaxrs.annotations.RequireEMFMessageBodyReaderWriter;

/**
 * 
 * @author Juergen Albert
 * @since 22 Mar 2022
 */
@Component(name = MDOApplication.COMPONENT_NAME, service = Application.class, property = "emf=true", configurationPolicy = ConfigurationPolicy.REQUIRE)
@RequireEMFJson
@RequireEMFMessageBodyReaderWriter
public class MDOApplication extends Application {

	public static final String COMPONENT_NAME = "MDOApplication";
	
}
