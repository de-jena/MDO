/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.jena.mdo.citizen.jpa.model.tests;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.junit5.context.BundleContextExtension;

import de.jena.mdo.jpa.citizen.einwohner;
import de.jena.mdo.jpa.citizen.gender;
import de.jena.mdo.jpa.citizen.plraum;
import de.jena.mdo.jpa.citizen.statbez;
import de.jena.mdo.jpa.citizen.town;

@ExtendWith(BundleContextExtension.class)
public class CitizenModelTest {

//	@BeforeEach
//	public void before() {
//		// TODO add test setup here
//	}
//
//	@AfterEach
//	public void after() {
//		// TODO add test clear up here
//	}

	@Test
	public void testLoadEinwohner() {
		einwohner ew = loadEinwohner();
		assertThat(ew).isNotNull();
	}

	@Test
	void testLoadStatBez() {
		statbez sb = loadStatBez(12);
		assertThat(sb)//
				.extracting(statbez::getPlraum)//
				.extracting(plraum::getPlraum) //
				.isEqualTo("Winzerla");
		assertThat(sb)//
				.extracting(statbez::getStatbez_name, statbez::getUuid) //
				.containsExactly("Beutenberg / Winzerlaer Straße", "9bf45940-98e0-4201-bdab-45ea6815740b");
	}

	@Test
	void testLoadTown() {
		town t = loadTown(1);
		assertThat(t)//
				.extracting(town::getName)//
				.isEqualTo("Jena");
	}

	@Test
	void testLoadGender() throws Exception {
		gender g = loadGender("M");
		assertThat(g)//
				.extracting(gender::getName)//
				.isEqualTo("männlich");
	}

	private gender loadGender(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private town loadTown(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private statbez loadStatBez(int gid) {
		// TODO Auto-generated method stub
		return null;
	}

	private einwohner loadEinwohner() {
		// TODO Auto-generated method stub
		return null;
	}

}