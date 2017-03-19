package main.com.rcgd.fyp.domain.usecases;

public interface GetInitialModelDataCallback {

	void noDataFound();
	void onDataRetrieved(String mapData);
}
