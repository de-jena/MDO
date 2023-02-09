# Demo Setup

The Piveau infrastructure needs to be up and running, to run the Demo project.

For that there is a docker-compose file in the *de.jena.miveau.api/piveaudata* folder.

To start everything call in that folder.

`docker-compose -f docker-compose-hub.yml up`

If this is running, the *launch.bndrun* can be started can run.

After the component is activated the component will wait 10 seconds to create a dataset. After another 10 seconds, the dataset will be updated with a distribution. After further 10 seconds the distribution will be removed again from the dataset. After another 10 seconds the dataset will be removed.

To verify the changes you can *CURL* on the data.

`curl -i -X GET http://localhost:8081/catalogues/demo/datasets/origin?originalId=demo-ds` 

