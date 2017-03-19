package main.com.rcgd.fyp.presentation.view;

import java.awt.BorderLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import main.com.rcgd.fyp.presentation.model.MapCoordinates;
import main.com.rcgd.fyp.presentation.presenter.AppPresenter;
import main.com.rcgd.fyp.presentation.presenter.MainPresenter;

public class AppView extends JFrame implements MainView {

	private AppPresenter presenter;
	private MapView mapComponent;
	private InputView inputComponent;
	
	
	public AppView(AppPresenter presenter) {
		super("Runner App");
		this.presenter = presenter;
		mapComponent = new MapView();
		inputComponent = new InputView();				
	}
	
	@Override
	public void initialise(MapCoordinates initial, int zoom,
			DefaultComboBoxModel comboBoxModel) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				mapComponent.initialise(initial, zoom);
				inputComponent.initialise(comboBoxModel);
				createGUI();
			}
			
		});
		
		
	}
	
	private void createGUI() {
		// TODO Auto-generated method stub
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(inputComponent, BorderLayout.NORTH);
		panel.add(mapComponent, BorderLayout.CENTER);

		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.setVisible(true);	
	}

	@Override
	public MapComponent getMapComponent() {
		return mapComponent;
	}	

	@Override
	public MainPresenter getPresenter() {	
		return presenter;
	}

	@Override
	public InputComponent getInputComponent() {
		return inputComponent;
	}

	
}
