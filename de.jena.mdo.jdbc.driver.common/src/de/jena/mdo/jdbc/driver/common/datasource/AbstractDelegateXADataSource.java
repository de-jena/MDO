package de.jena.mdo.jdbc.driver.common.datasource;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.ShardingKeyBuilder;
import java.util.logging.Logger;

import javax.sql.XAConnection;
import javax.sql.XAConnectionBuilder;
import javax.sql.XADataSource;

public abstract class AbstractDelegateXADataSource implements XADataSource {

	protected abstract XADataSource getDelegate();

	public XAConnection getXAConnection() throws SQLException {
		return getDelegate().getXAConnection();
	}

	public XAConnection getXAConnection(String user, String password) throws SQLException {
		return getDelegate().getXAConnection(user, password);
	}

	public PrintWriter getLogWriter() throws SQLException {
		return getDelegate().getLogWriter();
	}

	public void setLogWriter(PrintWriter out) throws SQLException {
		getDelegate().setLogWriter(out);
	}

	public void setLoginTimeout(int seconds) throws SQLException {
		getDelegate().setLoginTimeout(seconds);
	}

	public int getLoginTimeout() throws SQLException {
		return getDelegate().getLoginTimeout();
	}

	public XAConnectionBuilder createXAConnectionBuilder() throws SQLException {
		return getDelegate().createXAConnectionBuilder();
	}

	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return getDelegate().getParentLogger();
	}

	public ShardingKeyBuilder createShardingKeyBuilder() throws SQLException {
		return getDelegate().createShardingKeyBuilder();
	}

}
