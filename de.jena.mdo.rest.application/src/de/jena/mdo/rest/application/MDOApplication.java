/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.rest.application;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import de.jena.mdo.runtime.annotation.RequireRuntime;
import jakarta.ws.rs.core.Application;

/**
 *
 * @author Juergen Albert
 * @since 22 Mar 2022
 */
@Component(name = MDOApplication.COMPONENT_NAME, service = Application.class, property = "emf=true", configurationPolicy = ConfigurationPolicy.REQUIRE)
@RequireRuntime
public class MDOApplication extends Application {

	public static final String COMPONENT_NAME = "MDOApplication";

}
