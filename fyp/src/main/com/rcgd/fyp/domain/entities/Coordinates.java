package main.com.rcgd.fyp.domain.entities;

/**
 * Immutable class that represents
 * the latitude and longitude coordinates of a vertex
 * @author rcgd
 */

public class Coordinates {

	private final double latitude;
	private final double longitude;
	
	public Coordinates(double lat, double lng) {
		this.latitude = lat;
		this.longitude = lng;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	@Override
	public int hashCode() {
		final int oddPrime = 31;
        int result = 17;
        long tempLong;
        tempLong = Double.doubleToLongBits(getLatitude());
        result = oddPrime * result + (int) (tempLong ^ (tempLong >>> 32));
        tempLong = Double.doubleToLongBits(getLongitude());
        result = oddPrime * result + (int) (tempLong ^ (tempLong >>> 32));
        return result;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Coordinates)) {
            return false;
        }
        Coordinates other = (Coordinates) obj;
        if (Double.doubleToLongBits(getLatitude())
                != Double.doubleToLongBits(other.getLatitude())) {
            return false;
        }
        if (Double.doubleToLongBits(getLongitude())
                != Double.doubleToLongBits(other.getLongitude())) {
            return false;
        }
        return true;
    }
	
	@Override
	public String toString() {
        return "[Latitude: " + getLatitude() + ", Longitude: " + getLongitude() + "]";
    }
	
}
