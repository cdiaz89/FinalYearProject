package main.com.rcgd.fyp.presentation.presenter;

import main.com.rcgd.fyp.presentation.model.AppModel;
import main.com.rcgd.fyp.presentation.view.MainView;
import main.com.rcgd.fyp.presentation.view.MainViewInterface;

/**
 * 
 * @author rcgd
 *
 */
public class MainPresenter implements MainPresenterInterface{
	
	private AppModel model;
	private MainViewInterface view;
	
	private MapPresenter mMapPresenter;
	
	public MainPresenter() {
		retrieveModelData();
	}

	@Override
	public void retrieveModelData() {
		model = getModel();
		
	} 
	
	private AppModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	private void retrieveMapData() {
		GetInitialMapDataPresenter presenter = new GetInitialMapDataPresenter(this);
		presenter.execute();
	}


	@Override
	public void initialiseMainView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setErrorInitialisationMessage() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void convertModelData(String mapData, String listData) {
		// TODO Auto-generated method stub
		
	}

	
	
}
