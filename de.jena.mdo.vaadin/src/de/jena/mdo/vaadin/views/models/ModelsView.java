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
package de.jena.mdo.vaadin.views.models;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EPackage;
import org.gecko.vaadin.whiteboard.annotations.VaadinComponent;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.util.promise.PromiseFactory;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.Grid.Column;
import com.vaadin.flow.component.grid.HeaderRow;
import com.vaadin.flow.component.grid.dataview.GridListDataView;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import de.jena.mdo.model.documentation.provider.ModelDocumentationProvider;
import de.jena.mdo.vaadin.views.main.MainView;

/**
 * 
 * @author ilenia
 * @since Dec 14, 2022
 */
@Route(value = "models", layout = MainView.class)
@PageTitle("View Models")
@Component(name = "ModelsView", service = ModelsView.class, scope = ServiceScope.PROTOTYPE)
@VaadinComponent()
public class ModelsView extends VerticalLayout {

	@Reference
	ModelDocumentationProvider modelDocumentationProvider;
	
	private static final long serialVersionUID = 5034189169878020411L;	
	private Grid<EPackage> modelsGrid = new Grid<>();
	private GridListDataView<EPackage> dataView;
	private ModelsFilter modelsFilter;
	private PromiseFactory promiseFactory = new PromiseFactory(Executors.newSingleThreadExecutor());
	private EPackage oldGridSelectedModel = null;

	@Activate
	public void renderView() {

		addClassName("models-view"); //this should be the same as the css file name for that view
		setSizeFull();

		HorizontalLayout searchLayout = new HorizontalLayout();
		searchLayout.setAlignItems(Alignment.CENTER);
		Label searchLabel = new Label("View Models:");

		Column<EPackage> nameColumn = modelsGrid.addColumn(EPackage::getName).setHeader("EPackage Name").setAutoWidth(true).setSortable(true);
		Column<EPackage> uriColumn = modelsGrid.addColumn(EPackage::getNsURI).setHeader("URI").setAutoWidth(true).setSortable(true);
		modelsGrid.setVisible(false);
		modelsGrid.setSizeFull();
		
		HorizontalLayout htmlLayout = new HorizontalLayout();
		htmlLayout.setSizeFull();
		htmlLayout.setVisible(false);
		
		modelsGrid.setItemDetailsRenderer(createModelDetailsRenderer(htmlLayout));
		modelsGrid.addSelectionListener(evt ->  {
			EPackage selectedModel = evt.getFirstSelectedItem().orElse(null);
			if(selectedModel ==  null) oldGridSelectedModel = selectedModel;
			if(!selectedModel.equals(oldGridSelectedModel)) htmlLayout.setVisible(false);
		});

		Button searchButton = new Button("View", 
				event ->  {
					modelsGrid.setVisible(true);
					promiseFactory.submit(() -> {
						List<EPackage> ePackages = new ArrayList<>();
						EPackage.Registry.INSTANCE.keySet().forEach(k -> {
							ePackages.add(EPackage.Registry.INSTANCE.getEPackage(k));
						});						
						return ePackages.stream()
								.filter(getModelFilter())
								.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
								.collect(Collectors.toList());
					}).onSuccess(result -> {
						dataView = modelsGrid.setItems(result);
						modelsFilter = new ModelsFilter(dataView);
						modelsGrid.getHeaderRows().clear();
						HeaderRow headerRow = modelsGrid.appendHeaderRow();
						headerRow.getCell(nameColumn).setComponent(
								ModelsFilter.createFilterHeader("Name", modelsFilter::setEPackageName));
						headerRow.getCell(uriColumn).setComponent(
								ModelsFilter.createFilterHeader("URI", modelsFilter::setEPackageURI));
					}).onFailure(t -> Notification.show("Error while retrieving EPackages!").addThemeVariants(NotificationVariant.LUMO_ERROR));							
				});
		searchLayout.add(searchLabel, searchButton);		
		add(searchLayout, modelsGrid, htmlLayout);
	}
	
	private Predicate<EPackage> getModelFilter() {
		return p -> !p.getNsURI().startsWith("http://www.w3.org") && !p.getNsURI().startsWith("http://www.eclipse.org")
				&& !p.getNsURI().startsWith("http:///www.eclipse.org")
				&& !p.getNsURI().startsWith("http://gecko.io") && !p.getNsURI().startsWith("https://geckoprojects.org")
				&& !p.getNsURI().startsWith("http://datainmotion.com");
	}

	private ComponentRenderer<ModelDetailsLayout, EPackage> createModelDetailsRenderer(HorizontalLayout htmlLayout) {
		
		return new ComponentRenderer<>(() -> new ModelDetailsLayout(htmlLayout),
				(layout, ePackage) -> {
					layout.setDetails(ePackage, modelDocumentationProvider);
				});
	}
}