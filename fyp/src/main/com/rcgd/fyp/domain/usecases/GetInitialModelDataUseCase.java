package main.com.rcgd.fyp.domain.usecases;

import main.com.rcgd.fyp.domain.threading.WorkerThreadInterface;

public class GetInitialModelDataUseCase extends AbstractUseCase {
	
	//create repository
	private GetInitialModelDataCallback callback;
	
	private String mapData;
	private String listData;

	public GetInitialModelDataUseCase(
			WorkerThreadInterface workerThread,
			GetInitialModelDataCallback callback) {
		super(workerThread);
		this.callback = callback;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initiateCallBack() {
		if (mapData == null || listData == null) { 
			//not found in the repository
			callback.noDataFound();
		} else {
			callback.onDataRetrieved(mapData, listData);
		}
		
	}

}
