package main.com.rcgd.fyp.presentation.view;

import java.util.List;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;

import main.com.rcgd.fyp.presentation.model.MapCoordinates;

public class MapView extends JXMapViewer implements MapViewInterface {

	/**
	 * Default serial ID
	 */
	private static final long serialVersionUID = 1L;
	private static final int THREAD_SIZE = 8;
	private DefaultTileFactory tileFactory;
	
	public MapView() {
		super();
		
		// Create a TileFactoryInfo for OpenStreetMap
		TileFactoryInfo info = new OSMTileFactoryInfo();
		tileFactory = new DefaultTileFactory(info);
		tileFactory.setThreadPoolSize(THREAD_SIZE);
		this.setTileFactory(tileFactory);
	}

	@Override
	public void initialiseMap(MapCoordinates initial, int zoom) {
		GeoPosition initialPosition = new GeoPosition(
				initial.getLatitude(), initial.getLongitude());
		this.setZoom(zoom);
		this.setAddressLocation(initialPosition);
	}

	@Override
	public void showStartLocation(MapCoordinates coordinates) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showEndLocation(MapCoordinates coordiantes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showRoute(List<MapCoordinates> route) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}

