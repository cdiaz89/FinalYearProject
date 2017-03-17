package main.com.rcgd.fyp.domain.usecases;


import main.com.rcgd.fyp.domain.threading.WorkerThreadInterface;

/**
 * 
 * @author rcgd
 *
 */

public abstract class AbstractUseCase {

	protected WorkerThreadInterface workerThread;
	
	public AbstractUseCase(WorkerThreadInterface workerThread) {
		this.workerThread = workerThread;
	}
	
	/**
	 * This contains the operation of the use case. This is not called directly,
	 * but used inside the worker thread. 
	 * This method is made public for easier testing.
	 */
	public abstract void run();
	
	public abstract void initiateCallBack();
	
	public void execute() {
		workerThread.executeUseCase(this);
	}
}
