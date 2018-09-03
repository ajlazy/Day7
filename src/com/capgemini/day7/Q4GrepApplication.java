package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q4GrepApplication {
	public static boolean grepApplication(File f,String s)
	{
		if(f.exists())
		{
			int i=0;
			int numberOfLines=0;
			String lines=null;
			String[] words = null;
			try(FileReader file=new FileReader(f);
					BufferedReader reader=new BufferedReader(file)){
					
			while(((lines=reader.readLine())!=null))
			{
				numberOfLines++;
				if(!lines.equals(""))
					words=lines.split(" +");
				for(i=0;i<words.length;i++)
				{
					if(words[i].equals(s)) {
						System.out.println(numberOfLines + lines);
					    return true;
				}}
							}
			
			
			}catch(IOException e) {
			  e.printStackTrace();
			}
		}
		return false;
		
	}

}
