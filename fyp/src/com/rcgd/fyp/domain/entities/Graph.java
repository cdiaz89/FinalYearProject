package com.rcgd.fyp.domain.entities;

import java.util.HashMap;
import java.util.List;

public class Graph implements GraphInterface {

	private HashMap<VertexInterface, List<EdgeInterface>> adjacencyList;
	
	public Graph(HashMap<VertexInterface, List<EdgeInterface>> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
	
	@Override
	public List<EdgeInterface> getEdges(VertexInterface v) {
		return this.adjacencyList.get(v);
	}

	@Override
	public void addToGraph(VertexInterface v, EdgeInterface e) {
		// TODO Auto-generated method stub
		
	}

}
