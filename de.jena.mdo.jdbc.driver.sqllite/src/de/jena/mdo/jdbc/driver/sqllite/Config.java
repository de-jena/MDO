package de.jena.mdo.jdbc.driver.sqllite;

import java.sql.SQLException;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.sqlite.SQLiteConfig.DateClass;
import org.sqlite.SQLiteConfig.DatePrecision;
import org.sqlite.SQLiteConfig.Encoding;
import org.sqlite.SQLiteConfig.HexKeyMode;
import org.sqlite.SQLiteConfig.JournalMode;
import org.sqlite.SQLiteConfig.LockingMode;
import org.sqlite.SQLiteConfig.SynchronousMode;
import org.sqlite.SQLiteConfig.TempStore;
import org.sqlite.SQLiteConfig.TransactionMode;
import org.sqlite.SQLiteOpenMode;

@ObjectClassDefinition()
public interface Config {

	@AttributeDefinition(description = "username")
	default String username() {
		return null;
	}

	@AttributeDefinition(description = "password", type = AttributeType.PASSWORD)
	default String _password() {
		return null;
	}

	@AttributeDefinition(description = "open mode flags. http://www.sqlite.org/c3ref/c_open_autoproxy.html")
	default SQLiteOpenMode[] openModeFlags() {
		return null;
	}

	@AttributeDefinition(description = "Enables or disables the sharing of the database cache and schema data \nstructures between connections to the same database. \n@param enable True to enable; false to disable. \n@see ww.sqlite.org/c3ref/enable_shared_cache.html")
	public default Boolean sharedCache() {
		return null;
	}

	@AttributeDefinition(description = "Enables or disables extension loading. \n@param enable True to enable; false to disable. \n@see ww.sqlite.org/c3ref/load_extension.html")
	public default Boolean loadExtensionEnabled() {
		return null;
	}

	@AttributeDefinition(description = "Sets the read-write mode for the database. \n@param readOnly True for read-only; otherwise read-write.")
	public default Boolean readOnly() {
		return null;
	}

	@AttributeDefinition(description = "Changes the maximum number of database disk pages that SQLite will hold \nin memory at once per open database file. \n@param numberOfPages Cache size in number of pages. \n@see ww.sqlite.org/pragma.html#pragma_cache_size")
	public default Integer cacheSize() {
		return null;
	}

	@AttributeDefinition(description = "Enables or disables case sensitive for the LIKE operator. \n@param enable True to enable; false to disable. \n@see ww.sqlite.org/pragma.html#pragma_case_sensitive_like")
	public default Boolean caseSensitiveLike() {
		return null;
	}

	@AttributeDefinition(description = "Sets the suggested maximum number of database disk pages that SQLite will \nhold in memory at once per open database file. The cache size set here \npersists across database connections. \n@param numberOfPages Cache size in number of pages. \n@see ww.sqlite.org/pragma.html#pragma_cache_size")
	public default Integer defaultCacheSize() {
		return null;
	}

	@AttributeDefinition(description = "Defers enforcement of foreign key constraints until the outermost \ntransaction is committed. \n@param enable True to enable; false to disable; \n@see www.sqlite.org/pragma.html#pragma_defer_foreign_keys")
	public default Boolean deferForeignKeys() {
		return null;
	}

	@AttributeDefinition(description = "Sets the text encoding used by the main database. \n@param encoding One of {@link Encoding} \n@see ww.sqlite.org/pragma.html#pragma_encoding")
	public default Encoding encoding() {
		return null;
	}

	@AttributeDefinition(description = "Whether to enforce foreign key constraints. This setting affects the \nexecution of all statements prepared using the database connection, \nincluding those prepared before the setting was changed. \n@param enforce True to enable; false to disable. \n@see ww.sqlite.org/pragma.html#pragma_foreign_keys")
	public default Boolean enforceForeignKeys() {
		return null;
	}

