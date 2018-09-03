package com.capgemini.day7;

import java.time.LocalDate;

public class Q12MagicDate {



	public static String checkIfMagicDate(LocalDate date) {
		int month=(Integer)date.getMonthValue() ;
		int year=date.getYear() ;
		int day=date.getDayOfMonth() ;
		if((day*month)==year)
			return "Magic date" ;
		return "Not a Magic date"; 	
	}
}