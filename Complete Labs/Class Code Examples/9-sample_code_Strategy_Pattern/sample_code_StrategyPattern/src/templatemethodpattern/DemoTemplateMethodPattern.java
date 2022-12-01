package templatemethodpattern;


/**
 * 
 * In this example we implement the idea of template method pattern.
 * 
 * @author fahmidahamid
 * @version 1.1
 * @since Oct 14, 2020
 */


public class DemoTemplateMethodPattern {

	public static void main(String[] args) {
		
		 System.out.println("We are about to test three different types of string processor.\n");
		 
		 WordCounter wc = new WordCounter();
		 wc.run();

		 FindLongest fl = new FindLongest();
		 fl.run();
		
		 FindOdd fo = new FindOdd();
		 fo.run();
		
	}

}
