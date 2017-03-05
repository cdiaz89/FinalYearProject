package com.rcgd.fyp.domain.entities;

/**
 * 
 * @author rcgd
 *
 */
public interface VertexInterface {

	long getID();
	LatLong getLatLong();
	double getStraightLineDistance(VertexInterface v);
	double getHaversineDistance(VertexInterface v);
}
