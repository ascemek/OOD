import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.BufferedReader;

/**
 * @author Sami Cemek
 * @date Aug 25 2021
 * @version 1.1
 */


public class TestMain {

	/**
 	 * This method reads from a file called robotList.txt and creates an ArrayList of Robots.
	 * It also sorts the ArrayList of Robots by their ranks and prints the list.
 	*/

	public static void main(String[] args) throws IOException{

		ArrayList<Robot> roboList = new ArrayList<Robot>();
		String line = null;

		try {
			BufferedReader bfReader = new BufferedReader(new FileReader("robotList.txt"));
			while ((line = bfReader.readLine())!= null){
				String[] information = line.split(" "); 
				Robot testRobot = new Robot(information); 
				roboList.add(testRobot);
				
			}
			bfReader.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}

		// Compare by salary and print
		Collections.sort(roboList, new CompareBySalary());
		System.out.println("-------------");
		System.out.println("Here is the list of robots sorted by salary: ");

		for(Robot r: roboList) {
			System.out.println(r);
		}
		System.out.println("-------------");

		// Compare by rank and print
		Collections.sort(roboList, new CompareByRank());
		System.out.println("Here is the list of robots sorted by rank: ");

		for(Robot r: roboList) {
			System.out.println(r);
		}
		System.out.println("-------------");

		// Compare by name and print
		
		Collections.sort(roboList);
		System.out.println("Here is the list of robots sorted by name: ");

		for(Robot r: roboList) {
			System.out.println(r);
		}
		System.out.println("-------------");

	}

}

//reads from a file called robotList.txt
//create an ArrayList of Robots
//sort the ArrayList of Robots by their ranks
//print the list
