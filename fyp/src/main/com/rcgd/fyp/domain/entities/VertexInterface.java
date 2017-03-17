package main.com.rcgd.fyp.domain.entities;

/**
 * 
 * @author rcgd
 *
 */
public interface VertexInterface {

	Coordinates getCoordinates();
	double getApproximateDistance(VertexInterface v);
	double getHaversineDistance(VertexInterface v);
}
