package electronicswitch;

public class DemoElectronicSwitch {


	public static void main(String[] args) {
	
		ElectronicSwitch esc = new ElectronicSwitch();
		
		System.out.println(esc);
		for(int i = 0; i < 10; i++) {
			esc.press();
			System.out.println(esc);
		}
	
		//What if the circuit explodes after several iteration and it doesn't work anymore?
		esc.turnOn();
		esc.turnOff();
		
		

	}

}

