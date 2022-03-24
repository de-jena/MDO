package de.jena.mdo.jdbc.driver.sqllite;

import java.sql.Driver;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.DataSource;
import javax.sql.XADataSource;

import org.osgi.service.jdbc.DataSourceFactory;
import org.sqlite.JDBC;
import org.sqlite.SQLiteConfig;
import org.sqlite.SQLiteDataSource;
import org.sqlite.javax.SQLiteConnectionPoolDataSource;

public class SqliteDataSourceFactory implements DataSourceFactory {

	// Driver is not configurable.
	private static final JDBC driver = new JDBC();

	@Override
	public DataSource createDataSource(Properties props) throws SQLException {
		SQLiteDataSource dataSource = new SQLiteDataSource();
		dataSource.setConfig(new SQLiteConfig(props));
		return dataSource;
	}

	@Override
	public ConnectionPoolDataSource createConnectionPoolDataSource(Properties props) throws SQLException {
		SQLiteConnectionPoolDataSource dataSource = new SQLiteConnectionPoolDataSource();
		dataSource.setConfig(new SQLiteConfig(props));
		return dataSource;
	}

	@Override
	public XADataSource createXADataSource(Properties props) throws SQLException {
		throw new SQLFeatureNotSupportedException("XADataSource not implemented");
	}

	@Override
	public Driver createDriver(Properties props) throws SQLException {
		return driver;
	}

	String getVersion() {
		return driver.getMajorVersion() + "." + driver.getMinorVersion();
	}

}
