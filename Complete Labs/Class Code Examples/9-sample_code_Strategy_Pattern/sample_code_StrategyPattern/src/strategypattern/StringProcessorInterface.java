package strategypattern;

import java.util.Scanner;

public interface StringProcessorInterface
{
	
	public default String read() {
		
		Scanner scr = new Scanner(System.in);
		String text = scr.nextLine();
		return text;
		
	  }	
	
	public default void write(String text) {
		
		
		System.out.println(text);
	}
	
	String process(String t);
	
	public default void run()
	{
		String text = read();
		String processedText = process(text);
		write(processedText);	
	}
	
}

