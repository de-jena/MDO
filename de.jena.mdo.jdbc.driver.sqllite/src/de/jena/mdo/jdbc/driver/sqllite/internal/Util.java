package de.jena.mdo.jdbc.driver.sqllite.internal;

import java.sql.SQLException;
import java.util.Optional;

import org.sqlite.SQLiteConfig;

import de.jena.mdo.jdbc.driver.sqllite.Config;

public class Util {
	
	public static SQLiteConfig transformConfig(Config config) throws SQLException {
		SQLiteConfig c = new SQLiteConfig();

		Optional.of(config.applicationId()).ifPresent(c::setApplicationId);
		Optional.of(config.busyTimeout()).ifPresent(c::setBusyTimeout);
		Optional.of(config.dateClass()).ifPresent(v -> c.setDateClass(v.getValue()));
		Optional.of(config.dateStringFormat()).ifPresent(c::setDateStringFormat);
		Optional.of(config.deferForeignKeys()).ifPresent(c::deferForeignKeys);
		Optional.of(config.defaultCacheSize()).ifPresent(c::setDefaultCacheSize);
		Optional.of(config.deferForeignKeys()).ifPresent(c::deferForeignKeys);
		Optional.of(config.encoding()).ifPresent(c::setEncoding);
		Optional.of(config.caseSensitiveLike()).ifPresent(c::enableCaseSensitiveLike);
		Optional.of(config.fullSync()).ifPresent(c::enableFullSync);
		Optional.of(config.enforceForeignKeys()).ifPresent(c::enforceForeignKeys);
		Optional.of(config.hexKeyMode()).ifPresent(c::setHexKeyMode);
		Optional.of(config.incrementalVacuum()).ifPresent(c::incrementalVacuum);
		Optional.of(config.cacheSize()).ifPresent(c::setCacheSize);
		Optional.of(config.journalMode()).ifPresent(c::setJournalMode);
		Optional.of(config.jounalSizeLimit()).ifPresent(c::setJounalSizeLimit);
		Optional.of(config.legacyFileFormat()).ifPresent(c::useLegacyFileFormat);
		Optional.of(config.lockingMode()).ifPresent(c::setLockingMode);
		Optional.of(config.loadExtensionEnabled()).ifPresent(c::enableLoadExtension);
		Optional.of(config.maxPageCount()).ifPresent(c::setMaxPageCount);
		Optional.of(config.pageSize()).ifPresent(c::setPageSize);
		Optional.of(config.readOnly()).ifPresent(c::setReadOnly);
		Optional.of(config.readUncommited()).ifPresent(c::setReadUncommited);
		Optional.of(config.recursiveTriggers()).ifPresent(c::enableRecursiveTriggers);
		Optional.of(config.reverseUnorderedSelects()).ifPresent(c::enableReverseUnorderedSelects);
		Optional.of(config.sharedCache()).ifPresent(c::setSharedCache);
		Optional.of(config.shortColumnNames()).ifPresent(c::enableShortColumnNames);
		Optional.of(config.synchronous()).ifPresent(c::setSynchronous);
		Optional.of(config.tempStore()).ifPresent(c::setTempStore);
		Optional.of(config.tempStoreDirectory()).ifPresent(c::setTempStoreDirectory);
		Optional.of(config.transactionMode()).ifPresent(c::setTransactionMode);
		Optional.of(config.userVersion()).ifPresent(c::setUserVersion);

		if (config.datePrecision() == null) {
			c.setDatePrecision(config.datePrecision().toString());
		}

		return c;
	}
}
