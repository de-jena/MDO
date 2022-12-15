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

import org.eclipse.emf.ecore.EPackage;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;

/**
 * 
 * @author ilenia
 * @since Dec 15, 2022
 */
public class ModelDetailsLayout extends VerticalLayout {

	/** serialVersionUID */
	private static final long serialVersionUID = 451755953565039056L;
	private final TextArea detailsField = new TextArea("Model Description");
	private final Button docBtn = new Button("Open Documentation");

	ModelDetailsLayout() {	
		HorizontalLayout detailsLayout = new HorizontalLayout();
		detailsLayout.setAlignItems(Alignment.CENTER);
		detailsLayout.setWidthFull();
		detailsField.setReadOnly(true);
		detailsField.setWidth("70%");
		docBtn.setWidth("30%");
		detailsLayout.setJustifyContentMode(FlexComponent.JustifyContentMode.EVENLY);
		detailsLayout.add(detailsField, docBtn);
		add(detailsLayout);
	}

	void setDetails(EPackage ePackage) {
		detailsField.setValue(retrieveDescription(ePackage));
		docBtn.addClickListener(evt -> {
			Notification.show("Trigger Documentation");
		});
	}
	
	private String retrieveDescription(EPackage ePackage) {
		return ePackage.getEAnnotations().stream().map(a -> a.getDetails()).filter(d -> d.containsKey("documentation"))
		.map(d -> d.get("documentation").trim()).findFirst().orElse("N/A");
	}
}
