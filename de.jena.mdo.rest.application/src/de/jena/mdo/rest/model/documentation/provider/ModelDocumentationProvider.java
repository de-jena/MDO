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
package de.jena.mdo.rest.model.documentation.provider;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.gecko.emf.util.documentation.generators.apis.EcoreToDocumentationOptions;
import org.gecko.emf.util.documentation.generators.apis.EcoreToDocumentationService;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;

/**
 * 
 * @author ilenia
 * @since Oct 20, 2022
 */
@Component(name = "ModelDocumentationProvider", service = ModelDocumentationProvider.class, configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = ModelDocumentationProviderConfig.class)
public class ModelDocumentationProvider {
	
	@Reference(target = "(component.name=EcoreToHtmlComponent)")
	EcoreToDocumentationService ecoreToHtmlComponent;
	
	@Reference(target = "(component.name=EcoreToMarkdownComponent)")
	EcoreToDocumentationService ecoreToMdComponent;
	
	ModelDocumentationProviderConfig config;
	
	@Activate
	private void activate(ModelDocumentationProviderConfig config) throws ConfigurationException {
		this.config = config;
	}
	
	public boolean hasEPackageChanged(EPackage ePackage) {
		Path hashCodeFilePath = Paths.get(config.output_root_folder(), config.output_package_hash_code_folder(), ePackage.getName().concat(".txt"));
		if(!Files.exists(hashCodeFilePath)) {
			return true;
		}
		try (BufferedReader br = new BufferedReader(new FileReader(hashCodeFilePath.toFile()));) {
			String oldHashCode = br.readLine();
			if(!oldHashCode.equals(String.valueOf(ePackage.hashCode()))) {
				return true; 
			}
		} catch(IOException e) {
			e.printStackTrace();
			return true;
		}
		return false;
	}
	
	public Map<String, String> generateAllPackageDocumentation(EPackage ePackage) {
		System.out.println("Generating Package Docs for " + ePackage.getName());
		generateAllMarkdownDocumentation(ePackage);
		generateAllHtmlDocumentation(ePackage);
		updateHashCodeFile(ePackage);
		Map<String, String> documentationFileMap = createDocumentationFileMap(ePackage);
		return documentationFileMap;
	}
	

	public Map<String, String> generateAllClassesDocumentation(EPackage ePackage) {
		Map<String, String> classDocFileMap = new HashMap<>();
		List<EClass> eClasses = ePackage.getEClassifiers().stream()
				.filter(c -> c instanceof EClass).map(c -> (EClass) c).collect(Collectors.toList());
		eClasses.stream().forEach(c -> {
			generateAllMarkdownDocumentation(c);
			generateAllHtmlDocumentation(c);
			classDocFileMap.putAll(createDocumentationFileMap(c));
		});
		return classDocFileMap;
	}
	
	public void generateAllMarkdownDocumentation(EPackage ePackage) {
		try {
			ecoreToMdComponent.doGenerateDocumentation(ePackage, EcoreToDocumentationOptions.ONLY_MARKDOWN_CLASS_OVERVIEW, config.output_root_folder());
			ecoreToMdComponent.doGenerateDocumentation(ePackage, EcoreToDocumentationOptions.MARKDOWN_WITH_MERMAID_CLASS_DIAGRAM, config.output_root_folder());
			ecoreToMdComponent.doGenerateDocumentation(ePackage, EcoreToDocumentationOptions.MARKDOWN_WITH_PLANTUML_CLASS_DIAGRAM, config.output_root_folder());
		} catch(IOException e) {
			e.printStackTrace();
		}		
	}
	
	public void generateAllMarkdownDocumentation(EClass eClass) {
		try {
			ecoreToMdComponent.doGenerateDocumentation(eClass, EcoreToDocumentationOptions.ONLY_MARKDOWN_CLASS_OVERVIEW, config.output_root_folder());
			ecoreToMdComponent.doGenerateDocumentation(eClass, EcoreToDocumentationOptions.MARKDOWN_WITH_MERMAID_CLASS_DIAGRAM, config.output_root_folder());
			ecoreToMdComponent.doGenerateDocumentation(eClass, EcoreToDocumentationOptions.MARKDOWN_WITH_PLANTUML_CLASS_DIAGRAM, config.output_root_folder());
		} catch(IOException e) {
			e.printStackTrace();
		}		
	}
	
