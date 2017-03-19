package main.com.rcgd.fyp.data.storage;

import java.util.LinkedList;
import java.util.List;

import main.com.rcgd.fyp.presentation.model.AlgorithmNames;

/**
 * Class that simulates data access to the application's default values.
 * It can be split into two separate access implementations.
 * @author rcgd
 *
 */
public class FrontEndDataAccess {
	private static final int MAP_ZOOM = 7;
	private static final double LAT = 51.508530;
	private static final double LON = -0.076132;
		
	private int mapZoom;
	private double initialLatitude;
	private double initialLongitude;
	
	public FrontEndDataAccess() {
		initiliaseData();
	}
	
	private void initiliaseData() {
		// This can be extended to read a file containing properties.
		mapZoom = MAP_ZOOM;
		initialLatitude = LAT;
		initialLongitude = LON;
	}
	
	public String getMapDataInCSVFormat() {	
		// checks if data was initialised; 
		if(mapZoom == 0 || initialLatitude == 0.0d || initialLongitude == 0.0d) {
			return null;
		} else { // all required data initialised;
			StringBuilder builder = new StringBuilder();
			builder.append(Integer.toString(mapZoom));
			addComma(builder);
			builder.append(Double.toString(initialLatitude));
			addComma(builder);
			builder.append(Double.toString(initialLongitude));
			return builder.toString();
		}	
	}

	private void addComma(StringBuilder string) {
		string.append(",");		
	}

	// For testing purposes
		public FrontEndDataAccess(int mapZoom, double lat, double lon) {
			this.mapZoom = mapZoom;
			initialLatitude = lat;
			initialLongitude = lon;
		}
}
