package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q14OperationsTest {

	@Test
	void testOps() {

		//assertEquals(true, Q14Operations.fileOps("C:\\Files\\Q14a.txt","null",1));
		assertEquals(true, Q14Operations.fileOps("C:\\Files\\Q14b.txt","C:\\Files\\Q14c.txt", 3));
		assertEquals(false, Q14Operations.fileOps("C:\\Files\\Q14c.txt","C:\\Files\\Q14d.txt", 3));
		assertEquals(true, Q14Operations.fileOps("C:\\Files\\Q14e.txt","null",2));

	}

}