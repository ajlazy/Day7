package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class Q10ValidDateTest {

	@Test
	void testWithValidInputs() {
	Boolean validated=Q10ValidDate.checkDate("17/3/2015");
	if(validated)
	{
		assertEquals(LocalDate.of(2018, 03, 18),Q10ValidDate.futureDate(5));
	}
	else
	{
		System.out.println("Test case faied");
	}
}
	@Test
	void testWithInvalidInputs()
	{
		Boolean validated=Q10ValidDate.checkDate("31/2/2003");
		if(validated)
		{
			assertEquals(LocalDate.of(2018, 03, 18),Q10ValidDate.futureDate(5));
		}
		else
		{
			System.out.println("Test case faied");
		}
	}
}
