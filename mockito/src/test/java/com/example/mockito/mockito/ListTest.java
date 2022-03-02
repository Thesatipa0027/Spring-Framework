package com.example.mockito.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	@Test
	void test_multipleReturns() {
		List list = mock(List.class);
		when(list.get(Mockito.anyInt())).thenReturn("SomeString");
		assertEquals("SomeString",list.get(2));

	}

}
