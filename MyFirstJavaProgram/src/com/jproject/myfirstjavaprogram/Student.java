package com.jproject.myfirstjavaprogram;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
	
	
	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return marks.length;
	}

	public int getSumOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int mark:marks) {
			sum += mark;
		}
		
		return sum;
	}

	public int getMaxOfMarks() {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for(int mark:marks) {
			if(mark>max) {
				max = mark;
			}
		}
		
		return max;
	}

	public int getMinOfMarks() {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		for(int mark:marks) {
			if(mark<min) {
				min = mark;
			}
		}
		return min;
	}

	public BigDecimal getAveOfMarks() {
		// TODO Auto-generated method stub
		int sum = getSumOfMarks();
		int num = getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(num), 3, RoundingMode.UP);
	}

}
