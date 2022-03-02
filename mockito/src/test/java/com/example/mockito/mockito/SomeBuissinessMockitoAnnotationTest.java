package com.example.mockito.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
class SomeBuissinessMockitoAnnotationTest {
	
	
	@Mock
	DataService mockDataService;
	
	@InjectMocks
	SomeBuissinessService someService;

	@Test
	void testFindTheGreatestAmongAll() {
		when(mockDataService.retrieveAllData()).thenReturn(new int[] {2,4,6,8});
		assertEquals(8,someService.findTheGreatestAmongAll());
	}
}

