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

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.progressbar.ProgressBar;

/**
 * 
 * @author ilenia
 * @since Dec 19, 2022
 */
public class UIUpdateProcess {

	private ExecutorService executor = Executors.newSingleThreadExecutor();
	
	UI currentUI;
	ProgressBar progressBar;
	ProgressMonitor progressMonitor;
	Button btn;
	Label label;

	Callable<Void> startUITask;
	Callable<Void> mainTask;
	Callable<Void> endTask;
	Callable<Void> endUITask;

	public UIUpdateProcess(Callable<Void> mainTask, Callable<Void> endTask, UI currentUI, ProgressBar progressBar, 
			ProgressMonitor progressMonitor, Button btn, Label label) {
		this.mainTask = mainTask;
		this.endTask = endTask;
		this.currentUI = currentUI;
		this.progressBar = progressBar;
		this.progressMonitor = progressMonitor;
		this.btn = btn;
		this.label = label;
		setUITasks();
	}

	public void setUITasks() {
		startUITask = () ->  {			
			currentUI.access(() -> {				
				progressBar.setVisible(true);
				btn.setEnabled(false);
				label.setVisible(true);
			});
			return null;
		};

		endUITask = () -> {
			currentUI.access(() -> label.setText("Done!"));
			
//			This is to keep the "Done!" displayed for 2sec
			try {
				Thread.sleep(2000);			
			} catch(InterruptedException e) {
				e.printStackTrace();
			}

			currentUI.access(() -> {
				progressBar.setValue(0.);
				progressBar.setVisible(false);
				progressMonitor.reset();				
				label.setText("");
				label.setVisible(false);
				btn.setEnabled(true);	
//				stop polling
				currentUI.setPollInterval(-1);
			});
			return null;
		};
	}

	public void launch() {
		try {
			executor.submit(startUITask);
			executor.submit(mainTask);
			executor.submit(endUITask);			
			executor.submit(endTask);
		} finally {
			executor.shutdown();
		}
	}

}
