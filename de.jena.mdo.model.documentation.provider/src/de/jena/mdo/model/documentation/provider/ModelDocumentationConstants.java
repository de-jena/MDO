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

/**
 * 
 * @author ilenia
 * @since Dec 16, 2022
 */
public interface ModelDocumentationConstants {
	
	String PROPERTY_HTML_FILE = "html.file";
	String PROPERTY_HTML_MERMAID_FILE = "html.mermaid.file";
	String PROPERTY_HTML_PLANTUML_FILE = "html.plantuml.file";
	String HTML_FILE_EXTENSION = ".html";
	
	String PROPERTY_MD_FILE = "md.file";
	String PROPERTY_MD_MERMAID_FILE = "md.mermaid.file";
	String PROPERTY_MD_PLANTUML_FILE = "md.plantuml.file";
	String MD_FILE_EXTENSION = ".md";
	
	String PROPERTY_HASH_CODE_FILE = "package.hash.code.file";
	String TXT_FILE_EXTENSION = ".txt";
}
