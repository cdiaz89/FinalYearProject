package com.rcgd.fyp.domain.util;

/**
 * Static utilities to calculate distances between two points
 * @author rcgd
 *
 */

public final class DistanceUtil {

	// radius
	public static final double earthRadius = 6372.8;
	
	/**
	 * @param fromLatLong 
	 * @param
	 * adapted from Rosetta Code 
	 * https://rosettacode.org/wiki/Haversine_formula#Java
	 */
	public static double getHaversineDistance(double fromLat, double fromLong,
			double toLat, double toLong) {
		double latitudeDistance = Math.toRadians(toLat - fromLat);
		double longitudeDistance = Math.toRadians(toLong - fromLong);
		fromLat = Math.toRadians(fromLat);
		toLat = Math.toRadians(toLat);
		
        double a = Math.pow(Math.sin(latitudeDistance / 2),2) +
        		Math.pow(Math.sin(longitudeDistance / 2),2) *
        		Math.cos(fromLat) * Math.cos(toLat);
        double c = 2 * Math.asin(Math.sqrt(a));
        return earthRadius * c;

	}
}
