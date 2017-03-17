package main.com.rcgd.fyp.domain.entities;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Set;

public abstract class GraphAlgorithm implements AlgorithmInterface{

	private Graph graph;
	private Vertex start;
	private Vertex target;
	private double distance;
	
	private PriorityQueue<EdgeInterface> queue;
	private Set<EdgeInterface> exploredEdges;
	private HashMap<Vertex, Double> vertexDistance;
	
	public GraphAlgorithm(Graph graph, Vertex start, Vertex target, double distance) {
		this.graph = graph;
		this.start = start;
		this.target = target;
		this.distance = distance;		
	}

	protected Graph getGraph() {
		return graph;
	}
	
	protected Vertex getStart() {
		return start;
	}
	
	protected Vertex getTarget() {
		return target;
	}
	
	protected double getDistance() {
		return distance;
	}
	
	protected PriorityQueue<EdgeInterface> getQueue() {
		return queue;
	}
	
	protected Set<EdgeInterface> getExploredEdges() {
		return exploredEdges;
	}
	
	protected HashMap<Vertex, Double> getVertexDistance() {
		return vertexDistance;
	}
	
	void setPriorityQueue(PriorityQueue<EdgeInterface> queue) {
		this.queue = queue;
	}
	
	void setExploredEdges(Set<EdgeInterface> exploredEdges) {
		this.exploredEdges = exploredEdges;
	}
	
	void setVertexDistance(HashMap<Vertex, Double> vertexDistance) {
		this.vertexDistance = vertexDistance;
	}
}
