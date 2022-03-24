package de.jena.mdo.jdbc.driver.sqllite.datasource;

import java.sql.SQLException;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.PooledConnection;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.metatype.annotations.Designate;
import org.sqlite.javax.SQLiteConnectionPoolDataSource;

import de.jena.mdo.jdbc.driver.common.datasource.AbstractDelegateConnectionPoolDataSource;
import de.jena.mdo.jdbc.driver.sqllite.util.Util;

@Designate(ocd = Config.class, factory = true)
@Component(service = ConnectionPoolDataSource.class, scope = ServiceScope.PROTOTYPE)
public class ConnectionPoolDataSourceService extends AbstractDelegateConnectionPoolDataSource {

	private Config config;

	@Activate
	public ConnectionPoolDataSourceService(Config config) throws SQLException {

		super(new SQLiteConnectionPoolDataSource(Util.transformConfig(config)));
		this.config = config;
	}
	// no @Modified to force consumed Services get new configured connections.
	@Deactivate
	public void deactivate() {
		config = null;
	}

	@Override
	public PooledConnection getPooledConnection() throws SQLException {

		return super.getPooledConnection(config.username(), config._password());
	}

}
