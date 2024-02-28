package de.jena.mdo.mediatypes.impl;

import java.util.List;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.ResourceSetFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferencePolicyOption;
import org.osgi.service.component.annotations.ServiceScope;

import de.jena.mdo.mimetypes.api.SupportedMediatype;

@Component(immediate = true, scope = ServiceScope.SINGLETON)
public class SupportedMediatypesImpl implements SupportedMediatype{

	private List<String> mediaTypes;
	
	@Reference(updated = "bindResourceSetFactory", policyOption = ReferencePolicyOption.GREEDY)
	void bindResourceSetFactory(ResourceSetFactory rsFactory) {
		ResourceSet set =  rsFactory.createResourceSet();
		
		mediaTypes = set
			.getResourceFactoryRegistry()
			.getContentTypeToFactoryMap()
			.keySet()
			.stream()
			.filter(s -> s.startsWith("application/") || s.startsWith("text/"))
			.toList();
	}
	
	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.mimetypes.api.SupportedMediatype#getSupportedMediaTypes()
	 */
	@Override
	public List<String> getSupportedMediaTypes() {
		return mediaTypes;
	}


}
