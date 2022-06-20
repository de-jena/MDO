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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.util.promise.PromiseFactory;

import org.osgi.service.jdbc.DataSourceFactory;

/**
 * 
 * @author mark
 * @since 13.06.2022
 */
//@Component
public class ImportDump {
	
	private static final String DB_TEMPLATE = "jdbc:derby:%s;create=true";
	private final PromiseFactory pf = new PromiseFactory(Executors.newCachedThreadPool());
	private final int BATCH_SIZE = 500;
	private final List<String> batchCache = new ArrayList<String>(BATCH_SIZE);
	private final AtomicInteger count = new AtomicInteger(0);
	private final AtomicInteger batches = new AtomicInteger(1);
	private BundleContext bctx;
	@Reference
	private DataSourceFactory dsf;
	private Connection connection;

	@Activate
	public void activate(BundleContext bctx) {
		this.bctx = bctx;
		pf.submit(this::doImport).onFailure((t)->t.getCause().printStackTrace());
	}
	
	private Void doImport() {
		String dbUrl = String.format(DB_TEMPLATE, "traffic");
		try {
			connection = dsf.createDriver(null).connect(dbUrl, null);
			createTables(connection);
			URL dumpUrl = bctx.getBundle().getEntry("data/dump.sql");
			try (BufferedReader br = new BufferedReader(new InputStreamReader(dumpUrl.openStream()))) {
				br.lines().map(s->s.substring(0, s.length() - 1)).forEach(this::batchImport);
				importLines(batchCache, connection);
				System.out.println("Finished Import " + (BATCH_SIZE * batches.get() + batchCache.size()) + " elements");
			} catch (IOException e) {
				throw new IllegalStateException("Error reading dump file");
			}
		} catch (SQLException e) {
			throw new IllegalStateException("Error connecting to derby", e);
		}
		return null;
	}
	
	private void batchImport(String importString) {
		if (connection == null) {
			System.out.println("No connection");
			return;
		}
		if (count.compareAndSet(BATCH_SIZE, 0)) {
			importLines(new ArrayList<String>(batchCache), connection);
			batchCache.clear();
			batches.incrementAndGet();
		}
		batchCache.add(importString);
		count.incrementAndGet();
	}
	
	private void importLines(List<String> importStrings, Connection connection) {
		Statement statement;
		try {
			System.out.println("Batching " + importStrings.size() + " imports ...");
			statement = connection.createStatement();
			importStrings.forEach(t -> {
				try {
					statement.addBatch(t);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			int[] executeBatch = statement.executeBatch();
			System.out.println("Inserted " + executeBatch.length * batches.get() + " elements");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
	}

	/**
	 * @param derby
	 * @throws SQLException
	 */
	private void createTables(Connection derby) throws SQLException {
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
