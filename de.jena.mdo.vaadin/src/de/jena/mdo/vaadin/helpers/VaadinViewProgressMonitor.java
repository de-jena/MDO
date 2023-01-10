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


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.server.Command;

/**
 * 
 * @author ilenia
 * @since Dec 19, 2022
 */
public class VaadinViewProgressMonitor  {
	
	private ProgressBar vaadinProgressBar;
	private Label label;
	private UI currentUI;
	
	public VaadinViewProgressMonitor(ProgressBar vaadinProgressBar, Label label, UI currentUI) {
		this.vaadinProgressBar = vaadinProgressBar;
		this.label = label;
		this.currentUI = currentUI;
	}
	
	public void executeUICommand(Command command) {
		if(currentUI != null) {
			currentUI.access(command);
		}	
	}
	
	
	public void setLabel(String stepDescription) {
		executeUICommand(() -> label.setText(stepDescription));	
//		This seems to be needed otherwise nothing is really shown in the UI...
//		try {
//			Thread.sleep(100);			
//		} catch(InterruptedException e) {
//			e.printStackTrace();
//		}		
	}
	
	public UI getUI() {
		return currentUI;
	}
	
	public Label getLabel() {
		return label;
	}
	
	public ProgressBar getProgressBar() {
		return vaadinProgressBar;
	}

}
