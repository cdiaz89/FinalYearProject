package com.rcgd.fyp.domain.entities;

import java.util.HashMap;

/**
 * Class that represent a vertex in a graph
 * Designed to be immutable
 * @author rcgd
 *
 */

public class Vertex implements VertexInterface {
	
	private long vertexID;
	private LatLong latlong;
	private HashMap<String,Object> tags;

	public Vertex(long id, double latitude, double longitude,
			HashMap<String,Object> tags) {
		this.vertexID = id;
		latlong = new LatLong(latitude, longitude);
		this.tags = tags;
	}
	
	@Override
	public long getID() {
		return vertexID;
	}

	@Override
	public LatLong getLatLong() {
		return latlong;
	}

	@Override
	public double getStraightLineDistance(VertexInterface v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getHaversineDistance(VertexInterface v) {
		// TODO Auto-generated method stub
		return 0;
	}

}
