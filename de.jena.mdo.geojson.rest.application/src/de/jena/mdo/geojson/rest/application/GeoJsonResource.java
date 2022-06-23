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

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gecko.emf.jaxrs.annotations.RequireEMFMessageBodyReaderWriter;
import org.gecko.emf.jaxrs.annotations.json.EMFJSONConfig;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.mongo.Options;
import org.gecko.emf.mongo.pushstream.constants.MongoPushStreamConstants;
import org.gecko.emf.pushstream.EPushStreamProvider;
import org.gecko.emf.repository.mongo.annotations.RequireMongoEMFRepository;
import org.gecko.emf.repository.query.IQuery;
import org.gecko.emf.repository.query.QueryRepository;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.http.whiteboard.annotations.RequireHttpWhiteboard;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsName;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;
import org.osgi.util.pushstream.PushStream;
import org.osgi.util.pushstream.QueuePolicyOption;

import de.jena.mdo.geojson.Feature;
import de.jena.mdo.geojson.FeatureCollection;
import de.jena.mdo.geojson.GeojsonFactory;
import de.jena.mdo.geojson.Geometry;
import de.jena.mdo.geojson.LineString;
import de.jena.mdo.geojson.MultiLineString;
import de.jena.mdo.geojson.MultiPoint;
import de.jena.mdo.geojson.MultiPolygon;
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
@RequireMongoEMFRepository
@JaxrsResource
@JaxrsName("demo")
@Component(service = GeoJsonResource.class, scope = ServiceScope.PROTOTYPE)
@Path("/")
public class GeoJsonResource {
	private static final Logger LOG = System.getLogger(GeoJsonResource.class.getName());

	private static final String ASSET_URI = "http://jena.de/mdo/asset/1.0";

	@Reference
	GeojsonFactory factory;
	@Reference
	UTM2Deg utm2deg;

	@Reference(name = "targetRepo")
	ComponentServiceObjects<QueryRepository> emfRepoObjects;

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

		QueryRepository repo = emfRepoObjects.getService();
		IQuery query = repo.createQueryBuilder().allQuery().build();
		ResourceSet resourceSet = repo.getResourceSet();

		EPackage p = resourceSet.getPackageRegistry().getEPackage(ASSET_URI);
		EList<EClassifier> classifiers = p.getEClassifiers();
		EClass eClass = (EClass) classifiers.get(0);
		Map<String, EAttribute> attributes = eClass.getEAttributes().stream().filter(attr -> !attr.isID())
				.collect(Collectors.toMap(attr -> attr.getName(), attr -> attr));

		FeatureCollection featureCollection = factory.createFeatureCollection();
		EList<Feature> features = featureCollection.getFeatures();

