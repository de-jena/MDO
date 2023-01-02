# Piveau Connector API

This connector API is meant to connect to the DCAT-AP System Piveau from Frauenhofer.

[https://github.com/piveau-data](https://github.com/piveau-data)

The API is separated in two major parts

* Piveau Connectors - e.g. REST
* Piveau Providers - Implementations that can provide datasets or distributions

For each of these two there is a separation into Dataset and Distributions, so that these can be handled independently.

This API also provides a generic component, that is configurable. It needs the configuration for the connectors and providers to be used:
 
 ```
 {
	":configurator:resource-version": 1,
	":configurator:version": "0.0.0",
	"PiveauAdapter~mdo": {
		"distributionConnector.target": "(piveau.connector=REST)",
		"distributionProvider.target": "(piveau.provider=Test)",
		"datasetConnector.target": "(piveau.connector=REST)",
		"datasetProvider.target": "(piveau.provider=Test)"
	}
}
 ```
 
This project comes with a default REST connector implementation. So this part of the configuration can be overtaken.
 
The provider part must be implemented separatetly. Depending on which service to track it might be possible that various information are extracted from the service properties adn added to the dataset or the distribution.
