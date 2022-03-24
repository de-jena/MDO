package de.jena.mdo.jdbc.driver.common.datasource;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.ShardingKeyBuilder;
import java.util.logging.Logger;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.PooledConnection;
import javax.sql.PooledConnectionBuilder;

public abstract class AbstractDelegateConnectionPoolDataSource implements ConnectionPoolDataSource {

	private ConnectionPoolDataSource cpDataSource;

	protected AbstractDelegateConnectionPoolDataSource(ConnectionPoolDataSource cpDataSource) {
		this.cpDataSource = cpDataSource;
	}

	public PooledConnection getPooledConnection() throws SQLException {
		return cpDataSource.getPooledConnection();
	}

	public PooledConnection getPooledConnection(String user, String password) throws SQLException {
		return cpDataSource.getPooledConnection(user, password);
	}

	public PrintWriter getLogWriter() throws SQLException {
		return cpDataSource.getLogWriter();
	}

	public void setLogWriter(PrintWriter out) throws SQLException {
		cpDataSource.setLogWriter(out);
	}

	public void setLoginTimeout(int seconds) throws SQLException {
		cpDataSource.setLoginTimeout(seconds);
	}

	public int getLoginTimeout() throws SQLException {
		return cpDataSource.getLoginTimeout();
	}

	public PooledConnectionBuilder createPooledConnectionBuilder() throws SQLException {
		return cpDataSource.createPooledConnectionBuilder();
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return cpDataSource.getParentLogger();
	}

	public ShardingKeyBuilder createShardingKeyBuilder() throws SQLException {
		return cpDataSource.createShardingKeyBuilder();
	}

}
