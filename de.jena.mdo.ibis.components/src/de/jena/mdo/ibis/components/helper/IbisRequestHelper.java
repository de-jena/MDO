/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.ibis.components.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.EMFUriHandlerConstants;
import org.osgi.service.component.ComponentServiceObjects;
import org.eclipse.emfcloud.jackson.databind.EMFContext;

/**
 * 
 * @author ilenia
 * @since Jan 18, 2023
 */
public class IbisRequestHelper {
	
	public static URI calculateURI(String ipAddress, String port, String serviceName, String operationName) {
		return URI.createURI(calculateURIString(ipAddress, port, serviceName, operationName));
	}
	
	public static String calculateURIString(String ipAddress, String port, String serviceName, String operationName) {
//		Following example  http://10.6.11.233:51000/CustomerInformationService/GetCurrentDisplayContent
		StringBuilder sb = new StringBuilder();
		sb.append("http://");
		sb.append(ipAddress);
		sb.append(":");
		sb.append(port);
		sb.append("/");
		sb.append(serviceName);
		sb.append("/");
		sb.append(operationName);
		return sb.toString();
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends EObject> Optional<T> sendRequest(URI uri, String method, EObject request, EClass responseClass,
			ComponentServiceObjects<ResourceSet> rsFactory) throws Throwable {
		
		ResourceSet set = rsFactory.getService();
		
		try {
			Map<String, Object> options = new HashMap<>();
			
//			TODO: what if a request is not needed???
			Resource requestRes = set.createResource(uri, "application/json");
			
//			Add the request parameters to the request resource
			requestRes.getContents().add(request);
			
			options.put(EMFUriHandlerConstants.OPTION_HTTP_METHOD, method);
			
			Map<String, Object> headers = new HashMap<>();
			headers.put("Content-Type", "application/json; charset=utf8");
			headers.put("Accept", "application/json");
			headers.put("Method", "POST");
			options.put(EMFUriHandlerConstants.OPTION_HTTP_HEADERS, headers);
			
//			Specify that we want a response resource
			Resource responseRes = set.createResource(URI.createURI("temp.json"), "application/json");
			options.put(EMFUriHandlerConstants.OPTIONS_EXPECTED_RESPONSE_RESOURCE, responseRes);
			
//			Specify which kind of EObject the response should contain
			Map<Object, Object> responseOptions = new HashMap<>();
			responseOptions.put(EMFContext.Attributes.ROOT_ELEMENT, responseClass);
			options.put(EMFUriHandlerConstants.OPTIONS_EXPECTED_RESPONSE_RESOURCE_OPTIONS, responseOptions);
			
			requestRes.save(options);
			return responseRes.getContents().isEmpty() ? Optional.empty() : Optional.of((T) responseRes.getContents().get(0));
			
		} catch (Throwable e) {
			throw e;
		} finally {
			rsFactory.ungetService(set);
		}
	}
	
	public static boolean isResponseValid(Optional<? extends EObject> responseOptional, String operationName) {
		if(responseOptional.isEmpty()) {
			System.err.println("Response for operation " + operationName + " is empty!");
			return false;
		}
//		TODO: If all the ResponseStructure objects could inherit from a single one which contains the error msg, 
//		we could directly check here if an error msg was present in the response...
		return true;
	}

}
