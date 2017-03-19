package main.com.rcgd.fyp.presentation.adapters;

import main.com.rcgd.fyp.domain.threading.MainThread;
import main.com.rcgd.fyp.domain.usecases.GetInitialModelDataCallback;
import main.com.rcgd.fyp.domain.usecases.GetInitialModelDataUseCase;
import main.com.rcgd.fyp.presentation.presenter.AppPresenter;
import main.com.rcgd.fyp.presentation.presenter.MainPresenter;
import main.com.rcgd.fyp.presentation.threading.UseCaseThread;

public class GetInitialModelData implements BaseAdapter, GetInitialModelDataCallback {

	private GetInitialModelDataUseCase retrieveInitialModelDataUseCase;
	private MainPresenter presenter;
	
	public GetInitialModelData(MainPresenter presenter) {
		this.presenter = presenter;
		retrieveInitialModelDataUseCase = new GetInitialModelDataUseCase(
				new UseCaseThread(), this.presenter.getMainThread().getRepository(), this);
	}

	@Override
	public void execute() {
		retrieveInitialModelDataUseCase.execute();
		
	}
	@Override
	// Callback methods
	public void noDataFound() {
		presenter.onModelDataNotFound();
		
	}

	@Override
	public void onDataRetrieved(String modelData) {
		this.presenter.onModelDataReceived(modelData);		
	}

	



	

}
