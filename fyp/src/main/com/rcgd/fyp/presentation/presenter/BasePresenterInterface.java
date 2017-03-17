package main.com.rcgd.fyp.presentation.presenter;

/**
 * Basic interface for all usecases. It uses the method execute() to start the usecase
 * on background thread.
 * @author rcgd
 *
 */
public interface BasePresenterInterface {

	void execute();
	
}
