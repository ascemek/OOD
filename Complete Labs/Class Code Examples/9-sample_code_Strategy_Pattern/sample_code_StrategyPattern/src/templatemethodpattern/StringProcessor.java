package templatemethodpattern;

import java.util.Scanner;

/**
 * 
 * StringProcessor: This is an abstract class that 
 * simulates the behavior of a very simple text editor.
 *
 */
public abstract class StringProcessor
{
	
	/**
	 * read() is a method that reads some text from console
	 * @return It returns a String
	 */
	
	public String read() {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Please enter some string: ");
		String text = scr.nextLine();
		//scr.close();
		return text;
		
	}	
	
	/**
	 * write(String text) is a method that writes the text to console.
	 * @param text, A string
	 */
	
	public void write(String text) {
		
		
		System.out.println(text);
		
	}
	
	/**
	 * Method process processes the text input t
	 * @param t, a string
	 * @return another string
	 */
	public abstract String process(String t);
	
	
	/**
	 * The algorithm implemented in the run() method is the following:
	 * 1. Read Input as Text
	 * 2. Process the text (The algorithm/rules to process the text can be different)
	 * 3. Write the processed text into a default "output.txt" file.
	 * 
	 */
	public void run()
	{
		String text = read();
		String processedText = process(text);
		write(processedText);	
	}

	
	
	
}



