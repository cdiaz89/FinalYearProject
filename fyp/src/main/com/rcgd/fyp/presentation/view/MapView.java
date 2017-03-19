package main.com.rcgd.fyp.presentation.view;

import java.io.File;
import java.util.List;

import javax.swing.event.MouseInputListener;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.CenterMapListener;
import org.jxmapviewer.input.PanKeyListener;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCursor;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.LocalResponseCache;
import org.jxmapviewer.viewer.TileFactoryInfo;

import main.com.rcgd.fyp.presentation.model.MapCoordinates;

public class MapView extends JXMapViewer implements MapComponent {

	/**
	 * Default serial ID
	 */
	private static final long serialVersionUID = 1L;
	private static final int THREAD_SIZE = 8;
	private DefaultTileFactory tileFactory;
	
	public MapView() {
		super();
	}

	@Override
	public void initialise(MapCoordinates initial, int zoom) {
		
		// Creating a TileFactoryInfo for OpenStreetMap
		TileFactoryInfo info = new OSMTileFactoryInfo();
		tileFactory = new DefaultTileFactory(info);
		tileFactory.setThreadPoolSize(THREAD_SIZE);
		this.setTileFactory(tileFactory);
		
		// Setting up local file cache
		File cacheDir = new File(System.getProperty("user.home")
				+ File.separator + ".jxmapviewer");
		LocalResponseCache.installResponseCache(info.getBaseURL(), cacheDir, false);
		
		GeoPosition initialPosition = new GeoPosition(
				initial.getLatitude(), initial.getLongitude());
		this.setZoom(zoom);
		this.setAddressLocation(initialPosition);
		
		// Add interactions
		MouseInputListener mia = new PanMouseInputListener(this);
		this.addMouseListener(mia);
		this.addMouseMotionListener(mia);
		this.addMouseListener(new CenterMapListener(this));		
		this.addMouseWheelListener(new ZoomMouseWheelListenerCursor(this));	
		this.addKeyListener(new PanKeyListener(this));		
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

