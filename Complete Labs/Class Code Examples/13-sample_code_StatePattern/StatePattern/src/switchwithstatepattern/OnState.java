package switchwithstatepattern;


public class OnState implements State{

	ElectronicSwitch myswitch;
	
	OnState(ElectronicSwitch msw)
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
		System.out.println("The switch was on. Turning it off");
		myswitch.setState(myswitch.offState);
	}
	
	public String toString()
	{
		return "The switch is on.";
	}

	
}

/*
 * More examples:
 *    https://howtodoinjava.com/design-patterns/behavioral/state-design-pattern/
 */