package main.com.rcgd.fyp.presentation.presenter;

import main.com.rcgd.fyp.domain.usecases.GetInitialModelDataCallback;
import main.com.rcgd.fyp.domain.usecases.GetInitialModelDataUseCase;
import main.com.rcgd.fyp.presentation.threading.WorkerThread;

public class GetInitialMapDataPresenter implements BasePresenterInterface, GetInitialModelDataCallback {

	private GetInitialModelDataUseCase retrieveInitialModelDataUseCase;
	private MainPresenter presenter;
	
	public GetInitialMapDataPresenter(MainPresenter presenter) {
		this.presenter = presenter;
		retrieveInitialModelDataUseCase = new
				GetInitialModelDataUseCase(new WorkerThread(), this);
	}

	@Override
	public void execute() {
		retrieveInitialModelDataUseCase.execute();
		
	}
	@Override
	public void noDataFound() {
		this.presenter.setErrorInitialisationMessage();
		
	}

	@Override
	public void onDataRetrieved(String mapData, String listData) {
		this.presenter.convertModelData(mapData, listData);		
	}

	



	

}
