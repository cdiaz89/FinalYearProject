package main.com.rcgd.fyp.presentation.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.com.rcgd.fyp.presentation.presenter.MainPresenter;

public class MainView extends JFrame implements MainViewInterface {

	private MainPresenter presenter;
	private MapView mMapComponent;
	private InputView mInputComponent;
	
	
	public MainView(MainPresenter presenter) {
		super("Runner App");
		
		this.presenter = presenter;
		mMapComponent = new MapView();
		mInputComponent = new InputView();
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(mInputComponent, BorderLayout.NORTH);
		panel.add(mMapComponent, BorderLayout.CENTER);

		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.setVisible(true);	
		
	}

	public MapView getMapComponent() {
		return mMapComponent;
	}
	
	public InputView getIntputComponent() {
		return mInputComponent;
	}
}
