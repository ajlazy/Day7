package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Q14Operations {

	public static boolean fileOps(String string1,String string2,int choice )
	{
	    File file1=new File(string1);
	    File file2=new File(string2);
	    LinkedList<Character> list1=new LinkedList<>();
	    LinkedList<Character> list2=new LinkedList<>();
	    File output=new File("C:\\Files\\Q14doc.txt");
	    switch(choice) {
	    case 1:
	    {
	    	int check=0;
	    	try(FileReader reader=new FileReader(file1);
	    			BufferedReader br=new BufferedReader(reader))
	    			{
	    		while((check=br.read())!=-1)
	    		{
	    			list1.add((char) check);
	    				
	    		}	
	    				
	    				
	    		}
	    	catch(IOException e)
	    	{
	    	   e.printStackTrace();
	    	}
	    	
	    	
	    	try(FileWriter writer=new FileWriter(output);
	    			BufferedWriter br=new BufferedWriter(writer))
	    			{
	    				for(int i=list1.size();i>=0;i--)
	    				{
	    					br.write(list1.get(i));
	    				}
	    				
	    				
	    				
	    				
	    			}catch(IOException e)
	    	{
	    				e.printStackTrace();
	    	}
	    	return true;
	    	}
	    
	    case 3:
	    {
	    	int check;
	    	try(FileReader reader1=new FileReader(file1);
	    	FileReader reader2=new FileReader(file2);
	    			BufferedReader br1=new BufferedReader(reader1);
	    			BufferedReader br2=new BufferedReader(reader2))
	    			{
	    		
	    		    while((check=br1.read())!=-1)
	    		    {
	    		    	list1.add((char)check);
	    		    	
	    		    }
	    		    
	    		    

	    		    while((check=br2.read())!=-1)
	    		    {
	    		    	list2.add((char)check);
	    		    	
	    		    }
	    		    
	    		    if(list1.equals(list2))
	    		    		return true;
	    		    else return false;
	    		    
	    		    
	    				
	    			}
	    	catch(IOException e)
	    	{
	    		
	    	}
	    	break;
	    	 	
	    }
	    
	    case 2:
	    {
	    	int check=0;
	    	try(FileReader reader=new FileReader(file1);
	    			BufferedReader br=new BufferedReader(reader))
	    			{
	    		while((check=br.read())!=-1)
	    		{
	    			list1.add((char) check);
	    				
	    		}	
	    				
	    				
	    			}
	    	catch(IOException e)
	    	{
	    	   e.printStackTrace();
	    	}
	    	try(FileWriter writer=new FileWriter(output);
	    			BufferedWriter br=new BufferedWriter(writer))
	    			{
	    				for(int i=0;i<list1.size();i++)
	    				{
	    					br.write(Character.toUpperCase(list1.get(i)));
	    				}
	    				
	    				
	    				
	    				
	    			}catch(IOException e)
	    	{
	    				e.printStackTrace();
	    	}
	    	break;
	    	}
	    	
	    	
	    	
	    	
	    }
	    	
	    	
	    	
	    	
	    	
	    	
	    


	   
		
	    
		return true;
		
	}

}
