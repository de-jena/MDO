package de.jena.mdo.jdbc.driver.common.datasource;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.ShardingKeyBuilder;
import java.util.logging.Logger;

import javax.sql.DataSource;

public abstract class AbstractDelegateDataSource implements DataSource {

	private DataSource dataSource;

	public AbstractDelegateDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public <T> T unwrap(Class<T> iface) throws SQLException {
		return dataSource.unwrap(iface);
	}

	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return dataSource.isWrapperFor(iface);
	}

	public Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

	public Connection getConnection(String username, String password) throws SQLException {
		return dataSource.getConnection(username, password);
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return dataSource.getParentLogger();
	}

	public PrintWriter getLogWriter() throws SQLException {
		return dataSource.getLogWriter();
	}

	public void setLogWriter(PrintWriter out) throws SQLException {
		dataSource.setLogWriter(out);
	}

	public void setLoginTimeout(int seconds) throws SQLException {
		dataSource.setLoginTimeout(seconds);
	}

	public int getLoginTimeout() throws SQLException {
		return dataSource.getLoginTimeout();
	}

	public ConnectionBuilder createConnectionBuilder() throws SQLException {
		return dataSource.createConnectionBuilder();
	}

	public ShardingKeyBuilder createShardingKeyBuilder() throws SQLException {
		return dataSource.createShardingKeyBuilder();
	}
}
