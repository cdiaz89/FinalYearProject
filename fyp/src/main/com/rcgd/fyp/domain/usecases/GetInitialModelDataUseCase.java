package main.com.rcgd.fyp.domain.usecases;

import main.com.rcgd.fyp.domain.repository.Repository;
import main.com.rcgd.fyp.domain.threading.WorkerThread;

public class GetInitialModelDataUseCase extends AbstractUseCase {
	
	private Repository repository;
	private GetInitialModelDataCallback callback;
	
	private String modelData;

	public GetInitialModelDataUseCase(WorkerThread workerThread,
			Repository repository,
			GetInitialModelDataCallback callback) {
		super(workerThread);
		this.repository = repository;
		this.callback = callback;
	}

	@Override
	public void run() {
		modelData = repository.getModelDataAsString();
		
	}

	@Override
	public void initiateCallBack() {
		if (modelData == null) { 
			//not found in the repository
			callback.noDataFound(); 
		} else {
			callback.onDataRetrieved(modelData);
		}
		
	}

}
