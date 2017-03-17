package main.com.rcgd.fyp.presentation.presenter;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.input.MapClickListener;
import org.jxmapviewer.viewer.GeoPosition;

import main.com.rcgd.fyp.presentation.model.MapCoordinates;

public class ClickPositionListener extends MapClickListener{
	private MapCoordinates coordinates;
	
	public ClickPositionListener(JXMapViewer viewer) {
		super(viewer);
		// TODO Auto-generated constructor stub
	}
	
	public void setCoordinates(MapCoordinates coordinates) {
		this.coordinates = coordinates;
	}

	@Override
	public void mapClicked(GeoPosition location) {
		this.coordinates.setLatitude(location.getLatitude());
		this.coordinates.setLongitude(location.getLongitude());
		//show it on map
	}

}
