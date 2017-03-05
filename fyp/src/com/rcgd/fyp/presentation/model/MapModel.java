package com.rcgd.fyp.presentation.model;

/*
 * Model class that handles the map data
 * @author rebbie clyde diaz
 */

public class MapModel {

	private int threadSize;
	private int mapZoom;
	private double startingLat;
	private double startingLon;
	
	public MapModel() {
		
	}
	
	// builder pattern
	
	public int getThreadSize() {
		return threadSize;
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
