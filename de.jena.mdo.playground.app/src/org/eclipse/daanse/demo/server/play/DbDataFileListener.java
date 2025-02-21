package org.eclipse.daanse.demo.server.play;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent.Kind;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.daanse.io.fs.watcher.api.FileSystemWatcherListener;
import org.eclipse.daanse.io.fs.watcher.api.FileSystemWatcherWhiteboardConstants;
import org.eclipse.daanse.io.fs.watcher.api.propertytypes.FileSystemWatcherListenerProperties;
import org.eclipse.daanse.jdbc.datasource.metatype.h2.api.Constants;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.cm.annotations.RequireConfigurationAdmin;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(configurationPid = DbDataFileListener.PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
@RequireConfigurationAdmin
@FileSystemWatcherListenerProperties()
public class DbDataFileListener implements FileSystemWatcherListener {

	static final String PID = "DataFileListener";

	static final String KEY_FILE_CONTEXT_MATCHER = "file.context.matcher";
	private static final String PID_H2 = Constants.PID_DATASOURCE;
	private static final String PID_CSV_IMPORTER = org.eclipse.daanse.jdbc.db.importer.csv.api.Constants.PID_CSV_DATA_IMPORTER;

	@Reference
	ConfigurationAdmin configurationAdmin;

	private Map<Path, Configuration> catalogFolderConfigsDS = new ConcurrentHashMap<>();
	private Map<Path, Configuration> catalogFolderConfigsCSV = new ConcurrentHashMap<>();
	private Map<Path, Configuration> catalogFolderConfigsJPA = new ConcurrentHashMap<>();
	private Map<Path, Configuration> catalogFolderConfigsRepos = new ConcurrentHashMap<>();
	private Map<Path, Configuration> catalogFolderConfigsEMF = new ConcurrentHashMap<>();


	@Deactivate
	public void deactivate() {
		catalogFolderConfigsDS.forEach((k,v) -> {
			try {
				v.delete();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		catalogFolderConfigsCSV.forEach((k,v) -> {
			try {
				v.delete();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		catalogFolderConfigsJPA.forEach((k,v) -> {
			try {
				v.delete();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
		catalogFolderConfigsEMF.forEach((k,v) -> {
			try {
				v.delete();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
	
	@Override
	public void handleBasePath(Path basePath) {
	}

	@Override
	public void handleInitialPaths(List<Path> paths) {
		paths.forEach(this::addPath);
	}

	@Override
	public void handlePathEvent(Path path, Kind<Path> kind) {
		System.out.println("received path event " + path.toString() + " - " + kind.toString());
		if (StandardWatchEventKinds.ENTRY_MODIFY.equals(kind)) {
			removePath(path);
			addPath(path);
		} else if (StandardWatchEventKinds.ENTRY_CREATE.equals(kind)) {
			addPath(path);
		} else if (StandardWatchEventKinds.ENTRY_DELETE.equals(kind)) {
			removePath(path);
		}
	}

	private void removePath(Path path) {
		if (!Files.isDirectory(path)) {
			return;
		}

		try {
			Configuration c = catalogFolderConfigsDS.remove(path);
			c.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Configuration c = catalogFolderConfigsCSV.remove(path);
			c.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Configuration c = catalogFolderConfigsJPA.remove(path);
			c.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Configuration c = catalogFolderConfigsEMF.remove(path);
			c.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void addPath(Path path) {
		System.out.println("adding path" + path.toString());
		if (!Files.isDirectory(path)) {
			return;
		}
		String project = path.getName(path.getNameCount() - 1).toString();
		if("cnf".equals(project) || ".metadata".equals(project)) {
			return;
		}
		String pathString = path.toString();

		String matcherKey = pathString.replace("\\", "-.-");
		matcherKey = UUID.randomUUID().toString();

		try {
			createH2DataSource(path, matcherKey);
			createCsvDatabaseImporter(path, matcherKey);
			createJPAConfig(path,matcherKey);
			createEMFModelConfig(path,matcherKey);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void createJPAConfig(Path path, String matcherKey) throws IOException {
		String unitName = path.getName(path.getNameCount() - 1).toString();
		Configuration jpaConfig = configurationAdmin.getFactoryConfiguration("fennec.jpa.EMPersistenceUnit", unitName + "-" + matcherKey,
				"?");

		Dictionary<String, Object> jpaProps = new Hashtable<>();
		jpaProps.put("fennec.jpa.dataSource.target", filterOfMatcherKey(matcherKey));
		jpaProps.put("fennec.jpa.persistenceUnitName", unitName);
		jpaProps.put("fennec.jpa.mapping.target", "(name=" + unitName + ")");
		jpaConfig.update(jpaProps);

		catalogFolderConfigsJPA.put(path, jpaConfig);

		Configuration repoConfig = configurationAdmin.getFactoryConfiguration("fennec.jpa.JPARepository", unitName + "-" + matcherKey,
				"?");
		
		Dictionary<String, Object> repoProps = new Hashtable<>();
		repoProps.put("repo_id", unitName);
		repoProps.put("base_uri", "jpa://" + unitName);
		repoProps.put("entitymanager.target", "(osgi.unit.name=" + unitName + ")");
		repoConfig.update(repoProps);
		
		catalogFolderConfigsRepos.put(path, repoConfig);
	}

	private void createEMFModelConfig(Path path, String matcherKey) throws IOException {
		String pathStringData = path.resolve("models").toString();
		Configuration emfConfig = configurationAdmin.getFactoryConfiguration(EMFFileWatcher.PID, matcherKey,
				"?");
		
		Dictionary<String, Object> props = new Hashtable<>();
		props.put(FileSystemWatcherWhiteboardConstants.FILESYSTEM_WATCHER_PATH, pathStringData);
		emfConfig.update(props);
		
		catalogFolderConfigsEMF.put(path, emfConfig);
	}

	private void createCsvDatabaseImporter(Path path, String matcherKey) throws IOException {
		String pathStringData = path.resolve("data").toString();
		Configuration cCSV = configurationAdmin.getFactoryConfiguration(PID_CSV_IMPORTER, UUID.randomUUID().toString(),
				"?");
		
		Dictionary<String, Object> propsCSV = new Hashtable<>();
		propsCSV.put(FileSystemWatcherWhiteboardConstants.FILESYSTEM_WATCHER_PATH, pathStringData);
		propsCSV.put("dataSource.target", filterOfMatcherKey(matcherKey));
		cCSV.update(propsCSV);
		
		catalogFolderConfigsCSV.put(path, cCSV);
	}

	private void createH2DataSource(Path path, String matcherKey) throws IOException {
		String unitName = path.getName(path.getNameCount() - 1).toString();
		Configuration cH2 = configurationAdmin.getFactoryConfiguration(PID_H2, UUID.randomUUID().toString(), "?");

		Dictionary<String, Object> propsH2 = new Hashtable<>();
		propsH2.put(Constants.DATASOURCE_PROPERTY_IDENTIFIER, "./generated/tmp/databases/" + unitName + "/"+UUID.randomUUID().toString());
		propsH2.put(Constants.DATASOURCE_PROPERTY_PLUGABLE_FILESYSTEM, Constants.OPTION_PLUGABLE_FILESYSTEM_FILE);
		propsH2.put(Constants.DATASOURCE_PROPERTY_DATABASE_TO_UPPER, false);
		propsH2.put(KEY_FILE_CONTEXT_MATCHER, matcherKey);
		cH2.update(propsH2);

		catalogFolderConfigsDS.put(path, cH2);
	}

	private static final String filterOfMatcherKey(String matcherKey) {
		return "(" + KEY_FILE_CONTEXT_MATCHER + "=" + matcherKey + ")";
	}

}
