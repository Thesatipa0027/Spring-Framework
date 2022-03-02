package com.example.mockito.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MockitoApplicationTests {

	@Test
	void contextLoads() {
		DataService mock = Mockito.mock(DataService.class);
		when(mock.retrieveAllData()).thenReturn(new int[] {2,4,6,8});
		SomeBuissinessService someBuissinessService = new SomeBuissinessService(mock);
		int result = someBuissinessService.findTheGreatestAmongAll();
		assertEquals(8, result);
	}

}
