package main.com.rcgd.fyp.presentation.presenter;

import java.util.List;

import main.com.rcgd.fyp.presentation.model.AppModel;
import main.com.rcgd.fyp.presentation.model.MapCoordinates;
import main.com.rcgd.fyp.presentation.view.MapComponent;

public class MapPresenter implements MapPresenterInterface {
	private MapComponent mapComponent;
	private AppModel model;
	
	public MapPresenter(MapComponent mapComponent, AppModel model) {
		this.mapComponent = mapComponent;
		this.model = model;
	}

	@Override
	public void showStartPosition() {
		mapComponent.showStartLocation(model.getStartPosition());
	}

	@Override
	public void showEndPosition() {
		mapComponent.showEndLocation(model.getEndPosition());
		
	}

	@Override
	public void showRoute() {
		// TODO Auto-generated method stub
		
	}

}
