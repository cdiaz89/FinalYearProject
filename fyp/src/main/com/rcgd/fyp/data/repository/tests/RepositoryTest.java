package main.com.rcgd.fyp.data.repository.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import main.com.rcgd.fyp.data.repository.AppRepository;

public class RepositoryTest {

	@Test
	public void testGetMapDataAsString() {
		AppRepository repository = new AppRepository();
		assertEquals("7,51.50853,-0.076132",repository.getModelDataAsString());
	}

}
