package lab04solution;

/**
 * @author Sami Cemek
 * @date Sep 20 2020
 * @version 1.1
 */

public class DemoTesting {

	public static void main(String[] args) {

		//USRobotProducer should be able to produce MathematicianRobot, NLPResearcher and NurseRobot
		USRobotProducer usaRobot = new USRobotProducer("usaRobotGeneric");
		
		System.out.println(usaRobot); //DEFAULT Robot is math
		System.out.println(usaRobot.build("usaRobot1", "nurse"));
		System.out.println(usaRobot.build("usaRobot2", "nlp"));
		System.out.println(usaRobot.build("usaRobot3", "anan")); // The factory can't produce this one

		//ChineseRobotIndustry should be able to produce only MathematicianRobot
		ChineseRobotIndustry chinaRobot = new ChineseRobotIndustry("chinaRobotGeneric"); 
		
		System.out.println(chinaRobot); //DEFAULT Robot is math
		System.out.println(chinaRobot.build("usaRobot1", "nurse"));// The factory can't produce this one
		System.out.println(chinaRobot.build("usaRobot2", "nlp"));  // The factory can't produce this one
		System.out.println(chinaRobot.build("usaRobot3", "anan")); // The factory can't produce this one

		
	}
	
}
