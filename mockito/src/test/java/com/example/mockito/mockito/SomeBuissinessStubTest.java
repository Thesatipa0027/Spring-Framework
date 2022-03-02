package com.example.mockito.mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBuissinessStubTest {

	@Test
	void test() {
		SomeBuissinessService someBuissinessService = new SomeBuissinessService(new DataServiceStub());
		int result = someBuissinessService.findTheGreatestAmongAll();
		assertEquals(8, result);
	}
}

class DataServiceStub implements DataService{
	@Override
	public int[] retrieveAllData() {
		return new int[]{2,4,6,8};
	}
}