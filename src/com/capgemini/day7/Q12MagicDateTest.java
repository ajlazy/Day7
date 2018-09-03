package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class Q12MagicDateTest {

	@Test
	void testWithValidInputs() {
Q12MagicDate date= new Q12MagicDate();
		assertEquals("Magic date",date.checkIfMagicDate(LocalDate.of(60,4,15)));
	}
	void testWithInvalidInputs() {
		Q12MagicDate date= new Q12MagicDate();
		assertEquals("Not a Magic date",date.checkIfMagicDate(LocalDate.of(75,4,15)));
	}
}


