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

/**
 * 
 * @author ilenia
 * @since Dec 19, 2022
 */
public abstract class ProgressMonitor {
	boolean canceled = false, done = false;
	double min=0., max=1., value = 0.;
	String label;
	
	
	/**
	 * Set the minimum value for the progress monitor.
	 * Default value is 0.
	 * @param min
	 */
	public void setMin(double min) {
		this.min = min;
	}
	
	public double getMin() {
		return this.min;
	}
	
	/**
	 * Set the maximum value for the progress monitor.
	 * Default value is 1.
	 * @param max
	 */
	public void setMax(double max) {
		this.max = max;
	}
	
	public double getMax() {
		return this.max;
	}
	
	public void cancel() {
		this.canceled = true;
	}
	
	public boolean isCanceled() {
		return this.canceled;
	}
	
	public void done() {
		this.done = true;
	}
	
	public boolean isDone() {
		return this.done;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return this.value;
	}
	
	/**
	 * This is meant to set a description of the 
	 * step that is currently being done
	 * @param label
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public void reset() {
		this.done = false;
		this.canceled = false;
		this.max = 1.;
		this.min = 0.;
		this.value = 0.;
	}
	
}
