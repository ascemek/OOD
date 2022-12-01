import java.util.ArrayList;
import java.util.Arrays;


class DigitalLibrary
{
	private ArrayList<String> bookEntries;
	private int counter;
	
	DigitalLibrary(){
		bookEntries = new ArrayList<String>();
		counter = 0;
	}

	public void addNewBook(String title)
	{
		bookEntries.add("" + counter + ": " + title);
		counter++;
		
	}
	
	public void removeABook(int index)
	{
		bookEntries.remove(index);
		
	}
	
	
	@Override
	public String toString()
	{
	 
		return String.join(System.lineSeparator(), bookEntries);
		
	}
	
	

}

public class TestSRP1 {

	
	public static void main(String[] args) {
		
		DigitalLibrary dl = new DigitalLibrary();
		ArrayList<String> someBooks = new ArrayList<String>(Arrays.asList("Design Patterns", 
						"Natural Language Processing", 
						"Cryptography", 
						"Human Computer Interaction"));

		for(String book: someBooks)
		{
			dl.addNewBook(book);
		}
		System.out.println(dl);
		
		dl.removeABook(0);
		dl.addNewBook("Data Structures");
		System.out.println(dl);
		
	}
	
}
