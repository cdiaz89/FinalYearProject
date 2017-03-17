package main.com.rcgd.fyp.presentation.threading;

import javax.swing.SwingWorker;

import main.com.rcgd.fyp.domain.threading.WorkerThreadInterface;
import main.com.rcgd.fyp.domain.usecases.AbstractUseCase;

/**
 * 
 * @author rcgd
 *
 */
public class WorkerThread extends SwingWorker<Void, Void> implements WorkerThreadInterface{
	
	@SuppressWarnings("rawtypes")
	AbstractUseCase usecase;
	
	@Override
	protected Void doInBackground() throws Exception {
		// TODO Auto-generated method stub
		usecase.run();
		return null;
	}

	@Override
	public void executeUseCase(AbstractUseCase usecase) {
		this.usecase = usecase;
		this.execute();
	}
	
	@Override
	public void done() {
		this.usecase.initiateCallBack();
	}

}
