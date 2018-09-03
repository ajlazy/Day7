package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class Q13AssignmentTest {

	Q13Assignment assign1=new Q13Assignment(new File ("C:\\\\Files\\\\doc1.txt"),LocalDate.of(2018, 9, 25));
	Q13Assignment assign2=new Q13Assignment(new File ("C:\\Files\\doc2.txt"),LocalDate.of(2018, 10, 11));
	Q13Assignment assign3=new Q13Assignment(new File ("C:\\Files\\doc3.txt"),LocalDate.of(2018, 10, 24));
	Q13Assignment assign4=new Q13Assignment(new File ("C:\\Files\\doc4.txt"),LocalDate.of(2018, 11, 28));
	Q13Assignment assign5=new Q13Assignment(new File ("C:\\Files\\doc5.txt"),LocalDate.of(2018, 12, 27));

	@Test
	void testAddAssignment() throws IOException {
		Q13Assignment.addAssignment(assign1);
		Q13Assignment.addAssignment(assign2);
		Q13Assignment.addAssignment(assign3);
		Q13Assignment.addAssignment(assign4);
		Q13Assignment.addAssignment(assign5);
		assertEquals(true, Q13Assignment.removeAssignment(assign1));
		assertEquals(assign2, Q13Assignment.getFirst());

	}

	

}