package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class Q4grepApplicationtest {

	@Test
	void testgrepApplication() {
		File f=new File("C:\\Files\\docxx.txt");
		assertEquals(true, Q4GrepApplication.grepApplication(f, "cotton"));
		assertEquals(false, Q4GrepApplication.grepApplication(f, "aaaaa"));

	}

}