	public OutputStream generateMarkdownDocumentation(EPackage ePackage, EcoreToDocumentationOptions option) {
		try {
			OutputStream os = ecoreToMdComponent.doGenerateDocumentation(ePackage, option, config.output_root_folder());
			return os;
		} catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public OutputStream generateMarkdownDocumentation(EClass eClass, EcoreToDocumentationOptions option) {
		try {
			OutputStream os = ecoreToMdComponent.doGenerateDocumentation(eClass, option, config.output_root_folder());
			return os;
		} catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void generateAllHtmlDocumentation(EPackage ePackage) {
		try {
			ecoreToHtmlComponent.doGenerateDocumentation(ePackage, EcoreToDocumentationOptions.ONLY_HTML_CLASS_OVERVIEW, config.output_root_folder());
			ecoreToHtmlComponent.doGenerateDocumentation(ePackage, EcoreToDocumentationOptions.HTML_WITH_MERMAID_CLASS_DIAGRAM, config.output_root_folder());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void generateAllHtmlDocumentation(EClass eClass) {
		try {
			ecoreToHtmlComponent.doGenerateDocumentation(eClass, EcoreToDocumentationOptions.ONLY_HTML_CLASS_OVERVIEW, config.output_root_folder());
			ecoreToHtmlComponent.doGenerateDocumentation(eClass, EcoreToDocumentationOptions.HTML_WITH_MERMAID_CLASS_DIAGRAM, config.output_root_folder());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public OutputStream generateHtmlDocumentation(EPackage ePackage, EcoreToDocumentationOptions option) {
		try {
			OutputStream os = ecoreToHtmlComponent.doGenerateDocumentation(ePackage, option, config.output_root_folder());
			return os;
		} catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public OutputStream generateHtmlDocumentation(EClass eClass, EcoreToDocumentationOptions option) {
		try {
			OutputStream os = ecoreToHtmlComponent.doGenerateDocumentation(eClass, option, config.output_root_folder());
			return os;
		} catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public OutputStream retrieveDocumentationFile(String docFilePath) {
		File docFile = new File(docFilePath);
		try {
			if(docFile.exists()) {
				try(InputStream is = new FileInputStream(docFile); OutputStream os = new ByteArrayOutputStream();) {
					os.write(is.readAllBytes());			
					return os;
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		return null;		
	}
	
	private void updateHashCodeFile(EPackage ePackage) {
		Path hashCodeFilePath = Paths.get(config.output_root_folder(), config.output_package_hash_code_folder(), ePackage.getName().concat(".txt"));
		File hashCodeFile = hashCodeFilePath.toFile();
		try {
			if(!hashCodeFile.exists()) {
				Files.createDirectories(hashCodeFilePath.getParent());
				Files.createFile(hashCodeFilePath);
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(hashCodeFile))) {
				System.out.println("Hash code " + ePackage.hashCode());
				bw.write(String.valueOf(ePackage.hashCode()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	private Map<String, String> createDocumentationFileMap(EPackage ePackage) {
		Map<String, String> documentationFileMap = new HashMap<>();
		documentationFileMap.put("md.file", 
				Paths.get(config.output_root_folder(), config.output_md_folder(), ePackage.getName().concat(".html")).toString());
		
		documentationFileMap.put("md.mermaid.file", 
				Paths.get(config.output_root_folder(), config.output_md_mermaid_folder(), ePackage.getName().concat(".html")).toString());
		
		documentationFileMap.put("md.plantuml.file", 
				Paths.get(config.output_root_folder(), config.output_md_plantuml_folder(), ePackage.getName().concat(".html")).toString());
		
		documentationFileMap.put("html.file", 
				Paths.get(config.output_root_folder(), config.output_html_folder(), ePackage.getName().concat(".html")).toString());
		
		documentationFileMap.put("html.mermaid.file", 
				Paths.get(config.output_root_folder(), config.output_html_mermaid_folder(), ePackage.getName().concat(".html")).toString());
		
		documentationFileMap.put("package.hash.code.file", 
				Paths.get(config.output_root_folder(), config.output_package_hash_code_folder(), ePackage.getName().concat(".txt")).toString());
		return documentationFileMap;
	}
	
	private Map<String, String> createDocumentationFileMap(EClass eClass) {
		Map<String, String> documentationFileMap = new HashMap<>();
		documentationFileMap.put("md.file".concat(".").concat(eClass.getName()), 
				Paths.get(config.output_root_folder(), config.output_md_folder(), 
						eClass.getEPackage().getName().concat("_").concat(eClass.getName()).concat(".md")).toString());
		
		documentationFileMap.put("md.mermaid.file".concat(".").concat(eClass.getName()), 
				Paths.get(config.output_root_folder(), config.output_md_mermaid_folder(), 
						eClass.getEPackage().getName().concat("_").concat(eClass.getName()).concat(".md")).toString());
		
		documentationFileMap.put("md.plantuml.file".concat(".").concat(eClass.getName()), 
				Paths.get(config.output_root_folder(), config.output_md_plantuml_folder(), 
						eClass.getEPackage().getName().concat("_").concat(eClass.getName()).concat(".md")).toString());
		
		documentationFileMap.put("html.file".concat(".").concat(eClass.getName()), 
				Paths.get(config.output_root_folder(), config.output_html_folder(), 
						eClass.getEPackage().getName().concat("_").concat(eClass.getName()).concat("html")).toString());
		
		documentationFileMap.put("html.mermaid.file".concat(".").concat(eClass.getName()), 
				Paths.get(config.output_root_folder(), config.output_html_mermaid_folder(), 
						eClass.getEPackage().getName().concat("_").concat(eClass.getName()).concat("html")).toString());
		return documentationFileMap;
	}
}
