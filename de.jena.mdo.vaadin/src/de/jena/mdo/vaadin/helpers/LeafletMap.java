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
package de.jena.mdo.vaadin.helpers;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;

/**
 * 
 * @author ilenia
 * @since Dec 14, 2022
 */
@CssImport("leaflet/dist/leaflet.css")
@CssImport("leaflet.markercluster/dist/MarkerCluster.Default.css")
@CssImport("leaflet.markercluster/dist/MarkerCluster.css")
@JsModule("./components/leafletmap/leaflet-map.ts")
@Tag("leaflet-map")
public class LeafletMap extends Component implements HasSize {

	private static final long serialVersionUID = 1L;

	public void setView(double latitude, double longitude, int zoomLevel) {
		getElement().callJsFunction("setView", latitude, longitude, zoomLevel);
	}

	public void addEObjects(List<EObject> objects, EClass eClass) {
		if(objects.isEmpty()) return;
		objects.forEach(obj -> addEObject(obj, eClass));
	}

	
	public void addEObject(EObject obj, EClass eClass) {
		getElement().callJsFunction("addMarker", (Double) obj.eGet(eClass.getEStructuralFeature("lat")), (Double) obj.eGet(eClass.getEStructuralFeature("lon")), eClass.getName());
	}
	
	public void showMarkers(VaadinViewProgressMonitor progressMonitor) {
		getElement().callJsFunction("showMarkers");
	}
	
	public void clearMarkers() {
		getElement().callJsFunction("clearMarkers");
	}
}