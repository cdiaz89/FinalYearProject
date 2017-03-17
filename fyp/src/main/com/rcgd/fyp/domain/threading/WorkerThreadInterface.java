package main.com.rcgd.fyp.domain.threading;

import main.com.rcgd.fyp.domain.usecases.AbstractUseCase;

/**
 * This interface is used to run use cases in a background thread.
 * It also contains the method that will start the use case.
 * @author rcgd
 *
 */
public interface WorkerThreadInterface {

	void executeUseCase(AbstractUseCase usecase);
}
