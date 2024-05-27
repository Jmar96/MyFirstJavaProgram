package com.jproject.myfirstjavaprogram;

public class StringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		
		String dayWithMostCharacters = "";
		for(String day:daysOfWeek) {
			if(day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
		System.out.println("Day with most number of character is "+dayWithMostCharacters);
		
		//reverse loop
		for(int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.print(daysOfWeek[i]+" ");
		}
		
		
		//find the longest word
		String sentence = "Java is an object oriented programming languag";
		findTheLongestWorkInTheSentence findLWord = new findTheLongestWorkInTheSentence();
		System.out.println();
		System.out.println(findLWord.findTheLongestWord(sentence));
	}

}
