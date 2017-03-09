package com.rcgd.fyp.presentation.model;

/*
 * Model class that handles the map data
 * @author rebbie clyde diaz
 */

public class MapModel {

	private int mapZoom;
	private double startingLat;
	private double startingLon;
	
	public MapModel(int mapZoom, double startingLat, double startingLon) {
		this.mapZoom = mapZoom;
		this.startingLat = startingLat;
		this.startingLon = startingLon;
	}
	
	public int getMapZoom() {
		return mapZoom;
	}
	
	public double getStartingLat() {
		return startingLat;
	}
	
	public double getStartingLon() {
		return startingLon;
	}
	
	
}
