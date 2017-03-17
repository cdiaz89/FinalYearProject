package main.com.rcgd.fyp.presentation.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputView extends JPanel {

	/**
	 * default ID
	 */
	private static final long serialVersionUID = 1L;

	private JButton startLocationButton;
	private JButton endLocationButton;
	private JButton calculateRouteButton;
	private JTextField distanceTextField;
	private JComboBox<String> selectAlgorithm;
	
	public InputView() {
		initialise();
	}

	private void initialise() {	
		startLocationButton = new JButton("Click to Select Start Location");
		endLocationButton = new JButton("Click to Select End Location");
		calculateRouteButton = new JButton("Calculate Route");
		distanceTextField = new TextFieldWithDescription("Enter Required Distance in KM");
		selectAlgorithm = new JComboBox<>();
		this.setLayout(new GridLayout(2,3));
		this.add(startLocationButton);
		this.add(distanceTextField);
		this.add(calculateRouteButton);
		this.add(endLocationButton);
		this.add(selectAlgorithm);	
	}
	
	
}
