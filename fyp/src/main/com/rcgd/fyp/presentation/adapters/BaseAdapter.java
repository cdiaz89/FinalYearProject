package main.com.rcgd.fyp.presentation.adapters;

/**
 * Basic interface for all adapters. 
 * Adapters are the combinations of controllers and presenters,
 * catering on a specific usecase. It uses the method execute() to start the usecase
 * on background thread.
 * @author rcgd
 *
 */
public interface BaseAdapter {

	void execute();
	
}
