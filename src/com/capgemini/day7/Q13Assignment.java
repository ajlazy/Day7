package com.capgemini.day7;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;

public class Q13Assignment {






	File assignmentFile;
	LocalDate date;
	static LinkedList<Q13Assignment> a=new LinkedList<>();
	public Q13Assignment() {
		super();
	}

	public Q13Assignment(File assignmentFile, LocalDate date) {
		super();
		this.assignmentFile = assignmentFile;
		this.date = date;
	}

	public static void addAssignment(Q13Assignment newAssignment) throws IOException
	{
		a.add(newAssignment);
		newAssignment.assignmentFile.createNewFile();
	}

	public static boolean removeAssignment(Q13Assignment remName)
	{
		
		remName.assignmentFile.delete();
		
		return a.remove(remName);
	}

	@Override
	public String toString() {
		return "Assignment [assignmentFile=" + assignmentFile + ", date=" + date + "]";
	}



	public static Q13Assignment getFirst() {
		Q13Assignment near=a.getFirst();
		for (Q13Assignment assignment : a) {
			int a=near.date.compareTo(assignment.date);

			if(a>=0)
				near=assignment;


		}	
		System.out.println(near);
		return near;
		
	}
}