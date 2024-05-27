package com.jproject.myfirstjavaprogram;

import java.math.BigDecimal;

public class StudentRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using ARRAYLIST");
		Student2 Student2 = new Student2("Ranga", new int[] { 97, 98, 100 });

		int number = Student2.getNumberOfMarks();
		System.out.printf("|Number of Marks: %d", number).println();

		int sum = Student2.getSumOfMarks();
		System.out.printf("|Sum of Marks: %d", sum).println();

		int max = Student2.getMaxOfMarks();
		System.out.printf("|Maximum of Marks: %d", max).println();

		int min = Student2.getMinOfMarks();
		System.out.printf("|Minimum of Marks: %d", min).println();

		BigDecimal ave = Student2.getAveOfMarks();
		System.out.printf("|Average of Marks: %-15.3f", ave).println();
		
		
		Student2.addNewMark(85);
		System.out.println(Student2);
		
		Student2.removeMarkAtIndex(number);
		System.out.println(Student2);
		
	}

}
