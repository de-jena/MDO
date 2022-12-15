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

import java.util.function.Consumer;

import org.eclipse.emf.ecore.EPackage;

import com.vaadin.flow.component.grid.dataview.GridListDataView;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
import com.vaadin.flow.data.value.ValueChangeMode;

/**
 * 
 * @author ilenia
 * @since Dec 15, 2022
 */
public class ModelsFilter {
	private final GridListDataView<EPackage> dataView;

	private String ePackageName;
	private String ePackageURI;

	ModelsFilter(GridListDataView<EPackage> dataView) {
		this.dataView = dataView;
		this.dataView.addFilter(this::test);
	}	

	void setEPackageName(String ePackageName) {
		this.ePackageName = ePackageName;
		this.dataView.refreshAll();
	}

	void setEPackageURI(String ePackageURI) {
		this.ePackageURI = ePackageURI;
		this.dataView.refreshAll();
	}


	boolean test(EPackage ePackage) {
		boolean matchesName = matches(ePackage.getName(), ePackageName);
		boolean matchesURI = matches(ePackage.getNsURI(), ePackageURI);
	

		return matchesName && matchesURI;
	}
	
	static com.vaadin.flow.component.Component createFilterHeader(String labelText, Consumer<String> filterChangeConsumer) {
	    Label label = new Label(labelText);
	    label.getStyle().set("padding-top", "var(--lumo-space-m)")
	            .set("font-size", "var(--lumo-font-size-xs)");
	    TextField textField = new TextField();
	    textField.setValueChangeMode(ValueChangeMode.EAGER);
	    textField.setClearButtonVisible(true);
	    textField.addThemeVariants(TextFieldVariant.LUMO_SMALL);
	    textField.setWidthFull();
	    textField.getStyle().set("max-width", "100%");
	    textField.addValueChangeListener(
	            e -> filterChangeConsumer.accept(e.getValue()));
	    VerticalLayout layout = new VerticalLayout(label, textField);
	    layout.getThemeList().clear();
	    layout.getThemeList().add("spacing-xs");

	    return layout;
	}
	
	
	private boolean matches(String value, String searchTerm) {
		return searchTerm == null || searchTerm.isEmpty()
				|| value.toLowerCase().contains(searchTerm.toLowerCase());
	}

	
}
