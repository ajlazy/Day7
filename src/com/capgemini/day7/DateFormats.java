package com.capgemini.day7;

public class DateFormats {

	
	  
	        int l;
	        static int y; 
	        static int d; 
	        static int m;
	        static String dd; 
	        static String mm;
	        static String yy;
	        static String month[]={ "", "January", "February", "March", "April", "May", "June", "July", "August",
	        		"September", "October", "November", "December" };
	        
	 
	         static String DateFormat(String date) {
	        	 
	            dd = date.substring(0,2); 
	            mm = date.substring(2,4); 
	            yy = date.substring(4); 
	            d = Integer.parseInt(dd); 
	            m = Integer.parseInt(mm); 
	            y = Integer.parseInt(yy); 
	 
	                return (dd+"/"+mm+"/"+yy+"\n" +dd+" "+month[m]+", "+yy);
	                              
	              
	       
	         
	        
	 
	       
	         }
	    
	}


