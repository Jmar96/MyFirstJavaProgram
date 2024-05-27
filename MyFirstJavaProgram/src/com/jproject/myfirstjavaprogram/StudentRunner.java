package com.jproject.myfirstjavaprogram;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using ARRAY");
		int[] marks = {97, 98, 100};
		
		Student student = new Student("Ranga", marks);
		int number = student.getNumberOfMarks();
		System.out.printf("Number of Marks: %d", number).println();

		int sum = student.getSumOfMarks();
		System.out.printf("Sum of Marks: %d", sum).println();
		
		int max = student.getMaxOfMarks();
		System.out.printf("Maximum of Marks: %d", max).println();

		int min = student.getMinOfMarks();
		System.out.printf("Minimum of Marks: %d", min).println();

		BigDecimal ave = student.getAveOfMarks();
		System.out.printf("Average of Marks: %-15.3f", ave).println();
		
		
	}

}
