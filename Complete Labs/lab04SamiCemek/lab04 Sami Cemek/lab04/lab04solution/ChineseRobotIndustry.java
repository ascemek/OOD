package lab04solution;

import robot.*;

/**
 * @author Sami Cemek
 * @date Sep 20 2020
 * @version 1.1
 */

public class ChineseRobotIndustry extends Robot implements RobotFactory{

    //Constructor, set the name
    public ChineseRobotIndustry(String name) {
        super(name);
    }

    /*
     * 'showExpertise': call the toString method and print the generate random integers
     */
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

    /*
     * 'RandomNumberGenerator': Generate random integers
     */
    static class RandomNumberGenerator{
            
        static int p = 131;
        static int q = 271;
        
        private static int generateRandom(int seed)
        {
            return seed * seed % (p * q);
        }
        
    }

    /*
     * 'toString': print the name and what type of robot you are
     */
    @Override
    public String toString() {
        return ("I am "+ super.getName() +  " and I am an expert in mathematics.");
                        
    }
	
}
