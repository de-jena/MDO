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

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emfcloud.jackson.annotations.EcoreTypeInfo.USE;
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
	@Path("/hello")
	@EMFJSONConfig(typeFieldName = "type", serializeDefaultValues = true, typeUSE = USE.NAME)
	public String hello() {
		return "hello World";
	}

	@GET
	@Path("/collections/{collectionId}/items")
	@Produces({ MediaType.APPLICATION_JSON })
	@EMFJSONConfig(typeFieldName = "type", serializeDefaultValues = true, typeUSE = USE.NAME)
	public Response collections(@PathParam("collectionId") String collectionId) {
		return dummy();
	}

	@GET
	@Path("/collections/{collectionId}/items/{featureId}")
	@Produces({ MediaType.APPLICATION_JSON })
	@EMFJSONConfig(typeFieldName = "type", typeUSE = USE.NAME)
	public Response collections(@PathParam("collectionId") String collectionId,
			@PathParam("featureId") String featureId) {
		return dummy();
	}

	private Response dummy() {
		FeatureCollection featureCollection = factory.createFeatureCollection();
		EList<Feature> features = featureCollection.getFeatures();
		Feature f1 = factory.createFeature();
		Polygon geo = factory.createPolygon();
		geo.setBbox(new Double[] { 1.5, 1.6 });
		f1.setGeometry(geo);
		f1.setId("1234567890");
		EMap<String, String> properties = f1.getProperties();
		properties.put("vorname", "Hans");
		features.add(f1);
//		geo.setTest2d(new Double[][] { { 1.1, 1.2 }, { 2.1, 2.2 } });
//		geo.setTest3d(new Double[][][] { { { 1.11, 1.12 }, { 2.11, 2.2 } }, { { 1.1, 1.2 }, { 2.1, 2.2 } },
//				{ { 1.1, 1.2 }, { 2.1, 2.2 } } });
//		geo.setTestByteArray(new byte[] { 0, 1 });
//		geo.setType(GeometryType.POINT);

		Feature f2 = factory.createFeature();
		Point geo1 = factory.createPoint();
		EList<Double> coordinates = geo1.getCoordinates();
		coordinates.add(1.6);
		coordinates.add(1.7);
		coordinates.add(1.8);
		f2.setGeometry(geo1);
		features.add(f2);

		Feature f3 = factory.createFeature();
		MultiPoint geo2 = factory.createMultiPoint();
		EList<Double[]> coordinates2 = geo2.getCoordinates();
		coordinates2.add(new Double[] { 1.5, 1.6 , 1.7});
		coordinates2.add(new Double[] { 2.5, 2.8 , 2.7});
		f3.setGeometry(geo2);
		features.add(f3);

		return Response.ok(featureCollection).build();
	}

}
