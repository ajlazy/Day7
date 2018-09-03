package com.capgemini.day7;

import java.time.LocalDate;
import java.time.DateTimeException;

public class Q10ValidDate {
	private static int day;
	private static int month;
	private static int year;

	public static Boolean checkDate(String dt) {
		String[] dateProperties = dt.split("/");

		if (dateProperties != null) {
			year = Integer.parseInt(dateProperties[0]);
			month =Integer.parseInt(dateProperties[1]);
			day = Integer.parseInt(dateProperties[2]);
			try {
				LocalDate.of(day, month, year);
				return true;
			} catch (DateTimeException e) {
				return false;
			}

		}
		return null;
	}

	public static LocalDate futureDate(int i) {
		LocalDate futureDate = LocalDate.of(day,month,year).plusDays(i);
		System.out.println(futureDate);
		return futureDate;
	}

}


