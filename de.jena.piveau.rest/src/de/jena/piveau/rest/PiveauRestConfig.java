package de.jena.piveau.rest;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(
		description = "A configuration for the Piveau REST API Connector."
		)
@interface PiveauRestConfig {
		static final String PREFIX_ = "piveau.rest.";
		@AttributeDefinition(description = "Piveau base url")
		String baseUri();
		@AttributeDefinition(description = "Piveau REST catalogue segment name")
		String cataloguesSegment() default "catalogues";
		@AttributeDefinition(description = "Piveau REST dataset segment name")
		String datasetSegment() default "datasets";
		@AttributeDefinition(description = "Piveau REST distribution segment name")
		String distributionSegment() default "distributions";
		@AttributeDefinition(description = "Piveau REST distribution segment name")
		String originSegment() default "origin";
		@AttributeDefinition(description = "Piveau REST default API key")
		String apiKey() default "yourRepoApiKey";
	}