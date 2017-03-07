package com.rcgd.fyp.domain.entities;

import java.util.LinkedHashSet;

public interface EdgeInterface {

	VertexInterface getStartVertex();
	VertexInterface getEndVertex();
	LinkedHashSet<VertexInterface> getIntermediateVertices();
	double getEdgeWeight();
	boolean isTargetVertexInEdge(VertexInterface v);
	double getDistanceToTargetVertex(VertexInterface v);
}
