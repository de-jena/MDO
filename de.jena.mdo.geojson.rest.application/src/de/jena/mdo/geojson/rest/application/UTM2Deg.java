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
package de.jena.mdo.geojson.rest.application;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

@Component(name = "de.jena.mdo.geojson.UTM2Deg", service = UTM2Deg.class, scope = ServiceScope.SINGLETON)
public class UTM2Deg {
	private int zone;
	private boolean isNorthernHem;

	public @interface UTMConfiguration {
		int zone() default 32;
		char letter() default 'U'; 
	}
	
	@Activate
	void activate(UTMConfiguration config) {
		zone = config.zone();
		isNorthernHem = config.letter() > 'M';
	}

	public double[] toDeg(double easting, double northing) {
		double north = isNorthernHem ? northing : northing - 10000000;
		double latitude = (north / 6366197.724 / 0.9996
				+ (1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2)
						- 0.006739496742 * Math.sin(north / 6366197.724 / 0.9996)
								* Math.cos(north / 6366197.724 / 0.9996) * (Math
										.atan(Math
												.cos(Math
														.atan((Math
																.exp((easting - 500000) / (0.9996 * 6399593.625
																		/ Math.sqrt((1 + 0.006739496742 * Math.pow(
																				Math.cos(north / 6366197.724 / 0.9996),
																				2))))
																		* (1 - 0.006739496742 * Math.pow((easting
																				- 500000)
																				/ (0.9996 * 6399593.625 / Math.sqrt(
																						(1 + 0.006739496742 * Math.pow(
																								Math.cos(north
																										/ 6366197.724
																										/ 0.9996),
																								2)))),
																				2) / 2 * Math
																						.pow(Math.cos(north
																								/ 6366197.724 / 0.9996),
																								2)
																				/ 3))
																- Math.exp(-(easting - 500000) / (0.9996 * 6399593.625
																		/ Math.sqrt((1 + 0.006739496742 * Math.pow(
																				Math.cos(north / 6366197.724 / 0.9996),
																				2))))
																		* (1 - 0.006739496742 * Math.pow((easting
																				- 500000)
																				/ (0.9996 * 6399593.625 / Math.sqrt(
																						(1 + 0.006739496742 * Math.pow(
																								Math.cos(north
																										/ 6366197.724
																										/ 0.9996),
																								2)))),
																				2) / 2 * Math
																						.pow(Math.cos(north
																								/ 6366197.724 / 0.9996),
																								2)
																				/ 3)))
																/ 2
																/ Math.cos((north - 0.9996 * 6399593.625 * (north
																		/ 6366197.724 / 0.9996
																		- 0.006739496742 * 3 / 4 * (north
																				/ 6366197.724 / 0.9996
																				+ Math.sin(2
																						* north / 6366197.724 / 0.9996)
																						/ 2)
																		+ Math.pow(0.006739496742 * 3 / 4, 2) * 5 / 3
																				* (3 * (north / 6366197.724
																						/ 0.9996
																						+ Math.sin(2 * north
																								/ 6366197.724 / 0.9996)
																								/ 2)
																						+ Math.sin(2 * north
																								/ 6366197.724 / 0.9996)
																								* Math.pow(
																										Math.cos(north
																												/ 6366197.724
																												/ 0.9996),
																										2))
																				/ 4
																		- Math.pow(0.006739496742 * 3 / 4, 3) * 35 / 27
																				* (5 * (3
																						* (north / 6366197.724 / 0.9996
																								+ Math.sin(2 * north
																										/ 6366197.724
																										/ 0.9996) / 2)
																						+ Math.sin(2 * north
																								/ 6366197.724 / 0.9996)
																								* Math.pow(
																										Math.cos(north
																												/ 6366197.724
																												/ 0.9996),
																										2))
																						/ 4
																						+ Math.sin(2 * north
																								/ 6366197.724 / 0.9996)
																								* Math.pow(Math
																										.cos(north
																												/ 6366197.724
																												/ 0.9996),
																										2)
																								* Math.pow(Math.cos(
																										north / 6366197.724
																												/ 0.9996),
																										2))
																				/ 3))
																		/ (0.9996 * 6399593.625 / Math.sqrt(
																				(1 + 0.006739496742 * Math.pow(Math.cos(
																						north / 6366197.724 / 0.9996),
																						2))))
																		* (1 - 0.006739496742 * Math.pow((easting
																				- 500000)
																				/ (0.9996 * 6399593.625 / Math.sqrt(
																						(1 + 0.006739496742 * Math.pow(
																								Math.cos(north
																										/ 6366197.724
																										/ 0.9996),
																								2)))),
																				2) / 2
																				* Math.pow(
																						Math.cos(north
																								/ 6366197.724 / 0.9996),
																						2))
																		+ north / 6366197.724 / 0.9996)))
												* Math.tan((north - 0.9996 * 6399593.625 * (north / 6366197.724 / 0.9996
														- 0.006739496742 * 3 / 4 * (north / 6366197.724
																/ 0.9996
																+ Math.sin(2 * north / 6366197.724 / 0.9996) / 2)
														+ Math.pow(0.006739496742 * 3 / 4, 2) * 5 / 3 * (3
																* (north / 6366197.724 / 0.9996
																		+ Math.sin(2 * north / 6366197.724 / 0.9996)
																				/ 2)
																+ Math.sin(
																		2 * north / 6366197.724 / 0.9996)
																		* Math.pow(
																				Math.cos(north / 6366197.724 / 0.9996),
																				2))
																/ 4
														- Math.pow(0.006739496742 * 3 / 4, 3) * 35 / 27 * (5 * (3
																* (north / 6366197.724 / 0.9996
																		+ Math.sin(2 * north / 6366197.724 / 0.9996)
																				/ 2)
																+ Math.sin(2 * north / 6366197.724 / 0.9996) * Math
																		.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
																/ 4
																+ Math.sin(2 * north / 6366197.724 / 0.9996) * Math
																		.pow(Math.cos(north / 6366197.724 / 0.9996), 2)
																		* Math.pow(
																				Math.cos(north / 6366197.724 / 0.9996),
																				2))
																/ 3))
														/ (0.9996 * 6399593.625
																/ Math.sqrt((1 + 0.006739496742 * Math.pow(
																		Math.cos(north / 6366197.724 / 0.9996), 2))))
														* (1 - 0.006739496742
																* Math.pow((easting - 500000) / (0.9996 * 6399593.625
																		/ Math.sqrt((1 + 0.006739496742 * Math.pow(
																				Math.cos(north / 6366197.724 / 0.9996),
																				2)))),
																		2)
																/ 2
																* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
														+ north / 6366197.724 / 0.9996))
										- north / 6366197.724 / 0.9996)
								* 3 / 2)
						* (Math.atan(Math
								.cos(Math.atan((Math
										.exp((easting - 500000)
												/ (0.9996 * 6399593.625
														/ Math.sqrt((1 + 0.006739496742
																* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))))
												* (1 - 0.006739496742
														* Math.pow(
																(easting - 500000) / (0.9996 * 6399593.625
																		/ Math.sqrt((1 + 0.006739496742 * Math.pow(
																				Math.cos(north / 6366197.724 / 0.9996),
																				2)))),
																2)
														/ 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2) / 3))
										- Math.exp(-(easting - 500000) / (0.9996 * 6399593.625
												/ Math.sqrt((1 + 0.006739496742
														* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))))
												* (1 - 0.006739496742
														* Math.pow((easting - 500000) / (0.9996 * 6399593.625
																/ Math.sqrt((1 + 0.006739496742 * Math.pow(
																		Math.cos(north / 6366197.724 / 0.9996), 2)))),
																2)
														/ 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2) / 3)))
										/ 2
										/ Math.cos((north - 0.9996 * 6399593.625 * (north / 6366197.724 / 0.9996
												- 0.006739496742 * 3 / 4
														* (north / 6366197.724 / 0.9996
																+ Math.sin(2 * north / 6366197.724 / 0.9996) / 2)
												+ Math.pow(0.006739496742 * 3 / 4, 2) * 5 / 3 * (3
														* (north / 6366197.724 / 0.9996
																+ Math.sin(2 * north / 6366197.724 / 0.9996) / 2)
														+ Math.sin(2 * north / 6366197.724 / 0.9996)
																* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
														/ 4
												- Math.pow(0.006739496742 * 3 / 4, 3) * 35 / 27 * (5 * (3
														* (north / 6366197.724 / 0.9996
																+ Math.sin(2 * north / 6366197.724 / 0.9996) / 2)
														+ Math.sin(2 * north / 6366197.724 / 0.9996)
																* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
														/ 4
														+ Math.sin(2 * north / 6366197.724 / 0.9996)
																* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2)
																* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
														/ 3))
												/ (0.9996 * 6399593.625 / Math.sqrt((1 + 0.006739496742
														* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))))
												* (1 - 0.006739496742 * Math.pow(
														(easting - 500000) / (0.9996 * 6399593.625
																/ Math.sqrt((1 + 0.006739496742 * Math.pow(
																		Math.cos(north / 6366197.724 / 0.9996), 2)))),
														2) / 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
												+ north / 6366197.724 / 0.9996)))
								* Math.tan((north - 0.9996 * 6399593.625 * (north / 6366197.724 / 0.9996
										- 0.006739496742 * 3 / 4
												* (north / 6366197.724 / 0.9996
														+ Math.sin(2 * north / 6366197.724 / 0.9996) / 2)
										+ Math.pow(0.006739496742 * 3 / 4, 2) * 5 / 3
												* (3 * (north / 6366197.724 / 0.9996
														+ Math.sin(2 * north / 6366197.724 / 0.9996) / 2)
														+ Math.sin(2 * north / 6366197.724 / 0.9996)
																* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
												/ 4
										- Math.pow(0.006739496742 * 3 / 4, 3) * 35 / 27 * (5
												* (3 * (north / 6366197.724 / 0.9996
														+ Math.sin(2 * north / 6366197.724 / 0.9996) / 2)
														+ Math.sin(2 * north / 6366197.724 / 0.9996)
																* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
												/ 4
												+ Math.sin(2 * north / 6366197.724 / 0.9996)
														* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2)
														* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
												/ 3))
										/ (0.9996 * 6399593.625 / Math.sqrt((1 + 0.006739496742
												* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))))
										* (1 - 0.006739496742
												* Math.pow(
														(easting - 500000) / (0.9996 * 6399593.625
																/ Math.sqrt((1 + 0.006739496742 * Math.pow(
																		Math.cos(north / 6366197.724 / 0.9996), 2)))),
														2)
												/ 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
										+ north / 6366197.724 / 0.9996))
								- north / 6366197.724 / 0.9996))
				* 180 / Math.PI;
		latitude = Math.round(latitude * 10000000);
		latitude = latitude / 10000000;
		double longitude = Math
				.atan((Math
						.exp((easting - 500000) / (0.9996 * 6399593.625 / Math
								.sqrt((1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2)))) * (1
										- 0.006739496742
												* Math.pow(
														(easting - 500000) / (0.9996 * 6399593.625
																/ Math.sqrt((1 + 0.006739496742 * Math.pow(
																		Math.cos(north / 6366197.724 / 0.9996), 2)))),
														2)
												/ 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2) / 3))
						- Math.exp(-(easting - 500000) / (0.9996 * 6399593.625 / Math
								.sqrt((1 + 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2)))) * (1
										- 0.006739496742
												* Math.pow(
														(easting - 500000) / (0.9996 * 6399593.625
																/ Math.sqrt((1 + 0.006739496742 * Math.pow(
																		Math.cos(north / 6366197.724 / 0.9996), 2)))),
														2)
												/ 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2) / 3)))
						/ 2
						/ Math.cos((north - 0.9996 * 6399593.625 * (north / 6366197.724 / 0.9996
								- 0.006739496742 * 3 / 4
										* (north / 6366197.724 / 0.9996
												+ Math.sin(2 * north / 6366197.724 / 0.9996) / 2)
								+ Math.pow(0.006739496742 * 3 / 4, 2) * 5 / 3
										* (3 * (north / 6366197.724 / 0.9996
												+ Math.sin(2 * north / 6366197.724 / 0.9996) / 2)
												+ Math.sin(2 * north / 6366197.724 / 0.9996)
														* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
										/ 4
								- Math.pow(0.006739496742 * 3 / 4, 3) * 35 / 27 * (5
										* (3 * (north / 6366197.724 / 0.9996
												+ Math.sin(2 * north / 6366197.724 / 0.9996) / 2)
												+ Math.sin(2 * north / 6366197.724 / 0.9996)
														* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
										/ 4
										+ Math.sin(2 * north / 6366197.724 / 0.9996)
												* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2)
												* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
										/ 3))
								/ (0.9996 * 6399593.625 / Math.sqrt((1
										+ 0.006739496742 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))))
								* (1 - 0.006739496742
										* Math.pow((easting - 500000) / (0.9996 * 6399593.625
												/ Math.sqrt((1 + 0.006739496742
														* Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2)))),
												2)
										/ 2 * Math.pow(Math.cos(north / 6366197.724 / 0.9996), 2))
								+ north / 6366197.724 / 0.9996))
				* 180 / Math.PI + zone * 6 - 183;
		longitude = Math.round(longitude * 10000000);
		longitude = longitude / 10000000;
		return new double[] { latitude, longitude };
	}
}