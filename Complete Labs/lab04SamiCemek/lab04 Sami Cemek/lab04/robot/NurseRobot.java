package robot;

/**
 * @author Sami Cemek
 * @date Sep 20 2020
 * @version 1.1
 */

public class NurseRobot extends Robot{

    public NurseRobot(String name) {
        super(name);
    }

    @Override
    public void showExpertise() {
        System.out.println(this);
		System.out.println("Thank you for creating me!"
				+ "I can be a helpful nurse");
        
    }

    @Override
    public String toString() {
        return ("I am "+ getName() + " and I am an expert in being nurse.");
    }
    
}
