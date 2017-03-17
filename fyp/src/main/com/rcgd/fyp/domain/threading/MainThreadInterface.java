package main.com.rcgd.fyp.domain.threading;

/**
 * This interface defines the method the allows post-worker thread operations
 * on the main thread.
 * @author rcgd
 *
 */
public interface MainThreadInterface {

	void post (final Runnable r);
}
