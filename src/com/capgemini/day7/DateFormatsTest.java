package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DateFormat;

import org.junit.jupiter.api.Test;

class DateFormatsTest {

	@Test
	void testDatesFormatTest() {
		assertEquals("02/05/2009\n02 May, 2009",DateFormats.DateFormat("02052009"));
	}

}
