package main.com.rcgd.fyp.presentation.presenter;

import main.com.rcgd.fyp.domain.threading.MainThread;
import main.com.rcgd.fyp.presentation.adapters.GetInitialModelData;
import main.com.rcgd.fyp.presentation.model.AppModel;
import main.com.rcgd.fyp.presentation.view.AppView;
import main.com.rcgd.fyp.presentation.view.MainView;

/**
 * Class that represents the main presenter of the front end. 
 * The main presenter handles the interaction between the UI and the use cases.
 * @author rcgd
 *
 */
public class AppPresenter implements MainPresenter{
	
	private static final int MAP_ZOOM_INDEX = 0;
	private static final int LAT_INDEX = 1;
	private static final int LON_INDEX = 2;
	private static final int MAP_DATA_VALUES = 3;

	private MainThread mainThread;
	private AppModel model;
	private MainView view;
	
	private MapPresenter mapPresenter;
	
	public AppPresenter(MainThread mainThread) {
		this.mainThread = mainThread;
		retrieveModelData();
	}

	@Override
	public MainThread getMainThread() {
		// TODO Auto-generated method stub
		return mainThread;
	}
		
	@Override
	public void retrieveModelData() {
		GetInitialModelData adapter = new GetInitialModelData(this);
		adapter.execute();
	}

	@Override
	public void onModelDataReceived(String modelData) {
		model = createModel(modelData);
		
		if (model == null) {
			onModelDataNotFound();
		} else {
			initialiseView();
		}	
	}
	
	private AppModel createModel(String mapData) {
		String[] initialMapData = mapData.split(",");
		// Checks if map data array has three values and algorithm list has more than one value
		if (initialMapData.length < MAP_DATA_VALUES) {
			return null;
		} else {
			int mapZoom = Integer.parseInt(initialMapData[MAP_ZOOM_INDEX]);
			double lat = Double.parseDouble(initialMapData[LAT_INDEX]);
			double lon = Double.parseDouble(initialMapData[LON_INDEX]);
			AppModel model = new AppModel(mapZoom, lat, lon);
			return model;
		}

	}

	@Override
	public void onModelDataNotFound() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void initialiseView() {
		view = new AppView(this);
		view.initialise(model.getInitialPosition(), model.getMapZoom(),
				model.getComboBoxModel());

	}

	@Override
	public AppModel getModel() {
		return model;
	}

	@Override
	public MainView getView() {
		return view;
	}

	
	
	
}
