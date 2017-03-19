package main.com.rcgd.fyp.presentation.presenter;

import main.com.rcgd.fyp.domain.threading.MainThread;
import main.com.rcgd.fyp.presentation.model.Model;
import main.com.rcgd.fyp.presentation.view.MainView;
/**
 * This defines the functionalities of the main presenter.
 * @author rcgd
 *
 */
public interface MainPresenter {
	
	MainThread getMainThread();
	Model getModel();
	MainView getView();
	void retrieveModelData();
	void onModelDataReceived(String modelData);	
	void onModelDataNotFound();
	void initialiseView();
	
	
}
