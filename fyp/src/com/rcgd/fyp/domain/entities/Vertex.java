package com.rcgd.fyp.domain.entities;

import java.util.HashMap;

import com.rcgd.fyp.domain.util.DistanceUtil;

/**
 * 
 * @author rcgd
 *
 */
public class Vertex extends Coordinates implements VertexInterface {
	private HashMap<String,Object> tags;
	
	public Vertex(double lat, double lng, HashMap<String,Object> tags) {
		super(lat, lng);
		this.tags = tags;
	}
	
	public Vertex(double lat, double lng) {
		super(lat, lng);
		this.tags = null;
	}

	@Override
	public Coordinates getCoordinates() {
		return this;
	}

	@Override
	public double getApproximateDistance(VertexInterface v) {
		// TODO Auto-generated method stub
		return DistanceUtil.getApproximateDistance(
				this.getCoordinates(), v.getCoordinates());
	}

	@Override
	public double getHaversineDistance(VertexInterface v) {
		return DistanceUtil.getHaversineDistance(
				this.getCoordinates(), v.getCoordinates());
	}

}
