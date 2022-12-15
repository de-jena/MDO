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
package de.jena.mdo.model.documentation.provider;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition
public @interface ModelDocumentationProviderConfig {
	
	@AttributeDefinition(description = "The root folder where the documentation folders are going to be placed")
	String output_root_folder();
	
	@AttributeDefinition(description = "The output folder for md class overview documents")
	String output_md_folder();
	
	@AttributeDefinition(description = "The output folder for md documents with mermaid class diagrams")
	String output_md_mermaid_folder();
	
	@AttributeDefinition(description = "The output folder for md documents with plantuml class diagrams")
	String output_md_plantuml_folder();
	
	@AttributeDefinition(description = "The output folder for html class overview documents")
	String output_html_folder();
	
	@AttributeDefinition(description = "The output folder for html documents with mermaid class diagrams")
	String output_html_mermaid_folder();	
	
	@AttributeDefinition(description = "The output folder to store the hash codes of epackages")
	String output_package_hash_code_folder();	
}