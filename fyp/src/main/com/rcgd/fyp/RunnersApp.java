package main.com.rcgd.fyp;

import main.com.rcgd.fyp.data.repository.AppRepository;
import main.com.rcgd.fyp.domain.repository.Repository;
import main.com.rcgd.fyp.domain.threading.MainThread;
import main.com.rcgd.fyp.presentation.presenter.AppPresenter;
import main.com.rcgd.fyp.presentation.presenter.MainPresenter;

public class RunnersApp implements MainThread{

	private final AppPresenter presenter;
	private final AppRepository repository;
	
	public RunnersApp() {
		repository = new AppRepository();
		presenter = new AppPresenter(this);
	}
	
	@Override
	public void post(Runnable r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Repository getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	@Override
	public MainPresenter getMainPresenter() {
		// TODO Auto-generated method stub
		return presenter;
	}

}
