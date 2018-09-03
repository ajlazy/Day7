package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Q5MyDate implements Serializable {
	public Q5MyDate(int currentDay, int currentmonth, int currentYear) {
		super();
		this.currentDay = currentDay;
		this.currentmonth = currentmonth;
		this.currentYear = currentYear;
	}

	static File f;
	int currentDay;
	int currentmonth;
	int currentYear;

	public int getCurrentDay() {
		return currentDay;
	}

	public void setCurrentDay(int currentDay) {
		this.currentDay = currentDay;
	}

	public int getCurrentmonth() {
		return currentmonth;
	}

	public void setCurrentmonth(int currentmonth) {
		this.currentmonth = currentmonth;
	}

	public int getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	public static File getFile() {
		return f;
	}

	public Q5MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	static ArrayList<Q5MyDate> mydate;

	static String passArrayListToFile(ArrayList<Q5MyDate> date) {
		try (FileOutputStream fileoutputStream = new FileOutputStream(f);
				BufferedReader br = new BufferedReader(new FileReader(f));
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileoutputStream)) {

			objectOutputStream.writeObject(date);
			if (f.exists()) {

				String line = null;

				while ((line = br.readLine()) != null) {
					try (FileInputStream fileinputstream = new FileInputStream(f);
							ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream)) {

						mydate = (ArrayList<Q5MyDate>) objectinputstream.readObject();
						System.out.println(mydate.toString());
						return mydate.toString();

					} catch (IOException | ClassNotFoundException e) {
						e.printStackTrace();
					}

				}
				//return true;

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//return false;
		return null;
	}

	@Override
	public String toString() {
		return currentDay + "," + currentmonth + "," + currentYear;
	}

}
