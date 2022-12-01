package extractor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFromDataFile {

	public static List<String> readData(String fileName)
	{
		List<String> data = new ArrayList<String>();

		try {
		      File fileObject = new File(fileName);
		      Scanner scr = new Scanner(fileObject);
		      while (scr.hasNextLine()) {
		        String currentLine = scr.nextLine();
		        data.add(currentLine);
		      }
		      scr.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return data;
	}
	
	


}
