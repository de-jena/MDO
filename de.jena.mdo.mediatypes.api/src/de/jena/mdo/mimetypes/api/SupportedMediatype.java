package de.jena.mdo.mimetypes.api;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * Keeps track of available MediaTypes for the Rest API
 * </p>
 * 
 * @since 1.0
 */
@ProviderType
public interface SupportedMediatype {

	/**
	 * @return a List of the supported MediaTypes
	 */
	List<String> getSupportedMediaTypes();

}
