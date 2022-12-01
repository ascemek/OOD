package electronicswitch;

enum SwitchStates
{
	ON,
	OFF
}

public class ElectronicSwitch{

	SwitchStates state; 
	
	public ElectronicSwitch()
	{
		state = SwitchStates.OFF;
		
	}
	

	public void press()
	{
		if (state == SwitchStates.OFF)
			state = SwitchStates.ON;
		else
			state = SwitchStates.OFF;
	}
	
	public void turnOn()
	{
		if (state == SwitchStates.OFF)
		{
			state = SwitchStates.ON;
			System.out.println("The switch is turned on.");
		}
		else
		{
			System.out.println("The switch is already turned on!");
		}
	}
	
	public void turnOff()
	{
	
		if (state == SwitchStates.ON)
		{
			state = SwitchStates.OFF;
			System.out.println("The switch is turned off.");
		}
		else
		{
			System.out.println("The switch is already off!");
		}
	}
	
	public String toString()
	{
		if (state == SwitchStates.OFF)
			return "The switch is off.";
		else 
			return "The switch is on.";
		
	}
}


/*
 * enum SwitchStates
{
	ON,
	OFF,
	BROKEN
}

public class ElectronicSwitch{

	SwitchStates state; 
	
	public ElectronicSwitch()
	{
		state = SwitchStates.OFF;
		
	}
	
	public void circuitExploded()
	{
		state = SwitchStates.BROKEN;
	}
	
	public void press()
	{
		if (state == SwitchStates.BROKEN)
		
			System.out.println("The switch is broken! We cannot alter it :(");
		
		else if (state == SwitchStates.OFF)
			state = SwitchStates.ON;
		else
			state = SwitchStates.OFF;
	}
	
	public void turnOn()
	{
		if (state == SwitchStates.BROKEN)
			
			System.out.println("The switch is broken! We cannot alter it :(");
	
		else if (state == SwitchStates.OFF)
		{
			state = SwitchStates.ON;
			System.out.println("The switch is turned on.");
		}
		else
		{
			System.out.println("The switch is already turned on!");
		}
	}
	
	public void turnOff()
	{
		if (state == SwitchStates.BROKEN)
			
			System.out.println("The switch is broken! We cannot alter it :(");
	
		else if (state == SwitchStates.ON)
		{
			state = SwitchStates.OFF;
			System.out.println("The switch is turned off.");
		}
		else
		{
			System.out.println("The switch is already off!");
		}
	}
	
	public String toString()
	{
		if (state == SwitchStates.OFF)
			return "The switch is off.";
		else if (state == SwitchStates.ON)
			return "The switch is on.";
		else
			return "The switch is broken...";
		
	}
}


*/
