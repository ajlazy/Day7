package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class Q9NumbersTest {

	@Test
	void test() throws FileNotFoundException, IOException {
		Random rnum = new Random();
		Integer num;
		File file = new File("C:\\Files\\docxx.txt");
		try (PrintWriter writer = new PrintWriter(file)) {
			for (Integer i = 0; i < 100; i++) {
				num = rnum.nextInt(50);
				writer.println(Integer.toString(num));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		TreeSet<Q9numbers> nums = new TreeSet<Q9numbers>();
		try(FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader))
		{
			String s;
			while ((s = reader.readLine()) != null) {
				int number=Integer.parseInt(s);
				nums.add(new Q9numbers(number));
			
			}
			for (Q9numbers numbers : nums) {
				System.out.println(numbers);
			}
		}	
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}


