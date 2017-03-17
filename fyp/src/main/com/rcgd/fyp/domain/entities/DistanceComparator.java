package main.com.rcgd.fyp.domain.entities;

import java.util.Comparator;
import java.util.HashMap;

public class DistanceComparator implements Comparator {

	private HashMap<Vertex, Double> vertexDistance;
	private double distanceRequired;
	
	public DistanceComparator(HashMap<Vertex, Double> vertexDistance) {
		this.vertexDistance = vertexDistance;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		Vertex vertex1 = (Vertex) o1;
		Vertex vertex2 = (Vertex) o2;
		
		if (vertexDistance.get(vertex1) < vertexDistance.get(vertex2)) {
			return -1;
		} else if (vertexDistance.get(vertex1) > vertexDistance.get(vertex2)) {
			return 1;
		}
		return 0;
	}

}
