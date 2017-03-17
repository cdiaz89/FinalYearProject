package main.com.rcgd.fyp.data.repository;

import java.util.List;

import main.com.rcgd.fyp.data.storage.AppData;
import main.com.rcgd.fyp.domain.repository.ModelDataRepositoryInterface;

public class ModelDataRepository implements ModelDataRepositoryInterface{

	private AppData data;
	
	public ModelDataRepository() {
		data = new AppData();
	}
	
	@Override
	public String getMapDataAsString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append(Integer.toString(data.getMapZoom()));
		addComma(builder);
		builder.append(Double.toString(data.getInitialLatitude()));
		addComma(builder);
		builder.append(Double.toString(data.getInitialLongitude()));
		return builder.toString();
	}


	@Override
	public String getListDataAsString() {
		StringBuilder builder = new StringBuilder();
		List<String> list = data.getAlgorithmList();
		
		for (String name: list) {
			builder.append(name);
			addComma(builder);
		}
		return (String) builder.subSequence(0, builder.length());
	}

	private void addComma(StringBuilder string) {
		string.append(",");		
	}
}
