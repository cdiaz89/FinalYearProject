package main.com.rcgd.fyp.presentation.model;

import javax.swing.DefaultComboBoxModel;

/*
 * Model class that handles the application data.
 * @author rebbie clyde diaz
 */

public class AppModel implements Model{

	private int mapZoom;
	private MapCoordinates initialPosition;
	private DefaultComboBoxModel<AlgorithmNames> comboBoxModel;
	
	private MapCoordinates startPosition;
	private MapCoordinates endPosition;
	private double distance;
	private String algorithm;
	
	
	public AppModel(int mapZoom, MapCoordinates initialPosition) {
		this.mapZoom = mapZoom;
		this.initialPosition = initialPosition;
		initialiseComboBoxModel();
	}
	
	public AppModel(int mapZoom, double initialLat, double initialLon) {
		this.mapZoom = mapZoom;
		this.initialPosition = new MapCoordinates(initialLat, initialLon);
		initialiseComboBoxModel();
	}
	
	@Override
	public void initialiseComboBoxModel() {
		comboBoxModel = new DefaultComboBoxModel<>(AlgorithmNames.values());
	}
	
	@Override
	public int getMapZoom() {
		return mapZoom;
	}
	
	@Override
	public MapCoordinates getInitialPosition() {
		return initialPosition;
	}
	
	@Override
	public MapCoordinates getStartPosition() {
		return startPosition;
	}
	
	@Override
	public MapCoordinates getEndPosition() {
		return endPosition;
	}
	
	@Override
	public double getDistance() {
		return distance;
	}
	
	@Override
	public String getAlgorithm() {
		return algorithm;
	}
	
	@Override
	public DefaultComboBoxModel getComboBoxModel() {
		return comboBoxModel;
	}
	
	@Override
	public void setZoom(int zoom) {
		mapZoom = zoom;
	}
	
	@Override
	public void setInitialPosition(double lat, double lon) {
		initialPosition.setLatitude(lat);
		initialPosition.setLongitude(lon);
	}
	
	@Override
	public void setStartPosition(double lat, double lon) {
		startPosition.setLatitude(lat);
		startPosition.setLongitude(lon);
	}
	
	@Override
	public void setEndPosition(double lat, double lon) {
		endPosition.setLatitude(lat);
		endPosition.setLongitude(lon);
	}
	
	@Override
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	@Override
	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}
}
