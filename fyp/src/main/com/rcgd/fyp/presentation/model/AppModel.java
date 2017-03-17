package main.com.rcgd.fyp.presentation.model;

import javax.swing.ComboBoxModel;

/*
 * Model class that handles the map data
 * @author rebbie clyde diaz
 */

public class AppModel {

	private int mapZoom;
	private MapCoordinates initialPosition;
	private MapCoordinates startPosition;
	private MapCoordinates endPosition;
	private double distance;
	private String algorithm;
	
	private ComboBoxModel comboBoxModel;
	
	public AppModel(int mapZoom, MapCoordinates initialPosition) {
		this.mapZoom = mapZoom;
		this.initialPosition = initialPosition;
	}
	
	public AppModel(int mapZoom, double initialLat, double initialLon) {
		this.mapZoom = mapZoom;
		this.initialPosition = new MapCoordinates(initialLat, initialLon);
	}
	
	public int getMapZoom() {
		return mapZoom;
	}
	
	public MapCoordinates getInitialPosition() {
		return initialPosition;
	}
	
	public double getInitialLat() {
		return initialPosition.getLatitude();
	}
	
	public double getInitialLon() {
		return initialPosition.getLongitude();
	}
	
	public MapCoordinates getStartPosition() {
		return startPosition;
	}
	
	public double getStartLat() {
		return startPosition.getLatitude();
	}
	
	public double getStartLon() {
		return startPosition.getLongitude();
	}
	
	public MapCoordinates getEndPosition() {
		return endPosition;
	}
	
	public double getEndLat() {
		return endPosition.getLatitude();
	}
	
	public double getEndLon() {
		return endPosition.getLongitude();
	}
	
	public double getDistance() {
		return distance;
	}
	
	public String getAlgorithm() {
		return algorithm;
	}
	
	public void setZoom(int zoom) {
		this.mapZoom = zoom;
	}
	
	
	public void setInitialPosition(double lat, double lon) {
		this.initialPosition.setLatitude(lat);
		this.initialPosition.setLongitude(lon);
	}
	
	public void setStartPosition(double lat, double lon) {
		this.startPosition.setLatitude(lat);
		this.startPosition.setLongitude(lon);
	}
	
	public void setEndPosition(double lat, double lon) {
		this.endPosition.setLatitude(lat);
		this.endPosition.setLongitude(lon);
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
}
