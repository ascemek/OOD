package robot;

public class RobotDemo{

	/**
	 * @author Sami Cemek
	 * @date Sep 20 2020
	 * @version 1.1
	 */
	
	public static void main(String[] args) {
		
		/* create two robot instances: one MathematicianRobot and one NLPResearcher */

		Robot matRobot = new MathematicianRobot("Nerdy");
		System.out.println(matRobot);

		Robot NLPRobot = new NLPResearcher("Harry");
		System.out.println(NLPRobot);

		Robot nurseRobot =  new NurseRobot("Marry");
		System.out.println(nurseRobot);
	
	}
	
}
