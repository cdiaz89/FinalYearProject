package main.com.rcgd.fyp.presentation.presenter;

import java.util.List;

import main.com.rcgd.fyp.presentation.model.AppModel;
import main.com.rcgd.fyp.presentation.model.MapCoordinates;
import main.com.rcgd.fyp.presentation.view.MapViewInterface;

public class MapPresenter implements MapPresenterInterface {
	private MapViewInterface mapComponent;
	private AppModel model;
	
	public MapPresenter(MapViewInterface mapComponent, AppModel model) {
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
