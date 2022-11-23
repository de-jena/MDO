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
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import org.osgi.framework.BundleContext;
import org.osgi.service.jdbc.DataSourceFactory;
import org.osgi.util.promise.PromiseFactory;

/**
 * 
 * @author mark
 * @since 13.06.2022
 */
public abstract class AbstractImportDump {
	
	private static final String DB_TEMPLATE = "jdbc:derby:%s;create=true";
	private final PromiseFactory pf = new PromiseFactory(Executors.newCachedThreadPool());
	private final int BATCH_SIZE = 500;
	private final List<String> batchCache = new ArrayList<String>(BATCH_SIZE);
	private final AtomicInteger count = new AtomicInteger(0);
	private final AtomicInteger batches = new AtomicInteger(1);
	private BundleContext bctx;
	private DataSourceFactory dsf;
	private Connection connection;

	public void startInsertImport(BundleContext bctx) {
		this.bctx = bctx;
		pf.submit(this::doImport).onFailure((t)->t.getCause().printStackTrace());
	}
	
	public void startCSVImport(BundleContext bctx, String importTable) {
		this.bctx = bctx;
		pf.submit(()->doImportCSV(importTable)).onFailure((t)->t.getCause().printStackTrace());
	}
	
	/**
	 * Returns the dsf.
	 * @return the dsf
	 */
	public DataSourceFactory getDataSourceFactory() {
		return dsf;
	}

	/**
	 * Sets the dsf.
	 * @param dsf the dsf to set
	 */
	public void setDataSourceFactory(DataSourceFactory dsf) {
		this.dsf = dsf;
	}
	
	/**
	 * returns the database name to be created.
	 * @return the database name, must not be null
	 */
	abstract String getDatabaseName();
	
	/**
	 * returns the dump data path from within this bundle
	 * @return the dump data path, must not be null
	 */
	abstract String getDumpDataPath();
	
	abstract void executeStatement(Connection c); 

	/**
	 * @param derby
	 * @throws SQLException
	 */
	abstract void createTables(Connection derby) throws SQLException;

	protected Void doImport() {
		String dbUrl = String.format(DB_TEMPLATE, getDatabaseName());
		try {
			connection = getDataSourceFactory().createDriver(null).connect(dbUrl, null);
			try {
				createTables(getConnection());
			} catch (SQLException sqle) {
				if (!sqle.getSQLState().equals("X0Y32")) {
					throw sqle;
				} else {
					return null;
				}
			}
			URL dumpUrl = bctx.getBundle().getEntry(getDumpDataPath());
			try (BufferedReader br = new BufferedReader(new InputStreamReader(dumpUrl.openStream()))) {
				br.lines().map(s->s.substring(0, s.length() - 1)).forEach(this::batchImport);
				importLines(batchCache, getConnection());
				System.out.println("Finished Import " + (BATCH_SIZE * batches.get() + batchCache.size()) + " elements");
			} catch (IOException e) {
				throw new IllegalStateException("Error reading dump file");
			}
		} catch (SQLException e) {
			throw new IllegalStateException("Error connecting to derby", e);
		}
		return null;
	}
	
	protected Void doImportCSV(String table) {
		String dbUrl = String.format(DB_TEMPLATE, getDatabaseName());
		try {
			connection = getDataSourceFactory().createDriver(null).connect(dbUrl, null);
			try {
				createTables(getConnection());
			} catch (SQLException sqle) {
				if (!sqle.getSQLState().equals("X0Y32")) {
					throw sqle;
				} else {
					System.out.println("Table " + table  + " already exists. Not importing.");
					return null;
				}
			}
			URL importUrl = bctx.getBundle().getEntry(getDumpDataPath());
			importCSV(importUrl.toExternalForm(), table, getConnection());
			executeStatement(connection);
		} catch (SQLException e) {
			throw new IllegalStateException("Error connecting to derby", e);
		}
		return null;
	}
	
	protected void batchImport(String importString) {
		if (getConnection() == null) {
			System.out.println("No connection");
			return;
		}
		if (count.compareAndSet(BATCH_SIZE, 0)) {
			importLines(new ArrayList<String>(batchCache), getConnection());
			batchCache.clear();
			batches.incrementAndGet();
		}
		batchCache.add(importString);
		count.incrementAndGet();
	}
	
	protected void importLines(List<String> importStrings, Connection connection) {
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
	
	protected void importCSV(String importFile, String table, Connection connection) {
		PreparedStatement statement;
		try {
			long time = System.currentTimeMillis();
			System.out.println("Importing " + importFile + " ...");
			statement = connection.prepareStatement("CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (?,?,?,?,?,?,0)");
			statement.setString(1,null);
			statement.setString(2,table);
			statement.setString(3,importFile);
			statement.setString(4,";");
			statement.setString(5,"\"");
			statement.setString(6,null);
			boolean execute = statement.execute();
			if (!execute) {
				long count = statement.getLargeUpdateCount();
				System.out.println("Imported " + count + " entries within " + (System.currentTimeMillis() - time) + "ms");
			} else {
				System.out.println("Import was successful: " + execute + " within " + (System.currentTimeMillis() - time) + "ms");
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * Returns the connection.
	 * @return the connection
	 */
	public Connection getConnection() {
		return connection;
	}
}
