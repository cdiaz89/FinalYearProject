package com.rcgd.fyp.presentation.view;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.TileFactoryInfo;

public class MapComponent extends JXMapViewer {

	/**
	 * Default serial ID
	 */
	private static final long serialVersionUID = 1L;
	private DefaultTileFactory tileFactory;
	
	public MapComponent() {
		super();
		
		// Create a TileFactoryInfo for OpenStreetMap
		TileFactoryInfo info = new OSMTileFactoryInfo();
		tileFactory = new DefaultTileFactory(info);
		tileFactory.setThreadPoolSize(8);
		this.setTileFactory(tileFactory);
		
	}
	
	

}

