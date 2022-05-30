/**
 * Copyright (c) 2013 Data In Motion UG and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Data In Motion UG - initial API and implementation
 */
package de.jena.mdo.sensinact.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.osgi.service.event.EventHandler;

/**
 * This Adapter checks if an {@link EventHandler} exists, that is interested in the {@link Notification}.<br>
 * If such a {@link Notification} appears, the it is stored and will be send after the {@link Resource} the Adaptor belongs to is saved.<br>
 * <br>
 * The saved state of the {@link Resource} will be assumed by the set of the {@link Resource#RESOURCE__TIME_STAMP} Feature
 *
 * @author Juergen Albert
 * @since 28.10.2013
 * @version 0.1.0
 */
public class EventSendingContentAdapter extends EContentAdapter {
	
	private final EventAdmin eventService;


	public EventSendingContentAdapter(EventAdmin eventService) {
		this.eventService = eventService;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		Object oldValue = notification.getOldValue();
		Object newValue = notification.getNewValue();
		if( !Objects.equals(oldValue, newValue)){
			EObject mainObject = EcoreUtil.getRootContainer((EObject) notification.getNotifier());
			String featurepath = createFeaturePath((EStructuralFeature) notification.getFeature(), (EObject) notification.getNotifier(), "");
			Event event = createResourceEvent(mainObject, featurepath, oldValue, newValue);
			eventService.postEvent(event);
		}
	}

	/**
	 * creates the resource event
	 * @param eObject the {@link EObject} to crate it for
	 * @param state the new state of the given {@link EObject}
	 * @return the {@link Event} to send
	 */
	private Event createResourceEvent(EObject eObject, String featurePath, Object oldValue, Object newValue) {
		EClass eClass = eObject.eClass();
		String id = EcoreUtil.getID(eObject);
		Event event = null;
		Map<String, Object> props = new HashMap<String, Object>();
		props.put("id", id);
		props.put("eClass", eClass);
		props.put("uri", EcoreUtil.getURI(eClass).toString());
		props.put("old", oldValue);
		props.put("new", newValue);
		props.put("feature.path", featurePath);
		event = new Event("resourcechange/" + eClass.getName() + "/" + id.replace('.', '_'), props);
		return event;
		
	}

	/**
	 * Creates the feature path in a topic like manner e.g. addresses/street
	 * @param feature the current {@link EStructuralFeature} to use as prefix. Can be <code>null</code> which indicates that the method can return.
	 * @param theObject the
	 * @param path
	 * @return
	 */
	private String createFeaturePath(EStructuralFeature feature, EObject theObject, String path) {
		if(feature == null){
			return path;
		}
		if(path.isEmpty()){
			path = feature.getName();
		} else {
			path = feature.getName() + "/" + path;
		}
		return createFeaturePath(theObject.eContainingFeature(), theObject.eContainer(), path);
	}
}
