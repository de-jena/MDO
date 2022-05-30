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
package de.jena.mdo.data.importer;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition
public @interface DataImporterConfig {
	
	@AttributeDefinition(description = "The EClass to query for")
	String eClass();
	
	@AttributeDefinition(description = "The binding target for the source EPackage")
	String sourcePackage_target();
	
	@AttributeDefinition(description = "The binding target for the source Repository")
	String sourceRepo_target();
	
	@AttributeDefinition(description = "The binding target for the target Repository")
	String targetRepo_target();
	
}