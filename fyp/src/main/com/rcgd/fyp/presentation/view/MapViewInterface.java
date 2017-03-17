package main.com.rcgd.fyp.presentation.view;

import java.util.List;

import main.com.rcgd.fyp.presentation.model.MapCoordinates;


public interface MapViewInterface {
	void initialiseMap(MapCoordinates initial, int zoom);
	void showStartLocation(MapCoordinates coordinates);
	void showEndLocation(MapCoordinates coordiantes);
	void showRoute(List<MapCoordinates> route);
}
