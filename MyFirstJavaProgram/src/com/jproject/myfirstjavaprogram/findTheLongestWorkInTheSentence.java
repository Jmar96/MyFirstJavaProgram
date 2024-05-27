package com.jproject.myfirstjavaprogram;

public class findTheLongestWorkInTheSentence {
	public String findTheLongestWord(String sentence) {
		
		if(sentence == null || sentence.equals("")) {
			return "";			
		}
		
		String[] words = sentence.split(" ");
		int maxLength = 0;
		String longestWord = "";
		
		for(String word:words) {
			if(word.length()>maxLength) {
				maxLength = word.length();
				longestWord = word;
			}
		}
				
		return longestWord;
	}
}
