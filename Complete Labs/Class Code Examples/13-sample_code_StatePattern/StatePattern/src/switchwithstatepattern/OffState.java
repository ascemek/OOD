package switchwithstatepattern;

public class OffState implements State{

	ElectronicSwitch myswitch;
	
	public OffState(ElectronicSwitch msw)
	{
		myswitch = msw;
	}
	
	@Override
	public void broken() {
		System.out.println("You have broken the switch.");
		myswitch.setState(myswitch.brokenState);
		
	}

	@Override
	public void handle() {
		System.out.println("The switch was off. Turning it on...");
		myswitch.setState(myswitch.onState);
	}

	
	public String toString()
	{
		return "The switch is off.";
	}

}
