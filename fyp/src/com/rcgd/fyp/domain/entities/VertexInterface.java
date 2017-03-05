package com.rcgd.fyp.domain.entities;

/**
 * 
 * @author rcgd
 *
 */
public interface VertexInterface {

	long getID();
	LatLong getLatLong();
	double getApproximateDistance(VertexInterface v);
	double getHaversineDistance(VertexInterface v);
}
