package com.rcgd.fyp.domain.entities;

import java.util.HashMap;

import com.rcgd.fyp.domain.util.DistanceUtil;

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
	public double getApproximateDistance(VertexInterface v) {
		return DistanceUtil.getApproximateDistance(
				this.getLatLong().getLat(), this.getLatLong().getLong(),
				v.getLatLong().getLat(), v.getLatLong().getLong());
	}

	@Override
	public double getHaversineDistance(VertexInterface v) {
		return DistanceUtil.getHaversineDistance(
				this.getLatLong().getLat(), this.getLatLong().getLong(),
				v.getLatLong().getLat(), v.getLatLong().getLong());
	}

	public HashMap<String,Object> getTags() {
		return tags;
	}
}
