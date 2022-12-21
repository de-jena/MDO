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
public class VaadinViewProgressMonitor  extends ProgressMonitor{
	
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
//			System.out.println("Executing command");
			currentUI.access(command);
		}
////		This seems to be needed otherwise nothing is really shown in the UI...
//		try {
//			Thread.sleep(500);			
//		} catch(InterruptedException e) {
//			e.printStackTrace();
//		}		
	}
	
	/* 
	 * (non-Javadoc)
	 * @see com.playertour.backend.apis.progress.monitor.ProgressMonitor#setValue(double)
	 */
	@Override
	public void setValue(double value) {
		super.setValue(value);
		vaadinProgressBar.setValue(value);		
	}
	
	/* 
	 * (non-Javadoc)
	 * @see com.playertour.backend.apis.progress.monitor.ProgressMonitor#setLabel(java.lang.String)
	 */
	@Override
	public void setLabel(String stepDescription) {
		super.setLabel(stepDescription);	
		executeUICommand(() -> label.setText(stepDescription));	
//		This seems to be needed otherwise nothing is really shown in the UI...
		try {
			Thread.sleep(300);			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}		
	}

	/* 
	 * (non-Javadoc)
	 * @see com.playertour.backend.apis.progress.monitor.ProgressMonitor#setMax(double)
	 */
	@Override
	public void setMax(double max) {
		super.setMax(max);
		vaadinProgressBar.setMax(max);		
	}
	
	/* 
	 * (non-Javadoc)
	 * @see com.playertour.backend.apis.progress.monitor.ProgressMonitor#setMin(double)
	 */
	@Override
	public void setMin(double min) {
		super.setMin(min);
		vaadinProgressBar.setMin(min);
	}
	
	public ProgressBar getProgressBar() {
		return this.vaadinProgressBar;
	}

}
