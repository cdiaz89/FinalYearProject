package main.com.rcgd.fyp.presentation.model;

/**
 * Class that represents geo coordinates used in the map.
 * @author rcgd
 *
 */
public class MapCoordinates {
	
	private double latitude;
	private double longitude;
	
	public MapCoordinates(double lat, double lng) {
		this.latitude = lat;
		this.longitude = lng;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
