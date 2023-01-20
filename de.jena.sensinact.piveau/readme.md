# Piveau Setup:

git@gitlab.com:piveau/delivery/piveau-docker-compose.git

Docker-compose *docker-compose-hub.yml* is located in folder *quick-start*

If there any problems with Elastic, the Volumne mount kan be removed from the *docker-compose-hub.yml*.

`docker-compose -f docker-compose-hub.yml up`

The UI can be accessed over `http://localhost:8080`. The REST interface and OpenAPI is accessible over `http://localhost:8081`

## Catalog

### Create

`curl -i -X PUT -H "X-API-Key: yourRepoApiKey" -H "Content-Type: application/rdf+xml" --data @demo_catalogue.rdf http://localhost:8081/catalogues/demo`

The name of the catalogue is **demo**. All datasets will be created for this catalogue. 

The catalogue name can then be used in all configurations for **PiveauAdapter**. In production, the catalogue name must be provided from Jena. The configuration property is *dataset.catalogueId*

### Read

`curl -i -X GET http://localhost:8081/catalogues`

Provides the RDF.


## Dataset

### Create

`curl -i -X PUT -H "X-API-Key: yourRepoApiKey" -H "Content-Type: application/rdf+xml" --data @data_test.rdf "http://localhost:8081/datasets/simpleds?catalogue=demo"`

The dataset with name/id **simpleds** will be created for catalogue **demo**.

### Read

`curl -i -X GET http://localhost:8081/datasets/simpleds?catalogue=demo`

Provides the dataset RDF.

### Delete

`curl -i -X DELETE -H "X-API-Key: yourRepoApiKey" "http://localhost:8081/datasets/simpleds"`

Deletes the dataset

## Distributions

The distribution API in Piveau is dis-functional. Therefore distributions will be created while updateing datasets. The distributions are then included in dataset updates.

In the configuration, this feature must be enabled using the entry *tracker.dataset=true*.

```
"PiveauAdapter~mdo": {
	"distributionConnector.target": "(piveau.connector=REST)",
	"distributionProvider.target": "(piveau.provider=MDO)",
	"datasetConnector.target": "(piveau.connector=REST)",
	"datasetProvider.target": "(piveau.provider=MDO)",
	"tracker.dataset": "true"
}
```

Without this property, the *PiveauAdapter* acts, using the distribution API, which currently **NOT recommended**.

## Piveau Adapter

Is described in [de.jena.piveau.api/readme.md](../de.jena.piveau.api/readme.md)


Example *de.jena.mdo.piveau.config* - **catalogueID**:
```
"MDOPiveauProvider~mdo": {
	"dataset.catalogueId": "demo",
	"dataset.id" : "demo-ds",
	"dataset.title.en": "Example Dataset 1",
	"dataset.title.de": "Beispiel Dataset 1",
	"dataset.description.en": "This is an example Dataset",
	"dataset.description.de": "Das ist ein Beispiel-Datenset",
	"dataset.issued": "NOW",
	"dataset.distributionHost" : "mdo.jena.de"
}
```

Example *de.jena.sensinact.piveau.config* - **catalogueId**

```
"SensinactPiveauProvider~sensinact": {
	"dataset.catalogueId": "demo",
	"dataset.id" : "sensinact-ds",
	"dataset.title.en": "Example Sensinact Dataset 1",
	"dataset.title.de": "Beispiel Sensinact Dataset 1",
	"dataset.description.en": "This is an example Sensinact Dataset",
	"dataset.description.de": "Das ist ein Beispiel-Datenset für Sensinact",
	"dataset.issued": "NOW",
	"dataset.distributionHost" : "sensinact.jena.de"
}
```

## Properties

### dataset.id

The id of the dataset

### dataset.distributionHost

Resolvable hostname in the network where distributions come from, also this running system. In the examples above the name the source host of the distribution (for Sensinact: sensinact.jena.de, for MDO mdo.jena.de) These hostnames appear ind the distributions accessUrl.

This property has to be modified with the production hostnames for sensinact and MDO