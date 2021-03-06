package main.com.rcgd.fyp.domain.entities;

import java.util.HashMap;

import main.com.rcgd.fyp.domain.util.DistanceUtil;

/**
 * Class that represents 
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
		this(lat,lng,null);
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
