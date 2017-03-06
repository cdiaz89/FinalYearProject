package com.rcgd.fyp.domain.entities;

/**
 * Immutable class that represents
 * the latitude and longitude coordinates of a vertex
 * @author rcgd
 */

public class LatLong {

	private final double latitude;
	private final double longitude;
	
	public LatLong(double lat, double lng) {
		this.latitude = lat;
		this.longitude = lng;
	}
	
	public double getLat() {
		return latitude;
	}
	
	public double getLong() {
		return longitude;
	}
	
	@Override
	public int hashCode() {
		final int oddPrime = 31;
        int result = 17;
        long tempLong;
        tempLong = Double.doubleToLongBits(getLat());
        result = oddPrime * result + (int) (tempLong ^ (tempLong >>> 32));
        tempLong = Double.doubleToLongBits(getLong());
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
        if (!(obj instanceof LatLong)) {
            return false;
        }
        LatLong other = (LatLong) obj;
        if (Double.doubleToLongBits(getLat())
                != Double.doubleToLongBits(other.getLat())) {
            return false;
        }
        if (Double.doubleToLongBits(getLong())
                != Double.doubleToLongBits(other.getLong())) {
            return false;
        }
        return true;
    }
	
	@Override
	public String toString() {
        return "[Latitude: " + getLat() + ", Longitude: " + getLong() + "]";
    }
	
}
