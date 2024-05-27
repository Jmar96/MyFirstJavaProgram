package com.jproject.myfirstjavaprogram;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student2 {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student2(String name, int[] marks) {
		this.name = name;
		for(int mark:marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return marks.size();
	}

	public int getSumOfMarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}

		return sum;
	}

	public int getMaxOfMarks() {
		// TODO Auto-generated method stub
		return Collections.max(marks);
	}

	public int getMinOfMarks() {
		// TODO Auto-generated method stub
		return Collections.min(marks);
	}

	public BigDecimal getAveOfMarks() {
		// TODO Auto-generated method stub
		int sum = getSumOfMarks();
		int num = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(num), 3, RoundingMode.UP);
	}
	
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		// TODO Auto-generated method stub
		marks.add(mark);
	}

	public void removeMarkAtIndex(int i) {
		// TODO Auto-generated method stub
		marks.remove(i);
		
	}
}
