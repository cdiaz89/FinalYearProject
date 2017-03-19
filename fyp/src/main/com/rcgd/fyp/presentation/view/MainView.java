package main.com.rcgd.fyp.presentation.view;

import javax.swing.DefaultComboBoxModel;

import main.com.rcgd.fyp.presentation.model.MapCoordinates;
import main.com.rcgd.fyp.presentation.presenter.MainPresenter;

/**
 * This defines the methods required in the application's View. 
 * @author rcgd
 *
 */
public interface MainView {
	
	void initialise(MapCoordinates initial, int zoom,
			DefaultComboBoxModel comboBoxModel);
	MainPresenter getPresenter();
	MapComponent getMapComponent();
	InputComponent getInputComponent();
}
