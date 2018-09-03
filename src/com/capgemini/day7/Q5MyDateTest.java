package com.capgemini.day7;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Q5MyDateTest  {

	@Test
	void testMyDate() {
		File f=new File("C:\\Files\\newFile.txt");
		Q5MyDate MyDate1=new Q5MyDate(7,6,2001);
		Q5MyDate MyDate2=new Q5MyDate(3,4,2010);
		Q5MyDate MyDate3=new Q5MyDate(4,5,2014);
		Q5MyDate MyDate4=new Q5MyDate(6,7,2014);
		Q5MyDate MyDate5=new Q5MyDate(6,7,2012);
		ArrayList<Q5MyDate> dates=new ArrayList<>();
		dates.add(MyDate1);
		dates.add(MyDate2);
		dates.add(MyDate3);
		dates.add(MyDate4);
		dates.add(MyDate5);
		Q5MyDate.f=f;
		assertEquals("[7,6,2001, 3,4,2010, 4,5,2014, 6,7,2014, 6,7,2012]" , Q5MyDate.passArrayListToFile(dates));
	
		
		
		
	}

}
