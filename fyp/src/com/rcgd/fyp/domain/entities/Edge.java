package com.rcgd.fyp.domain.entities;

import java.util.Set;

/**
 * This immutable class represents an edge of a graph.
 * It store vertices in between intersection vertices.
 * This class calculates edge weights when needed.
 * @author rcgd
 *
 */
public class Edge implements EdgeInterface{
	
	private long id;
	private Vertex startVertex;
	private Vertex endVertex;
	private Set<Vertex> immediateVertices;
	
	public Edge(long id, Vertex startVertex, Vertex endVertex,
			Set<Vertex> immediateVertices) {
		this.id =id;
		this.startVertex = startVertex;
		this.endVertex = endVertex;
		this.immediateVertices = immediateVertices;
	}
	
	@Override
	public long getID() {
		return id;
	}
	
	@Override
	public Vertex getStartVertex() {
		return startVertex;
	}

	@Override
	public Vertex getEndVertex() {
		return endVertex;
	}

	@Override
	public double getEdgeWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<Vertex> getImmediateVertices() {
		return immediateVertices;
	}

	

}
