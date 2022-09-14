package students.task01;
import java.math.MathContext;

/**
 * @author fahmidahamid
 * @author Sami Cemek
 * @date Aug 31 2020
 * @version 1.1
 */

class FunString {

	String inputString;
	int counterVowels = 0;
	int counterDigits = 0;

	//constructor
	FunString(String inputString){
		this.inputString = inputString;
	}

	// Delegation
	// delegate the length() method from the String class
	public int length(){
		System.out.println("There are " + inputString.length() + " character in total.");
		return inputString.length();
	}

	//Counts the total number of vowels in a String.
	public int countVowels(){
		
		// Traverse the string
		for (int i = 0; i < inputString.length(); i++) {

			char ch = inputString.charAt(i);
						
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
				counterVowels++;
			}
		}
		System.out.println("There are " + counterVowels + " vowels in your sentence.");
		return counterVowels;
	}

	//Counts the total number of digits (0~9) in a String.
	public int countDigits(){

		//convert the string to an array of characters
		char[] ch = inputString.toCharArray();
		for(char c : ch){
			if(Character.isDigit(c)){ //find if the string has any numbers
				counterDigits++;
			}
		}
		
		System.out.println("There are " + counterDigits + " digits in your sentence.");
		return counterDigits;
	}
	
	/*
	 * Composition method works 
	 * Strings is a final class and immutable thats why we cannot inherit them
	 * Using delegation is more appropriate in this case.
	 */

}


public class TestMain {

	public static void main(String[] args) {
		
		String testString = "new strings look interesting with just 53 characters.";
		FunString fn = new FunString(testString);
		System.out.println(fn.countVowels()); //should return 13 vowels
		System.out.println(fn.length()); //should return 53
		System.out.println(fn.countDigits()); //should return 2
		
	}

}
