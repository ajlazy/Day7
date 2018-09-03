package com.capgemini.day7;

<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Q2NumberOfLines {
	
	
	
	


	
		public static int testnoOfLines() {
			String s=null;
			int count=0;
			File file1=new File("C:\\Files\\docxx.txt");
			try (FileReader fileReader=new FileReader(file1);
			BufferedReader reader=new BufferedReader(fileReader)){
			
			
			while((s=reader.readLine())!=null)
				count++;
			
		}catch(IOException e)
			{
			e.printStackTrace();
			}
			return count;

		}
	}



=======
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q2NumberOfLines {
	public static int testnoOfLines() {
		String s=null;
		int count=0;
		File file1=new File("C:\\Files\\docxx.txt");
		try (FileReader fileReader=new FileReader(file1);
		BufferedReader reader=new BufferedReader(fileReader)){
		
		
		while((s=reader.readLine())!=null)
			count++;
		
	}catch(IOException e)
		{
		e.printStackTrace();
		}
		return count;

	}
}
>>>>>>> branch 'master' of https://github.com/ajlazy/Day7.git


