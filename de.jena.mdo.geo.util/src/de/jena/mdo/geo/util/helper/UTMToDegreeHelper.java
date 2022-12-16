package de.jena.mdo.geo.util.helper;

public class UTMToDegreeHelper {
	
	private static int zone = 32;
	
	public static double getLongitude(double easting, double north) {
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
		return longitude;
	}

	/**
	 * @param easting
	 * @param north
	 * @return
	 */
	public static double getLatitude(double easting, double north) {
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
		return latitude;
	}

}
