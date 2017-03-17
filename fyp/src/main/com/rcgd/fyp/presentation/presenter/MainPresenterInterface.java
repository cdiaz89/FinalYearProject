package main.com.rcgd.fyp.presentation.presenter;

public interface MainPresenterInterface {
	
	void retrieveModelData();
	void setErrorInitialisationMessage();
	void convertModelData(String mapData, String listData);
	void initialiseMainView();
	
}