		EPushStreamProvider psp = repo.getEObjectByQuery(eClass, query, getLoadOptions());
		PushStream<EObject> stream = createStream(psp);
		stream.onClose(() -> emfRepoObjects.ungetService(repo))
				.onError(t -> LOG.log(Level.ERROR, "Error proccessing transformed Data", t))
				.map(e -> convertFeature(attributes, e)).forEach(features::add);
		return Response.ok(featureCollection).build();

//		return dummy();
	}

	private Feature convertFeature(Map<String, EAttribute> attributes, EObject e) {
		String id = EcoreUtil.getID(e);
		EAttribute eaX = attributes.get("lon");
		EAttribute eaY = attributes.get("lat");

		Double x = (Double) e.eGet(eaX);
		Double y = (Double) e.eGet(eaY);
		double[] deg = utm2deg.toDeg(x, y);
		Feature feature = createFeature(id, createPoint(deg[1], deg[0]));
		EMap<String, String> properties = feature.getProperties();
		attributes.forEach((t, u) -> properties.put(t, e.eGet(u).toString()));
		return feature;
	}

	private Map<Object, Object> getLoadOptions() {
		Map<Object, Object> loadOptions = new HashMap<>();
		loadOptions.put(Options.OPTION_BATCH_SIZE, Integer.valueOf(100));
		loadOptions.put(Options.OPTION_READ_DETACHED, Boolean.TRUE);
		loadOptions.put(MongoPushStreamConstants.OPTION_QUERY_PUSHSTREAM, Boolean.TRUE);
		return loadOptions;
	}

	private PushStream<EObject> createStream(EPushStreamProvider psp) {
		return psp.createPushStreamBuilder().withQueuePolicy(QueuePolicyOption.BLOCK)
				.withExecutor(Executors.newSingleThreadExecutor()).withBuffer(new ArrayBlockingQueue<>(1200)).build();
	}

	private Response dummy() {
		FeatureCollection featureCollection = factory.createFeatureCollection();
		EList<Feature> features = featureCollection.getFeatures();

		for (int i = 0; i < 100; i++) {
			Feature pointFeature = createFeature("" + i, createRandomPoint());
			features.add(pointFeature);
		}
		features.add(createFeature("1001", createPolygon()));
		features.add(createFeature("1002", createMultipoint()));
		features.add(createFeature("1003", createLineString()));
		features.add(createFeature("1004", createMultiLineString()));
		features.add(createFeature("1005", createMultiPolygon()));

		return Response.ok(featureCollection).build();
	}

	private Point createRandomPoint() {
		double lan = (Math.random() - 0.5) / 30 + 11.58600;
		double lon = (Math.random() - 0.5) / 50 + 50.92700;
		return createPoint(lan, lon);
	}

	private Feature createFeature(String id, Geometry geometry) {
		Feature feature = factory.createFeature();
		feature.setId(id);
		feature.setType("Feature");
		feature.setGeometry(geometry);
		addProperty(feature, "name", geometry.eClass().getName() + " " + id);
		return feature;
	}

	private void addProperty(Feature feature, String key, String value) {
		EMap<String, String> properties = feature.getProperties();
		properties.put(key, value);
	}

	private Point createPoint(double lat, double lon) {
		Point geo1 = factory.createPoint();
		EList<Double> coordinates = geo1.getCoordinates();
		coordinates.add(lat);
		coordinates.add(lon);
		return geo1;
	}

	private MultiPoint createMultipoint() {
		MultiPoint multipoint = factory.createMultiPoint();
		EList<Double[]> coordinates = multipoint.getCoordinates();
		coordinates.add(new Double[] { 11.58710, 50.92878 });
		coordinates.add(new Double[] { 11.58760, 50.92878 });
		coordinates.add(new Double[] { 11.58810, 50.92878 });
		coordinates.add(new Double[] { 11.58860, 50.92078 });
		return multipoint;
	}

	private LineString createLineString() {
		LineString lineString = factory.createLineString();
		EList<Double[]> coordinates = lineString.getCoordinates();
		coordinates.add(new Double[] { 11.58710, 50.92978 });
		coordinates.add(new Double[] { 11.58760, 50.92928 });
		coordinates.add(new Double[] { 11.58810, 50.92978 });
		coordinates.add(new Double[] { 11.58860, 50.92928 });
		return lineString;
	}

	private MultiLineString createMultiLineString() {
		MultiLineString lineString = factory.createMultiLineString();
		EList<Double[][]> coordinates = lineString.getCoordinates();
		coordinates.add(new Double[][] { { 11.58910, 50.92978 }, { 11.58960, 50.92928 }, { 11.59110, 50.92978 },
				{ 11.59160, 50.92928 } });
		coordinates.add(new Double[][] { { 11.58910, 50.92998 }, { 11.58960, 50.92948 }, { 11.59110, 50.92998 },
				{ 11.59160, 50.92948 } });
		return lineString;
	}

	private Geometry createPolygon() {
		Polygon geo = factory.createPolygon();
		EList<Double[][]> coordinates = geo.getCoordinates();
		coordinates.add(new Double[][] { { 11.58700, 50.92878 }, { 11.58600, 50.92878 }, { 11.58600, 50.92978 },
				{ 11.58700, 50.92978 } });
		return geo;
	}

	private Geometry createMultiPolygon() {
		MultiPolygon geo = factory.createMultiPolygon();
		EList<Double[][][]> coordinates = geo.getCoordinates();
		coordinates.add(new Double[][][] {
				{ { 11.57700, 50.92878 }, { 11.57600, 50.92878 }, { 11.57600, 50.92978 }, { 11.57700, 50.92978 } },
				{ { 11.57610, 50.92988 }, { 11.57510, 50.92998 }, { 11.57510, 50.93078 }, { 11.57610, 50.93088 } } });
		return geo;
	};
}
