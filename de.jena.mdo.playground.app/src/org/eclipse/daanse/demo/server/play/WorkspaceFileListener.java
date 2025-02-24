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
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.daanse.io.fs.watcher.api.FileSystemWatcherListener;
import org.eclipse.daanse.io.fs.watcher.api.FileSystemWatcherWhiteboardConstants;
import org.eclipse.daanse.io.fs.watcher.api.propertytypes.FileSystemWatcherListenerProperties;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.cm.annotations.RequireConfigurationAdmin;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(configurationPid = WorkspaceFileListener.PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
@RequireConfigurationAdmin
@FileSystemWatcherListenerProperties(recursive = false)
public class WorkspaceFileListener implements FileSystemWatcherListener {

	static final String PID = "WorkspaceFileListener";

	static final String KEY_FILE_CONTEXT_MATCHER = "file.context.matcher";

	@Reference
	ConfigurationAdmin configurationAdmin;

	private Map<Path, Configuration> persistanceUnitConfigurations = new ConcurrentHashMap<>();


	@Deactivate
	public void deactivate() {
		persistanceUnitConfigurations.forEach((k,v) -> {
			try {
				v.delete();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
	@Override
	public void handleBasePath(Path basePath) {
		CreateMappingCommand.setBasePath(basePath);
	}

	@Override
	public void handleInitialPaths(List<Path> paths) {
		paths.forEach(this::addPath);
	}

	@Override
	public void handlePathEvent(Path path, Kind<Path> kind) {
		System.out.println("received path event for workspace watcher " + path.toString() + " - " + kind.toString());
		if (StandardWatchEventKinds.ENTRY_CREATE.equals(kind)) {
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
			Configuration c = persistanceUnitConfigurations.remove(path);
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

		try {
			createH2DataSource(path);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void createH2DataSource(Path path) throws IOException {
		String unitName = path.getName(path.getNameCount() - 1).toString();
		Configuration persistanceUnitConfiguration = configurationAdmin.getFactoryConfiguration(PersistenceUnitFileListener.PID, unitName, "?");

		Dictionary<String, Object> props = new Hashtable<>();
		props.put(FileSystemWatcherWhiteboardConstants.FILESYSTEM_WATCHER_PATH, path.toString());
		props.put("unitname", unitName);
		persistanceUnitConfiguration.update(props);
		
		persistanceUnitConfigurations.put(path, persistanceUnitConfiguration);
	}
}
