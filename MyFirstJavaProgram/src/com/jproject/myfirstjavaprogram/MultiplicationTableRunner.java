package com.jproject.myfirstjavaprogram;

public class MultiplicationTableRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationTable table = new MultiplicationTable();
		table.print();
		System.out.println("==========================");
		table.print(6);
		System.out.println("==========================");
		table.print(7,1,5);
	}

}
