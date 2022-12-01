package switchwithstatepattern;


public class DemoStatePattern {

	public static void main(String[] args) {

		ElectronicSwitch s1 = new ElectronicSwitch();
		
		for(int i = 0; i < 10; i++)
		{
			s1.request();
		}
		s1.breakIt();
		s1.request();

		
	}

}
