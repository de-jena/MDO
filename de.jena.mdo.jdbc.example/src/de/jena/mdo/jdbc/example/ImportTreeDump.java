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
package de.jena.mdo.jdbc.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jdbc.DataSourceFactory;

/**
 * 
 * @author mark
 * @since 13.06.2022
 */
@Component
public class ImportTreeDump extends AbstractImportDump {
	
	@Activate
	public void activate(BundleContext bctx) {
		startCSVImport(bctx, "TREE");
	}

	/**
	 * Sets the dsf.
	 * @param dsf the dsf to set
	 */
	@Reference
	public void setDataSourceFactory(DataSourceFactory dsf) {
		super.setDataSourceFactory(dsf);
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.jdbc.example.AbstractImportDump#getDatabaseName()
	 */
	@Override
	String getDatabaseName() {
		return "tree";
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.jdbc.example.AbstractImportDump#getDumpDataPath()
	 */
	@Override
	String getDumpDataPath() {
		return "data/jena_baeume.csv";
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.jdbc.example.AbstractImportDump#createTables(java.sql.Connection)
	 */
	@Override
	void createTables(Connection derby) throws SQLException {
		derby.createStatement().execute("CREATE TABLE \"TREE\" (\n"
				+ "	\"TREEID\"	INTEGER NOT NULL,\n"
				+ "	\"ALKNUMMER\"	VARCHAR(25),\n"
				+ "	\"ARGLR\"	VARCHAR(32),\n"
				+ "	\"BAUMHOEHE\"	VARCHAR(18),\n"
				+ "	\"BAUMNUMMER\"	VARCHAR(20),\n"
				+ "	\"DATLR\"	DATE,\n"
				+ "	\"GATTUNG\"	VARCHAR(80),\n"
				+ "	\"GATTUNGART\"	VARCHAR(8),\n"
				+ "	\"GA_LANG\"	VARCHAR(80),\n"
				+ "	\"GEBIET\"	VARCHAR(80),\n"
				+ "	\"GEFAELLTAM\"	DATE,\n"
				+ "	\"GISID\"	VARCHAR(20),\n"
				+ "	\"GUID\"	VARCHAR(20),\n"
				+ "	\"HOCHWERT\"	FLOAT,\n"
				+ "	\"KREISDURCHM\"	NUMERIC,\n"
				+ "	\"NAMLR\"	VARCHAR(3),\n"
				+ "	\"PFLANZJAHR\"	INTEGER,\n"
				+ "	\"RECHTSWERT\"	FLOAT,\n"
				+ "	\"STANDORT\"	VARCHAR(80),\n"
				+ "	\"STRASSE\"	VARCHAR(80),\n"
				+ "	\"STDURCHM\"	INTEGER,\n"
				+ "	\"STUMFANG\"	NUMERIC,\n"
				+ "	\"VITALITAET\"	INTEGER,\n"
				+ "	\"OBJKUERZEL\"	VARCHAR(8),\n"
				+ "	\"PFLEGEBEREICH\"	VARCHAR(8),\n"
				+ "	\"TOUR\"	VARCHAR(120),\n"
				+ "	\"HRHERKUNFT\"	VARCHAR(1),\n"
				+ "	\"HISTORISCHAM\"	DATE,\n"
				+ "	PRIMARY KEY(\"TREEID\")\n"
				+ ")");
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.jdbc.example.AbstractImportDump#executeStatement(java.sql.Connection)
	 */
	@Override
	void executeStatement(Connection c) {
		try {
			Statement statement = c.createStatement();
			ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM TREE");
			while (rs.next()) {
		        Object o1 = rs.getObject(1);
		        System.out.println("Statement: " + o1);
		      }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
