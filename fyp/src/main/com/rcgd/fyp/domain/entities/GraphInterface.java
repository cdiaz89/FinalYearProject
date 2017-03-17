package main.com.rcgd.fyp.domain.entities;

import java.util.List;

public interface GraphInterface {

	public List<EdgeInterface> getEdges(VertexInterface v);
	public void addToGraph(VertexInterface v, EdgeInterface e);
}
