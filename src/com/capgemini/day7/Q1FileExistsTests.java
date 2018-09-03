package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class Q1FileExistsTests {

	@Test
	







	void testfileexists() {
		File file1=new File("C:\\users\\ajain102");
		assertEquals(true, file1.exists());
		File file2=new File("C:\\users\\file");
		assertEquals(false, file2.exists());


		
	}

}
