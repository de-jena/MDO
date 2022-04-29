package de.jena.mdo.jdbc.driver.sqllite.datasource;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.metatype.annotations.Designate;
import org.sqlite.SQLiteDataSource;

import de.jena.mdo.jdbc.driver.common.datasource.AbstractDelegateDataSource;
import de.jena.mdo.jdbc.driver.sqllite.util.Util;

@Designate(ocd = Config.class, factory = true)
@Component(service = DataSource.class, scope = ServiceScope.PROTOTYPE)
public class DataSourceService extends AbstractDelegateDataSource {

	private Config config;

	@Activate
	public DataSourceService(Config config) throws SQLException {

		super(new SQLiteDataSource(Util.transformConfig(config)));
		this.config = config;
	}
	// no @Modified to force consumed Services get new configured connections.

	@Deactivate
	public void deactivate() {

		config = null;
	}

	@Override
	public Connection getConnection() throws SQLException {

		return super.getConnection(config.username(), config._password());
	}

}
