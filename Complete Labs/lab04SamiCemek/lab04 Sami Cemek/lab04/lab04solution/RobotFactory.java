package lab04solution;

import robot.*;

/**
 * @author Sami Cemek
 * @date Sep 20 2020
 * @version 1.1
 */

public interface RobotFactory {

    /*
     * `test`: it takes a Robot object as input and displays its expertise. --- DEFAULT.
     */
    public default void test(Robot robot, String typeofRobot)
    {
        if(robot != null){
            robot.showExpertise();
        }   
    }
    
    /* 
     * `build`: it takes a name and produces (returns) a new Mathematician robot --- DEFAULT.
    */
    public default Robot build(String name, String typeofRobot)
    {
         
        if (typeofRobot.equalsIgnoreCase("mat"))
			return new MathematicianRobot(name);
		else
		{
			System.out.println("The factory does not have permission to produce what you may be expecting");
			return null;
		}
        
    }

}
