package robot;

/**
 * @author Sami Cemek
 * @date Sep 20 2020
 * @version 1.1
 */

public abstract class Robot {

	private String name;
	
	// instantiate the name field
	public Robot(String name){
		
		this.name = name;
	}

	//setter,  set the name
	public void setName(String name)
	{
		this.name = name;
	}

	//getter,  get the name
	public String getName()
	{
		return name;
	}
	
	//unimplemented abstract methods
	public abstract void showExpertise();
	public abstract String toString();

}
