package main.com.rcgd.fyp.presentation.model;

import javax.swing.DefaultComboBoxModel;

/**
 * This consists of the model functionality.
 * 
 * @author rcgd
 *
 */
public interface Model {

	//initialisation
	void initialiseComboBoxModel();
	
	//getters
	int getMapZoom();
	MapCoordinates getInitialPosition();
	MapCoordinates getStartPosition();
	MapCoordinates getEndPosition();
	double getDistance();
	String getAlgorithm();
	DefaultComboBoxModel getComboBoxModel();
	
	//setters
	void setZoom(int zoom);
	void setInitialPosition(double lat, double lon);
	void setStartPosition(double lat, double lon);
	void setEndPosition(double lat, double lon);
	void setDistance(double distance);
	void setAlgorithm(String algorithm);
}
