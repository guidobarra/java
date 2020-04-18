package edu.om.exams.unlam_exam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
	
	private Anagram() {}
	
	public static int countMinimumForBeAnagram(final String first, final String second){
		char[] minor = first.toCharArray();
		char[] major = second.toCharArray();
		
		if(minor.length > major.length){
			char[] auxiliar = minor;
			minor = major;
			major = auxiliar;
		}
		char charNull = '\u0000';
		int amountEquals = 0;
		for(int indexMinor = 0; indexMinor < minor.length; indexMinor++){
			for(int indexMajor = 0; indexMajor < major.length; indexMajor++){
				if(minor[indexMinor] == major[indexMajor]){
					major[indexMajor] = charNull;
					amountEquals++;
					break;
				}
			}
		}
		
		return (minor.length - amountEquals) + (major.length - amountEquals);
	}

	public static Integer findNumber(List<Integer> numbers, int myNumber){
		Integer findedNumber = numbers.stream().filter(number -> number == myNumber).findAny().orElse(null);
		return findedNumber;
	}
	
	public static Map<Character, Integer> getAmountRepetedLetters(final String word){
		Map<Character, Integer> amountRepeted = new HashMap();
		for(int index = 0; index < word.length(); index++){
			Character letter = word.charAt(index);
			Integer amount = amountRepeted.get(letter);
			if(amount == null){
				amountRepeted.put(letter, 1);
			}else{
				amountRepeted.put(letter, ++amount);
			}
		}
		
		return amountRepeted;
	}
}
