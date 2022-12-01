package lab04starter;

import robot.*;

/**
 * @author Sami Cemek
 * @date Sep 20 2020
 * @version 1.1
 */

/*
* They want us to design a class that creates only mathematician robots. 
* They also want a method to test the functionality of the robot.
*/

public class ChineseRobotIndustry extends Robot{

    public ChineseRobotIndustry(String name) {
        super(name);
    }


    /* 
     * `deliver`: it takes a name and produces (returns) a new Mathematician robot.
    */
    public Robot deliver(String name){

        Robot matRobot =  new MathematicianRobot(name);
        return matRobot;

    }

    /*
     * `test`: it takes a Robot object as input and displays its expertise.
     */
    public void test(Robot robot){
        if(robot != null)
                robot.showExpertise();

    }

    @Override
    public void showExpertise() {
        System.out.println(this);
            System.out.println("Thank you for creating me!"
                    + "I can generate random integers. Here are some ...");
            
            int seed = 9971;
            int i = 0;
            while(i < 20) {
                seed = RandomNumberGenerator.generateRandom(seed);
                System.out.println(seed);
                i++;
            }    
    }

    static class RandomNumberGenerator{
            
        static int p = 131;
        static int q = 271;
        
        private static int generateRandom(int seed)
        {
            return seed * seed % (p * q);
        }
        
    }

    @Override
    public String toString() {
        return ("I am "+ super.getName() +  " and I am an expert in mathematics.");
                        
    }
	
}
