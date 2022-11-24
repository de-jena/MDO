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
import java.sql.SQLException;

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
//@Component
public class ImportTrafficDump extends AbstractImportDump {
	
	@Reference
	private DataSourceFactory dsf;

	@Activate
	public void activate(BundleContext bctx) {
		startInsertImport(bctx);
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
		return "mdo";
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.jdbc.example.AbstractImportDump#getDumpDataPath()
	 */
	@Override
	String getDumpDataPath() {
		return "data/dump.sql";
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.jdbc.example.AbstractImportDump#executeStatement(java.sql.Connection)
	 */
	@Override
	void executeStatement(Connection c) {
		// TODO Auto-generated method stub
		
	}

	/* 
	 * (non-Javadoc)
	 * @see de.jena.mdo.jdbc.example.AbstractImportDump#createTables(java.sql.Connection)
	 */
	@Override
	void createTables(Connection derby) throws SQLException {
		derby.createStatement().execute("CREATE TABLE \"POINT\" (\n"
				+ "	\"ID\"	INTEGER,\n"
				+ "	\"XCOORD\"	DOUBLE,\n"
				+ "	\"YCOORD\"	DOUBLE,\n"
				+ "	PRIMARY KEY(\"ID\")\n"
				+ ")");
		derby.createStatement().execute("CREATE TABLE \"EDGE\" (\n"
				+ "	\"ID\"	INTEGER,\n"
				+ "	\"FROMPOINTID\"	INTEGER,\n"
				+ "	\"TOPOINTID\"	INTEGER,\n"
				+ "	PRIMARY KEY(\"ID\")\n"
				+ ")");
		derby.createStatement().execute("CREATE TABLE \"EDGEITEM\" (\n"
				+ "	\"EDGEID\"	INTEGER,\n"
				+ "	\"INDEX\"	INTEGER,\n"
				+ "	\"XCOORD\"	DOUBLE,\n"
				+ "	\"YCOORD\"	DOUBLE,\n"
				+ "	PRIMARY KEY(\"EDGEID\",\"INDEX\")\n"
				+ ")");
		derby.createStatement().execute("CREATE TABLE \"DETECTOR\" (\n"
				+ "	\"NO\"	INTEGER,\n"
				+ "	\"CODE\"	VARCHAR(255),\n"
				+ "	\"NAME\"	VARCHAR(255),\n"
				+ "	\"COUNTLOCATIONNO\"	INTEGER,\n"
				+ "	\"TYPENO\"	INTEGER,\n"
				+ "	\"XCOORD\"	DOUBLE,\n"
				+ "	\"YCOORD\"	DOUBLE,\n"
				+ "	\"LANEONLINK\"	INTEGER,\n"
				+ "	\"NUMLANESONLINK\"	INTEGER,\n"
				+ "	\"ENABLED\"	INTEGER,\n"
				+ "	\"NODENO\"	INTEGER,\n"
				+ "	\"MAINNODENO\"	INTEGER,\n"
				+ "	\"CHANNELNO\"	INTEGER,\n"
				+ "	\"STOPLINEDIST\"	DOUBLE,\n"
				+ "	\"LENGTH\"	DOUBLE,\n"
				+ "	\"TSYSSET\"	VARCHAR(255),\n"
				+ "	\"SCNO\"	INTEGER,\n"
				+ "	\"DETECTORTYPE\"	VARCHAR(255),\n"
				+ "	\"DELAY\"	DOUBLE,\n"
				+ "	\"EXTEND\"	DOUBLE,\n"
				+ "	\"CARRYOVER\"	DOUBLE,\n"
				+ "	\"QUEUELIMIT\"	INTEGER,\n"
				+ "	\"DETECTORMODE\"	VARCHAR(255),\n"
				+ "	\"ADDEDINITIALMODE\"	INTEGER,\n"
				+ "	\"CALL\"	VARCHAR(255),\n"
				+ "	\"AMBERLOCK\"	VARCHAR(255),\n"
				+ "	\"REDLOCK\"	VARCHAR(255),\n"
				+ "	\"EXTENDSGS\"	VARCHAR(255),\n"
				+ "	\"XSWITCHSGS\"	VARCHAR(255),\n"
				+ "	\"VEHDETECTORNO\"	INTEGER,\n"
				+ "	\"DELAYON\"	INTEGER,\n"
				+ "	\"DELAYOFF\"	INTEGER,\n"
				+ "	\"CONTROL\"	VARCHAR(255),\n"
				+ "	\"ACTION\"	VARCHAR(255),\n"
				+ "	\"ACTIONSGNO\"	INTEGER,\n"
				+ "	\"ACTIONPREEMPTNO\"	INTEGER,\n"
				+ "	\"ACTIONTRANSITSGNO\"	INTEGER,\n"
				+ "	\"RBCNO\"	INTEGER,\n"
				+ "	\"LABELPOSRELX\"	DOUBLE,\n"
				+ "	\"LABELPOSRELY\"	DOUBLE,\n"
				+ "	\"DET_AU\"	VARCHAR(255),\n"
				+ "	\"DET_BEM\"	VARCHAR(255),\n"
				+ "	\"DET_KO\"	INTEGER,\n"
				+ "	\"DET_Q\"	VARCHAR(255),\n"
				+ "	\"DET_QS\"	INTEGER,\n"
				+ "	\"DET_SP\"	VARCHAR(255),\n"
				+ "	\"DET_ST\"	VARCHAR(255),\n"
				+ "	\"DET_VO\"	VARCHAR(255),\n"
				+ "	PRIMARY KEY(\"NO\")\n"
				+ ")");
	}
}
