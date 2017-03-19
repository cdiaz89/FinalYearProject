package main.com.rcgd.fyp.presentation.view;

import java.util.List;

import main.com.rcgd.fyp.presentation.model.MapCoordinates;

/**
 * This defines the methods used in the MapView.
 * @author rcgd
 *
 */
public interface MapComponent {
	
	void initialise(MapCoordinates initial, int zoom);
	void showStartLocation(MapCoordinates coordinates);
	void showEndLocation(MapCoordinates coordiantes);
	void showRoute(List<MapCoordinates> route);
}
