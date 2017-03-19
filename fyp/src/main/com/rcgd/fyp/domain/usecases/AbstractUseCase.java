package main.com.rcgd.fyp.domain.usecases;


import main.com.rcgd.fyp.domain.threading.WorkerThread;

/**
 * 
 * @author rcgd
 *
 */

public abstract class AbstractUseCase {

	protected WorkerThread workerThread;
	
	public AbstractUseCase(WorkerThread workerThread) {
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
