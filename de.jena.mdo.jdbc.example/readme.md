# Important

## Initial Import Data into Derby

### SQL Dump File

... is located in data folder: *dump.sql*

### Import Dump 

There is the `ImportDump` component, which should only run the first time, because this import it takes a few minutes.

There are about 172265 elements to be imported.


#### Git-Ignore the traffic-folder

You need to press F5 on the project, where you run the `ImportDump` component. It will then have a *traffic* folder. This should be added to be ignored by Git!!!!

After that the component should be **de-activated**, otherwise the import will started again!!!!

## Run the Example

The component `TrafficComponent` contains an example, how to  setup reading all data from the derby and mapping them to EMF.

## Limitations

* currently only reading all elements is supported
* no EMFRepository support until now
* DETECTORS are an endless amount of data with 276 elements
* EDGE, EDGEITEMS, POINTS are many data, the PushStream needs to be configured for that


