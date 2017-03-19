package main.com.rcgd.fyp.data.repository;

import java.util.List;

import main.com.rcgd.fyp.data.storage.FrontEndDataAccess;
import main.com.rcgd.fyp.domain.repository.Repository;
import main.com.rcgd.fyp.domain.threading.MainThread;

/**
 * This class represents the data repository of the application.
 * It manages different storage access.
 * @author rcgd
 *
 */
public class AppRepository implements Repository{

	
	@Override
	public String getModelDataAsString() {
		String result;
		FrontEndDataAccess access = new FrontEndDataAccess();
		result = access.getMapDataInCSVFormat();
		return access.getMapDataInCSVFormat();	
	}
	
}
