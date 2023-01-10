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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

import org.eclipse.emf.ecore.EClass;
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

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.component.progressbar.ProgressBarVariant;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import de.jena.mdo.vaadin.helpers.LeafletMap;
import de.jena.mdo.vaadin.helpers.UIUpdateProcess;
import de.jena.mdo.vaadin.helpers.VaadinViewProgressMonitor;
import de.jena.mdo.vaadin.views.main.MainView;

/**
 * 
 * @author ilenia
 * @since Dec 15, 2022
 */
@Route(value = "detectorssmap", layout = MainView.class)
@PageTitle("Detectors Map")
@NpmPackage(value = "leaflet", version = "^1.6.0")
@NpmPackage(value = "leaflet.markercluster", version = "^1.5.3")
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
	private List<EObject> dbObjects = new ArrayList<>();
	private EClass eClass;
	private PromiseFactory promiseFactory = new PromiseFactory(Executors.newSingleThreadExecutor());


	@Activate
	public void renderView() {
		
		HorizontalLayout barLayout = new HorizontalLayout();
		barLayout.setHeight("20%");
		barLayout.setWidthFull();
		barLayout.setPadding(true);
		barLayout.setAlignItems(Alignment.CENTER);
		
		ProgressBar progressBar = new ProgressBar(0., 100.);
		progressBar.setIndeterminate(true);
		progressBar.setVisible(false);
		progressBar.setWidth("30%");
		progressBar.addThemeVariants(ProgressBarVariant.LUMO_CONTRAST);

		Label barLabel = new Label("Loading Detectors...");
		barLabel.setVisible(false);		

		VaadinViewProgressMonitor progressMonitor = 
				new VaadinViewProgressMonitor(progressBar, barLabel, UI.getCurrent());

		Button btn = new Button("Display Detectors");
		btn.addClickListener(evt -> {
			map.clearMarkers();
			progressBar.setVisible(true);
			barLabel.setVisible(true);
			barLabel.setText("Loading Detectors...");
			Callable<Void> mainTask = () -> {
				displayObjects(progressMonitor);
				return null;
			};
			UI.getCurrent().setPollInterval(200);
			UIUpdateProcess uiUpdateProcess = new UIUpdateProcess(mainTask, () -> null, progressMonitor, btn);
			uiUpdateProcess.launch();			
		});
		
		barLayout.add(btn, progressBar, barLabel);

		setSizeFull();
		setPadding(false);
		map.setSizeFull();
		map.setView(50.926516, 11.588373, 13);
		add(barLayout, map);
		
		promiseFactory.submit(() -> {
			loadObjects();
			return true;
		}).onSuccess(r -> System.out.println("Detectors are ready!"));
	}
	
	private void loadObjects() {
		try {
			eClass = (EClass) assetPackage.getEClassifier("Detector");
			dbObjects.addAll(repository.getAllEObjects(eClass));
		} catch(Exception e) {
			e.printStackTrace();
		} 	
	}
	
	private void displayObjects(VaadinViewProgressMonitor progressMonitor) {
		try {
			progressMonitor.setLabel("Displaying Detectors on Map...");
			map.addEObjects(dbObjects, eClass);
			map.showMarkers(progressMonitor);
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}

}
