package com.rcgd.fyp.domain.util;

/**
 * Static utilities to calculate distances between two points
 * @author rcgd
 *
 */

public final class DistanceUtil {

	// mean radius in metres;
	public static final double earthRadius = 6371000;
	
	/**
	 * 
	 * @param fromLat latitude of the start coordinate
	 * @param fromLong longitude of the start coordinate
	 * @param toLat latitude of the end coordinate
	 * @param toLong longitude of the end coordinate
	 * @return approximate distance between start and end coordinates
	 * 
	 * This function uses spherical projection
	 * https://en.wikipedia.org/wiki/Geographical_distance#Flat-surface_formulae
	 *
	 * idea from GraphHopper:
	 * https://github.com/graphhopper/graphhopper/blob/master/core/src/main/java/com/graphhopper/util/DistancePlaneProjection.java
	 */
	public static double getApproximateDistance(double fromLat, double fromLong,
			double toLat, double toLong) {
		double latitudeDelta = Math.toRadians(toLat - fromLat);
		double longitudeDelta = Math.toRadians(toLong - fromLong);
		double meanLatitude = (fromLat + toLat) / 2;
		double temp = Math.cos(Math.toRadians(meanLatitude) * longitudeDelta);
		return earthRadius *
				Math.sqrt((latitudeDelta * longitudeDelta
				+ temp * temp));
		
	}
	
	/**
	 * @param fromLat latitude of the start coordinate
	 * @param fromLong longitude of the start coordinate
	 * @param toLat latitude of the end coordinate
	 * @param toLong longitude of the end coordinate
	 * @return great circle distance between start and end coordinates
	 * 
	 * This function uses the Haversine formula
	 * adapted from Rosetta Code 
	 * https://rosettacode.org/wiki/Haversine_formula
	 */
	public static double getHaversineDistance(double fromLat, double fromLong,
			double toLat, double toLong) {
		double latitudeDelta = Math.toRadians(toLat - fromLat);
		double longitudeDelta = Math.toRadians(toLong - fromLong);
		fromLat = Math.toRadians(fromLat);
		toLat = Math.toRadians(toLat);
		
        double a = Math.pow(Math.sin(latitudeDelta / 2),2) +
        		Math.pow(Math.sin(longitudeDelta / 2),2) *
        		Math.cos(fromLat) * Math.cos(toLat);
        double c = 2 * Math.asin(Math.sqrt(a));
        return earthRadius * c;
	}
}
