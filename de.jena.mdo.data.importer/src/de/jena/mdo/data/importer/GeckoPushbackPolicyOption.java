/**
 * Copyright (c) 2012 - 2022 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v2.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.data.importer;

import java.util.concurrent.BlockingQueue;

import org.osgi.util.pushstream.PushEvent;
import org.osgi.util.pushstream.PushbackPolicy;

/**
 * Additional usefull {@link PushbackPolicy}s cann be added here.
 * @author Juergen Albert
 * @since 24 Jan 2019
 */
public enum GeckoPushbackPolicyOption {

	/**
	 * This {@link PushbackPolicy} increases linear after the queue breaches a given threshold.  
	 * If the threshold is e.g. 100 the 101st element would cause a backpressure of one. the 110th element 10. 
	 * @author Juergen Albert
	 * @since 24 Jan 2019
	 */
	LINEAR_AFTER_THRESHOLD {
		@Override
		public <T, U extends BlockingQueue<PushEvent<? extends T>>> PushbackPolicy<T, U> getPolicy(long value) {
			return q -> Math.max(0, q.size() - value);
		}
	};
	
	/**
	 * Create a {@link PushbackPolicy} instance configured with a base back
	 * pressure time in nanoseconds
	 * 
	 * The actual backpressure returned will vary based on the selected
	 * implementation, the base value, and the state of the buffer.
	 * 
	 * @param value
	 * @return A {@link PushbackPolicy} to use
	 */
	public abstract <T, U extends BlockingQueue<PushEvent<? extends T>>> PushbackPolicy<T, U> getPolicy(long value);
	
}