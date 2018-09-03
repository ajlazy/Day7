package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import org.junit.jupiter.api.Test;

class Q11BinaryTest {

	@Test
	void test() {
		Random rnum = new Random();
		Integer num;
		File file = new File("C:\\Files\\Q11.txt");
		try (PrintWriter writer = new PrintWriter(file)) {
			for (Integer i = 0; i < 100; i++) {
				num = rnum.nextInt(50);
				writer.println(Integer.toBinaryString(num));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	}


