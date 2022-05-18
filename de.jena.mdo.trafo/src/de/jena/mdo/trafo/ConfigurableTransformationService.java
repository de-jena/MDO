package de.jena.mdo.trafo;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.ResourceSetFactory;
import org.gecko.qvt.osgi.api.ModelTransformationConstants;
import org.gecko.qvt.osgi.api.ModelTransformationFactory;
import org.gecko.qvt.osgi.api.ModelTransformator;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Component(name = ConfigurableTransformationService.FACTORY_ID, configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = de.jena.mdo.trafo.ConfigurableTransformationService.Config.class)
public class ConfigurableTransformationService implements ModelTransformator, ModelTransformationConstants {
	
	public static final String FACTORY_ID = "RemoteConfigurableTransformationService";
	
	@Reference
	private  ModelTransformationFactory transformationFactory;

	@Reference
	private  ResourceSetFactory resourceSetFactory;
	
	private ModelTransformator delegate = null;
	
	@ObjectClassDefinition(
			description = "A URL can be configured, where a qvt template is expected."
			)
	public @interface Config {
		@AttributeDefinition(description = "The url of the template")
		String url();

		@AttributeDefinition(description = "A Name for the transformator")
		String name();
	}
	
	
	/**
	 * Called on component activation ot modification
	 * @param context the bundle context
	 * @param properties the component properties 
	 * @throws ConfigurationException
	 */	
	@Activate
	public void activate(Config config) throws ConfigurationException {
		String templateUriString = config.url();
		if (delegate != null) {
			delegate.dispose();
		}
		URI templateUri = URI.createURI(templateUriString);
		synchronized (resourceSetFactory) {
			ResourceSet resourceSet = resourceSetFactory.createResourceSet();
			delegate = transformationFactory.createNewModelTransformator(resourceSet, templateUri);
		}
	}
	
	/**
	 * Called on component de-activation 
	 */
	@Deactivate
	public void deactivate() {
		delegate.dispose();
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.qvt.osgi.api.ModelTransformator#startTransformations(java.util.List)
	 */
	@Override
	public synchronized List<? extends EObject> startTransformations(List<? extends EObject> inObjects) {
		return delegate.startTransformations(inObjects);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.qvt.osgi.api.ModelTransformator#startTransformation(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	public synchronized EObject startTransformation(EObject inObject) {
		return delegate.startTransformation(inObject);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.qvt.osgi.api.ModelTransformator#startTransformation(java.util.List)
	 */
	@Override
	public synchronized EObject startTransformation(List<? extends EObject> inObjects) {
		return delegate.startTransformation(inObjects);
	}

	/* 
	 * (non-Javadoc)
	 * @see org.gecko.qvt.osgi.api.ModelTransformator#dispose()
	 */
	@Override
	public void dispose() {
		delegate.dispose();
	}
}
