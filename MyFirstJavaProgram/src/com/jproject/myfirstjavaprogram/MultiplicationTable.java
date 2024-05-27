package com.jproject.myfirstjavaprogram;

public class MultiplicationTable {
	void print() {
//		System.out.println("Hello for loop");
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
//		}
		print(5, 1, 10);
	}
	
	void print(int table) {
//		System.out.println("Hello for loop");
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf("%d * %d = %d", table, i, table * i).println();
//		}
		print(table, 1, 10);
	}
	
	void print(int table, int from, int to) {
		System.out.println("Hello for loop");
		for (int i = from; i <= to; i++) {
			System.out.printf("%d X %d = %d", table, i, table * i).println();
		}
	}
}

