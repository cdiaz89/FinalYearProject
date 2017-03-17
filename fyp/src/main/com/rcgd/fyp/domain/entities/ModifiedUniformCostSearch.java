package main.com.rcgd.fyp.domain.entities;

import java.util.HashMap;

/**
 * This class modifies Uniform Cost Search Algorithm.
 * It takes into account the required distance needed for the route.
 * @author rcgd
 *
 */
public class ModifiedUniformCostSearch extends GraphAlgorithm{

	public ModifiedUniformCostSearch(Graph graph, Vertex start, Vertex target, double distance) {
		super(graph, start, target, distance);
		
	}

	@Override
	public PathInterface generatePath() {
		if (!initialise()) {
			return null;
		}
		return null;
	}

	
	private boolean initialise() {
		return false;
	}

}
