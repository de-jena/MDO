package de.jena.mdo.jsotoecore.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gecko.emf.json.configuration.ConfigurableJsonResourceFactory;
import org.gecko.emf.json.constants.EMFJs;
import org.junit.jupiter.api.Test;

public class JsonToEcoreTest {

	@Test
	public void test(){
		
		URL entry = getClass().getResource("/commit.json");
		
		try {
			
			ResourceSet rs = new ResourceSetImpl();
			
			Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put("http", new XMIResourceFactoryImpl());
			Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put("https", new XMIResourceFactoryImpl());
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new ConfigurableJsonResourceFactory());
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
			
			Resource source = rs.createResource(URI.createURI("input.ecore"));
			source.load(null);
			
			EPackage ePackage = (EPackage) source.getContents().get(0); 
			
			JsonToEcoreHelper.updateEPackageFromStream(entry.openStream(), (EClass) ePackage.getEClassifier("Payload"), rs);
			
			Resource resource = rs.createResource(URI.createURI("github.ecore"));
			
			resource.getContents().add(EcoreUtil.copy(ePackage));
			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(ePackage);
			if (diagnostic.getSeverity() != Diagnostic.OK) {
				printDiagnostic(diagnostic, "");
			}
			resource.save(System.err, null);
			resource.save(null);
			assertTrue(diagnostic.getSeverity() == Diagnostic.OK);
			
			
			
			Resource jsonResource = rs.createResource(URI.createURI(entry.toString()));
			Map<String, Object> options = new HashMap<String, Object>();
			options.put(EMFJs.OPTION_ROOT_ELEMENT, ePackage.getEClassifiers().get(0));
			options.put(EMFJs.OPTION_SERIALIZE_TYPE, false);
			
			jsonResource.load(options);
			
			assertEquals(1, jsonResource.getContents().size());
			
		} catch (IOException e) {
			assertNull(e, "Entry not found: " + e.getMessage());
		}
		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Prints diagnostics with indentation.
	 * <!-- end-user-doc -->
	 * @param diagnostic the diagnostic to print.
	 * @param indent the indentation for printing.
	 * @generated
	 */
	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		System.out.print(indent);
		System.out.println(diagnostic.getMessage());
		for (Diagnostic child : diagnostic.getChildren()) {
			printDiagnostic(child, indent + "  ");
		}
	}
	
	
}
