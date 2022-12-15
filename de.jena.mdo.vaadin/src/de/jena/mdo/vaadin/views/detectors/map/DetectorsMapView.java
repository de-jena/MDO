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
package de.jena.mdo.vaadin.views.detectors.map;

import java.util.List;
import java.util.concurrent.Executors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.gecko.emf.repository.EMFRepository;
import org.gecko.vaadin.whiteboard.annotations.VaadinComponent;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.util.promise.PromiseFactory;

import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import de.jena.mdo.vaadin.helpers.LeafletMap;
import de.jena.mdo.vaadin.views.main.MainView;

/**
 * 
 * @author ilenia
 * @since Dec 15, 2022
 */
@Route(value = "detectorssmap", layout = MainView.class)
@PageTitle("Detectors Map")
@NpmPackage(value = "leaflet", version = "^1.6.0")
@Component(service=DetectorsMapView.class, scope = ServiceScope.PROTOTYPE)
@VaadinComponent()
public class DetectorsMapView extends VerticalLayout{

	@Reference(target = "(repo_id=mdo.mdo)", scope = ReferenceScope.PROTOTYPE_REQUIRED)
	EMFRepository repository;

	@Reference(target = "(emf.model.nsURI=http://jena.de/mdo/asset/1.0)")
	EPackage assetPackage;


	/** serialVersionUID */
	private static final long serialVersionUID = 7437891775723509848L;

	private LeafletMap map = new LeafletMap();
	private PromiseFactory promiseFactory = new PromiseFactory(Executors.newSingleThreadExecutor());


	@Activate
	public void renderView() {
		setSizeFull();
		setPadding(false);
		map.setSizeFull();
		map.setView(50.926516, 11.588373, 11);
		add(map);
		
		promiseFactory.submit(() -> {
			EClassifier detectorEClassifier = assetPackage.getEClassifier("Detector");
	    	List<EObject> detectors = repository.getAllEObjects((EClass) detectorEClassifier);
	    	
			return true;
		});
	}

}
