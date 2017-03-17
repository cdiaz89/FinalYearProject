package main.com.rcgd.fyp;

import main.com.rcgd.fyp.domain.threading.MainThreadInterface;
import main.com.rcgd.fyp.presentation.presenter.MainPresenter;

public class RunnersApp implements MainThreadInterface{

	private final MainPresenter mMainPresenter;
	
	public RunnersApp() {
		mMainPresenter = new MainPresenter();
	}
	
	@Override
	public void post(Runnable r) {
		// TODO Auto-generated method stub
		
	}

}
