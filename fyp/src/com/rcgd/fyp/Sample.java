package com.rcgd.fyp;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import javax.swing.JFrame;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;

import com.rcgd.fyp.domain.entities.Coordinates;
import com.rcgd.fyp.domain.entities.IntermediateVertex;
import com.rcgd.fyp.domain.util.DistanceUtil;


public class Sample {
	
	public static void main(String[] args)
	{
		/*JXMapViewer mapViewer = new JXMapViewer();

		// Create a TileFactoryInfo for OpenStreetMap
		TileFactoryInfo info = new OSMTileFactoryInfo();
		DefaultTileFactory tileFactory = new DefaultTileFactory(info);
		mapViewer.setTileFactory(tileFactory);
		
		// Use 8 threads in parallel to load the tiles
		tileFactory.setThreadPoolSize(8);

		// Set the focus
		GeoPosition frankfurt = new GeoPosition(50.11, 8.68);

		mapViewer.setZoom(7);
		mapViewer.setAddressLocation(frankfurt);
		
		// Display the viewer in a JFrame
		JFrame frame = new JFrame("JXMapviewer2 Example 1");
		frame.getContentPane().add(mapViewer);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		System.out.println(DistanceUtil.getHaversineDistance(36.12, -86.67, 33.94, -118.40));
		*/
		
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		h.add("ne");
	//	h.add("eqdd");
		//h.add("fslfj");
		//h.add("fsojdff");
		
		Iterator it = h.iterator();
		
		System.out.println(it.next());
		
		while (it.hasNext()) {
			System.out.println("next()");
			System.out.println(it.next());
		}
		System.out.println("end");
	}
}
