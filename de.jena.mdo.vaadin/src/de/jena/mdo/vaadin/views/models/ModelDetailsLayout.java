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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Paths;

import org.eclipse.emf.ecore.EPackage;
import org.gecko.emf.util.documentation.generators.apis.EcoreToDocumentationOptions;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.server.StreamResource;

import de.jena.mdo.model.documentation.provider.ModelDocumentationProvider;
import de.jena.mdo.model.documentation.provider.ModelDocumentationProviderConfig;

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
	private Anchor docAnchor = new Anchor();

	ModelDetailsLayout() {	
		HorizontalLayout detailsLayout = new HorizontalLayout();
		detailsLayout.setAlignItems(Alignment.CENTER);
		detailsLayout.setWidthFull();
		detailsField.setReadOnly(true);
		detailsField.setWidth("50%");
		docBtn.setWidth("20%");
		docAnchor.setVisible(false);
		detailsLayout.add(detailsField, docBtn, docAnchor);
		add(detailsLayout);
	}

	void setDetails(EPackage ePackage, ModelDocumentationProvider modelDocumentationProvider) {
		detailsField.setValue(retrieveDescription(ePackage));
		docAnchor.setTarget("_blank"); //to open it in a new tab
		docBtn.addClickListener(evt -> {
			ModelDocumentationProviderConfig modelDocProviderConfig = modelDocumentationProvider.getConfig();
			String docFilePath = Paths.get(modelDocProviderConfig.output_root_folder(), modelDocProviderConfig.output_html_mermaid_folder(), 
					ePackage.getName().concat(".html")).toString();
			File docFile = new File(docFilePath);
			if(modelDocumentationProvider.retrieveDocumentation(docFilePath, true, ePackage, EcoreToDocumentationOptions.HTML_WITH_MERMAID_CLASS_DIAGRAM) != null) {
				StreamResource streamRes = createReportResource(docFile);
				docAnchor.setText(docFile.getName());
				docAnchor.setHref(streamRes);
				docAnchor.setVisible(true);
			}
			else {
				Notification.show("Error generating documentation for EPackage " + ePackage.getName()).addThemeVariants(NotificationVariant.LUMO_ERROR);
			}
		});
	}

	private String retrieveDescription(EPackage ePackage) {
		return ePackage.getEAnnotations().stream().map(a -> a.getDetails()).filter(d -> d.containsKey("documentation"))
				.map(d -> d.get("documentation").trim()).findFirst().orElse("N/A");
	}

	private StreamResource createReportResource(File docFile) {
		StreamResource res = new StreamResource(docFile.getName(), () -> {
			try {
				return new FileInputStream(docFile);
			} catch (FileNotFoundException e) {
				throw new RuntimeException(e);
			}
		});
		res.setContentType("text/html");
		return res;
	}

}
