package switchwithstatepattern;


public class ElectronicSwitch {

	State onState;
	State offState;
	State brokenState;

	
	State myState;
	
	ElectronicSwitch()
	{
		onState = new OnState(this);
		offState = new OffState(this);
		brokenState = new BrokenState(this);
		
		myState = offState;
	}
	

	void setState(State state) {
		this.myState = state;
		}
   
	
	public void request()
	{
		myState.handle();
	}
	
	
	public void breakIt()
	{
		myState.broken();
	}
}
