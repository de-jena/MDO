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
package de.jena.piveau.api.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * 
 * @author mark
 * @since 12.12.2022
 */
@ObjectClassDefinition(
		description = "A base configuration for a DCAT-AP distribution."
		)
public @interface DistributionConfig {
	static final String PREFIX_ = "distribution.";
	String id();
	String title();
	String description() default "";
	String access_url();
	String mediaType();
	String model_name() default "";
	String model_ns() default "";
	String model_description() default "";
	@AttributeDefinition(description = "Host name of the sensinact system (frontend view)")
	String distributionHost() default "https://localhost";
	@AttributeDefinition(description = "Catalogue id the distribution belongs to")
	String catalogueId() default "";
}
