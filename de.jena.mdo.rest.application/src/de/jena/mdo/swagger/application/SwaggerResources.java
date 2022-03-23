/*
* Copyright (c) 2020 Kentyou.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
*    Kentyou - initial API and implementation
 */
package de.jena.mdo.swagger.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardResource;

@HttpWhiteboardResource(pattern =  "to_be_defined_by_configuration", prefix = "/swagger-api")
@Component(name = SwaggerResources.COMPONENT_NAME, service = SwaggerResources.class, configurationPolicy = ConfigurationPolicy.REQUIRE)
public class SwaggerResources {
	
	public static final String COMPONENT_NAME = "SwaggerResources";
}