	@AttributeDefinition(description = "Enables or disables the fullfsync flag. This flag determines whether or \nnot the F_FULLFSYNC syncing method is used on systems that support it. \nThe default value of the fullfsync flag is off. Only Mac OS X supports \nF_FULLFSYNC. \n@param enable True to enable; false to disable. \n@see ww.sqlite.org/pragma.html#pragma_fullfsync")
	public default Boolean fullSync() {
		return null;
	}

	@AttributeDefinition(description = "Sets the incremental_vacuum value; the number of pages to be removed from \nthe ww.sqlite.org/pragma.html#pragma_incremental_vacuum")
	public default Integer incrementalVacuum() {
		return null;
	}

	@AttributeDefinition(description = "Sets the journal mode for databases associated with the current database \nconnection. \n@param mode One of {@link JournalMode} \n@see ww.sqlite.org/pragma.html#pragma_journal_mode")
	public default JournalMode journalMode() {
		return null;
	}

	@AttributeDefinition(description = "Sets the journal_size_limit. This setting limits the size of the \nrollback-journal and WAL files left in the file-system after transactions \nor checkpoints. \n@param limit Limit value in bytes. A negative number implies no limit. \n@see ww.sqlite.org/pragma.html#pragma_journal_size_limit")
	public default Integer jounalSizeLimit() {
		return null;
	}

	@AttributeDefinition(description = "Sets the value of the legacy_file_format flag. When this flag is enabled, \nnew SQLite databases are created in a file format that is readable and \nwritable by all versions of SQLite going back to 3.0.0. When the flag is \noff, new databases are created using the latest file format which might \nnot be readable or writable by versions of SQLite prior to 3.3.0. \n@param use True to turn on legacy file format; false to turn off. \n@see ww.sqlite.org/pragma.html#pragma_legacy_file_format")
	public default Boolean legacyFileFormat() {
		return null;
	}

	@AttributeDefinition(description = "Sets the database connection locking-mode. \n@param mode One of {@link LockingMode} \n@see ww.sqlite.org/pragma.html#pragma_locking_mode")
	public default LockingMode lockingMode() {
		return null;
	}

	@AttributeDefinition(description = "Sets the page size of the database. The page size must be a power of two \nbetween 512 and 65536 inclusive. \n@param numBytes A power of two between 512 and 65536 inclusive. \n@see ww.sqlite.org/pragma.html#pragma_page_size")
	public default Integer pageSize() {
		return null;
	}

	@AttributeDefinition(description = "Sets the maximum number of pages in the database file. \n@param numPages Number of pages. \n@see ww.sqlite.org/pragma.html#pragma_max_page_count")
	public default Integer maxPageCount() {
		return null;
	}

	@AttributeDefinition(description = "Enables or disables useReadUncommitedIsolationMode. \n@param useReadUncommitedIsolationMode True to turn on; false to disable. \ndisabled otherwise. \n@see ww.sqlite.org/pragma.html#pragma_read_uncommitted")
	public default Boolean readUncommited() {
		return null;
	}

	@AttributeDefinition(description = "Enables or disables the recursive trigger capability. \n@param enable True to enable the recursive trigger capability. \n@see ww.sqlite.org/pragma.html#pragma_recursive_triggers")
	public default Boolean recursiveTriggers() {
		return null;
	}

	@AttributeDefinition(description = "Enables or disables the reverse_unordered_selects flag. This setting \ncauses SELECT statements without an ORDER BY clause to emit their results \nin the reverse order of what they normally would. This can help debug \napplications that are making invalid assumptions about the result order. \n@param enable True to enable reverse_unordered_selects. \n@see ww.sqlite.org/pragma.html#pragma_reverse_unordered_selects")
	public default Boolean reverseUnorderedSelects() {
		return null;
	}

	@AttributeDefinition(description = "Enables or disables the short_column_names flag. This flag affects the \nway SQLite names columns of data returned by SELECT statements. \n@param enable True to enable short_column_names. \n@see ww.sqlite.org/pragma.html#pragma_short_column_names")
	public default Boolean shortColumnNames() {
		return null;
	}

