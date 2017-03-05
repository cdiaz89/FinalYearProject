package com.rcgd.fyp.domain.entities;

import java.util.Set;

public interface EdgeInterface {

	long getID();
	Vertex getStartVertex();
	Vertex getEndVertex();
	double getEdgeWeight();
	Set<Vertex> getImmediateVertices(); 
}
