package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Q3NumberOfWordsCount {
	public static int testnoOfWords() {
		
		int countWord=0;
		String s=null;
		File file1=new File("C:\\Files\\docxx.txt");
		try (FileReader fileReader=new FileReader(file1);
		BufferedReader reader=new BufferedReader(fileReader)){
		
		
		while((s=reader.readLine())!=null)
		{if(!s.equals("")){
			 String[] wordList = s.split("\\s+");
	         
	         countWord += wordList.length;
		}}
		System.out.println(countWord);
			
		
	}catch(IOException e)
		{
		e.printStackTrace();
		}
		return countWord;

	}
}
