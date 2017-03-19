package main.com.rcgd.fyp.presentation.view;

import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.com.rcgd.fyp.presentation.model.AlgorithmNames;

public class InputView extends JPanel implements InputComponent{

	/**
	 * default ID
	 */
	private static final long serialVersionUID = 1L;

	private JButton startLocationButton;
	private JButton endLocationButton;
	private JButton calculateRouteButton;
	private JTextField distanceTextField;
	private JComboBox<AlgorithmNames> algorithmComboBox;
	
	public InputView() {
		super();
	}

	@Override
	public void initialise(DefaultComboBoxModel comboBoxModel) {	
		startLocationButton = new JButton("Click to Select Start Location");
		endLocationButton = new JButton("Click to Select End Location");
		calculateRouteButton = new JButton("Calculate Route");
		distanceTextField = new TextFieldWithDescription("Enter Required Distance in KM");
		algorithmComboBox = new JComboBox<>(comboBoxModel);
		this.setLayout(new GridLayout(2,3));
		this.add(startLocationButton);
		this.add(distanceTextField);
		this.add(calculateRouteButton);
		this.add(endLocationButton);
		this.add(algorithmComboBox);	
	}

	@Override
	public JButton getStartLocationButton() {
		// TODO Auto-generated method stub
		return startLocationButton;
	}

	@Override
	public JButton getEndLocationButton() {
		// TODO Auto-generated method stub
		return endLocationButton;
	}

	@Override
	public JButton getCalculateRouteButton() {
		// TODO Auto-generated method stub
		return calculateRouteButton;
	}

	@Override
	public JTextField getDistanceTextField() {
		// TODO Auto-generated method stub
		return distanceTextField;
	}

	@Override
	public JComboBox<AlgorithmNames> getAlgorithmComboBox() {
		// TODO Auto-generated method stub
		return algorithmComboBox;
	}
	
	
}
