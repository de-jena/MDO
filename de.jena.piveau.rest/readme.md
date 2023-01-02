# Piveau REST Connector

This connector uses the JaxRS Client of the JaxRS Whiteboard to communicated with the Piveau system.

It just handles creation, modification and removal of distributions and datasets via REST.

An example configuration using Felix Jetty and the Gecko JaxRS Whiteboard can look like this:

```
{
	":configurator:resource-version": 1,
	":configurator:version": "0.0.0",
	"org.apache.felix.http~testHttp": {
		"org.osgi.service.http.port": "8085",
		"org.osgi.service.http.host": "0.0.0.0",
		"org.apache.felix.http.context_path": "test/",
		"org.apache.felix.http.name": "test",
		"org.apache.felix.http.runtime.init.id": "testHttp"
	},  
	"JaxRsHttpWhiteboardRuntimeComponent~testRest": {
		"jersey.jaxrs.whiteboard.name": "test",
		"jersey.context.path": "rest",
		"osgi.http.whiteboard.target": "(id=testHttp)"
	},
	"PiveauRestConnector~test": {
		"piveau.rest.base.uri": "http://localhost:8081",
		"piveau.rest.api.key": "test"
	}
}
```