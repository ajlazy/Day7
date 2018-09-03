package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

class Q6VowelTest {

	HashSet<Integer> result= new HashSet<>();
	@Test
	void testConsonantVowelCount() {
		
		Q6Vowel.ConsonantVowelCount("C:\\Files\\Q14a.txt");
		try (FileInputStream file= new FileInputStream("C:\\Files\\Q6.txt");
				ObjectInputStream in = new ObjectInputStream(file);){
			result= (HashSet<Integer>) in.readObject();
			
			System.out.println(result);
			String [] count;
			count=result.toString().split(",");
			assertEquals(true, result.toString().contains(count[0]));
			assertEquals(true, result.toString().contains(count[1]));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}