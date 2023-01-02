package de.jena.mdo.piveau.adapter;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import de.jena.piveau.api.RDFHelper;

public class RDFHelperTest {

	@Test
	public void testDistributionFail01() {
		Map<String, Object> data = new HashMap<>();
		assertThrows(IllegalArgumentException.class, ()-> RDFHelper.createDistribution(data));
	}
	
	@Test
	public void testDistributionFail02() {
		Map<String, Object> data = new HashMap<>();
		data.put("distribution.id", "test");
		data.put("distribution.description", "Beschreibung für Test-Distribution");
		data.put("distribution.access.url", "http://test.de");
		data.put("distribution.mediaType", "application/xml");
		data.put("distribution.model.name", "testmodel");
		data.put("distribution.model.ns", "http://test.de/models/testmodel");
		data.put("distribution.model.description", "Beschreibung für testmodel");
		data.put("distribution.host", "localhorst");
		assertThrows(IllegalArgumentException.class, ()-> RDFHelper.createDistribution(data));
	}
	@Test
	public void testDistribution01() {
		Map<String, Object> data = new HashMap<>();
		data.put("distribution.id", "test");
		data.put("distribution.title", "Test Distribution");
		data.put("distribution.description", "Beschreibung für Test-Distribution");
		data.put("distribution.access.url", "http://test.de");
		data.put("distribution.mediaType", "application/xml");
		data.put("distribution.model.name", "testmodel");
		data.put("distribution.model.ns", "http://test.de/models/testmodel");
		data.put("distribution.model.description", "Beschreibung für testmodel");
		data.put("distribution.host", "localhorst");
		assertNotNull(RDFHelper.createDistribution(data));
	}
	
	@Test
	public void testDistribution02() {
		Map<String, Object> data = new HashMap<>();
		data.put("distribution.id", "test");
		data.put("distribution.title", "Test Distribution");
		data.put("distribution.access.url", "http://test.de");
		data.put("distribution.mediaType", "application/xml");
		data.put("distribution.model.name", "testmodel");
		data.put("distribution.host", "localhorst");
		assertNotNull(RDFHelper.createDistribution(data));
	}
	
	@Test
	public void testDatasetFail01() {
		Map<String, Object> data = new HashMap<>();
		assertThrows(IllegalArgumentException.class, ()-> RDFHelper.createDataset(data));
	}
	
	@Test
	public void testDataset01() {
		Map<String, Object> data = new HashMap<>();
		data.put("dataset.title.en", "Example Dataset 1");
		data.put("dataset.title.de", "Beispiel Dataset 1");
		data.put("dataset.description.en", "This is an example Dataset");
		data.put("dataset.description.de", "Das ist ein Beispiel-Datenset");
		data.put("dataset.issued", "NOW");
		assertNotNull(RDFHelper.createDataset(data));
	}
	
	@Test
	public void testDataset02() {
		Map<String, Object> data = new HashMap<>();
		data.put("dataset.title.de", "Beispiel Dataset 1");
		data.put("dataset.description.de", "Das ist ein Beispiel-Datenset");
		data.put("dataset.issued", "NOW");
		assertNotNull(RDFHelper.createDataset(data));
	}

}
