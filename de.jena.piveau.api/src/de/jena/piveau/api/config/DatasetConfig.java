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
@ObjectClassDefinition(description = "A base configuration for a DCAT-AP dataset.")
public @interface DatasetConfig {
	static final String PREFIX_ = "dataset.";

	@AttributeDefinition(description = "Catalogue id the dataset belongs to")
	String catalogueId() default "";

	@AttributeDefinition(description = "Dataset id")
	String id();

	@AttributeDefinition(description = "Default local base URI for the access URL's")
	String localBaseUri() default "http://0.0.0.0:8085/mdo";

	@AttributeDefinition(description = "German title")
	String title_de();

	@AttributeDefinition(description = "English title")
	String title_en() default "";

	@AttributeDefinition(description = "German description")
	String description_de();

	@AttributeDefinition(description = "English description")
	String description_en() default "";

	@AttributeDefinition(description = "Issued date ('NOW' for now)")
	String issued();

	@AttributeDefinition(description = "Publisher of the dataset")
	String publisher() default "https://smartcity.jena.de";

	@AttributeDefinition(description = "Publishers Mailaddress")
	String publisher_mail() default "mailto:smartcity@jena.de";

	@AttributeDefinition(description = "Topics of the dataset")
	String[] themes() default "http://publications.europa.eu/resource/authority/data-theme/ENVI";

	@AttributeDefinition(description = "Tags or keywords of the dataset")
	String[] keywords() default { "Jena", "Modell", "Bäume", "Trees", "Baum", "Tree", "Pflanze", "Plant" };

	@AttributeDefinition(description = "Host name of the mdo system (frontend view)")
	String distributionHost() default "https://localhost";
}
