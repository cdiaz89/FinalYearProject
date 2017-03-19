package main.com.rcgd.fyp.presentation.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import main.com.rcgd.fyp.presentation.model.AlgorithmNames;

public interface InputComponent {

	void initialise(DefaultComboBoxModel comboBoxModel);
	JButton getStartLocationButton();
	JButton getEndLocationButton();
	JButton getCalculateRouteButton();
	JTextField getDistanceTextField();
	JComboBox<AlgorithmNames> getAlgorithmComboBox();
}
