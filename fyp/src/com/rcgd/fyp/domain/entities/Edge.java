package com.rcgd.fyp.domain.entities;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * This immutable class represents an edge of a graph.
 * It store vertices in between intersection vertices.
 * This class calculates edge weights when needed.
 * @author rcgd
 *
 */
public class Edge implements EdgeInterface{

	private Vertex startVertex;
	private Vertex endVertex;
	private LinkedHashSet<VertexInterface> intermediateVertices;
	
	public Edge(Vertex startVertex, Vertex endVertex,
			LinkedHashSet<VertexInterface>  intermediateVertices) {
		this.startVertex = startVertex;
		this.endVertex = endVertex;
		this.intermediateVertices = intermediateVertices;
	}
	
	
	@Override
	public VertexInterface getStartVertex() {
		return this.startVertex;
	}

	@Override
	public VertexInterface getEndVertex() {
		return this.endVertex;
	}
	
	@Override
	public LinkedHashSet<VertexInterface> getIntermediateVertices() {
		// TODO Auto-generated method stub
		return this.intermediateVertices;
	}

	@Override
	public double getEdgeWeight() {
		// TODO Auto-generated method stub
		return getDistanceFromStartToEndVertex();
	}

	private double getDistanceFromStartToEndVertex() {
		double distance = 0;
		LinkedHashSet<VertexInterface> vertices = this.getIntermediateVertices();
		
		if (vertices.size() > 0) { // there are immediate vertices		
			Iterator<VertexInterface> it = vertices.iterator();
			VertexInterface tmp = it.next();
			VertexInterface next;
			distance = this.getStartVertex()
					.getHaversineDistance(tmp);
			
			while(it.hasNext()){ //more than one intermediate vertex
				next = it.next();
				distance += tmp.getHaversineDistance(it.next());
				tmp = next;
			}
			
			distance += tmp
					.getHaversineDistance(this.getEndVertex());	
		} else {
			distance = this.getStartVertex()
					.getHaversineDistance(this.getEndVertex());
			if (distance == 0) {
				// Report Error
			};
		}
		return distance;
	}

	@Override
	public boolean isTargetVertexInEdge(VertexInterface v) {
		// TODO Auto-generated method stub
		return getIntermediateVertices().contains(v);
	}

	@Override
	public double getDistanceToTargetVertex(VertexInterface v) {
		double distance = 0;
		LinkedHashSet<VertexInterface> vertices = this.getIntermediateVertices();
		if (isTargetVertexInEdge(v)) {
			// calculate distance
			Iterator<VertexInterface> it = vertices.iterator();
			VertexInterface tmp = it.next();
			VertexInterface next;
			distance = this.getStartVertex()
					.getHaversineDistance(tmp);
			
			while (it.hasNext()) {
				next = it.next();
				distance += tmp.getHaversineDistance(it.next());
				if (next.equals(v)) {
					break;
				} else {
					tmp = next;
				}
			}	
		} else if(v.equals(this.getEndVertex())) {
			distance = getDistanceFromStartToEndVertex();
		}
		return distance;
	}

	

	

}
