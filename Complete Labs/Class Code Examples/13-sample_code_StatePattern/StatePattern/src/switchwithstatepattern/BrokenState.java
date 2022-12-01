package switchwithstatepattern;

public class BrokenState implements State{

	ElectronicSwitch myswitch;
	
	BrokenState(ElectronicSwitch msw)
	{
		myswitch = msw;
	}
	
	@Override
	public void broken() {
		
		System.out.println("The switch is already broken.");
	}

	@Override
	public void handle() {
		
		System.out.println("The switch is broken. You cannot turn it on/off. It is just not functioning.");
	}

	public String toString()
	{
		return "The switch is broken.";
	}

}
