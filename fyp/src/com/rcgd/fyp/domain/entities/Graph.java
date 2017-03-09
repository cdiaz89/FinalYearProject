package com.rcgd.fyp.domain.entities;

import java.util.HashMap;
import java.util.List;

public class Graph extends HashMap<VertexInterface, List<EdgeInterface>> implements GraphInterface {
	
	@Override
	public List<EdgeInterface> getEdges(VertexInterface v) {
		return this.get(v);
	}

	@Override
	public void addToGraph(VertexInterface v, EdgeInterface e) {
		List<EdgeInterface> edges = getEdges(v);
		if(!edges.add(e)) {
			//Print error
		}
	}

}
