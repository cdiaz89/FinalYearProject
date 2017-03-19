package main.com.rcgd.fyp.domain.threading;

import main.com.rcgd.fyp.domain.repository.Repository;
import main.com.rcgd.fyp.presentation.presenter.MainPresenter;

/**
 * This interface defines the functionality of the class that runs the application.
 * It consist of the method the allows post-worker thread operations
 * and getters for the repository and the main presenter.
 * on the main thread.
 * @author rcgd
 *
 */
public interface MainThread {

	void post (final Runnable r);
	Repository getRepository();
	MainPresenter getMainPresenter();
}
