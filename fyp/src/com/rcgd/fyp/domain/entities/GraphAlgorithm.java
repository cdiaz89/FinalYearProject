package com.rcgd.fyp.domain.entities;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

public abstract class GraphAlgorithm {

	private Graph graph;
	private PriorityQueue<EdgeInterface> queue;
	private Set<EdgeInterface> exploredEdges;
	private HashMap<VertexInterface, Double> vertexDistance;
	
	public GraphAlgorithm(Graph graph) {
		this.graph = graph;
		queue
	}
}
