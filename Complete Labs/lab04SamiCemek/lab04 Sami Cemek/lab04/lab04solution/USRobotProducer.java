package lab04solution;

import robot.*;

/**
 * @author Sami Cemek
 * @date Sep 20 2020
 * @version 1.1
 */

public class USRobotProducer extends Robot implements RobotFactory{

	//Constructor, set the name
	public USRobotProducer(String name) {
		super(name);
	}

	/* 
     * `build`: it takes a name and produces (returns) a new Mathematician robot.
    */
	// We are overriding the build method here because USA should be able implement NLP, Nurse and Math robot.
	// The default interface is implementing just the math robot.
    @Override
    public Robot build(String name, String typeofRobot) {
        if (typeofRobot.equalsIgnoreCase("mat"))
			return new MathematicianRobot(name);
		else if (typeofRobot.equalsIgnoreCase("nlp"))
			return new NLPResearcher(name);
		else if (typeofRobot.equalsIgnoreCase("nurse"))
			return new NurseRobot(name);
		else
		{
			System.out.println("The factory does not have permission to produce what you may be expecting: ");
			return null;
		}
    }

	/*
     * 'showExpertise': call the toString method and have a print statement
     */
	@Override
	public void showExpertise() {
		System.out.println(this);
            System.out.println("Thank you for creating me!"
                    + "I'm USA robot");
		
	}

	/*
     * 'toString': print the name and what type of robot you are
     */
	@Override
	public String toString() {
		return ("I am "+ super.getName() +  " and I am an expert in mathematics.");
	}
	
	
}
