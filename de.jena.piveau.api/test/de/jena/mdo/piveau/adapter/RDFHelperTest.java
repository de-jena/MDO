package de.jena.mdo.piveau.adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import de.jena.piveau.api.RDFHelper;
import de.jena.piveau.dcat.Dataset;
import de.jena.piveau.dcat.Distribution;
import de.jena.piveau.terms.Standard;
import de.jena.piveau.terms.StandardType;

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
	public void testDistributionFull() {
		Map<String, Object> data = new HashMap<>();
		data.put("distribution.id", "test");
		data.put("distribution.title", "Test Distribution");
		data.put("distribution.description", "Beschreibung für Test-Distribution");
		data.put("distribution.access.url", "http://test.de");
		data.put("distribution.mediaType", "application/xml");
		data.put("distribution.model.name", "testmodel");
		data.put("distribution.model.ns", "http://test.de/models/testmodel");
		data.put("distribution.model.description", "Beschreibung für testmodel");
		data.put("distribution.distributionHost", "localhorst");
		data.put("distribution.catalogueId", "demo");
		Distribution dist = RDFHelper.createDistribution(data);
		assertNotNull(dist);
		assertEquals("https://localhorst/demo/test", dist.getAbout());
		assertEquals(1, dist.getAccessURL().size());
		assertEquals("http://test.de", dist.getAccessURL().get(0).getResource());
		assertEquals(1, dist.getConformsTo().size());
		Standard standard = dist.getConformsTo().get(0);
		StandardType standardType = standard.getStandard();
		assertEquals(1, standardType.getTitle().size());
		assertEquals("testmodel", standardType.getTitle().get(0).getValue());
		assertEquals("http://test.de/models/testmodel", standardType.getAbout());
		assertEquals(1, standardType.getDescription().size());
		assertEquals("Beschreibung für testmodel", standardType.getDescription().get(0).getValue());
		
		assertEquals(1, dist.getMediaType().size());
		assertEquals("application/xml", dist.getMediaType().get(0));
		assertNotNull(dist.getFormat());
		assertEquals("application/xml", dist.getFormat().getResource());
		
	}
	
	@Test
	public void testDistributionMinMendatory() {
		Map<String, Object> data = new HashMap<>();
		data.put("distribution.id", "test");
		data.put("distribution.title", "Test Distribution");
		data.put("distribution.access.url", "http://test.de");
		data.put("distribution.mediaType", "application/xml");
		Distribution dist = RDFHelper.createDistribution(data);
		assertNotNull(dist);
		assertEquals("https://localhost/test", dist.getAbout());
		assertEquals(1, dist.getAccessURL().size());
		assertEquals("http://test.de", dist.getAccessURL().get(0).getResource());
		assertTrue(dist.getConformsTo().isEmpty());
		
		assertEquals(1, dist.getMediaType().size());
		assertEquals("application/xml", dist.getMediaType().get(0));
		assertNotNull(dist.getFormat());
		assertEquals("application/xml", dist.getFormat().getResource());
	}
	
	@Test
	public void testDatasetFail01() {
		Map<String, Object> data = new HashMap<>();
		assertThrows(IllegalArgumentException.class, ()-> RDFHelper.createDataset(data));
	}
	
	@Test
	public void testDataset01() {
		Map<String, Object> data = new HashMap<>();
		data.put("dataset.id", "example01");
		data.put("dataset.title.en", "Example Dataset 1");
		data.put("dataset.title.de", "Beispiel Dataset 1");
		data.put("dataset.description.en", "This is an example Dataset");
		data.put("dataset.description.de", "Das ist ein Beispiel-Datenset");
		data.put("dataset.issued", "NOW");
		Dataset dataset = RDFHelper.createDataset(data);
		assertNotNull(dataset);
		assertEquals(2, dataset.getDescription().size());
		assertEquals(2, dataset.getTitle().size());
		assertNotNull(dataset.getIssued().getValue());
		assertEquals("https://localhost/example01", dataset.getAbout());
	}
	
	@Test
	public void testDataset02() {
		Map<String, Object> data = new HashMap<>();
		data.put("dataset.id", "example02");
		data.put("dataset.title.de", "Beispiel Dataset 2");
		data.put("dataset.description.de", "Das ist ein Beispiel-Datenset");
		data.put("dataset.issued", "NOW");
		Dataset dataset = RDFHelper.createDataset(data);
		assertNotNull(dataset);
		assertEquals(1, dataset.getDescription().size());
		assertEquals("Das ist ein Beispiel-Datenset", dataset.getDescription().get(0).getValue());
		assertEquals(1, dataset.getTitle().size());
		assertEquals("Beispiel Dataset 2", dataset.getTitle().get(0).getValue());
		assertNotNull(dataset.getIssued().getValue());
		assertEquals("https://localhost/example02", dataset.getAbout());
	}
	
	@Test
	public void testDatasetAbout() {
		Map<String, Object> data = new HashMap<>();
		data.put("dataset.id", "example03");
		data.put("dataset.title.de", "Beispiel Dataset 3");
		data.put("dataset.description.de", "Das ist ein Beispiel-Datenset");
		data.put("dataset.issued", "NOW");
		data.put("dataset.distributionHost", "test.de");
		Dataset dataset = RDFHelper.createDataset(data);
		assertNotNull(dataset);
		assertEquals("https://test.de/example03", dataset.getAbout());
		
		data.put("dataset.distributionHost", "http://test.de");
		dataset = RDFHelper.createDataset(data);
		assertEquals("http://test.de/example03", dataset.getAbout());
		
		data.put("dataset.distributionHost", "https://test.de");
		dataset = RDFHelper.createDataset(data);
		assertEquals("https://test.de/example03", dataset.getAbout());

		data.put("dataset.catalogueId", "foo");
		dataset = RDFHelper.createDataset(data);
		assertEquals("https://test.de/foo/example03", dataset.getAbout());
	}

}
