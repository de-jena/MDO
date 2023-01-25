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
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gecko.emf.osgi.EMFUriHandlerConstants;
import org.osgi.service.component.ComponentServiceObjects;

import de.jena.mdo.ibis.common.GeneralResponseStructure;

import org.eclipse.emfcloud.jackson.databind.EMFContext;

/**
 * 
 * @author ilenia
 * @since Jan 18, 2023
 */
public class IbisHttpRequestHelper {
	
	public static final Logger LOGGER = Logger.getLogger(IbisHttpRequestHelper.class.getName());
	
	@SuppressWarnings("unchecked")
	public static <T extends GeneralResponseStructure> T sendHttpRequest(String host, String port, String serviceName, String operationName, EObject request, EClass responseClass,
			ComponentServiceObjects<ResourceSet> rsFactory) {
		URI uri = calculateURI(host, port, serviceName, operationName);
		try {
			Optional<GeneralResponseStructure> responseOpt = doSendHttpRequest(uri, request == null ? "GET" : "POST", request, responseClass, rsFactory);
			if(isResponseValid(responseOpt, operationName)) {
				return (T) responseOpt.get();
			}
			LOGGER.severe(String.format("Response for URI %s is not valid. Returning null!", uri.toString()));
			return null;
		} catch (Throwable e) {
			LOGGER.severe(String.format("Something went wrong during request %s. Returning null!", uri.toString()));
			e.printStackTrace();
			return null;
		}
	}
	
	private static URI calculateURI(String host, String port, String serviceName, String operationName) {
		return URI.createURI(calculateURIString(host, port, serviceName, operationName));
	}
	
	private static String calculateURIString(String host, String port, String serviceName, String operationName) {
//		Following example  http://10.6.11.233:51000/CustomerInformationService/GetCurrentDisplayContent
		StringBuilder sb = new StringBuilder();
		sb.append("http://");
		sb.append(host);
		sb.append(":");
		sb.append(port);
		sb.append("/");
		sb.append(serviceName);
		sb.append("/");
		sb.append(operationName);
		return sb.toString();
	}
	
	@SuppressWarnings("unchecked")
	private static <T extends GeneralResponseStructure> Optional<T> doSendHttpRequest(URI uri, String method, EObject request, EClass responseClass,
			ComponentServiceObjects<ResourceSet> rsFactory) throws Throwable {
		
		ResourceSet set = rsFactory.getService();
		
		try {
			Map<String, Object> options = new HashMap<>();
			
//			TODO: what if a request is not needed???
			Resource requestRes = set.createResource(uri, "application/xml");
			
//			Add the request parameters to the request resource
			Map<String, Object> headers = new HashMap<>();
			if(request != null) {
				requestRes.getContents().add(request);			
				headers.put("Content-Type", "application/xml; charset=utf8");
			}			
			headers.put("Accept", "application/xml");
			headers.put("Method", method);
			options.put(EMFUriHandlerConstants.OPTION_HTTP_HEADERS, headers);
			options.put(EMFUriHandlerConstants.OPTION_HTTP_METHOD, method);			
			
//			Specify that we want a response resource
			Resource responseRes = set.createResource(URI.createURI("temp.xml"), "application/xml");
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
	
	private static boolean isResponseValid(Optional<? extends GeneralResponseStructure> responseOptional, String operationName) {
		if(responseOptional.isEmpty()) {
			LOGGER.severe(String.format("Response for operation %s is empty!", operationName));
			return false;
		}
		GeneralResponseStructure response = responseOptional.get();
		if(response.getOperationErrorMessage() != null) {
			LOGGER.severe(String.format("Response for operation %s contains error with code %s and value %s", 
					operationName, response.getOperationErrorMessage().getErrorCode(), response.getOperationErrorMessage().getValue()));
			return false;
		}		
		return true;
	}

}