	@AttributeDefinition(description = "Changes the setting of the 'synchronous' flag. \n@param mode One of {@link SynchronousMode}:<ul> \n<li> OFF - SQLite continues without syncing as soon as it has handed \ndata off to the operating system</li> \n<li> NORMAL - the SQLite database engine will still sync at the most \ncritical moments, but less often than in FULL mode</li> \n<li> FULL - the SQLite database engine will use the xSync method of the \nVFS to ensure that all content is safely written to the disk surface \nprior to continuing. This ensures that an operating system crash or power \nfailure will not corrupt the database.</li></ul> \n@see ww.sqlite.org/pragma.html#pragma_synchronous")
	public default SynchronousMode synchronous() {
		return null;
	}

	@AttributeDefinition(description = "Changes the setting of the 'hexkey' flag. \n@param mode One of {@link HexKeyMode}:<ul> \n<li> NONE - SQLite uses a string based password</li> \n<li> SSE - the SQLite database engine will use pragma hexkey = '' to set the password</li> \n<li> SQLCIPHER - the SQLite database engine calls pragma key = 'x' to set the password</li></ul>")
	public default HexKeyMode hexKeyMode() {
		return null;
	}

	@AttributeDefinition(description = "Changes the setting of the 'temp_store' parameter. \n@param storeType One of {@link TempStore}:<ul> \n<li> DEFAULT - the compile-time C preprocessor macro SQLITE_TEMP_STORE \nis used to determine where temporary tables and indices are stored</li> \n<li>FILE - temporary tables and indices are stored in a file.</li></ul> \n<li>MEMORY - temporary tables and indices are kept in as if they were pure \nin-memory databases memory</li> \n@see www.sqlite.org/pragma.html#pragma_temp_store")
	public default TempStore tempStore() {
		return null;
	}

	@AttributeDefinition(description = "Changes the value of the sqlite3_temp_directory global variable, which many operating-system \ninterface backends use to determine where to store temporary tables and indices. \n@param directoryName Directory name for storing temporary tables and indices. \n@see ww.sqlite.org/pragma.html#pragma_temp_store_directory")
	public default String tempStoreDirectory() {
		return null;
	}

	@AttributeDefinition(description = "Set the value of the user-version. The user-version is not used \ninternally by SQLite. It may be used by applications for any purpose. The \nvalue is stored in the database header at offset 60. \n@param version A big-endian 32-bit signed integer. \n@see ww.sqlite.org/pragma.html#pragma_user_version")
	public default Integer userVersion() {
		return null;
	}

	@AttributeDefinition(description = "Set the value of the application-id. The application-id is not used \ninternally by SQLite. Applications that use SQLite as their application file-format  \nshould set the Application ID integer to a unique integer so that utilities such as file(1)  \ncan determine the specific file type. The \nvalue is stored in the database header at offset 68. \n@param id A big-endian 32-bit unsigned integer. \n@see ww.sqlite.org/pragma.html#pragma_application_id")
	public default Integer applicationId() {
		return null;
	}

	@AttributeDefinition(description = "Sets the mode that will be used to start transactions. \n@param transactionMode One of {@link TransactionMode}. \n@see www.sqlite.org/lang_transaction.html")
	public default TransactionMode transactionMode() {
		return null;
	}

	@AttributeDefinition(description = "datePrecision One of SECONDS or MILLISECONDS \n@throws SQLException")
	public default DatePrecision datePrecision() throws SQLException {
		return null;
	}

	@AttributeDefinition(description = "dateClass One of INTEGER, TEXT or REAL")
	public default DateClass dateClass() {
		return null;
	}

	@AttributeDefinition(description = "dateStringFormat Format of date string")
	public default String dateStringFormat() {
		return null;
	}

	@AttributeDefinition(description = "@param milliseconds Connect to DB timeout in milliseconds")
	public default Integer busyTimeout() {
		return null;
	}

}