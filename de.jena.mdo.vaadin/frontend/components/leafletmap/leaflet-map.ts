import * as L from 'leaflet';
import 'leaflet.markercluster';
import { customElement, html, LitElement, PropertyValues } from 'lit-element';
import { nothing } from 'lit-html';

const openStreetMapLayer = 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png';
const openStreetMapAttribution = `&copy; <a href='https://www.openstreetmap.org/copyright'>OpenStreetMap</a> contributors`;

@customElement('leaflet-map')
export class LeafletMap extends LitElement {
  private map!: L.Map;
 // private markers = [];
 // private objLayer!: L.FeatureGroup;
  private markerCluster!: L.MarkerClusterGroup;
  private treeIcon16 = L.icon({
    iconUrl: '../../jenamdovaadin/images/tree_16x16.png',
    iconSize: [16, 16]
   });
  private detectorIcon16 = L.icon({
    iconUrl: '../../jenamdovaadin/images/detector_30x30.png',
    iconSize: [16, 16]
   });
  private treeIcon30 = L.icon({
    iconUrl: '../../jenamdovaadin/images/tree_30x30.png',
    iconSize: [30, 30]
   });


  createRenderRoot() {
    // Do not use a shadow root
    return this;
  }

  render() {
    return html`${nothing}`;
  }

  firstUpdated(_changedProperties: PropertyValues) {
    super.firstUpdated(_changedProperties);

    this.map = L.map(this);
    let tileLayer = L.tileLayer(openStreetMapLayer, { attribution: openStreetMapAttribution, maxZoom: 18 });
    tileLayer.addTo(this.map);
    
    //this.objLayer = L.featureGroup();
    //this.objLayer.addTo(this.map);

    //this.addZoomListener();

    
  }
  
 /* async addZoomListener() {
    await this.updateComplete; // Make sure map has been initialized
    this.map.on('moveend', function(event) {
	let map : L.Map = event.target;
    	let currentZoom = map.getZoom();
    	if(currentZoom === this.oldZoom) return;
    	this.oldZoom = currentZoom;
    	console.log(currentZoom);
    	map.eachLayer(function(mapLayer: L.Layer) {
    		if(mapLayer instanceof L.FeatureGroup) {
    		 let objLayer : L.FeatureGroup = mapLayer;
    		 objLayer.eachLayer(async function(layer: L.Layer) {
           		if (layer instanceof L.Marker){
            		  let circle : L.Marker = layer;
     	   		  if(currentZoom >= 15) circle.setIcon(this.treeIcon16);
    	   		  else circle.setRadius(this.treeIcon30);
           		}
       	 });
    		}
    	    });
    });
  }*/
 

  async setView(latitude: number, longitude: number, zoomLevel: number) {
    await this.updateComplete; // Make sure map has been initialized
    this.map.setView([latitude, longitude], zoomLevel);
   // this.oldZoom = zoomLevel;
  }
  
  async addMarker(latitude: number, longitude: number, className: string) {
    await this.updateComplete; // Make sure map has been initialized
    if(this.markerCluster === undefined) this.markerCluster = L.markerClusterGroup();
    
    let marker : L.Marker = L.marker([latitude, longitude]);
    if(className === "JenaBaum") marker.setIcon(this.treeIcon16);
    else if(className === "Detector") marker.setIcon(this.detectorIcon16);
    //this.objLayer.addLayer(marker);
    //this.markers.push(marker);
    this.markerCluster.addLayer(marker);
    //marker.addTo(this.map);  
  }
  
  async showMarkers() {
    await this.updateComplete; // Make sure map has been initialized
    //this.objLayer = L.featureGroup(this.markers).addTo(this.map);
    //var markerCluster = L.markerClusterGroup();
    //for(let m = 0; m < this.markers.length; m++) markerCluster.addLayer(this.markers[m]);
    //this.map.addLayer(markerCluster);
    // this.markers[m].addTo(this.map);
    this.map.addLayer(this.markerCluster);
  }
  
  async clearMarkers() {
   await this.updateComplete; // Make sure map has been initialized
   if(this.markerCluster !== undefined) {
     this.markerCluster.clearLayers();
     this.map.removeLayer(this.markerCluster);
     this.markerCluster = undefined; 
   }
  }
}
