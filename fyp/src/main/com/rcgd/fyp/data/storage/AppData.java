package main.com.rcgd.fyp.data.storage;

import java.util.LinkedList;
import java.util.List;

import main.com.rcgd.fyp.domain.entities.AlgorithmName;

/**
 * Immutable Class that stores default values of the App.
 * It contains default values and can be extended to read a file containing properties.
 * @author rcgd
 *
 */
public class AppData {
	// TODO:  extend to read a file containing properties.
	private static final int MAP_ZOOM = 7;
	private static final double LAT = 51.508530;
	private static final double LONG = -0.076132;
		
	private int mapZoom;
	private double initialLatitude;
	private double initialLongitude;
	private List<String> algorithms;
	
	public AppData() {
		initiliaseData();
	}

	private void initiliaseData() {
		mapZoom = MAP_ZOOM;
		initialLatitude = LAT;
		initialLongitude = LONG;
		
		algorithms = new LinkedList<>();
		
		AlgorithmName[] list = AlgorithmName.values();
		for (AlgorithmName name: list) {
			algorithms.add(name.getName());
		}
	
		
	}
	
	public int getMapZoom() {
		return mapZoom;
	}
	
	public double getInitialLatitude() {
		return initialLatitude;
	}
	
	public double getInitialLongitude() {
		return initialLongitude;
	}
	
	public List<String> getAlgorithmList() {
		return algorithms;
	}
}
