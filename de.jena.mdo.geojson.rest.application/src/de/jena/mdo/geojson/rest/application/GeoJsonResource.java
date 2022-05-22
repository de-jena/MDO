/**
import org.osgi.service.jaxrs.whiteboard.annotations.RequireJaxrsWhiteboard; * Copyright (c) 2012 - 2018 Data In Motion and others.
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

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.gecko.emf.jaxrs.annotations.RequireEMFMessageBodyReaderWriter;
import org.gecko.emf.jaxrs.annotations.json.EMFJSONConfig;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.http.whiteboard.annotations.RequireHttpWhiteboard;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsName;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

import de.jena.mdo.geojson.Feature;
import de.jena.mdo.geojson.FeatureCollection;
import de.jena.mdo.geojson.GeojsonFactory;
import de.jena.mdo.geojson.Geometry;
import de.jena.mdo.geojson.MultiPoint;
import de.jena.mdo.geojson.Point;
import de.jena.mdo.geojson.Polygon;

/**
 * This is a GeoJson Resource for a Jaxrs Whiteboard
 * 
 * @since 1.0
 */
@RequireHttpWhiteboard
@RequireEMFJson
@RequireEMFMessageBodyReaderWriter
@JaxrsResource
@JaxrsName("demo")
@Component(service = GeoJsonResource.class, scope = ServiceScope.PROTOTYPE)
@Path("/")
public class GeoJsonResource {

	@Reference
	GeojsonFactory factory;

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String hello() {
		return "Hello World";
	}

	@GET
	@Path("/collections/{collectionId}/items")
	@Produces({ MediaType.APPLICATION_JSON })
	@EMFJSONConfig(typeFieldName = "type", serializeDefaultValues = true, typeUSE = EMFJSONConfig.USE.NAME)
	public Response collections(@PathParam("collectionId") String collectionId) {
		return dummy();
	}

	@GET
	@Path("/collections/{collectionId}/items/{featureId}")
	@Produces({ MediaType.APPLICATION_JSON })
	@EMFJSONConfig(typeFieldName = "type", typeUSE = EMFJSONConfig.USE.NAME)
	public Response collections(@PathParam("collectionId") String collectionId,
			@PathParam("featureId") String featureId) {
		return dummy();
	}

	private Response dummy() {
		FeatureCollection featureCollection = factory.createFeatureCollection();
		EList<Feature> features = featureCollection.getFeatures();

		for (int i = 0; i < 100; i++) {
			features.add(createFeature("" + i, createRandomPoint()));
		}
		features.add(createFeature("1001", createPolygon()));
//		features.add(createMultipoint());

		return Response.ok(featureCollection).build();
	}

	/**
	 * @return
	 */
	private Point createRandomPoint() {
		double lan = (Math.random() - 0.5) / 50 + 11.58600;
		double lon = (Math.random() - 0.5) / 50 + 50.92700;
		return createPoint(lan, lon);
	}

	private Feature createFeature(String id, Geometry geometry) {
		Feature f = factory.createFeature();
		f.setId(id);
		f.setType("Feature");
//		f.setBbox(new Double[] { 11.58700, 50.92879 });
		f.setGeometry(geometry);
		EMap<String,String> properties = f.getProperties();
		properties.put("name", "1234");
		properties.put("foo", "bar");
		return f;
	}

	private Point createPoint(double lat, double lon) {
		Point geo1 = factory.createPoint();
		EList<Double> coordinates = geo1.getCoordinates();
		coordinates.add(lat);
		coordinates.add(lon);
		return geo1;
	}

	/**
	 * @return
	 */
	private Feature createMultipoint() {
		Feature f3 = factory.createFeature();
		MultiPoint geo2 = factory.createMultiPoint();
		EList<Double[]> coordinates2 = geo2.getCoordinates();
		coordinates2.add(new Double[] { 1.5, 1.6, 1.7 });
		coordinates2.add(new Double[] { 2.5, 2.8, 2.7 });
		f3.setGeometry(geo2);
		return f3;
	}

	/**
	 * @return
	 */
	private Geometry createPolygon() {
		Polygon geo = factory.createPolygon();
		EList<Double[][]> coordinates = geo.getCoordinates();
		coordinates.add(new Double[][] { { 11.58700, 50.92878 }, {11.58600, 50.92878 }, {11.58600, 50.92978 }, {11.58700, 50.92978 } });
		return geo;
	}

}
